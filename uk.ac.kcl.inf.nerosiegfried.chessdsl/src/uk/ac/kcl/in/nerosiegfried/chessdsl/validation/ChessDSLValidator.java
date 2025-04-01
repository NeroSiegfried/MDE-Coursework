///*
// * generated by Xtext 2.32.0
// */
//package uk.ac.kcl.in.nerosiegfried.chessdsl.validation;
//
//
///**
// * This class contains custom validation rules. 
// *
// * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
// */
//public class ChessDSLValidator extends AbstractChessDSLValidator {
//	
////	public static final String INVALID_NAME = "invalidName";
////
////	@Check
////	public void checkGreetingStartsWithCapital(Greeting greeting) {
////		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
////			warning("Name should start with a capital",
////					ChessDSLPackage.Literals.GREETING__NAME,
////					INVALID_NAME);
////		}
////	}
//	
//}

package uk.ac.kcl.in.nerosiegfried.chessdsl.validation;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.eclipse.xtext.validation.Check;

import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.*;
import uk.ac.kcl.in.nerosiegfried.chessdsl.validation.AbstractChessDSLValidator;

/**
 * A Chess validator that enforces:
 * - Correct castling logic (no moving through check, etc.)
 * - Capture logic in capture methods only
 * - En passant logic (pawn just moved two squares)
 * - Pawn must promote if reaching last rank
 * - Check that claimed checks or mates are valid
 * - No continuing after mate
 */
public class ChessDSLValidator extends AbstractChessDSLValidator {

    // We'll store minimal info about the last move to see if a pawn advanced 2 squares
    // so we can validate en passant.
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

    /**
     * Each piece has:
     * - color
     * - type
     * - hasMoved
     */
    public static class PieceInfo {
        public Color color;
        public Piece type;
        public boolean hasMoved;
        public PieceInfo(Color c, Piece t) {
            this.color = c; this.type = t;
            this.hasMoved = false;
        }
    }

    /**
     * BoardState as a map of squares -> PieceInfo
     */
    public static class BoardState {
        // e.g. "e2" -> (White, Pawn, false)
        Map<String, PieceInfo> boardMap = new HashMap<>();

        public void initFreshBoard() {
            boardMap.clear();
            // White
            place("a1", Color.WHITE, Piece.ROOK);   place("b1", Color.WHITE, Piece.KNIGHT);
            place("c1", Color.WHITE, Piece.BISHOP); place("d1", Color.WHITE, Piece.QUEEN);
            place("e1", Color.WHITE, Piece.KING);   place("f1", Color.WHITE, Piece.BISHOP);
            place("g1", Color.WHITE, Piece.KNIGHT); place("h1", Color.WHITE, Piece.ROOK);
            for(char c='a'; c<='h'; c++) place(c+"2", Color.WHITE, Piece.PAWN);
            // Black
            place("a8", Color.BLACK, Piece.ROOK);   place("b8", Color.BLACK, Piece.KNIGHT);
            place("c8", Color.BLACK, Piece.BISHOP); place("d8", Color.BLACK, Piece.QUEEN);
            place("e8", Color.BLACK, Piece.KING);   place("f8", Color.BLACK, Piece.BISHOP);
            place("g8", Color.BLACK, Piece.KNIGHT); place("h8", Color.BLACK, Piece.ROOK);
            for(char c='a'; c<='h'; c++) place(c+"7", Color.BLACK, Piece.PAWN);
        }

        public void place(String square, Color c, Piece p) {
            boardMap.put(square, new PieceInfo(c,p));
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

        /**
         * Move from->to, capturing occupant if any,
         * set hasMoved = true.
         */
        public void movePiece(String from, String to) {
            PieceInfo pi = boardMap.remove(from);
            if(pi != null) {
                pi.hasMoved = true;
                boardMap.remove(to);
                boardMap.put(to, pi);
            }
        }
    }

