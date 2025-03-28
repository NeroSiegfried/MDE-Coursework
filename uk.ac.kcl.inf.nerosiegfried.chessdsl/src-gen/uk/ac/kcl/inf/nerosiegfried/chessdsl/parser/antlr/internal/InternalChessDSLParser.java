package uk.ac.kcl.inf.nerosiegfried.chessdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.inf.nerosiegfried.chessdsl.services.ChessDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalChessDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_MOVENUMBER", "RULE_ID", "RULE_SQUARETERMINAL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Game'", "'Players:'", "'Moves:'", "'end'", "':'", "'InitialState'", "'fresh'", "'custom'", "'Positions:'", "'{'", "'}'", "'='", "'on'", "'...'", "'('", "')'", "'dummy'", "'moves'", "'->'", "'from'", "'to'", "'Capture('", "'and'", "'captures'", "'Castle('", "'Kingside'", "'Queenside'", "'castles'", "'the'", "'Castle()'", "'Promotion('", "'ran'", "'out'", "'of'", "'time'", "'resigned'", "'checkmated'", "'ended'", "'game'", "'in'", "'a'", "'stalemate'", "'repeated'", "'position'", "'three'", "'times'", "'played'", "'fifty'", "'without'", "'capture'", "'agreed'", "'draw'", "'wins'", "'Good'", "'Bad'", "'Excellent'", "'Risky'", "'Dubious'", "'Check'", "'Checkmate'", "'White'", "'Black'", "'King'", "'Queen'", "'Rook'", "'Bishop'", "'Knight'", "'Pawn'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int RULE_MOVENUMBER=5;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_SQUARETERMINAL=7;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalChessDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalChessDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalChessDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalChessDSL.g"; }



     	private ChessDSLGrammarAccess grammarAccess;

        public InternalChessDSLParser(TokenStream input, ChessDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ChessDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalChessDSL.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalChessDSL.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalChessDSL.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalChessDSL.g:72:1: ruleModel returns [EObject current=null] : ( (lv_game_0_0= ruleGame ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_game_0_0 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:78:2: ( ( (lv_game_0_0= ruleGame ) ) )
            // InternalChessDSL.g:79:2: ( (lv_game_0_0= ruleGame ) )
            {
            // InternalChessDSL.g:79:2: ( (lv_game_0_0= ruleGame ) )
            // InternalChessDSL.g:80:3: (lv_game_0_0= ruleGame )
            {
            // InternalChessDSL.g:80:3: (lv_game_0_0= ruleGame )
            // InternalChessDSL.g:81:4: lv_game_0_0= ruleGame
            {

            				newCompositeNode(grammarAccess.getModelAccess().getGameGameParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_game_0_0=ruleGame();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				set(
            					current,
            					"game",
            					lv_game_0_0,
            					"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.Game");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGame"
    // InternalChessDSL.g:101:1: entryRuleGame returns [EObject current=null] : iv_ruleGame= ruleGame EOF ;
    public final EObject entryRuleGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGame = null;


        try {
            // InternalChessDSL.g:101:45: (iv_ruleGame= ruleGame EOF )
            // InternalChessDSL.g:102:2: iv_ruleGame= ruleGame EOF
            {
             newCompositeNode(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGame=ruleGame();

            state._fsp--;

             current =iv_ruleGame; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalChessDSL.g:108:1: ruleGame returns [EObject current=null] : (otherlv_0= 'Game' ( (lv_title_1_0= RULE_STRING ) ) (otherlv_2= 'Players:' ( (lv_players_3_0= rulePlayer ) )+ )? ( (lv_initial_4_0= ruleInitialState ) )? otherlv_5= 'Moves:' ( (lv_moves_6_0= ruleMovePair ) )+ otherlv_7= 'end' ( (lv_conclusion_8_0= ruleConclusion ) )? ) ;
    public final EObject ruleGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_players_3_0 = null;

        EObject lv_initial_4_0 = null;

        EObject lv_moves_6_0 = null;

        EObject lv_conclusion_8_0 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:114:2: ( (otherlv_0= 'Game' ( (lv_title_1_0= RULE_STRING ) ) (otherlv_2= 'Players:' ( (lv_players_3_0= rulePlayer ) )+ )? ( (lv_initial_4_0= ruleInitialState ) )? otherlv_5= 'Moves:' ( (lv_moves_6_0= ruleMovePair ) )+ otherlv_7= 'end' ( (lv_conclusion_8_0= ruleConclusion ) )? ) )
            // InternalChessDSL.g:115:2: (otherlv_0= 'Game' ( (lv_title_1_0= RULE_STRING ) ) (otherlv_2= 'Players:' ( (lv_players_3_0= rulePlayer ) )+ )? ( (lv_initial_4_0= ruleInitialState ) )? otherlv_5= 'Moves:' ( (lv_moves_6_0= ruleMovePair ) )+ otherlv_7= 'end' ( (lv_conclusion_8_0= ruleConclusion ) )? )
            {
            // InternalChessDSL.g:115:2: (otherlv_0= 'Game' ( (lv_title_1_0= RULE_STRING ) ) (otherlv_2= 'Players:' ( (lv_players_3_0= rulePlayer ) )+ )? ( (lv_initial_4_0= ruleInitialState ) )? otherlv_5= 'Moves:' ( (lv_moves_6_0= ruleMovePair ) )+ otherlv_7= 'end' ( (lv_conclusion_8_0= ruleConclusion ) )? )
            // InternalChessDSL.g:116:3: otherlv_0= 'Game' ( (lv_title_1_0= RULE_STRING ) ) (otherlv_2= 'Players:' ( (lv_players_3_0= rulePlayer ) )+ )? ( (lv_initial_4_0= ruleInitialState ) )? otherlv_5= 'Moves:' ( (lv_moves_6_0= ruleMovePair ) )+ otherlv_7= 'end' ( (lv_conclusion_8_0= ruleConclusion ) )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGameAccess().getGameKeyword_0());
            		
            // InternalChessDSL.g:120:3: ( (lv_title_1_0= RULE_STRING ) )
            // InternalChessDSL.g:121:4: (lv_title_1_0= RULE_STRING )
            {
            // InternalChessDSL.g:121:4: (lv_title_1_0= RULE_STRING )
            // InternalChessDSL.g:122:5: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_title_1_0, grammarAccess.getGameAccess().getTitleSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalChessDSL.g:138:3: (otherlv_2= 'Players:' ( (lv_players_3_0= rulePlayer ) )+ )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalChessDSL.g:139:4: otherlv_2= 'Players:' ( (lv_players_3_0= rulePlayer ) )+
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getGameAccess().getPlayersKeyword_2_0());
                    			
                    // InternalChessDSL.g:143:4: ( (lv_players_3_0= rulePlayer ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=73 && LA1_0<=74)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalChessDSL.g:144:5: (lv_players_3_0= rulePlayer )
                    	    {
                    	    // InternalChessDSL.g:144:5: (lv_players_3_0= rulePlayer )
                    	    // InternalChessDSL.g:145:6: lv_players_3_0= rulePlayer
                    	    {

                    	    						newCompositeNode(grammarAccess.getGameAccess().getPlayersPlayerParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_players_3_0=rulePlayer();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getGameRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"players",
                    	    							lv_players_3_0,
                    	    							"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.Player");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


                    }
                    break;

            }

            // InternalChessDSL.g:163:3: ( (lv_initial_4_0= ruleInitialState ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalChessDSL.g:164:4: (lv_initial_4_0= ruleInitialState )
                    {
                    // InternalChessDSL.g:164:4: (lv_initial_4_0= ruleInitialState )
                    // InternalChessDSL.g:165:5: lv_initial_4_0= ruleInitialState
                    {

                    					newCompositeNode(grammarAccess.getGameAccess().getInitialInitialStateParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_initial_4_0=ruleInitialState();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGameRule());
                    					}
                    					set(
                    						current,
                    						"initial",
                    						lv_initial_4_0,
                    						"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.InitialState");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getGameAccess().getMovesKeyword_4());
            		
            // InternalChessDSL.g:186:3: ( (lv_moves_6_0= ruleMovePair ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_MOVENUMBER) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalChessDSL.g:187:4: (lv_moves_6_0= ruleMovePair )
            	    {
            	    // InternalChessDSL.g:187:4: (lv_moves_6_0= ruleMovePair )
            	    // InternalChessDSL.g:188:5: lv_moves_6_0= ruleMovePair
            	    {

            	    					newCompositeNode(grammarAccess.getGameAccess().getMovesMovePairParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_moves_6_0=ruleMovePair();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"moves",
            	    						lv_moves_6_0,
            	    						"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.MovePair");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getGameAccess().getEndKeyword_6());
            		
            // InternalChessDSL.g:209:3: ( (lv_conclusion_8_0= ruleConclusion ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||LA5_0==64||(LA5_0>=73 && LA5_0<=74)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalChessDSL.g:210:4: (lv_conclusion_8_0= ruleConclusion )
                    {
                    // InternalChessDSL.g:210:4: (lv_conclusion_8_0= ruleConclusion )
                    // InternalChessDSL.g:211:5: lv_conclusion_8_0= ruleConclusion
                    {

                    					newCompositeNode(grammarAccess.getGameAccess().getConclusionConclusionParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_conclusion_8_0=ruleConclusion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGameRule());
                    					}
                    					set(
                    						current,
                    						"conclusion",
                    						lv_conclusion_8_0,
                    						"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.Conclusion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRulePlayer"
    // InternalChessDSL.g:232:1: entryRulePlayer returns [EObject current=null] : iv_rulePlayer= rulePlayer EOF ;
    public final EObject entryRulePlayer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlayer = null;


        try {
            // InternalChessDSL.g:232:47: (iv_rulePlayer= rulePlayer EOF )
            // InternalChessDSL.g:233:2: iv_rulePlayer= rulePlayer EOF
            {
             newCompositeNode(grammarAccess.getPlayerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlayer=rulePlayer();

            state._fsp--;

             current =iv_rulePlayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlayer"


    // $ANTLR start "rulePlayer"
    // InternalChessDSL.g:239:1: rulePlayer returns [EObject current=null] : ( ( (lv_color_0_0= ruleColor ) ) otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePlayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Enumerator lv_color_0_0 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:245:2: ( ( ( (lv_color_0_0= ruleColor ) ) otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) ) )
            // InternalChessDSL.g:246:2: ( ( (lv_color_0_0= ruleColor ) ) otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) )
            {
            // InternalChessDSL.g:246:2: ( ( (lv_color_0_0= ruleColor ) ) otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalChessDSL.g:247:3: ( (lv_color_0_0= ruleColor ) ) otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) )
            {
            // InternalChessDSL.g:247:3: ( (lv_color_0_0= ruleColor ) )
            // InternalChessDSL.g:248:4: (lv_color_0_0= ruleColor )
            {
            // InternalChessDSL.g:248:4: (lv_color_0_0= ruleColor )
            // InternalChessDSL.g:249:5: lv_color_0_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getPlayerAccess().getColorColorEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_color_0_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlayerRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_0_0,
            						"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPlayerAccess().getColonKeyword_1());
            		
            // InternalChessDSL.g:270:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalChessDSL.g:271:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalChessDSL.g:271:4: (lv_name_2_0= RULE_STRING )
            // InternalChessDSL.g:272:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPlayerAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlayerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlayer"


    // $ANTLR start "entryRuleInitialState"
    // InternalChessDSL.g:292:1: entryRuleInitialState returns [EObject current=null] : iv_ruleInitialState= ruleInitialState EOF ;
    public final EObject entryRuleInitialState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialState = null;


        try {
            // InternalChessDSL.g:292:53: (iv_ruleInitialState= ruleInitialState EOF )
            // InternalChessDSL.g:293:2: iv_ruleInitialState= ruleInitialState EOF
            {
             newCompositeNode(grammarAccess.getInitialStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialState=ruleInitialState();

            state._fsp--;

             current =iv_ruleInitialState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitialState"


    // $ANTLR start "ruleInitialState"
    // InternalChessDSL.g:299:1: ruleInitialState returns [EObject current=null] : ( () otherlv_1= 'InitialState' (otherlv_2= 'fresh' | (otherlv_3= 'custom' ( (lv_positions_4_0= ruleCustomPositions ) ) ) )? ) ;
    public final EObject ruleInitialState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_positions_4_0 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:305:2: ( ( () otherlv_1= 'InitialState' (otherlv_2= 'fresh' | (otherlv_3= 'custom' ( (lv_positions_4_0= ruleCustomPositions ) ) ) )? ) )
            // InternalChessDSL.g:306:2: ( () otherlv_1= 'InitialState' (otherlv_2= 'fresh' | (otherlv_3= 'custom' ( (lv_positions_4_0= ruleCustomPositions ) ) ) )? )
            {
            // InternalChessDSL.g:306:2: ( () otherlv_1= 'InitialState' (otherlv_2= 'fresh' | (otherlv_3= 'custom' ( (lv_positions_4_0= ruleCustomPositions ) ) ) )? )
            // InternalChessDSL.g:307:3: () otherlv_1= 'InitialState' (otherlv_2= 'fresh' | (otherlv_3= 'custom' ( (lv_positions_4_0= ruleCustomPositions ) ) ) )?
            {
            // InternalChessDSL.g:307:3: ()
            // InternalChessDSL.g:308:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitialStateAccess().getInitialStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getInitialStateAccess().getInitialStateKeyword_1());
            		
            // InternalChessDSL.g:318:3: (otherlv_2= 'fresh' | (otherlv_3= 'custom' ( (lv_positions_4_0= ruleCustomPositions ) ) ) )?
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            switch (alt6) {
                case 1 :
                    // InternalChessDSL.g:319:4: otherlv_2= 'fresh'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getInitialStateAccess().getFreshKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:324:4: (otherlv_3= 'custom' ( (lv_positions_4_0= ruleCustomPositions ) ) )
                    {
                    // InternalChessDSL.g:324:4: (otherlv_3= 'custom' ( (lv_positions_4_0= ruleCustomPositions ) ) )
                    // InternalChessDSL.g:325:5: otherlv_3= 'custom' ( (lv_positions_4_0= ruleCustomPositions ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_13); 

                    					newLeafNode(otherlv_3, grammarAccess.getInitialStateAccess().getCustomKeyword_2_1_0());
                    				
                    // InternalChessDSL.g:329:5: ( (lv_positions_4_0= ruleCustomPositions ) )
                    // InternalChessDSL.g:330:6: (lv_positions_4_0= ruleCustomPositions )
                    {
                    // InternalChessDSL.g:330:6: (lv_positions_4_0= ruleCustomPositions )
                    // InternalChessDSL.g:331:7: lv_positions_4_0= ruleCustomPositions
                    {

                    							newCompositeNode(grammarAccess.getInitialStateAccess().getPositionsCustomPositionsParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_positions_4_0=ruleCustomPositions();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getInitialStateRule());
                    							}
                    							set(
                    								current,
                    								"positions",
                    								lv_positions_4_0,
                    								"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.CustomPositions");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitialState"


    // $ANTLR start "entryRuleCustomPositions"
    // InternalChessDSL.g:354:1: entryRuleCustomPositions returns [EObject current=null] : iv_ruleCustomPositions= ruleCustomPositions EOF ;
    public final EObject entryRuleCustomPositions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomPositions = null;


        try {
            // InternalChessDSL.g:354:56: (iv_ruleCustomPositions= ruleCustomPositions EOF )
            // InternalChessDSL.g:355:2: iv_ruleCustomPositions= ruleCustomPositions EOF
            {
             newCompositeNode(grammarAccess.getCustomPositionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomPositions=ruleCustomPositions();

            state._fsp--;

             current =iv_ruleCustomPositions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomPositions"


    // $ANTLR start "ruleCustomPositions"
    // InternalChessDSL.g:361:1: ruleCustomPositions returns [EObject current=null] : ( () otherlv_1= 'Positions:' otherlv_2= '{' ( (lv_placement_3_0= rulePlacement ) )* otherlv_4= '}' ) ;
    public final EObject ruleCustomPositions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_placement_3_0 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:367:2: ( ( () otherlv_1= 'Positions:' otherlv_2= '{' ( (lv_placement_3_0= rulePlacement ) )* otherlv_4= '}' ) )
            // InternalChessDSL.g:368:2: ( () otherlv_1= 'Positions:' otherlv_2= '{' ( (lv_placement_3_0= rulePlacement ) )* otherlv_4= '}' )
            {
            // InternalChessDSL.g:368:2: ( () otherlv_1= 'Positions:' otherlv_2= '{' ( (lv_placement_3_0= rulePlacement ) )* otherlv_4= '}' )
            // InternalChessDSL.g:369:3: () otherlv_1= 'Positions:' otherlv_2= '{' ( (lv_placement_3_0= rulePlacement ) )* otherlv_4= '}'
            {
            // InternalChessDSL.g:369:3: ()
            // InternalChessDSL.g:370:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCustomPositionsAccess().getCustomPositionsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomPositionsAccess().getPositionsKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getCustomPositionsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalChessDSL.g:384:3: ( (lv_placement_3_0= rulePlacement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=73 && LA7_0<=74)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalChessDSL.g:385:4: (lv_placement_3_0= rulePlacement )
            	    {
            	    // InternalChessDSL.g:385:4: (lv_placement_3_0= rulePlacement )
            	    // InternalChessDSL.g:386:5: lv_placement_3_0= rulePlacement
            	    {

            	    					newCompositeNode(grammarAccess.getCustomPositionsAccess().getPlacementPlacementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_placement_3_0=rulePlacement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCustomPositionsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"placement",
            	    						lv_placement_3_0,
            	    						"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.Placement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCustomPositionsAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomPositions"


    // $ANTLR start "entryRulePlacement"
    // InternalChessDSL.g:411:1: entryRulePlacement returns [EObject current=null] : iv_rulePlacement= rulePlacement EOF ;
    public final EObject entryRulePlacement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlacement = null;


        try {
            // InternalChessDSL.g:411:50: (iv_rulePlacement= rulePlacement EOF )
            // InternalChessDSL.g:412:2: iv_rulePlacement= rulePlacement EOF
            {
             newCompositeNode(grammarAccess.getPlacementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlacement=rulePlacement();

            state._fsp--;

             current =iv_rulePlacement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlacement"


    // $ANTLR start "rulePlacement"
    // InternalChessDSL.g:418:1: rulePlacement returns [EObject current=null] : ( ( (lv_piece_0_0= ruleCustomPiece ) ) (otherlv_1= '=' | otherlv_2= 'on' ) ( (lv_square_3_0= ruleSquare ) ) ) ;
    public final EObject rulePlacement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_piece_0_0 = null;

        AntlrDatatypeRuleToken lv_square_3_0 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:424:2: ( ( ( (lv_piece_0_0= ruleCustomPiece ) ) (otherlv_1= '=' | otherlv_2= 'on' ) ( (lv_square_3_0= ruleSquare ) ) ) )
            // InternalChessDSL.g:425:2: ( ( (lv_piece_0_0= ruleCustomPiece ) ) (otherlv_1= '=' | otherlv_2= 'on' ) ( (lv_square_3_0= ruleSquare ) ) )
            {
            // InternalChessDSL.g:425:2: ( ( (lv_piece_0_0= ruleCustomPiece ) ) (otherlv_1= '=' | otherlv_2= 'on' ) ( (lv_square_3_0= ruleSquare ) ) )
            // InternalChessDSL.g:426:3: ( (lv_piece_0_0= ruleCustomPiece ) ) (otherlv_1= '=' | otherlv_2= 'on' ) ( (lv_square_3_0= ruleSquare ) )
            {
            // InternalChessDSL.g:426:3: ( (lv_piece_0_0= ruleCustomPiece ) )
            // InternalChessDSL.g:427:4: (lv_piece_0_0= ruleCustomPiece )
            {
            // InternalChessDSL.g:427:4: (lv_piece_0_0= ruleCustomPiece )
            // InternalChessDSL.g:428:5: lv_piece_0_0= ruleCustomPiece
            {

            					newCompositeNode(grammarAccess.getPlacementAccess().getPieceCustomPieceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_piece_0_0=ruleCustomPiece();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlacementRule());
            					}
            					set(
            						current,
            						"piece",
            						lv_piece_0_0,
            						"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.CustomPiece");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalChessDSL.g:445:3: (otherlv_1= '=' | otherlv_2= 'on' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            else if ( (LA8_0==25) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalChessDSL.g:446:4: otherlv_1= '='
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getPlacementAccess().getEqualsSignKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:451:4: otherlv_2= 'on'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getPlacementAccess().getOnKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalChessDSL.g:456:3: ( (lv_square_3_0= ruleSquare ) )
            // InternalChessDSL.g:457:4: (lv_square_3_0= ruleSquare )
            {
            // InternalChessDSL.g:457:4: (lv_square_3_0= ruleSquare )
            // InternalChessDSL.g:458:5: lv_square_3_0= ruleSquare
            {

            					newCompositeNode(grammarAccess.getPlacementAccess().getSquareSquareParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_square_3_0=ruleSquare();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlacementRule());
            					}
            					set(
            						current,
            						"square",
            						lv_square_3_0,
            						"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.Square");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlacement"


    // $ANTLR start "entryRuleCustomPiece"
    // InternalChessDSL.g:479:1: entryRuleCustomPiece returns [EObject current=null] : iv_ruleCustomPiece= ruleCustomPiece EOF ;
    public final EObject entryRuleCustomPiece() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomPiece = null;


        try {
            // InternalChessDSL.g:479:52: (iv_ruleCustomPiece= ruleCustomPiece EOF )
            // InternalChessDSL.g:480:2: iv_ruleCustomPiece= ruleCustomPiece EOF
            {
             newCompositeNode(grammarAccess.getCustomPieceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomPiece=ruleCustomPiece();

            state._fsp--;

             current =iv_ruleCustomPiece; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomPiece"


    // $ANTLR start "ruleCustomPiece"
    // InternalChessDSL.g:486:1: ruleCustomPiece returns [EObject current=null] : ( ( (lv_color_0_0= ruleColor ) ) ( (lv_kind_1_0= rulePiece ) ) ) ;
    public final EObject ruleCustomPiece() throws RecognitionException {
        EObject current = null;

        Enumerator lv_color_0_0 = null;

        Enumerator lv_kind_1_0 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:492:2: ( ( ( (lv_color_0_0= ruleColor ) ) ( (lv_kind_1_0= rulePiece ) ) ) )
            // InternalChessDSL.g:493:2: ( ( (lv_color_0_0= ruleColor ) ) ( (lv_kind_1_0= rulePiece ) ) )
            {
            // InternalChessDSL.g:493:2: ( ( (lv_color_0_0= ruleColor ) ) ( (lv_kind_1_0= rulePiece ) ) )
            // InternalChessDSL.g:494:3: ( (lv_color_0_0= ruleColor ) ) ( (lv_kind_1_0= rulePiece ) )
            {
            // InternalChessDSL.g:494:3: ( (lv_color_0_0= ruleColor ) )
            // InternalChessDSL.g:495:4: (lv_color_0_0= ruleColor )
            {
            // InternalChessDSL.g:495:4: (lv_color_0_0= ruleColor )
            // InternalChessDSL.g:496:5: lv_color_0_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getCustomPieceAccess().getColorColorEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_color_0_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomPieceRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_0_0,
            						"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalChessDSL.g:513:3: ( (lv_kind_1_0= rulePiece ) )
            // InternalChessDSL.g:514:4: (lv_kind_1_0= rulePiece )
            {
            // InternalChessDSL.g:514:4: (lv_kind_1_0= rulePiece )
            // InternalChessDSL.g:515:5: lv_kind_1_0= rulePiece
            {

            					newCompositeNode(grammarAccess.getCustomPieceAccess().getKindPieceEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_kind_1_0=rulePiece();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomPieceRule());
            					}
            					set(
            						current,
            						"kind",
            						lv_kind_1_0,
            						"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.Piece");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomPiece"


    // $ANTLR start "entryRuleMovePair"
    // InternalChessDSL.g:536:1: entryRuleMovePair returns [EObject current=null] : iv_ruleMovePair= ruleMovePair EOF ;
    public final EObject entryRuleMovePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMovePair = null;


        try {
            // InternalChessDSL.g:536:49: (iv_ruleMovePair= ruleMovePair EOF )
            // InternalChessDSL.g:537:2: iv_ruleMovePair= ruleMovePair EOF
            {
             newCompositeNode(grammarAccess.getMovePairRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMovePair=ruleMovePair();

            state._fsp--;

             current =iv_ruleMovePair; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMovePair"


    // $ANTLR start "ruleMovePair"
    // InternalChessDSL.g:543:1: ruleMovePair returns [EObject current=null] : ( ( (lv_moveNumber_0_0= RULE_MOVENUMBER ) ) ( ( ( (otherlv_1= RULE_ID ) )? ( (lv_whiteMove_2_0= ruleAnyMove ) ) ) | otherlv_3= '...' ) ( ( (otherlv_4= RULE_ID ) )? ( (lv_blackMove_5_0= ruleAnyMove ) ) )? ) ;
    public final EObject ruleMovePair() throws RecognitionException {
        EObject current = null;

        Token lv_moveNumber_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_whiteMove_2_0 = null;

        EObject lv_blackMove_5_0 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:549:2: ( ( ( (lv_moveNumber_0_0= RULE_MOVENUMBER ) ) ( ( ( (otherlv_1= RULE_ID ) )? ( (lv_whiteMove_2_0= ruleAnyMove ) ) ) | otherlv_3= '...' ) ( ( (otherlv_4= RULE_ID ) )? ( (lv_blackMove_5_0= ruleAnyMove ) ) )? ) )
            // InternalChessDSL.g:550:2: ( ( (lv_moveNumber_0_0= RULE_MOVENUMBER ) ) ( ( ( (otherlv_1= RULE_ID ) )? ( (lv_whiteMove_2_0= ruleAnyMove ) ) ) | otherlv_3= '...' ) ( ( (otherlv_4= RULE_ID ) )? ( (lv_blackMove_5_0= ruleAnyMove ) ) )? )
            {
            // InternalChessDSL.g:550:2: ( ( (lv_moveNumber_0_0= RULE_MOVENUMBER ) ) ( ( ( (otherlv_1= RULE_ID ) )? ( (lv_whiteMove_2_0= ruleAnyMove ) ) ) | otherlv_3= '...' ) ( ( (otherlv_4= RULE_ID ) )? ( (lv_blackMove_5_0= ruleAnyMove ) ) )? )
            // InternalChessDSL.g:551:3: ( (lv_moveNumber_0_0= RULE_MOVENUMBER ) ) ( ( ( (otherlv_1= RULE_ID ) )? ( (lv_whiteMove_2_0= ruleAnyMove ) ) ) | otherlv_3= '...' ) ( ( (otherlv_4= RULE_ID ) )? ( (lv_blackMove_5_0= ruleAnyMove ) ) )?
            {
            // InternalChessDSL.g:551:3: ( (lv_moveNumber_0_0= RULE_MOVENUMBER ) )
            // InternalChessDSL.g:552:4: (lv_moveNumber_0_0= RULE_MOVENUMBER )
            {
            // InternalChessDSL.g:552:4: (lv_moveNumber_0_0= RULE_MOVENUMBER )
            // InternalChessDSL.g:553:5: lv_moveNumber_0_0= RULE_MOVENUMBER
            {
            lv_moveNumber_0_0=(Token)match(input,RULE_MOVENUMBER,FOLLOW_19); 

            					newLeafNode(lv_moveNumber_0_0, grammarAccess.getMovePairAccess().getMoveNumberMOVENUMBERTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMovePairRule());
            					}
            					setWithLastConsumed(
            						current,
            						"moveNumber",
            						lv_moveNumber_0_0,
            						"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.MOVENUMBER");
            				

            }


            }

            // InternalChessDSL.g:569:3: ( ( ( (otherlv_1= RULE_ID ) )? ( (lv_whiteMove_2_0= ruleAnyMove ) ) ) | otherlv_3= '...' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||(LA10_0>=29 && LA10_0<=30)||LA10_0==37||LA10_0==40||(LA10_0>=75 && LA10_0<=80)) ) {
                alt10=1;
            }
            else if ( (LA10_0==26) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalChessDSL.g:570:4: ( ( (otherlv_1= RULE_ID ) )? ( (lv_whiteMove_2_0= ruleAnyMove ) ) )
                    {
                    // InternalChessDSL.g:570:4: ( ( (otherlv_1= RULE_ID ) )? ( (lv_whiteMove_2_0= ruleAnyMove ) ) )
                    // InternalChessDSL.g:571:5: ( (otherlv_1= RULE_ID ) )? ( (lv_whiteMove_2_0= ruleAnyMove ) )
                    {
                    // InternalChessDSL.g:571:5: ( (otherlv_1= RULE_ID ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_ID) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalChessDSL.g:572:6: (otherlv_1= RULE_ID )
                            {
                            // InternalChessDSL.g:572:6: (otherlv_1= RULE_ID )
                            // InternalChessDSL.g:573:7: otherlv_1= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMovePairRule());
                            							}
                            						
                            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_20); 

                            							newLeafNode(otherlv_1, grammarAccess.getMovePairAccess().getColor1PlayerCrossReference_1_0_0_0());
                            						

                            }


                            }
                            break;

                    }

                    // InternalChessDSL.g:584:5: ( (lv_whiteMove_2_0= ruleAnyMove ) )
                    // InternalChessDSL.g:585:6: (lv_whiteMove_2_0= ruleAnyMove )
                    {
                    // InternalChessDSL.g:585:6: (lv_whiteMove_2_0= ruleAnyMove )
                    // InternalChessDSL.g:586:7: lv_whiteMove_2_0= ruleAnyMove
                    {

                    							newCompositeNode(grammarAccess.getMovePairAccess().getWhiteMoveAnyMoveParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_21);
                    lv_whiteMove_2_0=ruleAnyMove();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getMovePairRule());
                    							}
                    							set(
                    								current,
                    								"whiteMove",
                    								lv_whiteMove_2_0,
                    								"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.AnyMove");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:605:4: otherlv_3= '...'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getMovePairAccess().getFullStopFullStopFullStopKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalChessDSL.g:610:3: ( ( (otherlv_4= RULE_ID ) )? ( (lv_blackMove_5_0= ruleAnyMove ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||(LA12_0>=29 && LA12_0<=30)||LA12_0==37||LA12_0==40||(LA12_0>=75 && LA12_0<=80)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalChessDSL.g:611:4: ( (otherlv_4= RULE_ID ) )? ( (lv_blackMove_5_0= ruleAnyMove ) )
                    {
                    // InternalChessDSL.g:611:4: ( (otherlv_4= RULE_ID ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_ID) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalChessDSL.g:612:5: (otherlv_4= RULE_ID )
                            {
                            // InternalChessDSL.g:612:5: (otherlv_4= RULE_ID )
                            // InternalChessDSL.g:613:6: otherlv_4= RULE_ID
                            {

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getMovePairRule());
                            						}
                            					
                            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_20); 

                            						newLeafNode(otherlv_4, grammarAccess.getMovePairAccess().getColor2PlayerCrossReference_2_0_0());
                            					

                            }


                            }
                            break;

                    }

                    // InternalChessDSL.g:624:4: ( (lv_blackMove_5_0= ruleAnyMove ) )
                    // InternalChessDSL.g:625:5: (lv_blackMove_5_0= ruleAnyMove )
                    {
                    // InternalChessDSL.g:625:5: (lv_blackMove_5_0= ruleAnyMove )
                    // InternalChessDSL.g:626:6: lv_blackMove_5_0= ruleAnyMove
                    {

                    						newCompositeNode(grammarAccess.getMovePairAccess().getBlackMoveAnyMoveParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_blackMove_5_0=ruleAnyMove();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMovePairRule());
                    						}
                    						set(
                    							current,
                    							"blackMove",
                    							lv_blackMove_5_0,
                    							"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.AnyMove");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMovePair"


    // $ANTLR start "entryRuleAnyMove"
    // InternalChessDSL.g:648:1: entryRuleAnyMove returns [EObject current=null] : iv_ruleAnyMove= ruleAnyMove EOF ;
    public final EObject entryRuleAnyMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyMove = null;


        try {
            // InternalChessDSL.g:648:48: (iv_ruleAnyMove= ruleAnyMove EOF )
            // InternalChessDSL.g:649:2: iv_ruleAnyMove= ruleAnyMove EOF
            {
             newCompositeNode(grammarAccess.getAnyMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnyMove=ruleAnyMove();

            state._fsp--;

             current =iv_ruleAnyMove; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnyMove"


    // $ANTLR start "ruleAnyMove"
    // InternalChessDSL.g:655:1: ruleAnyMove returns [EObject current=null] : ( ( (lv_move_0_0= ruleDSLMove ) ) (otherlv_1= '(' ( (lv_remarks_2_0= ruleRemark ) )* otherlv_3= ')' )? ) ;
    public final EObject ruleAnyMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_move_0_0 = null;

        Enumerator lv_remarks_2_0 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:661:2: ( ( ( (lv_move_0_0= ruleDSLMove ) ) (otherlv_1= '(' ( (lv_remarks_2_0= ruleRemark ) )* otherlv_3= ')' )? ) )
            // InternalChessDSL.g:662:2: ( ( (lv_move_0_0= ruleDSLMove ) ) (otherlv_1= '(' ( (lv_remarks_2_0= ruleRemark ) )* otherlv_3= ')' )? )
            {
            // InternalChessDSL.g:662:2: ( ( (lv_move_0_0= ruleDSLMove ) ) (otherlv_1= '(' ( (lv_remarks_2_0= ruleRemark ) )* otherlv_3= ')' )? )
            // InternalChessDSL.g:663:3: ( (lv_move_0_0= ruleDSLMove ) ) (otherlv_1= '(' ( (lv_remarks_2_0= ruleRemark ) )* otherlv_3= ')' )?
            {
            // InternalChessDSL.g:663:3: ( (lv_move_0_0= ruleDSLMove ) )
            // InternalChessDSL.g:664:4: (lv_move_0_0= ruleDSLMove )
            {
            // InternalChessDSL.g:664:4: (lv_move_0_0= ruleDSLMove )
            // InternalChessDSL.g:665:5: lv_move_0_0= ruleDSLMove
            {

            					newCompositeNode(grammarAccess.getAnyMoveAccess().getMoveDSLMoveParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_move_0_0=ruleDSLMove();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnyMoveRule());
            					}
            					set(
            						current,
            						"move",
            						lv_move_0_0,
            						"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.DSLMove");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalChessDSL.g:682:3: (otherlv_1= '(' ( (lv_remarks_2_0= ruleRemark ) )* otherlv_3= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalChessDSL.g:683:4: otherlv_1= '(' ( (lv_remarks_2_0= ruleRemark ) )* otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getAnyMoveAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalChessDSL.g:687:4: ( (lv_remarks_2_0= ruleRemark ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>=66 && LA13_0<=72)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalChessDSL.g:688:5: (lv_remarks_2_0= ruleRemark )
                    	    {
                    	    // InternalChessDSL.g:688:5: (lv_remarks_2_0= ruleRemark )
                    	    // InternalChessDSL.g:689:6: lv_remarks_2_0= ruleRemark
                    	    {

                    	    						newCompositeNode(grammarAccess.getAnyMoveAccess().getRemarksRemarkEnumRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_23);
                    	    lv_remarks_2_0=ruleRemark();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAnyMoveRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"remarks",
                    	    							lv_remarks_2_0,
                    	    							"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.Remark");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getAnyMoveAccess().getRightParenthesisKeyword_1_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnyMove"


    // $ANTLR start "entryRuleDSLMove"
    // InternalChessDSL.g:715:1: entryRuleDSLMove returns [EObject current=null] : iv_ruleDSLMove= ruleDSLMove EOF ;
    public final EObject entryRuleDSLMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLMove = null;


        try {
            // InternalChessDSL.g:715:48: (iv_ruleDSLMove= ruleDSLMove EOF )
            // InternalChessDSL.g:716:2: iv_ruleDSLMove= ruleDSLMove EOF
            {
             newCompositeNode(grammarAccess.getDSLMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSLMove=ruleDSLMove();

            state._fsp--;

             current =iv_ruleDSLMove; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSLMove"


    // $ANTLR start "ruleDSLMove"
    // InternalChessDSL.g:722:1: ruleDSLMove returns [EObject current=null] : (this_Move_0= ruleMove | this_Capture_1= ruleCapture | this_Castle_2= ruleCastle | this_EnPassant_3= ruleEnPassant | this_Promotion_4= rulePromotion | ruleDummy ) ;
    public final EObject ruleDSLMove() throws RecognitionException {
        EObject current = null;

        EObject this_Move_0 = null;

        EObject this_Capture_1 = null;

        EObject this_Castle_2 = null;

        EObject this_EnPassant_3 = null;

        EObject this_Promotion_4 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:728:2: ( (this_Move_0= ruleMove | this_Capture_1= ruleCapture | this_Castle_2= ruleCastle | this_EnPassant_3= ruleEnPassant | this_Promotion_4= rulePromotion | ruleDummy ) )
            // InternalChessDSL.g:729:2: (this_Move_0= ruleMove | this_Capture_1= ruleCapture | this_Castle_2= ruleCastle | this_EnPassant_3= ruleEnPassant | this_Promotion_4= rulePromotion | ruleDummy )
            {
            // InternalChessDSL.g:729:2: (this_Move_0= ruleMove | this_Capture_1= ruleCapture | this_Castle_2= ruleCastle | this_EnPassant_3= ruleEnPassant | this_Promotion_4= rulePromotion | ruleDummy )
            int alt15=6;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalChessDSL.g:730:3: this_Move_0= ruleMove
                    {

                    			newCompositeNode(grammarAccess.getDSLMoveAccess().getMoveParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Move_0=ruleMove();

                    state._fsp--;


                    			current = this_Move_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:739:3: this_Capture_1= ruleCapture
                    {

                    			newCompositeNode(grammarAccess.getDSLMoveAccess().getCaptureParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Capture_1=ruleCapture();

                    state._fsp--;


                    			current = this_Capture_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalChessDSL.g:748:3: this_Castle_2= ruleCastle
                    {

                    			newCompositeNode(grammarAccess.getDSLMoveAccess().getCastleParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Castle_2=ruleCastle();

                    state._fsp--;


                    			current = this_Castle_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalChessDSL.g:757:3: this_EnPassant_3= ruleEnPassant
                    {

                    			newCompositeNode(grammarAccess.getDSLMoveAccess().getEnPassantParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnPassant_3=ruleEnPassant();

                    state._fsp--;


                    			current = this_EnPassant_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalChessDSL.g:766:3: this_Promotion_4= rulePromotion
                    {

                    			newCompositeNode(grammarAccess.getDSLMoveAccess().getPromotionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Promotion_4=rulePromotion();

                    state._fsp--;


                    			current = this_Promotion_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalChessDSL.g:775:3: ruleDummy
                    {

                    			newCompositeNode(grammarAccess.getDSLMoveAccess().getDummyParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    ruleDummy();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSLMove"


    // $ANTLR start "entryRuleDummy"
    // InternalChessDSL.g:786:1: entryRuleDummy returns [String current=null] : iv_ruleDummy= ruleDummy EOF ;
    public final String entryRuleDummy() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDummy = null;


        try {
            // InternalChessDSL.g:786:45: (iv_ruleDummy= ruleDummy EOF )
            // InternalChessDSL.g:787:2: iv_ruleDummy= ruleDummy EOF
            {
             newCompositeNode(grammarAccess.getDummyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDummy=ruleDummy();

            state._fsp--;

             current =iv_ruleDummy.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDummy"


    // $ANTLR start "ruleDummy"
    // InternalChessDSL.g:793:1: ruleDummy returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'dummy' ;
    public final AntlrDatatypeRuleToken ruleDummy() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalChessDSL.g:799:2: (kw= 'dummy' )
            // InternalChessDSL.g:800:2: kw= 'dummy'
            {
            kw=(Token)match(input,29,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getDummyAccess().getDummyKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDummy"


    // $ANTLR start "entryRuleMove"
    // InternalChessDSL.g:808:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalChessDSL.g:808:45: (iv_ruleMove= ruleMove EOF )
            // InternalChessDSL.g:809:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalChessDSL.g:815:1: ruleMove returns [EObject current=null] : ( (otherlv_0= 'moves' )? ( (lv_piece_1_0= rulePiece ) ) ( (otherlv_2= '(' ( (lv_from_3_0= ruleSquare ) ) otherlv_4= '->' ( (lv_to_5_0= ruleSquare ) ) otherlv_6= ')' ) | (otherlv_7= 'from' ( (lv_from_8_0= ruleSquare ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleSquare ) ) ) ) ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_piece_1_0 = null;

        AntlrDatatypeRuleToken lv_from_3_0 = null;

        AntlrDatatypeRuleToken lv_to_5_0 = null;

        AntlrDatatypeRuleToken lv_from_8_0 = null;

        AntlrDatatypeRuleToken lv_to_10_0 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:821:2: ( ( (otherlv_0= 'moves' )? ( (lv_piece_1_0= rulePiece ) ) ( (otherlv_2= '(' ( (lv_from_3_0= ruleSquare ) ) otherlv_4= '->' ( (lv_to_5_0= ruleSquare ) ) otherlv_6= ')' ) | (otherlv_7= 'from' ( (lv_from_8_0= ruleSquare ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleSquare ) ) ) ) ) )
            // InternalChessDSL.g:822:2: ( (otherlv_0= 'moves' )? ( (lv_piece_1_0= rulePiece ) ) ( (otherlv_2= '(' ( (lv_from_3_0= ruleSquare ) ) otherlv_4= '->' ( (lv_to_5_0= ruleSquare ) ) otherlv_6= ')' ) | (otherlv_7= 'from' ( (lv_from_8_0= ruleSquare ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleSquare ) ) ) ) )
            {
            // InternalChessDSL.g:822:2: ( (otherlv_0= 'moves' )? ( (lv_piece_1_0= rulePiece ) ) ( (otherlv_2= '(' ( (lv_from_3_0= ruleSquare ) ) otherlv_4= '->' ( (lv_to_5_0= ruleSquare ) ) otherlv_6= ')' ) | (otherlv_7= 'from' ( (lv_from_8_0= ruleSquare ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleSquare ) ) ) ) )
            // InternalChessDSL.g:823:3: (otherlv_0= 'moves' )? ( (lv_piece_1_0= rulePiece ) ) ( (otherlv_2= '(' ( (lv_from_3_0= ruleSquare ) ) otherlv_4= '->' ( (lv_to_5_0= ruleSquare ) ) otherlv_6= ')' ) | (otherlv_7= 'from' ( (lv_from_8_0= ruleSquare ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleSquare ) ) ) )
            {
            // InternalChessDSL.g:823:3: (otherlv_0= 'moves' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalChessDSL.g:824:4: otherlv_0= 'moves'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_18); 

                    				newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getMovesKeyword_0());
                    			

                    }
                    break;

            }

            // InternalChessDSL.g:829:3: ( (lv_piece_1_0= rulePiece ) )
            // InternalChessDSL.g:830:4: (lv_piece_1_0= rulePiece )
            {
            // InternalChessDSL.g:830:4: (lv_piece_1_0= rulePiece )
            // InternalChessDSL.g:831:5: lv_piece_1_0= rulePiece
            {

            					newCompositeNode(grammarAccess.getMoveAccess().getPiecePieceEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_piece_1_0=rulePiece();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveRule());
            					}
            					set(
            						current,
            						"piece",
            						lv_piece_1_0,
            						"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.Piece");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalChessDSL.g:848:3: ( (otherlv_2= '(' ( (lv_from_3_0= ruleSquare ) ) otherlv_4= '->' ( (lv_to_5_0= ruleSquare ) ) otherlv_6= ')' ) | (otherlv_7= 'from' ( (lv_from_8_0= ruleSquare ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleSquare ) ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            else if ( (LA17_0==32) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalChessDSL.g:849:4: (otherlv_2= '(' ( (lv_from_3_0= ruleSquare ) ) otherlv_4= '->' ( (lv_to_5_0= ruleSquare ) ) otherlv_6= ')' )
                    {
                    // InternalChessDSL.g:849:4: (otherlv_2= '(' ( (lv_from_3_0= ruleSquare ) ) otherlv_4= '->' ( (lv_to_5_0= ruleSquare ) ) otherlv_6= ')' )
                    // InternalChessDSL.g:850:5: otherlv_2= '(' ( (lv_from_3_0= ruleSquare ) ) otherlv_4= '->' ( (lv_to_5_0= ruleSquare ) ) otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_17); 

                    					newLeafNode(otherlv_2, grammarAccess.getMoveAccess().getLeftParenthesisKeyword_2_0_0());
                    				
                    // InternalChessDSL.g:854:5: ( (lv_from_3_0= ruleSquare ) )
                    // InternalChessDSL.g:855:6: (lv_from_3_0= ruleSquare )
                    {
                    // InternalChessDSL.g:855:6: (lv_from_3_0= ruleSquare )
                    // InternalChessDSL.g:856:7: lv_from_3_0= ruleSquare
                    {

                    							newCompositeNode(grammarAccess.getMoveAccess().getFromSquareParserRuleCall_2_0_1_0());
                    						
                    pushFollow(FOLLOW_25);
                    lv_from_3_0=ruleSquare();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getMoveRule());
                    							}
                    							set(
                    								current,
                    								"from",
                    								lv_from_3_0,
                    								"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.Square");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,31,FOLLOW_17); 

                    					newLeafNode(otherlv_4, grammarAccess.getMoveAccess().getHyphenMinusGreaterThanSignKeyword_2_0_2());
                    				
                    // InternalChessDSL.g:877:5: ( (lv_to_5_0= ruleSquare ) )
                    // InternalChessDSL.g:878:6: (lv_to_5_0= ruleSquare )
                    {
                    // InternalChessDSL.g:878:6: (lv_to_5_0= ruleSquare )
                    // InternalChessDSL.g:879:7: lv_to_5_0= ruleSquare
                    {

                    							newCompositeNode(grammarAccess.getMoveAccess().getToSquareParserRuleCall_2_0_3_0());
                    						
                    pushFollow(FOLLOW_26);
                    lv_to_5_0=ruleSquare();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getMoveRule());
                    							}
                    							set(
                    								current,
                    								"to",
                    								lv_to_5_0,
                    								"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.Square");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_6=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(otherlv_6, grammarAccess.getMoveAccess().getRightParenthesisKeyword_2_0_4());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:902:4: (otherlv_7= 'from' ( (lv_from_8_0= ruleSquare ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleSquare ) ) )
                    {
                    // InternalChessDSL.g:902:4: (otherlv_7= 'from' ( (lv_from_8_0= ruleSquare ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleSquare ) ) )
                    // InternalChessDSL.g:903:5: otherlv_7= 'from' ( (lv_from_8_0= ruleSquare ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleSquare ) )
                    {
                    otherlv_7=(Token)match(input,32,FOLLOW_17); 

                    					newLeafNode(otherlv_7, grammarAccess.getMoveAccess().getFromKeyword_2_1_0());
                    				
                    // InternalChessDSL.g:907:5: ( (lv_from_8_0= ruleSquare ) )
                    // InternalChessDSL.g:908:6: (lv_from_8_0= ruleSquare )
                    {
                    // InternalChessDSL.g:908:6: (lv_from_8_0= ruleSquare )
                    // InternalChessDSL.g:909:7: lv_from_8_0= ruleSquare
                    {

                    							newCompositeNode(grammarAccess.getMoveAccess().getFromSquareParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_27);
                    lv_from_8_0=ruleSquare();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getMoveRule());
                    							}
                    							set(
                    								current,
                    								"from",
                    								lv_from_8_0,
                    								"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.Square");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_9=(Token)match(input,33,FOLLOW_17); 

                    					newLeafNode(otherlv_9, grammarAccess.getMoveAccess().getToKeyword_2_1_2());
                    				
                    // InternalChessDSL.g:930:5: ( (lv_to_10_0= ruleSquare ) )
                    // InternalChessDSL.g:931:6: (lv_to_10_0= ruleSquare )
                    {
                    // InternalChessDSL.g:931:6: (lv_to_10_0= ruleSquare )
                    // InternalChessDSL.g:932:7: lv_to_10_0= ruleSquare
                    {

                    							newCompositeNode(grammarAccess.getMoveAccess().getToSquareParserRuleCall_2_1_3_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_to_10_0=ruleSquare();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getMoveRule());
                    							}
                    							set(
                    								current,
                    								"to",
                    								lv_to_10_0,
                    								"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.Square");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleCapture"
    // InternalChessDSL.g:955:1: entryRuleCapture returns [EObject current=null] : iv_ruleCapture= ruleCapture EOF ;
    public final EObject entryRuleCapture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapture = null;


        try {
            // InternalChessDSL.g:955:48: (iv_ruleCapture= ruleCapture EOF )
            // InternalChessDSL.g:956:2: iv_ruleCapture= ruleCapture EOF
            {
             newCompositeNode(grammarAccess.getCaptureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCapture=ruleCapture();

            state._fsp--;

             current =iv_ruleCapture; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCapture"


    // $ANTLR start "ruleCapture"
    // InternalChessDSL.g:962:1: ruleCapture returns [EObject current=null] : ( ( (lv_move_0_0= ruleMove ) ) ( (otherlv_1= 'Capture(' ( (lv_capture_2_0= rulePiece ) ) otherlv_3= ')' ) | ( (otherlv_4= 'and' )? otherlv_5= 'captures' ( (lv_capture_6_0= rulePiece ) ) ) ) ) ;
    public final EObject ruleCapture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_move_0_0 = null;

        Enumerator lv_capture_2_0 = null;

        Enumerator lv_capture_6_0 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:968:2: ( ( ( (lv_move_0_0= ruleMove ) ) ( (otherlv_1= 'Capture(' ( (lv_capture_2_0= rulePiece ) ) otherlv_3= ')' ) | ( (otherlv_4= 'and' )? otherlv_5= 'captures' ( (lv_capture_6_0= rulePiece ) ) ) ) ) )
            // InternalChessDSL.g:969:2: ( ( (lv_move_0_0= ruleMove ) ) ( (otherlv_1= 'Capture(' ( (lv_capture_2_0= rulePiece ) ) otherlv_3= ')' ) | ( (otherlv_4= 'and' )? otherlv_5= 'captures' ( (lv_capture_6_0= rulePiece ) ) ) ) )
            {
            // InternalChessDSL.g:969:2: ( ( (lv_move_0_0= ruleMove ) ) ( (otherlv_1= 'Capture(' ( (lv_capture_2_0= rulePiece ) ) otherlv_3= ')' ) | ( (otherlv_4= 'and' )? otherlv_5= 'captures' ( (lv_capture_6_0= rulePiece ) ) ) ) )
            // InternalChessDSL.g:970:3: ( (lv_move_0_0= ruleMove ) ) ( (otherlv_1= 'Capture(' ( (lv_capture_2_0= rulePiece ) ) otherlv_3= ')' ) | ( (otherlv_4= 'and' )? otherlv_5= 'captures' ( (lv_capture_6_0= rulePiece ) ) ) )
            {
            // InternalChessDSL.g:970:3: ( (lv_move_0_0= ruleMove ) )
            // InternalChessDSL.g:971:4: (lv_move_0_0= ruleMove )
            {
            // InternalChessDSL.g:971:4: (lv_move_0_0= ruleMove )
            // InternalChessDSL.g:972:5: lv_move_0_0= ruleMove
            {

            					newCompositeNode(grammarAccess.getCaptureAccess().getMoveMoveParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_28);
            lv_move_0_0=ruleMove();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCaptureRule());
            					}
            					set(
            						current,
            						"move",
            						lv_move_0_0,
            						"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.Move");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalChessDSL.g:989:3: ( (otherlv_1= 'Capture(' ( (lv_capture_2_0= rulePiece ) ) otherlv_3= ')' ) | ( (otherlv_4= 'and' )? otherlv_5= 'captures' ( (lv_capture_6_0= rulePiece ) ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=35 && LA19_0<=36)) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalChessDSL.g:990:4: (otherlv_1= 'Capture(' ( (lv_capture_2_0= rulePiece ) ) otherlv_3= ')' )
                    {
                    // InternalChessDSL.g:990:4: (otherlv_1= 'Capture(' ( (lv_capture_2_0= rulePiece ) ) otherlv_3= ')' )
                    // InternalChessDSL.g:991:5: otherlv_1= 'Capture(' ( (lv_capture_2_0= rulePiece ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_18); 

                    					newLeafNode(otherlv_1, grammarAccess.getCaptureAccess().getCaptureKeyword_1_0_0());
                    				
                    // InternalChessDSL.g:995:5: ( (lv_capture_2_0= rulePiece ) )
                    // InternalChessDSL.g:996:6: (lv_capture_2_0= rulePiece )
                    {
                    // InternalChessDSL.g:996:6: (lv_capture_2_0= rulePiece )
                    // InternalChessDSL.g:997:7: lv_capture_2_0= rulePiece
                    {

                    							newCompositeNode(grammarAccess.getCaptureAccess().getCapturePieceEnumRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_26);
                    lv_capture_2_0=rulePiece();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCaptureRule());
                    							}
                    							set(
                    								current,
                    								"capture",
                    								lv_capture_2_0,
                    								"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.Piece");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(otherlv_3, grammarAccess.getCaptureAccess().getRightParenthesisKeyword_1_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1020:4: ( (otherlv_4= 'and' )? otherlv_5= 'captures' ( (lv_capture_6_0= rulePiece ) ) )
                    {
                    // InternalChessDSL.g:1020:4: ( (otherlv_4= 'and' )? otherlv_5= 'captures' ( (lv_capture_6_0= rulePiece ) ) )
                    // InternalChessDSL.g:1021:5: (otherlv_4= 'and' )? otherlv_5= 'captures' ( (lv_capture_6_0= rulePiece ) )
                    {
                    // InternalChessDSL.g:1021:5: (otherlv_4= 'and' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==35) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalChessDSL.g:1022:6: otherlv_4= 'and'
                            {
                            otherlv_4=(Token)match(input,35,FOLLOW_29); 

                            						newLeafNode(otherlv_4, grammarAccess.getCaptureAccess().getAndKeyword_1_1_0());
                            					

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,36,FOLLOW_18); 

                    					newLeafNode(otherlv_5, grammarAccess.getCaptureAccess().getCapturesKeyword_1_1_1());
                    				
                    // InternalChessDSL.g:1031:5: ( (lv_capture_6_0= rulePiece ) )
                    // InternalChessDSL.g:1032:6: (lv_capture_6_0= rulePiece )
                    {
                    // InternalChessDSL.g:1032:6: (lv_capture_6_0= rulePiece )
                    // InternalChessDSL.g:1033:7: lv_capture_6_0= rulePiece
                    {

                    							newCompositeNode(grammarAccess.getCaptureAccess().getCapturePieceEnumRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_capture_6_0=rulePiece();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCaptureRule());
                    							}
                    							set(
                    								current,
                    								"capture",
                    								lv_capture_6_0,
                    								"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.Piece");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCapture"


    // $ANTLR start "entryRuleCastle"
    // InternalChessDSL.g:1056:1: entryRuleCastle returns [EObject current=null] : iv_ruleCastle= ruleCastle EOF ;
    public final EObject entryRuleCastle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCastle = null;


        try {
            // InternalChessDSL.g:1056:47: (iv_ruleCastle= ruleCastle EOF )
            // InternalChessDSL.g:1057:2: iv_ruleCastle= ruleCastle EOF
            {
             newCompositeNode(grammarAccess.getCastleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCastle=ruleCastle();

            state._fsp--;

             current =iv_ruleCastle; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCastle"


    // $ANTLR start "ruleCastle"
    // InternalChessDSL.g:1063:1: ruleCastle returns [EObject current=null] : ( (otherlv_0= 'Castle(' (otherlv_1= 'Kingside' | otherlv_2= 'Queenside' ) otherlv_3= ')' ) | (otherlv_4= 'castles' (otherlv_5= 'on' otherlv_6= 'the' )? (otherlv_7= 'Kingside' | otherlv_8= 'Queenside' ) ) | ( ( (lv_move_9_0= ruleMove ) ) otherlv_10= 'Castle()' ) | ( ( (lv_move_11_0= ruleMove ) ) otherlv_12= 'and' otherlv_13= 'castles' ) ) ;
    public final EObject ruleCastle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_move_9_0 = null;

        EObject lv_move_11_0 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:1069:2: ( ( (otherlv_0= 'Castle(' (otherlv_1= 'Kingside' | otherlv_2= 'Queenside' ) otherlv_3= ')' ) | (otherlv_4= 'castles' (otherlv_5= 'on' otherlv_6= 'the' )? (otherlv_7= 'Kingside' | otherlv_8= 'Queenside' ) ) | ( ( (lv_move_9_0= ruleMove ) ) otherlv_10= 'Castle()' ) | ( ( (lv_move_11_0= ruleMove ) ) otherlv_12= 'and' otherlv_13= 'castles' ) ) )
            // InternalChessDSL.g:1070:2: ( (otherlv_0= 'Castle(' (otherlv_1= 'Kingside' | otherlv_2= 'Queenside' ) otherlv_3= ')' ) | (otherlv_4= 'castles' (otherlv_5= 'on' otherlv_6= 'the' )? (otherlv_7= 'Kingside' | otherlv_8= 'Queenside' ) ) | ( ( (lv_move_9_0= ruleMove ) ) otherlv_10= 'Castle()' ) | ( ( (lv_move_11_0= ruleMove ) ) otherlv_12= 'and' otherlv_13= 'castles' ) )
            {
            // InternalChessDSL.g:1070:2: ( (otherlv_0= 'Castle(' (otherlv_1= 'Kingside' | otherlv_2= 'Queenside' ) otherlv_3= ')' ) | (otherlv_4= 'castles' (otherlv_5= 'on' otherlv_6= 'the' )? (otherlv_7= 'Kingside' | otherlv_8= 'Queenside' ) ) | ( ( (lv_move_9_0= ruleMove ) ) otherlv_10= 'Castle()' ) | ( ( (lv_move_11_0= ruleMove ) ) otherlv_12= 'and' otherlv_13= 'castles' ) )
            int alt23=4;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalChessDSL.g:1071:3: (otherlv_0= 'Castle(' (otherlv_1= 'Kingside' | otherlv_2= 'Queenside' ) otherlv_3= ')' )
                    {
                    // InternalChessDSL.g:1071:3: (otherlv_0= 'Castle(' (otherlv_1= 'Kingside' | otherlv_2= 'Queenside' ) otherlv_3= ')' )
                    // InternalChessDSL.g:1072:4: otherlv_0= 'Castle(' (otherlv_1= 'Kingside' | otherlv_2= 'Queenside' ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_30); 

                    				newLeafNode(otherlv_0, grammarAccess.getCastleAccess().getCastleKeyword_0_0());
                    			
                    // InternalChessDSL.g:1076:4: (otherlv_1= 'Kingside' | otherlv_2= 'Queenside' )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==38) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==39) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalChessDSL.g:1077:5: otherlv_1= 'Kingside'
                            {
                            otherlv_1=(Token)match(input,38,FOLLOW_26); 

                            					newLeafNode(otherlv_1, grammarAccess.getCastleAccess().getKingsideKeyword_0_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalChessDSL.g:1082:5: otherlv_2= 'Queenside'
                            {
                            otherlv_2=(Token)match(input,39,FOLLOW_26); 

                            					newLeafNode(otherlv_2, grammarAccess.getCastleAccess().getQueensideKeyword_0_1_1());
                            				

                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getCastleAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1093:3: (otherlv_4= 'castles' (otherlv_5= 'on' otherlv_6= 'the' )? (otherlv_7= 'Kingside' | otherlv_8= 'Queenside' ) )
                    {
                    // InternalChessDSL.g:1093:3: (otherlv_4= 'castles' (otherlv_5= 'on' otherlv_6= 'the' )? (otherlv_7= 'Kingside' | otherlv_8= 'Queenside' ) )
                    // InternalChessDSL.g:1094:4: otherlv_4= 'castles' (otherlv_5= 'on' otherlv_6= 'the' )? (otherlv_7= 'Kingside' | otherlv_8= 'Queenside' )
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_31); 

                    				newLeafNode(otherlv_4, grammarAccess.getCastleAccess().getCastlesKeyword_1_0());
                    			
                    // InternalChessDSL.g:1098:4: (otherlv_5= 'on' otherlv_6= 'the' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==25) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalChessDSL.g:1099:5: otherlv_5= 'on' otherlv_6= 'the'
                            {
                            otherlv_5=(Token)match(input,25,FOLLOW_32); 

                            					newLeafNode(otherlv_5, grammarAccess.getCastleAccess().getOnKeyword_1_1_0());
                            				
                            otherlv_6=(Token)match(input,41,FOLLOW_30); 

                            					newLeafNode(otherlv_6, grammarAccess.getCastleAccess().getTheKeyword_1_1_1());
                            				

                            }
                            break;

                    }

                    // InternalChessDSL.g:1108:4: (otherlv_7= 'Kingside' | otherlv_8= 'Queenside' )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==38) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==39) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalChessDSL.g:1109:5: otherlv_7= 'Kingside'
                            {
                            otherlv_7=(Token)match(input,38,FOLLOW_2); 

                            					newLeafNode(otherlv_7, grammarAccess.getCastleAccess().getKingsideKeyword_1_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalChessDSL.g:1114:5: otherlv_8= 'Queenside'
                            {
                            otherlv_8=(Token)match(input,39,FOLLOW_2); 

                            					newLeafNode(otherlv_8, grammarAccess.getCastleAccess().getQueensideKeyword_1_2_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalChessDSL.g:1121:3: ( ( (lv_move_9_0= ruleMove ) ) otherlv_10= 'Castle()' )
                    {
                    // InternalChessDSL.g:1121:3: ( ( (lv_move_9_0= ruleMove ) ) otherlv_10= 'Castle()' )
                    // InternalChessDSL.g:1122:4: ( (lv_move_9_0= ruleMove ) ) otherlv_10= 'Castle()'
                    {
                    // InternalChessDSL.g:1122:4: ( (lv_move_9_0= ruleMove ) )
                    // InternalChessDSL.g:1123:5: (lv_move_9_0= ruleMove )
                    {
                    // InternalChessDSL.g:1123:5: (lv_move_9_0= ruleMove )
                    // InternalChessDSL.g:1124:6: lv_move_9_0= ruleMove
                    {

                    						newCompositeNode(grammarAccess.getCastleAccess().getMoveMoveParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_move_9_0=ruleMove();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCastleRule());
                    						}
                    						set(
                    							current,
                    							"move",
                    							lv_move_9_0,
                    							"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.Move");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,42,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getCastleAccess().getCastleKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalChessDSL.g:1147:3: ( ( (lv_move_11_0= ruleMove ) ) otherlv_12= 'and' otherlv_13= 'castles' )
                    {
                    // InternalChessDSL.g:1147:3: ( ( (lv_move_11_0= ruleMove ) ) otherlv_12= 'and' otherlv_13= 'castles' )
                    // InternalChessDSL.g:1148:4: ( (lv_move_11_0= ruleMove ) ) otherlv_12= 'and' otherlv_13= 'castles'
                    {
                    // InternalChessDSL.g:1148:4: ( (lv_move_11_0= ruleMove ) )
                    // InternalChessDSL.g:1149:5: (lv_move_11_0= ruleMove )
                    {
                    // InternalChessDSL.g:1149:5: (lv_move_11_0= ruleMove )
                    // InternalChessDSL.g:1150:6: lv_move_11_0= ruleMove
                    {

                    						newCompositeNode(grammarAccess.getCastleAccess().getMoveMoveParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_move_11_0=ruleMove();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCastleRule());
                    						}
                    						set(
                    							current,
                    							"move",
                    							lv_move_11_0,
                    							"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.Move");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,35,FOLLOW_35); 

                    				newLeafNode(otherlv_12, grammarAccess.getCastleAccess().getAndKeyword_3_1());
                    			
                    otherlv_13=(Token)match(input,40,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getCastleAccess().getCastlesKeyword_3_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCastle"


    // $ANTLR start "entryRuleEnPassant"
    // InternalChessDSL.g:1180:1: entryRuleEnPassant returns [EObject current=null] : iv_ruleEnPassant= ruleEnPassant EOF ;
    public final EObject entryRuleEnPassant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnPassant = null;


        try {
            // InternalChessDSL.g:1180:50: (iv_ruleEnPassant= ruleEnPassant EOF )
            // InternalChessDSL.g:1181:2: iv_ruleEnPassant= ruleEnPassant EOF
            {
             newCompositeNode(grammarAccess.getEnPassantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnPassant=ruleEnPassant();

            state._fsp--;

             current =iv_ruleEnPassant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnPassant"


    // $ANTLR start "ruleEnPassant"
    // InternalChessDSL.g:1187:1: ruleEnPassant returns [EObject current=null] : ( ( (lv_capture_0_0= ruleCapture ) ) otherlv_1= 'on' ( (lv_square_2_0= ruleSquare ) ) ) ;
    public final EObject ruleEnPassant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_capture_0_0 = null;

        AntlrDatatypeRuleToken lv_square_2_0 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:1193:2: ( ( ( (lv_capture_0_0= ruleCapture ) ) otherlv_1= 'on' ( (lv_square_2_0= ruleSquare ) ) ) )
            // InternalChessDSL.g:1194:2: ( ( (lv_capture_0_0= ruleCapture ) ) otherlv_1= 'on' ( (lv_square_2_0= ruleSquare ) ) )
            {
            // InternalChessDSL.g:1194:2: ( ( (lv_capture_0_0= ruleCapture ) ) otherlv_1= 'on' ( (lv_square_2_0= ruleSquare ) ) )
            // InternalChessDSL.g:1195:3: ( (lv_capture_0_0= ruleCapture ) ) otherlv_1= 'on' ( (lv_square_2_0= ruleSquare ) )
            {
            // InternalChessDSL.g:1195:3: ( (lv_capture_0_0= ruleCapture ) )
            // InternalChessDSL.g:1196:4: (lv_capture_0_0= ruleCapture )
            {
            // InternalChessDSL.g:1196:4: (lv_capture_0_0= ruleCapture )
            // InternalChessDSL.g:1197:5: lv_capture_0_0= ruleCapture
            {

            					newCompositeNode(grammarAccess.getEnPassantAccess().getCaptureCaptureParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
            lv_capture_0_0=ruleCapture();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnPassantRule());
            					}
            					set(
            						current,
            						"capture",
            						lv_capture_0_0,
            						"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.Capture");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getEnPassantAccess().getOnKeyword_1());
            		
            // InternalChessDSL.g:1218:3: ( (lv_square_2_0= ruleSquare ) )
            // InternalChessDSL.g:1219:4: (lv_square_2_0= ruleSquare )
            {
            // InternalChessDSL.g:1219:4: (lv_square_2_0= ruleSquare )
            // InternalChessDSL.g:1220:5: lv_square_2_0= ruleSquare
            {

            					newCompositeNode(grammarAccess.getEnPassantAccess().getSquareSquareParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_square_2_0=ruleSquare();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnPassantRule());
            					}
            					set(
            						current,
            						"square",
            						lv_square_2_0,
            						"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.Square");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnPassant"


    // $ANTLR start "entryRulePromotion"
    // InternalChessDSL.g:1241:1: entryRulePromotion returns [EObject current=null] : iv_rulePromotion= rulePromotion EOF ;
    public final EObject entryRulePromotion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePromotion = null;


        try {
            // InternalChessDSL.g:1241:50: (iv_rulePromotion= rulePromotion EOF )
            // InternalChessDSL.g:1242:2: iv_rulePromotion= rulePromotion EOF
            {
             newCompositeNode(grammarAccess.getPromotionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePromotion=rulePromotion();

            state._fsp--;

             current =iv_rulePromotion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePromotion"


    // $ANTLR start "rulePromotion"
    // InternalChessDSL.g:1248:1: rulePromotion returns [EObject current=null] : ( ( ( (lv_move_0_1= ruleMove | lv_move_0_2= ruleCapture ) ) ) otherlv_1= 'Promotion(' ( (lv_piece_2_0= rulePiece ) ) otherlv_3= ')' ) ;
    public final EObject rulePromotion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_move_0_1 = null;

        EObject lv_move_0_2 = null;

        Enumerator lv_piece_2_0 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:1254:2: ( ( ( ( (lv_move_0_1= ruleMove | lv_move_0_2= ruleCapture ) ) ) otherlv_1= 'Promotion(' ( (lv_piece_2_0= rulePiece ) ) otherlv_3= ')' ) )
            // InternalChessDSL.g:1255:2: ( ( ( (lv_move_0_1= ruleMove | lv_move_0_2= ruleCapture ) ) ) otherlv_1= 'Promotion(' ( (lv_piece_2_0= rulePiece ) ) otherlv_3= ')' )
            {
            // InternalChessDSL.g:1255:2: ( ( ( (lv_move_0_1= ruleMove | lv_move_0_2= ruleCapture ) ) ) otherlv_1= 'Promotion(' ( (lv_piece_2_0= rulePiece ) ) otherlv_3= ')' )
            // InternalChessDSL.g:1256:3: ( ( (lv_move_0_1= ruleMove | lv_move_0_2= ruleCapture ) ) ) otherlv_1= 'Promotion(' ( (lv_piece_2_0= rulePiece ) ) otherlv_3= ')'
            {
            // InternalChessDSL.g:1256:3: ( ( (lv_move_0_1= ruleMove | lv_move_0_2= ruleCapture ) ) )
            // InternalChessDSL.g:1257:4: ( (lv_move_0_1= ruleMove | lv_move_0_2= ruleCapture ) )
            {
            // InternalChessDSL.g:1257:4: ( (lv_move_0_1= ruleMove | lv_move_0_2= ruleCapture ) )
            // InternalChessDSL.g:1258:5: (lv_move_0_1= ruleMove | lv_move_0_2= ruleCapture )
            {
            // InternalChessDSL.g:1258:5: (lv_move_0_1= ruleMove | lv_move_0_2= ruleCapture )
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalChessDSL.g:1259:6: lv_move_0_1= ruleMove
                    {

                    						newCompositeNode(grammarAccess.getPromotionAccess().getMoveMoveParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_move_0_1=ruleMove();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPromotionRule());
                    						}
                    						set(
                    							current,
                    							"move",
                    							lv_move_0_1,
                    							"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.Move");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1275:6: lv_move_0_2= ruleCapture
                    {

                    						newCompositeNode(grammarAccess.getPromotionAccess().getMoveCaptureParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_37);
                    lv_move_0_2=ruleCapture();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPromotionRule());
                    						}
                    						set(
                    							current,
                    							"move",
                    							lv_move_0_2,
                    							"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.Capture");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getPromotionAccess().getPromotionKeyword_1());
            		
            // InternalChessDSL.g:1297:3: ( (lv_piece_2_0= rulePiece ) )
            // InternalChessDSL.g:1298:4: (lv_piece_2_0= rulePiece )
            {
            // InternalChessDSL.g:1298:4: (lv_piece_2_0= rulePiece )
            // InternalChessDSL.g:1299:5: lv_piece_2_0= rulePiece
            {

            					newCompositeNode(grammarAccess.getPromotionAccess().getPiecePieceEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
            lv_piece_2_0=rulePiece();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPromotionRule());
            					}
            					set(
            						current,
            						"piece",
            						lv_piece_2_0,
            						"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.Piece");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPromotionAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePromotion"


    // $ANTLR start "entryRuleConclusion"
    // InternalChessDSL.g:1324:1: entryRuleConclusion returns [EObject current=null] : iv_ruleConclusion= ruleConclusion EOF ;
    public final EObject entryRuleConclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConclusion = null;


        try {
            // InternalChessDSL.g:1324:51: (iv_ruleConclusion= ruleConclusion EOF )
            // InternalChessDSL.g:1325:2: iv_ruleConclusion= ruleConclusion EOF
            {
             newCompositeNode(grammarAccess.getConclusionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConclusion=ruleConclusion();

            state._fsp--;

             current =iv_ruleConclusion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConclusion"


    // $ANTLR start "ruleConclusion"
    // InternalChessDSL.g:1331:1: ruleConclusion returns [EObject current=null] : ( ( (lv_method_0_0= ruleMethod ) )? ( (lv_result_1_0= ruleResult ) ) ) ;
    public final EObject ruleConclusion() throws RecognitionException {
        EObject current = null;

        EObject lv_method_0_0 = null;

        EObject lv_result_1_0 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:1337:2: ( ( ( (lv_method_0_0= ruleMethod ) )? ( (lv_result_1_0= ruleResult ) ) ) )
            // InternalChessDSL.g:1338:2: ( ( (lv_method_0_0= ruleMethod ) )? ( (lv_result_1_0= ruleResult ) ) )
            {
            // InternalChessDSL.g:1338:2: ( ( (lv_method_0_0= ruleMethod ) )? ( (lv_result_1_0= ruleResult ) ) )
            // InternalChessDSL.g:1339:3: ( (lv_method_0_0= ruleMethod ) )? ( (lv_result_1_0= ruleResult ) )
            {
            // InternalChessDSL.g:1339:3: ( (lv_method_0_0= ruleMethod ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==35||LA25_1==44||(LA25_1>=48 && LA25_1<=49)) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // InternalChessDSL.g:1340:4: (lv_method_0_0= ruleMethod )
                    {
                    // InternalChessDSL.g:1340:4: (lv_method_0_0= ruleMethod )
                    // InternalChessDSL.g:1341:5: lv_method_0_0= ruleMethod
                    {

                    					newCompositeNode(grammarAccess.getConclusionAccess().getMethodMethodParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_38);
                    lv_method_0_0=ruleMethod();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConclusionRule());
                    					}
                    					set(
                    						current,
                    						"method",
                    						lv_method_0_0,
                    						"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.Method");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalChessDSL.g:1358:3: ( (lv_result_1_0= ruleResult ) )
            // InternalChessDSL.g:1359:4: (lv_result_1_0= ruleResult )
            {
            // InternalChessDSL.g:1359:4: (lv_result_1_0= ruleResult )
            // InternalChessDSL.g:1360:5: lv_result_1_0= ruleResult
            {

            					newCompositeNode(grammarAccess.getConclusionAccess().getResultResultParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_result_1_0=ruleResult();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConclusionRule());
            					}
            					set(
            						current,
            						"result",
            						lv_result_1_0,
            						"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.Result");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConclusion"


    // $ANTLR start "entryRuleMethod"
    // InternalChessDSL.g:1381:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalChessDSL.g:1381:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalChessDSL.g:1382:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalChessDSL.g:1388:1: ruleMethod returns [EObject current=null] : (this_Win_0= ruleWin | this_Draw_1= ruleDraw ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        EObject this_Win_0 = null;

        EObject this_Draw_1 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:1394:2: ( (this_Win_0= ruleWin | this_Draw_1= ruleDraw ) )
            // InternalChessDSL.g:1395:2: (this_Win_0= ruleWin | this_Draw_1= ruleDraw )
            {
            // InternalChessDSL.g:1395:2: (this_Win_0= ruleWin | this_Draw_1= ruleDraw )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==35) ) {
                    alt26=2;
                }
                else if ( (LA26_1==44||(LA26_1>=48 && LA26_1<=49)) ) {
                    alt26=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalChessDSL.g:1396:3: this_Win_0= ruleWin
                    {

                    			newCompositeNode(grammarAccess.getMethodAccess().getWinParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Win_0=ruleWin();

                    state._fsp--;


                    			current = this_Win_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1405:3: this_Draw_1= ruleDraw
                    {

                    			newCompositeNode(grammarAccess.getMethodAccess().getDrawParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Draw_1=ruleDraw();

                    state._fsp--;


                    			current = this_Draw_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleWin"
    // InternalChessDSL.g:1417:1: entryRuleWin returns [EObject current=null] : iv_ruleWin= ruleWin EOF ;
    public final EObject entryRuleWin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWin = null;


        try {
            // InternalChessDSL.g:1417:44: (iv_ruleWin= ruleWin EOF )
            // InternalChessDSL.g:1418:2: iv_ruleWin= ruleWin EOF
            {
             newCompositeNode(grammarAccess.getWinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWin=ruleWin();

            state._fsp--;

             current =iv_ruleWin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWin"


    // $ANTLR start "ruleWin"
    // InternalChessDSL.g:1424:1: ruleWin returns [EObject current=null] : (this_TimeUp_0= ruleTimeUp | this_Resign_1= ruleResign | this_Checkmate_2= ruleCheckmate ) ;
    public final EObject ruleWin() throws RecognitionException {
        EObject current = null;

        EObject this_TimeUp_0 = null;

        EObject this_Resign_1 = null;

        EObject this_Checkmate_2 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:1430:2: ( (this_TimeUp_0= ruleTimeUp | this_Resign_1= ruleResign | this_Checkmate_2= ruleCheckmate ) )
            // InternalChessDSL.g:1431:2: (this_TimeUp_0= ruleTimeUp | this_Resign_1= ruleResign | this_Checkmate_2= ruleCheckmate )
            {
            // InternalChessDSL.g:1431:2: (this_TimeUp_0= ruleTimeUp | this_Resign_1= ruleResign | this_Checkmate_2= ruleCheckmate )
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 49:
                    {
                    alt27=3;
                    }
                    break;
                case 48:
                    {
                    alt27=2;
                    }
                    break;
                case 44:
                    {
                    alt27=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalChessDSL.g:1432:3: this_TimeUp_0= ruleTimeUp
                    {

                    			newCompositeNode(grammarAccess.getWinAccess().getTimeUpParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimeUp_0=ruleTimeUp();

                    state._fsp--;


                    			current = this_TimeUp_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1441:3: this_Resign_1= ruleResign
                    {

                    			newCompositeNode(grammarAccess.getWinAccess().getResignParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Resign_1=ruleResign();

                    state._fsp--;


                    			current = this_Resign_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalChessDSL.g:1450:3: this_Checkmate_2= ruleCheckmate
                    {

                    			newCompositeNode(grammarAccess.getWinAccess().getCheckmateParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Checkmate_2=ruleCheckmate();

                    state._fsp--;


                    			current = this_Checkmate_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWin"


    // $ANTLR start "entryRuleTimeUp"
    // InternalChessDSL.g:1462:1: entryRuleTimeUp returns [EObject current=null] : iv_ruleTimeUp= ruleTimeUp EOF ;
    public final EObject entryRuleTimeUp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeUp = null;


        try {
            // InternalChessDSL.g:1462:47: (iv_ruleTimeUp= ruleTimeUp EOF )
            // InternalChessDSL.g:1463:2: iv_ruleTimeUp= ruleTimeUp EOF
            {
             newCompositeNode(grammarAccess.getTimeUpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeUp=ruleTimeUp();

            state._fsp--;

             current =iv_ruleTimeUp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeUp"


    // $ANTLR start "ruleTimeUp"
    // InternalChessDSL.g:1469:1: ruleTimeUp returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'ran' otherlv_2= 'out' otherlv_3= 'of' otherlv_4= 'time' ) ;
    public final EObject ruleTimeUp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalChessDSL.g:1475:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'ran' otherlv_2= 'out' otherlv_3= 'of' otherlv_4= 'time' ) )
            // InternalChessDSL.g:1476:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'ran' otherlv_2= 'out' otherlv_3= 'of' otherlv_4= 'time' )
            {
            // InternalChessDSL.g:1476:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'ran' otherlv_2= 'out' otherlv_3= 'of' otherlv_4= 'time' )
            // InternalChessDSL.g:1477:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'ran' otherlv_2= 'out' otherlv_3= 'of' otherlv_4= 'time'
            {
            // InternalChessDSL.g:1477:3: ( (otherlv_0= RULE_ID ) )
            // InternalChessDSL.g:1478:4: (otherlv_0= RULE_ID )
            {
            // InternalChessDSL.g:1478:4: (otherlv_0= RULE_ID )
            // InternalChessDSL.g:1479:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeUpRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_39); 

            					newLeafNode(otherlv_0, grammarAccess.getTimeUpAccess().getPlayerPlayerCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeUpAccess().getRanKeyword_1());
            		
            otherlv_2=(Token)match(input,45,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getTimeUpAccess().getOutKeyword_2());
            		
            otherlv_3=(Token)match(input,46,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getTimeUpAccess().getOfKeyword_3());
            		
            otherlv_4=(Token)match(input,47,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTimeUpAccess().getTimeKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeUp"


    // $ANTLR start "entryRuleResign"
    // InternalChessDSL.g:1510:1: entryRuleResign returns [EObject current=null] : iv_ruleResign= ruleResign EOF ;
    public final EObject entryRuleResign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResign = null;


        try {
            // InternalChessDSL.g:1510:47: (iv_ruleResign= ruleResign EOF )
            // InternalChessDSL.g:1511:2: iv_ruleResign= ruleResign EOF
            {
             newCompositeNode(grammarAccess.getResignRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResign=ruleResign();

            state._fsp--;

             current =iv_ruleResign; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResign"


    // $ANTLR start "ruleResign"
    // InternalChessDSL.g:1517:1: ruleResign returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'resigned' ) ;
    public final EObject ruleResign() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalChessDSL.g:1523:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'resigned' ) )
            // InternalChessDSL.g:1524:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'resigned' )
            {
            // InternalChessDSL.g:1524:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'resigned' )
            // InternalChessDSL.g:1525:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'resigned'
            {
            // InternalChessDSL.g:1525:3: ( (otherlv_0= RULE_ID ) )
            // InternalChessDSL.g:1526:4: (otherlv_0= RULE_ID )
            {
            // InternalChessDSL.g:1526:4: (otherlv_0= RULE_ID )
            // InternalChessDSL.g:1527:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResignRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_43); 

            					newLeafNode(otherlv_0, grammarAccess.getResignAccess().getPlayerPlayerCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getResignAccess().getResignedKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResign"


    // $ANTLR start "entryRuleCheckmate"
    // InternalChessDSL.g:1546:1: entryRuleCheckmate returns [EObject current=null] : iv_ruleCheckmate= ruleCheckmate EOF ;
    public final EObject entryRuleCheckmate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckmate = null;


        try {
            // InternalChessDSL.g:1546:50: (iv_ruleCheckmate= ruleCheckmate EOF )
            // InternalChessDSL.g:1547:2: iv_ruleCheckmate= ruleCheckmate EOF
            {
             newCompositeNode(grammarAccess.getCheckmateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheckmate=ruleCheckmate();

            state._fsp--;

             current =iv_ruleCheckmate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheckmate"


    // $ANTLR start "ruleCheckmate"
    // InternalChessDSL.g:1553:1: ruleCheckmate returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'checkmated' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleCheckmate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalChessDSL.g:1559:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'checkmated' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalChessDSL.g:1560:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'checkmated' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalChessDSL.g:1560:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'checkmated' ( (otherlv_2= RULE_ID ) ) )
            // InternalChessDSL.g:1561:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'checkmated' ( (otherlv_2= RULE_ID ) )
            {
            // InternalChessDSL.g:1561:3: ( (otherlv_0= RULE_ID ) )
            // InternalChessDSL.g:1562:4: (otherlv_0= RULE_ID )
            {
            // InternalChessDSL.g:1562:4: (otherlv_0= RULE_ID )
            // InternalChessDSL.g:1563:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheckmateRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_44); 

            					newLeafNode(otherlv_0, grammarAccess.getCheckmateAccess().getPlayer1PlayerCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,49,FOLLOW_45); 

            			newLeafNode(otherlv_1, grammarAccess.getCheckmateAccess().getCheckmatedKeyword_1());
            		
            // InternalChessDSL.g:1578:3: ( (otherlv_2= RULE_ID ) )
            // InternalChessDSL.g:1579:4: (otherlv_2= RULE_ID )
            {
            // InternalChessDSL.g:1579:4: (otherlv_2= RULE_ID )
            // InternalChessDSL.g:1580:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheckmateRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getCheckmateAccess().getPlayer2PlayerCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheckmate"


    // $ANTLR start "entryRuleDraw"
    // InternalChessDSL.g:1595:1: entryRuleDraw returns [EObject current=null] : iv_ruleDraw= ruleDraw EOF ;
    public final EObject entryRuleDraw() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDraw = null;


        try {
            // InternalChessDSL.g:1595:45: (iv_ruleDraw= ruleDraw EOF )
            // InternalChessDSL.g:1596:2: iv_ruleDraw= ruleDraw EOF
            {
             newCompositeNode(grammarAccess.getDrawRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDraw=ruleDraw();

            state._fsp--;

             current =iv_ruleDraw; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDraw"


    // $ANTLR start "ruleDraw"
    // InternalChessDSL.g:1602:1: ruleDraw returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'and' ( (otherlv_2= RULE_ID ) ) ( ( (lv_result_3_1= ruleStalemate | lv_result_3_2= ruleThreefold | lv_result_3_3= ruleFifty | lv_result_3_4= ruleAgree ) ) ) ) ;
    public final EObject ruleDraw() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_result_3_1 = null;

        EObject lv_result_3_2 = null;

        EObject lv_result_3_3 = null;

        EObject lv_result_3_4 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:1608:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'and' ( (otherlv_2= RULE_ID ) ) ( ( (lv_result_3_1= ruleStalemate | lv_result_3_2= ruleThreefold | lv_result_3_3= ruleFifty | lv_result_3_4= ruleAgree ) ) ) ) )
            // InternalChessDSL.g:1609:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'and' ( (otherlv_2= RULE_ID ) ) ( ( (lv_result_3_1= ruleStalemate | lv_result_3_2= ruleThreefold | lv_result_3_3= ruleFifty | lv_result_3_4= ruleAgree ) ) ) )
            {
            // InternalChessDSL.g:1609:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'and' ( (otherlv_2= RULE_ID ) ) ( ( (lv_result_3_1= ruleStalemate | lv_result_3_2= ruleThreefold | lv_result_3_3= ruleFifty | lv_result_3_4= ruleAgree ) ) ) )
            // InternalChessDSL.g:1610:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'and' ( (otherlv_2= RULE_ID ) ) ( ( (lv_result_3_1= ruleStalemate | lv_result_3_2= ruleThreefold | lv_result_3_3= ruleFifty | lv_result_3_4= ruleAgree ) ) )
            {
            // InternalChessDSL.g:1610:3: ( (otherlv_0= RULE_ID ) )
            // InternalChessDSL.g:1611:4: (otherlv_0= RULE_ID )
            {
            // InternalChessDSL.g:1611:4: (otherlv_0= RULE_ID )
            // InternalChessDSL.g:1612:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDrawRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(otherlv_0, grammarAccess.getDrawAccess().getPlayer1PlayerCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_45); 

            			newLeafNode(otherlv_1, grammarAccess.getDrawAccess().getAndKeyword_1());
            		
            // InternalChessDSL.g:1627:3: ( (otherlv_2= RULE_ID ) )
            // InternalChessDSL.g:1628:4: (otherlv_2= RULE_ID )
            {
            // InternalChessDSL.g:1628:4: (otherlv_2= RULE_ID )
            // InternalChessDSL.g:1629:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDrawRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_46); 

            					newLeafNode(otherlv_2, grammarAccess.getDrawAccess().getPlayer2PlayerCrossReference_2_0());
            				

            }


            }

            // InternalChessDSL.g:1640:3: ( ( (lv_result_3_1= ruleStalemate | lv_result_3_2= ruleThreefold | lv_result_3_3= ruleFifty | lv_result_3_4= ruleAgree ) ) )
            // InternalChessDSL.g:1641:4: ( (lv_result_3_1= ruleStalemate | lv_result_3_2= ruleThreefold | lv_result_3_3= ruleFifty | lv_result_3_4= ruleAgree ) )
            {
            // InternalChessDSL.g:1641:4: ( (lv_result_3_1= ruleStalemate | lv_result_3_2= ruleThreefold | lv_result_3_3= ruleFifty | lv_result_3_4= ruleAgree ) )
            // InternalChessDSL.g:1642:5: (lv_result_3_1= ruleStalemate | lv_result_3_2= ruleThreefold | lv_result_3_3= ruleFifty | lv_result_3_4= ruleAgree )
            {
            // InternalChessDSL.g:1642:5: (lv_result_3_1= ruleStalemate | lv_result_3_2= ruleThreefold | lv_result_3_3= ruleFifty | lv_result_3_4= ruleAgree )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt28=1;
                }
                break;
            case 55:
                {
                alt28=2;
                }
                break;
            case 59:
                {
                alt28=3;
                }
                break;
            case 63:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalChessDSL.g:1643:6: lv_result_3_1= ruleStalemate
                    {

                    						newCompositeNode(grammarAccess.getDrawAccess().getResultStalemateParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_result_3_1=ruleStalemate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDrawRule());
                    						}
                    						set(
                    							current,
                    							"result",
                    							lv_result_3_1,
                    							"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.Stalemate");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1659:6: lv_result_3_2= ruleThreefold
                    {

                    						newCompositeNode(grammarAccess.getDrawAccess().getResultThreefoldParserRuleCall_3_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_result_3_2=ruleThreefold();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDrawRule());
                    						}
                    						set(
                    							current,
                    							"result",
                    							lv_result_3_2,
                    							"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.Threefold");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalChessDSL.g:1675:6: lv_result_3_3= ruleFifty
                    {

                    						newCompositeNode(grammarAccess.getDrawAccess().getResultFiftyParserRuleCall_3_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_result_3_3=ruleFifty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDrawRule());
                    						}
                    						set(
                    							current,
                    							"result",
                    							lv_result_3_3,
                    							"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.Fifty");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 4 :
                    // InternalChessDSL.g:1691:6: lv_result_3_4= ruleAgree
                    {

                    						newCompositeNode(grammarAccess.getDrawAccess().getResultAgreeParserRuleCall_3_0_3());
                    					
                    pushFollow(FOLLOW_2);
                    lv_result_3_4=ruleAgree();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDrawRule());
                    						}
                    						set(
                    							current,
                    							"result",
                    							lv_result_3_4,
                    							"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.Agree");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDraw"


    // $ANTLR start "entryRuleStalemate"
    // InternalChessDSL.g:1713:1: entryRuleStalemate returns [EObject current=null] : iv_ruleStalemate= ruleStalemate EOF ;
    public final EObject entryRuleStalemate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStalemate = null;


        try {
            // InternalChessDSL.g:1713:50: (iv_ruleStalemate= ruleStalemate EOF )
            // InternalChessDSL.g:1714:2: iv_ruleStalemate= ruleStalemate EOF
            {
             newCompositeNode(grammarAccess.getStalemateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStalemate=ruleStalemate();

            state._fsp--;

             current =iv_ruleStalemate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStalemate"


    // $ANTLR start "ruleStalemate"
    // InternalChessDSL.g:1720:1: ruleStalemate returns [EObject current=null] : (otherlv_0= 'ended' otherlv_1= 'the' otherlv_2= 'game' otherlv_3= 'in' otherlv_4= 'a' otherlv_5= 'stalemate' ) ;
    public final EObject ruleStalemate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalChessDSL.g:1726:2: ( (otherlv_0= 'ended' otherlv_1= 'the' otherlv_2= 'game' otherlv_3= 'in' otherlv_4= 'a' otherlv_5= 'stalemate' ) )
            // InternalChessDSL.g:1727:2: (otherlv_0= 'ended' otherlv_1= 'the' otherlv_2= 'game' otherlv_3= 'in' otherlv_4= 'a' otherlv_5= 'stalemate' )
            {
            // InternalChessDSL.g:1727:2: (otherlv_0= 'ended' otherlv_1= 'the' otherlv_2= 'game' otherlv_3= 'in' otherlv_4= 'a' otherlv_5= 'stalemate' )
            // InternalChessDSL.g:1728:3: otherlv_0= 'ended' otherlv_1= 'the' otherlv_2= 'game' otherlv_3= 'in' otherlv_4= 'a' otherlv_5= 'stalemate'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getStalemateAccess().getEndedKeyword_0());
            		
            otherlv_1=(Token)match(input,41,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getStalemateAccess().getTheKeyword_1());
            		
            otherlv_2=(Token)match(input,51,FOLLOW_48); 

            			newLeafNode(otherlv_2, grammarAccess.getStalemateAccess().getGameKeyword_2());
            		
            otherlv_3=(Token)match(input,52,FOLLOW_49); 

            			newLeafNode(otherlv_3, grammarAccess.getStalemateAccess().getInKeyword_3());
            		
            otherlv_4=(Token)match(input,53,FOLLOW_50); 

            			newLeafNode(otherlv_4, grammarAccess.getStalemateAccess().getAKeyword_4());
            		
            otherlv_5=(Token)match(input,54,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getStalemateAccess().getStalemateKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStalemate"


    // $ANTLR start "entryRuleThreefold"
    // InternalChessDSL.g:1756:1: entryRuleThreefold returns [EObject current=null] : iv_ruleThreefold= ruleThreefold EOF ;
    public final EObject entryRuleThreefold() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThreefold = null;


        try {
            // InternalChessDSL.g:1756:50: (iv_ruleThreefold= ruleThreefold EOF )
            // InternalChessDSL.g:1757:2: iv_ruleThreefold= ruleThreefold EOF
            {
             newCompositeNode(grammarAccess.getThreefoldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThreefold=ruleThreefold();

            state._fsp--;

             current =iv_ruleThreefold; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleThreefold"


    // $ANTLR start "ruleThreefold"
    // InternalChessDSL.g:1763:1: ruleThreefold returns [EObject current=null] : (otherlv_0= 'repeated' otherlv_1= 'a' otherlv_2= 'position' otherlv_3= 'three' otherlv_4= 'times' ) ;
    public final EObject ruleThreefold() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalChessDSL.g:1769:2: ( (otherlv_0= 'repeated' otherlv_1= 'a' otherlv_2= 'position' otherlv_3= 'three' otherlv_4= 'times' ) )
            // InternalChessDSL.g:1770:2: (otherlv_0= 'repeated' otherlv_1= 'a' otherlv_2= 'position' otherlv_3= 'three' otherlv_4= 'times' )
            {
            // InternalChessDSL.g:1770:2: (otherlv_0= 'repeated' otherlv_1= 'a' otherlv_2= 'position' otherlv_3= 'three' otherlv_4= 'times' )
            // InternalChessDSL.g:1771:3: otherlv_0= 'repeated' otherlv_1= 'a' otherlv_2= 'position' otherlv_3= 'three' otherlv_4= 'times'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_49); 

            			newLeafNode(otherlv_0, grammarAccess.getThreefoldAccess().getRepeatedKeyword_0());
            		
            otherlv_1=(Token)match(input,53,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getThreefoldAccess().getAKeyword_1());
            		
            otherlv_2=(Token)match(input,56,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getThreefoldAccess().getPositionKeyword_2());
            		
            otherlv_3=(Token)match(input,57,FOLLOW_53); 

            			newLeafNode(otherlv_3, grammarAccess.getThreefoldAccess().getThreeKeyword_3());
            		
            otherlv_4=(Token)match(input,58,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getThreefoldAccess().getTimesKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleThreefold"


    // $ANTLR start "entryRuleFifty"
    // InternalChessDSL.g:1795:1: entryRuleFifty returns [EObject current=null] : iv_ruleFifty= ruleFifty EOF ;
    public final EObject entryRuleFifty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFifty = null;


        try {
            // InternalChessDSL.g:1795:46: (iv_ruleFifty= ruleFifty EOF )
            // InternalChessDSL.g:1796:2: iv_ruleFifty= ruleFifty EOF
            {
             newCompositeNode(grammarAccess.getFiftyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFifty=ruleFifty();

            state._fsp--;

             current =iv_ruleFifty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFifty"


    // $ANTLR start "ruleFifty"
    // InternalChessDSL.g:1802:1: ruleFifty returns [EObject current=null] : (otherlv_0= 'played' otherlv_1= 'fifty' otherlv_2= 'moves' otherlv_3= 'without' otherlv_4= 'a' otherlv_5= 'capture' ) ;
    public final EObject ruleFifty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalChessDSL.g:1808:2: ( (otherlv_0= 'played' otherlv_1= 'fifty' otherlv_2= 'moves' otherlv_3= 'without' otherlv_4= 'a' otherlv_5= 'capture' ) )
            // InternalChessDSL.g:1809:2: (otherlv_0= 'played' otherlv_1= 'fifty' otherlv_2= 'moves' otherlv_3= 'without' otherlv_4= 'a' otherlv_5= 'capture' )
            {
            // InternalChessDSL.g:1809:2: (otherlv_0= 'played' otherlv_1= 'fifty' otherlv_2= 'moves' otherlv_3= 'without' otherlv_4= 'a' otherlv_5= 'capture' )
            // InternalChessDSL.g:1810:3: otherlv_0= 'played' otherlv_1= 'fifty' otherlv_2= 'moves' otherlv_3= 'without' otherlv_4= 'a' otherlv_5= 'capture'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_54); 

            			newLeafNode(otherlv_0, grammarAccess.getFiftyAccess().getPlayedKeyword_0());
            		
            otherlv_1=(Token)match(input,60,FOLLOW_55); 

            			newLeafNode(otherlv_1, grammarAccess.getFiftyAccess().getFiftyKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_56); 

            			newLeafNode(otherlv_2, grammarAccess.getFiftyAccess().getMovesKeyword_2());
            		
            otherlv_3=(Token)match(input,61,FOLLOW_49); 

            			newLeafNode(otherlv_3, grammarAccess.getFiftyAccess().getWithoutKeyword_3());
            		
            otherlv_4=(Token)match(input,53,FOLLOW_57); 

            			newLeafNode(otherlv_4, grammarAccess.getFiftyAccess().getAKeyword_4());
            		
            otherlv_5=(Token)match(input,62,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFiftyAccess().getCaptureKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFifty"


    // $ANTLR start "entryRuleAgree"
    // InternalChessDSL.g:1838:1: entryRuleAgree returns [EObject current=null] : iv_ruleAgree= ruleAgree EOF ;
    public final EObject entryRuleAgree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgree = null;


        try {
            // InternalChessDSL.g:1838:46: (iv_ruleAgree= ruleAgree EOF )
            // InternalChessDSL.g:1839:2: iv_ruleAgree= ruleAgree EOF
            {
             newCompositeNode(grammarAccess.getAgreeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAgree=ruleAgree();

            state._fsp--;

             current =iv_ruleAgree; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAgree"


    // $ANTLR start "ruleAgree"
    // InternalChessDSL.g:1845:1: ruleAgree returns [EObject current=null] : (otherlv_0= 'agreed' otherlv_1= 'to' otherlv_2= 'a' otherlv_3= 'draw' ) ;
    public final EObject ruleAgree() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalChessDSL.g:1851:2: ( (otherlv_0= 'agreed' otherlv_1= 'to' otherlv_2= 'a' otherlv_3= 'draw' ) )
            // InternalChessDSL.g:1852:2: (otherlv_0= 'agreed' otherlv_1= 'to' otherlv_2= 'a' otherlv_3= 'draw' )
            {
            // InternalChessDSL.g:1852:2: (otherlv_0= 'agreed' otherlv_1= 'to' otherlv_2= 'a' otherlv_3= 'draw' )
            // InternalChessDSL.g:1853:3: otherlv_0= 'agreed' otherlv_1= 'to' otherlv_2= 'a' otherlv_3= 'draw'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getAgreeAccess().getAgreedKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_49); 

            			newLeafNode(otherlv_1, grammarAccess.getAgreeAccess().getToKeyword_1());
            		
            otherlv_2=(Token)match(input,53,FOLLOW_58); 

            			newLeafNode(otherlv_2, grammarAccess.getAgreeAccess().getAKeyword_2());
            		
            otherlv_3=(Token)match(input,64,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAgreeAccess().getDrawKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAgree"


    // $ANTLR start "entryRuleResult"
    // InternalChessDSL.g:1873:1: entryRuleResult returns [EObject current=null] : iv_ruleResult= ruleResult EOF ;
    public final EObject entryRuleResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResult = null;


        try {
            // InternalChessDSL.g:1873:47: (iv_ruleResult= ruleResult EOF )
            // InternalChessDSL.g:1874:2: iv_ruleResult= ruleResult EOF
            {
             newCompositeNode(grammarAccess.getResultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResult=ruleResult();

            state._fsp--;

             current =iv_ruleResult; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResult"


    // $ANTLR start "ruleResult"
    // InternalChessDSL.g:1880:1: ruleResult returns [EObject current=null] : ( ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_color_1_0= ruleColor ) ) ) otherlv_2= 'wins' ) | otherlv_3= 'draw' ) ;
    public final EObject ruleResult() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_color_1_0 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:1886:2: ( ( ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_color_1_0= ruleColor ) ) ) otherlv_2= 'wins' ) | otherlv_3= 'draw' ) )
            // InternalChessDSL.g:1887:2: ( ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_color_1_0= ruleColor ) ) ) otherlv_2= 'wins' ) | otherlv_3= 'draw' )
            {
            // InternalChessDSL.g:1887:2: ( ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_color_1_0= ruleColor ) ) ) otherlv_2= 'wins' ) | otherlv_3= 'draw' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID||(LA30_0>=73 && LA30_0<=74)) ) {
                alt30=1;
            }
            else if ( (LA30_0==64) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalChessDSL.g:1888:3: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_color_1_0= ruleColor ) ) ) otherlv_2= 'wins' )
                    {
                    // InternalChessDSL.g:1888:3: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_color_1_0= ruleColor ) ) ) otherlv_2= 'wins' )
                    // InternalChessDSL.g:1889:4: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_color_1_0= ruleColor ) ) ) otherlv_2= 'wins'
                    {
                    // InternalChessDSL.g:1889:4: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_color_1_0= ruleColor ) ) )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==RULE_ID) ) {
                        alt29=1;
                    }
                    else if ( ((LA29_0>=73 && LA29_0<=74)) ) {
                        alt29=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalChessDSL.g:1890:5: ( (otherlv_0= RULE_ID ) )
                            {
                            // InternalChessDSL.g:1890:5: ( (otherlv_0= RULE_ID ) )
                            // InternalChessDSL.g:1891:6: (otherlv_0= RULE_ID )
                            {
                            // InternalChessDSL.g:1891:6: (otherlv_0= RULE_ID )
                            // InternalChessDSL.g:1892:7: otherlv_0= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getResultRule());
                            							}
                            						
                            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_59); 

                            							newLeafNode(otherlv_0, grammarAccess.getResultAccess().getPlayerPlayerCrossReference_0_0_0_0());
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalChessDSL.g:1904:5: ( (lv_color_1_0= ruleColor ) )
                            {
                            // InternalChessDSL.g:1904:5: ( (lv_color_1_0= ruleColor ) )
                            // InternalChessDSL.g:1905:6: (lv_color_1_0= ruleColor )
                            {
                            // InternalChessDSL.g:1905:6: (lv_color_1_0= ruleColor )
                            // InternalChessDSL.g:1906:7: lv_color_1_0= ruleColor
                            {

                            							newCompositeNode(grammarAccess.getResultAccess().getColorColorEnumRuleCall_0_0_1_0());
                            						
                            pushFollow(FOLLOW_59);
                            lv_color_1_0=ruleColor();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getResultRule());
                            							}
                            							set(
                            								current,
                            								"color",
                            								lv_color_1_0,
                            								"uk.ac.kcl.inf.nerosiegfried.chessdsl.ChessDSL.Color");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,65,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getResultAccess().getWinsKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1930:3: otherlv_3= 'draw'
                    {
                    otherlv_3=(Token)match(input,64,FOLLOW_2); 

                    			newLeafNode(otherlv_3, grammarAccess.getResultAccess().getDrawKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResult"


    // $ANTLR start "entryRuleSquare"
    // InternalChessDSL.g:1938:1: entryRuleSquare returns [String current=null] : iv_ruleSquare= ruleSquare EOF ;
    public final String entryRuleSquare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSquare = null;


        try {
            // InternalChessDSL.g:1938:46: (iv_ruleSquare= ruleSquare EOF )
            // InternalChessDSL.g:1939:2: iv_ruleSquare= ruleSquare EOF
            {
             newCompositeNode(grammarAccess.getSquareRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSquare=ruleSquare();

            state._fsp--;

             current =iv_ruleSquare.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSquare"


    // $ANTLR start "ruleSquare"
    // InternalChessDSL.g:1945:1: ruleSquare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SQUARETERMINAL_0= RULE_SQUARETERMINAL ;
    public final AntlrDatatypeRuleToken ruleSquare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SQUARETERMINAL_0=null;


        	enterRule();

        try {
            // InternalChessDSL.g:1951:2: (this_SQUARETERMINAL_0= RULE_SQUARETERMINAL )
            // InternalChessDSL.g:1952:2: this_SQUARETERMINAL_0= RULE_SQUARETERMINAL
            {
            this_SQUARETERMINAL_0=(Token)match(input,RULE_SQUARETERMINAL,FOLLOW_2); 

            		current.merge(this_SQUARETERMINAL_0);
            	

            		newLeafNode(this_SQUARETERMINAL_0, grammarAccess.getSquareAccess().getSQUARETERMINALTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSquare"


    // $ANTLR start "ruleRemark"
    // InternalChessDSL.g:1962:1: ruleRemark returns [Enumerator current=null] : ( (enumLiteral_0= 'Good' ) | (enumLiteral_1= 'Bad' ) | (enumLiteral_2= 'Excellent' ) | (enumLiteral_3= 'Risky' ) | (enumLiteral_4= 'Dubious' ) | (enumLiteral_5= 'Check' ) | (enumLiteral_6= 'Checkmate' ) ) ;
    public final Enumerator ruleRemark() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalChessDSL.g:1968:2: ( ( (enumLiteral_0= 'Good' ) | (enumLiteral_1= 'Bad' ) | (enumLiteral_2= 'Excellent' ) | (enumLiteral_3= 'Risky' ) | (enumLiteral_4= 'Dubious' ) | (enumLiteral_5= 'Check' ) | (enumLiteral_6= 'Checkmate' ) ) )
            // InternalChessDSL.g:1969:2: ( (enumLiteral_0= 'Good' ) | (enumLiteral_1= 'Bad' ) | (enumLiteral_2= 'Excellent' ) | (enumLiteral_3= 'Risky' ) | (enumLiteral_4= 'Dubious' ) | (enumLiteral_5= 'Check' ) | (enumLiteral_6= 'Checkmate' ) )
            {
            // InternalChessDSL.g:1969:2: ( (enumLiteral_0= 'Good' ) | (enumLiteral_1= 'Bad' ) | (enumLiteral_2= 'Excellent' ) | (enumLiteral_3= 'Risky' ) | (enumLiteral_4= 'Dubious' ) | (enumLiteral_5= 'Check' ) | (enumLiteral_6= 'Checkmate' ) )
            int alt31=7;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt31=1;
                }
                break;
            case 67:
                {
                alt31=2;
                }
                break;
            case 68:
                {
                alt31=3;
                }
                break;
            case 69:
                {
                alt31=4;
                }
                break;
            case 70:
                {
                alt31=5;
                }
                break;
            case 71:
                {
                alt31=6;
                }
                break;
            case 72:
                {
                alt31=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalChessDSL.g:1970:3: (enumLiteral_0= 'Good' )
                    {
                    // InternalChessDSL.g:1970:3: (enumLiteral_0= 'Good' )
                    // InternalChessDSL.g:1971:4: enumLiteral_0= 'Good'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getRemarkAccess().getGoodEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRemarkAccess().getGoodEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1978:3: (enumLiteral_1= 'Bad' )
                    {
                    // InternalChessDSL.g:1978:3: (enumLiteral_1= 'Bad' )
                    // InternalChessDSL.g:1979:4: enumLiteral_1= 'Bad'
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getRemarkAccess().getBadEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRemarkAccess().getBadEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalChessDSL.g:1986:3: (enumLiteral_2= 'Excellent' )
                    {
                    // InternalChessDSL.g:1986:3: (enumLiteral_2= 'Excellent' )
                    // InternalChessDSL.g:1987:4: enumLiteral_2= 'Excellent'
                    {
                    enumLiteral_2=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getRemarkAccess().getExcellentEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRemarkAccess().getExcellentEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalChessDSL.g:1994:3: (enumLiteral_3= 'Risky' )
                    {
                    // InternalChessDSL.g:1994:3: (enumLiteral_3= 'Risky' )
                    // InternalChessDSL.g:1995:4: enumLiteral_3= 'Risky'
                    {
                    enumLiteral_3=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getRemarkAccess().getRiskyEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRemarkAccess().getRiskyEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalChessDSL.g:2002:3: (enumLiteral_4= 'Dubious' )
                    {
                    // InternalChessDSL.g:2002:3: (enumLiteral_4= 'Dubious' )
                    // InternalChessDSL.g:2003:4: enumLiteral_4= 'Dubious'
                    {
                    enumLiteral_4=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getRemarkAccess().getDubiousEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRemarkAccess().getDubiousEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalChessDSL.g:2010:3: (enumLiteral_5= 'Check' )
                    {
                    // InternalChessDSL.g:2010:3: (enumLiteral_5= 'Check' )
                    // InternalChessDSL.g:2011:4: enumLiteral_5= 'Check'
                    {
                    enumLiteral_5=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getRemarkAccess().getCheckEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getRemarkAccess().getCheckEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalChessDSL.g:2018:3: (enumLiteral_6= 'Checkmate' )
                    {
                    // InternalChessDSL.g:2018:3: (enumLiteral_6= 'Checkmate' )
                    // InternalChessDSL.g:2019:4: enumLiteral_6= 'Checkmate'
                    {
                    enumLiteral_6=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getRemarkAccess().getCheckmateEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getRemarkAccess().getCheckmateEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRemark"


    // $ANTLR start "ruleColor"
    // InternalChessDSL.g:2029:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'White' ) | (enumLiteral_1= 'Black' ) ) ;
    public final Enumerator ruleColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalChessDSL.g:2035:2: ( ( (enumLiteral_0= 'White' ) | (enumLiteral_1= 'Black' ) ) )
            // InternalChessDSL.g:2036:2: ( (enumLiteral_0= 'White' ) | (enumLiteral_1= 'Black' ) )
            {
            // InternalChessDSL.g:2036:2: ( (enumLiteral_0= 'White' ) | (enumLiteral_1= 'Black' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==73) ) {
                alt32=1;
            }
            else if ( (LA32_0==74) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalChessDSL.g:2037:3: (enumLiteral_0= 'White' )
                    {
                    // InternalChessDSL.g:2037:3: (enumLiteral_0= 'White' )
                    // InternalChessDSL.g:2038:4: enumLiteral_0= 'White'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:2045:3: (enumLiteral_1= 'Black' )
                    {
                    // InternalChessDSL.g:2045:3: (enumLiteral_1= 'Black' )
                    // InternalChessDSL.g:2046:4: enumLiteral_1= 'Black'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "rulePiece"
    // InternalChessDSL.g:2056:1: rulePiece returns [Enumerator current=null] : ( (enumLiteral_0= 'King' ) | (enumLiteral_1= 'Queen' ) | (enumLiteral_2= 'Rook' ) | (enumLiteral_3= 'Bishop' ) | (enumLiteral_4= 'Knight' ) | (enumLiteral_5= 'Pawn' ) ) ;
    public final Enumerator rulePiece() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalChessDSL.g:2062:2: ( ( (enumLiteral_0= 'King' ) | (enumLiteral_1= 'Queen' ) | (enumLiteral_2= 'Rook' ) | (enumLiteral_3= 'Bishop' ) | (enumLiteral_4= 'Knight' ) | (enumLiteral_5= 'Pawn' ) ) )
            // InternalChessDSL.g:2063:2: ( (enumLiteral_0= 'King' ) | (enumLiteral_1= 'Queen' ) | (enumLiteral_2= 'Rook' ) | (enumLiteral_3= 'Bishop' ) | (enumLiteral_4= 'Knight' ) | (enumLiteral_5= 'Pawn' ) )
            {
            // InternalChessDSL.g:2063:2: ( (enumLiteral_0= 'King' ) | (enumLiteral_1= 'Queen' ) | (enumLiteral_2= 'Rook' ) | (enumLiteral_3= 'Bishop' ) | (enumLiteral_4= 'Knight' ) | (enumLiteral_5= 'Pawn' ) )
            int alt33=6;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt33=1;
                }
                break;
            case 76:
                {
                alt33=2;
                }
                break;
            case 77:
                {
                alt33=3;
                }
                break;
            case 78:
                {
                alt33=4;
                }
                break;
            case 79:
                {
                alt33=5;
                }
                break;
            case 80:
                {
                alt33=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalChessDSL.g:2064:3: (enumLiteral_0= 'King' )
                    {
                    // InternalChessDSL.g:2064:3: (enumLiteral_0= 'King' )
                    // InternalChessDSL.g:2065:4: enumLiteral_0= 'King'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getPieceAccess().getKingEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPieceAccess().getKingEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:2072:3: (enumLiteral_1= 'Queen' )
                    {
                    // InternalChessDSL.g:2072:3: (enumLiteral_1= 'Queen' )
                    // InternalChessDSL.g:2073:4: enumLiteral_1= 'Queen'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getPieceAccess().getQueenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPieceAccess().getQueenEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalChessDSL.g:2080:3: (enumLiteral_2= 'Rook' )
                    {
                    // InternalChessDSL.g:2080:3: (enumLiteral_2= 'Rook' )
                    // InternalChessDSL.g:2081:4: enumLiteral_2= 'Rook'
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getPieceAccess().getRookEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPieceAccess().getRookEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalChessDSL.g:2088:3: (enumLiteral_3= 'Bishop' )
                    {
                    // InternalChessDSL.g:2088:3: (enumLiteral_3= 'Bishop' )
                    // InternalChessDSL.g:2089:4: enumLiteral_3= 'Bishop'
                    {
                    enumLiteral_3=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getPieceAccess().getBishopEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPieceAccess().getBishopEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalChessDSL.g:2096:3: (enumLiteral_4= 'Knight' )
                    {
                    // InternalChessDSL.g:2096:3: (enumLiteral_4= 'Knight' )
                    // InternalChessDSL.g:2097:4: enumLiteral_4= 'Knight'
                    {
                    enumLiteral_4=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getPieceAccess().getKnightEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPieceAccess().getKnightEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalChessDSL.g:2104:3: (enumLiteral_5= 'Pawn' )
                    {
                    // InternalChessDSL.g:2104:3: (enumLiteral_5= 'Pawn' )
                    // InternalChessDSL.g:2105:4: enumLiteral_5= 'Pawn'
                    {
                    enumLiteral_5=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getPieceAccess().getPawnEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPieceAccess().getPawnEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePiece"

    // Delegated rules


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String dfa_1s = "\47\uffff";
    static final String dfa_2s = "\21\uffff\2\26\13\uffff\7\45\2\uffff";
    static final String dfa_3s = "\1\35\1\113\6\33\2\uffff\2\7\1\37\1\41\2\7\1\34\2\5\1\113\1\44\1\113\2\uffff\6\34\7\5\2\uffff";
    static final String dfa_4s = "\2\120\6\40\2\uffff\2\7\1\37\1\41\2\7\1\34\3\120\1\50\1\120\2\uffff\6\34\7\120\2\uffff";
    static final String dfa_5s = "\10\uffff\1\3\1\6\14\uffff\1\1\1\5\15\uffff\1\2\1\4";
    static final String dfa_6s = "\47\uffff}>";
    static final String[] dfa_7s = {
            "\1\11\1\1\6\uffff\1\10\2\uffff\1\10\42\uffff\1\2\1\3\1\4\1\5\1\6\1\7",
            "\1\2\1\3\1\4\1\5\1\6\1\7",
            "\1\12\4\uffff\1\13",
            "\1\12\4\uffff\1\13",
            "\1\12\4\uffff\1\13",
            "\1\12\4\uffff\1\13",
            "\1\12\4\uffff\1\13",
            "\1\12\4\uffff\1\13",
            "",
            "",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\2\26\11\uffff\1\26\12\uffff\1\26\1\uffff\2\26\3\uffff\1\23\1\24\1\25\1\26\2\uffff\1\26\1\uffff\1\10\1\27\37\uffff\6\26",
            "\2\26\11\uffff\1\26\12\uffff\1\26\1\uffff\2\26\3\uffff\1\23\1\24\1\25\1\26\2\uffff\1\26\1\uffff\1\10\1\27\37\uffff\6\26",
            "\1\30\1\31\1\32\1\33\1\34\1\35",
            "\1\25\3\uffff\1\10",
            "\1\36\1\37\1\40\1\41\1\42\1\43",
            "",
            "",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\2\45\11\uffff\1\45\10\uffff\1\46\1\uffff\1\45\1\uffff\2\45\6\uffff\1\45\2\uffff\1\45\2\uffff\1\27\37\uffff\6\45",
            "\2\45\11\uffff\1\45\10\uffff\1\46\1\uffff\1\45\1\uffff\2\45\6\uffff\1\45\2\uffff\1\45\2\uffff\1\27\37\uffff\6\45",
            "\2\45\11\uffff\1\45\10\uffff\1\46\1\uffff\1\45\1\uffff\2\45\6\uffff\1\45\2\uffff\1\45\2\uffff\1\27\37\uffff\6\45",
            "\2\45\11\uffff\1\45\10\uffff\1\46\1\uffff\1\45\1\uffff\2\45\6\uffff\1\45\2\uffff\1\45\2\uffff\1\27\37\uffff\6\45",
            "\2\45\11\uffff\1\45\10\uffff\1\46\1\uffff\1\45\1\uffff\2\45\6\uffff\1\45\2\uffff\1\45\2\uffff\1\27\37\uffff\6\45",
            "\2\45\11\uffff\1\45\10\uffff\1\46\1\uffff\1\45\1\uffff\2\45\6\uffff\1\45\2\uffff\1\45\2\uffff\1\27\37\uffff\6\45",
            "\2\45\11\uffff\1\45\10\uffff\1\46\1\uffff\1\45\1\uffff\2\45\6\uffff\1\45\2\uffff\1\45\2\uffff\1\27\37\uffff\6\45",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "729:2: (this_Move_0= ruleMove | this_Capture_1= ruleCapture | this_Castle_2= ruleCastle | this_EnPassant_3= ruleEnPassant | this_Promotion_4= rulePromotion | ruleDummy )";
        }
    }
    static final String dfa_8s = "\25\uffff";
    static final String dfa_9s = "\1\36\2\uffff\1\113\6\33\2\7\1\37\1\41\2\7\1\34\2\43\2\uffff";
    static final String dfa_10s = "\1\120\2\uffff\1\120\6\40\2\7\1\37\1\41\2\7\1\34\2\52\2\uffff";
    static final String dfa_11s = "\1\uffff\1\1\1\2\20\uffff\1\4\1\3";
    static final String dfa_12s = "\25\uffff}>";
    static final String[] dfa_13s = {
            "\1\3\6\uffff\1\1\2\uffff\1\2\42\uffff\1\4\1\5\1\6\1\7\1\10\1\11",
            "",
            "",
            "\1\4\1\5\1\6\1\7\1\10\1\11",
            "\1\12\4\uffff\1\13",
            "\1\12\4\uffff\1\13",
            "\1\12\4\uffff\1\13",
            "\1\12\4\uffff\1\13",
            "\1\12\4\uffff\1\13",
            "\1\12\4\uffff\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23\6\uffff\1\24",
            "\1\23\6\uffff\1\24",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1070:2: ( (otherlv_0= 'Castle(' (otherlv_1= 'Kingside' | otherlv_2= 'Queenside' ) otherlv_3= ')' ) | (otherlv_4= 'castles' (otherlv_5= 'on' otherlv_6= 'the' )? (otherlv_7= 'Kingside' | otherlv_8= 'Queenside' ) ) | ( ( (lv_move_9_0= ruleMove ) ) otherlv_10= 'Castle()' ) | ( ( (lv_move_11_0= ruleMove ) ) otherlv_12= 'and' otherlv_13= 'castles' ) )";
        }
    }
    static final String dfa_14s = "\23\uffff";
    static final String dfa_15s = "\1\36\1\113\6\33\2\7\1\37\1\41\2\7\1\34\2\42\2\uffff";
    static final String dfa_16s = "\2\120\6\40\2\7\1\37\1\41\2\7\1\34\2\53\2\uffff";
    static final String dfa_17s = "\21\uffff\1\2\1\1";
    static final String dfa_18s = "\23\uffff}>";
    static final String[] dfa_19s = {
            "\1\1\54\uffff\1\2\1\3\1\4\1\5\1\6\1\7",
            "\1\2\1\3\1\4\1\5\1\6\1\7",
            "\1\10\4\uffff\1\11",
            "\1\10\4\uffff\1\11",
            "\1\10\4\uffff\1\11",
            "\1\10\4\uffff\1\11",
            "\1\10\4\uffff\1\11",
            "\1\10\4\uffff\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\3\21\6\uffff\1\22",
            "\3\21\6\uffff\1\22",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1258:5: (lv_move_0_1= ruleMove | lv_move_0_2= ruleCapture )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000004C000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000048000L,0x0000000000000600L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000042L,0x0000000000000601L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000600L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x000000000001F800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000012064000040L,0x000000000001F800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000012060000040L,0x000000000001F800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000012060000042L,0x000000000001F800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L,0x00000000000001FCL});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000108000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000C002000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000601L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x8884000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});

}