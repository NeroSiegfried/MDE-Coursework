package uk.ac.kcl.in.nerosiegfried.chessdsl.validation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.xtext.validation.Check;

import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.*;
import uk.ac.kcl.in.nerosiegfried.chessdsl.validation.AbstractChessDSLValidator;

/**
 * A Chess validator that:
 *  - Validates standard DSL moves (Move/Capture/Castle/EnPassant/Promotion)
 *  - Validates algebraic (SAN) moves in place (no AST transformation)
 *  - Maintains a single BoardState for correctness checks
 *  - Checks occupant color, piece type, en passant, etc.
 *  - Raises errors if a move is illegal or leaves the king in check
 *  - Raises errors if "Check" or "Checkmate" remarks are incorrect
 */
public class ChessDSLValidator extends AbstractChessDSLValidator {

    // -----------------------------------
    // 1) Data Structures for the Board
    // -----------------------------------
    static class LastMoveInfo {
        public Color color;
        public Piece piece;
        public String from;
        public String to;
        public boolean wasDoublePawnAdvance;
        public LastMoveInfo(Color c, Piece p, String f, String t, boolean d) {
            this.color = c; this.piece = p; this.from = f; this.to = t; this.wasDoublePawnAdvance = d;
        }
    }

    public static class PieceInfo {
        public Color color;
        public Piece type;
        public boolean hasMoved;
        public PieceInfo(Color c, Piece t) {
            this.color = c; 
            this.type = t;
            this.hasMoved = false;
        }
    }

    public static class BoardState {
        Map<String, PieceInfo> boardMap = new HashMap<>();
        public void initFreshBoard() {
            boardMap.clear();
            // White side
            place("a1", Color.WHITE, Piece.ROOK);   place("b1", Color.WHITE, Piece.KNIGHT);
            place("c1", Color.WHITE, Piece.BISHOP); place("d1", Color.WHITE, Piece.QUEEN);
            place("e1", Color.WHITE, Piece.KING);   place("f1", Color.WHITE, Piece.BISHOP);
            place("g1", Color.WHITE, Piece.KNIGHT); place("h1", Color.WHITE, Piece.ROOK);
            for(char c='a'; c<='h'; c++) place(c+"2", Color.WHITE, Piece.PAWN);
            // Black side
            place("a8", Color.BLACK, Piece.ROOK);   place("b8", Color.BLACK, Piece.KNIGHT);
            place("c8", Color.BLACK, Piece.BISHOP); place("d8", Color.BLACK, Piece.QUEEN);
            place("e8", Color.BLACK, Piece.KING);   place("f8", Color.BLACK, Piece.BISHOP);
            place("g8", Color.BLACK, Piece.KNIGHT); place("h8", Color.BLACK, Piece.ROOK);
            for(char c='a'; c<='h'; c++) place(c+"7", Color.BLACK, Piece.PAWN);
        }
        public void place(String square, Color c, Piece p) {
            boardMap.put(square, new PieceInfo(c, p));
        }
        public boolean isOccupied(String sq) {
            return boardMap.containsKey(sq);
        }
        public PieceInfo getPieceAt(String sq) {
            return boardMap.get(sq);
        }
        public void removePiece(String sq) {
            boardMap.remove(sq);
        }
        /** Move from->to, capturing occupant if any, sets hasMoved=true. */
        public void movePiece(String from, String to) {
            PieceInfo pi = boardMap.remove(from);
            if(pi != null) {
                pi.hasMoved = true;
                boardMap.remove(to); // capture occupant if any
                boardMap.put(to, pi);
            }
        }
    }

    // ----------------------------------------------------------------
    // 2) The main check (checkGame): For each move, we branch logic
    // ----------------------------------------------------------------
    @Check
    public void checkGame(Game game) {
        if(game == null) return;

        // Build the board
        BoardState board = new BoardState();
        if(game.getInitial()!=null && game.getInitial().getPositions()!=null) {
            // custom
            for(Placement pl : game.getInitial().getPositions().getPlacement()) {
                board.place(pl.getSquare().getSquare(), pl.getPiece().getColor(), pl.getPiece().getKind());
            }
        } else {
            board.initFreshBoard();
        }

        // ensure 1 white king & 1 black king
        if(!hasTwoKings(board)) {
            error("Must have exactly one White king and one Black king!", game.getInitial(), null);
        }

        boolean isGameOver = false;
        LastMoveInfo lastMove = null;
        boolean skipWhiteFirst = false;

        for(MovePair mp : game.getMoves()) {
            if(isGameOver) {
                error("Moves appear after checkmate/game end", mp, null);
                return;
            }

            // --- White move
            AnyMove whiteAny = mp.getWhiteMove();
            if(!"...".equals(mp.getWhiteMove())) {
                if(whiteAny!=null) {
                    boolean ok = handleAnyMove(whiteAny, board, Color.WHITE, mp, lastMove);
                    if(!ok) return;
                    if(isCheckmate(board, Color.BLACK)) {
                        isGameOver = true;
                    }
                    // update last move info
                    lastMove = buildLastMoveInfoFromAny(whiteAny, Color.WHITE, board);
                }
            } else {
                if(skipWhiteFirst) {
                    error("Cannot skip White's move more than once!", mp.getWhiteMove(), null);
                    return;
                }
                skipWhiteFirst = true;
            }

            // --- Black move
            AnyMove blackAny = mp.getBlackMove();
            if(blackAny!=null) {
                if(isGameOver) {
                    error("Moves appear after checkmate (black side)!", blackAny, null);
                    return;
                }
                boolean ok = handleAnyMove(blackAny, board, Color.BLACK, mp, lastMove);
                if(!ok) return;
                if(isCheckmate(board, Color.WHITE)) {
                    isGameOver = true;
                }
                lastMove = buildLastMoveInfoFromAny(blackAny, Color.BLACK, board);
            }
        }
    }