    @Check
    public void checkGame(Game game) {
        if(game == null) return;

        BoardState board = new BoardState();
        // fill board
        if(game.getInitial() != null && game.getInitial().getPositions() != null) {
            for(Placement p : game.getInitial().getPositions().getPlacement()) {
                board.place(p.getSquare().getSquare(),
                            p.getPiece().getColor(),
                            p.getPiece().getKind());
            }
        } else {
            board.initFreshBoard();
        }

        // ensure 2 kings
        if(!hasTwoKings(board)) {
            error("Board must have exactly 1 white king and 1 black king", game, null);
        }

        boolean isGameOver = false;
        LastMoveInfo lastMove = null; // track the last move for en passant

        // We'll assume White moves first, unless the DSL says otherwise
        // but the grammar has color references. We'll keep it simple
        boolean skipWhiteFirstMove = false;
        for(MovePair mp : game.getMoves()) {
            if(isGameOver) {
                error("Moves continue after checkmate/game over", mp, null);
                return;
            }
            // White
            if(!"...".equals(mp.getWhiteMove())) {
                AnyMove wm = mp.getWhiteMove();
                if(wm != null && wm.getMove() != null) {
                    boolean legal = validateMove(board, wm.getMove(), Color.WHITE, mp, lastMove);
                    if(!legal) return; 
                    // check if we just ended in checkmate
                    if(isCheckmate(board, Color.BLACK)) {
                        isGameOver = true;
                    }
                    // update lastMove
                    lastMove = buildLastMoveInfo(board, wm.getMove(), Color.WHITE);
                }
            } else {
            	if (skipWhiteFirstMove) {
            		error("Cannot skip move", mp.getWhiteMove(), null);
            		return;
            	} else {
            		skipWhiteFirstMove = true;
            	}
            }
            // Black
            if(mp.getBlackMove() != null && mp.getBlackMove().getMove() != null) {
                if(isGameOver) {
                    error("Moves continue after checkmate/game over (black side)", mp.getBlackMove(), null);
                    return;
                }
                boolean legal = validateMove(board, mp.getBlackMove().getMove(), Color.BLACK, mp, lastMove);
                if(!legal) return;
                if(isCheckmate(board, Color.WHITE)) {
                    isGameOver = true;
                }
                lastMove = buildLastMoveInfo(board, mp.getBlackMove().getMove(), Color.BLACK);
            }
        }
    }

    /**
     * Validate a single DSLMove for side color.
     * Return false if illegal (after raising error).
     */
    private boolean validateMove(BoardState board, DSLMove move, Color side, MovePair mp, LastMoveInfo lastMove) {
        // If the move is declared a capture (CaptureMove or EnPassantMove),
        // it must actually capture an opponent piece in the correct way.
        // If the move is not declared a capture but the 'to' square is occupied by an enemy piece,
        // raise an error. 
        // Pawn on last rank => must be Promotion or error, etc.

        // Check if user gave a remark "Check" or "Checkmate" => confirm it is so
        // We'll do that after we apply the move, see if it is indeed check or mate.

        if(move instanceof Move) {
            return validateBasic((Move) move, board, side, mp, lastMove);
        } else if(move instanceof Capture) {
            return validateCapture((Capture) move, board, side, mp, lastMove);
        } else if(move instanceof EnPassant) {
            return validateEnPassant((EnPassant) move, board, side, mp, lastMove);
        } else if(move instanceof Promotion) {
            return validatePromotion((Promotion) move, board, side, mp, lastMove);
        } else if(move instanceof Castle) {
            return validateCastle((Castle) move, board, side, mp);
        } else if(move instanceof Dummy) {
            return true;
        }
        error("Unknown move type", mp, null);
        return false;
    }

