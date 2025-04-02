package uk.ac.kcl.in.nerosiegfried.chessdsl.parser.antlr.internal;

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
import uk.ac.kcl.in.nerosiegfried.chessdsl.services.ChessDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalChessDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_MOVENUMBER", "RULE_ID", "RULE_LETTER", "RULE_RANKDIGIT", "RULE_SQUARETERMINAL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Game'", "'Players:'", "'Moves:'", "'end'", "':'", "'InitialState'", "'fresh'", "'custom'", "'Positions:'", "'{'", "'}'", "'='", "'on'", "'...'", "'('", "')'", "'dummy'", "'moves'", "'->'", "'from'", "'to'", "'Capture('", "'and'", "'captures'", "'Castle('", "'Kingside'", "'Queenside'", "'castles'", "'the'", "'Promotion('", "'O-O-O'", "'O-O'", "'K'", "'Q'", "'R'", "'B'", "'N'", "'+'", "'#'", "'x'", "'!'", "'?'", "'ran'", "'out'", "'of'", "'time'", "'resigned'", "'checkmated'", "'ended'", "'game'", "'in'", "'a'", "'stalemate'", "'repeated'", "'position'", "'three'", "'times'", "'played'", "'fifty'", "'without'", "'capture'", "'agreed'", "'draw'", "'wins'", "'Good'", "'Bad'", "'Excellent'", "'Risky'", "'Dubious'", "'Check'", "'Checkmate'", "'White'", "'Black'", "'King'", "'Queen'", "'Rook'", "'Bishop'", "'Knight'", "'Pawn'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int RULE_MOVENUMBER=5;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int RULE_INT=10;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_LETTER=7;
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
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_RANKDIGIT=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_SQUARETERMINAL=9;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

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
            					"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Game");
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
    // InternalChessDSL.g:108:1: ruleGame returns [EObject current=null] : (otherlv_0= 'Game' ( (lv_title_1_0= RULE_STRING ) ) (otherlv_2= 'Players:' ( (lv_players_3_0= rulePlayer ) )+ )? ( (lv_initial_4_0= ruleInitialState ) )? otherlv_5= 'Moves:' ( (lv_moves_6_0= ruleMovePair ) )* otherlv_7= 'end' ( (lv_conclusion_8_0= ruleConclusion ) )? ) ;
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
            // InternalChessDSL.g:114:2: ( (otherlv_0= 'Game' ( (lv_title_1_0= RULE_STRING ) ) (otherlv_2= 'Players:' ( (lv_players_3_0= rulePlayer ) )+ )? ( (lv_initial_4_0= ruleInitialState ) )? otherlv_5= 'Moves:' ( (lv_moves_6_0= ruleMovePair ) )* otherlv_7= 'end' ( (lv_conclusion_8_0= ruleConclusion ) )? ) )
            // InternalChessDSL.g:115:2: (otherlv_0= 'Game' ( (lv_title_1_0= RULE_STRING ) ) (otherlv_2= 'Players:' ( (lv_players_3_0= rulePlayer ) )+ )? ( (lv_initial_4_0= ruleInitialState ) )? otherlv_5= 'Moves:' ( (lv_moves_6_0= ruleMovePair ) )* otherlv_7= 'end' ( (lv_conclusion_8_0= ruleConclusion ) )? )
            {
            // InternalChessDSL.g:115:2: (otherlv_0= 'Game' ( (lv_title_1_0= RULE_STRING ) ) (otherlv_2= 'Players:' ( (lv_players_3_0= rulePlayer ) )+ )? ( (lv_initial_4_0= ruleInitialState ) )? otherlv_5= 'Moves:' ( (lv_moves_6_0= ruleMovePair ) )* otherlv_7= 'end' ( (lv_conclusion_8_0= ruleConclusion ) )? )
            // InternalChessDSL.g:116:3: otherlv_0= 'Game' ( (lv_title_1_0= RULE_STRING ) ) (otherlv_2= 'Players:' ( (lv_players_3_0= rulePlayer ) )+ )? ( (lv_initial_4_0= ruleInitialState ) )? otherlv_5= 'Moves:' ( (lv_moves_6_0= ruleMovePair ) )* otherlv_7= 'end' ( (lv_conclusion_8_0= ruleConclusion ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

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

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalChessDSL.g:139:4: otherlv_2= 'Players:' ( (lv_players_3_0= rulePlayer ) )+
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getGameAccess().getPlayersKeyword_2_0());
                    			
                    // InternalChessDSL.g:143:4: ( (lv_players_3_0= rulePlayer ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=86 && LA1_0<=87)) ) {
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
                    	    							"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Player");
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

            if ( (LA3_0==20) ) {
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
                    						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.InitialState");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getGameAccess().getMovesKeyword_4());
            		
            // InternalChessDSL.g:186:3: ( (lv_moves_6_0= ruleMovePair ) )*
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
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_moves_6_0=ruleMovePair();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"moves",
            	    						lv_moves_6_0,
            	    						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.MovePair");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getGameAccess().getEndKeyword_6());
            		
            // InternalChessDSL.g:209:3: ( (lv_conclusion_8_0= ruleConclusion ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||LA5_0==77||(LA5_0>=86 && LA5_0<=87)) ) {
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
                    						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Conclusion");
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
            				
            pushFollow(FOLLOW_10);
            lv_color_0_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlayerRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_0_0,
            						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

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

            otherlv_1=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getInitialStateAccess().getInitialStateKeyword_1());
            		
            // InternalChessDSL.g:318:3: (otherlv_2= 'fresh' | (otherlv_3= 'custom' ( (lv_positions_4_0= ruleCustomPositions ) ) ) )?
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( (LA6_0==22) ) {
                alt6=2;
            }
            switch (alt6) {
                case 1 :
                    // InternalChessDSL.g:319:4: otherlv_2= 'fresh'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getInitialStateAccess().getFreshKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:324:4: (otherlv_3= 'custom' ( (lv_positions_4_0= ruleCustomPositions ) ) )
                    {
                    // InternalChessDSL.g:324:4: (otherlv_3= 'custom' ( (lv_positions_4_0= ruleCustomPositions ) ) )
                    // InternalChessDSL.g:325:5: otherlv_3= 'custom' ( (lv_positions_4_0= ruleCustomPositions ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_12); 

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
                    								"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.CustomPositions");
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

            otherlv_1=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomPositionsAccess().getPositionsKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getCustomPositionsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalChessDSL.g:384:3: ( (lv_placement_3_0= rulePlacement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=86 && LA7_0<=87)) ) {
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
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_placement_3_0=rulePlacement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCustomPositionsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"placement",
            	    						lv_placement_3_0,
            	    						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Placement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_2); 

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

        EObject lv_square_3_0 = null;



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
            				
            pushFollow(FOLLOW_15);
            lv_piece_0_0=ruleCustomPiece();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlacementRule());
            					}
            					set(
            						current,
            						"piece",
            						lv_piece_0_0,
            						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.CustomPiece");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalChessDSL.g:445:3: (otherlv_1= '=' | otherlv_2= 'on' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            else if ( (LA8_0==27) ) {
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
                    otherlv_1=(Token)match(input,26,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getPlacementAccess().getEqualsSignKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:451:4: otherlv_2= 'on'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_16); 

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
            						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Square");
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
            				
            pushFollow(FOLLOW_17);
            lv_color_0_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomPieceRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_0_0,
            						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Color");
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
            						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Piece");
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
            lv_moveNumber_0_0=(Token)match(input,RULE_MOVENUMBER,FOLLOW_18); 

            					newLeafNode(lv_moveNumber_0_0, grammarAccess.getMovePairAccess().getMoveNumberMOVENUMBERTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMovePairRule());
            					}
            					setWithLastConsumed(
            						current,
            						"moveNumber",
            						lv_moveNumber_0_0,
            						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.MOVENUMBER");
            				

            }


            }

            // InternalChessDSL.g:569:3: ( ( ( (otherlv_1= RULE_ID ) )? ( (lv_whiteMove_2_0= ruleAnyMove ) ) ) | otherlv_3= '...' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_SQUARETERMINAL)||(LA10_0>=31 && LA10_0<=32)||LA10_0==39||LA10_0==42||(LA10_0>=45 && LA10_0<=51)||LA10_0==54||(LA10_0>=88 && LA10_0<=93)) ) {
                alt10=1;
            }
            else if ( (LA10_0==28) ) {
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
                            						
                            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_19); 

                            							newLeafNode(otherlv_1, grammarAccess.getMovePairAccess().getColor1PlayerOrColorCrossReference_1_0_0_0());
                            						

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
                    						
                    pushFollow(FOLLOW_20);
                    lv_whiteMove_2_0=ruleAnyMove();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getMovePairRule());
                    							}
                    							set(
                    								current,
                    								"whiteMove",
                    								lv_whiteMove_2_0,
                    								"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.AnyMove");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:605:4: otherlv_3= '...'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_20); 

                    				newLeafNode(otherlv_3, grammarAccess.getMovePairAccess().getFullStopFullStopFullStopKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalChessDSL.g:610:3: ( ( (otherlv_4= RULE_ID ) )? ( (lv_blackMove_5_0= ruleAnyMove ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_SQUARETERMINAL)||(LA12_0>=31 && LA12_0<=32)||LA12_0==39||LA12_0==42||(LA12_0>=45 && LA12_0<=51)||LA12_0==54||(LA12_0>=88 && LA12_0<=93)) ) {
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
                            					
                            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_19); 

                            						newLeafNode(otherlv_4, grammarAccess.getMovePairAccess().getColor2PlayerOrColorCrossReference_2_0_0());
                            					

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
                    							"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.AnyMove");
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
    // InternalChessDSL.g:655:1: ruleAnyMove returns [EObject current=null] : ( ( ( (lv_move_0_0= ruleDSLMove ) ) (otherlv_1= '(' ( (lv_remarks_2_0= ruleRemark ) )* otherlv_3= ')' )? ) | ( (lv_algebraicmove_4_0= ruleSANMove ) ) ) ;
    public final EObject ruleAnyMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_move_0_0 = null;

        Enumerator lv_remarks_2_0 = null;

        EObject lv_algebraicmove_4_0 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:661:2: ( ( ( ( (lv_move_0_0= ruleDSLMove ) ) (otherlv_1= '(' ( (lv_remarks_2_0= ruleRemark ) )* otherlv_3= ')' )? ) | ( (lv_algebraicmove_4_0= ruleSANMove ) ) ) )
            // InternalChessDSL.g:662:2: ( ( ( (lv_move_0_0= ruleDSLMove ) ) (otherlv_1= '(' ( (lv_remarks_2_0= ruleRemark ) )* otherlv_3= ')' )? ) | ( (lv_algebraicmove_4_0= ruleSANMove ) ) )
            {
            // InternalChessDSL.g:662:2: ( ( ( (lv_move_0_0= ruleDSLMove ) ) (otherlv_1= '(' ( (lv_remarks_2_0= ruleRemark ) )* otherlv_3= ')' )? ) | ( (lv_algebraicmove_4_0= ruleSANMove ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=31 && LA15_0<=32)||LA15_0==39||LA15_0==42||(LA15_0>=88 && LA15_0<=93)) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=RULE_LETTER && LA15_0<=RULE_SQUARETERMINAL)||(LA15_0>=45 && LA15_0<=51)||LA15_0==54) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalChessDSL.g:663:3: ( ( (lv_move_0_0= ruleDSLMove ) ) (otherlv_1= '(' ( (lv_remarks_2_0= ruleRemark ) )* otherlv_3= ')' )? )
                    {
                    // InternalChessDSL.g:663:3: ( ( (lv_move_0_0= ruleDSLMove ) ) (otherlv_1= '(' ( (lv_remarks_2_0= ruleRemark ) )* otherlv_3= ')' )? )
                    // InternalChessDSL.g:664:4: ( (lv_move_0_0= ruleDSLMove ) ) (otherlv_1= '(' ( (lv_remarks_2_0= ruleRemark ) )* otherlv_3= ')' )?
                    {
                    // InternalChessDSL.g:664:4: ( (lv_move_0_0= ruleDSLMove ) )
                    // InternalChessDSL.g:665:5: (lv_move_0_0= ruleDSLMove )
                    {
                    // InternalChessDSL.g:665:5: (lv_move_0_0= ruleDSLMove )
                    // InternalChessDSL.g:666:6: lv_move_0_0= ruleDSLMove
                    {

                    						newCompositeNode(grammarAccess.getAnyMoveAccess().getMoveDSLMoveParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_move_0_0=ruleDSLMove();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAnyMoveRule());
                    						}
                    						set(
                    							current,
                    							"move",
                    							lv_move_0_0,
                    							"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.DSLMove");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalChessDSL.g:683:4: (otherlv_1= '(' ( (lv_remarks_2_0= ruleRemark ) )* otherlv_3= ')' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==29) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalChessDSL.g:684:5: otherlv_1= '(' ( (lv_remarks_2_0= ruleRemark ) )* otherlv_3= ')'
                            {
                            otherlv_1=(Token)match(input,29,FOLLOW_22); 

                            					newLeafNode(otherlv_1, grammarAccess.getAnyMoveAccess().getLeftParenthesisKeyword_0_1_0());
                            				
                            // InternalChessDSL.g:688:5: ( (lv_remarks_2_0= ruleRemark ) )*
                            loop13:
                            do {
                                int alt13=2;
                                int LA13_0 = input.LA(1);

                                if ( ((LA13_0>=79 && LA13_0<=85)) ) {
                                    alt13=1;
                                }


                                switch (alt13) {
                            	case 1 :
                            	    // InternalChessDSL.g:689:6: (lv_remarks_2_0= ruleRemark )
                            	    {
                            	    // InternalChessDSL.g:689:6: (lv_remarks_2_0= ruleRemark )
                            	    // InternalChessDSL.g:690:7: lv_remarks_2_0= ruleRemark
                            	    {

                            	    							newCompositeNode(grammarAccess.getAnyMoveAccess().getRemarksRemarkEnumRuleCall_0_1_1_0());
                            	    						
                            	    pushFollow(FOLLOW_22);
                            	    lv_remarks_2_0=ruleRemark();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getAnyMoveRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"remarks",
                            	    								lv_remarks_2_0,
                            	    								"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Remark");
                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop13;
                                }
                            } while (true);

                            otherlv_3=(Token)match(input,30,FOLLOW_2); 

                            					newLeafNode(otherlv_3, grammarAccess.getAnyMoveAccess().getRightParenthesisKeyword_0_1_2());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:714:3: ( (lv_algebraicmove_4_0= ruleSANMove ) )
                    {
                    // InternalChessDSL.g:714:3: ( (lv_algebraicmove_4_0= ruleSANMove ) )
                    // InternalChessDSL.g:715:4: (lv_algebraicmove_4_0= ruleSANMove )
                    {
                    // InternalChessDSL.g:715:4: (lv_algebraicmove_4_0= ruleSANMove )
                    // InternalChessDSL.g:716:5: lv_algebraicmove_4_0= ruleSANMove
                    {

                    					newCompositeNode(grammarAccess.getAnyMoveAccess().getAlgebraicmoveSANMoveParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_algebraicmove_4_0=ruleSANMove();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAnyMoveRule());
                    					}
                    					set(
                    						current,
                    						"algebraicmove",
                    						lv_algebraicmove_4_0,
                    						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.SANMove");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleAnyMove"


    // $ANTLR start "entryRuleDSLMove"
    // InternalChessDSL.g:737:1: entryRuleDSLMove returns [EObject current=null] : iv_ruleDSLMove= ruleDSLMove EOF ;
    public final EObject entryRuleDSLMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSLMove = null;


        try {
            // InternalChessDSL.g:737:48: (iv_ruleDSLMove= ruleDSLMove EOF )
            // InternalChessDSL.g:738:2: iv_ruleDSLMove= ruleDSLMove EOF
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
    // InternalChessDSL.g:744:1: ruleDSLMove returns [EObject current=null] : (this_Move_0= ruleMove | this_Capture_1= ruleCapture | this_Castle_2= ruleCastle | this_EnPassant_3= ruleEnPassant | this_Promotion_4= rulePromotion | this_Dummy_5= ruleDummy ) ;
    public final EObject ruleDSLMove() throws RecognitionException {
        EObject current = null;

        EObject this_Move_0 = null;

        EObject this_Capture_1 = null;

        EObject this_Castle_2 = null;

        EObject this_EnPassant_3 = null;

        EObject this_Promotion_4 = null;

        EObject this_Dummy_5 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:750:2: ( (this_Move_0= ruleMove | this_Capture_1= ruleCapture | this_Castle_2= ruleCastle | this_EnPassant_3= ruleEnPassant | this_Promotion_4= rulePromotion | this_Dummy_5= ruleDummy ) )
            // InternalChessDSL.g:751:2: (this_Move_0= ruleMove | this_Capture_1= ruleCapture | this_Castle_2= ruleCastle | this_EnPassant_3= ruleEnPassant | this_Promotion_4= rulePromotion | this_Dummy_5= ruleDummy )
            {
            // InternalChessDSL.g:751:2: (this_Move_0= ruleMove | this_Capture_1= ruleCapture | this_Castle_2= ruleCastle | this_EnPassant_3= ruleEnPassant | this_Promotion_4= rulePromotion | this_Dummy_5= ruleDummy )
            int alt16=6;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalChessDSL.g:752:3: this_Move_0= ruleMove
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
                    // InternalChessDSL.g:761:3: this_Capture_1= ruleCapture
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
                    // InternalChessDSL.g:770:3: this_Castle_2= ruleCastle
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
                    // InternalChessDSL.g:779:3: this_EnPassant_3= ruleEnPassant
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
                    // InternalChessDSL.g:788:3: this_Promotion_4= rulePromotion
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
                    // InternalChessDSL.g:797:3: this_Dummy_5= ruleDummy
                    {

                    			newCompositeNode(grammarAccess.getDSLMoveAccess().getDummyParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Dummy_5=ruleDummy();

                    state._fsp--;


                    			current = this_Dummy_5;
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
    // InternalChessDSL.g:809:1: entryRuleDummy returns [EObject current=null] : iv_ruleDummy= ruleDummy EOF ;
    public final EObject entryRuleDummy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDummy = null;


        try {
            // InternalChessDSL.g:809:46: (iv_ruleDummy= ruleDummy EOF )
            // InternalChessDSL.g:810:2: iv_ruleDummy= ruleDummy EOF
            {
             newCompositeNode(grammarAccess.getDummyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDummy=ruleDummy();

            state._fsp--;

             current =iv_ruleDummy; 
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
    // InternalChessDSL.g:816:1: ruleDummy returns [EObject current=null] : ( () otherlv_1= 'dummy' ) ;
    public final EObject ruleDummy() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalChessDSL.g:822:2: ( ( () otherlv_1= 'dummy' ) )
            // InternalChessDSL.g:823:2: ( () otherlv_1= 'dummy' )
            {
            // InternalChessDSL.g:823:2: ( () otherlv_1= 'dummy' )
            // InternalChessDSL.g:824:3: () otherlv_1= 'dummy'
            {
            // InternalChessDSL.g:824:3: ()
            // InternalChessDSL.g:825:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDummyAccess().getDummyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDummyAccess().getDummyKeyword_1());
            		

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
    // $ANTLR end "ruleDummy"


    // $ANTLR start "entryRuleMove"
    // InternalChessDSL.g:839:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalChessDSL.g:839:45: (iv_ruleMove= ruleMove EOF )
            // InternalChessDSL.g:840:2: iv_ruleMove= ruleMove EOF
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
    // InternalChessDSL.g:846:1: ruleMove returns [EObject current=null] : ( (otherlv_0= 'moves' )? ( (lv_piece_1_0= rulePiece ) ) ( (otherlv_2= '(' ( (lv_from_3_0= ruleSquare ) ) otherlv_4= '->' ( (lv_to_5_0= ruleSquare ) ) otherlv_6= ')' ) | (otherlv_7= 'from' ( (lv_from_8_0= ruleSquare ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleSquare ) ) ) ) ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_piece_1_0 = null;

        EObject lv_from_3_0 = null;

        EObject lv_to_5_0 = null;

        EObject lv_from_8_0 = null;

        EObject lv_to_10_0 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:852:2: ( ( (otherlv_0= 'moves' )? ( (lv_piece_1_0= rulePiece ) ) ( (otherlv_2= '(' ( (lv_from_3_0= ruleSquare ) ) otherlv_4= '->' ( (lv_to_5_0= ruleSquare ) ) otherlv_6= ')' ) | (otherlv_7= 'from' ( (lv_from_8_0= ruleSquare ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleSquare ) ) ) ) ) )
            // InternalChessDSL.g:853:2: ( (otherlv_0= 'moves' )? ( (lv_piece_1_0= rulePiece ) ) ( (otherlv_2= '(' ( (lv_from_3_0= ruleSquare ) ) otherlv_4= '->' ( (lv_to_5_0= ruleSquare ) ) otherlv_6= ')' ) | (otherlv_7= 'from' ( (lv_from_8_0= ruleSquare ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleSquare ) ) ) ) )
            {
            // InternalChessDSL.g:853:2: ( (otherlv_0= 'moves' )? ( (lv_piece_1_0= rulePiece ) ) ( (otherlv_2= '(' ( (lv_from_3_0= ruleSquare ) ) otherlv_4= '->' ( (lv_to_5_0= ruleSquare ) ) otherlv_6= ')' ) | (otherlv_7= 'from' ( (lv_from_8_0= ruleSquare ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleSquare ) ) ) ) )
            // InternalChessDSL.g:854:3: (otherlv_0= 'moves' )? ( (lv_piece_1_0= rulePiece ) ) ( (otherlv_2= '(' ( (lv_from_3_0= ruleSquare ) ) otherlv_4= '->' ( (lv_to_5_0= ruleSquare ) ) otherlv_6= ')' ) | (otherlv_7= 'from' ( (lv_from_8_0= ruleSquare ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleSquare ) ) ) )
            {
            // InternalChessDSL.g:854:3: (otherlv_0= 'moves' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalChessDSL.g:855:4: otherlv_0= 'moves'
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_17); 

                    				newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getMovesKeyword_0());
                    			

                    }
                    break;

            }

            // InternalChessDSL.g:860:3: ( (lv_piece_1_0= rulePiece ) )
            // InternalChessDSL.g:861:4: (lv_piece_1_0= rulePiece )
            {
            // InternalChessDSL.g:861:4: (lv_piece_1_0= rulePiece )
            // InternalChessDSL.g:862:5: lv_piece_1_0= rulePiece
            {

            					newCompositeNode(grammarAccess.getMoveAccess().getPiecePieceEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_piece_1_0=rulePiece();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveRule());
            					}
            					set(
            						current,
            						"piece",
            						lv_piece_1_0,
            						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Piece");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalChessDSL.g:879:3: ( (otherlv_2= '(' ( (lv_from_3_0= ruleSquare ) ) otherlv_4= '->' ( (lv_to_5_0= ruleSquare ) ) otherlv_6= ')' ) | (otherlv_7= 'from' ( (lv_from_8_0= ruleSquare ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleSquare ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            else if ( (LA18_0==34) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalChessDSL.g:880:4: (otherlv_2= '(' ( (lv_from_3_0= ruleSquare ) ) otherlv_4= '->' ( (lv_to_5_0= ruleSquare ) ) otherlv_6= ')' )
                    {
                    // InternalChessDSL.g:880:4: (otherlv_2= '(' ( (lv_from_3_0= ruleSquare ) ) otherlv_4= '->' ( (lv_to_5_0= ruleSquare ) ) otherlv_6= ')' )
                    // InternalChessDSL.g:881:5: otherlv_2= '(' ( (lv_from_3_0= ruleSquare ) ) otherlv_4= '->' ( (lv_to_5_0= ruleSquare ) ) otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_16); 

                    					newLeafNode(otherlv_2, grammarAccess.getMoveAccess().getLeftParenthesisKeyword_2_0_0());
                    				
                    // InternalChessDSL.g:885:5: ( (lv_from_3_0= ruleSquare ) )
                    // InternalChessDSL.g:886:6: (lv_from_3_0= ruleSquare )
                    {
                    // InternalChessDSL.g:886:6: (lv_from_3_0= ruleSquare )
                    // InternalChessDSL.g:887:7: lv_from_3_0= ruleSquare
                    {

                    							newCompositeNode(grammarAccess.getMoveAccess().getFromSquareParserRuleCall_2_0_1_0());
                    						
                    pushFollow(FOLLOW_24);
                    lv_from_3_0=ruleSquare();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getMoveRule());
                    							}
                    							set(
                    								current,
                    								"from",
                    								lv_from_3_0,
                    								"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Square");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,33,FOLLOW_16); 

                    					newLeafNode(otherlv_4, grammarAccess.getMoveAccess().getHyphenMinusGreaterThanSignKeyword_2_0_2());
                    				
                    // InternalChessDSL.g:908:5: ( (lv_to_5_0= ruleSquare ) )
                    // InternalChessDSL.g:909:6: (lv_to_5_0= ruleSquare )
                    {
                    // InternalChessDSL.g:909:6: (lv_to_5_0= ruleSquare )
                    // InternalChessDSL.g:910:7: lv_to_5_0= ruleSquare
                    {

                    							newCompositeNode(grammarAccess.getMoveAccess().getToSquareParserRuleCall_2_0_3_0());
                    						
                    pushFollow(FOLLOW_25);
                    lv_to_5_0=ruleSquare();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getMoveRule());
                    							}
                    							set(
                    								current,
                    								"to",
                    								lv_to_5_0,
                    								"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Square");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_6=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(otherlv_6, grammarAccess.getMoveAccess().getRightParenthesisKeyword_2_0_4());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:933:4: (otherlv_7= 'from' ( (lv_from_8_0= ruleSquare ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleSquare ) ) )
                    {
                    // InternalChessDSL.g:933:4: (otherlv_7= 'from' ( (lv_from_8_0= ruleSquare ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleSquare ) ) )
                    // InternalChessDSL.g:934:5: otherlv_7= 'from' ( (lv_from_8_0= ruleSquare ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleSquare ) )
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_16); 

                    					newLeafNode(otherlv_7, grammarAccess.getMoveAccess().getFromKeyword_2_1_0());
                    				
                    // InternalChessDSL.g:938:5: ( (lv_from_8_0= ruleSquare ) )
                    // InternalChessDSL.g:939:6: (lv_from_8_0= ruleSquare )
                    {
                    // InternalChessDSL.g:939:6: (lv_from_8_0= ruleSquare )
                    // InternalChessDSL.g:940:7: lv_from_8_0= ruleSquare
                    {

                    							newCompositeNode(grammarAccess.getMoveAccess().getFromSquareParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_26);
                    lv_from_8_0=ruleSquare();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getMoveRule());
                    							}
                    							set(
                    								current,
                    								"from",
                    								lv_from_8_0,
                    								"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Square");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_9=(Token)match(input,35,FOLLOW_16); 

                    					newLeafNode(otherlv_9, grammarAccess.getMoveAccess().getToKeyword_2_1_2());
                    				
                    // InternalChessDSL.g:961:5: ( (lv_to_10_0= ruleSquare ) )
                    // InternalChessDSL.g:962:6: (lv_to_10_0= ruleSquare )
                    {
                    // InternalChessDSL.g:962:6: (lv_to_10_0= ruleSquare )
                    // InternalChessDSL.g:963:7: lv_to_10_0= ruleSquare
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
                    								"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Square");
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
    // InternalChessDSL.g:986:1: entryRuleCapture returns [EObject current=null] : iv_ruleCapture= ruleCapture EOF ;
    public final EObject entryRuleCapture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapture = null;


        try {
            // InternalChessDSL.g:986:48: (iv_ruleCapture= ruleCapture EOF )
            // InternalChessDSL.g:987:2: iv_ruleCapture= ruleCapture EOF
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
    // InternalChessDSL.g:993:1: ruleCapture returns [EObject current=null] : ( ( (lv_move_0_0= ruleMove ) ) ( (otherlv_1= 'Capture(' ( (lv_capture_2_0= rulePiece ) ) otherlv_3= ')' ) | ( (otherlv_4= 'and' )? otherlv_5= 'captures' ( (lv_capture_6_0= rulePiece ) ) ) ) ) ;
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
            // InternalChessDSL.g:999:2: ( ( ( (lv_move_0_0= ruleMove ) ) ( (otherlv_1= 'Capture(' ( (lv_capture_2_0= rulePiece ) ) otherlv_3= ')' ) | ( (otherlv_4= 'and' )? otherlv_5= 'captures' ( (lv_capture_6_0= rulePiece ) ) ) ) ) )
            // InternalChessDSL.g:1000:2: ( ( (lv_move_0_0= ruleMove ) ) ( (otherlv_1= 'Capture(' ( (lv_capture_2_0= rulePiece ) ) otherlv_3= ')' ) | ( (otherlv_4= 'and' )? otherlv_5= 'captures' ( (lv_capture_6_0= rulePiece ) ) ) ) )
            {
            // InternalChessDSL.g:1000:2: ( ( (lv_move_0_0= ruleMove ) ) ( (otherlv_1= 'Capture(' ( (lv_capture_2_0= rulePiece ) ) otherlv_3= ')' ) | ( (otherlv_4= 'and' )? otherlv_5= 'captures' ( (lv_capture_6_0= rulePiece ) ) ) ) )
            // InternalChessDSL.g:1001:3: ( (lv_move_0_0= ruleMove ) ) ( (otherlv_1= 'Capture(' ( (lv_capture_2_0= rulePiece ) ) otherlv_3= ')' ) | ( (otherlv_4= 'and' )? otherlv_5= 'captures' ( (lv_capture_6_0= rulePiece ) ) ) )
            {
            // InternalChessDSL.g:1001:3: ( (lv_move_0_0= ruleMove ) )
            // InternalChessDSL.g:1002:4: (lv_move_0_0= ruleMove )
            {
            // InternalChessDSL.g:1002:4: (lv_move_0_0= ruleMove )
            // InternalChessDSL.g:1003:5: lv_move_0_0= ruleMove
            {

            					newCompositeNode(grammarAccess.getCaptureAccess().getMoveMoveParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_27);
            lv_move_0_0=ruleMove();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCaptureRule());
            					}
            					set(
            						current,
            						"move",
            						lv_move_0_0,
            						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Move");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalChessDSL.g:1020:3: ( (otherlv_1= 'Capture(' ( (lv_capture_2_0= rulePiece ) ) otherlv_3= ')' ) | ( (otherlv_4= 'and' )? otherlv_5= 'captures' ( (lv_capture_6_0= rulePiece ) ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=37 && LA20_0<=38)) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalChessDSL.g:1021:4: (otherlv_1= 'Capture(' ( (lv_capture_2_0= rulePiece ) ) otherlv_3= ')' )
                    {
                    // InternalChessDSL.g:1021:4: (otherlv_1= 'Capture(' ( (lv_capture_2_0= rulePiece ) ) otherlv_3= ')' )
                    // InternalChessDSL.g:1022:5: otherlv_1= 'Capture(' ( (lv_capture_2_0= rulePiece ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_17); 

                    					newLeafNode(otherlv_1, grammarAccess.getCaptureAccess().getCaptureKeyword_1_0_0());
                    				
                    // InternalChessDSL.g:1026:5: ( (lv_capture_2_0= rulePiece ) )
                    // InternalChessDSL.g:1027:6: (lv_capture_2_0= rulePiece )
                    {
                    // InternalChessDSL.g:1027:6: (lv_capture_2_0= rulePiece )
                    // InternalChessDSL.g:1028:7: lv_capture_2_0= rulePiece
                    {

                    							newCompositeNode(grammarAccess.getCaptureAccess().getCapturePieceEnumRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_25);
                    lv_capture_2_0=rulePiece();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCaptureRule());
                    							}
                    							set(
                    								current,
                    								"capture",
                    								lv_capture_2_0,
                    								"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Piece");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(otherlv_3, grammarAccess.getCaptureAccess().getRightParenthesisKeyword_1_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1051:4: ( (otherlv_4= 'and' )? otherlv_5= 'captures' ( (lv_capture_6_0= rulePiece ) ) )
                    {
                    // InternalChessDSL.g:1051:4: ( (otherlv_4= 'and' )? otherlv_5= 'captures' ( (lv_capture_6_0= rulePiece ) ) )
                    // InternalChessDSL.g:1052:5: (otherlv_4= 'and' )? otherlv_5= 'captures' ( (lv_capture_6_0= rulePiece ) )
                    {
                    // InternalChessDSL.g:1052:5: (otherlv_4= 'and' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==37) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalChessDSL.g:1053:6: otherlv_4= 'and'
                            {
                            otherlv_4=(Token)match(input,37,FOLLOW_28); 

                            						newLeafNode(otherlv_4, grammarAccess.getCaptureAccess().getAndKeyword_1_1_0());
                            					

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,38,FOLLOW_17); 

                    					newLeafNode(otherlv_5, grammarAccess.getCaptureAccess().getCapturesKeyword_1_1_1());
                    				
                    // InternalChessDSL.g:1062:5: ( (lv_capture_6_0= rulePiece ) )
                    // InternalChessDSL.g:1063:6: (lv_capture_6_0= rulePiece )
                    {
                    // InternalChessDSL.g:1063:6: (lv_capture_6_0= rulePiece )
                    // InternalChessDSL.g:1064:7: lv_capture_6_0= rulePiece
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
                    								"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Piece");
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
    // InternalChessDSL.g:1087:1: entryRuleCastle returns [EObject current=null] : iv_ruleCastle= ruleCastle EOF ;
    public final EObject entryRuleCastle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCastle = null;


        try {
            // InternalChessDSL.g:1087:47: (iv_ruleCastle= ruleCastle EOF )
            // InternalChessDSL.g:1088:2: iv_ruleCastle= ruleCastle EOF
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
    // InternalChessDSL.g:1094:1: ruleCastle returns [EObject current=null] : ( (otherlv_0= 'Castle(' ( ( (lv_side_1_1= 'Kingside' | lv_side_1_2= 'Queenside' ) ) ) otherlv_2= ')' ) | (otherlv_3= 'castles' (otherlv_4= 'on' otherlv_5= 'the' )? ( ( (lv_side_6_1= 'Kingside' | lv_side_6_2= 'Queenside' ) ) ) ) | ( ( (lv_move_7_0= ruleMove ) ) otherlv_8= 'Castle(' ( ( (lv_side_9_1= 'Kingside' | lv_side_9_2= 'Queenside' ) ) ) otherlv_10= ')' ) | ( ( (lv_move_11_0= ruleMove ) ) otherlv_12= 'and' otherlv_13= 'castles' ( ( (lv_side_14_1= 'Kingside' | lv_side_14_2= 'Queenside' ) ) ) ) ) ;
    public final EObject ruleCastle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_side_1_1=null;
        Token lv_side_1_2=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_side_6_1=null;
        Token lv_side_6_2=null;
        Token otherlv_8=null;
        Token lv_side_9_1=null;
        Token lv_side_9_2=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_side_14_1=null;
        Token lv_side_14_2=null;
        EObject lv_move_7_0 = null;

        EObject lv_move_11_0 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:1100:2: ( ( (otherlv_0= 'Castle(' ( ( (lv_side_1_1= 'Kingside' | lv_side_1_2= 'Queenside' ) ) ) otherlv_2= ')' ) | (otherlv_3= 'castles' (otherlv_4= 'on' otherlv_5= 'the' )? ( ( (lv_side_6_1= 'Kingside' | lv_side_6_2= 'Queenside' ) ) ) ) | ( ( (lv_move_7_0= ruleMove ) ) otherlv_8= 'Castle(' ( ( (lv_side_9_1= 'Kingside' | lv_side_9_2= 'Queenside' ) ) ) otherlv_10= ')' ) | ( ( (lv_move_11_0= ruleMove ) ) otherlv_12= 'and' otherlv_13= 'castles' ( ( (lv_side_14_1= 'Kingside' | lv_side_14_2= 'Queenside' ) ) ) ) ) )
            // InternalChessDSL.g:1101:2: ( (otherlv_0= 'Castle(' ( ( (lv_side_1_1= 'Kingside' | lv_side_1_2= 'Queenside' ) ) ) otherlv_2= ')' ) | (otherlv_3= 'castles' (otherlv_4= 'on' otherlv_5= 'the' )? ( ( (lv_side_6_1= 'Kingside' | lv_side_6_2= 'Queenside' ) ) ) ) | ( ( (lv_move_7_0= ruleMove ) ) otherlv_8= 'Castle(' ( ( (lv_side_9_1= 'Kingside' | lv_side_9_2= 'Queenside' ) ) ) otherlv_10= ')' ) | ( ( (lv_move_11_0= ruleMove ) ) otherlv_12= 'and' otherlv_13= 'castles' ( ( (lv_side_14_1= 'Kingside' | lv_side_14_2= 'Queenside' ) ) ) ) )
            {
            // InternalChessDSL.g:1101:2: ( (otherlv_0= 'Castle(' ( ( (lv_side_1_1= 'Kingside' | lv_side_1_2= 'Queenside' ) ) ) otherlv_2= ')' ) | (otherlv_3= 'castles' (otherlv_4= 'on' otherlv_5= 'the' )? ( ( (lv_side_6_1= 'Kingside' | lv_side_6_2= 'Queenside' ) ) ) ) | ( ( (lv_move_7_0= ruleMove ) ) otherlv_8= 'Castle(' ( ( (lv_side_9_1= 'Kingside' | lv_side_9_2= 'Queenside' ) ) ) otherlv_10= ')' ) | ( ( (lv_move_11_0= ruleMove ) ) otherlv_12= 'and' otherlv_13= 'castles' ( ( (lv_side_14_1= 'Kingside' | lv_side_14_2= 'Queenside' ) ) ) ) )
            int alt26=4;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // InternalChessDSL.g:1102:3: (otherlv_0= 'Castle(' ( ( (lv_side_1_1= 'Kingside' | lv_side_1_2= 'Queenside' ) ) ) otherlv_2= ')' )
                    {
                    // InternalChessDSL.g:1102:3: (otherlv_0= 'Castle(' ( ( (lv_side_1_1= 'Kingside' | lv_side_1_2= 'Queenside' ) ) ) otherlv_2= ')' )
                    // InternalChessDSL.g:1103:4: otherlv_0= 'Castle(' ( ( (lv_side_1_1= 'Kingside' | lv_side_1_2= 'Queenside' ) ) ) otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,39,FOLLOW_29); 

                    				newLeafNode(otherlv_0, grammarAccess.getCastleAccess().getCastleKeyword_0_0());
                    			
                    // InternalChessDSL.g:1107:4: ( ( (lv_side_1_1= 'Kingside' | lv_side_1_2= 'Queenside' ) ) )
                    // InternalChessDSL.g:1108:5: ( (lv_side_1_1= 'Kingside' | lv_side_1_2= 'Queenside' ) )
                    {
                    // InternalChessDSL.g:1108:5: ( (lv_side_1_1= 'Kingside' | lv_side_1_2= 'Queenside' ) )
                    // InternalChessDSL.g:1109:6: (lv_side_1_1= 'Kingside' | lv_side_1_2= 'Queenside' )
                    {
                    // InternalChessDSL.g:1109:6: (lv_side_1_1= 'Kingside' | lv_side_1_2= 'Queenside' )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==40) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==41) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalChessDSL.g:1110:7: lv_side_1_1= 'Kingside'
                            {
                            lv_side_1_1=(Token)match(input,40,FOLLOW_25); 

                            							newLeafNode(lv_side_1_1, grammarAccess.getCastleAccess().getSideKingsideKeyword_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCastleRule());
                            							}
                            							setWithLastConsumed(current, "side", lv_side_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalChessDSL.g:1121:7: lv_side_1_2= 'Queenside'
                            {
                            lv_side_1_2=(Token)match(input,41,FOLLOW_25); 

                            							newLeafNode(lv_side_1_2, grammarAccess.getCastleAccess().getSideQueensideKeyword_0_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCastleRule());
                            							}
                            							setWithLastConsumed(current, "side", lv_side_1_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_2=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getCastleAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1140:3: (otherlv_3= 'castles' (otherlv_4= 'on' otherlv_5= 'the' )? ( ( (lv_side_6_1= 'Kingside' | lv_side_6_2= 'Queenside' ) ) ) )
                    {
                    // InternalChessDSL.g:1140:3: (otherlv_3= 'castles' (otherlv_4= 'on' otherlv_5= 'the' )? ( ( (lv_side_6_1= 'Kingside' | lv_side_6_2= 'Queenside' ) ) ) )
                    // InternalChessDSL.g:1141:4: otherlv_3= 'castles' (otherlv_4= 'on' otherlv_5= 'the' )? ( ( (lv_side_6_1= 'Kingside' | lv_side_6_2= 'Queenside' ) ) )
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_30); 

                    				newLeafNode(otherlv_3, grammarAccess.getCastleAccess().getCastlesKeyword_1_0());
                    			
                    // InternalChessDSL.g:1145:4: (otherlv_4= 'on' otherlv_5= 'the' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==27) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalChessDSL.g:1146:5: otherlv_4= 'on' otherlv_5= 'the'
                            {
                            otherlv_4=(Token)match(input,27,FOLLOW_31); 

                            					newLeafNode(otherlv_4, grammarAccess.getCastleAccess().getOnKeyword_1_1_0());
                            				
                            otherlv_5=(Token)match(input,43,FOLLOW_29); 

                            					newLeafNode(otherlv_5, grammarAccess.getCastleAccess().getTheKeyword_1_1_1());
                            				

                            }
                            break;

                    }

                    // InternalChessDSL.g:1155:4: ( ( (lv_side_6_1= 'Kingside' | lv_side_6_2= 'Queenside' ) ) )
                    // InternalChessDSL.g:1156:5: ( (lv_side_6_1= 'Kingside' | lv_side_6_2= 'Queenside' ) )
                    {
                    // InternalChessDSL.g:1156:5: ( (lv_side_6_1= 'Kingside' | lv_side_6_2= 'Queenside' ) )
                    // InternalChessDSL.g:1157:6: (lv_side_6_1= 'Kingside' | lv_side_6_2= 'Queenside' )
                    {
                    // InternalChessDSL.g:1157:6: (lv_side_6_1= 'Kingside' | lv_side_6_2= 'Queenside' )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==40) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==41) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalChessDSL.g:1158:7: lv_side_6_1= 'Kingside'
                            {
                            lv_side_6_1=(Token)match(input,40,FOLLOW_2); 

                            							newLeafNode(lv_side_6_1, grammarAccess.getCastleAccess().getSideKingsideKeyword_1_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCastleRule());
                            							}
                            							setWithLastConsumed(current, "side", lv_side_6_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalChessDSL.g:1169:7: lv_side_6_2= 'Queenside'
                            {
                            lv_side_6_2=(Token)match(input,41,FOLLOW_2); 

                            							newLeafNode(lv_side_6_2, grammarAccess.getCastleAccess().getSideQueensideKeyword_1_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCastleRule());
                            							}
                            							setWithLastConsumed(current, "side", lv_side_6_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalChessDSL.g:1184:3: ( ( (lv_move_7_0= ruleMove ) ) otherlv_8= 'Castle(' ( ( (lv_side_9_1= 'Kingside' | lv_side_9_2= 'Queenside' ) ) ) otherlv_10= ')' )
                    {
                    // InternalChessDSL.g:1184:3: ( ( (lv_move_7_0= ruleMove ) ) otherlv_8= 'Castle(' ( ( (lv_side_9_1= 'Kingside' | lv_side_9_2= 'Queenside' ) ) ) otherlv_10= ')' )
                    // InternalChessDSL.g:1185:4: ( (lv_move_7_0= ruleMove ) ) otherlv_8= 'Castle(' ( ( (lv_side_9_1= 'Kingside' | lv_side_9_2= 'Queenside' ) ) ) otherlv_10= ')'
                    {
                    // InternalChessDSL.g:1185:4: ( (lv_move_7_0= ruleMove ) )
                    // InternalChessDSL.g:1186:5: (lv_move_7_0= ruleMove )
                    {
                    // InternalChessDSL.g:1186:5: (lv_move_7_0= ruleMove )
                    // InternalChessDSL.g:1187:6: lv_move_7_0= ruleMove
                    {

                    						newCompositeNode(grammarAccess.getCastleAccess().getMoveMoveParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_move_7_0=ruleMove();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCastleRule());
                    						}
                    						set(
                    							current,
                    							"move",
                    							lv_move_7_0,
                    							"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Move");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,39,FOLLOW_29); 

                    				newLeafNode(otherlv_8, grammarAccess.getCastleAccess().getCastleKeyword_2_1());
                    			
                    // InternalChessDSL.g:1208:4: ( ( (lv_side_9_1= 'Kingside' | lv_side_9_2= 'Queenside' ) ) )
                    // InternalChessDSL.g:1209:5: ( (lv_side_9_1= 'Kingside' | lv_side_9_2= 'Queenside' ) )
                    {
                    // InternalChessDSL.g:1209:5: ( (lv_side_9_1= 'Kingside' | lv_side_9_2= 'Queenside' ) )
                    // InternalChessDSL.g:1210:6: (lv_side_9_1= 'Kingside' | lv_side_9_2= 'Queenside' )
                    {
                    // InternalChessDSL.g:1210:6: (lv_side_9_1= 'Kingside' | lv_side_9_2= 'Queenside' )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==40) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==41) ) {
                        alt24=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalChessDSL.g:1211:7: lv_side_9_1= 'Kingside'
                            {
                            lv_side_9_1=(Token)match(input,40,FOLLOW_25); 

                            							newLeafNode(lv_side_9_1, grammarAccess.getCastleAccess().getSideKingsideKeyword_2_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCastleRule());
                            							}
                            							setWithLastConsumed(current, "side", lv_side_9_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalChessDSL.g:1222:7: lv_side_9_2= 'Queenside'
                            {
                            lv_side_9_2=(Token)match(input,41,FOLLOW_25); 

                            							newLeafNode(lv_side_9_2, grammarAccess.getCastleAccess().getSideQueensideKeyword_2_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCastleRule());
                            							}
                            							setWithLastConsumed(current, "side", lv_side_9_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_10=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getCastleAccess().getRightParenthesisKeyword_2_3());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalChessDSL.g:1241:3: ( ( (lv_move_11_0= ruleMove ) ) otherlv_12= 'and' otherlv_13= 'castles' ( ( (lv_side_14_1= 'Kingside' | lv_side_14_2= 'Queenside' ) ) ) )
                    {
                    // InternalChessDSL.g:1241:3: ( ( (lv_move_11_0= ruleMove ) ) otherlv_12= 'and' otherlv_13= 'castles' ( ( (lv_side_14_1= 'Kingside' | lv_side_14_2= 'Queenside' ) ) ) )
                    // InternalChessDSL.g:1242:4: ( (lv_move_11_0= ruleMove ) ) otherlv_12= 'and' otherlv_13= 'castles' ( ( (lv_side_14_1= 'Kingside' | lv_side_14_2= 'Queenside' ) ) )
                    {
                    // InternalChessDSL.g:1242:4: ( (lv_move_11_0= ruleMove ) )
                    // InternalChessDSL.g:1243:5: (lv_move_11_0= ruleMove )
                    {
                    // InternalChessDSL.g:1243:5: (lv_move_11_0= ruleMove )
                    // InternalChessDSL.g:1244:6: lv_move_11_0= ruleMove
                    {

                    						newCompositeNode(grammarAccess.getCastleAccess().getMoveMoveParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_move_11_0=ruleMove();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCastleRule());
                    						}
                    						set(
                    							current,
                    							"move",
                    							lv_move_11_0,
                    							"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Move");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,37,FOLLOW_34); 

                    				newLeafNode(otherlv_12, grammarAccess.getCastleAccess().getAndKeyword_3_1());
                    			
                    otherlv_13=(Token)match(input,42,FOLLOW_29); 

                    				newLeafNode(otherlv_13, grammarAccess.getCastleAccess().getCastlesKeyword_3_2());
                    			
                    // InternalChessDSL.g:1269:4: ( ( (lv_side_14_1= 'Kingside' | lv_side_14_2= 'Queenside' ) ) )
                    // InternalChessDSL.g:1270:5: ( (lv_side_14_1= 'Kingside' | lv_side_14_2= 'Queenside' ) )
                    {
                    // InternalChessDSL.g:1270:5: ( (lv_side_14_1= 'Kingside' | lv_side_14_2= 'Queenside' ) )
                    // InternalChessDSL.g:1271:6: (lv_side_14_1= 'Kingside' | lv_side_14_2= 'Queenside' )
                    {
                    // InternalChessDSL.g:1271:6: (lv_side_14_1= 'Kingside' | lv_side_14_2= 'Queenside' )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==40) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==41) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalChessDSL.g:1272:7: lv_side_14_1= 'Kingside'
                            {
                            lv_side_14_1=(Token)match(input,40,FOLLOW_2); 

                            							newLeafNode(lv_side_14_1, grammarAccess.getCastleAccess().getSideKingsideKeyword_3_3_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCastleRule());
                            							}
                            							setWithLastConsumed(current, "side", lv_side_14_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalChessDSL.g:1283:7: lv_side_14_2= 'Queenside'
                            {
                            lv_side_14_2=(Token)match(input,41,FOLLOW_2); 

                            							newLeafNode(lv_side_14_2, grammarAccess.getCastleAccess().getSideQueensideKeyword_3_3_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCastleRule());
                            							}
                            							setWithLastConsumed(current, "side", lv_side_14_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


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
    // InternalChessDSL.g:1301:1: entryRuleEnPassant returns [EObject current=null] : iv_ruleEnPassant= ruleEnPassant EOF ;
    public final EObject entryRuleEnPassant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnPassant = null;


        try {
            // InternalChessDSL.g:1301:50: (iv_ruleEnPassant= ruleEnPassant EOF )
            // InternalChessDSL.g:1302:2: iv_ruleEnPassant= ruleEnPassant EOF
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
    // InternalChessDSL.g:1308:1: ruleEnPassant returns [EObject current=null] : ( ( (lv_capture_0_0= ruleCapture ) ) otherlv_1= 'on' ( (lv_square_2_0= ruleSquare ) ) ) ;
    public final EObject ruleEnPassant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_capture_0_0 = null;

        EObject lv_square_2_0 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:1314:2: ( ( ( (lv_capture_0_0= ruleCapture ) ) otherlv_1= 'on' ( (lv_square_2_0= ruleSquare ) ) ) )
            // InternalChessDSL.g:1315:2: ( ( (lv_capture_0_0= ruleCapture ) ) otherlv_1= 'on' ( (lv_square_2_0= ruleSquare ) ) )
            {
            // InternalChessDSL.g:1315:2: ( ( (lv_capture_0_0= ruleCapture ) ) otherlv_1= 'on' ( (lv_square_2_0= ruleSquare ) ) )
            // InternalChessDSL.g:1316:3: ( (lv_capture_0_0= ruleCapture ) ) otherlv_1= 'on' ( (lv_square_2_0= ruleSquare ) )
            {
            // InternalChessDSL.g:1316:3: ( (lv_capture_0_0= ruleCapture ) )
            // InternalChessDSL.g:1317:4: (lv_capture_0_0= ruleCapture )
            {
            // InternalChessDSL.g:1317:4: (lv_capture_0_0= ruleCapture )
            // InternalChessDSL.g:1318:5: lv_capture_0_0= ruleCapture
            {

            					newCompositeNode(grammarAccess.getEnPassantAccess().getCaptureCaptureParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_35);
            lv_capture_0_0=ruleCapture();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnPassantRule());
            					}
            					set(
            						current,
            						"capture",
            						lv_capture_0_0,
            						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Capture");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getEnPassantAccess().getOnKeyword_1());
            		
            // InternalChessDSL.g:1339:3: ( (lv_square_2_0= ruleSquare ) )
            // InternalChessDSL.g:1340:4: (lv_square_2_0= ruleSquare )
            {
            // InternalChessDSL.g:1340:4: (lv_square_2_0= ruleSquare )
            // InternalChessDSL.g:1341:5: lv_square_2_0= ruleSquare
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
            						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Square");
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
    // InternalChessDSL.g:1362:1: entryRulePromotion returns [EObject current=null] : iv_rulePromotion= rulePromotion EOF ;
    public final EObject entryRulePromotion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePromotion = null;


        try {
            // InternalChessDSL.g:1362:50: (iv_rulePromotion= rulePromotion EOF )
            // InternalChessDSL.g:1363:2: iv_rulePromotion= rulePromotion EOF
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
    // InternalChessDSL.g:1369:1: rulePromotion returns [EObject current=null] : ( ( ( (lv_move_0_1= ruleMove | lv_move_0_2= ruleCapture ) ) ) otherlv_1= 'Promotion(' ( (lv_piece_2_0= rulePiece ) ) otherlv_3= ')' ) ;
    public final EObject rulePromotion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_move_0_1 = null;

        EObject lv_move_0_2 = null;

        Enumerator lv_piece_2_0 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:1375:2: ( ( ( ( (lv_move_0_1= ruleMove | lv_move_0_2= ruleCapture ) ) ) otherlv_1= 'Promotion(' ( (lv_piece_2_0= rulePiece ) ) otherlv_3= ')' ) )
            // InternalChessDSL.g:1376:2: ( ( ( (lv_move_0_1= ruleMove | lv_move_0_2= ruleCapture ) ) ) otherlv_1= 'Promotion(' ( (lv_piece_2_0= rulePiece ) ) otherlv_3= ')' )
            {
            // InternalChessDSL.g:1376:2: ( ( ( (lv_move_0_1= ruleMove | lv_move_0_2= ruleCapture ) ) ) otherlv_1= 'Promotion(' ( (lv_piece_2_0= rulePiece ) ) otherlv_3= ')' )
            // InternalChessDSL.g:1377:3: ( ( (lv_move_0_1= ruleMove | lv_move_0_2= ruleCapture ) ) ) otherlv_1= 'Promotion(' ( (lv_piece_2_0= rulePiece ) ) otherlv_3= ')'
            {
            // InternalChessDSL.g:1377:3: ( ( (lv_move_0_1= ruleMove | lv_move_0_2= ruleCapture ) ) )
            // InternalChessDSL.g:1378:4: ( (lv_move_0_1= ruleMove | lv_move_0_2= ruleCapture ) )
            {
            // InternalChessDSL.g:1378:4: ( (lv_move_0_1= ruleMove | lv_move_0_2= ruleCapture ) )
            // InternalChessDSL.g:1379:5: (lv_move_0_1= ruleMove | lv_move_0_2= ruleCapture )
            {
            // InternalChessDSL.g:1379:5: (lv_move_0_1= ruleMove | lv_move_0_2= ruleCapture )
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalChessDSL.g:1380:6: lv_move_0_1= ruleMove
                    {

                    						newCompositeNode(grammarAccess.getPromotionAccess().getMoveMoveParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_move_0_1=ruleMove();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPromotionRule());
                    						}
                    						set(
                    							current,
                    							"move",
                    							lv_move_0_1,
                    							"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Move");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1396:6: lv_move_0_2= ruleCapture
                    {

                    						newCompositeNode(grammarAccess.getPromotionAccess().getMoveCaptureParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_36);
                    lv_move_0_2=ruleCapture();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPromotionRule());
                    						}
                    						set(
                    							current,
                    							"move",
                    							lv_move_0_2,
                    							"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Capture");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getPromotionAccess().getPromotionKeyword_1());
            		
            // InternalChessDSL.g:1418:3: ( (lv_piece_2_0= rulePiece ) )
            // InternalChessDSL.g:1419:4: (lv_piece_2_0= rulePiece )
            {
            // InternalChessDSL.g:1419:4: (lv_piece_2_0= rulePiece )
            // InternalChessDSL.g:1420:5: lv_piece_2_0= rulePiece
            {

            					newCompositeNode(grammarAccess.getPromotionAccess().getPiecePieceEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
            lv_piece_2_0=rulePiece();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPromotionRule());
            					}
            					set(
            						current,
            						"piece",
            						lv_piece_2_0,
            						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Piece");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_2); 

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


    // $ANTLR start "entryRuleSANMove"
    // InternalChessDSL.g:1445:1: entryRuleSANMove returns [EObject current=null] : iv_ruleSANMove= ruleSANMove EOF ;
    public final EObject entryRuleSANMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSANMove = null;


        try {
            // InternalChessDSL.g:1445:48: (iv_ruleSANMove= ruleSANMove EOF )
            // InternalChessDSL.g:1446:2: iv_ruleSANMove= ruleSANMove EOF
            {
             newCompositeNode(grammarAccess.getSANMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSANMove=ruleSANMove();

            state._fsp--;

             current =iv_ruleSANMove; 
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
    // $ANTLR end "entryRuleSANMove"


    // $ANTLR start "ruleSANMove"
    // InternalChessDSL.g:1452:1: ruleSANMove returns [EObject current=null] : ( () ( ( (lv_castle_1_0= ruleSANCastle ) ) | ( (lv_normal_2_0= ruleSANNormal ) ) ) ) ;
    public final EObject ruleSANMove() throws RecognitionException {
        EObject current = null;

        EObject lv_castle_1_0 = null;

        EObject lv_normal_2_0 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:1458:2: ( ( () ( ( (lv_castle_1_0= ruleSANCastle ) ) | ( (lv_normal_2_0= ruleSANNormal ) ) ) ) )
            // InternalChessDSL.g:1459:2: ( () ( ( (lv_castle_1_0= ruleSANCastle ) ) | ( (lv_normal_2_0= ruleSANNormal ) ) ) )
            {
            // InternalChessDSL.g:1459:2: ( () ( ( (lv_castle_1_0= ruleSANCastle ) ) | ( (lv_normal_2_0= ruleSANNormal ) ) ) )
            // InternalChessDSL.g:1460:3: () ( ( (lv_castle_1_0= ruleSANCastle ) ) | ( (lv_normal_2_0= ruleSANNormal ) ) )
            {
            // InternalChessDSL.g:1460:3: ()
            // InternalChessDSL.g:1461:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSANMoveAccess().getSANMoveAction_0(),
            					current);
            			

            }

            // InternalChessDSL.g:1467:3: ( ( (lv_castle_1_0= ruleSANCastle ) ) | ( (lv_normal_2_0= ruleSANNormal ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=45 && LA28_0<=46)) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=RULE_LETTER && LA28_0<=RULE_SQUARETERMINAL)||(LA28_0>=47 && LA28_0<=51)||LA28_0==54) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalChessDSL.g:1468:4: ( (lv_castle_1_0= ruleSANCastle ) )
                    {
                    // InternalChessDSL.g:1468:4: ( (lv_castle_1_0= ruleSANCastle ) )
                    // InternalChessDSL.g:1469:5: (lv_castle_1_0= ruleSANCastle )
                    {
                    // InternalChessDSL.g:1469:5: (lv_castle_1_0= ruleSANCastle )
                    // InternalChessDSL.g:1470:6: lv_castle_1_0= ruleSANCastle
                    {

                    						newCompositeNode(grammarAccess.getSANMoveAccess().getCastleSANCastleParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_castle_1_0=ruleSANCastle();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSANMoveRule());
                    						}
                    						set(
                    							current,
                    							"castle",
                    							lv_castle_1_0,
                    							"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.SANCastle");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1488:4: ( (lv_normal_2_0= ruleSANNormal ) )
                    {
                    // InternalChessDSL.g:1488:4: ( (lv_normal_2_0= ruleSANNormal ) )
                    // InternalChessDSL.g:1489:5: (lv_normal_2_0= ruleSANNormal )
                    {
                    // InternalChessDSL.g:1489:5: (lv_normal_2_0= ruleSANNormal )
                    // InternalChessDSL.g:1490:6: lv_normal_2_0= ruleSANNormal
                    {

                    						newCompositeNode(grammarAccess.getSANMoveAccess().getNormalSANNormalParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_normal_2_0=ruleSANNormal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSANMoveRule());
                    						}
                    						set(
                    							current,
                    							"normal",
                    							lv_normal_2_0,
                    							"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.SANNormal");
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
    // $ANTLR end "ruleSANMove"


    // $ANTLR start "entryRuleSANCastle"
    // InternalChessDSL.g:1512:1: entryRuleSANCastle returns [EObject current=null] : iv_ruleSANCastle= ruleSANCastle EOF ;
    public final EObject entryRuleSANCastle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSANCastle = null;


        try {
            // InternalChessDSL.g:1512:50: (iv_ruleSANCastle= ruleSANCastle EOF )
            // InternalChessDSL.g:1513:2: iv_ruleSANCastle= ruleSANCastle EOF
            {
             newCompositeNode(grammarAccess.getSANCastleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSANCastle=ruleSANCastle();

            state._fsp--;

             current =iv_ruleSANCastle; 
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
    // $ANTLR end "entryRuleSANCastle"


    // $ANTLR start "ruleSANCastle"
    // InternalChessDSL.g:1519:1: ruleSANCastle returns [EObject current=null] : ( ( () (otherlv_1= 'O-O-O' ( (lv_side_2_0= 'Queenside' ) ) ) ) | (otherlv_3= 'O-O' ( (lv_side_4_0= 'Kingside' ) ) ) ) ;
    public final EObject ruleSANCastle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_side_2_0=null;
        Token otherlv_3=null;
        Token lv_side_4_0=null;


        	enterRule();

        try {
            // InternalChessDSL.g:1525:2: ( ( ( () (otherlv_1= 'O-O-O' ( (lv_side_2_0= 'Queenside' ) ) ) ) | (otherlv_3= 'O-O' ( (lv_side_4_0= 'Kingside' ) ) ) ) )
            // InternalChessDSL.g:1526:2: ( ( () (otherlv_1= 'O-O-O' ( (lv_side_2_0= 'Queenside' ) ) ) ) | (otherlv_3= 'O-O' ( (lv_side_4_0= 'Kingside' ) ) ) )
            {
            // InternalChessDSL.g:1526:2: ( ( () (otherlv_1= 'O-O-O' ( (lv_side_2_0= 'Queenside' ) ) ) ) | (otherlv_3= 'O-O' ( (lv_side_4_0= 'Kingside' ) ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==45) ) {
                alt29=1;
            }
            else if ( (LA29_0==46) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalChessDSL.g:1527:3: ( () (otherlv_1= 'O-O-O' ( (lv_side_2_0= 'Queenside' ) ) ) )
                    {
                    // InternalChessDSL.g:1527:3: ( () (otherlv_1= 'O-O-O' ( (lv_side_2_0= 'Queenside' ) ) ) )
                    // InternalChessDSL.g:1528:4: () (otherlv_1= 'O-O-O' ( (lv_side_2_0= 'Queenside' ) ) )
                    {
                    // InternalChessDSL.g:1528:4: ()
                    // InternalChessDSL.g:1529:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSANCastleAccess().getSANCastleAction_0_0(),
                    						current);
                    				

                    }

                    // InternalChessDSL.g:1535:4: (otherlv_1= 'O-O-O' ( (lv_side_2_0= 'Queenside' ) ) )
                    // InternalChessDSL.g:1536:5: otherlv_1= 'O-O-O' ( (lv_side_2_0= 'Queenside' ) )
                    {
                    otherlv_1=(Token)match(input,45,FOLLOW_37); 

                    					newLeafNode(otherlv_1, grammarAccess.getSANCastleAccess().getOOOKeyword_0_1_0());
                    				
                    // InternalChessDSL.g:1540:5: ( (lv_side_2_0= 'Queenside' ) )
                    // InternalChessDSL.g:1541:6: (lv_side_2_0= 'Queenside' )
                    {
                    // InternalChessDSL.g:1541:6: (lv_side_2_0= 'Queenside' )
                    // InternalChessDSL.g:1542:7: lv_side_2_0= 'Queenside'
                    {
                    lv_side_2_0=(Token)match(input,41,FOLLOW_2); 

                    							newLeafNode(lv_side_2_0, grammarAccess.getSANCastleAccess().getSideQueensideKeyword_0_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSANCastleRule());
                    							}
                    							setWithLastConsumed(current, "side", lv_side_2_0, "Queenside");
                    						

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1557:3: (otherlv_3= 'O-O' ( (lv_side_4_0= 'Kingside' ) ) )
                    {
                    // InternalChessDSL.g:1557:3: (otherlv_3= 'O-O' ( (lv_side_4_0= 'Kingside' ) ) )
                    // InternalChessDSL.g:1558:4: otherlv_3= 'O-O' ( (lv_side_4_0= 'Kingside' ) )
                    {
                    otherlv_3=(Token)match(input,46,FOLLOW_38); 

                    				newLeafNode(otherlv_3, grammarAccess.getSANCastleAccess().getOOKeyword_1_0());
                    			
                    // InternalChessDSL.g:1562:4: ( (lv_side_4_0= 'Kingside' ) )
                    // InternalChessDSL.g:1563:5: (lv_side_4_0= 'Kingside' )
                    {
                    // InternalChessDSL.g:1563:5: (lv_side_4_0= 'Kingside' )
                    // InternalChessDSL.g:1564:6: lv_side_4_0= 'Kingside'
                    {
                    lv_side_4_0=(Token)match(input,40,FOLLOW_2); 

                    						newLeafNode(lv_side_4_0, grammarAccess.getSANCastleAccess().getSideKingsideKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSANCastleRule());
                    						}
                    						setWithLastConsumed(current, "side", lv_side_4_0, "Kingside");
                    					

                    }


                    }


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
    // $ANTLR end "ruleSANCastle"


    // $ANTLR start "entryRuleSANNormal"
    // InternalChessDSL.g:1581:1: entryRuleSANNormal returns [EObject current=null] : iv_ruleSANNormal= ruleSANNormal EOF ;
    public final EObject entryRuleSANNormal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSANNormal = null;


        try {
            // InternalChessDSL.g:1581:50: (iv_ruleSANNormal= ruleSANNormal EOF )
            // InternalChessDSL.g:1582:2: iv_ruleSANNormal= ruleSANNormal EOF
            {
             newCompositeNode(grammarAccess.getSANNormalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSANNormal=ruleSANNormal();

            state._fsp--;

             current =iv_ruleSANNormal; 
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
    // $ANTLR end "entryRuleSANNormal"


    // $ANTLR start "ruleSANNormal"
    // InternalChessDSL.g:1588:1: ruleSANNormal returns [EObject current=null] : ( () ( (lv_piece_1_0= ruleSANPiece ) )? ( (lv_disamb_2_0= ruleSANDisambiguation ) )? ( (lv_capture_3_0= ruleSANCapture ) )? ( (lv_target_4_0= ruleSquare ) ) ( (lv_promotion_5_0= ruleSANPromotion ) )? ( (lv_check_6_0= ruleSANCheckMarker ) )? ( (lv_remark_7_0= ruleSANRemark ) )? ) ;
    public final EObject ruleSANNormal() throws RecognitionException {
        EObject current = null;

        EObject lv_piece_1_0 = null;

        EObject lv_disamb_2_0 = null;

        EObject lv_capture_3_0 = null;

        EObject lv_target_4_0 = null;

        EObject lv_promotion_5_0 = null;

        EObject lv_check_6_0 = null;

        EObject lv_remark_7_0 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:1594:2: ( ( () ( (lv_piece_1_0= ruleSANPiece ) )? ( (lv_disamb_2_0= ruleSANDisambiguation ) )? ( (lv_capture_3_0= ruleSANCapture ) )? ( (lv_target_4_0= ruleSquare ) ) ( (lv_promotion_5_0= ruleSANPromotion ) )? ( (lv_check_6_0= ruleSANCheckMarker ) )? ( (lv_remark_7_0= ruleSANRemark ) )? ) )
            // InternalChessDSL.g:1595:2: ( () ( (lv_piece_1_0= ruleSANPiece ) )? ( (lv_disamb_2_0= ruleSANDisambiguation ) )? ( (lv_capture_3_0= ruleSANCapture ) )? ( (lv_target_4_0= ruleSquare ) ) ( (lv_promotion_5_0= ruleSANPromotion ) )? ( (lv_check_6_0= ruleSANCheckMarker ) )? ( (lv_remark_7_0= ruleSANRemark ) )? )
            {
            // InternalChessDSL.g:1595:2: ( () ( (lv_piece_1_0= ruleSANPiece ) )? ( (lv_disamb_2_0= ruleSANDisambiguation ) )? ( (lv_capture_3_0= ruleSANCapture ) )? ( (lv_target_4_0= ruleSquare ) ) ( (lv_promotion_5_0= ruleSANPromotion ) )? ( (lv_check_6_0= ruleSANCheckMarker ) )? ( (lv_remark_7_0= ruleSANRemark ) )? )
            // InternalChessDSL.g:1596:3: () ( (lv_piece_1_0= ruleSANPiece ) )? ( (lv_disamb_2_0= ruleSANDisambiguation ) )? ( (lv_capture_3_0= ruleSANCapture ) )? ( (lv_target_4_0= ruleSquare ) ) ( (lv_promotion_5_0= ruleSANPromotion ) )? ( (lv_check_6_0= ruleSANCheckMarker ) )? ( (lv_remark_7_0= ruleSANRemark ) )?
            {
            // InternalChessDSL.g:1596:3: ()
            // InternalChessDSL.g:1597:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSANNormalAccess().getSANNormalAction_0(),
            					current);
            			

            }

            // InternalChessDSL.g:1603:3: ( (lv_piece_1_0= ruleSANPiece ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=47 && LA30_0<=51)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalChessDSL.g:1604:4: (lv_piece_1_0= ruleSANPiece )
                    {
                    // InternalChessDSL.g:1604:4: (lv_piece_1_0= ruleSANPiece )
                    // InternalChessDSL.g:1605:5: lv_piece_1_0= ruleSANPiece
                    {

                    					newCompositeNode(grammarAccess.getSANNormalAccess().getPieceSANPieceParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_39);
                    lv_piece_1_0=ruleSANPiece();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSANNormalRule());
                    					}
                    					set(
                    						current,
                    						"piece",
                    						lv_piece_1_0,
                    						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.SANPiece");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalChessDSL.g:1622:3: ( (lv_disamb_2_0= ruleSANDisambiguation ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_LETTER && LA31_0<=RULE_RANKDIGIT)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalChessDSL.g:1623:4: (lv_disamb_2_0= ruleSANDisambiguation )
                    {
                    // InternalChessDSL.g:1623:4: (lv_disamb_2_0= ruleSANDisambiguation )
                    // InternalChessDSL.g:1624:5: lv_disamb_2_0= ruleSANDisambiguation
                    {

                    					newCompositeNode(grammarAccess.getSANNormalAccess().getDisambSANDisambiguationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_40);
                    lv_disamb_2_0=ruleSANDisambiguation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSANNormalRule());
                    					}
                    					set(
                    						current,
                    						"disamb",
                    						lv_disamb_2_0,
                    						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.SANDisambiguation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalChessDSL.g:1641:3: ( (lv_capture_3_0= ruleSANCapture ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==54) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalChessDSL.g:1642:4: (lv_capture_3_0= ruleSANCapture )
                    {
                    // InternalChessDSL.g:1642:4: (lv_capture_3_0= ruleSANCapture )
                    // InternalChessDSL.g:1643:5: lv_capture_3_0= ruleSANCapture
                    {

                    					newCompositeNode(grammarAccess.getSANNormalAccess().getCaptureSANCaptureParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_capture_3_0=ruleSANCapture();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSANNormalRule());
                    					}
                    					set(
                    						current,
                    						"capture",
                    						lv_capture_3_0,
                    						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.SANCapture");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalChessDSL.g:1660:3: ( (lv_target_4_0= ruleSquare ) )
            // InternalChessDSL.g:1661:4: (lv_target_4_0= ruleSquare )
            {
            // InternalChessDSL.g:1661:4: (lv_target_4_0= ruleSquare )
            // InternalChessDSL.g:1662:5: lv_target_4_0= ruleSquare
            {

            					newCompositeNode(grammarAccess.getSANNormalAccess().getTargetSquareParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_41);
            lv_target_4_0=ruleSquare();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSANNormalRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_4_0,
            						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Square");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalChessDSL.g:1679:3: ( (lv_promotion_5_0= ruleSANPromotion ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==26) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalChessDSL.g:1680:4: (lv_promotion_5_0= ruleSANPromotion )
                    {
                    // InternalChessDSL.g:1680:4: (lv_promotion_5_0= ruleSANPromotion )
                    // InternalChessDSL.g:1681:5: lv_promotion_5_0= ruleSANPromotion
                    {

                    					newCompositeNode(grammarAccess.getSANNormalAccess().getPromotionSANPromotionParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_42);
                    lv_promotion_5_0=ruleSANPromotion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSANNormalRule());
                    					}
                    					set(
                    						current,
                    						"promotion",
                    						lv_promotion_5_0,
                    						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.SANPromotion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalChessDSL.g:1698:3: ( (lv_check_6_0= ruleSANCheckMarker ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=52 && LA34_0<=53)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalChessDSL.g:1699:4: (lv_check_6_0= ruleSANCheckMarker )
                    {
                    // InternalChessDSL.g:1699:4: (lv_check_6_0= ruleSANCheckMarker )
                    // InternalChessDSL.g:1700:5: lv_check_6_0= ruleSANCheckMarker
                    {

                    					newCompositeNode(grammarAccess.getSANNormalAccess().getCheckSANCheckMarkerParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_43);
                    lv_check_6_0=ruleSANCheckMarker();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSANNormalRule());
                    					}
                    					set(
                    						current,
                    						"check",
                    						lv_check_6_0,
                    						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.SANCheckMarker");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalChessDSL.g:1717:3: ( (lv_remark_7_0= ruleSANRemark ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=55 && LA35_0<=56)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalChessDSL.g:1718:4: (lv_remark_7_0= ruleSANRemark )
                    {
                    // InternalChessDSL.g:1718:4: (lv_remark_7_0= ruleSANRemark )
                    // InternalChessDSL.g:1719:5: lv_remark_7_0= ruleSANRemark
                    {

                    					newCompositeNode(grammarAccess.getSANNormalAccess().getRemarkSANRemarkParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_remark_7_0=ruleSANRemark();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSANNormalRule());
                    					}
                    					set(
                    						current,
                    						"remark",
                    						lv_remark_7_0,
                    						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.SANRemark");
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
    // $ANTLR end "ruleSANNormal"


    // $ANTLR start "entryRuleSANPiece"
    // InternalChessDSL.g:1740:1: entryRuleSANPiece returns [EObject current=null] : iv_ruleSANPiece= ruleSANPiece EOF ;
    public final EObject entryRuleSANPiece() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSANPiece = null;


        try {
            // InternalChessDSL.g:1740:49: (iv_ruleSANPiece= ruleSANPiece EOF )
            // InternalChessDSL.g:1741:2: iv_ruleSANPiece= ruleSANPiece EOF
            {
             newCompositeNode(grammarAccess.getSANPieceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSANPiece=ruleSANPiece();

            state._fsp--;

             current =iv_ruleSANPiece; 
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
    // $ANTLR end "entryRuleSANPiece"


    // $ANTLR start "ruleSANPiece"
    // InternalChessDSL.g:1747:1: ruleSANPiece returns [EObject current=null] : ( () (otherlv_1= 'K' | otherlv_2= 'Q' | otherlv_3= 'R' | otherlv_4= 'B' | otherlv_5= 'N' ) ) ;
    public final EObject ruleSANPiece() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalChessDSL.g:1753:2: ( ( () (otherlv_1= 'K' | otherlv_2= 'Q' | otherlv_3= 'R' | otherlv_4= 'B' | otherlv_5= 'N' ) ) )
            // InternalChessDSL.g:1754:2: ( () (otherlv_1= 'K' | otherlv_2= 'Q' | otherlv_3= 'R' | otherlv_4= 'B' | otherlv_5= 'N' ) )
            {
            // InternalChessDSL.g:1754:2: ( () (otherlv_1= 'K' | otherlv_2= 'Q' | otherlv_3= 'R' | otherlv_4= 'B' | otherlv_5= 'N' ) )
            // InternalChessDSL.g:1755:3: () (otherlv_1= 'K' | otherlv_2= 'Q' | otherlv_3= 'R' | otherlv_4= 'B' | otherlv_5= 'N' )
            {
            // InternalChessDSL.g:1755:3: ()
            // InternalChessDSL.g:1756:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSANPieceAccess().getSANPieceAction_0(),
            					current);
            			

            }

            // InternalChessDSL.g:1762:3: (otherlv_1= 'K' | otherlv_2= 'Q' | otherlv_3= 'R' | otherlv_4= 'B' | otherlv_5= 'N' )
            int alt36=5;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt36=1;
                }
                break;
            case 48:
                {
                alt36=2;
                }
                break;
            case 49:
                {
                alt36=3;
                }
                break;
            case 50:
                {
                alt36=4;
                }
                break;
            case 51:
                {
                alt36=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalChessDSL.g:1763:4: otherlv_1= 'K'
                    {
                    otherlv_1=(Token)match(input,47,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getSANPieceAccess().getKKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1768:4: otherlv_2= 'Q'
                    {
                    otherlv_2=(Token)match(input,48,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getSANPieceAccess().getQKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalChessDSL.g:1773:4: otherlv_3= 'R'
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getSANPieceAccess().getRKeyword_1_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalChessDSL.g:1778:4: otherlv_4= 'B'
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getSANPieceAccess().getBKeyword_1_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalChessDSL.g:1783:4: otherlv_5= 'N'
                    {
                    otherlv_5=(Token)match(input,51,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getSANPieceAccess().getNKeyword_1_4());
                    			

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
    // $ANTLR end "ruleSANPiece"


    // $ANTLR start "entryRuleSANDisambiguation"
    // InternalChessDSL.g:1792:1: entryRuleSANDisambiguation returns [EObject current=null] : iv_ruleSANDisambiguation= ruleSANDisambiguation EOF ;
    public final EObject entryRuleSANDisambiguation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSANDisambiguation = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalChessDSL.g:1794:2: (iv_ruleSANDisambiguation= ruleSANDisambiguation EOF )
            // InternalChessDSL.g:1795:2: iv_ruleSANDisambiguation= ruleSANDisambiguation EOF
            {
             newCompositeNode(grammarAccess.getSANDisambiguationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSANDisambiguation=ruleSANDisambiguation();

            state._fsp--;

             current =iv_ruleSANDisambiguation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleSANDisambiguation"


    // $ANTLR start "ruleSANDisambiguation"
    // InternalChessDSL.g:1804:1: ruleSANDisambiguation returns [EObject current=null] : ( () (this_LETTER_1= RULE_LETTER | this_RANKDIGIT_2= RULE_RANKDIGIT )+ ) ;
    public final EObject ruleSANDisambiguation() throws RecognitionException {
        EObject current = null;

        Token this_LETTER_1=null;
        Token this_RANKDIGIT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalChessDSL.g:1811:2: ( ( () (this_LETTER_1= RULE_LETTER | this_RANKDIGIT_2= RULE_RANKDIGIT )+ ) )
            // InternalChessDSL.g:1812:2: ( () (this_LETTER_1= RULE_LETTER | this_RANKDIGIT_2= RULE_RANKDIGIT )+ )
            {
            // InternalChessDSL.g:1812:2: ( () (this_LETTER_1= RULE_LETTER | this_RANKDIGIT_2= RULE_RANKDIGIT )+ )
            // InternalChessDSL.g:1813:3: () (this_LETTER_1= RULE_LETTER | this_RANKDIGIT_2= RULE_RANKDIGIT )+
            {
            // InternalChessDSL.g:1813:3: ()
            // InternalChessDSL.g:1814:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSANDisambiguationAccess().getSANDisambiguationAction_0(),
            					current);
            			

            }

            // InternalChessDSL.g:1820:3: (this_LETTER_1= RULE_LETTER | this_RANKDIGIT_2= RULE_RANKDIGIT )+
            int cnt37=0;
            loop37:
            do {
                int alt37=3;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_LETTER) ) {
                    alt37=1;
                }
                else if ( (LA37_0==RULE_RANKDIGIT) ) {
                    alt37=2;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalChessDSL.g:1821:4: this_LETTER_1= RULE_LETTER
            	    {
            	    this_LETTER_1=(Token)match(input,RULE_LETTER,FOLLOW_44); 

            	    				newLeafNode(this_LETTER_1, grammarAccess.getSANDisambiguationAccess().getLETTERTerminalRuleCall_1_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalChessDSL.g:1826:4: this_RANKDIGIT_2= RULE_RANKDIGIT
            	    {
            	    this_RANKDIGIT_2=(Token)match(input,RULE_RANKDIGIT,FOLLOW_44); 

            	    				newLeafNode(this_RANKDIGIT_2, grammarAccess.getSANDisambiguationAccess().getRANKDIGITTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSANDisambiguation"


    // $ANTLR start "entryRuleSANPromotion"
    // InternalChessDSL.g:1838:1: entryRuleSANPromotion returns [EObject current=null] : iv_ruleSANPromotion= ruleSANPromotion EOF ;
    public final EObject entryRuleSANPromotion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSANPromotion = null;


        try {
            // InternalChessDSL.g:1838:53: (iv_ruleSANPromotion= ruleSANPromotion EOF )
            // InternalChessDSL.g:1839:2: iv_ruleSANPromotion= ruleSANPromotion EOF
            {
             newCompositeNode(grammarAccess.getSANPromotionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSANPromotion=ruleSANPromotion();

            state._fsp--;

             current =iv_ruleSANPromotion; 
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
    // $ANTLR end "entryRuleSANPromotion"


    // $ANTLR start "ruleSANPromotion"
    // InternalChessDSL.g:1845:1: ruleSANPromotion returns [EObject current=null] : ( () otherlv_1= '=' (otherlv_2= 'Q' | otherlv_3= 'R' | otherlv_4= 'B' | otherlv_5= 'N' ) ) ;
    public final EObject ruleSANPromotion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalChessDSL.g:1851:2: ( ( () otherlv_1= '=' (otherlv_2= 'Q' | otherlv_3= 'R' | otherlv_4= 'B' | otherlv_5= 'N' ) ) )
            // InternalChessDSL.g:1852:2: ( () otherlv_1= '=' (otherlv_2= 'Q' | otherlv_3= 'R' | otherlv_4= 'B' | otherlv_5= 'N' ) )
            {
            // InternalChessDSL.g:1852:2: ( () otherlv_1= '=' (otherlv_2= 'Q' | otherlv_3= 'R' | otherlv_4= 'B' | otherlv_5= 'N' ) )
            // InternalChessDSL.g:1853:3: () otherlv_1= '=' (otherlv_2= 'Q' | otherlv_3= 'R' | otherlv_4= 'B' | otherlv_5= 'N' )
            {
            // InternalChessDSL.g:1853:3: ()
            // InternalChessDSL.g:1854:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSANPromotionAccess().getSANPromotionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_45); 

            			newLeafNode(otherlv_1, grammarAccess.getSANPromotionAccess().getEqualsSignKeyword_1());
            		
            // InternalChessDSL.g:1864:3: (otherlv_2= 'Q' | otherlv_3= 'R' | otherlv_4= 'B' | otherlv_5= 'N' )
            int alt38=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt38=1;
                }
                break;
            case 49:
                {
                alt38=2;
                }
                break;
            case 50:
                {
                alt38=3;
                }
                break;
            case 51:
                {
                alt38=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalChessDSL.g:1865:4: otherlv_2= 'Q'
                    {
                    otherlv_2=(Token)match(input,48,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getSANPromotionAccess().getQKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1870:4: otherlv_3= 'R'
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getSANPromotionAccess().getRKeyword_2_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalChessDSL.g:1875:4: otherlv_4= 'B'
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getSANPromotionAccess().getBKeyword_2_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalChessDSL.g:1880:4: otherlv_5= 'N'
                    {
                    otherlv_5=(Token)match(input,51,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getSANPromotionAccess().getNKeyword_2_3());
                    			

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
    // $ANTLR end "ruleSANPromotion"


    // $ANTLR start "entryRuleSANCheckMarker"
    // InternalChessDSL.g:1889:1: entryRuleSANCheckMarker returns [EObject current=null] : iv_ruleSANCheckMarker= ruleSANCheckMarker EOF ;
    public final EObject entryRuleSANCheckMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSANCheckMarker = null;


        try {
            // InternalChessDSL.g:1889:55: (iv_ruleSANCheckMarker= ruleSANCheckMarker EOF )
            // InternalChessDSL.g:1890:2: iv_ruleSANCheckMarker= ruleSANCheckMarker EOF
            {
             newCompositeNode(grammarAccess.getSANCheckMarkerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSANCheckMarker=ruleSANCheckMarker();

            state._fsp--;

             current =iv_ruleSANCheckMarker; 
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
    // $ANTLR end "entryRuleSANCheckMarker"


    // $ANTLR start "ruleSANCheckMarker"
    // InternalChessDSL.g:1896:1: ruleSANCheckMarker returns [EObject current=null] : ( () (otherlv_1= '+' | otherlv_2= '#' )+ ) ;
    public final EObject ruleSANCheckMarker() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalChessDSL.g:1902:2: ( ( () (otherlv_1= '+' | otherlv_2= '#' )+ ) )
            // InternalChessDSL.g:1903:2: ( () (otherlv_1= '+' | otherlv_2= '#' )+ )
            {
            // InternalChessDSL.g:1903:2: ( () (otherlv_1= '+' | otherlv_2= '#' )+ )
            // InternalChessDSL.g:1904:3: () (otherlv_1= '+' | otherlv_2= '#' )+
            {
            // InternalChessDSL.g:1904:3: ()
            // InternalChessDSL.g:1905:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSANCheckMarkerAccess().getSANCheckMarkerAction_0(),
            					current);
            			

            }

            // InternalChessDSL.g:1911:3: (otherlv_1= '+' | otherlv_2= '#' )+
            int cnt39=0;
            loop39:
            do {
                int alt39=3;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==52) ) {
                    alt39=1;
                }
                else if ( (LA39_0==53) ) {
                    alt39=2;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalChessDSL.g:1912:4: otherlv_1= '+'
            	    {
            	    otherlv_1=(Token)match(input,52,FOLLOW_46); 

            	    				newLeafNode(otherlv_1, grammarAccess.getSANCheckMarkerAccess().getPlusSignKeyword_1_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalChessDSL.g:1917:4: otherlv_2= '#'
            	    {
            	    otherlv_2=(Token)match(input,53,FOLLOW_46); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSANCheckMarkerAccess().getNumberSignKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);


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
    // $ANTLR end "ruleSANCheckMarker"


    // $ANTLR start "entryRuleSANCapture"
    // InternalChessDSL.g:1926:1: entryRuleSANCapture returns [EObject current=null] : iv_ruleSANCapture= ruleSANCapture EOF ;
    public final EObject entryRuleSANCapture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSANCapture = null;


        try {
            // InternalChessDSL.g:1926:51: (iv_ruleSANCapture= ruleSANCapture EOF )
            // InternalChessDSL.g:1927:2: iv_ruleSANCapture= ruleSANCapture EOF
            {
             newCompositeNode(grammarAccess.getSANCaptureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSANCapture=ruleSANCapture();

            state._fsp--;

             current =iv_ruleSANCapture; 
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
    // $ANTLR end "entryRuleSANCapture"


    // $ANTLR start "ruleSANCapture"
    // InternalChessDSL.g:1933:1: ruleSANCapture returns [EObject current=null] : ( () otherlv_1= 'x' ) ;
    public final EObject ruleSANCapture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalChessDSL.g:1939:2: ( ( () otherlv_1= 'x' ) )
            // InternalChessDSL.g:1940:2: ( () otherlv_1= 'x' )
            {
            // InternalChessDSL.g:1940:2: ( () otherlv_1= 'x' )
            // InternalChessDSL.g:1941:3: () otherlv_1= 'x'
            {
            // InternalChessDSL.g:1941:3: ()
            // InternalChessDSL.g:1942:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSANCaptureAccess().getSANCaptureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSANCaptureAccess().getXKeyword_1());
            		

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
    // $ANTLR end "ruleSANCapture"


    // $ANTLR start "entryRuleSANRemark"
    // InternalChessDSL.g:1956:1: entryRuleSANRemark returns [EObject current=null] : iv_ruleSANRemark= ruleSANRemark EOF ;
    public final EObject entryRuleSANRemark() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSANRemark = null;


        try {
            // InternalChessDSL.g:1956:50: (iv_ruleSANRemark= ruleSANRemark EOF )
            // InternalChessDSL.g:1957:2: iv_ruleSANRemark= ruleSANRemark EOF
            {
             newCompositeNode(grammarAccess.getSANRemarkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSANRemark=ruleSANRemark();

            state._fsp--;

             current =iv_ruleSANRemark; 
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
    // $ANTLR end "entryRuleSANRemark"


    // $ANTLR start "ruleSANRemark"
    // InternalChessDSL.g:1963:1: ruleSANRemark returns [EObject current=null] : ( () (otherlv_1= '!' | otherlv_2= '?' )+ ) ;
    public final EObject ruleSANRemark() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalChessDSL.g:1969:2: ( ( () (otherlv_1= '!' | otherlv_2= '?' )+ ) )
            // InternalChessDSL.g:1970:2: ( () (otherlv_1= '!' | otherlv_2= '?' )+ )
            {
            // InternalChessDSL.g:1970:2: ( () (otherlv_1= '!' | otherlv_2= '?' )+ )
            // InternalChessDSL.g:1971:3: () (otherlv_1= '!' | otherlv_2= '?' )+
            {
            // InternalChessDSL.g:1971:3: ()
            // InternalChessDSL.g:1972:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSANRemarkAccess().getSANRemarkAction_0(),
            					current);
            			

            }

            // InternalChessDSL.g:1978:3: (otherlv_1= '!' | otherlv_2= '?' )+
            int cnt40=0;
            loop40:
            do {
                int alt40=3;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==55) ) {
                    alt40=1;
                }
                else if ( (LA40_0==56) ) {
                    alt40=2;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalChessDSL.g:1979:4: otherlv_1= '!'
            	    {
            	    otherlv_1=(Token)match(input,55,FOLLOW_43); 

            	    				newLeafNode(otherlv_1, grammarAccess.getSANRemarkAccess().getExclamationMarkKeyword_1_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalChessDSL.g:1984:4: otherlv_2= '?'
            	    {
            	    otherlv_2=(Token)match(input,56,FOLLOW_43); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSANRemarkAccess().getQuestionMarkKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);


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
    // $ANTLR end "ruleSANRemark"


    // $ANTLR start "entryRuleConclusion"
    // InternalChessDSL.g:1993:1: entryRuleConclusion returns [EObject current=null] : iv_ruleConclusion= ruleConclusion EOF ;
    public final EObject entryRuleConclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConclusion = null;


        try {
            // InternalChessDSL.g:1993:51: (iv_ruleConclusion= ruleConclusion EOF )
            // InternalChessDSL.g:1994:2: iv_ruleConclusion= ruleConclusion EOF
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
    // InternalChessDSL.g:2000:1: ruleConclusion returns [EObject current=null] : ( ( (lv_method_0_0= ruleMethod ) )? ( (lv_result_1_0= ruleResult ) ) ) ;
    public final EObject ruleConclusion() throws RecognitionException {
        EObject current = null;

        EObject lv_method_0_0 = null;

        EObject lv_result_1_0 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:2006:2: ( ( ( (lv_method_0_0= ruleMethod ) )? ( (lv_result_1_0= ruleResult ) ) ) )
            // InternalChessDSL.g:2007:2: ( ( (lv_method_0_0= ruleMethod ) )? ( (lv_result_1_0= ruleResult ) ) )
            {
            // InternalChessDSL.g:2007:2: ( ( (lv_method_0_0= ruleMethod ) )? ( (lv_result_1_0= ruleResult ) ) )
            // InternalChessDSL.g:2008:3: ( (lv_method_0_0= ruleMethod ) )? ( (lv_result_1_0= ruleResult ) )
            {
            // InternalChessDSL.g:2008:3: ( (lv_method_0_0= ruleMethod ) )?
            int alt41=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA41_1 = input.LA(2);

                    if ( (LA41_1==37||LA41_1==57||(LA41_1>=61 && LA41_1<=62)) ) {
                        alt41=1;
                    }
                    }
                    break;
                case 86:
                    {
                    int LA41_2 = input.LA(2);

                    if ( (LA41_2==37||LA41_2==57||(LA41_2>=61 && LA41_2<=62)) ) {
                        alt41=1;
                    }
                    }
                    break;
                case 87:
                    {
                    int LA41_3 = input.LA(2);

                    if ( (LA41_3==37||LA41_3==57||(LA41_3>=61 && LA41_3<=62)) ) {
                        alt41=1;
                    }
                    }
                    break;
            }

            switch (alt41) {
                case 1 :
                    // InternalChessDSL.g:2009:4: (lv_method_0_0= ruleMethod )
                    {
                    // InternalChessDSL.g:2009:4: (lv_method_0_0= ruleMethod )
                    // InternalChessDSL.g:2010:5: lv_method_0_0= ruleMethod
                    {

                    					newCompositeNode(grammarAccess.getConclusionAccess().getMethodMethodParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_47);
                    lv_method_0_0=ruleMethod();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConclusionRule());
                    					}
                    					set(
                    						current,
                    						"method",
                    						lv_method_0_0,
                    						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Method");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalChessDSL.g:2027:3: ( (lv_result_1_0= ruleResult ) )
            // InternalChessDSL.g:2028:4: (lv_result_1_0= ruleResult )
            {
            // InternalChessDSL.g:2028:4: (lv_result_1_0= ruleResult )
            // InternalChessDSL.g:2029:5: lv_result_1_0= ruleResult
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
            						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Result");
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
    // InternalChessDSL.g:2050:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalChessDSL.g:2050:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalChessDSL.g:2051:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalChessDSL.g:2057:1: ruleMethod returns [EObject current=null] : ( ( (lv_win_0_0= ruleWin ) ) | ( (lv_draw_1_0= ruleDraw ) ) ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        EObject lv_win_0_0 = null;

        EObject lv_draw_1_0 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:2063:2: ( ( ( (lv_win_0_0= ruleWin ) ) | ( (lv_draw_1_0= ruleDraw ) ) ) )
            // InternalChessDSL.g:2064:2: ( ( (lv_win_0_0= ruleWin ) ) | ( (lv_draw_1_0= ruleDraw ) ) )
            {
            // InternalChessDSL.g:2064:2: ( ( (lv_win_0_0= ruleWin ) ) | ( (lv_draw_1_0= ruleDraw ) ) )
            int alt42=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==57||(LA42_1>=61 && LA42_1<=62)) ) {
                    alt42=1;
                }
                else if ( (LA42_1==37) ) {
                    alt42=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
                }
                break;
            case 86:
                {
                int LA42_2 = input.LA(2);

                if ( (LA42_2==57||(LA42_2>=61 && LA42_2<=62)) ) {
                    alt42=1;
                }
                else if ( (LA42_2==37) ) {
                    alt42=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 2, input);

                    throw nvae;
                }
                }
                break;
            case 87:
                {
                int LA42_3 = input.LA(2);

                if ( (LA42_3==57||(LA42_3>=61 && LA42_3<=62)) ) {
                    alt42=1;
                }
                else if ( (LA42_3==37) ) {
                    alt42=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalChessDSL.g:2065:3: ( (lv_win_0_0= ruleWin ) )
                    {
                    // InternalChessDSL.g:2065:3: ( (lv_win_0_0= ruleWin ) )
                    // InternalChessDSL.g:2066:4: (lv_win_0_0= ruleWin )
                    {
                    // InternalChessDSL.g:2066:4: (lv_win_0_0= ruleWin )
                    // InternalChessDSL.g:2067:5: lv_win_0_0= ruleWin
                    {

                    					newCompositeNode(grammarAccess.getMethodAccess().getWinWinParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_win_0_0=ruleWin();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMethodRule());
                    					}
                    					set(
                    						current,
                    						"win",
                    						lv_win_0_0,
                    						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Win");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:2085:3: ( (lv_draw_1_0= ruleDraw ) )
                    {
                    // InternalChessDSL.g:2085:3: ( (lv_draw_1_0= ruleDraw ) )
                    // InternalChessDSL.g:2086:4: (lv_draw_1_0= ruleDraw )
                    {
                    // InternalChessDSL.g:2086:4: (lv_draw_1_0= ruleDraw )
                    // InternalChessDSL.g:2087:5: lv_draw_1_0= ruleDraw
                    {

                    					newCompositeNode(grammarAccess.getMethodAccess().getDrawDrawParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_draw_1_0=ruleDraw();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMethodRule());
                    					}
                    					set(
                    						current,
                    						"draw",
                    						lv_draw_1_0,
                    						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Draw");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleWin"
    // InternalChessDSL.g:2108:1: entryRuleWin returns [EObject current=null] : iv_ruleWin= ruleWin EOF ;
    public final EObject entryRuleWin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWin = null;


        try {
            // InternalChessDSL.g:2108:44: (iv_ruleWin= ruleWin EOF )
            // InternalChessDSL.g:2109:2: iv_ruleWin= ruleWin EOF
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
    // InternalChessDSL.g:2115:1: ruleWin returns [EObject current=null] : ( ( (lv_time_0_0= ruleTimeUp ) ) | ( (lv_resign_1_0= ruleResign ) ) | ( (lv_mate_2_0= ruleCheckmate ) ) ) ;
    public final EObject ruleWin() throws RecognitionException {
        EObject current = null;

        EObject lv_time_0_0 = null;

        EObject lv_resign_1_0 = null;

        EObject lv_mate_2_0 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:2121:2: ( ( ( (lv_time_0_0= ruleTimeUp ) ) | ( (lv_resign_1_0= ruleResign ) ) | ( (lv_mate_2_0= ruleCheckmate ) ) ) )
            // InternalChessDSL.g:2122:2: ( ( (lv_time_0_0= ruleTimeUp ) ) | ( (lv_resign_1_0= ruleResign ) ) | ( (lv_mate_2_0= ruleCheckmate ) ) )
            {
            // InternalChessDSL.g:2122:2: ( ( (lv_time_0_0= ruleTimeUp ) ) | ( (lv_resign_1_0= ruleResign ) ) | ( (lv_mate_2_0= ruleCheckmate ) ) )
            int alt43=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 61:
                    {
                    alt43=2;
                    }
                    break;
                case 62:
                    {
                    alt43=3;
                    }
                    break;
                case 57:
                    {
                    alt43=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }

                }
                break;
            case 86:
                {
                switch ( input.LA(2) ) {
                case 57:
                    {
                    alt43=1;
                    }
                    break;
                case 61:
                    {
                    alt43=2;
                    }
                    break;
                case 62:
                    {
                    alt43=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 2, input);

                    throw nvae;
                }

                }
                break;
            case 87:
                {
                switch ( input.LA(2) ) {
                case 61:
                    {
                    alt43=2;
                    }
                    break;
                case 62:
                    {
                    alt43=3;
                    }
                    break;
                case 57:
                    {
                    alt43=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalChessDSL.g:2123:3: ( (lv_time_0_0= ruleTimeUp ) )
                    {
                    // InternalChessDSL.g:2123:3: ( (lv_time_0_0= ruleTimeUp ) )
                    // InternalChessDSL.g:2124:4: (lv_time_0_0= ruleTimeUp )
                    {
                    // InternalChessDSL.g:2124:4: (lv_time_0_0= ruleTimeUp )
                    // InternalChessDSL.g:2125:5: lv_time_0_0= ruleTimeUp
                    {

                    					newCompositeNode(grammarAccess.getWinAccess().getTimeTimeUpParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_time_0_0=ruleTimeUp();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getWinRule());
                    					}
                    					set(
                    						current,
                    						"time",
                    						lv_time_0_0,
                    						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.TimeUp");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:2143:3: ( (lv_resign_1_0= ruleResign ) )
                    {
                    // InternalChessDSL.g:2143:3: ( (lv_resign_1_0= ruleResign ) )
                    // InternalChessDSL.g:2144:4: (lv_resign_1_0= ruleResign )
                    {
                    // InternalChessDSL.g:2144:4: (lv_resign_1_0= ruleResign )
                    // InternalChessDSL.g:2145:5: lv_resign_1_0= ruleResign
                    {

                    					newCompositeNode(grammarAccess.getWinAccess().getResignResignParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_resign_1_0=ruleResign();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getWinRule());
                    					}
                    					set(
                    						current,
                    						"resign",
                    						lv_resign_1_0,
                    						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Resign");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalChessDSL.g:2163:3: ( (lv_mate_2_0= ruleCheckmate ) )
                    {
                    // InternalChessDSL.g:2163:3: ( (lv_mate_2_0= ruleCheckmate ) )
                    // InternalChessDSL.g:2164:4: (lv_mate_2_0= ruleCheckmate )
                    {
                    // InternalChessDSL.g:2164:4: (lv_mate_2_0= ruleCheckmate )
                    // InternalChessDSL.g:2165:5: lv_mate_2_0= ruleCheckmate
                    {

                    					newCompositeNode(grammarAccess.getWinAccess().getMateCheckmateParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_mate_2_0=ruleCheckmate();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getWinRule());
                    					}
                    					set(
                    						current,
                    						"mate",
                    						lv_mate_2_0,
                    						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Checkmate");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleWin"


    // $ANTLR start "entryRuleTimeUp"
    // InternalChessDSL.g:2186:1: entryRuleTimeUp returns [EObject current=null] : iv_ruleTimeUp= ruleTimeUp EOF ;
    public final EObject entryRuleTimeUp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeUp = null;


        try {
            // InternalChessDSL.g:2186:47: (iv_ruleTimeUp= ruleTimeUp EOF )
            // InternalChessDSL.g:2187:2: iv_ruleTimeUp= ruleTimeUp EOF
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
    // InternalChessDSL.g:2193:1: ruleTimeUp returns [EObject current=null] : ( ( (lv_player_0_0= rulePlayerOrColor ) ) otherlv_1= 'ran' otherlv_2= 'out' otherlv_3= 'of' otherlv_4= 'time' ) ;
    public final EObject ruleTimeUp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_player_0_0 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:2199:2: ( ( ( (lv_player_0_0= rulePlayerOrColor ) ) otherlv_1= 'ran' otherlv_2= 'out' otherlv_3= 'of' otherlv_4= 'time' ) )
            // InternalChessDSL.g:2200:2: ( ( (lv_player_0_0= rulePlayerOrColor ) ) otherlv_1= 'ran' otherlv_2= 'out' otherlv_3= 'of' otherlv_4= 'time' )
            {
            // InternalChessDSL.g:2200:2: ( ( (lv_player_0_0= rulePlayerOrColor ) ) otherlv_1= 'ran' otherlv_2= 'out' otherlv_3= 'of' otherlv_4= 'time' )
            // InternalChessDSL.g:2201:3: ( (lv_player_0_0= rulePlayerOrColor ) ) otherlv_1= 'ran' otherlv_2= 'out' otherlv_3= 'of' otherlv_4= 'time'
            {
            // InternalChessDSL.g:2201:3: ( (lv_player_0_0= rulePlayerOrColor ) )
            // InternalChessDSL.g:2202:4: (lv_player_0_0= rulePlayerOrColor )
            {
            // InternalChessDSL.g:2202:4: (lv_player_0_0= rulePlayerOrColor )
            // InternalChessDSL.g:2203:5: lv_player_0_0= rulePlayerOrColor
            {

            					newCompositeNode(grammarAccess.getTimeUpAccess().getPlayerPlayerOrColorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_48);
            lv_player_0_0=rulePlayerOrColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeUpRule());
            					}
            					set(
            						current,
            						"player",
            						lv_player_0_0,
            						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.PlayerOrColor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,57,FOLLOW_49); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeUpAccess().getRanKeyword_1());
            		
            otherlv_2=(Token)match(input,58,FOLLOW_50); 

            			newLeafNode(otherlv_2, grammarAccess.getTimeUpAccess().getOutKeyword_2());
            		
            otherlv_3=(Token)match(input,59,FOLLOW_51); 

            			newLeafNode(otherlv_3, grammarAccess.getTimeUpAccess().getOfKeyword_3());
            		
            otherlv_4=(Token)match(input,60,FOLLOW_2); 

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
    // InternalChessDSL.g:2240:1: entryRuleResign returns [EObject current=null] : iv_ruleResign= ruleResign EOF ;
    public final EObject entryRuleResign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResign = null;


        try {
            // InternalChessDSL.g:2240:47: (iv_ruleResign= ruleResign EOF )
            // InternalChessDSL.g:2241:2: iv_ruleResign= ruleResign EOF
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
    // InternalChessDSL.g:2247:1: ruleResign returns [EObject current=null] : ( ( (lv_player_0_0= rulePlayerOrColor ) ) otherlv_1= 'resigned' ) ;
    public final EObject ruleResign() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_player_0_0 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:2253:2: ( ( ( (lv_player_0_0= rulePlayerOrColor ) ) otherlv_1= 'resigned' ) )
            // InternalChessDSL.g:2254:2: ( ( (lv_player_0_0= rulePlayerOrColor ) ) otherlv_1= 'resigned' )
            {
            // InternalChessDSL.g:2254:2: ( ( (lv_player_0_0= rulePlayerOrColor ) ) otherlv_1= 'resigned' )
            // InternalChessDSL.g:2255:3: ( (lv_player_0_0= rulePlayerOrColor ) ) otherlv_1= 'resigned'
            {
            // InternalChessDSL.g:2255:3: ( (lv_player_0_0= rulePlayerOrColor ) )
            // InternalChessDSL.g:2256:4: (lv_player_0_0= rulePlayerOrColor )
            {
            // InternalChessDSL.g:2256:4: (lv_player_0_0= rulePlayerOrColor )
            // InternalChessDSL.g:2257:5: lv_player_0_0= rulePlayerOrColor
            {

            					newCompositeNode(grammarAccess.getResignAccess().getPlayerPlayerOrColorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_52);
            lv_player_0_0=rulePlayerOrColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResignRule());
            					}
            					set(
            						current,
            						"player",
            						lv_player_0_0,
            						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.PlayerOrColor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,61,FOLLOW_2); 

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
    // InternalChessDSL.g:2282:1: entryRuleCheckmate returns [EObject current=null] : iv_ruleCheckmate= ruleCheckmate EOF ;
    public final EObject entryRuleCheckmate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckmate = null;


        try {
            // InternalChessDSL.g:2282:50: (iv_ruleCheckmate= ruleCheckmate EOF )
            // InternalChessDSL.g:2283:2: iv_ruleCheckmate= ruleCheckmate EOF
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
    // InternalChessDSL.g:2289:1: ruleCheckmate returns [EObject current=null] : ( ( (lv_player1_0_0= rulePlayerOrColor ) ) otherlv_1= 'checkmated' ( (lv_player2_2_0= rulePlayerOrColor ) ) ) ;
    public final EObject ruleCheckmate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_player1_0_0 = null;

        EObject lv_player2_2_0 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:2295:2: ( ( ( (lv_player1_0_0= rulePlayerOrColor ) ) otherlv_1= 'checkmated' ( (lv_player2_2_0= rulePlayerOrColor ) ) ) )
            // InternalChessDSL.g:2296:2: ( ( (lv_player1_0_0= rulePlayerOrColor ) ) otherlv_1= 'checkmated' ( (lv_player2_2_0= rulePlayerOrColor ) ) )
            {
            // InternalChessDSL.g:2296:2: ( ( (lv_player1_0_0= rulePlayerOrColor ) ) otherlv_1= 'checkmated' ( (lv_player2_2_0= rulePlayerOrColor ) ) )
            // InternalChessDSL.g:2297:3: ( (lv_player1_0_0= rulePlayerOrColor ) ) otherlv_1= 'checkmated' ( (lv_player2_2_0= rulePlayerOrColor ) )
            {
            // InternalChessDSL.g:2297:3: ( (lv_player1_0_0= rulePlayerOrColor ) )
            // InternalChessDSL.g:2298:4: (lv_player1_0_0= rulePlayerOrColor )
            {
            // InternalChessDSL.g:2298:4: (lv_player1_0_0= rulePlayerOrColor )
            // InternalChessDSL.g:2299:5: lv_player1_0_0= rulePlayerOrColor
            {

            					newCompositeNode(grammarAccess.getCheckmateAccess().getPlayer1PlayerOrColorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_53);
            lv_player1_0_0=rulePlayerOrColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheckmateRule());
            					}
            					set(
            						current,
            						"player1",
            						lv_player1_0_0,
            						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.PlayerOrColor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,62,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getCheckmateAccess().getCheckmatedKeyword_1());
            		
            // InternalChessDSL.g:2320:3: ( (lv_player2_2_0= rulePlayerOrColor ) )
            // InternalChessDSL.g:2321:4: (lv_player2_2_0= rulePlayerOrColor )
            {
            // InternalChessDSL.g:2321:4: (lv_player2_2_0= rulePlayerOrColor )
            // InternalChessDSL.g:2322:5: lv_player2_2_0= rulePlayerOrColor
            {

            					newCompositeNode(grammarAccess.getCheckmateAccess().getPlayer2PlayerOrColorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_player2_2_0=rulePlayerOrColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheckmateRule());
            					}
            					set(
            						current,
            						"player2",
            						lv_player2_2_0,
            						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.PlayerOrColor");
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
    // $ANTLR end "ruleCheckmate"


    // $ANTLR start "entryRuleDraw"
    // InternalChessDSL.g:2343:1: entryRuleDraw returns [EObject current=null] : iv_ruleDraw= ruleDraw EOF ;
    public final EObject entryRuleDraw() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDraw = null;


        try {
            // InternalChessDSL.g:2343:45: (iv_ruleDraw= ruleDraw EOF )
            // InternalChessDSL.g:2344:2: iv_ruleDraw= ruleDraw EOF
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
    // InternalChessDSL.g:2350:1: ruleDraw returns [EObject current=null] : ( ( (lv_player1_0_0= rulePlayerOrColor ) ) otherlv_1= 'and' ( (lv_player2_2_0= rulePlayerOrColor ) ) ( ( (lv_result_3_1= ruleStalemate | lv_result_3_2= ruleThreefold | lv_result_3_3= ruleFifty | lv_result_3_4= ruleAgree ) ) ) ) ;
    public final EObject ruleDraw() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_player1_0_0 = null;

        EObject lv_player2_2_0 = null;

        EObject lv_result_3_1 = null;

        EObject lv_result_3_2 = null;

        EObject lv_result_3_3 = null;

        EObject lv_result_3_4 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:2356:2: ( ( ( (lv_player1_0_0= rulePlayerOrColor ) ) otherlv_1= 'and' ( (lv_player2_2_0= rulePlayerOrColor ) ) ( ( (lv_result_3_1= ruleStalemate | lv_result_3_2= ruleThreefold | lv_result_3_3= ruleFifty | lv_result_3_4= ruleAgree ) ) ) ) )
            // InternalChessDSL.g:2357:2: ( ( (lv_player1_0_0= rulePlayerOrColor ) ) otherlv_1= 'and' ( (lv_player2_2_0= rulePlayerOrColor ) ) ( ( (lv_result_3_1= ruleStalemate | lv_result_3_2= ruleThreefold | lv_result_3_3= ruleFifty | lv_result_3_4= ruleAgree ) ) ) )
            {
            // InternalChessDSL.g:2357:2: ( ( (lv_player1_0_0= rulePlayerOrColor ) ) otherlv_1= 'and' ( (lv_player2_2_0= rulePlayerOrColor ) ) ( ( (lv_result_3_1= ruleStalemate | lv_result_3_2= ruleThreefold | lv_result_3_3= ruleFifty | lv_result_3_4= ruleAgree ) ) ) )
            // InternalChessDSL.g:2358:3: ( (lv_player1_0_0= rulePlayerOrColor ) ) otherlv_1= 'and' ( (lv_player2_2_0= rulePlayerOrColor ) ) ( ( (lv_result_3_1= ruleStalemate | lv_result_3_2= ruleThreefold | lv_result_3_3= ruleFifty | lv_result_3_4= ruleAgree ) ) )
            {
            // InternalChessDSL.g:2358:3: ( (lv_player1_0_0= rulePlayerOrColor ) )
            // InternalChessDSL.g:2359:4: (lv_player1_0_0= rulePlayerOrColor )
            {
            // InternalChessDSL.g:2359:4: (lv_player1_0_0= rulePlayerOrColor )
            // InternalChessDSL.g:2360:5: lv_player1_0_0= rulePlayerOrColor
            {

            					newCompositeNode(grammarAccess.getDrawAccess().getPlayer1PlayerOrColorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_33);
            lv_player1_0_0=rulePlayerOrColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDrawRule());
            					}
            					set(
            						current,
            						"player1",
            						lv_player1_0_0,
            						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.PlayerOrColor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getDrawAccess().getAndKeyword_1());
            		
            // InternalChessDSL.g:2381:3: ( (lv_player2_2_0= rulePlayerOrColor ) )
            // InternalChessDSL.g:2382:4: (lv_player2_2_0= rulePlayerOrColor )
            {
            // InternalChessDSL.g:2382:4: (lv_player2_2_0= rulePlayerOrColor )
            // InternalChessDSL.g:2383:5: lv_player2_2_0= rulePlayerOrColor
            {

            					newCompositeNode(grammarAccess.getDrawAccess().getPlayer2PlayerOrColorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_55);
            lv_player2_2_0=rulePlayerOrColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDrawRule());
            					}
            					set(
            						current,
            						"player2",
            						lv_player2_2_0,
            						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.PlayerOrColor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalChessDSL.g:2400:3: ( ( (lv_result_3_1= ruleStalemate | lv_result_3_2= ruleThreefold | lv_result_3_3= ruleFifty | lv_result_3_4= ruleAgree ) ) )
            // InternalChessDSL.g:2401:4: ( (lv_result_3_1= ruleStalemate | lv_result_3_2= ruleThreefold | lv_result_3_3= ruleFifty | lv_result_3_4= ruleAgree ) )
            {
            // InternalChessDSL.g:2401:4: ( (lv_result_3_1= ruleStalemate | lv_result_3_2= ruleThreefold | lv_result_3_3= ruleFifty | lv_result_3_4= ruleAgree ) )
            // InternalChessDSL.g:2402:5: (lv_result_3_1= ruleStalemate | lv_result_3_2= ruleThreefold | lv_result_3_3= ruleFifty | lv_result_3_4= ruleAgree )
            {
            // InternalChessDSL.g:2402:5: (lv_result_3_1= ruleStalemate | lv_result_3_2= ruleThreefold | lv_result_3_3= ruleFifty | lv_result_3_4= ruleAgree )
            int alt44=4;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt44=1;
                }
                break;
            case 68:
                {
                alt44=2;
                }
                break;
            case 72:
                {
                alt44=3;
                }
                break;
            case 76:
                {
                alt44=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalChessDSL.g:2403:6: lv_result_3_1= ruleStalemate
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
                    							"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Stalemate");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:2419:6: lv_result_3_2= ruleThreefold
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
                    							"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Threefold");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalChessDSL.g:2435:6: lv_result_3_3= ruleFifty
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
                    							"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Fifty");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 4 :
                    // InternalChessDSL.g:2451:6: lv_result_3_4= ruleAgree
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
                    							"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Agree");
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
    // InternalChessDSL.g:2473:1: entryRuleStalemate returns [EObject current=null] : iv_ruleStalemate= ruleStalemate EOF ;
    public final EObject entryRuleStalemate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStalemate = null;


        try {
            // InternalChessDSL.g:2473:50: (iv_ruleStalemate= ruleStalemate EOF )
            // InternalChessDSL.g:2474:2: iv_ruleStalemate= ruleStalemate EOF
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
    // InternalChessDSL.g:2480:1: ruleStalemate returns [EObject current=null] : (otherlv_0= 'ended' otherlv_1= 'the' otherlv_2= 'game' otherlv_3= 'in' otherlv_4= 'a' otherlv_5= 'stalemate' ) ;
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
            // InternalChessDSL.g:2486:2: ( (otherlv_0= 'ended' otherlv_1= 'the' otherlv_2= 'game' otherlv_3= 'in' otherlv_4= 'a' otherlv_5= 'stalemate' ) )
            // InternalChessDSL.g:2487:2: (otherlv_0= 'ended' otherlv_1= 'the' otherlv_2= 'game' otherlv_3= 'in' otherlv_4= 'a' otherlv_5= 'stalemate' )
            {
            // InternalChessDSL.g:2487:2: (otherlv_0= 'ended' otherlv_1= 'the' otherlv_2= 'game' otherlv_3= 'in' otherlv_4= 'a' otherlv_5= 'stalemate' )
            // InternalChessDSL.g:2488:3: otherlv_0= 'ended' otherlv_1= 'the' otherlv_2= 'game' otherlv_3= 'in' otherlv_4= 'a' otherlv_5= 'stalemate'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getStalemateAccess().getEndedKeyword_0());
            		
            otherlv_1=(Token)match(input,43,FOLLOW_56); 

            			newLeafNode(otherlv_1, grammarAccess.getStalemateAccess().getTheKeyword_1());
            		
            otherlv_2=(Token)match(input,64,FOLLOW_57); 

            			newLeafNode(otherlv_2, grammarAccess.getStalemateAccess().getGameKeyword_2());
            		
            otherlv_3=(Token)match(input,65,FOLLOW_58); 

            			newLeafNode(otherlv_3, grammarAccess.getStalemateAccess().getInKeyword_3());
            		
            otherlv_4=(Token)match(input,66,FOLLOW_59); 

            			newLeafNode(otherlv_4, grammarAccess.getStalemateAccess().getAKeyword_4());
            		
            otherlv_5=(Token)match(input,67,FOLLOW_2); 

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
    // InternalChessDSL.g:2516:1: entryRuleThreefold returns [EObject current=null] : iv_ruleThreefold= ruleThreefold EOF ;
    public final EObject entryRuleThreefold() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThreefold = null;


        try {
            // InternalChessDSL.g:2516:50: (iv_ruleThreefold= ruleThreefold EOF )
            // InternalChessDSL.g:2517:2: iv_ruleThreefold= ruleThreefold EOF
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
    // InternalChessDSL.g:2523:1: ruleThreefold returns [EObject current=null] : (otherlv_0= 'repeated' otherlv_1= 'a' otherlv_2= 'position' otherlv_3= 'three' otherlv_4= 'times' ) ;
    public final EObject ruleThreefold() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalChessDSL.g:2529:2: ( (otherlv_0= 'repeated' otherlv_1= 'a' otherlv_2= 'position' otherlv_3= 'three' otherlv_4= 'times' ) )
            // InternalChessDSL.g:2530:2: (otherlv_0= 'repeated' otherlv_1= 'a' otherlv_2= 'position' otherlv_3= 'three' otherlv_4= 'times' )
            {
            // InternalChessDSL.g:2530:2: (otherlv_0= 'repeated' otherlv_1= 'a' otherlv_2= 'position' otherlv_3= 'three' otherlv_4= 'times' )
            // InternalChessDSL.g:2531:3: otherlv_0= 'repeated' otherlv_1= 'a' otherlv_2= 'position' otherlv_3= 'three' otherlv_4= 'times'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_58); 

            			newLeafNode(otherlv_0, grammarAccess.getThreefoldAccess().getRepeatedKeyword_0());
            		
            otherlv_1=(Token)match(input,66,FOLLOW_60); 

            			newLeafNode(otherlv_1, grammarAccess.getThreefoldAccess().getAKeyword_1());
            		
            otherlv_2=(Token)match(input,69,FOLLOW_61); 

            			newLeafNode(otherlv_2, grammarAccess.getThreefoldAccess().getPositionKeyword_2());
            		
            otherlv_3=(Token)match(input,70,FOLLOW_62); 

            			newLeafNode(otherlv_3, grammarAccess.getThreefoldAccess().getThreeKeyword_3());
            		
            otherlv_4=(Token)match(input,71,FOLLOW_2); 

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
    // InternalChessDSL.g:2555:1: entryRuleFifty returns [EObject current=null] : iv_ruleFifty= ruleFifty EOF ;
    public final EObject entryRuleFifty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFifty = null;


        try {
            // InternalChessDSL.g:2555:46: (iv_ruleFifty= ruleFifty EOF )
            // InternalChessDSL.g:2556:2: iv_ruleFifty= ruleFifty EOF
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
    // InternalChessDSL.g:2562:1: ruleFifty returns [EObject current=null] : (otherlv_0= 'played' otherlv_1= 'fifty' otherlv_2= 'moves' otherlv_3= 'without' otherlv_4= 'a' otherlv_5= 'capture' ) ;
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
            // InternalChessDSL.g:2568:2: ( (otherlv_0= 'played' otherlv_1= 'fifty' otherlv_2= 'moves' otherlv_3= 'without' otherlv_4= 'a' otherlv_5= 'capture' ) )
            // InternalChessDSL.g:2569:2: (otherlv_0= 'played' otherlv_1= 'fifty' otherlv_2= 'moves' otherlv_3= 'without' otherlv_4= 'a' otherlv_5= 'capture' )
            {
            // InternalChessDSL.g:2569:2: (otherlv_0= 'played' otherlv_1= 'fifty' otherlv_2= 'moves' otherlv_3= 'without' otherlv_4= 'a' otherlv_5= 'capture' )
            // InternalChessDSL.g:2570:3: otherlv_0= 'played' otherlv_1= 'fifty' otherlv_2= 'moves' otherlv_3= 'without' otherlv_4= 'a' otherlv_5= 'capture'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_63); 

            			newLeafNode(otherlv_0, grammarAccess.getFiftyAccess().getPlayedKeyword_0());
            		
            otherlv_1=(Token)match(input,73,FOLLOW_64); 

            			newLeafNode(otherlv_1, grammarAccess.getFiftyAccess().getFiftyKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_65); 

            			newLeafNode(otherlv_2, grammarAccess.getFiftyAccess().getMovesKeyword_2());
            		
            otherlv_3=(Token)match(input,74,FOLLOW_58); 

            			newLeafNode(otherlv_3, grammarAccess.getFiftyAccess().getWithoutKeyword_3());
            		
            otherlv_4=(Token)match(input,66,FOLLOW_66); 

            			newLeafNode(otherlv_4, grammarAccess.getFiftyAccess().getAKeyword_4());
            		
            otherlv_5=(Token)match(input,75,FOLLOW_2); 

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
    // InternalChessDSL.g:2598:1: entryRuleAgree returns [EObject current=null] : iv_ruleAgree= ruleAgree EOF ;
    public final EObject entryRuleAgree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgree = null;


        try {
            // InternalChessDSL.g:2598:46: (iv_ruleAgree= ruleAgree EOF )
            // InternalChessDSL.g:2599:2: iv_ruleAgree= ruleAgree EOF
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
    // InternalChessDSL.g:2605:1: ruleAgree returns [EObject current=null] : (otherlv_0= 'agreed' otherlv_1= 'to' otherlv_2= 'a' otherlv_3= 'draw' ) ;
    public final EObject ruleAgree() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalChessDSL.g:2611:2: ( (otherlv_0= 'agreed' otherlv_1= 'to' otherlv_2= 'a' otherlv_3= 'draw' ) )
            // InternalChessDSL.g:2612:2: (otherlv_0= 'agreed' otherlv_1= 'to' otherlv_2= 'a' otherlv_3= 'draw' )
            {
            // InternalChessDSL.g:2612:2: (otherlv_0= 'agreed' otherlv_1= 'to' otherlv_2= 'a' otherlv_3= 'draw' )
            // InternalChessDSL.g:2613:3: otherlv_0= 'agreed' otherlv_1= 'to' otherlv_2= 'a' otherlv_3= 'draw'
            {
            otherlv_0=(Token)match(input,76,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getAgreeAccess().getAgreedKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getAgreeAccess().getToKeyword_1());
            		
            otherlv_2=(Token)match(input,66,FOLLOW_67); 

            			newLeafNode(otherlv_2, grammarAccess.getAgreeAccess().getAKeyword_2());
            		
            otherlv_3=(Token)match(input,77,FOLLOW_2); 

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
    // InternalChessDSL.g:2633:1: entryRuleResult returns [EObject current=null] : iv_ruleResult= ruleResult EOF ;
    public final EObject entryRuleResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResult = null;


        try {
            // InternalChessDSL.g:2633:47: (iv_ruleResult= ruleResult EOF )
            // InternalChessDSL.g:2634:2: iv_ruleResult= ruleResult EOF
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
    // InternalChessDSL.g:2640:1: ruleResult returns [EObject current=null] : ( ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_color_1_0= ruleColor ) ) ) otherlv_2= 'wins' ) | otherlv_3= 'draw' ) ;
    public final EObject ruleResult() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_color_1_0 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:2646:2: ( ( ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_color_1_0= ruleColor ) ) ) otherlv_2= 'wins' ) | otherlv_3= 'draw' ) )
            // InternalChessDSL.g:2647:2: ( ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_color_1_0= ruleColor ) ) ) otherlv_2= 'wins' ) | otherlv_3= 'draw' )
            {
            // InternalChessDSL.g:2647:2: ( ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_color_1_0= ruleColor ) ) ) otherlv_2= 'wins' ) | otherlv_3= 'draw' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID||(LA46_0>=86 && LA46_0<=87)) ) {
                alt46=1;
            }
            else if ( (LA46_0==77) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalChessDSL.g:2648:3: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_color_1_0= ruleColor ) ) ) otherlv_2= 'wins' )
                    {
                    // InternalChessDSL.g:2648:3: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_color_1_0= ruleColor ) ) ) otherlv_2= 'wins' )
                    // InternalChessDSL.g:2649:4: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_color_1_0= ruleColor ) ) ) otherlv_2= 'wins'
                    {
                    // InternalChessDSL.g:2649:4: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_color_1_0= ruleColor ) ) )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==RULE_ID) ) {
                        alt45=1;
                    }
                    else if ( ((LA45_0>=86 && LA45_0<=87)) ) {
                        alt45=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalChessDSL.g:2650:5: ( (otherlv_0= RULE_ID ) )
                            {
                            // InternalChessDSL.g:2650:5: ( (otherlv_0= RULE_ID ) )
                            // InternalChessDSL.g:2651:6: (otherlv_0= RULE_ID )
                            {
                            // InternalChessDSL.g:2651:6: (otherlv_0= RULE_ID )
                            // InternalChessDSL.g:2652:7: otherlv_0= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getResultRule());
                            							}
                            						
                            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_68); 

                            							newLeafNode(otherlv_0, grammarAccess.getResultAccess().getPlayerPlayerCrossReference_0_0_0_0());
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalChessDSL.g:2664:5: ( (lv_color_1_0= ruleColor ) )
                            {
                            // InternalChessDSL.g:2664:5: ( (lv_color_1_0= ruleColor ) )
                            // InternalChessDSL.g:2665:6: (lv_color_1_0= ruleColor )
                            {
                            // InternalChessDSL.g:2665:6: (lv_color_1_0= ruleColor )
                            // InternalChessDSL.g:2666:7: lv_color_1_0= ruleColor
                            {

                            							newCompositeNode(grammarAccess.getResultAccess().getColorColorEnumRuleCall_0_0_1_0());
                            						
                            pushFollow(FOLLOW_68);
                            lv_color_1_0=ruleColor();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getResultRule());
                            							}
                            							set(
                            								current,
                            								"color",
                            								lv_color_1_0,
                            								"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Color");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,78,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getResultAccess().getWinsKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:2690:3: otherlv_3= 'draw'
                    {
                    otherlv_3=(Token)match(input,77,FOLLOW_2); 

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


    // $ANTLR start "entryRulePlayerOrColor"
    // InternalChessDSL.g:2698:1: entryRulePlayerOrColor returns [EObject current=null] : iv_rulePlayerOrColor= rulePlayerOrColor EOF ;
    public final EObject entryRulePlayerOrColor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlayerOrColor = null;


        try {
            // InternalChessDSL.g:2698:54: (iv_rulePlayerOrColor= rulePlayerOrColor EOF )
            // InternalChessDSL.g:2699:2: iv_rulePlayerOrColor= rulePlayerOrColor EOF
            {
             newCompositeNode(grammarAccess.getPlayerOrColorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlayerOrColor=rulePlayerOrColor();

            state._fsp--;

             current =iv_rulePlayerOrColor; 
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
    // $ANTLR end "entryRulePlayerOrColor"


    // $ANTLR start "rulePlayerOrColor"
    // InternalChessDSL.g:2705:1: rulePlayerOrColor returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_color_1_0= ruleColor ) ) ) ;
    public final EObject rulePlayerOrColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_color_1_0 = null;



        	enterRule();

        try {
            // InternalChessDSL.g:2711:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_color_1_0= ruleColor ) ) ) )
            // InternalChessDSL.g:2712:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_color_1_0= ruleColor ) ) )
            {
            // InternalChessDSL.g:2712:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_color_1_0= ruleColor ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                alt47=1;
            }
            else if ( ((LA47_0>=86 && LA47_0<=87)) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalChessDSL.g:2713:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalChessDSL.g:2713:3: ( (otherlv_0= RULE_ID ) )
                    // InternalChessDSL.g:2714:4: (otherlv_0= RULE_ID )
                    {
                    // InternalChessDSL.g:2714:4: (otherlv_0= RULE_ID )
                    // InternalChessDSL.g:2715:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlayerOrColorRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getPlayerOrColorAccess().getPlayerPlayerCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:2727:3: ( (lv_color_1_0= ruleColor ) )
                    {
                    // InternalChessDSL.g:2727:3: ( (lv_color_1_0= ruleColor ) )
                    // InternalChessDSL.g:2728:4: (lv_color_1_0= ruleColor )
                    {
                    // InternalChessDSL.g:2728:4: (lv_color_1_0= ruleColor )
                    // InternalChessDSL.g:2729:5: lv_color_1_0= ruleColor
                    {

                    					newCompositeNode(grammarAccess.getPlayerOrColorAccess().getColorColorEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_color_1_0=ruleColor();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPlayerOrColorRule());
                    					}
                    					set(
                    						current,
                    						"color",
                    						lv_color_1_0,
                    						"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.Color");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "rulePlayerOrColor"


    // $ANTLR start "entryRuleSquare"
    // InternalChessDSL.g:2750:1: entryRuleSquare returns [EObject current=null] : iv_ruleSquare= ruleSquare EOF ;
    public final EObject entryRuleSquare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSquare = null;


        try {
            // InternalChessDSL.g:2750:47: (iv_ruleSquare= ruleSquare EOF )
            // InternalChessDSL.g:2751:2: iv_ruleSquare= ruleSquare EOF
            {
             newCompositeNode(grammarAccess.getSquareRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSquare=ruleSquare();

            state._fsp--;

             current =iv_ruleSquare; 
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
    // InternalChessDSL.g:2757:1: ruleSquare returns [EObject current=null] : ( (lv_square_0_0= RULE_SQUARETERMINAL ) ) ;
    public final EObject ruleSquare() throws RecognitionException {
        EObject current = null;

        Token lv_square_0_0=null;


        	enterRule();

        try {
            // InternalChessDSL.g:2763:2: ( ( (lv_square_0_0= RULE_SQUARETERMINAL ) ) )
            // InternalChessDSL.g:2764:2: ( (lv_square_0_0= RULE_SQUARETERMINAL ) )
            {
            // InternalChessDSL.g:2764:2: ( (lv_square_0_0= RULE_SQUARETERMINAL ) )
            // InternalChessDSL.g:2765:3: (lv_square_0_0= RULE_SQUARETERMINAL )
            {
            // InternalChessDSL.g:2765:3: (lv_square_0_0= RULE_SQUARETERMINAL )
            // InternalChessDSL.g:2766:4: lv_square_0_0= RULE_SQUARETERMINAL
            {
            lv_square_0_0=(Token)match(input,RULE_SQUARETERMINAL,FOLLOW_2); 

            				newLeafNode(lv_square_0_0, grammarAccess.getSquareAccess().getSquareSQUARETERMINALTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSquareRule());
            				}
            				setWithLastConsumed(
            					current,
            					"square",
            					lv_square_0_0,
            					"uk.ac.kcl.in.nerosiegfried.chessdsl.ChessDSL.SQUARETERMINAL");
            			

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
    // $ANTLR end "ruleSquare"


    // $ANTLR start "ruleRemark"
    // InternalChessDSL.g:2785:1: ruleRemark returns [Enumerator current=null] : ( (enumLiteral_0= 'Good' ) | (enumLiteral_1= 'Bad' ) | (enumLiteral_2= 'Excellent' ) | (enumLiteral_3= 'Risky' ) | (enumLiteral_4= 'Dubious' ) | (enumLiteral_5= 'Check' ) | (enumLiteral_6= 'Checkmate' ) ) ;
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
            // InternalChessDSL.g:2791:2: ( ( (enumLiteral_0= 'Good' ) | (enumLiteral_1= 'Bad' ) | (enumLiteral_2= 'Excellent' ) | (enumLiteral_3= 'Risky' ) | (enumLiteral_4= 'Dubious' ) | (enumLiteral_5= 'Check' ) | (enumLiteral_6= 'Checkmate' ) ) )
            // InternalChessDSL.g:2792:2: ( (enumLiteral_0= 'Good' ) | (enumLiteral_1= 'Bad' ) | (enumLiteral_2= 'Excellent' ) | (enumLiteral_3= 'Risky' ) | (enumLiteral_4= 'Dubious' ) | (enumLiteral_5= 'Check' ) | (enumLiteral_6= 'Checkmate' ) )
            {
            // InternalChessDSL.g:2792:2: ( (enumLiteral_0= 'Good' ) | (enumLiteral_1= 'Bad' ) | (enumLiteral_2= 'Excellent' ) | (enumLiteral_3= 'Risky' ) | (enumLiteral_4= 'Dubious' ) | (enumLiteral_5= 'Check' ) | (enumLiteral_6= 'Checkmate' ) )
            int alt48=7;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt48=1;
                }
                break;
            case 80:
                {
                alt48=2;
                }
                break;
            case 81:
                {
                alt48=3;
                }
                break;
            case 82:
                {
                alt48=4;
                }
                break;
            case 83:
                {
                alt48=5;
                }
                break;
            case 84:
                {
                alt48=6;
                }
                break;
            case 85:
                {
                alt48=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalChessDSL.g:2793:3: (enumLiteral_0= 'Good' )
                    {
                    // InternalChessDSL.g:2793:3: (enumLiteral_0= 'Good' )
                    // InternalChessDSL.g:2794:4: enumLiteral_0= 'Good'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getRemarkAccess().getGoodEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRemarkAccess().getGoodEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:2801:3: (enumLiteral_1= 'Bad' )
                    {
                    // InternalChessDSL.g:2801:3: (enumLiteral_1= 'Bad' )
                    // InternalChessDSL.g:2802:4: enumLiteral_1= 'Bad'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getRemarkAccess().getBadEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRemarkAccess().getBadEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalChessDSL.g:2809:3: (enumLiteral_2= 'Excellent' )
                    {
                    // InternalChessDSL.g:2809:3: (enumLiteral_2= 'Excellent' )
                    // InternalChessDSL.g:2810:4: enumLiteral_2= 'Excellent'
                    {
                    enumLiteral_2=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getRemarkAccess().getExcellentEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRemarkAccess().getExcellentEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalChessDSL.g:2817:3: (enumLiteral_3= 'Risky' )
                    {
                    // InternalChessDSL.g:2817:3: (enumLiteral_3= 'Risky' )
                    // InternalChessDSL.g:2818:4: enumLiteral_3= 'Risky'
                    {
                    enumLiteral_3=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getRemarkAccess().getRiskyEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRemarkAccess().getRiskyEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalChessDSL.g:2825:3: (enumLiteral_4= 'Dubious' )
                    {
                    // InternalChessDSL.g:2825:3: (enumLiteral_4= 'Dubious' )
                    // InternalChessDSL.g:2826:4: enumLiteral_4= 'Dubious'
                    {
                    enumLiteral_4=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getRemarkAccess().getDubiousEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRemarkAccess().getDubiousEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalChessDSL.g:2833:3: (enumLiteral_5= 'Check' )
                    {
                    // InternalChessDSL.g:2833:3: (enumLiteral_5= 'Check' )
                    // InternalChessDSL.g:2834:4: enumLiteral_5= 'Check'
                    {
                    enumLiteral_5=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getRemarkAccess().getCheckEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getRemarkAccess().getCheckEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalChessDSL.g:2841:3: (enumLiteral_6= 'Checkmate' )
                    {
                    // InternalChessDSL.g:2841:3: (enumLiteral_6= 'Checkmate' )
                    // InternalChessDSL.g:2842:4: enumLiteral_6= 'Checkmate'
                    {
                    enumLiteral_6=(Token)match(input,85,FOLLOW_2); 

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
    // InternalChessDSL.g:2852:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'White' ) | (enumLiteral_1= 'Black' ) ) ;
    public final Enumerator ruleColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalChessDSL.g:2858:2: ( ( (enumLiteral_0= 'White' ) | (enumLiteral_1= 'Black' ) ) )
            // InternalChessDSL.g:2859:2: ( (enumLiteral_0= 'White' ) | (enumLiteral_1= 'Black' ) )
            {
            // InternalChessDSL.g:2859:2: ( (enumLiteral_0= 'White' ) | (enumLiteral_1= 'Black' ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==86) ) {
                alt49=1;
            }
            else if ( (LA49_0==87) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalChessDSL.g:2860:3: (enumLiteral_0= 'White' )
                    {
                    // InternalChessDSL.g:2860:3: (enumLiteral_0= 'White' )
                    // InternalChessDSL.g:2861:4: enumLiteral_0= 'White'
                    {
                    enumLiteral_0=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:2868:3: (enumLiteral_1= 'Black' )
                    {
                    // InternalChessDSL.g:2868:3: (enumLiteral_1= 'Black' )
                    // InternalChessDSL.g:2869:4: enumLiteral_1= 'Black'
                    {
                    enumLiteral_1=(Token)match(input,87,FOLLOW_2); 

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
    // InternalChessDSL.g:2879:1: rulePiece returns [Enumerator current=null] : ( (enumLiteral_0= 'King' ) | (enumLiteral_1= 'Queen' ) | (enumLiteral_2= 'Rook' ) | (enumLiteral_3= 'Bishop' ) | (enumLiteral_4= 'Knight' ) | (enumLiteral_5= 'Pawn' ) ) ;
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
            // InternalChessDSL.g:2885:2: ( ( (enumLiteral_0= 'King' ) | (enumLiteral_1= 'Queen' ) | (enumLiteral_2= 'Rook' ) | (enumLiteral_3= 'Bishop' ) | (enumLiteral_4= 'Knight' ) | (enumLiteral_5= 'Pawn' ) ) )
            // InternalChessDSL.g:2886:2: ( (enumLiteral_0= 'King' ) | (enumLiteral_1= 'Queen' ) | (enumLiteral_2= 'Rook' ) | (enumLiteral_3= 'Bishop' ) | (enumLiteral_4= 'Knight' ) | (enumLiteral_5= 'Pawn' ) )
            {
            // InternalChessDSL.g:2886:2: ( (enumLiteral_0= 'King' ) | (enumLiteral_1= 'Queen' ) | (enumLiteral_2= 'Rook' ) | (enumLiteral_3= 'Bishop' ) | (enumLiteral_4= 'Knight' ) | (enumLiteral_5= 'Pawn' ) )
            int alt50=6;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt50=1;
                }
                break;
            case 89:
                {
                alt50=2;
                }
                break;
            case 90:
                {
                alt50=3;
                }
                break;
            case 91:
                {
                alt50=4;
                }
                break;
            case 92:
                {
                alt50=5;
                }
                break;
            case 93:
                {
                alt50=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalChessDSL.g:2887:3: (enumLiteral_0= 'King' )
                    {
                    // InternalChessDSL.g:2887:3: (enumLiteral_0= 'King' )
                    // InternalChessDSL.g:2888:4: enumLiteral_0= 'King'
                    {
                    enumLiteral_0=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getPieceAccess().getKingEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPieceAccess().getKingEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:2895:3: (enumLiteral_1= 'Queen' )
                    {
                    // InternalChessDSL.g:2895:3: (enumLiteral_1= 'Queen' )
                    // InternalChessDSL.g:2896:4: enumLiteral_1= 'Queen'
                    {
                    enumLiteral_1=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getPieceAccess().getQueenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPieceAccess().getQueenEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalChessDSL.g:2903:3: (enumLiteral_2= 'Rook' )
                    {
                    // InternalChessDSL.g:2903:3: (enumLiteral_2= 'Rook' )
                    // InternalChessDSL.g:2904:4: enumLiteral_2= 'Rook'
                    {
                    enumLiteral_2=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getPieceAccess().getRookEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPieceAccess().getRookEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalChessDSL.g:2911:3: (enumLiteral_3= 'Bishop' )
                    {
                    // InternalChessDSL.g:2911:3: (enumLiteral_3= 'Bishop' )
                    // InternalChessDSL.g:2912:4: enumLiteral_3= 'Bishop'
                    {
                    enumLiteral_3=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getPieceAccess().getBishopEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPieceAccess().getBishopEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalChessDSL.g:2919:3: (enumLiteral_4= 'Knight' )
                    {
                    // InternalChessDSL.g:2919:3: (enumLiteral_4= 'Knight' )
                    // InternalChessDSL.g:2920:4: enumLiteral_4= 'Knight'
                    {
                    enumLiteral_4=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getPieceAccess().getKnightEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPieceAccess().getKnightEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalChessDSL.g:2927:3: (enumLiteral_5= 'Pawn' )
                    {
                    // InternalChessDSL.g:2927:3: (enumLiteral_5= 'Pawn' )
                    // InternalChessDSL.g:2928:4: enumLiteral_5= 'Pawn'
                    {
                    enumLiteral_5=(Token)match(input,93,FOLLOW_2); 

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


    protected DFA16 dfa16 = new DFA16(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA27 dfa27 = new DFA27(this);
    static final String dfa_1s = "\53\uffff";
    static final String dfa_2s = "\21\uffff\2\27\14\uffff\6\50\2\uffff\1\50\3\uffff";
    static final String dfa_3s = "\1\37\1\130\6\35\2\uffff\2\11\1\41\1\43\2\11\1\36\2\5\1\uffff\1\130\1\46\1\130\1\uffff\1\50\6\36\6\5\2\36\1\5\3\uffff";
    static final String dfa_4s = "\2\135\6\42\2\uffff\2\11\1\41\1\43\2\11\1\36\2\135\1\uffff\1\135\1\52\1\135\1\uffff\1\51\6\36\6\135\2\36\1\135\3\uffff";
    static final String dfa_5s = "\10\uffff\1\3\1\6\11\uffff\1\5\3\uffff\1\1\20\uffff\1\2\1\4\1\1";
    static final String dfa_6s = "\53\uffff}>";
    static final String[] dfa_7s = {
            "\1\11\1\1\6\uffff\1\10\2\uffff\1\10\55\uffff\1\2\1\3\1\4\1\5\1\6\1\7",
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
            "\5\27\10\uffff\1\27\12\uffff\1\27\1\uffff\2\27\3\uffff\1\24\1\25\1\26\1\30\2\uffff\1\27\1\uffff\1\23\7\27\2\uffff\1\27\41\uffff\6\27",
            "\5\27\10\uffff\1\27\12\uffff\1\27\1\uffff\2\27\3\uffff\1\24\1\25\1\26\1\30\2\uffff\1\27\1\uffff\1\23\7\27\2\uffff\1\27\41\uffff\6\27",
            "",
            "\1\31\1\32\1\33\1\34\1\35\1\36",
            "\1\26\3\uffff\1\10",
            "\1\37\1\40\1\41\1\42\1\43\1\44",
            "",
            "\1\45\1\46",
            "\1\47",
            "\1\47",
            "\1\47",
            "\1\47",
            "\1\47",
            "\1\47",
            "\5\50\10\uffff\1\50\10\uffff\1\51\1\uffff\1\50\1\uffff\2\50\6\uffff\1\50\2\uffff\1\50\1\uffff\1\23\7\50\2\uffff\1\50\41\uffff\6\50",
            "\5\50\10\uffff\1\50\10\uffff\1\51\1\uffff\1\50\1\uffff\2\50\6\uffff\1\50\2\uffff\1\50\1\uffff\1\23\7\50\2\uffff\1\50\41\uffff\6\50",
            "\5\50\10\uffff\1\50\10\uffff\1\51\1\uffff\1\50\1\uffff\2\50\6\uffff\1\50\2\uffff\1\50\1\uffff\1\23\7\50\2\uffff\1\50\41\uffff\6\50",
            "\5\50\10\uffff\1\50\10\uffff\1\51\1\uffff\1\50\1\uffff\2\50\6\uffff\1\50\2\uffff\1\50\1\uffff\1\23\7\50\2\uffff\1\50\41\uffff\6\50",
            "\5\50\10\uffff\1\50\10\uffff\1\51\1\uffff\1\50\1\uffff\2\50\6\uffff\1\50\2\uffff\1\50\1\uffff\1\23\7\50\2\uffff\1\50\41\uffff\6\50",
            "\5\50\10\uffff\1\50\10\uffff\1\51\1\uffff\1\50\1\uffff\2\50\6\uffff\1\50\2\uffff\1\50\1\uffff\1\23\7\50\2\uffff\1\50\41\uffff\6\50",
            "\1\52",
            "\1\52",
            "\5\50\10\uffff\1\50\10\uffff\1\51\1\uffff\1\50\1\uffff\2\50\6\uffff\1\50\2\uffff\1\50\1\uffff\1\23\7\50\2\uffff\1\50\41\uffff\6\50",
            "",
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

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "751:2: (this_Move_0= ruleMove | this_Capture_1= ruleCapture | this_Castle_2= ruleCastle | this_EnPassant_3= ruleEnPassant | this_Promotion_4= rulePromotion | this_Dummy_5= ruleDummy )";
        }
    }
    static final String dfa_8s = "\25\uffff";
    static final String dfa_9s = "\1\40\2\uffff\1\130\6\35\2\11\1\41\1\43\2\11\1\36\2\45\2\uffff";
    static final String dfa_10s = "\1\135\2\uffff\1\135\6\42\2\11\1\41\1\43\2\11\1\36\2\47\2\uffff";
    static final String dfa_11s = "\1\uffff\1\1\1\2\20\uffff\1\3\1\4";
    static final String dfa_12s = "\25\uffff}>";
    static final String[] dfa_13s = {
            "\1\3\6\uffff\1\1\2\uffff\1\2\55\uffff\1\4\1\5\1\6\1\7\1\10\1\11",
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
            "\1\24\1\uffff\1\23",
            "\1\24\1\uffff\1\23",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1101:2: ( (otherlv_0= 'Castle(' ( ( (lv_side_1_1= 'Kingside' | lv_side_1_2= 'Queenside' ) ) ) otherlv_2= ')' ) | (otherlv_3= 'castles' (otherlv_4= 'on' otherlv_5= 'the' )? ( ( (lv_side_6_1= 'Kingside' | lv_side_6_2= 'Queenside' ) ) ) ) | ( ( (lv_move_7_0= ruleMove ) ) otherlv_8= 'Castle(' ( ( (lv_side_9_1= 'Kingside' | lv_side_9_2= 'Queenside' ) ) ) otherlv_10= ')' ) | ( ( (lv_move_11_0= ruleMove ) ) otherlv_12= 'and' otherlv_13= 'castles' ( ( (lv_side_14_1= 'Kingside' | lv_side_14_2= 'Queenside' ) ) ) ) )";
        }
    }
    static final String dfa_14s = "\23\uffff";
    static final String dfa_15s = "\1\40\1\130\6\35\2\11\1\41\1\43\2\11\1\36\2\44\2\uffff";
    static final String dfa_16s = "\2\135\6\42\2\11\1\41\1\43\2\11\1\36\2\54\2\uffff";
    static final String dfa_17s = "\21\uffff\1\1\1\2";
    static final String dfa_18s = "\23\uffff}>";
    static final String[] dfa_19s = {
            "\1\1\67\uffff\1\2\1\3\1\4\1\5\1\6\1\7",
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
            "\3\22\5\uffff\1\21",
            "\3\22\5\uffff\1\21",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1379:5: (lv_move_0_1= ruleMove | lv_move_0_2= ruleCapture )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000130000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000120000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000042L,0x0000000000C02000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x000000003F000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x004FE481900003C0L,0x000000003F000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x004FE481800003C0L,0x000000003F000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x004FE481800003C2L,0x000000003F000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L,0x00000000003F8000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000420000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000030008000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0040000000000380L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0040000000000200L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x01B0000004000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x01B0000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000182L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000F000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000040L,0x0000000000C02000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000040L,0x0000000000C00000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x8000000000000000L,0x0000000000001110L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});

}