    /**
     * Handle an AnyMove by branching:
     *  - If it's DSL, call validateDSLMove
     *  - If it's SAN, call validateSANMove
     * Return false if we found an error.
     */
    private boolean handleAnyMove(AnyMove any, BoardState board, Color side, MovePair mp, LastMoveInfo lastMove) {
        // If there's a DSLMove, we do that logic
        if(any.getMove()!=null) {
            return validateDSLMove(any.getMove(), any, board, side, mp, lastMove);
        }
        // Otherwise, if there's an algebraic move, parse & validate it
        if(any.getAlgebraicmove()!=null) {
            return validateSANMove(any, board, side, mp, lastMove);
        }
        // If no content at all, raise error
        error("Empty move definition", any, null);
        return false;
    }

    // ----------------------------------------------------------------
    // 3) Validate a DSL move (Move/Capture/Castle/EnPassant/Promotion)
    // ----------------------------------------------------------------
    private boolean validateDSLMove(DSLMove dsl, AnyMove container, BoardState board,
                                    Color side, MovePair mp, LastMoveInfo lastMove) {
        if(dsl instanceof Move) {
            return validateBasicMove((Move)dsl, container, board, side, mp, lastMove);
        } else if(dsl instanceof Capture) {
            return validateCapture((Capture)dsl, container, board, side, mp, lastMove);
        } else if(dsl instanceof EnPassant) {
            return validateEnPassant((EnPassant)dsl, container, board, side, mp, lastMove);
        } else if(dsl instanceof Promotion) {
            return validatePromotion((Promotion)dsl, container, board, side, mp, lastMove);
        } else if(dsl instanceof Castle) {
            return validateCastle((Castle)dsl, container, board, side, mp /*, lastMove*/);
        } else if(dsl instanceof Dummy) {
            return false; // "dummy" move
        }
        error("Unknown DSL move type", container, null);
        return false;
    }

    // region DSL validation methods

    /** Basic non-capture Move logic (e.g. Pawn from e2 to e4). */
    private boolean validateBasicMove(Move mv, AnyMove container, BoardState board, Color side,
                                      MovePair mp, LastMoveInfo lastMove) {
        String from = mv.getFrom().getSquare();
        String to   = mv.getTo().getSquare();
        Piece p = mv.getPiece();

        // occupant check
        if(!board.isOccupied(from)) {
            error("No piece at " + from + " for Move", mv, null);
            return false;
        }
        PieceInfo pi = board.getPieceAt(from);
        if(pi.color!=side) {
            error("Wrong color piece at " + from, mv, null);
            return false;
        }
        if(pi.type!=p) {
            error("Mismatch piece type at " + from + ". DSL says " + p + " but found " + pi.type, mv, null);
            return false;
        }
        // occupant at 'to' must not be an enemy piece
        if(board.isOccupied(to)) {
            PieceInfo occupant = board.getPieceAt(to);
            if(occupant.color!=side) {
                error("This is actually a capture but DSL says it's a Move", mv, null);
                return false;
            } else {
                error("Cannot capture your own piece at " + to, mv, null);
                return false;
            }
        }
        // check movement pattern
        if(!isMovePatternLegal(board, from, to, p, side, false)) {
            error("Illegal movement pattern from " + from + " to " + to, mv, null);
            return false;
        }
        // Pawn must promote if it lands on last rank
        if(p==Piece.PAWN) {
            if( (side==Color.WHITE && to.endsWith("8")) ||
                (side==Color.BLACK && to.endsWith("1")) ) {
                error("Pawn reached last rank but is not declared as Promotion", mv, null);
                return false;
            }
        }
        // apply move
        board.movePiece(from, to);
        // check if leaving your king in check
        if(isInCheck(board, side)) {
            error("This Move leaves your king in check", mv, null);
            return false;
        }
        // if any remarks: e.g. "Check" => verify
        validateRemarksCheck(container.getRemarks(), board, oppositeColor(side), container);
        return true;
    }