    // region BASIC
    private boolean validateBasic(Move bm, BoardState board, Color side, MovePair mp, LastMoveInfo lastMove) {
        String from = bm.getFrom().getSquare();
        String to   = bm.getTo().getSquare();
        Piece p = bm.getPiece();

        // Check occupant
        if(!board.isOccupied(from)) {
            error("No piece at " + from + " for basic move", bm, null);
            return false;
        }
        PieceInfo pi = board.getPieceAt(from);
        if(pi.color != side) {
            error("Wrong color piece at " + from, bm, null);
            return false;
        }
        if(pi.type != p) {
            error("Mismatch piece type at " + from + ": expected " + p + " but found " + pi.type, bm, null);
            return false;
        }

        // If 'to' is occupied by an opponent piece => user must explicitly use 'Capture'
        if(board.isOccupied(to)) {
            PieceInfo occupant = board.getPieceAt(to);
            if(occupant.color != side) {
                error("Move is actually a capture but not declared as capture", bm, null);
                return false;
            } else {
                error("Cannot capture your own piece at " + to, bm, null);
                return false;
            }
        }

        // Check movement pattern
        if(!isMovePatternLegal(board, from, to, p, side, false)) {
            error("Illegal move pattern from " + from + " to " + to, bm, null);
            return false;
        }

        // If it's a Pawn moving to last rank => must be promotion
        if(p == Piece.PAWN) {
            if((side == Color.WHITE && to.endsWith("8")) || (side == Color.BLACK && to.endsWith("1"))) {
                error("Pawn reached last rank but not declared as promotion", bm, null);
                return false;
            }
        }

        // apply move
        board.movePiece(from, to);

        // Check if side is still in check
        if(isInCheck(board, side)) {
            error("Move leaves your king in check", bm, null);
            // revert?
            //board.movePiece(to, from);
            return false;
        }

        // If there's a remark "Check" => confirm it's actually check on the other side
        // If there's "Checkmate", confirm it's actually mate
        //validateRemarksCheck(bm.getRemarks(), board, oppositeColor(side), mp);
        if (bm.eContainer() instanceof AnyMove) {
            AnyMove anyMove = (AnyMove) bm.eContainer();
            
            validateRemarksCheck(anyMove.getRemarks(), board, oppositeColor(side), anyMove);
        }

        return true;
    }
    // endregion

    // region CAPTURE
    private boolean validateCapture(Capture cm, BoardState board, Color side, MovePair mp, LastMoveInfo lastMove) {
        // It's a base move with "Capture(...)" or "captures piece"
        Move base = cm.getMove();
        String from = base.getFrom().getSquare();
        String to   = base.getTo().getSquare();
        Piece p = base.getPiece();
        Piece victim = cm.getCapture();

        if(!board.isOccupied(from)) {
            error("No piece at " + from + " for capture", cm, null);
            return false;
        }
        PieceInfo pi = board.getPieceAt(from);
        if(pi.color != side) {
            error("Wrong color piece at " + from + " for capture", cm, null);
            return false;
        }
        if(pi.type != p) {
            error("Expected " + p + " but found " + pi.type, cm, null);
            return false;
        }

        // Must be capturing an enemy piece on 'to' (unless we do en passant)
        if(!board.isOccupied(to)) {
            error("Capture is declared but no piece found at " + to, cm, null);
            return false;
        }
        PieceInfo occupant = board.getPieceAt(to);
        if(occupant.color == side) {
            error("Cannot capture your own piece at " + to, cm, null);
            return false;
        }
        if(occupant.type != victim) {
        	error("Declared capuring a "+ victim + " but actually found a " + occupant.type + " on " + to, cm, null);
        	return false;
        }

        // check pattern
        if(!isMovePatternLegal(board, from, to, p, side, true)) {
            error("Illegal capture pattern from " + from + " to " + to, cm, null);
            return false;
        }

        // If it's a Pawn capturing on last rank => must be promotion
        if(p == Piece.PAWN) {
            if((side == Color.WHITE && to.endsWith("8")) || (side == Color.BLACK && to.endsWith("1"))) {
                error("Pawn captured on last rank but not declared as promotion", cm, null);
                return false;
            }
        }

        // apply
        board.movePiece(from, to);

        if(isInCheck(board, side)) {
            error("Capture leaves your king in check", cm, null);
            return false;
        }

        // Remarks
        //validateRemarksCheck(base.getRemarks(), board, oppositeColor(side), mp);
        if (base.eContainer() instanceof AnyMove) {
            AnyMove anyMove = (AnyMove) base.eContainer();
            validateRemarksCheck(anyMove.getRemarks(), board, oppositeColor(side), anyMove);
        }

        return true;
    }
    // endregion

