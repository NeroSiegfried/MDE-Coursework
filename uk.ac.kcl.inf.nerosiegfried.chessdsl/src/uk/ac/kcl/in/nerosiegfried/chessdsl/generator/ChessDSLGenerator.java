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
        
        /**
         * Create a shallow copy of this board state.
         */
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
    
    // --- Helper Methods for Conversion & Validation ---

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

    // --- Methods for checking check and checkmate ---

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

    // --- Disambiguation method ---
    private String disambiguate(BoardState board, String from, String to, Color side, Piece p) {
        // For non-pawn pieces only. Pawns do not get a disambiguation in non-captures.
        if (p == Piece.PAWN)
            return "";
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
        if (samePieces.size() <= 1)
            return "";
        if (!from.isEmpty()) {
            String fromFile = from.substring(0, 1);
            String fromRank = from.substring(1);
            boolean sameFile = false;
            boolean sameRank = false;
            for (String loc : samePieces) {
                if (!loc.equals(from)) {
                    if (loc.charAt(0) == from.charAt(0))
                        sameFile = true;
                    if (loc.charAt(1) == from.charAt(1))
                        sameRank = true;
                }
            }
            if (!sameFile)
                return fromFile;
            else if (!sameRank)
                return fromRank;
            else
                return from;
        }
        return "";
    }

    // --- Methods for converting DSLMove into algebraic notation ---

    private List<Remark> getRemarks(DSLMove move) {
        if (move.eContainer() instanceof AnyMove) {
            AnyMove a = (AnyMove) move.eContainer();
            return a.getRemarks();
        }
        return new ArrayList<>();
    }

    private String pieceLetter(Piece p) {
        switch (p) {
            case KING:
                return "K";
            case QUEEN:
                return "Q";
            case ROOK:
                return "R";
            case BISHOP:
                return "B";
            case KNIGHT:
                return "N";
            default:
                return "";
        }
    }

    // --- Conversion of moves ---
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
    
    private String toConcise(DSLMove move, Color side, BoardState board) {
        //Stub
        return "";
    }
    private String toVerbose(DSLMove move, Color side, BoardState board) {
        //Stub
    	return "";
    }

    private String convertBasic(Move mv, Color side, BoardState board, List<Remark> remarks) {
        Piece p = mv.getPiece();
        String from = mv.getFrom().getSquare();
        String to = mv.getTo().getSquare();
        // For non-capture pawn moves, do not add any disambiguation.
        String disamb = (p == Piece.PAWN) ? "" : disambiguate(board, from, to, side, p);
        // Simulate move on a cloned board
        BoardState simBoard = board.cloneBoard();
        applyMove(simBoard, mv, side);
        boolean isCheck = isInCheck(simBoard, opposite(side));
        boolean isMate = isCheck && isCheckmate(simBoard, opposite(side));
        String letter = (p == Piece.PAWN) ? "" : pieceLetter(p);
        String baseNotation = letter + disamb + to;
        String suffix = combineSuffixes(isCheck, isMate, remarks);
        return baseNotation + suffix;
    }

    private String convertCapture(Capture cap, Color side, BoardState board, List<Remark> remarks) {
        Move base = cap.getMove();
        Piece p = base.getPiece();
        String from = base.getFrom().getSquare();
        String to = base.getTo().getSquare();
        BoardState simBoard = board.cloneBoard();
        applyMove(simBoard, cap, side);
        boolean isCheck = isInCheck(simBoard, opposite(side));
        boolean isMate = isCheck && isCheckmate(simBoard, opposite(side));
        String letter = (p == Piece.PAWN) ? from.substring(0, 1) : pieceLetter(p);
        String disamb = (p == Piece.PAWN) ? "" : disambiguate(board, from, to, side, p);
        String notation = letter + disamb + "x" + to;
        String suffix = combineSuffixes(isCheck, isMate, remarks);
        return notation + suffix;
    }

    private String convertCastle(Castle cs, Color side, BoardState board, List<Remark> remarks) {
        BoardState simBoard = board.cloneBoard();
        applyMove(simBoard, cs, side);
        boolean isCheck = isInCheck(simBoard, opposite(side));
        boolean isMate = isCheck && isCheckmate(simBoard, opposite(side));
        String base = cs.getSide().equals("Kingside") ? "O-O" : "O-O-O";
        String suffix = combineSuffixes(isCheck, isMate, remarks);
        return base + suffix;
    }

    private String convertEnPassant(EnPassant ep, Color side, BoardState board, List<Remark> remarks) {
        Capture cp = ep.getCapture();
        Move base = cp.getMove();
        String from = base.getFrom().getSquare();
        String to = base.getTo().getSquare();
        BoardState simBoard = board.cloneBoard();
        applyMove(simBoard, ep, side);
        boolean isCheck = isInCheck(simBoard, opposite(side));
        boolean isMate = isCheck && isCheckmate(simBoard, opposite(side));
        String fileFrom = from.substring(0, 1);
        String baseNotation = fileFrom + "x" + to + " e.p.";
        String suffix = combineSuffixes(isCheck, isMate, remarks);
        return baseNotation + suffix;
    }

    private String convertPromotion(Promotion pm, Color side, BoardState board, List<Remark> remarks) {
        DSLMove inner = pm.getMove();
        Move mv = (inner instanceof Move) ? (Move) inner : ((Capture) inner).getMove();
        boolean isCap = !(inner instanceof Move);
        String from = mv.getFrom().getSquare();
        String to = mv.getTo().getSquare();
        BoardState simBoard = board.cloneBoard();
        applyMove(simBoard, pm, side);
        boolean isCheck = isInCheck(simBoard, opposite(side));
        boolean isMate = isCheck && isCheckmate(simBoard, opposite(side));
        String pieceStr = pieceLetter(pm.getPiece());
        String filePrefix = "";
        if (mv.getPiece() == Piece.PAWN && isCap) {
            filePrefix = from.substring(0, 1);
        } else if (mv.getPiece() != Piece.PAWN) {
            filePrefix = pieceLetter(mv.getPiece());
        }
        String captureSym = isCap ? filePrefix + "x" : "";
        String baseNotation = captureSym + to + "=" + pieceStr;
        String suffix = combineSuffixes(isCheck, isMate, remarks);
        return baseNotation + suffix;
    }

    private String combineSuffixes(boolean isCheck, boolean isMate, List<Remark> remarks) {
        StringBuilder sb = new StringBuilder();
        if (isMate) {
            sb.append("#");
        } else if (isCheck) {
            sb.append("+");
        }
        boolean hasCheckmateRemark = remarks.contains(Remark.CHECKMATE);
        for (Remark r : remarks) {
            if (r == Remark.CHECK && (hasCheckmateRemark || isMate)) {
                continue;
            }
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

    // --- Conclusion Rendering ---
    private String renderConclusion(Conclusion c, Game game) {
        return renderMethod(c, game) + renderResult(c, game);
    }
    
    private String renderMethod(Conclusion c, Game game) {
    	//If no method inculded in the conclusion, return empty string
    	if (c.getMethod() == null)
    		return "";
    	//If there is a method assign it to m and iterate through all the types
    	Method m = c.getMethod();
    	if(m.getWin() != null) {
    		//
    		//In the case of a win
    		//
    		Win win = m.getWin();
    		if(win.getMate()!=null) {
    			//
    			//in the case of a checkmate
    			//
    			Checkmate mate = win.getMate();
    			PlayerOrColor player1 = mate.getPlayer1();
    			PlayerOrColor player2 = mate.getPlayer2();
    			if(player1.getPlayer() != null && player2.getPlayer() != null) {
    				//if both players are defined
    				return player1.getPlayer().getColor() + " checkmated " + player2.getPlayer().getColor() + ".\n";
    			}else if(player1.getPlayer() != null) {
    				//if only the winner is defined
    				Color color = player1.getPlayer().getColor();
    				return color + " checkmated " + opposite(color) + ".\n";
    			}else if(player2.getPlayer() != null) {
    				//if only the loser is defined
    				Color color = player2.getPlayer().getColor();
    				return opposite(color) + " checkmated " + color + ".\n";
    			}else {
    				//only colors are defined
    				return player1.getColor() + " checkmated " + player2.getColor() + ".\n";
    			}
    		}
    		if(win.getTime()!=null) {
    			//
    			//in the case of a time up
    			//
    			TimeUp time = win.getTime();
    			PlayerOrColor player = time.getPlayer();
    			Color color;
    			if(player.getPlayer() != null) {
    				color = player.getPlayer().getColor();
    				return color + " ran out of time.\n";
    			}
    			return player.getColor() + " ran out of time.\n";
    		}
    		if(win.getResign()!=null) {
    			//
    			//in the case of a forfeit
    			//
    			Resign time = win.getResign();
    			PlayerOrColor player = time.getPlayer();
    			Color color;
    			if(player.getPlayer() != null) {
    				color = player.getPlayer().getColor();
    				return color + " resigned.\n";
    			}
    			return player.getColor() + " resigned.\n";
    		}
    	}else if(m.getDraw() != null) {
    		Draw draw = m.getDraw();
    		PlayerOrColor player1 = draw.getPlayer1();
    		PlayerOrColor player2 = draw.getPlayer2();
    		String fluff = draw.getResult().toString();
    		if(player1.getPlayer() != null && player2.getPlayer() != null) {
				//if both players are defined
				return player1.getPlayer().getColor() + " and " + player2.getPlayer().getColor() + fluff + ".\n";
			}else if(player1.getPlayer() != null) {
				//if only the winner is defined
				Color color = player1.getPlayer().getColor();
				return color + " and " + opposite(color) + fluff + ".\n";
			}else if(player2.getPlayer() != null) {
				//if only the loser is defined
				Color color = player2.getPlayer().getColor();
				return opposite(color) + " and " + color + fluff + ".\n";
			}else {
				//only colors are defined
				return player1.getColor() + " and " + player2.getColor() + fluff + ".\n";
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
        	boolean isWhite = r.getColor().equals(Color.WHITE);
            return r.getPlayer().getName() + " (" + r.getPlayer().getColor() + ") wins\n" + (isWhite? "1-0" : "0-1");
        }
        if (r.getColor() != null && game.getPlayers() != null && !game.getPlayers().isEmpty()) {
            for (Player p : game.getPlayers()) {
                if (p.getColor() == r.getColor()) {
                	boolean isWhite = r.getColor().equals(Color.WHITE);
                    return p.getName() + " (" + p.getColor() + ") wins\n" + (isWhite ? "1-0" : "0-1");
                }
            }
            return r.getColor().toString() + " wins";
        }
        if (r.getColor() != null) {
        	boolean isWhite = r.getColor().equals(Color.WHITE);
            return r.getColor().toString() + " wins\n" + (isWhite ? "1-0" : "0-1");
        }
        return r.toString();
    }

    // --- Applying and (stub) Reverting Moves ---
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
            Move mo = (base instanceof Move) ? (Move) base : ((Capture) base).getMove();
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

    private void revertMove(BoardState b, DSLMove m, Color side, PieceInfo captured) {
        // Not implemented for demonstration.
    }

    // --- doGenerate ---
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

        StringBuilder sb = new StringBuilder();
        sb.append("=== Chess Algebraic Notation ===\n");
        // Include players after title
        sb.append("Game: ").append(game.getTitle());
        if (!game.getPlayers().isEmpty()) {
            sb.append(" (");
            for (int i = 0; i < game.getPlayers().size(); i++) {
                Player p = game.getPlayers().get(i);
                sb.append(p.getName()).append(" (").append(p.getColor()).append(")");
                if (i < game.getPlayers().size() - 1)
                    sb.append(" vs ");
            }
            sb.append(")");
        }
        sb.append("\n");
        
        StringBuilder sb2 = sb; //Concise DSL
        StringBuilder sb3 = sb; //Verbose DSL
        
        int moveIndex = 1;
        for (MovePair mp : game.getMoves()) {
            boolean skipWhite = "...".equals(mp.getWhiteMove());
            sb.append(moveIndex).append(". ");
            sb2.append(moveIndex).append(". ");
            sb3.append(moveIndex).append(". ");
            if (skipWhite) {
                if (mp.getBlackMove() != null && mp.getBlackMove().getMove() != null) {
                    DSLMove bmove = mp.getBlackMove().getMove();
                    String note = toAlgebraic(bmove, Color.BLACK, board);
                    String note2 = toConcise(bmove, Color.BLACK, board);
                    String note3 = toVerbose(bmove, Color.BLACK, board);
                    applyMove(board, bmove, Color.BLACK);
                    sb.append("... ").append(note).append("\n");
                    sb2.append("... ").append(note2).append("\n");
                    sb3.append("... ").append(note3).append("\n");
                }
            } else {
                if (mp.getWhiteMove() != null && mp.getWhiteMove().getMove() != null) {
                    DSLMove wmove = mp.getWhiteMove().getMove();
                    String note = toAlgebraic(wmove, Color.WHITE, board);
                    String note2 = toConcise(wmove, Color.WHITE, board);
                    String note3 = toVerbose(wmove, Color.WHITE, board);
                    applyMove(board, wmove, Color.WHITE);
                    sb.append(note).append(" ");
                    sb2.append(note2);
                    sb3.append(note3);
                }
                if (mp.getBlackMove() != null && mp.getBlackMove().getMove() != null) {
                	sb2.append("; ");
                	sb3.append(" and ");
                    DSLMove bmove = mp.getBlackMove().getMove();
                    String note = toAlgebraic(bmove, Color.BLACK, board);
                    String note2 = toConcise(bmove, Color.BLACK, board);
                    String note3 = toVerbose(bmove, Color.BLACK, board);
                    applyMove(board, bmove, Color.BLACK);
                    sb.append(note).append(" ");
                    sb2.append(note2).append(" ");
                    sb3.append(note3).append(" ");
                }
                sb.append("\n");
            }
            moveIndex++;
        }

        if (game.getConclusion() != null) {
            sb.append("Conclusion: ").append(renderConclusion(game.getConclusion(), game)).append("\n");
            sb2.append("Conclusion: ").append(renderConclusion(game.getConclusion(), game)).append("\n");
            sb3.append("Conclusion: ").append(renderConclusion(game.getConclusion(), game)).append("\n");
        }
        String filename = resource.getURI().lastSegment();
        filename = filename.split("[.]")[0];
        fsa.generateFile(filename + "_algebraic.txt", sb.toString());
        fsa.generateFile(filename + "_concise.txt", sb2.toString());
        fsa.generateFile(filename + "_verbose.txt", sb3.toString());
    }
    
    private Color opposite(Color c) {
        return (c==Color.WHITE) ? Color.BLACK : Color.WHITE;
    }
}