    /** A DSL capture, e.g. "Pawn from e2 to e4 Capture(Pawn)" */
    private boolean validateCapture(Capture cap, AnyMove container, BoardState board,
                                    Color side, MovePair mp, LastMoveInfo lastMove) {
        Move base = cap.getMove();
        String from = base.getFrom().getSquare();
        String to   = base.getTo().getSquare();
        Piece p = base.getPiece();
        Piece victim = cap.getCapture();

        // occupant at 'from' must be side's piece
        if(!board.isOccupied(from)) {
            error("No piece at " + from + " for capture", cap, null);
            return false;
        }
        PieceInfo pi = board.getPieceAt(from);
        if(pi.color!=side) {
            error("Wrong color piece at " + from, cap, null);
            return false;
        }
        if(pi.type!=p) {
            error("Mismatch piece type at " + from + ". DSL says " + p + " but found " + pi.type, cap, null);
            return false;
        }
        // occupant at 'to' must be an enemy piece of type 'victim'
        if(!board.isOccupied(to)) {
            error("Capture declared but no occupant at " + to, cap, null);
            return false;
        }
        PieceInfo occupant = board.getPieceAt(to);
        if(occupant.color==side) {
            error("Cannot capture your own piece at " + to, cap, null);
            return false;
        }
        if(occupant.type!=victim) {
            error("DSL says capturing " + victim + " but occupant is " + occupant.type, cap, null);
            return false;
        }
        // movement pattern must be correct for a capture
        if(!isMovePatternLegal(board, from, to, p, side, true)) {
            error("Illegal capture pattern from " + from + " to " + to, cap, null);
            return false;
        }
        // If it's a pawn capturing on last rank => must be Promotion
        if(p==Piece.PAWN) {
            if( (side==Color.WHITE && to.endsWith("8")) ||
                (side==Color.BLACK && to.endsWith("1")) ) {
                error("Pawn captured on last rank but not declared Promotion", cap, null);
                return false;
            }
        }
        // apply
        board.movePiece(from, to);
        if(isInCheck(board, side)) {
            error("Capture leaves your king in check", cap, null);
            return false;
        }
        // remarks
        validateRemarksCheck(container.getRemarks(), board, oppositeColor(side), container);
        return true;
    }

    /** A DSL EnPassant capturing, e.g. "Pawn from e5 to e6 and captures Pawn on e5" */
    private boolean validateEnPassant(EnPassant ep, AnyMove container, BoardState board,
                                      Color side, MovePair mp, LastMoveInfo lastMove) {
        Capture cap = ep.getCapture();
        Move base = cap.getMove();
        String from = base.getFrom().getSquare();
        String to   = base.getTo().getSquare();
        if(base.getPiece()!=Piece.PAWN) {
            error("Only pawns can do en passant", ep, null);
            return false;
        }
        String victimSquare = ep.getSquare().getSquare();
        // Must check occupant on victimSquare is an enemy pawn
        if(!board.isOccupied(victimSquare)) {
            error("No occupant at " + victimSquare + " for en passant capture", ep, null);
            return false;
        }
        PieceInfo victim = board.getPieceAt(victimSquare);
        if(victim.type!=Piece.PAWN || victim.color==side) {
            error("EnPassant target must be an enemy pawn", ep, null);
            return false;
        }
        // Also typically we check lastMove was a 2-square push
        if(lastMove==null || !lastMove.wasDoublePawnAdvance) {
            // optional logic
            error("Cannot do en passant if no double-pawn push was done previously", ep, null);
            return false;
        }
        // must be a valid capture pattern
        if(!isMovePatternLegal(board, from, to, Piece.PAWN, side, true)) {
            error("Invalid en passant pattern from " + from + " to " + to, ep, null);
            return false;
        }
        // apply
        board.movePiece(from, to); 
        board.removePiece(victimSquare);
        if(isInCheck(board, side)) {
            error("EnPassant leaves your king in check", ep, null);
            return false;
        }
        validateRemarksCheck(container.getRemarks(), board, oppositeColor(side), container);
        return true;
    }

    /** A DSL Promotion, e.g. "Pawn from e7 to e8 Promotion(Queen)" */
    private boolean validatePromotion(Promotion pm, AnyMove container, BoardState board,
                                      Color side, MovePair mp, LastMoveInfo lastMove) {
        DSLMove base = pm.getMove();
        Move mv = null;
        boolean isCap = false;
        if(base instanceof Move) {
            mv = (Move)base;
        } else if(base instanceof Capture) {
            isCap = true;
            mv = ((Capture)base).getMove();
        } else {
            error("Promotion must have a base Move or Capture", pm, null);
            return false;
        }
        if(mv.getPiece()!=Piece.PAWN) {
            error("Only a pawn can promote", pm, null);
            return false;
        }
        String from = mv.getFrom().getSquare();
        String to   = mv.getTo().getSquare();
        if(side==Color.WHITE && !to.endsWith("8")) {
            error("White pawn must promote on rank 8", pm, null);
            return false;
        }
        if(side==Color.BLACK && !to.endsWith("1")) {
            error("Black pawn must promote on rank 1", pm, null);
            return false;
        }
        // if capture, occupant at 'to' must be enemy
        if(isCap) {
            if(!board.isOccupied(to)) {
                error("Promotion capture declared but occupant not found at " + to, pm, null);
                return false;
            }
            PieceInfo occupant = board.getPieceAt(to);
            if(occupant.color==side) {
                error("Cannot capture your own piece in promotion", pm, null);
                return false;
            }
        } else {
            // normal move: must not be occupant
            if(board.isOccupied(to)) {
                error("Promotion move not declared capture but occupant found at " + to, pm, null);
                return false;
            }
        }
        // check pattern
        if(!isMovePatternLegal(board, from, to, Piece.PAWN, side, isCap)) {
            error("Illegal pattern for Promotion from " + from + " to " + to, pm, null);
            return false;
        }
        // apply
        board.movePiece(from, to);
        board.removePiece(to); 
        board.place(to, side, pm.getPiece()); // e.g. Queen
        if(isInCheck(board, side)) {
            error("Promotion leaves your king in check", pm, null);
            return false;
        }
        validateRemarksCheck(container.getRemarks(), board, oppositeColor(side), container);
        return true;
    }

