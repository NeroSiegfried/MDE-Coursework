package uk.ac.kcl.in.nerosiegfried.chessdsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uk.ac.kcl.in.nerosiegfried.chessdsl.services.ChessDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalChessDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_SQUARETERMINAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'fresh'", "'='", "'on'", "'...'", "'Kingside'", "'Queenside'", "'draw'", "'Good'", "'Bad'", "'Excellent'", "'Risky'", "'Dubious'", "'Check'", "'Checkmate'", "'White'", "'Black'", "'King'", "'Queen'", "'Rook'", "'Bishop'", "'Knight'", "'Pawn'", "'Game'", "'Moves:'", "'end'", "'Players:'", "':'", "'InitialState'", "'custom'", "'Positions:'", "'{'", "'}'", "'.'", "'('", "')'", "'dummy'", "'moves'", "'->'", "'from'", "'to'", "'Capture('", "'and'", "'captures'", "'Castle('", "'castles'", "'the'", "'Promotion('", "'ran'", "'out'", "'of'", "'time'", "'resigned'", "'checkmated'", "'ended'", "'game'", "'in'", "'a'", "'stalemate'", "'repeated'", "'position'", "'three'", "'times'", "'played'", "'fifty'", "'without'", "'capture'", "'agreed'", "'wins'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
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
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
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
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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

    	public void setGrammarAccess(ChessDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalChessDSL.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalChessDSL.g:54:1: ( ruleModel EOF )
            // InternalChessDSL.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalChessDSL.g:62:1: ruleModel : ( ( rule__Model__GameAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:66:2: ( ( ( rule__Model__GameAssignment ) ) )
            // InternalChessDSL.g:67:2: ( ( rule__Model__GameAssignment ) )
            {
            // InternalChessDSL.g:67:2: ( ( rule__Model__GameAssignment ) )
            // InternalChessDSL.g:68:3: ( rule__Model__GameAssignment )
            {
             before(grammarAccess.getModelAccess().getGameAssignment()); 
            // InternalChessDSL.g:69:3: ( rule__Model__GameAssignment )
            // InternalChessDSL.g:69:4: rule__Model__GameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Model__GameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGame"
    // InternalChessDSL.g:78:1: entryRuleGame : ruleGame EOF ;
    public final void entryRuleGame() throws RecognitionException {
        try {
            // InternalChessDSL.g:79:1: ( ruleGame EOF )
            // InternalChessDSL.g:80:1: ruleGame EOF
            {
             before(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            ruleGame();

            state._fsp--;

             after(grammarAccess.getGameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalChessDSL.g:87:1: ruleGame : ( ( rule__Game__Group__0 ) ) ;
    public final void ruleGame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:91:2: ( ( ( rule__Game__Group__0 ) ) )
            // InternalChessDSL.g:92:2: ( ( rule__Game__Group__0 ) )
            {
            // InternalChessDSL.g:92:2: ( ( rule__Game__Group__0 ) )
            // InternalChessDSL.g:93:3: ( rule__Game__Group__0 )
            {
             before(grammarAccess.getGameAccess().getGroup()); 
            // InternalChessDSL.g:94:3: ( rule__Game__Group__0 )
            // InternalChessDSL.g:94:4: rule__Game__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRulePlayer"
    // InternalChessDSL.g:103:1: entryRulePlayer : rulePlayer EOF ;
    public final void entryRulePlayer() throws RecognitionException {
        try {
            // InternalChessDSL.g:104:1: ( rulePlayer EOF )
            // InternalChessDSL.g:105:1: rulePlayer EOF
            {
             before(grammarAccess.getPlayerRule()); 
            pushFollow(FOLLOW_1);
            rulePlayer();

            state._fsp--;

             after(grammarAccess.getPlayerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlayer"


    // $ANTLR start "rulePlayer"
    // InternalChessDSL.g:112:1: rulePlayer : ( ( rule__Player__Group__0 ) ) ;
    public final void rulePlayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:116:2: ( ( ( rule__Player__Group__0 ) ) )
            // InternalChessDSL.g:117:2: ( ( rule__Player__Group__0 ) )
            {
            // InternalChessDSL.g:117:2: ( ( rule__Player__Group__0 ) )
            // InternalChessDSL.g:118:3: ( rule__Player__Group__0 )
            {
             before(grammarAccess.getPlayerAccess().getGroup()); 
            // InternalChessDSL.g:119:3: ( rule__Player__Group__0 )
            // InternalChessDSL.g:119:4: rule__Player__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Player__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlayerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlayer"


    // $ANTLR start "entryRuleInitialState"
    // InternalChessDSL.g:128:1: entryRuleInitialState : ruleInitialState EOF ;
    public final void entryRuleInitialState() throws RecognitionException {
        try {
            // InternalChessDSL.g:129:1: ( ruleInitialState EOF )
            // InternalChessDSL.g:130:1: ruleInitialState EOF
            {
             before(grammarAccess.getInitialStateRule()); 
            pushFollow(FOLLOW_1);
            ruleInitialState();

            state._fsp--;

             after(grammarAccess.getInitialStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInitialState"


    // $ANTLR start "ruleInitialState"
    // InternalChessDSL.g:137:1: ruleInitialState : ( ( rule__InitialState__Group__0 ) ) ;
    public final void ruleInitialState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:141:2: ( ( ( rule__InitialState__Group__0 ) ) )
            // InternalChessDSL.g:142:2: ( ( rule__InitialState__Group__0 ) )
            {
            // InternalChessDSL.g:142:2: ( ( rule__InitialState__Group__0 ) )
            // InternalChessDSL.g:143:3: ( rule__InitialState__Group__0 )
            {
             before(grammarAccess.getInitialStateAccess().getGroup()); 
            // InternalChessDSL.g:144:3: ( rule__InitialState__Group__0 )
            // InternalChessDSL.g:144:4: rule__InitialState__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InitialState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitialState"


    // $ANTLR start "entryRuleCustomPositions"
    // InternalChessDSL.g:153:1: entryRuleCustomPositions : ruleCustomPositions EOF ;
    public final void entryRuleCustomPositions() throws RecognitionException {
        try {
            // InternalChessDSL.g:154:1: ( ruleCustomPositions EOF )
            // InternalChessDSL.g:155:1: ruleCustomPositions EOF
            {
             before(grammarAccess.getCustomPositionsRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomPositions();

            state._fsp--;

             after(grammarAccess.getCustomPositionsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCustomPositions"


    // $ANTLR start "ruleCustomPositions"
    // InternalChessDSL.g:162:1: ruleCustomPositions : ( ( rule__CustomPositions__Group__0 ) ) ;
    public final void ruleCustomPositions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:166:2: ( ( ( rule__CustomPositions__Group__0 ) ) )
            // InternalChessDSL.g:167:2: ( ( rule__CustomPositions__Group__0 ) )
            {
            // InternalChessDSL.g:167:2: ( ( rule__CustomPositions__Group__0 ) )
            // InternalChessDSL.g:168:3: ( rule__CustomPositions__Group__0 )
            {
             before(grammarAccess.getCustomPositionsAccess().getGroup()); 
            // InternalChessDSL.g:169:3: ( rule__CustomPositions__Group__0 )
            // InternalChessDSL.g:169:4: rule__CustomPositions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CustomPositions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomPositionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomPositions"


    // $ANTLR start "entryRulePlacement"
    // InternalChessDSL.g:178:1: entryRulePlacement : rulePlacement EOF ;
    public final void entryRulePlacement() throws RecognitionException {
        try {
            // InternalChessDSL.g:179:1: ( rulePlacement EOF )
            // InternalChessDSL.g:180:1: rulePlacement EOF
            {
             before(grammarAccess.getPlacementRule()); 
            pushFollow(FOLLOW_1);
            rulePlacement();

            state._fsp--;

             after(grammarAccess.getPlacementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlacement"


    // $ANTLR start "rulePlacement"
    // InternalChessDSL.g:187:1: rulePlacement : ( ( rule__Placement__Group__0 ) ) ;
    public final void rulePlacement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:191:2: ( ( ( rule__Placement__Group__0 ) ) )
            // InternalChessDSL.g:192:2: ( ( rule__Placement__Group__0 ) )
            {
            // InternalChessDSL.g:192:2: ( ( rule__Placement__Group__0 ) )
            // InternalChessDSL.g:193:3: ( rule__Placement__Group__0 )
            {
             before(grammarAccess.getPlacementAccess().getGroup()); 
            // InternalChessDSL.g:194:3: ( rule__Placement__Group__0 )
            // InternalChessDSL.g:194:4: rule__Placement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Placement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlacementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlacement"


    // $ANTLR start "entryRuleCustomPiece"
    // InternalChessDSL.g:203:1: entryRuleCustomPiece : ruleCustomPiece EOF ;
    public final void entryRuleCustomPiece() throws RecognitionException {
        try {
            // InternalChessDSL.g:204:1: ( ruleCustomPiece EOF )
            // InternalChessDSL.g:205:1: ruleCustomPiece EOF
            {
             before(grammarAccess.getCustomPieceRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomPiece();

            state._fsp--;

             after(grammarAccess.getCustomPieceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCustomPiece"


    // $ANTLR start "ruleCustomPiece"
    // InternalChessDSL.g:212:1: ruleCustomPiece : ( ( rule__CustomPiece__Group__0 ) ) ;
    public final void ruleCustomPiece() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:216:2: ( ( ( rule__CustomPiece__Group__0 ) ) )
            // InternalChessDSL.g:217:2: ( ( rule__CustomPiece__Group__0 ) )
            {
            // InternalChessDSL.g:217:2: ( ( rule__CustomPiece__Group__0 ) )
            // InternalChessDSL.g:218:3: ( rule__CustomPiece__Group__0 )
            {
             before(grammarAccess.getCustomPieceAccess().getGroup()); 
            // InternalChessDSL.g:219:3: ( rule__CustomPiece__Group__0 )
            // InternalChessDSL.g:219:4: rule__CustomPiece__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CustomPiece__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomPieceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomPiece"


    // $ANTLR start "entryRuleMovePair"
    // InternalChessDSL.g:228:1: entryRuleMovePair : ruleMovePair EOF ;
    public final void entryRuleMovePair() throws RecognitionException {
        try {
            // InternalChessDSL.g:229:1: ( ruleMovePair EOF )
            // InternalChessDSL.g:230:1: ruleMovePair EOF
            {
             before(grammarAccess.getMovePairRule()); 
            pushFollow(FOLLOW_1);
            ruleMovePair();

            state._fsp--;

             after(grammarAccess.getMovePairRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMovePair"


    // $ANTLR start "ruleMovePair"
    // InternalChessDSL.g:237:1: ruleMovePair : ( ( rule__MovePair__Group__0 ) ) ;
    public final void ruleMovePair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:241:2: ( ( ( rule__MovePair__Group__0 ) ) )
            // InternalChessDSL.g:242:2: ( ( rule__MovePair__Group__0 ) )
            {
            // InternalChessDSL.g:242:2: ( ( rule__MovePair__Group__0 ) )
            // InternalChessDSL.g:243:3: ( rule__MovePair__Group__0 )
            {
             before(grammarAccess.getMovePairAccess().getGroup()); 
            // InternalChessDSL.g:244:3: ( rule__MovePair__Group__0 )
            // InternalChessDSL.g:244:4: rule__MovePair__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MovePair__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMovePairAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMovePair"


    // $ANTLR start "entryRuleMOVENUMBER"
    // InternalChessDSL.g:253:1: entryRuleMOVENUMBER : ruleMOVENUMBER EOF ;
    public final void entryRuleMOVENUMBER() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalChessDSL.g:257:1: ( ruleMOVENUMBER EOF )
            // InternalChessDSL.g:258:1: ruleMOVENUMBER EOF
            {
             before(grammarAccess.getMOVENUMBERRule()); 
            pushFollow(FOLLOW_1);
            ruleMOVENUMBER();

            state._fsp--;

             after(grammarAccess.getMOVENUMBERRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleMOVENUMBER"


    // $ANTLR start "ruleMOVENUMBER"
    // InternalChessDSL.g:268:1: ruleMOVENUMBER : ( ( rule__MOVENUMBER__Group__0 ) ) ;
    public final void ruleMOVENUMBER() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:273:2: ( ( ( rule__MOVENUMBER__Group__0 ) ) )
            // InternalChessDSL.g:274:2: ( ( rule__MOVENUMBER__Group__0 ) )
            {
            // InternalChessDSL.g:274:2: ( ( rule__MOVENUMBER__Group__0 ) )
            // InternalChessDSL.g:275:3: ( rule__MOVENUMBER__Group__0 )
            {
             before(grammarAccess.getMOVENUMBERAccess().getGroup()); 
            // InternalChessDSL.g:276:3: ( rule__MOVENUMBER__Group__0 )
            // InternalChessDSL.g:276:4: rule__MOVENUMBER__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MOVENUMBER__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMOVENUMBERAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleMOVENUMBER"


    // $ANTLR start "entryRuleAnyMove"
    // InternalChessDSL.g:286:1: entryRuleAnyMove : ruleAnyMove EOF ;
    public final void entryRuleAnyMove() throws RecognitionException {
        try {
            // InternalChessDSL.g:287:1: ( ruleAnyMove EOF )
            // InternalChessDSL.g:288:1: ruleAnyMove EOF
            {
             before(grammarAccess.getAnyMoveRule()); 
            pushFollow(FOLLOW_1);
            ruleAnyMove();

            state._fsp--;

             after(grammarAccess.getAnyMoveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnyMove"


    // $ANTLR start "ruleAnyMove"
    // InternalChessDSL.g:295:1: ruleAnyMove : ( ( rule__AnyMove__Group__0 ) ) ;
    public final void ruleAnyMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:299:2: ( ( ( rule__AnyMove__Group__0 ) ) )
            // InternalChessDSL.g:300:2: ( ( rule__AnyMove__Group__0 ) )
            {
            // InternalChessDSL.g:300:2: ( ( rule__AnyMove__Group__0 ) )
            // InternalChessDSL.g:301:3: ( rule__AnyMove__Group__0 )
            {
             before(grammarAccess.getAnyMoveAccess().getGroup()); 
            // InternalChessDSL.g:302:3: ( rule__AnyMove__Group__0 )
            // InternalChessDSL.g:302:4: rule__AnyMove__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AnyMove__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnyMoveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnyMove"


    // $ANTLR start "entryRuleDSLMove"
    // InternalChessDSL.g:311:1: entryRuleDSLMove : ruleDSLMove EOF ;
    public final void entryRuleDSLMove() throws RecognitionException {
        try {
            // InternalChessDSL.g:312:1: ( ruleDSLMove EOF )
            // InternalChessDSL.g:313:1: ruleDSLMove EOF
            {
             before(grammarAccess.getDSLMoveRule()); 
            pushFollow(FOLLOW_1);
            ruleDSLMove();

            state._fsp--;

             after(grammarAccess.getDSLMoveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDSLMove"


    // $ANTLR start "ruleDSLMove"
    // InternalChessDSL.g:320:1: ruleDSLMove : ( ( rule__DSLMove__Alternatives ) ) ;
    public final void ruleDSLMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:324:2: ( ( ( rule__DSLMove__Alternatives ) ) )
            // InternalChessDSL.g:325:2: ( ( rule__DSLMove__Alternatives ) )
            {
            // InternalChessDSL.g:325:2: ( ( rule__DSLMove__Alternatives ) )
            // InternalChessDSL.g:326:3: ( rule__DSLMove__Alternatives )
            {
             before(grammarAccess.getDSLMoveAccess().getAlternatives()); 
            // InternalChessDSL.g:327:3: ( rule__DSLMove__Alternatives )
            // InternalChessDSL.g:327:4: rule__DSLMove__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DSLMove__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDSLMoveAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDSLMove"


    // $ANTLR start "entryRuleDummy"
    // InternalChessDSL.g:336:1: entryRuleDummy : ruleDummy EOF ;
    public final void entryRuleDummy() throws RecognitionException {
        try {
            // InternalChessDSL.g:337:1: ( ruleDummy EOF )
            // InternalChessDSL.g:338:1: ruleDummy EOF
            {
             before(grammarAccess.getDummyRule()); 
            pushFollow(FOLLOW_1);
            ruleDummy();

            state._fsp--;

             after(grammarAccess.getDummyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDummy"


    // $ANTLR start "ruleDummy"
    // InternalChessDSL.g:345:1: ruleDummy : ( ( rule__Dummy__Group__0 ) ) ;
    public final void ruleDummy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:349:2: ( ( ( rule__Dummy__Group__0 ) ) )
            // InternalChessDSL.g:350:2: ( ( rule__Dummy__Group__0 ) )
            {
            // InternalChessDSL.g:350:2: ( ( rule__Dummy__Group__0 ) )
            // InternalChessDSL.g:351:3: ( rule__Dummy__Group__0 )
            {
             before(grammarAccess.getDummyAccess().getGroup()); 
            // InternalChessDSL.g:352:3: ( rule__Dummy__Group__0 )
            // InternalChessDSL.g:352:4: rule__Dummy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dummy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDummyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDummy"


    // $ANTLR start "entryRuleMove"
    // InternalChessDSL.g:361:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // InternalChessDSL.g:362:1: ( ruleMove EOF )
            // InternalChessDSL.g:363:1: ruleMove EOF
            {
             before(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getMoveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalChessDSL.g:370:1: ruleMove : ( ( rule__Move__Group__0 ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:374:2: ( ( ( rule__Move__Group__0 ) ) )
            // InternalChessDSL.g:375:2: ( ( rule__Move__Group__0 ) )
            {
            // InternalChessDSL.g:375:2: ( ( rule__Move__Group__0 ) )
            // InternalChessDSL.g:376:3: ( rule__Move__Group__0 )
            {
             before(grammarAccess.getMoveAccess().getGroup()); 
            // InternalChessDSL.g:377:3: ( rule__Move__Group__0 )
            // InternalChessDSL.g:377:4: rule__Move__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleCapture"
    // InternalChessDSL.g:386:1: entryRuleCapture : ruleCapture EOF ;
    public final void entryRuleCapture() throws RecognitionException {
        try {
            // InternalChessDSL.g:387:1: ( ruleCapture EOF )
            // InternalChessDSL.g:388:1: ruleCapture EOF
            {
             before(grammarAccess.getCaptureRule()); 
            pushFollow(FOLLOW_1);
            ruleCapture();

            state._fsp--;

             after(grammarAccess.getCaptureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCapture"


    // $ANTLR start "ruleCapture"
    // InternalChessDSL.g:395:1: ruleCapture : ( ( rule__Capture__Group__0 ) ) ;
    public final void ruleCapture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:399:2: ( ( ( rule__Capture__Group__0 ) ) )
            // InternalChessDSL.g:400:2: ( ( rule__Capture__Group__0 ) )
            {
            // InternalChessDSL.g:400:2: ( ( rule__Capture__Group__0 ) )
            // InternalChessDSL.g:401:3: ( rule__Capture__Group__0 )
            {
             before(grammarAccess.getCaptureAccess().getGroup()); 
            // InternalChessDSL.g:402:3: ( rule__Capture__Group__0 )
            // InternalChessDSL.g:402:4: rule__Capture__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Capture__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCaptureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCapture"


    // $ANTLR start "entryRuleCastle"
    // InternalChessDSL.g:411:1: entryRuleCastle : ruleCastle EOF ;
    public final void entryRuleCastle() throws RecognitionException {
        try {
            // InternalChessDSL.g:412:1: ( ruleCastle EOF )
            // InternalChessDSL.g:413:1: ruleCastle EOF
            {
             before(grammarAccess.getCastleRule()); 
            pushFollow(FOLLOW_1);
            ruleCastle();

            state._fsp--;

             after(grammarAccess.getCastleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCastle"


    // $ANTLR start "ruleCastle"
    // InternalChessDSL.g:420:1: ruleCastle : ( ( rule__Castle__Alternatives ) ) ;
    public final void ruleCastle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:424:2: ( ( ( rule__Castle__Alternatives ) ) )
            // InternalChessDSL.g:425:2: ( ( rule__Castle__Alternatives ) )
            {
            // InternalChessDSL.g:425:2: ( ( rule__Castle__Alternatives ) )
            // InternalChessDSL.g:426:3: ( rule__Castle__Alternatives )
            {
             before(grammarAccess.getCastleAccess().getAlternatives()); 
            // InternalChessDSL.g:427:3: ( rule__Castle__Alternatives )
            // InternalChessDSL.g:427:4: rule__Castle__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Castle__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCastleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCastle"


    // $ANTLR start "entryRuleEnPassant"
    // InternalChessDSL.g:436:1: entryRuleEnPassant : ruleEnPassant EOF ;
    public final void entryRuleEnPassant() throws RecognitionException {
        try {
            // InternalChessDSL.g:437:1: ( ruleEnPassant EOF )
            // InternalChessDSL.g:438:1: ruleEnPassant EOF
            {
             before(grammarAccess.getEnPassantRule()); 
            pushFollow(FOLLOW_1);
            ruleEnPassant();

            state._fsp--;

             after(grammarAccess.getEnPassantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnPassant"


    // $ANTLR start "ruleEnPassant"
    // InternalChessDSL.g:445:1: ruleEnPassant : ( ( rule__EnPassant__Group__0 ) ) ;
    public final void ruleEnPassant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:449:2: ( ( ( rule__EnPassant__Group__0 ) ) )
            // InternalChessDSL.g:450:2: ( ( rule__EnPassant__Group__0 ) )
            {
            // InternalChessDSL.g:450:2: ( ( rule__EnPassant__Group__0 ) )
            // InternalChessDSL.g:451:3: ( rule__EnPassant__Group__0 )
            {
             before(grammarAccess.getEnPassantAccess().getGroup()); 
            // InternalChessDSL.g:452:3: ( rule__EnPassant__Group__0 )
            // InternalChessDSL.g:452:4: rule__EnPassant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnPassant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnPassantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnPassant"


    // $ANTLR start "entryRulePromotion"
    // InternalChessDSL.g:461:1: entryRulePromotion : rulePromotion EOF ;
    public final void entryRulePromotion() throws RecognitionException {
        try {
            // InternalChessDSL.g:462:1: ( rulePromotion EOF )
            // InternalChessDSL.g:463:1: rulePromotion EOF
            {
             before(grammarAccess.getPromotionRule()); 
            pushFollow(FOLLOW_1);
            rulePromotion();

            state._fsp--;

             after(grammarAccess.getPromotionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePromotion"


    // $ANTLR start "rulePromotion"
    // InternalChessDSL.g:470:1: rulePromotion : ( ( rule__Promotion__Group__0 ) ) ;
    public final void rulePromotion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:474:2: ( ( ( rule__Promotion__Group__0 ) ) )
            // InternalChessDSL.g:475:2: ( ( rule__Promotion__Group__0 ) )
            {
            // InternalChessDSL.g:475:2: ( ( rule__Promotion__Group__0 ) )
            // InternalChessDSL.g:476:3: ( rule__Promotion__Group__0 )
            {
             before(grammarAccess.getPromotionAccess().getGroup()); 
            // InternalChessDSL.g:477:3: ( rule__Promotion__Group__0 )
            // InternalChessDSL.g:477:4: rule__Promotion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Promotion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPromotionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePromotion"


    // $ANTLR start "entryRuleConclusion"
    // InternalChessDSL.g:486:1: entryRuleConclusion : ruleConclusion EOF ;
    public final void entryRuleConclusion() throws RecognitionException {
        try {
            // InternalChessDSL.g:487:1: ( ruleConclusion EOF )
            // InternalChessDSL.g:488:1: ruleConclusion EOF
            {
             before(grammarAccess.getConclusionRule()); 
            pushFollow(FOLLOW_1);
            ruleConclusion();

            state._fsp--;

             after(grammarAccess.getConclusionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConclusion"


    // $ANTLR start "ruleConclusion"
    // InternalChessDSL.g:495:1: ruleConclusion : ( ( rule__Conclusion__Group__0 ) ) ;
    public final void ruleConclusion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:499:2: ( ( ( rule__Conclusion__Group__0 ) ) )
            // InternalChessDSL.g:500:2: ( ( rule__Conclusion__Group__0 ) )
            {
            // InternalChessDSL.g:500:2: ( ( rule__Conclusion__Group__0 ) )
            // InternalChessDSL.g:501:3: ( rule__Conclusion__Group__0 )
            {
             before(grammarAccess.getConclusionAccess().getGroup()); 
            // InternalChessDSL.g:502:3: ( rule__Conclusion__Group__0 )
            // InternalChessDSL.g:502:4: rule__Conclusion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Conclusion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConclusionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConclusion"


    // $ANTLR start "entryRuleMethod"
    // InternalChessDSL.g:511:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalChessDSL.g:512:1: ( ruleMethod EOF )
            // InternalChessDSL.g:513:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalChessDSL.g:520:1: ruleMethod : ( ( rule__Method__Alternatives ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:524:2: ( ( ( rule__Method__Alternatives ) ) )
            // InternalChessDSL.g:525:2: ( ( rule__Method__Alternatives ) )
            {
            // InternalChessDSL.g:525:2: ( ( rule__Method__Alternatives ) )
            // InternalChessDSL.g:526:3: ( rule__Method__Alternatives )
            {
             before(grammarAccess.getMethodAccess().getAlternatives()); 
            // InternalChessDSL.g:527:3: ( rule__Method__Alternatives )
            // InternalChessDSL.g:527:4: rule__Method__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Method__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleWin"
    // InternalChessDSL.g:536:1: entryRuleWin : ruleWin EOF ;
    public final void entryRuleWin() throws RecognitionException {
        try {
            // InternalChessDSL.g:537:1: ( ruleWin EOF )
            // InternalChessDSL.g:538:1: ruleWin EOF
            {
             before(grammarAccess.getWinRule()); 
            pushFollow(FOLLOW_1);
            ruleWin();

            state._fsp--;

             after(grammarAccess.getWinRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWin"


    // $ANTLR start "ruleWin"
    // InternalChessDSL.g:545:1: ruleWin : ( ( rule__Win__Alternatives ) ) ;
    public final void ruleWin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:549:2: ( ( ( rule__Win__Alternatives ) ) )
            // InternalChessDSL.g:550:2: ( ( rule__Win__Alternatives ) )
            {
            // InternalChessDSL.g:550:2: ( ( rule__Win__Alternatives ) )
            // InternalChessDSL.g:551:3: ( rule__Win__Alternatives )
            {
             before(grammarAccess.getWinAccess().getAlternatives()); 
            // InternalChessDSL.g:552:3: ( rule__Win__Alternatives )
            // InternalChessDSL.g:552:4: rule__Win__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Win__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWinAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWin"


    // $ANTLR start "entryRuleTimeUp"
    // InternalChessDSL.g:561:1: entryRuleTimeUp : ruleTimeUp EOF ;
    public final void entryRuleTimeUp() throws RecognitionException {
        try {
            // InternalChessDSL.g:562:1: ( ruleTimeUp EOF )
            // InternalChessDSL.g:563:1: ruleTimeUp EOF
            {
             before(grammarAccess.getTimeUpRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeUp();

            state._fsp--;

             after(grammarAccess.getTimeUpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTimeUp"


    // $ANTLR start "ruleTimeUp"
    // InternalChessDSL.g:570:1: ruleTimeUp : ( ( rule__TimeUp__Group__0 ) ) ;
    public final void ruleTimeUp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:574:2: ( ( ( rule__TimeUp__Group__0 ) ) )
            // InternalChessDSL.g:575:2: ( ( rule__TimeUp__Group__0 ) )
            {
            // InternalChessDSL.g:575:2: ( ( rule__TimeUp__Group__0 ) )
            // InternalChessDSL.g:576:3: ( rule__TimeUp__Group__0 )
            {
             before(grammarAccess.getTimeUpAccess().getGroup()); 
            // InternalChessDSL.g:577:3: ( rule__TimeUp__Group__0 )
            // InternalChessDSL.g:577:4: rule__TimeUp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TimeUp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeUpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeUp"


    // $ANTLR start "entryRuleResign"
    // InternalChessDSL.g:586:1: entryRuleResign : ruleResign EOF ;
    public final void entryRuleResign() throws RecognitionException {
        try {
            // InternalChessDSL.g:587:1: ( ruleResign EOF )
            // InternalChessDSL.g:588:1: ruleResign EOF
            {
             before(grammarAccess.getResignRule()); 
            pushFollow(FOLLOW_1);
            ruleResign();

            state._fsp--;

             after(grammarAccess.getResignRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResign"


    // $ANTLR start "ruleResign"
    // InternalChessDSL.g:595:1: ruleResign : ( ( rule__Resign__Group__0 ) ) ;
    public final void ruleResign() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:599:2: ( ( ( rule__Resign__Group__0 ) ) )
            // InternalChessDSL.g:600:2: ( ( rule__Resign__Group__0 ) )
            {
            // InternalChessDSL.g:600:2: ( ( rule__Resign__Group__0 ) )
            // InternalChessDSL.g:601:3: ( rule__Resign__Group__0 )
            {
             before(grammarAccess.getResignAccess().getGroup()); 
            // InternalChessDSL.g:602:3: ( rule__Resign__Group__0 )
            // InternalChessDSL.g:602:4: rule__Resign__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Resign__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResignAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResign"


    // $ANTLR start "entryRuleCheckmate"
    // InternalChessDSL.g:611:1: entryRuleCheckmate : ruleCheckmate EOF ;
    public final void entryRuleCheckmate() throws RecognitionException {
        try {
            // InternalChessDSL.g:612:1: ( ruleCheckmate EOF )
            // InternalChessDSL.g:613:1: ruleCheckmate EOF
            {
             before(grammarAccess.getCheckmateRule()); 
            pushFollow(FOLLOW_1);
            ruleCheckmate();

            state._fsp--;

             after(grammarAccess.getCheckmateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCheckmate"


    // $ANTLR start "ruleCheckmate"
    // InternalChessDSL.g:620:1: ruleCheckmate : ( ( rule__Checkmate__Group__0 ) ) ;
    public final void ruleCheckmate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:624:2: ( ( ( rule__Checkmate__Group__0 ) ) )
            // InternalChessDSL.g:625:2: ( ( rule__Checkmate__Group__0 ) )
            {
            // InternalChessDSL.g:625:2: ( ( rule__Checkmate__Group__0 ) )
            // InternalChessDSL.g:626:3: ( rule__Checkmate__Group__0 )
            {
             before(grammarAccess.getCheckmateAccess().getGroup()); 
            // InternalChessDSL.g:627:3: ( rule__Checkmate__Group__0 )
            // InternalChessDSL.g:627:4: rule__Checkmate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Checkmate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckmateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheckmate"


    // $ANTLR start "entryRuleDraw"
    // InternalChessDSL.g:636:1: entryRuleDraw : ruleDraw EOF ;
    public final void entryRuleDraw() throws RecognitionException {
        try {
            // InternalChessDSL.g:637:1: ( ruleDraw EOF )
            // InternalChessDSL.g:638:1: ruleDraw EOF
            {
             before(grammarAccess.getDrawRule()); 
            pushFollow(FOLLOW_1);
            ruleDraw();

            state._fsp--;

             after(grammarAccess.getDrawRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDraw"


    // $ANTLR start "ruleDraw"
    // InternalChessDSL.g:645:1: ruleDraw : ( ( rule__Draw__Group__0 ) ) ;
    public final void ruleDraw() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:649:2: ( ( ( rule__Draw__Group__0 ) ) )
            // InternalChessDSL.g:650:2: ( ( rule__Draw__Group__0 ) )
            {
            // InternalChessDSL.g:650:2: ( ( rule__Draw__Group__0 ) )
            // InternalChessDSL.g:651:3: ( rule__Draw__Group__0 )
            {
             before(grammarAccess.getDrawAccess().getGroup()); 
            // InternalChessDSL.g:652:3: ( rule__Draw__Group__0 )
            // InternalChessDSL.g:652:4: rule__Draw__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Draw__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDrawAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDraw"


    // $ANTLR start "entryRuleStalemate"
    // InternalChessDSL.g:661:1: entryRuleStalemate : ruleStalemate EOF ;
    public final void entryRuleStalemate() throws RecognitionException {
        try {
            // InternalChessDSL.g:662:1: ( ruleStalemate EOF )
            // InternalChessDSL.g:663:1: ruleStalemate EOF
            {
             before(grammarAccess.getStalemateRule()); 
            pushFollow(FOLLOW_1);
            ruleStalemate();

            state._fsp--;

             after(grammarAccess.getStalemateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStalemate"


    // $ANTLR start "ruleStalemate"
    // InternalChessDSL.g:670:1: ruleStalemate : ( ( rule__Stalemate__Group__0 ) ) ;
    public final void ruleStalemate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:674:2: ( ( ( rule__Stalemate__Group__0 ) ) )
            // InternalChessDSL.g:675:2: ( ( rule__Stalemate__Group__0 ) )
            {
            // InternalChessDSL.g:675:2: ( ( rule__Stalemate__Group__0 ) )
            // InternalChessDSL.g:676:3: ( rule__Stalemate__Group__0 )
            {
             before(grammarAccess.getStalemateAccess().getGroup()); 
            // InternalChessDSL.g:677:3: ( rule__Stalemate__Group__0 )
            // InternalChessDSL.g:677:4: rule__Stalemate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Stalemate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStalemateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStalemate"


    // $ANTLR start "entryRuleThreefold"
    // InternalChessDSL.g:686:1: entryRuleThreefold : ruleThreefold EOF ;
    public final void entryRuleThreefold() throws RecognitionException {
        try {
            // InternalChessDSL.g:687:1: ( ruleThreefold EOF )
            // InternalChessDSL.g:688:1: ruleThreefold EOF
            {
             before(grammarAccess.getThreefoldRule()); 
            pushFollow(FOLLOW_1);
            ruleThreefold();

            state._fsp--;

             after(grammarAccess.getThreefoldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleThreefold"


    // $ANTLR start "ruleThreefold"
    // InternalChessDSL.g:695:1: ruleThreefold : ( ( rule__Threefold__Group__0 ) ) ;
    public final void ruleThreefold() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:699:2: ( ( ( rule__Threefold__Group__0 ) ) )
            // InternalChessDSL.g:700:2: ( ( rule__Threefold__Group__0 ) )
            {
            // InternalChessDSL.g:700:2: ( ( rule__Threefold__Group__0 ) )
            // InternalChessDSL.g:701:3: ( rule__Threefold__Group__0 )
            {
             before(grammarAccess.getThreefoldAccess().getGroup()); 
            // InternalChessDSL.g:702:3: ( rule__Threefold__Group__0 )
            // InternalChessDSL.g:702:4: rule__Threefold__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Threefold__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getThreefoldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleThreefold"


    // $ANTLR start "entryRuleFifty"
    // InternalChessDSL.g:711:1: entryRuleFifty : ruleFifty EOF ;
    public final void entryRuleFifty() throws RecognitionException {
        try {
            // InternalChessDSL.g:712:1: ( ruleFifty EOF )
            // InternalChessDSL.g:713:1: ruleFifty EOF
            {
             before(grammarAccess.getFiftyRule()); 
            pushFollow(FOLLOW_1);
            ruleFifty();

            state._fsp--;

             after(grammarAccess.getFiftyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFifty"


    // $ANTLR start "ruleFifty"
    // InternalChessDSL.g:720:1: ruleFifty : ( ( rule__Fifty__Group__0 ) ) ;
    public final void ruleFifty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:724:2: ( ( ( rule__Fifty__Group__0 ) ) )
            // InternalChessDSL.g:725:2: ( ( rule__Fifty__Group__0 ) )
            {
            // InternalChessDSL.g:725:2: ( ( rule__Fifty__Group__0 ) )
            // InternalChessDSL.g:726:3: ( rule__Fifty__Group__0 )
            {
             before(grammarAccess.getFiftyAccess().getGroup()); 
            // InternalChessDSL.g:727:3: ( rule__Fifty__Group__0 )
            // InternalChessDSL.g:727:4: rule__Fifty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fifty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFiftyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFifty"


    // $ANTLR start "entryRuleAgree"
    // InternalChessDSL.g:736:1: entryRuleAgree : ruleAgree EOF ;
    public final void entryRuleAgree() throws RecognitionException {
        try {
            // InternalChessDSL.g:737:1: ( ruleAgree EOF )
            // InternalChessDSL.g:738:1: ruleAgree EOF
            {
             before(grammarAccess.getAgreeRule()); 
            pushFollow(FOLLOW_1);
            ruleAgree();

            state._fsp--;

             after(grammarAccess.getAgreeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAgree"


    // $ANTLR start "ruleAgree"
    // InternalChessDSL.g:745:1: ruleAgree : ( ( rule__Agree__Group__0 ) ) ;
    public final void ruleAgree() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:749:2: ( ( ( rule__Agree__Group__0 ) ) )
            // InternalChessDSL.g:750:2: ( ( rule__Agree__Group__0 ) )
            {
            // InternalChessDSL.g:750:2: ( ( rule__Agree__Group__0 ) )
            // InternalChessDSL.g:751:3: ( rule__Agree__Group__0 )
            {
             before(grammarAccess.getAgreeAccess().getGroup()); 
            // InternalChessDSL.g:752:3: ( rule__Agree__Group__0 )
            // InternalChessDSL.g:752:4: rule__Agree__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Agree__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAgreeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAgree"


    // $ANTLR start "entryRuleResult"
    // InternalChessDSL.g:761:1: entryRuleResult : ruleResult EOF ;
    public final void entryRuleResult() throws RecognitionException {
        try {
            // InternalChessDSL.g:762:1: ( ruleResult EOF )
            // InternalChessDSL.g:763:1: ruleResult EOF
            {
             before(grammarAccess.getResultRule()); 
            pushFollow(FOLLOW_1);
            ruleResult();

            state._fsp--;

             after(grammarAccess.getResultRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResult"


    // $ANTLR start "ruleResult"
    // InternalChessDSL.g:770:1: ruleResult : ( ( rule__Result__Alternatives ) ) ;
    public final void ruleResult() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:774:2: ( ( ( rule__Result__Alternatives ) ) )
            // InternalChessDSL.g:775:2: ( ( rule__Result__Alternatives ) )
            {
            // InternalChessDSL.g:775:2: ( ( rule__Result__Alternatives ) )
            // InternalChessDSL.g:776:3: ( rule__Result__Alternatives )
            {
             before(grammarAccess.getResultAccess().getAlternatives()); 
            // InternalChessDSL.g:777:3: ( rule__Result__Alternatives )
            // InternalChessDSL.g:777:4: rule__Result__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Result__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getResultAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResult"


    // $ANTLR start "entryRulePlayerOrColor"
    // InternalChessDSL.g:786:1: entryRulePlayerOrColor : rulePlayerOrColor EOF ;
    public final void entryRulePlayerOrColor() throws RecognitionException {
        try {
            // InternalChessDSL.g:787:1: ( rulePlayerOrColor EOF )
            // InternalChessDSL.g:788:1: rulePlayerOrColor EOF
            {
             before(grammarAccess.getPlayerOrColorRule()); 
            pushFollow(FOLLOW_1);
            rulePlayerOrColor();

            state._fsp--;

             after(grammarAccess.getPlayerOrColorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlayerOrColor"


    // $ANTLR start "rulePlayerOrColor"
    // InternalChessDSL.g:795:1: rulePlayerOrColor : ( ( rule__PlayerOrColor__Alternatives ) ) ;
    public final void rulePlayerOrColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:799:2: ( ( ( rule__PlayerOrColor__Alternatives ) ) )
            // InternalChessDSL.g:800:2: ( ( rule__PlayerOrColor__Alternatives ) )
            {
            // InternalChessDSL.g:800:2: ( ( rule__PlayerOrColor__Alternatives ) )
            // InternalChessDSL.g:801:3: ( rule__PlayerOrColor__Alternatives )
            {
             before(grammarAccess.getPlayerOrColorAccess().getAlternatives()); 
            // InternalChessDSL.g:802:3: ( rule__PlayerOrColor__Alternatives )
            // InternalChessDSL.g:802:4: rule__PlayerOrColor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PlayerOrColor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPlayerOrColorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlayerOrColor"


    // $ANTLR start "entryRuleSquare"
    // InternalChessDSL.g:811:1: entryRuleSquare : ruleSquare EOF ;
    public final void entryRuleSquare() throws RecognitionException {
        try {
            // InternalChessDSL.g:812:1: ( ruleSquare EOF )
            // InternalChessDSL.g:813:1: ruleSquare EOF
            {
             before(grammarAccess.getSquareRule()); 
            pushFollow(FOLLOW_1);
            ruleSquare();

            state._fsp--;

             after(grammarAccess.getSquareRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSquare"


    // $ANTLR start "ruleSquare"
    // InternalChessDSL.g:820:1: ruleSquare : ( ( rule__Square__SquareAssignment ) ) ;
    public final void ruleSquare() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:824:2: ( ( ( rule__Square__SquareAssignment ) ) )
            // InternalChessDSL.g:825:2: ( ( rule__Square__SquareAssignment ) )
            {
            // InternalChessDSL.g:825:2: ( ( rule__Square__SquareAssignment ) )
            // InternalChessDSL.g:826:3: ( rule__Square__SquareAssignment )
            {
             before(grammarAccess.getSquareAccess().getSquareAssignment()); 
            // InternalChessDSL.g:827:3: ( rule__Square__SquareAssignment )
            // InternalChessDSL.g:827:4: rule__Square__SquareAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Square__SquareAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSquareAccess().getSquareAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSquare"


    // $ANTLR start "ruleRemark"
    // InternalChessDSL.g:836:1: ruleRemark : ( ( rule__Remark__Alternatives ) ) ;
    public final void ruleRemark() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:840:1: ( ( ( rule__Remark__Alternatives ) ) )
            // InternalChessDSL.g:841:2: ( ( rule__Remark__Alternatives ) )
            {
            // InternalChessDSL.g:841:2: ( ( rule__Remark__Alternatives ) )
            // InternalChessDSL.g:842:3: ( rule__Remark__Alternatives )
            {
             before(grammarAccess.getRemarkAccess().getAlternatives()); 
            // InternalChessDSL.g:843:3: ( rule__Remark__Alternatives )
            // InternalChessDSL.g:843:4: rule__Remark__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Remark__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRemarkAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRemark"


    // $ANTLR start "ruleColor"
    // InternalChessDSL.g:852:1: ruleColor : ( ( rule__Color__Alternatives ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:856:1: ( ( ( rule__Color__Alternatives ) ) )
            // InternalChessDSL.g:857:2: ( ( rule__Color__Alternatives ) )
            {
            // InternalChessDSL.g:857:2: ( ( rule__Color__Alternatives ) )
            // InternalChessDSL.g:858:3: ( rule__Color__Alternatives )
            {
             before(grammarAccess.getColorAccess().getAlternatives()); 
            // InternalChessDSL.g:859:3: ( rule__Color__Alternatives )
            // InternalChessDSL.g:859:4: rule__Color__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Color__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "rulePiece"
    // InternalChessDSL.g:868:1: rulePiece : ( ( rule__Piece__Alternatives ) ) ;
    public final void rulePiece() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:872:1: ( ( ( rule__Piece__Alternatives ) ) )
            // InternalChessDSL.g:873:2: ( ( rule__Piece__Alternatives ) )
            {
            // InternalChessDSL.g:873:2: ( ( rule__Piece__Alternatives ) )
            // InternalChessDSL.g:874:3: ( rule__Piece__Alternatives )
            {
             before(grammarAccess.getPieceAccess().getAlternatives()); 
            // InternalChessDSL.g:875:3: ( rule__Piece__Alternatives )
            // InternalChessDSL.g:875:4: rule__Piece__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Piece__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPieceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePiece"


    // $ANTLR start "rule__InitialState__Alternatives_2"
    // InternalChessDSL.g:883:1: rule__InitialState__Alternatives_2 : ( ( 'fresh' ) | ( ( rule__InitialState__Group_2_1__0 ) ) );
    public final void rule__InitialState__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:887:1: ( ( 'fresh' ) | ( ( rule__InitialState__Group_2_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==40) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalChessDSL.g:888:2: ( 'fresh' )
                    {
                    // InternalChessDSL.g:888:2: ( 'fresh' )
                    // InternalChessDSL.g:889:3: 'fresh'
                    {
                     before(grammarAccess.getInitialStateAccess().getFreshKeyword_2_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getInitialStateAccess().getFreshKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:894:2: ( ( rule__InitialState__Group_2_1__0 ) )
                    {
                    // InternalChessDSL.g:894:2: ( ( rule__InitialState__Group_2_1__0 ) )
                    // InternalChessDSL.g:895:3: ( rule__InitialState__Group_2_1__0 )
                    {
                     before(grammarAccess.getInitialStateAccess().getGroup_2_1()); 
                    // InternalChessDSL.g:896:3: ( rule__InitialState__Group_2_1__0 )
                    // InternalChessDSL.g:896:4: rule__InitialState__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InitialState__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInitialStateAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Alternatives_2"


    // $ANTLR start "rule__Placement__Alternatives_1"
    // InternalChessDSL.g:904:1: rule__Placement__Alternatives_1 : ( ( '=' ) | ( 'on' ) );
    public final void rule__Placement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:908:1: ( ( '=' ) | ( 'on' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalChessDSL.g:909:2: ( '=' )
                    {
                    // InternalChessDSL.g:909:2: ( '=' )
                    // InternalChessDSL.g:910:3: '='
                    {
                     before(grammarAccess.getPlacementAccess().getEqualsSignKeyword_1_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getPlacementAccess().getEqualsSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:915:2: ( 'on' )
                    {
                    // InternalChessDSL.g:915:2: ( 'on' )
                    // InternalChessDSL.g:916:3: 'on'
                    {
                     before(grammarAccess.getPlacementAccess().getOnKeyword_1_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getPlacementAccess().getOnKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Alternatives_1"


    // $ANTLR start "rule__MovePair__Alternatives_1"
    // InternalChessDSL.g:925:1: rule__MovePair__Alternatives_1 : ( ( ( rule__MovePair__Group_1_0__0 ) ) | ( '...' ) );
    public final void rule__MovePair__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:929:1: ( ( ( rule__MovePair__Group_1_0__0 ) ) | ( '...' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||(LA3_0>=28 && LA3_0<=33)||(LA3_0>=47 && LA3_0<=48)||(LA3_0>=55 && LA3_0<=56)) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalChessDSL.g:930:2: ( ( rule__MovePair__Group_1_0__0 ) )
                    {
                    // InternalChessDSL.g:930:2: ( ( rule__MovePair__Group_1_0__0 ) )
                    // InternalChessDSL.g:931:3: ( rule__MovePair__Group_1_0__0 )
                    {
                     before(grammarAccess.getMovePairAccess().getGroup_1_0()); 
                    // InternalChessDSL.g:932:3: ( rule__MovePair__Group_1_0__0 )
                    // InternalChessDSL.g:932:4: rule__MovePair__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MovePair__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMovePairAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:936:2: ( '...' )
                    {
                    // InternalChessDSL.g:936:2: ( '...' )
                    // InternalChessDSL.g:937:3: '...'
                    {
                     before(grammarAccess.getMovePairAccess().getFullStopFullStopFullStopKeyword_1_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getMovePairAccess().getFullStopFullStopFullStopKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovePair__Alternatives_1"


    // $ANTLR start "rule__DSLMove__Alternatives"
    // InternalChessDSL.g:946:1: rule__DSLMove__Alternatives : ( ( ruleMove ) | ( ruleCapture ) | ( ruleCastle ) | ( ruleEnPassant ) | ( rulePromotion ) | ( ruleDummy ) );
    public final void rule__DSLMove__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:950:1: ( ( ruleMove ) | ( ruleCapture ) | ( ruleCastle ) | ( ruleEnPassant ) | ( rulePromotion ) | ( ruleDummy ) )
            int alt4=6;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalChessDSL.g:951:2: ( ruleMove )
                    {
                    // InternalChessDSL.g:951:2: ( ruleMove )
                    // InternalChessDSL.g:952:3: ruleMove
                    {
                     before(grammarAccess.getDSLMoveAccess().getMoveParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMove();

                    state._fsp--;

                     after(grammarAccess.getDSLMoveAccess().getMoveParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:957:2: ( ruleCapture )
                    {
                    // InternalChessDSL.g:957:2: ( ruleCapture )
                    // InternalChessDSL.g:958:3: ruleCapture
                    {
                     before(grammarAccess.getDSLMoveAccess().getCaptureParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCapture();

                    state._fsp--;

                     after(grammarAccess.getDSLMoveAccess().getCaptureParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalChessDSL.g:963:2: ( ruleCastle )
                    {
                    // InternalChessDSL.g:963:2: ( ruleCastle )
                    // InternalChessDSL.g:964:3: ruleCastle
                    {
                     before(grammarAccess.getDSLMoveAccess().getCastleParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCastle();

                    state._fsp--;

                     after(grammarAccess.getDSLMoveAccess().getCastleParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalChessDSL.g:969:2: ( ruleEnPassant )
                    {
                    // InternalChessDSL.g:969:2: ( ruleEnPassant )
                    // InternalChessDSL.g:970:3: ruleEnPassant
                    {
                     before(grammarAccess.getDSLMoveAccess().getEnPassantParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleEnPassant();

                    state._fsp--;

                     after(grammarAccess.getDSLMoveAccess().getEnPassantParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalChessDSL.g:975:2: ( rulePromotion )
                    {
                    // InternalChessDSL.g:975:2: ( rulePromotion )
                    // InternalChessDSL.g:976:3: rulePromotion
                    {
                     before(grammarAccess.getDSLMoveAccess().getPromotionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    rulePromotion();

                    state._fsp--;

                     after(grammarAccess.getDSLMoveAccess().getPromotionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalChessDSL.g:981:2: ( ruleDummy )
                    {
                    // InternalChessDSL.g:981:2: ( ruleDummy )
                    // InternalChessDSL.g:982:3: ruleDummy
                    {
                     before(grammarAccess.getDSLMoveAccess().getDummyParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleDummy();

                    state._fsp--;

                     after(grammarAccess.getDSLMoveAccess().getDummyParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSLMove__Alternatives"


    // $ANTLR start "rule__Move__Alternatives_2"
    // InternalChessDSL.g:991:1: rule__Move__Alternatives_2 : ( ( ( rule__Move__Group_2_0__0 ) ) | ( ( rule__Move__Group_2_1__0 ) ) );
    public final void rule__Move__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:995:1: ( ( ( rule__Move__Group_2_0__0 ) ) | ( ( rule__Move__Group_2_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==45) ) {
                alt5=1;
            }
            else if ( (LA5_0==50) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalChessDSL.g:996:2: ( ( rule__Move__Group_2_0__0 ) )
                    {
                    // InternalChessDSL.g:996:2: ( ( rule__Move__Group_2_0__0 ) )
                    // InternalChessDSL.g:997:3: ( rule__Move__Group_2_0__0 )
                    {
                     before(grammarAccess.getMoveAccess().getGroup_2_0()); 
                    // InternalChessDSL.g:998:3: ( rule__Move__Group_2_0__0 )
                    // InternalChessDSL.g:998:4: rule__Move__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Move__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMoveAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1002:2: ( ( rule__Move__Group_2_1__0 ) )
                    {
                    // InternalChessDSL.g:1002:2: ( ( rule__Move__Group_2_1__0 ) )
                    // InternalChessDSL.g:1003:3: ( rule__Move__Group_2_1__0 )
                    {
                     before(grammarAccess.getMoveAccess().getGroup_2_1()); 
                    // InternalChessDSL.g:1004:3: ( rule__Move__Group_2_1__0 )
                    // InternalChessDSL.g:1004:4: rule__Move__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Move__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMoveAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Alternatives_2"


    // $ANTLR start "rule__Capture__Alternatives_1"
    // InternalChessDSL.g:1012:1: rule__Capture__Alternatives_1 : ( ( ( rule__Capture__Group_1_0__0 ) ) | ( ( rule__Capture__Group_1_1__0 ) ) );
    public final void rule__Capture__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1016:1: ( ( ( rule__Capture__Group_1_0__0 ) ) | ( ( rule__Capture__Group_1_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==52) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=53 && LA6_0<=54)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalChessDSL.g:1017:2: ( ( rule__Capture__Group_1_0__0 ) )
                    {
                    // InternalChessDSL.g:1017:2: ( ( rule__Capture__Group_1_0__0 ) )
                    // InternalChessDSL.g:1018:3: ( rule__Capture__Group_1_0__0 )
                    {
                     before(grammarAccess.getCaptureAccess().getGroup_1_0()); 
                    // InternalChessDSL.g:1019:3: ( rule__Capture__Group_1_0__0 )
                    // InternalChessDSL.g:1019:4: rule__Capture__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Capture__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCaptureAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1023:2: ( ( rule__Capture__Group_1_1__0 ) )
                    {
                    // InternalChessDSL.g:1023:2: ( ( rule__Capture__Group_1_1__0 ) )
                    // InternalChessDSL.g:1024:3: ( rule__Capture__Group_1_1__0 )
                    {
                     before(grammarAccess.getCaptureAccess().getGroup_1_1()); 
                    // InternalChessDSL.g:1025:3: ( rule__Capture__Group_1_1__0 )
                    // InternalChessDSL.g:1025:4: rule__Capture__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Capture__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCaptureAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capture__Alternatives_1"


    // $ANTLR start "rule__Castle__Alternatives"
    // InternalChessDSL.g:1033:1: rule__Castle__Alternatives : ( ( ( rule__Castle__Group_0__0 ) ) | ( ( rule__Castle__Group_1__0 ) ) | ( ( rule__Castle__Group_2__0 ) ) | ( ( rule__Castle__Group_3__0 ) ) );
    public final void rule__Castle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1037:1: ( ( ( rule__Castle__Group_0__0 ) ) | ( ( rule__Castle__Group_1__0 ) ) | ( ( rule__Castle__Group_2__0 ) ) | ( ( rule__Castle__Group_3__0 ) ) )
            int alt7=4;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalChessDSL.g:1038:2: ( ( rule__Castle__Group_0__0 ) )
                    {
                    // InternalChessDSL.g:1038:2: ( ( rule__Castle__Group_0__0 ) )
                    // InternalChessDSL.g:1039:3: ( rule__Castle__Group_0__0 )
                    {
                     before(grammarAccess.getCastleAccess().getGroup_0()); 
                    // InternalChessDSL.g:1040:3: ( rule__Castle__Group_0__0 )
                    // InternalChessDSL.g:1040:4: rule__Castle__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Castle__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCastleAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1044:2: ( ( rule__Castle__Group_1__0 ) )
                    {
                    // InternalChessDSL.g:1044:2: ( ( rule__Castle__Group_1__0 ) )
                    // InternalChessDSL.g:1045:3: ( rule__Castle__Group_1__0 )
                    {
                     before(grammarAccess.getCastleAccess().getGroup_1()); 
                    // InternalChessDSL.g:1046:3: ( rule__Castle__Group_1__0 )
                    // InternalChessDSL.g:1046:4: rule__Castle__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Castle__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCastleAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalChessDSL.g:1050:2: ( ( rule__Castle__Group_2__0 ) )
                    {
                    // InternalChessDSL.g:1050:2: ( ( rule__Castle__Group_2__0 ) )
                    // InternalChessDSL.g:1051:3: ( rule__Castle__Group_2__0 )
                    {
                     before(grammarAccess.getCastleAccess().getGroup_2()); 
                    // InternalChessDSL.g:1052:3: ( rule__Castle__Group_2__0 )
                    // InternalChessDSL.g:1052:4: rule__Castle__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Castle__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCastleAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalChessDSL.g:1056:2: ( ( rule__Castle__Group_3__0 ) )
                    {
                    // InternalChessDSL.g:1056:2: ( ( rule__Castle__Group_3__0 ) )
                    // InternalChessDSL.g:1057:3: ( rule__Castle__Group_3__0 )
                    {
                     before(grammarAccess.getCastleAccess().getGroup_3()); 
                    // InternalChessDSL.g:1058:3: ( rule__Castle__Group_3__0 )
                    // InternalChessDSL.g:1058:4: rule__Castle__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Castle__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCastleAccess().getGroup_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Alternatives"


    // $ANTLR start "rule__Castle__SideAlternatives_0_1_0"
    // InternalChessDSL.g:1066:1: rule__Castle__SideAlternatives_0_1_0 : ( ( 'Kingside' ) | ( 'Queenside' ) );
    public final void rule__Castle__SideAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1070:1: ( ( 'Kingside' ) | ( 'Queenside' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            else if ( (LA8_0==17) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalChessDSL.g:1071:2: ( 'Kingside' )
                    {
                    // InternalChessDSL.g:1071:2: ( 'Kingside' )
                    // InternalChessDSL.g:1072:3: 'Kingside'
                    {
                     before(grammarAccess.getCastleAccess().getSideKingsideKeyword_0_1_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getCastleAccess().getSideKingsideKeyword_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1077:2: ( 'Queenside' )
                    {
                    // InternalChessDSL.g:1077:2: ( 'Queenside' )
                    // InternalChessDSL.g:1078:3: 'Queenside'
                    {
                     before(grammarAccess.getCastleAccess().getSideQueensideKeyword_0_1_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getCastleAccess().getSideQueensideKeyword_0_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__SideAlternatives_0_1_0"


    // $ANTLR start "rule__Castle__SideAlternatives_1_2_0"
    // InternalChessDSL.g:1087:1: rule__Castle__SideAlternatives_1_2_0 : ( ( 'Kingside' ) | ( 'Queenside' ) );
    public final void rule__Castle__SideAlternatives_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1091:1: ( ( 'Kingside' ) | ( 'Queenside' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            else if ( (LA9_0==17) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalChessDSL.g:1092:2: ( 'Kingside' )
                    {
                    // InternalChessDSL.g:1092:2: ( 'Kingside' )
                    // InternalChessDSL.g:1093:3: 'Kingside'
                    {
                     before(grammarAccess.getCastleAccess().getSideKingsideKeyword_1_2_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getCastleAccess().getSideKingsideKeyword_1_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1098:2: ( 'Queenside' )
                    {
                    // InternalChessDSL.g:1098:2: ( 'Queenside' )
                    // InternalChessDSL.g:1099:3: 'Queenside'
                    {
                     before(grammarAccess.getCastleAccess().getSideQueensideKeyword_1_2_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getCastleAccess().getSideQueensideKeyword_1_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__SideAlternatives_1_2_0"


    // $ANTLR start "rule__Castle__SideAlternatives_2_2_0"
    // InternalChessDSL.g:1108:1: rule__Castle__SideAlternatives_2_2_0 : ( ( 'Kingside' ) | ( 'Queenside' ) );
    public final void rule__Castle__SideAlternatives_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1112:1: ( ( 'Kingside' ) | ( 'Queenside' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            else if ( (LA10_0==17) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalChessDSL.g:1113:2: ( 'Kingside' )
                    {
                    // InternalChessDSL.g:1113:2: ( 'Kingside' )
                    // InternalChessDSL.g:1114:3: 'Kingside'
                    {
                     before(grammarAccess.getCastleAccess().getSideKingsideKeyword_2_2_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getCastleAccess().getSideKingsideKeyword_2_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1119:2: ( 'Queenside' )
                    {
                    // InternalChessDSL.g:1119:2: ( 'Queenside' )
                    // InternalChessDSL.g:1120:3: 'Queenside'
                    {
                     before(grammarAccess.getCastleAccess().getSideQueensideKeyword_2_2_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getCastleAccess().getSideQueensideKeyword_2_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__SideAlternatives_2_2_0"


    // $ANTLR start "rule__Castle__SideAlternatives_3_3_0"
    // InternalChessDSL.g:1129:1: rule__Castle__SideAlternatives_3_3_0 : ( ( 'Kingside' ) | ( 'Queenside' ) );
    public final void rule__Castle__SideAlternatives_3_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1133:1: ( ( 'Kingside' ) | ( 'Queenside' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            else if ( (LA11_0==17) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalChessDSL.g:1134:2: ( 'Kingside' )
                    {
                    // InternalChessDSL.g:1134:2: ( 'Kingside' )
                    // InternalChessDSL.g:1135:3: 'Kingside'
                    {
                     before(grammarAccess.getCastleAccess().getSideKingsideKeyword_3_3_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getCastleAccess().getSideKingsideKeyword_3_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1140:2: ( 'Queenside' )
                    {
                    // InternalChessDSL.g:1140:2: ( 'Queenside' )
                    // InternalChessDSL.g:1141:3: 'Queenside'
                    {
                     before(grammarAccess.getCastleAccess().getSideQueensideKeyword_3_3_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getCastleAccess().getSideQueensideKeyword_3_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__SideAlternatives_3_3_0"


    // $ANTLR start "rule__Promotion__MoveAlternatives_0_0"
    // InternalChessDSL.g:1150:1: rule__Promotion__MoveAlternatives_0_0 : ( ( ruleMove ) | ( ruleCapture ) );
    public final void rule__Promotion__MoveAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1154:1: ( ( ruleMove ) | ( ruleCapture ) )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalChessDSL.g:1155:2: ( ruleMove )
                    {
                    // InternalChessDSL.g:1155:2: ( ruleMove )
                    // InternalChessDSL.g:1156:3: ruleMove
                    {
                     before(grammarAccess.getPromotionAccess().getMoveMoveParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMove();

                    state._fsp--;

                     after(grammarAccess.getPromotionAccess().getMoveMoveParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1161:2: ( ruleCapture )
                    {
                    // InternalChessDSL.g:1161:2: ( ruleCapture )
                    // InternalChessDSL.g:1162:3: ruleCapture
                    {
                     before(grammarAccess.getPromotionAccess().getMoveCaptureParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCapture();

                    state._fsp--;

                     after(grammarAccess.getPromotionAccess().getMoveCaptureParserRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Promotion__MoveAlternatives_0_0"


    // $ANTLR start "rule__Method__Alternatives"
    // InternalChessDSL.g:1171:1: rule__Method__Alternatives : ( ( ( rule__Method__WinAssignment_0 ) ) | ( ( rule__Method__DrawAssignment_1 ) ) );
    public final void rule__Method__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1175:1: ( ( ( rule__Method__WinAssignment_0 ) ) | ( ( rule__Method__DrawAssignment_1 ) ) )
            int alt13=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==59||(LA13_1>=63 && LA13_1<=64)) ) {
                    alt13=1;
                }
                else if ( (LA13_1==53) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==59||(LA13_2>=63 && LA13_2<=64)) ) {
                    alt13=1;
                }
                else if ( (LA13_2==53) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }
                }
                break;
            case 27:
                {
                int LA13_3 = input.LA(2);

                if ( (LA13_3==59||(LA13_3>=63 && LA13_3<=64)) ) {
                    alt13=1;
                }
                else if ( (LA13_3==53) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalChessDSL.g:1176:2: ( ( rule__Method__WinAssignment_0 ) )
                    {
                    // InternalChessDSL.g:1176:2: ( ( rule__Method__WinAssignment_0 ) )
                    // InternalChessDSL.g:1177:3: ( rule__Method__WinAssignment_0 )
                    {
                     before(grammarAccess.getMethodAccess().getWinAssignment_0()); 
                    // InternalChessDSL.g:1178:3: ( rule__Method__WinAssignment_0 )
                    // InternalChessDSL.g:1178:4: rule__Method__WinAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__WinAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethodAccess().getWinAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1182:2: ( ( rule__Method__DrawAssignment_1 ) )
                    {
                    // InternalChessDSL.g:1182:2: ( ( rule__Method__DrawAssignment_1 ) )
                    // InternalChessDSL.g:1183:3: ( rule__Method__DrawAssignment_1 )
                    {
                     before(grammarAccess.getMethodAccess().getDrawAssignment_1()); 
                    // InternalChessDSL.g:1184:3: ( rule__Method__DrawAssignment_1 )
                    // InternalChessDSL.g:1184:4: rule__Method__DrawAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__DrawAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethodAccess().getDrawAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Alternatives"


    // $ANTLR start "rule__Win__Alternatives"
    // InternalChessDSL.g:1192:1: rule__Win__Alternatives : ( ( ( rule__Win__TimeAssignment_0 ) ) | ( ( rule__Win__ResignAssignment_1 ) ) | ( ( rule__Win__MateAssignment_2 ) ) );
    public final void rule__Win__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1196:1: ( ( ( rule__Win__TimeAssignment_0 ) ) | ( ( rule__Win__ResignAssignment_1 ) ) | ( ( rule__Win__MateAssignment_2 ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 64:
                    {
                    alt14=3;
                    }
                    break;
                case 63:
                    {
                    alt14=2;
                    }
                    break;
                case 59:
                    {
                    alt14=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }

                }
                break;
            case 26:
                {
                switch ( input.LA(2) ) {
                case 64:
                    {
                    alt14=3;
                    }
                    break;
                case 63:
                    {
                    alt14=2;
                    }
                    break;
                case 59:
                    {
                    alt14=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;
                }

                }
                break;
            case 27:
                {
                switch ( input.LA(2) ) {
                case 64:
                    {
                    alt14=3;
                    }
                    break;
                case 63:
                    {
                    alt14=2;
                    }
                    break;
                case 59:
                    {
                    alt14=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalChessDSL.g:1197:2: ( ( rule__Win__TimeAssignment_0 ) )
                    {
                    // InternalChessDSL.g:1197:2: ( ( rule__Win__TimeAssignment_0 ) )
                    // InternalChessDSL.g:1198:3: ( rule__Win__TimeAssignment_0 )
                    {
                     before(grammarAccess.getWinAccess().getTimeAssignment_0()); 
                    // InternalChessDSL.g:1199:3: ( rule__Win__TimeAssignment_0 )
                    // InternalChessDSL.g:1199:4: rule__Win__TimeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Win__TimeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWinAccess().getTimeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1203:2: ( ( rule__Win__ResignAssignment_1 ) )
                    {
                    // InternalChessDSL.g:1203:2: ( ( rule__Win__ResignAssignment_1 ) )
                    // InternalChessDSL.g:1204:3: ( rule__Win__ResignAssignment_1 )
                    {
                     before(grammarAccess.getWinAccess().getResignAssignment_1()); 
                    // InternalChessDSL.g:1205:3: ( rule__Win__ResignAssignment_1 )
                    // InternalChessDSL.g:1205:4: rule__Win__ResignAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Win__ResignAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getWinAccess().getResignAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalChessDSL.g:1209:2: ( ( rule__Win__MateAssignment_2 ) )
                    {
                    // InternalChessDSL.g:1209:2: ( ( rule__Win__MateAssignment_2 ) )
                    // InternalChessDSL.g:1210:3: ( rule__Win__MateAssignment_2 )
                    {
                     before(grammarAccess.getWinAccess().getMateAssignment_2()); 
                    // InternalChessDSL.g:1211:3: ( rule__Win__MateAssignment_2 )
                    // InternalChessDSL.g:1211:4: rule__Win__MateAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Win__MateAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getWinAccess().getMateAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Win__Alternatives"


    // $ANTLR start "rule__Draw__ResultAlternatives_3_0"
    // InternalChessDSL.g:1219:1: rule__Draw__ResultAlternatives_3_0 : ( ( ruleStalemate ) | ( ruleThreefold ) | ( ruleFifty ) | ( ruleAgree ) );
    public final void rule__Draw__ResultAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1223:1: ( ( ruleStalemate ) | ( ruleThreefold ) | ( ruleFifty ) | ( ruleAgree ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt15=1;
                }
                break;
            case 70:
                {
                alt15=2;
                }
                break;
            case 74:
                {
                alt15=3;
                }
                break;
            case 78:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalChessDSL.g:1224:2: ( ruleStalemate )
                    {
                    // InternalChessDSL.g:1224:2: ( ruleStalemate )
                    // InternalChessDSL.g:1225:3: ruleStalemate
                    {
                     before(grammarAccess.getDrawAccess().getResultStalemateParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStalemate();

                    state._fsp--;

                     after(grammarAccess.getDrawAccess().getResultStalemateParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1230:2: ( ruleThreefold )
                    {
                    // InternalChessDSL.g:1230:2: ( ruleThreefold )
                    // InternalChessDSL.g:1231:3: ruleThreefold
                    {
                     before(grammarAccess.getDrawAccess().getResultThreefoldParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleThreefold();

                    state._fsp--;

                     after(grammarAccess.getDrawAccess().getResultThreefoldParserRuleCall_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalChessDSL.g:1236:2: ( ruleFifty )
                    {
                    // InternalChessDSL.g:1236:2: ( ruleFifty )
                    // InternalChessDSL.g:1237:3: ruleFifty
                    {
                     before(grammarAccess.getDrawAccess().getResultFiftyParserRuleCall_3_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFifty();

                    state._fsp--;

                     after(grammarAccess.getDrawAccess().getResultFiftyParserRuleCall_3_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalChessDSL.g:1242:2: ( ruleAgree )
                    {
                    // InternalChessDSL.g:1242:2: ( ruleAgree )
                    // InternalChessDSL.g:1243:3: ruleAgree
                    {
                     before(grammarAccess.getDrawAccess().getResultAgreeParserRuleCall_3_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleAgree();

                    state._fsp--;

                     after(grammarAccess.getDrawAccess().getResultAgreeParserRuleCall_3_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Draw__ResultAlternatives_3_0"


    // $ANTLR start "rule__Result__Alternatives"
    // InternalChessDSL.g:1252:1: rule__Result__Alternatives : ( ( ( rule__Result__Group_0__0 ) ) | ( 'draw' ) );
    public final void rule__Result__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1256:1: ( ( ( rule__Result__Group_0__0 ) ) | ( 'draw' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID||(LA16_0>=26 && LA16_0<=27)) ) {
                alt16=1;
            }
            else if ( (LA16_0==18) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalChessDSL.g:1257:2: ( ( rule__Result__Group_0__0 ) )
                    {
                    // InternalChessDSL.g:1257:2: ( ( rule__Result__Group_0__0 ) )
                    // InternalChessDSL.g:1258:3: ( rule__Result__Group_0__0 )
                    {
                     before(grammarAccess.getResultAccess().getGroup_0()); 
                    // InternalChessDSL.g:1259:3: ( rule__Result__Group_0__0 )
                    // InternalChessDSL.g:1259:4: rule__Result__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Result__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getResultAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1263:2: ( 'draw' )
                    {
                    // InternalChessDSL.g:1263:2: ( 'draw' )
                    // InternalChessDSL.g:1264:3: 'draw'
                    {
                     before(grammarAccess.getResultAccess().getDrawKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getResultAccess().getDrawKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Result__Alternatives"


    // $ANTLR start "rule__Result__Alternatives_0_0"
    // InternalChessDSL.g:1273:1: rule__Result__Alternatives_0_0 : ( ( ( rule__Result__PlayerAssignment_0_0_0 ) ) | ( ( rule__Result__ColorAssignment_0_0_1 ) ) );
    public final void rule__Result__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1277:1: ( ( ( rule__Result__PlayerAssignment_0_0_0 ) ) | ( ( rule__Result__ColorAssignment_0_0_1 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=26 && LA17_0<=27)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalChessDSL.g:1278:2: ( ( rule__Result__PlayerAssignment_0_0_0 ) )
                    {
                    // InternalChessDSL.g:1278:2: ( ( rule__Result__PlayerAssignment_0_0_0 ) )
                    // InternalChessDSL.g:1279:3: ( rule__Result__PlayerAssignment_0_0_0 )
                    {
                     before(grammarAccess.getResultAccess().getPlayerAssignment_0_0_0()); 
                    // InternalChessDSL.g:1280:3: ( rule__Result__PlayerAssignment_0_0_0 )
                    // InternalChessDSL.g:1280:4: rule__Result__PlayerAssignment_0_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Result__PlayerAssignment_0_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getResultAccess().getPlayerAssignment_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1284:2: ( ( rule__Result__ColorAssignment_0_0_1 ) )
                    {
                    // InternalChessDSL.g:1284:2: ( ( rule__Result__ColorAssignment_0_0_1 ) )
                    // InternalChessDSL.g:1285:3: ( rule__Result__ColorAssignment_0_0_1 )
                    {
                     before(grammarAccess.getResultAccess().getColorAssignment_0_0_1()); 
                    // InternalChessDSL.g:1286:3: ( rule__Result__ColorAssignment_0_0_1 )
                    // InternalChessDSL.g:1286:4: rule__Result__ColorAssignment_0_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Result__ColorAssignment_0_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getResultAccess().getColorAssignment_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Result__Alternatives_0_0"


    // $ANTLR start "rule__PlayerOrColor__Alternatives"
    // InternalChessDSL.g:1294:1: rule__PlayerOrColor__Alternatives : ( ( ( rule__PlayerOrColor__PlayerAssignment_0 ) ) | ( ( rule__PlayerOrColor__ColorAssignment_1 ) ) );
    public final void rule__PlayerOrColor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1298:1: ( ( ( rule__PlayerOrColor__PlayerAssignment_0 ) ) | ( ( rule__PlayerOrColor__ColorAssignment_1 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=26 && LA18_0<=27)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalChessDSL.g:1299:2: ( ( rule__PlayerOrColor__PlayerAssignment_0 ) )
                    {
                    // InternalChessDSL.g:1299:2: ( ( rule__PlayerOrColor__PlayerAssignment_0 ) )
                    // InternalChessDSL.g:1300:3: ( rule__PlayerOrColor__PlayerAssignment_0 )
                    {
                     before(grammarAccess.getPlayerOrColorAccess().getPlayerAssignment_0()); 
                    // InternalChessDSL.g:1301:3: ( rule__PlayerOrColor__PlayerAssignment_0 )
                    // InternalChessDSL.g:1301:4: rule__PlayerOrColor__PlayerAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlayerOrColor__PlayerAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlayerOrColorAccess().getPlayerAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1305:2: ( ( rule__PlayerOrColor__ColorAssignment_1 ) )
                    {
                    // InternalChessDSL.g:1305:2: ( ( rule__PlayerOrColor__ColorAssignment_1 ) )
                    // InternalChessDSL.g:1306:3: ( rule__PlayerOrColor__ColorAssignment_1 )
                    {
                     before(grammarAccess.getPlayerOrColorAccess().getColorAssignment_1()); 
                    // InternalChessDSL.g:1307:3: ( rule__PlayerOrColor__ColorAssignment_1 )
                    // InternalChessDSL.g:1307:4: rule__PlayerOrColor__ColorAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlayerOrColor__ColorAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlayerOrColorAccess().getColorAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerOrColor__Alternatives"


    // $ANTLR start "rule__Remark__Alternatives"
    // InternalChessDSL.g:1315:1: rule__Remark__Alternatives : ( ( ( 'Good' ) ) | ( ( 'Bad' ) ) | ( ( 'Excellent' ) ) | ( ( 'Risky' ) ) | ( ( 'Dubious' ) ) | ( ( 'Check' ) ) | ( ( 'Checkmate' ) ) );
    public final void rule__Remark__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1319:1: ( ( ( 'Good' ) ) | ( ( 'Bad' ) ) | ( ( 'Excellent' ) ) | ( ( 'Risky' ) ) | ( ( 'Dubious' ) ) | ( ( 'Check' ) ) | ( ( 'Checkmate' ) ) )
            int alt19=7;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt19=1;
                }
                break;
            case 20:
                {
                alt19=2;
                }
                break;
            case 21:
                {
                alt19=3;
                }
                break;
            case 22:
                {
                alt19=4;
                }
                break;
            case 23:
                {
                alt19=5;
                }
                break;
            case 24:
                {
                alt19=6;
                }
                break;
            case 25:
                {
                alt19=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalChessDSL.g:1320:2: ( ( 'Good' ) )
                    {
                    // InternalChessDSL.g:1320:2: ( ( 'Good' ) )
                    // InternalChessDSL.g:1321:3: ( 'Good' )
                    {
                     before(grammarAccess.getRemarkAccess().getGoodEnumLiteralDeclaration_0()); 
                    // InternalChessDSL.g:1322:3: ( 'Good' )
                    // InternalChessDSL.g:1322:4: 'Good'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getRemarkAccess().getGoodEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1326:2: ( ( 'Bad' ) )
                    {
                    // InternalChessDSL.g:1326:2: ( ( 'Bad' ) )
                    // InternalChessDSL.g:1327:3: ( 'Bad' )
                    {
                     before(grammarAccess.getRemarkAccess().getBadEnumLiteralDeclaration_1()); 
                    // InternalChessDSL.g:1328:3: ( 'Bad' )
                    // InternalChessDSL.g:1328:4: 'Bad'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getRemarkAccess().getBadEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalChessDSL.g:1332:2: ( ( 'Excellent' ) )
                    {
                    // InternalChessDSL.g:1332:2: ( ( 'Excellent' ) )
                    // InternalChessDSL.g:1333:3: ( 'Excellent' )
                    {
                     before(grammarAccess.getRemarkAccess().getExcellentEnumLiteralDeclaration_2()); 
                    // InternalChessDSL.g:1334:3: ( 'Excellent' )
                    // InternalChessDSL.g:1334:4: 'Excellent'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getRemarkAccess().getExcellentEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalChessDSL.g:1338:2: ( ( 'Risky' ) )
                    {
                    // InternalChessDSL.g:1338:2: ( ( 'Risky' ) )
                    // InternalChessDSL.g:1339:3: ( 'Risky' )
                    {
                     before(grammarAccess.getRemarkAccess().getRiskyEnumLiteralDeclaration_3()); 
                    // InternalChessDSL.g:1340:3: ( 'Risky' )
                    // InternalChessDSL.g:1340:4: 'Risky'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getRemarkAccess().getRiskyEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalChessDSL.g:1344:2: ( ( 'Dubious' ) )
                    {
                    // InternalChessDSL.g:1344:2: ( ( 'Dubious' ) )
                    // InternalChessDSL.g:1345:3: ( 'Dubious' )
                    {
                     before(grammarAccess.getRemarkAccess().getDubiousEnumLiteralDeclaration_4()); 
                    // InternalChessDSL.g:1346:3: ( 'Dubious' )
                    // InternalChessDSL.g:1346:4: 'Dubious'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getRemarkAccess().getDubiousEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalChessDSL.g:1350:2: ( ( 'Check' ) )
                    {
                    // InternalChessDSL.g:1350:2: ( ( 'Check' ) )
                    // InternalChessDSL.g:1351:3: ( 'Check' )
                    {
                     before(grammarAccess.getRemarkAccess().getCheckEnumLiteralDeclaration_5()); 
                    // InternalChessDSL.g:1352:3: ( 'Check' )
                    // InternalChessDSL.g:1352:4: 'Check'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getRemarkAccess().getCheckEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalChessDSL.g:1356:2: ( ( 'Checkmate' ) )
                    {
                    // InternalChessDSL.g:1356:2: ( ( 'Checkmate' ) )
                    // InternalChessDSL.g:1357:3: ( 'Checkmate' )
                    {
                     before(grammarAccess.getRemarkAccess().getCheckmateEnumLiteralDeclaration_6()); 
                    // InternalChessDSL.g:1358:3: ( 'Checkmate' )
                    // InternalChessDSL.g:1358:4: 'Checkmate'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getRemarkAccess().getCheckmateEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Remark__Alternatives"


    // $ANTLR start "rule__Color__Alternatives"
    // InternalChessDSL.g:1366:1: rule__Color__Alternatives : ( ( ( 'White' ) ) | ( ( 'Black' ) ) );
    public final void rule__Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1370:1: ( ( ( 'White' ) ) | ( ( 'Black' ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            else if ( (LA20_0==27) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalChessDSL.g:1371:2: ( ( 'White' ) )
                    {
                    // InternalChessDSL.g:1371:2: ( ( 'White' ) )
                    // InternalChessDSL.g:1372:3: ( 'White' )
                    {
                     before(grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_0()); 
                    // InternalChessDSL.g:1373:3: ( 'White' )
                    // InternalChessDSL.g:1373:4: 'White'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1377:2: ( ( 'Black' ) )
                    {
                    // InternalChessDSL.g:1377:2: ( ( 'Black' ) )
                    // InternalChessDSL.g:1378:3: ( 'Black' )
                    {
                     before(grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1()); 
                    // InternalChessDSL.g:1379:3: ( 'Black' )
                    // InternalChessDSL.g:1379:4: 'Black'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Alternatives"


    // $ANTLR start "rule__Piece__Alternatives"
    // InternalChessDSL.g:1387:1: rule__Piece__Alternatives : ( ( ( 'King' ) ) | ( ( 'Queen' ) ) | ( ( 'Rook' ) ) | ( ( 'Bishop' ) ) | ( ( 'Knight' ) ) | ( ( 'Pawn' ) ) );
    public final void rule__Piece__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1391:1: ( ( ( 'King' ) ) | ( ( 'Queen' ) ) | ( ( 'Rook' ) ) | ( ( 'Bishop' ) ) | ( ( 'Knight' ) ) | ( ( 'Pawn' ) ) )
            int alt21=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt21=1;
                }
                break;
            case 29:
                {
                alt21=2;
                }
                break;
            case 30:
                {
                alt21=3;
                }
                break;
            case 31:
                {
                alt21=4;
                }
                break;
            case 32:
                {
                alt21=5;
                }
                break;
            case 33:
                {
                alt21=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalChessDSL.g:1392:2: ( ( 'King' ) )
                    {
                    // InternalChessDSL.g:1392:2: ( ( 'King' ) )
                    // InternalChessDSL.g:1393:3: ( 'King' )
                    {
                     before(grammarAccess.getPieceAccess().getKingEnumLiteralDeclaration_0()); 
                    // InternalChessDSL.g:1394:3: ( 'King' )
                    // InternalChessDSL.g:1394:4: 'King'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getPieceAccess().getKingEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1398:2: ( ( 'Queen' ) )
                    {
                    // InternalChessDSL.g:1398:2: ( ( 'Queen' ) )
                    // InternalChessDSL.g:1399:3: ( 'Queen' )
                    {
                     before(grammarAccess.getPieceAccess().getQueenEnumLiteralDeclaration_1()); 
                    // InternalChessDSL.g:1400:3: ( 'Queen' )
                    // InternalChessDSL.g:1400:4: 'Queen'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getPieceAccess().getQueenEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalChessDSL.g:1404:2: ( ( 'Rook' ) )
                    {
                    // InternalChessDSL.g:1404:2: ( ( 'Rook' ) )
                    // InternalChessDSL.g:1405:3: ( 'Rook' )
                    {
                     before(grammarAccess.getPieceAccess().getRookEnumLiteralDeclaration_2()); 
                    // InternalChessDSL.g:1406:3: ( 'Rook' )
                    // InternalChessDSL.g:1406:4: 'Rook'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getPieceAccess().getRookEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalChessDSL.g:1410:2: ( ( 'Bishop' ) )
                    {
                    // InternalChessDSL.g:1410:2: ( ( 'Bishop' ) )
                    // InternalChessDSL.g:1411:3: ( 'Bishop' )
                    {
                     before(grammarAccess.getPieceAccess().getBishopEnumLiteralDeclaration_3()); 
                    // InternalChessDSL.g:1412:3: ( 'Bishop' )
                    // InternalChessDSL.g:1412:4: 'Bishop'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getPieceAccess().getBishopEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalChessDSL.g:1416:2: ( ( 'Knight' ) )
                    {
                    // InternalChessDSL.g:1416:2: ( ( 'Knight' ) )
                    // InternalChessDSL.g:1417:3: ( 'Knight' )
                    {
                     before(grammarAccess.getPieceAccess().getKnightEnumLiteralDeclaration_4()); 
                    // InternalChessDSL.g:1418:3: ( 'Knight' )
                    // InternalChessDSL.g:1418:4: 'Knight'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getPieceAccess().getKnightEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalChessDSL.g:1422:2: ( ( 'Pawn' ) )
                    {
                    // InternalChessDSL.g:1422:2: ( ( 'Pawn' ) )
                    // InternalChessDSL.g:1423:3: ( 'Pawn' )
                    {
                     before(grammarAccess.getPieceAccess().getPawnEnumLiteralDeclaration_5()); 
                    // InternalChessDSL.g:1424:3: ( 'Pawn' )
                    // InternalChessDSL.g:1424:4: 'Pawn'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getPieceAccess().getPawnEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Piece__Alternatives"


    // $ANTLR start "rule__Game__Group__0"
    // InternalChessDSL.g:1432:1: rule__Game__Group__0 : rule__Game__Group__0__Impl rule__Game__Group__1 ;
    public final void rule__Game__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1436:1: ( rule__Game__Group__0__Impl rule__Game__Group__1 )
            // InternalChessDSL.g:1437:2: rule__Game__Group__0__Impl rule__Game__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Game__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__0"


    // $ANTLR start "rule__Game__Group__0__Impl"
    // InternalChessDSL.g:1444:1: rule__Game__Group__0__Impl : ( 'Game' ) ;
    public final void rule__Game__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1448:1: ( ( 'Game' ) )
            // InternalChessDSL.g:1449:1: ( 'Game' )
            {
            // InternalChessDSL.g:1449:1: ( 'Game' )
            // InternalChessDSL.g:1450:2: 'Game'
            {
             before(grammarAccess.getGameAccess().getGameKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getGameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__0__Impl"


    // $ANTLR start "rule__Game__Group__1"
    // InternalChessDSL.g:1459:1: rule__Game__Group__1 : rule__Game__Group__1__Impl rule__Game__Group__2 ;
    public final void rule__Game__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1463:1: ( rule__Game__Group__1__Impl rule__Game__Group__2 )
            // InternalChessDSL.g:1464:2: rule__Game__Group__1__Impl rule__Game__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Game__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__1"


    // $ANTLR start "rule__Game__Group__1__Impl"
    // InternalChessDSL.g:1471:1: rule__Game__Group__1__Impl : ( ( rule__Game__TitleAssignment_1 ) ) ;
    public final void rule__Game__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1475:1: ( ( ( rule__Game__TitleAssignment_1 ) ) )
            // InternalChessDSL.g:1476:1: ( ( rule__Game__TitleAssignment_1 ) )
            {
            // InternalChessDSL.g:1476:1: ( ( rule__Game__TitleAssignment_1 ) )
            // InternalChessDSL.g:1477:2: ( rule__Game__TitleAssignment_1 )
            {
             before(grammarAccess.getGameAccess().getTitleAssignment_1()); 
            // InternalChessDSL.g:1478:2: ( rule__Game__TitleAssignment_1 )
            // InternalChessDSL.g:1478:3: rule__Game__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Game__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__1__Impl"


    // $ANTLR start "rule__Game__Group__2"
    // InternalChessDSL.g:1486:1: rule__Game__Group__2 : rule__Game__Group__2__Impl rule__Game__Group__3 ;
    public final void rule__Game__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1490:1: ( rule__Game__Group__2__Impl rule__Game__Group__3 )
            // InternalChessDSL.g:1491:2: rule__Game__Group__2__Impl rule__Game__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Game__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__2"


    // $ANTLR start "rule__Game__Group__2__Impl"
    // InternalChessDSL.g:1498:1: rule__Game__Group__2__Impl : ( ( rule__Game__Group_2__0 )? ) ;
    public final void rule__Game__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1502:1: ( ( ( rule__Game__Group_2__0 )? ) )
            // InternalChessDSL.g:1503:1: ( ( rule__Game__Group_2__0 )? )
            {
            // InternalChessDSL.g:1503:1: ( ( rule__Game__Group_2__0 )? )
            // InternalChessDSL.g:1504:2: ( rule__Game__Group_2__0 )?
            {
             before(grammarAccess.getGameAccess().getGroup_2()); 
            // InternalChessDSL.g:1505:2: ( rule__Game__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalChessDSL.g:1505:3: rule__Game__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Game__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGameAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__2__Impl"


    // $ANTLR start "rule__Game__Group__3"
    // InternalChessDSL.g:1513:1: rule__Game__Group__3 : rule__Game__Group__3__Impl rule__Game__Group__4 ;
    public final void rule__Game__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1517:1: ( rule__Game__Group__3__Impl rule__Game__Group__4 )
            // InternalChessDSL.g:1518:2: rule__Game__Group__3__Impl rule__Game__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Game__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__3"


    // $ANTLR start "rule__Game__Group__3__Impl"
    // InternalChessDSL.g:1525:1: rule__Game__Group__3__Impl : ( ( rule__Game__InitialAssignment_3 )? ) ;
    public final void rule__Game__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1529:1: ( ( ( rule__Game__InitialAssignment_3 )? ) )
            // InternalChessDSL.g:1530:1: ( ( rule__Game__InitialAssignment_3 )? )
            {
            // InternalChessDSL.g:1530:1: ( ( rule__Game__InitialAssignment_3 )? )
            // InternalChessDSL.g:1531:2: ( rule__Game__InitialAssignment_3 )?
            {
             before(grammarAccess.getGameAccess().getInitialAssignment_3()); 
            // InternalChessDSL.g:1532:2: ( rule__Game__InitialAssignment_3 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalChessDSL.g:1532:3: rule__Game__InitialAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Game__InitialAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGameAccess().getInitialAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__3__Impl"


    // $ANTLR start "rule__Game__Group__4"
    // InternalChessDSL.g:1540:1: rule__Game__Group__4 : rule__Game__Group__4__Impl rule__Game__Group__5 ;
    public final void rule__Game__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1544:1: ( rule__Game__Group__4__Impl rule__Game__Group__5 )
            // InternalChessDSL.g:1545:2: rule__Game__Group__4__Impl rule__Game__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Game__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__4"


    // $ANTLR start "rule__Game__Group__4__Impl"
    // InternalChessDSL.g:1552:1: rule__Game__Group__4__Impl : ( 'Moves:' ) ;
    public final void rule__Game__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1556:1: ( ( 'Moves:' ) )
            // InternalChessDSL.g:1557:1: ( 'Moves:' )
            {
            // InternalChessDSL.g:1557:1: ( 'Moves:' )
            // InternalChessDSL.g:1558:2: 'Moves:'
            {
             before(grammarAccess.getGameAccess().getMovesKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getMovesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__4__Impl"


    // $ANTLR start "rule__Game__Group__5"
    // InternalChessDSL.g:1567:1: rule__Game__Group__5 : rule__Game__Group__5__Impl rule__Game__Group__6 ;
    public final void rule__Game__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1571:1: ( rule__Game__Group__5__Impl rule__Game__Group__6 )
            // InternalChessDSL.g:1572:2: rule__Game__Group__5__Impl rule__Game__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Game__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__5"


    // $ANTLR start "rule__Game__Group__5__Impl"
    // InternalChessDSL.g:1579:1: rule__Game__Group__5__Impl : ( ( rule__Game__MovesAssignment_5 )* ) ;
    public final void rule__Game__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1583:1: ( ( ( rule__Game__MovesAssignment_5 )* ) )
            // InternalChessDSL.g:1584:1: ( ( rule__Game__MovesAssignment_5 )* )
            {
            // InternalChessDSL.g:1584:1: ( ( rule__Game__MovesAssignment_5 )* )
            // InternalChessDSL.g:1585:2: ( rule__Game__MovesAssignment_5 )*
            {
             before(grammarAccess.getGameAccess().getMovesAssignment_5()); 
            // InternalChessDSL.g:1586:2: ( rule__Game__MovesAssignment_5 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_INT) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalChessDSL.g:1586:3: rule__Game__MovesAssignment_5
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Game__MovesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getGameAccess().getMovesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__5__Impl"


    // $ANTLR start "rule__Game__Group__6"
    // InternalChessDSL.g:1594:1: rule__Game__Group__6 : rule__Game__Group__6__Impl rule__Game__Group__7 ;
    public final void rule__Game__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1598:1: ( rule__Game__Group__6__Impl rule__Game__Group__7 )
            // InternalChessDSL.g:1599:2: rule__Game__Group__6__Impl rule__Game__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Game__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__6"


    // $ANTLR start "rule__Game__Group__6__Impl"
    // InternalChessDSL.g:1606:1: rule__Game__Group__6__Impl : ( 'end' ) ;
    public final void rule__Game__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1610:1: ( ( 'end' ) )
            // InternalChessDSL.g:1611:1: ( 'end' )
            {
            // InternalChessDSL.g:1611:1: ( 'end' )
            // InternalChessDSL.g:1612:2: 'end'
            {
             before(grammarAccess.getGameAccess().getEndKeyword_6()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getEndKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__6__Impl"


    // $ANTLR start "rule__Game__Group__7"
    // InternalChessDSL.g:1621:1: rule__Game__Group__7 : rule__Game__Group__7__Impl ;
    public final void rule__Game__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1625:1: ( rule__Game__Group__7__Impl )
            // InternalChessDSL.g:1626:2: rule__Game__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__7"


    // $ANTLR start "rule__Game__Group__7__Impl"
    // InternalChessDSL.g:1632:1: rule__Game__Group__7__Impl : ( ( rule__Game__ConclusionAssignment_7 )? ) ;
    public final void rule__Game__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1636:1: ( ( ( rule__Game__ConclusionAssignment_7 )? ) )
            // InternalChessDSL.g:1637:1: ( ( rule__Game__ConclusionAssignment_7 )? )
            {
            // InternalChessDSL.g:1637:1: ( ( rule__Game__ConclusionAssignment_7 )? )
            // InternalChessDSL.g:1638:2: ( rule__Game__ConclusionAssignment_7 )?
            {
             before(grammarAccess.getGameAccess().getConclusionAssignment_7()); 
            // InternalChessDSL.g:1639:2: ( rule__Game__ConclusionAssignment_7 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID||LA25_0==18||(LA25_0>=26 && LA25_0<=27)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalChessDSL.g:1639:3: rule__Game__ConclusionAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Game__ConclusionAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGameAccess().getConclusionAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__7__Impl"


    // $ANTLR start "rule__Game__Group_2__0"
    // InternalChessDSL.g:1648:1: rule__Game__Group_2__0 : rule__Game__Group_2__0__Impl rule__Game__Group_2__1 ;
    public final void rule__Game__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1652:1: ( rule__Game__Group_2__0__Impl rule__Game__Group_2__1 )
            // InternalChessDSL.g:1653:2: rule__Game__Group_2__0__Impl rule__Game__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Game__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_2__0"


    // $ANTLR start "rule__Game__Group_2__0__Impl"
    // InternalChessDSL.g:1660:1: rule__Game__Group_2__0__Impl : ( 'Players:' ) ;
    public final void rule__Game__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1664:1: ( ( 'Players:' ) )
            // InternalChessDSL.g:1665:1: ( 'Players:' )
            {
            // InternalChessDSL.g:1665:1: ( 'Players:' )
            // InternalChessDSL.g:1666:2: 'Players:'
            {
             before(grammarAccess.getGameAccess().getPlayersKeyword_2_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getPlayersKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_2__0__Impl"


    // $ANTLR start "rule__Game__Group_2__1"
    // InternalChessDSL.g:1675:1: rule__Game__Group_2__1 : rule__Game__Group_2__1__Impl ;
    public final void rule__Game__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1679:1: ( rule__Game__Group_2__1__Impl )
            // InternalChessDSL.g:1680:2: rule__Game__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_2__1"


    // $ANTLR start "rule__Game__Group_2__1__Impl"
    // InternalChessDSL.g:1686:1: rule__Game__Group_2__1__Impl : ( ( ( rule__Game__PlayersAssignment_2_1 ) ) ( ( rule__Game__PlayersAssignment_2_1 )* ) ) ;
    public final void rule__Game__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1690:1: ( ( ( ( rule__Game__PlayersAssignment_2_1 ) ) ( ( rule__Game__PlayersAssignment_2_1 )* ) ) )
            // InternalChessDSL.g:1691:1: ( ( ( rule__Game__PlayersAssignment_2_1 ) ) ( ( rule__Game__PlayersAssignment_2_1 )* ) )
            {
            // InternalChessDSL.g:1691:1: ( ( ( rule__Game__PlayersAssignment_2_1 ) ) ( ( rule__Game__PlayersAssignment_2_1 )* ) )
            // InternalChessDSL.g:1692:2: ( ( rule__Game__PlayersAssignment_2_1 ) ) ( ( rule__Game__PlayersAssignment_2_1 )* )
            {
            // InternalChessDSL.g:1692:2: ( ( rule__Game__PlayersAssignment_2_1 ) )
            // InternalChessDSL.g:1693:3: ( rule__Game__PlayersAssignment_2_1 )
            {
             before(grammarAccess.getGameAccess().getPlayersAssignment_2_1()); 
            // InternalChessDSL.g:1694:3: ( rule__Game__PlayersAssignment_2_1 )
            // InternalChessDSL.g:1694:4: rule__Game__PlayersAssignment_2_1
            {
            pushFollow(FOLLOW_9);
            rule__Game__PlayersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getPlayersAssignment_2_1()); 

            }

            // InternalChessDSL.g:1697:2: ( ( rule__Game__PlayersAssignment_2_1 )* )
            // InternalChessDSL.g:1698:3: ( rule__Game__PlayersAssignment_2_1 )*
            {
             before(grammarAccess.getGameAccess().getPlayersAssignment_2_1()); 
            // InternalChessDSL.g:1699:3: ( rule__Game__PlayersAssignment_2_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=26 && LA26_0<=27)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalChessDSL.g:1699:4: rule__Game__PlayersAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Game__PlayersAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getGameAccess().getPlayersAssignment_2_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_2__1__Impl"


    // $ANTLR start "rule__Player__Group__0"
    // InternalChessDSL.g:1709:1: rule__Player__Group__0 : rule__Player__Group__0__Impl rule__Player__Group__1 ;
    public final void rule__Player__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1713:1: ( rule__Player__Group__0__Impl rule__Player__Group__1 )
            // InternalChessDSL.g:1714:2: rule__Player__Group__0__Impl rule__Player__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Player__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__0"


    // $ANTLR start "rule__Player__Group__0__Impl"
    // InternalChessDSL.g:1721:1: rule__Player__Group__0__Impl : ( ( rule__Player__ColorAssignment_0 ) ) ;
    public final void rule__Player__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1725:1: ( ( ( rule__Player__ColorAssignment_0 ) ) )
            // InternalChessDSL.g:1726:1: ( ( rule__Player__ColorAssignment_0 ) )
            {
            // InternalChessDSL.g:1726:1: ( ( rule__Player__ColorAssignment_0 ) )
            // InternalChessDSL.g:1727:2: ( rule__Player__ColorAssignment_0 )
            {
             before(grammarAccess.getPlayerAccess().getColorAssignment_0()); 
            // InternalChessDSL.g:1728:2: ( rule__Player__ColorAssignment_0 )
            // InternalChessDSL.g:1728:3: rule__Player__ColorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Player__ColorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPlayerAccess().getColorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__0__Impl"


    // $ANTLR start "rule__Player__Group__1"
    // InternalChessDSL.g:1736:1: rule__Player__Group__1 : rule__Player__Group__1__Impl rule__Player__Group__2 ;
    public final void rule__Player__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1740:1: ( rule__Player__Group__1__Impl rule__Player__Group__2 )
            // InternalChessDSL.g:1741:2: rule__Player__Group__1__Impl rule__Player__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Player__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__1"


    // $ANTLR start "rule__Player__Group__1__Impl"
    // InternalChessDSL.g:1748:1: rule__Player__Group__1__Impl : ( ':' ) ;
    public final void rule__Player__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1752:1: ( ( ':' ) )
            // InternalChessDSL.g:1753:1: ( ':' )
            {
            // InternalChessDSL.g:1753:1: ( ':' )
            // InternalChessDSL.g:1754:2: ':'
            {
             before(grammarAccess.getPlayerAccess().getColonKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__1__Impl"


    // $ANTLR start "rule__Player__Group__2"
    // InternalChessDSL.g:1763:1: rule__Player__Group__2 : rule__Player__Group__2__Impl ;
    public final void rule__Player__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1767:1: ( rule__Player__Group__2__Impl )
            // InternalChessDSL.g:1768:2: rule__Player__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Player__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__2"


    // $ANTLR start "rule__Player__Group__2__Impl"
    // InternalChessDSL.g:1774:1: rule__Player__Group__2__Impl : ( ( rule__Player__NameAssignment_2 ) ) ;
    public final void rule__Player__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1778:1: ( ( ( rule__Player__NameAssignment_2 ) ) )
            // InternalChessDSL.g:1779:1: ( ( rule__Player__NameAssignment_2 ) )
            {
            // InternalChessDSL.g:1779:1: ( ( rule__Player__NameAssignment_2 ) )
            // InternalChessDSL.g:1780:2: ( rule__Player__NameAssignment_2 )
            {
             before(grammarAccess.getPlayerAccess().getNameAssignment_2()); 
            // InternalChessDSL.g:1781:2: ( rule__Player__NameAssignment_2 )
            // InternalChessDSL.g:1781:3: rule__Player__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Player__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPlayerAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__2__Impl"


    // $ANTLR start "rule__InitialState__Group__0"
    // InternalChessDSL.g:1790:1: rule__InitialState__Group__0 : rule__InitialState__Group__0__Impl rule__InitialState__Group__1 ;
    public final void rule__InitialState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1794:1: ( rule__InitialState__Group__0__Impl rule__InitialState__Group__1 )
            // InternalChessDSL.g:1795:2: rule__InitialState__Group__0__Impl rule__InitialState__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__InitialState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialState__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__0"


    // $ANTLR start "rule__InitialState__Group__0__Impl"
    // InternalChessDSL.g:1802:1: rule__InitialState__Group__0__Impl : ( () ) ;
    public final void rule__InitialState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1806:1: ( ( () ) )
            // InternalChessDSL.g:1807:1: ( () )
            {
            // InternalChessDSL.g:1807:1: ( () )
            // InternalChessDSL.g:1808:2: ()
            {
             before(grammarAccess.getInitialStateAccess().getInitialStateAction_0()); 
            // InternalChessDSL.g:1809:2: ()
            // InternalChessDSL.g:1809:3: 
            {
            }

             after(grammarAccess.getInitialStateAccess().getInitialStateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__0__Impl"


    // $ANTLR start "rule__InitialState__Group__1"
    // InternalChessDSL.g:1817:1: rule__InitialState__Group__1 : rule__InitialState__Group__1__Impl rule__InitialState__Group__2 ;
    public final void rule__InitialState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1821:1: ( rule__InitialState__Group__1__Impl rule__InitialState__Group__2 )
            // InternalChessDSL.g:1822:2: rule__InitialState__Group__1__Impl rule__InitialState__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__InitialState__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialState__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__1"


    // $ANTLR start "rule__InitialState__Group__1__Impl"
    // InternalChessDSL.g:1829:1: rule__InitialState__Group__1__Impl : ( 'InitialState' ) ;
    public final void rule__InitialState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1833:1: ( ( 'InitialState' ) )
            // InternalChessDSL.g:1834:1: ( 'InitialState' )
            {
            // InternalChessDSL.g:1834:1: ( 'InitialState' )
            // InternalChessDSL.g:1835:2: 'InitialState'
            {
             before(grammarAccess.getInitialStateAccess().getInitialStateKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getInitialStateAccess().getInitialStateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__1__Impl"


    // $ANTLR start "rule__InitialState__Group__2"
    // InternalChessDSL.g:1844:1: rule__InitialState__Group__2 : rule__InitialState__Group__2__Impl ;
    public final void rule__InitialState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1848:1: ( rule__InitialState__Group__2__Impl )
            // InternalChessDSL.g:1849:2: rule__InitialState__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialState__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__2"


    // $ANTLR start "rule__InitialState__Group__2__Impl"
    // InternalChessDSL.g:1855:1: rule__InitialState__Group__2__Impl : ( ( rule__InitialState__Alternatives_2 )? ) ;
    public final void rule__InitialState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1859:1: ( ( ( rule__InitialState__Alternatives_2 )? ) )
            // InternalChessDSL.g:1860:1: ( ( rule__InitialState__Alternatives_2 )? )
            {
            // InternalChessDSL.g:1860:1: ( ( rule__InitialState__Alternatives_2 )? )
            // InternalChessDSL.g:1861:2: ( rule__InitialState__Alternatives_2 )?
            {
             before(grammarAccess.getInitialStateAccess().getAlternatives_2()); 
            // InternalChessDSL.g:1862:2: ( rule__InitialState__Alternatives_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==12||LA27_0==40) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalChessDSL.g:1862:3: rule__InitialState__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__InitialState__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInitialStateAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__2__Impl"


    // $ANTLR start "rule__InitialState__Group_2_1__0"
    // InternalChessDSL.g:1871:1: rule__InitialState__Group_2_1__0 : rule__InitialState__Group_2_1__0__Impl rule__InitialState__Group_2_1__1 ;
    public final void rule__InitialState__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1875:1: ( rule__InitialState__Group_2_1__0__Impl rule__InitialState__Group_2_1__1 )
            // InternalChessDSL.g:1876:2: rule__InitialState__Group_2_1__0__Impl rule__InitialState__Group_2_1__1
            {
            pushFollow(FOLLOW_13);
            rule__InitialState__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialState__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group_2_1__0"


    // $ANTLR start "rule__InitialState__Group_2_1__0__Impl"
    // InternalChessDSL.g:1883:1: rule__InitialState__Group_2_1__0__Impl : ( 'custom' ) ;
    public final void rule__InitialState__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1887:1: ( ( 'custom' ) )
            // InternalChessDSL.g:1888:1: ( 'custom' )
            {
            // InternalChessDSL.g:1888:1: ( 'custom' )
            // InternalChessDSL.g:1889:2: 'custom'
            {
             before(grammarAccess.getInitialStateAccess().getCustomKeyword_2_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getInitialStateAccess().getCustomKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group_2_1__0__Impl"


    // $ANTLR start "rule__InitialState__Group_2_1__1"
    // InternalChessDSL.g:1898:1: rule__InitialState__Group_2_1__1 : rule__InitialState__Group_2_1__1__Impl ;
    public final void rule__InitialState__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1902:1: ( rule__InitialState__Group_2_1__1__Impl )
            // InternalChessDSL.g:1903:2: rule__InitialState__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialState__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group_2_1__1"


    // $ANTLR start "rule__InitialState__Group_2_1__1__Impl"
    // InternalChessDSL.g:1909:1: rule__InitialState__Group_2_1__1__Impl : ( ( rule__InitialState__PositionsAssignment_2_1_1 ) ) ;
    public final void rule__InitialState__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1913:1: ( ( ( rule__InitialState__PositionsAssignment_2_1_1 ) ) )
            // InternalChessDSL.g:1914:1: ( ( rule__InitialState__PositionsAssignment_2_1_1 ) )
            {
            // InternalChessDSL.g:1914:1: ( ( rule__InitialState__PositionsAssignment_2_1_1 ) )
            // InternalChessDSL.g:1915:2: ( rule__InitialState__PositionsAssignment_2_1_1 )
            {
             before(grammarAccess.getInitialStateAccess().getPositionsAssignment_2_1_1()); 
            // InternalChessDSL.g:1916:2: ( rule__InitialState__PositionsAssignment_2_1_1 )
            // InternalChessDSL.g:1916:3: rule__InitialState__PositionsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__InitialState__PositionsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInitialStateAccess().getPositionsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group_2_1__1__Impl"


    // $ANTLR start "rule__CustomPositions__Group__0"
    // InternalChessDSL.g:1925:1: rule__CustomPositions__Group__0 : rule__CustomPositions__Group__0__Impl rule__CustomPositions__Group__1 ;
    public final void rule__CustomPositions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1929:1: ( rule__CustomPositions__Group__0__Impl rule__CustomPositions__Group__1 )
            // InternalChessDSL.g:1930:2: rule__CustomPositions__Group__0__Impl rule__CustomPositions__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__CustomPositions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomPositions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPositions__Group__0"


    // $ANTLR start "rule__CustomPositions__Group__0__Impl"
    // InternalChessDSL.g:1937:1: rule__CustomPositions__Group__0__Impl : ( () ) ;
    public final void rule__CustomPositions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1941:1: ( ( () ) )
            // InternalChessDSL.g:1942:1: ( () )
            {
            // InternalChessDSL.g:1942:1: ( () )
            // InternalChessDSL.g:1943:2: ()
            {
             before(grammarAccess.getCustomPositionsAccess().getCustomPositionsAction_0()); 
            // InternalChessDSL.g:1944:2: ()
            // InternalChessDSL.g:1944:3: 
            {
            }

             after(grammarAccess.getCustomPositionsAccess().getCustomPositionsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPositions__Group__0__Impl"


    // $ANTLR start "rule__CustomPositions__Group__1"
    // InternalChessDSL.g:1952:1: rule__CustomPositions__Group__1 : rule__CustomPositions__Group__1__Impl rule__CustomPositions__Group__2 ;
    public final void rule__CustomPositions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1956:1: ( rule__CustomPositions__Group__1__Impl rule__CustomPositions__Group__2 )
            // InternalChessDSL.g:1957:2: rule__CustomPositions__Group__1__Impl rule__CustomPositions__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__CustomPositions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomPositions__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPositions__Group__1"


    // $ANTLR start "rule__CustomPositions__Group__1__Impl"
    // InternalChessDSL.g:1964:1: rule__CustomPositions__Group__1__Impl : ( 'Positions:' ) ;
    public final void rule__CustomPositions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1968:1: ( ( 'Positions:' ) )
            // InternalChessDSL.g:1969:1: ( 'Positions:' )
            {
            // InternalChessDSL.g:1969:1: ( 'Positions:' )
            // InternalChessDSL.g:1970:2: 'Positions:'
            {
             before(grammarAccess.getCustomPositionsAccess().getPositionsKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCustomPositionsAccess().getPositionsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPositions__Group__1__Impl"


    // $ANTLR start "rule__CustomPositions__Group__2"
    // InternalChessDSL.g:1979:1: rule__CustomPositions__Group__2 : rule__CustomPositions__Group__2__Impl rule__CustomPositions__Group__3 ;
    public final void rule__CustomPositions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1983:1: ( rule__CustomPositions__Group__2__Impl rule__CustomPositions__Group__3 )
            // InternalChessDSL.g:1984:2: rule__CustomPositions__Group__2__Impl rule__CustomPositions__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__CustomPositions__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomPositions__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPositions__Group__2"


    // $ANTLR start "rule__CustomPositions__Group__2__Impl"
    // InternalChessDSL.g:1991:1: rule__CustomPositions__Group__2__Impl : ( '{' ) ;
    public final void rule__CustomPositions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1995:1: ( ( '{' ) )
            // InternalChessDSL.g:1996:1: ( '{' )
            {
            // InternalChessDSL.g:1996:1: ( '{' )
            // InternalChessDSL.g:1997:2: '{'
            {
             before(grammarAccess.getCustomPositionsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCustomPositionsAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPositions__Group__2__Impl"


    // $ANTLR start "rule__CustomPositions__Group__3"
    // InternalChessDSL.g:2006:1: rule__CustomPositions__Group__3 : rule__CustomPositions__Group__3__Impl rule__CustomPositions__Group__4 ;
    public final void rule__CustomPositions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2010:1: ( rule__CustomPositions__Group__3__Impl rule__CustomPositions__Group__4 )
            // InternalChessDSL.g:2011:2: rule__CustomPositions__Group__3__Impl rule__CustomPositions__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__CustomPositions__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomPositions__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPositions__Group__3"


    // $ANTLR start "rule__CustomPositions__Group__3__Impl"
    // InternalChessDSL.g:2018:1: rule__CustomPositions__Group__3__Impl : ( ( rule__CustomPositions__PlacementAssignment_3 )* ) ;
    public final void rule__CustomPositions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2022:1: ( ( ( rule__CustomPositions__PlacementAssignment_3 )* ) )
            // InternalChessDSL.g:2023:1: ( ( rule__CustomPositions__PlacementAssignment_3 )* )
            {
            // InternalChessDSL.g:2023:1: ( ( rule__CustomPositions__PlacementAssignment_3 )* )
            // InternalChessDSL.g:2024:2: ( rule__CustomPositions__PlacementAssignment_3 )*
            {
             before(grammarAccess.getCustomPositionsAccess().getPlacementAssignment_3()); 
            // InternalChessDSL.g:2025:2: ( rule__CustomPositions__PlacementAssignment_3 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=26 && LA28_0<=27)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalChessDSL.g:2025:3: rule__CustomPositions__PlacementAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__CustomPositions__PlacementAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getCustomPositionsAccess().getPlacementAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPositions__Group__3__Impl"


    // $ANTLR start "rule__CustomPositions__Group__4"
    // InternalChessDSL.g:2033:1: rule__CustomPositions__Group__4 : rule__CustomPositions__Group__4__Impl ;
    public final void rule__CustomPositions__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2037:1: ( rule__CustomPositions__Group__4__Impl )
            // InternalChessDSL.g:2038:2: rule__CustomPositions__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomPositions__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPositions__Group__4"


    // $ANTLR start "rule__CustomPositions__Group__4__Impl"
    // InternalChessDSL.g:2044:1: rule__CustomPositions__Group__4__Impl : ( '}' ) ;
    public final void rule__CustomPositions__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2048:1: ( ( '}' ) )
            // InternalChessDSL.g:2049:1: ( '}' )
            {
            // InternalChessDSL.g:2049:1: ( '}' )
            // InternalChessDSL.g:2050:2: '}'
            {
             before(grammarAccess.getCustomPositionsAccess().getRightCurlyBracketKeyword_4()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getCustomPositionsAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPositions__Group__4__Impl"


    // $ANTLR start "rule__Placement__Group__0"
    // InternalChessDSL.g:2060:1: rule__Placement__Group__0 : rule__Placement__Group__0__Impl rule__Placement__Group__1 ;
    public final void rule__Placement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2064:1: ( rule__Placement__Group__0__Impl rule__Placement__Group__1 )
            // InternalChessDSL.g:2065:2: rule__Placement__Group__0__Impl rule__Placement__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Placement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Placement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group__0"


    // $ANTLR start "rule__Placement__Group__0__Impl"
    // InternalChessDSL.g:2072:1: rule__Placement__Group__0__Impl : ( ( rule__Placement__PieceAssignment_0 ) ) ;
    public final void rule__Placement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2076:1: ( ( ( rule__Placement__PieceAssignment_0 ) ) )
            // InternalChessDSL.g:2077:1: ( ( rule__Placement__PieceAssignment_0 ) )
            {
            // InternalChessDSL.g:2077:1: ( ( rule__Placement__PieceAssignment_0 ) )
            // InternalChessDSL.g:2078:2: ( rule__Placement__PieceAssignment_0 )
            {
             before(grammarAccess.getPlacementAccess().getPieceAssignment_0()); 
            // InternalChessDSL.g:2079:2: ( rule__Placement__PieceAssignment_0 )
            // InternalChessDSL.g:2079:3: rule__Placement__PieceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Placement__PieceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPlacementAccess().getPieceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group__0__Impl"


    // $ANTLR start "rule__Placement__Group__1"
    // InternalChessDSL.g:2087:1: rule__Placement__Group__1 : rule__Placement__Group__1__Impl rule__Placement__Group__2 ;
    public final void rule__Placement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2091:1: ( rule__Placement__Group__1__Impl rule__Placement__Group__2 )
            // InternalChessDSL.g:2092:2: rule__Placement__Group__1__Impl rule__Placement__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Placement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Placement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group__1"


    // $ANTLR start "rule__Placement__Group__1__Impl"
    // InternalChessDSL.g:2099:1: rule__Placement__Group__1__Impl : ( ( rule__Placement__Alternatives_1 ) ) ;
    public final void rule__Placement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2103:1: ( ( ( rule__Placement__Alternatives_1 ) ) )
            // InternalChessDSL.g:2104:1: ( ( rule__Placement__Alternatives_1 ) )
            {
            // InternalChessDSL.g:2104:1: ( ( rule__Placement__Alternatives_1 ) )
            // InternalChessDSL.g:2105:2: ( rule__Placement__Alternatives_1 )
            {
             before(grammarAccess.getPlacementAccess().getAlternatives_1()); 
            // InternalChessDSL.g:2106:2: ( rule__Placement__Alternatives_1 )
            // InternalChessDSL.g:2106:3: rule__Placement__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Placement__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getPlacementAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group__1__Impl"


    // $ANTLR start "rule__Placement__Group__2"
    // InternalChessDSL.g:2114:1: rule__Placement__Group__2 : rule__Placement__Group__2__Impl ;
    public final void rule__Placement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2118:1: ( rule__Placement__Group__2__Impl )
            // InternalChessDSL.g:2119:2: rule__Placement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Placement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group__2"


    // $ANTLR start "rule__Placement__Group__2__Impl"
    // InternalChessDSL.g:2125:1: rule__Placement__Group__2__Impl : ( ( rule__Placement__SquareAssignment_2 ) ) ;
    public final void rule__Placement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2129:1: ( ( ( rule__Placement__SquareAssignment_2 ) ) )
            // InternalChessDSL.g:2130:1: ( ( rule__Placement__SquareAssignment_2 ) )
            {
            // InternalChessDSL.g:2130:1: ( ( rule__Placement__SquareAssignment_2 ) )
            // InternalChessDSL.g:2131:2: ( rule__Placement__SquareAssignment_2 )
            {
             before(grammarAccess.getPlacementAccess().getSquareAssignment_2()); 
            // InternalChessDSL.g:2132:2: ( rule__Placement__SquareAssignment_2 )
            // InternalChessDSL.g:2132:3: rule__Placement__SquareAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Placement__SquareAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPlacementAccess().getSquareAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__Group__2__Impl"


    // $ANTLR start "rule__CustomPiece__Group__0"
    // InternalChessDSL.g:2141:1: rule__CustomPiece__Group__0 : rule__CustomPiece__Group__0__Impl rule__CustomPiece__Group__1 ;
    public final void rule__CustomPiece__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2145:1: ( rule__CustomPiece__Group__0__Impl rule__CustomPiece__Group__1 )
            // InternalChessDSL.g:2146:2: rule__CustomPiece__Group__0__Impl rule__CustomPiece__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__CustomPiece__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomPiece__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPiece__Group__0"


    // $ANTLR start "rule__CustomPiece__Group__0__Impl"
    // InternalChessDSL.g:2153:1: rule__CustomPiece__Group__0__Impl : ( ( rule__CustomPiece__ColorAssignment_0 ) ) ;
    public final void rule__CustomPiece__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2157:1: ( ( ( rule__CustomPiece__ColorAssignment_0 ) ) )
            // InternalChessDSL.g:2158:1: ( ( rule__CustomPiece__ColorAssignment_0 ) )
            {
            // InternalChessDSL.g:2158:1: ( ( rule__CustomPiece__ColorAssignment_0 ) )
            // InternalChessDSL.g:2159:2: ( rule__CustomPiece__ColorAssignment_0 )
            {
             before(grammarAccess.getCustomPieceAccess().getColorAssignment_0()); 
            // InternalChessDSL.g:2160:2: ( rule__CustomPiece__ColorAssignment_0 )
            // InternalChessDSL.g:2160:3: rule__CustomPiece__ColorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CustomPiece__ColorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCustomPieceAccess().getColorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPiece__Group__0__Impl"


    // $ANTLR start "rule__CustomPiece__Group__1"
    // InternalChessDSL.g:2168:1: rule__CustomPiece__Group__1 : rule__CustomPiece__Group__1__Impl ;
    public final void rule__CustomPiece__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2172:1: ( rule__CustomPiece__Group__1__Impl )
            // InternalChessDSL.g:2173:2: rule__CustomPiece__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomPiece__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPiece__Group__1"


    // $ANTLR start "rule__CustomPiece__Group__1__Impl"
    // InternalChessDSL.g:2179:1: rule__CustomPiece__Group__1__Impl : ( ( rule__CustomPiece__KindAssignment_1 ) ) ;
    public final void rule__CustomPiece__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2183:1: ( ( ( rule__CustomPiece__KindAssignment_1 ) ) )
            // InternalChessDSL.g:2184:1: ( ( rule__CustomPiece__KindAssignment_1 ) )
            {
            // InternalChessDSL.g:2184:1: ( ( rule__CustomPiece__KindAssignment_1 ) )
            // InternalChessDSL.g:2185:2: ( rule__CustomPiece__KindAssignment_1 )
            {
             before(grammarAccess.getCustomPieceAccess().getKindAssignment_1()); 
            // InternalChessDSL.g:2186:2: ( rule__CustomPiece__KindAssignment_1 )
            // InternalChessDSL.g:2186:3: rule__CustomPiece__KindAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CustomPiece__KindAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomPieceAccess().getKindAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPiece__Group__1__Impl"


    // $ANTLR start "rule__MovePair__Group__0"
    // InternalChessDSL.g:2195:1: rule__MovePair__Group__0 : rule__MovePair__Group__0__Impl rule__MovePair__Group__1 ;
    public final void rule__MovePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2199:1: ( rule__MovePair__Group__0__Impl rule__MovePair__Group__1 )
            // InternalChessDSL.g:2200:2: rule__MovePair__Group__0__Impl rule__MovePair__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__MovePair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MovePair__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovePair__Group__0"


    // $ANTLR start "rule__MovePair__Group__0__Impl"
    // InternalChessDSL.g:2207:1: rule__MovePair__Group__0__Impl : ( ( rule__MovePair__MoveNumberAssignment_0 ) ) ;
    public final void rule__MovePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2211:1: ( ( ( rule__MovePair__MoveNumberAssignment_0 ) ) )
            // InternalChessDSL.g:2212:1: ( ( rule__MovePair__MoveNumberAssignment_0 ) )
            {
            // InternalChessDSL.g:2212:1: ( ( rule__MovePair__MoveNumberAssignment_0 ) )
            // InternalChessDSL.g:2213:2: ( rule__MovePair__MoveNumberAssignment_0 )
            {
             before(grammarAccess.getMovePairAccess().getMoveNumberAssignment_0()); 
            // InternalChessDSL.g:2214:2: ( rule__MovePair__MoveNumberAssignment_0 )
            // InternalChessDSL.g:2214:3: rule__MovePair__MoveNumberAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MovePair__MoveNumberAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMovePairAccess().getMoveNumberAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovePair__Group__0__Impl"


    // $ANTLR start "rule__MovePair__Group__1"
    // InternalChessDSL.g:2222:1: rule__MovePair__Group__1 : rule__MovePair__Group__1__Impl rule__MovePair__Group__2 ;
    public final void rule__MovePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2226:1: ( rule__MovePair__Group__1__Impl rule__MovePair__Group__2 )
            // InternalChessDSL.g:2227:2: rule__MovePair__Group__1__Impl rule__MovePair__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__MovePair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MovePair__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovePair__Group__1"


    // $ANTLR start "rule__MovePair__Group__1__Impl"
    // InternalChessDSL.g:2234:1: rule__MovePair__Group__1__Impl : ( ( rule__MovePair__Alternatives_1 ) ) ;
    public final void rule__MovePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2238:1: ( ( ( rule__MovePair__Alternatives_1 ) ) )
            // InternalChessDSL.g:2239:1: ( ( rule__MovePair__Alternatives_1 ) )
            {
            // InternalChessDSL.g:2239:1: ( ( rule__MovePair__Alternatives_1 ) )
            // InternalChessDSL.g:2240:2: ( rule__MovePair__Alternatives_1 )
            {
             before(grammarAccess.getMovePairAccess().getAlternatives_1()); 
            // InternalChessDSL.g:2241:2: ( rule__MovePair__Alternatives_1 )
            // InternalChessDSL.g:2241:3: rule__MovePair__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__MovePair__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getMovePairAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovePair__Group__1__Impl"


    // $ANTLR start "rule__MovePair__Group__2"
    // InternalChessDSL.g:2249:1: rule__MovePair__Group__2 : rule__MovePair__Group__2__Impl ;
    public final void rule__MovePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2253:1: ( rule__MovePair__Group__2__Impl )
            // InternalChessDSL.g:2254:2: rule__MovePair__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MovePair__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovePair__Group__2"


    // $ANTLR start "rule__MovePair__Group__2__Impl"
    // InternalChessDSL.g:2260:1: rule__MovePair__Group__2__Impl : ( ( rule__MovePair__Group_2__0 )? ) ;
    public final void rule__MovePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2264:1: ( ( ( rule__MovePair__Group_2__0 )? ) )
            // InternalChessDSL.g:2265:1: ( ( rule__MovePair__Group_2__0 )? )
            {
            // InternalChessDSL.g:2265:1: ( ( rule__MovePair__Group_2__0 )? )
            // InternalChessDSL.g:2266:2: ( rule__MovePair__Group_2__0 )?
            {
             before(grammarAccess.getMovePairAccess().getGroup_2()); 
            // InternalChessDSL.g:2267:2: ( rule__MovePair__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID||(LA29_0>=28 && LA29_0<=33)||(LA29_0>=47 && LA29_0<=48)||(LA29_0>=55 && LA29_0<=56)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalChessDSL.g:2267:3: rule__MovePair__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MovePair__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMovePairAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovePair__Group__2__Impl"


    // $ANTLR start "rule__MovePair__Group_1_0__0"
    // InternalChessDSL.g:2276:1: rule__MovePair__Group_1_0__0 : rule__MovePair__Group_1_0__0__Impl rule__MovePair__Group_1_0__1 ;
    public final void rule__MovePair__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2280:1: ( rule__MovePair__Group_1_0__0__Impl rule__MovePair__Group_1_0__1 )
            // InternalChessDSL.g:2281:2: rule__MovePair__Group_1_0__0__Impl rule__MovePair__Group_1_0__1
            {
            pushFollow(FOLLOW_20);
            rule__MovePair__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MovePair__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovePair__Group_1_0__0"


    // $ANTLR start "rule__MovePair__Group_1_0__0__Impl"
    // InternalChessDSL.g:2288:1: rule__MovePair__Group_1_0__0__Impl : ( ( rule__MovePair__Color1Assignment_1_0_0 )? ) ;
    public final void rule__MovePair__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2292:1: ( ( ( rule__MovePair__Color1Assignment_1_0_0 )? ) )
            // InternalChessDSL.g:2293:1: ( ( rule__MovePair__Color1Assignment_1_0_0 )? )
            {
            // InternalChessDSL.g:2293:1: ( ( rule__MovePair__Color1Assignment_1_0_0 )? )
            // InternalChessDSL.g:2294:2: ( rule__MovePair__Color1Assignment_1_0_0 )?
            {
             before(grammarAccess.getMovePairAccess().getColor1Assignment_1_0_0()); 
            // InternalChessDSL.g:2295:2: ( rule__MovePair__Color1Assignment_1_0_0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalChessDSL.g:2295:3: rule__MovePair__Color1Assignment_1_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MovePair__Color1Assignment_1_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMovePairAccess().getColor1Assignment_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovePair__Group_1_0__0__Impl"


    // $ANTLR start "rule__MovePair__Group_1_0__1"
    // InternalChessDSL.g:2303:1: rule__MovePair__Group_1_0__1 : rule__MovePair__Group_1_0__1__Impl ;
    public final void rule__MovePair__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2307:1: ( rule__MovePair__Group_1_0__1__Impl )
            // InternalChessDSL.g:2308:2: rule__MovePair__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MovePair__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovePair__Group_1_0__1"


    // $ANTLR start "rule__MovePair__Group_1_0__1__Impl"
    // InternalChessDSL.g:2314:1: rule__MovePair__Group_1_0__1__Impl : ( ( rule__MovePair__WhiteMoveAssignment_1_0_1 ) ) ;
    public final void rule__MovePair__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2318:1: ( ( ( rule__MovePair__WhiteMoveAssignment_1_0_1 ) ) )
            // InternalChessDSL.g:2319:1: ( ( rule__MovePair__WhiteMoveAssignment_1_0_1 ) )
            {
            // InternalChessDSL.g:2319:1: ( ( rule__MovePair__WhiteMoveAssignment_1_0_1 ) )
            // InternalChessDSL.g:2320:2: ( rule__MovePair__WhiteMoveAssignment_1_0_1 )
            {
             before(grammarAccess.getMovePairAccess().getWhiteMoveAssignment_1_0_1()); 
            // InternalChessDSL.g:2321:2: ( rule__MovePair__WhiteMoveAssignment_1_0_1 )
            // InternalChessDSL.g:2321:3: rule__MovePair__WhiteMoveAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__MovePair__WhiteMoveAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMovePairAccess().getWhiteMoveAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovePair__Group_1_0__1__Impl"


    // $ANTLR start "rule__MovePair__Group_2__0"
    // InternalChessDSL.g:2330:1: rule__MovePair__Group_2__0 : rule__MovePair__Group_2__0__Impl rule__MovePair__Group_2__1 ;
    public final void rule__MovePair__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2334:1: ( rule__MovePair__Group_2__0__Impl rule__MovePair__Group_2__1 )
            // InternalChessDSL.g:2335:2: rule__MovePair__Group_2__0__Impl rule__MovePair__Group_2__1
            {
            pushFollow(FOLLOW_20);
            rule__MovePair__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MovePair__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovePair__Group_2__0"


    // $ANTLR start "rule__MovePair__Group_2__0__Impl"
    // InternalChessDSL.g:2342:1: rule__MovePair__Group_2__0__Impl : ( ( rule__MovePair__Color2Assignment_2_0 )? ) ;
    public final void rule__MovePair__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2346:1: ( ( ( rule__MovePair__Color2Assignment_2_0 )? ) )
            // InternalChessDSL.g:2347:1: ( ( rule__MovePair__Color2Assignment_2_0 )? )
            {
            // InternalChessDSL.g:2347:1: ( ( rule__MovePair__Color2Assignment_2_0 )? )
            // InternalChessDSL.g:2348:2: ( rule__MovePair__Color2Assignment_2_0 )?
            {
             before(grammarAccess.getMovePairAccess().getColor2Assignment_2_0()); 
            // InternalChessDSL.g:2349:2: ( rule__MovePair__Color2Assignment_2_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalChessDSL.g:2349:3: rule__MovePair__Color2Assignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MovePair__Color2Assignment_2_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMovePairAccess().getColor2Assignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovePair__Group_2__0__Impl"


    // $ANTLR start "rule__MovePair__Group_2__1"
    // InternalChessDSL.g:2357:1: rule__MovePair__Group_2__1 : rule__MovePair__Group_2__1__Impl ;
    public final void rule__MovePair__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2361:1: ( rule__MovePair__Group_2__1__Impl )
            // InternalChessDSL.g:2362:2: rule__MovePair__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MovePair__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovePair__Group_2__1"


    // $ANTLR start "rule__MovePair__Group_2__1__Impl"
    // InternalChessDSL.g:2368:1: rule__MovePair__Group_2__1__Impl : ( ( rule__MovePair__BlackMoveAssignment_2_1 ) ) ;
    public final void rule__MovePair__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2372:1: ( ( ( rule__MovePair__BlackMoveAssignment_2_1 ) ) )
            // InternalChessDSL.g:2373:1: ( ( rule__MovePair__BlackMoveAssignment_2_1 ) )
            {
            // InternalChessDSL.g:2373:1: ( ( rule__MovePair__BlackMoveAssignment_2_1 ) )
            // InternalChessDSL.g:2374:2: ( rule__MovePair__BlackMoveAssignment_2_1 )
            {
             before(grammarAccess.getMovePairAccess().getBlackMoveAssignment_2_1()); 
            // InternalChessDSL.g:2375:2: ( rule__MovePair__BlackMoveAssignment_2_1 )
            // InternalChessDSL.g:2375:3: rule__MovePair__BlackMoveAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MovePair__BlackMoveAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMovePairAccess().getBlackMoveAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovePair__Group_2__1__Impl"


    // $ANTLR start "rule__MOVENUMBER__Group__0"
    // InternalChessDSL.g:2384:1: rule__MOVENUMBER__Group__0 : rule__MOVENUMBER__Group__0__Impl rule__MOVENUMBER__Group__1 ;
    public final void rule__MOVENUMBER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2388:1: ( rule__MOVENUMBER__Group__0__Impl rule__MOVENUMBER__Group__1 )
            // InternalChessDSL.g:2389:2: rule__MOVENUMBER__Group__0__Impl rule__MOVENUMBER__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__MOVENUMBER__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MOVENUMBER__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOVENUMBER__Group__0"


    // $ANTLR start "rule__MOVENUMBER__Group__0__Impl"
    // InternalChessDSL.g:2396:1: rule__MOVENUMBER__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__MOVENUMBER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2400:1: ( ( RULE_INT ) )
            // InternalChessDSL.g:2401:1: ( RULE_INT )
            {
            // InternalChessDSL.g:2401:1: ( RULE_INT )
            // InternalChessDSL.g:2402:2: RULE_INT
            {
             before(grammarAccess.getMOVENUMBERAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMOVENUMBERAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOVENUMBER__Group__0__Impl"


    // $ANTLR start "rule__MOVENUMBER__Group__1"
    // InternalChessDSL.g:2411:1: rule__MOVENUMBER__Group__1 : rule__MOVENUMBER__Group__1__Impl ;
    public final void rule__MOVENUMBER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2415:1: ( rule__MOVENUMBER__Group__1__Impl )
            // InternalChessDSL.g:2416:2: rule__MOVENUMBER__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MOVENUMBER__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOVENUMBER__Group__1"


    // $ANTLR start "rule__MOVENUMBER__Group__1__Impl"
    // InternalChessDSL.g:2422:1: rule__MOVENUMBER__Group__1__Impl : ( '.' ) ;
    public final void rule__MOVENUMBER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2426:1: ( ( '.' ) )
            // InternalChessDSL.g:2427:1: ( '.' )
            {
            // InternalChessDSL.g:2427:1: ( '.' )
            // InternalChessDSL.g:2428:2: '.'
            {
             before(grammarAccess.getMOVENUMBERAccess().getFullStopKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMOVENUMBERAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOVENUMBER__Group__1__Impl"


    // $ANTLR start "rule__AnyMove__Group__0"
    // InternalChessDSL.g:2438:1: rule__AnyMove__Group__0 : rule__AnyMove__Group__0__Impl rule__AnyMove__Group__1 ;
    public final void rule__AnyMove__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2442:1: ( rule__AnyMove__Group__0__Impl rule__AnyMove__Group__1 )
            // InternalChessDSL.g:2443:2: rule__AnyMove__Group__0__Impl rule__AnyMove__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__AnyMove__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnyMove__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyMove__Group__0"


    // $ANTLR start "rule__AnyMove__Group__0__Impl"
    // InternalChessDSL.g:2450:1: rule__AnyMove__Group__0__Impl : ( ( rule__AnyMove__MoveAssignment_0 ) ) ;
    public final void rule__AnyMove__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2454:1: ( ( ( rule__AnyMove__MoveAssignment_0 ) ) )
            // InternalChessDSL.g:2455:1: ( ( rule__AnyMove__MoveAssignment_0 ) )
            {
            // InternalChessDSL.g:2455:1: ( ( rule__AnyMove__MoveAssignment_0 ) )
            // InternalChessDSL.g:2456:2: ( rule__AnyMove__MoveAssignment_0 )
            {
             before(grammarAccess.getAnyMoveAccess().getMoveAssignment_0()); 
            // InternalChessDSL.g:2457:2: ( rule__AnyMove__MoveAssignment_0 )
            // InternalChessDSL.g:2457:3: rule__AnyMove__MoveAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AnyMove__MoveAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAnyMoveAccess().getMoveAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyMove__Group__0__Impl"


    // $ANTLR start "rule__AnyMove__Group__1"
    // InternalChessDSL.g:2465:1: rule__AnyMove__Group__1 : rule__AnyMove__Group__1__Impl ;
    public final void rule__AnyMove__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2469:1: ( rule__AnyMove__Group__1__Impl )
            // InternalChessDSL.g:2470:2: rule__AnyMove__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnyMove__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyMove__Group__1"


    // $ANTLR start "rule__AnyMove__Group__1__Impl"
    // InternalChessDSL.g:2476:1: rule__AnyMove__Group__1__Impl : ( ( rule__AnyMove__Group_1__0 )? ) ;
    public final void rule__AnyMove__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2480:1: ( ( ( rule__AnyMove__Group_1__0 )? ) )
            // InternalChessDSL.g:2481:1: ( ( rule__AnyMove__Group_1__0 )? )
            {
            // InternalChessDSL.g:2481:1: ( ( rule__AnyMove__Group_1__0 )? )
            // InternalChessDSL.g:2482:2: ( rule__AnyMove__Group_1__0 )?
            {
             before(grammarAccess.getAnyMoveAccess().getGroup_1()); 
            // InternalChessDSL.g:2483:2: ( rule__AnyMove__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==45) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalChessDSL.g:2483:3: rule__AnyMove__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AnyMove__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnyMoveAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyMove__Group__1__Impl"


    // $ANTLR start "rule__AnyMove__Group_1__0"
    // InternalChessDSL.g:2492:1: rule__AnyMove__Group_1__0 : rule__AnyMove__Group_1__0__Impl rule__AnyMove__Group_1__1 ;
    public final void rule__AnyMove__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2496:1: ( rule__AnyMove__Group_1__0__Impl rule__AnyMove__Group_1__1 )
            // InternalChessDSL.g:2497:2: rule__AnyMove__Group_1__0__Impl rule__AnyMove__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__AnyMove__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnyMove__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyMove__Group_1__0"


    // $ANTLR start "rule__AnyMove__Group_1__0__Impl"
    // InternalChessDSL.g:2504:1: rule__AnyMove__Group_1__0__Impl : ( '(' ) ;
    public final void rule__AnyMove__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2508:1: ( ( '(' ) )
            // InternalChessDSL.g:2509:1: ( '(' )
            {
            // InternalChessDSL.g:2509:1: ( '(' )
            // InternalChessDSL.g:2510:2: '('
            {
             before(grammarAccess.getAnyMoveAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAnyMoveAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyMove__Group_1__0__Impl"


    // $ANTLR start "rule__AnyMove__Group_1__1"
    // InternalChessDSL.g:2519:1: rule__AnyMove__Group_1__1 : rule__AnyMove__Group_1__1__Impl rule__AnyMove__Group_1__2 ;
    public final void rule__AnyMove__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2523:1: ( rule__AnyMove__Group_1__1__Impl rule__AnyMove__Group_1__2 )
            // InternalChessDSL.g:2524:2: rule__AnyMove__Group_1__1__Impl rule__AnyMove__Group_1__2
            {
            pushFollow(FOLLOW_23);
            rule__AnyMove__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnyMove__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyMove__Group_1__1"


    // $ANTLR start "rule__AnyMove__Group_1__1__Impl"
    // InternalChessDSL.g:2531:1: rule__AnyMove__Group_1__1__Impl : ( ( rule__AnyMove__RemarksAssignment_1_1 )* ) ;
    public final void rule__AnyMove__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2535:1: ( ( ( rule__AnyMove__RemarksAssignment_1_1 )* ) )
            // InternalChessDSL.g:2536:1: ( ( rule__AnyMove__RemarksAssignment_1_1 )* )
            {
            // InternalChessDSL.g:2536:1: ( ( rule__AnyMove__RemarksAssignment_1_1 )* )
            // InternalChessDSL.g:2537:2: ( rule__AnyMove__RemarksAssignment_1_1 )*
            {
             before(grammarAccess.getAnyMoveAccess().getRemarksAssignment_1_1()); 
            // InternalChessDSL.g:2538:2: ( rule__AnyMove__RemarksAssignment_1_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=19 && LA33_0<=25)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalChessDSL.g:2538:3: rule__AnyMove__RemarksAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__AnyMove__RemarksAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getAnyMoveAccess().getRemarksAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyMove__Group_1__1__Impl"


    // $ANTLR start "rule__AnyMove__Group_1__2"
    // InternalChessDSL.g:2546:1: rule__AnyMove__Group_1__2 : rule__AnyMove__Group_1__2__Impl ;
    public final void rule__AnyMove__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2550:1: ( rule__AnyMove__Group_1__2__Impl )
            // InternalChessDSL.g:2551:2: rule__AnyMove__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnyMove__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyMove__Group_1__2"


    // $ANTLR start "rule__AnyMove__Group_1__2__Impl"
    // InternalChessDSL.g:2557:1: rule__AnyMove__Group_1__2__Impl : ( ')' ) ;
    public final void rule__AnyMove__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2561:1: ( ( ')' ) )
            // InternalChessDSL.g:2562:1: ( ')' )
            {
            // InternalChessDSL.g:2562:1: ( ')' )
            // InternalChessDSL.g:2563:2: ')'
            {
             before(grammarAccess.getAnyMoveAccess().getRightParenthesisKeyword_1_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getAnyMoveAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyMove__Group_1__2__Impl"


    // $ANTLR start "rule__Dummy__Group__0"
    // InternalChessDSL.g:2573:1: rule__Dummy__Group__0 : rule__Dummy__Group__0__Impl rule__Dummy__Group__1 ;
    public final void rule__Dummy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2577:1: ( rule__Dummy__Group__0__Impl rule__Dummy__Group__1 )
            // InternalChessDSL.g:2578:2: rule__Dummy__Group__0__Impl rule__Dummy__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Dummy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dummy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dummy__Group__0"


    // $ANTLR start "rule__Dummy__Group__0__Impl"
    // InternalChessDSL.g:2585:1: rule__Dummy__Group__0__Impl : ( () ) ;
    public final void rule__Dummy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2589:1: ( ( () ) )
            // InternalChessDSL.g:2590:1: ( () )
            {
            // InternalChessDSL.g:2590:1: ( () )
            // InternalChessDSL.g:2591:2: ()
            {
             before(grammarAccess.getDummyAccess().getDummyAction_0()); 
            // InternalChessDSL.g:2592:2: ()
            // InternalChessDSL.g:2592:3: 
            {
            }

             after(grammarAccess.getDummyAccess().getDummyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dummy__Group__0__Impl"


    // $ANTLR start "rule__Dummy__Group__1"
    // InternalChessDSL.g:2600:1: rule__Dummy__Group__1 : rule__Dummy__Group__1__Impl ;
    public final void rule__Dummy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2604:1: ( rule__Dummy__Group__1__Impl )
            // InternalChessDSL.g:2605:2: rule__Dummy__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dummy__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dummy__Group__1"


    // $ANTLR start "rule__Dummy__Group__1__Impl"
    // InternalChessDSL.g:2611:1: rule__Dummy__Group__1__Impl : ( 'dummy' ) ;
    public final void rule__Dummy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2615:1: ( ( 'dummy' ) )
            // InternalChessDSL.g:2616:1: ( 'dummy' )
            {
            // InternalChessDSL.g:2616:1: ( 'dummy' )
            // InternalChessDSL.g:2617:2: 'dummy'
            {
             before(grammarAccess.getDummyAccess().getDummyKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getDummyAccess().getDummyKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dummy__Group__1__Impl"


    // $ANTLR start "rule__Move__Group__0"
    // InternalChessDSL.g:2627:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2631:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // InternalChessDSL.g:2632:2: rule__Move__Group__0__Impl rule__Move__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Move__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__0"


    // $ANTLR start "rule__Move__Group__0__Impl"
    // InternalChessDSL.g:2639:1: rule__Move__Group__0__Impl : ( ( 'moves' )? ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2643:1: ( ( ( 'moves' )? ) )
            // InternalChessDSL.g:2644:1: ( ( 'moves' )? )
            {
            // InternalChessDSL.g:2644:1: ( ( 'moves' )? )
            // InternalChessDSL.g:2645:2: ( 'moves' )?
            {
             before(grammarAccess.getMoveAccess().getMovesKeyword_0()); 
            // InternalChessDSL.g:2646:2: ( 'moves' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==48) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalChessDSL.g:2646:3: 'moves'
                    {
                    match(input,48,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMoveAccess().getMovesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__0__Impl"


    // $ANTLR start "rule__Move__Group__1"
    // InternalChessDSL.g:2654:1: rule__Move__Group__1 : rule__Move__Group__1__Impl rule__Move__Group__2 ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2658:1: ( rule__Move__Group__1__Impl rule__Move__Group__2 )
            // InternalChessDSL.g:2659:2: rule__Move__Group__1__Impl rule__Move__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Move__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__1"


    // $ANTLR start "rule__Move__Group__1__Impl"
    // InternalChessDSL.g:2666:1: rule__Move__Group__1__Impl : ( ( rule__Move__PieceAssignment_1 ) ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2670:1: ( ( ( rule__Move__PieceAssignment_1 ) ) )
            // InternalChessDSL.g:2671:1: ( ( rule__Move__PieceAssignment_1 ) )
            {
            // InternalChessDSL.g:2671:1: ( ( rule__Move__PieceAssignment_1 ) )
            // InternalChessDSL.g:2672:2: ( rule__Move__PieceAssignment_1 )
            {
             before(grammarAccess.getMoveAccess().getPieceAssignment_1()); 
            // InternalChessDSL.g:2673:2: ( rule__Move__PieceAssignment_1 )
            // InternalChessDSL.g:2673:3: rule__Move__PieceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Move__PieceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getPieceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__1__Impl"


    // $ANTLR start "rule__Move__Group__2"
    // InternalChessDSL.g:2681:1: rule__Move__Group__2 : rule__Move__Group__2__Impl ;
    public final void rule__Move__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2685:1: ( rule__Move__Group__2__Impl )
            // InternalChessDSL.g:2686:2: rule__Move__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__2"


    // $ANTLR start "rule__Move__Group__2__Impl"
    // InternalChessDSL.g:2692:1: rule__Move__Group__2__Impl : ( ( rule__Move__Alternatives_2 ) ) ;
    public final void rule__Move__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2696:1: ( ( ( rule__Move__Alternatives_2 ) ) )
            // InternalChessDSL.g:2697:1: ( ( rule__Move__Alternatives_2 ) )
            {
            // InternalChessDSL.g:2697:1: ( ( rule__Move__Alternatives_2 ) )
            // InternalChessDSL.g:2698:2: ( rule__Move__Alternatives_2 )
            {
             before(grammarAccess.getMoveAccess().getAlternatives_2()); 
            // InternalChessDSL.g:2699:2: ( rule__Move__Alternatives_2 )
            // InternalChessDSL.g:2699:3: rule__Move__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Move__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__2__Impl"


    // $ANTLR start "rule__Move__Group_2_0__0"
    // InternalChessDSL.g:2708:1: rule__Move__Group_2_0__0 : rule__Move__Group_2_0__0__Impl rule__Move__Group_2_0__1 ;
    public final void rule__Move__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2712:1: ( rule__Move__Group_2_0__0__Impl rule__Move__Group_2_0__1 )
            // InternalChessDSL.g:2713:2: rule__Move__Group_2_0__0__Impl rule__Move__Group_2_0__1
            {
            pushFollow(FOLLOW_17);
            rule__Move__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_2_0__0"


    // $ANTLR start "rule__Move__Group_2_0__0__Impl"
    // InternalChessDSL.g:2720:1: rule__Move__Group_2_0__0__Impl : ( '(' ) ;
    public final void rule__Move__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2724:1: ( ( '(' ) )
            // InternalChessDSL.g:2725:1: ( '(' )
            {
            // InternalChessDSL.g:2725:1: ( '(' )
            // InternalChessDSL.g:2726:2: '('
            {
             before(grammarAccess.getMoveAccess().getLeftParenthesisKeyword_2_0_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getLeftParenthesisKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_2_0__0__Impl"


    // $ANTLR start "rule__Move__Group_2_0__1"
    // InternalChessDSL.g:2735:1: rule__Move__Group_2_0__1 : rule__Move__Group_2_0__1__Impl rule__Move__Group_2_0__2 ;
    public final void rule__Move__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2739:1: ( rule__Move__Group_2_0__1__Impl rule__Move__Group_2_0__2 )
            // InternalChessDSL.g:2740:2: rule__Move__Group_2_0__1__Impl rule__Move__Group_2_0__2
            {
            pushFollow(FOLLOW_27);
            rule__Move__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_2_0__1"


    // $ANTLR start "rule__Move__Group_2_0__1__Impl"
    // InternalChessDSL.g:2747:1: rule__Move__Group_2_0__1__Impl : ( ( rule__Move__FromAssignment_2_0_1 ) ) ;
    public final void rule__Move__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2751:1: ( ( ( rule__Move__FromAssignment_2_0_1 ) ) )
            // InternalChessDSL.g:2752:1: ( ( rule__Move__FromAssignment_2_0_1 ) )
            {
            // InternalChessDSL.g:2752:1: ( ( rule__Move__FromAssignment_2_0_1 ) )
            // InternalChessDSL.g:2753:2: ( rule__Move__FromAssignment_2_0_1 )
            {
             before(grammarAccess.getMoveAccess().getFromAssignment_2_0_1()); 
            // InternalChessDSL.g:2754:2: ( rule__Move__FromAssignment_2_0_1 )
            // InternalChessDSL.g:2754:3: rule__Move__FromAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Move__FromAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getFromAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_2_0__1__Impl"


    // $ANTLR start "rule__Move__Group_2_0__2"
    // InternalChessDSL.g:2762:1: rule__Move__Group_2_0__2 : rule__Move__Group_2_0__2__Impl rule__Move__Group_2_0__3 ;
    public final void rule__Move__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2766:1: ( rule__Move__Group_2_0__2__Impl rule__Move__Group_2_0__3 )
            // InternalChessDSL.g:2767:2: rule__Move__Group_2_0__2__Impl rule__Move__Group_2_0__3
            {
            pushFollow(FOLLOW_17);
            rule__Move__Group_2_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group_2_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_2_0__2"


    // $ANTLR start "rule__Move__Group_2_0__2__Impl"
    // InternalChessDSL.g:2774:1: rule__Move__Group_2_0__2__Impl : ( '->' ) ;
    public final void rule__Move__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2778:1: ( ( '->' ) )
            // InternalChessDSL.g:2779:1: ( '->' )
            {
            // InternalChessDSL.g:2779:1: ( '->' )
            // InternalChessDSL.g:2780:2: '->'
            {
             before(grammarAccess.getMoveAccess().getHyphenMinusGreaterThanSignKeyword_2_0_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getHyphenMinusGreaterThanSignKeyword_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_2_0__2__Impl"


    // $ANTLR start "rule__Move__Group_2_0__3"
    // InternalChessDSL.g:2789:1: rule__Move__Group_2_0__3 : rule__Move__Group_2_0__3__Impl rule__Move__Group_2_0__4 ;
    public final void rule__Move__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2793:1: ( rule__Move__Group_2_0__3__Impl rule__Move__Group_2_0__4 )
            // InternalChessDSL.g:2794:2: rule__Move__Group_2_0__3__Impl rule__Move__Group_2_0__4
            {
            pushFollow(FOLLOW_28);
            rule__Move__Group_2_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group_2_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_2_0__3"


    // $ANTLR start "rule__Move__Group_2_0__3__Impl"
    // InternalChessDSL.g:2801:1: rule__Move__Group_2_0__3__Impl : ( ( rule__Move__ToAssignment_2_0_3 ) ) ;
    public final void rule__Move__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2805:1: ( ( ( rule__Move__ToAssignment_2_0_3 ) ) )
            // InternalChessDSL.g:2806:1: ( ( rule__Move__ToAssignment_2_0_3 ) )
            {
            // InternalChessDSL.g:2806:1: ( ( rule__Move__ToAssignment_2_0_3 ) )
            // InternalChessDSL.g:2807:2: ( rule__Move__ToAssignment_2_0_3 )
            {
             before(grammarAccess.getMoveAccess().getToAssignment_2_0_3()); 
            // InternalChessDSL.g:2808:2: ( rule__Move__ToAssignment_2_0_3 )
            // InternalChessDSL.g:2808:3: rule__Move__ToAssignment_2_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Move__ToAssignment_2_0_3();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getToAssignment_2_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_2_0__3__Impl"


    // $ANTLR start "rule__Move__Group_2_0__4"
    // InternalChessDSL.g:2816:1: rule__Move__Group_2_0__4 : rule__Move__Group_2_0__4__Impl ;
    public final void rule__Move__Group_2_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2820:1: ( rule__Move__Group_2_0__4__Impl )
            // InternalChessDSL.g:2821:2: rule__Move__Group_2_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group_2_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_2_0__4"


    // $ANTLR start "rule__Move__Group_2_0__4__Impl"
    // InternalChessDSL.g:2827:1: rule__Move__Group_2_0__4__Impl : ( ')' ) ;
    public final void rule__Move__Group_2_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2831:1: ( ( ')' ) )
            // InternalChessDSL.g:2832:1: ( ')' )
            {
            // InternalChessDSL.g:2832:1: ( ')' )
            // InternalChessDSL.g:2833:2: ')'
            {
             before(grammarAccess.getMoveAccess().getRightParenthesisKeyword_2_0_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getRightParenthesisKeyword_2_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_2_0__4__Impl"


    // $ANTLR start "rule__Move__Group_2_1__0"
    // InternalChessDSL.g:2843:1: rule__Move__Group_2_1__0 : rule__Move__Group_2_1__0__Impl rule__Move__Group_2_1__1 ;
    public final void rule__Move__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2847:1: ( rule__Move__Group_2_1__0__Impl rule__Move__Group_2_1__1 )
            // InternalChessDSL.g:2848:2: rule__Move__Group_2_1__0__Impl rule__Move__Group_2_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Move__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_2_1__0"


    // $ANTLR start "rule__Move__Group_2_1__0__Impl"
    // InternalChessDSL.g:2855:1: rule__Move__Group_2_1__0__Impl : ( 'from' ) ;
    public final void rule__Move__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2859:1: ( ( 'from' ) )
            // InternalChessDSL.g:2860:1: ( 'from' )
            {
            // InternalChessDSL.g:2860:1: ( 'from' )
            // InternalChessDSL.g:2861:2: 'from'
            {
             before(grammarAccess.getMoveAccess().getFromKeyword_2_1_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getFromKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_2_1__0__Impl"


    // $ANTLR start "rule__Move__Group_2_1__1"
    // InternalChessDSL.g:2870:1: rule__Move__Group_2_1__1 : rule__Move__Group_2_1__1__Impl rule__Move__Group_2_1__2 ;
    public final void rule__Move__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2874:1: ( rule__Move__Group_2_1__1__Impl rule__Move__Group_2_1__2 )
            // InternalChessDSL.g:2875:2: rule__Move__Group_2_1__1__Impl rule__Move__Group_2_1__2
            {
            pushFollow(FOLLOW_29);
            rule__Move__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_2_1__1"


    // $ANTLR start "rule__Move__Group_2_1__1__Impl"
    // InternalChessDSL.g:2882:1: rule__Move__Group_2_1__1__Impl : ( ( rule__Move__FromAssignment_2_1_1 ) ) ;
    public final void rule__Move__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2886:1: ( ( ( rule__Move__FromAssignment_2_1_1 ) ) )
            // InternalChessDSL.g:2887:1: ( ( rule__Move__FromAssignment_2_1_1 ) )
            {
            // InternalChessDSL.g:2887:1: ( ( rule__Move__FromAssignment_2_1_1 ) )
            // InternalChessDSL.g:2888:2: ( rule__Move__FromAssignment_2_1_1 )
            {
             before(grammarAccess.getMoveAccess().getFromAssignment_2_1_1()); 
            // InternalChessDSL.g:2889:2: ( rule__Move__FromAssignment_2_1_1 )
            // InternalChessDSL.g:2889:3: rule__Move__FromAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Move__FromAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getFromAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_2_1__1__Impl"


    // $ANTLR start "rule__Move__Group_2_1__2"
    // InternalChessDSL.g:2897:1: rule__Move__Group_2_1__2 : rule__Move__Group_2_1__2__Impl rule__Move__Group_2_1__3 ;
    public final void rule__Move__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2901:1: ( rule__Move__Group_2_1__2__Impl rule__Move__Group_2_1__3 )
            // InternalChessDSL.g:2902:2: rule__Move__Group_2_1__2__Impl rule__Move__Group_2_1__3
            {
            pushFollow(FOLLOW_17);
            rule__Move__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group_2_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_2_1__2"


    // $ANTLR start "rule__Move__Group_2_1__2__Impl"
    // InternalChessDSL.g:2909:1: rule__Move__Group_2_1__2__Impl : ( 'to' ) ;
    public final void rule__Move__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2913:1: ( ( 'to' ) )
            // InternalChessDSL.g:2914:1: ( 'to' )
            {
            // InternalChessDSL.g:2914:1: ( 'to' )
            // InternalChessDSL.g:2915:2: 'to'
            {
             before(grammarAccess.getMoveAccess().getToKeyword_2_1_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getToKeyword_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_2_1__2__Impl"


    // $ANTLR start "rule__Move__Group_2_1__3"
    // InternalChessDSL.g:2924:1: rule__Move__Group_2_1__3 : rule__Move__Group_2_1__3__Impl ;
    public final void rule__Move__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2928:1: ( rule__Move__Group_2_1__3__Impl )
            // InternalChessDSL.g:2929:2: rule__Move__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group_2_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_2_1__3"


    // $ANTLR start "rule__Move__Group_2_1__3__Impl"
    // InternalChessDSL.g:2935:1: rule__Move__Group_2_1__3__Impl : ( ( rule__Move__ToAssignment_2_1_3 ) ) ;
    public final void rule__Move__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2939:1: ( ( ( rule__Move__ToAssignment_2_1_3 ) ) )
            // InternalChessDSL.g:2940:1: ( ( rule__Move__ToAssignment_2_1_3 ) )
            {
            // InternalChessDSL.g:2940:1: ( ( rule__Move__ToAssignment_2_1_3 ) )
            // InternalChessDSL.g:2941:2: ( rule__Move__ToAssignment_2_1_3 )
            {
             before(grammarAccess.getMoveAccess().getToAssignment_2_1_3()); 
            // InternalChessDSL.g:2942:2: ( rule__Move__ToAssignment_2_1_3 )
            // InternalChessDSL.g:2942:3: rule__Move__ToAssignment_2_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Move__ToAssignment_2_1_3();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getToAssignment_2_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_2_1__3__Impl"


    // $ANTLR start "rule__Capture__Group__0"
    // InternalChessDSL.g:2951:1: rule__Capture__Group__0 : rule__Capture__Group__0__Impl rule__Capture__Group__1 ;
    public final void rule__Capture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2955:1: ( rule__Capture__Group__0__Impl rule__Capture__Group__1 )
            // InternalChessDSL.g:2956:2: rule__Capture__Group__0__Impl rule__Capture__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Capture__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capture__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capture__Group__0"


    // $ANTLR start "rule__Capture__Group__0__Impl"
    // InternalChessDSL.g:2963:1: rule__Capture__Group__0__Impl : ( ( rule__Capture__MoveAssignment_0 ) ) ;
    public final void rule__Capture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2967:1: ( ( ( rule__Capture__MoveAssignment_0 ) ) )
            // InternalChessDSL.g:2968:1: ( ( rule__Capture__MoveAssignment_0 ) )
            {
            // InternalChessDSL.g:2968:1: ( ( rule__Capture__MoveAssignment_0 ) )
            // InternalChessDSL.g:2969:2: ( rule__Capture__MoveAssignment_0 )
            {
             before(grammarAccess.getCaptureAccess().getMoveAssignment_0()); 
            // InternalChessDSL.g:2970:2: ( rule__Capture__MoveAssignment_0 )
            // InternalChessDSL.g:2970:3: rule__Capture__MoveAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Capture__MoveAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCaptureAccess().getMoveAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capture__Group__0__Impl"


    // $ANTLR start "rule__Capture__Group__1"
    // InternalChessDSL.g:2978:1: rule__Capture__Group__1 : rule__Capture__Group__1__Impl ;
    public final void rule__Capture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2982:1: ( rule__Capture__Group__1__Impl )
            // InternalChessDSL.g:2983:2: rule__Capture__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Capture__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capture__Group__1"


    // $ANTLR start "rule__Capture__Group__1__Impl"
    // InternalChessDSL.g:2989:1: rule__Capture__Group__1__Impl : ( ( rule__Capture__Alternatives_1 ) ) ;
    public final void rule__Capture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2993:1: ( ( ( rule__Capture__Alternatives_1 ) ) )
            // InternalChessDSL.g:2994:1: ( ( rule__Capture__Alternatives_1 ) )
            {
            // InternalChessDSL.g:2994:1: ( ( rule__Capture__Alternatives_1 ) )
            // InternalChessDSL.g:2995:2: ( rule__Capture__Alternatives_1 )
            {
             before(grammarAccess.getCaptureAccess().getAlternatives_1()); 
            // InternalChessDSL.g:2996:2: ( rule__Capture__Alternatives_1 )
            // InternalChessDSL.g:2996:3: rule__Capture__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Capture__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getCaptureAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capture__Group__1__Impl"


    // $ANTLR start "rule__Capture__Group_1_0__0"
    // InternalChessDSL.g:3005:1: rule__Capture__Group_1_0__0 : rule__Capture__Group_1_0__0__Impl rule__Capture__Group_1_0__1 ;
    public final void rule__Capture__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3009:1: ( rule__Capture__Group_1_0__0__Impl rule__Capture__Group_1_0__1 )
            // InternalChessDSL.g:3010:2: rule__Capture__Group_1_0__0__Impl rule__Capture__Group_1_0__1
            {
            pushFollow(FOLLOW_18);
            rule__Capture__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capture__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capture__Group_1_0__0"


    // $ANTLR start "rule__Capture__Group_1_0__0__Impl"
    // InternalChessDSL.g:3017:1: rule__Capture__Group_1_0__0__Impl : ( 'Capture(' ) ;
    public final void rule__Capture__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3021:1: ( ( 'Capture(' ) )
            // InternalChessDSL.g:3022:1: ( 'Capture(' )
            {
            // InternalChessDSL.g:3022:1: ( 'Capture(' )
            // InternalChessDSL.g:3023:2: 'Capture('
            {
             before(grammarAccess.getCaptureAccess().getCaptureKeyword_1_0_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getCaptureAccess().getCaptureKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capture__Group_1_0__0__Impl"


    // $ANTLR start "rule__Capture__Group_1_0__1"
    // InternalChessDSL.g:3032:1: rule__Capture__Group_1_0__1 : rule__Capture__Group_1_0__1__Impl rule__Capture__Group_1_0__2 ;
    public final void rule__Capture__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3036:1: ( rule__Capture__Group_1_0__1__Impl rule__Capture__Group_1_0__2 )
            // InternalChessDSL.g:3037:2: rule__Capture__Group_1_0__1__Impl rule__Capture__Group_1_0__2
            {
            pushFollow(FOLLOW_28);
            rule__Capture__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capture__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capture__Group_1_0__1"


    // $ANTLR start "rule__Capture__Group_1_0__1__Impl"
    // InternalChessDSL.g:3044:1: rule__Capture__Group_1_0__1__Impl : ( ( rule__Capture__CaptureAssignment_1_0_1 ) ) ;
    public final void rule__Capture__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3048:1: ( ( ( rule__Capture__CaptureAssignment_1_0_1 ) ) )
            // InternalChessDSL.g:3049:1: ( ( rule__Capture__CaptureAssignment_1_0_1 ) )
            {
            // InternalChessDSL.g:3049:1: ( ( rule__Capture__CaptureAssignment_1_0_1 ) )
            // InternalChessDSL.g:3050:2: ( rule__Capture__CaptureAssignment_1_0_1 )
            {
             before(grammarAccess.getCaptureAccess().getCaptureAssignment_1_0_1()); 
            // InternalChessDSL.g:3051:2: ( rule__Capture__CaptureAssignment_1_0_1 )
            // InternalChessDSL.g:3051:3: rule__Capture__CaptureAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Capture__CaptureAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCaptureAccess().getCaptureAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capture__Group_1_0__1__Impl"


    // $ANTLR start "rule__Capture__Group_1_0__2"
    // InternalChessDSL.g:3059:1: rule__Capture__Group_1_0__2 : rule__Capture__Group_1_0__2__Impl ;
    public final void rule__Capture__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3063:1: ( rule__Capture__Group_1_0__2__Impl )
            // InternalChessDSL.g:3064:2: rule__Capture__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Capture__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capture__Group_1_0__2"


    // $ANTLR start "rule__Capture__Group_1_0__2__Impl"
    // InternalChessDSL.g:3070:1: rule__Capture__Group_1_0__2__Impl : ( ')' ) ;
    public final void rule__Capture__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3074:1: ( ( ')' ) )
            // InternalChessDSL.g:3075:1: ( ')' )
            {
            // InternalChessDSL.g:3075:1: ( ')' )
            // InternalChessDSL.g:3076:2: ')'
            {
             before(grammarAccess.getCaptureAccess().getRightParenthesisKeyword_1_0_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getCaptureAccess().getRightParenthesisKeyword_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capture__Group_1_0__2__Impl"


    // $ANTLR start "rule__Capture__Group_1_1__0"
    // InternalChessDSL.g:3086:1: rule__Capture__Group_1_1__0 : rule__Capture__Group_1_1__0__Impl rule__Capture__Group_1_1__1 ;
    public final void rule__Capture__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3090:1: ( rule__Capture__Group_1_1__0__Impl rule__Capture__Group_1_1__1 )
            // InternalChessDSL.g:3091:2: rule__Capture__Group_1_1__0__Impl rule__Capture__Group_1_1__1
            {
            pushFollow(FOLLOW_30);
            rule__Capture__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capture__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capture__Group_1_1__0"


    // $ANTLR start "rule__Capture__Group_1_1__0__Impl"
    // InternalChessDSL.g:3098:1: rule__Capture__Group_1_1__0__Impl : ( ( 'and' )? ) ;
    public final void rule__Capture__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3102:1: ( ( ( 'and' )? ) )
            // InternalChessDSL.g:3103:1: ( ( 'and' )? )
            {
            // InternalChessDSL.g:3103:1: ( ( 'and' )? )
            // InternalChessDSL.g:3104:2: ( 'and' )?
            {
             before(grammarAccess.getCaptureAccess().getAndKeyword_1_1_0()); 
            // InternalChessDSL.g:3105:2: ( 'and' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==53) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalChessDSL.g:3105:3: 'and'
                    {
                    match(input,53,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCaptureAccess().getAndKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capture__Group_1_1__0__Impl"


    // $ANTLR start "rule__Capture__Group_1_1__1"
    // InternalChessDSL.g:3113:1: rule__Capture__Group_1_1__1 : rule__Capture__Group_1_1__1__Impl rule__Capture__Group_1_1__2 ;
    public final void rule__Capture__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3117:1: ( rule__Capture__Group_1_1__1__Impl rule__Capture__Group_1_1__2 )
            // InternalChessDSL.g:3118:2: rule__Capture__Group_1_1__1__Impl rule__Capture__Group_1_1__2
            {
            pushFollow(FOLLOW_18);
            rule__Capture__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capture__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capture__Group_1_1__1"


    // $ANTLR start "rule__Capture__Group_1_1__1__Impl"
    // InternalChessDSL.g:3125:1: rule__Capture__Group_1_1__1__Impl : ( 'captures' ) ;
    public final void rule__Capture__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3129:1: ( ( 'captures' ) )
            // InternalChessDSL.g:3130:1: ( 'captures' )
            {
            // InternalChessDSL.g:3130:1: ( 'captures' )
            // InternalChessDSL.g:3131:2: 'captures'
            {
             before(grammarAccess.getCaptureAccess().getCapturesKeyword_1_1_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getCaptureAccess().getCapturesKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capture__Group_1_1__1__Impl"


    // $ANTLR start "rule__Capture__Group_1_1__2"
    // InternalChessDSL.g:3140:1: rule__Capture__Group_1_1__2 : rule__Capture__Group_1_1__2__Impl ;
    public final void rule__Capture__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3144:1: ( rule__Capture__Group_1_1__2__Impl )
            // InternalChessDSL.g:3145:2: rule__Capture__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Capture__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capture__Group_1_1__2"


    // $ANTLR start "rule__Capture__Group_1_1__2__Impl"
    // InternalChessDSL.g:3151:1: rule__Capture__Group_1_1__2__Impl : ( ( rule__Capture__CaptureAssignment_1_1_2 ) ) ;
    public final void rule__Capture__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3155:1: ( ( ( rule__Capture__CaptureAssignment_1_1_2 ) ) )
            // InternalChessDSL.g:3156:1: ( ( rule__Capture__CaptureAssignment_1_1_2 ) )
            {
            // InternalChessDSL.g:3156:1: ( ( rule__Capture__CaptureAssignment_1_1_2 ) )
            // InternalChessDSL.g:3157:2: ( rule__Capture__CaptureAssignment_1_1_2 )
            {
             before(grammarAccess.getCaptureAccess().getCaptureAssignment_1_1_2()); 
            // InternalChessDSL.g:3158:2: ( rule__Capture__CaptureAssignment_1_1_2 )
            // InternalChessDSL.g:3158:3: rule__Capture__CaptureAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Capture__CaptureAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCaptureAccess().getCaptureAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capture__Group_1_1__2__Impl"


    // $ANTLR start "rule__Castle__Group_0__0"
    // InternalChessDSL.g:3167:1: rule__Castle__Group_0__0 : rule__Castle__Group_0__0__Impl rule__Castle__Group_0__1 ;
    public final void rule__Castle__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3171:1: ( rule__Castle__Group_0__0__Impl rule__Castle__Group_0__1 )
            // InternalChessDSL.g:3172:2: rule__Castle__Group_0__0__Impl rule__Castle__Group_0__1
            {
            pushFollow(FOLLOW_31);
            rule__Castle__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Castle__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Group_0__0"


    // $ANTLR start "rule__Castle__Group_0__0__Impl"
    // InternalChessDSL.g:3179:1: rule__Castle__Group_0__0__Impl : ( 'Castle(' ) ;
    public final void rule__Castle__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3183:1: ( ( 'Castle(' ) )
            // InternalChessDSL.g:3184:1: ( 'Castle(' )
            {
            // InternalChessDSL.g:3184:1: ( 'Castle(' )
            // InternalChessDSL.g:3185:2: 'Castle('
            {
             before(grammarAccess.getCastleAccess().getCastleKeyword_0_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getCastleAccess().getCastleKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Group_0__0__Impl"


    // $ANTLR start "rule__Castle__Group_0__1"
    // InternalChessDSL.g:3194:1: rule__Castle__Group_0__1 : rule__Castle__Group_0__1__Impl rule__Castle__Group_0__2 ;
    public final void rule__Castle__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3198:1: ( rule__Castle__Group_0__1__Impl rule__Castle__Group_0__2 )
            // InternalChessDSL.g:3199:2: rule__Castle__Group_0__1__Impl rule__Castle__Group_0__2
            {
            pushFollow(FOLLOW_28);
            rule__Castle__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Castle__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Group_0__1"


    // $ANTLR start "rule__Castle__Group_0__1__Impl"
    // InternalChessDSL.g:3206:1: rule__Castle__Group_0__1__Impl : ( ( rule__Castle__SideAssignment_0_1 ) ) ;
    public final void rule__Castle__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3210:1: ( ( ( rule__Castle__SideAssignment_0_1 ) ) )
            // InternalChessDSL.g:3211:1: ( ( rule__Castle__SideAssignment_0_1 ) )
            {
            // InternalChessDSL.g:3211:1: ( ( rule__Castle__SideAssignment_0_1 ) )
            // InternalChessDSL.g:3212:2: ( rule__Castle__SideAssignment_0_1 )
            {
             before(grammarAccess.getCastleAccess().getSideAssignment_0_1()); 
            // InternalChessDSL.g:3213:2: ( rule__Castle__SideAssignment_0_1 )
            // InternalChessDSL.g:3213:3: rule__Castle__SideAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Castle__SideAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCastleAccess().getSideAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Group_0__1__Impl"


    // $ANTLR start "rule__Castle__Group_0__2"
    // InternalChessDSL.g:3221:1: rule__Castle__Group_0__2 : rule__Castle__Group_0__2__Impl ;
    public final void rule__Castle__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3225:1: ( rule__Castle__Group_0__2__Impl )
            // InternalChessDSL.g:3226:2: rule__Castle__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Castle__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Group_0__2"


    // $ANTLR start "rule__Castle__Group_0__2__Impl"
    // InternalChessDSL.g:3232:1: rule__Castle__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Castle__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3236:1: ( ( ')' ) )
            // InternalChessDSL.g:3237:1: ( ')' )
            {
            // InternalChessDSL.g:3237:1: ( ')' )
            // InternalChessDSL.g:3238:2: ')'
            {
             before(grammarAccess.getCastleAccess().getRightParenthesisKeyword_0_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getCastleAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Group_0__2__Impl"


    // $ANTLR start "rule__Castle__Group_1__0"
    // InternalChessDSL.g:3248:1: rule__Castle__Group_1__0 : rule__Castle__Group_1__0__Impl rule__Castle__Group_1__1 ;
    public final void rule__Castle__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3252:1: ( rule__Castle__Group_1__0__Impl rule__Castle__Group_1__1 )
            // InternalChessDSL.g:3253:2: rule__Castle__Group_1__0__Impl rule__Castle__Group_1__1
            {
            pushFollow(FOLLOW_32);
            rule__Castle__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Castle__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Group_1__0"


    // $ANTLR start "rule__Castle__Group_1__0__Impl"
    // InternalChessDSL.g:3260:1: rule__Castle__Group_1__0__Impl : ( 'castles' ) ;
    public final void rule__Castle__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3264:1: ( ( 'castles' ) )
            // InternalChessDSL.g:3265:1: ( 'castles' )
            {
            // InternalChessDSL.g:3265:1: ( 'castles' )
            // InternalChessDSL.g:3266:2: 'castles'
            {
             before(grammarAccess.getCastleAccess().getCastlesKeyword_1_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getCastleAccess().getCastlesKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Group_1__0__Impl"


    // $ANTLR start "rule__Castle__Group_1__1"
    // InternalChessDSL.g:3275:1: rule__Castle__Group_1__1 : rule__Castle__Group_1__1__Impl rule__Castle__Group_1__2 ;
    public final void rule__Castle__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3279:1: ( rule__Castle__Group_1__1__Impl rule__Castle__Group_1__2 )
            // InternalChessDSL.g:3280:2: rule__Castle__Group_1__1__Impl rule__Castle__Group_1__2
            {
            pushFollow(FOLLOW_32);
            rule__Castle__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Castle__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Group_1__1"


    // $ANTLR start "rule__Castle__Group_1__1__Impl"
    // InternalChessDSL.g:3287:1: rule__Castle__Group_1__1__Impl : ( ( rule__Castle__Group_1_1__0 )? ) ;
    public final void rule__Castle__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3291:1: ( ( ( rule__Castle__Group_1_1__0 )? ) )
            // InternalChessDSL.g:3292:1: ( ( rule__Castle__Group_1_1__0 )? )
            {
            // InternalChessDSL.g:3292:1: ( ( rule__Castle__Group_1_1__0 )? )
            // InternalChessDSL.g:3293:2: ( rule__Castle__Group_1_1__0 )?
            {
             before(grammarAccess.getCastleAccess().getGroup_1_1()); 
            // InternalChessDSL.g:3294:2: ( rule__Castle__Group_1_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==14) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalChessDSL.g:3294:3: rule__Castle__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Castle__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCastleAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Group_1__1__Impl"


    // $ANTLR start "rule__Castle__Group_1__2"
    // InternalChessDSL.g:3302:1: rule__Castle__Group_1__2 : rule__Castle__Group_1__2__Impl ;
    public final void rule__Castle__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3306:1: ( rule__Castle__Group_1__2__Impl )
            // InternalChessDSL.g:3307:2: rule__Castle__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Castle__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Group_1__2"


    // $ANTLR start "rule__Castle__Group_1__2__Impl"
    // InternalChessDSL.g:3313:1: rule__Castle__Group_1__2__Impl : ( ( rule__Castle__SideAssignment_1_2 ) ) ;
    public final void rule__Castle__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3317:1: ( ( ( rule__Castle__SideAssignment_1_2 ) ) )
            // InternalChessDSL.g:3318:1: ( ( rule__Castle__SideAssignment_1_2 ) )
            {
            // InternalChessDSL.g:3318:1: ( ( rule__Castle__SideAssignment_1_2 ) )
            // InternalChessDSL.g:3319:2: ( rule__Castle__SideAssignment_1_2 )
            {
             before(grammarAccess.getCastleAccess().getSideAssignment_1_2()); 
            // InternalChessDSL.g:3320:2: ( rule__Castle__SideAssignment_1_2 )
            // InternalChessDSL.g:3320:3: rule__Castle__SideAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Castle__SideAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCastleAccess().getSideAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Group_1__2__Impl"


    // $ANTLR start "rule__Castle__Group_1_1__0"
    // InternalChessDSL.g:3329:1: rule__Castle__Group_1_1__0 : rule__Castle__Group_1_1__0__Impl rule__Castle__Group_1_1__1 ;
    public final void rule__Castle__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3333:1: ( rule__Castle__Group_1_1__0__Impl rule__Castle__Group_1_1__1 )
            // InternalChessDSL.g:3334:2: rule__Castle__Group_1_1__0__Impl rule__Castle__Group_1_1__1
            {
            pushFollow(FOLLOW_33);
            rule__Castle__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Castle__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Group_1_1__0"


    // $ANTLR start "rule__Castle__Group_1_1__0__Impl"
    // InternalChessDSL.g:3341:1: rule__Castle__Group_1_1__0__Impl : ( 'on' ) ;
    public final void rule__Castle__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3345:1: ( ( 'on' ) )
            // InternalChessDSL.g:3346:1: ( 'on' )
            {
            // InternalChessDSL.g:3346:1: ( 'on' )
            // InternalChessDSL.g:3347:2: 'on'
            {
             before(grammarAccess.getCastleAccess().getOnKeyword_1_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCastleAccess().getOnKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Group_1_1__0__Impl"


    // $ANTLR start "rule__Castle__Group_1_1__1"
    // InternalChessDSL.g:3356:1: rule__Castle__Group_1_1__1 : rule__Castle__Group_1_1__1__Impl ;
    public final void rule__Castle__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3360:1: ( rule__Castle__Group_1_1__1__Impl )
            // InternalChessDSL.g:3361:2: rule__Castle__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Castle__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Group_1_1__1"


    // $ANTLR start "rule__Castle__Group_1_1__1__Impl"
    // InternalChessDSL.g:3367:1: rule__Castle__Group_1_1__1__Impl : ( 'the' ) ;
    public final void rule__Castle__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3371:1: ( ( 'the' ) )
            // InternalChessDSL.g:3372:1: ( 'the' )
            {
            // InternalChessDSL.g:3372:1: ( 'the' )
            // InternalChessDSL.g:3373:2: 'the'
            {
             before(grammarAccess.getCastleAccess().getTheKeyword_1_1_1()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getCastleAccess().getTheKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Group_1_1__1__Impl"


    // $ANTLR start "rule__Castle__Group_2__0"
    // InternalChessDSL.g:3383:1: rule__Castle__Group_2__0 : rule__Castle__Group_2__0__Impl rule__Castle__Group_2__1 ;
    public final void rule__Castle__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3387:1: ( rule__Castle__Group_2__0__Impl rule__Castle__Group_2__1 )
            // InternalChessDSL.g:3388:2: rule__Castle__Group_2__0__Impl rule__Castle__Group_2__1
            {
            pushFollow(FOLLOW_34);
            rule__Castle__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Castle__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Group_2__0"


    // $ANTLR start "rule__Castle__Group_2__0__Impl"
    // InternalChessDSL.g:3395:1: rule__Castle__Group_2__0__Impl : ( ( rule__Castle__MoveAssignment_2_0 ) ) ;
    public final void rule__Castle__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3399:1: ( ( ( rule__Castle__MoveAssignment_2_0 ) ) )
            // InternalChessDSL.g:3400:1: ( ( rule__Castle__MoveAssignment_2_0 ) )
            {
            // InternalChessDSL.g:3400:1: ( ( rule__Castle__MoveAssignment_2_0 ) )
            // InternalChessDSL.g:3401:2: ( rule__Castle__MoveAssignment_2_0 )
            {
             before(grammarAccess.getCastleAccess().getMoveAssignment_2_0()); 
            // InternalChessDSL.g:3402:2: ( rule__Castle__MoveAssignment_2_0 )
            // InternalChessDSL.g:3402:3: rule__Castle__MoveAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Castle__MoveAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCastleAccess().getMoveAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Group_2__0__Impl"


    // $ANTLR start "rule__Castle__Group_2__1"
    // InternalChessDSL.g:3410:1: rule__Castle__Group_2__1 : rule__Castle__Group_2__1__Impl rule__Castle__Group_2__2 ;
    public final void rule__Castle__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3414:1: ( rule__Castle__Group_2__1__Impl rule__Castle__Group_2__2 )
            // InternalChessDSL.g:3415:2: rule__Castle__Group_2__1__Impl rule__Castle__Group_2__2
            {
            pushFollow(FOLLOW_31);
            rule__Castle__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Castle__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Group_2__1"


    // $ANTLR start "rule__Castle__Group_2__1__Impl"
    // InternalChessDSL.g:3422:1: rule__Castle__Group_2__1__Impl : ( 'Castle(' ) ;
    public final void rule__Castle__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3426:1: ( ( 'Castle(' ) )
            // InternalChessDSL.g:3427:1: ( 'Castle(' )
            {
            // InternalChessDSL.g:3427:1: ( 'Castle(' )
            // InternalChessDSL.g:3428:2: 'Castle('
            {
             before(grammarAccess.getCastleAccess().getCastleKeyword_2_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getCastleAccess().getCastleKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Group_2__1__Impl"


    // $ANTLR start "rule__Castle__Group_2__2"
    // InternalChessDSL.g:3437:1: rule__Castle__Group_2__2 : rule__Castle__Group_2__2__Impl rule__Castle__Group_2__3 ;
    public final void rule__Castle__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3441:1: ( rule__Castle__Group_2__2__Impl rule__Castle__Group_2__3 )
            // InternalChessDSL.g:3442:2: rule__Castle__Group_2__2__Impl rule__Castle__Group_2__3
            {
            pushFollow(FOLLOW_28);
            rule__Castle__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Castle__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Group_2__2"


    // $ANTLR start "rule__Castle__Group_2__2__Impl"
    // InternalChessDSL.g:3449:1: rule__Castle__Group_2__2__Impl : ( ( rule__Castle__SideAssignment_2_2 ) ) ;
    public final void rule__Castle__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3453:1: ( ( ( rule__Castle__SideAssignment_2_2 ) ) )
            // InternalChessDSL.g:3454:1: ( ( rule__Castle__SideAssignment_2_2 ) )
            {
            // InternalChessDSL.g:3454:1: ( ( rule__Castle__SideAssignment_2_2 ) )
            // InternalChessDSL.g:3455:2: ( rule__Castle__SideAssignment_2_2 )
            {
             before(grammarAccess.getCastleAccess().getSideAssignment_2_2()); 
            // InternalChessDSL.g:3456:2: ( rule__Castle__SideAssignment_2_2 )
            // InternalChessDSL.g:3456:3: rule__Castle__SideAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Castle__SideAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getCastleAccess().getSideAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Group_2__2__Impl"


    // $ANTLR start "rule__Castle__Group_2__3"
    // InternalChessDSL.g:3464:1: rule__Castle__Group_2__3 : rule__Castle__Group_2__3__Impl ;
    public final void rule__Castle__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3468:1: ( rule__Castle__Group_2__3__Impl )
            // InternalChessDSL.g:3469:2: rule__Castle__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Castle__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Group_2__3"


    // $ANTLR start "rule__Castle__Group_2__3__Impl"
    // InternalChessDSL.g:3475:1: rule__Castle__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Castle__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3479:1: ( ( ')' ) )
            // InternalChessDSL.g:3480:1: ( ')' )
            {
            // InternalChessDSL.g:3480:1: ( ')' )
            // InternalChessDSL.g:3481:2: ')'
            {
             before(grammarAccess.getCastleAccess().getRightParenthesisKeyword_2_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getCastleAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Group_2__3__Impl"


    // $ANTLR start "rule__Castle__Group_3__0"
    // InternalChessDSL.g:3491:1: rule__Castle__Group_3__0 : rule__Castle__Group_3__0__Impl rule__Castle__Group_3__1 ;
    public final void rule__Castle__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3495:1: ( rule__Castle__Group_3__0__Impl rule__Castle__Group_3__1 )
            // InternalChessDSL.g:3496:2: rule__Castle__Group_3__0__Impl rule__Castle__Group_3__1
            {
            pushFollow(FOLLOW_35);
            rule__Castle__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Castle__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Group_3__0"


    // $ANTLR start "rule__Castle__Group_3__0__Impl"
    // InternalChessDSL.g:3503:1: rule__Castle__Group_3__0__Impl : ( ( rule__Castle__MoveAssignment_3_0 ) ) ;
    public final void rule__Castle__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3507:1: ( ( ( rule__Castle__MoveAssignment_3_0 ) ) )
            // InternalChessDSL.g:3508:1: ( ( rule__Castle__MoveAssignment_3_0 ) )
            {
            // InternalChessDSL.g:3508:1: ( ( rule__Castle__MoveAssignment_3_0 ) )
            // InternalChessDSL.g:3509:2: ( rule__Castle__MoveAssignment_3_0 )
            {
             before(grammarAccess.getCastleAccess().getMoveAssignment_3_0()); 
            // InternalChessDSL.g:3510:2: ( rule__Castle__MoveAssignment_3_0 )
            // InternalChessDSL.g:3510:3: rule__Castle__MoveAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Castle__MoveAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getCastleAccess().getMoveAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Group_3__0__Impl"


    // $ANTLR start "rule__Castle__Group_3__1"
    // InternalChessDSL.g:3518:1: rule__Castle__Group_3__1 : rule__Castle__Group_3__1__Impl rule__Castle__Group_3__2 ;
    public final void rule__Castle__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3522:1: ( rule__Castle__Group_3__1__Impl rule__Castle__Group_3__2 )
            // InternalChessDSL.g:3523:2: rule__Castle__Group_3__1__Impl rule__Castle__Group_3__2
            {
            pushFollow(FOLLOW_36);
            rule__Castle__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Castle__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Group_3__1"


    // $ANTLR start "rule__Castle__Group_3__1__Impl"
    // InternalChessDSL.g:3530:1: rule__Castle__Group_3__1__Impl : ( 'and' ) ;
    public final void rule__Castle__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3534:1: ( ( 'and' ) )
            // InternalChessDSL.g:3535:1: ( 'and' )
            {
            // InternalChessDSL.g:3535:1: ( 'and' )
            // InternalChessDSL.g:3536:2: 'and'
            {
             before(grammarAccess.getCastleAccess().getAndKeyword_3_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getCastleAccess().getAndKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Group_3__1__Impl"


    // $ANTLR start "rule__Castle__Group_3__2"
    // InternalChessDSL.g:3545:1: rule__Castle__Group_3__2 : rule__Castle__Group_3__2__Impl rule__Castle__Group_3__3 ;
    public final void rule__Castle__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3549:1: ( rule__Castle__Group_3__2__Impl rule__Castle__Group_3__3 )
            // InternalChessDSL.g:3550:2: rule__Castle__Group_3__2__Impl rule__Castle__Group_3__3
            {
            pushFollow(FOLLOW_31);
            rule__Castle__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Castle__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Group_3__2"


    // $ANTLR start "rule__Castle__Group_3__2__Impl"
    // InternalChessDSL.g:3557:1: rule__Castle__Group_3__2__Impl : ( 'castles' ) ;
    public final void rule__Castle__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3561:1: ( ( 'castles' ) )
            // InternalChessDSL.g:3562:1: ( 'castles' )
            {
            // InternalChessDSL.g:3562:1: ( 'castles' )
            // InternalChessDSL.g:3563:2: 'castles'
            {
             before(grammarAccess.getCastleAccess().getCastlesKeyword_3_2()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getCastleAccess().getCastlesKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Group_3__2__Impl"


    // $ANTLR start "rule__Castle__Group_3__3"
    // InternalChessDSL.g:3572:1: rule__Castle__Group_3__3 : rule__Castle__Group_3__3__Impl ;
    public final void rule__Castle__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3576:1: ( rule__Castle__Group_3__3__Impl )
            // InternalChessDSL.g:3577:2: rule__Castle__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Castle__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Group_3__3"


    // $ANTLR start "rule__Castle__Group_3__3__Impl"
    // InternalChessDSL.g:3583:1: rule__Castle__Group_3__3__Impl : ( ( rule__Castle__SideAssignment_3_3 ) ) ;
    public final void rule__Castle__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3587:1: ( ( ( rule__Castle__SideAssignment_3_3 ) ) )
            // InternalChessDSL.g:3588:1: ( ( rule__Castle__SideAssignment_3_3 ) )
            {
            // InternalChessDSL.g:3588:1: ( ( rule__Castle__SideAssignment_3_3 ) )
            // InternalChessDSL.g:3589:2: ( rule__Castle__SideAssignment_3_3 )
            {
             before(grammarAccess.getCastleAccess().getSideAssignment_3_3()); 
            // InternalChessDSL.g:3590:2: ( rule__Castle__SideAssignment_3_3 )
            // InternalChessDSL.g:3590:3: rule__Castle__SideAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__Castle__SideAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getCastleAccess().getSideAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__Group_3__3__Impl"


    // $ANTLR start "rule__EnPassant__Group__0"
    // InternalChessDSL.g:3599:1: rule__EnPassant__Group__0 : rule__EnPassant__Group__0__Impl rule__EnPassant__Group__1 ;
    public final void rule__EnPassant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3603:1: ( rule__EnPassant__Group__0__Impl rule__EnPassant__Group__1 )
            // InternalChessDSL.g:3604:2: rule__EnPassant__Group__0__Impl rule__EnPassant__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__EnPassant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnPassant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnPassant__Group__0"


    // $ANTLR start "rule__EnPassant__Group__0__Impl"
    // InternalChessDSL.g:3611:1: rule__EnPassant__Group__0__Impl : ( ( rule__EnPassant__CaptureAssignment_0 ) ) ;
    public final void rule__EnPassant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3615:1: ( ( ( rule__EnPassant__CaptureAssignment_0 ) ) )
            // InternalChessDSL.g:3616:1: ( ( rule__EnPassant__CaptureAssignment_0 ) )
            {
            // InternalChessDSL.g:3616:1: ( ( rule__EnPassant__CaptureAssignment_0 ) )
            // InternalChessDSL.g:3617:2: ( rule__EnPassant__CaptureAssignment_0 )
            {
             before(grammarAccess.getEnPassantAccess().getCaptureAssignment_0()); 
            // InternalChessDSL.g:3618:2: ( rule__EnPassant__CaptureAssignment_0 )
            // InternalChessDSL.g:3618:3: rule__EnPassant__CaptureAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EnPassant__CaptureAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEnPassantAccess().getCaptureAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnPassant__Group__0__Impl"


    // $ANTLR start "rule__EnPassant__Group__1"
    // InternalChessDSL.g:3626:1: rule__EnPassant__Group__1 : rule__EnPassant__Group__1__Impl rule__EnPassant__Group__2 ;
    public final void rule__EnPassant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3630:1: ( rule__EnPassant__Group__1__Impl rule__EnPassant__Group__2 )
            // InternalChessDSL.g:3631:2: rule__EnPassant__Group__1__Impl rule__EnPassant__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__EnPassant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnPassant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnPassant__Group__1"


    // $ANTLR start "rule__EnPassant__Group__1__Impl"
    // InternalChessDSL.g:3638:1: rule__EnPassant__Group__1__Impl : ( 'on' ) ;
    public final void rule__EnPassant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3642:1: ( ( 'on' ) )
            // InternalChessDSL.g:3643:1: ( 'on' )
            {
            // InternalChessDSL.g:3643:1: ( 'on' )
            // InternalChessDSL.g:3644:2: 'on'
            {
             before(grammarAccess.getEnPassantAccess().getOnKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEnPassantAccess().getOnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnPassant__Group__1__Impl"


    // $ANTLR start "rule__EnPassant__Group__2"
    // InternalChessDSL.g:3653:1: rule__EnPassant__Group__2 : rule__EnPassant__Group__2__Impl ;
    public final void rule__EnPassant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3657:1: ( rule__EnPassant__Group__2__Impl )
            // InternalChessDSL.g:3658:2: rule__EnPassant__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnPassant__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnPassant__Group__2"


    // $ANTLR start "rule__EnPassant__Group__2__Impl"
    // InternalChessDSL.g:3664:1: rule__EnPassant__Group__2__Impl : ( ( rule__EnPassant__SquareAssignment_2 ) ) ;
    public final void rule__EnPassant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3668:1: ( ( ( rule__EnPassant__SquareAssignment_2 ) ) )
            // InternalChessDSL.g:3669:1: ( ( rule__EnPassant__SquareAssignment_2 ) )
            {
            // InternalChessDSL.g:3669:1: ( ( rule__EnPassant__SquareAssignment_2 ) )
            // InternalChessDSL.g:3670:2: ( rule__EnPassant__SquareAssignment_2 )
            {
             before(grammarAccess.getEnPassantAccess().getSquareAssignment_2()); 
            // InternalChessDSL.g:3671:2: ( rule__EnPassant__SquareAssignment_2 )
            // InternalChessDSL.g:3671:3: rule__EnPassant__SquareAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EnPassant__SquareAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnPassantAccess().getSquareAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnPassant__Group__2__Impl"


    // $ANTLR start "rule__Promotion__Group__0"
    // InternalChessDSL.g:3680:1: rule__Promotion__Group__0 : rule__Promotion__Group__0__Impl rule__Promotion__Group__1 ;
    public final void rule__Promotion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3684:1: ( rule__Promotion__Group__0__Impl rule__Promotion__Group__1 )
            // InternalChessDSL.g:3685:2: rule__Promotion__Group__0__Impl rule__Promotion__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Promotion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Promotion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Promotion__Group__0"


    // $ANTLR start "rule__Promotion__Group__0__Impl"
    // InternalChessDSL.g:3692:1: rule__Promotion__Group__0__Impl : ( ( rule__Promotion__MoveAssignment_0 ) ) ;
    public final void rule__Promotion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3696:1: ( ( ( rule__Promotion__MoveAssignment_0 ) ) )
            // InternalChessDSL.g:3697:1: ( ( rule__Promotion__MoveAssignment_0 ) )
            {
            // InternalChessDSL.g:3697:1: ( ( rule__Promotion__MoveAssignment_0 ) )
            // InternalChessDSL.g:3698:2: ( rule__Promotion__MoveAssignment_0 )
            {
             before(grammarAccess.getPromotionAccess().getMoveAssignment_0()); 
            // InternalChessDSL.g:3699:2: ( rule__Promotion__MoveAssignment_0 )
            // InternalChessDSL.g:3699:3: rule__Promotion__MoveAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Promotion__MoveAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPromotionAccess().getMoveAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Promotion__Group__0__Impl"


    // $ANTLR start "rule__Promotion__Group__1"
    // InternalChessDSL.g:3707:1: rule__Promotion__Group__1 : rule__Promotion__Group__1__Impl rule__Promotion__Group__2 ;
    public final void rule__Promotion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3711:1: ( rule__Promotion__Group__1__Impl rule__Promotion__Group__2 )
            // InternalChessDSL.g:3712:2: rule__Promotion__Group__1__Impl rule__Promotion__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Promotion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Promotion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Promotion__Group__1"


    // $ANTLR start "rule__Promotion__Group__1__Impl"
    // InternalChessDSL.g:3719:1: rule__Promotion__Group__1__Impl : ( 'Promotion(' ) ;
    public final void rule__Promotion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3723:1: ( ( 'Promotion(' ) )
            // InternalChessDSL.g:3724:1: ( 'Promotion(' )
            {
            // InternalChessDSL.g:3724:1: ( 'Promotion(' )
            // InternalChessDSL.g:3725:2: 'Promotion('
            {
             before(grammarAccess.getPromotionAccess().getPromotionKeyword_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getPromotionAccess().getPromotionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Promotion__Group__1__Impl"


    // $ANTLR start "rule__Promotion__Group__2"
    // InternalChessDSL.g:3734:1: rule__Promotion__Group__2 : rule__Promotion__Group__2__Impl rule__Promotion__Group__3 ;
    public final void rule__Promotion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3738:1: ( rule__Promotion__Group__2__Impl rule__Promotion__Group__3 )
            // InternalChessDSL.g:3739:2: rule__Promotion__Group__2__Impl rule__Promotion__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Promotion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Promotion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Promotion__Group__2"


    // $ANTLR start "rule__Promotion__Group__2__Impl"
    // InternalChessDSL.g:3746:1: rule__Promotion__Group__2__Impl : ( ( rule__Promotion__PieceAssignment_2 ) ) ;
    public final void rule__Promotion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3750:1: ( ( ( rule__Promotion__PieceAssignment_2 ) ) )
            // InternalChessDSL.g:3751:1: ( ( rule__Promotion__PieceAssignment_2 ) )
            {
            // InternalChessDSL.g:3751:1: ( ( rule__Promotion__PieceAssignment_2 ) )
            // InternalChessDSL.g:3752:2: ( rule__Promotion__PieceAssignment_2 )
            {
             before(grammarAccess.getPromotionAccess().getPieceAssignment_2()); 
            // InternalChessDSL.g:3753:2: ( rule__Promotion__PieceAssignment_2 )
            // InternalChessDSL.g:3753:3: rule__Promotion__PieceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Promotion__PieceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPromotionAccess().getPieceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Promotion__Group__2__Impl"


    // $ANTLR start "rule__Promotion__Group__3"
    // InternalChessDSL.g:3761:1: rule__Promotion__Group__3 : rule__Promotion__Group__3__Impl ;
    public final void rule__Promotion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3765:1: ( rule__Promotion__Group__3__Impl )
            // InternalChessDSL.g:3766:2: rule__Promotion__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Promotion__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Promotion__Group__3"


    // $ANTLR start "rule__Promotion__Group__3__Impl"
    // InternalChessDSL.g:3772:1: rule__Promotion__Group__3__Impl : ( ')' ) ;
    public final void rule__Promotion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3776:1: ( ( ')' ) )
            // InternalChessDSL.g:3777:1: ( ')' )
            {
            // InternalChessDSL.g:3777:1: ( ')' )
            // InternalChessDSL.g:3778:2: ')'
            {
             before(grammarAccess.getPromotionAccess().getRightParenthesisKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getPromotionAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Promotion__Group__3__Impl"


    // $ANTLR start "rule__Conclusion__Group__0"
    // InternalChessDSL.g:3788:1: rule__Conclusion__Group__0 : rule__Conclusion__Group__0__Impl rule__Conclusion__Group__1 ;
    public final void rule__Conclusion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3792:1: ( rule__Conclusion__Group__0__Impl rule__Conclusion__Group__1 )
            // InternalChessDSL.g:3793:2: rule__Conclusion__Group__0__Impl rule__Conclusion__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Conclusion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conclusion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conclusion__Group__0"


    // $ANTLR start "rule__Conclusion__Group__0__Impl"
    // InternalChessDSL.g:3800:1: rule__Conclusion__Group__0__Impl : ( ( rule__Conclusion__MethodAssignment_0 )? ) ;
    public final void rule__Conclusion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3804:1: ( ( ( rule__Conclusion__MethodAssignment_0 )? ) )
            // InternalChessDSL.g:3805:1: ( ( rule__Conclusion__MethodAssignment_0 )? )
            {
            // InternalChessDSL.g:3805:1: ( ( rule__Conclusion__MethodAssignment_0 )? )
            // InternalChessDSL.g:3806:2: ( rule__Conclusion__MethodAssignment_0 )?
            {
             before(grammarAccess.getConclusionAccess().getMethodAssignment_0()); 
            // InternalChessDSL.g:3807:2: ( rule__Conclusion__MethodAssignment_0 )?
            int alt37=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA37_1 = input.LA(2);

                    if ( (LA37_1==53||LA37_1==59||(LA37_1>=63 && LA37_1<=64)) ) {
                        alt37=1;
                    }
                    }
                    break;
                case 26:
                    {
                    int LA37_2 = input.LA(2);

                    if ( (LA37_2==53||LA37_2==59||(LA37_2>=63 && LA37_2<=64)) ) {
                        alt37=1;
                    }
                    }
                    break;
                case 27:
                    {
                    int LA37_3 = input.LA(2);

                    if ( (LA37_3==53||LA37_3==59||(LA37_3>=63 && LA37_3<=64)) ) {
                        alt37=1;
                    }
                    }
                    break;
            }

            switch (alt37) {
                case 1 :
                    // InternalChessDSL.g:3807:3: rule__Conclusion__MethodAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conclusion__MethodAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConclusionAccess().getMethodAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conclusion__Group__0__Impl"


    // $ANTLR start "rule__Conclusion__Group__1"
    // InternalChessDSL.g:3815:1: rule__Conclusion__Group__1 : rule__Conclusion__Group__1__Impl ;
    public final void rule__Conclusion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3819:1: ( rule__Conclusion__Group__1__Impl )
            // InternalChessDSL.g:3820:2: rule__Conclusion__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conclusion__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conclusion__Group__1"


    // $ANTLR start "rule__Conclusion__Group__1__Impl"
    // InternalChessDSL.g:3826:1: rule__Conclusion__Group__1__Impl : ( ( rule__Conclusion__ResultAssignment_1 ) ) ;
    public final void rule__Conclusion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3830:1: ( ( ( rule__Conclusion__ResultAssignment_1 ) ) )
            // InternalChessDSL.g:3831:1: ( ( rule__Conclusion__ResultAssignment_1 ) )
            {
            // InternalChessDSL.g:3831:1: ( ( rule__Conclusion__ResultAssignment_1 ) )
            // InternalChessDSL.g:3832:2: ( rule__Conclusion__ResultAssignment_1 )
            {
             before(grammarAccess.getConclusionAccess().getResultAssignment_1()); 
            // InternalChessDSL.g:3833:2: ( rule__Conclusion__ResultAssignment_1 )
            // InternalChessDSL.g:3833:3: rule__Conclusion__ResultAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Conclusion__ResultAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConclusionAccess().getResultAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conclusion__Group__1__Impl"


    // $ANTLR start "rule__TimeUp__Group__0"
    // InternalChessDSL.g:3842:1: rule__TimeUp__Group__0 : rule__TimeUp__Group__0__Impl rule__TimeUp__Group__1 ;
    public final void rule__TimeUp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3846:1: ( rule__TimeUp__Group__0__Impl rule__TimeUp__Group__1 )
            // InternalChessDSL.g:3847:2: rule__TimeUp__Group__0__Impl rule__TimeUp__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__TimeUp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeUp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeUp__Group__0"


    // $ANTLR start "rule__TimeUp__Group__0__Impl"
    // InternalChessDSL.g:3854:1: rule__TimeUp__Group__0__Impl : ( ( rule__TimeUp__PlayerAssignment_0 ) ) ;
    public final void rule__TimeUp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3858:1: ( ( ( rule__TimeUp__PlayerAssignment_0 ) ) )
            // InternalChessDSL.g:3859:1: ( ( rule__TimeUp__PlayerAssignment_0 ) )
            {
            // InternalChessDSL.g:3859:1: ( ( rule__TimeUp__PlayerAssignment_0 ) )
            // InternalChessDSL.g:3860:2: ( rule__TimeUp__PlayerAssignment_0 )
            {
             before(grammarAccess.getTimeUpAccess().getPlayerAssignment_0()); 
            // InternalChessDSL.g:3861:2: ( rule__TimeUp__PlayerAssignment_0 )
            // InternalChessDSL.g:3861:3: rule__TimeUp__PlayerAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TimeUp__PlayerAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTimeUpAccess().getPlayerAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeUp__Group__0__Impl"


    // $ANTLR start "rule__TimeUp__Group__1"
    // InternalChessDSL.g:3869:1: rule__TimeUp__Group__1 : rule__TimeUp__Group__1__Impl rule__TimeUp__Group__2 ;
    public final void rule__TimeUp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3873:1: ( rule__TimeUp__Group__1__Impl rule__TimeUp__Group__2 )
            // InternalChessDSL.g:3874:2: rule__TimeUp__Group__1__Impl rule__TimeUp__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__TimeUp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeUp__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeUp__Group__1"


    // $ANTLR start "rule__TimeUp__Group__1__Impl"
    // InternalChessDSL.g:3881:1: rule__TimeUp__Group__1__Impl : ( 'ran' ) ;
    public final void rule__TimeUp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3885:1: ( ( 'ran' ) )
            // InternalChessDSL.g:3886:1: ( 'ran' )
            {
            // InternalChessDSL.g:3886:1: ( 'ran' )
            // InternalChessDSL.g:3887:2: 'ran'
            {
             before(grammarAccess.getTimeUpAccess().getRanKeyword_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getTimeUpAccess().getRanKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeUp__Group__1__Impl"


    // $ANTLR start "rule__TimeUp__Group__2"
    // InternalChessDSL.g:3896:1: rule__TimeUp__Group__2 : rule__TimeUp__Group__2__Impl rule__TimeUp__Group__3 ;
    public final void rule__TimeUp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3900:1: ( rule__TimeUp__Group__2__Impl rule__TimeUp__Group__3 )
            // InternalChessDSL.g:3901:2: rule__TimeUp__Group__2__Impl rule__TimeUp__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__TimeUp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeUp__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeUp__Group__2"


    // $ANTLR start "rule__TimeUp__Group__2__Impl"
    // InternalChessDSL.g:3908:1: rule__TimeUp__Group__2__Impl : ( 'out' ) ;
    public final void rule__TimeUp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3912:1: ( ( 'out' ) )
            // InternalChessDSL.g:3913:1: ( 'out' )
            {
            // InternalChessDSL.g:3913:1: ( 'out' )
            // InternalChessDSL.g:3914:2: 'out'
            {
             before(grammarAccess.getTimeUpAccess().getOutKeyword_2()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getTimeUpAccess().getOutKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeUp__Group__2__Impl"


    // $ANTLR start "rule__TimeUp__Group__3"
    // InternalChessDSL.g:3923:1: rule__TimeUp__Group__3 : rule__TimeUp__Group__3__Impl rule__TimeUp__Group__4 ;
    public final void rule__TimeUp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3927:1: ( rule__TimeUp__Group__3__Impl rule__TimeUp__Group__4 )
            // InternalChessDSL.g:3928:2: rule__TimeUp__Group__3__Impl rule__TimeUp__Group__4
            {
            pushFollow(FOLLOW_42);
            rule__TimeUp__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeUp__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeUp__Group__3"


    // $ANTLR start "rule__TimeUp__Group__3__Impl"
    // InternalChessDSL.g:3935:1: rule__TimeUp__Group__3__Impl : ( 'of' ) ;
    public final void rule__TimeUp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3939:1: ( ( 'of' ) )
            // InternalChessDSL.g:3940:1: ( 'of' )
            {
            // InternalChessDSL.g:3940:1: ( 'of' )
            // InternalChessDSL.g:3941:2: 'of'
            {
             before(grammarAccess.getTimeUpAccess().getOfKeyword_3()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getTimeUpAccess().getOfKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeUp__Group__3__Impl"


    // $ANTLR start "rule__TimeUp__Group__4"
    // InternalChessDSL.g:3950:1: rule__TimeUp__Group__4 : rule__TimeUp__Group__4__Impl ;
    public final void rule__TimeUp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3954:1: ( rule__TimeUp__Group__4__Impl )
            // InternalChessDSL.g:3955:2: rule__TimeUp__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeUp__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeUp__Group__4"


    // $ANTLR start "rule__TimeUp__Group__4__Impl"
    // InternalChessDSL.g:3961:1: rule__TimeUp__Group__4__Impl : ( 'time' ) ;
    public final void rule__TimeUp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3965:1: ( ( 'time' ) )
            // InternalChessDSL.g:3966:1: ( 'time' )
            {
            // InternalChessDSL.g:3966:1: ( 'time' )
            // InternalChessDSL.g:3967:2: 'time'
            {
             before(grammarAccess.getTimeUpAccess().getTimeKeyword_4()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getTimeUpAccess().getTimeKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeUp__Group__4__Impl"


    // $ANTLR start "rule__Resign__Group__0"
    // InternalChessDSL.g:3977:1: rule__Resign__Group__0 : rule__Resign__Group__0__Impl rule__Resign__Group__1 ;
    public final void rule__Resign__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3981:1: ( rule__Resign__Group__0__Impl rule__Resign__Group__1 )
            // InternalChessDSL.g:3982:2: rule__Resign__Group__0__Impl rule__Resign__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__Resign__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resign__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resign__Group__0"


    // $ANTLR start "rule__Resign__Group__0__Impl"
    // InternalChessDSL.g:3989:1: rule__Resign__Group__0__Impl : ( ( rule__Resign__PlayerAssignment_0 ) ) ;
    public final void rule__Resign__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3993:1: ( ( ( rule__Resign__PlayerAssignment_0 ) ) )
            // InternalChessDSL.g:3994:1: ( ( rule__Resign__PlayerAssignment_0 ) )
            {
            // InternalChessDSL.g:3994:1: ( ( rule__Resign__PlayerAssignment_0 ) )
            // InternalChessDSL.g:3995:2: ( rule__Resign__PlayerAssignment_0 )
            {
             before(grammarAccess.getResignAccess().getPlayerAssignment_0()); 
            // InternalChessDSL.g:3996:2: ( rule__Resign__PlayerAssignment_0 )
            // InternalChessDSL.g:3996:3: rule__Resign__PlayerAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Resign__PlayerAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getResignAccess().getPlayerAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resign__Group__0__Impl"


    // $ANTLR start "rule__Resign__Group__1"
    // InternalChessDSL.g:4004:1: rule__Resign__Group__1 : rule__Resign__Group__1__Impl ;
    public final void rule__Resign__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4008:1: ( rule__Resign__Group__1__Impl )
            // InternalChessDSL.g:4009:2: rule__Resign__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resign__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resign__Group__1"


    // $ANTLR start "rule__Resign__Group__1__Impl"
    // InternalChessDSL.g:4015:1: rule__Resign__Group__1__Impl : ( 'resigned' ) ;
    public final void rule__Resign__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4019:1: ( ( 'resigned' ) )
            // InternalChessDSL.g:4020:1: ( 'resigned' )
            {
            // InternalChessDSL.g:4020:1: ( 'resigned' )
            // InternalChessDSL.g:4021:2: 'resigned'
            {
             before(grammarAccess.getResignAccess().getResignedKeyword_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getResignAccess().getResignedKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resign__Group__1__Impl"


    // $ANTLR start "rule__Checkmate__Group__0"
    // InternalChessDSL.g:4031:1: rule__Checkmate__Group__0 : rule__Checkmate__Group__0__Impl rule__Checkmate__Group__1 ;
    public final void rule__Checkmate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4035:1: ( rule__Checkmate__Group__0__Impl rule__Checkmate__Group__1 )
            // InternalChessDSL.g:4036:2: rule__Checkmate__Group__0__Impl rule__Checkmate__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__Checkmate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checkmate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkmate__Group__0"


    // $ANTLR start "rule__Checkmate__Group__0__Impl"
    // InternalChessDSL.g:4043:1: rule__Checkmate__Group__0__Impl : ( ( rule__Checkmate__Player1Assignment_0 ) ) ;
    public final void rule__Checkmate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4047:1: ( ( ( rule__Checkmate__Player1Assignment_0 ) ) )
            // InternalChessDSL.g:4048:1: ( ( rule__Checkmate__Player1Assignment_0 ) )
            {
            // InternalChessDSL.g:4048:1: ( ( rule__Checkmate__Player1Assignment_0 ) )
            // InternalChessDSL.g:4049:2: ( rule__Checkmate__Player1Assignment_0 )
            {
             before(grammarAccess.getCheckmateAccess().getPlayer1Assignment_0()); 
            // InternalChessDSL.g:4050:2: ( rule__Checkmate__Player1Assignment_0 )
            // InternalChessDSL.g:4050:3: rule__Checkmate__Player1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Checkmate__Player1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCheckmateAccess().getPlayer1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkmate__Group__0__Impl"


    // $ANTLR start "rule__Checkmate__Group__1"
    // InternalChessDSL.g:4058:1: rule__Checkmate__Group__1 : rule__Checkmate__Group__1__Impl rule__Checkmate__Group__2 ;
    public final void rule__Checkmate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4062:1: ( rule__Checkmate__Group__1__Impl rule__Checkmate__Group__2 )
            // InternalChessDSL.g:4063:2: rule__Checkmate__Group__1__Impl rule__Checkmate__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Checkmate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checkmate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkmate__Group__1"


    // $ANTLR start "rule__Checkmate__Group__1__Impl"
    // InternalChessDSL.g:4070:1: rule__Checkmate__Group__1__Impl : ( 'checkmated' ) ;
    public final void rule__Checkmate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4074:1: ( ( 'checkmated' ) )
            // InternalChessDSL.g:4075:1: ( 'checkmated' )
            {
            // InternalChessDSL.g:4075:1: ( 'checkmated' )
            // InternalChessDSL.g:4076:2: 'checkmated'
            {
             before(grammarAccess.getCheckmateAccess().getCheckmatedKeyword_1()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getCheckmateAccess().getCheckmatedKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkmate__Group__1__Impl"


    // $ANTLR start "rule__Checkmate__Group__2"
    // InternalChessDSL.g:4085:1: rule__Checkmate__Group__2 : rule__Checkmate__Group__2__Impl ;
    public final void rule__Checkmate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4089:1: ( rule__Checkmate__Group__2__Impl )
            // InternalChessDSL.g:4090:2: rule__Checkmate__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Checkmate__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkmate__Group__2"


    // $ANTLR start "rule__Checkmate__Group__2__Impl"
    // InternalChessDSL.g:4096:1: rule__Checkmate__Group__2__Impl : ( ( rule__Checkmate__Player2Assignment_2 ) ) ;
    public final void rule__Checkmate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4100:1: ( ( ( rule__Checkmate__Player2Assignment_2 ) ) )
            // InternalChessDSL.g:4101:1: ( ( rule__Checkmate__Player2Assignment_2 ) )
            {
            // InternalChessDSL.g:4101:1: ( ( rule__Checkmate__Player2Assignment_2 ) )
            // InternalChessDSL.g:4102:2: ( rule__Checkmate__Player2Assignment_2 )
            {
             before(grammarAccess.getCheckmateAccess().getPlayer2Assignment_2()); 
            // InternalChessDSL.g:4103:2: ( rule__Checkmate__Player2Assignment_2 )
            // InternalChessDSL.g:4103:3: rule__Checkmate__Player2Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Checkmate__Player2Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCheckmateAccess().getPlayer2Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkmate__Group__2__Impl"


    // $ANTLR start "rule__Draw__Group__0"
    // InternalChessDSL.g:4112:1: rule__Draw__Group__0 : rule__Draw__Group__0__Impl rule__Draw__Group__1 ;
    public final void rule__Draw__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4116:1: ( rule__Draw__Group__0__Impl rule__Draw__Group__1 )
            // InternalChessDSL.g:4117:2: rule__Draw__Group__0__Impl rule__Draw__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__Draw__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Draw__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Draw__Group__0"


    // $ANTLR start "rule__Draw__Group__0__Impl"
    // InternalChessDSL.g:4124:1: rule__Draw__Group__0__Impl : ( ( rule__Draw__Player1Assignment_0 ) ) ;
    public final void rule__Draw__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4128:1: ( ( ( rule__Draw__Player1Assignment_0 ) ) )
            // InternalChessDSL.g:4129:1: ( ( rule__Draw__Player1Assignment_0 ) )
            {
            // InternalChessDSL.g:4129:1: ( ( rule__Draw__Player1Assignment_0 ) )
            // InternalChessDSL.g:4130:2: ( rule__Draw__Player1Assignment_0 )
            {
             before(grammarAccess.getDrawAccess().getPlayer1Assignment_0()); 
            // InternalChessDSL.g:4131:2: ( rule__Draw__Player1Assignment_0 )
            // InternalChessDSL.g:4131:3: rule__Draw__Player1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Draw__Player1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDrawAccess().getPlayer1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Draw__Group__0__Impl"


    // $ANTLR start "rule__Draw__Group__1"
    // InternalChessDSL.g:4139:1: rule__Draw__Group__1 : rule__Draw__Group__1__Impl rule__Draw__Group__2 ;
    public final void rule__Draw__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4143:1: ( rule__Draw__Group__1__Impl rule__Draw__Group__2 )
            // InternalChessDSL.g:4144:2: rule__Draw__Group__1__Impl rule__Draw__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Draw__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Draw__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Draw__Group__1"


    // $ANTLR start "rule__Draw__Group__1__Impl"
    // InternalChessDSL.g:4151:1: rule__Draw__Group__1__Impl : ( 'and' ) ;
    public final void rule__Draw__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4155:1: ( ( 'and' ) )
            // InternalChessDSL.g:4156:1: ( 'and' )
            {
            // InternalChessDSL.g:4156:1: ( 'and' )
            // InternalChessDSL.g:4157:2: 'and'
            {
             before(grammarAccess.getDrawAccess().getAndKeyword_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getDrawAccess().getAndKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Draw__Group__1__Impl"


    // $ANTLR start "rule__Draw__Group__2"
    // InternalChessDSL.g:4166:1: rule__Draw__Group__2 : rule__Draw__Group__2__Impl rule__Draw__Group__3 ;
    public final void rule__Draw__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4170:1: ( rule__Draw__Group__2__Impl rule__Draw__Group__3 )
            // InternalChessDSL.g:4171:2: rule__Draw__Group__2__Impl rule__Draw__Group__3
            {
            pushFollow(FOLLOW_45);
            rule__Draw__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Draw__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Draw__Group__2"


    // $ANTLR start "rule__Draw__Group__2__Impl"
    // InternalChessDSL.g:4178:1: rule__Draw__Group__2__Impl : ( ( rule__Draw__Player2Assignment_2 ) ) ;
    public final void rule__Draw__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4182:1: ( ( ( rule__Draw__Player2Assignment_2 ) ) )
            // InternalChessDSL.g:4183:1: ( ( rule__Draw__Player2Assignment_2 ) )
            {
            // InternalChessDSL.g:4183:1: ( ( rule__Draw__Player2Assignment_2 ) )
            // InternalChessDSL.g:4184:2: ( rule__Draw__Player2Assignment_2 )
            {
             before(grammarAccess.getDrawAccess().getPlayer2Assignment_2()); 
            // InternalChessDSL.g:4185:2: ( rule__Draw__Player2Assignment_2 )
            // InternalChessDSL.g:4185:3: rule__Draw__Player2Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Draw__Player2Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDrawAccess().getPlayer2Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Draw__Group__2__Impl"


    // $ANTLR start "rule__Draw__Group__3"
    // InternalChessDSL.g:4193:1: rule__Draw__Group__3 : rule__Draw__Group__3__Impl ;
    public final void rule__Draw__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4197:1: ( rule__Draw__Group__3__Impl )
            // InternalChessDSL.g:4198:2: rule__Draw__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Draw__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Draw__Group__3"


    // $ANTLR start "rule__Draw__Group__3__Impl"
    // InternalChessDSL.g:4204:1: rule__Draw__Group__3__Impl : ( ( rule__Draw__ResultAssignment_3 ) ) ;
    public final void rule__Draw__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4208:1: ( ( ( rule__Draw__ResultAssignment_3 ) ) )
            // InternalChessDSL.g:4209:1: ( ( rule__Draw__ResultAssignment_3 ) )
            {
            // InternalChessDSL.g:4209:1: ( ( rule__Draw__ResultAssignment_3 ) )
            // InternalChessDSL.g:4210:2: ( rule__Draw__ResultAssignment_3 )
            {
             before(grammarAccess.getDrawAccess().getResultAssignment_3()); 
            // InternalChessDSL.g:4211:2: ( rule__Draw__ResultAssignment_3 )
            // InternalChessDSL.g:4211:3: rule__Draw__ResultAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Draw__ResultAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDrawAccess().getResultAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Draw__Group__3__Impl"


    // $ANTLR start "rule__Stalemate__Group__0"
    // InternalChessDSL.g:4220:1: rule__Stalemate__Group__0 : rule__Stalemate__Group__0__Impl rule__Stalemate__Group__1 ;
    public final void rule__Stalemate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4224:1: ( rule__Stalemate__Group__0__Impl rule__Stalemate__Group__1 )
            // InternalChessDSL.g:4225:2: rule__Stalemate__Group__0__Impl rule__Stalemate__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Stalemate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stalemate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stalemate__Group__0"


    // $ANTLR start "rule__Stalemate__Group__0__Impl"
    // InternalChessDSL.g:4232:1: rule__Stalemate__Group__0__Impl : ( 'ended' ) ;
    public final void rule__Stalemate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4236:1: ( ( 'ended' ) )
            // InternalChessDSL.g:4237:1: ( 'ended' )
            {
            // InternalChessDSL.g:4237:1: ( 'ended' )
            // InternalChessDSL.g:4238:2: 'ended'
            {
             before(grammarAccess.getStalemateAccess().getEndedKeyword_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getStalemateAccess().getEndedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stalemate__Group__0__Impl"


    // $ANTLR start "rule__Stalemate__Group__1"
    // InternalChessDSL.g:4247:1: rule__Stalemate__Group__1 : rule__Stalemate__Group__1__Impl rule__Stalemate__Group__2 ;
    public final void rule__Stalemate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4251:1: ( rule__Stalemate__Group__1__Impl rule__Stalemate__Group__2 )
            // InternalChessDSL.g:4252:2: rule__Stalemate__Group__1__Impl rule__Stalemate__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__Stalemate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stalemate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stalemate__Group__1"


    // $ANTLR start "rule__Stalemate__Group__1__Impl"
    // InternalChessDSL.g:4259:1: rule__Stalemate__Group__1__Impl : ( 'the' ) ;
    public final void rule__Stalemate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4263:1: ( ( 'the' ) )
            // InternalChessDSL.g:4264:1: ( 'the' )
            {
            // InternalChessDSL.g:4264:1: ( 'the' )
            // InternalChessDSL.g:4265:2: 'the'
            {
             before(grammarAccess.getStalemateAccess().getTheKeyword_1()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getStalemateAccess().getTheKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stalemate__Group__1__Impl"


    // $ANTLR start "rule__Stalemate__Group__2"
    // InternalChessDSL.g:4274:1: rule__Stalemate__Group__2 : rule__Stalemate__Group__2__Impl rule__Stalemate__Group__3 ;
    public final void rule__Stalemate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4278:1: ( rule__Stalemate__Group__2__Impl rule__Stalemate__Group__3 )
            // InternalChessDSL.g:4279:2: rule__Stalemate__Group__2__Impl rule__Stalemate__Group__3
            {
            pushFollow(FOLLOW_47);
            rule__Stalemate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stalemate__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stalemate__Group__2"


    // $ANTLR start "rule__Stalemate__Group__2__Impl"
    // InternalChessDSL.g:4286:1: rule__Stalemate__Group__2__Impl : ( 'game' ) ;
    public final void rule__Stalemate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4290:1: ( ( 'game' ) )
            // InternalChessDSL.g:4291:1: ( 'game' )
            {
            // InternalChessDSL.g:4291:1: ( 'game' )
            // InternalChessDSL.g:4292:2: 'game'
            {
             before(grammarAccess.getStalemateAccess().getGameKeyword_2()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getStalemateAccess().getGameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stalemate__Group__2__Impl"


    // $ANTLR start "rule__Stalemate__Group__3"
    // InternalChessDSL.g:4301:1: rule__Stalemate__Group__3 : rule__Stalemate__Group__3__Impl rule__Stalemate__Group__4 ;
    public final void rule__Stalemate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4305:1: ( rule__Stalemate__Group__3__Impl rule__Stalemate__Group__4 )
            // InternalChessDSL.g:4306:2: rule__Stalemate__Group__3__Impl rule__Stalemate__Group__4
            {
            pushFollow(FOLLOW_48);
            rule__Stalemate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stalemate__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stalemate__Group__3"


    // $ANTLR start "rule__Stalemate__Group__3__Impl"
    // InternalChessDSL.g:4313:1: rule__Stalemate__Group__3__Impl : ( 'in' ) ;
    public final void rule__Stalemate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4317:1: ( ( 'in' ) )
            // InternalChessDSL.g:4318:1: ( 'in' )
            {
            // InternalChessDSL.g:4318:1: ( 'in' )
            // InternalChessDSL.g:4319:2: 'in'
            {
             before(grammarAccess.getStalemateAccess().getInKeyword_3()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getStalemateAccess().getInKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stalemate__Group__3__Impl"


    // $ANTLR start "rule__Stalemate__Group__4"
    // InternalChessDSL.g:4328:1: rule__Stalemate__Group__4 : rule__Stalemate__Group__4__Impl rule__Stalemate__Group__5 ;
    public final void rule__Stalemate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4332:1: ( rule__Stalemate__Group__4__Impl rule__Stalemate__Group__5 )
            // InternalChessDSL.g:4333:2: rule__Stalemate__Group__4__Impl rule__Stalemate__Group__5
            {
            pushFollow(FOLLOW_49);
            rule__Stalemate__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stalemate__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stalemate__Group__4"


    // $ANTLR start "rule__Stalemate__Group__4__Impl"
    // InternalChessDSL.g:4340:1: rule__Stalemate__Group__4__Impl : ( 'a' ) ;
    public final void rule__Stalemate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4344:1: ( ( 'a' ) )
            // InternalChessDSL.g:4345:1: ( 'a' )
            {
            // InternalChessDSL.g:4345:1: ( 'a' )
            // InternalChessDSL.g:4346:2: 'a'
            {
             before(grammarAccess.getStalemateAccess().getAKeyword_4()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getStalemateAccess().getAKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stalemate__Group__4__Impl"


    // $ANTLR start "rule__Stalemate__Group__5"
    // InternalChessDSL.g:4355:1: rule__Stalemate__Group__5 : rule__Stalemate__Group__5__Impl ;
    public final void rule__Stalemate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4359:1: ( rule__Stalemate__Group__5__Impl )
            // InternalChessDSL.g:4360:2: rule__Stalemate__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stalemate__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stalemate__Group__5"


    // $ANTLR start "rule__Stalemate__Group__5__Impl"
    // InternalChessDSL.g:4366:1: rule__Stalemate__Group__5__Impl : ( 'stalemate' ) ;
    public final void rule__Stalemate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4370:1: ( ( 'stalemate' ) )
            // InternalChessDSL.g:4371:1: ( 'stalemate' )
            {
            // InternalChessDSL.g:4371:1: ( 'stalemate' )
            // InternalChessDSL.g:4372:2: 'stalemate'
            {
             before(grammarAccess.getStalemateAccess().getStalemateKeyword_5()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getStalemateAccess().getStalemateKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stalemate__Group__5__Impl"


    // $ANTLR start "rule__Threefold__Group__0"
    // InternalChessDSL.g:4382:1: rule__Threefold__Group__0 : rule__Threefold__Group__0__Impl rule__Threefold__Group__1 ;
    public final void rule__Threefold__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4386:1: ( rule__Threefold__Group__0__Impl rule__Threefold__Group__1 )
            // InternalChessDSL.g:4387:2: rule__Threefold__Group__0__Impl rule__Threefold__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__Threefold__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Threefold__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Threefold__Group__0"


    // $ANTLR start "rule__Threefold__Group__0__Impl"
    // InternalChessDSL.g:4394:1: rule__Threefold__Group__0__Impl : ( 'repeated' ) ;
    public final void rule__Threefold__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4398:1: ( ( 'repeated' ) )
            // InternalChessDSL.g:4399:1: ( 'repeated' )
            {
            // InternalChessDSL.g:4399:1: ( 'repeated' )
            // InternalChessDSL.g:4400:2: 'repeated'
            {
             before(grammarAccess.getThreefoldAccess().getRepeatedKeyword_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getThreefoldAccess().getRepeatedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Threefold__Group__0__Impl"


    // $ANTLR start "rule__Threefold__Group__1"
    // InternalChessDSL.g:4409:1: rule__Threefold__Group__1 : rule__Threefold__Group__1__Impl rule__Threefold__Group__2 ;
    public final void rule__Threefold__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4413:1: ( rule__Threefold__Group__1__Impl rule__Threefold__Group__2 )
            // InternalChessDSL.g:4414:2: rule__Threefold__Group__1__Impl rule__Threefold__Group__2
            {
            pushFollow(FOLLOW_50);
            rule__Threefold__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Threefold__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Threefold__Group__1"


    // $ANTLR start "rule__Threefold__Group__1__Impl"
    // InternalChessDSL.g:4421:1: rule__Threefold__Group__1__Impl : ( 'a' ) ;
    public final void rule__Threefold__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4425:1: ( ( 'a' ) )
            // InternalChessDSL.g:4426:1: ( 'a' )
            {
            // InternalChessDSL.g:4426:1: ( 'a' )
            // InternalChessDSL.g:4427:2: 'a'
            {
             before(grammarAccess.getThreefoldAccess().getAKeyword_1()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getThreefoldAccess().getAKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Threefold__Group__1__Impl"


    // $ANTLR start "rule__Threefold__Group__2"
    // InternalChessDSL.g:4436:1: rule__Threefold__Group__2 : rule__Threefold__Group__2__Impl rule__Threefold__Group__3 ;
    public final void rule__Threefold__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4440:1: ( rule__Threefold__Group__2__Impl rule__Threefold__Group__3 )
            // InternalChessDSL.g:4441:2: rule__Threefold__Group__2__Impl rule__Threefold__Group__3
            {
            pushFollow(FOLLOW_51);
            rule__Threefold__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Threefold__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Threefold__Group__2"


    // $ANTLR start "rule__Threefold__Group__2__Impl"
    // InternalChessDSL.g:4448:1: rule__Threefold__Group__2__Impl : ( 'position' ) ;
    public final void rule__Threefold__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4452:1: ( ( 'position' ) )
            // InternalChessDSL.g:4453:1: ( 'position' )
            {
            // InternalChessDSL.g:4453:1: ( 'position' )
            // InternalChessDSL.g:4454:2: 'position'
            {
             before(grammarAccess.getThreefoldAccess().getPositionKeyword_2()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getThreefoldAccess().getPositionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Threefold__Group__2__Impl"


    // $ANTLR start "rule__Threefold__Group__3"
    // InternalChessDSL.g:4463:1: rule__Threefold__Group__3 : rule__Threefold__Group__3__Impl rule__Threefold__Group__4 ;
    public final void rule__Threefold__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4467:1: ( rule__Threefold__Group__3__Impl rule__Threefold__Group__4 )
            // InternalChessDSL.g:4468:2: rule__Threefold__Group__3__Impl rule__Threefold__Group__4
            {
            pushFollow(FOLLOW_52);
            rule__Threefold__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Threefold__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Threefold__Group__3"


    // $ANTLR start "rule__Threefold__Group__3__Impl"
    // InternalChessDSL.g:4475:1: rule__Threefold__Group__3__Impl : ( 'three' ) ;
    public final void rule__Threefold__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4479:1: ( ( 'three' ) )
            // InternalChessDSL.g:4480:1: ( 'three' )
            {
            // InternalChessDSL.g:4480:1: ( 'three' )
            // InternalChessDSL.g:4481:2: 'three'
            {
             before(grammarAccess.getThreefoldAccess().getThreeKeyword_3()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getThreefoldAccess().getThreeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Threefold__Group__3__Impl"


    // $ANTLR start "rule__Threefold__Group__4"
    // InternalChessDSL.g:4490:1: rule__Threefold__Group__4 : rule__Threefold__Group__4__Impl ;
    public final void rule__Threefold__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4494:1: ( rule__Threefold__Group__4__Impl )
            // InternalChessDSL.g:4495:2: rule__Threefold__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Threefold__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Threefold__Group__4"


    // $ANTLR start "rule__Threefold__Group__4__Impl"
    // InternalChessDSL.g:4501:1: rule__Threefold__Group__4__Impl : ( 'times' ) ;
    public final void rule__Threefold__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4505:1: ( ( 'times' ) )
            // InternalChessDSL.g:4506:1: ( 'times' )
            {
            // InternalChessDSL.g:4506:1: ( 'times' )
            // InternalChessDSL.g:4507:2: 'times'
            {
             before(grammarAccess.getThreefoldAccess().getTimesKeyword_4()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getThreefoldAccess().getTimesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Threefold__Group__4__Impl"


    // $ANTLR start "rule__Fifty__Group__0"
    // InternalChessDSL.g:4517:1: rule__Fifty__Group__0 : rule__Fifty__Group__0__Impl rule__Fifty__Group__1 ;
    public final void rule__Fifty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4521:1: ( rule__Fifty__Group__0__Impl rule__Fifty__Group__1 )
            // InternalChessDSL.g:4522:2: rule__Fifty__Group__0__Impl rule__Fifty__Group__1
            {
            pushFollow(FOLLOW_53);
            rule__Fifty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fifty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fifty__Group__0"


    // $ANTLR start "rule__Fifty__Group__0__Impl"
    // InternalChessDSL.g:4529:1: rule__Fifty__Group__0__Impl : ( 'played' ) ;
    public final void rule__Fifty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4533:1: ( ( 'played' ) )
            // InternalChessDSL.g:4534:1: ( 'played' )
            {
            // InternalChessDSL.g:4534:1: ( 'played' )
            // InternalChessDSL.g:4535:2: 'played'
            {
             before(grammarAccess.getFiftyAccess().getPlayedKeyword_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getFiftyAccess().getPlayedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fifty__Group__0__Impl"


    // $ANTLR start "rule__Fifty__Group__1"
    // InternalChessDSL.g:4544:1: rule__Fifty__Group__1 : rule__Fifty__Group__1__Impl rule__Fifty__Group__2 ;
    public final void rule__Fifty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4548:1: ( rule__Fifty__Group__1__Impl rule__Fifty__Group__2 )
            // InternalChessDSL.g:4549:2: rule__Fifty__Group__1__Impl rule__Fifty__Group__2
            {
            pushFollow(FOLLOW_54);
            rule__Fifty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fifty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fifty__Group__1"


    // $ANTLR start "rule__Fifty__Group__1__Impl"
    // InternalChessDSL.g:4556:1: rule__Fifty__Group__1__Impl : ( 'fifty' ) ;
    public final void rule__Fifty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4560:1: ( ( 'fifty' ) )
            // InternalChessDSL.g:4561:1: ( 'fifty' )
            {
            // InternalChessDSL.g:4561:1: ( 'fifty' )
            // InternalChessDSL.g:4562:2: 'fifty'
            {
             before(grammarAccess.getFiftyAccess().getFiftyKeyword_1()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getFiftyAccess().getFiftyKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fifty__Group__1__Impl"


    // $ANTLR start "rule__Fifty__Group__2"
    // InternalChessDSL.g:4571:1: rule__Fifty__Group__2 : rule__Fifty__Group__2__Impl rule__Fifty__Group__3 ;
    public final void rule__Fifty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4575:1: ( rule__Fifty__Group__2__Impl rule__Fifty__Group__3 )
            // InternalChessDSL.g:4576:2: rule__Fifty__Group__2__Impl rule__Fifty__Group__3
            {
            pushFollow(FOLLOW_55);
            rule__Fifty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fifty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fifty__Group__2"


    // $ANTLR start "rule__Fifty__Group__2__Impl"
    // InternalChessDSL.g:4583:1: rule__Fifty__Group__2__Impl : ( 'moves' ) ;
    public final void rule__Fifty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4587:1: ( ( 'moves' ) )
            // InternalChessDSL.g:4588:1: ( 'moves' )
            {
            // InternalChessDSL.g:4588:1: ( 'moves' )
            // InternalChessDSL.g:4589:2: 'moves'
            {
             before(grammarAccess.getFiftyAccess().getMovesKeyword_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getFiftyAccess().getMovesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fifty__Group__2__Impl"


    // $ANTLR start "rule__Fifty__Group__3"
    // InternalChessDSL.g:4598:1: rule__Fifty__Group__3 : rule__Fifty__Group__3__Impl rule__Fifty__Group__4 ;
    public final void rule__Fifty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4602:1: ( rule__Fifty__Group__3__Impl rule__Fifty__Group__4 )
            // InternalChessDSL.g:4603:2: rule__Fifty__Group__3__Impl rule__Fifty__Group__4
            {
            pushFollow(FOLLOW_48);
            rule__Fifty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fifty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fifty__Group__3"


    // $ANTLR start "rule__Fifty__Group__3__Impl"
    // InternalChessDSL.g:4610:1: rule__Fifty__Group__3__Impl : ( 'without' ) ;
    public final void rule__Fifty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4614:1: ( ( 'without' ) )
            // InternalChessDSL.g:4615:1: ( 'without' )
            {
            // InternalChessDSL.g:4615:1: ( 'without' )
            // InternalChessDSL.g:4616:2: 'without'
            {
             before(grammarAccess.getFiftyAccess().getWithoutKeyword_3()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getFiftyAccess().getWithoutKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fifty__Group__3__Impl"


    // $ANTLR start "rule__Fifty__Group__4"
    // InternalChessDSL.g:4625:1: rule__Fifty__Group__4 : rule__Fifty__Group__4__Impl rule__Fifty__Group__5 ;
    public final void rule__Fifty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4629:1: ( rule__Fifty__Group__4__Impl rule__Fifty__Group__5 )
            // InternalChessDSL.g:4630:2: rule__Fifty__Group__4__Impl rule__Fifty__Group__5
            {
            pushFollow(FOLLOW_56);
            rule__Fifty__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fifty__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fifty__Group__4"


    // $ANTLR start "rule__Fifty__Group__4__Impl"
    // InternalChessDSL.g:4637:1: rule__Fifty__Group__4__Impl : ( 'a' ) ;
    public final void rule__Fifty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4641:1: ( ( 'a' ) )
            // InternalChessDSL.g:4642:1: ( 'a' )
            {
            // InternalChessDSL.g:4642:1: ( 'a' )
            // InternalChessDSL.g:4643:2: 'a'
            {
             before(grammarAccess.getFiftyAccess().getAKeyword_4()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getFiftyAccess().getAKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fifty__Group__4__Impl"


    // $ANTLR start "rule__Fifty__Group__5"
    // InternalChessDSL.g:4652:1: rule__Fifty__Group__5 : rule__Fifty__Group__5__Impl ;
    public final void rule__Fifty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4656:1: ( rule__Fifty__Group__5__Impl )
            // InternalChessDSL.g:4657:2: rule__Fifty__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fifty__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fifty__Group__5"


    // $ANTLR start "rule__Fifty__Group__5__Impl"
    // InternalChessDSL.g:4663:1: rule__Fifty__Group__5__Impl : ( 'capture' ) ;
    public final void rule__Fifty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4667:1: ( ( 'capture' ) )
            // InternalChessDSL.g:4668:1: ( 'capture' )
            {
            // InternalChessDSL.g:4668:1: ( 'capture' )
            // InternalChessDSL.g:4669:2: 'capture'
            {
             before(grammarAccess.getFiftyAccess().getCaptureKeyword_5()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getFiftyAccess().getCaptureKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fifty__Group__5__Impl"


    // $ANTLR start "rule__Agree__Group__0"
    // InternalChessDSL.g:4679:1: rule__Agree__Group__0 : rule__Agree__Group__0__Impl rule__Agree__Group__1 ;
    public final void rule__Agree__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4683:1: ( rule__Agree__Group__0__Impl rule__Agree__Group__1 )
            // InternalChessDSL.g:4684:2: rule__Agree__Group__0__Impl rule__Agree__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Agree__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Agree__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agree__Group__0"


    // $ANTLR start "rule__Agree__Group__0__Impl"
    // InternalChessDSL.g:4691:1: rule__Agree__Group__0__Impl : ( 'agreed' ) ;
    public final void rule__Agree__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4695:1: ( ( 'agreed' ) )
            // InternalChessDSL.g:4696:1: ( 'agreed' )
            {
            // InternalChessDSL.g:4696:1: ( 'agreed' )
            // InternalChessDSL.g:4697:2: 'agreed'
            {
             before(grammarAccess.getAgreeAccess().getAgreedKeyword_0()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getAgreeAccess().getAgreedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agree__Group__0__Impl"


    // $ANTLR start "rule__Agree__Group__1"
    // InternalChessDSL.g:4706:1: rule__Agree__Group__1 : rule__Agree__Group__1__Impl rule__Agree__Group__2 ;
    public final void rule__Agree__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4710:1: ( rule__Agree__Group__1__Impl rule__Agree__Group__2 )
            // InternalChessDSL.g:4711:2: rule__Agree__Group__1__Impl rule__Agree__Group__2
            {
            pushFollow(FOLLOW_48);
            rule__Agree__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Agree__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agree__Group__1"


    // $ANTLR start "rule__Agree__Group__1__Impl"
    // InternalChessDSL.g:4718:1: rule__Agree__Group__1__Impl : ( 'to' ) ;
    public final void rule__Agree__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4722:1: ( ( 'to' ) )
            // InternalChessDSL.g:4723:1: ( 'to' )
            {
            // InternalChessDSL.g:4723:1: ( 'to' )
            // InternalChessDSL.g:4724:2: 'to'
            {
             before(grammarAccess.getAgreeAccess().getToKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getAgreeAccess().getToKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agree__Group__1__Impl"


    // $ANTLR start "rule__Agree__Group__2"
    // InternalChessDSL.g:4733:1: rule__Agree__Group__2 : rule__Agree__Group__2__Impl rule__Agree__Group__3 ;
    public final void rule__Agree__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4737:1: ( rule__Agree__Group__2__Impl rule__Agree__Group__3 )
            // InternalChessDSL.g:4738:2: rule__Agree__Group__2__Impl rule__Agree__Group__3
            {
            pushFollow(FOLLOW_57);
            rule__Agree__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Agree__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agree__Group__2"


    // $ANTLR start "rule__Agree__Group__2__Impl"
    // InternalChessDSL.g:4745:1: rule__Agree__Group__2__Impl : ( 'a' ) ;
    public final void rule__Agree__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4749:1: ( ( 'a' ) )
            // InternalChessDSL.g:4750:1: ( 'a' )
            {
            // InternalChessDSL.g:4750:1: ( 'a' )
            // InternalChessDSL.g:4751:2: 'a'
            {
             before(grammarAccess.getAgreeAccess().getAKeyword_2()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getAgreeAccess().getAKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agree__Group__2__Impl"


    // $ANTLR start "rule__Agree__Group__3"
    // InternalChessDSL.g:4760:1: rule__Agree__Group__3 : rule__Agree__Group__3__Impl ;
    public final void rule__Agree__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4764:1: ( rule__Agree__Group__3__Impl )
            // InternalChessDSL.g:4765:2: rule__Agree__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Agree__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agree__Group__3"


    // $ANTLR start "rule__Agree__Group__3__Impl"
    // InternalChessDSL.g:4771:1: rule__Agree__Group__3__Impl : ( 'draw' ) ;
    public final void rule__Agree__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4775:1: ( ( 'draw' ) )
            // InternalChessDSL.g:4776:1: ( 'draw' )
            {
            // InternalChessDSL.g:4776:1: ( 'draw' )
            // InternalChessDSL.g:4777:2: 'draw'
            {
             before(grammarAccess.getAgreeAccess().getDrawKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAgreeAccess().getDrawKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agree__Group__3__Impl"


    // $ANTLR start "rule__Result__Group_0__0"
    // InternalChessDSL.g:4787:1: rule__Result__Group_0__0 : rule__Result__Group_0__0__Impl rule__Result__Group_0__1 ;
    public final void rule__Result__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4791:1: ( rule__Result__Group_0__0__Impl rule__Result__Group_0__1 )
            // InternalChessDSL.g:4792:2: rule__Result__Group_0__0__Impl rule__Result__Group_0__1
            {
            pushFollow(FOLLOW_58);
            rule__Result__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Result__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Result__Group_0__0"


    // $ANTLR start "rule__Result__Group_0__0__Impl"
    // InternalChessDSL.g:4799:1: rule__Result__Group_0__0__Impl : ( ( rule__Result__Alternatives_0_0 ) ) ;
    public final void rule__Result__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4803:1: ( ( ( rule__Result__Alternatives_0_0 ) ) )
            // InternalChessDSL.g:4804:1: ( ( rule__Result__Alternatives_0_0 ) )
            {
            // InternalChessDSL.g:4804:1: ( ( rule__Result__Alternatives_0_0 ) )
            // InternalChessDSL.g:4805:2: ( rule__Result__Alternatives_0_0 )
            {
             before(grammarAccess.getResultAccess().getAlternatives_0_0()); 
            // InternalChessDSL.g:4806:2: ( rule__Result__Alternatives_0_0 )
            // InternalChessDSL.g:4806:3: rule__Result__Alternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Result__Alternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getResultAccess().getAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Result__Group_0__0__Impl"


    // $ANTLR start "rule__Result__Group_0__1"
    // InternalChessDSL.g:4814:1: rule__Result__Group_0__1 : rule__Result__Group_0__1__Impl ;
    public final void rule__Result__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4818:1: ( rule__Result__Group_0__1__Impl )
            // InternalChessDSL.g:4819:2: rule__Result__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Result__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Result__Group_0__1"


    // $ANTLR start "rule__Result__Group_0__1__Impl"
    // InternalChessDSL.g:4825:1: rule__Result__Group_0__1__Impl : ( 'wins' ) ;
    public final void rule__Result__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4829:1: ( ( 'wins' ) )
            // InternalChessDSL.g:4830:1: ( 'wins' )
            {
            // InternalChessDSL.g:4830:1: ( 'wins' )
            // InternalChessDSL.g:4831:2: 'wins'
            {
             before(grammarAccess.getResultAccess().getWinsKeyword_0_1()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getResultAccess().getWinsKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Result__Group_0__1__Impl"


    // $ANTLR start "rule__Model__GameAssignment"
    // InternalChessDSL.g:4841:1: rule__Model__GameAssignment : ( ruleGame ) ;
    public final void rule__Model__GameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4845:1: ( ( ruleGame ) )
            // InternalChessDSL.g:4846:2: ( ruleGame )
            {
            // InternalChessDSL.g:4846:2: ( ruleGame )
            // InternalChessDSL.g:4847:3: ruleGame
            {
             before(grammarAccess.getModelAccess().getGameGameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleGame();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGameGameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GameAssignment"


    // $ANTLR start "rule__Game__TitleAssignment_1"
    // InternalChessDSL.g:4856:1: rule__Game__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Game__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4860:1: ( ( RULE_STRING ) )
            // InternalChessDSL.g:4861:2: ( RULE_STRING )
            {
            // InternalChessDSL.g:4861:2: ( RULE_STRING )
            // InternalChessDSL.g:4862:3: RULE_STRING
            {
             before(grammarAccess.getGameAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getTitleSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__TitleAssignment_1"


    // $ANTLR start "rule__Game__PlayersAssignment_2_1"
    // InternalChessDSL.g:4871:1: rule__Game__PlayersAssignment_2_1 : ( rulePlayer ) ;
    public final void rule__Game__PlayersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4875:1: ( ( rulePlayer ) )
            // InternalChessDSL.g:4876:2: ( rulePlayer )
            {
            // InternalChessDSL.g:4876:2: ( rulePlayer )
            // InternalChessDSL.g:4877:3: rulePlayer
            {
             before(grammarAccess.getGameAccess().getPlayersPlayerParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlayer();

            state._fsp--;

             after(grammarAccess.getGameAccess().getPlayersPlayerParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__PlayersAssignment_2_1"


    // $ANTLR start "rule__Game__InitialAssignment_3"
    // InternalChessDSL.g:4886:1: rule__Game__InitialAssignment_3 : ( ruleInitialState ) ;
    public final void rule__Game__InitialAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4890:1: ( ( ruleInitialState ) )
            // InternalChessDSL.g:4891:2: ( ruleInitialState )
            {
            // InternalChessDSL.g:4891:2: ( ruleInitialState )
            // InternalChessDSL.g:4892:3: ruleInitialState
            {
             before(grammarAccess.getGameAccess().getInitialInitialStateParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInitialState();

            state._fsp--;

             after(grammarAccess.getGameAccess().getInitialInitialStateParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__InitialAssignment_3"


    // $ANTLR start "rule__Game__MovesAssignment_5"
    // InternalChessDSL.g:4901:1: rule__Game__MovesAssignment_5 : ( ruleMovePair ) ;
    public final void rule__Game__MovesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4905:1: ( ( ruleMovePair ) )
            // InternalChessDSL.g:4906:2: ( ruleMovePair )
            {
            // InternalChessDSL.g:4906:2: ( ruleMovePair )
            // InternalChessDSL.g:4907:3: ruleMovePair
            {
             before(grammarAccess.getGameAccess().getMovesMovePairParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleMovePair();

            state._fsp--;

             after(grammarAccess.getGameAccess().getMovesMovePairParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__MovesAssignment_5"


    // $ANTLR start "rule__Game__ConclusionAssignment_7"
    // InternalChessDSL.g:4916:1: rule__Game__ConclusionAssignment_7 : ( ruleConclusion ) ;
    public final void rule__Game__ConclusionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4920:1: ( ( ruleConclusion ) )
            // InternalChessDSL.g:4921:2: ( ruleConclusion )
            {
            // InternalChessDSL.g:4921:2: ( ruleConclusion )
            // InternalChessDSL.g:4922:3: ruleConclusion
            {
             before(grammarAccess.getGameAccess().getConclusionConclusionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleConclusion();

            state._fsp--;

             after(grammarAccess.getGameAccess().getConclusionConclusionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__ConclusionAssignment_7"


    // $ANTLR start "rule__Player__ColorAssignment_0"
    // InternalChessDSL.g:4931:1: rule__Player__ColorAssignment_0 : ( ruleColor ) ;
    public final void rule__Player__ColorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4935:1: ( ( ruleColor ) )
            // InternalChessDSL.g:4936:2: ( ruleColor )
            {
            // InternalChessDSL.g:4936:2: ( ruleColor )
            // InternalChessDSL.g:4937:3: ruleColor
            {
             before(grammarAccess.getPlayerAccess().getColorColorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getPlayerAccess().getColorColorEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__ColorAssignment_0"


    // $ANTLR start "rule__Player__NameAssignment_2"
    // InternalChessDSL.g:4946:1: rule__Player__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Player__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4950:1: ( ( RULE_STRING ) )
            // InternalChessDSL.g:4951:2: ( RULE_STRING )
            {
            // InternalChessDSL.g:4951:2: ( RULE_STRING )
            // InternalChessDSL.g:4952:3: RULE_STRING
            {
             before(grammarAccess.getPlayerAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__NameAssignment_2"


    // $ANTLR start "rule__InitialState__PositionsAssignment_2_1_1"
    // InternalChessDSL.g:4961:1: rule__InitialState__PositionsAssignment_2_1_1 : ( ruleCustomPositions ) ;
    public final void rule__InitialState__PositionsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4965:1: ( ( ruleCustomPositions ) )
            // InternalChessDSL.g:4966:2: ( ruleCustomPositions )
            {
            // InternalChessDSL.g:4966:2: ( ruleCustomPositions )
            // InternalChessDSL.g:4967:3: ruleCustomPositions
            {
             before(grammarAccess.getInitialStateAccess().getPositionsCustomPositionsParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCustomPositions();

            state._fsp--;

             after(grammarAccess.getInitialStateAccess().getPositionsCustomPositionsParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__PositionsAssignment_2_1_1"


    // $ANTLR start "rule__CustomPositions__PlacementAssignment_3"
    // InternalChessDSL.g:4976:1: rule__CustomPositions__PlacementAssignment_3 : ( rulePlacement ) ;
    public final void rule__CustomPositions__PlacementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4980:1: ( ( rulePlacement ) )
            // InternalChessDSL.g:4981:2: ( rulePlacement )
            {
            // InternalChessDSL.g:4981:2: ( rulePlacement )
            // InternalChessDSL.g:4982:3: rulePlacement
            {
             before(grammarAccess.getCustomPositionsAccess().getPlacementPlacementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePlacement();

            state._fsp--;

             after(grammarAccess.getCustomPositionsAccess().getPlacementPlacementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPositions__PlacementAssignment_3"


    // $ANTLR start "rule__Placement__PieceAssignment_0"
    // InternalChessDSL.g:4991:1: rule__Placement__PieceAssignment_0 : ( ruleCustomPiece ) ;
    public final void rule__Placement__PieceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4995:1: ( ( ruleCustomPiece ) )
            // InternalChessDSL.g:4996:2: ( ruleCustomPiece )
            {
            // InternalChessDSL.g:4996:2: ( ruleCustomPiece )
            // InternalChessDSL.g:4997:3: ruleCustomPiece
            {
             before(grammarAccess.getPlacementAccess().getPieceCustomPieceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCustomPiece();

            state._fsp--;

             after(grammarAccess.getPlacementAccess().getPieceCustomPieceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__PieceAssignment_0"


    // $ANTLR start "rule__Placement__SquareAssignment_2"
    // InternalChessDSL.g:5006:1: rule__Placement__SquareAssignment_2 : ( ruleSquare ) ;
    public final void rule__Placement__SquareAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5010:1: ( ( ruleSquare ) )
            // InternalChessDSL.g:5011:2: ( ruleSquare )
            {
            // InternalChessDSL.g:5011:2: ( ruleSquare )
            // InternalChessDSL.g:5012:3: ruleSquare
            {
             before(grammarAccess.getPlacementAccess().getSquareSquareParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSquare();

            state._fsp--;

             after(grammarAccess.getPlacementAccess().getSquareSquareParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Placement__SquareAssignment_2"


    // $ANTLR start "rule__CustomPiece__ColorAssignment_0"
    // InternalChessDSL.g:5021:1: rule__CustomPiece__ColorAssignment_0 : ( ruleColor ) ;
    public final void rule__CustomPiece__ColorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5025:1: ( ( ruleColor ) )
            // InternalChessDSL.g:5026:2: ( ruleColor )
            {
            // InternalChessDSL.g:5026:2: ( ruleColor )
            // InternalChessDSL.g:5027:3: ruleColor
            {
             before(grammarAccess.getCustomPieceAccess().getColorColorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getCustomPieceAccess().getColorColorEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPiece__ColorAssignment_0"


    // $ANTLR start "rule__CustomPiece__KindAssignment_1"
    // InternalChessDSL.g:5036:1: rule__CustomPiece__KindAssignment_1 : ( rulePiece ) ;
    public final void rule__CustomPiece__KindAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5040:1: ( ( rulePiece ) )
            // InternalChessDSL.g:5041:2: ( rulePiece )
            {
            // InternalChessDSL.g:5041:2: ( rulePiece )
            // InternalChessDSL.g:5042:3: rulePiece
            {
             before(grammarAccess.getCustomPieceAccess().getKindPieceEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePiece();

            state._fsp--;

             after(grammarAccess.getCustomPieceAccess().getKindPieceEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomPiece__KindAssignment_1"


    // $ANTLR start "rule__MovePair__MoveNumberAssignment_0"
    // InternalChessDSL.g:5051:1: rule__MovePair__MoveNumberAssignment_0 : ( ruleMOVENUMBER ) ;
    public final void rule__MovePair__MoveNumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5055:1: ( ( ruleMOVENUMBER ) )
            // InternalChessDSL.g:5056:2: ( ruleMOVENUMBER )
            {
            // InternalChessDSL.g:5056:2: ( ruleMOVENUMBER )
            // InternalChessDSL.g:5057:3: ruleMOVENUMBER
            {
             before(grammarAccess.getMovePairAccess().getMoveNumberMOVENUMBERParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMOVENUMBER();

            state._fsp--;

             after(grammarAccess.getMovePairAccess().getMoveNumberMOVENUMBERParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovePair__MoveNumberAssignment_0"


    // $ANTLR start "rule__MovePair__Color1Assignment_1_0_0"
    // InternalChessDSL.g:5066:1: rule__MovePair__Color1Assignment_1_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__MovePair__Color1Assignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5070:1: ( ( ( RULE_ID ) ) )
            // InternalChessDSL.g:5071:2: ( ( RULE_ID ) )
            {
            // InternalChessDSL.g:5071:2: ( ( RULE_ID ) )
            // InternalChessDSL.g:5072:3: ( RULE_ID )
            {
             before(grammarAccess.getMovePairAccess().getColor1PlayerOrColorCrossReference_1_0_0_0()); 
            // InternalChessDSL.g:5073:3: ( RULE_ID )
            // InternalChessDSL.g:5074:4: RULE_ID
            {
             before(grammarAccess.getMovePairAccess().getColor1PlayerOrColorIDTerminalRuleCall_1_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMovePairAccess().getColor1PlayerOrColorIDTerminalRuleCall_1_0_0_0_1()); 

            }

             after(grammarAccess.getMovePairAccess().getColor1PlayerOrColorCrossReference_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovePair__Color1Assignment_1_0_0"


    // $ANTLR start "rule__MovePair__WhiteMoveAssignment_1_0_1"
    // InternalChessDSL.g:5085:1: rule__MovePair__WhiteMoveAssignment_1_0_1 : ( ruleAnyMove ) ;
    public final void rule__MovePair__WhiteMoveAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5089:1: ( ( ruleAnyMove ) )
            // InternalChessDSL.g:5090:2: ( ruleAnyMove )
            {
            // InternalChessDSL.g:5090:2: ( ruleAnyMove )
            // InternalChessDSL.g:5091:3: ruleAnyMove
            {
             before(grammarAccess.getMovePairAccess().getWhiteMoveAnyMoveParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnyMove();

            state._fsp--;

             after(grammarAccess.getMovePairAccess().getWhiteMoveAnyMoveParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovePair__WhiteMoveAssignment_1_0_1"


    // $ANTLR start "rule__MovePair__Color2Assignment_2_0"
    // InternalChessDSL.g:5100:1: rule__MovePair__Color2Assignment_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__MovePair__Color2Assignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5104:1: ( ( ( RULE_ID ) ) )
            // InternalChessDSL.g:5105:2: ( ( RULE_ID ) )
            {
            // InternalChessDSL.g:5105:2: ( ( RULE_ID ) )
            // InternalChessDSL.g:5106:3: ( RULE_ID )
            {
             before(grammarAccess.getMovePairAccess().getColor2PlayerOrColorCrossReference_2_0_0()); 
            // InternalChessDSL.g:5107:3: ( RULE_ID )
            // InternalChessDSL.g:5108:4: RULE_ID
            {
             before(grammarAccess.getMovePairAccess().getColor2PlayerOrColorIDTerminalRuleCall_2_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMovePairAccess().getColor2PlayerOrColorIDTerminalRuleCall_2_0_0_1()); 

            }

             after(grammarAccess.getMovePairAccess().getColor2PlayerOrColorCrossReference_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovePair__Color2Assignment_2_0"


    // $ANTLR start "rule__MovePair__BlackMoveAssignment_2_1"
    // InternalChessDSL.g:5119:1: rule__MovePair__BlackMoveAssignment_2_1 : ( ruleAnyMove ) ;
    public final void rule__MovePair__BlackMoveAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5123:1: ( ( ruleAnyMove ) )
            // InternalChessDSL.g:5124:2: ( ruleAnyMove )
            {
            // InternalChessDSL.g:5124:2: ( ruleAnyMove )
            // InternalChessDSL.g:5125:3: ruleAnyMove
            {
             before(grammarAccess.getMovePairAccess().getBlackMoveAnyMoveParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnyMove();

            state._fsp--;

             after(grammarAccess.getMovePairAccess().getBlackMoveAnyMoveParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovePair__BlackMoveAssignment_2_1"


    // $ANTLR start "rule__AnyMove__MoveAssignment_0"
    // InternalChessDSL.g:5134:1: rule__AnyMove__MoveAssignment_0 : ( ruleDSLMove ) ;
    public final void rule__AnyMove__MoveAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5138:1: ( ( ruleDSLMove ) )
            // InternalChessDSL.g:5139:2: ( ruleDSLMove )
            {
            // InternalChessDSL.g:5139:2: ( ruleDSLMove )
            // InternalChessDSL.g:5140:3: ruleDSLMove
            {
             before(grammarAccess.getAnyMoveAccess().getMoveDSLMoveParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDSLMove();

            state._fsp--;

             after(grammarAccess.getAnyMoveAccess().getMoveDSLMoveParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyMove__MoveAssignment_0"


    // $ANTLR start "rule__AnyMove__RemarksAssignment_1_1"
    // InternalChessDSL.g:5149:1: rule__AnyMove__RemarksAssignment_1_1 : ( ruleRemark ) ;
    public final void rule__AnyMove__RemarksAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5153:1: ( ( ruleRemark ) )
            // InternalChessDSL.g:5154:2: ( ruleRemark )
            {
            // InternalChessDSL.g:5154:2: ( ruleRemark )
            // InternalChessDSL.g:5155:3: ruleRemark
            {
             before(grammarAccess.getAnyMoveAccess().getRemarksRemarkEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRemark();

            state._fsp--;

             after(grammarAccess.getAnyMoveAccess().getRemarksRemarkEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyMove__RemarksAssignment_1_1"


    // $ANTLR start "rule__Move__PieceAssignment_1"
    // InternalChessDSL.g:5164:1: rule__Move__PieceAssignment_1 : ( rulePiece ) ;
    public final void rule__Move__PieceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5168:1: ( ( rulePiece ) )
            // InternalChessDSL.g:5169:2: ( rulePiece )
            {
            // InternalChessDSL.g:5169:2: ( rulePiece )
            // InternalChessDSL.g:5170:3: rulePiece
            {
             before(grammarAccess.getMoveAccess().getPiecePieceEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePiece();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getPiecePieceEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__PieceAssignment_1"


    // $ANTLR start "rule__Move__FromAssignment_2_0_1"
    // InternalChessDSL.g:5179:1: rule__Move__FromAssignment_2_0_1 : ( ruleSquare ) ;
    public final void rule__Move__FromAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5183:1: ( ( ruleSquare ) )
            // InternalChessDSL.g:5184:2: ( ruleSquare )
            {
            // InternalChessDSL.g:5184:2: ( ruleSquare )
            // InternalChessDSL.g:5185:3: ruleSquare
            {
             before(grammarAccess.getMoveAccess().getFromSquareParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSquare();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getFromSquareParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__FromAssignment_2_0_1"


    // $ANTLR start "rule__Move__ToAssignment_2_0_3"
    // InternalChessDSL.g:5194:1: rule__Move__ToAssignment_2_0_3 : ( ruleSquare ) ;
    public final void rule__Move__ToAssignment_2_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5198:1: ( ( ruleSquare ) )
            // InternalChessDSL.g:5199:2: ( ruleSquare )
            {
            // InternalChessDSL.g:5199:2: ( ruleSquare )
            // InternalChessDSL.g:5200:3: ruleSquare
            {
             before(grammarAccess.getMoveAccess().getToSquareParserRuleCall_2_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSquare();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getToSquareParserRuleCall_2_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__ToAssignment_2_0_3"


    // $ANTLR start "rule__Move__FromAssignment_2_1_1"
    // InternalChessDSL.g:5209:1: rule__Move__FromAssignment_2_1_1 : ( ruleSquare ) ;
    public final void rule__Move__FromAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5213:1: ( ( ruleSquare ) )
            // InternalChessDSL.g:5214:2: ( ruleSquare )
            {
            // InternalChessDSL.g:5214:2: ( ruleSquare )
            // InternalChessDSL.g:5215:3: ruleSquare
            {
             before(grammarAccess.getMoveAccess().getFromSquareParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSquare();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getFromSquareParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__FromAssignment_2_1_1"


    // $ANTLR start "rule__Move__ToAssignment_2_1_3"
    // InternalChessDSL.g:5224:1: rule__Move__ToAssignment_2_1_3 : ( ruleSquare ) ;
    public final void rule__Move__ToAssignment_2_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5228:1: ( ( ruleSquare ) )
            // InternalChessDSL.g:5229:2: ( ruleSquare )
            {
            // InternalChessDSL.g:5229:2: ( ruleSquare )
            // InternalChessDSL.g:5230:3: ruleSquare
            {
             before(grammarAccess.getMoveAccess().getToSquareParserRuleCall_2_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSquare();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getToSquareParserRuleCall_2_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__ToAssignment_2_1_3"


    // $ANTLR start "rule__Capture__MoveAssignment_0"
    // InternalChessDSL.g:5239:1: rule__Capture__MoveAssignment_0 : ( ruleMove ) ;
    public final void rule__Capture__MoveAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5243:1: ( ( ruleMove ) )
            // InternalChessDSL.g:5244:2: ( ruleMove )
            {
            // InternalChessDSL.g:5244:2: ( ruleMove )
            // InternalChessDSL.g:5245:3: ruleMove
            {
             before(grammarAccess.getCaptureAccess().getMoveMoveParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getCaptureAccess().getMoveMoveParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capture__MoveAssignment_0"


    // $ANTLR start "rule__Capture__CaptureAssignment_1_0_1"
    // InternalChessDSL.g:5254:1: rule__Capture__CaptureAssignment_1_0_1 : ( rulePiece ) ;
    public final void rule__Capture__CaptureAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5258:1: ( ( rulePiece ) )
            // InternalChessDSL.g:5259:2: ( rulePiece )
            {
            // InternalChessDSL.g:5259:2: ( rulePiece )
            // InternalChessDSL.g:5260:3: rulePiece
            {
             before(grammarAccess.getCaptureAccess().getCapturePieceEnumRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            rulePiece();

            state._fsp--;

             after(grammarAccess.getCaptureAccess().getCapturePieceEnumRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capture__CaptureAssignment_1_0_1"


    // $ANTLR start "rule__Capture__CaptureAssignment_1_1_2"
    // InternalChessDSL.g:5269:1: rule__Capture__CaptureAssignment_1_1_2 : ( rulePiece ) ;
    public final void rule__Capture__CaptureAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5273:1: ( ( rulePiece ) )
            // InternalChessDSL.g:5274:2: ( rulePiece )
            {
            // InternalChessDSL.g:5274:2: ( rulePiece )
            // InternalChessDSL.g:5275:3: rulePiece
            {
             before(grammarAccess.getCaptureAccess().getCapturePieceEnumRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePiece();

            state._fsp--;

             after(grammarAccess.getCaptureAccess().getCapturePieceEnumRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capture__CaptureAssignment_1_1_2"


    // $ANTLR start "rule__Castle__SideAssignment_0_1"
    // InternalChessDSL.g:5284:1: rule__Castle__SideAssignment_0_1 : ( ( rule__Castle__SideAlternatives_0_1_0 ) ) ;
    public final void rule__Castle__SideAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5288:1: ( ( ( rule__Castle__SideAlternatives_0_1_0 ) ) )
            // InternalChessDSL.g:5289:2: ( ( rule__Castle__SideAlternatives_0_1_0 ) )
            {
            // InternalChessDSL.g:5289:2: ( ( rule__Castle__SideAlternatives_0_1_0 ) )
            // InternalChessDSL.g:5290:3: ( rule__Castle__SideAlternatives_0_1_0 )
            {
             before(grammarAccess.getCastleAccess().getSideAlternatives_0_1_0()); 
            // InternalChessDSL.g:5291:3: ( rule__Castle__SideAlternatives_0_1_0 )
            // InternalChessDSL.g:5291:4: rule__Castle__SideAlternatives_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Castle__SideAlternatives_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCastleAccess().getSideAlternatives_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__SideAssignment_0_1"


    // $ANTLR start "rule__Castle__SideAssignment_1_2"
    // InternalChessDSL.g:5299:1: rule__Castle__SideAssignment_1_2 : ( ( rule__Castle__SideAlternatives_1_2_0 ) ) ;
    public final void rule__Castle__SideAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5303:1: ( ( ( rule__Castle__SideAlternatives_1_2_0 ) ) )
            // InternalChessDSL.g:5304:2: ( ( rule__Castle__SideAlternatives_1_2_0 ) )
            {
            // InternalChessDSL.g:5304:2: ( ( rule__Castle__SideAlternatives_1_2_0 ) )
            // InternalChessDSL.g:5305:3: ( rule__Castle__SideAlternatives_1_2_0 )
            {
             before(grammarAccess.getCastleAccess().getSideAlternatives_1_2_0()); 
            // InternalChessDSL.g:5306:3: ( rule__Castle__SideAlternatives_1_2_0 )
            // InternalChessDSL.g:5306:4: rule__Castle__SideAlternatives_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Castle__SideAlternatives_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCastleAccess().getSideAlternatives_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__SideAssignment_1_2"


    // $ANTLR start "rule__Castle__MoveAssignment_2_0"
    // InternalChessDSL.g:5314:1: rule__Castle__MoveAssignment_2_0 : ( ruleMove ) ;
    public final void rule__Castle__MoveAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5318:1: ( ( ruleMove ) )
            // InternalChessDSL.g:5319:2: ( ruleMove )
            {
            // InternalChessDSL.g:5319:2: ( ruleMove )
            // InternalChessDSL.g:5320:3: ruleMove
            {
             before(grammarAccess.getCastleAccess().getMoveMoveParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getCastleAccess().getMoveMoveParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__MoveAssignment_2_0"


    // $ANTLR start "rule__Castle__SideAssignment_2_2"
    // InternalChessDSL.g:5329:1: rule__Castle__SideAssignment_2_2 : ( ( rule__Castle__SideAlternatives_2_2_0 ) ) ;
    public final void rule__Castle__SideAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5333:1: ( ( ( rule__Castle__SideAlternatives_2_2_0 ) ) )
            // InternalChessDSL.g:5334:2: ( ( rule__Castle__SideAlternatives_2_2_0 ) )
            {
            // InternalChessDSL.g:5334:2: ( ( rule__Castle__SideAlternatives_2_2_0 ) )
            // InternalChessDSL.g:5335:3: ( rule__Castle__SideAlternatives_2_2_0 )
            {
             before(grammarAccess.getCastleAccess().getSideAlternatives_2_2_0()); 
            // InternalChessDSL.g:5336:3: ( rule__Castle__SideAlternatives_2_2_0 )
            // InternalChessDSL.g:5336:4: rule__Castle__SideAlternatives_2_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Castle__SideAlternatives_2_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCastleAccess().getSideAlternatives_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__SideAssignment_2_2"


    // $ANTLR start "rule__Castle__MoveAssignment_3_0"
    // InternalChessDSL.g:5344:1: rule__Castle__MoveAssignment_3_0 : ( ruleMove ) ;
    public final void rule__Castle__MoveAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5348:1: ( ( ruleMove ) )
            // InternalChessDSL.g:5349:2: ( ruleMove )
            {
            // InternalChessDSL.g:5349:2: ( ruleMove )
            // InternalChessDSL.g:5350:3: ruleMove
            {
             before(grammarAccess.getCastleAccess().getMoveMoveParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getCastleAccess().getMoveMoveParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__MoveAssignment_3_0"


    // $ANTLR start "rule__Castle__SideAssignment_3_3"
    // InternalChessDSL.g:5359:1: rule__Castle__SideAssignment_3_3 : ( ( rule__Castle__SideAlternatives_3_3_0 ) ) ;
    public final void rule__Castle__SideAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5363:1: ( ( ( rule__Castle__SideAlternatives_3_3_0 ) ) )
            // InternalChessDSL.g:5364:2: ( ( rule__Castle__SideAlternatives_3_3_0 ) )
            {
            // InternalChessDSL.g:5364:2: ( ( rule__Castle__SideAlternatives_3_3_0 ) )
            // InternalChessDSL.g:5365:3: ( rule__Castle__SideAlternatives_3_3_0 )
            {
             before(grammarAccess.getCastleAccess().getSideAlternatives_3_3_0()); 
            // InternalChessDSL.g:5366:3: ( rule__Castle__SideAlternatives_3_3_0 )
            // InternalChessDSL.g:5366:4: rule__Castle__SideAlternatives_3_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Castle__SideAlternatives_3_3_0();

            state._fsp--;


            }

             after(grammarAccess.getCastleAccess().getSideAlternatives_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Castle__SideAssignment_3_3"


    // $ANTLR start "rule__EnPassant__CaptureAssignment_0"
    // InternalChessDSL.g:5374:1: rule__EnPassant__CaptureAssignment_0 : ( ruleCapture ) ;
    public final void rule__EnPassant__CaptureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5378:1: ( ( ruleCapture ) )
            // InternalChessDSL.g:5379:2: ( ruleCapture )
            {
            // InternalChessDSL.g:5379:2: ( ruleCapture )
            // InternalChessDSL.g:5380:3: ruleCapture
            {
             before(grammarAccess.getEnPassantAccess().getCaptureCaptureParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCapture();

            state._fsp--;

             after(grammarAccess.getEnPassantAccess().getCaptureCaptureParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnPassant__CaptureAssignment_0"


    // $ANTLR start "rule__EnPassant__SquareAssignment_2"
    // InternalChessDSL.g:5389:1: rule__EnPassant__SquareAssignment_2 : ( ruleSquare ) ;
    public final void rule__EnPassant__SquareAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5393:1: ( ( ruleSquare ) )
            // InternalChessDSL.g:5394:2: ( ruleSquare )
            {
            // InternalChessDSL.g:5394:2: ( ruleSquare )
            // InternalChessDSL.g:5395:3: ruleSquare
            {
             before(grammarAccess.getEnPassantAccess().getSquareSquareParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSquare();

            state._fsp--;

             after(grammarAccess.getEnPassantAccess().getSquareSquareParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnPassant__SquareAssignment_2"


    // $ANTLR start "rule__Promotion__MoveAssignment_0"
    // InternalChessDSL.g:5404:1: rule__Promotion__MoveAssignment_0 : ( ( rule__Promotion__MoveAlternatives_0_0 ) ) ;
    public final void rule__Promotion__MoveAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5408:1: ( ( ( rule__Promotion__MoveAlternatives_0_0 ) ) )
            // InternalChessDSL.g:5409:2: ( ( rule__Promotion__MoveAlternatives_0_0 ) )
            {
            // InternalChessDSL.g:5409:2: ( ( rule__Promotion__MoveAlternatives_0_0 ) )
            // InternalChessDSL.g:5410:3: ( rule__Promotion__MoveAlternatives_0_0 )
            {
             before(grammarAccess.getPromotionAccess().getMoveAlternatives_0_0()); 
            // InternalChessDSL.g:5411:3: ( rule__Promotion__MoveAlternatives_0_0 )
            // InternalChessDSL.g:5411:4: rule__Promotion__MoveAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Promotion__MoveAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getPromotionAccess().getMoveAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Promotion__MoveAssignment_0"


    // $ANTLR start "rule__Promotion__PieceAssignment_2"
    // InternalChessDSL.g:5419:1: rule__Promotion__PieceAssignment_2 : ( rulePiece ) ;
    public final void rule__Promotion__PieceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5423:1: ( ( rulePiece ) )
            // InternalChessDSL.g:5424:2: ( rulePiece )
            {
            // InternalChessDSL.g:5424:2: ( rulePiece )
            // InternalChessDSL.g:5425:3: rulePiece
            {
             before(grammarAccess.getPromotionAccess().getPiecePieceEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePiece();

            state._fsp--;

             after(grammarAccess.getPromotionAccess().getPiecePieceEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Promotion__PieceAssignment_2"


    // $ANTLR start "rule__Conclusion__MethodAssignment_0"
    // InternalChessDSL.g:5434:1: rule__Conclusion__MethodAssignment_0 : ( ruleMethod ) ;
    public final void rule__Conclusion__MethodAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5438:1: ( ( ruleMethod ) )
            // InternalChessDSL.g:5439:2: ( ruleMethod )
            {
            // InternalChessDSL.g:5439:2: ( ruleMethod )
            // InternalChessDSL.g:5440:3: ruleMethod
            {
             before(grammarAccess.getConclusionAccess().getMethodMethodParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getConclusionAccess().getMethodMethodParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conclusion__MethodAssignment_0"


    // $ANTLR start "rule__Conclusion__ResultAssignment_1"
    // InternalChessDSL.g:5449:1: rule__Conclusion__ResultAssignment_1 : ( ruleResult ) ;
    public final void rule__Conclusion__ResultAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5453:1: ( ( ruleResult ) )
            // InternalChessDSL.g:5454:2: ( ruleResult )
            {
            // InternalChessDSL.g:5454:2: ( ruleResult )
            // InternalChessDSL.g:5455:3: ruleResult
            {
             before(grammarAccess.getConclusionAccess().getResultResultParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleResult();

            state._fsp--;

             after(grammarAccess.getConclusionAccess().getResultResultParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conclusion__ResultAssignment_1"


    // $ANTLR start "rule__Method__WinAssignment_0"
    // InternalChessDSL.g:5464:1: rule__Method__WinAssignment_0 : ( ruleWin ) ;
    public final void rule__Method__WinAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5468:1: ( ( ruleWin ) )
            // InternalChessDSL.g:5469:2: ( ruleWin )
            {
            // InternalChessDSL.g:5469:2: ( ruleWin )
            // InternalChessDSL.g:5470:3: ruleWin
            {
             before(grammarAccess.getMethodAccess().getWinWinParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleWin();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getWinWinParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__WinAssignment_0"


    // $ANTLR start "rule__Method__DrawAssignment_1"
    // InternalChessDSL.g:5479:1: rule__Method__DrawAssignment_1 : ( ruleDraw ) ;
    public final void rule__Method__DrawAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5483:1: ( ( ruleDraw ) )
            // InternalChessDSL.g:5484:2: ( ruleDraw )
            {
            // InternalChessDSL.g:5484:2: ( ruleDraw )
            // InternalChessDSL.g:5485:3: ruleDraw
            {
             before(grammarAccess.getMethodAccess().getDrawDrawParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDraw();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getDrawDrawParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__DrawAssignment_1"


    // $ANTLR start "rule__Win__TimeAssignment_0"
    // InternalChessDSL.g:5494:1: rule__Win__TimeAssignment_0 : ( ruleTimeUp ) ;
    public final void rule__Win__TimeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5498:1: ( ( ruleTimeUp ) )
            // InternalChessDSL.g:5499:2: ( ruleTimeUp )
            {
            // InternalChessDSL.g:5499:2: ( ruleTimeUp )
            // InternalChessDSL.g:5500:3: ruleTimeUp
            {
             before(grammarAccess.getWinAccess().getTimeTimeUpParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeUp();

            state._fsp--;

             after(grammarAccess.getWinAccess().getTimeTimeUpParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Win__TimeAssignment_0"


    // $ANTLR start "rule__Win__ResignAssignment_1"
    // InternalChessDSL.g:5509:1: rule__Win__ResignAssignment_1 : ( ruleResign ) ;
    public final void rule__Win__ResignAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5513:1: ( ( ruleResign ) )
            // InternalChessDSL.g:5514:2: ( ruleResign )
            {
            // InternalChessDSL.g:5514:2: ( ruleResign )
            // InternalChessDSL.g:5515:3: ruleResign
            {
             before(grammarAccess.getWinAccess().getResignResignParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleResign();

            state._fsp--;

             after(grammarAccess.getWinAccess().getResignResignParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Win__ResignAssignment_1"


    // $ANTLR start "rule__Win__MateAssignment_2"
    // InternalChessDSL.g:5524:1: rule__Win__MateAssignment_2 : ( ruleCheckmate ) ;
    public final void rule__Win__MateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5528:1: ( ( ruleCheckmate ) )
            // InternalChessDSL.g:5529:2: ( ruleCheckmate )
            {
            // InternalChessDSL.g:5529:2: ( ruleCheckmate )
            // InternalChessDSL.g:5530:3: ruleCheckmate
            {
             before(grammarAccess.getWinAccess().getMateCheckmateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCheckmate();

            state._fsp--;

             after(grammarAccess.getWinAccess().getMateCheckmateParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Win__MateAssignment_2"


    // $ANTLR start "rule__TimeUp__PlayerAssignment_0"
    // InternalChessDSL.g:5539:1: rule__TimeUp__PlayerAssignment_0 : ( rulePlayerOrColor ) ;
    public final void rule__TimeUp__PlayerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5543:1: ( ( rulePlayerOrColor ) )
            // InternalChessDSL.g:5544:2: ( rulePlayerOrColor )
            {
            // InternalChessDSL.g:5544:2: ( rulePlayerOrColor )
            // InternalChessDSL.g:5545:3: rulePlayerOrColor
            {
             before(grammarAccess.getTimeUpAccess().getPlayerPlayerOrColorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePlayerOrColor();

            state._fsp--;

             after(grammarAccess.getTimeUpAccess().getPlayerPlayerOrColorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeUp__PlayerAssignment_0"


    // $ANTLR start "rule__Resign__PlayerAssignment_0"
    // InternalChessDSL.g:5554:1: rule__Resign__PlayerAssignment_0 : ( rulePlayerOrColor ) ;
    public final void rule__Resign__PlayerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5558:1: ( ( rulePlayerOrColor ) )
            // InternalChessDSL.g:5559:2: ( rulePlayerOrColor )
            {
            // InternalChessDSL.g:5559:2: ( rulePlayerOrColor )
            // InternalChessDSL.g:5560:3: rulePlayerOrColor
            {
             before(grammarAccess.getResignAccess().getPlayerPlayerOrColorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePlayerOrColor();

            state._fsp--;

             after(grammarAccess.getResignAccess().getPlayerPlayerOrColorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resign__PlayerAssignment_0"


    // $ANTLR start "rule__Checkmate__Player1Assignment_0"
    // InternalChessDSL.g:5569:1: rule__Checkmate__Player1Assignment_0 : ( rulePlayerOrColor ) ;
    public final void rule__Checkmate__Player1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5573:1: ( ( rulePlayerOrColor ) )
            // InternalChessDSL.g:5574:2: ( rulePlayerOrColor )
            {
            // InternalChessDSL.g:5574:2: ( rulePlayerOrColor )
            // InternalChessDSL.g:5575:3: rulePlayerOrColor
            {
             before(grammarAccess.getCheckmateAccess().getPlayer1PlayerOrColorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePlayerOrColor();

            state._fsp--;

             after(grammarAccess.getCheckmateAccess().getPlayer1PlayerOrColorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkmate__Player1Assignment_0"


    // $ANTLR start "rule__Checkmate__Player2Assignment_2"
    // InternalChessDSL.g:5584:1: rule__Checkmate__Player2Assignment_2 : ( rulePlayerOrColor ) ;
    public final void rule__Checkmate__Player2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5588:1: ( ( rulePlayerOrColor ) )
            // InternalChessDSL.g:5589:2: ( rulePlayerOrColor )
            {
            // InternalChessDSL.g:5589:2: ( rulePlayerOrColor )
            // InternalChessDSL.g:5590:3: rulePlayerOrColor
            {
             before(grammarAccess.getCheckmateAccess().getPlayer2PlayerOrColorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlayerOrColor();

            state._fsp--;

             after(grammarAccess.getCheckmateAccess().getPlayer2PlayerOrColorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checkmate__Player2Assignment_2"


    // $ANTLR start "rule__Draw__Player1Assignment_0"
    // InternalChessDSL.g:5599:1: rule__Draw__Player1Assignment_0 : ( rulePlayerOrColor ) ;
    public final void rule__Draw__Player1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5603:1: ( ( rulePlayerOrColor ) )
            // InternalChessDSL.g:5604:2: ( rulePlayerOrColor )
            {
            // InternalChessDSL.g:5604:2: ( rulePlayerOrColor )
            // InternalChessDSL.g:5605:3: rulePlayerOrColor
            {
             before(grammarAccess.getDrawAccess().getPlayer1PlayerOrColorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePlayerOrColor();

            state._fsp--;

             after(grammarAccess.getDrawAccess().getPlayer1PlayerOrColorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Draw__Player1Assignment_0"


    // $ANTLR start "rule__Draw__Player2Assignment_2"
    // InternalChessDSL.g:5614:1: rule__Draw__Player2Assignment_2 : ( rulePlayerOrColor ) ;
    public final void rule__Draw__Player2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5618:1: ( ( rulePlayerOrColor ) )
            // InternalChessDSL.g:5619:2: ( rulePlayerOrColor )
            {
            // InternalChessDSL.g:5619:2: ( rulePlayerOrColor )
            // InternalChessDSL.g:5620:3: rulePlayerOrColor
            {
             before(grammarAccess.getDrawAccess().getPlayer2PlayerOrColorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlayerOrColor();

            state._fsp--;

             after(grammarAccess.getDrawAccess().getPlayer2PlayerOrColorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Draw__Player2Assignment_2"


    // $ANTLR start "rule__Draw__ResultAssignment_3"
    // InternalChessDSL.g:5629:1: rule__Draw__ResultAssignment_3 : ( ( rule__Draw__ResultAlternatives_3_0 ) ) ;
    public final void rule__Draw__ResultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5633:1: ( ( ( rule__Draw__ResultAlternatives_3_0 ) ) )
            // InternalChessDSL.g:5634:2: ( ( rule__Draw__ResultAlternatives_3_0 ) )
            {
            // InternalChessDSL.g:5634:2: ( ( rule__Draw__ResultAlternatives_3_0 ) )
            // InternalChessDSL.g:5635:3: ( rule__Draw__ResultAlternatives_3_0 )
            {
             before(grammarAccess.getDrawAccess().getResultAlternatives_3_0()); 
            // InternalChessDSL.g:5636:3: ( rule__Draw__ResultAlternatives_3_0 )
            // InternalChessDSL.g:5636:4: rule__Draw__ResultAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Draw__ResultAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getDrawAccess().getResultAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Draw__ResultAssignment_3"


    // $ANTLR start "rule__Result__PlayerAssignment_0_0_0"
    // InternalChessDSL.g:5644:1: rule__Result__PlayerAssignment_0_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Result__PlayerAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5648:1: ( ( ( RULE_ID ) ) )
            // InternalChessDSL.g:5649:2: ( ( RULE_ID ) )
            {
            // InternalChessDSL.g:5649:2: ( ( RULE_ID ) )
            // InternalChessDSL.g:5650:3: ( RULE_ID )
            {
             before(grammarAccess.getResultAccess().getPlayerPlayerCrossReference_0_0_0_0()); 
            // InternalChessDSL.g:5651:3: ( RULE_ID )
            // InternalChessDSL.g:5652:4: RULE_ID
            {
             before(grammarAccess.getResultAccess().getPlayerPlayerIDTerminalRuleCall_0_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResultAccess().getPlayerPlayerIDTerminalRuleCall_0_0_0_0_1()); 

            }

             after(grammarAccess.getResultAccess().getPlayerPlayerCrossReference_0_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Result__PlayerAssignment_0_0_0"


    // $ANTLR start "rule__Result__ColorAssignment_0_0_1"
    // InternalChessDSL.g:5663:1: rule__Result__ColorAssignment_0_0_1 : ( ruleColor ) ;
    public final void rule__Result__ColorAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5667:1: ( ( ruleColor ) )
            // InternalChessDSL.g:5668:2: ( ruleColor )
            {
            // InternalChessDSL.g:5668:2: ( ruleColor )
            // InternalChessDSL.g:5669:3: ruleColor
            {
             before(grammarAccess.getResultAccess().getColorColorEnumRuleCall_0_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getResultAccess().getColorColorEnumRuleCall_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Result__ColorAssignment_0_0_1"


    // $ANTLR start "rule__PlayerOrColor__PlayerAssignment_0"
    // InternalChessDSL.g:5678:1: rule__PlayerOrColor__PlayerAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PlayerOrColor__PlayerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5682:1: ( ( ( RULE_ID ) ) )
            // InternalChessDSL.g:5683:2: ( ( RULE_ID ) )
            {
            // InternalChessDSL.g:5683:2: ( ( RULE_ID ) )
            // InternalChessDSL.g:5684:3: ( RULE_ID )
            {
             before(grammarAccess.getPlayerOrColorAccess().getPlayerPlayerCrossReference_0_0()); 
            // InternalChessDSL.g:5685:3: ( RULE_ID )
            // InternalChessDSL.g:5686:4: RULE_ID
            {
             before(grammarAccess.getPlayerOrColorAccess().getPlayerPlayerIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPlayerOrColorAccess().getPlayerPlayerIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPlayerOrColorAccess().getPlayerPlayerCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerOrColor__PlayerAssignment_0"


    // $ANTLR start "rule__PlayerOrColor__ColorAssignment_1"
    // InternalChessDSL.g:5697:1: rule__PlayerOrColor__ColorAssignment_1 : ( ruleColor ) ;
    public final void rule__PlayerOrColor__ColorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5701:1: ( ( ruleColor ) )
            // InternalChessDSL.g:5702:2: ( ruleColor )
            {
            // InternalChessDSL.g:5702:2: ( ruleColor )
            // InternalChessDSL.g:5703:3: ruleColor
            {
             before(grammarAccess.getPlayerOrColorAccess().getColorColorEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getPlayerOrColorAccess().getColorColorEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerOrColor__ColorAssignment_1"


    // $ANTLR start "rule__Square__SquareAssignment"
    // InternalChessDSL.g:5712:1: rule__Square__SquareAssignment : ( RULE_SQUARETERMINAL ) ;
    public final void rule__Square__SquareAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5716:1: ( ( RULE_SQUARETERMINAL ) )
            // InternalChessDSL.g:5717:2: ( RULE_SQUARETERMINAL )
            {
            // InternalChessDSL.g:5717:2: ( RULE_SQUARETERMINAL )
            // InternalChessDSL.g:5718:3: RULE_SQUARETERMINAL
            {
             before(grammarAccess.getSquareAccess().getSquareSQUARETERMINALTerminalRuleCall_0()); 
            match(input,RULE_SQUARETERMINAL,FOLLOW_2); 
             after(grammarAccess.getSquareAccess().getSquareSQUARETERMINALTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Square__SquareAssignment"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String dfa_1s = "\53\uffff";
    static final String dfa_2s = "\21\uffff\2\30\16\uffff\6\52\1\uffff\1\52\2\uffff";
    static final String dfa_3s = "\2\34\6\55\2\uffff\2\7\1\61\1\63\2\7\1\56\2\4\1\20\1\34\1\66\1\34\2\uffff\10\56\6\4\1\uffff\1\4\2\uffff";
    static final String dfa_4s = "\1\70\1\41\6\62\2\uffff\2\7\1\61\1\63\2\7\1\56\2\72\1\21\1\41\1\70\1\41\2\uffff\10\56\6\72\1\uffff\1\72\2\uffff";
    static final String dfa_5s = "\10\uffff\1\3\1\6\15\uffff\1\5\1\1\16\uffff\1\1\1\uffff\1\4\1\2";
    static final String dfa_6s = "\53\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\3\1\4\1\5\1\6\1\7\15\uffff\1\11\1\1\6\uffff\2\10",
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
            "\1\30\1\uffff\1\30\25\uffff\6\30\2\uffff\1\30\10\uffff\1\30\1\uffff\2\30\3\uffff\1\24\1\25\1\26\1\23\1\30\1\uffff\1\27",
            "\1\30\1\uffff\1\30\25\uffff\6\30\2\uffff\1\30\10\uffff\1\30\1\uffff\2\30\3\uffff\1\24\1\25\1\26\1\23\1\30\1\uffff\1\27",
            "\1\31\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40",
            "\1\26\1\uffff\1\10",
            "\1\41\1\42\1\43\1\44\1\45\1\46",
            "",
            "",
            "\1\47",
            "\1\47",
            "\1\50",
            "\1\50",
            "\1\50",
            "\1\50",
            "\1\50",
            "\1\50",
            "\1\52\1\uffff\1\52\7\uffff\1\51\15\uffff\6\52\2\uffff\1\52\10\uffff\1\52\1\uffff\2\52\6\uffff\2\52\1\uffff\1\27",
            "\1\52\1\uffff\1\52\7\uffff\1\51\15\uffff\6\52\2\uffff\1\52\10\uffff\1\52\1\uffff\2\52\6\uffff\2\52\1\uffff\1\27",
            "\1\52\1\uffff\1\52\7\uffff\1\51\15\uffff\6\52\2\uffff\1\52\10\uffff\1\52\1\uffff\2\52\6\uffff\2\52\1\uffff\1\27",
            "\1\52\1\uffff\1\52\7\uffff\1\51\15\uffff\6\52\2\uffff\1\52\10\uffff\1\52\1\uffff\2\52\6\uffff\2\52\1\uffff\1\27",
            "\1\52\1\uffff\1\52\7\uffff\1\51\15\uffff\6\52\2\uffff\1\52\10\uffff\1\52\1\uffff\2\52\6\uffff\2\52\1\uffff\1\27",
            "\1\52\1\uffff\1\52\7\uffff\1\51\15\uffff\6\52\2\uffff\1\52\10\uffff\1\52\1\uffff\2\52\6\uffff\2\52\1\uffff\1\27",
            "",
            "\1\52\1\uffff\1\52\7\uffff\1\51\15\uffff\6\52\2\uffff\1\52\10\uffff\1\52\1\uffff\2\52\6\uffff\2\52\1\uffff\1\27",
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "946:1: rule__DSLMove__Alternatives : ( ( ruleMove ) | ( ruleCapture ) | ( ruleCastle ) | ( ruleEnPassant ) | ( rulePromotion ) | ( ruleDummy ) );";
        }
    }
    static final String dfa_8s = "\25\uffff";
    static final String dfa_9s = "\1\34\2\uffff\1\34\6\55\2\7\1\61\1\63\2\7\1\56\2\65\2\uffff";
    static final String dfa_10s = "\1\70\2\uffff\1\41\6\62\2\7\1\61\1\63\2\7\1\56\2\67\2\uffff";
    static final String dfa_11s = "\1\uffff\1\1\1\2\20\uffff\1\3\1\4";
    static final String dfa_12s = "\25\uffff}>";
    static final String[] dfa_13s = {
            "\1\4\1\5\1\6\1\7\1\10\1\11\16\uffff\1\3\6\uffff\1\1\1\2",
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

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1033:1: rule__Castle__Alternatives : ( ( ( rule__Castle__Group_0__0 ) ) | ( ( rule__Castle__Group_1__0 ) ) | ( ( rule__Castle__Group_2__0 ) ) | ( ( rule__Castle__Group_3__0 ) ) );";
        }
    }
    static final String dfa_14s = "\23\uffff";
    static final String dfa_15s = "\2\34\6\55\2\7\1\61\1\63\2\7\1\56\2\64\2\uffff";
    static final String dfa_16s = "\1\60\1\41\6\62\2\7\1\61\1\63\2\7\1\56\2\72\2\uffff";
    static final String dfa_17s = "\21\uffff\1\2\1\1";
    static final String dfa_18s = "\23\uffff}>";
    static final String[] dfa_19s = {
            "\1\2\1\3\1\4\1\5\1\6\1\7\16\uffff\1\1",
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
            "\3\21\3\uffff\1\22",
            "\3\21\3\uffff\1\22",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1150:1: rule__Promotion__MoveAlternatives_0_0 : ( ( ruleMove ) | ( ruleCapture ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000A800000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000C040040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000C000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000C000042L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000010000001000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000008000C000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000003F0000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x01818003F0008040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x01818003F0000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000400003F80000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000003F80002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00010003F0000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0004200000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0070000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004442L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});

}