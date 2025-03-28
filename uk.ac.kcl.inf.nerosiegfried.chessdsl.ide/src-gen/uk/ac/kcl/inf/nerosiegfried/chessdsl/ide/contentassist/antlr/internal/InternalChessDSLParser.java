package uk.ac.kcl.inf.nerosiegfried.chessdsl.ide.contentassist.antlr.internal;

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
import uk.ac.kcl.inf.nerosiegfried.chessdsl.services.ChessDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalChessDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SQUARETERMINAL", "RULE_STRING", "RULE_MOVENUMBER", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'dummy'", "'fresh'", "'='", "'on'", "'...'", "'Kingside'", "'Queenside'", "'draw'", "'Good'", "'Bad'", "'Excellent'", "'Risky'", "'Dubious'", "'Check'", "'Checkmate'", "'White'", "'Black'", "'King'", "'Queen'", "'Rook'", "'Bishop'", "'Knight'", "'Pawn'", "'Game'", "'Moves:'", "'end'", "'Players:'", "':'", "'InitialState'", "'custom'", "'Positions:'", "'{'", "'}'", "'('", "')'", "'moves'", "'->'", "'from'", "'to'", "'Capture('", "'and'", "'captures'", "'Castle('", "'castles'", "'the'", "'Castle()'", "'Promotion('", "'ran'", "'out'", "'of'", "'time'", "'resigned'", "'checkmated'", "'ended'", "'game'", "'in'", "'a'", "'stalemate'", "'repeated'", "'position'", "'three'", "'times'", "'played'", "'fifty'", "'without'", "'capture'", "'agreed'", "'wins'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int RULE_MOVENUMBER=6;
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
    public static final int RULE_ID=7;
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
    public static final int RULE_STRING=5;
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
    public static final int RULE_SQUARETERMINAL=4;
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


    // $ANTLR start "entryRuleAnyMove"
    // InternalChessDSL.g:253:1: entryRuleAnyMove : ruleAnyMove EOF ;
    public final void entryRuleAnyMove() throws RecognitionException {
        try {
            // InternalChessDSL.g:254:1: ( ruleAnyMove EOF )
            // InternalChessDSL.g:255:1: ruleAnyMove EOF
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
    // InternalChessDSL.g:262:1: ruleAnyMove : ( ( rule__AnyMove__Group__0 ) ) ;
    public final void ruleAnyMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:266:2: ( ( ( rule__AnyMove__Group__0 ) ) )
            // InternalChessDSL.g:267:2: ( ( rule__AnyMove__Group__0 ) )
            {
            // InternalChessDSL.g:267:2: ( ( rule__AnyMove__Group__0 ) )
            // InternalChessDSL.g:268:3: ( rule__AnyMove__Group__0 )
            {
             before(grammarAccess.getAnyMoveAccess().getGroup()); 
            // InternalChessDSL.g:269:3: ( rule__AnyMove__Group__0 )
            // InternalChessDSL.g:269:4: rule__AnyMove__Group__0
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
    // InternalChessDSL.g:278:1: entryRuleDSLMove : ruleDSLMove EOF ;
    public final void entryRuleDSLMove() throws RecognitionException {
        try {
            // InternalChessDSL.g:279:1: ( ruleDSLMove EOF )
            // InternalChessDSL.g:280:1: ruleDSLMove EOF
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
    // InternalChessDSL.g:287:1: ruleDSLMove : ( ( rule__DSLMove__Alternatives ) ) ;
    public final void ruleDSLMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:291:2: ( ( ( rule__DSLMove__Alternatives ) ) )
            // InternalChessDSL.g:292:2: ( ( rule__DSLMove__Alternatives ) )
            {
            // InternalChessDSL.g:292:2: ( ( rule__DSLMove__Alternatives ) )
            // InternalChessDSL.g:293:3: ( rule__DSLMove__Alternatives )
            {
             before(grammarAccess.getDSLMoveAccess().getAlternatives()); 
            // InternalChessDSL.g:294:3: ( rule__DSLMove__Alternatives )
            // InternalChessDSL.g:294:4: rule__DSLMove__Alternatives
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
    // InternalChessDSL.g:303:1: entryRuleDummy : ruleDummy EOF ;
    public final void entryRuleDummy() throws RecognitionException {
        try {
            // InternalChessDSL.g:304:1: ( ruleDummy EOF )
            // InternalChessDSL.g:305:1: ruleDummy EOF
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
    // InternalChessDSL.g:312:1: ruleDummy : ( 'dummy' ) ;
    public final void ruleDummy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:316:2: ( ( 'dummy' ) )
            // InternalChessDSL.g:317:2: ( 'dummy' )
            {
            // InternalChessDSL.g:317:2: ( 'dummy' )
            // InternalChessDSL.g:318:3: 'dummy'
            {
             before(grammarAccess.getDummyAccess().getDummyKeyword()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDummyAccess().getDummyKeyword()); 

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
    // InternalChessDSL.g:328:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // InternalChessDSL.g:329:1: ( ruleMove EOF )
            // InternalChessDSL.g:330:1: ruleMove EOF
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
    // InternalChessDSL.g:337:1: ruleMove : ( ( rule__Move__Group__0 ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:341:2: ( ( ( rule__Move__Group__0 ) ) )
            // InternalChessDSL.g:342:2: ( ( rule__Move__Group__0 ) )
            {
            // InternalChessDSL.g:342:2: ( ( rule__Move__Group__0 ) )
            // InternalChessDSL.g:343:3: ( rule__Move__Group__0 )
            {
             before(grammarAccess.getMoveAccess().getGroup()); 
            // InternalChessDSL.g:344:3: ( rule__Move__Group__0 )
            // InternalChessDSL.g:344:4: rule__Move__Group__0
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
    // InternalChessDSL.g:353:1: entryRuleCapture : ruleCapture EOF ;
    public final void entryRuleCapture() throws RecognitionException {
        try {
            // InternalChessDSL.g:354:1: ( ruleCapture EOF )
            // InternalChessDSL.g:355:1: ruleCapture EOF
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
    // InternalChessDSL.g:362:1: ruleCapture : ( ( rule__Capture__Group__0 ) ) ;
    public final void ruleCapture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:366:2: ( ( ( rule__Capture__Group__0 ) ) )
            // InternalChessDSL.g:367:2: ( ( rule__Capture__Group__0 ) )
            {
            // InternalChessDSL.g:367:2: ( ( rule__Capture__Group__0 ) )
            // InternalChessDSL.g:368:3: ( rule__Capture__Group__0 )
            {
             before(grammarAccess.getCaptureAccess().getGroup()); 
            // InternalChessDSL.g:369:3: ( rule__Capture__Group__0 )
            // InternalChessDSL.g:369:4: rule__Capture__Group__0
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
    // InternalChessDSL.g:378:1: entryRuleCastle : ruleCastle EOF ;
    public final void entryRuleCastle() throws RecognitionException {
        try {
            // InternalChessDSL.g:379:1: ( ruleCastle EOF )
            // InternalChessDSL.g:380:1: ruleCastle EOF
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
    // InternalChessDSL.g:387:1: ruleCastle : ( ( rule__Castle__Alternatives ) ) ;
    public final void ruleCastle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:391:2: ( ( ( rule__Castle__Alternatives ) ) )
            // InternalChessDSL.g:392:2: ( ( rule__Castle__Alternatives ) )
            {
            // InternalChessDSL.g:392:2: ( ( rule__Castle__Alternatives ) )
            // InternalChessDSL.g:393:3: ( rule__Castle__Alternatives )
            {
             before(grammarAccess.getCastleAccess().getAlternatives()); 
            // InternalChessDSL.g:394:3: ( rule__Castle__Alternatives )
            // InternalChessDSL.g:394:4: rule__Castle__Alternatives
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
    // InternalChessDSL.g:403:1: entryRuleEnPassant : ruleEnPassant EOF ;
    public final void entryRuleEnPassant() throws RecognitionException {
        try {
            // InternalChessDSL.g:404:1: ( ruleEnPassant EOF )
            // InternalChessDSL.g:405:1: ruleEnPassant EOF
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
    // InternalChessDSL.g:412:1: ruleEnPassant : ( ( rule__EnPassant__Group__0 ) ) ;
    public final void ruleEnPassant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:416:2: ( ( ( rule__EnPassant__Group__0 ) ) )
            // InternalChessDSL.g:417:2: ( ( rule__EnPassant__Group__0 ) )
            {
            // InternalChessDSL.g:417:2: ( ( rule__EnPassant__Group__0 ) )
            // InternalChessDSL.g:418:3: ( rule__EnPassant__Group__0 )
            {
             before(grammarAccess.getEnPassantAccess().getGroup()); 
            // InternalChessDSL.g:419:3: ( rule__EnPassant__Group__0 )
            // InternalChessDSL.g:419:4: rule__EnPassant__Group__0
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
    // InternalChessDSL.g:428:1: entryRulePromotion : rulePromotion EOF ;
    public final void entryRulePromotion() throws RecognitionException {
        try {
            // InternalChessDSL.g:429:1: ( rulePromotion EOF )
            // InternalChessDSL.g:430:1: rulePromotion EOF
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
    // InternalChessDSL.g:437:1: rulePromotion : ( ( rule__Promotion__Group__0 ) ) ;
    public final void rulePromotion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:441:2: ( ( ( rule__Promotion__Group__0 ) ) )
            // InternalChessDSL.g:442:2: ( ( rule__Promotion__Group__0 ) )
            {
            // InternalChessDSL.g:442:2: ( ( rule__Promotion__Group__0 ) )
            // InternalChessDSL.g:443:3: ( rule__Promotion__Group__0 )
            {
             before(grammarAccess.getPromotionAccess().getGroup()); 
            // InternalChessDSL.g:444:3: ( rule__Promotion__Group__0 )
            // InternalChessDSL.g:444:4: rule__Promotion__Group__0
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
    // InternalChessDSL.g:453:1: entryRuleConclusion : ruleConclusion EOF ;
    public final void entryRuleConclusion() throws RecognitionException {
        try {
            // InternalChessDSL.g:454:1: ( ruleConclusion EOF )
            // InternalChessDSL.g:455:1: ruleConclusion EOF
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
    // InternalChessDSL.g:462:1: ruleConclusion : ( ( rule__Conclusion__Group__0 ) ) ;
    public final void ruleConclusion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:466:2: ( ( ( rule__Conclusion__Group__0 ) ) )
            // InternalChessDSL.g:467:2: ( ( rule__Conclusion__Group__0 ) )
            {
            // InternalChessDSL.g:467:2: ( ( rule__Conclusion__Group__0 ) )
            // InternalChessDSL.g:468:3: ( rule__Conclusion__Group__0 )
            {
             before(grammarAccess.getConclusionAccess().getGroup()); 
            // InternalChessDSL.g:469:3: ( rule__Conclusion__Group__0 )
            // InternalChessDSL.g:469:4: rule__Conclusion__Group__0
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
    // InternalChessDSL.g:478:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalChessDSL.g:479:1: ( ruleMethod EOF )
            // InternalChessDSL.g:480:1: ruleMethod EOF
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
    // InternalChessDSL.g:487:1: ruleMethod : ( ( rule__Method__Alternatives ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:491:2: ( ( ( rule__Method__Alternatives ) ) )
            // InternalChessDSL.g:492:2: ( ( rule__Method__Alternatives ) )
            {
            // InternalChessDSL.g:492:2: ( ( rule__Method__Alternatives ) )
            // InternalChessDSL.g:493:3: ( rule__Method__Alternatives )
            {
             before(grammarAccess.getMethodAccess().getAlternatives()); 
            // InternalChessDSL.g:494:3: ( rule__Method__Alternatives )
            // InternalChessDSL.g:494:4: rule__Method__Alternatives
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
    // InternalChessDSL.g:503:1: entryRuleWin : ruleWin EOF ;
    public final void entryRuleWin() throws RecognitionException {
        try {
            // InternalChessDSL.g:504:1: ( ruleWin EOF )
            // InternalChessDSL.g:505:1: ruleWin EOF
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
    // InternalChessDSL.g:512:1: ruleWin : ( ( rule__Win__Alternatives ) ) ;
    public final void ruleWin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:516:2: ( ( ( rule__Win__Alternatives ) ) )
            // InternalChessDSL.g:517:2: ( ( rule__Win__Alternatives ) )
            {
            // InternalChessDSL.g:517:2: ( ( rule__Win__Alternatives ) )
            // InternalChessDSL.g:518:3: ( rule__Win__Alternatives )
            {
             before(grammarAccess.getWinAccess().getAlternatives()); 
            // InternalChessDSL.g:519:3: ( rule__Win__Alternatives )
            // InternalChessDSL.g:519:4: rule__Win__Alternatives
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
    // InternalChessDSL.g:528:1: entryRuleTimeUp : ruleTimeUp EOF ;
    public final void entryRuleTimeUp() throws RecognitionException {
        try {
            // InternalChessDSL.g:529:1: ( ruleTimeUp EOF )
            // InternalChessDSL.g:530:1: ruleTimeUp EOF
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
    // InternalChessDSL.g:537:1: ruleTimeUp : ( ( rule__TimeUp__Group__0 ) ) ;
    public final void ruleTimeUp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:541:2: ( ( ( rule__TimeUp__Group__0 ) ) )
            // InternalChessDSL.g:542:2: ( ( rule__TimeUp__Group__0 ) )
            {
            // InternalChessDSL.g:542:2: ( ( rule__TimeUp__Group__0 ) )
            // InternalChessDSL.g:543:3: ( rule__TimeUp__Group__0 )
            {
             before(grammarAccess.getTimeUpAccess().getGroup()); 
            // InternalChessDSL.g:544:3: ( rule__TimeUp__Group__0 )
            // InternalChessDSL.g:544:4: rule__TimeUp__Group__0
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
    // InternalChessDSL.g:553:1: entryRuleResign : ruleResign EOF ;
    public final void entryRuleResign() throws RecognitionException {
        try {
            // InternalChessDSL.g:554:1: ( ruleResign EOF )
            // InternalChessDSL.g:555:1: ruleResign EOF
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
    // InternalChessDSL.g:562:1: ruleResign : ( ( rule__Resign__Group__0 ) ) ;
    public final void ruleResign() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:566:2: ( ( ( rule__Resign__Group__0 ) ) )
            // InternalChessDSL.g:567:2: ( ( rule__Resign__Group__0 ) )
            {
            // InternalChessDSL.g:567:2: ( ( rule__Resign__Group__0 ) )
            // InternalChessDSL.g:568:3: ( rule__Resign__Group__0 )
            {
             before(grammarAccess.getResignAccess().getGroup()); 
            // InternalChessDSL.g:569:3: ( rule__Resign__Group__0 )
            // InternalChessDSL.g:569:4: rule__Resign__Group__0
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
    // InternalChessDSL.g:578:1: entryRuleCheckmate : ruleCheckmate EOF ;
    public final void entryRuleCheckmate() throws RecognitionException {
        try {
            // InternalChessDSL.g:579:1: ( ruleCheckmate EOF )
            // InternalChessDSL.g:580:1: ruleCheckmate EOF
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
    // InternalChessDSL.g:587:1: ruleCheckmate : ( ( rule__Checkmate__Group__0 ) ) ;
    public final void ruleCheckmate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:591:2: ( ( ( rule__Checkmate__Group__0 ) ) )
            // InternalChessDSL.g:592:2: ( ( rule__Checkmate__Group__0 ) )
            {
            // InternalChessDSL.g:592:2: ( ( rule__Checkmate__Group__0 ) )
            // InternalChessDSL.g:593:3: ( rule__Checkmate__Group__0 )
            {
             before(grammarAccess.getCheckmateAccess().getGroup()); 
            // InternalChessDSL.g:594:3: ( rule__Checkmate__Group__0 )
            // InternalChessDSL.g:594:4: rule__Checkmate__Group__0
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
    // InternalChessDSL.g:603:1: entryRuleDraw : ruleDraw EOF ;
    public final void entryRuleDraw() throws RecognitionException {
        try {
            // InternalChessDSL.g:604:1: ( ruleDraw EOF )
            // InternalChessDSL.g:605:1: ruleDraw EOF
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
    // InternalChessDSL.g:612:1: ruleDraw : ( ( rule__Draw__Group__0 ) ) ;
    public final void ruleDraw() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:616:2: ( ( ( rule__Draw__Group__0 ) ) )
            // InternalChessDSL.g:617:2: ( ( rule__Draw__Group__0 ) )
            {
            // InternalChessDSL.g:617:2: ( ( rule__Draw__Group__0 ) )
            // InternalChessDSL.g:618:3: ( rule__Draw__Group__0 )
            {
             before(grammarAccess.getDrawAccess().getGroup()); 
            // InternalChessDSL.g:619:3: ( rule__Draw__Group__0 )
            // InternalChessDSL.g:619:4: rule__Draw__Group__0
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
    // InternalChessDSL.g:628:1: entryRuleStalemate : ruleStalemate EOF ;
    public final void entryRuleStalemate() throws RecognitionException {
        try {
            // InternalChessDSL.g:629:1: ( ruleStalemate EOF )
            // InternalChessDSL.g:630:1: ruleStalemate EOF
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
    // InternalChessDSL.g:637:1: ruleStalemate : ( ( rule__Stalemate__Group__0 ) ) ;
    public final void ruleStalemate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:641:2: ( ( ( rule__Stalemate__Group__0 ) ) )
            // InternalChessDSL.g:642:2: ( ( rule__Stalemate__Group__0 ) )
            {
            // InternalChessDSL.g:642:2: ( ( rule__Stalemate__Group__0 ) )
            // InternalChessDSL.g:643:3: ( rule__Stalemate__Group__0 )
            {
             before(grammarAccess.getStalemateAccess().getGroup()); 
            // InternalChessDSL.g:644:3: ( rule__Stalemate__Group__0 )
            // InternalChessDSL.g:644:4: rule__Stalemate__Group__0
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
    // InternalChessDSL.g:653:1: entryRuleThreefold : ruleThreefold EOF ;
    public final void entryRuleThreefold() throws RecognitionException {
        try {
            // InternalChessDSL.g:654:1: ( ruleThreefold EOF )
            // InternalChessDSL.g:655:1: ruleThreefold EOF
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
    // InternalChessDSL.g:662:1: ruleThreefold : ( ( rule__Threefold__Group__0 ) ) ;
    public final void ruleThreefold() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:666:2: ( ( ( rule__Threefold__Group__0 ) ) )
            // InternalChessDSL.g:667:2: ( ( rule__Threefold__Group__0 ) )
            {
            // InternalChessDSL.g:667:2: ( ( rule__Threefold__Group__0 ) )
            // InternalChessDSL.g:668:3: ( rule__Threefold__Group__0 )
            {
             before(grammarAccess.getThreefoldAccess().getGroup()); 
            // InternalChessDSL.g:669:3: ( rule__Threefold__Group__0 )
            // InternalChessDSL.g:669:4: rule__Threefold__Group__0
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
    // InternalChessDSL.g:678:1: entryRuleFifty : ruleFifty EOF ;
    public final void entryRuleFifty() throws RecognitionException {
        try {
            // InternalChessDSL.g:679:1: ( ruleFifty EOF )
            // InternalChessDSL.g:680:1: ruleFifty EOF
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
    // InternalChessDSL.g:687:1: ruleFifty : ( ( rule__Fifty__Group__0 ) ) ;
    public final void ruleFifty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:691:2: ( ( ( rule__Fifty__Group__0 ) ) )
            // InternalChessDSL.g:692:2: ( ( rule__Fifty__Group__0 ) )
            {
            // InternalChessDSL.g:692:2: ( ( rule__Fifty__Group__0 ) )
            // InternalChessDSL.g:693:3: ( rule__Fifty__Group__0 )
            {
             before(grammarAccess.getFiftyAccess().getGroup()); 
            // InternalChessDSL.g:694:3: ( rule__Fifty__Group__0 )
            // InternalChessDSL.g:694:4: rule__Fifty__Group__0
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
    // InternalChessDSL.g:703:1: entryRuleAgree : ruleAgree EOF ;
    public final void entryRuleAgree() throws RecognitionException {
        try {
            // InternalChessDSL.g:704:1: ( ruleAgree EOF )
            // InternalChessDSL.g:705:1: ruleAgree EOF
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
    // InternalChessDSL.g:712:1: ruleAgree : ( ( rule__Agree__Group__0 ) ) ;
    public final void ruleAgree() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:716:2: ( ( ( rule__Agree__Group__0 ) ) )
            // InternalChessDSL.g:717:2: ( ( rule__Agree__Group__0 ) )
            {
            // InternalChessDSL.g:717:2: ( ( rule__Agree__Group__0 ) )
            // InternalChessDSL.g:718:3: ( rule__Agree__Group__0 )
            {
             before(grammarAccess.getAgreeAccess().getGroup()); 
            // InternalChessDSL.g:719:3: ( rule__Agree__Group__0 )
            // InternalChessDSL.g:719:4: rule__Agree__Group__0
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
    // InternalChessDSL.g:728:1: entryRuleResult : ruleResult EOF ;
    public final void entryRuleResult() throws RecognitionException {
        try {
            // InternalChessDSL.g:729:1: ( ruleResult EOF )
            // InternalChessDSL.g:730:1: ruleResult EOF
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
    // InternalChessDSL.g:737:1: ruleResult : ( ( rule__Result__Alternatives ) ) ;
    public final void ruleResult() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:741:2: ( ( ( rule__Result__Alternatives ) ) )
            // InternalChessDSL.g:742:2: ( ( rule__Result__Alternatives ) )
            {
            // InternalChessDSL.g:742:2: ( ( rule__Result__Alternatives ) )
            // InternalChessDSL.g:743:3: ( rule__Result__Alternatives )
            {
             before(grammarAccess.getResultAccess().getAlternatives()); 
            // InternalChessDSL.g:744:3: ( rule__Result__Alternatives )
            // InternalChessDSL.g:744:4: rule__Result__Alternatives
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


    // $ANTLR start "entryRuleSquare"
    // InternalChessDSL.g:753:1: entryRuleSquare : ruleSquare EOF ;
    public final void entryRuleSquare() throws RecognitionException {
        try {
            // InternalChessDSL.g:754:1: ( ruleSquare EOF )
            // InternalChessDSL.g:755:1: ruleSquare EOF
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
    // InternalChessDSL.g:762:1: ruleSquare : ( RULE_SQUARETERMINAL ) ;
    public final void ruleSquare() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:766:2: ( ( RULE_SQUARETERMINAL ) )
            // InternalChessDSL.g:767:2: ( RULE_SQUARETERMINAL )
            {
            // InternalChessDSL.g:767:2: ( RULE_SQUARETERMINAL )
            // InternalChessDSL.g:768:3: RULE_SQUARETERMINAL
            {
             before(grammarAccess.getSquareAccess().getSQUARETERMINALTerminalRuleCall()); 
            match(input,RULE_SQUARETERMINAL,FOLLOW_2); 
             after(grammarAccess.getSquareAccess().getSQUARETERMINALTerminalRuleCall()); 

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
    // InternalChessDSL.g:778:1: ruleRemark : ( ( rule__Remark__Alternatives ) ) ;
    public final void ruleRemark() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:782:1: ( ( ( rule__Remark__Alternatives ) ) )
            // InternalChessDSL.g:783:2: ( ( rule__Remark__Alternatives ) )
            {
            // InternalChessDSL.g:783:2: ( ( rule__Remark__Alternatives ) )
            // InternalChessDSL.g:784:3: ( rule__Remark__Alternatives )
            {
             before(grammarAccess.getRemarkAccess().getAlternatives()); 
            // InternalChessDSL.g:785:3: ( rule__Remark__Alternatives )
            // InternalChessDSL.g:785:4: rule__Remark__Alternatives
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
    // InternalChessDSL.g:794:1: ruleColor : ( ( rule__Color__Alternatives ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:798:1: ( ( ( rule__Color__Alternatives ) ) )
            // InternalChessDSL.g:799:2: ( ( rule__Color__Alternatives ) )
            {
            // InternalChessDSL.g:799:2: ( ( rule__Color__Alternatives ) )
            // InternalChessDSL.g:800:3: ( rule__Color__Alternatives )
            {
             before(grammarAccess.getColorAccess().getAlternatives()); 
            // InternalChessDSL.g:801:3: ( rule__Color__Alternatives )
            // InternalChessDSL.g:801:4: rule__Color__Alternatives
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
    // InternalChessDSL.g:810:1: rulePiece : ( ( rule__Piece__Alternatives ) ) ;
    public final void rulePiece() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:814:1: ( ( ( rule__Piece__Alternatives ) ) )
            // InternalChessDSL.g:815:2: ( ( rule__Piece__Alternatives ) )
            {
            // InternalChessDSL.g:815:2: ( ( rule__Piece__Alternatives ) )
            // InternalChessDSL.g:816:3: ( rule__Piece__Alternatives )
            {
             before(grammarAccess.getPieceAccess().getAlternatives()); 
            // InternalChessDSL.g:817:3: ( rule__Piece__Alternatives )
            // InternalChessDSL.g:817:4: rule__Piece__Alternatives
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
    // InternalChessDSL.g:825:1: rule__InitialState__Alternatives_2 : ( ( 'fresh' ) | ( ( rule__InitialState__Group_2_1__0 ) ) );
    public final void rule__InitialState__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:829:1: ( ( 'fresh' ) | ( ( rule__InitialState__Group_2_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==42) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalChessDSL.g:830:2: ( 'fresh' )
                    {
                    // InternalChessDSL.g:830:2: ( 'fresh' )
                    // InternalChessDSL.g:831:3: 'fresh'
                    {
                     before(grammarAccess.getInitialStateAccess().getFreshKeyword_2_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getInitialStateAccess().getFreshKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:836:2: ( ( rule__InitialState__Group_2_1__0 ) )
                    {
                    // InternalChessDSL.g:836:2: ( ( rule__InitialState__Group_2_1__0 ) )
                    // InternalChessDSL.g:837:3: ( rule__InitialState__Group_2_1__0 )
                    {
                     before(grammarAccess.getInitialStateAccess().getGroup_2_1()); 
                    // InternalChessDSL.g:838:3: ( rule__InitialState__Group_2_1__0 )
                    // InternalChessDSL.g:838:4: rule__InitialState__Group_2_1__0
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
    // InternalChessDSL.g:846:1: rule__Placement__Alternatives_1 : ( ( '=' ) | ( 'on' ) );
    public final void rule__Placement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:850:1: ( ( '=' ) | ( 'on' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalChessDSL.g:851:2: ( '=' )
                    {
                    // InternalChessDSL.g:851:2: ( '=' )
                    // InternalChessDSL.g:852:3: '='
                    {
                     before(grammarAccess.getPlacementAccess().getEqualsSignKeyword_1_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getPlacementAccess().getEqualsSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:857:2: ( 'on' )
                    {
                    // InternalChessDSL.g:857:2: ( 'on' )
                    // InternalChessDSL.g:858:3: 'on'
                    {
                     before(grammarAccess.getPlacementAccess().getOnKeyword_1_1()); 
                    match(input,16,FOLLOW_2); 
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
    // InternalChessDSL.g:867:1: rule__MovePair__Alternatives_1 : ( ( ( rule__MovePair__Group_1_0__0 ) ) | ( '...' ) );
    public final void rule__MovePair__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:871:1: ( ( ( rule__MovePair__Group_1_0__0 ) ) | ( '...' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||LA3_0==13||(LA3_0>=30 && LA3_0<=35)||LA3_0==48||(LA3_0>=55 && LA3_0<=56)) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalChessDSL.g:872:2: ( ( rule__MovePair__Group_1_0__0 ) )
                    {
                    // InternalChessDSL.g:872:2: ( ( rule__MovePair__Group_1_0__0 ) )
                    // InternalChessDSL.g:873:3: ( rule__MovePair__Group_1_0__0 )
                    {
                     before(grammarAccess.getMovePairAccess().getGroup_1_0()); 
                    // InternalChessDSL.g:874:3: ( rule__MovePair__Group_1_0__0 )
                    // InternalChessDSL.g:874:4: rule__MovePair__Group_1_0__0
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
                    // InternalChessDSL.g:878:2: ( '...' )
                    {
                    // InternalChessDSL.g:878:2: ( '...' )
                    // InternalChessDSL.g:879:3: '...'
                    {
                     before(grammarAccess.getMovePairAccess().getFullStopFullStopFullStopKeyword_1_1()); 
                    match(input,17,FOLLOW_2); 
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
    // InternalChessDSL.g:888:1: rule__DSLMove__Alternatives : ( ( ruleMove ) | ( ruleCapture ) | ( ruleCastle ) | ( ruleEnPassant ) | ( rulePromotion ) | ( ruleDummy ) );
    public final void rule__DSLMove__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:892:1: ( ( ruleMove ) | ( ruleCapture ) | ( ruleCastle ) | ( ruleEnPassant ) | ( rulePromotion ) | ( ruleDummy ) )
            int alt4=6;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalChessDSL.g:893:2: ( ruleMove )
                    {
                    // InternalChessDSL.g:893:2: ( ruleMove )
                    // InternalChessDSL.g:894:3: ruleMove
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
                    // InternalChessDSL.g:899:2: ( ruleCapture )
                    {
                    // InternalChessDSL.g:899:2: ( ruleCapture )
                    // InternalChessDSL.g:900:3: ruleCapture
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
                    // InternalChessDSL.g:905:2: ( ruleCastle )
                    {
                    // InternalChessDSL.g:905:2: ( ruleCastle )
                    // InternalChessDSL.g:906:3: ruleCastle
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
                    // InternalChessDSL.g:911:2: ( ruleEnPassant )
                    {
                    // InternalChessDSL.g:911:2: ( ruleEnPassant )
                    // InternalChessDSL.g:912:3: ruleEnPassant
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
                    // InternalChessDSL.g:917:2: ( rulePromotion )
                    {
                    // InternalChessDSL.g:917:2: ( rulePromotion )
                    // InternalChessDSL.g:918:3: rulePromotion
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
                    // InternalChessDSL.g:923:2: ( ruleDummy )
                    {
                    // InternalChessDSL.g:923:2: ( ruleDummy )
                    // InternalChessDSL.g:924:3: ruleDummy
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
    // InternalChessDSL.g:933:1: rule__Move__Alternatives_2 : ( ( ( rule__Move__Group_2_0__0 ) ) | ( ( rule__Move__Group_2_1__0 ) ) );
    public final void rule__Move__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:937:1: ( ( ( rule__Move__Group_2_0__0 ) ) | ( ( rule__Move__Group_2_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==46) ) {
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
                    // InternalChessDSL.g:938:2: ( ( rule__Move__Group_2_0__0 ) )
                    {
                    // InternalChessDSL.g:938:2: ( ( rule__Move__Group_2_0__0 ) )
                    // InternalChessDSL.g:939:3: ( rule__Move__Group_2_0__0 )
                    {
                     before(grammarAccess.getMoveAccess().getGroup_2_0()); 
                    // InternalChessDSL.g:940:3: ( rule__Move__Group_2_0__0 )
                    // InternalChessDSL.g:940:4: rule__Move__Group_2_0__0
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
                    // InternalChessDSL.g:944:2: ( ( rule__Move__Group_2_1__0 ) )
                    {
                    // InternalChessDSL.g:944:2: ( ( rule__Move__Group_2_1__0 ) )
                    // InternalChessDSL.g:945:3: ( rule__Move__Group_2_1__0 )
                    {
                     before(grammarAccess.getMoveAccess().getGroup_2_1()); 
                    // InternalChessDSL.g:946:3: ( rule__Move__Group_2_1__0 )
                    // InternalChessDSL.g:946:4: rule__Move__Group_2_1__0
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
    // InternalChessDSL.g:954:1: rule__Capture__Alternatives_1 : ( ( ( rule__Capture__Group_1_0__0 ) ) | ( ( rule__Capture__Group_1_1__0 ) ) );
    public final void rule__Capture__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:958:1: ( ( ( rule__Capture__Group_1_0__0 ) ) | ( ( rule__Capture__Group_1_1__0 ) ) )
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
                    // InternalChessDSL.g:959:2: ( ( rule__Capture__Group_1_0__0 ) )
                    {
                    // InternalChessDSL.g:959:2: ( ( rule__Capture__Group_1_0__0 ) )
                    // InternalChessDSL.g:960:3: ( rule__Capture__Group_1_0__0 )
                    {
                     before(grammarAccess.getCaptureAccess().getGroup_1_0()); 
                    // InternalChessDSL.g:961:3: ( rule__Capture__Group_1_0__0 )
                    // InternalChessDSL.g:961:4: rule__Capture__Group_1_0__0
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
                    // InternalChessDSL.g:965:2: ( ( rule__Capture__Group_1_1__0 ) )
                    {
                    // InternalChessDSL.g:965:2: ( ( rule__Capture__Group_1_1__0 ) )
                    // InternalChessDSL.g:966:3: ( rule__Capture__Group_1_1__0 )
                    {
                     before(grammarAccess.getCaptureAccess().getGroup_1_1()); 
                    // InternalChessDSL.g:967:3: ( rule__Capture__Group_1_1__0 )
                    // InternalChessDSL.g:967:4: rule__Capture__Group_1_1__0
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
    // InternalChessDSL.g:975:1: rule__Castle__Alternatives : ( ( ( rule__Castle__Group_0__0 ) ) | ( ( rule__Castle__Group_1__0 ) ) | ( ( rule__Castle__Group_2__0 ) ) | ( ( rule__Castle__Group_3__0 ) ) );
    public final void rule__Castle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:979:1: ( ( ( rule__Castle__Group_0__0 ) ) | ( ( rule__Castle__Group_1__0 ) ) | ( ( rule__Castle__Group_2__0 ) ) | ( ( rule__Castle__Group_3__0 ) ) )
            int alt7=4;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalChessDSL.g:980:2: ( ( rule__Castle__Group_0__0 ) )
                    {
                    // InternalChessDSL.g:980:2: ( ( rule__Castle__Group_0__0 ) )
                    // InternalChessDSL.g:981:3: ( rule__Castle__Group_0__0 )
                    {
                     before(grammarAccess.getCastleAccess().getGroup_0()); 
                    // InternalChessDSL.g:982:3: ( rule__Castle__Group_0__0 )
                    // InternalChessDSL.g:982:4: rule__Castle__Group_0__0
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
                    // InternalChessDSL.g:986:2: ( ( rule__Castle__Group_1__0 ) )
                    {
                    // InternalChessDSL.g:986:2: ( ( rule__Castle__Group_1__0 ) )
                    // InternalChessDSL.g:987:3: ( rule__Castle__Group_1__0 )
                    {
                     before(grammarAccess.getCastleAccess().getGroup_1()); 
                    // InternalChessDSL.g:988:3: ( rule__Castle__Group_1__0 )
                    // InternalChessDSL.g:988:4: rule__Castle__Group_1__0
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
                    // InternalChessDSL.g:992:2: ( ( rule__Castle__Group_2__0 ) )
                    {
                    // InternalChessDSL.g:992:2: ( ( rule__Castle__Group_2__0 ) )
                    // InternalChessDSL.g:993:3: ( rule__Castle__Group_2__0 )
                    {
                     before(grammarAccess.getCastleAccess().getGroup_2()); 
                    // InternalChessDSL.g:994:3: ( rule__Castle__Group_2__0 )
                    // InternalChessDSL.g:994:4: rule__Castle__Group_2__0
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
                    // InternalChessDSL.g:998:2: ( ( rule__Castle__Group_3__0 ) )
                    {
                    // InternalChessDSL.g:998:2: ( ( rule__Castle__Group_3__0 ) )
                    // InternalChessDSL.g:999:3: ( rule__Castle__Group_3__0 )
                    {
                     before(grammarAccess.getCastleAccess().getGroup_3()); 
                    // InternalChessDSL.g:1000:3: ( rule__Castle__Group_3__0 )
                    // InternalChessDSL.g:1000:4: rule__Castle__Group_3__0
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


    // $ANTLR start "rule__Castle__Alternatives_0_1"
    // InternalChessDSL.g:1008:1: rule__Castle__Alternatives_0_1 : ( ( 'Kingside' ) | ( 'Queenside' ) );
    public final void rule__Castle__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1012:1: ( ( 'Kingside' ) | ( 'Queenside' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalChessDSL.g:1013:2: ( 'Kingside' )
                    {
                    // InternalChessDSL.g:1013:2: ( 'Kingside' )
                    // InternalChessDSL.g:1014:3: 'Kingside'
                    {
                     before(grammarAccess.getCastleAccess().getKingsideKeyword_0_1_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getCastleAccess().getKingsideKeyword_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1019:2: ( 'Queenside' )
                    {
                    // InternalChessDSL.g:1019:2: ( 'Queenside' )
                    // InternalChessDSL.g:1020:3: 'Queenside'
                    {
                     before(grammarAccess.getCastleAccess().getQueensideKeyword_0_1_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getCastleAccess().getQueensideKeyword_0_1_1()); 

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
    // $ANTLR end "rule__Castle__Alternatives_0_1"


    // $ANTLR start "rule__Castle__Alternatives_1_2"
    // InternalChessDSL.g:1029:1: rule__Castle__Alternatives_1_2 : ( ( 'Kingside' ) | ( 'Queenside' ) );
    public final void rule__Castle__Alternatives_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1033:1: ( ( 'Kingside' ) | ( 'Queenside' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            else if ( (LA9_0==19) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalChessDSL.g:1034:2: ( 'Kingside' )
                    {
                    // InternalChessDSL.g:1034:2: ( 'Kingside' )
                    // InternalChessDSL.g:1035:3: 'Kingside'
                    {
                     before(grammarAccess.getCastleAccess().getKingsideKeyword_1_2_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getCastleAccess().getKingsideKeyword_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1040:2: ( 'Queenside' )
                    {
                    // InternalChessDSL.g:1040:2: ( 'Queenside' )
                    // InternalChessDSL.g:1041:3: 'Queenside'
                    {
                     before(grammarAccess.getCastleAccess().getQueensideKeyword_1_2_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getCastleAccess().getQueensideKeyword_1_2_1()); 

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
    // $ANTLR end "rule__Castle__Alternatives_1_2"


    // $ANTLR start "rule__Promotion__MoveAlternatives_0_0"
    // InternalChessDSL.g:1050:1: rule__Promotion__MoveAlternatives_0_0 : ( ( ruleMove ) | ( ruleCapture ) );
    public final void rule__Promotion__MoveAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1054:1: ( ( ruleMove ) | ( ruleCapture ) )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalChessDSL.g:1055:2: ( ruleMove )
                    {
                    // InternalChessDSL.g:1055:2: ( ruleMove )
                    // InternalChessDSL.g:1056:3: ruleMove
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
                    // InternalChessDSL.g:1061:2: ( ruleCapture )
                    {
                    // InternalChessDSL.g:1061:2: ( ruleCapture )
                    // InternalChessDSL.g:1062:3: ruleCapture
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
    // InternalChessDSL.g:1071:1: rule__Method__Alternatives : ( ( ruleWin ) | ( ruleDraw ) );
    public final void rule__Method__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1075:1: ( ( ruleWin ) | ( ruleDraw ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==60||(LA11_1>=64 && LA11_1<=65)) ) {
                    alt11=1;
                }
                else if ( (LA11_1==53) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalChessDSL.g:1076:2: ( ruleWin )
                    {
                    // InternalChessDSL.g:1076:2: ( ruleWin )
                    // InternalChessDSL.g:1077:3: ruleWin
                    {
                     before(grammarAccess.getMethodAccess().getWinParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWin();

                    state._fsp--;

                     after(grammarAccess.getMethodAccess().getWinParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1082:2: ( ruleDraw )
                    {
                    // InternalChessDSL.g:1082:2: ( ruleDraw )
                    // InternalChessDSL.g:1083:3: ruleDraw
                    {
                     before(grammarAccess.getMethodAccess().getDrawParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDraw();

                    state._fsp--;

                     after(grammarAccess.getMethodAccess().getDrawParserRuleCall_1()); 

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
    // InternalChessDSL.g:1092:1: rule__Win__Alternatives : ( ( ruleTimeUp ) | ( ruleResign ) | ( ruleCheckmate ) );
    public final void rule__Win__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1096:1: ( ( ruleTimeUp ) | ( ruleResign ) | ( ruleCheckmate ) )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 60:
                    {
                    alt12=1;
                    }
                    break;
                case 65:
                    {
                    alt12=3;
                    }
                    break;
                case 64:
                    {
                    alt12=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalChessDSL.g:1097:2: ( ruleTimeUp )
                    {
                    // InternalChessDSL.g:1097:2: ( ruleTimeUp )
                    // InternalChessDSL.g:1098:3: ruleTimeUp
                    {
                     before(grammarAccess.getWinAccess().getTimeUpParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTimeUp();

                    state._fsp--;

                     after(grammarAccess.getWinAccess().getTimeUpParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1103:2: ( ruleResign )
                    {
                    // InternalChessDSL.g:1103:2: ( ruleResign )
                    // InternalChessDSL.g:1104:3: ruleResign
                    {
                     before(grammarAccess.getWinAccess().getResignParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleResign();

                    state._fsp--;

                     after(grammarAccess.getWinAccess().getResignParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalChessDSL.g:1109:2: ( ruleCheckmate )
                    {
                    // InternalChessDSL.g:1109:2: ( ruleCheckmate )
                    // InternalChessDSL.g:1110:3: ruleCheckmate
                    {
                     before(grammarAccess.getWinAccess().getCheckmateParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCheckmate();

                    state._fsp--;

                     after(grammarAccess.getWinAccess().getCheckmateParserRuleCall_2()); 

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
    // InternalChessDSL.g:1119:1: rule__Draw__ResultAlternatives_3_0 : ( ( ruleStalemate ) | ( ruleThreefold ) | ( ruleFifty ) | ( ruleAgree ) );
    public final void rule__Draw__ResultAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1123:1: ( ( ruleStalemate ) | ( ruleThreefold ) | ( ruleFifty ) | ( ruleAgree ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt13=1;
                }
                break;
            case 71:
                {
                alt13=2;
                }
                break;
            case 75:
                {
                alt13=3;
                }
                break;
            case 79:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalChessDSL.g:1124:2: ( ruleStalemate )
                    {
                    // InternalChessDSL.g:1124:2: ( ruleStalemate )
                    // InternalChessDSL.g:1125:3: ruleStalemate
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
                    // InternalChessDSL.g:1130:2: ( ruleThreefold )
                    {
                    // InternalChessDSL.g:1130:2: ( ruleThreefold )
                    // InternalChessDSL.g:1131:3: ruleThreefold
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
                    // InternalChessDSL.g:1136:2: ( ruleFifty )
                    {
                    // InternalChessDSL.g:1136:2: ( ruleFifty )
                    // InternalChessDSL.g:1137:3: ruleFifty
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
                    // InternalChessDSL.g:1142:2: ( ruleAgree )
                    {
                    // InternalChessDSL.g:1142:2: ( ruleAgree )
                    // InternalChessDSL.g:1143:3: ruleAgree
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
    // InternalChessDSL.g:1152:1: rule__Result__Alternatives : ( ( ( rule__Result__Group_0__0 ) ) | ( 'draw' ) );
    public final void rule__Result__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1156:1: ( ( ( rule__Result__Group_0__0 ) ) | ( 'draw' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID||(LA14_0>=28 && LA14_0<=29)) ) {
                alt14=1;
            }
            else if ( (LA14_0==20) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalChessDSL.g:1157:2: ( ( rule__Result__Group_0__0 ) )
                    {
                    // InternalChessDSL.g:1157:2: ( ( rule__Result__Group_0__0 ) )
                    // InternalChessDSL.g:1158:3: ( rule__Result__Group_0__0 )
                    {
                     before(grammarAccess.getResultAccess().getGroup_0()); 
                    // InternalChessDSL.g:1159:3: ( rule__Result__Group_0__0 )
                    // InternalChessDSL.g:1159:4: rule__Result__Group_0__0
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
                    // InternalChessDSL.g:1163:2: ( 'draw' )
                    {
                    // InternalChessDSL.g:1163:2: ( 'draw' )
                    // InternalChessDSL.g:1164:3: 'draw'
                    {
                     before(grammarAccess.getResultAccess().getDrawKeyword_1()); 
                    match(input,20,FOLLOW_2); 
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
    // InternalChessDSL.g:1173:1: rule__Result__Alternatives_0_0 : ( ( ( rule__Result__PlayerAssignment_0_0_0 ) ) | ( ( rule__Result__ColorAssignment_0_0_1 ) ) );
    public final void rule__Result__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1177:1: ( ( ( rule__Result__PlayerAssignment_0_0_0 ) ) | ( ( rule__Result__ColorAssignment_0_0_1 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=28 && LA15_0<=29)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalChessDSL.g:1178:2: ( ( rule__Result__PlayerAssignment_0_0_0 ) )
                    {
                    // InternalChessDSL.g:1178:2: ( ( rule__Result__PlayerAssignment_0_0_0 ) )
                    // InternalChessDSL.g:1179:3: ( rule__Result__PlayerAssignment_0_0_0 )
                    {
                     before(grammarAccess.getResultAccess().getPlayerAssignment_0_0_0()); 
                    // InternalChessDSL.g:1180:3: ( rule__Result__PlayerAssignment_0_0_0 )
                    // InternalChessDSL.g:1180:4: rule__Result__PlayerAssignment_0_0_0
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
                    // InternalChessDSL.g:1184:2: ( ( rule__Result__ColorAssignment_0_0_1 ) )
                    {
                    // InternalChessDSL.g:1184:2: ( ( rule__Result__ColorAssignment_0_0_1 ) )
                    // InternalChessDSL.g:1185:3: ( rule__Result__ColorAssignment_0_0_1 )
                    {
                     before(grammarAccess.getResultAccess().getColorAssignment_0_0_1()); 
                    // InternalChessDSL.g:1186:3: ( rule__Result__ColorAssignment_0_0_1 )
                    // InternalChessDSL.g:1186:4: rule__Result__ColorAssignment_0_0_1
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


    // $ANTLR start "rule__Remark__Alternatives"
    // InternalChessDSL.g:1194:1: rule__Remark__Alternatives : ( ( ( 'Good' ) ) | ( ( 'Bad' ) ) | ( ( 'Excellent' ) ) | ( ( 'Risky' ) ) | ( ( 'Dubious' ) ) | ( ( 'Check' ) ) | ( ( 'Checkmate' ) ) );
    public final void rule__Remark__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1198:1: ( ( ( 'Good' ) ) | ( ( 'Bad' ) ) | ( ( 'Excellent' ) ) | ( ( 'Risky' ) ) | ( ( 'Dubious' ) ) | ( ( 'Check' ) ) | ( ( 'Checkmate' ) ) )
            int alt16=7;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt16=1;
                }
                break;
            case 22:
                {
                alt16=2;
                }
                break;
            case 23:
                {
                alt16=3;
                }
                break;
            case 24:
                {
                alt16=4;
                }
                break;
            case 25:
                {
                alt16=5;
                }
                break;
            case 26:
                {
                alt16=6;
                }
                break;
            case 27:
                {
                alt16=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalChessDSL.g:1199:2: ( ( 'Good' ) )
                    {
                    // InternalChessDSL.g:1199:2: ( ( 'Good' ) )
                    // InternalChessDSL.g:1200:3: ( 'Good' )
                    {
                     before(grammarAccess.getRemarkAccess().getGoodEnumLiteralDeclaration_0()); 
                    // InternalChessDSL.g:1201:3: ( 'Good' )
                    // InternalChessDSL.g:1201:4: 'Good'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getRemarkAccess().getGoodEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1205:2: ( ( 'Bad' ) )
                    {
                    // InternalChessDSL.g:1205:2: ( ( 'Bad' ) )
                    // InternalChessDSL.g:1206:3: ( 'Bad' )
                    {
                     before(grammarAccess.getRemarkAccess().getBadEnumLiteralDeclaration_1()); 
                    // InternalChessDSL.g:1207:3: ( 'Bad' )
                    // InternalChessDSL.g:1207:4: 'Bad'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getRemarkAccess().getBadEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalChessDSL.g:1211:2: ( ( 'Excellent' ) )
                    {
                    // InternalChessDSL.g:1211:2: ( ( 'Excellent' ) )
                    // InternalChessDSL.g:1212:3: ( 'Excellent' )
                    {
                     before(grammarAccess.getRemarkAccess().getExcellentEnumLiteralDeclaration_2()); 
                    // InternalChessDSL.g:1213:3: ( 'Excellent' )
                    // InternalChessDSL.g:1213:4: 'Excellent'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getRemarkAccess().getExcellentEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalChessDSL.g:1217:2: ( ( 'Risky' ) )
                    {
                    // InternalChessDSL.g:1217:2: ( ( 'Risky' ) )
                    // InternalChessDSL.g:1218:3: ( 'Risky' )
                    {
                     before(grammarAccess.getRemarkAccess().getRiskyEnumLiteralDeclaration_3()); 
                    // InternalChessDSL.g:1219:3: ( 'Risky' )
                    // InternalChessDSL.g:1219:4: 'Risky'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getRemarkAccess().getRiskyEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalChessDSL.g:1223:2: ( ( 'Dubious' ) )
                    {
                    // InternalChessDSL.g:1223:2: ( ( 'Dubious' ) )
                    // InternalChessDSL.g:1224:3: ( 'Dubious' )
                    {
                     before(grammarAccess.getRemarkAccess().getDubiousEnumLiteralDeclaration_4()); 
                    // InternalChessDSL.g:1225:3: ( 'Dubious' )
                    // InternalChessDSL.g:1225:4: 'Dubious'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getRemarkAccess().getDubiousEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalChessDSL.g:1229:2: ( ( 'Check' ) )
                    {
                    // InternalChessDSL.g:1229:2: ( ( 'Check' ) )
                    // InternalChessDSL.g:1230:3: ( 'Check' )
                    {
                     before(grammarAccess.getRemarkAccess().getCheckEnumLiteralDeclaration_5()); 
                    // InternalChessDSL.g:1231:3: ( 'Check' )
                    // InternalChessDSL.g:1231:4: 'Check'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getRemarkAccess().getCheckEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalChessDSL.g:1235:2: ( ( 'Checkmate' ) )
                    {
                    // InternalChessDSL.g:1235:2: ( ( 'Checkmate' ) )
                    // InternalChessDSL.g:1236:3: ( 'Checkmate' )
                    {
                     before(grammarAccess.getRemarkAccess().getCheckmateEnumLiteralDeclaration_6()); 
                    // InternalChessDSL.g:1237:3: ( 'Checkmate' )
                    // InternalChessDSL.g:1237:4: 'Checkmate'
                    {
                    match(input,27,FOLLOW_2); 

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
    // InternalChessDSL.g:1245:1: rule__Color__Alternatives : ( ( ( 'White' ) ) | ( ( 'Black' ) ) );
    public final void rule__Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1249:1: ( ( ( 'White' ) ) | ( ( 'Black' ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            else if ( (LA17_0==29) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalChessDSL.g:1250:2: ( ( 'White' ) )
                    {
                    // InternalChessDSL.g:1250:2: ( ( 'White' ) )
                    // InternalChessDSL.g:1251:3: ( 'White' )
                    {
                     before(grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_0()); 
                    // InternalChessDSL.g:1252:3: ( 'White' )
                    // InternalChessDSL.g:1252:4: 'White'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1256:2: ( ( 'Black' ) )
                    {
                    // InternalChessDSL.g:1256:2: ( ( 'Black' ) )
                    // InternalChessDSL.g:1257:3: ( 'Black' )
                    {
                     before(grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1()); 
                    // InternalChessDSL.g:1258:3: ( 'Black' )
                    // InternalChessDSL.g:1258:4: 'Black'
                    {
                    match(input,29,FOLLOW_2); 

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
    // InternalChessDSL.g:1266:1: rule__Piece__Alternatives : ( ( ( 'King' ) ) | ( ( 'Queen' ) ) | ( ( 'Rook' ) ) | ( ( 'Bishop' ) ) | ( ( 'Knight' ) ) | ( ( 'Pawn' ) ) );
    public final void rule__Piece__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1270:1: ( ( ( 'King' ) ) | ( ( 'Queen' ) ) | ( ( 'Rook' ) ) | ( ( 'Bishop' ) ) | ( ( 'Knight' ) ) | ( ( 'Pawn' ) ) )
            int alt18=6;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt18=1;
                }
                break;
            case 31:
                {
                alt18=2;
                }
                break;
            case 32:
                {
                alt18=3;
                }
                break;
            case 33:
                {
                alt18=4;
                }
                break;
            case 34:
                {
                alt18=5;
                }
                break;
            case 35:
                {
                alt18=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalChessDSL.g:1271:2: ( ( 'King' ) )
                    {
                    // InternalChessDSL.g:1271:2: ( ( 'King' ) )
                    // InternalChessDSL.g:1272:3: ( 'King' )
                    {
                     before(grammarAccess.getPieceAccess().getKingEnumLiteralDeclaration_0()); 
                    // InternalChessDSL.g:1273:3: ( 'King' )
                    // InternalChessDSL.g:1273:4: 'King'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getPieceAccess().getKingEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1277:2: ( ( 'Queen' ) )
                    {
                    // InternalChessDSL.g:1277:2: ( ( 'Queen' ) )
                    // InternalChessDSL.g:1278:3: ( 'Queen' )
                    {
                     before(grammarAccess.getPieceAccess().getQueenEnumLiteralDeclaration_1()); 
                    // InternalChessDSL.g:1279:3: ( 'Queen' )
                    // InternalChessDSL.g:1279:4: 'Queen'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getPieceAccess().getQueenEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalChessDSL.g:1283:2: ( ( 'Rook' ) )
                    {
                    // InternalChessDSL.g:1283:2: ( ( 'Rook' ) )
                    // InternalChessDSL.g:1284:3: ( 'Rook' )
                    {
                     before(grammarAccess.getPieceAccess().getRookEnumLiteralDeclaration_2()); 
                    // InternalChessDSL.g:1285:3: ( 'Rook' )
                    // InternalChessDSL.g:1285:4: 'Rook'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getPieceAccess().getRookEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalChessDSL.g:1289:2: ( ( 'Bishop' ) )
                    {
                    // InternalChessDSL.g:1289:2: ( ( 'Bishop' ) )
                    // InternalChessDSL.g:1290:3: ( 'Bishop' )
                    {
                     before(grammarAccess.getPieceAccess().getBishopEnumLiteralDeclaration_3()); 
                    // InternalChessDSL.g:1291:3: ( 'Bishop' )
                    // InternalChessDSL.g:1291:4: 'Bishop'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getPieceAccess().getBishopEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalChessDSL.g:1295:2: ( ( 'Knight' ) )
                    {
                    // InternalChessDSL.g:1295:2: ( ( 'Knight' ) )
                    // InternalChessDSL.g:1296:3: ( 'Knight' )
                    {
                     before(grammarAccess.getPieceAccess().getKnightEnumLiteralDeclaration_4()); 
                    // InternalChessDSL.g:1297:3: ( 'Knight' )
                    // InternalChessDSL.g:1297:4: 'Knight'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getPieceAccess().getKnightEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalChessDSL.g:1301:2: ( ( 'Pawn' ) )
                    {
                    // InternalChessDSL.g:1301:2: ( ( 'Pawn' ) )
                    // InternalChessDSL.g:1302:3: ( 'Pawn' )
                    {
                     before(grammarAccess.getPieceAccess().getPawnEnumLiteralDeclaration_5()); 
                    // InternalChessDSL.g:1303:3: ( 'Pawn' )
                    // InternalChessDSL.g:1303:4: 'Pawn'
                    {
                    match(input,35,FOLLOW_2); 

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
    // InternalChessDSL.g:1311:1: rule__Game__Group__0 : rule__Game__Group__0__Impl rule__Game__Group__1 ;
    public final void rule__Game__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1315:1: ( rule__Game__Group__0__Impl rule__Game__Group__1 )
            // InternalChessDSL.g:1316:2: rule__Game__Group__0__Impl rule__Game__Group__1
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
    // InternalChessDSL.g:1323:1: rule__Game__Group__0__Impl : ( 'Game' ) ;
    public final void rule__Game__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1327:1: ( ( 'Game' ) )
            // InternalChessDSL.g:1328:1: ( 'Game' )
            {
            // InternalChessDSL.g:1328:1: ( 'Game' )
            // InternalChessDSL.g:1329:2: 'Game'
            {
             before(grammarAccess.getGameAccess().getGameKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalChessDSL.g:1338:1: rule__Game__Group__1 : rule__Game__Group__1__Impl rule__Game__Group__2 ;
    public final void rule__Game__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1342:1: ( rule__Game__Group__1__Impl rule__Game__Group__2 )
            // InternalChessDSL.g:1343:2: rule__Game__Group__1__Impl rule__Game__Group__2
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
    // InternalChessDSL.g:1350:1: rule__Game__Group__1__Impl : ( ( rule__Game__TitleAssignment_1 ) ) ;
    public final void rule__Game__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1354:1: ( ( ( rule__Game__TitleAssignment_1 ) ) )
            // InternalChessDSL.g:1355:1: ( ( rule__Game__TitleAssignment_1 ) )
            {
            // InternalChessDSL.g:1355:1: ( ( rule__Game__TitleAssignment_1 ) )
            // InternalChessDSL.g:1356:2: ( rule__Game__TitleAssignment_1 )
            {
             before(grammarAccess.getGameAccess().getTitleAssignment_1()); 
            // InternalChessDSL.g:1357:2: ( rule__Game__TitleAssignment_1 )
            // InternalChessDSL.g:1357:3: rule__Game__TitleAssignment_1
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
    // InternalChessDSL.g:1365:1: rule__Game__Group__2 : rule__Game__Group__2__Impl rule__Game__Group__3 ;
    public final void rule__Game__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1369:1: ( rule__Game__Group__2__Impl rule__Game__Group__3 )
            // InternalChessDSL.g:1370:2: rule__Game__Group__2__Impl rule__Game__Group__3
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
    // InternalChessDSL.g:1377:1: rule__Game__Group__2__Impl : ( ( rule__Game__Group_2__0 )? ) ;
    public final void rule__Game__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1381:1: ( ( ( rule__Game__Group_2__0 )? ) )
            // InternalChessDSL.g:1382:1: ( ( rule__Game__Group_2__0 )? )
            {
            // InternalChessDSL.g:1382:1: ( ( rule__Game__Group_2__0 )? )
            // InternalChessDSL.g:1383:2: ( rule__Game__Group_2__0 )?
            {
             before(grammarAccess.getGameAccess().getGroup_2()); 
            // InternalChessDSL.g:1384:2: ( rule__Game__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==39) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalChessDSL.g:1384:3: rule__Game__Group_2__0
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
    // InternalChessDSL.g:1392:1: rule__Game__Group__3 : rule__Game__Group__3__Impl rule__Game__Group__4 ;
    public final void rule__Game__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1396:1: ( rule__Game__Group__3__Impl rule__Game__Group__4 )
            // InternalChessDSL.g:1397:2: rule__Game__Group__3__Impl rule__Game__Group__4
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
    // InternalChessDSL.g:1404:1: rule__Game__Group__3__Impl : ( ( rule__Game__InitialAssignment_3 )? ) ;
    public final void rule__Game__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1408:1: ( ( ( rule__Game__InitialAssignment_3 )? ) )
            // InternalChessDSL.g:1409:1: ( ( rule__Game__InitialAssignment_3 )? )
            {
            // InternalChessDSL.g:1409:1: ( ( rule__Game__InitialAssignment_3 )? )
            // InternalChessDSL.g:1410:2: ( rule__Game__InitialAssignment_3 )?
            {
             before(grammarAccess.getGameAccess().getInitialAssignment_3()); 
            // InternalChessDSL.g:1411:2: ( rule__Game__InitialAssignment_3 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==41) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalChessDSL.g:1411:3: rule__Game__InitialAssignment_3
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
    // InternalChessDSL.g:1419:1: rule__Game__Group__4 : rule__Game__Group__4__Impl rule__Game__Group__5 ;
    public final void rule__Game__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1423:1: ( rule__Game__Group__4__Impl rule__Game__Group__5 )
            // InternalChessDSL.g:1424:2: rule__Game__Group__4__Impl rule__Game__Group__5
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
    // InternalChessDSL.g:1431:1: rule__Game__Group__4__Impl : ( 'Moves:' ) ;
    public final void rule__Game__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1435:1: ( ( 'Moves:' ) )
            // InternalChessDSL.g:1436:1: ( 'Moves:' )
            {
            // InternalChessDSL.g:1436:1: ( 'Moves:' )
            // InternalChessDSL.g:1437:2: 'Moves:'
            {
             before(grammarAccess.getGameAccess().getMovesKeyword_4()); 
            match(input,37,FOLLOW_2); 
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
    // InternalChessDSL.g:1446:1: rule__Game__Group__5 : rule__Game__Group__5__Impl rule__Game__Group__6 ;
    public final void rule__Game__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1450:1: ( rule__Game__Group__5__Impl rule__Game__Group__6 )
            // InternalChessDSL.g:1451:2: rule__Game__Group__5__Impl rule__Game__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalChessDSL.g:1458:1: rule__Game__Group__5__Impl : ( ( ( rule__Game__MovesAssignment_5 ) ) ( ( rule__Game__MovesAssignment_5 )* ) ) ;
    public final void rule__Game__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1462:1: ( ( ( ( rule__Game__MovesAssignment_5 ) ) ( ( rule__Game__MovesAssignment_5 )* ) ) )
            // InternalChessDSL.g:1463:1: ( ( ( rule__Game__MovesAssignment_5 ) ) ( ( rule__Game__MovesAssignment_5 )* ) )
            {
            // InternalChessDSL.g:1463:1: ( ( ( rule__Game__MovesAssignment_5 ) ) ( ( rule__Game__MovesAssignment_5 )* ) )
            // InternalChessDSL.g:1464:2: ( ( rule__Game__MovesAssignment_5 ) ) ( ( rule__Game__MovesAssignment_5 )* )
            {
            // InternalChessDSL.g:1464:2: ( ( rule__Game__MovesAssignment_5 ) )
            // InternalChessDSL.g:1465:3: ( rule__Game__MovesAssignment_5 )
            {
             before(grammarAccess.getGameAccess().getMovesAssignment_5()); 
            // InternalChessDSL.g:1466:3: ( rule__Game__MovesAssignment_5 )
            // InternalChessDSL.g:1466:4: rule__Game__MovesAssignment_5
            {
            pushFollow(FOLLOW_7);
            rule__Game__MovesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getMovesAssignment_5()); 

            }

            // InternalChessDSL.g:1469:2: ( ( rule__Game__MovesAssignment_5 )* )
            // InternalChessDSL.g:1470:3: ( rule__Game__MovesAssignment_5 )*
            {
             before(grammarAccess.getGameAccess().getMovesAssignment_5()); 
            // InternalChessDSL.g:1471:3: ( rule__Game__MovesAssignment_5 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_MOVENUMBER) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalChessDSL.g:1471:4: rule__Game__MovesAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Game__MovesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getGameAccess().getMovesAssignment_5()); 

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
    // $ANTLR end "rule__Game__Group__5__Impl"


    // $ANTLR start "rule__Game__Group__6"
    // InternalChessDSL.g:1480:1: rule__Game__Group__6 : rule__Game__Group__6__Impl rule__Game__Group__7 ;
    public final void rule__Game__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1484:1: ( rule__Game__Group__6__Impl rule__Game__Group__7 )
            // InternalChessDSL.g:1485:2: rule__Game__Group__6__Impl rule__Game__Group__7
            {
            pushFollow(FOLLOW_8);
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
    // InternalChessDSL.g:1492:1: rule__Game__Group__6__Impl : ( 'end' ) ;
    public final void rule__Game__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1496:1: ( ( 'end' ) )
            // InternalChessDSL.g:1497:1: ( 'end' )
            {
            // InternalChessDSL.g:1497:1: ( 'end' )
            // InternalChessDSL.g:1498:2: 'end'
            {
             before(grammarAccess.getGameAccess().getEndKeyword_6()); 
            match(input,38,FOLLOW_2); 
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
    // InternalChessDSL.g:1507:1: rule__Game__Group__7 : rule__Game__Group__7__Impl ;
    public final void rule__Game__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1511:1: ( rule__Game__Group__7__Impl )
            // InternalChessDSL.g:1512:2: rule__Game__Group__7__Impl
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
    // InternalChessDSL.g:1518:1: rule__Game__Group__7__Impl : ( ( rule__Game__ConclusionAssignment_7 )? ) ;
    public final void rule__Game__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1522:1: ( ( ( rule__Game__ConclusionAssignment_7 )? ) )
            // InternalChessDSL.g:1523:1: ( ( rule__Game__ConclusionAssignment_7 )? )
            {
            // InternalChessDSL.g:1523:1: ( ( rule__Game__ConclusionAssignment_7 )? )
            // InternalChessDSL.g:1524:2: ( rule__Game__ConclusionAssignment_7 )?
            {
             before(grammarAccess.getGameAccess().getConclusionAssignment_7()); 
            // InternalChessDSL.g:1525:2: ( rule__Game__ConclusionAssignment_7 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID||LA22_0==20||(LA22_0>=28 && LA22_0<=29)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalChessDSL.g:1525:3: rule__Game__ConclusionAssignment_7
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
    // InternalChessDSL.g:1534:1: rule__Game__Group_2__0 : rule__Game__Group_2__0__Impl rule__Game__Group_2__1 ;
    public final void rule__Game__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1538:1: ( rule__Game__Group_2__0__Impl rule__Game__Group_2__1 )
            // InternalChessDSL.g:1539:2: rule__Game__Group_2__0__Impl rule__Game__Group_2__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalChessDSL.g:1546:1: rule__Game__Group_2__0__Impl : ( 'Players:' ) ;
    public final void rule__Game__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1550:1: ( ( 'Players:' ) )
            // InternalChessDSL.g:1551:1: ( 'Players:' )
            {
            // InternalChessDSL.g:1551:1: ( 'Players:' )
            // InternalChessDSL.g:1552:2: 'Players:'
            {
             before(grammarAccess.getGameAccess().getPlayersKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalChessDSL.g:1561:1: rule__Game__Group_2__1 : rule__Game__Group_2__1__Impl ;
    public final void rule__Game__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1565:1: ( rule__Game__Group_2__1__Impl )
            // InternalChessDSL.g:1566:2: rule__Game__Group_2__1__Impl
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
    // InternalChessDSL.g:1572:1: rule__Game__Group_2__1__Impl : ( ( ( rule__Game__PlayersAssignment_2_1 ) ) ( ( rule__Game__PlayersAssignment_2_1 )* ) ) ;
    public final void rule__Game__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1576:1: ( ( ( ( rule__Game__PlayersAssignment_2_1 ) ) ( ( rule__Game__PlayersAssignment_2_1 )* ) ) )
            // InternalChessDSL.g:1577:1: ( ( ( rule__Game__PlayersAssignment_2_1 ) ) ( ( rule__Game__PlayersAssignment_2_1 )* ) )
            {
            // InternalChessDSL.g:1577:1: ( ( ( rule__Game__PlayersAssignment_2_1 ) ) ( ( rule__Game__PlayersAssignment_2_1 )* ) )
            // InternalChessDSL.g:1578:2: ( ( rule__Game__PlayersAssignment_2_1 ) ) ( ( rule__Game__PlayersAssignment_2_1 )* )
            {
            // InternalChessDSL.g:1578:2: ( ( rule__Game__PlayersAssignment_2_1 ) )
            // InternalChessDSL.g:1579:3: ( rule__Game__PlayersAssignment_2_1 )
            {
             before(grammarAccess.getGameAccess().getPlayersAssignment_2_1()); 
            // InternalChessDSL.g:1580:3: ( rule__Game__PlayersAssignment_2_1 )
            // InternalChessDSL.g:1580:4: rule__Game__PlayersAssignment_2_1
            {
            pushFollow(FOLLOW_10);
            rule__Game__PlayersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getPlayersAssignment_2_1()); 

            }

            // InternalChessDSL.g:1583:2: ( ( rule__Game__PlayersAssignment_2_1 )* )
            // InternalChessDSL.g:1584:3: ( rule__Game__PlayersAssignment_2_1 )*
            {
             before(grammarAccess.getGameAccess().getPlayersAssignment_2_1()); 
            // InternalChessDSL.g:1585:3: ( rule__Game__PlayersAssignment_2_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=28 && LA23_0<=29)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalChessDSL.g:1585:4: rule__Game__PlayersAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Game__PlayersAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalChessDSL.g:1595:1: rule__Player__Group__0 : rule__Player__Group__0__Impl rule__Player__Group__1 ;
    public final void rule__Player__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1599:1: ( rule__Player__Group__0__Impl rule__Player__Group__1 )
            // InternalChessDSL.g:1600:2: rule__Player__Group__0__Impl rule__Player__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalChessDSL.g:1607:1: rule__Player__Group__0__Impl : ( ( rule__Player__ColorAssignment_0 ) ) ;
    public final void rule__Player__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1611:1: ( ( ( rule__Player__ColorAssignment_0 ) ) )
            // InternalChessDSL.g:1612:1: ( ( rule__Player__ColorAssignment_0 ) )
            {
            // InternalChessDSL.g:1612:1: ( ( rule__Player__ColorAssignment_0 ) )
            // InternalChessDSL.g:1613:2: ( rule__Player__ColorAssignment_0 )
            {
             before(grammarAccess.getPlayerAccess().getColorAssignment_0()); 
            // InternalChessDSL.g:1614:2: ( rule__Player__ColorAssignment_0 )
            // InternalChessDSL.g:1614:3: rule__Player__ColorAssignment_0
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
    // InternalChessDSL.g:1622:1: rule__Player__Group__1 : rule__Player__Group__1__Impl rule__Player__Group__2 ;
    public final void rule__Player__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1626:1: ( rule__Player__Group__1__Impl rule__Player__Group__2 )
            // InternalChessDSL.g:1627:2: rule__Player__Group__1__Impl rule__Player__Group__2
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
    // InternalChessDSL.g:1634:1: rule__Player__Group__1__Impl : ( ':' ) ;
    public final void rule__Player__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1638:1: ( ( ':' ) )
            // InternalChessDSL.g:1639:1: ( ':' )
            {
            // InternalChessDSL.g:1639:1: ( ':' )
            // InternalChessDSL.g:1640:2: ':'
            {
             before(grammarAccess.getPlayerAccess().getColonKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalChessDSL.g:1649:1: rule__Player__Group__2 : rule__Player__Group__2__Impl ;
    public final void rule__Player__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1653:1: ( rule__Player__Group__2__Impl )
            // InternalChessDSL.g:1654:2: rule__Player__Group__2__Impl
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
    // InternalChessDSL.g:1660:1: rule__Player__Group__2__Impl : ( ( rule__Player__NameAssignment_2 ) ) ;
    public final void rule__Player__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1664:1: ( ( ( rule__Player__NameAssignment_2 ) ) )
            // InternalChessDSL.g:1665:1: ( ( rule__Player__NameAssignment_2 ) )
            {
            // InternalChessDSL.g:1665:1: ( ( rule__Player__NameAssignment_2 ) )
            // InternalChessDSL.g:1666:2: ( rule__Player__NameAssignment_2 )
            {
             before(grammarAccess.getPlayerAccess().getNameAssignment_2()); 
            // InternalChessDSL.g:1667:2: ( rule__Player__NameAssignment_2 )
            // InternalChessDSL.g:1667:3: rule__Player__NameAssignment_2
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
    // InternalChessDSL.g:1676:1: rule__InitialState__Group__0 : rule__InitialState__Group__0__Impl rule__InitialState__Group__1 ;
    public final void rule__InitialState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1680:1: ( rule__InitialState__Group__0__Impl rule__InitialState__Group__1 )
            // InternalChessDSL.g:1681:2: rule__InitialState__Group__0__Impl rule__InitialState__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalChessDSL.g:1688:1: rule__InitialState__Group__0__Impl : ( () ) ;
    public final void rule__InitialState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1692:1: ( ( () ) )
            // InternalChessDSL.g:1693:1: ( () )
            {
            // InternalChessDSL.g:1693:1: ( () )
            // InternalChessDSL.g:1694:2: ()
            {
             before(grammarAccess.getInitialStateAccess().getInitialStateAction_0()); 
            // InternalChessDSL.g:1695:2: ()
            // InternalChessDSL.g:1695:3: 
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
    // InternalChessDSL.g:1703:1: rule__InitialState__Group__1 : rule__InitialState__Group__1__Impl rule__InitialState__Group__2 ;
    public final void rule__InitialState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1707:1: ( rule__InitialState__Group__1__Impl rule__InitialState__Group__2 )
            // InternalChessDSL.g:1708:2: rule__InitialState__Group__1__Impl rule__InitialState__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalChessDSL.g:1715:1: rule__InitialState__Group__1__Impl : ( 'InitialState' ) ;
    public final void rule__InitialState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1719:1: ( ( 'InitialState' ) )
            // InternalChessDSL.g:1720:1: ( 'InitialState' )
            {
            // InternalChessDSL.g:1720:1: ( 'InitialState' )
            // InternalChessDSL.g:1721:2: 'InitialState'
            {
             before(grammarAccess.getInitialStateAccess().getInitialStateKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalChessDSL.g:1730:1: rule__InitialState__Group__2 : rule__InitialState__Group__2__Impl ;
    public final void rule__InitialState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1734:1: ( rule__InitialState__Group__2__Impl )
            // InternalChessDSL.g:1735:2: rule__InitialState__Group__2__Impl
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
    // InternalChessDSL.g:1741:1: rule__InitialState__Group__2__Impl : ( ( rule__InitialState__Alternatives_2 )? ) ;
    public final void rule__InitialState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1745:1: ( ( ( rule__InitialState__Alternatives_2 )? ) )
            // InternalChessDSL.g:1746:1: ( ( rule__InitialState__Alternatives_2 )? )
            {
            // InternalChessDSL.g:1746:1: ( ( rule__InitialState__Alternatives_2 )? )
            // InternalChessDSL.g:1747:2: ( rule__InitialState__Alternatives_2 )?
            {
             before(grammarAccess.getInitialStateAccess().getAlternatives_2()); 
            // InternalChessDSL.g:1748:2: ( rule__InitialState__Alternatives_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==14||LA24_0==42) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalChessDSL.g:1748:3: rule__InitialState__Alternatives_2
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
    // InternalChessDSL.g:1757:1: rule__InitialState__Group_2_1__0 : rule__InitialState__Group_2_1__0__Impl rule__InitialState__Group_2_1__1 ;
    public final void rule__InitialState__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1761:1: ( rule__InitialState__Group_2_1__0__Impl rule__InitialState__Group_2_1__1 )
            // InternalChessDSL.g:1762:2: rule__InitialState__Group_2_1__0__Impl rule__InitialState__Group_2_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalChessDSL.g:1769:1: rule__InitialState__Group_2_1__0__Impl : ( 'custom' ) ;
    public final void rule__InitialState__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1773:1: ( ( 'custom' ) )
            // InternalChessDSL.g:1774:1: ( 'custom' )
            {
            // InternalChessDSL.g:1774:1: ( 'custom' )
            // InternalChessDSL.g:1775:2: 'custom'
            {
             before(grammarAccess.getInitialStateAccess().getCustomKeyword_2_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalChessDSL.g:1784:1: rule__InitialState__Group_2_1__1 : rule__InitialState__Group_2_1__1__Impl ;
    public final void rule__InitialState__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1788:1: ( rule__InitialState__Group_2_1__1__Impl )
            // InternalChessDSL.g:1789:2: rule__InitialState__Group_2_1__1__Impl
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
    // InternalChessDSL.g:1795:1: rule__InitialState__Group_2_1__1__Impl : ( ( rule__InitialState__PositionsAssignment_2_1_1 ) ) ;
    public final void rule__InitialState__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1799:1: ( ( ( rule__InitialState__PositionsAssignment_2_1_1 ) ) )
            // InternalChessDSL.g:1800:1: ( ( rule__InitialState__PositionsAssignment_2_1_1 ) )
            {
            // InternalChessDSL.g:1800:1: ( ( rule__InitialState__PositionsAssignment_2_1_1 ) )
            // InternalChessDSL.g:1801:2: ( rule__InitialState__PositionsAssignment_2_1_1 )
            {
             before(grammarAccess.getInitialStateAccess().getPositionsAssignment_2_1_1()); 
            // InternalChessDSL.g:1802:2: ( rule__InitialState__PositionsAssignment_2_1_1 )
            // InternalChessDSL.g:1802:3: rule__InitialState__PositionsAssignment_2_1_1
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
    // InternalChessDSL.g:1811:1: rule__CustomPositions__Group__0 : rule__CustomPositions__Group__0__Impl rule__CustomPositions__Group__1 ;
    public final void rule__CustomPositions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1815:1: ( rule__CustomPositions__Group__0__Impl rule__CustomPositions__Group__1 )
            // InternalChessDSL.g:1816:2: rule__CustomPositions__Group__0__Impl rule__CustomPositions__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalChessDSL.g:1823:1: rule__CustomPositions__Group__0__Impl : ( () ) ;
    public final void rule__CustomPositions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1827:1: ( ( () ) )
            // InternalChessDSL.g:1828:1: ( () )
            {
            // InternalChessDSL.g:1828:1: ( () )
            // InternalChessDSL.g:1829:2: ()
            {
             before(grammarAccess.getCustomPositionsAccess().getCustomPositionsAction_0()); 
            // InternalChessDSL.g:1830:2: ()
            // InternalChessDSL.g:1830:3: 
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
    // InternalChessDSL.g:1838:1: rule__CustomPositions__Group__1 : rule__CustomPositions__Group__1__Impl rule__CustomPositions__Group__2 ;
    public final void rule__CustomPositions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1842:1: ( rule__CustomPositions__Group__1__Impl rule__CustomPositions__Group__2 )
            // InternalChessDSL.g:1843:2: rule__CustomPositions__Group__1__Impl rule__CustomPositions__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalChessDSL.g:1850:1: rule__CustomPositions__Group__1__Impl : ( 'Positions:' ) ;
    public final void rule__CustomPositions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1854:1: ( ( 'Positions:' ) )
            // InternalChessDSL.g:1855:1: ( 'Positions:' )
            {
            // InternalChessDSL.g:1855:1: ( 'Positions:' )
            // InternalChessDSL.g:1856:2: 'Positions:'
            {
             before(grammarAccess.getCustomPositionsAccess().getPositionsKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalChessDSL.g:1865:1: rule__CustomPositions__Group__2 : rule__CustomPositions__Group__2__Impl rule__CustomPositions__Group__3 ;
    public final void rule__CustomPositions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1869:1: ( rule__CustomPositions__Group__2__Impl rule__CustomPositions__Group__3 )
            // InternalChessDSL.g:1870:2: rule__CustomPositions__Group__2__Impl rule__CustomPositions__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalChessDSL.g:1877:1: rule__CustomPositions__Group__2__Impl : ( '{' ) ;
    public final void rule__CustomPositions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1881:1: ( ( '{' ) )
            // InternalChessDSL.g:1882:1: ( '{' )
            {
            // InternalChessDSL.g:1882:1: ( '{' )
            // InternalChessDSL.g:1883:2: '{'
            {
             before(grammarAccess.getCustomPositionsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,44,FOLLOW_2); 
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
    // InternalChessDSL.g:1892:1: rule__CustomPositions__Group__3 : rule__CustomPositions__Group__3__Impl rule__CustomPositions__Group__4 ;
    public final void rule__CustomPositions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1896:1: ( rule__CustomPositions__Group__3__Impl rule__CustomPositions__Group__4 )
            // InternalChessDSL.g:1897:2: rule__CustomPositions__Group__3__Impl rule__CustomPositions__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalChessDSL.g:1904:1: rule__CustomPositions__Group__3__Impl : ( ( rule__CustomPositions__PlacementAssignment_3 )* ) ;
    public final void rule__CustomPositions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1908:1: ( ( ( rule__CustomPositions__PlacementAssignment_3 )* ) )
            // InternalChessDSL.g:1909:1: ( ( rule__CustomPositions__PlacementAssignment_3 )* )
            {
            // InternalChessDSL.g:1909:1: ( ( rule__CustomPositions__PlacementAssignment_3 )* )
            // InternalChessDSL.g:1910:2: ( rule__CustomPositions__PlacementAssignment_3 )*
            {
             before(grammarAccess.getCustomPositionsAccess().getPlacementAssignment_3()); 
            // InternalChessDSL.g:1911:2: ( rule__CustomPositions__PlacementAssignment_3 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=28 && LA25_0<=29)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalChessDSL.g:1911:3: rule__CustomPositions__PlacementAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__CustomPositions__PlacementAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalChessDSL.g:1919:1: rule__CustomPositions__Group__4 : rule__CustomPositions__Group__4__Impl ;
    public final void rule__CustomPositions__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1923:1: ( rule__CustomPositions__Group__4__Impl )
            // InternalChessDSL.g:1924:2: rule__CustomPositions__Group__4__Impl
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
    // InternalChessDSL.g:1930:1: rule__CustomPositions__Group__4__Impl : ( '}' ) ;
    public final void rule__CustomPositions__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1934:1: ( ( '}' ) )
            // InternalChessDSL.g:1935:1: ( '}' )
            {
            // InternalChessDSL.g:1935:1: ( '}' )
            // InternalChessDSL.g:1936:2: '}'
            {
             before(grammarAccess.getCustomPositionsAccess().getRightCurlyBracketKeyword_4()); 
            match(input,45,FOLLOW_2); 
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
    // InternalChessDSL.g:1946:1: rule__Placement__Group__0 : rule__Placement__Group__0__Impl rule__Placement__Group__1 ;
    public final void rule__Placement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1950:1: ( rule__Placement__Group__0__Impl rule__Placement__Group__1 )
            // InternalChessDSL.g:1951:2: rule__Placement__Group__0__Impl rule__Placement__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalChessDSL.g:1958:1: rule__Placement__Group__0__Impl : ( ( rule__Placement__PieceAssignment_0 ) ) ;
    public final void rule__Placement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1962:1: ( ( ( rule__Placement__PieceAssignment_0 ) ) )
            // InternalChessDSL.g:1963:1: ( ( rule__Placement__PieceAssignment_0 ) )
            {
            // InternalChessDSL.g:1963:1: ( ( rule__Placement__PieceAssignment_0 ) )
            // InternalChessDSL.g:1964:2: ( rule__Placement__PieceAssignment_0 )
            {
             before(grammarAccess.getPlacementAccess().getPieceAssignment_0()); 
            // InternalChessDSL.g:1965:2: ( rule__Placement__PieceAssignment_0 )
            // InternalChessDSL.g:1965:3: rule__Placement__PieceAssignment_0
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
    // InternalChessDSL.g:1973:1: rule__Placement__Group__1 : rule__Placement__Group__1__Impl rule__Placement__Group__2 ;
    public final void rule__Placement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1977:1: ( rule__Placement__Group__1__Impl rule__Placement__Group__2 )
            // InternalChessDSL.g:1978:2: rule__Placement__Group__1__Impl rule__Placement__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalChessDSL.g:1985:1: rule__Placement__Group__1__Impl : ( ( rule__Placement__Alternatives_1 ) ) ;
    public final void rule__Placement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1989:1: ( ( ( rule__Placement__Alternatives_1 ) ) )
            // InternalChessDSL.g:1990:1: ( ( rule__Placement__Alternatives_1 ) )
            {
            // InternalChessDSL.g:1990:1: ( ( rule__Placement__Alternatives_1 ) )
            // InternalChessDSL.g:1991:2: ( rule__Placement__Alternatives_1 )
            {
             before(grammarAccess.getPlacementAccess().getAlternatives_1()); 
            // InternalChessDSL.g:1992:2: ( rule__Placement__Alternatives_1 )
            // InternalChessDSL.g:1992:3: rule__Placement__Alternatives_1
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
    // InternalChessDSL.g:2000:1: rule__Placement__Group__2 : rule__Placement__Group__2__Impl ;
    public final void rule__Placement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2004:1: ( rule__Placement__Group__2__Impl )
            // InternalChessDSL.g:2005:2: rule__Placement__Group__2__Impl
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
    // InternalChessDSL.g:2011:1: rule__Placement__Group__2__Impl : ( ( rule__Placement__SquareAssignment_2 ) ) ;
    public final void rule__Placement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2015:1: ( ( ( rule__Placement__SquareAssignment_2 ) ) )
            // InternalChessDSL.g:2016:1: ( ( rule__Placement__SquareAssignment_2 ) )
            {
            // InternalChessDSL.g:2016:1: ( ( rule__Placement__SquareAssignment_2 ) )
            // InternalChessDSL.g:2017:2: ( rule__Placement__SquareAssignment_2 )
            {
             before(grammarAccess.getPlacementAccess().getSquareAssignment_2()); 
            // InternalChessDSL.g:2018:2: ( rule__Placement__SquareAssignment_2 )
            // InternalChessDSL.g:2018:3: rule__Placement__SquareAssignment_2
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
    // InternalChessDSL.g:2027:1: rule__CustomPiece__Group__0 : rule__CustomPiece__Group__0__Impl rule__CustomPiece__Group__1 ;
    public final void rule__CustomPiece__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2031:1: ( rule__CustomPiece__Group__0__Impl rule__CustomPiece__Group__1 )
            // InternalChessDSL.g:2032:2: rule__CustomPiece__Group__0__Impl rule__CustomPiece__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalChessDSL.g:2039:1: rule__CustomPiece__Group__0__Impl : ( ( rule__CustomPiece__ColorAssignment_0 ) ) ;
    public final void rule__CustomPiece__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2043:1: ( ( ( rule__CustomPiece__ColorAssignment_0 ) ) )
            // InternalChessDSL.g:2044:1: ( ( rule__CustomPiece__ColorAssignment_0 ) )
            {
            // InternalChessDSL.g:2044:1: ( ( rule__CustomPiece__ColorAssignment_0 ) )
            // InternalChessDSL.g:2045:2: ( rule__CustomPiece__ColorAssignment_0 )
            {
             before(grammarAccess.getCustomPieceAccess().getColorAssignment_0()); 
            // InternalChessDSL.g:2046:2: ( rule__CustomPiece__ColorAssignment_0 )
            // InternalChessDSL.g:2046:3: rule__CustomPiece__ColorAssignment_0
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
    // InternalChessDSL.g:2054:1: rule__CustomPiece__Group__1 : rule__CustomPiece__Group__1__Impl ;
    public final void rule__CustomPiece__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2058:1: ( rule__CustomPiece__Group__1__Impl )
            // InternalChessDSL.g:2059:2: rule__CustomPiece__Group__1__Impl
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
    // InternalChessDSL.g:2065:1: rule__CustomPiece__Group__1__Impl : ( ( rule__CustomPiece__KindAssignment_1 ) ) ;
    public final void rule__CustomPiece__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2069:1: ( ( ( rule__CustomPiece__KindAssignment_1 ) ) )
            // InternalChessDSL.g:2070:1: ( ( rule__CustomPiece__KindAssignment_1 ) )
            {
            // InternalChessDSL.g:2070:1: ( ( rule__CustomPiece__KindAssignment_1 ) )
            // InternalChessDSL.g:2071:2: ( rule__CustomPiece__KindAssignment_1 )
            {
             before(grammarAccess.getCustomPieceAccess().getKindAssignment_1()); 
            // InternalChessDSL.g:2072:2: ( rule__CustomPiece__KindAssignment_1 )
            // InternalChessDSL.g:2072:3: rule__CustomPiece__KindAssignment_1
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
    // InternalChessDSL.g:2081:1: rule__MovePair__Group__0 : rule__MovePair__Group__0__Impl rule__MovePair__Group__1 ;
    public final void rule__MovePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2085:1: ( rule__MovePair__Group__0__Impl rule__MovePair__Group__1 )
            // InternalChessDSL.g:2086:2: rule__MovePair__Group__0__Impl rule__MovePair__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalChessDSL.g:2093:1: rule__MovePair__Group__0__Impl : ( ( rule__MovePair__MoveNumberAssignment_0 ) ) ;
    public final void rule__MovePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2097:1: ( ( ( rule__MovePair__MoveNumberAssignment_0 ) ) )
            // InternalChessDSL.g:2098:1: ( ( rule__MovePair__MoveNumberAssignment_0 ) )
            {
            // InternalChessDSL.g:2098:1: ( ( rule__MovePair__MoveNumberAssignment_0 ) )
            // InternalChessDSL.g:2099:2: ( rule__MovePair__MoveNumberAssignment_0 )
            {
             before(grammarAccess.getMovePairAccess().getMoveNumberAssignment_0()); 
            // InternalChessDSL.g:2100:2: ( rule__MovePair__MoveNumberAssignment_0 )
            // InternalChessDSL.g:2100:3: rule__MovePair__MoveNumberAssignment_0
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
    // InternalChessDSL.g:2108:1: rule__MovePair__Group__1 : rule__MovePair__Group__1__Impl rule__MovePair__Group__2 ;
    public final void rule__MovePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2112:1: ( rule__MovePair__Group__1__Impl rule__MovePair__Group__2 )
            // InternalChessDSL.g:2113:2: rule__MovePair__Group__1__Impl rule__MovePair__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalChessDSL.g:2120:1: rule__MovePair__Group__1__Impl : ( ( rule__MovePair__Alternatives_1 ) ) ;
    public final void rule__MovePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2124:1: ( ( ( rule__MovePair__Alternatives_1 ) ) )
            // InternalChessDSL.g:2125:1: ( ( rule__MovePair__Alternatives_1 ) )
            {
            // InternalChessDSL.g:2125:1: ( ( rule__MovePair__Alternatives_1 ) )
            // InternalChessDSL.g:2126:2: ( rule__MovePair__Alternatives_1 )
            {
             before(grammarAccess.getMovePairAccess().getAlternatives_1()); 
            // InternalChessDSL.g:2127:2: ( rule__MovePair__Alternatives_1 )
            // InternalChessDSL.g:2127:3: rule__MovePair__Alternatives_1
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
    // InternalChessDSL.g:2135:1: rule__MovePair__Group__2 : rule__MovePair__Group__2__Impl ;
    public final void rule__MovePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2139:1: ( rule__MovePair__Group__2__Impl )
            // InternalChessDSL.g:2140:2: rule__MovePair__Group__2__Impl
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
    // InternalChessDSL.g:2146:1: rule__MovePair__Group__2__Impl : ( ( rule__MovePair__Group_2__0 )? ) ;
    public final void rule__MovePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2150:1: ( ( ( rule__MovePair__Group_2__0 )? ) )
            // InternalChessDSL.g:2151:1: ( ( rule__MovePair__Group_2__0 )? )
            {
            // InternalChessDSL.g:2151:1: ( ( rule__MovePair__Group_2__0 )? )
            // InternalChessDSL.g:2152:2: ( rule__MovePair__Group_2__0 )?
            {
             before(grammarAccess.getMovePairAccess().getGroup_2()); 
            // InternalChessDSL.g:2153:2: ( rule__MovePair__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID||LA26_0==13||(LA26_0>=30 && LA26_0<=35)||LA26_0==48||(LA26_0>=55 && LA26_0<=56)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalChessDSL.g:2153:3: rule__MovePair__Group_2__0
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
    // InternalChessDSL.g:2162:1: rule__MovePair__Group_1_0__0 : rule__MovePair__Group_1_0__0__Impl rule__MovePair__Group_1_0__1 ;
    public final void rule__MovePair__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2166:1: ( rule__MovePair__Group_1_0__0__Impl rule__MovePair__Group_1_0__1 )
            // InternalChessDSL.g:2167:2: rule__MovePair__Group_1_0__0__Impl rule__MovePair__Group_1_0__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalChessDSL.g:2174:1: rule__MovePair__Group_1_0__0__Impl : ( ( rule__MovePair__Color1Assignment_1_0_0 )? ) ;
    public final void rule__MovePair__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2178:1: ( ( ( rule__MovePair__Color1Assignment_1_0_0 )? ) )
            // InternalChessDSL.g:2179:1: ( ( rule__MovePair__Color1Assignment_1_0_0 )? )
            {
            // InternalChessDSL.g:2179:1: ( ( rule__MovePair__Color1Assignment_1_0_0 )? )
            // InternalChessDSL.g:2180:2: ( rule__MovePair__Color1Assignment_1_0_0 )?
            {
             before(grammarAccess.getMovePairAccess().getColor1Assignment_1_0_0()); 
            // InternalChessDSL.g:2181:2: ( rule__MovePair__Color1Assignment_1_0_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalChessDSL.g:2181:3: rule__MovePair__Color1Assignment_1_0_0
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
    // InternalChessDSL.g:2189:1: rule__MovePair__Group_1_0__1 : rule__MovePair__Group_1_0__1__Impl ;
    public final void rule__MovePair__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2193:1: ( rule__MovePair__Group_1_0__1__Impl )
            // InternalChessDSL.g:2194:2: rule__MovePair__Group_1_0__1__Impl
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
    // InternalChessDSL.g:2200:1: rule__MovePair__Group_1_0__1__Impl : ( ( rule__MovePair__WhiteMoveAssignment_1_0_1 ) ) ;
    public final void rule__MovePair__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2204:1: ( ( ( rule__MovePair__WhiteMoveAssignment_1_0_1 ) ) )
            // InternalChessDSL.g:2205:1: ( ( rule__MovePair__WhiteMoveAssignment_1_0_1 ) )
            {
            // InternalChessDSL.g:2205:1: ( ( rule__MovePair__WhiteMoveAssignment_1_0_1 ) )
            // InternalChessDSL.g:2206:2: ( rule__MovePair__WhiteMoveAssignment_1_0_1 )
            {
             before(grammarAccess.getMovePairAccess().getWhiteMoveAssignment_1_0_1()); 
            // InternalChessDSL.g:2207:2: ( rule__MovePair__WhiteMoveAssignment_1_0_1 )
            // InternalChessDSL.g:2207:3: rule__MovePair__WhiteMoveAssignment_1_0_1
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
    // InternalChessDSL.g:2216:1: rule__MovePair__Group_2__0 : rule__MovePair__Group_2__0__Impl rule__MovePair__Group_2__1 ;
    public final void rule__MovePair__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2220:1: ( rule__MovePair__Group_2__0__Impl rule__MovePair__Group_2__1 )
            // InternalChessDSL.g:2221:2: rule__MovePair__Group_2__0__Impl rule__MovePair__Group_2__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalChessDSL.g:2228:1: rule__MovePair__Group_2__0__Impl : ( ( rule__MovePair__Color2Assignment_2_0 )? ) ;
    public final void rule__MovePair__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2232:1: ( ( ( rule__MovePair__Color2Assignment_2_0 )? ) )
            // InternalChessDSL.g:2233:1: ( ( rule__MovePair__Color2Assignment_2_0 )? )
            {
            // InternalChessDSL.g:2233:1: ( ( rule__MovePair__Color2Assignment_2_0 )? )
            // InternalChessDSL.g:2234:2: ( rule__MovePair__Color2Assignment_2_0 )?
            {
             before(grammarAccess.getMovePairAccess().getColor2Assignment_2_0()); 
            // InternalChessDSL.g:2235:2: ( rule__MovePair__Color2Assignment_2_0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalChessDSL.g:2235:3: rule__MovePair__Color2Assignment_2_0
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
    // InternalChessDSL.g:2243:1: rule__MovePair__Group_2__1 : rule__MovePair__Group_2__1__Impl ;
    public final void rule__MovePair__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2247:1: ( rule__MovePair__Group_2__1__Impl )
            // InternalChessDSL.g:2248:2: rule__MovePair__Group_2__1__Impl
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
    // InternalChessDSL.g:2254:1: rule__MovePair__Group_2__1__Impl : ( ( rule__MovePair__BlackMoveAssignment_2_1 ) ) ;
    public final void rule__MovePair__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2258:1: ( ( ( rule__MovePair__BlackMoveAssignment_2_1 ) ) )
            // InternalChessDSL.g:2259:1: ( ( rule__MovePair__BlackMoveAssignment_2_1 ) )
            {
            // InternalChessDSL.g:2259:1: ( ( rule__MovePair__BlackMoveAssignment_2_1 ) )
            // InternalChessDSL.g:2260:2: ( rule__MovePair__BlackMoveAssignment_2_1 )
            {
             before(grammarAccess.getMovePairAccess().getBlackMoveAssignment_2_1()); 
            // InternalChessDSL.g:2261:2: ( rule__MovePair__BlackMoveAssignment_2_1 )
            // InternalChessDSL.g:2261:3: rule__MovePair__BlackMoveAssignment_2_1
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


    // $ANTLR start "rule__AnyMove__Group__0"
    // InternalChessDSL.g:2270:1: rule__AnyMove__Group__0 : rule__AnyMove__Group__0__Impl rule__AnyMove__Group__1 ;
    public final void rule__AnyMove__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2274:1: ( rule__AnyMove__Group__0__Impl rule__AnyMove__Group__1 )
            // InternalChessDSL.g:2275:2: rule__AnyMove__Group__0__Impl rule__AnyMove__Group__1
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
    // InternalChessDSL.g:2282:1: rule__AnyMove__Group__0__Impl : ( ( rule__AnyMove__MoveAssignment_0 ) ) ;
    public final void rule__AnyMove__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2286:1: ( ( ( rule__AnyMove__MoveAssignment_0 ) ) )
            // InternalChessDSL.g:2287:1: ( ( rule__AnyMove__MoveAssignment_0 ) )
            {
            // InternalChessDSL.g:2287:1: ( ( rule__AnyMove__MoveAssignment_0 ) )
            // InternalChessDSL.g:2288:2: ( rule__AnyMove__MoveAssignment_0 )
            {
             before(grammarAccess.getAnyMoveAccess().getMoveAssignment_0()); 
            // InternalChessDSL.g:2289:2: ( rule__AnyMove__MoveAssignment_0 )
            // InternalChessDSL.g:2289:3: rule__AnyMove__MoveAssignment_0
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
    // InternalChessDSL.g:2297:1: rule__AnyMove__Group__1 : rule__AnyMove__Group__1__Impl ;
    public final void rule__AnyMove__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2301:1: ( rule__AnyMove__Group__1__Impl )
            // InternalChessDSL.g:2302:2: rule__AnyMove__Group__1__Impl
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
    // InternalChessDSL.g:2308:1: rule__AnyMove__Group__1__Impl : ( ( rule__AnyMove__Group_1__0 )? ) ;
    public final void rule__AnyMove__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2312:1: ( ( ( rule__AnyMove__Group_1__0 )? ) )
            // InternalChessDSL.g:2313:1: ( ( rule__AnyMove__Group_1__0 )? )
            {
            // InternalChessDSL.g:2313:1: ( ( rule__AnyMove__Group_1__0 )? )
            // InternalChessDSL.g:2314:2: ( rule__AnyMove__Group_1__0 )?
            {
             before(grammarAccess.getAnyMoveAccess().getGroup_1()); 
            // InternalChessDSL.g:2315:2: ( rule__AnyMove__Group_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==46) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalChessDSL.g:2315:3: rule__AnyMove__Group_1__0
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
    // InternalChessDSL.g:2324:1: rule__AnyMove__Group_1__0 : rule__AnyMove__Group_1__0__Impl rule__AnyMove__Group_1__1 ;
    public final void rule__AnyMove__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2328:1: ( rule__AnyMove__Group_1__0__Impl rule__AnyMove__Group_1__1 )
            // InternalChessDSL.g:2329:2: rule__AnyMove__Group_1__0__Impl rule__AnyMove__Group_1__1
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
    // InternalChessDSL.g:2336:1: rule__AnyMove__Group_1__0__Impl : ( '(' ) ;
    public final void rule__AnyMove__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2340:1: ( ( '(' ) )
            // InternalChessDSL.g:2341:1: ( '(' )
            {
            // InternalChessDSL.g:2341:1: ( '(' )
            // InternalChessDSL.g:2342:2: '('
            {
             before(grammarAccess.getAnyMoveAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalChessDSL.g:2351:1: rule__AnyMove__Group_1__1 : rule__AnyMove__Group_1__1__Impl rule__AnyMove__Group_1__2 ;
    public final void rule__AnyMove__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2355:1: ( rule__AnyMove__Group_1__1__Impl rule__AnyMove__Group_1__2 )
            // InternalChessDSL.g:2356:2: rule__AnyMove__Group_1__1__Impl rule__AnyMove__Group_1__2
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
    // InternalChessDSL.g:2363:1: rule__AnyMove__Group_1__1__Impl : ( ( rule__AnyMove__RemarksAssignment_1_1 )* ) ;
    public final void rule__AnyMove__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2367:1: ( ( ( rule__AnyMove__RemarksAssignment_1_1 )* ) )
            // InternalChessDSL.g:2368:1: ( ( rule__AnyMove__RemarksAssignment_1_1 )* )
            {
            // InternalChessDSL.g:2368:1: ( ( rule__AnyMove__RemarksAssignment_1_1 )* )
            // InternalChessDSL.g:2369:2: ( rule__AnyMove__RemarksAssignment_1_1 )*
            {
             before(grammarAccess.getAnyMoveAccess().getRemarksAssignment_1_1()); 
            // InternalChessDSL.g:2370:2: ( rule__AnyMove__RemarksAssignment_1_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=21 && LA30_0<=27)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalChessDSL.g:2370:3: rule__AnyMove__RemarksAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__AnyMove__RemarksAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalChessDSL.g:2378:1: rule__AnyMove__Group_1__2 : rule__AnyMove__Group_1__2__Impl ;
    public final void rule__AnyMove__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2382:1: ( rule__AnyMove__Group_1__2__Impl )
            // InternalChessDSL.g:2383:2: rule__AnyMove__Group_1__2__Impl
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
    // InternalChessDSL.g:2389:1: rule__AnyMove__Group_1__2__Impl : ( ')' ) ;
    public final void rule__AnyMove__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2393:1: ( ( ')' ) )
            // InternalChessDSL.g:2394:1: ( ')' )
            {
            // InternalChessDSL.g:2394:1: ( ')' )
            // InternalChessDSL.g:2395:2: ')'
            {
             before(grammarAccess.getAnyMoveAccess().getRightParenthesisKeyword_1_2()); 
            match(input,47,FOLLOW_2); 
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


    // $ANTLR start "rule__Move__Group__0"
    // InternalChessDSL.g:2405:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2409:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // InternalChessDSL.g:2410:2: rule__Move__Group__0__Impl rule__Move__Group__1
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
    // InternalChessDSL.g:2417:1: rule__Move__Group__0__Impl : ( ( 'moves' )? ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2421:1: ( ( ( 'moves' )? ) )
            // InternalChessDSL.g:2422:1: ( ( 'moves' )? )
            {
            // InternalChessDSL.g:2422:1: ( ( 'moves' )? )
            // InternalChessDSL.g:2423:2: ( 'moves' )?
            {
             before(grammarAccess.getMoveAccess().getMovesKeyword_0()); 
            // InternalChessDSL.g:2424:2: ( 'moves' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==48) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalChessDSL.g:2424:3: 'moves'
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
    // InternalChessDSL.g:2432:1: rule__Move__Group__1 : rule__Move__Group__1__Impl rule__Move__Group__2 ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2436:1: ( rule__Move__Group__1__Impl rule__Move__Group__2 )
            // InternalChessDSL.g:2437:2: rule__Move__Group__1__Impl rule__Move__Group__2
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
    // InternalChessDSL.g:2444:1: rule__Move__Group__1__Impl : ( ( rule__Move__PieceAssignment_1 ) ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2448:1: ( ( ( rule__Move__PieceAssignment_1 ) ) )
            // InternalChessDSL.g:2449:1: ( ( rule__Move__PieceAssignment_1 ) )
            {
            // InternalChessDSL.g:2449:1: ( ( rule__Move__PieceAssignment_1 ) )
            // InternalChessDSL.g:2450:2: ( rule__Move__PieceAssignment_1 )
            {
             before(grammarAccess.getMoveAccess().getPieceAssignment_1()); 
            // InternalChessDSL.g:2451:2: ( rule__Move__PieceAssignment_1 )
            // InternalChessDSL.g:2451:3: rule__Move__PieceAssignment_1
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
    // InternalChessDSL.g:2459:1: rule__Move__Group__2 : rule__Move__Group__2__Impl ;
    public final void rule__Move__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2463:1: ( rule__Move__Group__2__Impl )
            // InternalChessDSL.g:2464:2: rule__Move__Group__2__Impl
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
    // InternalChessDSL.g:2470:1: rule__Move__Group__2__Impl : ( ( rule__Move__Alternatives_2 ) ) ;
    public final void rule__Move__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2474:1: ( ( ( rule__Move__Alternatives_2 ) ) )
            // InternalChessDSL.g:2475:1: ( ( rule__Move__Alternatives_2 ) )
            {
            // InternalChessDSL.g:2475:1: ( ( rule__Move__Alternatives_2 ) )
            // InternalChessDSL.g:2476:2: ( rule__Move__Alternatives_2 )
            {
             before(grammarAccess.getMoveAccess().getAlternatives_2()); 
            // InternalChessDSL.g:2477:2: ( rule__Move__Alternatives_2 )
            // InternalChessDSL.g:2477:3: rule__Move__Alternatives_2
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
    // InternalChessDSL.g:2486:1: rule__Move__Group_2_0__0 : rule__Move__Group_2_0__0__Impl rule__Move__Group_2_0__1 ;
    public final void rule__Move__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2490:1: ( rule__Move__Group_2_0__0__Impl rule__Move__Group_2_0__1 )
            // InternalChessDSL.g:2491:2: rule__Move__Group_2_0__0__Impl rule__Move__Group_2_0__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalChessDSL.g:2498:1: rule__Move__Group_2_0__0__Impl : ( '(' ) ;
    public final void rule__Move__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2502:1: ( ( '(' ) )
            // InternalChessDSL.g:2503:1: ( '(' )
            {
            // InternalChessDSL.g:2503:1: ( '(' )
            // InternalChessDSL.g:2504:2: '('
            {
             before(grammarAccess.getMoveAccess().getLeftParenthesisKeyword_2_0_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalChessDSL.g:2513:1: rule__Move__Group_2_0__1 : rule__Move__Group_2_0__1__Impl rule__Move__Group_2_0__2 ;
    public final void rule__Move__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2517:1: ( rule__Move__Group_2_0__1__Impl rule__Move__Group_2_0__2 )
            // InternalChessDSL.g:2518:2: rule__Move__Group_2_0__1__Impl rule__Move__Group_2_0__2
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
    // InternalChessDSL.g:2525:1: rule__Move__Group_2_0__1__Impl : ( ( rule__Move__FromAssignment_2_0_1 ) ) ;
    public final void rule__Move__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2529:1: ( ( ( rule__Move__FromAssignment_2_0_1 ) ) )
            // InternalChessDSL.g:2530:1: ( ( rule__Move__FromAssignment_2_0_1 ) )
            {
            // InternalChessDSL.g:2530:1: ( ( rule__Move__FromAssignment_2_0_1 ) )
            // InternalChessDSL.g:2531:2: ( rule__Move__FromAssignment_2_0_1 )
            {
             before(grammarAccess.getMoveAccess().getFromAssignment_2_0_1()); 
            // InternalChessDSL.g:2532:2: ( rule__Move__FromAssignment_2_0_1 )
            // InternalChessDSL.g:2532:3: rule__Move__FromAssignment_2_0_1
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
    // InternalChessDSL.g:2540:1: rule__Move__Group_2_0__2 : rule__Move__Group_2_0__2__Impl rule__Move__Group_2_0__3 ;
    public final void rule__Move__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2544:1: ( rule__Move__Group_2_0__2__Impl rule__Move__Group_2_0__3 )
            // InternalChessDSL.g:2545:2: rule__Move__Group_2_0__2__Impl rule__Move__Group_2_0__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalChessDSL.g:2552:1: rule__Move__Group_2_0__2__Impl : ( '->' ) ;
    public final void rule__Move__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2556:1: ( ( '->' ) )
            // InternalChessDSL.g:2557:1: ( '->' )
            {
            // InternalChessDSL.g:2557:1: ( '->' )
            // InternalChessDSL.g:2558:2: '->'
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
    // InternalChessDSL.g:2567:1: rule__Move__Group_2_0__3 : rule__Move__Group_2_0__3__Impl rule__Move__Group_2_0__4 ;
    public final void rule__Move__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2571:1: ( rule__Move__Group_2_0__3__Impl rule__Move__Group_2_0__4 )
            // InternalChessDSL.g:2572:2: rule__Move__Group_2_0__3__Impl rule__Move__Group_2_0__4
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
    // InternalChessDSL.g:2579:1: rule__Move__Group_2_0__3__Impl : ( ( rule__Move__ToAssignment_2_0_3 ) ) ;
    public final void rule__Move__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2583:1: ( ( ( rule__Move__ToAssignment_2_0_3 ) ) )
            // InternalChessDSL.g:2584:1: ( ( rule__Move__ToAssignment_2_0_3 ) )
            {
            // InternalChessDSL.g:2584:1: ( ( rule__Move__ToAssignment_2_0_3 ) )
            // InternalChessDSL.g:2585:2: ( rule__Move__ToAssignment_2_0_3 )
            {
             before(grammarAccess.getMoveAccess().getToAssignment_2_0_3()); 
            // InternalChessDSL.g:2586:2: ( rule__Move__ToAssignment_2_0_3 )
            // InternalChessDSL.g:2586:3: rule__Move__ToAssignment_2_0_3
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
    // InternalChessDSL.g:2594:1: rule__Move__Group_2_0__4 : rule__Move__Group_2_0__4__Impl ;
    public final void rule__Move__Group_2_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2598:1: ( rule__Move__Group_2_0__4__Impl )
            // InternalChessDSL.g:2599:2: rule__Move__Group_2_0__4__Impl
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
    // InternalChessDSL.g:2605:1: rule__Move__Group_2_0__4__Impl : ( ')' ) ;
    public final void rule__Move__Group_2_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2609:1: ( ( ')' ) )
            // InternalChessDSL.g:2610:1: ( ')' )
            {
            // InternalChessDSL.g:2610:1: ( ')' )
            // InternalChessDSL.g:2611:2: ')'
            {
             before(grammarAccess.getMoveAccess().getRightParenthesisKeyword_2_0_4()); 
            match(input,47,FOLLOW_2); 
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
    // InternalChessDSL.g:2621:1: rule__Move__Group_2_1__0 : rule__Move__Group_2_1__0__Impl rule__Move__Group_2_1__1 ;
    public final void rule__Move__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2625:1: ( rule__Move__Group_2_1__0__Impl rule__Move__Group_2_1__1 )
            // InternalChessDSL.g:2626:2: rule__Move__Group_2_1__0__Impl rule__Move__Group_2_1__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalChessDSL.g:2633:1: rule__Move__Group_2_1__0__Impl : ( 'from' ) ;
    public final void rule__Move__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2637:1: ( ( 'from' ) )
            // InternalChessDSL.g:2638:1: ( 'from' )
            {
            // InternalChessDSL.g:2638:1: ( 'from' )
            // InternalChessDSL.g:2639:2: 'from'
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
    // InternalChessDSL.g:2648:1: rule__Move__Group_2_1__1 : rule__Move__Group_2_1__1__Impl rule__Move__Group_2_1__2 ;
    public final void rule__Move__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2652:1: ( rule__Move__Group_2_1__1__Impl rule__Move__Group_2_1__2 )
            // InternalChessDSL.g:2653:2: rule__Move__Group_2_1__1__Impl rule__Move__Group_2_1__2
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
    // InternalChessDSL.g:2660:1: rule__Move__Group_2_1__1__Impl : ( ( rule__Move__FromAssignment_2_1_1 ) ) ;
    public final void rule__Move__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2664:1: ( ( ( rule__Move__FromAssignment_2_1_1 ) ) )
            // InternalChessDSL.g:2665:1: ( ( rule__Move__FromAssignment_2_1_1 ) )
            {
            // InternalChessDSL.g:2665:1: ( ( rule__Move__FromAssignment_2_1_1 ) )
            // InternalChessDSL.g:2666:2: ( rule__Move__FromAssignment_2_1_1 )
            {
             before(grammarAccess.getMoveAccess().getFromAssignment_2_1_1()); 
            // InternalChessDSL.g:2667:2: ( rule__Move__FromAssignment_2_1_1 )
            // InternalChessDSL.g:2667:3: rule__Move__FromAssignment_2_1_1
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
    // InternalChessDSL.g:2675:1: rule__Move__Group_2_1__2 : rule__Move__Group_2_1__2__Impl rule__Move__Group_2_1__3 ;
    public final void rule__Move__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2679:1: ( rule__Move__Group_2_1__2__Impl rule__Move__Group_2_1__3 )
            // InternalChessDSL.g:2680:2: rule__Move__Group_2_1__2__Impl rule__Move__Group_2_1__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalChessDSL.g:2687:1: rule__Move__Group_2_1__2__Impl : ( 'to' ) ;
    public final void rule__Move__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2691:1: ( ( 'to' ) )
            // InternalChessDSL.g:2692:1: ( 'to' )
            {
            // InternalChessDSL.g:2692:1: ( 'to' )
            // InternalChessDSL.g:2693:2: 'to'
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
    // InternalChessDSL.g:2702:1: rule__Move__Group_2_1__3 : rule__Move__Group_2_1__3__Impl ;
    public final void rule__Move__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2706:1: ( rule__Move__Group_2_1__3__Impl )
            // InternalChessDSL.g:2707:2: rule__Move__Group_2_1__3__Impl
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
    // InternalChessDSL.g:2713:1: rule__Move__Group_2_1__3__Impl : ( ( rule__Move__ToAssignment_2_1_3 ) ) ;
    public final void rule__Move__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2717:1: ( ( ( rule__Move__ToAssignment_2_1_3 ) ) )
            // InternalChessDSL.g:2718:1: ( ( rule__Move__ToAssignment_2_1_3 ) )
            {
            // InternalChessDSL.g:2718:1: ( ( rule__Move__ToAssignment_2_1_3 ) )
            // InternalChessDSL.g:2719:2: ( rule__Move__ToAssignment_2_1_3 )
            {
             before(grammarAccess.getMoveAccess().getToAssignment_2_1_3()); 
            // InternalChessDSL.g:2720:2: ( rule__Move__ToAssignment_2_1_3 )
            // InternalChessDSL.g:2720:3: rule__Move__ToAssignment_2_1_3
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
    // InternalChessDSL.g:2729:1: rule__Capture__Group__0 : rule__Capture__Group__0__Impl rule__Capture__Group__1 ;
    public final void rule__Capture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2733:1: ( rule__Capture__Group__0__Impl rule__Capture__Group__1 )
            // InternalChessDSL.g:2734:2: rule__Capture__Group__0__Impl rule__Capture__Group__1
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
    // InternalChessDSL.g:2741:1: rule__Capture__Group__0__Impl : ( ( rule__Capture__MoveAssignment_0 ) ) ;
    public final void rule__Capture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2745:1: ( ( ( rule__Capture__MoveAssignment_0 ) ) )
            // InternalChessDSL.g:2746:1: ( ( rule__Capture__MoveAssignment_0 ) )
            {
            // InternalChessDSL.g:2746:1: ( ( rule__Capture__MoveAssignment_0 ) )
            // InternalChessDSL.g:2747:2: ( rule__Capture__MoveAssignment_0 )
            {
             before(grammarAccess.getCaptureAccess().getMoveAssignment_0()); 
            // InternalChessDSL.g:2748:2: ( rule__Capture__MoveAssignment_0 )
            // InternalChessDSL.g:2748:3: rule__Capture__MoveAssignment_0
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
    // InternalChessDSL.g:2756:1: rule__Capture__Group__1 : rule__Capture__Group__1__Impl ;
    public final void rule__Capture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2760:1: ( rule__Capture__Group__1__Impl )
            // InternalChessDSL.g:2761:2: rule__Capture__Group__1__Impl
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
    // InternalChessDSL.g:2767:1: rule__Capture__Group__1__Impl : ( ( rule__Capture__Alternatives_1 ) ) ;
    public final void rule__Capture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2771:1: ( ( ( rule__Capture__Alternatives_1 ) ) )
            // InternalChessDSL.g:2772:1: ( ( rule__Capture__Alternatives_1 ) )
            {
            // InternalChessDSL.g:2772:1: ( ( rule__Capture__Alternatives_1 ) )
            // InternalChessDSL.g:2773:2: ( rule__Capture__Alternatives_1 )
            {
             before(grammarAccess.getCaptureAccess().getAlternatives_1()); 
            // InternalChessDSL.g:2774:2: ( rule__Capture__Alternatives_1 )
            // InternalChessDSL.g:2774:3: rule__Capture__Alternatives_1
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
    // InternalChessDSL.g:2783:1: rule__Capture__Group_1_0__0 : rule__Capture__Group_1_0__0__Impl rule__Capture__Group_1_0__1 ;
    public final void rule__Capture__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2787:1: ( rule__Capture__Group_1_0__0__Impl rule__Capture__Group_1_0__1 )
            // InternalChessDSL.g:2788:2: rule__Capture__Group_1_0__0__Impl rule__Capture__Group_1_0__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalChessDSL.g:2795:1: rule__Capture__Group_1_0__0__Impl : ( 'Capture(' ) ;
    public final void rule__Capture__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2799:1: ( ( 'Capture(' ) )
            // InternalChessDSL.g:2800:1: ( 'Capture(' )
            {
            // InternalChessDSL.g:2800:1: ( 'Capture(' )
            // InternalChessDSL.g:2801:2: 'Capture('
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
    // InternalChessDSL.g:2810:1: rule__Capture__Group_1_0__1 : rule__Capture__Group_1_0__1__Impl rule__Capture__Group_1_0__2 ;
    public final void rule__Capture__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2814:1: ( rule__Capture__Group_1_0__1__Impl rule__Capture__Group_1_0__2 )
            // InternalChessDSL.g:2815:2: rule__Capture__Group_1_0__1__Impl rule__Capture__Group_1_0__2
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
    // InternalChessDSL.g:2822:1: rule__Capture__Group_1_0__1__Impl : ( ( rule__Capture__CaptureAssignment_1_0_1 ) ) ;
    public final void rule__Capture__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2826:1: ( ( ( rule__Capture__CaptureAssignment_1_0_1 ) ) )
            // InternalChessDSL.g:2827:1: ( ( rule__Capture__CaptureAssignment_1_0_1 ) )
            {
            // InternalChessDSL.g:2827:1: ( ( rule__Capture__CaptureAssignment_1_0_1 ) )
            // InternalChessDSL.g:2828:2: ( rule__Capture__CaptureAssignment_1_0_1 )
            {
             before(grammarAccess.getCaptureAccess().getCaptureAssignment_1_0_1()); 
            // InternalChessDSL.g:2829:2: ( rule__Capture__CaptureAssignment_1_0_1 )
            // InternalChessDSL.g:2829:3: rule__Capture__CaptureAssignment_1_0_1
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
    // InternalChessDSL.g:2837:1: rule__Capture__Group_1_0__2 : rule__Capture__Group_1_0__2__Impl ;
    public final void rule__Capture__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2841:1: ( rule__Capture__Group_1_0__2__Impl )
            // InternalChessDSL.g:2842:2: rule__Capture__Group_1_0__2__Impl
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
    // InternalChessDSL.g:2848:1: rule__Capture__Group_1_0__2__Impl : ( ')' ) ;
    public final void rule__Capture__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2852:1: ( ( ')' ) )
            // InternalChessDSL.g:2853:1: ( ')' )
            {
            // InternalChessDSL.g:2853:1: ( ')' )
            // InternalChessDSL.g:2854:2: ')'
            {
             before(grammarAccess.getCaptureAccess().getRightParenthesisKeyword_1_0_2()); 
            match(input,47,FOLLOW_2); 
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
    // InternalChessDSL.g:2864:1: rule__Capture__Group_1_1__0 : rule__Capture__Group_1_1__0__Impl rule__Capture__Group_1_1__1 ;
    public final void rule__Capture__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2868:1: ( rule__Capture__Group_1_1__0__Impl rule__Capture__Group_1_1__1 )
            // InternalChessDSL.g:2869:2: rule__Capture__Group_1_1__0__Impl rule__Capture__Group_1_1__1
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
    // InternalChessDSL.g:2876:1: rule__Capture__Group_1_1__0__Impl : ( ( 'and' )? ) ;
    public final void rule__Capture__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2880:1: ( ( ( 'and' )? ) )
            // InternalChessDSL.g:2881:1: ( ( 'and' )? )
            {
            // InternalChessDSL.g:2881:1: ( ( 'and' )? )
            // InternalChessDSL.g:2882:2: ( 'and' )?
            {
             before(grammarAccess.getCaptureAccess().getAndKeyword_1_1_0()); 
            // InternalChessDSL.g:2883:2: ( 'and' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==53) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalChessDSL.g:2883:3: 'and'
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
    // InternalChessDSL.g:2891:1: rule__Capture__Group_1_1__1 : rule__Capture__Group_1_1__1__Impl rule__Capture__Group_1_1__2 ;
    public final void rule__Capture__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2895:1: ( rule__Capture__Group_1_1__1__Impl rule__Capture__Group_1_1__2 )
            // InternalChessDSL.g:2896:2: rule__Capture__Group_1_1__1__Impl rule__Capture__Group_1_1__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalChessDSL.g:2903:1: rule__Capture__Group_1_1__1__Impl : ( 'captures' ) ;
    public final void rule__Capture__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2907:1: ( ( 'captures' ) )
            // InternalChessDSL.g:2908:1: ( 'captures' )
            {
            // InternalChessDSL.g:2908:1: ( 'captures' )
            // InternalChessDSL.g:2909:2: 'captures'
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
    // InternalChessDSL.g:2918:1: rule__Capture__Group_1_1__2 : rule__Capture__Group_1_1__2__Impl ;
    public final void rule__Capture__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2922:1: ( rule__Capture__Group_1_1__2__Impl )
            // InternalChessDSL.g:2923:2: rule__Capture__Group_1_1__2__Impl
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
    // InternalChessDSL.g:2929:1: rule__Capture__Group_1_1__2__Impl : ( ( rule__Capture__CaptureAssignment_1_1_2 ) ) ;
    public final void rule__Capture__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2933:1: ( ( ( rule__Capture__CaptureAssignment_1_1_2 ) ) )
            // InternalChessDSL.g:2934:1: ( ( rule__Capture__CaptureAssignment_1_1_2 ) )
            {
            // InternalChessDSL.g:2934:1: ( ( rule__Capture__CaptureAssignment_1_1_2 ) )
            // InternalChessDSL.g:2935:2: ( rule__Capture__CaptureAssignment_1_1_2 )
            {
             before(grammarAccess.getCaptureAccess().getCaptureAssignment_1_1_2()); 
            // InternalChessDSL.g:2936:2: ( rule__Capture__CaptureAssignment_1_1_2 )
            // InternalChessDSL.g:2936:3: rule__Capture__CaptureAssignment_1_1_2
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
    // InternalChessDSL.g:2945:1: rule__Castle__Group_0__0 : rule__Castle__Group_0__0__Impl rule__Castle__Group_0__1 ;
    public final void rule__Castle__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2949:1: ( rule__Castle__Group_0__0__Impl rule__Castle__Group_0__1 )
            // InternalChessDSL.g:2950:2: rule__Castle__Group_0__0__Impl rule__Castle__Group_0__1
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
    // InternalChessDSL.g:2957:1: rule__Castle__Group_0__0__Impl : ( 'Castle(' ) ;
    public final void rule__Castle__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2961:1: ( ( 'Castle(' ) )
            // InternalChessDSL.g:2962:1: ( 'Castle(' )
            {
            // InternalChessDSL.g:2962:1: ( 'Castle(' )
            // InternalChessDSL.g:2963:2: 'Castle('
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
    // InternalChessDSL.g:2972:1: rule__Castle__Group_0__1 : rule__Castle__Group_0__1__Impl rule__Castle__Group_0__2 ;
    public final void rule__Castle__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2976:1: ( rule__Castle__Group_0__1__Impl rule__Castle__Group_0__2 )
            // InternalChessDSL.g:2977:2: rule__Castle__Group_0__1__Impl rule__Castle__Group_0__2
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
    // InternalChessDSL.g:2984:1: rule__Castle__Group_0__1__Impl : ( ( rule__Castle__Alternatives_0_1 ) ) ;
    public final void rule__Castle__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2988:1: ( ( ( rule__Castle__Alternatives_0_1 ) ) )
            // InternalChessDSL.g:2989:1: ( ( rule__Castle__Alternatives_0_1 ) )
            {
            // InternalChessDSL.g:2989:1: ( ( rule__Castle__Alternatives_0_1 ) )
            // InternalChessDSL.g:2990:2: ( rule__Castle__Alternatives_0_1 )
            {
             before(grammarAccess.getCastleAccess().getAlternatives_0_1()); 
            // InternalChessDSL.g:2991:2: ( rule__Castle__Alternatives_0_1 )
            // InternalChessDSL.g:2991:3: rule__Castle__Alternatives_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Castle__Alternatives_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCastleAccess().getAlternatives_0_1()); 

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
    // InternalChessDSL.g:2999:1: rule__Castle__Group_0__2 : rule__Castle__Group_0__2__Impl ;
    public final void rule__Castle__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3003:1: ( rule__Castle__Group_0__2__Impl )
            // InternalChessDSL.g:3004:2: rule__Castle__Group_0__2__Impl
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
    // InternalChessDSL.g:3010:1: rule__Castle__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Castle__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3014:1: ( ( ')' ) )
            // InternalChessDSL.g:3015:1: ( ')' )
            {
            // InternalChessDSL.g:3015:1: ( ')' )
            // InternalChessDSL.g:3016:2: ')'
            {
             before(grammarAccess.getCastleAccess().getRightParenthesisKeyword_0_2()); 
            match(input,47,FOLLOW_2); 
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
    // InternalChessDSL.g:3026:1: rule__Castle__Group_1__0 : rule__Castle__Group_1__0__Impl rule__Castle__Group_1__1 ;
    public final void rule__Castle__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3030:1: ( rule__Castle__Group_1__0__Impl rule__Castle__Group_1__1 )
            // InternalChessDSL.g:3031:2: rule__Castle__Group_1__0__Impl rule__Castle__Group_1__1
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
    // InternalChessDSL.g:3038:1: rule__Castle__Group_1__0__Impl : ( 'castles' ) ;
    public final void rule__Castle__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3042:1: ( ( 'castles' ) )
            // InternalChessDSL.g:3043:1: ( 'castles' )
            {
            // InternalChessDSL.g:3043:1: ( 'castles' )
            // InternalChessDSL.g:3044:2: 'castles'
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
    // InternalChessDSL.g:3053:1: rule__Castle__Group_1__1 : rule__Castle__Group_1__1__Impl rule__Castle__Group_1__2 ;
    public final void rule__Castle__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3057:1: ( rule__Castle__Group_1__1__Impl rule__Castle__Group_1__2 )
            // InternalChessDSL.g:3058:2: rule__Castle__Group_1__1__Impl rule__Castle__Group_1__2
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
    // InternalChessDSL.g:3065:1: rule__Castle__Group_1__1__Impl : ( ( rule__Castle__Group_1_1__0 )? ) ;
    public final void rule__Castle__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3069:1: ( ( ( rule__Castle__Group_1_1__0 )? ) )
            // InternalChessDSL.g:3070:1: ( ( rule__Castle__Group_1_1__0 )? )
            {
            // InternalChessDSL.g:3070:1: ( ( rule__Castle__Group_1_1__0 )? )
            // InternalChessDSL.g:3071:2: ( rule__Castle__Group_1_1__0 )?
            {
             before(grammarAccess.getCastleAccess().getGroup_1_1()); 
            // InternalChessDSL.g:3072:2: ( rule__Castle__Group_1_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==16) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalChessDSL.g:3072:3: rule__Castle__Group_1_1__0
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
    // InternalChessDSL.g:3080:1: rule__Castle__Group_1__2 : rule__Castle__Group_1__2__Impl ;
    public final void rule__Castle__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3084:1: ( rule__Castle__Group_1__2__Impl )
            // InternalChessDSL.g:3085:2: rule__Castle__Group_1__2__Impl
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
    // InternalChessDSL.g:3091:1: rule__Castle__Group_1__2__Impl : ( ( rule__Castle__Alternatives_1_2 ) ) ;
    public final void rule__Castle__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3095:1: ( ( ( rule__Castle__Alternatives_1_2 ) ) )
            // InternalChessDSL.g:3096:1: ( ( rule__Castle__Alternatives_1_2 ) )
            {
            // InternalChessDSL.g:3096:1: ( ( rule__Castle__Alternatives_1_2 ) )
            // InternalChessDSL.g:3097:2: ( rule__Castle__Alternatives_1_2 )
            {
             before(grammarAccess.getCastleAccess().getAlternatives_1_2()); 
            // InternalChessDSL.g:3098:2: ( rule__Castle__Alternatives_1_2 )
            // InternalChessDSL.g:3098:3: rule__Castle__Alternatives_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Castle__Alternatives_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCastleAccess().getAlternatives_1_2()); 

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
    // InternalChessDSL.g:3107:1: rule__Castle__Group_1_1__0 : rule__Castle__Group_1_1__0__Impl rule__Castle__Group_1_1__1 ;
    public final void rule__Castle__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3111:1: ( rule__Castle__Group_1_1__0__Impl rule__Castle__Group_1_1__1 )
            // InternalChessDSL.g:3112:2: rule__Castle__Group_1_1__0__Impl rule__Castle__Group_1_1__1
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
    // InternalChessDSL.g:3119:1: rule__Castle__Group_1_1__0__Impl : ( 'on' ) ;
    public final void rule__Castle__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3123:1: ( ( 'on' ) )
            // InternalChessDSL.g:3124:1: ( 'on' )
            {
            // InternalChessDSL.g:3124:1: ( 'on' )
            // InternalChessDSL.g:3125:2: 'on'
            {
             before(grammarAccess.getCastleAccess().getOnKeyword_1_1_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalChessDSL.g:3134:1: rule__Castle__Group_1_1__1 : rule__Castle__Group_1_1__1__Impl ;
    public final void rule__Castle__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3138:1: ( rule__Castle__Group_1_1__1__Impl )
            // InternalChessDSL.g:3139:2: rule__Castle__Group_1_1__1__Impl
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
    // InternalChessDSL.g:3145:1: rule__Castle__Group_1_1__1__Impl : ( 'the' ) ;
    public final void rule__Castle__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3149:1: ( ( 'the' ) )
            // InternalChessDSL.g:3150:1: ( 'the' )
            {
            // InternalChessDSL.g:3150:1: ( 'the' )
            // InternalChessDSL.g:3151:2: 'the'
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
    // InternalChessDSL.g:3161:1: rule__Castle__Group_2__0 : rule__Castle__Group_2__0__Impl rule__Castle__Group_2__1 ;
    public final void rule__Castle__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3165:1: ( rule__Castle__Group_2__0__Impl rule__Castle__Group_2__1 )
            // InternalChessDSL.g:3166:2: rule__Castle__Group_2__0__Impl rule__Castle__Group_2__1
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
    // InternalChessDSL.g:3173:1: rule__Castle__Group_2__0__Impl : ( ( rule__Castle__MoveAssignment_2_0 ) ) ;
    public final void rule__Castle__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3177:1: ( ( ( rule__Castle__MoveAssignment_2_0 ) ) )
            // InternalChessDSL.g:3178:1: ( ( rule__Castle__MoveAssignment_2_0 ) )
            {
            // InternalChessDSL.g:3178:1: ( ( rule__Castle__MoveAssignment_2_0 ) )
            // InternalChessDSL.g:3179:2: ( rule__Castle__MoveAssignment_2_0 )
            {
             before(grammarAccess.getCastleAccess().getMoveAssignment_2_0()); 
            // InternalChessDSL.g:3180:2: ( rule__Castle__MoveAssignment_2_0 )
            // InternalChessDSL.g:3180:3: rule__Castle__MoveAssignment_2_0
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
    // InternalChessDSL.g:3188:1: rule__Castle__Group_2__1 : rule__Castle__Group_2__1__Impl ;
    public final void rule__Castle__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3192:1: ( rule__Castle__Group_2__1__Impl )
            // InternalChessDSL.g:3193:2: rule__Castle__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Castle__Group_2__1__Impl();

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
    // InternalChessDSL.g:3199:1: rule__Castle__Group_2__1__Impl : ( 'Castle()' ) ;
    public final void rule__Castle__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3203:1: ( ( 'Castle()' ) )
            // InternalChessDSL.g:3204:1: ( 'Castle()' )
            {
            // InternalChessDSL.g:3204:1: ( 'Castle()' )
            // InternalChessDSL.g:3205:2: 'Castle()'
            {
             before(grammarAccess.getCastleAccess().getCastleKeyword_2_1()); 
            match(input,58,FOLLOW_2); 
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


    // $ANTLR start "rule__Castle__Group_3__0"
    // InternalChessDSL.g:3215:1: rule__Castle__Group_3__0 : rule__Castle__Group_3__0__Impl rule__Castle__Group_3__1 ;
    public final void rule__Castle__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3219:1: ( rule__Castle__Group_3__0__Impl rule__Castle__Group_3__1 )
            // InternalChessDSL.g:3220:2: rule__Castle__Group_3__0__Impl rule__Castle__Group_3__1
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
    // InternalChessDSL.g:3227:1: rule__Castle__Group_3__0__Impl : ( ( rule__Castle__MoveAssignment_3_0 ) ) ;
    public final void rule__Castle__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3231:1: ( ( ( rule__Castle__MoveAssignment_3_0 ) ) )
            // InternalChessDSL.g:3232:1: ( ( rule__Castle__MoveAssignment_3_0 ) )
            {
            // InternalChessDSL.g:3232:1: ( ( rule__Castle__MoveAssignment_3_0 ) )
            // InternalChessDSL.g:3233:2: ( rule__Castle__MoveAssignment_3_0 )
            {
             before(grammarAccess.getCastleAccess().getMoveAssignment_3_0()); 
            // InternalChessDSL.g:3234:2: ( rule__Castle__MoveAssignment_3_0 )
            // InternalChessDSL.g:3234:3: rule__Castle__MoveAssignment_3_0
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
    // InternalChessDSL.g:3242:1: rule__Castle__Group_3__1 : rule__Castle__Group_3__1__Impl rule__Castle__Group_3__2 ;
    public final void rule__Castle__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3246:1: ( rule__Castle__Group_3__1__Impl rule__Castle__Group_3__2 )
            // InternalChessDSL.g:3247:2: rule__Castle__Group_3__1__Impl rule__Castle__Group_3__2
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
    // InternalChessDSL.g:3254:1: rule__Castle__Group_3__1__Impl : ( 'and' ) ;
    public final void rule__Castle__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3258:1: ( ( 'and' ) )
            // InternalChessDSL.g:3259:1: ( 'and' )
            {
            // InternalChessDSL.g:3259:1: ( 'and' )
            // InternalChessDSL.g:3260:2: 'and'
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
    // InternalChessDSL.g:3269:1: rule__Castle__Group_3__2 : rule__Castle__Group_3__2__Impl ;
    public final void rule__Castle__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3273:1: ( rule__Castle__Group_3__2__Impl )
            // InternalChessDSL.g:3274:2: rule__Castle__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Castle__Group_3__2__Impl();

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
    // InternalChessDSL.g:3280:1: rule__Castle__Group_3__2__Impl : ( 'castles' ) ;
    public final void rule__Castle__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3284:1: ( ( 'castles' ) )
            // InternalChessDSL.g:3285:1: ( 'castles' )
            {
            // InternalChessDSL.g:3285:1: ( 'castles' )
            // InternalChessDSL.g:3286:2: 'castles'
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


    // $ANTLR start "rule__EnPassant__Group__0"
    // InternalChessDSL.g:3296:1: rule__EnPassant__Group__0 : rule__EnPassant__Group__0__Impl rule__EnPassant__Group__1 ;
    public final void rule__EnPassant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3300:1: ( rule__EnPassant__Group__0__Impl rule__EnPassant__Group__1 )
            // InternalChessDSL.g:3301:2: rule__EnPassant__Group__0__Impl rule__EnPassant__Group__1
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
    // InternalChessDSL.g:3308:1: rule__EnPassant__Group__0__Impl : ( ( rule__EnPassant__CaptureAssignment_0 ) ) ;
    public final void rule__EnPassant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3312:1: ( ( ( rule__EnPassant__CaptureAssignment_0 ) ) )
            // InternalChessDSL.g:3313:1: ( ( rule__EnPassant__CaptureAssignment_0 ) )
            {
            // InternalChessDSL.g:3313:1: ( ( rule__EnPassant__CaptureAssignment_0 ) )
            // InternalChessDSL.g:3314:2: ( rule__EnPassant__CaptureAssignment_0 )
            {
             before(grammarAccess.getEnPassantAccess().getCaptureAssignment_0()); 
            // InternalChessDSL.g:3315:2: ( rule__EnPassant__CaptureAssignment_0 )
            // InternalChessDSL.g:3315:3: rule__EnPassant__CaptureAssignment_0
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
    // InternalChessDSL.g:3323:1: rule__EnPassant__Group__1 : rule__EnPassant__Group__1__Impl rule__EnPassant__Group__2 ;
    public final void rule__EnPassant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3327:1: ( rule__EnPassant__Group__1__Impl rule__EnPassant__Group__2 )
            // InternalChessDSL.g:3328:2: rule__EnPassant__Group__1__Impl rule__EnPassant__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalChessDSL.g:3335:1: rule__EnPassant__Group__1__Impl : ( 'on' ) ;
    public final void rule__EnPassant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3339:1: ( ( 'on' ) )
            // InternalChessDSL.g:3340:1: ( 'on' )
            {
            // InternalChessDSL.g:3340:1: ( 'on' )
            // InternalChessDSL.g:3341:2: 'on'
            {
             before(grammarAccess.getEnPassantAccess().getOnKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalChessDSL.g:3350:1: rule__EnPassant__Group__2 : rule__EnPassant__Group__2__Impl ;
    public final void rule__EnPassant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3354:1: ( rule__EnPassant__Group__2__Impl )
            // InternalChessDSL.g:3355:2: rule__EnPassant__Group__2__Impl
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
    // InternalChessDSL.g:3361:1: rule__EnPassant__Group__2__Impl : ( ( rule__EnPassant__SquareAssignment_2 ) ) ;
    public final void rule__EnPassant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3365:1: ( ( ( rule__EnPassant__SquareAssignment_2 ) ) )
            // InternalChessDSL.g:3366:1: ( ( rule__EnPassant__SquareAssignment_2 ) )
            {
            // InternalChessDSL.g:3366:1: ( ( rule__EnPassant__SquareAssignment_2 ) )
            // InternalChessDSL.g:3367:2: ( rule__EnPassant__SquareAssignment_2 )
            {
             before(grammarAccess.getEnPassantAccess().getSquareAssignment_2()); 
            // InternalChessDSL.g:3368:2: ( rule__EnPassant__SquareAssignment_2 )
            // InternalChessDSL.g:3368:3: rule__EnPassant__SquareAssignment_2
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
    // InternalChessDSL.g:3377:1: rule__Promotion__Group__0 : rule__Promotion__Group__0__Impl rule__Promotion__Group__1 ;
    public final void rule__Promotion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3381:1: ( rule__Promotion__Group__0__Impl rule__Promotion__Group__1 )
            // InternalChessDSL.g:3382:2: rule__Promotion__Group__0__Impl rule__Promotion__Group__1
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
    // InternalChessDSL.g:3389:1: rule__Promotion__Group__0__Impl : ( ( rule__Promotion__MoveAssignment_0 ) ) ;
    public final void rule__Promotion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3393:1: ( ( ( rule__Promotion__MoveAssignment_0 ) ) )
            // InternalChessDSL.g:3394:1: ( ( rule__Promotion__MoveAssignment_0 ) )
            {
            // InternalChessDSL.g:3394:1: ( ( rule__Promotion__MoveAssignment_0 ) )
            // InternalChessDSL.g:3395:2: ( rule__Promotion__MoveAssignment_0 )
            {
             before(grammarAccess.getPromotionAccess().getMoveAssignment_0()); 
            // InternalChessDSL.g:3396:2: ( rule__Promotion__MoveAssignment_0 )
            // InternalChessDSL.g:3396:3: rule__Promotion__MoveAssignment_0
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
    // InternalChessDSL.g:3404:1: rule__Promotion__Group__1 : rule__Promotion__Group__1__Impl rule__Promotion__Group__2 ;
    public final void rule__Promotion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3408:1: ( rule__Promotion__Group__1__Impl rule__Promotion__Group__2 )
            // InternalChessDSL.g:3409:2: rule__Promotion__Group__1__Impl rule__Promotion__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalChessDSL.g:3416:1: rule__Promotion__Group__1__Impl : ( 'Promotion(' ) ;
    public final void rule__Promotion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3420:1: ( ( 'Promotion(' ) )
            // InternalChessDSL.g:3421:1: ( 'Promotion(' )
            {
            // InternalChessDSL.g:3421:1: ( 'Promotion(' )
            // InternalChessDSL.g:3422:2: 'Promotion('
            {
             before(grammarAccess.getPromotionAccess().getPromotionKeyword_1()); 
            match(input,59,FOLLOW_2); 
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
    // InternalChessDSL.g:3431:1: rule__Promotion__Group__2 : rule__Promotion__Group__2__Impl rule__Promotion__Group__3 ;
    public final void rule__Promotion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3435:1: ( rule__Promotion__Group__2__Impl rule__Promotion__Group__3 )
            // InternalChessDSL.g:3436:2: rule__Promotion__Group__2__Impl rule__Promotion__Group__3
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
    // InternalChessDSL.g:3443:1: rule__Promotion__Group__2__Impl : ( ( rule__Promotion__PieceAssignment_2 ) ) ;
    public final void rule__Promotion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3447:1: ( ( ( rule__Promotion__PieceAssignment_2 ) ) )
            // InternalChessDSL.g:3448:1: ( ( rule__Promotion__PieceAssignment_2 ) )
            {
            // InternalChessDSL.g:3448:1: ( ( rule__Promotion__PieceAssignment_2 ) )
            // InternalChessDSL.g:3449:2: ( rule__Promotion__PieceAssignment_2 )
            {
             before(grammarAccess.getPromotionAccess().getPieceAssignment_2()); 
            // InternalChessDSL.g:3450:2: ( rule__Promotion__PieceAssignment_2 )
            // InternalChessDSL.g:3450:3: rule__Promotion__PieceAssignment_2
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
    // InternalChessDSL.g:3458:1: rule__Promotion__Group__3 : rule__Promotion__Group__3__Impl ;
    public final void rule__Promotion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3462:1: ( rule__Promotion__Group__3__Impl )
            // InternalChessDSL.g:3463:2: rule__Promotion__Group__3__Impl
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
    // InternalChessDSL.g:3469:1: rule__Promotion__Group__3__Impl : ( ')' ) ;
    public final void rule__Promotion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3473:1: ( ( ')' ) )
            // InternalChessDSL.g:3474:1: ( ')' )
            {
            // InternalChessDSL.g:3474:1: ( ')' )
            // InternalChessDSL.g:3475:2: ')'
            {
             before(grammarAccess.getPromotionAccess().getRightParenthesisKeyword_3()); 
            match(input,47,FOLLOW_2); 
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
    // InternalChessDSL.g:3485:1: rule__Conclusion__Group__0 : rule__Conclusion__Group__0__Impl rule__Conclusion__Group__1 ;
    public final void rule__Conclusion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3489:1: ( rule__Conclusion__Group__0__Impl rule__Conclusion__Group__1 )
            // InternalChessDSL.g:3490:2: rule__Conclusion__Group__0__Impl rule__Conclusion__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalChessDSL.g:3497:1: rule__Conclusion__Group__0__Impl : ( ( rule__Conclusion__MethodAssignment_0 )? ) ;
    public final void rule__Conclusion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3501:1: ( ( ( rule__Conclusion__MethodAssignment_0 )? ) )
            // InternalChessDSL.g:3502:1: ( ( rule__Conclusion__MethodAssignment_0 )? )
            {
            // InternalChessDSL.g:3502:1: ( ( rule__Conclusion__MethodAssignment_0 )? )
            // InternalChessDSL.g:3503:2: ( rule__Conclusion__MethodAssignment_0 )?
            {
             before(grammarAccess.getConclusionAccess().getMethodAssignment_0()); 
            // InternalChessDSL.g:3504:2: ( rule__Conclusion__MethodAssignment_0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==53||LA34_1==60||(LA34_1>=64 && LA34_1<=65)) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // InternalChessDSL.g:3504:3: rule__Conclusion__MethodAssignment_0
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
    // InternalChessDSL.g:3512:1: rule__Conclusion__Group__1 : rule__Conclusion__Group__1__Impl ;
    public final void rule__Conclusion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3516:1: ( rule__Conclusion__Group__1__Impl )
            // InternalChessDSL.g:3517:2: rule__Conclusion__Group__1__Impl
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
    // InternalChessDSL.g:3523:1: rule__Conclusion__Group__1__Impl : ( ( rule__Conclusion__ResultAssignment_1 ) ) ;
    public final void rule__Conclusion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3527:1: ( ( ( rule__Conclusion__ResultAssignment_1 ) ) )
            // InternalChessDSL.g:3528:1: ( ( rule__Conclusion__ResultAssignment_1 ) )
            {
            // InternalChessDSL.g:3528:1: ( ( rule__Conclusion__ResultAssignment_1 ) )
            // InternalChessDSL.g:3529:2: ( rule__Conclusion__ResultAssignment_1 )
            {
             before(grammarAccess.getConclusionAccess().getResultAssignment_1()); 
            // InternalChessDSL.g:3530:2: ( rule__Conclusion__ResultAssignment_1 )
            // InternalChessDSL.g:3530:3: rule__Conclusion__ResultAssignment_1
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
    // InternalChessDSL.g:3539:1: rule__TimeUp__Group__0 : rule__TimeUp__Group__0__Impl rule__TimeUp__Group__1 ;
    public final void rule__TimeUp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3543:1: ( rule__TimeUp__Group__0__Impl rule__TimeUp__Group__1 )
            // InternalChessDSL.g:3544:2: rule__TimeUp__Group__0__Impl rule__TimeUp__Group__1
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
    // InternalChessDSL.g:3551:1: rule__TimeUp__Group__0__Impl : ( ( rule__TimeUp__PlayerAssignment_0 ) ) ;
    public final void rule__TimeUp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3555:1: ( ( ( rule__TimeUp__PlayerAssignment_0 ) ) )
            // InternalChessDSL.g:3556:1: ( ( rule__TimeUp__PlayerAssignment_0 ) )
            {
            // InternalChessDSL.g:3556:1: ( ( rule__TimeUp__PlayerAssignment_0 ) )
            // InternalChessDSL.g:3557:2: ( rule__TimeUp__PlayerAssignment_0 )
            {
             before(grammarAccess.getTimeUpAccess().getPlayerAssignment_0()); 
            // InternalChessDSL.g:3558:2: ( rule__TimeUp__PlayerAssignment_0 )
            // InternalChessDSL.g:3558:3: rule__TimeUp__PlayerAssignment_0
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
    // InternalChessDSL.g:3566:1: rule__TimeUp__Group__1 : rule__TimeUp__Group__1__Impl rule__TimeUp__Group__2 ;
    public final void rule__TimeUp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3570:1: ( rule__TimeUp__Group__1__Impl rule__TimeUp__Group__2 )
            // InternalChessDSL.g:3571:2: rule__TimeUp__Group__1__Impl rule__TimeUp__Group__2
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
    // InternalChessDSL.g:3578:1: rule__TimeUp__Group__1__Impl : ( 'ran' ) ;
    public final void rule__TimeUp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3582:1: ( ( 'ran' ) )
            // InternalChessDSL.g:3583:1: ( 'ran' )
            {
            // InternalChessDSL.g:3583:1: ( 'ran' )
            // InternalChessDSL.g:3584:2: 'ran'
            {
             before(grammarAccess.getTimeUpAccess().getRanKeyword_1()); 
            match(input,60,FOLLOW_2); 
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
    // InternalChessDSL.g:3593:1: rule__TimeUp__Group__2 : rule__TimeUp__Group__2__Impl rule__TimeUp__Group__3 ;
    public final void rule__TimeUp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3597:1: ( rule__TimeUp__Group__2__Impl rule__TimeUp__Group__3 )
            // InternalChessDSL.g:3598:2: rule__TimeUp__Group__2__Impl rule__TimeUp__Group__3
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
    // InternalChessDSL.g:3605:1: rule__TimeUp__Group__2__Impl : ( 'out' ) ;
    public final void rule__TimeUp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3609:1: ( ( 'out' ) )
            // InternalChessDSL.g:3610:1: ( 'out' )
            {
            // InternalChessDSL.g:3610:1: ( 'out' )
            // InternalChessDSL.g:3611:2: 'out'
            {
             before(grammarAccess.getTimeUpAccess().getOutKeyword_2()); 
            match(input,61,FOLLOW_2); 
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
    // InternalChessDSL.g:3620:1: rule__TimeUp__Group__3 : rule__TimeUp__Group__3__Impl rule__TimeUp__Group__4 ;
    public final void rule__TimeUp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3624:1: ( rule__TimeUp__Group__3__Impl rule__TimeUp__Group__4 )
            // InternalChessDSL.g:3625:2: rule__TimeUp__Group__3__Impl rule__TimeUp__Group__4
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
    // InternalChessDSL.g:3632:1: rule__TimeUp__Group__3__Impl : ( 'of' ) ;
    public final void rule__TimeUp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3636:1: ( ( 'of' ) )
            // InternalChessDSL.g:3637:1: ( 'of' )
            {
            // InternalChessDSL.g:3637:1: ( 'of' )
            // InternalChessDSL.g:3638:2: 'of'
            {
             before(grammarAccess.getTimeUpAccess().getOfKeyword_3()); 
            match(input,62,FOLLOW_2); 
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
    // InternalChessDSL.g:3647:1: rule__TimeUp__Group__4 : rule__TimeUp__Group__4__Impl ;
    public final void rule__TimeUp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3651:1: ( rule__TimeUp__Group__4__Impl )
            // InternalChessDSL.g:3652:2: rule__TimeUp__Group__4__Impl
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
    // InternalChessDSL.g:3658:1: rule__TimeUp__Group__4__Impl : ( 'time' ) ;
    public final void rule__TimeUp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3662:1: ( ( 'time' ) )
            // InternalChessDSL.g:3663:1: ( 'time' )
            {
            // InternalChessDSL.g:3663:1: ( 'time' )
            // InternalChessDSL.g:3664:2: 'time'
            {
             before(grammarAccess.getTimeUpAccess().getTimeKeyword_4()); 
            match(input,63,FOLLOW_2); 
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
    // InternalChessDSL.g:3674:1: rule__Resign__Group__0 : rule__Resign__Group__0__Impl rule__Resign__Group__1 ;
    public final void rule__Resign__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3678:1: ( rule__Resign__Group__0__Impl rule__Resign__Group__1 )
            // InternalChessDSL.g:3679:2: rule__Resign__Group__0__Impl rule__Resign__Group__1
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
    // InternalChessDSL.g:3686:1: rule__Resign__Group__0__Impl : ( ( rule__Resign__PlayerAssignment_0 ) ) ;
    public final void rule__Resign__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3690:1: ( ( ( rule__Resign__PlayerAssignment_0 ) ) )
            // InternalChessDSL.g:3691:1: ( ( rule__Resign__PlayerAssignment_0 ) )
            {
            // InternalChessDSL.g:3691:1: ( ( rule__Resign__PlayerAssignment_0 ) )
            // InternalChessDSL.g:3692:2: ( rule__Resign__PlayerAssignment_0 )
            {
             before(grammarAccess.getResignAccess().getPlayerAssignment_0()); 
            // InternalChessDSL.g:3693:2: ( rule__Resign__PlayerAssignment_0 )
            // InternalChessDSL.g:3693:3: rule__Resign__PlayerAssignment_0
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
    // InternalChessDSL.g:3701:1: rule__Resign__Group__1 : rule__Resign__Group__1__Impl ;
    public final void rule__Resign__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3705:1: ( rule__Resign__Group__1__Impl )
            // InternalChessDSL.g:3706:2: rule__Resign__Group__1__Impl
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
    // InternalChessDSL.g:3712:1: rule__Resign__Group__1__Impl : ( 'resigned' ) ;
    public final void rule__Resign__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3716:1: ( ( 'resigned' ) )
            // InternalChessDSL.g:3717:1: ( 'resigned' )
            {
            // InternalChessDSL.g:3717:1: ( 'resigned' )
            // InternalChessDSL.g:3718:2: 'resigned'
            {
             before(grammarAccess.getResignAccess().getResignedKeyword_1()); 
            match(input,64,FOLLOW_2); 
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
    // InternalChessDSL.g:3728:1: rule__Checkmate__Group__0 : rule__Checkmate__Group__0__Impl rule__Checkmate__Group__1 ;
    public final void rule__Checkmate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3732:1: ( rule__Checkmate__Group__0__Impl rule__Checkmate__Group__1 )
            // InternalChessDSL.g:3733:2: rule__Checkmate__Group__0__Impl rule__Checkmate__Group__1
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
    // InternalChessDSL.g:3740:1: rule__Checkmate__Group__0__Impl : ( ( rule__Checkmate__Player1Assignment_0 ) ) ;
    public final void rule__Checkmate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3744:1: ( ( ( rule__Checkmate__Player1Assignment_0 ) ) )
            // InternalChessDSL.g:3745:1: ( ( rule__Checkmate__Player1Assignment_0 ) )
            {
            // InternalChessDSL.g:3745:1: ( ( rule__Checkmate__Player1Assignment_0 ) )
            // InternalChessDSL.g:3746:2: ( rule__Checkmate__Player1Assignment_0 )
            {
             before(grammarAccess.getCheckmateAccess().getPlayer1Assignment_0()); 
            // InternalChessDSL.g:3747:2: ( rule__Checkmate__Player1Assignment_0 )
            // InternalChessDSL.g:3747:3: rule__Checkmate__Player1Assignment_0
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
    // InternalChessDSL.g:3755:1: rule__Checkmate__Group__1 : rule__Checkmate__Group__1__Impl rule__Checkmate__Group__2 ;
    public final void rule__Checkmate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3759:1: ( rule__Checkmate__Group__1__Impl rule__Checkmate__Group__2 )
            // InternalChessDSL.g:3760:2: rule__Checkmate__Group__1__Impl rule__Checkmate__Group__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalChessDSL.g:3767:1: rule__Checkmate__Group__1__Impl : ( 'checkmated' ) ;
    public final void rule__Checkmate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3771:1: ( ( 'checkmated' ) )
            // InternalChessDSL.g:3772:1: ( 'checkmated' )
            {
            // InternalChessDSL.g:3772:1: ( 'checkmated' )
            // InternalChessDSL.g:3773:2: 'checkmated'
            {
             before(grammarAccess.getCheckmateAccess().getCheckmatedKeyword_1()); 
            match(input,65,FOLLOW_2); 
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
    // InternalChessDSL.g:3782:1: rule__Checkmate__Group__2 : rule__Checkmate__Group__2__Impl ;
    public final void rule__Checkmate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3786:1: ( rule__Checkmate__Group__2__Impl )
            // InternalChessDSL.g:3787:2: rule__Checkmate__Group__2__Impl
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
    // InternalChessDSL.g:3793:1: rule__Checkmate__Group__2__Impl : ( ( rule__Checkmate__Player2Assignment_2 ) ) ;
    public final void rule__Checkmate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3797:1: ( ( ( rule__Checkmate__Player2Assignment_2 ) ) )
            // InternalChessDSL.g:3798:1: ( ( rule__Checkmate__Player2Assignment_2 ) )
            {
            // InternalChessDSL.g:3798:1: ( ( rule__Checkmate__Player2Assignment_2 ) )
            // InternalChessDSL.g:3799:2: ( rule__Checkmate__Player2Assignment_2 )
            {
             before(grammarAccess.getCheckmateAccess().getPlayer2Assignment_2()); 
            // InternalChessDSL.g:3800:2: ( rule__Checkmate__Player2Assignment_2 )
            // InternalChessDSL.g:3800:3: rule__Checkmate__Player2Assignment_2
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
    // InternalChessDSL.g:3809:1: rule__Draw__Group__0 : rule__Draw__Group__0__Impl rule__Draw__Group__1 ;
    public final void rule__Draw__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3813:1: ( rule__Draw__Group__0__Impl rule__Draw__Group__1 )
            // InternalChessDSL.g:3814:2: rule__Draw__Group__0__Impl rule__Draw__Group__1
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
    // InternalChessDSL.g:3821:1: rule__Draw__Group__0__Impl : ( ( rule__Draw__Player1Assignment_0 ) ) ;
    public final void rule__Draw__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3825:1: ( ( ( rule__Draw__Player1Assignment_0 ) ) )
            // InternalChessDSL.g:3826:1: ( ( rule__Draw__Player1Assignment_0 ) )
            {
            // InternalChessDSL.g:3826:1: ( ( rule__Draw__Player1Assignment_0 ) )
            // InternalChessDSL.g:3827:2: ( rule__Draw__Player1Assignment_0 )
            {
             before(grammarAccess.getDrawAccess().getPlayer1Assignment_0()); 
            // InternalChessDSL.g:3828:2: ( rule__Draw__Player1Assignment_0 )
            // InternalChessDSL.g:3828:3: rule__Draw__Player1Assignment_0
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
    // InternalChessDSL.g:3836:1: rule__Draw__Group__1 : rule__Draw__Group__1__Impl rule__Draw__Group__2 ;
    public final void rule__Draw__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3840:1: ( rule__Draw__Group__1__Impl rule__Draw__Group__2 )
            // InternalChessDSL.g:3841:2: rule__Draw__Group__1__Impl rule__Draw__Group__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalChessDSL.g:3848:1: rule__Draw__Group__1__Impl : ( 'and' ) ;
    public final void rule__Draw__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3852:1: ( ( 'and' ) )
            // InternalChessDSL.g:3853:1: ( 'and' )
            {
            // InternalChessDSL.g:3853:1: ( 'and' )
            // InternalChessDSL.g:3854:2: 'and'
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
    // InternalChessDSL.g:3863:1: rule__Draw__Group__2 : rule__Draw__Group__2__Impl rule__Draw__Group__3 ;
    public final void rule__Draw__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3867:1: ( rule__Draw__Group__2__Impl rule__Draw__Group__3 )
            // InternalChessDSL.g:3868:2: rule__Draw__Group__2__Impl rule__Draw__Group__3
            {
            pushFollow(FOLLOW_46);
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
    // InternalChessDSL.g:3875:1: rule__Draw__Group__2__Impl : ( ( rule__Draw__Player2Assignment_2 ) ) ;
    public final void rule__Draw__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3879:1: ( ( ( rule__Draw__Player2Assignment_2 ) ) )
            // InternalChessDSL.g:3880:1: ( ( rule__Draw__Player2Assignment_2 ) )
            {
            // InternalChessDSL.g:3880:1: ( ( rule__Draw__Player2Assignment_2 ) )
            // InternalChessDSL.g:3881:2: ( rule__Draw__Player2Assignment_2 )
            {
             before(grammarAccess.getDrawAccess().getPlayer2Assignment_2()); 
            // InternalChessDSL.g:3882:2: ( rule__Draw__Player2Assignment_2 )
            // InternalChessDSL.g:3882:3: rule__Draw__Player2Assignment_2
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
    // InternalChessDSL.g:3890:1: rule__Draw__Group__3 : rule__Draw__Group__3__Impl ;
    public final void rule__Draw__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3894:1: ( rule__Draw__Group__3__Impl )
            // InternalChessDSL.g:3895:2: rule__Draw__Group__3__Impl
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
    // InternalChessDSL.g:3901:1: rule__Draw__Group__3__Impl : ( ( rule__Draw__ResultAssignment_3 ) ) ;
    public final void rule__Draw__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3905:1: ( ( ( rule__Draw__ResultAssignment_3 ) ) )
            // InternalChessDSL.g:3906:1: ( ( rule__Draw__ResultAssignment_3 ) )
            {
            // InternalChessDSL.g:3906:1: ( ( rule__Draw__ResultAssignment_3 ) )
            // InternalChessDSL.g:3907:2: ( rule__Draw__ResultAssignment_3 )
            {
             before(grammarAccess.getDrawAccess().getResultAssignment_3()); 
            // InternalChessDSL.g:3908:2: ( rule__Draw__ResultAssignment_3 )
            // InternalChessDSL.g:3908:3: rule__Draw__ResultAssignment_3
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
    // InternalChessDSL.g:3917:1: rule__Stalemate__Group__0 : rule__Stalemate__Group__0__Impl rule__Stalemate__Group__1 ;
    public final void rule__Stalemate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3921:1: ( rule__Stalemate__Group__0__Impl rule__Stalemate__Group__1 )
            // InternalChessDSL.g:3922:2: rule__Stalemate__Group__0__Impl rule__Stalemate__Group__1
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
    // InternalChessDSL.g:3929:1: rule__Stalemate__Group__0__Impl : ( 'ended' ) ;
    public final void rule__Stalemate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3933:1: ( ( 'ended' ) )
            // InternalChessDSL.g:3934:1: ( 'ended' )
            {
            // InternalChessDSL.g:3934:1: ( 'ended' )
            // InternalChessDSL.g:3935:2: 'ended'
            {
             before(grammarAccess.getStalemateAccess().getEndedKeyword_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalChessDSL.g:3944:1: rule__Stalemate__Group__1 : rule__Stalemate__Group__1__Impl rule__Stalemate__Group__2 ;
    public final void rule__Stalemate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3948:1: ( rule__Stalemate__Group__1__Impl rule__Stalemate__Group__2 )
            // InternalChessDSL.g:3949:2: rule__Stalemate__Group__1__Impl rule__Stalemate__Group__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalChessDSL.g:3956:1: rule__Stalemate__Group__1__Impl : ( 'the' ) ;
    public final void rule__Stalemate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3960:1: ( ( 'the' ) )
            // InternalChessDSL.g:3961:1: ( 'the' )
            {
            // InternalChessDSL.g:3961:1: ( 'the' )
            // InternalChessDSL.g:3962:2: 'the'
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
    // InternalChessDSL.g:3971:1: rule__Stalemate__Group__2 : rule__Stalemate__Group__2__Impl rule__Stalemate__Group__3 ;
    public final void rule__Stalemate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3975:1: ( rule__Stalemate__Group__2__Impl rule__Stalemate__Group__3 )
            // InternalChessDSL.g:3976:2: rule__Stalemate__Group__2__Impl rule__Stalemate__Group__3
            {
            pushFollow(FOLLOW_48);
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
    // InternalChessDSL.g:3983:1: rule__Stalemate__Group__2__Impl : ( 'game' ) ;
    public final void rule__Stalemate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3987:1: ( ( 'game' ) )
            // InternalChessDSL.g:3988:1: ( 'game' )
            {
            // InternalChessDSL.g:3988:1: ( 'game' )
            // InternalChessDSL.g:3989:2: 'game'
            {
             before(grammarAccess.getStalemateAccess().getGameKeyword_2()); 
            match(input,67,FOLLOW_2); 
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
    // InternalChessDSL.g:3998:1: rule__Stalemate__Group__3 : rule__Stalemate__Group__3__Impl rule__Stalemate__Group__4 ;
    public final void rule__Stalemate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4002:1: ( rule__Stalemate__Group__3__Impl rule__Stalemate__Group__4 )
            // InternalChessDSL.g:4003:2: rule__Stalemate__Group__3__Impl rule__Stalemate__Group__4
            {
            pushFollow(FOLLOW_49);
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
    // InternalChessDSL.g:4010:1: rule__Stalemate__Group__3__Impl : ( 'in' ) ;
    public final void rule__Stalemate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4014:1: ( ( 'in' ) )
            // InternalChessDSL.g:4015:1: ( 'in' )
            {
            // InternalChessDSL.g:4015:1: ( 'in' )
            // InternalChessDSL.g:4016:2: 'in'
            {
             before(grammarAccess.getStalemateAccess().getInKeyword_3()); 
            match(input,68,FOLLOW_2); 
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
    // InternalChessDSL.g:4025:1: rule__Stalemate__Group__4 : rule__Stalemate__Group__4__Impl rule__Stalemate__Group__5 ;
    public final void rule__Stalemate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4029:1: ( rule__Stalemate__Group__4__Impl rule__Stalemate__Group__5 )
            // InternalChessDSL.g:4030:2: rule__Stalemate__Group__4__Impl rule__Stalemate__Group__5
            {
            pushFollow(FOLLOW_50);
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
    // InternalChessDSL.g:4037:1: rule__Stalemate__Group__4__Impl : ( 'a' ) ;
    public final void rule__Stalemate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4041:1: ( ( 'a' ) )
            // InternalChessDSL.g:4042:1: ( 'a' )
            {
            // InternalChessDSL.g:4042:1: ( 'a' )
            // InternalChessDSL.g:4043:2: 'a'
            {
             before(grammarAccess.getStalemateAccess().getAKeyword_4()); 
            match(input,69,FOLLOW_2); 
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
    // InternalChessDSL.g:4052:1: rule__Stalemate__Group__5 : rule__Stalemate__Group__5__Impl ;
    public final void rule__Stalemate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4056:1: ( rule__Stalemate__Group__5__Impl )
            // InternalChessDSL.g:4057:2: rule__Stalemate__Group__5__Impl
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
    // InternalChessDSL.g:4063:1: rule__Stalemate__Group__5__Impl : ( 'stalemate' ) ;
    public final void rule__Stalemate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4067:1: ( ( 'stalemate' ) )
            // InternalChessDSL.g:4068:1: ( 'stalemate' )
            {
            // InternalChessDSL.g:4068:1: ( 'stalemate' )
            // InternalChessDSL.g:4069:2: 'stalemate'
            {
             before(grammarAccess.getStalemateAccess().getStalemateKeyword_5()); 
            match(input,70,FOLLOW_2); 
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
    // InternalChessDSL.g:4079:1: rule__Threefold__Group__0 : rule__Threefold__Group__0__Impl rule__Threefold__Group__1 ;
    public final void rule__Threefold__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4083:1: ( rule__Threefold__Group__0__Impl rule__Threefold__Group__1 )
            // InternalChessDSL.g:4084:2: rule__Threefold__Group__0__Impl rule__Threefold__Group__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalChessDSL.g:4091:1: rule__Threefold__Group__0__Impl : ( 'repeated' ) ;
    public final void rule__Threefold__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4095:1: ( ( 'repeated' ) )
            // InternalChessDSL.g:4096:1: ( 'repeated' )
            {
            // InternalChessDSL.g:4096:1: ( 'repeated' )
            // InternalChessDSL.g:4097:2: 'repeated'
            {
             before(grammarAccess.getThreefoldAccess().getRepeatedKeyword_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalChessDSL.g:4106:1: rule__Threefold__Group__1 : rule__Threefold__Group__1__Impl rule__Threefold__Group__2 ;
    public final void rule__Threefold__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4110:1: ( rule__Threefold__Group__1__Impl rule__Threefold__Group__2 )
            // InternalChessDSL.g:4111:2: rule__Threefold__Group__1__Impl rule__Threefold__Group__2
            {
            pushFollow(FOLLOW_51);
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
    // InternalChessDSL.g:4118:1: rule__Threefold__Group__1__Impl : ( 'a' ) ;
    public final void rule__Threefold__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4122:1: ( ( 'a' ) )
            // InternalChessDSL.g:4123:1: ( 'a' )
            {
            // InternalChessDSL.g:4123:1: ( 'a' )
            // InternalChessDSL.g:4124:2: 'a'
            {
             before(grammarAccess.getThreefoldAccess().getAKeyword_1()); 
            match(input,69,FOLLOW_2); 
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
    // InternalChessDSL.g:4133:1: rule__Threefold__Group__2 : rule__Threefold__Group__2__Impl rule__Threefold__Group__3 ;
    public final void rule__Threefold__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4137:1: ( rule__Threefold__Group__2__Impl rule__Threefold__Group__3 )
            // InternalChessDSL.g:4138:2: rule__Threefold__Group__2__Impl rule__Threefold__Group__3
            {
            pushFollow(FOLLOW_52);
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
    // InternalChessDSL.g:4145:1: rule__Threefold__Group__2__Impl : ( 'position' ) ;
    public final void rule__Threefold__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4149:1: ( ( 'position' ) )
            // InternalChessDSL.g:4150:1: ( 'position' )
            {
            // InternalChessDSL.g:4150:1: ( 'position' )
            // InternalChessDSL.g:4151:2: 'position'
            {
             before(grammarAccess.getThreefoldAccess().getPositionKeyword_2()); 
            match(input,72,FOLLOW_2); 
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
    // InternalChessDSL.g:4160:1: rule__Threefold__Group__3 : rule__Threefold__Group__3__Impl rule__Threefold__Group__4 ;
    public final void rule__Threefold__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4164:1: ( rule__Threefold__Group__3__Impl rule__Threefold__Group__4 )
            // InternalChessDSL.g:4165:2: rule__Threefold__Group__3__Impl rule__Threefold__Group__4
            {
            pushFollow(FOLLOW_53);
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
    // InternalChessDSL.g:4172:1: rule__Threefold__Group__3__Impl : ( 'three' ) ;
    public final void rule__Threefold__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4176:1: ( ( 'three' ) )
            // InternalChessDSL.g:4177:1: ( 'three' )
            {
            // InternalChessDSL.g:4177:1: ( 'three' )
            // InternalChessDSL.g:4178:2: 'three'
            {
             before(grammarAccess.getThreefoldAccess().getThreeKeyword_3()); 
            match(input,73,FOLLOW_2); 
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
    // InternalChessDSL.g:4187:1: rule__Threefold__Group__4 : rule__Threefold__Group__4__Impl ;
    public final void rule__Threefold__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4191:1: ( rule__Threefold__Group__4__Impl )
            // InternalChessDSL.g:4192:2: rule__Threefold__Group__4__Impl
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
    // InternalChessDSL.g:4198:1: rule__Threefold__Group__4__Impl : ( 'times' ) ;
    public final void rule__Threefold__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4202:1: ( ( 'times' ) )
            // InternalChessDSL.g:4203:1: ( 'times' )
            {
            // InternalChessDSL.g:4203:1: ( 'times' )
            // InternalChessDSL.g:4204:2: 'times'
            {
             before(grammarAccess.getThreefoldAccess().getTimesKeyword_4()); 
            match(input,74,FOLLOW_2); 
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
    // InternalChessDSL.g:4214:1: rule__Fifty__Group__0 : rule__Fifty__Group__0__Impl rule__Fifty__Group__1 ;
    public final void rule__Fifty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4218:1: ( rule__Fifty__Group__0__Impl rule__Fifty__Group__1 )
            // InternalChessDSL.g:4219:2: rule__Fifty__Group__0__Impl rule__Fifty__Group__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalChessDSL.g:4226:1: rule__Fifty__Group__0__Impl : ( 'played' ) ;
    public final void rule__Fifty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4230:1: ( ( 'played' ) )
            // InternalChessDSL.g:4231:1: ( 'played' )
            {
            // InternalChessDSL.g:4231:1: ( 'played' )
            // InternalChessDSL.g:4232:2: 'played'
            {
             before(grammarAccess.getFiftyAccess().getPlayedKeyword_0()); 
            match(input,75,FOLLOW_2); 
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
    // InternalChessDSL.g:4241:1: rule__Fifty__Group__1 : rule__Fifty__Group__1__Impl rule__Fifty__Group__2 ;
    public final void rule__Fifty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4245:1: ( rule__Fifty__Group__1__Impl rule__Fifty__Group__2 )
            // InternalChessDSL.g:4246:2: rule__Fifty__Group__1__Impl rule__Fifty__Group__2
            {
            pushFollow(FOLLOW_55);
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
    // InternalChessDSL.g:4253:1: rule__Fifty__Group__1__Impl : ( 'fifty' ) ;
    public final void rule__Fifty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4257:1: ( ( 'fifty' ) )
            // InternalChessDSL.g:4258:1: ( 'fifty' )
            {
            // InternalChessDSL.g:4258:1: ( 'fifty' )
            // InternalChessDSL.g:4259:2: 'fifty'
            {
             before(grammarAccess.getFiftyAccess().getFiftyKeyword_1()); 
            match(input,76,FOLLOW_2); 
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
    // InternalChessDSL.g:4268:1: rule__Fifty__Group__2 : rule__Fifty__Group__2__Impl rule__Fifty__Group__3 ;
    public final void rule__Fifty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4272:1: ( rule__Fifty__Group__2__Impl rule__Fifty__Group__3 )
            // InternalChessDSL.g:4273:2: rule__Fifty__Group__2__Impl rule__Fifty__Group__3
            {
            pushFollow(FOLLOW_56);
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
    // InternalChessDSL.g:4280:1: rule__Fifty__Group__2__Impl : ( 'moves' ) ;
    public final void rule__Fifty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4284:1: ( ( 'moves' ) )
            // InternalChessDSL.g:4285:1: ( 'moves' )
            {
            // InternalChessDSL.g:4285:1: ( 'moves' )
            // InternalChessDSL.g:4286:2: 'moves'
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
    // InternalChessDSL.g:4295:1: rule__Fifty__Group__3 : rule__Fifty__Group__3__Impl rule__Fifty__Group__4 ;
    public final void rule__Fifty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4299:1: ( rule__Fifty__Group__3__Impl rule__Fifty__Group__4 )
            // InternalChessDSL.g:4300:2: rule__Fifty__Group__3__Impl rule__Fifty__Group__4
            {
            pushFollow(FOLLOW_49);
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
    // InternalChessDSL.g:4307:1: rule__Fifty__Group__3__Impl : ( 'without' ) ;
    public final void rule__Fifty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4311:1: ( ( 'without' ) )
            // InternalChessDSL.g:4312:1: ( 'without' )
            {
            // InternalChessDSL.g:4312:1: ( 'without' )
            // InternalChessDSL.g:4313:2: 'without'
            {
             before(grammarAccess.getFiftyAccess().getWithoutKeyword_3()); 
            match(input,77,FOLLOW_2); 
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
    // InternalChessDSL.g:4322:1: rule__Fifty__Group__4 : rule__Fifty__Group__4__Impl rule__Fifty__Group__5 ;
    public final void rule__Fifty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4326:1: ( rule__Fifty__Group__4__Impl rule__Fifty__Group__5 )
            // InternalChessDSL.g:4327:2: rule__Fifty__Group__4__Impl rule__Fifty__Group__5
            {
            pushFollow(FOLLOW_57);
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
    // InternalChessDSL.g:4334:1: rule__Fifty__Group__4__Impl : ( 'a' ) ;
    public final void rule__Fifty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4338:1: ( ( 'a' ) )
            // InternalChessDSL.g:4339:1: ( 'a' )
            {
            // InternalChessDSL.g:4339:1: ( 'a' )
            // InternalChessDSL.g:4340:2: 'a'
            {
             before(grammarAccess.getFiftyAccess().getAKeyword_4()); 
            match(input,69,FOLLOW_2); 
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
    // InternalChessDSL.g:4349:1: rule__Fifty__Group__5 : rule__Fifty__Group__5__Impl ;
    public final void rule__Fifty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4353:1: ( rule__Fifty__Group__5__Impl )
            // InternalChessDSL.g:4354:2: rule__Fifty__Group__5__Impl
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
    // InternalChessDSL.g:4360:1: rule__Fifty__Group__5__Impl : ( 'capture' ) ;
    public final void rule__Fifty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4364:1: ( ( 'capture' ) )
            // InternalChessDSL.g:4365:1: ( 'capture' )
            {
            // InternalChessDSL.g:4365:1: ( 'capture' )
            // InternalChessDSL.g:4366:2: 'capture'
            {
             before(grammarAccess.getFiftyAccess().getCaptureKeyword_5()); 
            match(input,78,FOLLOW_2); 
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
    // InternalChessDSL.g:4376:1: rule__Agree__Group__0 : rule__Agree__Group__0__Impl rule__Agree__Group__1 ;
    public final void rule__Agree__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4380:1: ( rule__Agree__Group__0__Impl rule__Agree__Group__1 )
            // InternalChessDSL.g:4381:2: rule__Agree__Group__0__Impl rule__Agree__Group__1
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
    // InternalChessDSL.g:4388:1: rule__Agree__Group__0__Impl : ( 'agreed' ) ;
    public final void rule__Agree__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4392:1: ( ( 'agreed' ) )
            // InternalChessDSL.g:4393:1: ( 'agreed' )
            {
            // InternalChessDSL.g:4393:1: ( 'agreed' )
            // InternalChessDSL.g:4394:2: 'agreed'
            {
             before(grammarAccess.getAgreeAccess().getAgreedKeyword_0()); 
            match(input,79,FOLLOW_2); 
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
    // InternalChessDSL.g:4403:1: rule__Agree__Group__1 : rule__Agree__Group__1__Impl rule__Agree__Group__2 ;
    public final void rule__Agree__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4407:1: ( rule__Agree__Group__1__Impl rule__Agree__Group__2 )
            // InternalChessDSL.g:4408:2: rule__Agree__Group__1__Impl rule__Agree__Group__2
            {
            pushFollow(FOLLOW_49);
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
    // InternalChessDSL.g:4415:1: rule__Agree__Group__1__Impl : ( 'to' ) ;
    public final void rule__Agree__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4419:1: ( ( 'to' ) )
            // InternalChessDSL.g:4420:1: ( 'to' )
            {
            // InternalChessDSL.g:4420:1: ( 'to' )
            // InternalChessDSL.g:4421:2: 'to'
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
    // InternalChessDSL.g:4430:1: rule__Agree__Group__2 : rule__Agree__Group__2__Impl rule__Agree__Group__3 ;
    public final void rule__Agree__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4434:1: ( rule__Agree__Group__2__Impl rule__Agree__Group__3 )
            // InternalChessDSL.g:4435:2: rule__Agree__Group__2__Impl rule__Agree__Group__3
            {
            pushFollow(FOLLOW_58);
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
    // InternalChessDSL.g:4442:1: rule__Agree__Group__2__Impl : ( 'a' ) ;
    public final void rule__Agree__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4446:1: ( ( 'a' ) )
            // InternalChessDSL.g:4447:1: ( 'a' )
            {
            // InternalChessDSL.g:4447:1: ( 'a' )
            // InternalChessDSL.g:4448:2: 'a'
            {
             before(grammarAccess.getAgreeAccess().getAKeyword_2()); 
            match(input,69,FOLLOW_2); 
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
    // InternalChessDSL.g:4457:1: rule__Agree__Group__3 : rule__Agree__Group__3__Impl ;
    public final void rule__Agree__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4461:1: ( rule__Agree__Group__3__Impl )
            // InternalChessDSL.g:4462:2: rule__Agree__Group__3__Impl
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
    // InternalChessDSL.g:4468:1: rule__Agree__Group__3__Impl : ( 'draw' ) ;
    public final void rule__Agree__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4472:1: ( ( 'draw' ) )
            // InternalChessDSL.g:4473:1: ( 'draw' )
            {
            // InternalChessDSL.g:4473:1: ( 'draw' )
            // InternalChessDSL.g:4474:2: 'draw'
            {
             before(grammarAccess.getAgreeAccess().getDrawKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalChessDSL.g:4484:1: rule__Result__Group_0__0 : rule__Result__Group_0__0__Impl rule__Result__Group_0__1 ;
    public final void rule__Result__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4488:1: ( rule__Result__Group_0__0__Impl rule__Result__Group_0__1 )
            // InternalChessDSL.g:4489:2: rule__Result__Group_0__0__Impl rule__Result__Group_0__1
            {
            pushFollow(FOLLOW_59);
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
    // InternalChessDSL.g:4496:1: rule__Result__Group_0__0__Impl : ( ( rule__Result__Alternatives_0_0 ) ) ;
    public final void rule__Result__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4500:1: ( ( ( rule__Result__Alternatives_0_0 ) ) )
            // InternalChessDSL.g:4501:1: ( ( rule__Result__Alternatives_0_0 ) )
            {
            // InternalChessDSL.g:4501:1: ( ( rule__Result__Alternatives_0_0 ) )
            // InternalChessDSL.g:4502:2: ( rule__Result__Alternatives_0_0 )
            {
             before(grammarAccess.getResultAccess().getAlternatives_0_0()); 
            // InternalChessDSL.g:4503:2: ( rule__Result__Alternatives_0_0 )
            // InternalChessDSL.g:4503:3: rule__Result__Alternatives_0_0
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
    // InternalChessDSL.g:4511:1: rule__Result__Group_0__1 : rule__Result__Group_0__1__Impl ;
    public final void rule__Result__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4515:1: ( rule__Result__Group_0__1__Impl )
            // InternalChessDSL.g:4516:2: rule__Result__Group_0__1__Impl
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
    // InternalChessDSL.g:4522:1: rule__Result__Group_0__1__Impl : ( 'wins' ) ;
    public final void rule__Result__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4526:1: ( ( 'wins' ) )
            // InternalChessDSL.g:4527:1: ( 'wins' )
            {
            // InternalChessDSL.g:4527:1: ( 'wins' )
            // InternalChessDSL.g:4528:2: 'wins'
            {
             before(grammarAccess.getResultAccess().getWinsKeyword_0_1()); 
            match(input,80,FOLLOW_2); 
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
    // InternalChessDSL.g:4538:1: rule__Model__GameAssignment : ( ruleGame ) ;
    public final void rule__Model__GameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4542:1: ( ( ruleGame ) )
            // InternalChessDSL.g:4543:2: ( ruleGame )
            {
            // InternalChessDSL.g:4543:2: ( ruleGame )
            // InternalChessDSL.g:4544:3: ruleGame
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
    // InternalChessDSL.g:4553:1: rule__Game__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Game__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4557:1: ( ( RULE_STRING ) )
            // InternalChessDSL.g:4558:2: ( RULE_STRING )
            {
            // InternalChessDSL.g:4558:2: ( RULE_STRING )
            // InternalChessDSL.g:4559:3: RULE_STRING
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
    // InternalChessDSL.g:4568:1: rule__Game__PlayersAssignment_2_1 : ( rulePlayer ) ;
    public final void rule__Game__PlayersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4572:1: ( ( rulePlayer ) )
            // InternalChessDSL.g:4573:2: ( rulePlayer )
            {
            // InternalChessDSL.g:4573:2: ( rulePlayer )
            // InternalChessDSL.g:4574:3: rulePlayer
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
    // InternalChessDSL.g:4583:1: rule__Game__InitialAssignment_3 : ( ruleInitialState ) ;
    public final void rule__Game__InitialAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4587:1: ( ( ruleInitialState ) )
            // InternalChessDSL.g:4588:2: ( ruleInitialState )
            {
            // InternalChessDSL.g:4588:2: ( ruleInitialState )
            // InternalChessDSL.g:4589:3: ruleInitialState
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
    // InternalChessDSL.g:4598:1: rule__Game__MovesAssignment_5 : ( ruleMovePair ) ;
    public final void rule__Game__MovesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4602:1: ( ( ruleMovePair ) )
            // InternalChessDSL.g:4603:2: ( ruleMovePair )
            {
            // InternalChessDSL.g:4603:2: ( ruleMovePair )
            // InternalChessDSL.g:4604:3: ruleMovePair
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
    // InternalChessDSL.g:4613:1: rule__Game__ConclusionAssignment_7 : ( ruleConclusion ) ;
    public final void rule__Game__ConclusionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4617:1: ( ( ruleConclusion ) )
            // InternalChessDSL.g:4618:2: ( ruleConclusion )
            {
            // InternalChessDSL.g:4618:2: ( ruleConclusion )
            // InternalChessDSL.g:4619:3: ruleConclusion
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
    // InternalChessDSL.g:4628:1: rule__Player__ColorAssignment_0 : ( ruleColor ) ;
    public final void rule__Player__ColorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4632:1: ( ( ruleColor ) )
            // InternalChessDSL.g:4633:2: ( ruleColor )
            {
            // InternalChessDSL.g:4633:2: ( ruleColor )
            // InternalChessDSL.g:4634:3: ruleColor
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
    // InternalChessDSL.g:4643:1: rule__Player__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Player__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4647:1: ( ( RULE_STRING ) )
            // InternalChessDSL.g:4648:2: ( RULE_STRING )
            {
            // InternalChessDSL.g:4648:2: ( RULE_STRING )
            // InternalChessDSL.g:4649:3: RULE_STRING
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
    // InternalChessDSL.g:4658:1: rule__InitialState__PositionsAssignment_2_1_1 : ( ruleCustomPositions ) ;
    public final void rule__InitialState__PositionsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4662:1: ( ( ruleCustomPositions ) )
            // InternalChessDSL.g:4663:2: ( ruleCustomPositions )
            {
            // InternalChessDSL.g:4663:2: ( ruleCustomPositions )
            // InternalChessDSL.g:4664:3: ruleCustomPositions
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
    // InternalChessDSL.g:4673:1: rule__CustomPositions__PlacementAssignment_3 : ( rulePlacement ) ;
    public final void rule__CustomPositions__PlacementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4677:1: ( ( rulePlacement ) )
            // InternalChessDSL.g:4678:2: ( rulePlacement )
            {
            // InternalChessDSL.g:4678:2: ( rulePlacement )
            // InternalChessDSL.g:4679:3: rulePlacement
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
    // InternalChessDSL.g:4688:1: rule__Placement__PieceAssignment_0 : ( ruleCustomPiece ) ;
    public final void rule__Placement__PieceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4692:1: ( ( ruleCustomPiece ) )
            // InternalChessDSL.g:4693:2: ( ruleCustomPiece )
            {
            // InternalChessDSL.g:4693:2: ( ruleCustomPiece )
            // InternalChessDSL.g:4694:3: ruleCustomPiece
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
    // InternalChessDSL.g:4703:1: rule__Placement__SquareAssignment_2 : ( ruleSquare ) ;
    public final void rule__Placement__SquareAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4707:1: ( ( ruleSquare ) )
            // InternalChessDSL.g:4708:2: ( ruleSquare )
            {
            // InternalChessDSL.g:4708:2: ( ruleSquare )
            // InternalChessDSL.g:4709:3: ruleSquare
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
    // InternalChessDSL.g:4718:1: rule__CustomPiece__ColorAssignment_0 : ( ruleColor ) ;
    public final void rule__CustomPiece__ColorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4722:1: ( ( ruleColor ) )
            // InternalChessDSL.g:4723:2: ( ruleColor )
            {
            // InternalChessDSL.g:4723:2: ( ruleColor )
            // InternalChessDSL.g:4724:3: ruleColor
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
    // InternalChessDSL.g:4733:1: rule__CustomPiece__KindAssignment_1 : ( rulePiece ) ;
    public final void rule__CustomPiece__KindAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4737:1: ( ( rulePiece ) )
            // InternalChessDSL.g:4738:2: ( rulePiece )
            {
            // InternalChessDSL.g:4738:2: ( rulePiece )
            // InternalChessDSL.g:4739:3: rulePiece
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
    // InternalChessDSL.g:4748:1: rule__MovePair__MoveNumberAssignment_0 : ( RULE_MOVENUMBER ) ;
    public final void rule__MovePair__MoveNumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4752:1: ( ( RULE_MOVENUMBER ) )
            // InternalChessDSL.g:4753:2: ( RULE_MOVENUMBER )
            {
            // InternalChessDSL.g:4753:2: ( RULE_MOVENUMBER )
            // InternalChessDSL.g:4754:3: RULE_MOVENUMBER
            {
             before(grammarAccess.getMovePairAccess().getMoveNumberMOVENUMBERTerminalRuleCall_0_0()); 
            match(input,RULE_MOVENUMBER,FOLLOW_2); 
             after(grammarAccess.getMovePairAccess().getMoveNumberMOVENUMBERTerminalRuleCall_0_0()); 

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
    // InternalChessDSL.g:4763:1: rule__MovePair__Color1Assignment_1_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__MovePair__Color1Assignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4767:1: ( ( ( RULE_ID ) ) )
            // InternalChessDSL.g:4768:2: ( ( RULE_ID ) )
            {
            // InternalChessDSL.g:4768:2: ( ( RULE_ID ) )
            // InternalChessDSL.g:4769:3: ( RULE_ID )
            {
             before(grammarAccess.getMovePairAccess().getColor1PlayerCrossReference_1_0_0_0()); 
            // InternalChessDSL.g:4770:3: ( RULE_ID )
            // InternalChessDSL.g:4771:4: RULE_ID
            {
             before(grammarAccess.getMovePairAccess().getColor1PlayerIDTerminalRuleCall_1_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMovePairAccess().getColor1PlayerIDTerminalRuleCall_1_0_0_0_1()); 

            }

             after(grammarAccess.getMovePairAccess().getColor1PlayerCrossReference_1_0_0_0()); 

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
    // InternalChessDSL.g:4782:1: rule__MovePair__WhiteMoveAssignment_1_0_1 : ( ruleAnyMove ) ;
    public final void rule__MovePair__WhiteMoveAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4786:1: ( ( ruleAnyMove ) )
            // InternalChessDSL.g:4787:2: ( ruleAnyMove )
            {
            // InternalChessDSL.g:4787:2: ( ruleAnyMove )
            // InternalChessDSL.g:4788:3: ruleAnyMove
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
    // InternalChessDSL.g:4797:1: rule__MovePair__Color2Assignment_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__MovePair__Color2Assignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4801:1: ( ( ( RULE_ID ) ) )
            // InternalChessDSL.g:4802:2: ( ( RULE_ID ) )
            {
            // InternalChessDSL.g:4802:2: ( ( RULE_ID ) )
            // InternalChessDSL.g:4803:3: ( RULE_ID )
            {
             before(grammarAccess.getMovePairAccess().getColor2PlayerCrossReference_2_0_0()); 
            // InternalChessDSL.g:4804:3: ( RULE_ID )
            // InternalChessDSL.g:4805:4: RULE_ID
            {
             before(grammarAccess.getMovePairAccess().getColor2PlayerIDTerminalRuleCall_2_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMovePairAccess().getColor2PlayerIDTerminalRuleCall_2_0_0_1()); 

            }

             after(grammarAccess.getMovePairAccess().getColor2PlayerCrossReference_2_0_0()); 

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
    // InternalChessDSL.g:4816:1: rule__MovePair__BlackMoveAssignment_2_1 : ( ruleAnyMove ) ;
    public final void rule__MovePair__BlackMoveAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4820:1: ( ( ruleAnyMove ) )
            // InternalChessDSL.g:4821:2: ( ruleAnyMove )
            {
            // InternalChessDSL.g:4821:2: ( ruleAnyMove )
            // InternalChessDSL.g:4822:3: ruleAnyMove
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
    // InternalChessDSL.g:4831:1: rule__AnyMove__MoveAssignment_0 : ( ruleDSLMove ) ;
    public final void rule__AnyMove__MoveAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4835:1: ( ( ruleDSLMove ) )
            // InternalChessDSL.g:4836:2: ( ruleDSLMove )
            {
            // InternalChessDSL.g:4836:2: ( ruleDSLMove )
            // InternalChessDSL.g:4837:3: ruleDSLMove
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
    // InternalChessDSL.g:4846:1: rule__AnyMove__RemarksAssignment_1_1 : ( ruleRemark ) ;
    public final void rule__AnyMove__RemarksAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4850:1: ( ( ruleRemark ) )
            // InternalChessDSL.g:4851:2: ( ruleRemark )
            {
            // InternalChessDSL.g:4851:2: ( ruleRemark )
            // InternalChessDSL.g:4852:3: ruleRemark
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
    // InternalChessDSL.g:4861:1: rule__Move__PieceAssignment_1 : ( rulePiece ) ;
    public final void rule__Move__PieceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4865:1: ( ( rulePiece ) )
            // InternalChessDSL.g:4866:2: ( rulePiece )
            {
            // InternalChessDSL.g:4866:2: ( rulePiece )
            // InternalChessDSL.g:4867:3: rulePiece
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
    // InternalChessDSL.g:4876:1: rule__Move__FromAssignment_2_0_1 : ( ruleSquare ) ;
    public final void rule__Move__FromAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4880:1: ( ( ruleSquare ) )
            // InternalChessDSL.g:4881:2: ( ruleSquare )
            {
            // InternalChessDSL.g:4881:2: ( ruleSquare )
            // InternalChessDSL.g:4882:3: ruleSquare
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
    // InternalChessDSL.g:4891:1: rule__Move__ToAssignment_2_0_3 : ( ruleSquare ) ;
    public final void rule__Move__ToAssignment_2_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4895:1: ( ( ruleSquare ) )
            // InternalChessDSL.g:4896:2: ( ruleSquare )
            {
            // InternalChessDSL.g:4896:2: ( ruleSquare )
            // InternalChessDSL.g:4897:3: ruleSquare
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
    // InternalChessDSL.g:4906:1: rule__Move__FromAssignment_2_1_1 : ( ruleSquare ) ;
    public final void rule__Move__FromAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4910:1: ( ( ruleSquare ) )
            // InternalChessDSL.g:4911:2: ( ruleSquare )
            {
            // InternalChessDSL.g:4911:2: ( ruleSquare )
            // InternalChessDSL.g:4912:3: ruleSquare
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
    // InternalChessDSL.g:4921:1: rule__Move__ToAssignment_2_1_3 : ( ruleSquare ) ;
    public final void rule__Move__ToAssignment_2_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4925:1: ( ( ruleSquare ) )
            // InternalChessDSL.g:4926:2: ( ruleSquare )
            {
            // InternalChessDSL.g:4926:2: ( ruleSquare )
            // InternalChessDSL.g:4927:3: ruleSquare
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
    // InternalChessDSL.g:4936:1: rule__Capture__MoveAssignment_0 : ( ruleMove ) ;
    public final void rule__Capture__MoveAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4940:1: ( ( ruleMove ) )
            // InternalChessDSL.g:4941:2: ( ruleMove )
            {
            // InternalChessDSL.g:4941:2: ( ruleMove )
            // InternalChessDSL.g:4942:3: ruleMove
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
    // InternalChessDSL.g:4951:1: rule__Capture__CaptureAssignment_1_0_1 : ( rulePiece ) ;
    public final void rule__Capture__CaptureAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4955:1: ( ( rulePiece ) )
            // InternalChessDSL.g:4956:2: ( rulePiece )
            {
            // InternalChessDSL.g:4956:2: ( rulePiece )
            // InternalChessDSL.g:4957:3: rulePiece
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
    // InternalChessDSL.g:4966:1: rule__Capture__CaptureAssignment_1_1_2 : ( rulePiece ) ;
    public final void rule__Capture__CaptureAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4970:1: ( ( rulePiece ) )
            // InternalChessDSL.g:4971:2: ( rulePiece )
            {
            // InternalChessDSL.g:4971:2: ( rulePiece )
            // InternalChessDSL.g:4972:3: rulePiece
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


    // $ANTLR start "rule__Castle__MoveAssignment_2_0"
    // InternalChessDSL.g:4981:1: rule__Castle__MoveAssignment_2_0 : ( ruleMove ) ;
    public final void rule__Castle__MoveAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4985:1: ( ( ruleMove ) )
            // InternalChessDSL.g:4986:2: ( ruleMove )
            {
            // InternalChessDSL.g:4986:2: ( ruleMove )
            // InternalChessDSL.g:4987:3: ruleMove
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


    // $ANTLR start "rule__Castle__MoveAssignment_3_0"
    // InternalChessDSL.g:4996:1: rule__Castle__MoveAssignment_3_0 : ( ruleMove ) ;
    public final void rule__Castle__MoveAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5000:1: ( ( ruleMove ) )
            // InternalChessDSL.g:5001:2: ( ruleMove )
            {
            // InternalChessDSL.g:5001:2: ( ruleMove )
            // InternalChessDSL.g:5002:3: ruleMove
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


    // $ANTLR start "rule__EnPassant__CaptureAssignment_0"
    // InternalChessDSL.g:5011:1: rule__EnPassant__CaptureAssignment_0 : ( ruleCapture ) ;
    public final void rule__EnPassant__CaptureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5015:1: ( ( ruleCapture ) )
            // InternalChessDSL.g:5016:2: ( ruleCapture )
            {
            // InternalChessDSL.g:5016:2: ( ruleCapture )
            // InternalChessDSL.g:5017:3: ruleCapture
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
    // InternalChessDSL.g:5026:1: rule__EnPassant__SquareAssignment_2 : ( ruleSquare ) ;
    public final void rule__EnPassant__SquareAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5030:1: ( ( ruleSquare ) )
            // InternalChessDSL.g:5031:2: ( ruleSquare )
            {
            // InternalChessDSL.g:5031:2: ( ruleSquare )
            // InternalChessDSL.g:5032:3: ruleSquare
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
    // InternalChessDSL.g:5041:1: rule__Promotion__MoveAssignment_0 : ( ( rule__Promotion__MoveAlternatives_0_0 ) ) ;
    public final void rule__Promotion__MoveAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5045:1: ( ( ( rule__Promotion__MoveAlternatives_0_0 ) ) )
            // InternalChessDSL.g:5046:2: ( ( rule__Promotion__MoveAlternatives_0_0 ) )
            {
            // InternalChessDSL.g:5046:2: ( ( rule__Promotion__MoveAlternatives_0_0 ) )
            // InternalChessDSL.g:5047:3: ( rule__Promotion__MoveAlternatives_0_0 )
            {
             before(grammarAccess.getPromotionAccess().getMoveAlternatives_0_0()); 
            // InternalChessDSL.g:5048:3: ( rule__Promotion__MoveAlternatives_0_0 )
            // InternalChessDSL.g:5048:4: rule__Promotion__MoveAlternatives_0_0
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
    // InternalChessDSL.g:5056:1: rule__Promotion__PieceAssignment_2 : ( rulePiece ) ;
    public final void rule__Promotion__PieceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5060:1: ( ( rulePiece ) )
            // InternalChessDSL.g:5061:2: ( rulePiece )
            {
            // InternalChessDSL.g:5061:2: ( rulePiece )
            // InternalChessDSL.g:5062:3: rulePiece
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
    // InternalChessDSL.g:5071:1: rule__Conclusion__MethodAssignment_0 : ( ruleMethod ) ;
    public final void rule__Conclusion__MethodAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5075:1: ( ( ruleMethod ) )
            // InternalChessDSL.g:5076:2: ( ruleMethod )
            {
            // InternalChessDSL.g:5076:2: ( ruleMethod )
            // InternalChessDSL.g:5077:3: ruleMethod
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
    // InternalChessDSL.g:5086:1: rule__Conclusion__ResultAssignment_1 : ( ruleResult ) ;
    public final void rule__Conclusion__ResultAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5090:1: ( ( ruleResult ) )
            // InternalChessDSL.g:5091:2: ( ruleResult )
            {
            // InternalChessDSL.g:5091:2: ( ruleResult )
            // InternalChessDSL.g:5092:3: ruleResult
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


    // $ANTLR start "rule__TimeUp__PlayerAssignment_0"
    // InternalChessDSL.g:5101:1: rule__TimeUp__PlayerAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TimeUp__PlayerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5105:1: ( ( ( RULE_ID ) ) )
            // InternalChessDSL.g:5106:2: ( ( RULE_ID ) )
            {
            // InternalChessDSL.g:5106:2: ( ( RULE_ID ) )
            // InternalChessDSL.g:5107:3: ( RULE_ID )
            {
             before(grammarAccess.getTimeUpAccess().getPlayerPlayerCrossReference_0_0()); 
            // InternalChessDSL.g:5108:3: ( RULE_ID )
            // InternalChessDSL.g:5109:4: RULE_ID
            {
             before(grammarAccess.getTimeUpAccess().getPlayerPlayerIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTimeUpAccess().getPlayerPlayerIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTimeUpAccess().getPlayerPlayerCrossReference_0_0()); 

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
    // InternalChessDSL.g:5120:1: rule__Resign__PlayerAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Resign__PlayerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5124:1: ( ( ( RULE_ID ) ) )
            // InternalChessDSL.g:5125:2: ( ( RULE_ID ) )
            {
            // InternalChessDSL.g:5125:2: ( ( RULE_ID ) )
            // InternalChessDSL.g:5126:3: ( RULE_ID )
            {
             before(grammarAccess.getResignAccess().getPlayerPlayerCrossReference_0_0()); 
            // InternalChessDSL.g:5127:3: ( RULE_ID )
            // InternalChessDSL.g:5128:4: RULE_ID
            {
             before(grammarAccess.getResignAccess().getPlayerPlayerIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResignAccess().getPlayerPlayerIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getResignAccess().getPlayerPlayerCrossReference_0_0()); 

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
    // InternalChessDSL.g:5139:1: rule__Checkmate__Player1Assignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Checkmate__Player1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5143:1: ( ( ( RULE_ID ) ) )
            // InternalChessDSL.g:5144:2: ( ( RULE_ID ) )
            {
            // InternalChessDSL.g:5144:2: ( ( RULE_ID ) )
            // InternalChessDSL.g:5145:3: ( RULE_ID )
            {
             before(grammarAccess.getCheckmateAccess().getPlayer1PlayerCrossReference_0_0()); 
            // InternalChessDSL.g:5146:3: ( RULE_ID )
            // InternalChessDSL.g:5147:4: RULE_ID
            {
             before(grammarAccess.getCheckmateAccess().getPlayer1PlayerIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheckmateAccess().getPlayer1PlayerIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getCheckmateAccess().getPlayer1PlayerCrossReference_0_0()); 

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
    // InternalChessDSL.g:5158:1: rule__Checkmate__Player2Assignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Checkmate__Player2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5162:1: ( ( ( RULE_ID ) ) )
            // InternalChessDSL.g:5163:2: ( ( RULE_ID ) )
            {
            // InternalChessDSL.g:5163:2: ( ( RULE_ID ) )
            // InternalChessDSL.g:5164:3: ( RULE_ID )
            {
             before(grammarAccess.getCheckmateAccess().getPlayer2PlayerCrossReference_2_0()); 
            // InternalChessDSL.g:5165:3: ( RULE_ID )
            // InternalChessDSL.g:5166:4: RULE_ID
            {
             before(grammarAccess.getCheckmateAccess().getPlayer2PlayerIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheckmateAccess().getPlayer2PlayerIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getCheckmateAccess().getPlayer2PlayerCrossReference_2_0()); 

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
    // InternalChessDSL.g:5177:1: rule__Draw__Player1Assignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Draw__Player1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5181:1: ( ( ( RULE_ID ) ) )
            // InternalChessDSL.g:5182:2: ( ( RULE_ID ) )
            {
            // InternalChessDSL.g:5182:2: ( ( RULE_ID ) )
            // InternalChessDSL.g:5183:3: ( RULE_ID )
            {
             before(grammarAccess.getDrawAccess().getPlayer1PlayerCrossReference_0_0()); 
            // InternalChessDSL.g:5184:3: ( RULE_ID )
            // InternalChessDSL.g:5185:4: RULE_ID
            {
             before(grammarAccess.getDrawAccess().getPlayer1PlayerIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDrawAccess().getPlayer1PlayerIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getDrawAccess().getPlayer1PlayerCrossReference_0_0()); 

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
    // InternalChessDSL.g:5196:1: rule__Draw__Player2Assignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Draw__Player2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5200:1: ( ( ( RULE_ID ) ) )
            // InternalChessDSL.g:5201:2: ( ( RULE_ID ) )
            {
            // InternalChessDSL.g:5201:2: ( ( RULE_ID ) )
            // InternalChessDSL.g:5202:3: ( RULE_ID )
            {
             before(grammarAccess.getDrawAccess().getPlayer2PlayerCrossReference_2_0()); 
            // InternalChessDSL.g:5203:3: ( RULE_ID )
            // InternalChessDSL.g:5204:4: RULE_ID
            {
             before(grammarAccess.getDrawAccess().getPlayer2PlayerIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDrawAccess().getPlayer2PlayerIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDrawAccess().getPlayer2PlayerCrossReference_2_0()); 

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
    // InternalChessDSL.g:5215:1: rule__Draw__ResultAssignment_3 : ( ( rule__Draw__ResultAlternatives_3_0 ) ) ;
    public final void rule__Draw__ResultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5219:1: ( ( ( rule__Draw__ResultAlternatives_3_0 ) ) )
            // InternalChessDSL.g:5220:2: ( ( rule__Draw__ResultAlternatives_3_0 ) )
            {
            // InternalChessDSL.g:5220:2: ( ( rule__Draw__ResultAlternatives_3_0 ) )
            // InternalChessDSL.g:5221:3: ( rule__Draw__ResultAlternatives_3_0 )
            {
             before(grammarAccess.getDrawAccess().getResultAlternatives_3_0()); 
            // InternalChessDSL.g:5222:3: ( rule__Draw__ResultAlternatives_3_0 )
            // InternalChessDSL.g:5222:4: rule__Draw__ResultAlternatives_3_0
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
    // InternalChessDSL.g:5230:1: rule__Result__PlayerAssignment_0_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Result__PlayerAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5234:1: ( ( ( RULE_ID ) ) )
            // InternalChessDSL.g:5235:2: ( ( RULE_ID ) )
            {
            // InternalChessDSL.g:5235:2: ( ( RULE_ID ) )
            // InternalChessDSL.g:5236:3: ( RULE_ID )
            {
             before(grammarAccess.getResultAccess().getPlayerPlayerCrossReference_0_0_0_0()); 
            // InternalChessDSL.g:5237:3: ( RULE_ID )
            // InternalChessDSL.g:5238:4: RULE_ID
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
    // InternalChessDSL.g:5249:1: rule__Result__ColorAssignment_0_0_1 : ( ruleColor ) ;
    public final void rule__Result__ColorAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5253:1: ( ( ruleColor ) )
            // InternalChessDSL.g:5254:2: ( ruleColor )
            {
            // InternalChessDSL.g:5254:2: ( ruleColor )
            // InternalChessDSL.g:5255:3: ruleColor
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

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\47\uffff";
    static final String dfa_2s = "\21\uffff\2\26\13\uffff\7\46\2\uffff";
    static final String dfa_3s = "\1\15\1\36\6\56\2\uffff\2\4\1\61\1\63\2\4\1\57\2\6\1\66\2\36\2\uffff\6\57\7\6\2\uffff";
    static final String dfa_4s = "\1\70\1\43\6\62\2\uffff\2\4\1\61\1\63\2\4\1\57\2\73\1\70\2\43\2\uffff\6\57\7\73\2\uffff";
    static final String dfa_5s = "\10\uffff\1\3\1\6\14\uffff\1\1\1\5\15\uffff\1\4\1\2";
    static final String dfa_6s = "\47\uffff}>";
    static final String[] dfa_7s = {
            "\1\11\20\uffff\1\2\1\3\1\4\1\5\1\6\1\7\14\uffff\1\1\6\uffff\2\10",
            "\1\2\1\3\1\4\1\5\1\6\1\7",
            "\1\12\3\uffff\1\13",
            "\1\12\3\uffff\1\13",
            "\1\12\3\uffff\1\13",
            "\1\12\3\uffff\1\13",
            "\1\12\3\uffff\1\13",
            "\1\12\3\uffff\1\13",
            "",
            "",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\2\26\5\uffff\1\26\20\uffff\6\26\2\uffff\1\26\7\uffff\1\26\1\uffff\1\26\3\uffff\1\24\1\23\1\25\2\26\1\uffff\1\10\1\27",
            "\2\26\5\uffff\1\26\20\uffff\6\26\2\uffff\1\26\7\uffff\1\26\1\uffff\1\26\3\uffff\1\24\1\23\1\25\2\26\1\uffff\1\10\1\27",
            "\1\25\1\uffff\1\10",
            "\1\30\1\31\1\32\1\33\1\34\1\35",
            "\1\36\1\37\1\40\1\41\1\42\1\43",
            "",
            "",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\2\46\5\uffff\1\46\2\uffff\1\45\15\uffff\6\46\2\uffff\1\46\7\uffff\1\46\1\uffff\1\46\6\uffff\2\46\2\uffff\1\27",
            "\2\46\5\uffff\1\46\2\uffff\1\45\15\uffff\6\46\2\uffff\1\46\7\uffff\1\46\1\uffff\1\46\6\uffff\2\46\2\uffff\1\27",
            "\2\46\5\uffff\1\46\2\uffff\1\45\15\uffff\6\46\2\uffff\1\46\7\uffff\1\46\1\uffff\1\46\6\uffff\2\46\2\uffff\1\27",
            "\2\46\5\uffff\1\46\2\uffff\1\45\15\uffff\6\46\2\uffff\1\46\7\uffff\1\46\1\uffff\1\46\6\uffff\2\46\2\uffff\1\27",
            "\2\46\5\uffff\1\46\2\uffff\1\45\15\uffff\6\46\2\uffff\1\46\7\uffff\1\46\1\uffff\1\46\6\uffff\2\46\2\uffff\1\27",
            "\2\46\5\uffff\1\46\2\uffff\1\45\15\uffff\6\46\2\uffff\1\46\7\uffff\1\46\1\uffff\1\46\6\uffff\2\46\2\uffff\1\27",
            "\2\46\5\uffff\1\46\2\uffff\1\45\15\uffff\6\46\2\uffff\1\46\7\uffff\1\46\1\uffff\1\46\6\uffff\2\46\2\uffff\1\27",
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
            return "888:1: rule__DSLMove__Alternatives : ( ( ruleMove ) | ( ruleCapture ) | ( ruleCastle ) | ( ruleEnPassant ) | ( rulePromotion ) | ( ruleDummy ) );";
        }
    }
    static final String dfa_8s = "\25\uffff";
    static final String dfa_9s = "\1\36\2\uffff\1\36\6\56\2\4\1\61\1\63\2\4\1\57\2\65\2\uffff";
    static final String dfa_10s = "\1\70\2\uffff\1\43\6\62\2\4\1\61\1\63\2\4\1\57\2\72\2\uffff";
    static final String dfa_11s = "\1\uffff\1\1\1\2\20\uffff\1\3\1\4";
    static final String dfa_12s = "\25\uffff}>";
    static final String[] dfa_13s = {
            "\1\4\1\5\1\6\1\7\1\10\1\11\14\uffff\1\3\6\uffff\1\1\1\2",
            "",
            "",
            "\1\4\1\5\1\6\1\7\1\10\1\11",
            "\1\12\3\uffff\1\13",
            "\1\12\3\uffff\1\13",
            "\1\12\3\uffff\1\13",
            "\1\12\3\uffff\1\13",
            "\1\12\3\uffff\1\13",
            "\1\12\3\uffff\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\24\4\uffff\1\23",
            "\1\24\4\uffff\1\23",
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
            return "975:1: rule__Castle__Alternatives : ( ( ( rule__Castle__Group_0__0 ) ) | ( ( rule__Castle__Group_1__0 ) ) | ( ( rule__Castle__Group_2__0 ) ) | ( ( rule__Castle__Group_3__0 ) ) );";
        }
    }
    static final String dfa_14s = "\23\uffff";
    static final String dfa_15s = "\2\36\6\56\2\4\1\61\1\63\2\4\1\57\2\64\2\uffff";
    static final String dfa_16s = "\1\60\1\43\6\62\2\4\1\61\1\63\2\4\1\57\2\73\2\uffff";
    static final String dfa_17s = "\21\uffff\1\1\1\2";
    static final String dfa_18s = "\23\uffff}>";
    static final String[] dfa_19s = {
            "\1\2\1\3\1\4\1\5\1\6\1\7\14\uffff\1\1",
            "\1\2\1\3\1\4\1\5\1\6\1\7",
            "\1\10\3\uffff\1\11",
            "\1\10\3\uffff\1\11",
            "\1\10\3\uffff\1\11",
            "\1\10\3\uffff\1\11",
            "\1\10\3\uffff\1\11",
            "\1\10\3\uffff\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\3\22\4\uffff\1\21",
            "\3\22\4\uffff\1\21",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1050:1: rule__Promotion__MoveAlternatives_0_0 : ( ( ruleMove ) | ( ruleCapture ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000002A000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000030100080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000030000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000030000082L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000040000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000200030000080L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000FC0000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0181000FC0022080L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0181000FC0002080L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000080000FE00000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000FE00002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001000FC0000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0070000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000000D0000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008884L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});

}