    /** A DSL Castle, e.g. "Castle(Kingside)" or "castles on the Queenside". */
    private boolean validateCastle(Castle cs, AnyMove container, BoardState board,
                                   Color side, MovePair mp /*, LastMoveInfo lastMove*/) {
        String ctype = cs.getSide(); // "Kingside" or "Queenside"
        if(!Objects.equals(ctype, "Kingside") && !Objects.equals(ctype, "Queenside")) {
            error("Cannot deduce castling side", cs, null);
            return false;
        }
        String kingSq = (side==Color.WHITE)? "e1" : "e8";
        String rookSq = (side==Color.WHITE)?
                (ctype.equals("Kingside")? "h1":"a1") :
                (ctype.equals("Kingside")? "h8":"a8");
        // occupant checks
        PieceInfo k = board.getPieceAt(kingSq);
        PieceInfo r = board.getPieceAt(rookSq);
        if(k==null || k.type!=Piece.KING || k.color!=side) {
            error("No king found at " + kingSq + " for castling", cs, null);
            return false;
        }
        if(r==null || r.type!=Piece.ROOK || r.color!=side) {
            error("No rook found at " + rookSq + " for castling", cs, null);
            return false;
        }
        if(k.hasMoved || r.hasMoved) {
            error("King or rook has moved, cannot castle", cs, null);
            return false;
        }
        // cannot castle if in check
        if(isInCheck(board, side)) {
            error("Cannot castle while in check", cs, null);
            return false;
        }
        // squares
        String pass1, pass2, kingDest, rookDest;
        if(side==Color.WHITE) {
            if("Kingside".equals(ctype)) {
                pass1="f1"; pass2="g1"; kingDest="g1"; rookDest="f1";
            } else {
                pass1="d1"; pass2="c1"; kingDest="c1"; rookDest="d1";
            }
        } else {
            if("Kingside".equals(ctype)) {
                pass1="f8"; pass2="g8"; kingDest="g8"; rookDest="f8";
            } else {
                pass1="d8"; pass2="c8"; kingDest="c8"; rookDest="d8";
            }
        }
        // must be empty
        if(board.isOccupied(pass1) || board.isOccupied(pass2)) {
            error("Path blocked for castling between " + pass1 + " & " + pass2, cs, null);
            return false;
        }
        // check if passing squares are in check
        board.removePiece(kingSq);
        board.place(pass1, side, Piece.KING);
        if(isInCheck(board, side)) {
            // revert
            board.removePiece(pass1);
            board.place(kingSq, side, Piece.KING);
            error("King passes through check on " + pass1, cs, null);
            return false;
        }
        board.removePiece(pass1);
        board.place(pass2, side, Piece.KING);
        if(isInCheck(board, side)) {
            // revert
            board.removePiece(pass2);
            board.place(kingSq, side, Piece.KING);
            error("King passes through check on " + pass2, cs, null);
            return false;
        }
        // revert & do final
        board.removePiece(pass2);
        board.place(kingSq, side, Piece.KING);

        // now do final
        board.removePiece(kingSq);
        board.removePiece(rookSq);
        PieceInfo newK = new PieceInfo(side, Piece.KING);
        newK.hasMoved=true;
        PieceInfo newR = new PieceInfo(side, Piece.ROOK);
        newR.hasMoved=true;
        board.place(kingDest, side, Piece.KING);
        board.place(rookDest, side, Piece.ROOK);
        // final check
        if(isInCheck(board, side)) {
            error("Castling ends in check", cs, null);
            return false;
        }
        validateRemarksCheck(container.getRemarks(), board, oppositeColor(side), container);
        return true;
    }
    // endregion

