package uk.ac.kcl.in.nerosiegfried.chessdsl.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.generator.IFileSystemAccess2;

import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.*;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Color;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Piece;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Remark;

public class ChessDSLGenerator extends AbstractGenerator {

    // ---------------------------
    // 1) Board Modeling
    // ---------------------------
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

        public PieceInfo getPieceAt(String sq) {
            return boardMap.get(sq);
        }

        public void removePiece(String sq) {
            boardMap.remove(sq);
        }

        /** Move from->to, capturing occupant if any, sets hasMoved=true. */
        public void movePiece(String from, String to) {
            PieceInfo pi = boardMap.remove(from);
            if (pi != null) {
                pi.hasMoved = true;
                boardMap.remove(to); // capture occupant if any
                boardMap.put(to, pi);
            }
        }
        
        // Create a shallow clone for simulation
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
    
    // ---------------------------
    // 2) Utility Methods
    // ---------------------------
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
        if (from.equals(to))
            return false;
        int c1 = from.charAt(0), r1 = from.charAt(1);
        int c2 = to.charAt(0), r2 = to.charAt(1);
        int dc = Integer.compare(c2, c1);
        int dr = Integer.compare(r2, r1);
        int x = c1 + dc, y = r1 + dr;
        while (x != c2 || y != r2) {
            String sq = "" + (char) x + (char) y;
            if (board.isOccupied(sq))
                return false;
            x += dc;
            y += dr;
        }
        return true;
    }
    
    // Minimal check & checkmate logic (same as before)
    private boolean isInCheck(BoardState board, Color side) {
        String kingSq = null;
        for (String sq : board.boardMap.keySet()) {
            PieceInfo pi = board.boardMap.get(sq);
            if (pi.color == side && pi.type == Piece.KING) {
                kingSq = sq;
                break;
            }
        }
        if (kingSq == null)
            return false;
        return anyEnemyCanCapture(board, side, kingSq);
    }
    
    private boolean anyEnemyCanCapture(BoardState board, Color side, String kingSq) {
        for (String sq : board.boardMap.keySet()) {
            PieceInfo pi = board.boardMap.get(sq);
            if (pi.color != side) {
                if (pi.type == Piece.KNIGHT) {
                    if (isKnightMove(sq, kingSq))
                        return true;
                } else if (pi.type == Piece.KING) {
                    if (isKingAdjacent(sq, kingSq))
                        return true;
                } else if (pi.type == Piece.PAWN) {
                    if (isPawnAttacking(pi.color, sq, kingSq))
                        return true;
                } else {
                    if (isMovePatternLegal(board, sq, kingSq, pi.type, pi.color, true)
                            && pathClear(board, sq, kingSq))
                        return true;
                }
            }
        }
        return false;
    }
    
    private boolean isKnightMove(String from, String to) {
        int c1 = from.charAt(0), r1 = from.charAt(1);
        int c2 = to.charAt(0), r2 = to.charAt(1);
        int dc = Math.abs(c2 - c1), dr = Math.abs(r2 - r1);
        return (dc == 2 && dr == 1) || (dc == 1 && dr == 2);
    }
    
    private boolean isKingAdjacent(String from, String to) {
        int c1 = from.charAt(0), r1 = from.charAt(1);
        int c2 = to.charAt(0), r2 = to.charAt(1);
        return (Math.abs(c2 - c1) <= 1 && Math.abs(r2 - r1) <= 1);
    }
    
    private boolean isPawnAttacking(Color color, String from, String to) {
        int fileDiff = Math.abs(to.charAt(0) - from.charAt(0));
        int rankDiff = (color == Color.WHITE) ? (to.charAt(1) - from.charAt(1))
                : (from.charAt(1) - to.charAt(1));
        return fileDiff == 1 && rankDiff == 1;
    }
    
    private boolean isCheckmate(BoardState board, Color side) {
        if (!isInCheck(board, side))
            return false;
        List<String> allSquares = new ArrayList<>();
        for (char file = 'a'; file <= 'h'; file++) {
            for (char rank = '1'; rank <= '8'; rank++) {
                allSquares.add("" + file + rank);
            }
        }
        for (String from : board.boardMap.keySet()) {
            PieceInfo pi = board.getPieceAt(from);
            if (pi.color == side) {
                for (String to : allSquares) {
                    if (from.equals(to))
                        continue;
                    if (board.isOccupied(to) && board.getPieceAt(to).color == side)
                        continue;
                    boolean isCap = (board.isOccupied(to) && board.getPieceAt(to).color != side);
                    if (isMovePatternLegal(board, from, to, pi.type, side, isCap)) {
                        BoardState sim = board.cloneBoard();
                        sim.movePiece(from, to);
                        if (!isInCheck(sim, side))
                            return false;
                    }
                }
            }
        }
        return true;
    }
    
    private boolean isMovePatternLegal(BoardState board, String from, String to, Piece p, Color side, boolean isCapture) {
        if (p == Piece.KNIGHT) {
            return isKnightMove(from, to);
        } else if (p == Piece.KING) {
            return isKingAdjacent(from, to);
        } else if (p == Piece.ROOK) {
            if (!sameFileOrRank(from, to))
                return false;
            return pathClear(board, from, to);
        } else if (p == Piece.BISHOP) {
            if (!isDiagonal(from, to))
                return false;
            return pathClear(board, from, to);
        } else if (p == Piece.QUEEN) {
            if (isDiagonal(from, to) || sameFileOrRank(from, to)) {
                return pathClear(board, from, to);
            }
            return false;
        } else if (p == Piece.PAWN) {
            int fFrom = from.charAt(0) - 'a';
            int rFrom = from.charAt(1) - '0';
            int fTo = to.charAt(0) - 'a';
            int rTo = to.charAt(1) - '0';
            int fileDiff = Math.abs(fTo - fFrom);
            int rankDiff = (side == Color.WHITE) ? (rTo - rFrom) : (rFrom - rTo);
            if (isCapture) {
                return fileDiff == 1 && rankDiff == 1;
            } else {
                if (fileDiff != 0)
                    return false;
                if (rankDiff == 1)
                    return true;
                if (rankDiff == 2 && ((side == Color.WHITE && rFrom == 2) || (side == Color.BLACK && rFrom == 7))) {
                    char interRank = (side == Color.WHITE) ? (char)(rFrom + 1 + '0') : (char)(rFrom - 1 + '0');
                    String midSq = "" + from.charAt(0) + interRank;
                    return !board.isOccupied(midSq);
                }
                return false;
            }
        }
        return false;
    }
    
    private String disambiguate(BoardState board, String from, String to, Color side, Piece p) {
        if (p == Piece.PAWN)
            return "";
        List<String> same = new ArrayList<>();
        for (String sq : board.boardMap.keySet()) {
            PieceInfo pi = board.getPieceAt(sq);
            if (pi.color == side && pi.type == p) {
                if (isMovePatternLegal(board, sq, to, p, side, true)
                        || isMovePatternLegal(board, sq, to, p, side, false)) {
                    same.add(sq);
                }
            }
        }
        if (same.size() <= 1)
            return "";
        boolean sameFile = false, sameRank = false;
        String fromFile = from.substring(0, 1);
        String fromRank = from.substring(1);
        for (String s : same) {
            if (!s.equals(from)) {
                if (s.charAt(0) == from.charAt(0))
                    sameFile = true;
                if (s.charAt(1) == from.charAt(1))
                    sameRank = true;
            }
        }
        if (!sameFile)
            return fromFile;
        if (!sameRank)
            return fromRank;
        return from;
    }
    
    // -------------------------------
    // 3) Algebraic Notation Generation
    // -------------------------------
    private List<Remark> getRemarks(DSLMove move) {
        if (move.eContainer() instanceof AnyMove) {
            return ((AnyMove) move.eContainer()).getRemarks();
        }
        return new ArrayList<>();
    }
    
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
    
    /**
     * UPDATED combineSuffixes method to also append any additional remark symbols.
     */
    private String combineSuffixes(boolean isCheck, boolean isMate, List<Remark> remarks) {
        StringBuilder sb = new StringBuilder();
        if (isMate) {
            sb.append("#");
        } else if (isCheck) {
            sb.append("+");
        }
        for (Remark r : remarks) {
            // Skip CHECK and CHECKMATE since already rendered by + or #
            if (r == Remark.CHECK || r == Remark.CHECKMATE) continue;
            sb.append(translateRemark(r));
        }
        return sb.toString();
    }
    
    private String translateRemark(Remark r) {
        switch (r) {
            case GOOD:
                return "!";
            case BAD:
                return "?";
            case EXCELLENT:
                return "!!";
            case RISKY:
                return "!?";
            case DUBIOUS:
                return "?!";
            default:
                return "";
        }
    }
    
    private String toAlgebraic(DSLMove move, Color side, BoardState board) {
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
        String to = mv.getTo().getSquare();
        String disamb = (p == Piece.PAWN) ? "" : disambiguate(board, from, to, side, p);
        String letter = (p == Piece.PAWN) ? "" : pieceLetter(p);
        String base = letter + disamb + to;
        String suffix = combineSuffixes(isCheck, isMate, remarks);
        return base + suffix;
    }
    
    private String convertCapture(Capture cap, Color side, BoardState board, List<Remark> remarks,
                                  boolean isCheck, boolean isMate) {
        Move base = cap.getMove();
        Piece p = base.getPiece();
        String from = base.getFrom().getSquare();
        String to = base.getTo().getSquare();
        String letter = (p == Piece.PAWN) ? from.substring(0, 1) : pieceLetter(p);
        String disamb = (p == Piece.PAWN) ? "" : disambiguate(board, from, to, side, p);
        String notation = letter + disamb + "x" + to;
        String suffix = combineSuffixes(isCheck, isMate, remarks);
        return notation + suffix;
    }
    
    private String convertCastle(Castle cs, Color side, BoardState board, List<Remark> remarks,
                                 boolean isCheck, boolean isMate) {
        boolean queenside = "Queenside".equals(cs.getSide());
        String base = queenside ? "O-O-O" : "O-O";
        String suffix = combineSuffixes(isCheck, isMate, remarks);
        return base + suffix;
    }
    
    private String convertEnPassant(EnPassant ep, Color side, BoardState board, List<Remark> remarks,
                                    boolean isCheck, boolean isMate) {
        Capture cp = ep.getCapture();
        Move base = cp.getMove();
        String from = base.getFrom().getSquare();
        String to = base.getTo().getSquare();
        String fileFrom = from.substring(0, 1);
        String baseNotation = fileFrom + "x" + to + " e.p.";
        String suffix = combineSuffixes(isCheck, isMate, remarks);
        return baseNotation + suffix;
    }
    
    private String convertPromotion(Promotion pm, Color side, BoardState board, List<Remark> remarks,
                                    boolean isCheck, boolean isMate) {
        DSLMove inner = pm.getMove();
        Move base = (inner instanceof Move) ? (Move) inner : ((Capture) inner).getMove();
        boolean isCap = (inner instanceof Capture);
        String from = base.getFrom().getSquare();
        String to = base.getTo().getSquare();
        Piece promoted = pm.getPiece();
        Piece p = base.getPiece();
        String letter = "";
        if (p == Piece.PAWN && isCap) {
            letter = from.substring(0, 1) + "x";
        } else if (p != Piece.PAWN && isCap) {
            letter = pieceLetter(p) + disambiguate(board, from, to, side, p) + "x";
        } else if (p != Piece.PAWN && !isCap) {
            letter = pieceLetter(p) + disambiguate(board, from, to, side, p);
        }
        String baseNotation = letter + to + "=" + pieceLetter(promoted);
        String suffix = combineSuffixes(isCheck, isMate, remarks);
        return baseNotation + suffix;
    }
    
    // -------------------------------
    // 4) Concise DSL Notation Generation
    // -------------------------------
    private String toConcise(DSLMove move, Color side, BoardState board) {
        StringBuilder sb = new StringBuilder();
        if (move instanceof Dummy) {
            sb.append("dummy");
            return sb.toString();
        }
    
        if (move instanceof Move) {
            Move mv = (Move) move;
            sb.append(pieceNameShort(mv.getPiece()))
              .append("(").append(mv.getFrom().getSquare())
              .append("->").append(mv.getTo().getSquare())
              .append(")");
        } else if (move instanceof Capture) {
            Capture cap = (Capture) move;
            Move base = cap.getMove();
            sb.append(pieceNameShort(base.getPiece()))
              .append("(").append(base.getFrom().getSquare())
              .append("->").append(base.getTo().getSquare())
              .append(") Captures(").append(cap.getCapture()).append(")");
        } else if (move instanceof EnPassant) {
            EnPassant ep = (EnPassant) move;
            Capture cp = (Capture) ep.getCapture();
            Move base = cp.getMove();
            sb.append(pieceNameShort(base.getPiece()))
              .append("(").append(base.getFrom().getSquare())
              .append("->").append(base.getTo().getSquare())
              .append(") Captures(").append(cp.getCapture()).append(")")
              .append(" on ").append(ep.getSquare().getSquare());
        } else if (move instanceof Promotion) {
            Promotion pm = (Promotion) move;
            DSLMove inner = pm.getMove();
            if (inner instanceof Move) {
                Move mv = (Move) inner;
                sb.append(pieceNameShort(mv.getPiece()))
                  .append("(").append(mv.getFrom().getSquare())
                  .append("->").append(mv.getTo().getSquare())
                  .append(")");
            } else {
                Capture cp = (Capture) inner;
                Move base = cp.getMove();
                sb.append(pieceNameShort(base.getPiece()))
                  .append("(").append(base.getFrom().getSquare())
                  .append("->").append(base.getTo().getSquare())
                  .append(") Captures(").append(cp.getCapture()).append(")");
            }
            sb.append(" Promotes(").append(pm.getPiece()).append(")");
        } else if (move instanceof Castle) {
            Castle cs = (Castle) move;
            sb.append("Castle(").append(cs.getSide()).append(")");
        }
    
        // Append remarks in full words in parentheses.
        List<Remark> remarks = getRemarks(move);
        for (Remark r : remarks) {
            sb.append(" (").append(r.name()).append(")");
        }
        return sb.toString();
    }
    
    private String pieceNameShort(Piece p) {
        switch (p) {
            case KING:   return "King";
            case QUEEN:  return "Queen";
            case ROOK:   return "Rook";
            case BISHOP: return "Bishop";
            case KNIGHT: return "Knight";
            case PAWN:   return "Pawn";
        }
        return p.name();
    }
    
    // -------------------------------
    // 5) Verbose DSL Notation Generation
    // -------------------------------
    private String toVerbose(DSLMove move, Color side, BoardState board) {
        StringBuilder sb = new StringBuilder();
        if (move instanceof Dummy) {
            sb.append("dummy");
            return sb.toString();
        }
    
        if (move instanceof Move) {
            Move mv = (Move) move;
            sb.append(pieceNameLong(mv.getPiece()))
              .append(" from ")
              .append(mv.getFrom().getSquare())
              .append(" to ")
              .append(mv.getTo().getSquare());
        } else if (move instanceof Capture) {
            Capture cap = (Capture) move;
            Move base = cap.getMove();
            sb.append(pieceNameLong(base.getPiece()))
              .append(" from ")
              .append(base.getFrom().getSquare())
              .append(" to ")
              .append(base.getTo().getSquare())
              .append(" and captures ")
              .append(cap.getCapture());
        } else if (move instanceof EnPassant) {
            EnPassant ep = (EnPassant) move;
            Capture cp = (Capture) ep.getCapture();
            Move base = cp.getMove();
            sb.append(pieceNameLong(base.getPiece()))
              .append(" from ")
              .append(base.getFrom().getSquare())
              .append(" to ")
              .append(base.getTo().getSquare())
              .append(" and captures ")
              .append(cp.getCapture())
              .append(" on ")
              .append(ep.getSquare().getSquare());
        } else if (move instanceof Promotion) {
            Promotion pm = (Promotion) move;
            DSLMove inner = pm.getMove();
            if (inner instanceof Move) {
                Move mv = (Move) inner;
                sb.append(pieceNameLong(mv.getPiece()))
                  .append(" from ")
                  .append(mv.getFrom().getSquare())
                  .append(" to ")
                  .append(mv.getTo().getSquare());
            } else {
                Capture cp = (Capture) inner;
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
        } else if (move instanceof Castle) {
            Castle cs = (Castle) move;
            sb.append("castles on the ").append(cs.getSide());
        }
    
        // Append remarks in full words in parentheses.
        List<Remark> remarks = getRemarks(move);
        for (Remark r : remarks) {
            sb.append(" (").append(r.name()).append(")");
        }
        return sb.toString();
    }
    
    private String pieceNameLong(Piece p) {
        switch (p) {
            case KING:   return "King";
            case QUEEN:  return "Queen";
            case ROOK:   return "Rook";
            case BISHOP: return "Bishop";
            case KNIGHT: return "Knight";
            case PAWN:   return "Pawn";
        }
        return p.name();
    }
    
    // -------------------------------
    // 6) Applying Moves
    // -------------------------------
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
            b.removePiece(ep.getSquare().getSquare());
        } else if (m instanceof Promotion) {
            Promotion pm = (Promotion) m;
            DSLMove base = pm.getMove();
            Move mo = (base instanceof Move) ? (Move) base : ((Capture) base).getMove();
            b.movePiece(mo.getFrom().getSquare(), mo.getTo().getSquare());
            b.removePiece(mo.getTo().getSquare());
            b.place(mo.getTo().getSquare(), side, pm.getPiece());
        } else if (m instanceof Castle) {
            Castle cs = (Castle) m;
            boolean kingside = "Kingside".equals(cs.getSide());
            if (side == Color.WHITE) {
                if (kingside) {
                    b.removePiece("e1");
                    b.removePiece("h1");
                    b.place("g1", Color.WHITE, Piece.KING);
                    b.place("f1", Color.WHITE, Piece.ROOK);
                } else {
                    b.removePiece("e1");
                    b.removePiece("a1");
                    b.place("c1", Color.WHITE, Piece.KING);
                    b.place("d1", Color.WHITE, Piece.ROOK);
                }
            } else {
                if (kingside) {
                    b.removePiece("e8");
                    b.removePiece("h8");
                    b.place("g8", Color.BLACK, Piece.KING);
                    b.place("f8", Color.BLACK, Piece.ROOK);
                } else {
                    b.removePiece("e8");
                    b.removePiece("a8");
                    b.place("c8", Color.BLACK, Piece.KING);
                    b.place("d8", Color.BLACK, Piece.ROOK);
                }
            }
        }
    }
    
    // -------------------------------
    // 7) SAN-to-DSL Conversion
    // -------------------------------
    private void transformSANMoveToDSL(AnyMove any, Color side, BoardState board) {
        SANMove san = any.getAlgebraicmove();
        String token = san.getToken();
        if (token == null || token.isEmpty()) {
            any.setMove(null);
            return;
        }
        if (token.startsWith("@"))
            token = token.substring(1);
        // Handle castling
        if (token.startsWith("O-O")) {
            Castle cs = ChessDSLFactory.eINSTANCE.createCastle();
            cs.setSide(token.startsWith("O-O-O") ? "Queenside" : "Kingside");
            any.setMove(cs);
            any.getRemarks().clear();
            String leftover = "";
            if (token.startsWith("O-O-O") && token.length() > 5)
                leftover = token.substring(5);
            else if (token.startsWith("O-O") && token.length() > 3)
                leftover = token.substring(3);
            leftover = leftover.trim();
            if (!leftover.isEmpty()) {
                String regex = "^([+#]+)?([!\\?]+)?$";
                Matcher m = Pattern.compile(regex).matcher(leftover);
                if (m.matches()) {
                    String checkMarkers = m.group(1);
                    String remarkChars = m.group(2);
                    if (checkMarkers != null) {
                        if (checkMarkers.contains("#"))
                            any.getRemarks().add(Remark.CHECKMATE);
                        else if (checkMarkers.contains("+"))
                            any.getRemarks().add(Remark.CHECK);
                    }
                    if (remarkChars != null) {
                        if (remarkChars.contains("!!"))
                            any.getRemarks().add(Remark.EXCELLENT);
                        else if (remarkChars.contains("!?"))
                            any.getRemarks().add(Remark.RISKY);
                        else if (remarkChars.contains("?!"))
                            any.getRemarks().add(Remark.DUBIOUS);
                        else if (remarkChars.contains("?"))
                            any.getRemarks().add(Remark.BAD);
                        else if (remarkChars.contains("!"))
                            any.getRemarks().add(Remark.GOOD);
                    }
                }
            }
            any.setAlgebraicmove(null);
            return;
        }
        // Regular SAN move regex:
        String regex = "^(?:(K|Q|R|B|N))?([a-h]|[1-8])?([a-h]|[1-8])?(x)?([a-h][1-8])(?:=(Q|R|B|N))?([+#]*)([!\\?]+)?$";
        Matcher matcher = Pattern.compile(regex).matcher(token);
        if (!matcher.matches()) {
            any.setMove(null);
            return;
        }
        String pieceLetter = matcher.group(1);
        String disamb1 = matcher.group(2);
        String disamb2 = matcher.group(3);
        boolean isCapture = (matcher.group(4) != null);
        String targetSq = matcher.group(5);
        String promotion = matcher.group(6);
        String checkMarkers = matcher.group(7);
        String remarksStr = matcher.group(8);
        Piece movingPiece = pieceFromSANLetter(pieceLetter);
        String disamb = "";
        if (disamb1 != null)
            disamb += disamb1;
        if (disamb2 != null)
            disamb += disamb2;
        List<String> candidates = new ArrayList<>();
        for (String sq : board.boardMap.keySet()) {
            PieceInfo pi = board.getPieceAt(sq);
            if (pi.color == side && pi.type == movingPiece) {
                if (isMovePatternLegal(board, sq, targetSq, movingPiece, side, isCapture))
                    candidates.add(sq);
            }
        }
        if (!disamb.isEmpty()) {
            List<String> filtered = new ArrayList<>();
            for (String cand : candidates) {
                boolean ok = true;
                for (char c : disamb.toCharArray()) {
                    if (Character.isLetter(c)) {
                        if (cand.charAt(0) != c) {
                            ok = false;
                            break;
                        }
                    } else if (Character.isDigit(c)) {
                        if (cand.charAt(1) != c) {
                            ok = false;
                            break;
                        }
                    }
                }
                if (ok)
                    filtered.add(cand);
            }
            candidates = filtered;
        }
        if (candidates.isEmpty()) {
            any.setMove(null);
            return;
        }
        String fromSquare = candidates.get(0);
        Move mv = ChessDSLFactory.eINSTANCE.createMove();
        mv.setPiece(movingPiece);
        Square fromSq = ChessDSLFactory.eINSTANCE.createSquare();
        fromSq.setSquare(fromSquare);
        Square toSq = ChessDSLFactory.eINSTANCE.createSquare();
        toSq.setSquare(targetSq);
        mv.setFrom(fromSq);
        mv.setTo(toSq);
        if (isCapture) {
            if (movingPiece == Piece.PAWN) {
                any.setMove(mv);
            } else {
                Capture cap = ChessDSLFactory.eINSTANCE.createCapture();
                cap.setMove(mv);
                any.setMove(cap);
            }
        } else {
            any.setMove(mv);
        }
        if (promotion != null) {
            Promotion prom = ChessDSLFactory.eINSTANCE.createPromotion();
            prom.setPiece(pieceFromSANLetter(promotion));
            prom.setMove(any.getMove());
            any.setMove(prom);
        }
        List<Remark> gleaned = new ArrayList<>();
        if (checkMarkers != null && !checkMarkers.isEmpty()) {
            if (checkMarkers.contains("#"))
                gleaned.add(Remark.CHECKMATE);
            else if (checkMarkers.contains("+"))
                gleaned.add(Remark.CHECK);
        }
        if (remarksStr != null && !remarksStr.isEmpty()) {
            if (remarksStr.contains("!!"))
                gleaned.add(Remark.EXCELLENT);
            else if (remarksStr.contains("!?"))
                gleaned.add(Remark.RISKY);
            else if (remarksStr.contains("?!"))
                gleaned.add(Remark.DUBIOUS);
            else if (remarksStr.contains("?"))
                gleaned.add(Remark.BAD);
            else if (remarksStr.contains("!"))
                gleaned.add(Remark.GOOD);
        }
        any.getRemarks().addAll(gleaned);
        any.setAlgebraicmove(null);
    }
    
    private Piece pieceFromSANLetter(String letter) {
        if (letter == null)
            return Piece.PAWN;
        switch (letter) {
            case "K":
                return Piece.KING;
            case "Q":
                return Piece.QUEEN;
            case "R":
                return Piece.ROOK;
            case "B":
                return Piece.BISHOP;
            case "N":
                return Piece.KNIGHT;
            default:
                throw new IllegalArgumentException("Unknown SAN letter: " + letter);
        }
    }
    
    // -------------------------------
    // 7) Build Last-Move Info (for en passant, etc.)
    // -------------------------------
    private static class LastMoveInfo {
        public Color color;
        public Piece piece;
        public String from;
        public String to;
        public boolean wasDoublePawnAdvance;
        public LastMoveInfo(Color c, Piece p, String f, String t, boolean d) {
            color = c; piece = p; from = f; to = t; wasDoublePawnAdvance = d;
        }
    }
    private LastMoveInfo buildLastMoveInfo(BoardState board, DSLMove move, Color side) {
        if (move instanceof Move) {
            Move bm = (Move) move;
            String from = bm.getFrom().getSquare();
            String to = bm.getTo().getSquare();
            Piece p = bm.getPiece();
            boolean doublePush = false;
            if (p == Piece.PAWN && Math.abs(to.charAt(1) - from.charAt(1)) == 2)
                doublePush = true;
            return new LastMoveInfo(side, p, from, to, doublePush);
        } else if (move instanceof Capture) {
            return buildLastMoveInfo(board, ((Capture) move).getMove(), side);
        } else if (move instanceof EnPassant) {
            return buildLastMoveInfo(board, ((EnPassant) move).getCapture().getMove(), side);
        } else if (move instanceof Promotion) {
            return buildLastMoveInfo(board, ((Promotion) move).getMove(), side);
        } else if (move instanceof Castle) {
            return new LastMoveInfo(side, Piece.KING, "", "", false);
        }
        return null;
    }
    
    private LastMoveInfo buildLastMoveInfoFromAny(AnyMove any, Color side, BoardState board) {
        if (any.getMove() != null)
            return buildLastMoveInfo(board, any.getMove(), side);
        return null;
    }
    
    // -------------------------------
    // 8) Conclusion and Score Rendering
    // -------------------------------
    private String renderConclusion(Conclusion c, Game game) {
        return renderMethod(c, game) + renderResult(c, game);
    }
    
    private String renderMethod(Conclusion c, Game game) {
        if (c.getMethod() == null)
            return "";
        Method m = c.getMethod();
        if (m.getWin() != null) {
            Win w = m.getWin();
            if (w.getMate() != null) {
                Checkmate mate = w.getMate();
                PlayerOrColor p1 = mate.getPlayer1();
                PlayerOrColor p2 = mate.getPlayer2();
                if (p1.getPlayer() != null && p2.getPlayer() != null) {
                    return p1.getPlayer().getColor() + " checkmated " + p2.getPlayer().getColor() + ".\n";
                } else if (p1.getPlayer() != null) {
                    Color c1 = p1.getPlayer().getColor();
                    return c1 + " checkmated " + opposite(c1) + ".\n";
                } else if (p2.getPlayer() != null) {
                    Color c2 = p2.getPlayer().getColor();
                    return opposite(c2) + " checkmated " + c2 + ".\n";
                } else {
                    return p1.getColor() + " checkmated " + p2.getColor() + ".\n";
                }
            }
            if (w.getTime() != null) {
                TimeUp t = w.getTime();
                PlayerOrColor pl = t.getPlayer();
                if (pl.getPlayer() != null) {
                    return pl.getPlayer().getColor() + " ran out of time.\n";
                } else {
                    return pl.getColor() + " ran out of time.\n";
                }
            }
            if (w.getResign() != null) {
                Resign r = w.getResign();
                PlayerOrColor pl = r.getPlayer();
                if (pl.getPlayer() != null) {
                    return pl.getPlayer().getColor() + " resigned.\n";
                } else {
                    return pl.getColor() + " resigned.\n";
                }
            }
        } else if (m.getDraw() != null) {
            Draw d = m.getDraw();
            PlayerOrColor p1 = d.getPlayer1();
            PlayerOrColor p2 = d.getPlayer2();
            String fluff = d.getResult().toString();
            if (p1.getPlayer() != null && p2.getPlayer() != null) {
                return p1.getPlayer().getColor() + " and " + p2.getPlayer().getColor() + fluff + ".\n";
            } else if (p1.getPlayer() != null) {
                Color c1 = p1.getPlayer().getColor();
                return c1 + " and " + opposite(c1) + fluff + ".\n";
            } else if (p2.getPlayer() != null) {
                Color c2 = p2.getPlayer().getColor();
                return opposite(c2) + " and " + c2 + fluff + ".\n";
            } else {
                return p1.getColor() + " and " + p2.getColor() + fluff + ".\n";
            }
        }
        return c.toString();
    }
    
    private String renderResult(Conclusion c, Game game) {
        if (c.getResult() == null)
            return "";
        Result r = c.getResult();
        if ("draw".equalsIgnoreCase(r.toString())) {
            return "1/2-1/2";
        }
        if (r.getPlayer() != null) {
            return (r.getPlayer().getColor() == Color.WHITE) ? "1-0" : "0-1";
        }
        if (r.getColor() != null) {
            return (r.getColor() == Color.WHITE) ? "1-0" : "0-1";
        }
        return "";
    }
    
    private String determineScore(Conclusion c) {
        if (c == null || c.getResult() == null)
            return "";
        Result r = c.getResult();
        if ("draw".equalsIgnoreCase(r.toString())) {
            return "1/2-1/2";
        }
        if (r.getColor() != null) {
            return (r.getColor() == Color.WHITE) ? "1-0" : "0-1";
        }
        if (r.getPlayer() != null) {
            return (r.getPlayer().getColor() == Color.WHITE) ? "1-0" : "0-1";
        }
        return "";
    }
    
    // -------------------------------
    // 9) doGenerate: Write Three Files
    // -------------------------------
    @Override
    public void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        if (resource == null || resource.getContents().isEmpty())
            return;
        if (!(resource.getContents().get(0) instanceof Model))
            return;
        Model model = (Model) resource.getContents().get(0);
        Game game = model.getGame();
        if (game == null)
            return;
    
        BoardState board = new BoardState();
        if (game.getInitial() != null && game.getInitial().getPositions() != null) {
            for (Placement pl : game.getInitial().getPositions().getPlacement()) {
                board.place(pl.getSquare().getSquare(), pl.getPiece().getColor(), pl.getPiece().getKind());
            }
        } else {
            board.initFreshBoard();
        }
    
        StringBuilder sbAlg = new StringBuilder();
        StringBuilder sbConcise = new StringBuilder();
        StringBuilder sbVerbose = new StringBuilder();
    
        sbAlg.append("=== Chess Algebraic Notation ===\n");
        sbConcise.append("=== Concise DSL Notation ===\n");
        sbVerbose.append("=== Verbose DSL Notation ===\n");
    
        sbAlg.append("Game: ").append(game.getTitle()).append("\n");
        sbConcise.append("Game: ").append(game.getTitle()).append("\n");
        sbVerbose.append("Game: ").append(game.getTitle()).append("\n");
    
        if (!game.getPlayers().isEmpty()) {
            StringBuilder pLine = new StringBuilder("Players: ");
            for (int i = 0; i < game.getPlayers().size(); i++) {
                Player p = game.getPlayers().get(i);
                pLine.append(p.getName()).append(" (").append(p.getColor()).append(")");
                if (i < game.getPlayers().size() - 1)
                    pLine.append(" vs ");
            }
            sbAlg.append(pLine).append("\n");
            sbConcise.append(pLine).append("\n");
            sbVerbose.append(pLine).append("\n");
        }
    
        int moveIndex = 1;
        BoardState liveBoard = board;
        for (MovePair mp : game.getMoves()) {
            sbAlg.append(moveIndex).append(". ");
            sbConcise.append(moveIndex).append(". ");
            sbVerbose.append(moveIndex).append(". ");
    
            // Process White move
            AnyMove whiteAny = mp.getWhiteMove();
            if (whiteAny != null) {
                if (whiteAny.getMove() == null && whiteAny.getAlgebraicmove() != null) {
                    transformSANMoveToDSL(whiteAny, Color.WHITE, liveBoard);
                }
                if (whiteAny.getMove() != null) {
                    DSLMove white = whiteAny.getMove();
                    String noteAlg = toAlgebraic(white, Color.WHITE, liveBoard);
                    String noteConcise = toConcise(white, Color.WHITE, liveBoard);
                    String noteVerbose = toVerbose(white, Color.WHITE, liveBoard);
                    sbAlg.append(noteAlg).append(" ");
                    sbConcise.append(noteConcise);
                    sbVerbose.append(noteVerbose);
                    applyMove(liveBoard, white, Color.WHITE);
                }
            } else {
                sbAlg.append("... ");
                sbConcise.append("... ");
                sbVerbose.append("... ");
            }
    
            // Process Black move
            AnyMove blackAny = mp.getBlackMove();
            if (blackAny != null) {
                sbConcise.append("; ");
                sbVerbose.append(" and ");
                if (blackAny.getMove() == null && blackAny.getAlgebraicmove() != null) {
                    transformSANMoveToDSL(blackAny, Color.BLACK, liveBoard);
                }
                if (blackAny.getMove() != null) {
                    DSLMove black = blackAny.getMove();
                    String noteAlg = toAlgebraic(black, Color.BLACK, liveBoard);
                    String noteConcise = toConcise(black, Color.BLACK, liveBoard);
                    String noteVerbose = toVerbose(black, Color.BLACK, liveBoard);
                    sbAlg.append(noteAlg).append(" ");
                    sbConcise.append(noteConcise).append(" ");
                    sbVerbose.append(noteVerbose).append(" ");
                    applyMove(liveBoard, black, Color.BLACK);
                }
            }
            sbAlg.append("\n");
            sbConcise.append("\n");
            sbVerbose.append("\n");
            moveIndex++;
        }
    
        if (game.getConclusion() != null) {
            String cText = renderConclusion(game.getConclusion(), game);
            sbAlg.append("Conclusion: ").append(cText).append("\n");
            sbConcise.append("Conclusion: ").append(cText).append("\n");
            sbVerbose.append("Conclusion: ").append(cText).append("\n");
    
            String finalScore = determineScore(game.getConclusion());
            if (!finalScore.isEmpty()) {
                sbAlg.append("Score: ").append(finalScore).append("\n");
                sbConcise.append("Score: ").append(finalScore).append("\n");
                sbVerbose.append("Score: ").append(finalScore).append("\n");
            }
        }
    
        String filename = resource.getURI().lastSegment().split("[.]")[0];
        fsa.generateFile(filename + "_algebraic.txt", sbAlg.toString());
        fsa.generateFile(filename + "_concise.txt", sbConcise.toString());
        fsa.generateFile(filename + "_verbose.txt", sbVerbose.toString());
    }
}