    // region EN PASSANT
    private boolean validateEnPassant(EnPassant em, BoardState board, Color side, MovePair mp, LastMoveInfo lastMove) {
        // We have capture=CaptureMove, plus "on <square>" for the captured piece
        Capture cm = em.getCapture();
        Move base = cm.getMove();
        String from = base.getFrom().getSquare();
        String to   = base.getTo().getSquare();
        if(base.getPiece() != Piece.PAWN) {
            error("Only pawns can do en passant", em, null);
            return false;
        }

        // The actual captured piece is on the same file as 'to' and the same rank as 'from' (or vice versa).
        String capturedSquare = em.getSquare().getSquare();

        // We also must verify that the last move was a 2-square pawn push from the occupant's color
        if(lastMove == null || !lastMove.wasDoublePawnAdvance) {
        	if(lastMove.to == capturedSquare) {
        		//I can swear I wanted to do something here
        	}
            // for demonstration, default to true if in proper rank & no previous moves
        	else if(!assumeEnPassantAllowed(from, side, lastMove)) {
                error("No valid 2-square pawn push to allow en passant", em, null);
                return false;
            }
        }

        // Check occupant of capturedSquare must be an enemy Pawn
        if(!board.isOccupied(capturedSquare)) {
        	//this probably won't ever execute because of the last if block
            error("No piece found to capture for en passant at " + capturedSquare, em, null);
            return false;
        }
        PieceInfo victim = board.getPieceAt(capturedSquare);
        if(victim.type != Piece.PAWN || victim.color == side) {
            error("En passant target must be an enemy pawn", em, null);
            return false;
        }

        // If side is White, from rank should be 5, to rank 6, capturedSquare rank 5, etc. 
        // We'll skip the deep rank logic but here's the placeholder:
        if(!isMovePatternLegal(board, from, to, Piece.PAWN, side, true)) {
            error("Invalid en passant move pattern", em, null);
            return false;
        }

        // apply the move
        board.movePiece(from, to);
        board.removePiece(capturedSquare);

        if(isInCheck(board, side)) {
            error("En passant leaves your king in check", em, null);
            return false;
        }

        // check remarks
        //validateRemarksCheck(base.getRemarks(), board, oppositeColor(side), mp);
        if (base.eContainer() instanceof AnyMove) {
            AnyMove anyMove = (AnyMove) base.eContainer();
            validateRemarksCheck(anyMove.getRemarks(), board, oppositeColor(side), anyMove);
        }
        return true;
    }

    private boolean assumeEnPassantAllowed(String from, Color side, LastMoveInfo lastMove) {
        // We'll do a minimal check: if from is e5 & side=White, we pretend it might be valid. 
        // Defaults to true for demonstrative purposes if pawns in the proper rank & no previous moves
        if(lastMove == null) {
            // if White and from rank=5 or Black and from rank=4
            if(side == Color.WHITE && from.endsWith("5")) return true;
            if(side == Color.BLACK && from.endsWith("4")) return true;
        }
        return false;
    }
    // endregion

    // region PROMOTION
    private boolean validatePromotion(Promotion pm, BoardState board, Color side, MovePair mp, LastMoveInfo lastMove) {
        DSLMove base = pm.getMove();
        Move bm = null;
        boolean isCapture = false;
        if(base instanceof Move) {
            bm = (Move) base;
        } else if(base instanceof Capture) {
            bm = ((Capture)base).getMove();
            isCapture = true;
        } else {
            error("Promotion must have a base move or capture", pm, null);
            return false;
        }

        if(bm.getPiece() != Piece.PAWN) {
            error("Only a pawn can promote", pm, null);
            return false;
        }

        String from = bm.getFrom().getSquare();
        String to   = bm.getTo().getSquare();
        // if side=White -> to ends with 8
        if(side == Color.WHITE && !to.endsWith("8")) {
            error("White pawn must promote on rank 8", pm, null);
            return false;
        }
        if(side == Color.BLACK && !to.endsWith("1")) {
            error("Black pawn must promote on rank 1", pm, null);
            return false;
        }
        // If capture, ensure occupant is enemy
        if(isCapture) {
            if(!board.isOccupied(to)) {
                error("Declared capture promotion but no enemy piece at " + to, pm, null);
                return false;
            }
            PieceInfo occupant = board.getPieceAt(to);
            if(occupant.color == side) {
                error("Cannot capture own piece in promotion", pm, null);
                return false;
            }
        } else {
            // if there's occupant => error
            if(board.isOccupied(to)) {
                error("Not declared as capture but occupant found at " + to, pm, null);
                return false;
            }
        }
        // check pattern
        if(!isMovePatternLegal(board, from, to, Piece.PAWN, side, false) && !isMovePatternLegal(board, from, to, Piece.PAWN, side, true)) {
            error("Illegal pawn move for promotion", pm, null);
            return false;
        }
        // apply
        board.movePiece(from, to);
        // replace with pm.getPiece() e.g. Queen
        board.removePiece(to);
        board.place(to, side, pm.getPiece());

        if(isInCheck(board, side)) {
            error("Promotion leaves king in check", pm, null);
            return false;
        }

        // remarks
//        if(base instanceof Move) {
//            validateRemarksCheck(((Move)base).getRemarks(), board, oppositeColor(side), mp);
//        } else {
//            validateRemarksCheck(((Capture)base).getMove().getRemarks(), board, oppositeColor(side), mp);
//        }
//        return true;
        if (base instanceof Move) {
            AnyMove any = (AnyMove)((Move)base).eContainer();
            validateRemarksCheck(any.getRemarks(), board, oppositeColor(side), any);
        } else {
            AnyMove any = (AnyMove)((Capture)base).eContainer();
            validateRemarksCheck(any.getRemarks(), board, oppositeColor(side), any);
        }
        return true;
        
    }
    // endregion