    // ----------------------------------------------------------------
    // 4) Validate an Algebraic (SAN) Move, directly with board checks
    // ----------------------------------------------------------------
    private boolean validateSANMove(AnyMove any, BoardState board, Color side, MovePair mp, LastMoveInfo lastMove) {
        SANMove san = any.getAlgebraicmove();
        String token = san.getToken();
        if(token==null || token.isEmpty()) {
            error("Empty algebraic move", san, null);
            return false;
        }
        // strip '@'
        if(token.startsWith("@")) token=token.substring(1);

        // 4a) castling
        if(token.equals("O-O") || token.equals("O-O-O")) {
            return validateSAN_Castling(any, token, board, side, mp);
        }

        // 4b) parse standard piece moves
        //  e.g. Qxe5, exd4, e4, Nf3, e8=Q, e.g. "Qxe5??"
        // The user has a grammar that ensures the token is either "O-O...", or else
        // it has piece letter, optional "x", target, etc. 
        // We'll do a regex approach:
        String regex = "^(?:(K|Q|R|B|N))?([a-h]|[1-8])?([a-h]|[1-8])?(x)?([a-h][1-8])(?:=(Q|R|B|N))?([+#]*)([!\\?]+)?$";
        Matcher matcher = Pattern.compile(regex).matcher(token);
        if(!matcher.matches()) {
            error("Invalid SAN notation: " + token, san, null);
            return false;
        }

        // parse groups
        String pieceLetter = matcher.group(1); // may be null => Pawn
        String disamb1 = matcher.group(2);
        String disamb2 = matcher.group(3);
        boolean isCapture = (matcher.group(4)!=null);
        String targetSq = matcher.group(5);
        String promotion = matcher.group(6);
        String checkMarkers = matcher.group(7); // e.g. +, #, or multiple
        String remarksStr = matcher.group(8);   // e.g. "?!"

        Piece movingPiece = pieceFromSANLetter(pieceLetter);
        String disamb = "";
        if(disamb1!=null) disamb+=disamb1;
        if(disamb2!=null) disamb+=disamb2;

        // find candidates
        List<String> candidates = new ArrayList<>();
        for(String sq: board.boardMap.keySet()) {
            PieceInfo pi = board.boardMap.get(sq);
            if(pi.color==side && pi.type==movingPiece) {
                // check if it can move/capture to target
                if(isMovePatternLegal(board, sq, targetSq, movingPiece, side, isCapture)) {
                    candidates.add(sq);
                }
            }
        }
        // if disamb present, filter
        if(!disamb.isEmpty()) {
            List<String> filtered = new ArrayList<>();
            for(String cand: candidates) {
                boolean ok=true;
                for(char c: disamb.toCharArray()) {
                    if(Character.isLetter(c)) {
                        if(cand.charAt(0)!=c) { ok=false; break; }
                    } else if(Character.isDigit(c)) {
                        if(cand.charAt(1)!=c) { ok=false; break; }
                    }
                }
                if(ok) filtered.add(cand);
            }
            candidates=filtered;
        }
        if(candidates.isEmpty()) {
            error("No candidate piece found for " + token, san, null);
            return false;
        }
        if(candidates.size()>1) {
            error("Ambiguous piece for " + token, san, null);
            return false;
        }
        String fromSquare = candidates.get(0);

        // apply the logic
        // 1) If it's a capture by a pawn, check occupant or en passant, etc.
        if(isCapture) {
            if(movingPiece==Piece.PAWN) {
                if(board.isOccupied(targetSq)) {
                    // normal capture
                    PieceInfo occupant = board.getPieceAt(targetSq);
                    if(occupant.color==side) {
                        error("Cannot capture your own piece on " + targetSq, san, null);
                        return false;
                    }
                    // check pattern
                    if(!isMovePatternLegal(board, fromSquare, targetSq, Piece.PAWN, side, true)) {
                        error("Illegal pawn capture pattern", san, null);
                        return false;
                    }
                    // check if occupant is consistent with any implied note
                } else {
                    // en passant
                    // occupant is on same file, rank behind
                    int fileVal = targetSq.charAt(0);
                    int rankVal = targetSq.charAt(1)-'0';
                    int victimRank = (side==Color.WHITE)? rankVal-1 : rankVal+1;
                    String victimSq = ""+(char)(fileVal)+(victimRank);
                    if(!board.isOccupied(victimSq)) {
                        error("No occupant for en passant at " + victimSq, san, null);
                        return false;
                    }
                    PieceInfo occupant = board.getPieceAt(victimSq);
                    if(occupant.type!=Piece.PAWN || occupant.color==side) {
                        error("En passant target is not an enemy pawn", san, null);
                        return false;
                    }
                }
            } else {
                // capture by R,N,B,Q,K
                if(!board.isOccupied(targetSq)) {
                    error("Capture declared but no occupant at " + targetSq, san, null);
                    return false;
                }
                PieceInfo occupant = board.getPieceAt(targetSq);
                if(occupant.color==side) {
                    error("Cannot capture your own piece at " + targetSq, san, null);
                    return false;
                }
            }
        } else {
            // no capture
            if(board.isOccupied(targetSq)) {
                PieceInfo occupant = board.getPieceAt(targetSq);
                if(occupant.color!=side) {
                    error("Move is actually a capture but 'x' was not used", san, null);
                    return false;
                } else {
                    error("Cannot capture your own piece at " + targetSq, san, null);
                    return false;
                }
            }
        }
        // If it's a pawn going to last rank => must have promotion
        if(movingPiece==Piece.PAWN) {
            if( (side==Color.WHITE && targetSq.endsWith("8")) ||
                (side==Color.BLACK && targetSq.endsWith("1")) ) {
                if(promotion==null) {
                    error("Pawn reached last rank but no promotion indicated", san, null);
                    return false;
                }
            }
        }

        // now apply move to board
        board.removePiece(fromSquare);
        // if it's en passant
        if(isCapture && movingPiece==Piece.PAWN && !board.isOccupied(targetSq)) {
            // en passant
            int fileVal = targetSq.charAt(0);
            int rankVal = targetSq.charAt(1)-'0';
            int victimRank = (side==Color.WHITE)? rankVal-1 : rankVal+1;
            String victimSq = ""+(char)(fileVal)+(victimRank);
            board.removePiece(victimSq);
        } else {
            // normal occupant removal if any
            board.removePiece(targetSq);
        }
        // place piece
        PieceInfo pi = new PieceInfo(side, movingPiece);
        pi.hasMoved=true;
        board.boardMap.put(targetSq, pi);

        // if promotion
        if(promotion!=null) {
            board.removePiece(targetSq);
            Piece newPiece = pieceFromSANLetter(promotion.substring(1));
            board.place(targetSq, side, newPiece);
        }

        // check if in check
        if(isInCheck(board, side)) {
            error("This SAN move leaves your king in check", san, null);
            return false;
        }

        // if remarks => check if "Check" or "Checkmate" is correct
        // We do not store them in the AST the same way, but we can parse them from remarksStr or checkMarkers.
        // For demonstration, let's do a simple approach:
        List<Remark> remarks = new ArrayList<>();
        // if checkMarkers has '#' => that's checkmate
        // if it has '+' => that's check
        // if remarksStr might be "!" or "??" => we can convert to Good, Bad, etc. 
        // We'll do an example:
        if(checkMarkers!=null && !checkMarkers.isEmpty()) {
            if(checkMarkers.contains("#")) {
                remarks.add(Remark.CHECKMATE);
            } else if(checkMarkers.contains("+")) {
                remarks.add(Remark.CHECK);
            }
        }
        if(remarksStr!=null && !remarksStr.isEmpty()) {
            // e.g. "??", "!?", "?!", "!!"
            // do a naive approach
            if(remarksStr.contains("!!")) remarks.add(Remark.EXCELLENT);
            else if(remarksStr.contains("?!")) remarks.add(Remark.RISKY);
            else if(remarksStr.contains("!?")) remarks.add(Remark.DUBIOUS);
            else if(remarksStr.contains("?"))  remarks.add(Remark.BAD);
            else if(remarksStr.contains("!"))  remarks.add(Remark.GOOD);
        }
        // Now check the remarks
        if(remarks.contains(Remark.CHECKMATE) && !isCheckmate(board, oppositeColor(side))) {
            error("Move claims checkmate but it's not mate", san, null);
        } else if(remarks.contains(Remark.CHECK) && !isInCheck(board, oppositeColor(side))) {
            error("Move claims check but it's not check", san, null);
        }

        return true;
    }
    
