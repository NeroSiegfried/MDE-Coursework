package uk.ac.kcl.in.nerosiegfried.chessdsl.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.generator.IFileSystemAccess2;

import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.*;
import uk.ac.kcl.in.nerosiegfried.chessdsl.validation.ChessDSLValidator.BoardState;
import uk.ac.kcl.in.nerosiegfried.chessdsl.validation.ChessDSLValidator.PieceInfo;

/**
 * Generator that outputs:
 *  - A standard algebraic notation file: <filename>_algebraic.txt
 *  - A concise DSL file: <filename>_concise.txt
 *  - A verbose DSL file: <filename>_verbose.txt
 * 
 * Also appends remarks in parentheses for the concise/verbose outputs.
 * Also appends a final score line if the Conclusion indicates it.
 */
public class ChessDSLGenerator extends AbstractGenerator {

    // ----------------------------------------------------------------
    //  Board modeling from your code snippet
    // ----------------------------------------------------------------

    static class PieceInfo {
        public Color color;
        public Piece type;
        public boolean hasMoved;

        public PieceInfo(Color c, Piece t) {
            color = c;
            type = t;
            hasMoved = false;
        }
    }

    static class BoardState {
        Map<String, PieceInfo> boardMap = new HashMap<>();

        public void initFreshBoard() {
            boardMap.clear();
            // White major pieces
            place("a1", Color.WHITE, Piece.ROOK);
            place("b1", Color.WHITE, Piece.KNIGHT);
            place("c1", Color.WHITE, Piece.BISHOP);
            place("d1", Color.WHITE, Piece.QUEEN);
            place("e1", Color.WHITE, Piece.KING);
            place("f1", Color.WHITE, Piece.BISHOP);
            place("g1", Color.WHITE, Piece.KNIGHT);
            place("h1", Color.WHITE, Piece.ROOK);
            for (char c = 'a'; c <= 'h'; c++) {
                place(c + "2", Color.WHITE, Piece.PAWN);
            }
            // Black major pieces
            place("a8", Color.BLACK, Piece.ROOK);
            place("b8", Color.BLACK, Piece.KNIGHT);
            place("c8", Color.BLACK, Piece.BISHOP);
            place("d8", Color.BLACK, Piece.QUEEN);
            place("e8", Color.BLACK, Piece.KING);
            place("f8", Color.BLACK, Piece.BISHOP);
            place("g8", Color.BLACK, Piece.KNIGHT);
            place("h8", Color.BLACK, Piece.ROOK);
            for (char c = 'a'; c <= 'h'; c++) {
                place(c + "7", Color.BLACK, Piece.PAWN);
            }
        }

        public void place(String sq, Color c, Piece p) {
            boardMap.put(sq, new PieceInfo(c, p));
        }

        public boolean isOccupied(String sq) {
            return boardMap.containsKey(sq);
        }

        public PieceInfo get(String sq) {
            return boardMap.get(sq);
        }

        public void remove(String sq) {
            boardMap.remove(sq);
        }

        public void movePiece(String from, String to) {
            PieceInfo pi = boardMap.remove(from);
            if (pi != null) {
                pi.hasMoved = true;
                boardMap.remove(to);
                boardMap.put(to, pi);
            }
        }
        
        // Shallow copy for sim checks
        public BoardState cloneBoard() {
            BoardState copy = new BoardState();
            for (String sq : boardMap.keySet()) {
                PieceInfo pi = boardMap.get(sq);
                PieceInfo copyPi = new PieceInfo(pi.color, pi.type);
                copyPi.hasMoved = pi.hasMoved;
                copy.boardMap.put(sq, copyPi);
            }
            return copy;
        }
    }

    // ----------------------------------------------------------------
    //  Utility methods for path checking, opposite color, etc.
    // ----------------------------------------------------------------

    private Color opposite(Color c) {
        return (c == Color.WHITE) ? Color.BLACK : Color.WHITE;
    }

    private boolean sameFileOrRank(String from, String to) {
        return (from.charAt(0) == to.charAt(0) || from.charAt(1) == to.charAt(1));
    }

    private boolean isDiagonal(String from, String to) {
        int c1 = from.charAt(0), r1 = from.charAt(1);
        int c2 = to.charAt(0), r2 = to.charAt(1);
        return Math.abs(c2 - c1) == Math.abs(r2 - r1);
    }