    // region CASTLE
    private boolean validateCastle(Castle cm, BoardState board, Color side, MovePair mp) {
        // We'll get the type from checkCastleType 
        String ctype = checkCastleType(cm, side, board);
        if(!Objects.equals(ctype, "Kingside") && !Objects.equals(ctype, "Queenside")) {
            error("Cannot deduce valid castling side or conditions not met", cm, null);
            return false;
        }
        // e1 with h1 if white kingside, etc.
        String kingSq = (side==Color.WHITE)?"e1":"e8";
        String rookSq = (side==Color.WHITE)?
                        (ctype.equals("Kingside")?"h1":"a1"):
                        (ctype.equals("Kingside")?"h8":"a8");

        // check if squares are correct & pieces haven't moved
        PieceInfo kingPi = board.getPieceAt(kingSq);
        PieceInfo rookPi = board.getPieceAt(rookSq);
        if(kingPi==null || rookPi==null) {
            error("King or rook not in castling position", cm, null);
            return false;
        }
        if(kingPi.type != Piece.KING || kingPi.color != side) {
            error("No king found for castling at " + kingSq, cm, null);
            return false;
        }
        if(rookPi.type != Piece.ROOK || rookPi.color != side) {
            error("No rook found for castling at " + rookSq, cm, null);
            return false;
        }
        if(kingPi.hasMoved || rookPi.hasMoved) {
            error("King or rook has already moved, cannot castle", cm, null);
            return false;
        }
        // Check if king is in check now or passes through check
        if(isInCheck(board, side)) {
            error("Cannot castle while in check", cm, null);
            return false;
        }
        // squares that the king passes
        String pass1, pass2, kingDest, rookDest;
        if(side==Color.WHITE) {
            if(ctype.equals("Kingside")) {
                pass1="f1"; pass2="g1"; kingDest="g1"; rookDest="f1";
            } else {
                pass1="d1"; pass2="c1"; kingDest="c1"; rookDest="d1";
            }
        } else {
            if(ctype.equals("Kingside")) {
                pass1="f8"; pass2="g8"; kingDest="g8"; rookDest="f8";
            } else {
                pass1="d8"; pass2="c8"; kingDest="c8"; rookDest="d8";
            }
        }
        // must be empty
        if(board.isOccupied(pass1) || board.isOccupied(pass2)) {
            error("Path is blocked for castling", cm, null);
            return false;
        }
        // check if passing squares are in check
        // We'll do partial checks 
        // 1) Move king to pass1 => see if in check
        board.removePiece(kingSq);
        board.place(pass1, side, Piece.KING);
        if(isInCheck(board, side)) {
            error("King passes through check at " + pass1, cm, null);
            // revert
            board.removePiece(pass1);
            board.place(kingSq, side, Piece.KING);
            return false;
        }
        // revert, move king to pass2
        board.removePiece(pass1);
        board.place(pass2, side, Piece.KING);
        if(isInCheck(board, side)) {
            error("King passes through check at " + pass2, cm, null);
            // revert
            board.removePiece(pass2);
            board.place(kingSq, side, Piece.KING);
            return false;
        }
        // revert & do final place
        board.removePiece(pass2);
        board.place(kingSq, side, Piece.KING);

        // now apply
        board.removePiece(kingSq);
        board.removePiece(rookSq);
        PieceInfo kpi = new PieceInfo(side, Piece.KING); kpi.hasMoved=true;
        PieceInfo rpi = new PieceInfo(side, Piece.ROOK); rpi.hasMoved=true;
        board.place(kingDest, side, Piece.KING);
        board.place(rookDest, side, Piece.ROOK);

        // final check
        // kinda unnecessary now that I'm going through the logic again
        if(isInCheck(board, side)) {
            error("Castling ends in check", cm, null);
            return false;
        }
        return true;
    }
    