    private Piece pieceFromSANLetter(String letter) {
        if (letter == null) {
            return Piece.PAWN; // no piece letter => it's a pawn
        }
        switch (letter) {
            case "K": return Piece.KING;
            case "Q": return Piece.QUEEN;
            case "R": return Piece.ROOK;
            case "B": return Piece.BISHOP;
            case "N": return Piece.KNIGHT;
            default:
                // If it's something else, raise error or fallback
                // but typically you only expect K,Q,R,B,N or null
                throw new IllegalArgumentException("Unknown SAN letter: " + letter);
        }
    }

    /** Validate castling from a SAN token "O-O" or "O-O-O". */
	private boolean validateSAN_Castling(AnyMove any, String token, BoardState board, Color side,
			MovePair mp /* , LastMoveInfo lastMove */) {
		// If the token is "O-O" => Kingside, or "O-O-O" => Queenside
		Castle dummyCastle = ChessDSLFactory.eINSTANCE.createCastle();
		boolean isQueenside = token.equals("O-O-O");
		dummyCastle.setSide(isQueenside ? "Queenside" : "Kingside");

		// If there might be leftover symbols after the castling marker, handle them
		// e.g. "O-O+?!"
		String leftover = null;
		if (isQueenside && token.length() > 5) {
			// "O-O-O".length == 5. If more than 5, we have leftover
			leftover = token.substring(5);
		} else if (!isQueenside && token.length() > 3) {
			leftover = token.substring(3);
		}

		// If we do have leftover, parse possible check markers or remarks
		if (leftover != null && !leftover.isEmpty()) {
			// For example, leftover might be "+?!" or "#"
			String leftoverRegex = "^([+#]+)?([!\\?]+)?$";
			Matcher m = Pattern.compile(leftoverRegex).matcher(leftover);
			if (!m.matches()) {
				error("Invalid leftover remarks after castling: '" + leftover + "'", any, null);
				return false;
			}
			String checkMarkers = m.group(1); // e.g. "+"
			String remarkChars = m.group(2); // e.g. "?!"
			// If checkMarkers has '#', that implies checkmate
			// If checkMarkers has '+', that implies check
			// If remarkChars might be "??" => etc.
			// For demonstration, store them in any.getRemarks() or just do quick checks
			List<Remark> remarks = new ArrayList<>();
			if (checkMarkers != null) {
				if (checkMarkers.contains("#")) {
					remarks.add(Remark.CHECKMATE);
				} else if (checkMarkers.contains("+")) {
					remarks.add(Remark.CHECK);
				}
			}
			if (remarkChars != null) {
				// interpret "!" => GOOD, "??" => BAD, etc.
				// for demonstration:
				if (remarkChars.contains("!!"))
					remarks.add(Remark.EXCELLENT);
				else if (remarkChars.contains("?!"))
					remarks.add(Remark.RISKY);
				else if (remarkChars.contains("!?"))
					remarks.add(Remark.DUBIOUS);
				else if (remarkChars.contains("?"))
					remarks.add(Remark.BAD);
				else if (remarkChars.contains("!"))
					remarks.add(Remark.GOOD);
			}
			any.getRemarks().addAll(remarks);
		}

		// Now call validateCastle with the correct arguments
		return validateCastle(dummyCastle, any, board, side, mp /* , lastMove */);
	}