    private boolean pathClear(BoardState board, String from, String to) {
        if (from.equals(to)) return false;
        int c1 = from.charAt(0), r1 = from.charAt(1);
        int c2 = to.charAt(0),   r2 = to.charAt(1);
        int dc = Integer.compare(c2,c1);
        int dr = Integer.compare(r2,r1);
        int x = c1+dc, y=r1+dr;
        while(x!=c2 || y!=r2) {
            String sq = ""+(char)x+(char)y;
            if(board.isOccupied(sq)) return false;
            x+=dc; y+=dr;
        }
        return true;
    }

    // For the purpose of generating algebraic notation suffixes
    // we assume you have in your validator the isInCheck, isCheckmate, etc.
    // We can either place stubs or replicate minimal logic.
    // We'll replicate minimal logic here for clarity.

    private boolean isInCheck(BoardState board, Color side) {
        // Finds side's King square
        String kingSquare = null;
        for(String sq: board.boardMap.keySet()) {
            PieceInfo pi = board.boardMap.get(sq);
            if(pi.color==side && pi.type==Piece.KING) {
                kingSquare = sq; break;
            }
        }
        if(kingSquare==null) return false;

        return anyEnemyCanCapture(board, side, kingSquare);
    }

    // Minimal approach: check if any enemy piece can capture kingSq
    private boolean anyEnemyCanCapture(BoardState board, Color side, String kingSq) {
        for (String sq : board.boardMap.keySet()) {
            PieceInfo pi = board.boardMap.get(sq);
            if (pi.color != side) {
                if (pi.type == Piece.KNIGHT) {
                    if (isKnightMove(sq, kingSq)) return true;
                } else if (pi.type == Piece.KING) {
                    if (isKingAdjacent(sq, kingSq)) return true;
                } else if (pi.type == Piece.PAWN) {
                    if (isPawnAttacking(pi.color, sq, kingSq)) return true;
                } else {
                    // Rook/Bishop/Queen
                    if (isMovePatternLegal(board, sq, kingSq, pi.type, pi.color, true) 
                        && pathClear(board, sq, kingSq)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean isCheckmate(BoardState board, Color side) {
        // If not in check, not mate
        if(!isInCheck(board, side)) return false;
        // Try each piece, attempt possible moves
        for(String sq: board.boardMap.keySet()) {
            PieceInfo pi = board.boardMap.get(sq);
            if(pi.color==side) {
                // generate naive squares
                for(String to: board.boardMap.keySet()) {
                    if(!sq.equals(to)) {
                        // see if occupant is friend or foe
                        PieceInfo occupant = board.get(to);
                        boolean isCapture = (occupant!=null && occupant.color!=side);
                        if(isMovePatternLegal(board, sq, to, pi.type, side, isCapture)) {
                            // simulate
                            BoardState sim = board.cloneBoard();
                            sim.remove(sq);
                            sim.remove(to);
                            pi.hasMoved=true;
                            sim.boardMap.put(to, pi);
                            if(!isInCheck(sim, side)) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    // Knight & King adjacency & Pawn attacking, needed for isInCheck
    private boolean isKnightMove(String from, String to) {
        int c1=from.charAt(0), r1=from.charAt(1);
        int c2=to.charAt(0),   r2=to.charAt(1);
        int dc=Math.abs(c2-c1), dr=Math.abs(r2-r1);
        return (dc==2 && dr==1)||(dc==1 && dr==2);
    }
    private boolean isKingAdjacent(String from, String to) {
        int c1=from.charAt(0), r1=from.charAt(1);
        int c2=to.charAt(0),   r2=to.charAt(1);
        return (Math.abs(c2-c1)<=1 && Math.abs(r2-r1)<=1);
    }
    private boolean isPawnAttacking(Color color, String from, String to) {
        int fileFrom = from.charAt(0);
        int rankFrom = from.charAt(1);
        int fileTo   = to.charAt(0);
        int rankTo   = to.charAt(1);
        int fileDiff = Math.abs(fileTo-fileFrom);
        int rankDiff = (color==Color.WHITE)? (rankTo-rankFrom) : (rankFrom-rankTo);
        return (fileDiff==1 && rankDiff==1);
    }

    // Movement patterns for generating suffix
    private boolean isMovePatternLegal(BoardState board, String from, String to, Piece p, Color side, boolean isCapture) {
        // see your snippet
        if (p == Piece.KNIGHT) {
            return isKnightMove(from, to);
        } else if (p == Piece.KING) {
            return isKingAdjacent(from, to);
        } else if (p == Piece.ROOK) {
            if(!sameFileOrRank(from, to)) return false;
            return pathClear(board, from, to);
        } else if (p == Piece.BISHOP) {
            if(!isDiagonal(from, to)) return false;
            return pathClear(board, from, to);
        } else if (p == Piece.QUEEN) {
            if(isDiagonal(from, to) || sameFileOrRank(from, to)) {
                return pathClear(board, from, to);
            }
            return false;
        } else if (p == Piece.PAWN) {
            int fFrom = from.charAt(0)-'a';
            int rFrom = from.charAt(1)-'0';
            int fTo   = to.charAt(0)-'a';
            int rTo   = to.charAt(1)-'0';
            int fileDiff = Math.abs(fTo-fFrom);
            int rankDiff = (side==Color.WHITE)? (rTo-rFrom) : (rFrom-rTo);
            if(isCapture) {
                return (fileDiff==1 && rankDiff==1);
            } else {
                if(fileDiff!=0) return false;
                if(rankDiff==1) return true;
                if(rankDiff==2 && ((side==Color.WHITE && rFrom==2) 
                                || (side==Color.BLACK && rFrom==7))) {
                    char interRank = (side==Color.WHITE)? (char)(rFrom+1+'0') : (char)(rFrom-1+'0');
                    String sq = ""+ (char)(fFrom+'a') + interRank;
                    return !board.isOccupied(sq);
                }
                return false;
            }
        }
        return false;
    }

    // ----------------------------------------------------------------
    // 1) Algebraic Notation Generation from your snippet
    // ----------------------------------------------------------------

    // Gather remarks from an eContainer
    private List<Remark> getRemarks(DSLMove move) {
        if (move.eContainer() instanceof AnyMove) {
            return ((AnyMove)move.eContainer()).getRemarks();
        }
        return new ArrayList<>();
    }

    // For the letter
    private String pieceLetter(Piece p) {
        switch (p) {
            case KING:   return "K";
            case QUEEN:  return "Q";
            case ROOK:   return "R";
            case BISHOP: return "B";
            case KNIGHT: return "N";
            default:     return "";
        }
    }

    private String translateRemarkSymbol(Remark r) {
        // for algebraic
        switch(r) {
            case GOOD:      return "!";
            case BAD:       return "?";
            case EXCELLENT: return "!!";
            case RISKY:     return "!?";
            case DUBIOUS:   return "?!";
            default: return "";
        }
    }

    private String combineSuffixes(boolean isCheck, boolean isMate, List<Remark> remarks) {
        StringBuilder sb = new StringBuilder();
        if (isMate) {
            sb.append("#");
        } else if (isCheck) {
            sb.append("+");
        }
        // Then symbolic remarks
        boolean hasCheckmateRemark = remarks.contains(Remark.CHECKMATE);
        // We'll skip printing "CHECK" or "CHECKMATE" if we already put # or +, but we do want to 
        // show symbolic remarks (like "!" or "?").
        for(Remark r: remarks) {
            // If remark is "CHECK" or "CHECKMATE", skip or we can just skip them
            switch(r) {
                case GOOD:      sb.append("!"); break;
                case BAD:       sb.append("?"); break;
                case EXCELLENT: sb.append("!!"); break;
                case RISKY:     sb.append("!?"); break;
                case DUBIOUS:   sb.append("?!"); break;
                default: break; // skip CHECK / CHECKMATE as we've appended + or #
            }
        }
        return sb.toString();
    }

    // For disambiguation in standard algebraic
    private String disambiguate(BoardState board, String from, String to, Color side, Piece p) {
        if(p==Piece.PAWN) return "";
        // gather squares with same piece type
        List<String> same = new ArrayList<>();
        for(String sq: board.boardMap.keySet()) {
            PieceInfo pi = board.boardMap.get(sq);
            if(pi.color==side && pi.type==p) {
                // check if can move to 'to'
                if(isMovePatternLegal(board, sq, to, p, side, true) 
                   || isMovePatternLegal(board, sq, to, p, side, false)) {
                    same.add(sq);
                }
            }
        }
        if(same.size()<=1) return "";
        // If there's more than one, we check if file or rank are unique
        // We'll do a minimal approach
        boolean sameFile=false, sameRank=false;
        String fromFile = from.substring(0,1);
        String fromRank = from.substring(1);
        for(String s: same) {
            if(!s.equals(from)) {
                if(s.charAt(0)==from.charAt(0)) sameFile=true;
                if(s.charAt(1)==from.charAt(1)) sameRank=true;
            }
        }
        if(!sameFile) return fromFile;
        if(!sameRank) return fromRank;
        return from; // fallback: full
    }

    // Convert DSLMove -> algebraic
    private String toAlgebraic(DSLMove move, Color side, BoardState board) {
        // We'll do the "simulate in a clone" approach to see if it's check or mate:
        BoardState sim = board.cloneBoard();
        applyMove(sim, move, side);
        boolean isCheck = isInCheck(sim, opposite(side));
        boolean isMate  = isCheck && isCheckmate(sim, opposite(side));

        List<Remark> remarks = getRemarks(move);

        if (move instanceof Move) {
            return convertBasic((Move) move, side, board, remarks, isCheck, isMate);
        } else if (move instanceof Capture) {
            return convertCapture((Capture) move, side, board, remarks, isCheck, isMate);
        } else if (move instanceof Castle) {
            return convertCastle((Castle) move, side, board, remarks, isCheck, isMate);
        } else if (move instanceof EnPassant) {
            return convertEnPassant((EnPassant) move, side, board, remarks, isCheck, isMate);
        } else if (move instanceof Promotion) {
            return convertPromotion((Promotion) move, side, board, remarks, isCheck, isMate);
        } else if (move instanceof Dummy) {
            return "dummy";
        }
        return "";
    }

    private String convertBasic(Move mv, Color side, BoardState board, List<Remark> remarks,
                                boolean isCheck, boolean isMate) {
        Piece p = mv.getPiece();
        String from = mv.getFrom().getSquare();
        String to   = mv.getTo().getSquare();
        String disamb = (p==Piece.PAWN)? "" : disambiguate(board, from, to, side, p);
        String letter = (p==Piece.PAWN)? "" : pieceLetter(p);
        String base = letter + disamb + to;
        String suffix = combineSuffixes(isCheck, isMate, remarks);
        return base + suffix;
    }

    private String convertCapture(Capture cap, Color side, BoardState board, List<Remark> remarks,
                                  boolean isCheck, boolean isMate) {
        Move base = cap.getMove();
        Piece p = base.getPiece();
        String from = base.getFrom().getSquare();
        String to   = base.getTo().getSquare();
        // For pawns, we typically show the file of origin
        String letter = (p==Piece.PAWN)? from.substring(0,1) : pieceLetter(p);
        String disamb = (p==Piece.PAWN)? "" : disambiguate(board, from, to, side, p);
        String notation = letter + disamb + "x" + to;
        String suffix = combineSuffixes(isCheck, isMate, remarks);
        return notation + suffix;
    }

    private String convertCastle(Castle cs, Color side, BoardState board, List<Remark> remarks,
                                 boolean isCheck, boolean isMate) {
        boolean queenside = "Queenside".equals(cs.getSide());
        String base = queenside? "O-O-O" : "O-O";
        String suffix = combineSuffixes(isCheck, isMate, remarks);
        return base + suffix;
    }

    private String convertEnPassant(EnPassant ep, Color side, BoardState board, List<Remark> remarks,
                                    boolean isCheck, boolean isMate) {
        Capture cp = ep.getCapture();
        Move base = cp.getMove();
        String from = base.getFrom().getSquare();
        String to   = base.getTo().getSquare();
        String fileFrom = from.substring(0,1);
        String baseNotation = fileFrom + "x" + to + " e.p.";
        String suffix = combineSuffixes(isCheck, isMate, remarks);
        return baseNotation + suffix;
    }

    private String convertPromotion(Promotion pm, Color side, BoardState board, List<Remark> remarks,
                                    boolean isCheck, boolean isMate) {
        DSLMove inner = pm.getMove();
        Move base = (inner instanceof Move)? (Move)inner : ((Capture)inner).getMove();
        boolean isCap = (inner instanceof Capture);
        String from = base.getFrom().getSquare();
        String to   = base.getTo().getSquare();
        Piece promoted = pm.getPiece();
        Piece p = base.getPiece();

        // If it's a capturing promotion, we typically do something like exd8=Q
        String letter = "";
        if(p==Piece.PAWN && isCap) {
            letter = from.substring(0,1)+"x";
        } else if(p!=Piece.PAWN && isCap) {
            letter = pieceLetter(p) + disambiguate(board, from, to, side, p) + "x";
        } else if(p!=Piece.PAWN && !isCap) {
            letter = pieceLetter(p) + disambiguate(board, from, to, side, p);
        }
        String pieceLetter = pieceLetter(promoted);
        String baseNotation = letter + to + "=" + pieceLetter;

        String suffix = combineSuffixes(isCheck, isMate, remarks);
        return baseNotation + suffix;
    }

    // ----------------------------------------------------------------
    // 2) Concise DSL
    // ----------------------------------------------------------------

    private String toConcise(DSLMove move, Color side, BoardState board) {
        StringBuilder sb = new StringBuilder();
        if(move instanceof Dummy) {
            sb.append("dummy");
            return sb.toString();
        }

        if(move instanceof Move) {
            Move mv = (Move) move;
            sb.append(pieceNameShort(mv.getPiece()))
              .append("(").append(mv.getFrom().getSquare())
              .append("->").append(mv.getTo().getSquare())
              .append(")");
        } else if(move instanceof Capture) {
            Capture cap = (Capture) move;
            Move base   = cap.getMove();
            sb.append(pieceNameShort(base.getPiece()))
              .append("(").append(base.getFrom().getSquare())
              .append("->").append(base.getTo().getSquare())
              .append(") Capture(").append(cap.getCapture()).append(")");
        } else if(move instanceof EnPassant) {
            EnPassant ep = (EnPassant) move;
            Capture cp   = ep.getCapture();
            Move base    = cp.getMove();
            sb.append(pieceNameShort(base.getPiece()))
              .append("(").append(base.getFrom().getSquare())
              .append("->").append(base.getTo().getSquare())
              .append(") Capture(").append(cp.getCapture()).append(")")
              .append(" on ").append(ep.getSquare().getSquare());
        } else if(move instanceof Promotion) {
            Promotion pm = (Promotion) move;
            DSLMove inner = pm.getMove();
            if(inner instanceof Move) {
                Move mv = (Move) inner;
                sb.append(pieceNameShort(mv.getPiece()))
                  .append("(").append(mv.getFrom().getSquare())
                  .append("->").append(mv.getTo().getSquare())
                  .append(")");
            } else {
                // it's a capture
                Capture cp = (Capture)inner;
                Move base = cp.getMove();
                sb.append(pieceNameShort(base.getPiece()))
                  .append("(").append(base.getFrom().getSquare())
                  .append("->").append(base.getTo().getSquare())
                  .append(") Capture(").append(cp.getCapture()).append(")");
            }
            sb.append(" Promotion(").append(pm.getPiece()).append(")");
        } else if(move instanceof Castle) {
            Castle cs = (Castle) move;
            sb.append("Castle(").append(cs.getSide()).append(")");
        }

        // Append any remarks in parentheses, e.g. "(Check), (Good)"
        List<Remark> remarks = getRemarks(move);
        for(Remark r: remarks) {
            sb.append(" (").append(r).append(")");
        }
        return sb.toString();
    }

    // a short name for pieces
    private String pieceNameShort(Piece p) {
        switch(p) {
            case KING:   return "King";
            case QUEEN:  return "Queen";
            case ROOK:   return "Rook";
            case BISHOP: return "Bishop";
            case KNIGHT: return "Knight";
            case PAWN:   return "Pawn";
        }
        return p.name();
    }

    // ----------------------------------------------------------------
    // 3) Verbose DSL
    // ----------------------------------------------------------------

    private String toVerbose(DSLMove move, Color side, BoardState board) {
        StringBuilder sb = new StringBuilder();
        if(move instanceof Dummy) {
            sb.append("dummy");
            return sb.toString();
        }

        if(move instanceof Move) {
            Move mv = (Move) move;
            sb.append(pieceNameLong(mv.getPiece()))
              .append(" from ")
              .append(mv.getFrom().getSquare())
              .append(" to ")
              .append(mv.getTo().getSquare());
        } else if(move instanceof Capture) {
            Capture cap = (Capture) move;
            Move base   = cap.getMove();
            sb.append(pieceNameLong(base.getPiece()))
              .append(" from ")
              .append(base.getFrom().getSquare())
              .append(" to ")
              .append(base.getTo().getSquare())
              .append(" and captures ")
              .append(cap.getCapture());
        } else if(move instanceof EnPassant) {
            EnPassant ep = (EnPassant) move;
            Capture cp   = ep.getCapture();
            Move base    = cp.getMove();
            sb.append(pieceNameLong(base.getPiece()))
              .append(" from ")
              .append(base.getFrom().getSquare())
              .append(" to ")
              .append(base.getTo().getSquare())
              .append(" and captures ")
              .append(cp.getCapture())
              .append(" on ")
              .append(ep.getSquare().getSquare());
        } else if(move instanceof Promotion) {
            Promotion pm = (Promotion) move;
            DSLMove inner = pm.getMove();
            if(inner instanceof Move) {
                Move mv = (Move)inner;
                sb.append(pieceNameLong(mv.getPiece()))
                  .append(" from ")
                  .append(mv.getFrom().getSquare())
                  .append(" to ")
                  .append(mv.getTo().getSquare());
            } else {
                // a capture
                Capture cp = (Capture)inner;
                Move base = cp.getMove();
                sb.append(pieceNameLong(base.getPiece()))
                  .append(" from ")
                  .append(base.getFrom().getSquare())
                  .append(" to ")
                  .append(base.getTo().getSquare())
                  .append(" and captures ")
                  .append(cp.getCapture());
            }
            sb.append(" and promotes to ").append(pm.getPiece());
        } else if(move instanceof Castle) {
            Castle cs = (Castle) move;
            sb.append("castles on the ").append(cs.getSide());
        }

        // Append remarks
        List<Remark> remarks = getRemarks(move);
        for(Remark r: remarks) {
            sb.append(" (").append(r).append(")");
        }
        return sb.toString();
    }

    // A more spelled-out name
    private String pieceNameLong(Piece p) {
        // could be same as pieceNameShort, but let's keep an example
        switch(p) {
            case KING:   return "King";
            case QUEEN:  return "Queen";
            case ROOK:   return "Rook";
            case BISHOP: return "Bishop";
            case KNIGHT: return "Knight";
            case PAWN:   return "Pawn";
        }
        return p.name();
    }

    // ----------------------------------------------------------------
    // 4) applyMove as in your snippet
    // ----------------------------------------------------------------

    private void applyMove(BoardState b, DSLMove m, Color side) {
        if (m instanceof Move) {
            Move mo = (Move) m;
            b.movePiece(mo.getFrom().getSquare(), mo.getTo().getSquare());
        } else if (m instanceof Capture) {
            Move base = ((Capture) m).getMove();
            b.movePiece(base.getFrom().getSquare(), base.getTo().getSquare());
        } else if (m instanceof EnPassant) {
            EnPassant ep = (EnPassant) m;
            Move base = ep.getCapture().getMove();
            b.movePiece(base.getFrom().getSquare(), base.getTo().getSquare());
            b.remove(ep.getSquare().getSquare());
        } else if (m instanceof Promotion) {
            Promotion pm = (Promotion) m;
            DSLMove base = pm.getMove();
            Move mo = (base instanceof Move)? (Move) base : ((Capture) base).getMove();
            b.movePiece(mo.getFrom().getSquare(), mo.getTo().getSquare());
            b.remove(mo.getTo().getSquare());
            b.place(mo.getTo().getSquare(), side, pm.getPiece());
        } else if (m instanceof Castle) {
            Castle cs = (Castle) m;
            boolean kingside = "Kingside".equals(cs.getSide());
            if (side == Color.WHITE) {
                if (kingside) {
                    b.remove("e1");
                    b.remove("h1");
                    b.place("g1", Color.WHITE, Piece.KING);
                    b.place("f1", Color.WHITE, Piece.ROOK);
                } else {
                    b.remove("e1");
                    b.remove("a1");
                    b.place("c1", Color.WHITE, Piece.KING);
                    b.place("d1", Color.WHITE, Piece.ROOK);
                }
            } else {
                if (kingside) {
                    b.remove("e8");
                    b.remove("h8");
                    b.place("g8", Color.BLACK, Piece.KING);
                    b.place("f8", Color.BLACK, Piece.ROOK);
                } else {
                    b.remove("e8");
                    b.remove("a8");
                    b.place("c8", Color.BLACK, Piece.KING);
                    b.place("d8", Color.BLACK, Piece.ROOK);
                }
            }
        }
    }

    // ----------------------------------------------------------------
    // 5) renderConclusion from your snippet + a 'score' line
    // ----------------------------------------------------------------

    private String renderConclusion(Conclusion c, Game game) {
        return renderMethod(c, game) + renderResult(c, game);
    }

    private String renderMethod(Conclusion c, Game game) {
        if(c.getMethod()==null) return "";
        Method m = c.getMethod();
        if(m.getWin()!=null) {
            Win w = m.getWin();
            if(w.getMate()!=null) {
                // checkmate
                Checkmate mate = w.getMate();
                PlayerOrColor p1 = mate.getPlayer1();
                PlayerOrColor p2 = mate.getPlayer2();
                if(p1.getPlayer()!=null && p2.getPlayer()!=null) {
                    return p1.getPlayer().getColor()+" checkmated "
                         + p2.getPlayer().getColor() + ".\n";
                } else if(p1.getPlayer()!=null) {
                    Color c1 = p1.getPlayer().getColor();
                    return c1 + " checkmated " + opposite(c1) + ".\n";
                } else if(p2.getPlayer()!=null) {
                    Color c2 = p2.getPlayer().getColor();
                    return opposite(c2) + " checkmated " + c2 + ".\n";
                } else {
                    return p1.getColor() + " checkmated " + p2.getColor() + ".\n";
                }
            }
            if(w.getTime()!=null) {
                TimeUp t = w.getTime();
                PlayerOrColor pl = t.getPlayer();
                if(pl.getPlayer()!=null) {
                    return pl.getPlayer().getColor()+" ran out of time.\n";
                } else {
                    return pl.getColor()+" ran out of time.\n";
                }
            }
            if(w.getResign()!=null) {
                Resign r = w.getResign();
                PlayerOrColor pl = r.getPlayer();
                if(pl.getPlayer()!=null) {
                    return pl.getPlayer().getColor()+" resigned.\n";
                } else {
                    return pl.getColor()+" resigned.\n";
                }
            }
        } else if(m.getDraw()!=null) {
            Draw d = m.getDraw();
            PlayerOrColor p1 = d.getPlayer1();
            PlayerOrColor p2 = d.getPlayer2();
            String fluff = d.getResult().toString(); 
            if(p1.getPlayer()!=null && p2.getPlayer()!=null) {
                return p1.getPlayer().getColor()+" and "
                     + p2.getPlayer().getColor() + fluff + ".\n";
            } else if(p1.getPlayer()!=null) {
                Color c1 = p1.getPlayer().getColor();
                return c1 + " and " + opposite(c1) + fluff + ".\n";
            } else if(p2.getPlayer()!=null) {
                Color c2 = p2.getPlayer().getColor();
                return opposite(c2) + " and " + c2 + fluff + ".\n";
            } else {
                return p1.getColor()+" and "+ p2.getColor() + fluff + ".\n";
            }
        }
        return c.toString();
    }

    private String renderResult(Conclusion c, Game game) {
        if(c.getResult()==null) return "";
        Result r = c.getResult();
        if("draw".equalsIgnoreCase(r.toString())) {
            return "\n";
        }
        if(r.getPlayer()!=null) {
            return r.getPlayer().getName()+" ("+r.getPlayer().getColor()
                   + ") wins\n";
        }
        if(r.getColor()!=null && game.getPlayers()!=null && !game.getPlayers().isEmpty()) {
            for(Player p: game.getPlayers()) {
                if(p.getColor()==r.getColor()) {
                    return p.getName()+" ("+p.getColor()+") wins\n";
                }
            }
            return r.getColor()+" wins";
        }
        if(r.getColor()!=null) {
            return r.getColor()+ " wins\n";
        }
        return r.toString();
    }

    // If you want a simple extracted final score:
    //  White => "1-0"
    //  Black => "0-1"
    //  or if "draw", => "1/2-1/2"
    private String determineScore(Conclusion c) {
        if(c==null || c.getResult()==null) return "";
        Result r = c.getResult();
        if("draw".equalsIgnoreCase(r.toString())) {
            return "1/2-1/2";
        }
        if(r.getColor()!=null) {
            return (r.getColor()==Color.WHITE)? "1-0":"0-1";
        }
        if(r.getPlayer()!=null) {
            return (r.getPlayer().getColor()==Color.WHITE)? "1-0":"0-1";
        }
        return "";
    }

    // ----------------------------------------------------------------
    // 6) doGenerate that writes 3 files
    // ----------------------------------------------------------------

    @Override
    public void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        if (resource == null || resource.getContents().isEmpty()) return;
        if (!(resource.getContents().get(0) instanceof Model)) return;
        Model model = (Model) resource.getContents().get(0);
        Game game = model.getGame();
        if (game == null) return;

        // Build the initial board
        BoardState board = new BoardState();
        if (game.getInitial() != null && game.getInitial().getPositions() != null) {
            for (Placement pl : game.getInitial().getPositions().getPlacement()) {
                board.place(pl.getSquare().getSquare(), pl.getPiece().getColor(), pl.getPiece().getKind());
            }
        } else {
            board.initFreshBoard();
        }

        // We'll build separate outputs:
        StringBuilder sbAlg     = new StringBuilder();
        StringBuilder sbConcise = new StringBuilder();
        StringBuilder sbVerbose = new StringBuilder();

        // Start with some headings
        sbAlg.append("=== Chess Algebraic Notation ===\n");
        sbConcise.append("=== Concise DSL Notation ===\n");
        sbVerbose.append("=== Verbose DSL Notation ===\n");

        // Title
        sbAlg.append("Game: ").append(game.getTitle()).append("\n");
        sbConcise.append("Game: ").append(game.getTitle()).append("\n");
        sbVerbose.append("Game: ").append(game.getTitle()).append("\n");

        // If players exist, show them
        if (!game.getPlayers().isEmpty()) {
            // e.g. "John(White) vs Mary(Black)"
            StringBuilder pLine = new StringBuilder("Players: ");
            for (int i=0; i<game.getPlayers().size(); i++) {
                Player p = game.getPlayers().get(i);
                pLine.append(p.getName()).append(" (").append(p.getColor()).append(")");
                if(i<game.getPlayers().size()-1) {
                    pLine.append(" vs ");
                }
            }
            sbAlg.append(pLine).append("\n");
            sbConcise.append(pLine).append("\n");
            sbVerbose.append(pLine).append("\n");
        }

        // Generate moves
        int moveIndex = 1;
        BoardState liveBoard = board; // we update this after each move
        for(MovePair mp: game.getMoves()) {
            // We'll handle skipping White's move if it says "..."
            boolean skipWhite = ("...".equals(mp.getWhiteMove()));

            // Write the move index
            sbAlg.append(moveIndex).append(". ");
            sbConcise.append(moveIndex).append(". ");
            sbVerbose.append(moveIndex).append(". ");

            if(skipWhite) {
                sbAlg.append("... ");
                sbConcise.append("... ");
                sbVerbose.append("... ");
                // Then do black move if present
                if(mp.getBlackMove()!=null && mp.getBlackMove().getMove()!=null) {
                    DSLMove black = mp.getBlackMove().getMove();
                    String noteA = toAlgebraic(black, Color.BLACK, liveBoard);
                    String noteC = toConcise(black, Color.BLACK, liveBoard);
                    String noteV = toVerbose(black, Color.BLACK, liveBoard);

                    sbAlg.append(noteA).append("\n");
                    sbConcise.append(noteC).append("\n");
                    sbVerbose.append(noteV).append("\n");

                    applyMove(liveBoard, black, Color.BLACK);
                } else {
                    sbAlg.append("\n");
                    sbConcise.append("\n");
                    sbVerbose.append("\n");
                }
            } else {
                // White
                if(mp.getWhiteMove()!=null && mp.getWhiteMove().getMove()!=null) {
                    DSLMove white = mp.getWhiteMove().getMove();
                    String noteA = toAlgebraic(white, Color.WHITE, liveBoard);
                    String noteC = toConcise(white, Color.WHITE, liveBoard);
                    String noteV = toVerbose(white, Color.WHITE, liveBoard);

                    sbAlg.append(noteA).append(" ");
                    sbConcise.append(noteC);
                    sbVerbose.append(noteV);

                    applyMove(liveBoard, white, Color.WHITE);
                }
                // Black
                if(mp.getBlackMove()!=null && mp.getBlackMove().getMove()!=null) {
                    sbConcise.append("; ");
                    sbVerbose.append(" and ");

                    DSLMove black = mp.getBlackMove().getMove();
                    String noteA = toAlgebraic(black, Color.BLACK, liveBoard);
                    String noteC = toConcise(black, Color.BLACK, liveBoard);
                    String noteV = toVerbose(black, Color.BLACK, liveBoard);

                    sbAlg.append(noteA).append(" ");
                    sbConcise.append(noteC).append(" ");
                    sbVerbose.append(noteV).append(" ");

                    applyMove(liveBoard, black, Color.BLACK);
                }
                sbAlg.append("\n");
                sbConcise.append("\n");
                sbVerbose.append("\n");
            }
            moveIndex++;
        }

        // Conclusion
        if(game.getConclusion()!=null) {
            String cText = renderConclusion(game.getConclusion(), game);
            sbAlg.append("Conclusion: ").append(cText).append("\n");
            sbConcise.append("Conclusion: ").append(cText).append("\n");
            sbVerbose.append("Conclusion: ").append(cText).append("\n");

            // Then show final score line if any
            String finalScore = determineScore(game.getConclusion());
            if(!finalScore.isEmpty()) {
                sbAlg.append("Score: ").append(finalScore).append("\n");
                sbConcise.append("Score: ").append(finalScore).append("\n");
                sbVerbose.append("Score: ").append(finalScore).append("\n");
            }
        }

        // Write out the three files
        String filename = resource.getURI().lastSegment();
        filename = filename.split("[.]")[0];
        fsa.generateFile(filename + "_algebraic.txt", sbAlg.toString());
        fsa.generateFile(filename + "_concise.txt",   sbConcise.toString());
        fsa.generateFile(filename + "_verbose.txt",   sbVerbose.toString());
    }
}