    private String disambiguate(BoardState board, String from, String to, Color side, Piece p) {
        // gather all squares that have a piece of the same type & color
    	// not used at the moment but will be useful once I add algebraic notation support, I think
        List<String> samePieces = new ArrayList<>();
        for(String sq : board.boardMap.keySet()) {
            PieceInfo pi = board.boardMap.get(sq);
            if(pi.type == p && pi.color == side) {
                // check if that piece can move to `to`
                if(isMovePatternLegal(board, sq, to, p, side, true) || isMovePatternLegal(board, sq, to, p, side, false)) {
                    samePieces.add(sq);
                }
            }
        }
        // if only 1 piece can go there => no disambiguation needed
        if(samePieces.size() <= 1) return "";
        
        // if more than 1 => figure out which is the actual from
        // if the user says from=“b1”, then you might do:
        if(!from.isEmpty()) {
            // from is e.g. "b1"
            String fromFile = from.substring(0,1); // “b”
            String fromRank = from.substring(1);   // “1”
            
            // see if at least two share the same file => disambiguate by file or rank
            boolean sameFile = false;
            boolean sameRank = false;
            for(String loc : samePieces) {
                if(!loc.equals(from)) {
                    // compare files/ranks
                    if(loc.charAt(0) == from.charAt(0)) sameFile = true;
                    if(loc.charAt(1) == from.charAt(1)) sameRank = true;
                }
            }
            // if sameFile => disambiguate by file if necessary, etc.
            // Simplest approach:
            if(!sameFile) {
                // that means the from-file is unique
                return fromFile;
            } else if(!sameRank) {
                // the from-rank is unique
                return fromRank;
            } else {
                // we have to return file+rank
            	// redundant because two pieces can't be on the same square concurrently
                return from;
            }
        }
        return "";
    }

    
    private String checkCastleType(Castle cm, Color side, BoardState board) {
        // Inspect the actual syntax from cm 
        // For demonstration, let's do a trivial approach:
        // If the user wrote "Castle(Kingside)" => "Kingside"
        // If "Castle(Queenside)" => "Queenside"
    	// shouldn't be hard to change for algebraic notation if I adjust my grammar well
    	return cm.getSide();
    }
    // endregion

    // region EXTRA UTILS

    private boolean hasTwoKings(BoardState board) {
        int whiteKing=0, blackKing=0;
        for(String sq : board.boardMap.keySet()) {
            PieceInfo pi = board.boardMap.get(sq);
            if(pi.type == Piece.KING) {
                if(pi.color == Color.WHITE) whiteKing++;
                else blackKing++;
            }
        }
        return (whiteKing==1 && blackKing==1);
    }

    private Color oppositeColor(Color c) {
        return (c==Color.WHITE) ? Color.BLACK : Color.WHITE;
    }