    // 5) Additional Helper for Building lastMove Info from an AnyMove
    private LastMoveInfo buildLastMoveInfoFromAny(AnyMove any, Color side, BoardState board) {
        // If it's a DSL move, we look at the final state from from->to
        if(any.getMove()!=null) {
            DSLMove dsl = any.getMove();
            return buildLastMoveInfo(board, dsl, side);
        } 
        // If it's SAN, we can't do from->to from the AST, but we do a minimal approach:
        // We have to re-parse the token. Or we simply skip tracking last move if we want. 
        // We'll do a partial approach for demonstration:
        if(any.getAlgebraicmove()!=null) {
            SANMove san = any.getAlgebraicmove();
            // We won't do a big parse again. We'll skip or do a minimal approach
            // Just returning null or a dummy is enough for en-passant demonstration
            return null;
        }
        return null;
    }

    // ----------------------------------------------------------------
    // 6) Some shared logic below (unchanged)
    // ----------------------------------------------------------------

    private boolean hasTwoKings(BoardState board) {
        int whiteK=0, blackK=0;
        for(String sq: board.boardMap.keySet()) {
            PieceInfo pi = board.boardMap.get(sq);
            if(pi.type==Piece.KING) {
                if(pi.color==Color.WHITE) whiteK++;
                else blackK++;
            }
        }
        return (whiteK==1 && blackK==1);
    }

    private Color oppositeColor(Color c) {
        return (c==Color.WHITE)? Color.BLACK: Color.WHITE;
    }

