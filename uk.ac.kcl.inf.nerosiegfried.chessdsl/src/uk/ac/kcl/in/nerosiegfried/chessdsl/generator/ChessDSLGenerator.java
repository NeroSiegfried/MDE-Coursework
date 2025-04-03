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

public class ChessDSLGenerator extends AbstractGenerator {

    // --- Nested classes for board modeling ---
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

    // -----------------------------------------------------------------
    //               Algebraic Notation Helpers
    // -----------------------------------------------------------------
    private boolean sameFileOrRank(String from, String to) {
        return (from.charAt(0) == to.charAt(0)) || (from.charAt(1) == to.charAt(1));
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

    private boolean isMovePatternLegal(BoardState board, String from, String to, Piece p, Color side, boolean isCapture) {
        if (p == Piece.KNIGHT) {
            int c1 = from.charAt(0), r1 = from.charAt(1);
            int c2 = to.charAt(0), r2 = to.charAt(1);
            int dc = Math.abs(c2 - c1), dr = Math.abs(r2 - r1);
            return (dc == 2 && dr == 1) || (dc == 1 && dr == 2);
        } else if (p == Piece.KING) {
            int c1 = from.charAt(0), r1 = from.charAt(1);
            int c2 = to.charAt(0), r2 = to.charAt(1);
            return (Math.abs(c2 - c1) <= 1) && (Math.abs(r2 - r1) <= 1);
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
            int rankDiff = (side == Color.WHITE) ? rTo - rFrom : rFrom - rTo;
            if (isCapture) {
                return fileDiff == 1 && rankDiff == 1;
            } else {
                if (fileDiff != 0)
                    return false;
                if (rankDiff == 1)
                    return true;
                if (rankDiff == 2 && ((side == Color.WHITE && rFrom == 2) || (side == Color.BLACK && rFrom == 7))) {
                    char intermediate = (side == Color.WHITE)
                            ? (char) ((rFrom + 1) + '0')
                            : (char) ((rFrom - 1) + '0');
                    String interSq = "" + from.charAt(0) + intermediate;
                    return !board.isOccupied(interSq);
                }
                return false;
            }
        }
        return true;
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
        return Math.abs(c2 - c1) <= 1 && Math.abs(r2 - r1) <= 1;
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

    private boolean isInCheck(BoardState board, Color side) {
        String kingSquare = null;
        for (String sq : board.boardMap.keySet()) {
            PieceInfo pi = board.boardMap.get(sq);
            if (pi.color == side && pi.type == Piece.KING) {
                kingSquare = sq;
                break;
            }
        }
        if (kingSquare == null)
            return false;
        return anyEnemyCanCapture(board, side, kingSquare);
    }

    private boolean anyEnemyCanCapture(BoardState board, Color side, String kingSq) {
        for (String sq : board.boardMap.keySet()) {
            PieceInfo enemy = board.boardMap.get(sq);
            if (enemy.color != side) {
                if (enemy.type == Piece.KNIGHT) {
                    if (isKnightMove(sq, kingSq))
                        return true;
                } else if (enemy.type == Piece.KING) {
                    if (isKingAdjacent(sq, kingSq))
                        return true;
                } else if (enemy.type == Piece.PAWN) {
                    if (isPawnAttacking(enemy.color, sq, kingSq))
                        return true;
                } else {
                    if (isMovePatternLegal(board, sq, kingSq, enemy.type, side, false) && pathClear(board, sq, kingSq))
                        return true;
                }
            }
        }
        return false;
    }

    private boolean isCheckmate(BoardState board, Color side) {
        if (!isInCheck(board, side))
            return false;
        for (String sq : board.boardMap.keySet()) {
            PieceInfo pi = board.boardMap.get(sq);
            if (pi.color == side) {
                for (String to : board.boardMap.keySet()) {
                    if (!sq.equals(to)) {
                        if (isMovePatternLegal(board, sq, to, pi.type, side, true)) {
                            PieceInfo occupant = board.get(sq);
                            PieceInfo existing = board.get(to);
                            if (existing == null || existing.color != side) {
                                BoardState sim = board.cloneBoard();
                                sim.remove(sq);
                                sim.remove(to);
                                pi.hasMoved = true;
                                sim.boardMap.put(to, pi);
                                if (!isInCheck(sim, side)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    // Disambiguation for algebraic
    private String disambiguate(BoardState board, String from, String to, Color side, Piece p) {
        if (p == Piece.PAWN) return "";
        List<String> samePieces = new ArrayList<>();
        for (String sq : board.boardMap.keySet()) {
            PieceInfo pi = board.boardMap.get(sq);
            if (pi.type == p && pi.color == side) {
                if (isMovePatternLegal(board, sq, to, p, side, true)
                    || isMovePatternLegal(board, sq, to, p, side, false)) {
                    samePieces.add(sq);
                }
            }
        }
        if (samePieces.size() <= 1) return "";
        // if more than 1 => figure out partial
        if (!from.isEmpty()) {
            String fromFile = from.substring(0, 1);
            String fromRank = from.substring(1);
            boolean sameFile = false;
            boolean sameRank = false;
            for (String loc : samePieces) {
                if (!loc.equals(from)) {
                    if (loc.charAt(0) == from.charAt(0)) sameFile = true;
                    if (loc.charAt(1) == from.charAt(1)) sameRank = true;
                }
            }
            if (!sameFile) return fromFile;
            else if (!sameRank) return fromRank;
            else return from; // fallback
        }
        return "";
    }

    private List<Remark> getRemarks(DSLMove move) {
        if (move.eContainer() instanceof AnyMove) {
            AnyMove a = (AnyMove) move.eContainer();
            return a.getRemarks();
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

    // Convert DSL -> Algebraic
    private String toAlgebraic(DSLMove move, Color side, BoardState board) {
        List<Remark> remarks = getRemarks(move);
        if (move instanceof Move) {
            return convertBasic((Move) move, side, board, remarks);
        } else if (move instanceof Capture) {
            return convertCapture((Capture) move, side, board, remarks);
        } else if (move instanceof Castle) {
            return convertCastle((Castle) move, side, board, remarks);
        } else if (move instanceof EnPassant) {
            return convertEnPassant((EnPassant) move, side, board, remarks);
        } else if (move instanceof Promotion) {
            return convertPromotion((Promotion) move, side, board, remarks);
        } else if (move instanceof Dummy) {
            return "dummy";
        }
        return "";
    }

    // Convert DSL -> Concise DSL
    //  e.g. Pawn(e2->e4), Knight(e3->g4), Pawn(e5->e6)Capture(Pawn), etc.
    private String toConcise(DSLMove move, Color side, BoardState board) {
        if (move instanceof Move) {
            return conciseBasic((Move) move);
        } else if (move instanceof Capture) {
            return conciseCapture((Capture) move);
        } else if (move instanceof Castle) {
            Castle cs = (Castle) move;
            return "Castle(" + cs.getSide() + ")";
        } else if (move instanceof EnPassant) {
            EnPassant ep = (EnPassant) move;
            // "Pawn(e5->f6) EnPassant on f5" or shorter
            return conciseEnPassant(ep);
        } else if (move instanceof Promotion) {
            return concisePromotion((Promotion) move);
        } else if (move instanceof Dummy) {
            return "dummy";
        }
        return "";
    }

    // Convert DSL -> Verbose DSL
    //  e.g. "Pawn from e2 to e4", "Knight from b1 to c3", "Pawn from e5 to f6 and captures Pawn", etc.
    private String toVerbose(DSLMove move, Color side, BoardState board) {
        if (move instanceof Move) {
            return verboseBasic((Move) move);
        } else if (move instanceof Capture) {
            return verboseCapture((Capture) move);
        } else if (move instanceof Castle) {
            Castle cs = (Castle) move;
            return "castles on the " + cs.getSide();
        } else if (move instanceof EnPassant) {
            EnPassant ep = (EnPassant) move;
            return verboseEnPassant(ep);
        } else if (move instanceof Promotion) {
            return verbosePromotion((Promotion) move);
        } else if (move instanceof Dummy) {
            return "dummy";
        }
        return "";
    }

    // ----------------------------------------------------------------
    //  Implementing the "Concise" helper
    // ----------------------------------------------------------------
    private String conciseBasic(Move mv) {
        // e.g. Pawn(e2->e4)
        String pieceStr = mv.getPiece().toString();   // e.g. Pawn, Knight...
        String from = mv.getFrom().getSquare();       // e2
        String to   = mv.getTo().getSquare();         // e4
        return pieceStr + "(" + from + "->" + to + ")";
    }

    private String conciseCapture(Capture cap) {
        // e.g. Pawn(e5->f6)Capture(Pawn)
        Move base = cap.getMove();
        String basic = conciseBasic(base); // e.g. Pawn(e5->f6)
        String victim = cap.getCapture().toString(); // e.g. "Pawn"
        return basic + "Capture(" + victim + ")";
    }

    private String conciseEnPassant(EnPassant ep) {
        // e.g. "Pawn(e5->f6)EnPassant on f5"
        Capture cap = ep.getCapture();
        String basic = conciseBasic(cap.getMove());
        String victimSq = ep.getSquare().getSquare();
        return basic + "EnPassant on " + victimSq;
    }

    private String concisePromotion(Promotion pm) {
        // e.g. "Pawn(e7->e8)Promotion(Queen)"
        DSLMove base = pm.getMove();
        String str = null;
        if (base instanceof Move) {
            str = conciseBasic((Move)base);
        } else {
            str = conciseCapture((Capture)base);
        }
        return str + "Promotion(" + pm.getPiece().toString() + ")";
    }

    // ----------------------------------------------------------------
    //  Implementing the "Verbose" helper
    // ----------------------------------------------------------------
    private String verboseBasic(Move mv) {
        // "Pawn from e2 to e4"
        String pieceStr = mv.getPiece().toString(); // e.g. "Pawn"
        String from = mv.getFrom().getSquare();     // "e2"
        String to   = mv.getTo().getSquare();       // "e4"
        return pieceStr + " from " + from + " to " + to;
    }

    private String verboseCapture(Capture cap) {
        // e.g. "Pawn from e5 to f6 and captures Pawn"
        Move base = cap.getMove();
        String pieceStr = base.getPiece().toString();
        String from = base.getFrom().getSquare();
        String to   = base.getTo().getSquare();
        String victim = cap.getCapture().toString();
        return pieceStr + " from " + from + " to " + to + " and captures " + victim;
    }

    private String verboseEnPassant(EnPassant ep) {
        // "Pawn from e5 to f6 and captures Pawn en passant on e5"
        Move base = ep.getCapture().getMove();
        String pieceStr = base.getPiece().toString();
        String from = base.getFrom().getSquare();
        String to   = base.getTo().getSquare();
        String victimSq = ep.getSquare().getSquare();
        return pieceStr + " from " + from + " to " + to 
               + " and captures en passant on " + victimSq;
    }

    private String verbosePromotion(Promotion pm) {
        // "Pawn from e7 to e8 Promotion(Queen)"
        DSLMove base = pm.getMove();
        String baseStr;
        if (base instanceof Move) {
            Move mv = (Move) base;
            baseStr = mv.getPiece().toString() + " from " + mv.getFrom().getSquare() 
                      + " to " + mv.getTo().getSquare();
        } else {
            Capture cap = (Capture) base;
            baseStr = cap.getMove().getPiece().toString() 
                      + " from " + cap.getMove().getFrom().getSquare() 
                      + " to " + cap.getMove().getTo().getSquare() 
                      + " and captures " + cap.getCapture().toString();
        }
        return baseStr + " Promotion(" + pm.getPiece().toString() + ")";
    }


    // ----------------------------------------------------------------
    //  Algebraic Implementations
    // ----------------------------------------------------------------
    private String convertBasic(Move mv, Color side, BoardState board, List<Remark> remarks) {
        Piece p = mv.getPiece();
        String from = mv.getFrom().getSquare();
        String to   = mv.getTo().getSquare();
        BoardState simBoard = board.cloneBoard();
        applyMove(simBoard, mv, side);
        boolean isCheck = isInCheck(simBoard, opposite(side));
        boolean isMate  = (isCheck && isCheckmate(simBoard, opposite(side)));
        String disamb = (p == Piece.PAWN) ? "" : disambiguate(board, from, to, side, p);
        String letter = (p == Piece.PAWN)? "" : pieceLetter(p);
        String baseNotation = letter + disamb + to;
        String suffix = combineSuffixes(isCheck, isMate, remarks);
        return baseNotation + suffix;
    }

    private String convertCapture(Capture cap, Color side, BoardState board, List<Remark> remarks) {
        Move base = cap.getMove();
        Piece p = base.getPiece();
        String from = base.getFrom().getSquare();
        String to   = base.getTo().getSquare();
        BoardState simBoard = board.cloneBoard();
        applyMove(simBoard, cap, side);
        boolean isCheck = isInCheck(simBoard, opposite(side));
        boolean isMate  = (isCheck && isCheckmate(simBoard, opposite(side)));
        String letter = (p == Piece.PAWN)? from.substring(0,1) : pieceLetter(p);
        String disamb = (p == Piece.PAWN)? "" : disambiguate(board, from, to, side, p);
        String baseNotation = letter + disamb + "x" + to;
        String suffix = combineSuffixes(isCheck, isMate, remarks);
        return baseNotation + suffix;
    }

    private String convertCastle(Castle cs, Color side, BoardState board, List<Remark> remarks) {
        BoardState simBoard = board.cloneBoard();
        applyMove(simBoard, cs, side);
        boolean isCheck = isInCheck(simBoard, opposite(side));
        boolean isMate  = (isCheck && isCheckmate(simBoard, opposite(side)));
        String baseNotation = cs.getSide().equals("Kingside")? "O-O" : "O-O-O";
        String suffix = combineSuffixes(isCheck, isMate, remarks);
        return baseNotation + suffix;
    }

    private String convertEnPassant(EnPassant ep, Color side, BoardState board, List<Remark> remarks) {
        Capture cp = ep.getCapture();
        Move base = cp.getMove();
        String from = base.getFrom().getSquare();
        String to   = base.getTo().getSquare();
        BoardState simBoard = board.cloneBoard();
        applyMove(simBoard, ep, side);
        boolean isCheck = isInCheck(simBoard, opposite(side));
        boolean isMate  = (isCheck && isCheckmate(simBoard, opposite(side)));
        // e.g. exd5 e.p.
        String fileFrom = from.substring(0,1);
        String suffix = combineSuffixes(isCheck, isMate, remarks);
        return fileFrom + "x" + to + " e.p." + suffix;
    }

    private String convertPromotion(Promotion pm, Color side, BoardState board, List<Remark> remarks) {
        DSLMove inner = pm.getMove();
        Move mv = (inner instanceof Move) ? (Move)inner : ((Capture)inner).getMove();
        BoardState simBoard = board.cloneBoard();
        applyMove(simBoard, pm, side);
        boolean isCheck = isInCheck(simBoard, opposite(side));
        boolean isMate  = (isCheck && isCheckmate(simBoard, opposite(side)));
        boolean isCap   = !(inner instanceof Move);
        String from = mv.getFrom().getSquare();
        String to   = mv.getTo().getSquare();
        String pieceStr = pieceLetter(pm.getPiece());
        String filePrefix = "";
        if (mv.getPiece()==Piece.PAWN && isCap) {
            filePrefix = from.substring(0,1);
        } else if (mv.getPiece()!=Piece.PAWN) {
            filePrefix = pieceLetter(mv.getPiece());
        }
        String baseNotation = (isCap? filePrefix + "x" : "") + to + "=" + pieceStr;
        String suffix = combineSuffixes(isCheck, isMate, remarks);
        return baseNotation + suffix;
    }

    private String combineSuffixes(boolean isCheck, boolean isMate, List<Remark> remarks) {
        StringBuilder sb = new StringBuilder();
        if (isMate) sb.append("#");
        else if (isCheck) sb.append("+");
        boolean hasCheckmateRemark = remarks.contains(Remark.CHECKMATE);
        for (Remark r : remarks) {
            if (r==Remark.CHECK && (hasCheckmateRemark || isMate)) {
                continue;
            }
            sb.append(translateRemark(r));
        }
        return sb.toString();
    }

    private String translateRemark(Remark r) {
        switch(r) {
        case GOOD:       return "!";
        case BAD:        return "?";
        case EXCELLENT:  return "!!";
        case RISKY:      return "!?";
        case DUBIOUS:    return "?!";
        default:         return "";
        }
    }

    //  Conclusion
    private String renderConclusion(Conclusion c, Game g) {
        return renderMethod(c, g) + renderResult(c, g);
    }
    private String renderMethod(Conclusion c, Game g) {
        if (c.getMethod()==null) return "";
        Method m = c.getMethod();
        if (m.getWin()!=null) {
            Win w = m.getWin();
            if(w.getMate()!=null) {
                Checkmate mate = w.getMate();
                PlayerOrColor p1 = mate.getPlayer1();
                PlayerOrColor p2 = mate.getPlayer2();
                return "... checkmated ...\n"; // short
            }
            if(w.getTime()!=null) {
                TimeUp t = w.getTime();
                return t.getPlayer().getColor() + " ran out of time.\n";
            }
            if(w.getResign()!=null) {
                Resign r = w.getResign();
                return r.getPlayer().getColor() + " resigned.\n";
            }
        } else if (m.getDraw()!=null) {
            // etc
            return "Game ended in a draw.\n";
        }
        return "";
    }
    private String renderResult(Conclusion c, Game g) {
        if (c.getResult()==null) return "";
        Result r = c.getResult();
        if ("draw".equalsIgnoreCase(r.toString())) return "1/2-1/2";
        // or handle color wins
        return "";
    }

    // ----------------------------------------------------------------
    //  Movement application logic
    // ----------------------------------------------------------------
    private void applyMove(BoardState b, DSLMove m, Color side) {
        if (m instanceof Move) {
            Move mo = (Move) m;
            b.movePiece(mo.getFrom().getSquare(), mo.getTo().getSquare());
        } else if (m instanceof Capture) {
            Move base = ((Capture)m).getMove();
            b.movePiece(base.getFrom().getSquare(), base.getTo().getSquare());
        } else if (m instanceof EnPassant) {
            EnPassant ep = (EnPassant) m;
            Move base = ep.getCapture().getMove();
            b.movePiece(base.getFrom().getSquare(), base.getTo().getSquare());
            b.remove(ep.getSquare().getSquare());
        } else if (m instanceof Promotion) {
            Promotion pm = (Promotion) m;
            DSLMove base = pm.getMove();
            Move mo = (base instanceof Move)? (Move)base : ((Capture)base).getMove();
            b.movePiece(mo.getFrom().getSquare(), mo.getTo().getSquare());
            b.remove(mo.getTo().getSquare());
            b.place(mo.getTo().getSquare(), side, pm.getPiece());
        } else if (m instanceof Castle) {
            Castle cs = (Castle)m;
            boolean kingside = "Kingside".equals(cs.getSide());
            if (side==Color.WHITE) {
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

    private Color opposite(Color c) {
        return (c==Color.WHITE)? Color.BLACK : Color.WHITE;
    }
    
    private String determineScore(Conclusion conclusion) {
        if (conclusion == null || conclusion.getResult() == null) {
            return "";
        }
        Result r = conclusion.getResult();
        // 1) If it's a draw:
        if ("draw".equalsIgnoreCase(r.toString())) {
            return "1/2-1/2";
        }
        // 2) If it's White or Black wins:
        //    ( if r.getColor() != null => we deduce white or black,
        //      or if r.getPlayer() != null => we deduce that player’s color )
        if (r.getColor() != null) {
            return (r.getColor() == Color.WHITE) ? "1-0" : "0-1";
        }
        if (r.getPlayer() != null) {
            // If e.g. r.getPlayer().getColor() == WHITE => 1-0
            return (r.getPlayer().getColor() == Color.WHITE) ? "1-0" : "0-1";
        }
        return "";
    }

    // ----------------------------------------------------------------
    //  doGenerate => produce three files
    // ----------------------------------------------------------------
    @Override
    public void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        if (resource == null || resource.getContents().isEmpty()) return;
        if (!(resource.getContents().get(0) instanceof Model)) return;

        Model model = (Model) resource.getContents().get(0);
        Game game = model.getGame();
        if (game == null) return;

        // Three separate buffers
        StringBuilder algebraicSB = new StringBuilder();
        StringBuilder conciseSB   = new StringBuilder();
        StringBuilder verboseSB   = new StringBuilder();

        // Initialize board
        BoardState board = new BoardState();
        if (game.getInitial()!=null && game.getInitial().getPositions()!=null) {
            for(Placement pl : game.getInitial().getPositions().getPlacement()) {
                board.place(pl.getSquare().getSquare(), 
                            pl.getPiece().getColor(), 
                            pl.getPiece().getKind());
            }
        } else {
            board.initFreshBoard();
        }

        // Headers
        algebraicSB.append("=== Chess Algebraic Notation ===\n");
        conciseSB.append("=== Chess DSL (Concise) Notation ===\n");
        verboseSB.append("=== Chess DSL (Verbose) Notation ===\n");

        // Title line
        algebraicSB.append("Game: ").append(game.getTitle()).append("\n");
        conciseSB.append("Game: ").append(game.getTitle()).append("\n");
        verboseSB.append("Game: ").append(game.getTitle()).append("\n");

        // If players
        if (!game.getPlayers().isEmpty()) {
            // e.g. "(Alice (White) vs Bob (Black))"
            StringBuilder playersLine = new StringBuilder("Players: ");
            for (int i=0; i<game.getPlayers().size(); i++) {
                Player p = game.getPlayers().get(i);
                playersLine.append(p.getName())
                           .append(" (")
                           .append(p.getColor())
                           .append(")");
                if (i<game.getPlayers().size()-1)
                    playersLine.append(" vs ");
            }
            playersLine.append("\n");
            algebraicSB.append(playersLine);
            conciseSB.append(playersLine);
            verboseSB.append(playersLine);
        }

        int moveIndex=1;
        for (MovePair mp : game.getMoves()) {
            // If "..." => black starts
            boolean skipWhite = "...".equals(mp.getWhiteMove());
            // Print moveIndex
            algebraicSB.append(moveIndex).append(". ");
            conciseSB.append(moveIndex).append(". ");
            verboseSB.append(moveIndex).append(". ");

            if (skipWhite) {
                // black only
                if (mp.getBlackMove() != null && mp.getBlackMove().getMove() != null) {
                    DSLMove blackMove = mp.getBlackMove().getMove();
                    // Algebraic
                    String algText = toAlgebraic(blackMove, Color.BLACK, board);
                    // Concise
                    String conText = toConcise(blackMove, Color.BLACK, board);
                    // Verbose
                    String verText = toVerbose(blackMove, Color.BLACK, board);

                    // Update board
                    applyMove(board, blackMove, Color.BLACK);

                    algebraicSB.append("... ").append(algText).append("\n");
                    conciseSB.append("... ").append(conText).append("\n");
                    verboseSB.append("... ").append(verText).append("\n");
                }
            } else {
                // White first
                if (mp.getWhiteMove()!=null && mp.getWhiteMove().getMove()!=null) {
                    DSLMove whiteMove = mp.getWhiteMove().getMove();
                    String a = toAlgebraic(whiteMove, Color.WHITE, board);
                    String c = toConcise(whiteMove, Color.WHITE, board);
                    String v = toVerbose(whiteMove, Color.WHITE, board);

                    applyMove(board, whiteMove, Color.WHITE);

                    algebraicSB.append(a).append(" ");
                    conciseSB.append(c).append(" ");
                    verboseSB.append(v).append(" ");
                }
                // Then black
                if (mp.getBlackMove()!=null && mp.getBlackMove().getMove()!=null) {
                    DSLMove blackMove = mp.getBlackMove().getMove();
                    String a = toAlgebraic(blackMove, Color.BLACK, board);
                    String c = toConcise(blackMove, Color.BLACK, board);
                    String v = toVerbose(blackMove, Color.BLACK, board);

                    applyMove(board, blackMove, Color.BLACK);

                    // typically we might put them on same line
                    // or new line
                    algebraicSB.append(a).append("\n");
                    conciseSB.append("; ").append(c).append("\n");
                    verboseSB.append("and ").append(v).append("\n");
                } else {
                    // no black move => just newline
                    algebraicSB.append("\n");
                    conciseSB.append("\n");
                    verboseSB.append("\n");
                }
            }
            moveIndex++;
        }

        // If there's a conclusion, render it
        if (game.getConclusion()!=null) {
            String concTxt = renderConclusion(game.getConclusion(), game);
            algebraicSB.append("Conclusion: ").append(concTxt).append("\n");
            conciseSB.append("Conclusion: ").append(concTxt).append("\n");
            verboseSB.append("Conclusion: ").append(concTxt).append("\n");
        }
        
        // Now add the final score line
        String finalScore = determineScore(game.getConclusion());
        if (!finalScore.isEmpty()) {
            algebraicSB.append("Score: ").append(finalScore).append("\n");
            conciseSB.append("Score: ").append(finalScore).append("\n");
            verboseSB.append("Score: ").append(finalScore).append("\n");
        }

        // Derive filename
        String filename = resource.getURI().lastSegment();
        if (filename.contains(".")) {
            filename = filename.substring(0, filename.lastIndexOf('.'));
        }

        // Write out the 3 files
        fsa.generateFile(filename + "_algebraic.txt", algebraicSB.toString());
        fsa.generateFile(filename + "_concise.txt",   conciseSB.toString());
        fsa.generateFile(filename + "_verbose.txt",   verboseSB.toString());
    }
}
