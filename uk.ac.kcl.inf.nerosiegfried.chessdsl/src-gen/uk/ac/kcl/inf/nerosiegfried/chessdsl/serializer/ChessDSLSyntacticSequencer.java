/*
 * generated by Xtext 2.38.0
 */
package uk.ac.kcl.inf.nerosiegfried.chessdsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import uk.ac.kcl.inf.nerosiegfried.chessdsl.services.ChessDSLGrammarAccess;

@SuppressWarnings("all")
public class ChessDSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ChessDSLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AnyMove___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q;
	protected AbstractElementAlias match_Capture_AndKeyword_1_1_0_q;
	protected AbstractElementAlias match_Castle_DSLMove_DummyParserRuleCall_5_or___CastleKeyword_0_0___KingsideKeyword_0_1_0_or_QueensideKeyword_0_1_1___RightParenthesisKeyword_0_2___or___CastlesKeyword_1_0___OnKeyword_1_1_0_TheKeyword_1_1_1__q___KingsideKeyword_1_2_0_or_QueensideKeyword_1_2_1____;
	protected AbstractElementAlias match_Castle___CastleKeyword_0_0___KingsideKeyword_0_1_0_or_QueensideKeyword_0_1_1___RightParenthesisKeyword_0_2___or___CastlesKeyword_1_0___OnKeyword_1_1_0_TheKeyword_1_1_1__q___KingsideKeyword_1_2_0_or_QueensideKeyword_1_2_1____;
	protected AbstractElementAlias match_InitialState_FreshKeyword_2_0_q;
	protected AbstractElementAlias match_Move_MovesKeyword_0_q;
	protected AbstractElementAlias match_Placement_EqualsSignKeyword_1_0_or_OnKeyword_1_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ChessDSLGrammarAccess) access;
		match_AnyMove___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAnyMoveAccess().getLeftParenthesisKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getAnyMoveAccess().getRightParenthesisKeyword_1_2()));
		match_Capture_AndKeyword_1_1_0_q = new TokenAlias(false, true, grammarAccess.getCaptureAccess().getAndKeyword_1_1_0());
		match_Castle_DSLMove_DummyParserRuleCall_5_or___CastleKeyword_0_0___KingsideKeyword_0_1_0_or_QueensideKeyword_0_1_1___RightParenthesisKeyword_0_2___or___CastlesKeyword_1_0___OnKeyword_1_1_0_TheKeyword_1_1_1__q___KingsideKeyword_1_2_0_or_QueensideKeyword_1_2_1____ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getCastleAccess().getCastleKeyword_0_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCastleAccess().getKingsideKeyword_0_1_0()), new TokenAlias(false, false, grammarAccess.getCastleAccess().getQueensideKeyword_0_1_1())), new TokenAlias(false, false, grammarAccess.getCastleAccess().getRightParenthesisKeyword_0_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getCastleAccess().getCastlesKeyword_1_0()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getCastleAccess().getOnKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getCastleAccess().getTheKeyword_1_1_1())), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCastleAccess().getKingsideKeyword_1_2_0()), new TokenAlias(false, false, grammarAccess.getCastleAccess().getQueensideKeyword_1_2_1()))), new TokenAlias(false, false, grammarAccess.getDSLMoveAccess().getDummyParserRuleCall_5()));
		match_Castle___CastleKeyword_0_0___KingsideKeyword_0_1_0_or_QueensideKeyword_0_1_1___RightParenthesisKeyword_0_2___or___CastlesKeyword_1_0___OnKeyword_1_1_0_TheKeyword_1_1_1__q___KingsideKeyword_1_2_0_or_QueensideKeyword_1_2_1____ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getCastleAccess().getCastleKeyword_0_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCastleAccess().getKingsideKeyword_0_1_0()), new TokenAlias(false, false, grammarAccess.getCastleAccess().getQueensideKeyword_0_1_1())), new TokenAlias(false, false, grammarAccess.getCastleAccess().getRightParenthesisKeyword_0_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getCastleAccess().getCastlesKeyword_1_0()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getCastleAccess().getOnKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getCastleAccess().getTheKeyword_1_1_1())), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCastleAccess().getKingsideKeyword_1_2_0()), new TokenAlias(false, false, grammarAccess.getCastleAccess().getQueensideKeyword_1_2_1()))));
		match_InitialState_FreshKeyword_2_0_q = new TokenAlias(false, true, grammarAccess.getInitialStateAccess().getFreshKeyword_2_0());
		match_Move_MovesKeyword_0_q = new TokenAlias(false, true, grammarAccess.getMoveAccess().getMovesKeyword_0());
		match_Placement_EqualsSignKeyword_1_0_or_OnKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPlacementAccess().getEqualsSignKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getPlacementAccess().getOnKeyword_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getDummyRule())
			return getDummyToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Dummy:
	 * 
	 * 	'dummy'
	 * 
	 * ;
	 */
	protected String getDummyToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "dummy";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_AnyMove___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q.equals(syntax))
				emit_AnyMove___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Capture_AndKeyword_1_1_0_q.equals(syntax))
				emit_Capture_AndKeyword_1_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Castle_DSLMove_DummyParserRuleCall_5_or___CastleKeyword_0_0___KingsideKeyword_0_1_0_or_QueensideKeyword_0_1_1___RightParenthesisKeyword_0_2___or___CastlesKeyword_1_0___OnKeyword_1_1_0_TheKeyword_1_1_1__q___KingsideKeyword_1_2_0_or_QueensideKeyword_1_2_1____.equals(syntax))
				emit_Castle_DSLMove_DummyParserRuleCall_5_or___CastleKeyword_0_0___KingsideKeyword_0_1_0_or_QueensideKeyword_0_1_1___RightParenthesisKeyword_0_2___or___CastlesKeyword_1_0___OnKeyword_1_1_0_TheKeyword_1_1_1__q___KingsideKeyword_1_2_0_or_QueensideKeyword_1_2_1____(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Castle___CastleKeyword_0_0___KingsideKeyword_0_1_0_or_QueensideKeyword_0_1_1___RightParenthesisKeyword_0_2___or___CastlesKeyword_1_0___OnKeyword_1_1_0_TheKeyword_1_1_1__q___KingsideKeyword_1_2_0_or_QueensideKeyword_1_2_1____.equals(syntax))
				emit_Castle___CastleKeyword_0_0___KingsideKeyword_0_1_0_or_QueensideKeyword_0_1_1___RightParenthesisKeyword_0_2___or___CastlesKeyword_1_0___OnKeyword_1_1_0_TheKeyword_1_1_1__q___KingsideKeyword_1_2_0_or_QueensideKeyword_1_2_1____(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_InitialState_FreshKeyword_2_0_q.equals(syntax))
				emit_InitialState_FreshKeyword_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Move_MovesKeyword_0_q.equals(syntax))
				emit_Move_MovesKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Placement_EqualsSignKeyword_1_0_or_OnKeyword_1_1.equals(syntax))
				emit_Placement_EqualsSignKeyword_1_0_or_OnKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     move=DSLMove (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_AnyMove___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'and'?
	 *
	 * This ambiguous syntax occurs at:
	 *     move=Move (ambiguity) 'captures' capture=Piece
	 
	 * </pre>
	 */
	protected void emit_Capture_AndKeyword_1_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     Dummy | ('Castle(' ('Kingside' | 'Queenside') ')') | ('castles' ('on' 'the')? ('Kingside' | 'Queenside'))
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 
	 * </pre>
	 */
	protected void emit_Castle_DSLMove_DummyParserRuleCall_5_or___CastleKeyword_0_0___KingsideKeyword_0_1_0_or_QueensideKeyword_0_1_1___RightParenthesisKeyword_0_2___or___CastlesKeyword_1_0___OnKeyword_1_1_0_TheKeyword_1_1_1__q___KingsideKeyword_1_2_0_or_QueensideKeyword_1_2_1____(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('Castle(' ('Kingside' | 'Queenside') ')') | ('castles' ('on' 'the')? ('Kingside' | 'Queenside'))
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 
	 * </pre>
	 */
	protected void emit_Castle___CastleKeyword_0_0___KingsideKeyword_0_1_0_or_QueensideKeyword_0_1_1___RightParenthesisKeyword_0_2___or___CastlesKeyword_1_0___OnKeyword_1_1_0_TheKeyword_1_1_1__q___KingsideKeyword_1_2_0_or_QueensideKeyword_1_2_1____(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'fresh'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'InitialState' (ambiguity) (rule start)
	 
	 * </pre>
	 */
	protected void emit_InitialState_FreshKeyword_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'moves'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) piece=Piece
	 
	 * </pre>
	 */
	protected void emit_Move_MovesKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '=' | 'on'
	 *
	 * This ambiguous syntax occurs at:
	 *     piece=CustomPiece (ambiguity) square=Square
	 
	 * </pre>
	 */
	protected void emit_Placement_EqualsSignKeyword_1_0_or_OnKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