    private boolean isMovePatternLegal(BoardState board, String from, String to,
                                       Piece p, Color side, boolean isCapture) {
        // same simplified checks (rooks must have path clear, bishops diagonal, etc.)
        // Reuse the logic you had. 
        // For brevity, the same code from your partial is used:
        if(p==Piece.KNIGHT) {
            return isKnightMove(from, to);
        } else if(p==Piece.KING) {
            return isKingMove(from, to);
        } else if(p==Piece.ROOK) {
            if(!sameFileOrRank(from,to)) return false;
            return pathClear(board, from, to);
        } else if(p==Piece.BISHOP) {
            if(!isDiagonal(from,to)) return false;
            return pathClear(board, from, to);
        } else if(p==Piece.QUEEN) {
            if(isDiagonal(from,to) || sameFileOrRank(from,to)) {
                return pathClear(board, from, to);
            }
            return false;
        } else if(p==Piece.PAWN) {
            // partial logic from your code
            int fFrom = from.charAt(0)-'a';
            int rFrom = from.charAt(1)-'0';
            int fTo = to.charAt(0)-'a';
            int rTo = to.charAt(1)-'0';
            int fileDiff = Math.abs(fTo-fFrom);
            int rankDiff = (side==Color.WHITE)? (rTo-rFrom) : (rFrom-rTo);
            if(isCapture) {
                return fileDiff==1 && rankDiff==1;
            } else {
                if(fileDiff!=0) return false;
                if(rankDiff==1) return true;
                if(rankDiff==2) {
                    if(side==Color.WHITE && rFrom==2) {
                        // check path
                        String midSq = from.charAt(0) + "3";
                        if(board.isOccupied(midSq)) return false;
                        return true;
                    } else if(side==Color.BLACK && rFrom==7) {
                        String midSq = from.charAt(0) + "6";
                        if(board.isOccupied(midSq)) return false;
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean sameFileOrRank(String from, String to) {
        return (from.charAt(0)==to.charAt(0) || from.charAt(1)==to.charAt(1));
    }
    private boolean isDiagonal(String from, String to) {
        int c1 = from.charAt(0), r1=from.charAt(1);
        int c2 = to.charAt(0), r2=to.charAt(1);
        return Math.abs(c2-c1)==Math.abs(r2-r1);
    }
    private boolean pathClear(BoardState board, String from, String to) {
        if(from.equals(to)) return false;
        int c1=from.charAt(0), r1=from.charAt(1);
        int c2=to.charAt(0),   r2=to.charAt(1);
        int dc=Integer.compare(c2,c1);
        int dr=Integer.compare(r2,r1);
        int x=c1+dc, y=r1+dr;
        while(x!=c2 || y!=r2) {
            String sq = ""+(char)x+(char)y;
            if(board.isOccupied(sq)) return false;
            x+=dc; y+=dr;
        }
        return true;
    }
    private boolean isKnightMove(String from, String to) {
        int c1=from.charAt(0), r1=from.charAt(1);
        int c2=to.charAt(0),   r2=to.charAt(1);
        int dc=Math.abs(c2-c1), dr=Math.abs(r2-r1);
        return (dc==2 && dr==1)||(dc==1&&dr==2);
    }
    private boolean isKingMove(String from, String to) {
        int c1=from.charAt(0), r1=from.charAt(1);
        int c2=to.charAt(0),   r2=to.charAt(1);
        return (Math.abs(c2-c1)<=1 && Math.abs(r2-r1)<=1);
    }
    private boolean isInCheck(BoardState board, Color side) {
        // find king
        String kingSq = null;
        for(String sq: board.boardMap.keySet()) {
            PieceInfo pi = board.boardMap.get(sq);
            if(pi.color==side && pi.type==Piece.KING) {
                kingSq=sq; break;
            }
        }
        if(kingSq==null) return false; // no king => no check
        // check if any enemy can attack that square
        for(String sq: board.boardMap.keySet()) {
            PieceInfo pi = board.boardMap.get(sq);
            if(pi.color!=side) {
                // see if pi can capture kingSq
                if(pi.type==Piece.KNIGHT) {
                    if(isKnightMove(sq, kingSq)) return true;
                } else if(pi.type==Piece.KING) {
                    if(isKingMove(sq, kingSq)) return true;
                } else if(pi.type==Piece.PAWN) {
                    if(isPawnAttacking(pi.color, sq, kingSq)) return true;
                } else {
                    // R,B,Q
                    // we check isMovePatternLegal with isCapture=true
                    if(isMovePatternLegal(board, sq, kingSq, pi.type, pi.color, true)) {
                        if(pathClear(board, sq, kingSq)) return true;
                    }
                }
            }
        }
        return false;
    }
    private boolean isPawnAttacking(Color color, String from, String to) {
        // a simpler approach
        int fileFrom = from.charAt(0);
        int rankFrom = from.charAt(1);
        int fileTo   = to.charAt(0);
        int rankTo   = to.charAt(1);
        int fileDiff = Math.abs(fileTo-fileFrom);
        int rankDiff = (color==Color.WHITE)? (rankTo-rankFrom) : (rankFrom-rankTo);
        return fileDiff==1 && rankDiff==1;
    }

    private boolean isCheckmate(BoardState board, Color side) {
        if(!isInCheck(board, side)) return false;
        // attempt all moves
        for(String sq: board.boardMap.keySet()) {
            PieceInfo pi = board.boardMap.get(sq);
            if(pi.color==side) {
                // try all squares on board as "to"
                for(String to: board.boardMap.keySet()) {
                    if(!sq.equals(to)) {
                        // if the occupant is an enemy or empty, we can try a capture or move
                        PieceInfo occupant = board.getPieceAt(to);
                        boolean isCap = occupant!=null && occupant.color!=side;
                        if(isMovePatternLegal(board, sq, to, pi.type, side, isCap)) {
                            // simulate
                            PieceInfo savedFrom=pi, savedTo=occupant;
                            board.removePiece(sq);
                            board.removePiece(to);
                            pi.hasMoved=true;
                            board.boardMap.put(to, pi);
                            boolean stillCheck = isInCheck(board, side);
                            // revert
                            board.removePiece(to);
                            if(savedTo!=null) board.boardMap.put(to, savedTo);
                            board.boardMap.put(sq, savedFrom);
                            if(!stillCheck) return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    // Build last-move info from a DSLMove
    private LastMoveInfo buildLastMoveInfo(BoardState board, DSLMove move, Color side) {
        if(move instanceof Move) {
            Move bm = (Move)move;
            String from = bm.getFrom().getSquare();
            String to = bm.getTo().getSquare();
            Piece p = bm.getPiece();
            boolean doublePush=false;
            if(p==Piece.PAWN && Math.abs(to.charAt(1)-from.charAt(1))==2) {
                doublePush=true;
            }
            return new LastMoveInfo(side, p, from, to, doublePush);
        } else if(move instanceof Capture) {
            Move base=((Capture)move).getMove();
            return buildLastMoveInfo(board, base, side);
        } else if(move instanceof EnPassant) {
            Move base=((EnPassant)move).getCapture().getMove();
            return buildLastMoveInfo(board, base, side);
        } else if(move instanceof Promotion) {
            DSLMove base=((Promotion)move).getMove();
            return buildLastMoveInfo(board, base, side);
        } else if(move instanceof Castle) {
            // trivial
            return new LastMoveInfo(side, Piece.KING, "", "", false);
        } 
        return null;
    }

    /**
     * Validate "Check" or "Checkmate" remarks in the DSL sense. 
     * For SAN we do direct logic in the parse method. 
     */
    private void validateRemarksCheck(List<Remark> remarks, BoardState board, Color sideInCheck, AnyMove any) {
        if(remarks.isEmpty()) return;
        if(remarks.contains(Remark.CHECKMATE)) {
            if(!isCheckmate(board, sideInCheck)) {
                error("Move claims checkmate but isn't mate", any, null);
            }
        } else if(remarks.contains(Remark.CHECK)) {
            if(!isInCheck(board, sideInCheck)) {
                error("Move claims check but isn't in check", any, null);
            }
        }
    }
}