    /**
     * isMovePatternLegal checks if path is blocked for Rooks, Bishops, Queens,
     * if Knights jump, etc. We'll do a simplified logic.
     */
    private boolean isMovePatternLegal(BoardState board, String from, String to, Piece p, Color side, boolean isCapture) {
        // e.g. if it's a Knight => check L-shape
        if(p == Piece.KNIGHT) {
            int c1 = from.charAt(0), r1 = from.charAt(1);
            int c2 = to.charAt(0),   r2 = to.charAt(1);
            int dc = Math.abs(c2 - c1), dr = Math.abs(r2 - r1);
            return (dc==2 && dr==1) || (dc==1 && dr==2);
        } 
        else if(p == Piece.KING) {
            // must be 1 square in any direction
            int c1 = from.charAt(0), r1 = from.charAt(1);
            int c2 = to.charAt(0),   r2 = to.charAt(1);
            return (Math.abs(c2 - c1)<=1) && (Math.abs(r2 - r1)<=1);
        }
        else if(p == Piece.ROOK) {
            if(!sameFileOrRank(from,to)) return false;
            // ensure no blocking squares
            return pathClear(board, from, to);
        }
        else if(p == Piece.BISHOP) {
            if(!isDiagonal(from,to)) return false;
            return pathClear(board, from, to);
        }
        else if(p == Piece.QUEEN) {
            if(isDiagonal(from,to) || sameFileOrRank(from,to)) {
                return pathClear(board, from, to);
            }
            return false;
        }
        else if(p == Piece.PAWN) {
        	int fFrom = from.charAt(0) - 'a';
            int rFrom = from.charAt(1) - '0';
            int fTo = to.charAt(0) - 'a';
            int rTo = to.charAt(1) - '0';
            int fileDiff = Math.abs(fTo - fFrom);
            int rankDiff = (side == Color.WHITE) ? rTo - rFrom : rFrom - rTo;
            if(isCapture) {
                // Pawn capture: must move diagonally one square
                return fileDiff == 1 && rankDiff == 1;
            } else {
                // Pawn forward move: file must be same
                if(fileDiff != 0) return false;
                if(rankDiff == 1) return true;
                if(rankDiff == 2 && ((side == Color.WHITE && rFrom == 2) || (side == Color.BLACK && rFrom == 7))) {
                    char intermediate = (side == Color.WHITE) ? (char)(rFrom + 1 + '0') : (char)(rFrom - 1 + '0');
                    String interSq = "" + from.charAt(0) + intermediate;
                    return !board.isOccupied(interSq);
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
        int c1 = from.charAt(0), r1 = from.charAt(1);
        int c2 = to.charAt(0),   r2 = to.charAt(1);
        return Math.abs(c2 - c1) == Math.abs(r2 - r1);
    }

    /**
     * pathClear checks squares in between from->to for rooks/bishops/queens. 
     */
    private boolean pathClear(BoardState board, String from, String to) {
    	// We'll do a naive approach.
        // skip if from==to
        if(from.equals(to)) return false;
        int c1=from.charAt(0), r1=from.charAt(1);
        int c2=to.charAt(0),   r2=to.charAt(1);

        int dc = Integer.compare(c2,c1); // 1,0,-1
        int dr = Integer.compare(r2,r1);
        int x = c1+dc, y = r1+dr;
        while(x!=c2 || y!=r2) {
            String sq = ""+ (char)x + (char)y;
            if(board.isOccupied(sq)) return false;
            x+=dc; y+=dr;
        }
        return true;
    }

    
    private boolean isInCheck(BoardState board, Color side) {
        String kingSquare = null;
        for (String sq : board.boardMap.keySet()) {
            PieceInfo pi = board.boardMap.get(sq);
            if (pi.color == side && pi.type == Piece.KING) {
                kingSquare = sq;
                break;
            }
        }
        // Seems funny but might be useful
        if (kingSquare == null)
            return false;
        
        for (String sq : board.boardMap.keySet()) {
            PieceInfo enemy = board.boardMap.get(sq);
            if (enemy.color != side) {
                switch (enemy.type) {
                    case KNIGHT:
                        if (isKnightMove(sq, kingSquare))
                            return true;
                        break;
                    case PAWN:
                        if (isPawnAttacking(enemy.color, sq, kingSquare))
                            return true;
                        break;
                    case KING:
                        if (isKingAdjacent(sq, kingSquare))
                            return true;
                        break;
                    case ROOK:
                    case BISHOP:
                    case QUEEN:
                        if (isMovePatternLegal(board, sq, kingSquare, enemy.type, side, false) && pathClear(board, sq, kingSquare))
                            return true;
                        break;
                    default:
                        break;
                }
            }
        }
        return false;
    }

    // Helper methods:
    // Could probably do a bit of refactoring with this and the isMoveLegal method
    private boolean isKnightMove(String from, String to) {
        int c1 = from.charAt(0), r1 = from.charAt(1);
        int c2 = to.charAt(0),   r2 = to.charAt(1);
        int dc = Math.abs(c2 - c1), dr = Math.abs(r2 - r1);
        return (dc == 2 && dr == 1) || (dc == 1 && dr == 2);
    }

    private boolean isPawnAttacking(Color pawnColor, String from, String to) {
        int fileFrom = from.charAt(0);
        int rankFrom = from.charAt(1);
        int fileTo = to.charAt(0);
        int rankTo = to.charAt(1);
        int fileDiff = Math.abs(fileTo - fileFrom);
        int rankDiff = (pawnColor == Color.WHITE) ? rankTo - rankFrom : rankFrom - rankTo;
        return fileDiff == 1 && rankDiff == 1;
    }

    private boolean isKingAdjacent(String from, String to) {
        int c1 = from.charAt(0), r1 = from.charAt(1);
        int c2 = to.charAt(0),   r2 = to.charAt(1);
        return Math.abs(c2 - c1) <= 1 && Math.abs(r2 - r1) <= 1;
    }


    /**
     * isCheckmate: side is in check and no legal move can remove it.
     * We'll do a naive approach: find all squares of side, attempt all possible moves, see if any remove check.
     */
    private boolean isCheckmate(BoardState board, Color side) {
        if(!isInCheck(board,side)) return false;
        // Try each piece, each possible square
        for(String sq: board.boardMap.keySet()) {
            PieceInfo pi = board.boardMap.get(sq);
            if(pi.color==side) {
                // generate possible squares in a naive manner
                for(String to: board.boardMap.keySet()) {
                    // or squares off board
                    if(!sq.equals(to)) {
                        if(isMovePatternLegal(board, sq, to, pi.type, side, true)) {
                            // check if occupant is friend or foe, etc.
                            // We'll do a partial apply
                            PieceInfo occupant = board.getPieceAt(to);
                            boolean friendThere = occupant!=null && occupant.color==side;
                            if(!friendThere) {
                                // try
                                PieceInfo savedFrom = pi;
                                PieceInfo savedTo   = occupant;
                                board.removePiece(sq);
                                board.removePiece(to);
                                pi.hasMoved=true; // this doesn't seem quite right
                                // should probably save the current status and then revert it. Or leave it unchanged?
                                board.boardMap.put(to, pi);

                                boolean stillCheck = isInCheck(board, side);

                                // revert
                                board.removePiece(to);
                                if(savedTo!=null) board.boardMap.put(to, savedTo);
                                board.boardMap.put(sq, savedFrom);

                                if(!stillCheck) return false; // we found a move
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    private LastMoveInfo buildLastMoveInfo(BoardState board, DSLMove move, Color side) {
        if(move instanceof Move) {
            Move bm = (Move) move;
            String from = bm.getFrom().getSquare();
            String to   = bm.getTo().getSquare();
            Piece p = bm.getPiece();
            boolean doublePawn = false;
            if(p==Piece.PAWN && Math.abs(to.charAt(1)-from.charAt(1))==2) {
                // advanced 2 squares
                doublePawn = true;
            }
            return new LastMoveInfo(side, p, from, to, doublePawn);
        } else if(move instanceof Capture) {
            Move bm = ((Capture)move).getMove();
            return buildLastMoveInfo(board, bm, side);
        } else if(move instanceof EnPassant) {
            Capture cm = ((EnPassant)move).getCapture();
            return buildLastMoveInfo(board, cm, side);
        } else if(move instanceof Promotion) {
            DSLMove base = ((Promotion)move).getMove();
            return buildLastMoveInfo(board, base, side);
        } else if(move instanceof Castle) {
            // trivial
            return new LastMoveInfo(side, Piece.KING, "", "", false);
        }
        else {
            return null;
        }
    }

    /**
     * If the DSL claims there's a remark=Check or Checkmate,
     * verify it's actually so for the opposite side.
     */
    private void validateRemarksCheck(List<Remark> remarks, BoardState board, Color sideInCheck, AnyMove mp) {
        if(remarks.isEmpty()) return;
        // If there's Check => isInCheck
        if(remarks.contains(Remark.CHECKMATE)) {
            if(!isCheckmate(board, sideInCheck)) {
                error("Move claims checkmate but it's not a mate", mp, null);
            }
        }
        else if(remarks.contains(Remark.CHECK)) {
            if(!isInCheck(board, sideInCheck)) {
                error("Move claims check but it's not in check", mp, null);
            }
        }
    }
}