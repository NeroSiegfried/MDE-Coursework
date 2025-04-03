/*
 * generated by Xtext 2.37.0
 */
package uk.ac.kcl.in.nerosiegfried.chessdsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.AnyMove;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Capture;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Castle;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Checkmate;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.ChessDSLPackage;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Conclusion;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.CustomPiece;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.CustomPositions;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Draw;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Dummy;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.EnPassant;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Game;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.InitialState;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Method;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Model;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Move;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.MovePair;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Placement;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Player;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.PlayerOrColor;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Promotion;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Resign;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Result;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.SANMove;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Square;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.TimeUp;
import uk.ac.kcl.in.nerosiegfried.chessdsl.chessDSL.Win;
import uk.ac.kcl.in.nerosiegfried.chessdsl.services.ChessDSLGrammarAccess;

@SuppressWarnings("all")
public class ChessDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ChessDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ChessDSLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ChessDSLPackage.ANY_MOVE:
				sequence_AnyMove(context, (AnyMove) semanticObject); 
				return; 
			case ChessDSLPackage.CAPTURE:
				sequence_Capture(context, (Capture) semanticObject); 
				return; 
			case ChessDSLPackage.CASTLE:
				sequence_Castle(context, (Castle) semanticObject); 
				return; 
			case ChessDSLPackage.CHECKMATE:
				sequence_Checkmate(context, (Checkmate) semanticObject); 
				return; 
			case ChessDSLPackage.CONCLUSION:
				sequence_Conclusion(context, (Conclusion) semanticObject); 
				return; 
			case ChessDSLPackage.CUSTOM_PIECE:
				sequence_CustomPiece(context, (CustomPiece) semanticObject); 
				return; 
			case ChessDSLPackage.CUSTOM_POSITIONS:
				sequence_CustomPositions(context, (CustomPositions) semanticObject); 
				return; 
			case ChessDSLPackage.DRAW:
				sequence_Draw(context, (Draw) semanticObject); 
				return; 
			case ChessDSLPackage.DUMMY:
				sequence_Dummy(context, (Dummy) semanticObject); 
				return; 
			case ChessDSLPackage.EN_PASSANT:
				sequence_EnPassant(context, (EnPassant) semanticObject); 
				return; 
			case ChessDSLPackage.GAME:
				sequence_Game(context, (Game) semanticObject); 
				return; 
			case ChessDSLPackage.INITIAL_STATE:
				sequence_InitialState(context, (InitialState) semanticObject); 
				return; 
			case ChessDSLPackage.METHOD:
				sequence_Method(context, (Method) semanticObject); 
				return; 
			case ChessDSLPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case ChessDSLPackage.MOVE:
				sequence_Move(context, (Move) semanticObject); 
				return; 
			case ChessDSLPackage.MOVE_PAIR:
				sequence_MovePair(context, (MovePair) semanticObject); 
				return; 
			case ChessDSLPackage.PLACEMENT:
				sequence_Placement(context, (Placement) semanticObject); 
				return; 
			case ChessDSLPackage.PLAYER:
				sequence_Player(context, (Player) semanticObject); 
				return; 
			case ChessDSLPackage.PLAYER_OR_COLOR:
				sequence_PlayerOrColor(context, (PlayerOrColor) semanticObject); 
				return; 
			case ChessDSLPackage.PROMOTION:
				sequence_Promotion(context, (Promotion) semanticObject); 
				return; 
			case ChessDSLPackage.RESIGN:
				sequence_Resign(context, (Resign) semanticObject); 
				return; 
			case ChessDSLPackage.RESULT:
				sequence_Result(context, (Result) semanticObject); 
				return; 
			case ChessDSLPackage.SAN_MOVE:
				sequence_Escaped_SANMove(context, (SANMove) semanticObject); 
				return; 
			case ChessDSLPackage.SQUARE:
				sequence_Square(context, (Square) semanticObject); 
				return; 
			case ChessDSLPackage.TIME_UP:
				sequence_TimeUp(context, (TimeUp) semanticObject); 
				return; 
			case ChessDSLPackage.WIN:
				sequence_Win(context, (Win) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     AnyMove returns AnyMove
	 *
	 * Constraint:
	 *     (algebraicmove=Escaped_SANMove | (move=DSLMove remarks+=Remark*))
	 * </pre>
	 */
	protected void sequence_AnyMove(ISerializationContext context, AnyMove semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DSLMove returns Capture
	 *     Capture returns Capture
	 *
	 * Constraint:
	 *     (move=Move (capture=Piece | capture=Piece))
	 * </pre>
	 */
	protected void sequence_Capture(ISerializationContext context, Capture semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DSLMove returns Castle
	 *     Castle returns Castle
	 *
	 * Constraint:
	 *     (
	 *         side='Kingside' | 
	 *         side='Queenside' | 
	 *         side='Kingside' | 
	 *         side='Queenside' | 
	 *         (move=Move (side='Kingside' | side='Queenside')) | 
	 *         (move=Move (side='Kingside' | side='Queenside'))
	 *     )
	 * </pre>
	 */
	protected void sequence_Castle(ISerializationContext context, Castle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Checkmate returns Checkmate
	 *
	 * Constraint:
	 *     (player1=PlayerOrColor player2=PlayerOrColor)
	 * </pre>
	 */
	protected void sequence_Checkmate(ISerializationContext context, Checkmate semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ChessDSLPackage.Literals.CHECKMATE__PLAYER1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChessDSLPackage.Literals.CHECKMATE__PLAYER1));
			if (transientValues.isValueTransient(semanticObject, ChessDSLPackage.Literals.CHECKMATE__PLAYER2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChessDSLPackage.Literals.CHECKMATE__PLAYER2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCheckmateAccess().getPlayer1PlayerOrColorParserRuleCall_0_0(), semanticObject.getPlayer1());
		feeder.accept(grammarAccess.getCheckmateAccess().getPlayer2PlayerOrColorParserRuleCall_2_0(), semanticObject.getPlayer2());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Conclusion returns Conclusion
	 *
	 * Constraint:
	 *     (method=Method? result=Result)
	 * </pre>
	 */
	protected void sequence_Conclusion(ISerializationContext context, Conclusion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     CustomPiece returns CustomPiece
	 *
	 * Constraint:
	 *     (color=Color kind=Piece)
	 * </pre>
	 */
	protected void sequence_CustomPiece(ISerializationContext context, CustomPiece semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ChessDSLPackage.Literals.CUSTOM_PIECE__COLOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChessDSLPackage.Literals.CUSTOM_PIECE__COLOR));
			if (transientValues.isValueTransient(semanticObject, ChessDSLPackage.Literals.CUSTOM_PIECE__KIND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChessDSLPackage.Literals.CUSTOM_PIECE__KIND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCustomPieceAccess().getColorColorEnumRuleCall_0_0(), semanticObject.getColor());
		feeder.accept(grammarAccess.getCustomPieceAccess().getKindPieceEnumRuleCall_1_0(), semanticObject.getKind());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     CustomPositions returns CustomPositions
	 *
	 * Constraint:
	 *     placement+=Placement*
	 * </pre>
	 */
	protected void sequence_CustomPositions(ISerializationContext context, CustomPositions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Draw returns Draw
	 *
	 * Constraint:
	 *     (player1=PlayerOrColor player2=PlayerOrColor (result=Stalemate | result=Threefold | result=Fifty | result=Agree))
	 * </pre>
	 */
	protected void sequence_Draw(ISerializationContext context, Draw semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DSLMove returns Dummy
	 *     Dummy returns Dummy
	 *
	 * Constraint:
	 *     {Dummy}
	 * </pre>
	 */
	protected void sequence_Dummy(ISerializationContext context, Dummy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DSLMove returns EnPassant
	 *     EnPassant returns EnPassant
	 *
	 * Constraint:
	 *     (capture=Capture square=Square)
	 * </pre>
	 */
	protected void sequence_EnPassant(ISerializationContext context, EnPassant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ChessDSLPackage.Literals.EN_PASSANT__CAPTURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChessDSLPackage.Literals.EN_PASSANT__CAPTURE));
			if (transientValues.isValueTransient(semanticObject, ChessDSLPackage.Literals.EN_PASSANT__SQUARE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChessDSLPackage.Literals.EN_PASSANT__SQUARE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEnPassantAccess().getCaptureCaptureParserRuleCall_0_0(), semanticObject.getCapture());
		feeder.accept(grammarAccess.getEnPassantAccess().getSquareSquareParserRuleCall_2_0(), semanticObject.getSquare());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Escaped_SANMove returns SANMove
	 *
	 * Constraint:
	 *     token=SAN_TOKEN
	 * </pre>
	 */
	protected void sequence_Escaped_SANMove(ISerializationContext context, SANMove semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ChessDSLPackage.Literals.SAN_MOVE__TOKEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChessDSLPackage.Literals.SAN_MOVE__TOKEN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEscaped_SANMoveAccess().getTokenSAN_TOKENTerminalRuleCall_1_0(), semanticObject.getToken());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Game returns Game
	 *
	 * Constraint:
	 *     (title=STRING players+=Player* initial=InitialState? moves+=MovePair* conclusion=Conclusion?)
	 * </pre>
	 */
	protected void sequence_Game(ISerializationContext context, Game semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     InitialState returns InitialState
	 *
	 * Constraint:
	 *     positions=CustomPositions?
	 * </pre>
	 */
	protected void sequence_InitialState(ISerializationContext context, InitialState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Method returns Method
	 *
	 * Constraint:
	 *     (win=Win | draw=Draw)
	 * </pre>
	 */
	protected void sequence_Method(ISerializationContext context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     game=Game
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ChessDSLPackage.Literals.MODEL__GAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChessDSLPackage.Literals.MODEL__GAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModelAccess().getGameGameParserRuleCall_0(), semanticObject.getGame());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     MovePair returns MovePair
	 *
	 * Constraint:
	 *     (moveNumber=MOVENUMBER (color1=PlayerOrColor? whiteMove=AnyMove)? (color2=PlayerOrColor? blackMove=AnyMove)?)
	 * </pre>
	 */
	protected void sequence_MovePair(ISerializationContext context, MovePair semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DSLMove returns Move
	 *     Move returns Move
	 *
	 * Constraint:
	 *     (piece=Piece ((from=Square to=Square) | (from=Square to=Square)))
	 * </pre>
	 */
	protected void sequence_Move(ISerializationContext context, Move semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Placement returns Placement
	 *
	 * Constraint:
	 *     (piece=CustomPiece square=Square)
	 * </pre>
	 */
	protected void sequence_Placement(ISerializationContext context, Placement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ChessDSLPackage.Literals.PLACEMENT__PIECE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChessDSLPackage.Literals.PLACEMENT__PIECE));
			if (transientValues.isValueTransient(semanticObject, ChessDSLPackage.Literals.PLACEMENT__SQUARE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChessDSLPackage.Literals.PLACEMENT__SQUARE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPlacementAccess().getPieceCustomPieceParserRuleCall_0_0(), semanticObject.getPiece());
		feeder.accept(grammarAccess.getPlacementAccess().getSquareSquareParserRuleCall_2_0(), semanticObject.getSquare());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PlayerOrColor returns PlayerOrColor
	 *
	 * Constraint:
	 *     (player=[Player|ID] | color=Color)
	 * </pre>
	 */
	protected void sequence_PlayerOrColor(ISerializationContext context, PlayerOrColor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Player returns Player
	 *
	 * Constraint:
	 *     (color=Color name=STRING)
	 * </pre>
	 */
	protected void sequence_Player(ISerializationContext context, Player semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ChessDSLPackage.Literals.PLAYER__COLOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChessDSLPackage.Literals.PLAYER__COLOR));
			if (transientValues.isValueTransient(semanticObject, ChessDSLPackage.Literals.PLAYER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChessDSLPackage.Literals.PLAYER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPlayerAccess().getColorColorEnumRuleCall_0_0(), semanticObject.getColor());
		feeder.accept(grammarAccess.getPlayerAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DSLMove returns Promotion
	 *     Promotion returns Promotion
	 *
	 * Constraint:
	 *     ((move=Move | move=Capture) piece=Piece)
	 * </pre>
	 */
	protected void sequence_Promotion(ISerializationContext context, Promotion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Resign returns Resign
	 *
	 * Constraint:
	 *     player=PlayerOrColor
	 * </pre>
	 */
	protected void sequence_Resign(ISerializationContext context, Resign semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ChessDSLPackage.Literals.RESIGN__PLAYER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChessDSLPackage.Literals.RESIGN__PLAYER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getResignAccess().getPlayerPlayerOrColorParserRuleCall_0_0(), semanticObject.getPlayer());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Result returns Result
	 *
	 * Constraint:
	 *     (player=[Player|ID] | color=Color)
	 * </pre>
	 */
	protected void sequence_Result(ISerializationContext context, Result semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Square returns Square
	 *
	 * Constraint:
	 *     square=SQUARETERMINAL
	 * </pre>
	 */
	protected void sequence_Square(ISerializationContext context, Square semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ChessDSLPackage.Literals.SQUARE__SQUARE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChessDSLPackage.Literals.SQUARE__SQUARE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSquareAccess().getSquareSQUARETERMINALTerminalRuleCall_0(), semanticObject.getSquare());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TimeUp returns TimeUp
	 *
	 * Constraint:
	 *     player=PlayerOrColor
	 * </pre>
	 */
	protected void sequence_TimeUp(ISerializationContext context, TimeUp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ChessDSLPackage.Literals.TIME_UP__PLAYER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChessDSLPackage.Literals.TIME_UP__PLAYER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTimeUpAccess().getPlayerPlayerOrColorParserRuleCall_0_0(), semanticObject.getPlayer());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Win returns Win
	 *
	 * Constraint:
	 *     (time=TimeUp | resign=Resign | mate=Checkmate)
	 * </pre>
	 */
	protected void sequence_Win(ISerializationContext context, Win semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
