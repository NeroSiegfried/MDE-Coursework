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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_MOVENUMBER", "RULE_ID", "RULE_SAN_TOKEN", "RULE_SQUARETERMINAL", "RULE_ESCAPE", "RULE_LETTER", "RULE_RANKDIGIT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'fresh'", "'='", "'on'", "'...'", "'Kingside'", "'Queenside'", "'draw'", "'Good'", "'Bad'", "'Excellent'", "'Risky'", "'Dubious'", "'Check'", "'Checkmate'", "'White'", "'Black'", "'King'", "'Queen'", "'Rook'", "'Bishop'", "'Knight'", "'Pawn'", "'Game'", "'Moves:'", "'end'", "'Players:'", "':'", "'InitialState'", "'custom'", "'Positions:'", "'{'", "'}'", "'('", "')'", "'dummy'", "'moves'", "'->'", "'from'", "'to'", "'Capture('", "'and'", "'captures'", "'Castle('", "'castles'", "'the'", "'Promotion('", "'ran'", "'out'", "'of'", "'time'", "'resigned'", "'checkmated'", "'ended'", "'game'", "'in'", "'a'", "'stalemate'", "'repeated'", "'position'", "'three'", "'times'", "'played'", "'fifty'", "'without'", "'capture'", "'agreed'", "'wins'"
    };
    public static final int T__50=50;
    public static final int RULE_SAN_TOKEN=7;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int RULE_MOVENUMBER=5;
    public static final int T__56=56;
    public static final int RULE_RANKDIGIT=11;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ESCAPE=9;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=12;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=13;
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
    public static final int RULE_SL_COMMENT=14;
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
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_LETTER=10;
    public static final int RULE_SQUARETERMINAL=8;
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
    // InternalChessDSL.g:262:1: ruleAnyMove : ( ( rule__AnyMove__Alternatives ) ) ;
    public final void ruleAnyMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:266:2: ( ( ( rule__AnyMove__Alternatives ) ) )
            // InternalChessDSL.g:267:2: ( ( rule__AnyMove__Alternatives ) )
            {
            // InternalChessDSL.g:267:2: ( ( rule__AnyMove__Alternatives ) )
            // InternalChessDSL.g:268:3: ( rule__AnyMove__Alternatives )
            {
             before(grammarAccess.getAnyMoveAccess().getAlternatives()); 
            // InternalChessDSL.g:269:3: ( rule__AnyMove__Alternatives )
            // InternalChessDSL.g:269:4: rule__AnyMove__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AnyMove__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAnyMoveAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalChessDSL.g:312:1: ruleDummy : ( ( rule__Dummy__Group__0 ) ) ;
    public final void ruleDummy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:316:2: ( ( ( rule__Dummy__Group__0 ) ) )
            // InternalChessDSL.g:317:2: ( ( rule__Dummy__Group__0 ) )
            {
            // InternalChessDSL.g:317:2: ( ( rule__Dummy__Group__0 ) )
            // InternalChessDSL.g:318:3: ( rule__Dummy__Group__0 )
            {
             before(grammarAccess.getDummyAccess().getGroup()); 
            // InternalChessDSL.g:319:3: ( rule__Dummy__Group__0 )
            // InternalChessDSL.g:319:4: rule__Dummy__Group__0
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


    // $ANTLR start "entryRuleEscaped_SANMove"
    // InternalChessDSL.g:453:1: entryRuleEscaped_SANMove : ruleEscaped_SANMove EOF ;
    public final void entryRuleEscaped_SANMove() throws RecognitionException {
        try {
            // InternalChessDSL.g:454:1: ( ruleEscaped_SANMove EOF )
            // InternalChessDSL.g:455:1: ruleEscaped_SANMove EOF
            {
             before(grammarAccess.getEscaped_SANMoveRule()); 
            pushFollow(FOLLOW_1);
            ruleEscaped_SANMove();

            state._fsp--;

             after(grammarAccess.getEscaped_SANMoveRule()); 
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
    // $ANTLR end "entryRuleEscaped_SANMove"


    // $ANTLR start "ruleEscaped_SANMove"
    // InternalChessDSL.g:462:1: ruleEscaped_SANMove : ( ( rule__Escaped_SANMove__Group__0 ) ) ;
    public final void ruleEscaped_SANMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:466:2: ( ( ( rule__Escaped_SANMove__Group__0 ) ) )
            // InternalChessDSL.g:467:2: ( ( rule__Escaped_SANMove__Group__0 ) )
            {
            // InternalChessDSL.g:467:2: ( ( rule__Escaped_SANMove__Group__0 ) )
            // InternalChessDSL.g:468:3: ( rule__Escaped_SANMove__Group__0 )
            {
             before(grammarAccess.getEscaped_SANMoveAccess().getGroup()); 
            // InternalChessDSL.g:469:3: ( rule__Escaped_SANMove__Group__0 )
            // InternalChessDSL.g:469:4: rule__Escaped_SANMove__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Escaped_SANMove__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEscaped_SANMoveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEscaped_SANMove"


    // $ANTLR start "entryRuleConclusion"
    // InternalChessDSL.g:478:1: entryRuleConclusion : ruleConclusion EOF ;
    public final void entryRuleConclusion() throws RecognitionException {
        try {
            // InternalChessDSL.g:479:1: ( ruleConclusion EOF )
            // InternalChessDSL.g:480:1: ruleConclusion EOF
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
    // InternalChessDSL.g:487:1: ruleConclusion : ( ( rule__Conclusion__Group__0 ) ) ;
    public final void ruleConclusion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:491:2: ( ( ( rule__Conclusion__Group__0 ) ) )
            // InternalChessDSL.g:492:2: ( ( rule__Conclusion__Group__0 ) )
            {
            // InternalChessDSL.g:492:2: ( ( rule__Conclusion__Group__0 ) )
            // InternalChessDSL.g:493:3: ( rule__Conclusion__Group__0 )
            {
             before(grammarAccess.getConclusionAccess().getGroup()); 
            // InternalChessDSL.g:494:3: ( rule__Conclusion__Group__0 )
            // InternalChessDSL.g:494:4: rule__Conclusion__Group__0
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
    // InternalChessDSL.g:503:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalChessDSL.g:504:1: ( ruleMethod EOF )
            // InternalChessDSL.g:505:1: ruleMethod EOF
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
    // InternalChessDSL.g:512:1: ruleMethod : ( ( rule__Method__Alternatives ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:516:2: ( ( ( rule__Method__Alternatives ) ) )
            // InternalChessDSL.g:517:2: ( ( rule__Method__Alternatives ) )
            {
            // InternalChessDSL.g:517:2: ( ( rule__Method__Alternatives ) )
            // InternalChessDSL.g:518:3: ( rule__Method__Alternatives )
            {
             before(grammarAccess.getMethodAccess().getAlternatives()); 
            // InternalChessDSL.g:519:3: ( rule__Method__Alternatives )
            // InternalChessDSL.g:519:4: rule__Method__Alternatives
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
    // InternalChessDSL.g:528:1: entryRuleWin : ruleWin EOF ;
    public final void entryRuleWin() throws RecognitionException {
        try {
            // InternalChessDSL.g:529:1: ( ruleWin EOF )
            // InternalChessDSL.g:530:1: ruleWin EOF
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
    // InternalChessDSL.g:537:1: ruleWin : ( ( rule__Win__Alternatives ) ) ;
    public final void ruleWin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:541:2: ( ( ( rule__Win__Alternatives ) ) )
            // InternalChessDSL.g:542:2: ( ( rule__Win__Alternatives ) )
            {
            // InternalChessDSL.g:542:2: ( ( rule__Win__Alternatives ) )
            // InternalChessDSL.g:543:3: ( rule__Win__Alternatives )
            {
             before(grammarAccess.getWinAccess().getAlternatives()); 
            // InternalChessDSL.g:544:3: ( rule__Win__Alternatives )
            // InternalChessDSL.g:544:4: rule__Win__Alternatives
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
    // InternalChessDSL.g:553:1: entryRuleTimeUp : ruleTimeUp EOF ;
    public final void entryRuleTimeUp() throws RecognitionException {
        try {
            // InternalChessDSL.g:554:1: ( ruleTimeUp EOF )
            // InternalChessDSL.g:555:1: ruleTimeUp EOF
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
    // InternalChessDSL.g:562:1: ruleTimeUp : ( ( rule__TimeUp__Group__0 ) ) ;
    public final void ruleTimeUp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:566:2: ( ( ( rule__TimeUp__Group__0 ) ) )
            // InternalChessDSL.g:567:2: ( ( rule__TimeUp__Group__0 ) )
            {
            // InternalChessDSL.g:567:2: ( ( rule__TimeUp__Group__0 ) )
            // InternalChessDSL.g:568:3: ( rule__TimeUp__Group__0 )
            {
             before(grammarAccess.getTimeUpAccess().getGroup()); 
            // InternalChessDSL.g:569:3: ( rule__TimeUp__Group__0 )
            // InternalChessDSL.g:569:4: rule__TimeUp__Group__0
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
    // InternalChessDSL.g:578:1: entryRuleResign : ruleResign EOF ;
    public final void entryRuleResign() throws RecognitionException {
        try {
            // InternalChessDSL.g:579:1: ( ruleResign EOF )
            // InternalChessDSL.g:580:1: ruleResign EOF
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
    // InternalChessDSL.g:587:1: ruleResign : ( ( rule__Resign__Group__0 ) ) ;
    public final void ruleResign() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:591:2: ( ( ( rule__Resign__Group__0 ) ) )
            // InternalChessDSL.g:592:2: ( ( rule__Resign__Group__0 ) )
            {
            // InternalChessDSL.g:592:2: ( ( rule__Resign__Group__0 ) )
            // InternalChessDSL.g:593:3: ( rule__Resign__Group__0 )
            {
             before(grammarAccess.getResignAccess().getGroup()); 
            // InternalChessDSL.g:594:3: ( rule__Resign__Group__0 )
            // InternalChessDSL.g:594:4: rule__Resign__Group__0
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
    // InternalChessDSL.g:603:1: entryRuleCheckmate : ruleCheckmate EOF ;
    public final void entryRuleCheckmate() throws RecognitionException {
        try {
            // InternalChessDSL.g:604:1: ( ruleCheckmate EOF )
            // InternalChessDSL.g:605:1: ruleCheckmate EOF
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
    // InternalChessDSL.g:612:1: ruleCheckmate : ( ( rule__Checkmate__Group__0 ) ) ;
    public final void ruleCheckmate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:616:2: ( ( ( rule__Checkmate__Group__0 ) ) )
            // InternalChessDSL.g:617:2: ( ( rule__Checkmate__Group__0 ) )
            {
            // InternalChessDSL.g:617:2: ( ( rule__Checkmate__Group__0 ) )
            // InternalChessDSL.g:618:3: ( rule__Checkmate__Group__0 )
            {
             before(grammarAccess.getCheckmateAccess().getGroup()); 
            // InternalChessDSL.g:619:3: ( rule__Checkmate__Group__0 )
            // InternalChessDSL.g:619:4: rule__Checkmate__Group__0
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
    // InternalChessDSL.g:628:1: entryRuleDraw : ruleDraw EOF ;
    public final void entryRuleDraw() throws RecognitionException {
        try {
            // InternalChessDSL.g:629:1: ( ruleDraw EOF )
            // InternalChessDSL.g:630:1: ruleDraw EOF
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
    // InternalChessDSL.g:637:1: ruleDraw : ( ( rule__Draw__Group__0 ) ) ;
    public final void ruleDraw() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:641:2: ( ( ( rule__Draw__Group__0 ) ) )
            // InternalChessDSL.g:642:2: ( ( rule__Draw__Group__0 ) )
            {
            // InternalChessDSL.g:642:2: ( ( rule__Draw__Group__0 ) )
            // InternalChessDSL.g:643:3: ( rule__Draw__Group__0 )
            {
             before(grammarAccess.getDrawAccess().getGroup()); 
            // InternalChessDSL.g:644:3: ( rule__Draw__Group__0 )
            // InternalChessDSL.g:644:4: rule__Draw__Group__0
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
    // InternalChessDSL.g:653:1: entryRuleStalemate : ruleStalemate EOF ;
    public final void entryRuleStalemate() throws RecognitionException {
        try {
            // InternalChessDSL.g:654:1: ( ruleStalemate EOF )
            // InternalChessDSL.g:655:1: ruleStalemate EOF
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
    // InternalChessDSL.g:662:1: ruleStalemate : ( ( rule__Stalemate__Group__0 ) ) ;
    public final void ruleStalemate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:666:2: ( ( ( rule__Stalemate__Group__0 ) ) )
            // InternalChessDSL.g:667:2: ( ( rule__Stalemate__Group__0 ) )
            {
            // InternalChessDSL.g:667:2: ( ( rule__Stalemate__Group__0 ) )
            // InternalChessDSL.g:668:3: ( rule__Stalemate__Group__0 )
            {
             before(grammarAccess.getStalemateAccess().getGroup()); 
            // InternalChessDSL.g:669:3: ( rule__Stalemate__Group__0 )
            // InternalChessDSL.g:669:4: rule__Stalemate__Group__0
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
    // InternalChessDSL.g:678:1: entryRuleThreefold : ruleThreefold EOF ;
    public final void entryRuleThreefold() throws RecognitionException {
        try {
            // InternalChessDSL.g:679:1: ( ruleThreefold EOF )
            // InternalChessDSL.g:680:1: ruleThreefold EOF
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
    // InternalChessDSL.g:687:1: ruleThreefold : ( ( rule__Threefold__Group__0 ) ) ;
    public final void ruleThreefold() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:691:2: ( ( ( rule__Threefold__Group__0 ) ) )
            // InternalChessDSL.g:692:2: ( ( rule__Threefold__Group__0 ) )
            {
            // InternalChessDSL.g:692:2: ( ( rule__Threefold__Group__0 ) )
            // InternalChessDSL.g:693:3: ( rule__Threefold__Group__0 )
            {
             before(grammarAccess.getThreefoldAccess().getGroup()); 
            // InternalChessDSL.g:694:3: ( rule__Threefold__Group__0 )
            // InternalChessDSL.g:694:4: rule__Threefold__Group__0
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
    // InternalChessDSL.g:703:1: entryRuleFifty : ruleFifty EOF ;
    public final void entryRuleFifty() throws RecognitionException {
        try {
            // InternalChessDSL.g:704:1: ( ruleFifty EOF )
            // InternalChessDSL.g:705:1: ruleFifty EOF
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
    // InternalChessDSL.g:712:1: ruleFifty : ( ( rule__Fifty__Group__0 ) ) ;
    public final void ruleFifty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:716:2: ( ( ( rule__Fifty__Group__0 ) ) )
            // InternalChessDSL.g:717:2: ( ( rule__Fifty__Group__0 ) )
            {
            // InternalChessDSL.g:717:2: ( ( rule__Fifty__Group__0 ) )
            // InternalChessDSL.g:718:3: ( rule__Fifty__Group__0 )
            {
             before(grammarAccess.getFiftyAccess().getGroup()); 
            // InternalChessDSL.g:719:3: ( rule__Fifty__Group__0 )
            // InternalChessDSL.g:719:4: rule__Fifty__Group__0
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
    // InternalChessDSL.g:728:1: entryRuleAgree : ruleAgree EOF ;
    public final void entryRuleAgree() throws RecognitionException {
        try {
            // InternalChessDSL.g:729:1: ( ruleAgree EOF )
            // InternalChessDSL.g:730:1: ruleAgree EOF
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
    // InternalChessDSL.g:737:1: ruleAgree : ( ( rule__Agree__Group__0 ) ) ;
    public final void ruleAgree() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:741:2: ( ( ( rule__Agree__Group__0 ) ) )
            // InternalChessDSL.g:742:2: ( ( rule__Agree__Group__0 ) )
            {
            // InternalChessDSL.g:742:2: ( ( rule__Agree__Group__0 ) )
            // InternalChessDSL.g:743:3: ( rule__Agree__Group__0 )
            {
             before(grammarAccess.getAgreeAccess().getGroup()); 
            // InternalChessDSL.g:744:3: ( rule__Agree__Group__0 )
            // InternalChessDSL.g:744:4: rule__Agree__Group__0
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
    // InternalChessDSL.g:753:1: entryRuleResult : ruleResult EOF ;
    public final void entryRuleResult() throws RecognitionException {
        try {
            // InternalChessDSL.g:754:1: ( ruleResult EOF )
            // InternalChessDSL.g:755:1: ruleResult EOF
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
    // InternalChessDSL.g:762:1: ruleResult : ( ( rule__Result__Alternatives ) ) ;
    public final void ruleResult() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:766:2: ( ( ( rule__Result__Alternatives ) ) )
            // InternalChessDSL.g:767:2: ( ( rule__Result__Alternatives ) )
            {
            // InternalChessDSL.g:767:2: ( ( rule__Result__Alternatives ) )
            // InternalChessDSL.g:768:3: ( rule__Result__Alternatives )
            {
             before(grammarAccess.getResultAccess().getAlternatives()); 
            // InternalChessDSL.g:769:3: ( rule__Result__Alternatives )
            // InternalChessDSL.g:769:4: rule__Result__Alternatives
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
    // InternalChessDSL.g:778:1: entryRulePlayerOrColor : rulePlayerOrColor EOF ;
    public final void entryRulePlayerOrColor() throws RecognitionException {
        try {
            // InternalChessDSL.g:779:1: ( rulePlayerOrColor EOF )
            // InternalChessDSL.g:780:1: rulePlayerOrColor EOF
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
    // InternalChessDSL.g:787:1: rulePlayerOrColor : ( ( rule__PlayerOrColor__Alternatives ) ) ;
    public final void rulePlayerOrColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:791:2: ( ( ( rule__PlayerOrColor__Alternatives ) ) )
            // InternalChessDSL.g:792:2: ( ( rule__PlayerOrColor__Alternatives ) )
            {
            // InternalChessDSL.g:792:2: ( ( rule__PlayerOrColor__Alternatives ) )
            // InternalChessDSL.g:793:3: ( rule__PlayerOrColor__Alternatives )
            {
             before(grammarAccess.getPlayerOrColorAccess().getAlternatives()); 
            // InternalChessDSL.g:794:3: ( rule__PlayerOrColor__Alternatives )
            // InternalChessDSL.g:794:4: rule__PlayerOrColor__Alternatives
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
    // InternalChessDSL.g:803:1: entryRuleSquare : ruleSquare EOF ;
    public final void entryRuleSquare() throws RecognitionException {
        try {
            // InternalChessDSL.g:804:1: ( ruleSquare EOF )
            // InternalChessDSL.g:805:1: ruleSquare EOF
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
    // InternalChessDSL.g:812:1: ruleSquare : ( ( rule__Square__SquareAssignment ) ) ;
    public final void ruleSquare() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:816:2: ( ( ( rule__Square__SquareAssignment ) ) )
            // InternalChessDSL.g:817:2: ( ( rule__Square__SquareAssignment ) )
            {
            // InternalChessDSL.g:817:2: ( ( rule__Square__SquareAssignment ) )
            // InternalChessDSL.g:818:3: ( rule__Square__SquareAssignment )
            {
             before(grammarAccess.getSquareAccess().getSquareAssignment()); 
            // InternalChessDSL.g:819:3: ( rule__Square__SquareAssignment )
            // InternalChessDSL.g:819:4: rule__Square__SquareAssignment
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
    // InternalChessDSL.g:828:1: ruleRemark : ( ( rule__Remark__Alternatives ) ) ;
    public final void ruleRemark() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:832:1: ( ( ( rule__Remark__Alternatives ) ) )
            // InternalChessDSL.g:833:2: ( ( rule__Remark__Alternatives ) )
            {
            // InternalChessDSL.g:833:2: ( ( rule__Remark__Alternatives ) )
            // InternalChessDSL.g:834:3: ( rule__Remark__Alternatives )
            {
             before(grammarAccess.getRemarkAccess().getAlternatives()); 
            // InternalChessDSL.g:835:3: ( rule__Remark__Alternatives )
            // InternalChessDSL.g:835:4: rule__Remark__Alternatives
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
    // InternalChessDSL.g:844:1: ruleColor : ( ( rule__Color__Alternatives ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:848:1: ( ( ( rule__Color__Alternatives ) ) )
            // InternalChessDSL.g:849:2: ( ( rule__Color__Alternatives ) )
            {
            // InternalChessDSL.g:849:2: ( ( rule__Color__Alternatives ) )
            // InternalChessDSL.g:850:3: ( rule__Color__Alternatives )
            {
             before(grammarAccess.getColorAccess().getAlternatives()); 
            // InternalChessDSL.g:851:3: ( rule__Color__Alternatives )
            // InternalChessDSL.g:851:4: rule__Color__Alternatives
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
    // InternalChessDSL.g:860:1: rulePiece : ( ( rule__Piece__Alternatives ) ) ;
    public final void rulePiece() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:864:1: ( ( ( rule__Piece__Alternatives ) ) )
            // InternalChessDSL.g:865:2: ( ( rule__Piece__Alternatives ) )
            {
            // InternalChessDSL.g:865:2: ( ( rule__Piece__Alternatives ) )
            // InternalChessDSL.g:866:3: ( rule__Piece__Alternatives )
            {
             before(grammarAccess.getPieceAccess().getAlternatives()); 
            // InternalChessDSL.g:867:3: ( rule__Piece__Alternatives )
            // InternalChessDSL.g:867:4: rule__Piece__Alternatives
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
    // InternalChessDSL.g:875:1: rule__InitialState__Alternatives_2 : ( ( 'fresh' ) | ( ( rule__InitialState__Group_2_1__0 ) ) );
    public final void rule__InitialState__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:879:1: ( ( 'fresh' ) | ( ( rule__InitialState__Group_2_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            else if ( (LA1_0==45) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalChessDSL.g:880:2: ( 'fresh' )
                    {
                    // InternalChessDSL.g:880:2: ( 'fresh' )
                    // InternalChessDSL.g:881:3: 'fresh'
                    {
                     before(grammarAccess.getInitialStateAccess().getFreshKeyword_2_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getInitialStateAccess().getFreshKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:886:2: ( ( rule__InitialState__Group_2_1__0 ) )
                    {
                    // InternalChessDSL.g:886:2: ( ( rule__InitialState__Group_2_1__0 ) )
                    // InternalChessDSL.g:887:3: ( rule__InitialState__Group_2_1__0 )
                    {
                     before(grammarAccess.getInitialStateAccess().getGroup_2_1()); 
                    // InternalChessDSL.g:888:3: ( rule__InitialState__Group_2_1__0 )
                    // InternalChessDSL.g:888:4: rule__InitialState__Group_2_1__0
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
    // InternalChessDSL.g:896:1: rule__Placement__Alternatives_1 : ( ( '=' ) | ( 'on' ) );
    public final void rule__Placement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:900:1: ( ( '=' ) | ( 'on' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            else if ( (LA2_0==19) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalChessDSL.g:901:2: ( '=' )
                    {
                    // InternalChessDSL.g:901:2: ( '=' )
                    // InternalChessDSL.g:902:3: '='
                    {
                     before(grammarAccess.getPlacementAccess().getEqualsSignKeyword_1_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getPlacementAccess().getEqualsSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:907:2: ( 'on' )
                    {
                    // InternalChessDSL.g:907:2: ( 'on' )
                    // InternalChessDSL.g:908:3: 'on'
                    {
                     before(grammarAccess.getPlacementAccess().getOnKeyword_1_1()); 
                    match(input,19,FOLLOW_2); 
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
    // InternalChessDSL.g:917:1: rule__MovePair__Alternatives_1 : ( ( ( rule__MovePair__Group_1_0__0 ) ) | ( '...' ) );
    public final void rule__MovePair__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:921:1: ( ( ( rule__MovePair__Group_1_0__0 ) ) | ( '...' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_SAN_TOKEN)||(LA3_0>=33 && LA3_0<=38)||(LA3_0>=51 && LA3_0<=52)||(LA3_0>=59 && LA3_0<=60)) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalChessDSL.g:922:2: ( ( rule__MovePair__Group_1_0__0 ) )
                    {
                    // InternalChessDSL.g:922:2: ( ( rule__MovePair__Group_1_0__0 ) )
                    // InternalChessDSL.g:923:3: ( rule__MovePair__Group_1_0__0 )
                    {
                     before(grammarAccess.getMovePairAccess().getGroup_1_0()); 
                    // InternalChessDSL.g:924:3: ( rule__MovePair__Group_1_0__0 )
                    // InternalChessDSL.g:924:4: rule__MovePair__Group_1_0__0
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
                    // InternalChessDSL.g:928:2: ( '...' )
                    {
                    // InternalChessDSL.g:928:2: ( '...' )
                    // InternalChessDSL.g:929:3: '...'
                    {
                     before(grammarAccess.getMovePairAccess().getFullStopFullStopFullStopKeyword_1_1()); 
                    match(input,20,FOLLOW_2); 
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


    // $ANTLR start "rule__AnyMove__Alternatives"
    // InternalChessDSL.g:938:1: rule__AnyMove__Alternatives : ( ( ( rule__AnyMove__AlgebraicmoveAssignment_0 ) ) | ( ( rule__AnyMove__Group_1__0 ) ) );
    public final void rule__AnyMove__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:942:1: ( ( ( rule__AnyMove__AlgebraicmoveAssignment_0 ) ) | ( ( rule__AnyMove__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_SAN_TOKEN) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=33 && LA4_0<=38)||(LA4_0>=51 && LA4_0<=52)||(LA4_0>=59 && LA4_0<=60)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalChessDSL.g:943:2: ( ( rule__AnyMove__AlgebraicmoveAssignment_0 ) )
                    {
                    // InternalChessDSL.g:943:2: ( ( rule__AnyMove__AlgebraicmoveAssignment_0 ) )
                    // InternalChessDSL.g:944:3: ( rule__AnyMove__AlgebraicmoveAssignment_0 )
                    {
                     before(grammarAccess.getAnyMoveAccess().getAlgebraicmoveAssignment_0()); 
                    // InternalChessDSL.g:945:3: ( rule__AnyMove__AlgebraicmoveAssignment_0 )
                    // InternalChessDSL.g:945:4: rule__AnyMove__AlgebraicmoveAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AnyMove__AlgebraicmoveAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAnyMoveAccess().getAlgebraicmoveAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:949:2: ( ( rule__AnyMove__Group_1__0 ) )
                    {
                    // InternalChessDSL.g:949:2: ( ( rule__AnyMove__Group_1__0 ) )
                    // InternalChessDSL.g:950:3: ( rule__AnyMove__Group_1__0 )
                    {
                     before(grammarAccess.getAnyMoveAccess().getGroup_1()); 
                    // InternalChessDSL.g:951:3: ( rule__AnyMove__Group_1__0 )
                    // InternalChessDSL.g:951:4: rule__AnyMove__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AnyMove__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAnyMoveAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AnyMove__Alternatives"


    // $ANTLR start "rule__DSLMove__Alternatives"
    // InternalChessDSL.g:959:1: rule__DSLMove__Alternatives : ( ( ruleMove ) | ( ruleCapture ) | ( ruleCastle ) | ( ruleEnPassant ) | ( rulePromotion ) | ( ruleDummy ) );
    public final void rule__DSLMove__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:963:1: ( ( ruleMove ) | ( ruleCapture ) | ( ruleCastle ) | ( ruleEnPassant ) | ( rulePromotion ) | ( ruleDummy ) )
            int alt5=6;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalChessDSL.g:964:2: ( ruleMove )
                    {
                    // InternalChessDSL.g:964:2: ( ruleMove )
                    // InternalChessDSL.g:965:3: ruleMove
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
                    // InternalChessDSL.g:970:2: ( ruleCapture )
                    {
                    // InternalChessDSL.g:970:2: ( ruleCapture )
                    // InternalChessDSL.g:971:3: ruleCapture
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
                    // InternalChessDSL.g:976:2: ( ruleCastle )
                    {
                    // InternalChessDSL.g:976:2: ( ruleCastle )
                    // InternalChessDSL.g:977:3: ruleCastle
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
                    // InternalChessDSL.g:982:2: ( ruleEnPassant )
                    {
                    // InternalChessDSL.g:982:2: ( ruleEnPassant )
                    // InternalChessDSL.g:983:3: ruleEnPassant
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
                    // InternalChessDSL.g:988:2: ( rulePromotion )
                    {
                    // InternalChessDSL.g:988:2: ( rulePromotion )
                    // InternalChessDSL.g:989:3: rulePromotion
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
                    // InternalChessDSL.g:994:2: ( ruleDummy )
                    {
                    // InternalChessDSL.g:994:2: ( ruleDummy )
                    // InternalChessDSL.g:995:3: ruleDummy
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
    // InternalChessDSL.g:1004:1: rule__Move__Alternatives_2 : ( ( ( rule__Move__Group_2_0__0 ) ) | ( ( rule__Move__Group_2_1__0 ) ) );
    public final void rule__Move__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1008:1: ( ( ( rule__Move__Group_2_0__0 ) ) | ( ( rule__Move__Group_2_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==49) ) {
                alt6=1;
            }
            else if ( (LA6_0==54) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalChessDSL.g:1009:2: ( ( rule__Move__Group_2_0__0 ) )
                    {
                    // InternalChessDSL.g:1009:2: ( ( rule__Move__Group_2_0__0 ) )
                    // InternalChessDSL.g:1010:3: ( rule__Move__Group_2_0__0 )
                    {
                     before(grammarAccess.getMoveAccess().getGroup_2_0()); 
                    // InternalChessDSL.g:1011:3: ( rule__Move__Group_2_0__0 )
                    // InternalChessDSL.g:1011:4: rule__Move__Group_2_0__0
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
                    // InternalChessDSL.g:1015:2: ( ( rule__Move__Group_2_1__0 ) )
                    {
                    // InternalChessDSL.g:1015:2: ( ( rule__Move__Group_2_1__0 ) )
                    // InternalChessDSL.g:1016:3: ( rule__Move__Group_2_1__0 )
                    {
                     before(grammarAccess.getMoveAccess().getGroup_2_1()); 
                    // InternalChessDSL.g:1017:3: ( rule__Move__Group_2_1__0 )
                    // InternalChessDSL.g:1017:4: rule__Move__Group_2_1__0
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
    // InternalChessDSL.g:1025:1: rule__Capture__Alternatives_1 : ( ( ( rule__Capture__Group_1_0__0 ) ) | ( ( rule__Capture__Group_1_1__0 ) ) );
    public final void rule__Capture__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1029:1: ( ( ( rule__Capture__Group_1_0__0 ) ) | ( ( rule__Capture__Group_1_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==56) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=57 && LA7_0<=58)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalChessDSL.g:1030:2: ( ( rule__Capture__Group_1_0__0 ) )
                    {
                    // InternalChessDSL.g:1030:2: ( ( rule__Capture__Group_1_0__0 ) )
                    // InternalChessDSL.g:1031:3: ( rule__Capture__Group_1_0__0 )
                    {
                     before(grammarAccess.getCaptureAccess().getGroup_1_0()); 
                    // InternalChessDSL.g:1032:3: ( rule__Capture__Group_1_0__0 )
                    // InternalChessDSL.g:1032:4: rule__Capture__Group_1_0__0
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
                    // InternalChessDSL.g:1036:2: ( ( rule__Capture__Group_1_1__0 ) )
                    {
                    // InternalChessDSL.g:1036:2: ( ( rule__Capture__Group_1_1__0 ) )
                    // InternalChessDSL.g:1037:3: ( rule__Capture__Group_1_1__0 )
                    {
                     before(grammarAccess.getCaptureAccess().getGroup_1_1()); 
                    // InternalChessDSL.g:1038:3: ( rule__Capture__Group_1_1__0 )
                    // InternalChessDSL.g:1038:4: rule__Capture__Group_1_1__0
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
    // InternalChessDSL.g:1046:1: rule__Castle__Alternatives : ( ( ( rule__Castle__Group_0__0 ) ) | ( ( rule__Castle__Group_1__0 ) ) | ( ( rule__Castle__Group_2__0 ) ) | ( ( rule__Castle__Group_3__0 ) ) );
    public final void rule__Castle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1050:1: ( ( ( rule__Castle__Group_0__0 ) ) | ( ( rule__Castle__Group_1__0 ) ) | ( ( rule__Castle__Group_2__0 ) ) | ( ( rule__Castle__Group_3__0 ) ) )
            int alt8=4;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalChessDSL.g:1051:2: ( ( rule__Castle__Group_0__0 ) )
                    {
                    // InternalChessDSL.g:1051:2: ( ( rule__Castle__Group_0__0 ) )
                    // InternalChessDSL.g:1052:3: ( rule__Castle__Group_0__0 )
                    {
                     before(grammarAccess.getCastleAccess().getGroup_0()); 
                    // InternalChessDSL.g:1053:3: ( rule__Castle__Group_0__0 )
                    // InternalChessDSL.g:1053:4: rule__Castle__Group_0__0
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
                    // InternalChessDSL.g:1057:2: ( ( rule__Castle__Group_1__0 ) )
                    {
                    // InternalChessDSL.g:1057:2: ( ( rule__Castle__Group_1__0 ) )
                    // InternalChessDSL.g:1058:3: ( rule__Castle__Group_1__0 )
                    {
                     before(grammarAccess.getCastleAccess().getGroup_1()); 
                    // InternalChessDSL.g:1059:3: ( rule__Castle__Group_1__0 )
                    // InternalChessDSL.g:1059:4: rule__Castle__Group_1__0
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
                    // InternalChessDSL.g:1063:2: ( ( rule__Castle__Group_2__0 ) )
                    {
                    // InternalChessDSL.g:1063:2: ( ( rule__Castle__Group_2__0 ) )
                    // InternalChessDSL.g:1064:3: ( rule__Castle__Group_2__0 )
                    {
                     before(grammarAccess.getCastleAccess().getGroup_2()); 
                    // InternalChessDSL.g:1065:3: ( rule__Castle__Group_2__0 )
                    // InternalChessDSL.g:1065:4: rule__Castle__Group_2__0
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
                    // InternalChessDSL.g:1069:2: ( ( rule__Castle__Group_3__0 ) )
                    {
                    // InternalChessDSL.g:1069:2: ( ( rule__Castle__Group_3__0 ) )
                    // InternalChessDSL.g:1070:3: ( rule__Castle__Group_3__0 )
                    {
                     before(grammarAccess.getCastleAccess().getGroup_3()); 
                    // InternalChessDSL.g:1071:3: ( rule__Castle__Group_3__0 )
                    // InternalChessDSL.g:1071:4: rule__Castle__Group_3__0
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
    // InternalChessDSL.g:1079:1: rule__Castle__SideAlternatives_0_1_0 : ( ( 'Kingside' ) | ( 'Queenside' ) );
    public final void rule__Castle__SideAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1083:1: ( ( 'Kingside' ) | ( 'Queenside' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalChessDSL.g:1084:2: ( 'Kingside' )
                    {
                    // InternalChessDSL.g:1084:2: ( 'Kingside' )
                    // InternalChessDSL.g:1085:3: 'Kingside'
                    {
                     before(grammarAccess.getCastleAccess().getSideKingsideKeyword_0_1_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getCastleAccess().getSideKingsideKeyword_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1090:2: ( 'Queenside' )
                    {
                    // InternalChessDSL.g:1090:2: ( 'Queenside' )
                    // InternalChessDSL.g:1091:3: 'Queenside'
                    {
                     before(grammarAccess.getCastleAccess().getSideQueensideKeyword_0_1_0_1()); 
                    match(input,22,FOLLOW_2); 
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
    // InternalChessDSL.g:1100:1: rule__Castle__SideAlternatives_1_2_0 : ( ( 'Kingside' ) | ( 'Queenside' ) );
    public final void rule__Castle__SideAlternatives_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1104:1: ( ( 'Kingside' ) | ( 'Queenside' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            else if ( (LA10_0==22) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalChessDSL.g:1105:2: ( 'Kingside' )
                    {
                    // InternalChessDSL.g:1105:2: ( 'Kingside' )
                    // InternalChessDSL.g:1106:3: 'Kingside'
                    {
                     before(grammarAccess.getCastleAccess().getSideKingsideKeyword_1_2_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getCastleAccess().getSideKingsideKeyword_1_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1111:2: ( 'Queenside' )
                    {
                    // InternalChessDSL.g:1111:2: ( 'Queenside' )
                    // InternalChessDSL.g:1112:3: 'Queenside'
                    {
                     before(grammarAccess.getCastleAccess().getSideQueensideKeyword_1_2_0_1()); 
                    match(input,22,FOLLOW_2); 
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
    // InternalChessDSL.g:1121:1: rule__Castle__SideAlternatives_2_2_0 : ( ( 'Kingside' ) | ( 'Queenside' ) );
    public final void rule__Castle__SideAlternatives_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1125:1: ( ( 'Kingside' ) | ( 'Queenside' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            else if ( (LA11_0==22) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalChessDSL.g:1126:2: ( 'Kingside' )
                    {
                    // InternalChessDSL.g:1126:2: ( 'Kingside' )
                    // InternalChessDSL.g:1127:3: 'Kingside'
                    {
                     before(grammarAccess.getCastleAccess().getSideKingsideKeyword_2_2_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getCastleAccess().getSideKingsideKeyword_2_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1132:2: ( 'Queenside' )
                    {
                    // InternalChessDSL.g:1132:2: ( 'Queenside' )
                    // InternalChessDSL.g:1133:3: 'Queenside'
                    {
                     before(grammarAccess.getCastleAccess().getSideQueensideKeyword_2_2_0_1()); 
                    match(input,22,FOLLOW_2); 
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
    // InternalChessDSL.g:1142:1: rule__Castle__SideAlternatives_3_3_0 : ( ( 'Kingside' ) | ( 'Queenside' ) );
    public final void rule__Castle__SideAlternatives_3_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1146:1: ( ( 'Kingside' ) | ( 'Queenside' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            else if ( (LA12_0==22) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalChessDSL.g:1147:2: ( 'Kingside' )
                    {
                    // InternalChessDSL.g:1147:2: ( 'Kingside' )
                    // InternalChessDSL.g:1148:3: 'Kingside'
                    {
                     before(grammarAccess.getCastleAccess().getSideKingsideKeyword_3_3_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getCastleAccess().getSideKingsideKeyword_3_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1153:2: ( 'Queenside' )
                    {
                    // InternalChessDSL.g:1153:2: ( 'Queenside' )
                    // InternalChessDSL.g:1154:3: 'Queenside'
                    {
                     before(grammarAccess.getCastleAccess().getSideQueensideKeyword_3_3_0_1()); 
                    match(input,22,FOLLOW_2); 
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
    // InternalChessDSL.g:1163:1: rule__Promotion__MoveAlternatives_0_0 : ( ( ruleMove ) | ( ruleCapture ) );
    public final void rule__Promotion__MoveAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1167:1: ( ( ruleMove ) | ( ruleCapture ) )
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalChessDSL.g:1168:2: ( ruleMove )
                    {
                    // InternalChessDSL.g:1168:2: ( ruleMove )
                    // InternalChessDSL.g:1169:3: ruleMove
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
                    // InternalChessDSL.g:1174:2: ( ruleCapture )
                    {
                    // InternalChessDSL.g:1174:2: ( ruleCapture )
                    // InternalChessDSL.g:1175:3: ruleCapture
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
    // InternalChessDSL.g:1184:1: rule__Method__Alternatives : ( ( ( rule__Method__WinAssignment_0 ) ) | ( ( rule__Method__DrawAssignment_1 ) ) );
    public final void rule__Method__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1188:1: ( ( ( rule__Method__WinAssignment_0 ) ) | ( ( rule__Method__DrawAssignment_1 ) ) )
            int alt14=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==57) ) {
                    alt14=2;
                }
                else if ( (LA14_1==63||(LA14_1>=67 && LA14_1<=68)) ) {
                    alt14=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
                }
                break;
            case 31:
                {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==57) ) {
                    alt14=2;
                }
                else if ( (LA14_2==63||(LA14_2>=67 && LA14_2<=68)) ) {
                    alt14=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;
                }
                }
                break;
            case 32:
                {
                int LA14_3 = input.LA(2);

                if ( (LA14_3==63||(LA14_3>=67 && LA14_3<=68)) ) {
                    alt14=1;
                }
                else if ( (LA14_3==57) ) {
                    alt14=2;
                }
                else {
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
                    // InternalChessDSL.g:1189:2: ( ( rule__Method__WinAssignment_0 ) )
                    {
                    // InternalChessDSL.g:1189:2: ( ( rule__Method__WinAssignment_0 ) )
                    // InternalChessDSL.g:1190:3: ( rule__Method__WinAssignment_0 )
                    {
                     before(grammarAccess.getMethodAccess().getWinAssignment_0()); 
                    // InternalChessDSL.g:1191:3: ( rule__Method__WinAssignment_0 )
                    // InternalChessDSL.g:1191:4: rule__Method__WinAssignment_0
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
                    // InternalChessDSL.g:1195:2: ( ( rule__Method__DrawAssignment_1 ) )
                    {
                    // InternalChessDSL.g:1195:2: ( ( rule__Method__DrawAssignment_1 ) )
                    // InternalChessDSL.g:1196:3: ( rule__Method__DrawAssignment_1 )
                    {
                     before(grammarAccess.getMethodAccess().getDrawAssignment_1()); 
                    // InternalChessDSL.g:1197:3: ( rule__Method__DrawAssignment_1 )
                    // InternalChessDSL.g:1197:4: rule__Method__DrawAssignment_1
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
    // InternalChessDSL.g:1205:1: rule__Win__Alternatives : ( ( ( rule__Win__TimeAssignment_0 ) ) | ( ( rule__Win__ResignAssignment_1 ) ) | ( ( rule__Win__MateAssignment_2 ) ) );
    public final void rule__Win__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1209:1: ( ( ( rule__Win__TimeAssignment_0 ) ) | ( ( rule__Win__ResignAssignment_1 ) ) | ( ( rule__Win__MateAssignment_2 ) ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 68:
                    {
                    alt15=3;
                    }
                    break;
                case 67:
                    {
                    alt15=2;
                    }
                    break;
                case 63:
                    {
                    alt15=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }

                }
                break;
            case 31:
                {
                switch ( input.LA(2) ) {
                case 68:
                    {
                    alt15=3;
                    }
                    break;
                case 67:
                    {
                    alt15=2;
                    }
                    break;
                case 63:
                    {
                    alt15=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }

                }
                break;
            case 32:
                {
                switch ( input.LA(2) ) {
                case 63:
                    {
                    alt15=1;
                    }
                    break;
                case 68:
                    {
                    alt15=3;
                    }
                    break;
                case 67:
                    {
                    alt15=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalChessDSL.g:1210:2: ( ( rule__Win__TimeAssignment_0 ) )
                    {
                    // InternalChessDSL.g:1210:2: ( ( rule__Win__TimeAssignment_0 ) )
                    // InternalChessDSL.g:1211:3: ( rule__Win__TimeAssignment_0 )
                    {
                     before(grammarAccess.getWinAccess().getTimeAssignment_0()); 
                    // InternalChessDSL.g:1212:3: ( rule__Win__TimeAssignment_0 )
                    // InternalChessDSL.g:1212:4: rule__Win__TimeAssignment_0
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
                    // InternalChessDSL.g:1216:2: ( ( rule__Win__ResignAssignment_1 ) )
                    {
                    // InternalChessDSL.g:1216:2: ( ( rule__Win__ResignAssignment_1 ) )
                    // InternalChessDSL.g:1217:3: ( rule__Win__ResignAssignment_1 )
                    {
                     before(grammarAccess.getWinAccess().getResignAssignment_1()); 
                    // InternalChessDSL.g:1218:3: ( rule__Win__ResignAssignment_1 )
                    // InternalChessDSL.g:1218:4: rule__Win__ResignAssignment_1
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
                    // InternalChessDSL.g:1222:2: ( ( rule__Win__MateAssignment_2 ) )
                    {
                    // InternalChessDSL.g:1222:2: ( ( rule__Win__MateAssignment_2 ) )
                    // InternalChessDSL.g:1223:3: ( rule__Win__MateAssignment_2 )
                    {
                     before(grammarAccess.getWinAccess().getMateAssignment_2()); 
                    // InternalChessDSL.g:1224:3: ( rule__Win__MateAssignment_2 )
                    // InternalChessDSL.g:1224:4: rule__Win__MateAssignment_2
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
    // InternalChessDSL.g:1232:1: rule__Draw__ResultAlternatives_3_0 : ( ( ruleStalemate ) | ( ruleThreefold ) | ( ruleFifty ) | ( ruleAgree ) );
    public final void rule__Draw__ResultAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1236:1: ( ( ruleStalemate ) | ( ruleThreefold ) | ( ruleFifty ) | ( ruleAgree ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt16=1;
                }
                break;
            case 74:
                {
                alt16=2;
                }
                break;
            case 78:
                {
                alt16=3;
                }
                break;
            case 82:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalChessDSL.g:1237:2: ( ruleStalemate )
                    {
                    // InternalChessDSL.g:1237:2: ( ruleStalemate )
                    // InternalChessDSL.g:1238:3: ruleStalemate
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
                    // InternalChessDSL.g:1243:2: ( ruleThreefold )
                    {
                    // InternalChessDSL.g:1243:2: ( ruleThreefold )
                    // InternalChessDSL.g:1244:3: ruleThreefold
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
                    // InternalChessDSL.g:1249:2: ( ruleFifty )
                    {
                    // InternalChessDSL.g:1249:2: ( ruleFifty )
                    // InternalChessDSL.g:1250:3: ruleFifty
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
                    // InternalChessDSL.g:1255:2: ( ruleAgree )
                    {
                    // InternalChessDSL.g:1255:2: ( ruleAgree )
                    // InternalChessDSL.g:1256:3: ruleAgree
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
    // InternalChessDSL.g:1265:1: rule__Result__Alternatives : ( ( ( rule__Result__Group_0__0 ) ) | ( 'draw' ) );
    public final void rule__Result__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1269:1: ( ( ( rule__Result__Group_0__0 ) ) | ( 'draw' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID||(LA17_0>=31 && LA17_0<=32)) ) {
                alt17=1;
            }
            else if ( (LA17_0==23) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalChessDSL.g:1270:2: ( ( rule__Result__Group_0__0 ) )
                    {
                    // InternalChessDSL.g:1270:2: ( ( rule__Result__Group_0__0 ) )
                    // InternalChessDSL.g:1271:3: ( rule__Result__Group_0__0 )
                    {
                     before(grammarAccess.getResultAccess().getGroup_0()); 
                    // InternalChessDSL.g:1272:3: ( rule__Result__Group_0__0 )
                    // InternalChessDSL.g:1272:4: rule__Result__Group_0__0
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
                    // InternalChessDSL.g:1276:2: ( 'draw' )
                    {
                    // InternalChessDSL.g:1276:2: ( 'draw' )
                    // InternalChessDSL.g:1277:3: 'draw'
                    {
                     before(grammarAccess.getResultAccess().getDrawKeyword_1()); 
                    match(input,23,FOLLOW_2); 
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
    // InternalChessDSL.g:1286:1: rule__Result__Alternatives_0_0 : ( ( ( rule__Result__PlayerAssignment_0_0_0 ) ) | ( ( rule__Result__ColorAssignment_0_0_1 ) ) );
    public final void rule__Result__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1290:1: ( ( ( rule__Result__PlayerAssignment_0_0_0 ) ) | ( ( rule__Result__ColorAssignment_0_0_1 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=31 && LA18_0<=32)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalChessDSL.g:1291:2: ( ( rule__Result__PlayerAssignment_0_0_0 ) )
                    {
                    // InternalChessDSL.g:1291:2: ( ( rule__Result__PlayerAssignment_0_0_0 ) )
                    // InternalChessDSL.g:1292:3: ( rule__Result__PlayerAssignment_0_0_0 )
                    {
                     before(grammarAccess.getResultAccess().getPlayerAssignment_0_0_0()); 
                    // InternalChessDSL.g:1293:3: ( rule__Result__PlayerAssignment_0_0_0 )
                    // InternalChessDSL.g:1293:4: rule__Result__PlayerAssignment_0_0_0
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
                    // InternalChessDSL.g:1297:2: ( ( rule__Result__ColorAssignment_0_0_1 ) )
                    {
                    // InternalChessDSL.g:1297:2: ( ( rule__Result__ColorAssignment_0_0_1 ) )
                    // InternalChessDSL.g:1298:3: ( rule__Result__ColorAssignment_0_0_1 )
                    {
                     before(grammarAccess.getResultAccess().getColorAssignment_0_0_1()); 
                    // InternalChessDSL.g:1299:3: ( rule__Result__ColorAssignment_0_0_1 )
                    // InternalChessDSL.g:1299:4: rule__Result__ColorAssignment_0_0_1
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
    // InternalChessDSL.g:1307:1: rule__PlayerOrColor__Alternatives : ( ( ( rule__PlayerOrColor__PlayerAssignment_0 ) ) | ( ( rule__PlayerOrColor__ColorAssignment_1 ) ) );
    public final void rule__PlayerOrColor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1311:1: ( ( ( rule__PlayerOrColor__PlayerAssignment_0 ) ) | ( ( rule__PlayerOrColor__ColorAssignment_1 ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=31 && LA19_0<=32)) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalChessDSL.g:1312:2: ( ( rule__PlayerOrColor__PlayerAssignment_0 ) )
                    {
                    // InternalChessDSL.g:1312:2: ( ( rule__PlayerOrColor__PlayerAssignment_0 ) )
                    // InternalChessDSL.g:1313:3: ( rule__PlayerOrColor__PlayerAssignment_0 )
                    {
                     before(grammarAccess.getPlayerOrColorAccess().getPlayerAssignment_0()); 
                    // InternalChessDSL.g:1314:3: ( rule__PlayerOrColor__PlayerAssignment_0 )
                    // InternalChessDSL.g:1314:4: rule__PlayerOrColor__PlayerAssignment_0
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
                    // InternalChessDSL.g:1318:2: ( ( rule__PlayerOrColor__ColorAssignment_1 ) )
                    {
                    // InternalChessDSL.g:1318:2: ( ( rule__PlayerOrColor__ColorAssignment_1 ) )
                    // InternalChessDSL.g:1319:3: ( rule__PlayerOrColor__ColorAssignment_1 )
                    {
                     before(grammarAccess.getPlayerOrColorAccess().getColorAssignment_1()); 
                    // InternalChessDSL.g:1320:3: ( rule__PlayerOrColor__ColorAssignment_1 )
                    // InternalChessDSL.g:1320:4: rule__PlayerOrColor__ColorAssignment_1
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
    // InternalChessDSL.g:1328:1: rule__Remark__Alternatives : ( ( ( 'Good' ) ) | ( ( 'Bad' ) ) | ( ( 'Excellent' ) ) | ( ( 'Risky' ) ) | ( ( 'Dubious' ) ) | ( ( 'Check' ) ) | ( ( 'Checkmate' ) ) );
    public final void rule__Remark__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1332:1: ( ( ( 'Good' ) ) | ( ( 'Bad' ) ) | ( ( 'Excellent' ) ) | ( ( 'Risky' ) ) | ( ( 'Dubious' ) ) | ( ( 'Check' ) ) | ( ( 'Checkmate' ) ) )
            int alt20=7;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt20=1;
                }
                break;
            case 25:
                {
                alt20=2;
                }
                break;
            case 26:
                {
                alt20=3;
                }
                break;
            case 27:
                {
                alt20=4;
                }
                break;
            case 28:
                {
                alt20=5;
                }
                break;
            case 29:
                {
                alt20=6;
                }
                break;
            case 30:
                {
                alt20=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalChessDSL.g:1333:2: ( ( 'Good' ) )
                    {
                    // InternalChessDSL.g:1333:2: ( ( 'Good' ) )
                    // InternalChessDSL.g:1334:3: ( 'Good' )
                    {
                     before(grammarAccess.getRemarkAccess().getGoodEnumLiteralDeclaration_0()); 
                    // InternalChessDSL.g:1335:3: ( 'Good' )
                    // InternalChessDSL.g:1335:4: 'Good'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getRemarkAccess().getGoodEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1339:2: ( ( 'Bad' ) )
                    {
                    // InternalChessDSL.g:1339:2: ( ( 'Bad' ) )
                    // InternalChessDSL.g:1340:3: ( 'Bad' )
                    {
                     before(grammarAccess.getRemarkAccess().getBadEnumLiteralDeclaration_1()); 
                    // InternalChessDSL.g:1341:3: ( 'Bad' )
                    // InternalChessDSL.g:1341:4: 'Bad'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getRemarkAccess().getBadEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalChessDSL.g:1345:2: ( ( 'Excellent' ) )
                    {
                    // InternalChessDSL.g:1345:2: ( ( 'Excellent' ) )
                    // InternalChessDSL.g:1346:3: ( 'Excellent' )
                    {
                     before(grammarAccess.getRemarkAccess().getExcellentEnumLiteralDeclaration_2()); 
                    // InternalChessDSL.g:1347:3: ( 'Excellent' )
                    // InternalChessDSL.g:1347:4: 'Excellent'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getRemarkAccess().getExcellentEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalChessDSL.g:1351:2: ( ( 'Risky' ) )
                    {
                    // InternalChessDSL.g:1351:2: ( ( 'Risky' ) )
                    // InternalChessDSL.g:1352:3: ( 'Risky' )
                    {
                     before(grammarAccess.getRemarkAccess().getRiskyEnumLiteralDeclaration_3()); 
                    // InternalChessDSL.g:1353:3: ( 'Risky' )
                    // InternalChessDSL.g:1353:4: 'Risky'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getRemarkAccess().getRiskyEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalChessDSL.g:1357:2: ( ( 'Dubious' ) )
                    {
                    // InternalChessDSL.g:1357:2: ( ( 'Dubious' ) )
                    // InternalChessDSL.g:1358:3: ( 'Dubious' )
                    {
                     before(grammarAccess.getRemarkAccess().getDubiousEnumLiteralDeclaration_4()); 
                    // InternalChessDSL.g:1359:3: ( 'Dubious' )
                    // InternalChessDSL.g:1359:4: 'Dubious'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getRemarkAccess().getDubiousEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalChessDSL.g:1363:2: ( ( 'Check' ) )
                    {
                    // InternalChessDSL.g:1363:2: ( ( 'Check' ) )
                    // InternalChessDSL.g:1364:3: ( 'Check' )
                    {
                     before(grammarAccess.getRemarkAccess().getCheckEnumLiteralDeclaration_5()); 
                    // InternalChessDSL.g:1365:3: ( 'Check' )
                    // InternalChessDSL.g:1365:4: 'Check'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getRemarkAccess().getCheckEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalChessDSL.g:1369:2: ( ( 'Checkmate' ) )
                    {
                    // InternalChessDSL.g:1369:2: ( ( 'Checkmate' ) )
                    // InternalChessDSL.g:1370:3: ( 'Checkmate' )
                    {
                     before(grammarAccess.getRemarkAccess().getCheckmateEnumLiteralDeclaration_6()); 
                    // InternalChessDSL.g:1371:3: ( 'Checkmate' )
                    // InternalChessDSL.g:1371:4: 'Checkmate'
                    {
                    match(input,30,FOLLOW_2); 

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
    // InternalChessDSL.g:1379:1: rule__Color__Alternatives : ( ( ( 'White' ) ) | ( ( 'Black' ) ) );
    public final void rule__Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1383:1: ( ( ( 'White' ) ) | ( ( 'Black' ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            else if ( (LA21_0==32) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalChessDSL.g:1384:2: ( ( 'White' ) )
                    {
                    // InternalChessDSL.g:1384:2: ( ( 'White' ) )
                    // InternalChessDSL.g:1385:3: ( 'White' )
                    {
                     before(grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_0()); 
                    // InternalChessDSL.g:1386:3: ( 'White' )
                    // InternalChessDSL.g:1386:4: 'White'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1390:2: ( ( 'Black' ) )
                    {
                    // InternalChessDSL.g:1390:2: ( ( 'Black' ) )
                    // InternalChessDSL.g:1391:3: ( 'Black' )
                    {
                     before(grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1()); 
                    // InternalChessDSL.g:1392:3: ( 'Black' )
                    // InternalChessDSL.g:1392:4: 'Black'
                    {
                    match(input,32,FOLLOW_2); 

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
    // InternalChessDSL.g:1400:1: rule__Piece__Alternatives : ( ( ( 'King' ) ) | ( ( 'Queen' ) ) | ( ( 'Rook' ) ) | ( ( 'Bishop' ) ) | ( ( 'Knight' ) ) | ( ( 'Pawn' ) ) );
    public final void rule__Piece__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1404:1: ( ( ( 'King' ) ) | ( ( 'Queen' ) ) | ( ( 'Rook' ) ) | ( ( 'Bishop' ) ) | ( ( 'Knight' ) ) | ( ( 'Pawn' ) ) )
            int alt22=6;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt22=1;
                }
                break;
            case 34:
                {
                alt22=2;
                }
                break;
            case 35:
                {
                alt22=3;
                }
                break;
            case 36:
                {
                alt22=4;
                }
                break;
            case 37:
                {
                alt22=5;
                }
                break;
            case 38:
                {
                alt22=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalChessDSL.g:1405:2: ( ( 'King' ) )
                    {
                    // InternalChessDSL.g:1405:2: ( ( 'King' ) )
                    // InternalChessDSL.g:1406:3: ( 'King' )
                    {
                     before(grammarAccess.getPieceAccess().getKingEnumLiteralDeclaration_0()); 
                    // InternalChessDSL.g:1407:3: ( 'King' )
                    // InternalChessDSL.g:1407:4: 'King'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getPieceAccess().getKingEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1411:2: ( ( 'Queen' ) )
                    {
                    // InternalChessDSL.g:1411:2: ( ( 'Queen' ) )
                    // InternalChessDSL.g:1412:3: ( 'Queen' )
                    {
                     before(grammarAccess.getPieceAccess().getQueenEnumLiteralDeclaration_1()); 
                    // InternalChessDSL.g:1413:3: ( 'Queen' )
                    // InternalChessDSL.g:1413:4: 'Queen'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getPieceAccess().getQueenEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalChessDSL.g:1417:2: ( ( 'Rook' ) )
                    {
                    // InternalChessDSL.g:1417:2: ( ( 'Rook' ) )
                    // InternalChessDSL.g:1418:3: ( 'Rook' )
                    {
                     before(grammarAccess.getPieceAccess().getRookEnumLiteralDeclaration_2()); 
                    // InternalChessDSL.g:1419:3: ( 'Rook' )
                    // InternalChessDSL.g:1419:4: 'Rook'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getPieceAccess().getRookEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalChessDSL.g:1423:2: ( ( 'Bishop' ) )
                    {
                    // InternalChessDSL.g:1423:2: ( ( 'Bishop' ) )
                    // InternalChessDSL.g:1424:3: ( 'Bishop' )
                    {
                     before(grammarAccess.getPieceAccess().getBishopEnumLiteralDeclaration_3()); 
                    // InternalChessDSL.g:1425:3: ( 'Bishop' )
                    // InternalChessDSL.g:1425:4: 'Bishop'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getPieceAccess().getBishopEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalChessDSL.g:1429:2: ( ( 'Knight' ) )
                    {
                    // InternalChessDSL.g:1429:2: ( ( 'Knight' ) )
                    // InternalChessDSL.g:1430:3: ( 'Knight' )
                    {
                     before(grammarAccess.getPieceAccess().getKnightEnumLiteralDeclaration_4()); 
                    // InternalChessDSL.g:1431:3: ( 'Knight' )
                    // InternalChessDSL.g:1431:4: 'Knight'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getPieceAccess().getKnightEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalChessDSL.g:1435:2: ( ( 'Pawn' ) )
                    {
                    // InternalChessDSL.g:1435:2: ( ( 'Pawn' ) )
                    // InternalChessDSL.g:1436:3: ( 'Pawn' )
                    {
                     before(grammarAccess.getPieceAccess().getPawnEnumLiteralDeclaration_5()); 
                    // InternalChessDSL.g:1437:3: ( 'Pawn' )
                    // InternalChessDSL.g:1437:4: 'Pawn'
                    {
                    match(input,38,FOLLOW_2); 

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
    // InternalChessDSL.g:1445:1: rule__Game__Group__0 : rule__Game__Group__0__Impl rule__Game__Group__1 ;
    public final void rule__Game__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1449:1: ( rule__Game__Group__0__Impl rule__Game__Group__1 )
            // InternalChessDSL.g:1450:2: rule__Game__Group__0__Impl rule__Game__Group__1
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
    // InternalChessDSL.g:1457:1: rule__Game__Group__0__Impl : ( 'Game' ) ;
    public final void rule__Game__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1461:1: ( ( 'Game' ) )
            // InternalChessDSL.g:1462:1: ( 'Game' )
            {
            // InternalChessDSL.g:1462:1: ( 'Game' )
            // InternalChessDSL.g:1463:2: 'Game'
            {
             before(grammarAccess.getGameAccess().getGameKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalChessDSL.g:1472:1: rule__Game__Group__1 : rule__Game__Group__1__Impl rule__Game__Group__2 ;
    public final void rule__Game__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1476:1: ( rule__Game__Group__1__Impl rule__Game__Group__2 )
            // InternalChessDSL.g:1477:2: rule__Game__Group__1__Impl rule__Game__Group__2
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
    // InternalChessDSL.g:1484:1: rule__Game__Group__1__Impl : ( ( rule__Game__TitleAssignment_1 ) ) ;
    public final void rule__Game__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1488:1: ( ( ( rule__Game__TitleAssignment_1 ) ) )
            // InternalChessDSL.g:1489:1: ( ( rule__Game__TitleAssignment_1 ) )
            {
            // InternalChessDSL.g:1489:1: ( ( rule__Game__TitleAssignment_1 ) )
            // InternalChessDSL.g:1490:2: ( rule__Game__TitleAssignment_1 )
            {
             before(grammarAccess.getGameAccess().getTitleAssignment_1()); 
            // InternalChessDSL.g:1491:2: ( rule__Game__TitleAssignment_1 )
            // InternalChessDSL.g:1491:3: rule__Game__TitleAssignment_1
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
    // InternalChessDSL.g:1499:1: rule__Game__Group__2 : rule__Game__Group__2__Impl rule__Game__Group__3 ;
    public final void rule__Game__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1503:1: ( rule__Game__Group__2__Impl rule__Game__Group__3 )
            // InternalChessDSL.g:1504:2: rule__Game__Group__2__Impl rule__Game__Group__3
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
    // InternalChessDSL.g:1511:1: rule__Game__Group__2__Impl : ( ( rule__Game__Group_2__0 )? ) ;
    public final void rule__Game__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1515:1: ( ( ( rule__Game__Group_2__0 )? ) )
            // InternalChessDSL.g:1516:1: ( ( rule__Game__Group_2__0 )? )
            {
            // InternalChessDSL.g:1516:1: ( ( rule__Game__Group_2__0 )? )
            // InternalChessDSL.g:1517:2: ( rule__Game__Group_2__0 )?
            {
             before(grammarAccess.getGameAccess().getGroup_2()); 
            // InternalChessDSL.g:1518:2: ( rule__Game__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalChessDSL.g:1518:3: rule__Game__Group_2__0
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
    // InternalChessDSL.g:1526:1: rule__Game__Group__3 : rule__Game__Group__3__Impl rule__Game__Group__4 ;
    public final void rule__Game__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1530:1: ( rule__Game__Group__3__Impl rule__Game__Group__4 )
            // InternalChessDSL.g:1531:2: rule__Game__Group__3__Impl rule__Game__Group__4
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
    // InternalChessDSL.g:1538:1: rule__Game__Group__3__Impl : ( ( rule__Game__InitialAssignment_3 )? ) ;
    public final void rule__Game__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1542:1: ( ( ( rule__Game__InitialAssignment_3 )? ) )
            // InternalChessDSL.g:1543:1: ( ( rule__Game__InitialAssignment_3 )? )
            {
            // InternalChessDSL.g:1543:1: ( ( rule__Game__InitialAssignment_3 )? )
            // InternalChessDSL.g:1544:2: ( rule__Game__InitialAssignment_3 )?
            {
             before(grammarAccess.getGameAccess().getInitialAssignment_3()); 
            // InternalChessDSL.g:1545:2: ( rule__Game__InitialAssignment_3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==44) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalChessDSL.g:1545:3: rule__Game__InitialAssignment_3
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
    // InternalChessDSL.g:1553:1: rule__Game__Group__4 : rule__Game__Group__4__Impl rule__Game__Group__5 ;
    public final void rule__Game__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1557:1: ( rule__Game__Group__4__Impl rule__Game__Group__5 )
            // InternalChessDSL.g:1558:2: rule__Game__Group__4__Impl rule__Game__Group__5
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
    // InternalChessDSL.g:1565:1: rule__Game__Group__4__Impl : ( 'Moves:' ) ;
    public final void rule__Game__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1569:1: ( ( 'Moves:' ) )
            // InternalChessDSL.g:1570:1: ( 'Moves:' )
            {
            // InternalChessDSL.g:1570:1: ( 'Moves:' )
            // InternalChessDSL.g:1571:2: 'Moves:'
            {
             before(grammarAccess.getGameAccess().getMovesKeyword_4()); 
            match(input,40,FOLLOW_2); 
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
    // InternalChessDSL.g:1580:1: rule__Game__Group__5 : rule__Game__Group__5__Impl rule__Game__Group__6 ;
    public final void rule__Game__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1584:1: ( rule__Game__Group__5__Impl rule__Game__Group__6 )
            // InternalChessDSL.g:1585:2: rule__Game__Group__5__Impl rule__Game__Group__6
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
    // InternalChessDSL.g:1592:1: rule__Game__Group__5__Impl : ( ( rule__Game__MovesAssignment_5 )* ) ;
    public final void rule__Game__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1596:1: ( ( ( rule__Game__MovesAssignment_5 )* ) )
            // InternalChessDSL.g:1597:1: ( ( rule__Game__MovesAssignment_5 )* )
            {
            // InternalChessDSL.g:1597:1: ( ( rule__Game__MovesAssignment_5 )* )
            // InternalChessDSL.g:1598:2: ( rule__Game__MovesAssignment_5 )*
            {
             before(grammarAccess.getGameAccess().getMovesAssignment_5()); 
            // InternalChessDSL.g:1599:2: ( rule__Game__MovesAssignment_5 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_MOVENUMBER) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalChessDSL.g:1599:3: rule__Game__MovesAssignment_5
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Game__MovesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalChessDSL.g:1607:1: rule__Game__Group__6 : rule__Game__Group__6__Impl rule__Game__Group__7 ;
    public final void rule__Game__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1611:1: ( rule__Game__Group__6__Impl rule__Game__Group__7 )
            // InternalChessDSL.g:1612:2: rule__Game__Group__6__Impl rule__Game__Group__7
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
    // InternalChessDSL.g:1619:1: rule__Game__Group__6__Impl : ( 'end' ) ;
    public final void rule__Game__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1623:1: ( ( 'end' ) )
            // InternalChessDSL.g:1624:1: ( 'end' )
            {
            // InternalChessDSL.g:1624:1: ( 'end' )
            // InternalChessDSL.g:1625:2: 'end'
            {
             before(grammarAccess.getGameAccess().getEndKeyword_6()); 
            match(input,41,FOLLOW_2); 
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
    // InternalChessDSL.g:1634:1: rule__Game__Group__7 : rule__Game__Group__7__Impl ;
    public final void rule__Game__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1638:1: ( rule__Game__Group__7__Impl )
            // InternalChessDSL.g:1639:2: rule__Game__Group__7__Impl
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
    // InternalChessDSL.g:1645:1: rule__Game__Group__7__Impl : ( ( rule__Game__ConclusionAssignment_7 )? ) ;
    public final void rule__Game__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1649:1: ( ( ( rule__Game__ConclusionAssignment_7 )? ) )
            // InternalChessDSL.g:1650:1: ( ( rule__Game__ConclusionAssignment_7 )? )
            {
            // InternalChessDSL.g:1650:1: ( ( rule__Game__ConclusionAssignment_7 )? )
            // InternalChessDSL.g:1651:2: ( rule__Game__ConclusionAssignment_7 )?
            {
             before(grammarAccess.getGameAccess().getConclusionAssignment_7()); 
            // InternalChessDSL.g:1652:2: ( rule__Game__ConclusionAssignment_7 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID||LA26_0==23||(LA26_0>=31 && LA26_0<=32)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalChessDSL.g:1652:3: rule__Game__ConclusionAssignment_7
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
    // InternalChessDSL.g:1661:1: rule__Game__Group_2__0 : rule__Game__Group_2__0__Impl rule__Game__Group_2__1 ;
    public final void rule__Game__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1665:1: ( rule__Game__Group_2__0__Impl rule__Game__Group_2__1 )
            // InternalChessDSL.g:1666:2: rule__Game__Group_2__0__Impl rule__Game__Group_2__1
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
    // InternalChessDSL.g:1673:1: rule__Game__Group_2__0__Impl : ( 'Players:' ) ;
    public final void rule__Game__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1677:1: ( ( 'Players:' ) )
            // InternalChessDSL.g:1678:1: ( 'Players:' )
            {
            // InternalChessDSL.g:1678:1: ( 'Players:' )
            // InternalChessDSL.g:1679:2: 'Players:'
            {
             before(grammarAccess.getGameAccess().getPlayersKeyword_2_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalChessDSL.g:1688:1: rule__Game__Group_2__1 : rule__Game__Group_2__1__Impl ;
    public final void rule__Game__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1692:1: ( rule__Game__Group_2__1__Impl )
            // InternalChessDSL.g:1693:2: rule__Game__Group_2__1__Impl
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
    // InternalChessDSL.g:1699:1: rule__Game__Group_2__1__Impl : ( ( ( rule__Game__PlayersAssignment_2_1 ) ) ( ( rule__Game__PlayersAssignment_2_1 )* ) ) ;
    public final void rule__Game__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1703:1: ( ( ( ( rule__Game__PlayersAssignment_2_1 ) ) ( ( rule__Game__PlayersAssignment_2_1 )* ) ) )
            // InternalChessDSL.g:1704:1: ( ( ( rule__Game__PlayersAssignment_2_1 ) ) ( ( rule__Game__PlayersAssignment_2_1 )* ) )
            {
            // InternalChessDSL.g:1704:1: ( ( ( rule__Game__PlayersAssignment_2_1 ) ) ( ( rule__Game__PlayersAssignment_2_1 )* ) )
            // InternalChessDSL.g:1705:2: ( ( rule__Game__PlayersAssignment_2_1 ) ) ( ( rule__Game__PlayersAssignment_2_1 )* )
            {
            // InternalChessDSL.g:1705:2: ( ( rule__Game__PlayersAssignment_2_1 ) )
            // InternalChessDSL.g:1706:3: ( rule__Game__PlayersAssignment_2_1 )
            {
             before(grammarAccess.getGameAccess().getPlayersAssignment_2_1()); 
            // InternalChessDSL.g:1707:3: ( rule__Game__PlayersAssignment_2_1 )
            // InternalChessDSL.g:1707:4: rule__Game__PlayersAssignment_2_1
            {
            pushFollow(FOLLOW_9);
            rule__Game__PlayersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getPlayersAssignment_2_1()); 

            }

            // InternalChessDSL.g:1710:2: ( ( rule__Game__PlayersAssignment_2_1 )* )
            // InternalChessDSL.g:1711:3: ( rule__Game__PlayersAssignment_2_1 )*
            {
             before(grammarAccess.getGameAccess().getPlayersAssignment_2_1()); 
            // InternalChessDSL.g:1712:3: ( rule__Game__PlayersAssignment_2_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=31 && LA27_0<=32)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalChessDSL.g:1712:4: rule__Game__PlayersAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Game__PlayersAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalChessDSL.g:1722:1: rule__Player__Group__0 : rule__Player__Group__0__Impl rule__Player__Group__1 ;
    public final void rule__Player__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1726:1: ( rule__Player__Group__0__Impl rule__Player__Group__1 )
            // InternalChessDSL.g:1727:2: rule__Player__Group__0__Impl rule__Player__Group__1
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
    // InternalChessDSL.g:1734:1: rule__Player__Group__0__Impl : ( ( rule__Player__ColorAssignment_0 ) ) ;
    public final void rule__Player__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1738:1: ( ( ( rule__Player__ColorAssignment_0 ) ) )
            // InternalChessDSL.g:1739:1: ( ( rule__Player__ColorAssignment_0 ) )
            {
            // InternalChessDSL.g:1739:1: ( ( rule__Player__ColorAssignment_0 ) )
            // InternalChessDSL.g:1740:2: ( rule__Player__ColorAssignment_0 )
            {
             before(grammarAccess.getPlayerAccess().getColorAssignment_0()); 
            // InternalChessDSL.g:1741:2: ( rule__Player__ColorAssignment_0 )
            // InternalChessDSL.g:1741:3: rule__Player__ColorAssignment_0
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
    // InternalChessDSL.g:1749:1: rule__Player__Group__1 : rule__Player__Group__1__Impl rule__Player__Group__2 ;
    public final void rule__Player__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1753:1: ( rule__Player__Group__1__Impl rule__Player__Group__2 )
            // InternalChessDSL.g:1754:2: rule__Player__Group__1__Impl rule__Player__Group__2
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
    // InternalChessDSL.g:1761:1: rule__Player__Group__1__Impl : ( ':' ) ;
    public final void rule__Player__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1765:1: ( ( ':' ) )
            // InternalChessDSL.g:1766:1: ( ':' )
            {
            // InternalChessDSL.g:1766:1: ( ':' )
            // InternalChessDSL.g:1767:2: ':'
            {
             before(grammarAccess.getPlayerAccess().getColonKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalChessDSL.g:1776:1: rule__Player__Group__2 : rule__Player__Group__2__Impl ;
    public final void rule__Player__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1780:1: ( rule__Player__Group__2__Impl )
            // InternalChessDSL.g:1781:2: rule__Player__Group__2__Impl
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
    // InternalChessDSL.g:1787:1: rule__Player__Group__2__Impl : ( ( rule__Player__NameAssignment_2 ) ) ;
    public final void rule__Player__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1791:1: ( ( ( rule__Player__NameAssignment_2 ) ) )
            // InternalChessDSL.g:1792:1: ( ( rule__Player__NameAssignment_2 ) )
            {
            // InternalChessDSL.g:1792:1: ( ( rule__Player__NameAssignment_2 ) )
            // InternalChessDSL.g:1793:2: ( rule__Player__NameAssignment_2 )
            {
             before(grammarAccess.getPlayerAccess().getNameAssignment_2()); 
            // InternalChessDSL.g:1794:2: ( rule__Player__NameAssignment_2 )
            // InternalChessDSL.g:1794:3: rule__Player__NameAssignment_2
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
    // InternalChessDSL.g:1803:1: rule__InitialState__Group__0 : rule__InitialState__Group__0__Impl rule__InitialState__Group__1 ;
    public final void rule__InitialState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1807:1: ( rule__InitialState__Group__0__Impl rule__InitialState__Group__1 )
            // InternalChessDSL.g:1808:2: rule__InitialState__Group__0__Impl rule__InitialState__Group__1
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
    // InternalChessDSL.g:1815:1: rule__InitialState__Group__0__Impl : ( () ) ;
    public final void rule__InitialState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1819:1: ( ( () ) )
            // InternalChessDSL.g:1820:1: ( () )
            {
            // InternalChessDSL.g:1820:1: ( () )
            // InternalChessDSL.g:1821:2: ()
            {
             before(grammarAccess.getInitialStateAccess().getInitialStateAction_0()); 
            // InternalChessDSL.g:1822:2: ()
            // InternalChessDSL.g:1822:3: 
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
    // InternalChessDSL.g:1830:1: rule__InitialState__Group__1 : rule__InitialState__Group__1__Impl rule__InitialState__Group__2 ;
    public final void rule__InitialState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1834:1: ( rule__InitialState__Group__1__Impl rule__InitialState__Group__2 )
            // InternalChessDSL.g:1835:2: rule__InitialState__Group__1__Impl rule__InitialState__Group__2
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
    // InternalChessDSL.g:1842:1: rule__InitialState__Group__1__Impl : ( 'InitialState' ) ;
    public final void rule__InitialState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1846:1: ( ( 'InitialState' ) )
            // InternalChessDSL.g:1847:1: ( 'InitialState' )
            {
            // InternalChessDSL.g:1847:1: ( 'InitialState' )
            // InternalChessDSL.g:1848:2: 'InitialState'
            {
             before(grammarAccess.getInitialStateAccess().getInitialStateKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalChessDSL.g:1857:1: rule__InitialState__Group__2 : rule__InitialState__Group__2__Impl ;
    public final void rule__InitialState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1861:1: ( rule__InitialState__Group__2__Impl )
            // InternalChessDSL.g:1862:2: rule__InitialState__Group__2__Impl
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
    // InternalChessDSL.g:1868:1: rule__InitialState__Group__2__Impl : ( ( rule__InitialState__Alternatives_2 )? ) ;
    public final void rule__InitialState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1872:1: ( ( ( rule__InitialState__Alternatives_2 )? ) )
            // InternalChessDSL.g:1873:1: ( ( rule__InitialState__Alternatives_2 )? )
            {
            // InternalChessDSL.g:1873:1: ( ( rule__InitialState__Alternatives_2 )? )
            // InternalChessDSL.g:1874:2: ( rule__InitialState__Alternatives_2 )?
            {
             before(grammarAccess.getInitialStateAccess().getAlternatives_2()); 
            // InternalChessDSL.g:1875:2: ( rule__InitialState__Alternatives_2 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==17||LA28_0==45) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalChessDSL.g:1875:3: rule__InitialState__Alternatives_2
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
    // InternalChessDSL.g:1884:1: rule__InitialState__Group_2_1__0 : rule__InitialState__Group_2_1__0__Impl rule__InitialState__Group_2_1__1 ;
    public final void rule__InitialState__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1888:1: ( rule__InitialState__Group_2_1__0__Impl rule__InitialState__Group_2_1__1 )
            // InternalChessDSL.g:1889:2: rule__InitialState__Group_2_1__0__Impl rule__InitialState__Group_2_1__1
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
    // InternalChessDSL.g:1896:1: rule__InitialState__Group_2_1__0__Impl : ( 'custom' ) ;
    public final void rule__InitialState__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1900:1: ( ( 'custom' ) )
            // InternalChessDSL.g:1901:1: ( 'custom' )
            {
            // InternalChessDSL.g:1901:1: ( 'custom' )
            // InternalChessDSL.g:1902:2: 'custom'
            {
             before(grammarAccess.getInitialStateAccess().getCustomKeyword_2_1_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalChessDSL.g:1911:1: rule__InitialState__Group_2_1__1 : rule__InitialState__Group_2_1__1__Impl ;
    public final void rule__InitialState__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1915:1: ( rule__InitialState__Group_2_1__1__Impl )
            // InternalChessDSL.g:1916:2: rule__InitialState__Group_2_1__1__Impl
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
    // InternalChessDSL.g:1922:1: rule__InitialState__Group_2_1__1__Impl : ( ( rule__InitialState__PositionsAssignment_2_1_1 ) ) ;
    public final void rule__InitialState__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1926:1: ( ( ( rule__InitialState__PositionsAssignment_2_1_1 ) ) )
            // InternalChessDSL.g:1927:1: ( ( rule__InitialState__PositionsAssignment_2_1_1 ) )
            {
            // InternalChessDSL.g:1927:1: ( ( rule__InitialState__PositionsAssignment_2_1_1 ) )
            // InternalChessDSL.g:1928:2: ( rule__InitialState__PositionsAssignment_2_1_1 )
            {
             before(grammarAccess.getInitialStateAccess().getPositionsAssignment_2_1_1()); 
            // InternalChessDSL.g:1929:2: ( rule__InitialState__PositionsAssignment_2_1_1 )
            // InternalChessDSL.g:1929:3: rule__InitialState__PositionsAssignment_2_1_1
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
    // InternalChessDSL.g:1938:1: rule__CustomPositions__Group__0 : rule__CustomPositions__Group__0__Impl rule__CustomPositions__Group__1 ;
    public final void rule__CustomPositions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1942:1: ( rule__CustomPositions__Group__0__Impl rule__CustomPositions__Group__1 )
            // InternalChessDSL.g:1943:2: rule__CustomPositions__Group__0__Impl rule__CustomPositions__Group__1
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
    // InternalChessDSL.g:1950:1: rule__CustomPositions__Group__0__Impl : ( () ) ;
    public final void rule__CustomPositions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1954:1: ( ( () ) )
            // InternalChessDSL.g:1955:1: ( () )
            {
            // InternalChessDSL.g:1955:1: ( () )
            // InternalChessDSL.g:1956:2: ()
            {
             before(grammarAccess.getCustomPositionsAccess().getCustomPositionsAction_0()); 
            // InternalChessDSL.g:1957:2: ()
            // InternalChessDSL.g:1957:3: 
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
    // InternalChessDSL.g:1965:1: rule__CustomPositions__Group__1 : rule__CustomPositions__Group__1__Impl rule__CustomPositions__Group__2 ;
    public final void rule__CustomPositions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1969:1: ( rule__CustomPositions__Group__1__Impl rule__CustomPositions__Group__2 )
            // InternalChessDSL.g:1970:2: rule__CustomPositions__Group__1__Impl rule__CustomPositions__Group__2
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
    // InternalChessDSL.g:1977:1: rule__CustomPositions__Group__1__Impl : ( 'Positions:' ) ;
    public final void rule__CustomPositions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1981:1: ( ( 'Positions:' ) )
            // InternalChessDSL.g:1982:1: ( 'Positions:' )
            {
            // InternalChessDSL.g:1982:1: ( 'Positions:' )
            // InternalChessDSL.g:1983:2: 'Positions:'
            {
             before(grammarAccess.getCustomPositionsAccess().getPositionsKeyword_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalChessDSL.g:1992:1: rule__CustomPositions__Group__2 : rule__CustomPositions__Group__2__Impl rule__CustomPositions__Group__3 ;
    public final void rule__CustomPositions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1996:1: ( rule__CustomPositions__Group__2__Impl rule__CustomPositions__Group__3 )
            // InternalChessDSL.g:1997:2: rule__CustomPositions__Group__2__Impl rule__CustomPositions__Group__3
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
    // InternalChessDSL.g:2004:1: rule__CustomPositions__Group__2__Impl : ( '{' ) ;
    public final void rule__CustomPositions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2008:1: ( ( '{' ) )
            // InternalChessDSL.g:2009:1: ( '{' )
            {
            // InternalChessDSL.g:2009:1: ( '{' )
            // InternalChessDSL.g:2010:2: '{'
            {
             before(grammarAccess.getCustomPositionsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,47,FOLLOW_2); 
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
    // InternalChessDSL.g:2019:1: rule__CustomPositions__Group__3 : rule__CustomPositions__Group__3__Impl rule__CustomPositions__Group__4 ;
    public final void rule__CustomPositions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2023:1: ( rule__CustomPositions__Group__3__Impl rule__CustomPositions__Group__4 )
            // InternalChessDSL.g:2024:2: rule__CustomPositions__Group__3__Impl rule__CustomPositions__Group__4
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
    // InternalChessDSL.g:2031:1: rule__CustomPositions__Group__3__Impl : ( ( rule__CustomPositions__PlacementAssignment_3 )* ) ;
    public final void rule__CustomPositions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2035:1: ( ( ( rule__CustomPositions__PlacementAssignment_3 )* ) )
            // InternalChessDSL.g:2036:1: ( ( rule__CustomPositions__PlacementAssignment_3 )* )
            {
            // InternalChessDSL.g:2036:1: ( ( rule__CustomPositions__PlacementAssignment_3 )* )
            // InternalChessDSL.g:2037:2: ( rule__CustomPositions__PlacementAssignment_3 )*
            {
             before(grammarAccess.getCustomPositionsAccess().getPlacementAssignment_3()); 
            // InternalChessDSL.g:2038:2: ( rule__CustomPositions__PlacementAssignment_3 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=31 && LA29_0<=32)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalChessDSL.g:2038:3: rule__CustomPositions__PlacementAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__CustomPositions__PlacementAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalChessDSL.g:2046:1: rule__CustomPositions__Group__4 : rule__CustomPositions__Group__4__Impl ;
    public final void rule__CustomPositions__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2050:1: ( rule__CustomPositions__Group__4__Impl )
            // InternalChessDSL.g:2051:2: rule__CustomPositions__Group__4__Impl
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
    // InternalChessDSL.g:2057:1: rule__CustomPositions__Group__4__Impl : ( '}' ) ;
    public final void rule__CustomPositions__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2061:1: ( ( '}' ) )
            // InternalChessDSL.g:2062:1: ( '}' )
            {
            // InternalChessDSL.g:2062:1: ( '}' )
            // InternalChessDSL.g:2063:2: '}'
            {
             before(grammarAccess.getCustomPositionsAccess().getRightCurlyBracketKeyword_4()); 
            match(input,48,FOLLOW_2); 
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
    // InternalChessDSL.g:2073:1: rule__Placement__Group__0 : rule__Placement__Group__0__Impl rule__Placement__Group__1 ;
    public final void rule__Placement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2077:1: ( rule__Placement__Group__0__Impl rule__Placement__Group__1 )
            // InternalChessDSL.g:2078:2: rule__Placement__Group__0__Impl rule__Placement__Group__1
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
    // InternalChessDSL.g:2085:1: rule__Placement__Group__0__Impl : ( ( rule__Placement__PieceAssignment_0 ) ) ;
    public final void rule__Placement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2089:1: ( ( ( rule__Placement__PieceAssignment_0 ) ) )
            // InternalChessDSL.g:2090:1: ( ( rule__Placement__PieceAssignment_0 ) )
            {
            // InternalChessDSL.g:2090:1: ( ( rule__Placement__PieceAssignment_0 ) )
            // InternalChessDSL.g:2091:2: ( rule__Placement__PieceAssignment_0 )
            {
             before(grammarAccess.getPlacementAccess().getPieceAssignment_0()); 
            // InternalChessDSL.g:2092:2: ( rule__Placement__PieceAssignment_0 )
            // InternalChessDSL.g:2092:3: rule__Placement__PieceAssignment_0
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
    // InternalChessDSL.g:2100:1: rule__Placement__Group__1 : rule__Placement__Group__1__Impl rule__Placement__Group__2 ;
    public final void rule__Placement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2104:1: ( rule__Placement__Group__1__Impl rule__Placement__Group__2 )
            // InternalChessDSL.g:2105:2: rule__Placement__Group__1__Impl rule__Placement__Group__2
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
    // InternalChessDSL.g:2112:1: rule__Placement__Group__1__Impl : ( ( rule__Placement__Alternatives_1 ) ) ;
    public final void rule__Placement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2116:1: ( ( ( rule__Placement__Alternatives_1 ) ) )
            // InternalChessDSL.g:2117:1: ( ( rule__Placement__Alternatives_1 ) )
            {
            // InternalChessDSL.g:2117:1: ( ( rule__Placement__Alternatives_1 ) )
            // InternalChessDSL.g:2118:2: ( rule__Placement__Alternatives_1 )
            {
             before(grammarAccess.getPlacementAccess().getAlternatives_1()); 
            // InternalChessDSL.g:2119:2: ( rule__Placement__Alternatives_1 )
            // InternalChessDSL.g:2119:3: rule__Placement__Alternatives_1
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
    // InternalChessDSL.g:2127:1: rule__Placement__Group__2 : rule__Placement__Group__2__Impl ;
    public final void rule__Placement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2131:1: ( rule__Placement__Group__2__Impl )
            // InternalChessDSL.g:2132:2: rule__Placement__Group__2__Impl
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
    // InternalChessDSL.g:2138:1: rule__Placement__Group__2__Impl : ( ( rule__Placement__SquareAssignment_2 ) ) ;
    public final void rule__Placement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2142:1: ( ( ( rule__Placement__SquareAssignment_2 ) ) )
            // InternalChessDSL.g:2143:1: ( ( rule__Placement__SquareAssignment_2 ) )
            {
            // InternalChessDSL.g:2143:1: ( ( rule__Placement__SquareAssignment_2 ) )
            // InternalChessDSL.g:2144:2: ( rule__Placement__SquareAssignment_2 )
            {
             before(grammarAccess.getPlacementAccess().getSquareAssignment_2()); 
            // InternalChessDSL.g:2145:2: ( rule__Placement__SquareAssignment_2 )
            // InternalChessDSL.g:2145:3: rule__Placement__SquareAssignment_2
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
    // InternalChessDSL.g:2154:1: rule__CustomPiece__Group__0 : rule__CustomPiece__Group__0__Impl rule__CustomPiece__Group__1 ;
    public final void rule__CustomPiece__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2158:1: ( rule__CustomPiece__Group__0__Impl rule__CustomPiece__Group__1 )
            // InternalChessDSL.g:2159:2: rule__CustomPiece__Group__0__Impl rule__CustomPiece__Group__1
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
    // InternalChessDSL.g:2166:1: rule__CustomPiece__Group__0__Impl : ( ( rule__CustomPiece__ColorAssignment_0 ) ) ;
    public final void rule__CustomPiece__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2170:1: ( ( ( rule__CustomPiece__ColorAssignment_0 ) ) )
            // InternalChessDSL.g:2171:1: ( ( rule__CustomPiece__ColorAssignment_0 ) )
            {
            // InternalChessDSL.g:2171:1: ( ( rule__CustomPiece__ColorAssignment_0 ) )
            // InternalChessDSL.g:2172:2: ( rule__CustomPiece__ColorAssignment_0 )
            {
             before(grammarAccess.getCustomPieceAccess().getColorAssignment_0()); 
            // InternalChessDSL.g:2173:2: ( rule__CustomPiece__ColorAssignment_0 )
            // InternalChessDSL.g:2173:3: rule__CustomPiece__ColorAssignment_0
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
    // InternalChessDSL.g:2181:1: rule__CustomPiece__Group__1 : rule__CustomPiece__Group__1__Impl ;
    public final void rule__CustomPiece__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2185:1: ( rule__CustomPiece__Group__1__Impl )
            // InternalChessDSL.g:2186:2: rule__CustomPiece__Group__1__Impl
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
    // InternalChessDSL.g:2192:1: rule__CustomPiece__Group__1__Impl : ( ( rule__CustomPiece__KindAssignment_1 ) ) ;
    public final void rule__CustomPiece__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2196:1: ( ( ( rule__CustomPiece__KindAssignment_1 ) ) )
            // InternalChessDSL.g:2197:1: ( ( rule__CustomPiece__KindAssignment_1 ) )
            {
            // InternalChessDSL.g:2197:1: ( ( rule__CustomPiece__KindAssignment_1 ) )
            // InternalChessDSL.g:2198:2: ( rule__CustomPiece__KindAssignment_1 )
            {
             before(grammarAccess.getCustomPieceAccess().getKindAssignment_1()); 
            // InternalChessDSL.g:2199:2: ( rule__CustomPiece__KindAssignment_1 )
            // InternalChessDSL.g:2199:3: rule__CustomPiece__KindAssignment_1
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
    // InternalChessDSL.g:2208:1: rule__MovePair__Group__0 : rule__MovePair__Group__0__Impl rule__MovePair__Group__1 ;
    public final void rule__MovePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2212:1: ( rule__MovePair__Group__0__Impl rule__MovePair__Group__1 )
            // InternalChessDSL.g:2213:2: rule__MovePair__Group__0__Impl rule__MovePair__Group__1
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
    // InternalChessDSL.g:2220:1: rule__MovePair__Group__0__Impl : ( ( rule__MovePair__MoveNumberAssignment_0 ) ) ;
    public final void rule__MovePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2224:1: ( ( ( rule__MovePair__MoveNumberAssignment_0 ) ) )
            // InternalChessDSL.g:2225:1: ( ( rule__MovePair__MoveNumberAssignment_0 ) )
            {
            // InternalChessDSL.g:2225:1: ( ( rule__MovePair__MoveNumberAssignment_0 ) )
            // InternalChessDSL.g:2226:2: ( rule__MovePair__MoveNumberAssignment_0 )
            {
             before(grammarAccess.getMovePairAccess().getMoveNumberAssignment_0()); 
            // InternalChessDSL.g:2227:2: ( rule__MovePair__MoveNumberAssignment_0 )
            // InternalChessDSL.g:2227:3: rule__MovePair__MoveNumberAssignment_0
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
    // InternalChessDSL.g:2235:1: rule__MovePair__Group__1 : rule__MovePair__Group__1__Impl rule__MovePair__Group__2 ;
    public final void rule__MovePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2239:1: ( rule__MovePair__Group__1__Impl rule__MovePair__Group__2 )
            // InternalChessDSL.g:2240:2: rule__MovePair__Group__1__Impl rule__MovePair__Group__2
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
    // InternalChessDSL.g:2247:1: rule__MovePair__Group__1__Impl : ( ( rule__MovePair__Alternatives_1 ) ) ;
    public final void rule__MovePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2251:1: ( ( ( rule__MovePair__Alternatives_1 ) ) )
            // InternalChessDSL.g:2252:1: ( ( rule__MovePair__Alternatives_1 ) )
            {
            // InternalChessDSL.g:2252:1: ( ( rule__MovePair__Alternatives_1 ) )
            // InternalChessDSL.g:2253:2: ( rule__MovePair__Alternatives_1 )
            {
             before(grammarAccess.getMovePairAccess().getAlternatives_1()); 
            // InternalChessDSL.g:2254:2: ( rule__MovePair__Alternatives_1 )
            // InternalChessDSL.g:2254:3: rule__MovePair__Alternatives_1
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
    // InternalChessDSL.g:2262:1: rule__MovePair__Group__2 : rule__MovePair__Group__2__Impl ;
    public final void rule__MovePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2266:1: ( rule__MovePair__Group__2__Impl )
            // InternalChessDSL.g:2267:2: rule__MovePair__Group__2__Impl
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
    // InternalChessDSL.g:2273:1: rule__MovePair__Group__2__Impl : ( ( rule__MovePair__Group_2__0 )? ) ;
    public final void rule__MovePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2277:1: ( ( ( rule__MovePair__Group_2__0 )? ) )
            // InternalChessDSL.g:2278:1: ( ( rule__MovePair__Group_2__0 )? )
            {
            // InternalChessDSL.g:2278:1: ( ( rule__MovePair__Group_2__0 )? )
            // InternalChessDSL.g:2279:2: ( rule__MovePair__Group_2__0 )?
            {
             before(grammarAccess.getMovePairAccess().getGroup_2()); 
            // InternalChessDSL.g:2280:2: ( rule__MovePair__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_SAN_TOKEN)||(LA30_0>=33 && LA30_0<=38)||(LA30_0>=51 && LA30_0<=52)||(LA30_0>=59 && LA30_0<=60)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalChessDSL.g:2280:3: rule__MovePair__Group_2__0
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
    // InternalChessDSL.g:2289:1: rule__MovePair__Group_1_0__0 : rule__MovePair__Group_1_0__0__Impl rule__MovePair__Group_1_0__1 ;
    public final void rule__MovePair__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2293:1: ( rule__MovePair__Group_1_0__0__Impl rule__MovePair__Group_1_0__1 )
            // InternalChessDSL.g:2294:2: rule__MovePair__Group_1_0__0__Impl rule__MovePair__Group_1_0__1
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
    // InternalChessDSL.g:2301:1: rule__MovePair__Group_1_0__0__Impl : ( ( rule__MovePair__Color1Assignment_1_0_0 )? ) ;
    public final void rule__MovePair__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2305:1: ( ( ( rule__MovePair__Color1Assignment_1_0_0 )? ) )
            // InternalChessDSL.g:2306:1: ( ( rule__MovePair__Color1Assignment_1_0_0 )? )
            {
            // InternalChessDSL.g:2306:1: ( ( rule__MovePair__Color1Assignment_1_0_0 )? )
            // InternalChessDSL.g:2307:2: ( rule__MovePair__Color1Assignment_1_0_0 )?
            {
             before(grammarAccess.getMovePairAccess().getColor1Assignment_1_0_0()); 
            // InternalChessDSL.g:2308:2: ( rule__MovePair__Color1Assignment_1_0_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalChessDSL.g:2308:3: rule__MovePair__Color1Assignment_1_0_0
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
    // InternalChessDSL.g:2316:1: rule__MovePair__Group_1_0__1 : rule__MovePair__Group_1_0__1__Impl ;
    public final void rule__MovePair__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2320:1: ( rule__MovePair__Group_1_0__1__Impl )
            // InternalChessDSL.g:2321:2: rule__MovePair__Group_1_0__1__Impl
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
    // InternalChessDSL.g:2327:1: rule__MovePair__Group_1_0__1__Impl : ( ( rule__MovePair__WhiteMoveAssignment_1_0_1 ) ) ;
    public final void rule__MovePair__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2331:1: ( ( ( rule__MovePair__WhiteMoveAssignment_1_0_1 ) ) )
            // InternalChessDSL.g:2332:1: ( ( rule__MovePair__WhiteMoveAssignment_1_0_1 ) )
            {
            // InternalChessDSL.g:2332:1: ( ( rule__MovePair__WhiteMoveAssignment_1_0_1 ) )
            // InternalChessDSL.g:2333:2: ( rule__MovePair__WhiteMoveAssignment_1_0_1 )
            {
             before(grammarAccess.getMovePairAccess().getWhiteMoveAssignment_1_0_1()); 
            // InternalChessDSL.g:2334:2: ( rule__MovePair__WhiteMoveAssignment_1_0_1 )
            // InternalChessDSL.g:2334:3: rule__MovePair__WhiteMoveAssignment_1_0_1
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
    // InternalChessDSL.g:2343:1: rule__MovePair__Group_2__0 : rule__MovePair__Group_2__0__Impl rule__MovePair__Group_2__1 ;
    public final void rule__MovePair__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2347:1: ( rule__MovePair__Group_2__0__Impl rule__MovePair__Group_2__1 )
            // InternalChessDSL.g:2348:2: rule__MovePair__Group_2__0__Impl rule__MovePair__Group_2__1
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
    // InternalChessDSL.g:2355:1: rule__MovePair__Group_2__0__Impl : ( ( rule__MovePair__Color2Assignment_2_0 )? ) ;
    public final void rule__MovePair__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2359:1: ( ( ( rule__MovePair__Color2Assignment_2_0 )? ) )
            // InternalChessDSL.g:2360:1: ( ( rule__MovePair__Color2Assignment_2_0 )? )
            {
            // InternalChessDSL.g:2360:1: ( ( rule__MovePair__Color2Assignment_2_0 )? )
            // InternalChessDSL.g:2361:2: ( rule__MovePair__Color2Assignment_2_0 )?
            {
             before(grammarAccess.getMovePairAccess().getColor2Assignment_2_0()); 
            // InternalChessDSL.g:2362:2: ( rule__MovePair__Color2Assignment_2_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalChessDSL.g:2362:3: rule__MovePair__Color2Assignment_2_0
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
    // InternalChessDSL.g:2370:1: rule__MovePair__Group_2__1 : rule__MovePair__Group_2__1__Impl ;
    public final void rule__MovePair__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2374:1: ( rule__MovePair__Group_2__1__Impl )
            // InternalChessDSL.g:2375:2: rule__MovePair__Group_2__1__Impl
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
    // InternalChessDSL.g:2381:1: rule__MovePair__Group_2__1__Impl : ( ( rule__MovePair__BlackMoveAssignment_2_1 ) ) ;
    public final void rule__MovePair__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2385:1: ( ( ( rule__MovePair__BlackMoveAssignment_2_1 ) ) )
            // InternalChessDSL.g:2386:1: ( ( rule__MovePair__BlackMoveAssignment_2_1 ) )
            {
            // InternalChessDSL.g:2386:1: ( ( rule__MovePair__BlackMoveAssignment_2_1 ) )
            // InternalChessDSL.g:2387:2: ( rule__MovePair__BlackMoveAssignment_2_1 )
            {
             before(grammarAccess.getMovePairAccess().getBlackMoveAssignment_2_1()); 
            // InternalChessDSL.g:2388:2: ( rule__MovePair__BlackMoveAssignment_2_1 )
            // InternalChessDSL.g:2388:3: rule__MovePair__BlackMoveAssignment_2_1
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


    // $ANTLR start "rule__AnyMove__Group_1__0"
    // InternalChessDSL.g:2397:1: rule__AnyMove__Group_1__0 : rule__AnyMove__Group_1__0__Impl rule__AnyMove__Group_1__1 ;
    public final void rule__AnyMove__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2401:1: ( rule__AnyMove__Group_1__0__Impl rule__AnyMove__Group_1__1 )
            // InternalChessDSL.g:2402:2: rule__AnyMove__Group_1__0__Impl rule__AnyMove__Group_1__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalChessDSL.g:2409:1: rule__AnyMove__Group_1__0__Impl : ( ( rule__AnyMove__MoveAssignment_1_0 ) ) ;
    public final void rule__AnyMove__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2413:1: ( ( ( rule__AnyMove__MoveAssignment_1_0 ) ) )
            // InternalChessDSL.g:2414:1: ( ( rule__AnyMove__MoveAssignment_1_0 ) )
            {
            // InternalChessDSL.g:2414:1: ( ( rule__AnyMove__MoveAssignment_1_0 ) )
            // InternalChessDSL.g:2415:2: ( rule__AnyMove__MoveAssignment_1_0 )
            {
             before(grammarAccess.getAnyMoveAccess().getMoveAssignment_1_0()); 
            // InternalChessDSL.g:2416:2: ( rule__AnyMove__MoveAssignment_1_0 )
            // InternalChessDSL.g:2416:3: rule__AnyMove__MoveAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AnyMove__MoveAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAnyMoveAccess().getMoveAssignment_1_0()); 

            }


            }

        }
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
    // InternalChessDSL.g:2424:1: rule__AnyMove__Group_1__1 : rule__AnyMove__Group_1__1__Impl ;
    public final void rule__AnyMove__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2428:1: ( rule__AnyMove__Group_1__1__Impl )
            // InternalChessDSL.g:2429:2: rule__AnyMove__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnyMove__Group_1__1__Impl();

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
    // InternalChessDSL.g:2435:1: rule__AnyMove__Group_1__1__Impl : ( ( rule__AnyMove__Group_1_1__0 )? ) ;
    public final void rule__AnyMove__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2439:1: ( ( ( rule__AnyMove__Group_1_1__0 )? ) )
            // InternalChessDSL.g:2440:1: ( ( rule__AnyMove__Group_1_1__0 )? )
            {
            // InternalChessDSL.g:2440:1: ( ( rule__AnyMove__Group_1_1__0 )? )
            // InternalChessDSL.g:2441:2: ( rule__AnyMove__Group_1_1__0 )?
            {
             before(grammarAccess.getAnyMoveAccess().getGroup_1_1()); 
            // InternalChessDSL.g:2442:2: ( rule__AnyMove__Group_1_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==49) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalChessDSL.g:2442:3: rule__AnyMove__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AnyMove__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnyMoveAccess().getGroup_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__AnyMove__Group_1_1__0"
    // InternalChessDSL.g:2451:1: rule__AnyMove__Group_1_1__0 : rule__AnyMove__Group_1_1__0__Impl rule__AnyMove__Group_1_1__1 ;
    public final void rule__AnyMove__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2455:1: ( rule__AnyMove__Group_1_1__0__Impl rule__AnyMove__Group_1_1__1 )
            // InternalChessDSL.g:2456:2: rule__AnyMove__Group_1_1__0__Impl rule__AnyMove__Group_1_1__1
            {
            pushFollow(FOLLOW_22);
            rule__AnyMove__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnyMove__Group_1_1__1();

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
    // $ANTLR end "rule__AnyMove__Group_1_1__0"


    // $ANTLR start "rule__AnyMove__Group_1_1__0__Impl"
    // InternalChessDSL.g:2463:1: rule__AnyMove__Group_1_1__0__Impl : ( '(' ) ;
    public final void rule__AnyMove__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2467:1: ( ( '(' ) )
            // InternalChessDSL.g:2468:1: ( '(' )
            {
            // InternalChessDSL.g:2468:1: ( '(' )
            // InternalChessDSL.g:2469:2: '('
            {
             before(grammarAccess.getAnyMoveAccess().getLeftParenthesisKeyword_1_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getAnyMoveAccess().getLeftParenthesisKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyMove__Group_1_1__0__Impl"


    // $ANTLR start "rule__AnyMove__Group_1_1__1"
    // InternalChessDSL.g:2478:1: rule__AnyMove__Group_1_1__1 : rule__AnyMove__Group_1_1__1__Impl rule__AnyMove__Group_1_1__2 ;
    public final void rule__AnyMove__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2482:1: ( rule__AnyMove__Group_1_1__1__Impl rule__AnyMove__Group_1_1__2 )
            // InternalChessDSL.g:2483:2: rule__AnyMove__Group_1_1__1__Impl rule__AnyMove__Group_1_1__2
            {
            pushFollow(FOLLOW_22);
            rule__AnyMove__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnyMove__Group_1_1__2();

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
    // $ANTLR end "rule__AnyMove__Group_1_1__1"


    // $ANTLR start "rule__AnyMove__Group_1_1__1__Impl"
    // InternalChessDSL.g:2490:1: rule__AnyMove__Group_1_1__1__Impl : ( ( rule__AnyMove__RemarksAssignment_1_1_1 )* ) ;
    public final void rule__AnyMove__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2494:1: ( ( ( rule__AnyMove__RemarksAssignment_1_1_1 )* ) )
            // InternalChessDSL.g:2495:1: ( ( rule__AnyMove__RemarksAssignment_1_1_1 )* )
            {
            // InternalChessDSL.g:2495:1: ( ( rule__AnyMove__RemarksAssignment_1_1_1 )* )
            // InternalChessDSL.g:2496:2: ( rule__AnyMove__RemarksAssignment_1_1_1 )*
            {
             before(grammarAccess.getAnyMoveAccess().getRemarksAssignment_1_1_1()); 
            // InternalChessDSL.g:2497:2: ( rule__AnyMove__RemarksAssignment_1_1_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=24 && LA34_0<=30)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalChessDSL.g:2497:3: rule__AnyMove__RemarksAssignment_1_1_1
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__AnyMove__RemarksAssignment_1_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getAnyMoveAccess().getRemarksAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyMove__Group_1_1__1__Impl"


    // $ANTLR start "rule__AnyMove__Group_1_1__2"
    // InternalChessDSL.g:2505:1: rule__AnyMove__Group_1_1__2 : rule__AnyMove__Group_1_1__2__Impl ;
    public final void rule__AnyMove__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2509:1: ( rule__AnyMove__Group_1_1__2__Impl )
            // InternalChessDSL.g:2510:2: rule__AnyMove__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnyMove__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__AnyMove__Group_1_1__2"


    // $ANTLR start "rule__AnyMove__Group_1_1__2__Impl"
    // InternalChessDSL.g:2516:1: rule__AnyMove__Group_1_1__2__Impl : ( ')' ) ;
    public final void rule__AnyMove__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2520:1: ( ( ')' ) )
            // InternalChessDSL.g:2521:1: ( ')' )
            {
            // InternalChessDSL.g:2521:1: ( ')' )
            // InternalChessDSL.g:2522:2: ')'
            {
             before(grammarAccess.getAnyMoveAccess().getRightParenthesisKeyword_1_1_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getAnyMoveAccess().getRightParenthesisKeyword_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyMove__Group_1_1__2__Impl"


    // $ANTLR start "rule__Dummy__Group__0"
    // InternalChessDSL.g:2532:1: rule__Dummy__Group__0 : rule__Dummy__Group__0__Impl rule__Dummy__Group__1 ;
    public final void rule__Dummy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2536:1: ( rule__Dummy__Group__0__Impl rule__Dummy__Group__1 )
            // InternalChessDSL.g:2537:2: rule__Dummy__Group__0__Impl rule__Dummy__Group__1
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
    // InternalChessDSL.g:2544:1: rule__Dummy__Group__0__Impl : ( () ) ;
    public final void rule__Dummy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2548:1: ( ( () ) )
            // InternalChessDSL.g:2549:1: ( () )
            {
            // InternalChessDSL.g:2549:1: ( () )
            // InternalChessDSL.g:2550:2: ()
            {
             before(grammarAccess.getDummyAccess().getDummyAction_0()); 
            // InternalChessDSL.g:2551:2: ()
            // InternalChessDSL.g:2551:3: 
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
    // InternalChessDSL.g:2559:1: rule__Dummy__Group__1 : rule__Dummy__Group__1__Impl ;
    public final void rule__Dummy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2563:1: ( rule__Dummy__Group__1__Impl )
            // InternalChessDSL.g:2564:2: rule__Dummy__Group__1__Impl
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
    // InternalChessDSL.g:2570:1: rule__Dummy__Group__1__Impl : ( 'dummy' ) ;
    public final void rule__Dummy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2574:1: ( ( 'dummy' ) )
            // InternalChessDSL.g:2575:1: ( 'dummy' )
            {
            // InternalChessDSL.g:2575:1: ( 'dummy' )
            // InternalChessDSL.g:2576:2: 'dummy'
            {
             before(grammarAccess.getDummyAccess().getDummyKeyword_1()); 
            match(input,51,FOLLOW_2); 
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
    // InternalChessDSL.g:2586:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2590:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // InternalChessDSL.g:2591:2: rule__Move__Group__0__Impl rule__Move__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalChessDSL.g:2598:1: rule__Move__Group__0__Impl : ( ( 'moves' )? ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2602:1: ( ( ( 'moves' )? ) )
            // InternalChessDSL.g:2603:1: ( ( 'moves' )? )
            {
            // InternalChessDSL.g:2603:1: ( ( 'moves' )? )
            // InternalChessDSL.g:2604:2: ( 'moves' )?
            {
             before(grammarAccess.getMoveAccess().getMovesKeyword_0()); 
            // InternalChessDSL.g:2605:2: ( 'moves' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==52) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalChessDSL.g:2605:3: 'moves'
                    {
                    match(input,52,FOLLOW_2); 

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
    // InternalChessDSL.g:2613:1: rule__Move__Group__1 : rule__Move__Group__1__Impl rule__Move__Group__2 ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2617:1: ( rule__Move__Group__1__Impl rule__Move__Group__2 )
            // InternalChessDSL.g:2618:2: rule__Move__Group__1__Impl rule__Move__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalChessDSL.g:2625:1: rule__Move__Group__1__Impl : ( ( rule__Move__PieceAssignment_1 ) ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2629:1: ( ( ( rule__Move__PieceAssignment_1 ) ) )
            // InternalChessDSL.g:2630:1: ( ( rule__Move__PieceAssignment_1 ) )
            {
            // InternalChessDSL.g:2630:1: ( ( rule__Move__PieceAssignment_1 ) )
            // InternalChessDSL.g:2631:2: ( rule__Move__PieceAssignment_1 )
            {
             before(grammarAccess.getMoveAccess().getPieceAssignment_1()); 
            // InternalChessDSL.g:2632:2: ( rule__Move__PieceAssignment_1 )
            // InternalChessDSL.g:2632:3: rule__Move__PieceAssignment_1
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
    // InternalChessDSL.g:2640:1: rule__Move__Group__2 : rule__Move__Group__2__Impl ;
    public final void rule__Move__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2644:1: ( rule__Move__Group__2__Impl )
            // InternalChessDSL.g:2645:2: rule__Move__Group__2__Impl
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
    // InternalChessDSL.g:2651:1: rule__Move__Group__2__Impl : ( ( rule__Move__Alternatives_2 ) ) ;
    public final void rule__Move__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2655:1: ( ( ( rule__Move__Alternatives_2 ) ) )
            // InternalChessDSL.g:2656:1: ( ( rule__Move__Alternatives_2 ) )
            {
            // InternalChessDSL.g:2656:1: ( ( rule__Move__Alternatives_2 ) )
            // InternalChessDSL.g:2657:2: ( rule__Move__Alternatives_2 )
            {
             before(grammarAccess.getMoveAccess().getAlternatives_2()); 
            // InternalChessDSL.g:2658:2: ( rule__Move__Alternatives_2 )
            // InternalChessDSL.g:2658:3: rule__Move__Alternatives_2
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
    // InternalChessDSL.g:2667:1: rule__Move__Group_2_0__0 : rule__Move__Group_2_0__0__Impl rule__Move__Group_2_0__1 ;
    public final void rule__Move__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2671:1: ( rule__Move__Group_2_0__0__Impl rule__Move__Group_2_0__1 )
            // InternalChessDSL.g:2672:2: rule__Move__Group_2_0__0__Impl rule__Move__Group_2_0__1
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
    // InternalChessDSL.g:2679:1: rule__Move__Group_2_0__0__Impl : ( '(' ) ;
    public final void rule__Move__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2683:1: ( ( '(' ) )
            // InternalChessDSL.g:2684:1: ( '(' )
            {
            // InternalChessDSL.g:2684:1: ( '(' )
            // InternalChessDSL.g:2685:2: '('
            {
             before(grammarAccess.getMoveAccess().getLeftParenthesisKeyword_2_0_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalChessDSL.g:2694:1: rule__Move__Group_2_0__1 : rule__Move__Group_2_0__1__Impl rule__Move__Group_2_0__2 ;
    public final void rule__Move__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2698:1: ( rule__Move__Group_2_0__1__Impl rule__Move__Group_2_0__2 )
            // InternalChessDSL.g:2699:2: rule__Move__Group_2_0__1__Impl rule__Move__Group_2_0__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalChessDSL.g:2706:1: rule__Move__Group_2_0__1__Impl : ( ( rule__Move__FromAssignment_2_0_1 ) ) ;
    public final void rule__Move__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2710:1: ( ( ( rule__Move__FromAssignment_2_0_1 ) ) )
            // InternalChessDSL.g:2711:1: ( ( rule__Move__FromAssignment_2_0_1 ) )
            {
            // InternalChessDSL.g:2711:1: ( ( rule__Move__FromAssignment_2_0_1 ) )
            // InternalChessDSL.g:2712:2: ( rule__Move__FromAssignment_2_0_1 )
            {
             before(grammarAccess.getMoveAccess().getFromAssignment_2_0_1()); 
            // InternalChessDSL.g:2713:2: ( rule__Move__FromAssignment_2_0_1 )
            // InternalChessDSL.g:2713:3: rule__Move__FromAssignment_2_0_1
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
    // InternalChessDSL.g:2721:1: rule__Move__Group_2_0__2 : rule__Move__Group_2_0__2__Impl rule__Move__Group_2_0__3 ;
    public final void rule__Move__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2725:1: ( rule__Move__Group_2_0__2__Impl rule__Move__Group_2_0__3 )
            // InternalChessDSL.g:2726:2: rule__Move__Group_2_0__2__Impl rule__Move__Group_2_0__3
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
    // InternalChessDSL.g:2733:1: rule__Move__Group_2_0__2__Impl : ( '->' ) ;
    public final void rule__Move__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2737:1: ( ( '->' ) )
            // InternalChessDSL.g:2738:1: ( '->' )
            {
            // InternalChessDSL.g:2738:1: ( '->' )
            // InternalChessDSL.g:2739:2: '->'
            {
             before(grammarAccess.getMoveAccess().getHyphenMinusGreaterThanSignKeyword_2_0_2()); 
            match(input,53,FOLLOW_2); 
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
    // InternalChessDSL.g:2748:1: rule__Move__Group_2_0__3 : rule__Move__Group_2_0__3__Impl rule__Move__Group_2_0__4 ;
    public final void rule__Move__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2752:1: ( rule__Move__Group_2_0__3__Impl rule__Move__Group_2_0__4 )
            // InternalChessDSL.g:2753:2: rule__Move__Group_2_0__3__Impl rule__Move__Group_2_0__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalChessDSL.g:2760:1: rule__Move__Group_2_0__3__Impl : ( ( rule__Move__ToAssignment_2_0_3 ) ) ;
    public final void rule__Move__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2764:1: ( ( ( rule__Move__ToAssignment_2_0_3 ) ) )
            // InternalChessDSL.g:2765:1: ( ( rule__Move__ToAssignment_2_0_3 ) )
            {
            // InternalChessDSL.g:2765:1: ( ( rule__Move__ToAssignment_2_0_3 ) )
            // InternalChessDSL.g:2766:2: ( rule__Move__ToAssignment_2_0_3 )
            {
             before(grammarAccess.getMoveAccess().getToAssignment_2_0_3()); 
            // InternalChessDSL.g:2767:2: ( rule__Move__ToAssignment_2_0_3 )
            // InternalChessDSL.g:2767:3: rule__Move__ToAssignment_2_0_3
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
    // InternalChessDSL.g:2775:1: rule__Move__Group_2_0__4 : rule__Move__Group_2_0__4__Impl ;
    public final void rule__Move__Group_2_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2779:1: ( rule__Move__Group_2_0__4__Impl )
            // InternalChessDSL.g:2780:2: rule__Move__Group_2_0__4__Impl
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
    // InternalChessDSL.g:2786:1: rule__Move__Group_2_0__4__Impl : ( ')' ) ;
    public final void rule__Move__Group_2_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2790:1: ( ( ')' ) )
            // InternalChessDSL.g:2791:1: ( ')' )
            {
            // InternalChessDSL.g:2791:1: ( ')' )
            // InternalChessDSL.g:2792:2: ')'
            {
             before(grammarAccess.getMoveAccess().getRightParenthesisKeyword_2_0_4()); 
            match(input,50,FOLLOW_2); 
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
    // InternalChessDSL.g:2802:1: rule__Move__Group_2_1__0 : rule__Move__Group_2_1__0__Impl rule__Move__Group_2_1__1 ;
    public final void rule__Move__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2806:1: ( rule__Move__Group_2_1__0__Impl rule__Move__Group_2_1__1 )
            // InternalChessDSL.g:2807:2: rule__Move__Group_2_1__0__Impl rule__Move__Group_2_1__1
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
    // InternalChessDSL.g:2814:1: rule__Move__Group_2_1__0__Impl : ( 'from' ) ;
    public final void rule__Move__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2818:1: ( ( 'from' ) )
            // InternalChessDSL.g:2819:1: ( 'from' )
            {
            // InternalChessDSL.g:2819:1: ( 'from' )
            // InternalChessDSL.g:2820:2: 'from'
            {
             before(grammarAccess.getMoveAccess().getFromKeyword_2_1_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalChessDSL.g:2829:1: rule__Move__Group_2_1__1 : rule__Move__Group_2_1__1__Impl rule__Move__Group_2_1__2 ;
    public final void rule__Move__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2833:1: ( rule__Move__Group_2_1__1__Impl rule__Move__Group_2_1__2 )
            // InternalChessDSL.g:2834:2: rule__Move__Group_2_1__1__Impl rule__Move__Group_2_1__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalChessDSL.g:2841:1: rule__Move__Group_2_1__1__Impl : ( ( rule__Move__FromAssignment_2_1_1 ) ) ;
    public final void rule__Move__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2845:1: ( ( ( rule__Move__FromAssignment_2_1_1 ) ) )
            // InternalChessDSL.g:2846:1: ( ( rule__Move__FromAssignment_2_1_1 ) )
            {
            // InternalChessDSL.g:2846:1: ( ( rule__Move__FromAssignment_2_1_1 ) )
            // InternalChessDSL.g:2847:2: ( rule__Move__FromAssignment_2_1_1 )
            {
             before(grammarAccess.getMoveAccess().getFromAssignment_2_1_1()); 
            // InternalChessDSL.g:2848:2: ( rule__Move__FromAssignment_2_1_1 )
            // InternalChessDSL.g:2848:3: rule__Move__FromAssignment_2_1_1
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
    // InternalChessDSL.g:2856:1: rule__Move__Group_2_1__2 : rule__Move__Group_2_1__2__Impl rule__Move__Group_2_1__3 ;
    public final void rule__Move__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2860:1: ( rule__Move__Group_2_1__2__Impl rule__Move__Group_2_1__3 )
            // InternalChessDSL.g:2861:2: rule__Move__Group_2_1__2__Impl rule__Move__Group_2_1__3
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
    // InternalChessDSL.g:2868:1: rule__Move__Group_2_1__2__Impl : ( 'to' ) ;
    public final void rule__Move__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2872:1: ( ( 'to' ) )
            // InternalChessDSL.g:2873:1: ( 'to' )
            {
            // InternalChessDSL.g:2873:1: ( 'to' )
            // InternalChessDSL.g:2874:2: 'to'
            {
             before(grammarAccess.getMoveAccess().getToKeyword_2_1_2()); 
            match(input,55,FOLLOW_2); 
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
    // InternalChessDSL.g:2883:1: rule__Move__Group_2_1__3 : rule__Move__Group_2_1__3__Impl ;
    public final void rule__Move__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2887:1: ( rule__Move__Group_2_1__3__Impl )
            // InternalChessDSL.g:2888:2: rule__Move__Group_2_1__3__Impl
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
    // InternalChessDSL.g:2894:1: rule__Move__Group_2_1__3__Impl : ( ( rule__Move__ToAssignment_2_1_3 ) ) ;
    public final void rule__Move__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2898:1: ( ( ( rule__Move__ToAssignment_2_1_3 ) ) )
            // InternalChessDSL.g:2899:1: ( ( rule__Move__ToAssignment_2_1_3 ) )
            {
            // InternalChessDSL.g:2899:1: ( ( rule__Move__ToAssignment_2_1_3 ) )
            // InternalChessDSL.g:2900:2: ( rule__Move__ToAssignment_2_1_3 )
            {
             before(grammarAccess.getMoveAccess().getToAssignment_2_1_3()); 
            // InternalChessDSL.g:2901:2: ( rule__Move__ToAssignment_2_1_3 )
            // InternalChessDSL.g:2901:3: rule__Move__ToAssignment_2_1_3
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
    // InternalChessDSL.g:2910:1: rule__Capture__Group__0 : rule__Capture__Group__0__Impl rule__Capture__Group__1 ;
    public final void rule__Capture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2914:1: ( rule__Capture__Group__0__Impl rule__Capture__Group__1 )
            // InternalChessDSL.g:2915:2: rule__Capture__Group__0__Impl rule__Capture__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalChessDSL.g:2922:1: rule__Capture__Group__0__Impl : ( ( rule__Capture__MoveAssignment_0 ) ) ;
    public final void rule__Capture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2926:1: ( ( ( rule__Capture__MoveAssignment_0 ) ) )
            // InternalChessDSL.g:2927:1: ( ( rule__Capture__MoveAssignment_0 ) )
            {
            // InternalChessDSL.g:2927:1: ( ( rule__Capture__MoveAssignment_0 ) )
            // InternalChessDSL.g:2928:2: ( rule__Capture__MoveAssignment_0 )
            {
             before(grammarAccess.getCaptureAccess().getMoveAssignment_0()); 
            // InternalChessDSL.g:2929:2: ( rule__Capture__MoveAssignment_0 )
            // InternalChessDSL.g:2929:3: rule__Capture__MoveAssignment_0
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
    // InternalChessDSL.g:2937:1: rule__Capture__Group__1 : rule__Capture__Group__1__Impl ;
    public final void rule__Capture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2941:1: ( rule__Capture__Group__1__Impl )
            // InternalChessDSL.g:2942:2: rule__Capture__Group__1__Impl
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
    // InternalChessDSL.g:2948:1: rule__Capture__Group__1__Impl : ( ( rule__Capture__Alternatives_1 ) ) ;
    public final void rule__Capture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2952:1: ( ( ( rule__Capture__Alternatives_1 ) ) )
            // InternalChessDSL.g:2953:1: ( ( rule__Capture__Alternatives_1 ) )
            {
            // InternalChessDSL.g:2953:1: ( ( rule__Capture__Alternatives_1 ) )
            // InternalChessDSL.g:2954:2: ( rule__Capture__Alternatives_1 )
            {
             before(grammarAccess.getCaptureAccess().getAlternatives_1()); 
            // InternalChessDSL.g:2955:2: ( rule__Capture__Alternatives_1 )
            // InternalChessDSL.g:2955:3: rule__Capture__Alternatives_1
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
    // InternalChessDSL.g:2964:1: rule__Capture__Group_1_0__0 : rule__Capture__Group_1_0__0__Impl rule__Capture__Group_1_0__1 ;
    public final void rule__Capture__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2968:1: ( rule__Capture__Group_1_0__0__Impl rule__Capture__Group_1_0__1 )
            // InternalChessDSL.g:2969:2: rule__Capture__Group_1_0__0__Impl rule__Capture__Group_1_0__1
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
    // InternalChessDSL.g:2976:1: rule__Capture__Group_1_0__0__Impl : ( 'Capture(' ) ;
    public final void rule__Capture__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2980:1: ( ( 'Capture(' ) )
            // InternalChessDSL.g:2981:1: ( 'Capture(' )
            {
            // InternalChessDSL.g:2981:1: ( 'Capture(' )
            // InternalChessDSL.g:2982:2: 'Capture('
            {
             before(grammarAccess.getCaptureAccess().getCaptureKeyword_1_0_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalChessDSL.g:2991:1: rule__Capture__Group_1_0__1 : rule__Capture__Group_1_0__1__Impl rule__Capture__Group_1_0__2 ;
    public final void rule__Capture__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2995:1: ( rule__Capture__Group_1_0__1__Impl rule__Capture__Group_1_0__2 )
            // InternalChessDSL.g:2996:2: rule__Capture__Group_1_0__1__Impl rule__Capture__Group_1_0__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalChessDSL.g:3003:1: rule__Capture__Group_1_0__1__Impl : ( ( rule__Capture__CaptureAssignment_1_0_1 ) ) ;
    public final void rule__Capture__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3007:1: ( ( ( rule__Capture__CaptureAssignment_1_0_1 ) ) )
            // InternalChessDSL.g:3008:1: ( ( rule__Capture__CaptureAssignment_1_0_1 ) )
            {
            // InternalChessDSL.g:3008:1: ( ( rule__Capture__CaptureAssignment_1_0_1 ) )
            // InternalChessDSL.g:3009:2: ( rule__Capture__CaptureAssignment_1_0_1 )
            {
             before(grammarAccess.getCaptureAccess().getCaptureAssignment_1_0_1()); 
            // InternalChessDSL.g:3010:2: ( rule__Capture__CaptureAssignment_1_0_1 )
            // InternalChessDSL.g:3010:3: rule__Capture__CaptureAssignment_1_0_1
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
    // InternalChessDSL.g:3018:1: rule__Capture__Group_1_0__2 : rule__Capture__Group_1_0__2__Impl ;
    public final void rule__Capture__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3022:1: ( rule__Capture__Group_1_0__2__Impl )
            // InternalChessDSL.g:3023:2: rule__Capture__Group_1_0__2__Impl
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
    // InternalChessDSL.g:3029:1: rule__Capture__Group_1_0__2__Impl : ( ')' ) ;
    public final void rule__Capture__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3033:1: ( ( ')' ) )
            // InternalChessDSL.g:3034:1: ( ')' )
            {
            // InternalChessDSL.g:3034:1: ( ')' )
            // InternalChessDSL.g:3035:2: ')'
            {
             before(grammarAccess.getCaptureAccess().getRightParenthesisKeyword_1_0_2()); 
            match(input,50,FOLLOW_2); 
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
    // InternalChessDSL.g:3045:1: rule__Capture__Group_1_1__0 : rule__Capture__Group_1_1__0__Impl rule__Capture__Group_1_1__1 ;
    public final void rule__Capture__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3049:1: ( rule__Capture__Group_1_1__0__Impl rule__Capture__Group_1_1__1 )
            // InternalChessDSL.g:3050:2: rule__Capture__Group_1_1__0__Impl rule__Capture__Group_1_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalChessDSL.g:3057:1: rule__Capture__Group_1_1__0__Impl : ( ( 'and' )? ) ;
    public final void rule__Capture__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3061:1: ( ( ( 'and' )? ) )
            // InternalChessDSL.g:3062:1: ( ( 'and' )? )
            {
            // InternalChessDSL.g:3062:1: ( ( 'and' )? )
            // InternalChessDSL.g:3063:2: ( 'and' )?
            {
             before(grammarAccess.getCaptureAccess().getAndKeyword_1_1_0()); 
            // InternalChessDSL.g:3064:2: ( 'and' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==57) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalChessDSL.g:3064:3: 'and'
                    {
                    match(input,57,FOLLOW_2); 

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
    // InternalChessDSL.g:3072:1: rule__Capture__Group_1_1__1 : rule__Capture__Group_1_1__1__Impl rule__Capture__Group_1_1__2 ;
    public final void rule__Capture__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3076:1: ( rule__Capture__Group_1_1__1__Impl rule__Capture__Group_1_1__2 )
            // InternalChessDSL.g:3077:2: rule__Capture__Group_1_1__1__Impl rule__Capture__Group_1_1__2
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
    // InternalChessDSL.g:3084:1: rule__Capture__Group_1_1__1__Impl : ( 'captures' ) ;
    public final void rule__Capture__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3088:1: ( ( 'captures' ) )
            // InternalChessDSL.g:3089:1: ( 'captures' )
            {
            // InternalChessDSL.g:3089:1: ( 'captures' )
            // InternalChessDSL.g:3090:2: 'captures'
            {
             before(grammarAccess.getCaptureAccess().getCapturesKeyword_1_1_1()); 
            match(input,58,FOLLOW_2); 
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
    // InternalChessDSL.g:3099:1: rule__Capture__Group_1_1__2 : rule__Capture__Group_1_1__2__Impl ;
    public final void rule__Capture__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3103:1: ( rule__Capture__Group_1_1__2__Impl )
            // InternalChessDSL.g:3104:2: rule__Capture__Group_1_1__2__Impl
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
    // InternalChessDSL.g:3110:1: rule__Capture__Group_1_1__2__Impl : ( ( rule__Capture__CaptureAssignment_1_1_2 ) ) ;
    public final void rule__Capture__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3114:1: ( ( ( rule__Capture__CaptureAssignment_1_1_2 ) ) )
            // InternalChessDSL.g:3115:1: ( ( rule__Capture__CaptureAssignment_1_1_2 ) )
            {
            // InternalChessDSL.g:3115:1: ( ( rule__Capture__CaptureAssignment_1_1_2 ) )
            // InternalChessDSL.g:3116:2: ( rule__Capture__CaptureAssignment_1_1_2 )
            {
             before(grammarAccess.getCaptureAccess().getCaptureAssignment_1_1_2()); 
            // InternalChessDSL.g:3117:2: ( rule__Capture__CaptureAssignment_1_1_2 )
            // InternalChessDSL.g:3117:3: rule__Capture__CaptureAssignment_1_1_2
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
    // InternalChessDSL.g:3126:1: rule__Castle__Group_0__0 : rule__Castle__Group_0__0__Impl rule__Castle__Group_0__1 ;
    public final void rule__Castle__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3130:1: ( rule__Castle__Group_0__0__Impl rule__Castle__Group_0__1 )
            // InternalChessDSL.g:3131:2: rule__Castle__Group_0__0__Impl rule__Castle__Group_0__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalChessDSL.g:3138:1: rule__Castle__Group_0__0__Impl : ( 'Castle(' ) ;
    public final void rule__Castle__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3142:1: ( ( 'Castle(' ) )
            // InternalChessDSL.g:3143:1: ( 'Castle(' )
            {
            // InternalChessDSL.g:3143:1: ( 'Castle(' )
            // InternalChessDSL.g:3144:2: 'Castle('
            {
             before(grammarAccess.getCastleAccess().getCastleKeyword_0_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalChessDSL.g:3153:1: rule__Castle__Group_0__1 : rule__Castle__Group_0__1__Impl rule__Castle__Group_0__2 ;
    public final void rule__Castle__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3157:1: ( rule__Castle__Group_0__1__Impl rule__Castle__Group_0__2 )
            // InternalChessDSL.g:3158:2: rule__Castle__Group_0__1__Impl rule__Castle__Group_0__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalChessDSL.g:3165:1: rule__Castle__Group_0__1__Impl : ( ( rule__Castle__SideAssignment_0_1 ) ) ;
    public final void rule__Castle__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3169:1: ( ( ( rule__Castle__SideAssignment_0_1 ) ) )
            // InternalChessDSL.g:3170:1: ( ( rule__Castle__SideAssignment_0_1 ) )
            {
            // InternalChessDSL.g:3170:1: ( ( rule__Castle__SideAssignment_0_1 ) )
            // InternalChessDSL.g:3171:2: ( rule__Castle__SideAssignment_0_1 )
            {
             before(grammarAccess.getCastleAccess().getSideAssignment_0_1()); 
            // InternalChessDSL.g:3172:2: ( rule__Castle__SideAssignment_0_1 )
            // InternalChessDSL.g:3172:3: rule__Castle__SideAssignment_0_1
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
    // InternalChessDSL.g:3180:1: rule__Castle__Group_0__2 : rule__Castle__Group_0__2__Impl ;
    public final void rule__Castle__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3184:1: ( rule__Castle__Group_0__2__Impl )
            // InternalChessDSL.g:3185:2: rule__Castle__Group_0__2__Impl
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
    // InternalChessDSL.g:3191:1: rule__Castle__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Castle__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3195:1: ( ( ')' ) )
            // InternalChessDSL.g:3196:1: ( ')' )
            {
            // InternalChessDSL.g:3196:1: ( ')' )
            // InternalChessDSL.g:3197:2: ')'
            {
             before(grammarAccess.getCastleAccess().getRightParenthesisKeyword_0_2()); 
            match(input,50,FOLLOW_2); 
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
    // InternalChessDSL.g:3207:1: rule__Castle__Group_1__0 : rule__Castle__Group_1__0__Impl rule__Castle__Group_1__1 ;
    public final void rule__Castle__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3211:1: ( rule__Castle__Group_1__0__Impl rule__Castle__Group_1__1 )
            // InternalChessDSL.g:3212:2: rule__Castle__Group_1__0__Impl rule__Castle__Group_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalChessDSL.g:3219:1: rule__Castle__Group_1__0__Impl : ( 'castles' ) ;
    public final void rule__Castle__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3223:1: ( ( 'castles' ) )
            // InternalChessDSL.g:3224:1: ( 'castles' )
            {
            // InternalChessDSL.g:3224:1: ( 'castles' )
            // InternalChessDSL.g:3225:2: 'castles'
            {
             before(grammarAccess.getCastleAccess().getCastlesKeyword_1_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalChessDSL.g:3234:1: rule__Castle__Group_1__1 : rule__Castle__Group_1__1__Impl rule__Castle__Group_1__2 ;
    public final void rule__Castle__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3238:1: ( rule__Castle__Group_1__1__Impl rule__Castle__Group_1__2 )
            // InternalChessDSL.g:3239:2: rule__Castle__Group_1__1__Impl rule__Castle__Group_1__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalChessDSL.g:3246:1: rule__Castle__Group_1__1__Impl : ( ( rule__Castle__Group_1_1__0 )? ) ;
    public final void rule__Castle__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3250:1: ( ( ( rule__Castle__Group_1_1__0 )? ) )
            // InternalChessDSL.g:3251:1: ( ( rule__Castle__Group_1_1__0 )? )
            {
            // InternalChessDSL.g:3251:1: ( ( rule__Castle__Group_1_1__0 )? )
            // InternalChessDSL.g:3252:2: ( rule__Castle__Group_1_1__0 )?
            {
             before(grammarAccess.getCastleAccess().getGroup_1_1()); 
            // InternalChessDSL.g:3253:2: ( rule__Castle__Group_1_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==19) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalChessDSL.g:3253:3: rule__Castle__Group_1_1__0
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
    // InternalChessDSL.g:3261:1: rule__Castle__Group_1__2 : rule__Castle__Group_1__2__Impl ;
    public final void rule__Castle__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3265:1: ( rule__Castle__Group_1__2__Impl )
            // InternalChessDSL.g:3266:2: rule__Castle__Group_1__2__Impl
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
    // InternalChessDSL.g:3272:1: rule__Castle__Group_1__2__Impl : ( ( rule__Castle__SideAssignment_1_2 ) ) ;
    public final void rule__Castle__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3276:1: ( ( ( rule__Castle__SideAssignment_1_2 ) ) )
            // InternalChessDSL.g:3277:1: ( ( rule__Castle__SideAssignment_1_2 ) )
            {
            // InternalChessDSL.g:3277:1: ( ( rule__Castle__SideAssignment_1_2 ) )
            // InternalChessDSL.g:3278:2: ( rule__Castle__SideAssignment_1_2 )
            {
             before(grammarAccess.getCastleAccess().getSideAssignment_1_2()); 
            // InternalChessDSL.g:3279:2: ( rule__Castle__SideAssignment_1_2 )
            // InternalChessDSL.g:3279:3: rule__Castle__SideAssignment_1_2
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
    // InternalChessDSL.g:3288:1: rule__Castle__Group_1_1__0 : rule__Castle__Group_1_1__0__Impl rule__Castle__Group_1_1__1 ;
    public final void rule__Castle__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3292:1: ( rule__Castle__Group_1_1__0__Impl rule__Castle__Group_1_1__1 )
            // InternalChessDSL.g:3293:2: rule__Castle__Group_1_1__0__Impl rule__Castle__Group_1_1__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalChessDSL.g:3300:1: rule__Castle__Group_1_1__0__Impl : ( 'on' ) ;
    public final void rule__Castle__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3304:1: ( ( 'on' ) )
            // InternalChessDSL.g:3305:1: ( 'on' )
            {
            // InternalChessDSL.g:3305:1: ( 'on' )
            // InternalChessDSL.g:3306:2: 'on'
            {
             before(grammarAccess.getCastleAccess().getOnKeyword_1_1_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalChessDSL.g:3315:1: rule__Castle__Group_1_1__1 : rule__Castle__Group_1_1__1__Impl ;
    public final void rule__Castle__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3319:1: ( rule__Castle__Group_1_1__1__Impl )
            // InternalChessDSL.g:3320:2: rule__Castle__Group_1_1__1__Impl
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
    // InternalChessDSL.g:3326:1: rule__Castle__Group_1_1__1__Impl : ( 'the' ) ;
    public final void rule__Castle__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3330:1: ( ( 'the' ) )
            // InternalChessDSL.g:3331:1: ( 'the' )
            {
            // InternalChessDSL.g:3331:1: ( 'the' )
            // InternalChessDSL.g:3332:2: 'the'
            {
             before(grammarAccess.getCastleAccess().getTheKeyword_1_1_1()); 
            match(input,61,FOLLOW_2); 
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
    // InternalChessDSL.g:3342:1: rule__Castle__Group_2__0 : rule__Castle__Group_2__0__Impl rule__Castle__Group_2__1 ;
    public final void rule__Castle__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3346:1: ( rule__Castle__Group_2__0__Impl rule__Castle__Group_2__1 )
            // InternalChessDSL.g:3347:2: rule__Castle__Group_2__0__Impl rule__Castle__Group_2__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalChessDSL.g:3354:1: rule__Castle__Group_2__0__Impl : ( ( rule__Castle__MoveAssignment_2_0 ) ) ;
    public final void rule__Castle__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3358:1: ( ( ( rule__Castle__MoveAssignment_2_0 ) ) )
            // InternalChessDSL.g:3359:1: ( ( rule__Castle__MoveAssignment_2_0 ) )
            {
            // InternalChessDSL.g:3359:1: ( ( rule__Castle__MoveAssignment_2_0 ) )
            // InternalChessDSL.g:3360:2: ( rule__Castle__MoveAssignment_2_0 )
            {
             before(grammarAccess.getCastleAccess().getMoveAssignment_2_0()); 
            // InternalChessDSL.g:3361:2: ( rule__Castle__MoveAssignment_2_0 )
            // InternalChessDSL.g:3361:3: rule__Castle__MoveAssignment_2_0
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
    // InternalChessDSL.g:3369:1: rule__Castle__Group_2__1 : rule__Castle__Group_2__1__Impl rule__Castle__Group_2__2 ;
    public final void rule__Castle__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3373:1: ( rule__Castle__Group_2__1__Impl rule__Castle__Group_2__2 )
            // InternalChessDSL.g:3374:2: rule__Castle__Group_2__1__Impl rule__Castle__Group_2__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalChessDSL.g:3381:1: rule__Castle__Group_2__1__Impl : ( 'Castle(' ) ;
    public final void rule__Castle__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3385:1: ( ( 'Castle(' ) )
            // InternalChessDSL.g:3386:1: ( 'Castle(' )
            {
            // InternalChessDSL.g:3386:1: ( 'Castle(' )
            // InternalChessDSL.g:3387:2: 'Castle('
            {
             before(grammarAccess.getCastleAccess().getCastleKeyword_2_1()); 
            match(input,59,FOLLOW_2); 
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
    // InternalChessDSL.g:3396:1: rule__Castle__Group_2__2 : rule__Castle__Group_2__2__Impl rule__Castle__Group_2__3 ;
    public final void rule__Castle__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3400:1: ( rule__Castle__Group_2__2__Impl rule__Castle__Group_2__3 )
            // InternalChessDSL.g:3401:2: rule__Castle__Group_2__2__Impl rule__Castle__Group_2__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalChessDSL.g:3408:1: rule__Castle__Group_2__2__Impl : ( ( rule__Castle__SideAssignment_2_2 ) ) ;
    public final void rule__Castle__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3412:1: ( ( ( rule__Castle__SideAssignment_2_2 ) ) )
            // InternalChessDSL.g:3413:1: ( ( rule__Castle__SideAssignment_2_2 ) )
            {
            // InternalChessDSL.g:3413:1: ( ( rule__Castle__SideAssignment_2_2 ) )
            // InternalChessDSL.g:3414:2: ( rule__Castle__SideAssignment_2_2 )
            {
             before(grammarAccess.getCastleAccess().getSideAssignment_2_2()); 
            // InternalChessDSL.g:3415:2: ( rule__Castle__SideAssignment_2_2 )
            // InternalChessDSL.g:3415:3: rule__Castle__SideAssignment_2_2
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
    // InternalChessDSL.g:3423:1: rule__Castle__Group_2__3 : rule__Castle__Group_2__3__Impl ;
    public final void rule__Castle__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3427:1: ( rule__Castle__Group_2__3__Impl )
            // InternalChessDSL.g:3428:2: rule__Castle__Group_2__3__Impl
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
    // InternalChessDSL.g:3434:1: rule__Castle__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Castle__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3438:1: ( ( ')' ) )
            // InternalChessDSL.g:3439:1: ( ')' )
            {
            // InternalChessDSL.g:3439:1: ( ')' )
            // InternalChessDSL.g:3440:2: ')'
            {
             before(grammarAccess.getCastleAccess().getRightParenthesisKeyword_2_3()); 
            match(input,50,FOLLOW_2); 
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
    // InternalChessDSL.g:3450:1: rule__Castle__Group_3__0 : rule__Castle__Group_3__0__Impl rule__Castle__Group_3__1 ;
    public final void rule__Castle__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3454:1: ( rule__Castle__Group_3__0__Impl rule__Castle__Group_3__1 )
            // InternalChessDSL.g:3455:2: rule__Castle__Group_3__0__Impl rule__Castle__Group_3__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalChessDSL.g:3462:1: rule__Castle__Group_3__0__Impl : ( ( rule__Castle__MoveAssignment_3_0 ) ) ;
    public final void rule__Castle__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3466:1: ( ( ( rule__Castle__MoveAssignment_3_0 ) ) )
            // InternalChessDSL.g:3467:1: ( ( rule__Castle__MoveAssignment_3_0 ) )
            {
            // InternalChessDSL.g:3467:1: ( ( rule__Castle__MoveAssignment_3_0 ) )
            // InternalChessDSL.g:3468:2: ( rule__Castle__MoveAssignment_3_0 )
            {
             before(grammarAccess.getCastleAccess().getMoveAssignment_3_0()); 
            // InternalChessDSL.g:3469:2: ( rule__Castle__MoveAssignment_3_0 )
            // InternalChessDSL.g:3469:3: rule__Castle__MoveAssignment_3_0
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
    // InternalChessDSL.g:3477:1: rule__Castle__Group_3__1 : rule__Castle__Group_3__1__Impl rule__Castle__Group_3__2 ;
    public final void rule__Castle__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3481:1: ( rule__Castle__Group_3__1__Impl rule__Castle__Group_3__2 )
            // InternalChessDSL.g:3482:2: rule__Castle__Group_3__1__Impl rule__Castle__Group_3__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalChessDSL.g:3489:1: rule__Castle__Group_3__1__Impl : ( 'and' ) ;
    public final void rule__Castle__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3493:1: ( ( 'and' ) )
            // InternalChessDSL.g:3494:1: ( 'and' )
            {
            // InternalChessDSL.g:3494:1: ( 'and' )
            // InternalChessDSL.g:3495:2: 'and'
            {
             before(grammarAccess.getCastleAccess().getAndKeyword_3_1()); 
            match(input,57,FOLLOW_2); 
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
    // InternalChessDSL.g:3504:1: rule__Castle__Group_3__2 : rule__Castle__Group_3__2__Impl rule__Castle__Group_3__3 ;
    public final void rule__Castle__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3508:1: ( rule__Castle__Group_3__2__Impl rule__Castle__Group_3__3 )
            // InternalChessDSL.g:3509:2: rule__Castle__Group_3__2__Impl rule__Castle__Group_3__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalChessDSL.g:3516:1: rule__Castle__Group_3__2__Impl : ( 'castles' ) ;
    public final void rule__Castle__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3520:1: ( ( 'castles' ) )
            // InternalChessDSL.g:3521:1: ( 'castles' )
            {
            // InternalChessDSL.g:3521:1: ( 'castles' )
            // InternalChessDSL.g:3522:2: 'castles'
            {
             before(grammarAccess.getCastleAccess().getCastlesKeyword_3_2()); 
            match(input,60,FOLLOW_2); 
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
    // InternalChessDSL.g:3531:1: rule__Castle__Group_3__3 : rule__Castle__Group_3__3__Impl ;
    public final void rule__Castle__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3535:1: ( rule__Castle__Group_3__3__Impl )
            // InternalChessDSL.g:3536:2: rule__Castle__Group_3__3__Impl
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
    // InternalChessDSL.g:3542:1: rule__Castle__Group_3__3__Impl : ( ( rule__Castle__SideAssignment_3_3 ) ) ;
    public final void rule__Castle__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3546:1: ( ( ( rule__Castle__SideAssignment_3_3 ) ) )
            // InternalChessDSL.g:3547:1: ( ( rule__Castle__SideAssignment_3_3 ) )
            {
            // InternalChessDSL.g:3547:1: ( ( rule__Castle__SideAssignment_3_3 ) )
            // InternalChessDSL.g:3548:2: ( rule__Castle__SideAssignment_3_3 )
            {
             before(grammarAccess.getCastleAccess().getSideAssignment_3_3()); 
            // InternalChessDSL.g:3549:2: ( rule__Castle__SideAssignment_3_3 )
            // InternalChessDSL.g:3549:3: rule__Castle__SideAssignment_3_3
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
    // InternalChessDSL.g:3558:1: rule__EnPassant__Group__0 : rule__EnPassant__Group__0__Impl rule__EnPassant__Group__1 ;
    public final void rule__EnPassant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3562:1: ( rule__EnPassant__Group__0__Impl rule__EnPassant__Group__1 )
            // InternalChessDSL.g:3563:2: rule__EnPassant__Group__0__Impl rule__EnPassant__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalChessDSL.g:3570:1: rule__EnPassant__Group__0__Impl : ( ( rule__EnPassant__CaptureAssignment_0 ) ) ;
    public final void rule__EnPassant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3574:1: ( ( ( rule__EnPassant__CaptureAssignment_0 ) ) )
            // InternalChessDSL.g:3575:1: ( ( rule__EnPassant__CaptureAssignment_0 ) )
            {
            // InternalChessDSL.g:3575:1: ( ( rule__EnPassant__CaptureAssignment_0 ) )
            // InternalChessDSL.g:3576:2: ( rule__EnPassant__CaptureAssignment_0 )
            {
             before(grammarAccess.getEnPassantAccess().getCaptureAssignment_0()); 
            // InternalChessDSL.g:3577:2: ( rule__EnPassant__CaptureAssignment_0 )
            // InternalChessDSL.g:3577:3: rule__EnPassant__CaptureAssignment_0
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
    // InternalChessDSL.g:3585:1: rule__EnPassant__Group__1 : rule__EnPassant__Group__1__Impl rule__EnPassant__Group__2 ;
    public final void rule__EnPassant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3589:1: ( rule__EnPassant__Group__1__Impl rule__EnPassant__Group__2 )
            // InternalChessDSL.g:3590:2: rule__EnPassant__Group__1__Impl rule__EnPassant__Group__2
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
    // InternalChessDSL.g:3597:1: rule__EnPassant__Group__1__Impl : ( 'on' ) ;
    public final void rule__EnPassant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3601:1: ( ( 'on' ) )
            // InternalChessDSL.g:3602:1: ( 'on' )
            {
            // InternalChessDSL.g:3602:1: ( 'on' )
            // InternalChessDSL.g:3603:2: 'on'
            {
             before(grammarAccess.getEnPassantAccess().getOnKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalChessDSL.g:3612:1: rule__EnPassant__Group__2 : rule__EnPassant__Group__2__Impl ;
    public final void rule__EnPassant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3616:1: ( rule__EnPassant__Group__2__Impl )
            // InternalChessDSL.g:3617:2: rule__EnPassant__Group__2__Impl
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
    // InternalChessDSL.g:3623:1: rule__EnPassant__Group__2__Impl : ( ( rule__EnPassant__SquareAssignment_2 ) ) ;
    public final void rule__EnPassant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3627:1: ( ( ( rule__EnPassant__SquareAssignment_2 ) ) )
            // InternalChessDSL.g:3628:1: ( ( rule__EnPassant__SquareAssignment_2 ) )
            {
            // InternalChessDSL.g:3628:1: ( ( rule__EnPassant__SquareAssignment_2 ) )
            // InternalChessDSL.g:3629:2: ( rule__EnPassant__SquareAssignment_2 )
            {
             before(grammarAccess.getEnPassantAccess().getSquareAssignment_2()); 
            // InternalChessDSL.g:3630:2: ( rule__EnPassant__SquareAssignment_2 )
            // InternalChessDSL.g:3630:3: rule__EnPassant__SquareAssignment_2
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
    // InternalChessDSL.g:3639:1: rule__Promotion__Group__0 : rule__Promotion__Group__0__Impl rule__Promotion__Group__1 ;
    public final void rule__Promotion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3643:1: ( rule__Promotion__Group__0__Impl rule__Promotion__Group__1 )
            // InternalChessDSL.g:3644:2: rule__Promotion__Group__0__Impl rule__Promotion__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalChessDSL.g:3651:1: rule__Promotion__Group__0__Impl : ( ( rule__Promotion__MoveAssignment_0 ) ) ;
    public final void rule__Promotion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3655:1: ( ( ( rule__Promotion__MoveAssignment_0 ) ) )
            // InternalChessDSL.g:3656:1: ( ( rule__Promotion__MoveAssignment_0 ) )
            {
            // InternalChessDSL.g:3656:1: ( ( rule__Promotion__MoveAssignment_0 ) )
            // InternalChessDSL.g:3657:2: ( rule__Promotion__MoveAssignment_0 )
            {
             before(grammarAccess.getPromotionAccess().getMoveAssignment_0()); 
            // InternalChessDSL.g:3658:2: ( rule__Promotion__MoveAssignment_0 )
            // InternalChessDSL.g:3658:3: rule__Promotion__MoveAssignment_0
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
    // InternalChessDSL.g:3666:1: rule__Promotion__Group__1 : rule__Promotion__Group__1__Impl rule__Promotion__Group__2 ;
    public final void rule__Promotion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3670:1: ( rule__Promotion__Group__1__Impl rule__Promotion__Group__2 )
            // InternalChessDSL.g:3671:2: rule__Promotion__Group__1__Impl rule__Promotion__Group__2
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
    // InternalChessDSL.g:3678:1: rule__Promotion__Group__1__Impl : ( 'Promotion(' ) ;
    public final void rule__Promotion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3682:1: ( ( 'Promotion(' ) )
            // InternalChessDSL.g:3683:1: ( 'Promotion(' )
            {
            // InternalChessDSL.g:3683:1: ( 'Promotion(' )
            // InternalChessDSL.g:3684:2: 'Promotion('
            {
             before(grammarAccess.getPromotionAccess().getPromotionKeyword_1()); 
            match(input,62,FOLLOW_2); 
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
    // InternalChessDSL.g:3693:1: rule__Promotion__Group__2 : rule__Promotion__Group__2__Impl rule__Promotion__Group__3 ;
    public final void rule__Promotion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3697:1: ( rule__Promotion__Group__2__Impl rule__Promotion__Group__3 )
            // InternalChessDSL.g:3698:2: rule__Promotion__Group__2__Impl rule__Promotion__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalChessDSL.g:3705:1: rule__Promotion__Group__2__Impl : ( ( rule__Promotion__PieceAssignment_2 ) ) ;
    public final void rule__Promotion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3709:1: ( ( ( rule__Promotion__PieceAssignment_2 ) ) )
            // InternalChessDSL.g:3710:1: ( ( rule__Promotion__PieceAssignment_2 ) )
            {
            // InternalChessDSL.g:3710:1: ( ( rule__Promotion__PieceAssignment_2 ) )
            // InternalChessDSL.g:3711:2: ( rule__Promotion__PieceAssignment_2 )
            {
             before(grammarAccess.getPromotionAccess().getPieceAssignment_2()); 
            // InternalChessDSL.g:3712:2: ( rule__Promotion__PieceAssignment_2 )
            // InternalChessDSL.g:3712:3: rule__Promotion__PieceAssignment_2
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
    // InternalChessDSL.g:3720:1: rule__Promotion__Group__3 : rule__Promotion__Group__3__Impl ;
    public final void rule__Promotion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3724:1: ( rule__Promotion__Group__3__Impl )
            // InternalChessDSL.g:3725:2: rule__Promotion__Group__3__Impl
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
    // InternalChessDSL.g:3731:1: rule__Promotion__Group__3__Impl : ( ')' ) ;
    public final void rule__Promotion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3735:1: ( ( ')' ) )
            // InternalChessDSL.g:3736:1: ( ')' )
            {
            // InternalChessDSL.g:3736:1: ( ')' )
            // InternalChessDSL.g:3737:2: ')'
            {
             before(grammarAccess.getPromotionAccess().getRightParenthesisKeyword_3()); 
            match(input,50,FOLLOW_2); 
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


    // $ANTLR start "rule__Escaped_SANMove__Group__0"
    // InternalChessDSL.g:3747:1: rule__Escaped_SANMove__Group__0 : rule__Escaped_SANMove__Group__0__Impl rule__Escaped_SANMove__Group__1 ;
    public final void rule__Escaped_SANMove__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3751:1: ( rule__Escaped_SANMove__Group__0__Impl rule__Escaped_SANMove__Group__1 )
            // InternalChessDSL.g:3752:2: rule__Escaped_SANMove__Group__0__Impl rule__Escaped_SANMove__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Escaped_SANMove__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Escaped_SANMove__Group__1();

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
    // $ANTLR end "rule__Escaped_SANMove__Group__0"


    // $ANTLR start "rule__Escaped_SANMove__Group__0__Impl"
    // InternalChessDSL.g:3759:1: rule__Escaped_SANMove__Group__0__Impl : ( () ) ;
    public final void rule__Escaped_SANMove__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3763:1: ( ( () ) )
            // InternalChessDSL.g:3764:1: ( () )
            {
            // InternalChessDSL.g:3764:1: ( () )
            // InternalChessDSL.g:3765:2: ()
            {
             before(grammarAccess.getEscaped_SANMoveAccess().getSANMoveAction_0()); 
            // InternalChessDSL.g:3766:2: ()
            // InternalChessDSL.g:3766:3: 
            {
            }

             after(grammarAccess.getEscaped_SANMoveAccess().getSANMoveAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escaped_SANMove__Group__0__Impl"


    // $ANTLR start "rule__Escaped_SANMove__Group__1"
    // InternalChessDSL.g:3774:1: rule__Escaped_SANMove__Group__1 : rule__Escaped_SANMove__Group__1__Impl ;
    public final void rule__Escaped_SANMove__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3778:1: ( rule__Escaped_SANMove__Group__1__Impl )
            // InternalChessDSL.g:3779:2: rule__Escaped_SANMove__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Escaped_SANMove__Group__1__Impl();

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
    // $ANTLR end "rule__Escaped_SANMove__Group__1"


    // $ANTLR start "rule__Escaped_SANMove__Group__1__Impl"
    // InternalChessDSL.g:3785:1: rule__Escaped_SANMove__Group__1__Impl : ( ( rule__Escaped_SANMove__TokenAssignment_1 ) ) ;
    public final void rule__Escaped_SANMove__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3789:1: ( ( ( rule__Escaped_SANMove__TokenAssignment_1 ) ) )
            // InternalChessDSL.g:3790:1: ( ( rule__Escaped_SANMove__TokenAssignment_1 ) )
            {
            // InternalChessDSL.g:3790:1: ( ( rule__Escaped_SANMove__TokenAssignment_1 ) )
            // InternalChessDSL.g:3791:2: ( rule__Escaped_SANMove__TokenAssignment_1 )
            {
             before(grammarAccess.getEscaped_SANMoveAccess().getTokenAssignment_1()); 
            // InternalChessDSL.g:3792:2: ( rule__Escaped_SANMove__TokenAssignment_1 )
            // InternalChessDSL.g:3792:3: rule__Escaped_SANMove__TokenAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Escaped_SANMove__TokenAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEscaped_SANMoveAccess().getTokenAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escaped_SANMove__Group__1__Impl"


    // $ANTLR start "rule__Conclusion__Group__0"
    // InternalChessDSL.g:3801:1: rule__Conclusion__Group__0 : rule__Conclusion__Group__0__Impl rule__Conclusion__Group__1 ;
    public final void rule__Conclusion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3805:1: ( rule__Conclusion__Group__0__Impl rule__Conclusion__Group__1 )
            // InternalChessDSL.g:3806:2: rule__Conclusion__Group__0__Impl rule__Conclusion__Group__1
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
    // InternalChessDSL.g:3813:1: rule__Conclusion__Group__0__Impl : ( ( rule__Conclusion__MethodAssignment_0 )? ) ;
    public final void rule__Conclusion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3817:1: ( ( ( rule__Conclusion__MethodAssignment_0 )? ) )
            // InternalChessDSL.g:3818:1: ( ( rule__Conclusion__MethodAssignment_0 )? )
            {
            // InternalChessDSL.g:3818:1: ( ( rule__Conclusion__MethodAssignment_0 )? )
            // InternalChessDSL.g:3819:2: ( rule__Conclusion__MethodAssignment_0 )?
            {
             before(grammarAccess.getConclusionAccess().getMethodAssignment_0()); 
            // InternalChessDSL.g:3820:2: ( rule__Conclusion__MethodAssignment_0 )?
            int alt38=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA38_1 = input.LA(2);

                    if ( (LA38_1==57||LA38_1==63||(LA38_1>=67 && LA38_1<=68)) ) {
                        alt38=1;
                    }
                    }
                    break;
                case 31:
                    {
                    int LA38_2 = input.LA(2);

                    if ( (LA38_2==57||LA38_2==63||(LA38_2>=67 && LA38_2<=68)) ) {
                        alt38=1;
                    }
                    }
                    break;
                case 32:
                    {
                    int LA38_3 = input.LA(2);

                    if ( (LA38_3==57||LA38_3==63||(LA38_3>=67 && LA38_3<=68)) ) {
                        alt38=1;
                    }
                    }
                    break;
            }

            switch (alt38) {
                case 1 :
                    // InternalChessDSL.g:3820:3: rule__Conclusion__MethodAssignment_0
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
    // InternalChessDSL.g:3828:1: rule__Conclusion__Group__1 : rule__Conclusion__Group__1__Impl ;
    public final void rule__Conclusion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3832:1: ( rule__Conclusion__Group__1__Impl )
            // InternalChessDSL.g:3833:2: rule__Conclusion__Group__1__Impl
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
    // InternalChessDSL.g:3839:1: rule__Conclusion__Group__1__Impl : ( ( rule__Conclusion__ResultAssignment_1 ) ) ;
    public final void rule__Conclusion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3843:1: ( ( ( rule__Conclusion__ResultAssignment_1 ) ) )
            // InternalChessDSL.g:3844:1: ( ( rule__Conclusion__ResultAssignment_1 ) )
            {
            // InternalChessDSL.g:3844:1: ( ( rule__Conclusion__ResultAssignment_1 ) )
            // InternalChessDSL.g:3845:2: ( rule__Conclusion__ResultAssignment_1 )
            {
             before(grammarAccess.getConclusionAccess().getResultAssignment_1()); 
            // InternalChessDSL.g:3846:2: ( rule__Conclusion__ResultAssignment_1 )
            // InternalChessDSL.g:3846:3: rule__Conclusion__ResultAssignment_1
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
    // InternalChessDSL.g:3855:1: rule__TimeUp__Group__0 : rule__TimeUp__Group__0__Impl rule__TimeUp__Group__1 ;
    public final void rule__TimeUp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3859:1: ( rule__TimeUp__Group__0__Impl rule__TimeUp__Group__1 )
            // InternalChessDSL.g:3860:2: rule__TimeUp__Group__0__Impl rule__TimeUp__Group__1
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
    // InternalChessDSL.g:3867:1: rule__TimeUp__Group__0__Impl : ( ( rule__TimeUp__PlayerAssignment_0 ) ) ;
    public final void rule__TimeUp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3871:1: ( ( ( rule__TimeUp__PlayerAssignment_0 ) ) )
            // InternalChessDSL.g:3872:1: ( ( rule__TimeUp__PlayerAssignment_0 ) )
            {
            // InternalChessDSL.g:3872:1: ( ( rule__TimeUp__PlayerAssignment_0 ) )
            // InternalChessDSL.g:3873:2: ( rule__TimeUp__PlayerAssignment_0 )
            {
             before(grammarAccess.getTimeUpAccess().getPlayerAssignment_0()); 
            // InternalChessDSL.g:3874:2: ( rule__TimeUp__PlayerAssignment_0 )
            // InternalChessDSL.g:3874:3: rule__TimeUp__PlayerAssignment_0
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
    // InternalChessDSL.g:3882:1: rule__TimeUp__Group__1 : rule__TimeUp__Group__1__Impl rule__TimeUp__Group__2 ;
    public final void rule__TimeUp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3886:1: ( rule__TimeUp__Group__1__Impl rule__TimeUp__Group__2 )
            // InternalChessDSL.g:3887:2: rule__TimeUp__Group__1__Impl rule__TimeUp__Group__2
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
    // InternalChessDSL.g:3894:1: rule__TimeUp__Group__1__Impl : ( 'ran' ) ;
    public final void rule__TimeUp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3898:1: ( ( 'ran' ) )
            // InternalChessDSL.g:3899:1: ( 'ran' )
            {
            // InternalChessDSL.g:3899:1: ( 'ran' )
            // InternalChessDSL.g:3900:2: 'ran'
            {
             before(grammarAccess.getTimeUpAccess().getRanKeyword_1()); 
            match(input,63,FOLLOW_2); 
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
    // InternalChessDSL.g:3909:1: rule__TimeUp__Group__2 : rule__TimeUp__Group__2__Impl rule__TimeUp__Group__3 ;
    public final void rule__TimeUp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3913:1: ( rule__TimeUp__Group__2__Impl rule__TimeUp__Group__3 )
            // InternalChessDSL.g:3914:2: rule__TimeUp__Group__2__Impl rule__TimeUp__Group__3
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
    // InternalChessDSL.g:3921:1: rule__TimeUp__Group__2__Impl : ( 'out' ) ;
    public final void rule__TimeUp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3925:1: ( ( 'out' ) )
            // InternalChessDSL.g:3926:1: ( 'out' )
            {
            // InternalChessDSL.g:3926:1: ( 'out' )
            // InternalChessDSL.g:3927:2: 'out'
            {
             before(grammarAccess.getTimeUpAccess().getOutKeyword_2()); 
            match(input,64,FOLLOW_2); 
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
    // InternalChessDSL.g:3936:1: rule__TimeUp__Group__3 : rule__TimeUp__Group__3__Impl rule__TimeUp__Group__4 ;
    public final void rule__TimeUp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3940:1: ( rule__TimeUp__Group__3__Impl rule__TimeUp__Group__4 )
            // InternalChessDSL.g:3941:2: rule__TimeUp__Group__3__Impl rule__TimeUp__Group__4
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
    // InternalChessDSL.g:3948:1: rule__TimeUp__Group__3__Impl : ( 'of' ) ;
    public final void rule__TimeUp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3952:1: ( ( 'of' ) )
            // InternalChessDSL.g:3953:1: ( 'of' )
            {
            // InternalChessDSL.g:3953:1: ( 'of' )
            // InternalChessDSL.g:3954:2: 'of'
            {
             before(grammarAccess.getTimeUpAccess().getOfKeyword_3()); 
            match(input,65,FOLLOW_2); 
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
    // InternalChessDSL.g:3963:1: rule__TimeUp__Group__4 : rule__TimeUp__Group__4__Impl ;
    public final void rule__TimeUp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3967:1: ( rule__TimeUp__Group__4__Impl )
            // InternalChessDSL.g:3968:2: rule__TimeUp__Group__4__Impl
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
    // InternalChessDSL.g:3974:1: rule__TimeUp__Group__4__Impl : ( 'time' ) ;
    public final void rule__TimeUp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3978:1: ( ( 'time' ) )
            // InternalChessDSL.g:3979:1: ( 'time' )
            {
            // InternalChessDSL.g:3979:1: ( 'time' )
            // InternalChessDSL.g:3980:2: 'time'
            {
             before(grammarAccess.getTimeUpAccess().getTimeKeyword_4()); 
            match(input,66,FOLLOW_2); 
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
    // InternalChessDSL.g:3990:1: rule__Resign__Group__0 : rule__Resign__Group__0__Impl rule__Resign__Group__1 ;
    public final void rule__Resign__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3994:1: ( rule__Resign__Group__0__Impl rule__Resign__Group__1 )
            // InternalChessDSL.g:3995:2: rule__Resign__Group__0__Impl rule__Resign__Group__1
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
    // InternalChessDSL.g:4002:1: rule__Resign__Group__0__Impl : ( ( rule__Resign__PlayerAssignment_0 ) ) ;
    public final void rule__Resign__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4006:1: ( ( ( rule__Resign__PlayerAssignment_0 ) ) )
            // InternalChessDSL.g:4007:1: ( ( rule__Resign__PlayerAssignment_0 ) )
            {
            // InternalChessDSL.g:4007:1: ( ( rule__Resign__PlayerAssignment_0 ) )
            // InternalChessDSL.g:4008:2: ( rule__Resign__PlayerAssignment_0 )
            {
             before(grammarAccess.getResignAccess().getPlayerAssignment_0()); 
            // InternalChessDSL.g:4009:2: ( rule__Resign__PlayerAssignment_0 )
            // InternalChessDSL.g:4009:3: rule__Resign__PlayerAssignment_0
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
    // InternalChessDSL.g:4017:1: rule__Resign__Group__1 : rule__Resign__Group__1__Impl ;
    public final void rule__Resign__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4021:1: ( rule__Resign__Group__1__Impl )
            // InternalChessDSL.g:4022:2: rule__Resign__Group__1__Impl
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
    // InternalChessDSL.g:4028:1: rule__Resign__Group__1__Impl : ( 'resigned' ) ;
    public final void rule__Resign__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4032:1: ( ( 'resigned' ) )
            // InternalChessDSL.g:4033:1: ( 'resigned' )
            {
            // InternalChessDSL.g:4033:1: ( 'resigned' )
            // InternalChessDSL.g:4034:2: 'resigned'
            {
             before(grammarAccess.getResignAccess().getResignedKeyword_1()); 
            match(input,67,FOLLOW_2); 
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
    // InternalChessDSL.g:4044:1: rule__Checkmate__Group__0 : rule__Checkmate__Group__0__Impl rule__Checkmate__Group__1 ;
    public final void rule__Checkmate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4048:1: ( rule__Checkmate__Group__0__Impl rule__Checkmate__Group__1 )
            // InternalChessDSL.g:4049:2: rule__Checkmate__Group__0__Impl rule__Checkmate__Group__1
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
    // InternalChessDSL.g:4056:1: rule__Checkmate__Group__0__Impl : ( ( rule__Checkmate__Player1Assignment_0 ) ) ;
    public final void rule__Checkmate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4060:1: ( ( ( rule__Checkmate__Player1Assignment_0 ) ) )
            // InternalChessDSL.g:4061:1: ( ( rule__Checkmate__Player1Assignment_0 ) )
            {
            // InternalChessDSL.g:4061:1: ( ( rule__Checkmate__Player1Assignment_0 ) )
            // InternalChessDSL.g:4062:2: ( rule__Checkmate__Player1Assignment_0 )
            {
             before(grammarAccess.getCheckmateAccess().getPlayer1Assignment_0()); 
            // InternalChessDSL.g:4063:2: ( rule__Checkmate__Player1Assignment_0 )
            // InternalChessDSL.g:4063:3: rule__Checkmate__Player1Assignment_0
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
    // InternalChessDSL.g:4071:1: rule__Checkmate__Group__1 : rule__Checkmate__Group__1__Impl rule__Checkmate__Group__2 ;
    public final void rule__Checkmate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4075:1: ( rule__Checkmate__Group__1__Impl rule__Checkmate__Group__2 )
            // InternalChessDSL.g:4076:2: rule__Checkmate__Group__1__Impl rule__Checkmate__Group__2
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
    // InternalChessDSL.g:4083:1: rule__Checkmate__Group__1__Impl : ( 'checkmated' ) ;
    public final void rule__Checkmate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4087:1: ( ( 'checkmated' ) )
            // InternalChessDSL.g:4088:1: ( 'checkmated' )
            {
            // InternalChessDSL.g:4088:1: ( 'checkmated' )
            // InternalChessDSL.g:4089:2: 'checkmated'
            {
             before(grammarAccess.getCheckmateAccess().getCheckmatedKeyword_1()); 
            match(input,68,FOLLOW_2); 
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
    // InternalChessDSL.g:4098:1: rule__Checkmate__Group__2 : rule__Checkmate__Group__2__Impl ;
    public final void rule__Checkmate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4102:1: ( rule__Checkmate__Group__2__Impl )
            // InternalChessDSL.g:4103:2: rule__Checkmate__Group__2__Impl
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
    // InternalChessDSL.g:4109:1: rule__Checkmate__Group__2__Impl : ( ( rule__Checkmate__Player2Assignment_2 ) ) ;
    public final void rule__Checkmate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4113:1: ( ( ( rule__Checkmate__Player2Assignment_2 ) ) )
            // InternalChessDSL.g:4114:1: ( ( rule__Checkmate__Player2Assignment_2 ) )
            {
            // InternalChessDSL.g:4114:1: ( ( rule__Checkmate__Player2Assignment_2 ) )
            // InternalChessDSL.g:4115:2: ( rule__Checkmate__Player2Assignment_2 )
            {
             before(grammarAccess.getCheckmateAccess().getPlayer2Assignment_2()); 
            // InternalChessDSL.g:4116:2: ( rule__Checkmate__Player2Assignment_2 )
            // InternalChessDSL.g:4116:3: rule__Checkmate__Player2Assignment_2
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
    // InternalChessDSL.g:4125:1: rule__Draw__Group__0 : rule__Draw__Group__0__Impl rule__Draw__Group__1 ;
    public final void rule__Draw__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4129:1: ( rule__Draw__Group__0__Impl rule__Draw__Group__1 )
            // InternalChessDSL.g:4130:2: rule__Draw__Group__0__Impl rule__Draw__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalChessDSL.g:4137:1: rule__Draw__Group__0__Impl : ( ( rule__Draw__Player1Assignment_0 ) ) ;
    public final void rule__Draw__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4141:1: ( ( ( rule__Draw__Player1Assignment_0 ) ) )
            // InternalChessDSL.g:4142:1: ( ( rule__Draw__Player1Assignment_0 ) )
            {
            // InternalChessDSL.g:4142:1: ( ( rule__Draw__Player1Assignment_0 ) )
            // InternalChessDSL.g:4143:2: ( rule__Draw__Player1Assignment_0 )
            {
             before(grammarAccess.getDrawAccess().getPlayer1Assignment_0()); 
            // InternalChessDSL.g:4144:2: ( rule__Draw__Player1Assignment_0 )
            // InternalChessDSL.g:4144:3: rule__Draw__Player1Assignment_0
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
    // InternalChessDSL.g:4152:1: rule__Draw__Group__1 : rule__Draw__Group__1__Impl rule__Draw__Group__2 ;
    public final void rule__Draw__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4156:1: ( rule__Draw__Group__1__Impl rule__Draw__Group__2 )
            // InternalChessDSL.g:4157:2: rule__Draw__Group__1__Impl rule__Draw__Group__2
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
    // InternalChessDSL.g:4164:1: rule__Draw__Group__1__Impl : ( 'and' ) ;
    public final void rule__Draw__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4168:1: ( ( 'and' ) )
            // InternalChessDSL.g:4169:1: ( 'and' )
            {
            // InternalChessDSL.g:4169:1: ( 'and' )
            // InternalChessDSL.g:4170:2: 'and'
            {
             before(grammarAccess.getDrawAccess().getAndKeyword_1()); 
            match(input,57,FOLLOW_2); 
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
    // InternalChessDSL.g:4179:1: rule__Draw__Group__2 : rule__Draw__Group__2__Impl rule__Draw__Group__3 ;
    public final void rule__Draw__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4183:1: ( rule__Draw__Group__2__Impl rule__Draw__Group__3 )
            // InternalChessDSL.g:4184:2: rule__Draw__Group__2__Impl rule__Draw__Group__3
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
    // InternalChessDSL.g:4191:1: rule__Draw__Group__2__Impl : ( ( rule__Draw__Player2Assignment_2 ) ) ;
    public final void rule__Draw__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4195:1: ( ( ( rule__Draw__Player2Assignment_2 ) ) )
            // InternalChessDSL.g:4196:1: ( ( rule__Draw__Player2Assignment_2 ) )
            {
            // InternalChessDSL.g:4196:1: ( ( rule__Draw__Player2Assignment_2 ) )
            // InternalChessDSL.g:4197:2: ( rule__Draw__Player2Assignment_2 )
            {
             before(grammarAccess.getDrawAccess().getPlayer2Assignment_2()); 
            // InternalChessDSL.g:4198:2: ( rule__Draw__Player2Assignment_2 )
            // InternalChessDSL.g:4198:3: rule__Draw__Player2Assignment_2
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
    // InternalChessDSL.g:4206:1: rule__Draw__Group__3 : rule__Draw__Group__3__Impl ;
    public final void rule__Draw__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4210:1: ( rule__Draw__Group__3__Impl )
            // InternalChessDSL.g:4211:2: rule__Draw__Group__3__Impl
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
    // InternalChessDSL.g:4217:1: rule__Draw__Group__3__Impl : ( ( rule__Draw__ResultAssignment_3 ) ) ;
    public final void rule__Draw__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4221:1: ( ( ( rule__Draw__ResultAssignment_3 ) ) )
            // InternalChessDSL.g:4222:1: ( ( rule__Draw__ResultAssignment_3 ) )
            {
            // InternalChessDSL.g:4222:1: ( ( rule__Draw__ResultAssignment_3 ) )
            // InternalChessDSL.g:4223:2: ( rule__Draw__ResultAssignment_3 )
            {
             before(grammarAccess.getDrawAccess().getResultAssignment_3()); 
            // InternalChessDSL.g:4224:2: ( rule__Draw__ResultAssignment_3 )
            // InternalChessDSL.g:4224:3: rule__Draw__ResultAssignment_3
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
    // InternalChessDSL.g:4233:1: rule__Stalemate__Group__0 : rule__Stalemate__Group__0__Impl rule__Stalemate__Group__1 ;
    public final void rule__Stalemate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4237:1: ( rule__Stalemate__Group__0__Impl rule__Stalemate__Group__1 )
            // InternalChessDSL.g:4238:2: rule__Stalemate__Group__0__Impl rule__Stalemate__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalChessDSL.g:4245:1: rule__Stalemate__Group__0__Impl : ( 'ended' ) ;
    public final void rule__Stalemate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4249:1: ( ( 'ended' ) )
            // InternalChessDSL.g:4250:1: ( 'ended' )
            {
            // InternalChessDSL.g:4250:1: ( 'ended' )
            // InternalChessDSL.g:4251:2: 'ended'
            {
             before(grammarAccess.getStalemateAccess().getEndedKeyword_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalChessDSL.g:4260:1: rule__Stalemate__Group__1 : rule__Stalemate__Group__1__Impl rule__Stalemate__Group__2 ;
    public final void rule__Stalemate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4264:1: ( rule__Stalemate__Group__1__Impl rule__Stalemate__Group__2 )
            // InternalChessDSL.g:4265:2: rule__Stalemate__Group__1__Impl rule__Stalemate__Group__2
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
    // InternalChessDSL.g:4272:1: rule__Stalemate__Group__1__Impl : ( 'the' ) ;
    public final void rule__Stalemate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4276:1: ( ( 'the' ) )
            // InternalChessDSL.g:4277:1: ( 'the' )
            {
            // InternalChessDSL.g:4277:1: ( 'the' )
            // InternalChessDSL.g:4278:2: 'the'
            {
             before(grammarAccess.getStalemateAccess().getTheKeyword_1()); 
            match(input,61,FOLLOW_2); 
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
    // InternalChessDSL.g:4287:1: rule__Stalemate__Group__2 : rule__Stalemate__Group__2__Impl rule__Stalemate__Group__3 ;
    public final void rule__Stalemate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4291:1: ( rule__Stalemate__Group__2__Impl rule__Stalemate__Group__3 )
            // InternalChessDSL.g:4292:2: rule__Stalemate__Group__2__Impl rule__Stalemate__Group__3
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
    // InternalChessDSL.g:4299:1: rule__Stalemate__Group__2__Impl : ( 'game' ) ;
    public final void rule__Stalemate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4303:1: ( ( 'game' ) )
            // InternalChessDSL.g:4304:1: ( 'game' )
            {
            // InternalChessDSL.g:4304:1: ( 'game' )
            // InternalChessDSL.g:4305:2: 'game'
            {
             before(grammarAccess.getStalemateAccess().getGameKeyword_2()); 
            match(input,70,FOLLOW_2); 
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
    // InternalChessDSL.g:4314:1: rule__Stalemate__Group__3 : rule__Stalemate__Group__3__Impl rule__Stalemate__Group__4 ;
    public final void rule__Stalemate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4318:1: ( rule__Stalemate__Group__3__Impl rule__Stalemate__Group__4 )
            // InternalChessDSL.g:4319:2: rule__Stalemate__Group__3__Impl rule__Stalemate__Group__4
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
    // InternalChessDSL.g:4326:1: rule__Stalemate__Group__3__Impl : ( 'in' ) ;
    public final void rule__Stalemate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4330:1: ( ( 'in' ) )
            // InternalChessDSL.g:4331:1: ( 'in' )
            {
            // InternalChessDSL.g:4331:1: ( 'in' )
            // InternalChessDSL.g:4332:2: 'in'
            {
             before(grammarAccess.getStalemateAccess().getInKeyword_3()); 
            match(input,71,FOLLOW_2); 
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
    // InternalChessDSL.g:4341:1: rule__Stalemate__Group__4 : rule__Stalemate__Group__4__Impl rule__Stalemate__Group__5 ;
    public final void rule__Stalemate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4345:1: ( rule__Stalemate__Group__4__Impl rule__Stalemate__Group__5 )
            // InternalChessDSL.g:4346:2: rule__Stalemate__Group__4__Impl rule__Stalemate__Group__5
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
    // InternalChessDSL.g:4353:1: rule__Stalemate__Group__4__Impl : ( 'a' ) ;
    public final void rule__Stalemate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4357:1: ( ( 'a' ) )
            // InternalChessDSL.g:4358:1: ( 'a' )
            {
            // InternalChessDSL.g:4358:1: ( 'a' )
            // InternalChessDSL.g:4359:2: 'a'
            {
             before(grammarAccess.getStalemateAccess().getAKeyword_4()); 
            match(input,72,FOLLOW_2); 
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
    // InternalChessDSL.g:4368:1: rule__Stalemate__Group__5 : rule__Stalemate__Group__5__Impl ;
    public final void rule__Stalemate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4372:1: ( rule__Stalemate__Group__5__Impl )
            // InternalChessDSL.g:4373:2: rule__Stalemate__Group__5__Impl
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
    // InternalChessDSL.g:4379:1: rule__Stalemate__Group__5__Impl : ( 'stalemate' ) ;
    public final void rule__Stalemate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4383:1: ( ( 'stalemate' ) )
            // InternalChessDSL.g:4384:1: ( 'stalemate' )
            {
            // InternalChessDSL.g:4384:1: ( 'stalemate' )
            // InternalChessDSL.g:4385:2: 'stalemate'
            {
             before(grammarAccess.getStalemateAccess().getStalemateKeyword_5()); 
            match(input,73,FOLLOW_2); 
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
    // InternalChessDSL.g:4395:1: rule__Threefold__Group__0 : rule__Threefold__Group__0__Impl rule__Threefold__Group__1 ;
    public final void rule__Threefold__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4399:1: ( rule__Threefold__Group__0__Impl rule__Threefold__Group__1 )
            // InternalChessDSL.g:4400:2: rule__Threefold__Group__0__Impl rule__Threefold__Group__1
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
    // InternalChessDSL.g:4407:1: rule__Threefold__Group__0__Impl : ( 'repeated' ) ;
    public final void rule__Threefold__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4411:1: ( ( 'repeated' ) )
            // InternalChessDSL.g:4412:1: ( 'repeated' )
            {
            // InternalChessDSL.g:4412:1: ( 'repeated' )
            // InternalChessDSL.g:4413:2: 'repeated'
            {
             before(grammarAccess.getThreefoldAccess().getRepeatedKeyword_0()); 
            match(input,74,FOLLOW_2); 
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
    // InternalChessDSL.g:4422:1: rule__Threefold__Group__1 : rule__Threefold__Group__1__Impl rule__Threefold__Group__2 ;
    public final void rule__Threefold__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4426:1: ( rule__Threefold__Group__1__Impl rule__Threefold__Group__2 )
            // InternalChessDSL.g:4427:2: rule__Threefold__Group__1__Impl rule__Threefold__Group__2
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
    // InternalChessDSL.g:4434:1: rule__Threefold__Group__1__Impl : ( 'a' ) ;
    public final void rule__Threefold__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4438:1: ( ( 'a' ) )
            // InternalChessDSL.g:4439:1: ( 'a' )
            {
            // InternalChessDSL.g:4439:1: ( 'a' )
            // InternalChessDSL.g:4440:2: 'a'
            {
             before(grammarAccess.getThreefoldAccess().getAKeyword_1()); 
            match(input,72,FOLLOW_2); 
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
    // InternalChessDSL.g:4449:1: rule__Threefold__Group__2 : rule__Threefold__Group__2__Impl rule__Threefold__Group__3 ;
    public final void rule__Threefold__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4453:1: ( rule__Threefold__Group__2__Impl rule__Threefold__Group__3 )
            // InternalChessDSL.g:4454:2: rule__Threefold__Group__2__Impl rule__Threefold__Group__3
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
    // InternalChessDSL.g:4461:1: rule__Threefold__Group__2__Impl : ( 'position' ) ;
    public final void rule__Threefold__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4465:1: ( ( 'position' ) )
            // InternalChessDSL.g:4466:1: ( 'position' )
            {
            // InternalChessDSL.g:4466:1: ( 'position' )
            // InternalChessDSL.g:4467:2: 'position'
            {
             before(grammarAccess.getThreefoldAccess().getPositionKeyword_2()); 
            match(input,75,FOLLOW_2); 
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
    // InternalChessDSL.g:4476:1: rule__Threefold__Group__3 : rule__Threefold__Group__3__Impl rule__Threefold__Group__4 ;
    public final void rule__Threefold__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4480:1: ( rule__Threefold__Group__3__Impl rule__Threefold__Group__4 )
            // InternalChessDSL.g:4481:2: rule__Threefold__Group__3__Impl rule__Threefold__Group__4
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
    // InternalChessDSL.g:4488:1: rule__Threefold__Group__3__Impl : ( 'three' ) ;
    public final void rule__Threefold__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4492:1: ( ( 'three' ) )
            // InternalChessDSL.g:4493:1: ( 'three' )
            {
            // InternalChessDSL.g:4493:1: ( 'three' )
            // InternalChessDSL.g:4494:2: 'three'
            {
             before(grammarAccess.getThreefoldAccess().getThreeKeyword_3()); 
            match(input,76,FOLLOW_2); 
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
    // InternalChessDSL.g:4503:1: rule__Threefold__Group__4 : rule__Threefold__Group__4__Impl ;
    public final void rule__Threefold__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4507:1: ( rule__Threefold__Group__4__Impl )
            // InternalChessDSL.g:4508:2: rule__Threefold__Group__4__Impl
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
    // InternalChessDSL.g:4514:1: rule__Threefold__Group__4__Impl : ( 'times' ) ;
    public final void rule__Threefold__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4518:1: ( ( 'times' ) )
            // InternalChessDSL.g:4519:1: ( 'times' )
            {
            // InternalChessDSL.g:4519:1: ( 'times' )
            // InternalChessDSL.g:4520:2: 'times'
            {
             before(grammarAccess.getThreefoldAccess().getTimesKeyword_4()); 
            match(input,77,FOLLOW_2); 
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
    // InternalChessDSL.g:4530:1: rule__Fifty__Group__0 : rule__Fifty__Group__0__Impl rule__Fifty__Group__1 ;
    public final void rule__Fifty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4534:1: ( rule__Fifty__Group__0__Impl rule__Fifty__Group__1 )
            // InternalChessDSL.g:4535:2: rule__Fifty__Group__0__Impl rule__Fifty__Group__1
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
    // InternalChessDSL.g:4542:1: rule__Fifty__Group__0__Impl : ( 'played' ) ;
    public final void rule__Fifty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4546:1: ( ( 'played' ) )
            // InternalChessDSL.g:4547:1: ( 'played' )
            {
            // InternalChessDSL.g:4547:1: ( 'played' )
            // InternalChessDSL.g:4548:2: 'played'
            {
             before(grammarAccess.getFiftyAccess().getPlayedKeyword_0()); 
            match(input,78,FOLLOW_2); 
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
    // InternalChessDSL.g:4557:1: rule__Fifty__Group__1 : rule__Fifty__Group__1__Impl rule__Fifty__Group__2 ;
    public final void rule__Fifty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4561:1: ( rule__Fifty__Group__1__Impl rule__Fifty__Group__2 )
            // InternalChessDSL.g:4562:2: rule__Fifty__Group__1__Impl rule__Fifty__Group__2
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
    // InternalChessDSL.g:4569:1: rule__Fifty__Group__1__Impl : ( 'fifty' ) ;
    public final void rule__Fifty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4573:1: ( ( 'fifty' ) )
            // InternalChessDSL.g:4574:1: ( 'fifty' )
            {
            // InternalChessDSL.g:4574:1: ( 'fifty' )
            // InternalChessDSL.g:4575:2: 'fifty'
            {
             before(grammarAccess.getFiftyAccess().getFiftyKeyword_1()); 
            match(input,79,FOLLOW_2); 
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
    // InternalChessDSL.g:4584:1: rule__Fifty__Group__2 : rule__Fifty__Group__2__Impl rule__Fifty__Group__3 ;
    public final void rule__Fifty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4588:1: ( rule__Fifty__Group__2__Impl rule__Fifty__Group__3 )
            // InternalChessDSL.g:4589:2: rule__Fifty__Group__2__Impl rule__Fifty__Group__3
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
    // InternalChessDSL.g:4596:1: rule__Fifty__Group__2__Impl : ( 'moves' ) ;
    public final void rule__Fifty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4600:1: ( ( 'moves' ) )
            // InternalChessDSL.g:4601:1: ( 'moves' )
            {
            // InternalChessDSL.g:4601:1: ( 'moves' )
            // InternalChessDSL.g:4602:2: 'moves'
            {
             before(grammarAccess.getFiftyAccess().getMovesKeyword_2()); 
            match(input,52,FOLLOW_2); 
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
    // InternalChessDSL.g:4611:1: rule__Fifty__Group__3 : rule__Fifty__Group__3__Impl rule__Fifty__Group__4 ;
    public final void rule__Fifty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4615:1: ( rule__Fifty__Group__3__Impl rule__Fifty__Group__4 )
            // InternalChessDSL.g:4616:2: rule__Fifty__Group__3__Impl rule__Fifty__Group__4
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
    // InternalChessDSL.g:4623:1: rule__Fifty__Group__3__Impl : ( 'without' ) ;
    public final void rule__Fifty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4627:1: ( ( 'without' ) )
            // InternalChessDSL.g:4628:1: ( 'without' )
            {
            // InternalChessDSL.g:4628:1: ( 'without' )
            // InternalChessDSL.g:4629:2: 'without'
            {
             before(grammarAccess.getFiftyAccess().getWithoutKeyword_3()); 
            match(input,80,FOLLOW_2); 
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
    // InternalChessDSL.g:4638:1: rule__Fifty__Group__4 : rule__Fifty__Group__4__Impl rule__Fifty__Group__5 ;
    public final void rule__Fifty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4642:1: ( rule__Fifty__Group__4__Impl rule__Fifty__Group__5 )
            // InternalChessDSL.g:4643:2: rule__Fifty__Group__4__Impl rule__Fifty__Group__5
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
    // InternalChessDSL.g:4650:1: rule__Fifty__Group__4__Impl : ( 'a' ) ;
    public final void rule__Fifty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4654:1: ( ( 'a' ) )
            // InternalChessDSL.g:4655:1: ( 'a' )
            {
            // InternalChessDSL.g:4655:1: ( 'a' )
            // InternalChessDSL.g:4656:2: 'a'
            {
             before(grammarAccess.getFiftyAccess().getAKeyword_4()); 
            match(input,72,FOLLOW_2); 
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
    // InternalChessDSL.g:4665:1: rule__Fifty__Group__5 : rule__Fifty__Group__5__Impl ;
    public final void rule__Fifty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4669:1: ( rule__Fifty__Group__5__Impl )
            // InternalChessDSL.g:4670:2: rule__Fifty__Group__5__Impl
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
    // InternalChessDSL.g:4676:1: rule__Fifty__Group__5__Impl : ( 'capture' ) ;
    public final void rule__Fifty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4680:1: ( ( 'capture' ) )
            // InternalChessDSL.g:4681:1: ( 'capture' )
            {
            // InternalChessDSL.g:4681:1: ( 'capture' )
            // InternalChessDSL.g:4682:2: 'capture'
            {
             before(grammarAccess.getFiftyAccess().getCaptureKeyword_5()); 
            match(input,81,FOLLOW_2); 
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
    // InternalChessDSL.g:4692:1: rule__Agree__Group__0 : rule__Agree__Group__0__Impl rule__Agree__Group__1 ;
    public final void rule__Agree__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4696:1: ( rule__Agree__Group__0__Impl rule__Agree__Group__1 )
            // InternalChessDSL.g:4697:2: rule__Agree__Group__0__Impl rule__Agree__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalChessDSL.g:4704:1: rule__Agree__Group__0__Impl : ( 'agreed' ) ;
    public final void rule__Agree__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4708:1: ( ( 'agreed' ) )
            // InternalChessDSL.g:4709:1: ( 'agreed' )
            {
            // InternalChessDSL.g:4709:1: ( 'agreed' )
            // InternalChessDSL.g:4710:2: 'agreed'
            {
             before(grammarAccess.getAgreeAccess().getAgreedKeyword_0()); 
            match(input,82,FOLLOW_2); 
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
    // InternalChessDSL.g:4719:1: rule__Agree__Group__1 : rule__Agree__Group__1__Impl rule__Agree__Group__2 ;
    public final void rule__Agree__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4723:1: ( rule__Agree__Group__1__Impl rule__Agree__Group__2 )
            // InternalChessDSL.g:4724:2: rule__Agree__Group__1__Impl rule__Agree__Group__2
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
    // InternalChessDSL.g:4731:1: rule__Agree__Group__1__Impl : ( 'to' ) ;
    public final void rule__Agree__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4735:1: ( ( 'to' ) )
            // InternalChessDSL.g:4736:1: ( 'to' )
            {
            // InternalChessDSL.g:4736:1: ( 'to' )
            // InternalChessDSL.g:4737:2: 'to'
            {
             before(grammarAccess.getAgreeAccess().getToKeyword_1()); 
            match(input,55,FOLLOW_2); 
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
    // InternalChessDSL.g:4746:1: rule__Agree__Group__2 : rule__Agree__Group__2__Impl rule__Agree__Group__3 ;
    public final void rule__Agree__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4750:1: ( rule__Agree__Group__2__Impl rule__Agree__Group__3 )
            // InternalChessDSL.g:4751:2: rule__Agree__Group__2__Impl rule__Agree__Group__3
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
    // InternalChessDSL.g:4758:1: rule__Agree__Group__2__Impl : ( 'a' ) ;
    public final void rule__Agree__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4762:1: ( ( 'a' ) )
            // InternalChessDSL.g:4763:1: ( 'a' )
            {
            // InternalChessDSL.g:4763:1: ( 'a' )
            // InternalChessDSL.g:4764:2: 'a'
            {
             before(grammarAccess.getAgreeAccess().getAKeyword_2()); 
            match(input,72,FOLLOW_2); 
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
    // InternalChessDSL.g:4773:1: rule__Agree__Group__3 : rule__Agree__Group__3__Impl ;
    public final void rule__Agree__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4777:1: ( rule__Agree__Group__3__Impl )
            // InternalChessDSL.g:4778:2: rule__Agree__Group__3__Impl
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
    // InternalChessDSL.g:4784:1: rule__Agree__Group__3__Impl : ( 'draw' ) ;
    public final void rule__Agree__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4788:1: ( ( 'draw' ) )
            // InternalChessDSL.g:4789:1: ( 'draw' )
            {
            // InternalChessDSL.g:4789:1: ( 'draw' )
            // InternalChessDSL.g:4790:2: 'draw'
            {
             before(grammarAccess.getAgreeAccess().getDrawKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalChessDSL.g:4800:1: rule__Result__Group_0__0 : rule__Result__Group_0__0__Impl rule__Result__Group_0__1 ;
    public final void rule__Result__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4804:1: ( rule__Result__Group_0__0__Impl rule__Result__Group_0__1 )
            // InternalChessDSL.g:4805:2: rule__Result__Group_0__0__Impl rule__Result__Group_0__1
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
    // InternalChessDSL.g:4812:1: rule__Result__Group_0__0__Impl : ( ( rule__Result__Alternatives_0_0 ) ) ;
    public final void rule__Result__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4816:1: ( ( ( rule__Result__Alternatives_0_0 ) ) )
            // InternalChessDSL.g:4817:1: ( ( rule__Result__Alternatives_0_0 ) )
            {
            // InternalChessDSL.g:4817:1: ( ( rule__Result__Alternatives_0_0 ) )
            // InternalChessDSL.g:4818:2: ( rule__Result__Alternatives_0_0 )
            {
             before(grammarAccess.getResultAccess().getAlternatives_0_0()); 
            // InternalChessDSL.g:4819:2: ( rule__Result__Alternatives_0_0 )
            // InternalChessDSL.g:4819:3: rule__Result__Alternatives_0_0
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
    // InternalChessDSL.g:4827:1: rule__Result__Group_0__1 : rule__Result__Group_0__1__Impl ;
    public final void rule__Result__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4831:1: ( rule__Result__Group_0__1__Impl )
            // InternalChessDSL.g:4832:2: rule__Result__Group_0__1__Impl
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
    // InternalChessDSL.g:4838:1: rule__Result__Group_0__1__Impl : ( 'wins' ) ;
    public final void rule__Result__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4842:1: ( ( 'wins' ) )
            // InternalChessDSL.g:4843:1: ( 'wins' )
            {
            // InternalChessDSL.g:4843:1: ( 'wins' )
            // InternalChessDSL.g:4844:2: 'wins'
            {
             before(grammarAccess.getResultAccess().getWinsKeyword_0_1()); 
            match(input,83,FOLLOW_2); 
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
    // InternalChessDSL.g:4854:1: rule__Model__GameAssignment : ( ruleGame ) ;
    public final void rule__Model__GameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4858:1: ( ( ruleGame ) )
            // InternalChessDSL.g:4859:2: ( ruleGame )
            {
            // InternalChessDSL.g:4859:2: ( ruleGame )
            // InternalChessDSL.g:4860:3: ruleGame
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
    // InternalChessDSL.g:4869:1: rule__Game__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Game__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4873:1: ( ( RULE_STRING ) )
            // InternalChessDSL.g:4874:2: ( RULE_STRING )
            {
            // InternalChessDSL.g:4874:2: ( RULE_STRING )
            // InternalChessDSL.g:4875:3: RULE_STRING
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
    // InternalChessDSL.g:4884:1: rule__Game__PlayersAssignment_2_1 : ( rulePlayer ) ;
    public final void rule__Game__PlayersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4888:1: ( ( rulePlayer ) )
            // InternalChessDSL.g:4889:2: ( rulePlayer )
            {
            // InternalChessDSL.g:4889:2: ( rulePlayer )
            // InternalChessDSL.g:4890:3: rulePlayer
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
    // InternalChessDSL.g:4899:1: rule__Game__InitialAssignment_3 : ( ruleInitialState ) ;
    public final void rule__Game__InitialAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4903:1: ( ( ruleInitialState ) )
            // InternalChessDSL.g:4904:2: ( ruleInitialState )
            {
            // InternalChessDSL.g:4904:2: ( ruleInitialState )
            // InternalChessDSL.g:4905:3: ruleInitialState
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
    // InternalChessDSL.g:4914:1: rule__Game__MovesAssignment_5 : ( ruleMovePair ) ;
    public final void rule__Game__MovesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4918:1: ( ( ruleMovePair ) )
            // InternalChessDSL.g:4919:2: ( ruleMovePair )
            {
            // InternalChessDSL.g:4919:2: ( ruleMovePair )
            // InternalChessDSL.g:4920:3: ruleMovePair
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
    // InternalChessDSL.g:4929:1: rule__Game__ConclusionAssignment_7 : ( ruleConclusion ) ;
    public final void rule__Game__ConclusionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4933:1: ( ( ruleConclusion ) )
            // InternalChessDSL.g:4934:2: ( ruleConclusion )
            {
            // InternalChessDSL.g:4934:2: ( ruleConclusion )
            // InternalChessDSL.g:4935:3: ruleConclusion
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
    // InternalChessDSL.g:4944:1: rule__Player__ColorAssignment_0 : ( ruleColor ) ;
    public final void rule__Player__ColorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4948:1: ( ( ruleColor ) )
            // InternalChessDSL.g:4949:2: ( ruleColor )
            {
            // InternalChessDSL.g:4949:2: ( ruleColor )
            // InternalChessDSL.g:4950:3: ruleColor
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
    // InternalChessDSL.g:4959:1: rule__Player__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Player__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4963:1: ( ( RULE_STRING ) )
            // InternalChessDSL.g:4964:2: ( RULE_STRING )
            {
            // InternalChessDSL.g:4964:2: ( RULE_STRING )
            // InternalChessDSL.g:4965:3: RULE_STRING
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
    // InternalChessDSL.g:4974:1: rule__InitialState__PositionsAssignment_2_1_1 : ( ruleCustomPositions ) ;
    public final void rule__InitialState__PositionsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4978:1: ( ( ruleCustomPositions ) )
            // InternalChessDSL.g:4979:2: ( ruleCustomPositions )
            {
            // InternalChessDSL.g:4979:2: ( ruleCustomPositions )
            // InternalChessDSL.g:4980:3: ruleCustomPositions
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
    // InternalChessDSL.g:4989:1: rule__CustomPositions__PlacementAssignment_3 : ( rulePlacement ) ;
    public final void rule__CustomPositions__PlacementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4993:1: ( ( rulePlacement ) )
            // InternalChessDSL.g:4994:2: ( rulePlacement )
            {
            // InternalChessDSL.g:4994:2: ( rulePlacement )
            // InternalChessDSL.g:4995:3: rulePlacement
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
    // InternalChessDSL.g:5004:1: rule__Placement__PieceAssignment_0 : ( ruleCustomPiece ) ;
    public final void rule__Placement__PieceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5008:1: ( ( ruleCustomPiece ) )
            // InternalChessDSL.g:5009:2: ( ruleCustomPiece )
            {
            // InternalChessDSL.g:5009:2: ( ruleCustomPiece )
            // InternalChessDSL.g:5010:3: ruleCustomPiece
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
    // InternalChessDSL.g:5019:1: rule__Placement__SquareAssignment_2 : ( ruleSquare ) ;
    public final void rule__Placement__SquareAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5023:1: ( ( ruleSquare ) )
            // InternalChessDSL.g:5024:2: ( ruleSquare )
            {
            // InternalChessDSL.g:5024:2: ( ruleSquare )
            // InternalChessDSL.g:5025:3: ruleSquare
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
    // InternalChessDSL.g:5034:1: rule__CustomPiece__ColorAssignment_0 : ( ruleColor ) ;
    public final void rule__CustomPiece__ColorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5038:1: ( ( ruleColor ) )
            // InternalChessDSL.g:5039:2: ( ruleColor )
            {
            // InternalChessDSL.g:5039:2: ( ruleColor )
            // InternalChessDSL.g:5040:3: ruleColor
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
    // InternalChessDSL.g:5049:1: rule__CustomPiece__KindAssignment_1 : ( rulePiece ) ;
    public final void rule__CustomPiece__KindAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5053:1: ( ( rulePiece ) )
            // InternalChessDSL.g:5054:2: ( rulePiece )
            {
            // InternalChessDSL.g:5054:2: ( rulePiece )
            // InternalChessDSL.g:5055:3: rulePiece
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
    // InternalChessDSL.g:5064:1: rule__MovePair__MoveNumberAssignment_0 : ( RULE_MOVENUMBER ) ;
    public final void rule__MovePair__MoveNumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5068:1: ( ( RULE_MOVENUMBER ) )
            // InternalChessDSL.g:5069:2: ( RULE_MOVENUMBER )
            {
            // InternalChessDSL.g:5069:2: ( RULE_MOVENUMBER )
            // InternalChessDSL.g:5070:3: RULE_MOVENUMBER
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
    // InternalChessDSL.g:5079:1: rule__MovePair__Color1Assignment_1_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__MovePair__Color1Assignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5083:1: ( ( ( RULE_ID ) ) )
            // InternalChessDSL.g:5084:2: ( ( RULE_ID ) )
            {
            // InternalChessDSL.g:5084:2: ( ( RULE_ID ) )
            // InternalChessDSL.g:5085:3: ( RULE_ID )
            {
             before(grammarAccess.getMovePairAccess().getColor1PlayerOrColorCrossReference_1_0_0_0()); 
            // InternalChessDSL.g:5086:3: ( RULE_ID )
            // InternalChessDSL.g:5087:4: RULE_ID
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
    // InternalChessDSL.g:5098:1: rule__MovePair__WhiteMoveAssignment_1_0_1 : ( ruleAnyMove ) ;
    public final void rule__MovePair__WhiteMoveAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5102:1: ( ( ruleAnyMove ) )
            // InternalChessDSL.g:5103:2: ( ruleAnyMove )
            {
            // InternalChessDSL.g:5103:2: ( ruleAnyMove )
            // InternalChessDSL.g:5104:3: ruleAnyMove
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
    // InternalChessDSL.g:5113:1: rule__MovePair__Color2Assignment_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__MovePair__Color2Assignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5117:1: ( ( ( RULE_ID ) ) )
            // InternalChessDSL.g:5118:2: ( ( RULE_ID ) )
            {
            // InternalChessDSL.g:5118:2: ( ( RULE_ID ) )
            // InternalChessDSL.g:5119:3: ( RULE_ID )
            {
             before(grammarAccess.getMovePairAccess().getColor2PlayerOrColorCrossReference_2_0_0()); 
            // InternalChessDSL.g:5120:3: ( RULE_ID )
            // InternalChessDSL.g:5121:4: RULE_ID
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
    // InternalChessDSL.g:5132:1: rule__MovePair__BlackMoveAssignment_2_1 : ( ruleAnyMove ) ;
    public final void rule__MovePair__BlackMoveAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5136:1: ( ( ruleAnyMove ) )
            // InternalChessDSL.g:5137:2: ( ruleAnyMove )
            {
            // InternalChessDSL.g:5137:2: ( ruleAnyMove )
            // InternalChessDSL.g:5138:3: ruleAnyMove
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


    // $ANTLR start "rule__AnyMove__AlgebraicmoveAssignment_0"
    // InternalChessDSL.g:5147:1: rule__AnyMove__AlgebraicmoveAssignment_0 : ( ruleEscaped_SANMove ) ;
    public final void rule__AnyMove__AlgebraicmoveAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5151:1: ( ( ruleEscaped_SANMove ) )
            // InternalChessDSL.g:5152:2: ( ruleEscaped_SANMove )
            {
            // InternalChessDSL.g:5152:2: ( ruleEscaped_SANMove )
            // InternalChessDSL.g:5153:3: ruleEscaped_SANMove
            {
             before(grammarAccess.getAnyMoveAccess().getAlgebraicmoveEscaped_SANMoveParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEscaped_SANMove();

            state._fsp--;

             after(grammarAccess.getAnyMoveAccess().getAlgebraicmoveEscaped_SANMoveParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyMove__AlgebraicmoveAssignment_0"


    // $ANTLR start "rule__AnyMove__MoveAssignment_1_0"
    // InternalChessDSL.g:5162:1: rule__AnyMove__MoveAssignment_1_0 : ( ruleDSLMove ) ;
    public final void rule__AnyMove__MoveAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5166:1: ( ( ruleDSLMove ) )
            // InternalChessDSL.g:5167:2: ( ruleDSLMove )
            {
            // InternalChessDSL.g:5167:2: ( ruleDSLMove )
            // InternalChessDSL.g:5168:3: ruleDSLMove
            {
             before(grammarAccess.getAnyMoveAccess().getMoveDSLMoveParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDSLMove();

            state._fsp--;

             after(grammarAccess.getAnyMoveAccess().getMoveDSLMoveParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyMove__MoveAssignment_1_0"


    // $ANTLR start "rule__AnyMove__RemarksAssignment_1_1_1"
    // InternalChessDSL.g:5177:1: rule__AnyMove__RemarksAssignment_1_1_1 : ( ruleRemark ) ;
    public final void rule__AnyMove__RemarksAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5181:1: ( ( ruleRemark ) )
            // InternalChessDSL.g:5182:2: ( ruleRemark )
            {
            // InternalChessDSL.g:5182:2: ( ruleRemark )
            // InternalChessDSL.g:5183:3: ruleRemark
            {
             before(grammarAccess.getAnyMoveAccess().getRemarksRemarkEnumRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRemark();

            state._fsp--;

             after(grammarAccess.getAnyMoveAccess().getRemarksRemarkEnumRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyMove__RemarksAssignment_1_1_1"


    // $ANTLR start "rule__Move__PieceAssignment_1"
    // InternalChessDSL.g:5192:1: rule__Move__PieceAssignment_1 : ( rulePiece ) ;
    public final void rule__Move__PieceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5196:1: ( ( rulePiece ) )
            // InternalChessDSL.g:5197:2: ( rulePiece )
            {
            // InternalChessDSL.g:5197:2: ( rulePiece )
            // InternalChessDSL.g:5198:3: rulePiece
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
    // InternalChessDSL.g:5207:1: rule__Move__FromAssignment_2_0_1 : ( ruleSquare ) ;
    public final void rule__Move__FromAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5211:1: ( ( ruleSquare ) )
            // InternalChessDSL.g:5212:2: ( ruleSquare )
            {
            // InternalChessDSL.g:5212:2: ( ruleSquare )
            // InternalChessDSL.g:5213:3: ruleSquare
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
    // InternalChessDSL.g:5222:1: rule__Move__ToAssignment_2_0_3 : ( ruleSquare ) ;
    public final void rule__Move__ToAssignment_2_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5226:1: ( ( ruleSquare ) )
            // InternalChessDSL.g:5227:2: ( ruleSquare )
            {
            // InternalChessDSL.g:5227:2: ( ruleSquare )
            // InternalChessDSL.g:5228:3: ruleSquare
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
    // InternalChessDSL.g:5237:1: rule__Move__FromAssignment_2_1_1 : ( ruleSquare ) ;
    public final void rule__Move__FromAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5241:1: ( ( ruleSquare ) )
            // InternalChessDSL.g:5242:2: ( ruleSquare )
            {
            // InternalChessDSL.g:5242:2: ( ruleSquare )
            // InternalChessDSL.g:5243:3: ruleSquare
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
    // InternalChessDSL.g:5252:1: rule__Move__ToAssignment_2_1_3 : ( ruleSquare ) ;
    public final void rule__Move__ToAssignment_2_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5256:1: ( ( ruleSquare ) )
            // InternalChessDSL.g:5257:2: ( ruleSquare )
            {
            // InternalChessDSL.g:5257:2: ( ruleSquare )
            // InternalChessDSL.g:5258:3: ruleSquare
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
    // InternalChessDSL.g:5267:1: rule__Capture__MoveAssignment_0 : ( ruleMove ) ;
    public final void rule__Capture__MoveAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5271:1: ( ( ruleMove ) )
            // InternalChessDSL.g:5272:2: ( ruleMove )
            {
            // InternalChessDSL.g:5272:2: ( ruleMove )
            // InternalChessDSL.g:5273:3: ruleMove
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
    // InternalChessDSL.g:5282:1: rule__Capture__CaptureAssignment_1_0_1 : ( rulePiece ) ;
    public final void rule__Capture__CaptureAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5286:1: ( ( rulePiece ) )
            // InternalChessDSL.g:5287:2: ( rulePiece )
            {
            // InternalChessDSL.g:5287:2: ( rulePiece )
            // InternalChessDSL.g:5288:3: rulePiece
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
    // InternalChessDSL.g:5297:1: rule__Capture__CaptureAssignment_1_1_2 : ( rulePiece ) ;
    public final void rule__Capture__CaptureAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5301:1: ( ( rulePiece ) )
            // InternalChessDSL.g:5302:2: ( rulePiece )
            {
            // InternalChessDSL.g:5302:2: ( rulePiece )
            // InternalChessDSL.g:5303:3: rulePiece
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
    // InternalChessDSL.g:5312:1: rule__Castle__SideAssignment_0_1 : ( ( rule__Castle__SideAlternatives_0_1_0 ) ) ;
    public final void rule__Castle__SideAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5316:1: ( ( ( rule__Castle__SideAlternatives_0_1_0 ) ) )
            // InternalChessDSL.g:5317:2: ( ( rule__Castle__SideAlternatives_0_1_0 ) )
            {
            // InternalChessDSL.g:5317:2: ( ( rule__Castle__SideAlternatives_0_1_0 ) )
            // InternalChessDSL.g:5318:3: ( rule__Castle__SideAlternatives_0_1_0 )
            {
             before(grammarAccess.getCastleAccess().getSideAlternatives_0_1_0()); 
            // InternalChessDSL.g:5319:3: ( rule__Castle__SideAlternatives_0_1_0 )
            // InternalChessDSL.g:5319:4: rule__Castle__SideAlternatives_0_1_0
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
    // InternalChessDSL.g:5327:1: rule__Castle__SideAssignment_1_2 : ( ( rule__Castle__SideAlternatives_1_2_0 ) ) ;
    public final void rule__Castle__SideAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5331:1: ( ( ( rule__Castle__SideAlternatives_1_2_0 ) ) )
            // InternalChessDSL.g:5332:2: ( ( rule__Castle__SideAlternatives_1_2_0 ) )
            {
            // InternalChessDSL.g:5332:2: ( ( rule__Castle__SideAlternatives_1_2_0 ) )
            // InternalChessDSL.g:5333:3: ( rule__Castle__SideAlternatives_1_2_0 )
            {
             before(grammarAccess.getCastleAccess().getSideAlternatives_1_2_0()); 
            // InternalChessDSL.g:5334:3: ( rule__Castle__SideAlternatives_1_2_0 )
            // InternalChessDSL.g:5334:4: rule__Castle__SideAlternatives_1_2_0
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
    // InternalChessDSL.g:5342:1: rule__Castle__MoveAssignment_2_0 : ( ruleMove ) ;
    public final void rule__Castle__MoveAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5346:1: ( ( ruleMove ) )
            // InternalChessDSL.g:5347:2: ( ruleMove )
            {
            // InternalChessDSL.g:5347:2: ( ruleMove )
            // InternalChessDSL.g:5348:3: ruleMove
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
    // InternalChessDSL.g:5357:1: rule__Castle__SideAssignment_2_2 : ( ( rule__Castle__SideAlternatives_2_2_0 ) ) ;
    public final void rule__Castle__SideAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5361:1: ( ( ( rule__Castle__SideAlternatives_2_2_0 ) ) )
            // InternalChessDSL.g:5362:2: ( ( rule__Castle__SideAlternatives_2_2_0 ) )
            {
            // InternalChessDSL.g:5362:2: ( ( rule__Castle__SideAlternatives_2_2_0 ) )
            // InternalChessDSL.g:5363:3: ( rule__Castle__SideAlternatives_2_2_0 )
            {
             before(grammarAccess.getCastleAccess().getSideAlternatives_2_2_0()); 
            // InternalChessDSL.g:5364:3: ( rule__Castle__SideAlternatives_2_2_0 )
            // InternalChessDSL.g:5364:4: rule__Castle__SideAlternatives_2_2_0
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
    // InternalChessDSL.g:5372:1: rule__Castle__MoveAssignment_3_0 : ( ruleMove ) ;
    public final void rule__Castle__MoveAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5376:1: ( ( ruleMove ) )
            // InternalChessDSL.g:5377:2: ( ruleMove )
            {
            // InternalChessDSL.g:5377:2: ( ruleMove )
            // InternalChessDSL.g:5378:3: ruleMove
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
    // InternalChessDSL.g:5387:1: rule__Castle__SideAssignment_3_3 : ( ( rule__Castle__SideAlternatives_3_3_0 ) ) ;
    public final void rule__Castle__SideAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5391:1: ( ( ( rule__Castle__SideAlternatives_3_3_0 ) ) )
            // InternalChessDSL.g:5392:2: ( ( rule__Castle__SideAlternatives_3_3_0 ) )
            {
            // InternalChessDSL.g:5392:2: ( ( rule__Castle__SideAlternatives_3_3_0 ) )
            // InternalChessDSL.g:5393:3: ( rule__Castle__SideAlternatives_3_3_0 )
            {
             before(grammarAccess.getCastleAccess().getSideAlternatives_3_3_0()); 
            // InternalChessDSL.g:5394:3: ( rule__Castle__SideAlternatives_3_3_0 )
            // InternalChessDSL.g:5394:4: rule__Castle__SideAlternatives_3_3_0
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
    // InternalChessDSL.g:5402:1: rule__EnPassant__CaptureAssignment_0 : ( ruleCapture ) ;
    public final void rule__EnPassant__CaptureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5406:1: ( ( ruleCapture ) )
            // InternalChessDSL.g:5407:2: ( ruleCapture )
            {
            // InternalChessDSL.g:5407:2: ( ruleCapture )
            // InternalChessDSL.g:5408:3: ruleCapture
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
    // InternalChessDSL.g:5417:1: rule__EnPassant__SquareAssignment_2 : ( ruleSquare ) ;
    public final void rule__EnPassant__SquareAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5421:1: ( ( ruleSquare ) )
            // InternalChessDSL.g:5422:2: ( ruleSquare )
            {
            // InternalChessDSL.g:5422:2: ( ruleSquare )
            // InternalChessDSL.g:5423:3: ruleSquare
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
    // InternalChessDSL.g:5432:1: rule__Promotion__MoveAssignment_0 : ( ( rule__Promotion__MoveAlternatives_0_0 ) ) ;
    public final void rule__Promotion__MoveAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5436:1: ( ( ( rule__Promotion__MoveAlternatives_0_0 ) ) )
            // InternalChessDSL.g:5437:2: ( ( rule__Promotion__MoveAlternatives_0_0 ) )
            {
            // InternalChessDSL.g:5437:2: ( ( rule__Promotion__MoveAlternatives_0_0 ) )
            // InternalChessDSL.g:5438:3: ( rule__Promotion__MoveAlternatives_0_0 )
            {
             before(grammarAccess.getPromotionAccess().getMoveAlternatives_0_0()); 
            // InternalChessDSL.g:5439:3: ( rule__Promotion__MoveAlternatives_0_0 )
            // InternalChessDSL.g:5439:4: rule__Promotion__MoveAlternatives_0_0
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
    // InternalChessDSL.g:5447:1: rule__Promotion__PieceAssignment_2 : ( rulePiece ) ;
    public final void rule__Promotion__PieceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5451:1: ( ( rulePiece ) )
            // InternalChessDSL.g:5452:2: ( rulePiece )
            {
            // InternalChessDSL.g:5452:2: ( rulePiece )
            // InternalChessDSL.g:5453:3: rulePiece
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


    // $ANTLR start "rule__Escaped_SANMove__TokenAssignment_1"
    // InternalChessDSL.g:5462:1: rule__Escaped_SANMove__TokenAssignment_1 : ( RULE_SAN_TOKEN ) ;
    public final void rule__Escaped_SANMove__TokenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5466:1: ( ( RULE_SAN_TOKEN ) )
            // InternalChessDSL.g:5467:2: ( RULE_SAN_TOKEN )
            {
            // InternalChessDSL.g:5467:2: ( RULE_SAN_TOKEN )
            // InternalChessDSL.g:5468:3: RULE_SAN_TOKEN
            {
             before(grammarAccess.getEscaped_SANMoveAccess().getTokenSAN_TOKENTerminalRuleCall_1_0()); 
            match(input,RULE_SAN_TOKEN,FOLLOW_2); 
             after(grammarAccess.getEscaped_SANMoveAccess().getTokenSAN_TOKENTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escaped_SANMove__TokenAssignment_1"


    // $ANTLR start "rule__Conclusion__MethodAssignment_0"
    // InternalChessDSL.g:5477:1: rule__Conclusion__MethodAssignment_0 : ( ruleMethod ) ;
    public final void rule__Conclusion__MethodAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5481:1: ( ( ruleMethod ) )
            // InternalChessDSL.g:5482:2: ( ruleMethod )
            {
            // InternalChessDSL.g:5482:2: ( ruleMethod )
            // InternalChessDSL.g:5483:3: ruleMethod
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
    // InternalChessDSL.g:5492:1: rule__Conclusion__ResultAssignment_1 : ( ruleResult ) ;
    public final void rule__Conclusion__ResultAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5496:1: ( ( ruleResult ) )
            // InternalChessDSL.g:5497:2: ( ruleResult )
            {
            // InternalChessDSL.g:5497:2: ( ruleResult )
            // InternalChessDSL.g:5498:3: ruleResult
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
    // InternalChessDSL.g:5507:1: rule__Method__WinAssignment_0 : ( ruleWin ) ;
    public final void rule__Method__WinAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5511:1: ( ( ruleWin ) )
            // InternalChessDSL.g:5512:2: ( ruleWin )
            {
            // InternalChessDSL.g:5512:2: ( ruleWin )
            // InternalChessDSL.g:5513:3: ruleWin
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
    // InternalChessDSL.g:5522:1: rule__Method__DrawAssignment_1 : ( ruleDraw ) ;
    public final void rule__Method__DrawAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5526:1: ( ( ruleDraw ) )
            // InternalChessDSL.g:5527:2: ( ruleDraw )
            {
            // InternalChessDSL.g:5527:2: ( ruleDraw )
            // InternalChessDSL.g:5528:3: ruleDraw
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
    // InternalChessDSL.g:5537:1: rule__Win__TimeAssignment_0 : ( ruleTimeUp ) ;
    public final void rule__Win__TimeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5541:1: ( ( ruleTimeUp ) )
            // InternalChessDSL.g:5542:2: ( ruleTimeUp )
            {
            // InternalChessDSL.g:5542:2: ( ruleTimeUp )
            // InternalChessDSL.g:5543:3: ruleTimeUp
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
    // InternalChessDSL.g:5552:1: rule__Win__ResignAssignment_1 : ( ruleResign ) ;
    public final void rule__Win__ResignAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5556:1: ( ( ruleResign ) )
            // InternalChessDSL.g:5557:2: ( ruleResign )
            {
            // InternalChessDSL.g:5557:2: ( ruleResign )
            // InternalChessDSL.g:5558:3: ruleResign
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
    // InternalChessDSL.g:5567:1: rule__Win__MateAssignment_2 : ( ruleCheckmate ) ;
    public final void rule__Win__MateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5571:1: ( ( ruleCheckmate ) )
            // InternalChessDSL.g:5572:2: ( ruleCheckmate )
            {
            // InternalChessDSL.g:5572:2: ( ruleCheckmate )
            // InternalChessDSL.g:5573:3: ruleCheckmate
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
    // InternalChessDSL.g:5582:1: rule__TimeUp__PlayerAssignment_0 : ( rulePlayerOrColor ) ;
    public final void rule__TimeUp__PlayerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5586:1: ( ( rulePlayerOrColor ) )
            // InternalChessDSL.g:5587:2: ( rulePlayerOrColor )
            {
            // InternalChessDSL.g:5587:2: ( rulePlayerOrColor )
            // InternalChessDSL.g:5588:3: rulePlayerOrColor
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
    // InternalChessDSL.g:5597:1: rule__Resign__PlayerAssignment_0 : ( rulePlayerOrColor ) ;
    public final void rule__Resign__PlayerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5601:1: ( ( rulePlayerOrColor ) )
            // InternalChessDSL.g:5602:2: ( rulePlayerOrColor )
            {
            // InternalChessDSL.g:5602:2: ( rulePlayerOrColor )
            // InternalChessDSL.g:5603:3: rulePlayerOrColor
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
    // InternalChessDSL.g:5612:1: rule__Checkmate__Player1Assignment_0 : ( rulePlayerOrColor ) ;
    public final void rule__Checkmate__Player1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5616:1: ( ( rulePlayerOrColor ) )
            // InternalChessDSL.g:5617:2: ( rulePlayerOrColor )
            {
            // InternalChessDSL.g:5617:2: ( rulePlayerOrColor )
            // InternalChessDSL.g:5618:3: rulePlayerOrColor
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
    // InternalChessDSL.g:5627:1: rule__Checkmate__Player2Assignment_2 : ( rulePlayerOrColor ) ;
    public final void rule__Checkmate__Player2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5631:1: ( ( rulePlayerOrColor ) )
            // InternalChessDSL.g:5632:2: ( rulePlayerOrColor )
            {
            // InternalChessDSL.g:5632:2: ( rulePlayerOrColor )
            // InternalChessDSL.g:5633:3: rulePlayerOrColor
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
    // InternalChessDSL.g:5642:1: rule__Draw__Player1Assignment_0 : ( rulePlayerOrColor ) ;
    public final void rule__Draw__Player1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5646:1: ( ( rulePlayerOrColor ) )
            // InternalChessDSL.g:5647:2: ( rulePlayerOrColor )
            {
            // InternalChessDSL.g:5647:2: ( rulePlayerOrColor )
            // InternalChessDSL.g:5648:3: rulePlayerOrColor
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
    // InternalChessDSL.g:5657:1: rule__Draw__Player2Assignment_2 : ( rulePlayerOrColor ) ;
    public final void rule__Draw__Player2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5661:1: ( ( rulePlayerOrColor ) )
            // InternalChessDSL.g:5662:2: ( rulePlayerOrColor )
            {
            // InternalChessDSL.g:5662:2: ( rulePlayerOrColor )
            // InternalChessDSL.g:5663:3: rulePlayerOrColor
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
    // InternalChessDSL.g:5672:1: rule__Draw__ResultAssignment_3 : ( ( rule__Draw__ResultAlternatives_3_0 ) ) ;
    public final void rule__Draw__ResultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5676:1: ( ( ( rule__Draw__ResultAlternatives_3_0 ) ) )
            // InternalChessDSL.g:5677:2: ( ( rule__Draw__ResultAlternatives_3_0 ) )
            {
            // InternalChessDSL.g:5677:2: ( ( rule__Draw__ResultAlternatives_3_0 ) )
            // InternalChessDSL.g:5678:3: ( rule__Draw__ResultAlternatives_3_0 )
            {
             before(grammarAccess.getDrawAccess().getResultAlternatives_3_0()); 
            // InternalChessDSL.g:5679:3: ( rule__Draw__ResultAlternatives_3_0 )
            // InternalChessDSL.g:5679:4: rule__Draw__ResultAlternatives_3_0
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
    // InternalChessDSL.g:5687:1: rule__Result__PlayerAssignment_0_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Result__PlayerAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5691:1: ( ( ( RULE_ID ) ) )
            // InternalChessDSL.g:5692:2: ( ( RULE_ID ) )
            {
            // InternalChessDSL.g:5692:2: ( ( RULE_ID ) )
            // InternalChessDSL.g:5693:3: ( RULE_ID )
            {
             before(grammarAccess.getResultAccess().getPlayerPlayerCrossReference_0_0_0_0()); 
            // InternalChessDSL.g:5694:3: ( RULE_ID )
            // InternalChessDSL.g:5695:4: RULE_ID
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
    // InternalChessDSL.g:5706:1: rule__Result__ColorAssignment_0_0_1 : ( ruleColor ) ;
    public final void rule__Result__ColorAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5710:1: ( ( ruleColor ) )
            // InternalChessDSL.g:5711:2: ( ruleColor )
            {
            // InternalChessDSL.g:5711:2: ( ruleColor )
            // InternalChessDSL.g:5712:3: ruleColor
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
    // InternalChessDSL.g:5721:1: rule__PlayerOrColor__PlayerAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PlayerOrColor__PlayerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5725:1: ( ( ( RULE_ID ) ) )
            // InternalChessDSL.g:5726:2: ( ( RULE_ID ) )
            {
            // InternalChessDSL.g:5726:2: ( ( RULE_ID ) )
            // InternalChessDSL.g:5727:3: ( RULE_ID )
            {
             before(grammarAccess.getPlayerOrColorAccess().getPlayerPlayerCrossReference_0_0()); 
            // InternalChessDSL.g:5728:3: ( RULE_ID )
            // InternalChessDSL.g:5729:4: RULE_ID
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
    // InternalChessDSL.g:5740:1: rule__PlayerOrColor__ColorAssignment_1 : ( ruleColor ) ;
    public final void rule__PlayerOrColor__ColorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5744:1: ( ( ruleColor ) )
            // InternalChessDSL.g:5745:2: ( ruleColor )
            {
            // InternalChessDSL.g:5745:2: ( ruleColor )
            // InternalChessDSL.g:5746:3: ruleColor
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
    // InternalChessDSL.g:5755:1: rule__Square__SquareAssignment : ( RULE_SQUARETERMINAL ) ;
    public final void rule__Square__SquareAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5759:1: ( ( RULE_SQUARETERMINAL ) )
            // InternalChessDSL.g:5760:2: ( RULE_SQUARETERMINAL )
            {
            // InternalChessDSL.g:5760:2: ( RULE_SQUARETERMINAL )
            // InternalChessDSL.g:5761:3: RULE_SQUARETERMINAL
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


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String dfa_1s = "\53\uffff";
    static final String dfa_2s = "\21\uffff\2\24\16\uffff\6\52\1\uffff\1\52\2\uffff";
    static final String dfa_3s = "\2\41\6\61\2\uffff\2\10\1\65\1\67\2\10\1\62\2\5\2\uffff\1\25\1\41\1\72\1\41\10\62\6\5\1\uffff\1\5\2\uffff";
    static final String dfa_4s = "\1\74\1\46\6\66\2\uffff\2\10\1\65\1\67\2\10\1\62\2\76\2\uffff\1\26\1\46\1\74\1\46\10\62\6\76\1\uffff\1\76\2\uffff";
    static final String dfa_5s = "\10\uffff\1\3\1\6\11\uffff\1\5\1\1\22\uffff\1\1\1\uffff\1\4\1\2";
    static final String dfa_6s = "\53\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\3\1\4\1\5\1\6\1\7\14\uffff\1\11\1\1\6\uffff\2\10",
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
            "\3\24\31\uffff\6\24\2\uffff\1\24\7\uffff\1\24\1\uffff\2\24\3\uffff\1\26\1\27\1\30\1\25\1\24\1\uffff\1\23",
            "\3\24\31\uffff\6\24\2\uffff\1\24\7\uffff\1\24\1\uffff\2\24\3\uffff\1\26\1\27\1\30\1\25\1\24\1\uffff\1\23",
            "",
            "",
            "\1\31\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40",
            "\1\30\1\uffff\1\10",
            "\1\41\1\42\1\43\1\44\1\45\1\46",
            "\1\47",
            "\1\47",
            "\1\50",
            "\1\50",
            "\1\50",
            "\1\50",
            "\1\50",
            "\1\50",
            "\3\52\13\uffff\1\51\15\uffff\6\52\2\uffff\1\52\7\uffff\1\52\1\uffff\2\52\6\uffff\2\52\1\uffff\1\23",
            "\3\52\13\uffff\1\51\15\uffff\6\52\2\uffff\1\52\7\uffff\1\52\1\uffff\2\52\6\uffff\2\52\1\uffff\1\23",
            "\3\52\13\uffff\1\51\15\uffff\6\52\2\uffff\1\52\7\uffff\1\52\1\uffff\2\52\6\uffff\2\52\1\uffff\1\23",
            "\3\52\13\uffff\1\51\15\uffff\6\52\2\uffff\1\52\7\uffff\1\52\1\uffff\2\52\6\uffff\2\52\1\uffff\1\23",
            "\3\52\13\uffff\1\51\15\uffff\6\52\2\uffff\1\52\7\uffff\1\52\1\uffff\2\52\6\uffff\2\52\1\uffff\1\23",
            "\3\52\13\uffff\1\51\15\uffff\6\52\2\uffff\1\52\7\uffff\1\52\1\uffff\2\52\6\uffff\2\52\1\uffff\1\23",
            "",
            "\3\52\13\uffff\1\51\15\uffff\6\52\2\uffff\1\52\7\uffff\1\52\1\uffff\2\52\6\uffff\2\52\1\uffff\1\23",
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

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "959:1: rule__DSLMove__Alternatives : ( ( ruleMove ) | ( ruleCapture ) | ( ruleCastle ) | ( ruleEnPassant ) | ( rulePromotion ) | ( ruleDummy ) );";
        }
    }
    static final String dfa_8s = "\25\uffff";
    static final String dfa_9s = "\1\41\2\uffff\1\41\6\61\2\10\1\65\1\67\2\10\1\62\2\71\2\uffff";
    static final String dfa_10s = "\1\74\2\uffff\1\46\6\66\2\10\1\65\1\67\2\10\1\62\2\73\2\uffff";
    static final String dfa_11s = "\1\uffff\1\1\1\2\20\uffff\1\3\1\4";
    static final String dfa_12s = "\25\uffff}>";
    static final String[] dfa_13s = {
            "\1\4\1\5\1\6\1\7\1\10\1\11\15\uffff\1\3\6\uffff\1\1\1\2",
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

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1046:1: rule__Castle__Alternatives : ( ( ( rule__Castle__Group_0__0 ) ) | ( ( rule__Castle__Group_1__0 ) ) | ( ( rule__Castle__Group_2__0 ) ) | ( ( rule__Castle__Group_3__0 ) ) );";
        }
    }
    static final String dfa_14s = "\23\uffff";
    static final String dfa_15s = "\2\41\6\61\2\10\1\65\1\67\2\10\1\62\2\70\2\uffff";
    static final String dfa_16s = "\1\64\1\46\6\66\2\10\1\65\1\67\2\10\1\62\2\76\2\uffff";
    static final String dfa_17s = "\21\uffff\1\1\1\2";
    static final String dfa_18s = "\23\uffff}>";
    static final String[] dfa_19s = {
            "\1\2\1\3\1\4\1\5\1\6\1\7\15\uffff\1\1",
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
            "\3\22\3\uffff\1\21",
            "\3\22\3\uffff\1\21",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1163:1: rule__Promotion__MoveAlternatives_0_0 : ( ( ruleMove ) | ( ruleCapture ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000150000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000180800040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000180000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000180000042L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000200000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0001000180000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000007E00000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x1818007E001000C0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x1818007E000000C0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000400007F000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000007F000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0010007E00000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0042000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0700000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000680000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000044420L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});

}