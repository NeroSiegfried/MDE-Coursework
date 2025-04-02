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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LETTER", "RULE_RANKDIGIT", "RULE_STRING", "RULE_MOVENUMBER", "RULE_ID", "RULE_SQUARETERMINAL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'fresh'", "'='", "'on'", "'...'", "'Kingside'", "'Queenside'", "'K'", "'Q'", "'R'", "'B'", "'N'", "'+'", "'#'", "'!'", "'?'", "'draw'", "'Good'", "'Bad'", "'Excellent'", "'Risky'", "'Dubious'", "'Check'", "'Checkmate'", "'White'", "'Black'", "'King'", "'Queen'", "'Rook'", "'Bishop'", "'Knight'", "'Pawn'", "'Game'", "'Moves:'", "'end'", "'Players:'", "':'", "'InitialState'", "'custom'", "'Positions:'", "'{'", "'}'", "'('", "')'", "'dummy'", "'moves'", "'->'", "'from'", "'to'", "'Capture('", "'and'", "'captures'", "'Castle('", "'castles'", "'the'", "'Promotion('", "'O-O-O'", "'O-O'", "'x'", "'ran'", "'out'", "'of'", "'time'", "'resigned'", "'checkmated'", "'ended'", "'game'", "'in'", "'a'", "'stalemate'", "'repeated'", "'position'", "'three'", "'times'", "'played'", "'fifty'", "'without'", "'capture'", "'agreed'", "'wins'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int RULE_MOVENUMBER=7;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=8;
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
    public static final int RULE_LETTER=4;
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
    public static final int RULE_RANKDIGIT=5;
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
    public static final int RULE_STRING=6;
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


    // $ANTLR start "entryRuleSANMove"
    // InternalChessDSL.g:453:1: entryRuleSANMove : ruleSANMove EOF ;
    public final void entryRuleSANMove() throws RecognitionException {
        try {
            // InternalChessDSL.g:454:1: ( ruleSANMove EOF )
            // InternalChessDSL.g:455:1: ruleSANMove EOF
            {
             before(grammarAccess.getSANMoveRule()); 
            pushFollow(FOLLOW_1);
            ruleSANMove();

            state._fsp--;

             after(grammarAccess.getSANMoveRule()); 
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
    // $ANTLR end "entryRuleSANMove"


    // $ANTLR start "ruleSANMove"
    // InternalChessDSL.g:462:1: ruleSANMove : ( ( rule__SANMove__Group__0 ) ) ;
    public final void ruleSANMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:466:2: ( ( ( rule__SANMove__Group__0 ) ) )
            // InternalChessDSL.g:467:2: ( ( rule__SANMove__Group__0 ) )
            {
            // InternalChessDSL.g:467:2: ( ( rule__SANMove__Group__0 ) )
            // InternalChessDSL.g:468:3: ( rule__SANMove__Group__0 )
            {
             before(grammarAccess.getSANMoveAccess().getGroup()); 
            // InternalChessDSL.g:469:3: ( rule__SANMove__Group__0 )
            // InternalChessDSL.g:469:4: rule__SANMove__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SANMove__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSANMoveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSANMove"


    // $ANTLR start "entryRuleSANCastle"
    // InternalChessDSL.g:478:1: entryRuleSANCastle : ruleSANCastle EOF ;
    public final void entryRuleSANCastle() throws RecognitionException {
        try {
            // InternalChessDSL.g:479:1: ( ruleSANCastle EOF )
            // InternalChessDSL.g:480:1: ruleSANCastle EOF
            {
             before(grammarAccess.getSANCastleRule()); 
            pushFollow(FOLLOW_1);
            ruleSANCastle();

            state._fsp--;

             after(grammarAccess.getSANCastleRule()); 
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
    // $ANTLR end "entryRuleSANCastle"


    // $ANTLR start "ruleSANCastle"
    // InternalChessDSL.g:487:1: ruleSANCastle : ( ( rule__SANCastle__Alternatives ) ) ;
    public final void ruleSANCastle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:491:2: ( ( ( rule__SANCastle__Alternatives ) ) )
            // InternalChessDSL.g:492:2: ( ( rule__SANCastle__Alternatives ) )
            {
            // InternalChessDSL.g:492:2: ( ( rule__SANCastle__Alternatives ) )
            // InternalChessDSL.g:493:3: ( rule__SANCastle__Alternatives )
            {
             before(grammarAccess.getSANCastleAccess().getAlternatives()); 
            // InternalChessDSL.g:494:3: ( rule__SANCastle__Alternatives )
            // InternalChessDSL.g:494:4: rule__SANCastle__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SANCastle__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSANCastleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSANCastle"


    // $ANTLR start "entryRuleSANNormal"
    // InternalChessDSL.g:503:1: entryRuleSANNormal : ruleSANNormal EOF ;
    public final void entryRuleSANNormal() throws RecognitionException {
        try {
            // InternalChessDSL.g:504:1: ( ruleSANNormal EOF )
            // InternalChessDSL.g:505:1: ruleSANNormal EOF
            {
             before(grammarAccess.getSANNormalRule()); 
            pushFollow(FOLLOW_1);
            ruleSANNormal();

            state._fsp--;

             after(grammarAccess.getSANNormalRule()); 
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
    // $ANTLR end "entryRuleSANNormal"


    // $ANTLR start "ruleSANNormal"
    // InternalChessDSL.g:512:1: ruleSANNormal : ( ( rule__SANNormal__Group__0 ) ) ;
    public final void ruleSANNormal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:516:2: ( ( ( rule__SANNormal__Group__0 ) ) )
            // InternalChessDSL.g:517:2: ( ( rule__SANNormal__Group__0 ) )
            {
            // InternalChessDSL.g:517:2: ( ( rule__SANNormal__Group__0 ) )
            // InternalChessDSL.g:518:3: ( rule__SANNormal__Group__0 )
            {
             before(grammarAccess.getSANNormalAccess().getGroup()); 
            // InternalChessDSL.g:519:3: ( rule__SANNormal__Group__0 )
            // InternalChessDSL.g:519:4: rule__SANNormal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SANNormal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSANNormalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSANNormal"


    // $ANTLR start "entryRuleSANPiece"
    // InternalChessDSL.g:528:1: entryRuleSANPiece : ruleSANPiece EOF ;
    public final void entryRuleSANPiece() throws RecognitionException {
        try {
            // InternalChessDSL.g:529:1: ( ruleSANPiece EOF )
            // InternalChessDSL.g:530:1: ruleSANPiece EOF
            {
             before(grammarAccess.getSANPieceRule()); 
            pushFollow(FOLLOW_1);
            ruleSANPiece();

            state._fsp--;

             after(grammarAccess.getSANPieceRule()); 
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
    // $ANTLR end "entryRuleSANPiece"


    // $ANTLR start "ruleSANPiece"
    // InternalChessDSL.g:537:1: ruleSANPiece : ( ( rule__SANPiece__Group__0 ) ) ;
    public final void ruleSANPiece() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:541:2: ( ( ( rule__SANPiece__Group__0 ) ) )
            // InternalChessDSL.g:542:2: ( ( rule__SANPiece__Group__0 ) )
            {
            // InternalChessDSL.g:542:2: ( ( rule__SANPiece__Group__0 ) )
            // InternalChessDSL.g:543:3: ( rule__SANPiece__Group__0 )
            {
             before(grammarAccess.getSANPieceAccess().getGroup()); 
            // InternalChessDSL.g:544:3: ( rule__SANPiece__Group__0 )
            // InternalChessDSL.g:544:4: rule__SANPiece__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SANPiece__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSANPieceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSANPiece"


    // $ANTLR start "entryRuleSANDisambiguation"
    // InternalChessDSL.g:553:1: entryRuleSANDisambiguation : ruleSANDisambiguation EOF ;
    public final void entryRuleSANDisambiguation() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalChessDSL.g:557:1: ( ruleSANDisambiguation EOF )
            // InternalChessDSL.g:558:1: ruleSANDisambiguation EOF
            {
             before(grammarAccess.getSANDisambiguationRule()); 
            pushFollow(FOLLOW_1);
            ruleSANDisambiguation();

            state._fsp--;

             after(grammarAccess.getSANDisambiguationRule()); 
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
    // $ANTLR end "entryRuleSANDisambiguation"


    // $ANTLR start "ruleSANDisambiguation"
    // InternalChessDSL.g:568:1: ruleSANDisambiguation : ( ( rule__SANDisambiguation__Group__0 ) ) ;
    public final void ruleSANDisambiguation() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:573:2: ( ( ( rule__SANDisambiguation__Group__0 ) ) )
            // InternalChessDSL.g:574:2: ( ( rule__SANDisambiguation__Group__0 ) )
            {
            // InternalChessDSL.g:574:2: ( ( rule__SANDisambiguation__Group__0 ) )
            // InternalChessDSL.g:575:3: ( rule__SANDisambiguation__Group__0 )
            {
             before(grammarAccess.getSANDisambiguationAccess().getGroup()); 
            // InternalChessDSL.g:576:3: ( rule__SANDisambiguation__Group__0 )
            // InternalChessDSL.g:576:4: rule__SANDisambiguation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SANDisambiguation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSANDisambiguationAccess().getGroup()); 

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
    // $ANTLR end "ruleSANDisambiguation"


    // $ANTLR start "entryRuleSANPromotion"
    // InternalChessDSL.g:586:1: entryRuleSANPromotion : ruleSANPromotion EOF ;
    public final void entryRuleSANPromotion() throws RecognitionException {
        try {
            // InternalChessDSL.g:587:1: ( ruleSANPromotion EOF )
            // InternalChessDSL.g:588:1: ruleSANPromotion EOF
            {
             before(grammarAccess.getSANPromotionRule()); 
            pushFollow(FOLLOW_1);
            ruleSANPromotion();

            state._fsp--;

             after(grammarAccess.getSANPromotionRule()); 
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
    // $ANTLR end "entryRuleSANPromotion"


    // $ANTLR start "ruleSANPromotion"
    // InternalChessDSL.g:595:1: ruleSANPromotion : ( ( rule__SANPromotion__Group__0 ) ) ;
    public final void ruleSANPromotion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:599:2: ( ( ( rule__SANPromotion__Group__0 ) ) )
            // InternalChessDSL.g:600:2: ( ( rule__SANPromotion__Group__0 ) )
            {
            // InternalChessDSL.g:600:2: ( ( rule__SANPromotion__Group__0 ) )
            // InternalChessDSL.g:601:3: ( rule__SANPromotion__Group__0 )
            {
             before(grammarAccess.getSANPromotionAccess().getGroup()); 
            // InternalChessDSL.g:602:3: ( rule__SANPromotion__Group__0 )
            // InternalChessDSL.g:602:4: rule__SANPromotion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SANPromotion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSANPromotionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSANPromotion"


    // $ANTLR start "entryRuleSANCheckMarker"
    // InternalChessDSL.g:611:1: entryRuleSANCheckMarker : ruleSANCheckMarker EOF ;
    public final void entryRuleSANCheckMarker() throws RecognitionException {
        try {
            // InternalChessDSL.g:612:1: ( ruleSANCheckMarker EOF )
            // InternalChessDSL.g:613:1: ruleSANCheckMarker EOF
            {
             before(grammarAccess.getSANCheckMarkerRule()); 
            pushFollow(FOLLOW_1);
            ruleSANCheckMarker();

            state._fsp--;

             after(grammarAccess.getSANCheckMarkerRule()); 
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
    // $ANTLR end "entryRuleSANCheckMarker"


    // $ANTLR start "ruleSANCheckMarker"
    // InternalChessDSL.g:620:1: ruleSANCheckMarker : ( ( rule__SANCheckMarker__Group__0 ) ) ;
    public final void ruleSANCheckMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:624:2: ( ( ( rule__SANCheckMarker__Group__0 ) ) )
            // InternalChessDSL.g:625:2: ( ( rule__SANCheckMarker__Group__0 ) )
            {
            // InternalChessDSL.g:625:2: ( ( rule__SANCheckMarker__Group__0 ) )
            // InternalChessDSL.g:626:3: ( rule__SANCheckMarker__Group__0 )
            {
             before(grammarAccess.getSANCheckMarkerAccess().getGroup()); 
            // InternalChessDSL.g:627:3: ( rule__SANCheckMarker__Group__0 )
            // InternalChessDSL.g:627:4: rule__SANCheckMarker__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SANCheckMarker__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSANCheckMarkerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSANCheckMarker"


    // $ANTLR start "entryRuleSANCapture"
    // InternalChessDSL.g:636:1: entryRuleSANCapture : ruleSANCapture EOF ;
    public final void entryRuleSANCapture() throws RecognitionException {
        try {
            // InternalChessDSL.g:637:1: ( ruleSANCapture EOF )
            // InternalChessDSL.g:638:1: ruleSANCapture EOF
            {
             before(grammarAccess.getSANCaptureRule()); 
            pushFollow(FOLLOW_1);
            ruleSANCapture();

            state._fsp--;

             after(grammarAccess.getSANCaptureRule()); 
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
    // $ANTLR end "entryRuleSANCapture"


    // $ANTLR start "ruleSANCapture"
    // InternalChessDSL.g:645:1: ruleSANCapture : ( ( rule__SANCapture__Group__0 ) ) ;
    public final void ruleSANCapture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:649:2: ( ( ( rule__SANCapture__Group__0 ) ) )
            // InternalChessDSL.g:650:2: ( ( rule__SANCapture__Group__0 ) )
            {
            // InternalChessDSL.g:650:2: ( ( rule__SANCapture__Group__0 ) )
            // InternalChessDSL.g:651:3: ( rule__SANCapture__Group__0 )
            {
             before(grammarAccess.getSANCaptureAccess().getGroup()); 
            // InternalChessDSL.g:652:3: ( rule__SANCapture__Group__0 )
            // InternalChessDSL.g:652:4: rule__SANCapture__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SANCapture__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSANCaptureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSANCapture"


    // $ANTLR start "entryRuleSANRemark"
    // InternalChessDSL.g:661:1: entryRuleSANRemark : ruleSANRemark EOF ;
    public final void entryRuleSANRemark() throws RecognitionException {
        try {
            // InternalChessDSL.g:662:1: ( ruleSANRemark EOF )
            // InternalChessDSL.g:663:1: ruleSANRemark EOF
            {
             before(grammarAccess.getSANRemarkRule()); 
            pushFollow(FOLLOW_1);
            ruleSANRemark();

            state._fsp--;

             after(grammarAccess.getSANRemarkRule()); 
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
    // $ANTLR end "entryRuleSANRemark"


    // $ANTLR start "ruleSANRemark"
    // InternalChessDSL.g:670:1: ruleSANRemark : ( ( rule__SANRemark__Group__0 ) ) ;
    public final void ruleSANRemark() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:674:2: ( ( ( rule__SANRemark__Group__0 ) ) )
            // InternalChessDSL.g:675:2: ( ( rule__SANRemark__Group__0 ) )
            {
            // InternalChessDSL.g:675:2: ( ( rule__SANRemark__Group__0 ) )
            // InternalChessDSL.g:676:3: ( rule__SANRemark__Group__0 )
            {
             before(grammarAccess.getSANRemarkAccess().getGroup()); 
            // InternalChessDSL.g:677:3: ( rule__SANRemark__Group__0 )
            // InternalChessDSL.g:677:4: rule__SANRemark__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SANRemark__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSANRemarkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSANRemark"


    // $ANTLR start "entryRuleConclusion"
    // InternalChessDSL.g:686:1: entryRuleConclusion : ruleConclusion EOF ;
    public final void entryRuleConclusion() throws RecognitionException {
        try {
            // InternalChessDSL.g:687:1: ( ruleConclusion EOF )
            // InternalChessDSL.g:688:1: ruleConclusion EOF
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
    // InternalChessDSL.g:695:1: ruleConclusion : ( ( rule__Conclusion__Group__0 ) ) ;
    public final void ruleConclusion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:699:2: ( ( ( rule__Conclusion__Group__0 ) ) )
            // InternalChessDSL.g:700:2: ( ( rule__Conclusion__Group__0 ) )
            {
            // InternalChessDSL.g:700:2: ( ( rule__Conclusion__Group__0 ) )
            // InternalChessDSL.g:701:3: ( rule__Conclusion__Group__0 )
            {
             before(grammarAccess.getConclusionAccess().getGroup()); 
            // InternalChessDSL.g:702:3: ( rule__Conclusion__Group__0 )
            // InternalChessDSL.g:702:4: rule__Conclusion__Group__0
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
    // InternalChessDSL.g:711:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalChessDSL.g:712:1: ( ruleMethod EOF )
            // InternalChessDSL.g:713:1: ruleMethod EOF
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
    // InternalChessDSL.g:720:1: ruleMethod : ( ( rule__Method__Alternatives ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:724:2: ( ( ( rule__Method__Alternatives ) ) )
            // InternalChessDSL.g:725:2: ( ( rule__Method__Alternatives ) )
            {
            // InternalChessDSL.g:725:2: ( ( rule__Method__Alternatives ) )
            // InternalChessDSL.g:726:3: ( rule__Method__Alternatives )
            {
             before(grammarAccess.getMethodAccess().getAlternatives()); 
            // InternalChessDSL.g:727:3: ( rule__Method__Alternatives )
            // InternalChessDSL.g:727:4: rule__Method__Alternatives
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
    // InternalChessDSL.g:736:1: entryRuleWin : ruleWin EOF ;
    public final void entryRuleWin() throws RecognitionException {
        try {
            // InternalChessDSL.g:737:1: ( ruleWin EOF )
            // InternalChessDSL.g:738:1: ruleWin EOF
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
    // InternalChessDSL.g:745:1: ruleWin : ( ( rule__Win__Alternatives ) ) ;
    public final void ruleWin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:749:2: ( ( ( rule__Win__Alternatives ) ) )
            // InternalChessDSL.g:750:2: ( ( rule__Win__Alternatives ) )
            {
            // InternalChessDSL.g:750:2: ( ( rule__Win__Alternatives ) )
            // InternalChessDSL.g:751:3: ( rule__Win__Alternatives )
            {
             before(grammarAccess.getWinAccess().getAlternatives()); 
            // InternalChessDSL.g:752:3: ( rule__Win__Alternatives )
            // InternalChessDSL.g:752:4: rule__Win__Alternatives
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
    // InternalChessDSL.g:761:1: entryRuleTimeUp : ruleTimeUp EOF ;
    public final void entryRuleTimeUp() throws RecognitionException {
        try {
            // InternalChessDSL.g:762:1: ( ruleTimeUp EOF )
            // InternalChessDSL.g:763:1: ruleTimeUp EOF
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
    // InternalChessDSL.g:770:1: ruleTimeUp : ( ( rule__TimeUp__Group__0 ) ) ;
    public final void ruleTimeUp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:774:2: ( ( ( rule__TimeUp__Group__0 ) ) )
            // InternalChessDSL.g:775:2: ( ( rule__TimeUp__Group__0 ) )
            {
            // InternalChessDSL.g:775:2: ( ( rule__TimeUp__Group__0 ) )
            // InternalChessDSL.g:776:3: ( rule__TimeUp__Group__0 )
            {
             before(grammarAccess.getTimeUpAccess().getGroup()); 
            // InternalChessDSL.g:777:3: ( rule__TimeUp__Group__0 )
            // InternalChessDSL.g:777:4: rule__TimeUp__Group__0
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
    // InternalChessDSL.g:786:1: entryRuleResign : ruleResign EOF ;
    public final void entryRuleResign() throws RecognitionException {
        try {
            // InternalChessDSL.g:787:1: ( ruleResign EOF )
            // InternalChessDSL.g:788:1: ruleResign EOF
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
    // InternalChessDSL.g:795:1: ruleResign : ( ( rule__Resign__Group__0 ) ) ;
    public final void ruleResign() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:799:2: ( ( ( rule__Resign__Group__0 ) ) )
            // InternalChessDSL.g:800:2: ( ( rule__Resign__Group__0 ) )
            {
            // InternalChessDSL.g:800:2: ( ( rule__Resign__Group__0 ) )
            // InternalChessDSL.g:801:3: ( rule__Resign__Group__0 )
            {
             before(grammarAccess.getResignAccess().getGroup()); 
            // InternalChessDSL.g:802:3: ( rule__Resign__Group__0 )
            // InternalChessDSL.g:802:4: rule__Resign__Group__0
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
    // InternalChessDSL.g:811:1: entryRuleCheckmate : ruleCheckmate EOF ;
    public final void entryRuleCheckmate() throws RecognitionException {
        try {
            // InternalChessDSL.g:812:1: ( ruleCheckmate EOF )
            // InternalChessDSL.g:813:1: ruleCheckmate EOF
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
    // InternalChessDSL.g:820:1: ruleCheckmate : ( ( rule__Checkmate__Group__0 ) ) ;
    public final void ruleCheckmate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:824:2: ( ( ( rule__Checkmate__Group__0 ) ) )
            // InternalChessDSL.g:825:2: ( ( rule__Checkmate__Group__0 ) )
            {
            // InternalChessDSL.g:825:2: ( ( rule__Checkmate__Group__0 ) )
            // InternalChessDSL.g:826:3: ( rule__Checkmate__Group__0 )
            {
             before(grammarAccess.getCheckmateAccess().getGroup()); 
            // InternalChessDSL.g:827:3: ( rule__Checkmate__Group__0 )
            // InternalChessDSL.g:827:4: rule__Checkmate__Group__0
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
    // InternalChessDSL.g:836:1: entryRuleDraw : ruleDraw EOF ;
    public final void entryRuleDraw() throws RecognitionException {
        try {
            // InternalChessDSL.g:837:1: ( ruleDraw EOF )
            // InternalChessDSL.g:838:1: ruleDraw EOF
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
    // InternalChessDSL.g:845:1: ruleDraw : ( ( rule__Draw__Group__0 ) ) ;
    public final void ruleDraw() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:849:2: ( ( ( rule__Draw__Group__0 ) ) )
            // InternalChessDSL.g:850:2: ( ( rule__Draw__Group__0 ) )
            {
            // InternalChessDSL.g:850:2: ( ( rule__Draw__Group__0 ) )
            // InternalChessDSL.g:851:3: ( rule__Draw__Group__0 )
            {
             before(grammarAccess.getDrawAccess().getGroup()); 
            // InternalChessDSL.g:852:3: ( rule__Draw__Group__0 )
            // InternalChessDSL.g:852:4: rule__Draw__Group__0
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
    // InternalChessDSL.g:861:1: entryRuleStalemate : ruleStalemate EOF ;
    public final void entryRuleStalemate() throws RecognitionException {
        try {
            // InternalChessDSL.g:862:1: ( ruleStalemate EOF )
            // InternalChessDSL.g:863:1: ruleStalemate EOF
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
    // InternalChessDSL.g:870:1: ruleStalemate : ( ( rule__Stalemate__Group__0 ) ) ;
    public final void ruleStalemate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:874:2: ( ( ( rule__Stalemate__Group__0 ) ) )
            // InternalChessDSL.g:875:2: ( ( rule__Stalemate__Group__0 ) )
            {
            // InternalChessDSL.g:875:2: ( ( rule__Stalemate__Group__0 ) )
            // InternalChessDSL.g:876:3: ( rule__Stalemate__Group__0 )
            {
             before(grammarAccess.getStalemateAccess().getGroup()); 
            // InternalChessDSL.g:877:3: ( rule__Stalemate__Group__0 )
            // InternalChessDSL.g:877:4: rule__Stalemate__Group__0
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
    // InternalChessDSL.g:886:1: entryRuleThreefold : ruleThreefold EOF ;
    public final void entryRuleThreefold() throws RecognitionException {
        try {
            // InternalChessDSL.g:887:1: ( ruleThreefold EOF )
            // InternalChessDSL.g:888:1: ruleThreefold EOF
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
    // InternalChessDSL.g:895:1: ruleThreefold : ( ( rule__Threefold__Group__0 ) ) ;
    public final void ruleThreefold() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:899:2: ( ( ( rule__Threefold__Group__0 ) ) )
            // InternalChessDSL.g:900:2: ( ( rule__Threefold__Group__0 ) )
            {
            // InternalChessDSL.g:900:2: ( ( rule__Threefold__Group__0 ) )
            // InternalChessDSL.g:901:3: ( rule__Threefold__Group__0 )
            {
             before(grammarAccess.getThreefoldAccess().getGroup()); 
            // InternalChessDSL.g:902:3: ( rule__Threefold__Group__0 )
            // InternalChessDSL.g:902:4: rule__Threefold__Group__0
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
    // InternalChessDSL.g:911:1: entryRuleFifty : ruleFifty EOF ;
    public final void entryRuleFifty() throws RecognitionException {
        try {
            // InternalChessDSL.g:912:1: ( ruleFifty EOF )
            // InternalChessDSL.g:913:1: ruleFifty EOF
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
    // InternalChessDSL.g:920:1: ruleFifty : ( ( rule__Fifty__Group__0 ) ) ;
    public final void ruleFifty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:924:2: ( ( ( rule__Fifty__Group__0 ) ) )
            // InternalChessDSL.g:925:2: ( ( rule__Fifty__Group__0 ) )
            {
            // InternalChessDSL.g:925:2: ( ( rule__Fifty__Group__0 ) )
            // InternalChessDSL.g:926:3: ( rule__Fifty__Group__0 )
            {
             before(grammarAccess.getFiftyAccess().getGroup()); 
            // InternalChessDSL.g:927:3: ( rule__Fifty__Group__0 )
            // InternalChessDSL.g:927:4: rule__Fifty__Group__0
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
    // InternalChessDSL.g:936:1: entryRuleAgree : ruleAgree EOF ;
    public final void entryRuleAgree() throws RecognitionException {
        try {
            // InternalChessDSL.g:937:1: ( ruleAgree EOF )
            // InternalChessDSL.g:938:1: ruleAgree EOF
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
    // InternalChessDSL.g:945:1: ruleAgree : ( ( rule__Agree__Group__0 ) ) ;
    public final void ruleAgree() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:949:2: ( ( ( rule__Agree__Group__0 ) ) )
            // InternalChessDSL.g:950:2: ( ( rule__Agree__Group__0 ) )
            {
            // InternalChessDSL.g:950:2: ( ( rule__Agree__Group__0 ) )
            // InternalChessDSL.g:951:3: ( rule__Agree__Group__0 )
            {
             before(grammarAccess.getAgreeAccess().getGroup()); 
            // InternalChessDSL.g:952:3: ( rule__Agree__Group__0 )
            // InternalChessDSL.g:952:4: rule__Agree__Group__0
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
    // InternalChessDSL.g:961:1: entryRuleResult : ruleResult EOF ;
    public final void entryRuleResult() throws RecognitionException {
        try {
            // InternalChessDSL.g:962:1: ( ruleResult EOF )
            // InternalChessDSL.g:963:1: ruleResult EOF
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
    // InternalChessDSL.g:970:1: ruleResult : ( ( rule__Result__Alternatives ) ) ;
    public final void ruleResult() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:974:2: ( ( ( rule__Result__Alternatives ) ) )
            // InternalChessDSL.g:975:2: ( ( rule__Result__Alternatives ) )
            {
            // InternalChessDSL.g:975:2: ( ( rule__Result__Alternatives ) )
            // InternalChessDSL.g:976:3: ( rule__Result__Alternatives )
            {
             before(grammarAccess.getResultAccess().getAlternatives()); 
            // InternalChessDSL.g:977:3: ( rule__Result__Alternatives )
            // InternalChessDSL.g:977:4: rule__Result__Alternatives
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
    // InternalChessDSL.g:986:1: entryRulePlayerOrColor : rulePlayerOrColor EOF ;
    public final void entryRulePlayerOrColor() throws RecognitionException {
        try {
            // InternalChessDSL.g:987:1: ( rulePlayerOrColor EOF )
            // InternalChessDSL.g:988:1: rulePlayerOrColor EOF
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
    // InternalChessDSL.g:995:1: rulePlayerOrColor : ( ( rule__PlayerOrColor__Alternatives ) ) ;
    public final void rulePlayerOrColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:999:2: ( ( ( rule__PlayerOrColor__Alternatives ) ) )
            // InternalChessDSL.g:1000:2: ( ( rule__PlayerOrColor__Alternatives ) )
            {
            // InternalChessDSL.g:1000:2: ( ( rule__PlayerOrColor__Alternatives ) )
            // InternalChessDSL.g:1001:3: ( rule__PlayerOrColor__Alternatives )
            {
             before(grammarAccess.getPlayerOrColorAccess().getAlternatives()); 
            // InternalChessDSL.g:1002:3: ( rule__PlayerOrColor__Alternatives )
            // InternalChessDSL.g:1002:4: rule__PlayerOrColor__Alternatives
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
    // InternalChessDSL.g:1011:1: entryRuleSquare : ruleSquare EOF ;
    public final void entryRuleSquare() throws RecognitionException {
        try {
            // InternalChessDSL.g:1012:1: ( ruleSquare EOF )
            // InternalChessDSL.g:1013:1: ruleSquare EOF
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
    // InternalChessDSL.g:1020:1: ruleSquare : ( ( rule__Square__SquareAssignment ) ) ;
    public final void ruleSquare() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1024:2: ( ( ( rule__Square__SquareAssignment ) ) )
            // InternalChessDSL.g:1025:2: ( ( rule__Square__SquareAssignment ) )
            {
            // InternalChessDSL.g:1025:2: ( ( rule__Square__SquareAssignment ) )
            // InternalChessDSL.g:1026:3: ( rule__Square__SquareAssignment )
            {
             before(grammarAccess.getSquareAccess().getSquareAssignment()); 
            // InternalChessDSL.g:1027:3: ( rule__Square__SquareAssignment )
            // InternalChessDSL.g:1027:4: rule__Square__SquareAssignment
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
    // InternalChessDSL.g:1036:1: ruleRemark : ( ( rule__Remark__Alternatives ) ) ;
    public final void ruleRemark() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1040:1: ( ( ( rule__Remark__Alternatives ) ) )
            // InternalChessDSL.g:1041:2: ( ( rule__Remark__Alternatives ) )
            {
            // InternalChessDSL.g:1041:2: ( ( rule__Remark__Alternatives ) )
            // InternalChessDSL.g:1042:3: ( rule__Remark__Alternatives )
            {
             before(grammarAccess.getRemarkAccess().getAlternatives()); 
            // InternalChessDSL.g:1043:3: ( rule__Remark__Alternatives )
            // InternalChessDSL.g:1043:4: rule__Remark__Alternatives
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
    // InternalChessDSL.g:1052:1: ruleColor : ( ( rule__Color__Alternatives ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1056:1: ( ( ( rule__Color__Alternatives ) ) )
            // InternalChessDSL.g:1057:2: ( ( rule__Color__Alternatives ) )
            {
            // InternalChessDSL.g:1057:2: ( ( rule__Color__Alternatives ) )
            // InternalChessDSL.g:1058:3: ( rule__Color__Alternatives )
            {
             before(grammarAccess.getColorAccess().getAlternatives()); 
            // InternalChessDSL.g:1059:3: ( rule__Color__Alternatives )
            // InternalChessDSL.g:1059:4: rule__Color__Alternatives
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
    // InternalChessDSL.g:1068:1: rulePiece : ( ( rule__Piece__Alternatives ) ) ;
    public final void rulePiece() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1072:1: ( ( ( rule__Piece__Alternatives ) ) )
            // InternalChessDSL.g:1073:2: ( ( rule__Piece__Alternatives ) )
            {
            // InternalChessDSL.g:1073:2: ( ( rule__Piece__Alternatives ) )
            // InternalChessDSL.g:1074:3: ( rule__Piece__Alternatives )
            {
             before(grammarAccess.getPieceAccess().getAlternatives()); 
            // InternalChessDSL.g:1075:3: ( rule__Piece__Alternatives )
            // InternalChessDSL.g:1075:4: rule__Piece__Alternatives
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
    // InternalChessDSL.g:1083:1: rule__InitialState__Alternatives_2 : ( ( 'fresh' ) | ( ( rule__InitialState__Group_2_1__0 ) ) );
    public final void rule__InitialState__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1087:1: ( ( 'fresh' ) | ( ( rule__InitialState__Group_2_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==52) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalChessDSL.g:1088:2: ( 'fresh' )
                    {
                    // InternalChessDSL.g:1088:2: ( 'fresh' )
                    // InternalChessDSL.g:1089:3: 'fresh'
                    {
                     before(grammarAccess.getInitialStateAccess().getFreshKeyword_2_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getInitialStateAccess().getFreshKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1094:2: ( ( rule__InitialState__Group_2_1__0 ) )
                    {
                    // InternalChessDSL.g:1094:2: ( ( rule__InitialState__Group_2_1__0 ) )
                    // InternalChessDSL.g:1095:3: ( rule__InitialState__Group_2_1__0 )
                    {
                     before(grammarAccess.getInitialStateAccess().getGroup_2_1()); 
                    // InternalChessDSL.g:1096:3: ( rule__InitialState__Group_2_1__0 )
                    // InternalChessDSL.g:1096:4: rule__InitialState__Group_2_1__0
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
    // InternalChessDSL.g:1104:1: rule__Placement__Alternatives_1 : ( ( '=' ) | ( 'on' ) );
    public final void rule__Placement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1108:1: ( ( '=' ) | ( 'on' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalChessDSL.g:1109:2: ( '=' )
                    {
                    // InternalChessDSL.g:1109:2: ( '=' )
                    // InternalChessDSL.g:1110:3: '='
                    {
                     before(grammarAccess.getPlacementAccess().getEqualsSignKeyword_1_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getPlacementAccess().getEqualsSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1115:2: ( 'on' )
                    {
                    // InternalChessDSL.g:1115:2: ( 'on' )
                    // InternalChessDSL.g:1116:3: 'on'
                    {
                     before(grammarAccess.getPlacementAccess().getOnKeyword_1_1()); 
                    match(input,17,FOLLOW_2); 
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
    // InternalChessDSL.g:1125:1: rule__MovePair__Alternatives_1 : ( ( ( rule__MovePair__Group_1_0__0 ) ) | ( '...' ) );
    public final void rule__MovePair__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1129:1: ( ( ( rule__MovePair__Group_1_0__0 ) ) | ( '...' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_LETTER && LA3_0<=RULE_RANKDIGIT)||(LA3_0>=RULE_ID && LA3_0<=RULE_SQUARETERMINAL)||(LA3_0>=21 && LA3_0<=25)||(LA3_0>=40 && LA3_0<=45)||(LA3_0>=58 && LA3_0<=59)||(LA3_0>=66 && LA3_0<=67)||(LA3_0>=70 && LA3_0<=72)) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalChessDSL.g:1130:2: ( ( rule__MovePair__Group_1_0__0 ) )
                    {
                    // InternalChessDSL.g:1130:2: ( ( rule__MovePair__Group_1_0__0 ) )
                    // InternalChessDSL.g:1131:3: ( rule__MovePair__Group_1_0__0 )
                    {
                     before(grammarAccess.getMovePairAccess().getGroup_1_0()); 
                    // InternalChessDSL.g:1132:3: ( rule__MovePair__Group_1_0__0 )
                    // InternalChessDSL.g:1132:4: rule__MovePair__Group_1_0__0
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
                    // InternalChessDSL.g:1136:2: ( '...' )
                    {
                    // InternalChessDSL.g:1136:2: ( '...' )
                    // InternalChessDSL.g:1137:3: '...'
                    {
                     before(grammarAccess.getMovePairAccess().getFullStopFullStopFullStopKeyword_1_1()); 
                    match(input,18,FOLLOW_2); 
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
    // InternalChessDSL.g:1146:1: rule__AnyMove__Alternatives : ( ( ( rule__AnyMove__Group_0__0 ) ) | ( ( rule__AnyMove__AlgebraicmoveAssignment_1 ) ) );
    public final void rule__AnyMove__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1150:1: ( ( ( rule__AnyMove__Group_0__0 ) ) | ( ( rule__AnyMove__AlgebraicmoveAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=40 && LA4_0<=45)||(LA4_0>=58 && LA4_0<=59)||(LA4_0>=66 && LA4_0<=67)) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=RULE_LETTER && LA4_0<=RULE_RANKDIGIT)||LA4_0==RULE_SQUARETERMINAL||(LA4_0>=21 && LA4_0<=25)||(LA4_0>=70 && LA4_0<=72)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalChessDSL.g:1151:2: ( ( rule__AnyMove__Group_0__0 ) )
                    {
                    // InternalChessDSL.g:1151:2: ( ( rule__AnyMove__Group_0__0 ) )
                    // InternalChessDSL.g:1152:3: ( rule__AnyMove__Group_0__0 )
                    {
                     before(grammarAccess.getAnyMoveAccess().getGroup_0()); 
                    // InternalChessDSL.g:1153:3: ( rule__AnyMove__Group_0__0 )
                    // InternalChessDSL.g:1153:4: rule__AnyMove__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AnyMove__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAnyMoveAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1157:2: ( ( rule__AnyMove__AlgebraicmoveAssignment_1 ) )
                    {
                    // InternalChessDSL.g:1157:2: ( ( rule__AnyMove__AlgebraicmoveAssignment_1 ) )
                    // InternalChessDSL.g:1158:3: ( rule__AnyMove__AlgebraicmoveAssignment_1 )
                    {
                     before(grammarAccess.getAnyMoveAccess().getAlgebraicmoveAssignment_1()); 
                    // InternalChessDSL.g:1159:3: ( rule__AnyMove__AlgebraicmoveAssignment_1 )
                    // InternalChessDSL.g:1159:4: rule__AnyMove__AlgebraicmoveAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AnyMove__AlgebraicmoveAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAnyMoveAccess().getAlgebraicmoveAssignment_1()); 

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
    // InternalChessDSL.g:1167:1: rule__DSLMove__Alternatives : ( ( ruleMove ) | ( ruleCapture ) | ( ruleCastle ) | ( ruleEnPassant ) | ( rulePromotion ) | ( ruleDummy ) );
    public final void rule__DSLMove__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1171:1: ( ( ruleMove ) | ( ruleCapture ) | ( ruleCastle ) | ( ruleEnPassant ) | ( rulePromotion ) | ( ruleDummy ) )
            int alt5=6;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalChessDSL.g:1172:2: ( ruleMove )
                    {
                    // InternalChessDSL.g:1172:2: ( ruleMove )
                    // InternalChessDSL.g:1173:3: ruleMove
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
                    // InternalChessDSL.g:1178:2: ( ruleCapture )
                    {
                    // InternalChessDSL.g:1178:2: ( ruleCapture )
                    // InternalChessDSL.g:1179:3: ruleCapture
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
                    // InternalChessDSL.g:1184:2: ( ruleCastle )
                    {
                    // InternalChessDSL.g:1184:2: ( ruleCastle )
                    // InternalChessDSL.g:1185:3: ruleCastle
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
                    // InternalChessDSL.g:1190:2: ( ruleEnPassant )
                    {
                    // InternalChessDSL.g:1190:2: ( ruleEnPassant )
                    // InternalChessDSL.g:1191:3: ruleEnPassant
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
                    // InternalChessDSL.g:1196:2: ( rulePromotion )
                    {
                    // InternalChessDSL.g:1196:2: ( rulePromotion )
                    // InternalChessDSL.g:1197:3: rulePromotion
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
                    // InternalChessDSL.g:1202:2: ( ruleDummy )
                    {
                    // InternalChessDSL.g:1202:2: ( ruleDummy )
                    // InternalChessDSL.g:1203:3: ruleDummy
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
    // InternalChessDSL.g:1212:1: rule__Move__Alternatives_2 : ( ( ( rule__Move__Group_2_0__0 ) ) | ( ( rule__Move__Group_2_1__0 ) ) );
    public final void rule__Move__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1216:1: ( ( ( rule__Move__Group_2_0__0 ) ) | ( ( rule__Move__Group_2_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==56) ) {
                alt6=1;
            }
            else if ( (LA6_0==61) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalChessDSL.g:1217:2: ( ( rule__Move__Group_2_0__0 ) )
                    {
                    // InternalChessDSL.g:1217:2: ( ( rule__Move__Group_2_0__0 ) )
                    // InternalChessDSL.g:1218:3: ( rule__Move__Group_2_0__0 )
                    {
                     before(grammarAccess.getMoveAccess().getGroup_2_0()); 
                    // InternalChessDSL.g:1219:3: ( rule__Move__Group_2_0__0 )
                    // InternalChessDSL.g:1219:4: rule__Move__Group_2_0__0
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
                    // InternalChessDSL.g:1223:2: ( ( rule__Move__Group_2_1__0 ) )
                    {
                    // InternalChessDSL.g:1223:2: ( ( rule__Move__Group_2_1__0 ) )
                    // InternalChessDSL.g:1224:3: ( rule__Move__Group_2_1__0 )
                    {
                     before(grammarAccess.getMoveAccess().getGroup_2_1()); 
                    // InternalChessDSL.g:1225:3: ( rule__Move__Group_2_1__0 )
                    // InternalChessDSL.g:1225:4: rule__Move__Group_2_1__0
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
    // InternalChessDSL.g:1233:1: rule__Capture__Alternatives_1 : ( ( ( rule__Capture__Group_1_0__0 ) ) | ( ( rule__Capture__Group_1_1__0 ) ) );
    public final void rule__Capture__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1237:1: ( ( ( rule__Capture__Group_1_0__0 ) ) | ( ( rule__Capture__Group_1_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==63) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=64 && LA7_0<=65)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalChessDSL.g:1238:2: ( ( rule__Capture__Group_1_0__0 ) )
                    {
                    // InternalChessDSL.g:1238:2: ( ( rule__Capture__Group_1_0__0 ) )
                    // InternalChessDSL.g:1239:3: ( rule__Capture__Group_1_0__0 )
                    {
                     before(grammarAccess.getCaptureAccess().getGroup_1_0()); 
                    // InternalChessDSL.g:1240:3: ( rule__Capture__Group_1_0__0 )
                    // InternalChessDSL.g:1240:4: rule__Capture__Group_1_0__0
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
                    // InternalChessDSL.g:1244:2: ( ( rule__Capture__Group_1_1__0 ) )
                    {
                    // InternalChessDSL.g:1244:2: ( ( rule__Capture__Group_1_1__0 ) )
                    // InternalChessDSL.g:1245:3: ( rule__Capture__Group_1_1__0 )
                    {
                     before(grammarAccess.getCaptureAccess().getGroup_1_1()); 
                    // InternalChessDSL.g:1246:3: ( rule__Capture__Group_1_1__0 )
                    // InternalChessDSL.g:1246:4: rule__Capture__Group_1_1__0
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
    // InternalChessDSL.g:1254:1: rule__Castle__Alternatives : ( ( ( rule__Castle__Group_0__0 ) ) | ( ( rule__Castle__Group_1__0 ) ) | ( ( rule__Castle__Group_2__0 ) ) | ( ( rule__Castle__Group_3__0 ) ) );
    public final void rule__Castle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1258:1: ( ( ( rule__Castle__Group_0__0 ) ) | ( ( rule__Castle__Group_1__0 ) ) | ( ( rule__Castle__Group_2__0 ) ) | ( ( rule__Castle__Group_3__0 ) ) )
            int alt8=4;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalChessDSL.g:1259:2: ( ( rule__Castle__Group_0__0 ) )
                    {
                    // InternalChessDSL.g:1259:2: ( ( rule__Castle__Group_0__0 ) )
                    // InternalChessDSL.g:1260:3: ( rule__Castle__Group_0__0 )
                    {
                     before(grammarAccess.getCastleAccess().getGroup_0()); 
                    // InternalChessDSL.g:1261:3: ( rule__Castle__Group_0__0 )
                    // InternalChessDSL.g:1261:4: rule__Castle__Group_0__0
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
                    // InternalChessDSL.g:1265:2: ( ( rule__Castle__Group_1__0 ) )
                    {
                    // InternalChessDSL.g:1265:2: ( ( rule__Castle__Group_1__0 ) )
                    // InternalChessDSL.g:1266:3: ( rule__Castle__Group_1__0 )
                    {
                     before(grammarAccess.getCastleAccess().getGroup_1()); 
                    // InternalChessDSL.g:1267:3: ( rule__Castle__Group_1__0 )
                    // InternalChessDSL.g:1267:4: rule__Castle__Group_1__0
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
                    // InternalChessDSL.g:1271:2: ( ( rule__Castle__Group_2__0 ) )
                    {
                    // InternalChessDSL.g:1271:2: ( ( rule__Castle__Group_2__0 ) )
                    // InternalChessDSL.g:1272:3: ( rule__Castle__Group_2__0 )
                    {
                     before(grammarAccess.getCastleAccess().getGroup_2()); 
                    // InternalChessDSL.g:1273:3: ( rule__Castle__Group_2__0 )
                    // InternalChessDSL.g:1273:4: rule__Castle__Group_2__0
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
                    // InternalChessDSL.g:1277:2: ( ( rule__Castle__Group_3__0 ) )
                    {
                    // InternalChessDSL.g:1277:2: ( ( rule__Castle__Group_3__0 ) )
                    // InternalChessDSL.g:1278:3: ( rule__Castle__Group_3__0 )
                    {
                     before(grammarAccess.getCastleAccess().getGroup_3()); 
                    // InternalChessDSL.g:1279:3: ( rule__Castle__Group_3__0 )
                    // InternalChessDSL.g:1279:4: rule__Castle__Group_3__0
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
    // InternalChessDSL.g:1287:1: rule__Castle__SideAlternatives_0_1_0 : ( ( 'Kingside' ) | ( 'Queenside' ) );
    public final void rule__Castle__SideAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1291:1: ( ( 'Kingside' ) | ( 'Queenside' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            else if ( (LA9_0==20) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalChessDSL.g:1292:2: ( 'Kingside' )
                    {
                    // InternalChessDSL.g:1292:2: ( 'Kingside' )
                    // InternalChessDSL.g:1293:3: 'Kingside'
                    {
                     before(grammarAccess.getCastleAccess().getSideKingsideKeyword_0_1_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getCastleAccess().getSideKingsideKeyword_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1298:2: ( 'Queenside' )
                    {
                    // InternalChessDSL.g:1298:2: ( 'Queenside' )
                    // InternalChessDSL.g:1299:3: 'Queenside'
                    {
                     before(grammarAccess.getCastleAccess().getSideQueensideKeyword_0_1_0_1()); 
                    match(input,20,FOLLOW_2); 
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
    // InternalChessDSL.g:1308:1: rule__Castle__SideAlternatives_1_2_0 : ( ( 'Kingside' ) | ( 'Queenside' ) );
    public final void rule__Castle__SideAlternatives_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1312:1: ( ( 'Kingside' ) | ( 'Queenside' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            else if ( (LA10_0==20) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalChessDSL.g:1313:2: ( 'Kingside' )
                    {
                    // InternalChessDSL.g:1313:2: ( 'Kingside' )
                    // InternalChessDSL.g:1314:3: 'Kingside'
                    {
                     before(grammarAccess.getCastleAccess().getSideKingsideKeyword_1_2_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getCastleAccess().getSideKingsideKeyword_1_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1319:2: ( 'Queenside' )
                    {
                    // InternalChessDSL.g:1319:2: ( 'Queenside' )
                    // InternalChessDSL.g:1320:3: 'Queenside'
                    {
                     before(grammarAccess.getCastleAccess().getSideQueensideKeyword_1_2_0_1()); 
                    match(input,20,FOLLOW_2); 
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
    // InternalChessDSL.g:1329:1: rule__Castle__SideAlternatives_2_2_0 : ( ( 'Kingside' ) | ( 'Queenside' ) );
    public final void rule__Castle__SideAlternatives_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1333:1: ( ( 'Kingside' ) | ( 'Queenside' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            else if ( (LA11_0==20) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalChessDSL.g:1334:2: ( 'Kingside' )
                    {
                    // InternalChessDSL.g:1334:2: ( 'Kingside' )
                    // InternalChessDSL.g:1335:3: 'Kingside'
                    {
                     before(grammarAccess.getCastleAccess().getSideKingsideKeyword_2_2_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getCastleAccess().getSideKingsideKeyword_2_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1340:2: ( 'Queenside' )
                    {
                    // InternalChessDSL.g:1340:2: ( 'Queenside' )
                    // InternalChessDSL.g:1341:3: 'Queenside'
                    {
                     before(grammarAccess.getCastleAccess().getSideQueensideKeyword_2_2_0_1()); 
                    match(input,20,FOLLOW_2); 
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
    // InternalChessDSL.g:1350:1: rule__Castle__SideAlternatives_3_3_0 : ( ( 'Kingside' ) | ( 'Queenside' ) );
    public final void rule__Castle__SideAlternatives_3_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1354:1: ( ( 'Kingside' ) | ( 'Queenside' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            else if ( (LA12_0==20) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalChessDSL.g:1355:2: ( 'Kingside' )
                    {
                    // InternalChessDSL.g:1355:2: ( 'Kingside' )
                    // InternalChessDSL.g:1356:3: 'Kingside'
                    {
                     before(grammarAccess.getCastleAccess().getSideKingsideKeyword_3_3_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getCastleAccess().getSideKingsideKeyword_3_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1361:2: ( 'Queenside' )
                    {
                    // InternalChessDSL.g:1361:2: ( 'Queenside' )
                    // InternalChessDSL.g:1362:3: 'Queenside'
                    {
                     before(grammarAccess.getCastleAccess().getSideQueensideKeyword_3_3_0_1()); 
                    match(input,20,FOLLOW_2); 
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
    // InternalChessDSL.g:1371:1: rule__Promotion__MoveAlternatives_0_0 : ( ( ruleMove ) | ( ruleCapture ) );
    public final void rule__Promotion__MoveAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1375:1: ( ( ruleMove ) | ( ruleCapture ) )
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalChessDSL.g:1376:2: ( ruleMove )
                    {
                    // InternalChessDSL.g:1376:2: ( ruleMove )
                    // InternalChessDSL.g:1377:3: ruleMove
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
                    // InternalChessDSL.g:1382:2: ( ruleCapture )
                    {
                    // InternalChessDSL.g:1382:2: ( ruleCapture )
                    // InternalChessDSL.g:1383:3: ruleCapture
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


    // $ANTLR start "rule__SANMove__Alternatives_1"
    // InternalChessDSL.g:1392:1: rule__SANMove__Alternatives_1 : ( ( ( rule__SANMove__CastleAssignment_1_0 ) ) | ( ( rule__SANMove__NormalAssignment_1_1 ) ) );
    public final void rule__SANMove__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1396:1: ( ( ( rule__SANMove__CastleAssignment_1_0 ) ) | ( ( rule__SANMove__NormalAssignment_1_1 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=70 && LA14_0<=71)) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=RULE_LETTER && LA14_0<=RULE_RANKDIGIT)||LA14_0==RULE_SQUARETERMINAL||(LA14_0>=21 && LA14_0<=25)||LA14_0==72) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalChessDSL.g:1397:2: ( ( rule__SANMove__CastleAssignment_1_0 ) )
                    {
                    // InternalChessDSL.g:1397:2: ( ( rule__SANMove__CastleAssignment_1_0 ) )
                    // InternalChessDSL.g:1398:3: ( rule__SANMove__CastleAssignment_1_0 )
                    {
                     before(grammarAccess.getSANMoveAccess().getCastleAssignment_1_0()); 
                    // InternalChessDSL.g:1399:3: ( rule__SANMove__CastleAssignment_1_0 )
                    // InternalChessDSL.g:1399:4: rule__SANMove__CastleAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SANMove__CastleAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSANMoveAccess().getCastleAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1403:2: ( ( rule__SANMove__NormalAssignment_1_1 ) )
                    {
                    // InternalChessDSL.g:1403:2: ( ( rule__SANMove__NormalAssignment_1_1 ) )
                    // InternalChessDSL.g:1404:3: ( rule__SANMove__NormalAssignment_1_1 )
                    {
                     before(grammarAccess.getSANMoveAccess().getNormalAssignment_1_1()); 
                    // InternalChessDSL.g:1405:3: ( rule__SANMove__NormalAssignment_1_1 )
                    // InternalChessDSL.g:1405:4: rule__SANMove__NormalAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SANMove__NormalAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSANMoveAccess().getNormalAssignment_1_1()); 

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
    // $ANTLR end "rule__SANMove__Alternatives_1"


    // $ANTLR start "rule__SANCastle__Alternatives"
    // InternalChessDSL.g:1413:1: rule__SANCastle__Alternatives : ( ( ( rule__SANCastle__Group_0__0 ) ) | ( ( rule__SANCastle__Group_1__0 ) ) );
    public final void rule__SANCastle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1417:1: ( ( ( rule__SANCastle__Group_0__0 ) ) | ( ( rule__SANCastle__Group_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==70) ) {
                alt15=1;
            }
            else if ( (LA15_0==71) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalChessDSL.g:1418:2: ( ( rule__SANCastle__Group_0__0 ) )
                    {
                    // InternalChessDSL.g:1418:2: ( ( rule__SANCastle__Group_0__0 ) )
                    // InternalChessDSL.g:1419:3: ( rule__SANCastle__Group_0__0 )
                    {
                     before(grammarAccess.getSANCastleAccess().getGroup_0()); 
                    // InternalChessDSL.g:1420:3: ( rule__SANCastle__Group_0__0 )
                    // InternalChessDSL.g:1420:4: rule__SANCastle__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SANCastle__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSANCastleAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1424:2: ( ( rule__SANCastle__Group_1__0 ) )
                    {
                    // InternalChessDSL.g:1424:2: ( ( rule__SANCastle__Group_1__0 ) )
                    // InternalChessDSL.g:1425:3: ( rule__SANCastle__Group_1__0 )
                    {
                     before(grammarAccess.getSANCastleAccess().getGroup_1()); 
                    // InternalChessDSL.g:1426:3: ( rule__SANCastle__Group_1__0 )
                    // InternalChessDSL.g:1426:4: rule__SANCastle__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SANCastle__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSANCastleAccess().getGroup_1()); 

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
    // $ANTLR end "rule__SANCastle__Alternatives"


    // $ANTLR start "rule__SANPiece__Alternatives_1"
    // InternalChessDSL.g:1434:1: rule__SANPiece__Alternatives_1 : ( ( 'K' ) | ( 'Q' ) | ( 'R' ) | ( 'B' ) | ( 'N' ) );
    public final void rule__SANPiece__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1438:1: ( ( 'K' ) | ( 'Q' ) | ( 'R' ) | ( 'B' ) | ( 'N' ) )
            int alt16=5;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalChessDSL.g:1439:2: ( 'K' )
                    {
                    // InternalChessDSL.g:1439:2: ( 'K' )
                    // InternalChessDSL.g:1440:3: 'K'
                    {
                     before(grammarAccess.getSANPieceAccess().getKKeyword_1_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getSANPieceAccess().getKKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1445:2: ( 'Q' )
                    {
                    // InternalChessDSL.g:1445:2: ( 'Q' )
                    // InternalChessDSL.g:1446:3: 'Q'
                    {
                     before(grammarAccess.getSANPieceAccess().getQKeyword_1_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getSANPieceAccess().getQKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalChessDSL.g:1451:2: ( 'R' )
                    {
                    // InternalChessDSL.g:1451:2: ( 'R' )
                    // InternalChessDSL.g:1452:3: 'R'
                    {
                     before(grammarAccess.getSANPieceAccess().getRKeyword_1_2()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getSANPieceAccess().getRKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalChessDSL.g:1457:2: ( 'B' )
                    {
                    // InternalChessDSL.g:1457:2: ( 'B' )
                    // InternalChessDSL.g:1458:3: 'B'
                    {
                     before(grammarAccess.getSANPieceAccess().getBKeyword_1_3()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getSANPieceAccess().getBKeyword_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalChessDSL.g:1463:2: ( 'N' )
                    {
                    // InternalChessDSL.g:1463:2: ( 'N' )
                    // InternalChessDSL.g:1464:3: 'N'
                    {
                     before(grammarAccess.getSANPieceAccess().getNKeyword_1_4()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getSANPieceAccess().getNKeyword_1_4()); 

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
    // $ANTLR end "rule__SANPiece__Alternatives_1"


    // $ANTLR start "rule__SANDisambiguation__Alternatives_1"
    // InternalChessDSL.g:1473:1: rule__SANDisambiguation__Alternatives_1 : ( ( RULE_LETTER ) | ( RULE_RANKDIGIT ) );
    public final void rule__SANDisambiguation__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1477:1: ( ( RULE_LETTER ) | ( RULE_RANKDIGIT ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_LETTER) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_RANKDIGIT) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalChessDSL.g:1478:2: ( RULE_LETTER )
                    {
                    // InternalChessDSL.g:1478:2: ( RULE_LETTER )
                    // InternalChessDSL.g:1479:3: RULE_LETTER
                    {
                     before(grammarAccess.getSANDisambiguationAccess().getLETTERTerminalRuleCall_1_0()); 
                    match(input,RULE_LETTER,FOLLOW_2); 
                     after(grammarAccess.getSANDisambiguationAccess().getLETTERTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1484:2: ( RULE_RANKDIGIT )
                    {
                    // InternalChessDSL.g:1484:2: ( RULE_RANKDIGIT )
                    // InternalChessDSL.g:1485:3: RULE_RANKDIGIT
                    {
                     before(grammarAccess.getSANDisambiguationAccess().getRANKDIGITTerminalRuleCall_1_1()); 
                    match(input,RULE_RANKDIGIT,FOLLOW_2); 
                     after(grammarAccess.getSANDisambiguationAccess().getRANKDIGITTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__SANDisambiguation__Alternatives_1"


    // $ANTLR start "rule__SANPromotion__Alternatives_2"
    // InternalChessDSL.g:1494:1: rule__SANPromotion__Alternatives_2 : ( ( 'Q' ) | ( 'R' ) | ( 'B' ) | ( 'N' ) );
    public final void rule__SANPromotion__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1498:1: ( ( 'Q' ) | ( 'R' ) | ( 'B' ) | ( 'N' ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt18=1;
                }
                break;
            case 23:
                {
                alt18=2;
                }
                break;
            case 24:
                {
                alt18=3;
                }
                break;
            case 25:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalChessDSL.g:1499:2: ( 'Q' )
                    {
                    // InternalChessDSL.g:1499:2: ( 'Q' )
                    // InternalChessDSL.g:1500:3: 'Q'
                    {
                     before(grammarAccess.getSANPromotionAccess().getQKeyword_2_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getSANPromotionAccess().getQKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1505:2: ( 'R' )
                    {
                    // InternalChessDSL.g:1505:2: ( 'R' )
                    // InternalChessDSL.g:1506:3: 'R'
                    {
                     before(grammarAccess.getSANPromotionAccess().getRKeyword_2_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getSANPromotionAccess().getRKeyword_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalChessDSL.g:1511:2: ( 'B' )
                    {
                    // InternalChessDSL.g:1511:2: ( 'B' )
                    // InternalChessDSL.g:1512:3: 'B'
                    {
                     before(grammarAccess.getSANPromotionAccess().getBKeyword_2_2()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getSANPromotionAccess().getBKeyword_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalChessDSL.g:1517:2: ( 'N' )
                    {
                    // InternalChessDSL.g:1517:2: ( 'N' )
                    // InternalChessDSL.g:1518:3: 'N'
                    {
                     before(grammarAccess.getSANPromotionAccess().getNKeyword_2_3()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getSANPromotionAccess().getNKeyword_2_3()); 

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
    // $ANTLR end "rule__SANPromotion__Alternatives_2"


    // $ANTLR start "rule__SANCheckMarker__Alternatives_1"
    // InternalChessDSL.g:1527:1: rule__SANCheckMarker__Alternatives_1 : ( ( '+' ) | ( '#' ) );
    public final void rule__SANCheckMarker__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1531:1: ( ( '+' ) | ( '#' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            else if ( (LA19_0==27) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalChessDSL.g:1532:2: ( '+' )
                    {
                    // InternalChessDSL.g:1532:2: ( '+' )
                    // InternalChessDSL.g:1533:3: '+'
                    {
                     before(grammarAccess.getSANCheckMarkerAccess().getPlusSignKeyword_1_0()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getSANCheckMarkerAccess().getPlusSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1538:2: ( '#' )
                    {
                    // InternalChessDSL.g:1538:2: ( '#' )
                    // InternalChessDSL.g:1539:3: '#'
                    {
                     before(grammarAccess.getSANCheckMarkerAccess().getNumberSignKeyword_1_1()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getSANCheckMarkerAccess().getNumberSignKeyword_1_1()); 

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
    // $ANTLR end "rule__SANCheckMarker__Alternatives_1"


    // $ANTLR start "rule__SANRemark__Alternatives_1"
    // InternalChessDSL.g:1548:1: rule__SANRemark__Alternatives_1 : ( ( '!' ) | ( '?' ) );
    public final void rule__SANRemark__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1552:1: ( ( '!' ) | ( '?' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            else if ( (LA20_0==29) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalChessDSL.g:1553:2: ( '!' )
                    {
                    // InternalChessDSL.g:1553:2: ( '!' )
                    // InternalChessDSL.g:1554:3: '!'
                    {
                     before(grammarAccess.getSANRemarkAccess().getExclamationMarkKeyword_1_0()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getSANRemarkAccess().getExclamationMarkKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1559:2: ( '?' )
                    {
                    // InternalChessDSL.g:1559:2: ( '?' )
                    // InternalChessDSL.g:1560:3: '?'
                    {
                     before(grammarAccess.getSANRemarkAccess().getQuestionMarkKeyword_1_1()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getSANRemarkAccess().getQuestionMarkKeyword_1_1()); 

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
    // $ANTLR end "rule__SANRemark__Alternatives_1"


    // $ANTLR start "rule__Method__Alternatives"
    // InternalChessDSL.g:1569:1: rule__Method__Alternatives : ( ( ( rule__Method__WinAssignment_0 ) ) | ( ( rule__Method__DrawAssignment_1 ) ) );
    public final void rule__Method__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1573:1: ( ( ( rule__Method__WinAssignment_0 ) ) | ( ( rule__Method__DrawAssignment_1 ) ) )
            int alt21=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==73||(LA21_1>=77 && LA21_1<=78)) ) {
                    alt21=1;
                }
                else if ( (LA21_1==64) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==73||(LA21_2>=77 && LA21_2<=78)) ) {
                    alt21=1;
                }
                else if ( (LA21_2==64) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;
                }
                }
                break;
            case 39:
                {
                int LA21_3 = input.LA(2);

                if ( (LA21_3==73||(LA21_3>=77 && LA21_3<=78)) ) {
                    alt21=1;
                }
                else if ( (LA21_3==64) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalChessDSL.g:1574:2: ( ( rule__Method__WinAssignment_0 ) )
                    {
                    // InternalChessDSL.g:1574:2: ( ( rule__Method__WinAssignment_0 ) )
                    // InternalChessDSL.g:1575:3: ( rule__Method__WinAssignment_0 )
                    {
                     before(grammarAccess.getMethodAccess().getWinAssignment_0()); 
                    // InternalChessDSL.g:1576:3: ( rule__Method__WinAssignment_0 )
                    // InternalChessDSL.g:1576:4: rule__Method__WinAssignment_0
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
                    // InternalChessDSL.g:1580:2: ( ( rule__Method__DrawAssignment_1 ) )
                    {
                    // InternalChessDSL.g:1580:2: ( ( rule__Method__DrawAssignment_1 ) )
                    // InternalChessDSL.g:1581:3: ( rule__Method__DrawAssignment_1 )
                    {
                     before(grammarAccess.getMethodAccess().getDrawAssignment_1()); 
                    // InternalChessDSL.g:1582:3: ( rule__Method__DrawAssignment_1 )
                    // InternalChessDSL.g:1582:4: rule__Method__DrawAssignment_1
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
    // InternalChessDSL.g:1590:1: rule__Win__Alternatives : ( ( ( rule__Win__TimeAssignment_0 ) ) | ( ( rule__Win__ResignAssignment_1 ) ) | ( ( rule__Win__MateAssignment_2 ) ) );
    public final void rule__Win__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1594:1: ( ( ( rule__Win__TimeAssignment_0 ) ) | ( ( rule__Win__ResignAssignment_1 ) ) | ( ( rule__Win__MateAssignment_2 ) ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 73:
                    {
                    alt22=1;
                    }
                    break;
                case 78:
                    {
                    alt22=3;
                    }
                    break;
                case 77:
                    {
                    alt22=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }

                }
                break;
            case 38:
                {
                switch ( input.LA(2) ) {
                case 78:
                    {
                    alt22=3;
                    }
                    break;
                case 77:
                    {
                    alt22=2;
                    }
                    break;
                case 73:
                    {
                    alt22=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 2, input);

                    throw nvae;
                }

                }
                break;
            case 39:
                {
                switch ( input.LA(2) ) {
                case 78:
                    {
                    alt22=3;
                    }
                    break;
                case 77:
                    {
                    alt22=2;
                    }
                    break;
                case 73:
                    {
                    alt22=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalChessDSL.g:1595:2: ( ( rule__Win__TimeAssignment_0 ) )
                    {
                    // InternalChessDSL.g:1595:2: ( ( rule__Win__TimeAssignment_0 ) )
                    // InternalChessDSL.g:1596:3: ( rule__Win__TimeAssignment_0 )
                    {
                     before(grammarAccess.getWinAccess().getTimeAssignment_0()); 
                    // InternalChessDSL.g:1597:3: ( rule__Win__TimeAssignment_0 )
                    // InternalChessDSL.g:1597:4: rule__Win__TimeAssignment_0
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
                    // InternalChessDSL.g:1601:2: ( ( rule__Win__ResignAssignment_1 ) )
                    {
                    // InternalChessDSL.g:1601:2: ( ( rule__Win__ResignAssignment_1 ) )
                    // InternalChessDSL.g:1602:3: ( rule__Win__ResignAssignment_1 )
                    {
                     before(grammarAccess.getWinAccess().getResignAssignment_1()); 
                    // InternalChessDSL.g:1603:3: ( rule__Win__ResignAssignment_1 )
                    // InternalChessDSL.g:1603:4: rule__Win__ResignAssignment_1
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
                    // InternalChessDSL.g:1607:2: ( ( rule__Win__MateAssignment_2 ) )
                    {
                    // InternalChessDSL.g:1607:2: ( ( rule__Win__MateAssignment_2 ) )
                    // InternalChessDSL.g:1608:3: ( rule__Win__MateAssignment_2 )
                    {
                     before(grammarAccess.getWinAccess().getMateAssignment_2()); 
                    // InternalChessDSL.g:1609:3: ( rule__Win__MateAssignment_2 )
                    // InternalChessDSL.g:1609:4: rule__Win__MateAssignment_2
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
    // InternalChessDSL.g:1617:1: rule__Draw__ResultAlternatives_3_0 : ( ( ruleStalemate ) | ( ruleThreefold ) | ( ruleFifty ) | ( ruleAgree ) );
    public final void rule__Draw__ResultAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1621:1: ( ( ruleStalemate ) | ( ruleThreefold ) | ( ruleFifty ) | ( ruleAgree ) )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt23=1;
                }
                break;
            case 84:
                {
                alt23=2;
                }
                break;
            case 88:
                {
                alt23=3;
                }
                break;
            case 92:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalChessDSL.g:1622:2: ( ruleStalemate )
                    {
                    // InternalChessDSL.g:1622:2: ( ruleStalemate )
                    // InternalChessDSL.g:1623:3: ruleStalemate
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
                    // InternalChessDSL.g:1628:2: ( ruleThreefold )
                    {
                    // InternalChessDSL.g:1628:2: ( ruleThreefold )
                    // InternalChessDSL.g:1629:3: ruleThreefold
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
                    // InternalChessDSL.g:1634:2: ( ruleFifty )
                    {
                    // InternalChessDSL.g:1634:2: ( ruleFifty )
                    // InternalChessDSL.g:1635:3: ruleFifty
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
                    // InternalChessDSL.g:1640:2: ( ruleAgree )
                    {
                    // InternalChessDSL.g:1640:2: ( ruleAgree )
                    // InternalChessDSL.g:1641:3: ruleAgree
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
    // InternalChessDSL.g:1650:1: rule__Result__Alternatives : ( ( ( rule__Result__Group_0__0 ) ) | ( 'draw' ) );
    public final void rule__Result__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1654:1: ( ( ( rule__Result__Group_0__0 ) ) | ( 'draw' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID||(LA24_0>=38 && LA24_0<=39)) ) {
                alt24=1;
            }
            else if ( (LA24_0==30) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalChessDSL.g:1655:2: ( ( rule__Result__Group_0__0 ) )
                    {
                    // InternalChessDSL.g:1655:2: ( ( rule__Result__Group_0__0 ) )
                    // InternalChessDSL.g:1656:3: ( rule__Result__Group_0__0 )
                    {
                     before(grammarAccess.getResultAccess().getGroup_0()); 
                    // InternalChessDSL.g:1657:3: ( rule__Result__Group_0__0 )
                    // InternalChessDSL.g:1657:4: rule__Result__Group_0__0
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
                    // InternalChessDSL.g:1661:2: ( 'draw' )
                    {
                    // InternalChessDSL.g:1661:2: ( 'draw' )
                    // InternalChessDSL.g:1662:3: 'draw'
                    {
                     before(grammarAccess.getResultAccess().getDrawKeyword_1()); 
                    match(input,30,FOLLOW_2); 
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
    // InternalChessDSL.g:1671:1: rule__Result__Alternatives_0_0 : ( ( ( rule__Result__PlayerAssignment_0_0_0 ) ) | ( ( rule__Result__ColorAssignment_0_0_1 ) ) );
    public final void rule__Result__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1675:1: ( ( ( rule__Result__PlayerAssignment_0_0_0 ) ) | ( ( rule__Result__ColorAssignment_0_0_1 ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=38 && LA25_0<=39)) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalChessDSL.g:1676:2: ( ( rule__Result__PlayerAssignment_0_0_0 ) )
                    {
                    // InternalChessDSL.g:1676:2: ( ( rule__Result__PlayerAssignment_0_0_0 ) )
                    // InternalChessDSL.g:1677:3: ( rule__Result__PlayerAssignment_0_0_0 )
                    {
                     before(grammarAccess.getResultAccess().getPlayerAssignment_0_0_0()); 
                    // InternalChessDSL.g:1678:3: ( rule__Result__PlayerAssignment_0_0_0 )
                    // InternalChessDSL.g:1678:4: rule__Result__PlayerAssignment_0_0_0
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
                    // InternalChessDSL.g:1682:2: ( ( rule__Result__ColorAssignment_0_0_1 ) )
                    {
                    // InternalChessDSL.g:1682:2: ( ( rule__Result__ColorAssignment_0_0_1 ) )
                    // InternalChessDSL.g:1683:3: ( rule__Result__ColorAssignment_0_0_1 )
                    {
                     before(grammarAccess.getResultAccess().getColorAssignment_0_0_1()); 
                    // InternalChessDSL.g:1684:3: ( rule__Result__ColorAssignment_0_0_1 )
                    // InternalChessDSL.g:1684:4: rule__Result__ColorAssignment_0_0_1
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
    // InternalChessDSL.g:1692:1: rule__PlayerOrColor__Alternatives : ( ( ( rule__PlayerOrColor__PlayerAssignment_0 ) ) | ( ( rule__PlayerOrColor__ColorAssignment_1 ) ) );
    public final void rule__PlayerOrColor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1696:1: ( ( ( rule__PlayerOrColor__PlayerAssignment_0 ) ) | ( ( rule__PlayerOrColor__ColorAssignment_1 ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=38 && LA26_0<=39)) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalChessDSL.g:1697:2: ( ( rule__PlayerOrColor__PlayerAssignment_0 ) )
                    {
                    // InternalChessDSL.g:1697:2: ( ( rule__PlayerOrColor__PlayerAssignment_0 ) )
                    // InternalChessDSL.g:1698:3: ( rule__PlayerOrColor__PlayerAssignment_0 )
                    {
                     before(grammarAccess.getPlayerOrColorAccess().getPlayerAssignment_0()); 
                    // InternalChessDSL.g:1699:3: ( rule__PlayerOrColor__PlayerAssignment_0 )
                    // InternalChessDSL.g:1699:4: rule__PlayerOrColor__PlayerAssignment_0
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
                    // InternalChessDSL.g:1703:2: ( ( rule__PlayerOrColor__ColorAssignment_1 ) )
                    {
                    // InternalChessDSL.g:1703:2: ( ( rule__PlayerOrColor__ColorAssignment_1 ) )
                    // InternalChessDSL.g:1704:3: ( rule__PlayerOrColor__ColorAssignment_1 )
                    {
                     before(grammarAccess.getPlayerOrColorAccess().getColorAssignment_1()); 
                    // InternalChessDSL.g:1705:3: ( rule__PlayerOrColor__ColorAssignment_1 )
                    // InternalChessDSL.g:1705:4: rule__PlayerOrColor__ColorAssignment_1
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
    // InternalChessDSL.g:1713:1: rule__Remark__Alternatives : ( ( ( 'Good' ) ) | ( ( 'Bad' ) ) | ( ( 'Excellent' ) ) | ( ( 'Risky' ) ) | ( ( 'Dubious' ) ) | ( ( 'Check' ) ) | ( ( 'Checkmate' ) ) );
    public final void rule__Remark__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1717:1: ( ( ( 'Good' ) ) | ( ( 'Bad' ) ) | ( ( 'Excellent' ) ) | ( ( 'Risky' ) ) | ( ( 'Dubious' ) ) | ( ( 'Check' ) ) | ( ( 'Checkmate' ) ) )
            int alt27=7;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt27=1;
                }
                break;
            case 32:
                {
                alt27=2;
                }
                break;
            case 33:
                {
                alt27=3;
                }
                break;
            case 34:
                {
                alt27=4;
                }
                break;
            case 35:
                {
                alt27=5;
                }
                break;
            case 36:
                {
                alt27=6;
                }
                break;
            case 37:
                {
                alt27=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalChessDSL.g:1718:2: ( ( 'Good' ) )
                    {
                    // InternalChessDSL.g:1718:2: ( ( 'Good' ) )
                    // InternalChessDSL.g:1719:3: ( 'Good' )
                    {
                     before(grammarAccess.getRemarkAccess().getGoodEnumLiteralDeclaration_0()); 
                    // InternalChessDSL.g:1720:3: ( 'Good' )
                    // InternalChessDSL.g:1720:4: 'Good'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getRemarkAccess().getGoodEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1724:2: ( ( 'Bad' ) )
                    {
                    // InternalChessDSL.g:1724:2: ( ( 'Bad' ) )
                    // InternalChessDSL.g:1725:3: ( 'Bad' )
                    {
                     before(grammarAccess.getRemarkAccess().getBadEnumLiteralDeclaration_1()); 
                    // InternalChessDSL.g:1726:3: ( 'Bad' )
                    // InternalChessDSL.g:1726:4: 'Bad'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getRemarkAccess().getBadEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalChessDSL.g:1730:2: ( ( 'Excellent' ) )
                    {
                    // InternalChessDSL.g:1730:2: ( ( 'Excellent' ) )
                    // InternalChessDSL.g:1731:3: ( 'Excellent' )
                    {
                     before(grammarAccess.getRemarkAccess().getExcellentEnumLiteralDeclaration_2()); 
                    // InternalChessDSL.g:1732:3: ( 'Excellent' )
                    // InternalChessDSL.g:1732:4: 'Excellent'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getRemarkAccess().getExcellentEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalChessDSL.g:1736:2: ( ( 'Risky' ) )
                    {
                    // InternalChessDSL.g:1736:2: ( ( 'Risky' ) )
                    // InternalChessDSL.g:1737:3: ( 'Risky' )
                    {
                     before(grammarAccess.getRemarkAccess().getRiskyEnumLiteralDeclaration_3()); 
                    // InternalChessDSL.g:1738:3: ( 'Risky' )
                    // InternalChessDSL.g:1738:4: 'Risky'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getRemarkAccess().getRiskyEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalChessDSL.g:1742:2: ( ( 'Dubious' ) )
                    {
                    // InternalChessDSL.g:1742:2: ( ( 'Dubious' ) )
                    // InternalChessDSL.g:1743:3: ( 'Dubious' )
                    {
                     before(grammarAccess.getRemarkAccess().getDubiousEnumLiteralDeclaration_4()); 
                    // InternalChessDSL.g:1744:3: ( 'Dubious' )
                    // InternalChessDSL.g:1744:4: 'Dubious'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getRemarkAccess().getDubiousEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalChessDSL.g:1748:2: ( ( 'Check' ) )
                    {
                    // InternalChessDSL.g:1748:2: ( ( 'Check' ) )
                    // InternalChessDSL.g:1749:3: ( 'Check' )
                    {
                     before(grammarAccess.getRemarkAccess().getCheckEnumLiteralDeclaration_5()); 
                    // InternalChessDSL.g:1750:3: ( 'Check' )
                    // InternalChessDSL.g:1750:4: 'Check'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getRemarkAccess().getCheckEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalChessDSL.g:1754:2: ( ( 'Checkmate' ) )
                    {
                    // InternalChessDSL.g:1754:2: ( ( 'Checkmate' ) )
                    // InternalChessDSL.g:1755:3: ( 'Checkmate' )
                    {
                     before(grammarAccess.getRemarkAccess().getCheckmateEnumLiteralDeclaration_6()); 
                    // InternalChessDSL.g:1756:3: ( 'Checkmate' )
                    // InternalChessDSL.g:1756:4: 'Checkmate'
                    {
                    match(input,37,FOLLOW_2); 

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
    // InternalChessDSL.g:1764:1: rule__Color__Alternatives : ( ( ( 'White' ) ) | ( ( 'Black' ) ) );
    public final void rule__Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1768:1: ( ( ( 'White' ) ) | ( ( 'Black' ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            else if ( (LA28_0==39) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalChessDSL.g:1769:2: ( ( 'White' ) )
                    {
                    // InternalChessDSL.g:1769:2: ( ( 'White' ) )
                    // InternalChessDSL.g:1770:3: ( 'White' )
                    {
                     before(grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_0()); 
                    // InternalChessDSL.g:1771:3: ( 'White' )
                    // InternalChessDSL.g:1771:4: 'White'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1775:2: ( ( 'Black' ) )
                    {
                    // InternalChessDSL.g:1775:2: ( ( 'Black' ) )
                    // InternalChessDSL.g:1776:3: ( 'Black' )
                    {
                     before(grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1()); 
                    // InternalChessDSL.g:1777:3: ( 'Black' )
                    // InternalChessDSL.g:1777:4: 'Black'
                    {
                    match(input,39,FOLLOW_2); 

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
    // InternalChessDSL.g:1785:1: rule__Piece__Alternatives : ( ( ( 'King' ) ) | ( ( 'Queen' ) ) | ( ( 'Rook' ) ) | ( ( 'Bishop' ) ) | ( ( 'Knight' ) ) | ( ( 'Pawn' ) ) );
    public final void rule__Piece__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1789:1: ( ( ( 'King' ) ) | ( ( 'Queen' ) ) | ( ( 'Rook' ) ) | ( ( 'Bishop' ) ) | ( ( 'Knight' ) ) | ( ( 'Pawn' ) ) )
            int alt29=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt29=1;
                }
                break;
            case 41:
                {
                alt29=2;
                }
                break;
            case 42:
                {
                alt29=3;
                }
                break;
            case 43:
                {
                alt29=4;
                }
                break;
            case 44:
                {
                alt29=5;
                }
                break;
            case 45:
                {
                alt29=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalChessDSL.g:1790:2: ( ( 'King' ) )
                    {
                    // InternalChessDSL.g:1790:2: ( ( 'King' ) )
                    // InternalChessDSL.g:1791:3: ( 'King' )
                    {
                     before(grammarAccess.getPieceAccess().getKingEnumLiteralDeclaration_0()); 
                    // InternalChessDSL.g:1792:3: ( 'King' )
                    // InternalChessDSL.g:1792:4: 'King'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getPieceAccess().getKingEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:1796:2: ( ( 'Queen' ) )
                    {
                    // InternalChessDSL.g:1796:2: ( ( 'Queen' ) )
                    // InternalChessDSL.g:1797:3: ( 'Queen' )
                    {
                     before(grammarAccess.getPieceAccess().getQueenEnumLiteralDeclaration_1()); 
                    // InternalChessDSL.g:1798:3: ( 'Queen' )
                    // InternalChessDSL.g:1798:4: 'Queen'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getPieceAccess().getQueenEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalChessDSL.g:1802:2: ( ( 'Rook' ) )
                    {
                    // InternalChessDSL.g:1802:2: ( ( 'Rook' ) )
                    // InternalChessDSL.g:1803:3: ( 'Rook' )
                    {
                     before(grammarAccess.getPieceAccess().getRookEnumLiteralDeclaration_2()); 
                    // InternalChessDSL.g:1804:3: ( 'Rook' )
                    // InternalChessDSL.g:1804:4: 'Rook'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getPieceAccess().getRookEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalChessDSL.g:1808:2: ( ( 'Bishop' ) )
                    {
                    // InternalChessDSL.g:1808:2: ( ( 'Bishop' ) )
                    // InternalChessDSL.g:1809:3: ( 'Bishop' )
                    {
                     before(grammarAccess.getPieceAccess().getBishopEnumLiteralDeclaration_3()); 
                    // InternalChessDSL.g:1810:3: ( 'Bishop' )
                    // InternalChessDSL.g:1810:4: 'Bishop'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getPieceAccess().getBishopEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalChessDSL.g:1814:2: ( ( 'Knight' ) )
                    {
                    // InternalChessDSL.g:1814:2: ( ( 'Knight' ) )
                    // InternalChessDSL.g:1815:3: ( 'Knight' )
                    {
                     before(grammarAccess.getPieceAccess().getKnightEnumLiteralDeclaration_4()); 
                    // InternalChessDSL.g:1816:3: ( 'Knight' )
                    // InternalChessDSL.g:1816:4: 'Knight'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getPieceAccess().getKnightEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalChessDSL.g:1820:2: ( ( 'Pawn' ) )
                    {
                    // InternalChessDSL.g:1820:2: ( ( 'Pawn' ) )
                    // InternalChessDSL.g:1821:3: ( 'Pawn' )
                    {
                     before(grammarAccess.getPieceAccess().getPawnEnumLiteralDeclaration_5()); 
                    // InternalChessDSL.g:1822:3: ( 'Pawn' )
                    // InternalChessDSL.g:1822:4: 'Pawn'
                    {
                    match(input,45,FOLLOW_2); 

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
    // InternalChessDSL.g:1830:1: rule__Game__Group__0 : rule__Game__Group__0__Impl rule__Game__Group__1 ;
    public final void rule__Game__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1834:1: ( rule__Game__Group__0__Impl rule__Game__Group__1 )
            // InternalChessDSL.g:1835:2: rule__Game__Group__0__Impl rule__Game__Group__1
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
    // InternalChessDSL.g:1842:1: rule__Game__Group__0__Impl : ( 'Game' ) ;
    public final void rule__Game__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1846:1: ( ( 'Game' ) )
            // InternalChessDSL.g:1847:1: ( 'Game' )
            {
            // InternalChessDSL.g:1847:1: ( 'Game' )
            // InternalChessDSL.g:1848:2: 'Game'
            {
             before(grammarAccess.getGameAccess().getGameKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalChessDSL.g:1857:1: rule__Game__Group__1 : rule__Game__Group__1__Impl rule__Game__Group__2 ;
    public final void rule__Game__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1861:1: ( rule__Game__Group__1__Impl rule__Game__Group__2 )
            // InternalChessDSL.g:1862:2: rule__Game__Group__1__Impl rule__Game__Group__2
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
    // InternalChessDSL.g:1869:1: rule__Game__Group__1__Impl : ( ( rule__Game__TitleAssignment_1 ) ) ;
    public final void rule__Game__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1873:1: ( ( ( rule__Game__TitleAssignment_1 ) ) )
            // InternalChessDSL.g:1874:1: ( ( rule__Game__TitleAssignment_1 ) )
            {
            // InternalChessDSL.g:1874:1: ( ( rule__Game__TitleAssignment_1 ) )
            // InternalChessDSL.g:1875:2: ( rule__Game__TitleAssignment_1 )
            {
             before(grammarAccess.getGameAccess().getTitleAssignment_1()); 
            // InternalChessDSL.g:1876:2: ( rule__Game__TitleAssignment_1 )
            // InternalChessDSL.g:1876:3: rule__Game__TitleAssignment_1
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
    // InternalChessDSL.g:1884:1: rule__Game__Group__2 : rule__Game__Group__2__Impl rule__Game__Group__3 ;
    public final void rule__Game__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1888:1: ( rule__Game__Group__2__Impl rule__Game__Group__3 )
            // InternalChessDSL.g:1889:2: rule__Game__Group__2__Impl rule__Game__Group__3
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
    // InternalChessDSL.g:1896:1: rule__Game__Group__2__Impl : ( ( rule__Game__Group_2__0 )? ) ;
    public final void rule__Game__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1900:1: ( ( ( rule__Game__Group_2__0 )? ) )
            // InternalChessDSL.g:1901:1: ( ( rule__Game__Group_2__0 )? )
            {
            // InternalChessDSL.g:1901:1: ( ( rule__Game__Group_2__0 )? )
            // InternalChessDSL.g:1902:2: ( rule__Game__Group_2__0 )?
            {
             before(grammarAccess.getGameAccess().getGroup_2()); 
            // InternalChessDSL.g:1903:2: ( rule__Game__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==49) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalChessDSL.g:1903:3: rule__Game__Group_2__0
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
    // InternalChessDSL.g:1911:1: rule__Game__Group__3 : rule__Game__Group__3__Impl rule__Game__Group__4 ;
    public final void rule__Game__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1915:1: ( rule__Game__Group__3__Impl rule__Game__Group__4 )
            // InternalChessDSL.g:1916:2: rule__Game__Group__3__Impl rule__Game__Group__4
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
    // InternalChessDSL.g:1923:1: rule__Game__Group__3__Impl : ( ( rule__Game__InitialAssignment_3 )? ) ;
    public final void rule__Game__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1927:1: ( ( ( rule__Game__InitialAssignment_3 )? ) )
            // InternalChessDSL.g:1928:1: ( ( rule__Game__InitialAssignment_3 )? )
            {
            // InternalChessDSL.g:1928:1: ( ( rule__Game__InitialAssignment_3 )? )
            // InternalChessDSL.g:1929:2: ( rule__Game__InitialAssignment_3 )?
            {
             before(grammarAccess.getGameAccess().getInitialAssignment_3()); 
            // InternalChessDSL.g:1930:2: ( rule__Game__InitialAssignment_3 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==51) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalChessDSL.g:1930:3: rule__Game__InitialAssignment_3
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
    // InternalChessDSL.g:1938:1: rule__Game__Group__4 : rule__Game__Group__4__Impl rule__Game__Group__5 ;
    public final void rule__Game__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1942:1: ( rule__Game__Group__4__Impl rule__Game__Group__5 )
            // InternalChessDSL.g:1943:2: rule__Game__Group__4__Impl rule__Game__Group__5
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
    // InternalChessDSL.g:1950:1: rule__Game__Group__4__Impl : ( 'Moves:' ) ;
    public final void rule__Game__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1954:1: ( ( 'Moves:' ) )
            // InternalChessDSL.g:1955:1: ( 'Moves:' )
            {
            // InternalChessDSL.g:1955:1: ( 'Moves:' )
            // InternalChessDSL.g:1956:2: 'Moves:'
            {
             before(grammarAccess.getGameAccess().getMovesKeyword_4()); 
            match(input,47,FOLLOW_2); 
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
    // InternalChessDSL.g:1965:1: rule__Game__Group__5 : rule__Game__Group__5__Impl rule__Game__Group__6 ;
    public final void rule__Game__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1969:1: ( rule__Game__Group__5__Impl rule__Game__Group__6 )
            // InternalChessDSL.g:1970:2: rule__Game__Group__5__Impl rule__Game__Group__6
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
    // InternalChessDSL.g:1977:1: rule__Game__Group__5__Impl : ( ( rule__Game__MovesAssignment_5 )* ) ;
    public final void rule__Game__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1981:1: ( ( ( rule__Game__MovesAssignment_5 )* ) )
            // InternalChessDSL.g:1982:1: ( ( rule__Game__MovesAssignment_5 )* )
            {
            // InternalChessDSL.g:1982:1: ( ( rule__Game__MovesAssignment_5 )* )
            // InternalChessDSL.g:1983:2: ( rule__Game__MovesAssignment_5 )*
            {
             before(grammarAccess.getGameAccess().getMovesAssignment_5()); 
            // InternalChessDSL.g:1984:2: ( rule__Game__MovesAssignment_5 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_MOVENUMBER) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalChessDSL.g:1984:3: rule__Game__MovesAssignment_5
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Game__MovesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalChessDSL.g:1992:1: rule__Game__Group__6 : rule__Game__Group__6__Impl rule__Game__Group__7 ;
    public final void rule__Game__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:1996:1: ( rule__Game__Group__6__Impl rule__Game__Group__7 )
            // InternalChessDSL.g:1997:2: rule__Game__Group__6__Impl rule__Game__Group__7
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
    // InternalChessDSL.g:2004:1: rule__Game__Group__6__Impl : ( 'end' ) ;
    public final void rule__Game__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2008:1: ( ( 'end' ) )
            // InternalChessDSL.g:2009:1: ( 'end' )
            {
            // InternalChessDSL.g:2009:1: ( 'end' )
            // InternalChessDSL.g:2010:2: 'end'
            {
             before(grammarAccess.getGameAccess().getEndKeyword_6()); 
            match(input,48,FOLLOW_2); 
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
    // InternalChessDSL.g:2019:1: rule__Game__Group__7 : rule__Game__Group__7__Impl ;
    public final void rule__Game__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2023:1: ( rule__Game__Group__7__Impl )
            // InternalChessDSL.g:2024:2: rule__Game__Group__7__Impl
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
    // InternalChessDSL.g:2030:1: rule__Game__Group__7__Impl : ( ( rule__Game__ConclusionAssignment_7 )? ) ;
    public final void rule__Game__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2034:1: ( ( ( rule__Game__ConclusionAssignment_7 )? ) )
            // InternalChessDSL.g:2035:1: ( ( rule__Game__ConclusionAssignment_7 )? )
            {
            // InternalChessDSL.g:2035:1: ( ( rule__Game__ConclusionAssignment_7 )? )
            // InternalChessDSL.g:2036:2: ( rule__Game__ConclusionAssignment_7 )?
            {
             before(grammarAccess.getGameAccess().getConclusionAssignment_7()); 
            // InternalChessDSL.g:2037:2: ( rule__Game__ConclusionAssignment_7 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID||LA33_0==30||(LA33_0>=38 && LA33_0<=39)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalChessDSL.g:2037:3: rule__Game__ConclusionAssignment_7
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
    // InternalChessDSL.g:2046:1: rule__Game__Group_2__0 : rule__Game__Group_2__0__Impl rule__Game__Group_2__1 ;
    public final void rule__Game__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2050:1: ( rule__Game__Group_2__0__Impl rule__Game__Group_2__1 )
            // InternalChessDSL.g:2051:2: rule__Game__Group_2__0__Impl rule__Game__Group_2__1
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
    // InternalChessDSL.g:2058:1: rule__Game__Group_2__0__Impl : ( 'Players:' ) ;
    public final void rule__Game__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2062:1: ( ( 'Players:' ) )
            // InternalChessDSL.g:2063:1: ( 'Players:' )
            {
            // InternalChessDSL.g:2063:1: ( 'Players:' )
            // InternalChessDSL.g:2064:2: 'Players:'
            {
             before(grammarAccess.getGameAccess().getPlayersKeyword_2_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalChessDSL.g:2073:1: rule__Game__Group_2__1 : rule__Game__Group_2__1__Impl ;
    public final void rule__Game__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2077:1: ( rule__Game__Group_2__1__Impl )
            // InternalChessDSL.g:2078:2: rule__Game__Group_2__1__Impl
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
    // InternalChessDSL.g:2084:1: rule__Game__Group_2__1__Impl : ( ( ( rule__Game__PlayersAssignment_2_1 ) ) ( ( rule__Game__PlayersAssignment_2_1 )* ) ) ;
    public final void rule__Game__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2088:1: ( ( ( ( rule__Game__PlayersAssignment_2_1 ) ) ( ( rule__Game__PlayersAssignment_2_1 )* ) ) )
            // InternalChessDSL.g:2089:1: ( ( ( rule__Game__PlayersAssignment_2_1 ) ) ( ( rule__Game__PlayersAssignment_2_1 )* ) )
            {
            // InternalChessDSL.g:2089:1: ( ( ( rule__Game__PlayersAssignment_2_1 ) ) ( ( rule__Game__PlayersAssignment_2_1 )* ) )
            // InternalChessDSL.g:2090:2: ( ( rule__Game__PlayersAssignment_2_1 ) ) ( ( rule__Game__PlayersAssignment_2_1 )* )
            {
            // InternalChessDSL.g:2090:2: ( ( rule__Game__PlayersAssignment_2_1 ) )
            // InternalChessDSL.g:2091:3: ( rule__Game__PlayersAssignment_2_1 )
            {
             before(grammarAccess.getGameAccess().getPlayersAssignment_2_1()); 
            // InternalChessDSL.g:2092:3: ( rule__Game__PlayersAssignment_2_1 )
            // InternalChessDSL.g:2092:4: rule__Game__PlayersAssignment_2_1
            {
            pushFollow(FOLLOW_9);
            rule__Game__PlayersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getPlayersAssignment_2_1()); 

            }

            // InternalChessDSL.g:2095:2: ( ( rule__Game__PlayersAssignment_2_1 )* )
            // InternalChessDSL.g:2096:3: ( rule__Game__PlayersAssignment_2_1 )*
            {
             before(grammarAccess.getGameAccess().getPlayersAssignment_2_1()); 
            // InternalChessDSL.g:2097:3: ( rule__Game__PlayersAssignment_2_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=38 && LA34_0<=39)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalChessDSL.g:2097:4: rule__Game__PlayersAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Game__PlayersAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalChessDSL.g:2107:1: rule__Player__Group__0 : rule__Player__Group__0__Impl rule__Player__Group__1 ;
    public final void rule__Player__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2111:1: ( rule__Player__Group__0__Impl rule__Player__Group__1 )
            // InternalChessDSL.g:2112:2: rule__Player__Group__0__Impl rule__Player__Group__1
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
    // InternalChessDSL.g:2119:1: rule__Player__Group__0__Impl : ( ( rule__Player__ColorAssignment_0 ) ) ;
    public final void rule__Player__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2123:1: ( ( ( rule__Player__ColorAssignment_0 ) ) )
            // InternalChessDSL.g:2124:1: ( ( rule__Player__ColorAssignment_0 ) )
            {
            // InternalChessDSL.g:2124:1: ( ( rule__Player__ColorAssignment_0 ) )
            // InternalChessDSL.g:2125:2: ( rule__Player__ColorAssignment_0 )
            {
             before(grammarAccess.getPlayerAccess().getColorAssignment_0()); 
            // InternalChessDSL.g:2126:2: ( rule__Player__ColorAssignment_0 )
            // InternalChessDSL.g:2126:3: rule__Player__ColorAssignment_0
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
    // InternalChessDSL.g:2134:1: rule__Player__Group__1 : rule__Player__Group__1__Impl rule__Player__Group__2 ;
    public final void rule__Player__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2138:1: ( rule__Player__Group__1__Impl rule__Player__Group__2 )
            // InternalChessDSL.g:2139:2: rule__Player__Group__1__Impl rule__Player__Group__2
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
    // InternalChessDSL.g:2146:1: rule__Player__Group__1__Impl : ( ':' ) ;
    public final void rule__Player__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2150:1: ( ( ':' ) )
            // InternalChessDSL.g:2151:1: ( ':' )
            {
            // InternalChessDSL.g:2151:1: ( ':' )
            // InternalChessDSL.g:2152:2: ':'
            {
             before(grammarAccess.getPlayerAccess().getColonKeyword_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalChessDSL.g:2161:1: rule__Player__Group__2 : rule__Player__Group__2__Impl ;
    public final void rule__Player__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2165:1: ( rule__Player__Group__2__Impl )
            // InternalChessDSL.g:2166:2: rule__Player__Group__2__Impl
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
    // InternalChessDSL.g:2172:1: rule__Player__Group__2__Impl : ( ( rule__Player__NameAssignment_2 ) ) ;
    public final void rule__Player__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2176:1: ( ( ( rule__Player__NameAssignment_2 ) ) )
            // InternalChessDSL.g:2177:1: ( ( rule__Player__NameAssignment_2 ) )
            {
            // InternalChessDSL.g:2177:1: ( ( rule__Player__NameAssignment_2 ) )
            // InternalChessDSL.g:2178:2: ( rule__Player__NameAssignment_2 )
            {
             before(grammarAccess.getPlayerAccess().getNameAssignment_2()); 
            // InternalChessDSL.g:2179:2: ( rule__Player__NameAssignment_2 )
            // InternalChessDSL.g:2179:3: rule__Player__NameAssignment_2
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
    // InternalChessDSL.g:2188:1: rule__InitialState__Group__0 : rule__InitialState__Group__0__Impl rule__InitialState__Group__1 ;
    public final void rule__InitialState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2192:1: ( rule__InitialState__Group__0__Impl rule__InitialState__Group__1 )
            // InternalChessDSL.g:2193:2: rule__InitialState__Group__0__Impl rule__InitialState__Group__1
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
    // InternalChessDSL.g:2200:1: rule__InitialState__Group__0__Impl : ( () ) ;
    public final void rule__InitialState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2204:1: ( ( () ) )
            // InternalChessDSL.g:2205:1: ( () )
            {
            // InternalChessDSL.g:2205:1: ( () )
            // InternalChessDSL.g:2206:2: ()
            {
             before(grammarAccess.getInitialStateAccess().getInitialStateAction_0()); 
            // InternalChessDSL.g:2207:2: ()
            // InternalChessDSL.g:2207:3: 
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
    // InternalChessDSL.g:2215:1: rule__InitialState__Group__1 : rule__InitialState__Group__1__Impl rule__InitialState__Group__2 ;
    public final void rule__InitialState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2219:1: ( rule__InitialState__Group__1__Impl rule__InitialState__Group__2 )
            // InternalChessDSL.g:2220:2: rule__InitialState__Group__1__Impl rule__InitialState__Group__2
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
    // InternalChessDSL.g:2227:1: rule__InitialState__Group__1__Impl : ( 'InitialState' ) ;
    public final void rule__InitialState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2231:1: ( ( 'InitialState' ) )
            // InternalChessDSL.g:2232:1: ( 'InitialState' )
            {
            // InternalChessDSL.g:2232:1: ( 'InitialState' )
            // InternalChessDSL.g:2233:2: 'InitialState'
            {
             before(grammarAccess.getInitialStateAccess().getInitialStateKeyword_1()); 
            match(input,51,FOLLOW_2); 
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
    // InternalChessDSL.g:2242:1: rule__InitialState__Group__2 : rule__InitialState__Group__2__Impl ;
    public final void rule__InitialState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2246:1: ( rule__InitialState__Group__2__Impl )
            // InternalChessDSL.g:2247:2: rule__InitialState__Group__2__Impl
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
    // InternalChessDSL.g:2253:1: rule__InitialState__Group__2__Impl : ( ( rule__InitialState__Alternatives_2 )? ) ;
    public final void rule__InitialState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2257:1: ( ( ( rule__InitialState__Alternatives_2 )? ) )
            // InternalChessDSL.g:2258:1: ( ( rule__InitialState__Alternatives_2 )? )
            {
            // InternalChessDSL.g:2258:1: ( ( rule__InitialState__Alternatives_2 )? )
            // InternalChessDSL.g:2259:2: ( rule__InitialState__Alternatives_2 )?
            {
             before(grammarAccess.getInitialStateAccess().getAlternatives_2()); 
            // InternalChessDSL.g:2260:2: ( rule__InitialState__Alternatives_2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==15||LA35_0==52) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalChessDSL.g:2260:3: rule__InitialState__Alternatives_2
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
    // InternalChessDSL.g:2269:1: rule__InitialState__Group_2_1__0 : rule__InitialState__Group_2_1__0__Impl rule__InitialState__Group_2_1__1 ;
    public final void rule__InitialState__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2273:1: ( rule__InitialState__Group_2_1__0__Impl rule__InitialState__Group_2_1__1 )
            // InternalChessDSL.g:2274:2: rule__InitialState__Group_2_1__0__Impl rule__InitialState__Group_2_1__1
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
    // InternalChessDSL.g:2281:1: rule__InitialState__Group_2_1__0__Impl : ( 'custom' ) ;
    public final void rule__InitialState__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2285:1: ( ( 'custom' ) )
            // InternalChessDSL.g:2286:1: ( 'custom' )
            {
            // InternalChessDSL.g:2286:1: ( 'custom' )
            // InternalChessDSL.g:2287:2: 'custom'
            {
             before(grammarAccess.getInitialStateAccess().getCustomKeyword_2_1_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalChessDSL.g:2296:1: rule__InitialState__Group_2_1__1 : rule__InitialState__Group_2_1__1__Impl ;
    public final void rule__InitialState__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2300:1: ( rule__InitialState__Group_2_1__1__Impl )
            // InternalChessDSL.g:2301:2: rule__InitialState__Group_2_1__1__Impl
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
    // InternalChessDSL.g:2307:1: rule__InitialState__Group_2_1__1__Impl : ( ( rule__InitialState__PositionsAssignment_2_1_1 ) ) ;
    public final void rule__InitialState__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2311:1: ( ( ( rule__InitialState__PositionsAssignment_2_1_1 ) ) )
            // InternalChessDSL.g:2312:1: ( ( rule__InitialState__PositionsAssignment_2_1_1 ) )
            {
            // InternalChessDSL.g:2312:1: ( ( rule__InitialState__PositionsAssignment_2_1_1 ) )
            // InternalChessDSL.g:2313:2: ( rule__InitialState__PositionsAssignment_2_1_1 )
            {
             before(grammarAccess.getInitialStateAccess().getPositionsAssignment_2_1_1()); 
            // InternalChessDSL.g:2314:2: ( rule__InitialState__PositionsAssignment_2_1_1 )
            // InternalChessDSL.g:2314:3: rule__InitialState__PositionsAssignment_2_1_1
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
    // InternalChessDSL.g:2323:1: rule__CustomPositions__Group__0 : rule__CustomPositions__Group__0__Impl rule__CustomPositions__Group__1 ;
    public final void rule__CustomPositions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2327:1: ( rule__CustomPositions__Group__0__Impl rule__CustomPositions__Group__1 )
            // InternalChessDSL.g:2328:2: rule__CustomPositions__Group__0__Impl rule__CustomPositions__Group__1
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
    // InternalChessDSL.g:2335:1: rule__CustomPositions__Group__0__Impl : ( () ) ;
    public final void rule__CustomPositions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2339:1: ( ( () ) )
            // InternalChessDSL.g:2340:1: ( () )
            {
            // InternalChessDSL.g:2340:1: ( () )
            // InternalChessDSL.g:2341:2: ()
            {
             before(grammarAccess.getCustomPositionsAccess().getCustomPositionsAction_0()); 
            // InternalChessDSL.g:2342:2: ()
            // InternalChessDSL.g:2342:3: 
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
    // InternalChessDSL.g:2350:1: rule__CustomPositions__Group__1 : rule__CustomPositions__Group__1__Impl rule__CustomPositions__Group__2 ;
    public final void rule__CustomPositions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2354:1: ( rule__CustomPositions__Group__1__Impl rule__CustomPositions__Group__2 )
            // InternalChessDSL.g:2355:2: rule__CustomPositions__Group__1__Impl rule__CustomPositions__Group__2
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
    // InternalChessDSL.g:2362:1: rule__CustomPositions__Group__1__Impl : ( 'Positions:' ) ;
    public final void rule__CustomPositions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2366:1: ( ( 'Positions:' ) )
            // InternalChessDSL.g:2367:1: ( 'Positions:' )
            {
            // InternalChessDSL.g:2367:1: ( 'Positions:' )
            // InternalChessDSL.g:2368:2: 'Positions:'
            {
             before(grammarAccess.getCustomPositionsAccess().getPositionsKeyword_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalChessDSL.g:2377:1: rule__CustomPositions__Group__2 : rule__CustomPositions__Group__2__Impl rule__CustomPositions__Group__3 ;
    public final void rule__CustomPositions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2381:1: ( rule__CustomPositions__Group__2__Impl rule__CustomPositions__Group__3 )
            // InternalChessDSL.g:2382:2: rule__CustomPositions__Group__2__Impl rule__CustomPositions__Group__3
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
    // InternalChessDSL.g:2389:1: rule__CustomPositions__Group__2__Impl : ( '{' ) ;
    public final void rule__CustomPositions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2393:1: ( ( '{' ) )
            // InternalChessDSL.g:2394:1: ( '{' )
            {
            // InternalChessDSL.g:2394:1: ( '{' )
            // InternalChessDSL.g:2395:2: '{'
            {
             before(grammarAccess.getCustomPositionsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,54,FOLLOW_2); 
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
    // InternalChessDSL.g:2404:1: rule__CustomPositions__Group__3 : rule__CustomPositions__Group__3__Impl rule__CustomPositions__Group__4 ;
    public final void rule__CustomPositions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2408:1: ( rule__CustomPositions__Group__3__Impl rule__CustomPositions__Group__4 )
            // InternalChessDSL.g:2409:2: rule__CustomPositions__Group__3__Impl rule__CustomPositions__Group__4
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
    // InternalChessDSL.g:2416:1: rule__CustomPositions__Group__3__Impl : ( ( rule__CustomPositions__PlacementAssignment_3 )* ) ;
    public final void rule__CustomPositions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2420:1: ( ( ( rule__CustomPositions__PlacementAssignment_3 )* ) )
            // InternalChessDSL.g:2421:1: ( ( rule__CustomPositions__PlacementAssignment_3 )* )
            {
            // InternalChessDSL.g:2421:1: ( ( rule__CustomPositions__PlacementAssignment_3 )* )
            // InternalChessDSL.g:2422:2: ( rule__CustomPositions__PlacementAssignment_3 )*
            {
             before(grammarAccess.getCustomPositionsAccess().getPlacementAssignment_3()); 
            // InternalChessDSL.g:2423:2: ( rule__CustomPositions__PlacementAssignment_3 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=38 && LA36_0<=39)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalChessDSL.g:2423:3: rule__CustomPositions__PlacementAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__CustomPositions__PlacementAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalChessDSL.g:2431:1: rule__CustomPositions__Group__4 : rule__CustomPositions__Group__4__Impl ;
    public final void rule__CustomPositions__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2435:1: ( rule__CustomPositions__Group__4__Impl )
            // InternalChessDSL.g:2436:2: rule__CustomPositions__Group__4__Impl
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
    // InternalChessDSL.g:2442:1: rule__CustomPositions__Group__4__Impl : ( '}' ) ;
    public final void rule__CustomPositions__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2446:1: ( ( '}' ) )
            // InternalChessDSL.g:2447:1: ( '}' )
            {
            // InternalChessDSL.g:2447:1: ( '}' )
            // InternalChessDSL.g:2448:2: '}'
            {
             before(grammarAccess.getCustomPositionsAccess().getRightCurlyBracketKeyword_4()); 
            match(input,55,FOLLOW_2); 
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
    // InternalChessDSL.g:2458:1: rule__Placement__Group__0 : rule__Placement__Group__0__Impl rule__Placement__Group__1 ;
    public final void rule__Placement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2462:1: ( rule__Placement__Group__0__Impl rule__Placement__Group__1 )
            // InternalChessDSL.g:2463:2: rule__Placement__Group__0__Impl rule__Placement__Group__1
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
    // InternalChessDSL.g:2470:1: rule__Placement__Group__0__Impl : ( ( rule__Placement__PieceAssignment_0 ) ) ;
    public final void rule__Placement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2474:1: ( ( ( rule__Placement__PieceAssignment_0 ) ) )
            // InternalChessDSL.g:2475:1: ( ( rule__Placement__PieceAssignment_0 ) )
            {
            // InternalChessDSL.g:2475:1: ( ( rule__Placement__PieceAssignment_0 ) )
            // InternalChessDSL.g:2476:2: ( rule__Placement__PieceAssignment_0 )
            {
             before(grammarAccess.getPlacementAccess().getPieceAssignment_0()); 
            // InternalChessDSL.g:2477:2: ( rule__Placement__PieceAssignment_0 )
            // InternalChessDSL.g:2477:3: rule__Placement__PieceAssignment_0
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
    // InternalChessDSL.g:2485:1: rule__Placement__Group__1 : rule__Placement__Group__1__Impl rule__Placement__Group__2 ;
    public final void rule__Placement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2489:1: ( rule__Placement__Group__1__Impl rule__Placement__Group__2 )
            // InternalChessDSL.g:2490:2: rule__Placement__Group__1__Impl rule__Placement__Group__2
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
    // InternalChessDSL.g:2497:1: rule__Placement__Group__1__Impl : ( ( rule__Placement__Alternatives_1 ) ) ;
    public final void rule__Placement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2501:1: ( ( ( rule__Placement__Alternatives_1 ) ) )
            // InternalChessDSL.g:2502:1: ( ( rule__Placement__Alternatives_1 ) )
            {
            // InternalChessDSL.g:2502:1: ( ( rule__Placement__Alternatives_1 ) )
            // InternalChessDSL.g:2503:2: ( rule__Placement__Alternatives_1 )
            {
             before(grammarAccess.getPlacementAccess().getAlternatives_1()); 
            // InternalChessDSL.g:2504:2: ( rule__Placement__Alternatives_1 )
            // InternalChessDSL.g:2504:3: rule__Placement__Alternatives_1
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
    // InternalChessDSL.g:2512:1: rule__Placement__Group__2 : rule__Placement__Group__2__Impl ;
    public final void rule__Placement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2516:1: ( rule__Placement__Group__2__Impl )
            // InternalChessDSL.g:2517:2: rule__Placement__Group__2__Impl
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
    // InternalChessDSL.g:2523:1: rule__Placement__Group__2__Impl : ( ( rule__Placement__SquareAssignment_2 ) ) ;
    public final void rule__Placement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2527:1: ( ( ( rule__Placement__SquareAssignment_2 ) ) )
            // InternalChessDSL.g:2528:1: ( ( rule__Placement__SquareAssignment_2 ) )
            {
            // InternalChessDSL.g:2528:1: ( ( rule__Placement__SquareAssignment_2 ) )
            // InternalChessDSL.g:2529:2: ( rule__Placement__SquareAssignment_2 )
            {
             before(grammarAccess.getPlacementAccess().getSquareAssignment_2()); 
            // InternalChessDSL.g:2530:2: ( rule__Placement__SquareAssignment_2 )
            // InternalChessDSL.g:2530:3: rule__Placement__SquareAssignment_2
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
    // InternalChessDSL.g:2539:1: rule__CustomPiece__Group__0 : rule__CustomPiece__Group__0__Impl rule__CustomPiece__Group__1 ;
    public final void rule__CustomPiece__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2543:1: ( rule__CustomPiece__Group__0__Impl rule__CustomPiece__Group__1 )
            // InternalChessDSL.g:2544:2: rule__CustomPiece__Group__0__Impl rule__CustomPiece__Group__1
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
    // InternalChessDSL.g:2551:1: rule__CustomPiece__Group__0__Impl : ( ( rule__CustomPiece__ColorAssignment_0 ) ) ;
    public final void rule__CustomPiece__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2555:1: ( ( ( rule__CustomPiece__ColorAssignment_0 ) ) )
            // InternalChessDSL.g:2556:1: ( ( rule__CustomPiece__ColorAssignment_0 ) )
            {
            // InternalChessDSL.g:2556:1: ( ( rule__CustomPiece__ColorAssignment_0 ) )
            // InternalChessDSL.g:2557:2: ( rule__CustomPiece__ColorAssignment_0 )
            {
             before(grammarAccess.getCustomPieceAccess().getColorAssignment_0()); 
            // InternalChessDSL.g:2558:2: ( rule__CustomPiece__ColorAssignment_0 )
            // InternalChessDSL.g:2558:3: rule__CustomPiece__ColorAssignment_0
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
    // InternalChessDSL.g:2566:1: rule__CustomPiece__Group__1 : rule__CustomPiece__Group__1__Impl ;
    public final void rule__CustomPiece__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2570:1: ( rule__CustomPiece__Group__1__Impl )
            // InternalChessDSL.g:2571:2: rule__CustomPiece__Group__1__Impl
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
    // InternalChessDSL.g:2577:1: rule__CustomPiece__Group__1__Impl : ( ( rule__CustomPiece__KindAssignment_1 ) ) ;
    public final void rule__CustomPiece__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2581:1: ( ( ( rule__CustomPiece__KindAssignment_1 ) ) )
            // InternalChessDSL.g:2582:1: ( ( rule__CustomPiece__KindAssignment_1 ) )
            {
            // InternalChessDSL.g:2582:1: ( ( rule__CustomPiece__KindAssignment_1 ) )
            // InternalChessDSL.g:2583:2: ( rule__CustomPiece__KindAssignment_1 )
            {
             before(grammarAccess.getCustomPieceAccess().getKindAssignment_1()); 
            // InternalChessDSL.g:2584:2: ( rule__CustomPiece__KindAssignment_1 )
            // InternalChessDSL.g:2584:3: rule__CustomPiece__KindAssignment_1
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
    // InternalChessDSL.g:2593:1: rule__MovePair__Group__0 : rule__MovePair__Group__0__Impl rule__MovePair__Group__1 ;
    public final void rule__MovePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2597:1: ( rule__MovePair__Group__0__Impl rule__MovePair__Group__1 )
            // InternalChessDSL.g:2598:2: rule__MovePair__Group__0__Impl rule__MovePair__Group__1
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
    // InternalChessDSL.g:2605:1: rule__MovePair__Group__0__Impl : ( ( rule__MovePair__MoveNumberAssignment_0 ) ) ;
    public final void rule__MovePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2609:1: ( ( ( rule__MovePair__MoveNumberAssignment_0 ) ) )
            // InternalChessDSL.g:2610:1: ( ( rule__MovePair__MoveNumberAssignment_0 ) )
            {
            // InternalChessDSL.g:2610:1: ( ( rule__MovePair__MoveNumberAssignment_0 ) )
            // InternalChessDSL.g:2611:2: ( rule__MovePair__MoveNumberAssignment_0 )
            {
             before(grammarAccess.getMovePairAccess().getMoveNumberAssignment_0()); 
            // InternalChessDSL.g:2612:2: ( rule__MovePair__MoveNumberAssignment_0 )
            // InternalChessDSL.g:2612:3: rule__MovePair__MoveNumberAssignment_0
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
    // InternalChessDSL.g:2620:1: rule__MovePair__Group__1 : rule__MovePair__Group__1__Impl rule__MovePair__Group__2 ;
    public final void rule__MovePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2624:1: ( rule__MovePair__Group__1__Impl rule__MovePair__Group__2 )
            // InternalChessDSL.g:2625:2: rule__MovePair__Group__1__Impl rule__MovePair__Group__2
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
    // InternalChessDSL.g:2632:1: rule__MovePair__Group__1__Impl : ( ( rule__MovePair__Alternatives_1 ) ) ;
    public final void rule__MovePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2636:1: ( ( ( rule__MovePair__Alternatives_1 ) ) )
            // InternalChessDSL.g:2637:1: ( ( rule__MovePair__Alternatives_1 ) )
            {
            // InternalChessDSL.g:2637:1: ( ( rule__MovePair__Alternatives_1 ) )
            // InternalChessDSL.g:2638:2: ( rule__MovePair__Alternatives_1 )
            {
             before(grammarAccess.getMovePairAccess().getAlternatives_1()); 
            // InternalChessDSL.g:2639:2: ( rule__MovePair__Alternatives_1 )
            // InternalChessDSL.g:2639:3: rule__MovePair__Alternatives_1
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
    // InternalChessDSL.g:2647:1: rule__MovePair__Group__2 : rule__MovePair__Group__2__Impl ;
    public final void rule__MovePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2651:1: ( rule__MovePair__Group__2__Impl )
            // InternalChessDSL.g:2652:2: rule__MovePair__Group__2__Impl
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
    // InternalChessDSL.g:2658:1: rule__MovePair__Group__2__Impl : ( ( rule__MovePair__Group_2__0 )? ) ;
    public final void rule__MovePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2662:1: ( ( ( rule__MovePair__Group_2__0 )? ) )
            // InternalChessDSL.g:2663:1: ( ( rule__MovePair__Group_2__0 )? )
            {
            // InternalChessDSL.g:2663:1: ( ( rule__MovePair__Group_2__0 )? )
            // InternalChessDSL.g:2664:2: ( rule__MovePair__Group_2__0 )?
            {
             before(grammarAccess.getMovePairAccess().getGroup_2()); 
            // InternalChessDSL.g:2665:2: ( rule__MovePair__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_LETTER && LA37_0<=RULE_RANKDIGIT)||(LA37_0>=RULE_ID && LA37_0<=RULE_SQUARETERMINAL)||(LA37_0>=21 && LA37_0<=25)||(LA37_0>=40 && LA37_0<=45)||(LA37_0>=58 && LA37_0<=59)||(LA37_0>=66 && LA37_0<=67)||(LA37_0>=70 && LA37_0<=72)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalChessDSL.g:2665:3: rule__MovePair__Group_2__0
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
    // InternalChessDSL.g:2674:1: rule__MovePair__Group_1_0__0 : rule__MovePair__Group_1_0__0__Impl rule__MovePair__Group_1_0__1 ;
    public final void rule__MovePair__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2678:1: ( rule__MovePair__Group_1_0__0__Impl rule__MovePair__Group_1_0__1 )
            // InternalChessDSL.g:2679:2: rule__MovePair__Group_1_0__0__Impl rule__MovePair__Group_1_0__1
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
    // InternalChessDSL.g:2686:1: rule__MovePair__Group_1_0__0__Impl : ( ( rule__MovePair__Color1Assignment_1_0_0 )? ) ;
    public final void rule__MovePair__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2690:1: ( ( ( rule__MovePair__Color1Assignment_1_0_0 )? ) )
            // InternalChessDSL.g:2691:1: ( ( rule__MovePair__Color1Assignment_1_0_0 )? )
            {
            // InternalChessDSL.g:2691:1: ( ( rule__MovePair__Color1Assignment_1_0_0 )? )
            // InternalChessDSL.g:2692:2: ( rule__MovePair__Color1Assignment_1_0_0 )?
            {
             before(grammarAccess.getMovePairAccess().getColor1Assignment_1_0_0()); 
            // InternalChessDSL.g:2693:2: ( rule__MovePair__Color1Assignment_1_0_0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalChessDSL.g:2693:3: rule__MovePair__Color1Assignment_1_0_0
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
    // InternalChessDSL.g:2701:1: rule__MovePair__Group_1_0__1 : rule__MovePair__Group_1_0__1__Impl ;
    public final void rule__MovePair__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2705:1: ( rule__MovePair__Group_1_0__1__Impl )
            // InternalChessDSL.g:2706:2: rule__MovePair__Group_1_0__1__Impl
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
    // InternalChessDSL.g:2712:1: rule__MovePair__Group_1_0__1__Impl : ( ( rule__MovePair__WhiteMoveAssignment_1_0_1 ) ) ;
    public final void rule__MovePair__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2716:1: ( ( ( rule__MovePair__WhiteMoveAssignment_1_0_1 ) ) )
            // InternalChessDSL.g:2717:1: ( ( rule__MovePair__WhiteMoveAssignment_1_0_1 ) )
            {
            // InternalChessDSL.g:2717:1: ( ( rule__MovePair__WhiteMoveAssignment_1_0_1 ) )
            // InternalChessDSL.g:2718:2: ( rule__MovePair__WhiteMoveAssignment_1_0_1 )
            {
             before(grammarAccess.getMovePairAccess().getWhiteMoveAssignment_1_0_1()); 
            // InternalChessDSL.g:2719:2: ( rule__MovePair__WhiteMoveAssignment_1_0_1 )
            // InternalChessDSL.g:2719:3: rule__MovePair__WhiteMoveAssignment_1_0_1
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
    // InternalChessDSL.g:2728:1: rule__MovePair__Group_2__0 : rule__MovePair__Group_2__0__Impl rule__MovePair__Group_2__1 ;
    public final void rule__MovePair__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2732:1: ( rule__MovePair__Group_2__0__Impl rule__MovePair__Group_2__1 )
            // InternalChessDSL.g:2733:2: rule__MovePair__Group_2__0__Impl rule__MovePair__Group_2__1
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
    // InternalChessDSL.g:2740:1: rule__MovePair__Group_2__0__Impl : ( ( rule__MovePair__Color2Assignment_2_0 )? ) ;
    public final void rule__MovePair__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2744:1: ( ( ( rule__MovePair__Color2Assignment_2_0 )? ) )
            // InternalChessDSL.g:2745:1: ( ( rule__MovePair__Color2Assignment_2_0 )? )
            {
            // InternalChessDSL.g:2745:1: ( ( rule__MovePair__Color2Assignment_2_0 )? )
            // InternalChessDSL.g:2746:2: ( rule__MovePair__Color2Assignment_2_0 )?
            {
             before(grammarAccess.getMovePairAccess().getColor2Assignment_2_0()); 
            // InternalChessDSL.g:2747:2: ( rule__MovePair__Color2Assignment_2_0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalChessDSL.g:2747:3: rule__MovePair__Color2Assignment_2_0
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
    // InternalChessDSL.g:2755:1: rule__MovePair__Group_2__1 : rule__MovePair__Group_2__1__Impl ;
    public final void rule__MovePair__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2759:1: ( rule__MovePair__Group_2__1__Impl )
            // InternalChessDSL.g:2760:2: rule__MovePair__Group_2__1__Impl
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
    // InternalChessDSL.g:2766:1: rule__MovePair__Group_2__1__Impl : ( ( rule__MovePair__BlackMoveAssignment_2_1 ) ) ;
    public final void rule__MovePair__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2770:1: ( ( ( rule__MovePair__BlackMoveAssignment_2_1 ) ) )
            // InternalChessDSL.g:2771:1: ( ( rule__MovePair__BlackMoveAssignment_2_1 ) )
            {
            // InternalChessDSL.g:2771:1: ( ( rule__MovePair__BlackMoveAssignment_2_1 ) )
            // InternalChessDSL.g:2772:2: ( rule__MovePair__BlackMoveAssignment_2_1 )
            {
             before(grammarAccess.getMovePairAccess().getBlackMoveAssignment_2_1()); 
            // InternalChessDSL.g:2773:2: ( rule__MovePair__BlackMoveAssignment_2_1 )
            // InternalChessDSL.g:2773:3: rule__MovePair__BlackMoveAssignment_2_1
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


    // $ANTLR start "rule__AnyMove__Group_0__0"
    // InternalChessDSL.g:2782:1: rule__AnyMove__Group_0__0 : rule__AnyMove__Group_0__0__Impl rule__AnyMove__Group_0__1 ;
    public final void rule__AnyMove__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2786:1: ( rule__AnyMove__Group_0__0__Impl rule__AnyMove__Group_0__1 )
            // InternalChessDSL.g:2787:2: rule__AnyMove__Group_0__0__Impl rule__AnyMove__Group_0__1
            {
            pushFollow(FOLLOW_21);
            rule__AnyMove__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnyMove__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyMove__Group_0__0"


    // $ANTLR start "rule__AnyMove__Group_0__0__Impl"
    // InternalChessDSL.g:2794:1: rule__AnyMove__Group_0__0__Impl : ( ( rule__AnyMove__MoveAssignment_0_0 ) ) ;
    public final void rule__AnyMove__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2798:1: ( ( ( rule__AnyMove__MoveAssignment_0_0 ) ) )
            // InternalChessDSL.g:2799:1: ( ( rule__AnyMove__MoveAssignment_0_0 ) )
            {
            // InternalChessDSL.g:2799:1: ( ( rule__AnyMove__MoveAssignment_0_0 ) )
            // InternalChessDSL.g:2800:2: ( rule__AnyMove__MoveAssignment_0_0 )
            {
             before(grammarAccess.getAnyMoveAccess().getMoveAssignment_0_0()); 
            // InternalChessDSL.g:2801:2: ( rule__AnyMove__MoveAssignment_0_0 )
            // InternalChessDSL.g:2801:3: rule__AnyMove__MoveAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__AnyMove__MoveAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAnyMoveAccess().getMoveAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyMove__Group_0__0__Impl"


    // $ANTLR start "rule__AnyMove__Group_0__1"
    // InternalChessDSL.g:2809:1: rule__AnyMove__Group_0__1 : rule__AnyMove__Group_0__1__Impl ;
    public final void rule__AnyMove__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2813:1: ( rule__AnyMove__Group_0__1__Impl )
            // InternalChessDSL.g:2814:2: rule__AnyMove__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnyMove__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyMove__Group_0__1"


    // $ANTLR start "rule__AnyMove__Group_0__1__Impl"
    // InternalChessDSL.g:2820:1: rule__AnyMove__Group_0__1__Impl : ( ( rule__AnyMove__Group_0_1__0 )? ) ;
    public final void rule__AnyMove__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2824:1: ( ( ( rule__AnyMove__Group_0_1__0 )? ) )
            // InternalChessDSL.g:2825:1: ( ( rule__AnyMove__Group_0_1__0 )? )
            {
            // InternalChessDSL.g:2825:1: ( ( rule__AnyMove__Group_0_1__0 )? )
            // InternalChessDSL.g:2826:2: ( rule__AnyMove__Group_0_1__0 )?
            {
             before(grammarAccess.getAnyMoveAccess().getGroup_0_1()); 
            // InternalChessDSL.g:2827:2: ( rule__AnyMove__Group_0_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==56) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalChessDSL.g:2827:3: rule__AnyMove__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AnyMove__Group_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnyMoveAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyMove__Group_0__1__Impl"


    // $ANTLR start "rule__AnyMove__Group_0_1__0"
    // InternalChessDSL.g:2836:1: rule__AnyMove__Group_0_1__0 : rule__AnyMove__Group_0_1__0__Impl rule__AnyMove__Group_0_1__1 ;
    public final void rule__AnyMove__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2840:1: ( rule__AnyMove__Group_0_1__0__Impl rule__AnyMove__Group_0_1__1 )
            // InternalChessDSL.g:2841:2: rule__AnyMove__Group_0_1__0__Impl rule__AnyMove__Group_0_1__1
            {
            pushFollow(FOLLOW_22);
            rule__AnyMove__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnyMove__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyMove__Group_0_1__0"


    // $ANTLR start "rule__AnyMove__Group_0_1__0__Impl"
    // InternalChessDSL.g:2848:1: rule__AnyMove__Group_0_1__0__Impl : ( '(' ) ;
    public final void rule__AnyMove__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2852:1: ( ( '(' ) )
            // InternalChessDSL.g:2853:1: ( '(' )
            {
            // InternalChessDSL.g:2853:1: ( '(' )
            // InternalChessDSL.g:2854:2: '('
            {
             before(grammarAccess.getAnyMoveAccess().getLeftParenthesisKeyword_0_1_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getAnyMoveAccess().getLeftParenthesisKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyMove__Group_0_1__0__Impl"


    // $ANTLR start "rule__AnyMove__Group_0_1__1"
    // InternalChessDSL.g:2863:1: rule__AnyMove__Group_0_1__1 : rule__AnyMove__Group_0_1__1__Impl rule__AnyMove__Group_0_1__2 ;
    public final void rule__AnyMove__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2867:1: ( rule__AnyMove__Group_0_1__1__Impl rule__AnyMove__Group_0_1__2 )
            // InternalChessDSL.g:2868:2: rule__AnyMove__Group_0_1__1__Impl rule__AnyMove__Group_0_1__2
            {
            pushFollow(FOLLOW_22);
            rule__AnyMove__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnyMove__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyMove__Group_0_1__1"


    // $ANTLR start "rule__AnyMove__Group_0_1__1__Impl"
    // InternalChessDSL.g:2875:1: rule__AnyMove__Group_0_1__1__Impl : ( ( rule__AnyMove__RemarksAssignment_0_1_1 )* ) ;
    public final void rule__AnyMove__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2879:1: ( ( ( rule__AnyMove__RemarksAssignment_0_1_1 )* ) )
            // InternalChessDSL.g:2880:1: ( ( rule__AnyMove__RemarksAssignment_0_1_1 )* )
            {
            // InternalChessDSL.g:2880:1: ( ( rule__AnyMove__RemarksAssignment_0_1_1 )* )
            // InternalChessDSL.g:2881:2: ( rule__AnyMove__RemarksAssignment_0_1_1 )*
            {
             before(grammarAccess.getAnyMoveAccess().getRemarksAssignment_0_1_1()); 
            // InternalChessDSL.g:2882:2: ( rule__AnyMove__RemarksAssignment_0_1_1 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=31 && LA41_0<=37)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalChessDSL.g:2882:3: rule__AnyMove__RemarksAssignment_0_1_1
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__AnyMove__RemarksAssignment_0_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getAnyMoveAccess().getRemarksAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyMove__Group_0_1__1__Impl"


    // $ANTLR start "rule__AnyMove__Group_0_1__2"
    // InternalChessDSL.g:2890:1: rule__AnyMove__Group_0_1__2 : rule__AnyMove__Group_0_1__2__Impl ;
    public final void rule__AnyMove__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2894:1: ( rule__AnyMove__Group_0_1__2__Impl )
            // InternalChessDSL.g:2895:2: rule__AnyMove__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnyMove__Group_0_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyMove__Group_0_1__2"


    // $ANTLR start "rule__AnyMove__Group_0_1__2__Impl"
    // InternalChessDSL.g:2901:1: rule__AnyMove__Group_0_1__2__Impl : ( ')' ) ;
    public final void rule__AnyMove__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2905:1: ( ( ')' ) )
            // InternalChessDSL.g:2906:1: ( ')' )
            {
            // InternalChessDSL.g:2906:1: ( ')' )
            // InternalChessDSL.g:2907:2: ')'
            {
             before(grammarAccess.getAnyMoveAccess().getRightParenthesisKeyword_0_1_2()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getAnyMoveAccess().getRightParenthesisKeyword_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyMove__Group_0_1__2__Impl"


    // $ANTLR start "rule__Dummy__Group__0"
    // InternalChessDSL.g:2917:1: rule__Dummy__Group__0 : rule__Dummy__Group__0__Impl rule__Dummy__Group__1 ;
    public final void rule__Dummy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2921:1: ( rule__Dummy__Group__0__Impl rule__Dummy__Group__1 )
            // InternalChessDSL.g:2922:2: rule__Dummy__Group__0__Impl rule__Dummy__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalChessDSL.g:2929:1: rule__Dummy__Group__0__Impl : ( () ) ;
    public final void rule__Dummy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2933:1: ( ( () ) )
            // InternalChessDSL.g:2934:1: ( () )
            {
            // InternalChessDSL.g:2934:1: ( () )
            // InternalChessDSL.g:2935:2: ()
            {
             before(grammarAccess.getDummyAccess().getDummyAction_0()); 
            // InternalChessDSL.g:2936:2: ()
            // InternalChessDSL.g:2936:3: 
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
    // InternalChessDSL.g:2944:1: rule__Dummy__Group__1 : rule__Dummy__Group__1__Impl ;
    public final void rule__Dummy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2948:1: ( rule__Dummy__Group__1__Impl )
            // InternalChessDSL.g:2949:2: rule__Dummy__Group__1__Impl
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
    // InternalChessDSL.g:2955:1: rule__Dummy__Group__1__Impl : ( 'dummy' ) ;
    public final void rule__Dummy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2959:1: ( ( 'dummy' ) )
            // InternalChessDSL.g:2960:1: ( 'dummy' )
            {
            // InternalChessDSL.g:2960:1: ( 'dummy' )
            // InternalChessDSL.g:2961:2: 'dummy'
            {
             before(grammarAccess.getDummyAccess().getDummyKeyword_1()); 
            match(input,58,FOLLOW_2); 
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
    // InternalChessDSL.g:2971:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2975:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // InternalChessDSL.g:2976:2: rule__Move__Group__0__Impl rule__Move__Group__1
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
    // InternalChessDSL.g:2983:1: rule__Move__Group__0__Impl : ( ( 'moves' )? ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:2987:1: ( ( ( 'moves' )? ) )
            // InternalChessDSL.g:2988:1: ( ( 'moves' )? )
            {
            // InternalChessDSL.g:2988:1: ( ( 'moves' )? )
            // InternalChessDSL.g:2989:2: ( 'moves' )?
            {
             before(grammarAccess.getMoveAccess().getMovesKeyword_0()); 
            // InternalChessDSL.g:2990:2: ( 'moves' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==59) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalChessDSL.g:2990:3: 'moves'
                    {
                    match(input,59,FOLLOW_2); 

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
    // InternalChessDSL.g:2998:1: rule__Move__Group__1 : rule__Move__Group__1__Impl rule__Move__Group__2 ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3002:1: ( rule__Move__Group__1__Impl rule__Move__Group__2 )
            // InternalChessDSL.g:3003:2: rule__Move__Group__1__Impl rule__Move__Group__2
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
    // InternalChessDSL.g:3010:1: rule__Move__Group__1__Impl : ( ( rule__Move__PieceAssignment_1 ) ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3014:1: ( ( ( rule__Move__PieceAssignment_1 ) ) )
            // InternalChessDSL.g:3015:1: ( ( rule__Move__PieceAssignment_1 ) )
            {
            // InternalChessDSL.g:3015:1: ( ( rule__Move__PieceAssignment_1 ) )
            // InternalChessDSL.g:3016:2: ( rule__Move__PieceAssignment_1 )
            {
             before(grammarAccess.getMoveAccess().getPieceAssignment_1()); 
            // InternalChessDSL.g:3017:2: ( rule__Move__PieceAssignment_1 )
            // InternalChessDSL.g:3017:3: rule__Move__PieceAssignment_1
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
    // InternalChessDSL.g:3025:1: rule__Move__Group__2 : rule__Move__Group__2__Impl ;
    public final void rule__Move__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3029:1: ( rule__Move__Group__2__Impl )
            // InternalChessDSL.g:3030:2: rule__Move__Group__2__Impl
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
    // InternalChessDSL.g:3036:1: rule__Move__Group__2__Impl : ( ( rule__Move__Alternatives_2 ) ) ;
    public final void rule__Move__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3040:1: ( ( ( rule__Move__Alternatives_2 ) ) )
            // InternalChessDSL.g:3041:1: ( ( rule__Move__Alternatives_2 ) )
            {
            // InternalChessDSL.g:3041:1: ( ( rule__Move__Alternatives_2 ) )
            // InternalChessDSL.g:3042:2: ( rule__Move__Alternatives_2 )
            {
             before(grammarAccess.getMoveAccess().getAlternatives_2()); 
            // InternalChessDSL.g:3043:2: ( rule__Move__Alternatives_2 )
            // InternalChessDSL.g:3043:3: rule__Move__Alternatives_2
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
    // InternalChessDSL.g:3052:1: rule__Move__Group_2_0__0 : rule__Move__Group_2_0__0__Impl rule__Move__Group_2_0__1 ;
    public final void rule__Move__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3056:1: ( rule__Move__Group_2_0__0__Impl rule__Move__Group_2_0__1 )
            // InternalChessDSL.g:3057:2: rule__Move__Group_2_0__0__Impl rule__Move__Group_2_0__1
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
    // InternalChessDSL.g:3064:1: rule__Move__Group_2_0__0__Impl : ( '(' ) ;
    public final void rule__Move__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3068:1: ( ( '(' ) )
            // InternalChessDSL.g:3069:1: ( '(' )
            {
            // InternalChessDSL.g:3069:1: ( '(' )
            // InternalChessDSL.g:3070:2: '('
            {
             before(grammarAccess.getMoveAccess().getLeftParenthesisKeyword_2_0_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalChessDSL.g:3079:1: rule__Move__Group_2_0__1 : rule__Move__Group_2_0__1__Impl rule__Move__Group_2_0__2 ;
    public final void rule__Move__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3083:1: ( rule__Move__Group_2_0__1__Impl rule__Move__Group_2_0__2 )
            // InternalChessDSL.g:3084:2: rule__Move__Group_2_0__1__Impl rule__Move__Group_2_0__2
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
    // InternalChessDSL.g:3091:1: rule__Move__Group_2_0__1__Impl : ( ( rule__Move__FromAssignment_2_0_1 ) ) ;
    public final void rule__Move__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3095:1: ( ( ( rule__Move__FromAssignment_2_0_1 ) ) )
            // InternalChessDSL.g:3096:1: ( ( rule__Move__FromAssignment_2_0_1 ) )
            {
            // InternalChessDSL.g:3096:1: ( ( rule__Move__FromAssignment_2_0_1 ) )
            // InternalChessDSL.g:3097:2: ( rule__Move__FromAssignment_2_0_1 )
            {
             before(grammarAccess.getMoveAccess().getFromAssignment_2_0_1()); 
            // InternalChessDSL.g:3098:2: ( rule__Move__FromAssignment_2_0_1 )
            // InternalChessDSL.g:3098:3: rule__Move__FromAssignment_2_0_1
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
    // InternalChessDSL.g:3106:1: rule__Move__Group_2_0__2 : rule__Move__Group_2_0__2__Impl rule__Move__Group_2_0__3 ;
    public final void rule__Move__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3110:1: ( rule__Move__Group_2_0__2__Impl rule__Move__Group_2_0__3 )
            // InternalChessDSL.g:3111:2: rule__Move__Group_2_0__2__Impl rule__Move__Group_2_0__3
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
    // InternalChessDSL.g:3118:1: rule__Move__Group_2_0__2__Impl : ( '->' ) ;
    public final void rule__Move__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3122:1: ( ( '->' ) )
            // InternalChessDSL.g:3123:1: ( '->' )
            {
            // InternalChessDSL.g:3123:1: ( '->' )
            // InternalChessDSL.g:3124:2: '->'
            {
             before(grammarAccess.getMoveAccess().getHyphenMinusGreaterThanSignKeyword_2_0_2()); 
            match(input,60,FOLLOW_2); 
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
    // InternalChessDSL.g:3133:1: rule__Move__Group_2_0__3 : rule__Move__Group_2_0__3__Impl rule__Move__Group_2_0__4 ;
    public final void rule__Move__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3137:1: ( rule__Move__Group_2_0__3__Impl rule__Move__Group_2_0__4 )
            // InternalChessDSL.g:3138:2: rule__Move__Group_2_0__3__Impl rule__Move__Group_2_0__4
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
    // InternalChessDSL.g:3145:1: rule__Move__Group_2_0__3__Impl : ( ( rule__Move__ToAssignment_2_0_3 ) ) ;
    public final void rule__Move__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3149:1: ( ( ( rule__Move__ToAssignment_2_0_3 ) ) )
            // InternalChessDSL.g:3150:1: ( ( rule__Move__ToAssignment_2_0_3 ) )
            {
            // InternalChessDSL.g:3150:1: ( ( rule__Move__ToAssignment_2_0_3 ) )
            // InternalChessDSL.g:3151:2: ( rule__Move__ToAssignment_2_0_3 )
            {
             before(grammarAccess.getMoveAccess().getToAssignment_2_0_3()); 
            // InternalChessDSL.g:3152:2: ( rule__Move__ToAssignment_2_0_3 )
            // InternalChessDSL.g:3152:3: rule__Move__ToAssignment_2_0_3
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
    // InternalChessDSL.g:3160:1: rule__Move__Group_2_0__4 : rule__Move__Group_2_0__4__Impl ;
    public final void rule__Move__Group_2_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3164:1: ( rule__Move__Group_2_0__4__Impl )
            // InternalChessDSL.g:3165:2: rule__Move__Group_2_0__4__Impl
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
    // InternalChessDSL.g:3171:1: rule__Move__Group_2_0__4__Impl : ( ')' ) ;
    public final void rule__Move__Group_2_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3175:1: ( ( ')' ) )
            // InternalChessDSL.g:3176:1: ( ')' )
            {
            // InternalChessDSL.g:3176:1: ( ')' )
            // InternalChessDSL.g:3177:2: ')'
            {
             before(grammarAccess.getMoveAccess().getRightParenthesisKeyword_2_0_4()); 
            match(input,57,FOLLOW_2); 
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
    // InternalChessDSL.g:3187:1: rule__Move__Group_2_1__0 : rule__Move__Group_2_1__0__Impl rule__Move__Group_2_1__1 ;
    public final void rule__Move__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3191:1: ( rule__Move__Group_2_1__0__Impl rule__Move__Group_2_1__1 )
            // InternalChessDSL.g:3192:2: rule__Move__Group_2_1__0__Impl rule__Move__Group_2_1__1
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
    // InternalChessDSL.g:3199:1: rule__Move__Group_2_1__0__Impl : ( 'from' ) ;
    public final void rule__Move__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3203:1: ( ( 'from' ) )
            // InternalChessDSL.g:3204:1: ( 'from' )
            {
            // InternalChessDSL.g:3204:1: ( 'from' )
            // InternalChessDSL.g:3205:2: 'from'
            {
             before(grammarAccess.getMoveAccess().getFromKeyword_2_1_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalChessDSL.g:3214:1: rule__Move__Group_2_1__1 : rule__Move__Group_2_1__1__Impl rule__Move__Group_2_1__2 ;
    public final void rule__Move__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3218:1: ( rule__Move__Group_2_1__1__Impl rule__Move__Group_2_1__2 )
            // InternalChessDSL.g:3219:2: rule__Move__Group_2_1__1__Impl rule__Move__Group_2_1__2
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
    // InternalChessDSL.g:3226:1: rule__Move__Group_2_1__1__Impl : ( ( rule__Move__FromAssignment_2_1_1 ) ) ;
    public final void rule__Move__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3230:1: ( ( ( rule__Move__FromAssignment_2_1_1 ) ) )
            // InternalChessDSL.g:3231:1: ( ( rule__Move__FromAssignment_2_1_1 ) )
            {
            // InternalChessDSL.g:3231:1: ( ( rule__Move__FromAssignment_2_1_1 ) )
            // InternalChessDSL.g:3232:2: ( rule__Move__FromAssignment_2_1_1 )
            {
             before(grammarAccess.getMoveAccess().getFromAssignment_2_1_1()); 
            // InternalChessDSL.g:3233:2: ( rule__Move__FromAssignment_2_1_1 )
            // InternalChessDSL.g:3233:3: rule__Move__FromAssignment_2_1_1
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
    // InternalChessDSL.g:3241:1: rule__Move__Group_2_1__2 : rule__Move__Group_2_1__2__Impl rule__Move__Group_2_1__3 ;
    public final void rule__Move__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3245:1: ( rule__Move__Group_2_1__2__Impl rule__Move__Group_2_1__3 )
            // InternalChessDSL.g:3246:2: rule__Move__Group_2_1__2__Impl rule__Move__Group_2_1__3
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
    // InternalChessDSL.g:3253:1: rule__Move__Group_2_1__2__Impl : ( 'to' ) ;
    public final void rule__Move__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3257:1: ( ( 'to' ) )
            // InternalChessDSL.g:3258:1: ( 'to' )
            {
            // InternalChessDSL.g:3258:1: ( 'to' )
            // InternalChessDSL.g:3259:2: 'to'
            {
             before(grammarAccess.getMoveAccess().getToKeyword_2_1_2()); 
            match(input,62,FOLLOW_2); 
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
    // InternalChessDSL.g:3268:1: rule__Move__Group_2_1__3 : rule__Move__Group_2_1__3__Impl ;
    public final void rule__Move__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3272:1: ( rule__Move__Group_2_1__3__Impl )
            // InternalChessDSL.g:3273:2: rule__Move__Group_2_1__3__Impl
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
    // InternalChessDSL.g:3279:1: rule__Move__Group_2_1__3__Impl : ( ( rule__Move__ToAssignment_2_1_3 ) ) ;
    public final void rule__Move__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3283:1: ( ( ( rule__Move__ToAssignment_2_1_3 ) ) )
            // InternalChessDSL.g:3284:1: ( ( rule__Move__ToAssignment_2_1_3 ) )
            {
            // InternalChessDSL.g:3284:1: ( ( rule__Move__ToAssignment_2_1_3 ) )
            // InternalChessDSL.g:3285:2: ( rule__Move__ToAssignment_2_1_3 )
            {
             before(grammarAccess.getMoveAccess().getToAssignment_2_1_3()); 
            // InternalChessDSL.g:3286:2: ( rule__Move__ToAssignment_2_1_3 )
            // InternalChessDSL.g:3286:3: rule__Move__ToAssignment_2_1_3
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
    // InternalChessDSL.g:3295:1: rule__Capture__Group__0 : rule__Capture__Group__0__Impl rule__Capture__Group__1 ;
    public final void rule__Capture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3299:1: ( rule__Capture__Group__0__Impl rule__Capture__Group__1 )
            // InternalChessDSL.g:3300:2: rule__Capture__Group__0__Impl rule__Capture__Group__1
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
    // InternalChessDSL.g:3307:1: rule__Capture__Group__0__Impl : ( ( rule__Capture__MoveAssignment_0 ) ) ;
    public final void rule__Capture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3311:1: ( ( ( rule__Capture__MoveAssignment_0 ) ) )
            // InternalChessDSL.g:3312:1: ( ( rule__Capture__MoveAssignment_0 ) )
            {
            // InternalChessDSL.g:3312:1: ( ( rule__Capture__MoveAssignment_0 ) )
            // InternalChessDSL.g:3313:2: ( rule__Capture__MoveAssignment_0 )
            {
             before(grammarAccess.getCaptureAccess().getMoveAssignment_0()); 
            // InternalChessDSL.g:3314:2: ( rule__Capture__MoveAssignment_0 )
            // InternalChessDSL.g:3314:3: rule__Capture__MoveAssignment_0
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
    // InternalChessDSL.g:3322:1: rule__Capture__Group__1 : rule__Capture__Group__1__Impl ;
    public final void rule__Capture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3326:1: ( rule__Capture__Group__1__Impl )
            // InternalChessDSL.g:3327:2: rule__Capture__Group__1__Impl
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
    // InternalChessDSL.g:3333:1: rule__Capture__Group__1__Impl : ( ( rule__Capture__Alternatives_1 ) ) ;
    public final void rule__Capture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3337:1: ( ( ( rule__Capture__Alternatives_1 ) ) )
            // InternalChessDSL.g:3338:1: ( ( rule__Capture__Alternatives_1 ) )
            {
            // InternalChessDSL.g:3338:1: ( ( rule__Capture__Alternatives_1 ) )
            // InternalChessDSL.g:3339:2: ( rule__Capture__Alternatives_1 )
            {
             before(grammarAccess.getCaptureAccess().getAlternatives_1()); 
            // InternalChessDSL.g:3340:2: ( rule__Capture__Alternatives_1 )
            // InternalChessDSL.g:3340:3: rule__Capture__Alternatives_1
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
    // InternalChessDSL.g:3349:1: rule__Capture__Group_1_0__0 : rule__Capture__Group_1_0__0__Impl rule__Capture__Group_1_0__1 ;
    public final void rule__Capture__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3353:1: ( rule__Capture__Group_1_0__0__Impl rule__Capture__Group_1_0__1 )
            // InternalChessDSL.g:3354:2: rule__Capture__Group_1_0__0__Impl rule__Capture__Group_1_0__1
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
    // InternalChessDSL.g:3361:1: rule__Capture__Group_1_0__0__Impl : ( 'Capture(' ) ;
    public final void rule__Capture__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3365:1: ( ( 'Capture(' ) )
            // InternalChessDSL.g:3366:1: ( 'Capture(' )
            {
            // InternalChessDSL.g:3366:1: ( 'Capture(' )
            // InternalChessDSL.g:3367:2: 'Capture('
            {
             before(grammarAccess.getCaptureAccess().getCaptureKeyword_1_0_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalChessDSL.g:3376:1: rule__Capture__Group_1_0__1 : rule__Capture__Group_1_0__1__Impl rule__Capture__Group_1_0__2 ;
    public final void rule__Capture__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3380:1: ( rule__Capture__Group_1_0__1__Impl rule__Capture__Group_1_0__2 )
            // InternalChessDSL.g:3381:2: rule__Capture__Group_1_0__1__Impl rule__Capture__Group_1_0__2
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
    // InternalChessDSL.g:3388:1: rule__Capture__Group_1_0__1__Impl : ( ( rule__Capture__CaptureAssignment_1_0_1 ) ) ;
    public final void rule__Capture__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3392:1: ( ( ( rule__Capture__CaptureAssignment_1_0_1 ) ) )
            // InternalChessDSL.g:3393:1: ( ( rule__Capture__CaptureAssignment_1_0_1 ) )
            {
            // InternalChessDSL.g:3393:1: ( ( rule__Capture__CaptureAssignment_1_0_1 ) )
            // InternalChessDSL.g:3394:2: ( rule__Capture__CaptureAssignment_1_0_1 )
            {
             before(grammarAccess.getCaptureAccess().getCaptureAssignment_1_0_1()); 
            // InternalChessDSL.g:3395:2: ( rule__Capture__CaptureAssignment_1_0_1 )
            // InternalChessDSL.g:3395:3: rule__Capture__CaptureAssignment_1_0_1
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
    // InternalChessDSL.g:3403:1: rule__Capture__Group_1_0__2 : rule__Capture__Group_1_0__2__Impl ;
    public final void rule__Capture__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3407:1: ( rule__Capture__Group_1_0__2__Impl )
            // InternalChessDSL.g:3408:2: rule__Capture__Group_1_0__2__Impl
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
    // InternalChessDSL.g:3414:1: rule__Capture__Group_1_0__2__Impl : ( ')' ) ;
    public final void rule__Capture__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3418:1: ( ( ')' ) )
            // InternalChessDSL.g:3419:1: ( ')' )
            {
            // InternalChessDSL.g:3419:1: ( ')' )
            // InternalChessDSL.g:3420:2: ')'
            {
             before(grammarAccess.getCaptureAccess().getRightParenthesisKeyword_1_0_2()); 
            match(input,57,FOLLOW_2); 
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
    // InternalChessDSL.g:3430:1: rule__Capture__Group_1_1__0 : rule__Capture__Group_1_1__0__Impl rule__Capture__Group_1_1__1 ;
    public final void rule__Capture__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3434:1: ( rule__Capture__Group_1_1__0__Impl rule__Capture__Group_1_1__1 )
            // InternalChessDSL.g:3435:2: rule__Capture__Group_1_1__0__Impl rule__Capture__Group_1_1__1
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
    // InternalChessDSL.g:3442:1: rule__Capture__Group_1_1__0__Impl : ( ( 'and' )? ) ;
    public final void rule__Capture__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3446:1: ( ( ( 'and' )? ) )
            // InternalChessDSL.g:3447:1: ( ( 'and' )? )
            {
            // InternalChessDSL.g:3447:1: ( ( 'and' )? )
            // InternalChessDSL.g:3448:2: ( 'and' )?
            {
             before(grammarAccess.getCaptureAccess().getAndKeyword_1_1_0()); 
            // InternalChessDSL.g:3449:2: ( 'and' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==64) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalChessDSL.g:3449:3: 'and'
                    {
                    match(input,64,FOLLOW_2); 

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
    // InternalChessDSL.g:3457:1: rule__Capture__Group_1_1__1 : rule__Capture__Group_1_1__1__Impl rule__Capture__Group_1_1__2 ;
    public final void rule__Capture__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3461:1: ( rule__Capture__Group_1_1__1__Impl rule__Capture__Group_1_1__2 )
            // InternalChessDSL.g:3462:2: rule__Capture__Group_1_1__1__Impl rule__Capture__Group_1_1__2
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
    // InternalChessDSL.g:3469:1: rule__Capture__Group_1_1__1__Impl : ( 'captures' ) ;
    public final void rule__Capture__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3473:1: ( ( 'captures' ) )
            // InternalChessDSL.g:3474:1: ( 'captures' )
            {
            // InternalChessDSL.g:3474:1: ( 'captures' )
            // InternalChessDSL.g:3475:2: 'captures'
            {
             before(grammarAccess.getCaptureAccess().getCapturesKeyword_1_1_1()); 
            match(input,65,FOLLOW_2); 
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
    // InternalChessDSL.g:3484:1: rule__Capture__Group_1_1__2 : rule__Capture__Group_1_1__2__Impl ;
    public final void rule__Capture__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3488:1: ( rule__Capture__Group_1_1__2__Impl )
            // InternalChessDSL.g:3489:2: rule__Capture__Group_1_1__2__Impl
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
    // InternalChessDSL.g:3495:1: rule__Capture__Group_1_1__2__Impl : ( ( rule__Capture__CaptureAssignment_1_1_2 ) ) ;
    public final void rule__Capture__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3499:1: ( ( ( rule__Capture__CaptureAssignment_1_1_2 ) ) )
            // InternalChessDSL.g:3500:1: ( ( rule__Capture__CaptureAssignment_1_1_2 ) )
            {
            // InternalChessDSL.g:3500:1: ( ( rule__Capture__CaptureAssignment_1_1_2 ) )
            // InternalChessDSL.g:3501:2: ( rule__Capture__CaptureAssignment_1_1_2 )
            {
             before(grammarAccess.getCaptureAccess().getCaptureAssignment_1_1_2()); 
            // InternalChessDSL.g:3502:2: ( rule__Capture__CaptureAssignment_1_1_2 )
            // InternalChessDSL.g:3502:3: rule__Capture__CaptureAssignment_1_1_2
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
    // InternalChessDSL.g:3511:1: rule__Castle__Group_0__0 : rule__Castle__Group_0__0__Impl rule__Castle__Group_0__1 ;
    public final void rule__Castle__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3515:1: ( rule__Castle__Group_0__0__Impl rule__Castle__Group_0__1 )
            // InternalChessDSL.g:3516:2: rule__Castle__Group_0__0__Impl rule__Castle__Group_0__1
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
    // InternalChessDSL.g:3523:1: rule__Castle__Group_0__0__Impl : ( 'Castle(' ) ;
    public final void rule__Castle__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3527:1: ( ( 'Castle(' ) )
            // InternalChessDSL.g:3528:1: ( 'Castle(' )
            {
            // InternalChessDSL.g:3528:1: ( 'Castle(' )
            // InternalChessDSL.g:3529:2: 'Castle('
            {
             before(grammarAccess.getCastleAccess().getCastleKeyword_0_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalChessDSL.g:3538:1: rule__Castle__Group_0__1 : rule__Castle__Group_0__1__Impl rule__Castle__Group_0__2 ;
    public final void rule__Castle__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3542:1: ( rule__Castle__Group_0__1__Impl rule__Castle__Group_0__2 )
            // InternalChessDSL.g:3543:2: rule__Castle__Group_0__1__Impl rule__Castle__Group_0__2
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
    // InternalChessDSL.g:3550:1: rule__Castle__Group_0__1__Impl : ( ( rule__Castle__SideAssignment_0_1 ) ) ;
    public final void rule__Castle__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3554:1: ( ( ( rule__Castle__SideAssignment_0_1 ) ) )
            // InternalChessDSL.g:3555:1: ( ( rule__Castle__SideAssignment_0_1 ) )
            {
            // InternalChessDSL.g:3555:1: ( ( rule__Castle__SideAssignment_0_1 ) )
            // InternalChessDSL.g:3556:2: ( rule__Castle__SideAssignment_0_1 )
            {
             before(grammarAccess.getCastleAccess().getSideAssignment_0_1()); 
            // InternalChessDSL.g:3557:2: ( rule__Castle__SideAssignment_0_1 )
            // InternalChessDSL.g:3557:3: rule__Castle__SideAssignment_0_1
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
    // InternalChessDSL.g:3565:1: rule__Castle__Group_0__2 : rule__Castle__Group_0__2__Impl ;
    public final void rule__Castle__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3569:1: ( rule__Castle__Group_0__2__Impl )
            // InternalChessDSL.g:3570:2: rule__Castle__Group_0__2__Impl
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
    // InternalChessDSL.g:3576:1: rule__Castle__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Castle__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3580:1: ( ( ')' ) )
            // InternalChessDSL.g:3581:1: ( ')' )
            {
            // InternalChessDSL.g:3581:1: ( ')' )
            // InternalChessDSL.g:3582:2: ')'
            {
             before(grammarAccess.getCastleAccess().getRightParenthesisKeyword_0_2()); 
            match(input,57,FOLLOW_2); 
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
    // InternalChessDSL.g:3592:1: rule__Castle__Group_1__0 : rule__Castle__Group_1__0__Impl rule__Castle__Group_1__1 ;
    public final void rule__Castle__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3596:1: ( rule__Castle__Group_1__0__Impl rule__Castle__Group_1__1 )
            // InternalChessDSL.g:3597:2: rule__Castle__Group_1__0__Impl rule__Castle__Group_1__1
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
    // InternalChessDSL.g:3604:1: rule__Castle__Group_1__0__Impl : ( 'castles' ) ;
    public final void rule__Castle__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3608:1: ( ( 'castles' ) )
            // InternalChessDSL.g:3609:1: ( 'castles' )
            {
            // InternalChessDSL.g:3609:1: ( 'castles' )
            // InternalChessDSL.g:3610:2: 'castles'
            {
             before(grammarAccess.getCastleAccess().getCastlesKeyword_1_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalChessDSL.g:3619:1: rule__Castle__Group_1__1 : rule__Castle__Group_1__1__Impl rule__Castle__Group_1__2 ;
    public final void rule__Castle__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3623:1: ( rule__Castle__Group_1__1__Impl rule__Castle__Group_1__2 )
            // InternalChessDSL.g:3624:2: rule__Castle__Group_1__1__Impl rule__Castle__Group_1__2
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
    // InternalChessDSL.g:3631:1: rule__Castle__Group_1__1__Impl : ( ( rule__Castle__Group_1_1__0 )? ) ;
    public final void rule__Castle__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3635:1: ( ( ( rule__Castle__Group_1_1__0 )? ) )
            // InternalChessDSL.g:3636:1: ( ( rule__Castle__Group_1_1__0 )? )
            {
            // InternalChessDSL.g:3636:1: ( ( rule__Castle__Group_1_1__0 )? )
            // InternalChessDSL.g:3637:2: ( rule__Castle__Group_1_1__0 )?
            {
             before(grammarAccess.getCastleAccess().getGroup_1_1()); 
            // InternalChessDSL.g:3638:2: ( rule__Castle__Group_1_1__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==17) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalChessDSL.g:3638:3: rule__Castle__Group_1_1__0
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
    // InternalChessDSL.g:3646:1: rule__Castle__Group_1__2 : rule__Castle__Group_1__2__Impl ;
    public final void rule__Castle__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3650:1: ( rule__Castle__Group_1__2__Impl )
            // InternalChessDSL.g:3651:2: rule__Castle__Group_1__2__Impl
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
    // InternalChessDSL.g:3657:1: rule__Castle__Group_1__2__Impl : ( ( rule__Castle__SideAssignment_1_2 ) ) ;
    public final void rule__Castle__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3661:1: ( ( ( rule__Castle__SideAssignment_1_2 ) ) )
            // InternalChessDSL.g:3662:1: ( ( rule__Castle__SideAssignment_1_2 ) )
            {
            // InternalChessDSL.g:3662:1: ( ( rule__Castle__SideAssignment_1_2 ) )
            // InternalChessDSL.g:3663:2: ( rule__Castle__SideAssignment_1_2 )
            {
             before(grammarAccess.getCastleAccess().getSideAssignment_1_2()); 
            // InternalChessDSL.g:3664:2: ( rule__Castle__SideAssignment_1_2 )
            // InternalChessDSL.g:3664:3: rule__Castle__SideAssignment_1_2
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
    // InternalChessDSL.g:3673:1: rule__Castle__Group_1_1__0 : rule__Castle__Group_1_1__0__Impl rule__Castle__Group_1_1__1 ;
    public final void rule__Castle__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3677:1: ( rule__Castle__Group_1_1__0__Impl rule__Castle__Group_1_1__1 )
            // InternalChessDSL.g:3678:2: rule__Castle__Group_1_1__0__Impl rule__Castle__Group_1_1__1
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
    // InternalChessDSL.g:3685:1: rule__Castle__Group_1_1__0__Impl : ( 'on' ) ;
    public final void rule__Castle__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3689:1: ( ( 'on' ) )
            // InternalChessDSL.g:3690:1: ( 'on' )
            {
            // InternalChessDSL.g:3690:1: ( 'on' )
            // InternalChessDSL.g:3691:2: 'on'
            {
             before(grammarAccess.getCastleAccess().getOnKeyword_1_1_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalChessDSL.g:3700:1: rule__Castle__Group_1_1__1 : rule__Castle__Group_1_1__1__Impl ;
    public final void rule__Castle__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3704:1: ( rule__Castle__Group_1_1__1__Impl )
            // InternalChessDSL.g:3705:2: rule__Castle__Group_1_1__1__Impl
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
    // InternalChessDSL.g:3711:1: rule__Castle__Group_1_1__1__Impl : ( 'the' ) ;
    public final void rule__Castle__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3715:1: ( ( 'the' ) )
            // InternalChessDSL.g:3716:1: ( 'the' )
            {
            // InternalChessDSL.g:3716:1: ( 'the' )
            // InternalChessDSL.g:3717:2: 'the'
            {
             before(grammarAccess.getCastleAccess().getTheKeyword_1_1_1()); 
            match(input,68,FOLLOW_2); 
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
    // InternalChessDSL.g:3727:1: rule__Castle__Group_2__0 : rule__Castle__Group_2__0__Impl rule__Castle__Group_2__1 ;
    public final void rule__Castle__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3731:1: ( rule__Castle__Group_2__0__Impl rule__Castle__Group_2__1 )
            // InternalChessDSL.g:3732:2: rule__Castle__Group_2__0__Impl rule__Castle__Group_2__1
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
    // InternalChessDSL.g:3739:1: rule__Castle__Group_2__0__Impl : ( ( rule__Castle__MoveAssignment_2_0 ) ) ;
    public final void rule__Castle__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3743:1: ( ( ( rule__Castle__MoveAssignment_2_0 ) ) )
            // InternalChessDSL.g:3744:1: ( ( rule__Castle__MoveAssignment_2_0 ) )
            {
            // InternalChessDSL.g:3744:1: ( ( rule__Castle__MoveAssignment_2_0 ) )
            // InternalChessDSL.g:3745:2: ( rule__Castle__MoveAssignment_2_0 )
            {
             before(grammarAccess.getCastleAccess().getMoveAssignment_2_0()); 
            // InternalChessDSL.g:3746:2: ( rule__Castle__MoveAssignment_2_0 )
            // InternalChessDSL.g:3746:3: rule__Castle__MoveAssignment_2_0
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
    // InternalChessDSL.g:3754:1: rule__Castle__Group_2__1 : rule__Castle__Group_2__1__Impl rule__Castle__Group_2__2 ;
    public final void rule__Castle__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3758:1: ( rule__Castle__Group_2__1__Impl rule__Castle__Group_2__2 )
            // InternalChessDSL.g:3759:2: rule__Castle__Group_2__1__Impl rule__Castle__Group_2__2
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
    // InternalChessDSL.g:3766:1: rule__Castle__Group_2__1__Impl : ( 'Castle(' ) ;
    public final void rule__Castle__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3770:1: ( ( 'Castle(' ) )
            // InternalChessDSL.g:3771:1: ( 'Castle(' )
            {
            // InternalChessDSL.g:3771:1: ( 'Castle(' )
            // InternalChessDSL.g:3772:2: 'Castle('
            {
             before(grammarAccess.getCastleAccess().getCastleKeyword_2_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalChessDSL.g:3781:1: rule__Castle__Group_2__2 : rule__Castle__Group_2__2__Impl rule__Castle__Group_2__3 ;
    public final void rule__Castle__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3785:1: ( rule__Castle__Group_2__2__Impl rule__Castle__Group_2__3 )
            // InternalChessDSL.g:3786:2: rule__Castle__Group_2__2__Impl rule__Castle__Group_2__3
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
    // InternalChessDSL.g:3793:1: rule__Castle__Group_2__2__Impl : ( ( rule__Castle__SideAssignment_2_2 ) ) ;
    public final void rule__Castle__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3797:1: ( ( ( rule__Castle__SideAssignment_2_2 ) ) )
            // InternalChessDSL.g:3798:1: ( ( rule__Castle__SideAssignment_2_2 ) )
            {
            // InternalChessDSL.g:3798:1: ( ( rule__Castle__SideAssignment_2_2 ) )
            // InternalChessDSL.g:3799:2: ( rule__Castle__SideAssignment_2_2 )
            {
             before(grammarAccess.getCastleAccess().getSideAssignment_2_2()); 
            // InternalChessDSL.g:3800:2: ( rule__Castle__SideAssignment_2_2 )
            // InternalChessDSL.g:3800:3: rule__Castle__SideAssignment_2_2
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
    // InternalChessDSL.g:3808:1: rule__Castle__Group_2__3 : rule__Castle__Group_2__3__Impl ;
    public final void rule__Castle__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3812:1: ( rule__Castle__Group_2__3__Impl )
            // InternalChessDSL.g:3813:2: rule__Castle__Group_2__3__Impl
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
    // InternalChessDSL.g:3819:1: rule__Castle__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Castle__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3823:1: ( ( ')' ) )
            // InternalChessDSL.g:3824:1: ( ')' )
            {
            // InternalChessDSL.g:3824:1: ( ')' )
            // InternalChessDSL.g:3825:2: ')'
            {
             before(grammarAccess.getCastleAccess().getRightParenthesisKeyword_2_3()); 
            match(input,57,FOLLOW_2); 
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
    // InternalChessDSL.g:3835:1: rule__Castle__Group_3__0 : rule__Castle__Group_3__0__Impl rule__Castle__Group_3__1 ;
    public final void rule__Castle__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3839:1: ( rule__Castle__Group_3__0__Impl rule__Castle__Group_3__1 )
            // InternalChessDSL.g:3840:2: rule__Castle__Group_3__0__Impl rule__Castle__Group_3__1
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
    // InternalChessDSL.g:3847:1: rule__Castle__Group_3__0__Impl : ( ( rule__Castle__MoveAssignment_3_0 ) ) ;
    public final void rule__Castle__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3851:1: ( ( ( rule__Castle__MoveAssignment_3_0 ) ) )
            // InternalChessDSL.g:3852:1: ( ( rule__Castle__MoveAssignment_3_0 ) )
            {
            // InternalChessDSL.g:3852:1: ( ( rule__Castle__MoveAssignment_3_0 ) )
            // InternalChessDSL.g:3853:2: ( rule__Castle__MoveAssignment_3_0 )
            {
             before(grammarAccess.getCastleAccess().getMoveAssignment_3_0()); 
            // InternalChessDSL.g:3854:2: ( rule__Castle__MoveAssignment_3_0 )
            // InternalChessDSL.g:3854:3: rule__Castle__MoveAssignment_3_0
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
    // InternalChessDSL.g:3862:1: rule__Castle__Group_3__1 : rule__Castle__Group_3__1__Impl rule__Castle__Group_3__2 ;
    public final void rule__Castle__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3866:1: ( rule__Castle__Group_3__1__Impl rule__Castle__Group_3__2 )
            // InternalChessDSL.g:3867:2: rule__Castle__Group_3__1__Impl rule__Castle__Group_3__2
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
    // InternalChessDSL.g:3874:1: rule__Castle__Group_3__1__Impl : ( 'and' ) ;
    public final void rule__Castle__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3878:1: ( ( 'and' ) )
            // InternalChessDSL.g:3879:1: ( 'and' )
            {
            // InternalChessDSL.g:3879:1: ( 'and' )
            // InternalChessDSL.g:3880:2: 'and'
            {
             before(grammarAccess.getCastleAccess().getAndKeyword_3_1()); 
            match(input,64,FOLLOW_2); 
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
    // InternalChessDSL.g:3889:1: rule__Castle__Group_3__2 : rule__Castle__Group_3__2__Impl rule__Castle__Group_3__3 ;
    public final void rule__Castle__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3893:1: ( rule__Castle__Group_3__2__Impl rule__Castle__Group_3__3 )
            // InternalChessDSL.g:3894:2: rule__Castle__Group_3__2__Impl rule__Castle__Group_3__3
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
    // InternalChessDSL.g:3901:1: rule__Castle__Group_3__2__Impl : ( 'castles' ) ;
    public final void rule__Castle__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3905:1: ( ( 'castles' ) )
            // InternalChessDSL.g:3906:1: ( 'castles' )
            {
            // InternalChessDSL.g:3906:1: ( 'castles' )
            // InternalChessDSL.g:3907:2: 'castles'
            {
             before(grammarAccess.getCastleAccess().getCastlesKeyword_3_2()); 
            match(input,67,FOLLOW_2); 
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
    // InternalChessDSL.g:3916:1: rule__Castle__Group_3__3 : rule__Castle__Group_3__3__Impl ;
    public final void rule__Castle__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3920:1: ( rule__Castle__Group_3__3__Impl )
            // InternalChessDSL.g:3921:2: rule__Castle__Group_3__3__Impl
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
    // InternalChessDSL.g:3927:1: rule__Castle__Group_3__3__Impl : ( ( rule__Castle__SideAssignment_3_3 ) ) ;
    public final void rule__Castle__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3931:1: ( ( ( rule__Castle__SideAssignment_3_3 ) ) )
            // InternalChessDSL.g:3932:1: ( ( rule__Castle__SideAssignment_3_3 ) )
            {
            // InternalChessDSL.g:3932:1: ( ( rule__Castle__SideAssignment_3_3 ) )
            // InternalChessDSL.g:3933:2: ( rule__Castle__SideAssignment_3_3 )
            {
             before(grammarAccess.getCastleAccess().getSideAssignment_3_3()); 
            // InternalChessDSL.g:3934:2: ( rule__Castle__SideAssignment_3_3 )
            // InternalChessDSL.g:3934:3: rule__Castle__SideAssignment_3_3
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
    // InternalChessDSL.g:3943:1: rule__EnPassant__Group__0 : rule__EnPassant__Group__0__Impl rule__EnPassant__Group__1 ;
    public final void rule__EnPassant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3947:1: ( rule__EnPassant__Group__0__Impl rule__EnPassant__Group__1 )
            // InternalChessDSL.g:3948:2: rule__EnPassant__Group__0__Impl rule__EnPassant__Group__1
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
    // InternalChessDSL.g:3955:1: rule__EnPassant__Group__0__Impl : ( ( rule__EnPassant__CaptureAssignment_0 ) ) ;
    public final void rule__EnPassant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3959:1: ( ( ( rule__EnPassant__CaptureAssignment_0 ) ) )
            // InternalChessDSL.g:3960:1: ( ( rule__EnPassant__CaptureAssignment_0 ) )
            {
            // InternalChessDSL.g:3960:1: ( ( rule__EnPassant__CaptureAssignment_0 ) )
            // InternalChessDSL.g:3961:2: ( rule__EnPassant__CaptureAssignment_0 )
            {
             before(grammarAccess.getEnPassantAccess().getCaptureAssignment_0()); 
            // InternalChessDSL.g:3962:2: ( rule__EnPassant__CaptureAssignment_0 )
            // InternalChessDSL.g:3962:3: rule__EnPassant__CaptureAssignment_0
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
    // InternalChessDSL.g:3970:1: rule__EnPassant__Group__1 : rule__EnPassant__Group__1__Impl rule__EnPassant__Group__2 ;
    public final void rule__EnPassant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3974:1: ( rule__EnPassant__Group__1__Impl rule__EnPassant__Group__2 )
            // InternalChessDSL.g:3975:2: rule__EnPassant__Group__1__Impl rule__EnPassant__Group__2
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
    // InternalChessDSL.g:3982:1: rule__EnPassant__Group__1__Impl : ( 'on' ) ;
    public final void rule__EnPassant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:3986:1: ( ( 'on' ) )
            // InternalChessDSL.g:3987:1: ( 'on' )
            {
            // InternalChessDSL.g:3987:1: ( 'on' )
            // InternalChessDSL.g:3988:2: 'on'
            {
             before(grammarAccess.getEnPassantAccess().getOnKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalChessDSL.g:3997:1: rule__EnPassant__Group__2 : rule__EnPassant__Group__2__Impl ;
    public final void rule__EnPassant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4001:1: ( rule__EnPassant__Group__2__Impl )
            // InternalChessDSL.g:4002:2: rule__EnPassant__Group__2__Impl
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
    // InternalChessDSL.g:4008:1: rule__EnPassant__Group__2__Impl : ( ( rule__EnPassant__SquareAssignment_2 ) ) ;
    public final void rule__EnPassant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4012:1: ( ( ( rule__EnPassant__SquareAssignment_2 ) ) )
            // InternalChessDSL.g:4013:1: ( ( rule__EnPassant__SquareAssignment_2 ) )
            {
            // InternalChessDSL.g:4013:1: ( ( rule__EnPassant__SquareAssignment_2 ) )
            // InternalChessDSL.g:4014:2: ( rule__EnPassant__SquareAssignment_2 )
            {
             before(grammarAccess.getEnPassantAccess().getSquareAssignment_2()); 
            // InternalChessDSL.g:4015:2: ( rule__EnPassant__SquareAssignment_2 )
            // InternalChessDSL.g:4015:3: rule__EnPassant__SquareAssignment_2
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
    // InternalChessDSL.g:4024:1: rule__Promotion__Group__0 : rule__Promotion__Group__0__Impl rule__Promotion__Group__1 ;
    public final void rule__Promotion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4028:1: ( rule__Promotion__Group__0__Impl rule__Promotion__Group__1 )
            // InternalChessDSL.g:4029:2: rule__Promotion__Group__0__Impl rule__Promotion__Group__1
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
    // InternalChessDSL.g:4036:1: rule__Promotion__Group__0__Impl : ( ( rule__Promotion__MoveAssignment_0 ) ) ;
    public final void rule__Promotion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4040:1: ( ( ( rule__Promotion__MoveAssignment_0 ) ) )
            // InternalChessDSL.g:4041:1: ( ( rule__Promotion__MoveAssignment_0 ) )
            {
            // InternalChessDSL.g:4041:1: ( ( rule__Promotion__MoveAssignment_0 ) )
            // InternalChessDSL.g:4042:2: ( rule__Promotion__MoveAssignment_0 )
            {
             before(grammarAccess.getPromotionAccess().getMoveAssignment_0()); 
            // InternalChessDSL.g:4043:2: ( rule__Promotion__MoveAssignment_0 )
            // InternalChessDSL.g:4043:3: rule__Promotion__MoveAssignment_0
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
    // InternalChessDSL.g:4051:1: rule__Promotion__Group__1 : rule__Promotion__Group__1__Impl rule__Promotion__Group__2 ;
    public final void rule__Promotion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4055:1: ( rule__Promotion__Group__1__Impl rule__Promotion__Group__2 )
            // InternalChessDSL.g:4056:2: rule__Promotion__Group__1__Impl rule__Promotion__Group__2
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
    // InternalChessDSL.g:4063:1: rule__Promotion__Group__1__Impl : ( 'Promotion(' ) ;
    public final void rule__Promotion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4067:1: ( ( 'Promotion(' ) )
            // InternalChessDSL.g:4068:1: ( 'Promotion(' )
            {
            // InternalChessDSL.g:4068:1: ( 'Promotion(' )
            // InternalChessDSL.g:4069:2: 'Promotion('
            {
             before(grammarAccess.getPromotionAccess().getPromotionKeyword_1()); 
            match(input,69,FOLLOW_2); 
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
    // InternalChessDSL.g:4078:1: rule__Promotion__Group__2 : rule__Promotion__Group__2__Impl rule__Promotion__Group__3 ;
    public final void rule__Promotion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4082:1: ( rule__Promotion__Group__2__Impl rule__Promotion__Group__3 )
            // InternalChessDSL.g:4083:2: rule__Promotion__Group__2__Impl rule__Promotion__Group__3
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
    // InternalChessDSL.g:4090:1: rule__Promotion__Group__2__Impl : ( ( rule__Promotion__PieceAssignment_2 ) ) ;
    public final void rule__Promotion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4094:1: ( ( ( rule__Promotion__PieceAssignment_2 ) ) )
            // InternalChessDSL.g:4095:1: ( ( rule__Promotion__PieceAssignment_2 ) )
            {
            // InternalChessDSL.g:4095:1: ( ( rule__Promotion__PieceAssignment_2 ) )
            // InternalChessDSL.g:4096:2: ( rule__Promotion__PieceAssignment_2 )
            {
             before(grammarAccess.getPromotionAccess().getPieceAssignment_2()); 
            // InternalChessDSL.g:4097:2: ( rule__Promotion__PieceAssignment_2 )
            // InternalChessDSL.g:4097:3: rule__Promotion__PieceAssignment_2
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
    // InternalChessDSL.g:4105:1: rule__Promotion__Group__3 : rule__Promotion__Group__3__Impl ;
    public final void rule__Promotion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4109:1: ( rule__Promotion__Group__3__Impl )
            // InternalChessDSL.g:4110:2: rule__Promotion__Group__3__Impl
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
    // InternalChessDSL.g:4116:1: rule__Promotion__Group__3__Impl : ( ')' ) ;
    public final void rule__Promotion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4120:1: ( ( ')' ) )
            // InternalChessDSL.g:4121:1: ( ')' )
            {
            // InternalChessDSL.g:4121:1: ( ')' )
            // InternalChessDSL.g:4122:2: ')'
            {
             before(grammarAccess.getPromotionAccess().getRightParenthesisKeyword_3()); 
            match(input,57,FOLLOW_2); 
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


    // $ANTLR start "rule__SANMove__Group__0"
    // InternalChessDSL.g:4132:1: rule__SANMove__Group__0 : rule__SANMove__Group__0__Impl rule__SANMove__Group__1 ;
    public final void rule__SANMove__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4136:1: ( rule__SANMove__Group__0__Impl rule__SANMove__Group__1 )
            // InternalChessDSL.g:4137:2: rule__SANMove__Group__0__Impl rule__SANMove__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__SANMove__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SANMove__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANMove__Group__0"


    // $ANTLR start "rule__SANMove__Group__0__Impl"
    // InternalChessDSL.g:4144:1: rule__SANMove__Group__0__Impl : ( () ) ;
    public final void rule__SANMove__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4148:1: ( ( () ) )
            // InternalChessDSL.g:4149:1: ( () )
            {
            // InternalChessDSL.g:4149:1: ( () )
            // InternalChessDSL.g:4150:2: ()
            {
             before(grammarAccess.getSANMoveAccess().getSANMoveAction_0()); 
            // InternalChessDSL.g:4151:2: ()
            // InternalChessDSL.g:4151:3: 
            {
            }

             after(grammarAccess.getSANMoveAccess().getSANMoveAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANMove__Group__0__Impl"


    // $ANTLR start "rule__SANMove__Group__1"
    // InternalChessDSL.g:4159:1: rule__SANMove__Group__1 : rule__SANMove__Group__1__Impl ;
    public final void rule__SANMove__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4163:1: ( rule__SANMove__Group__1__Impl )
            // InternalChessDSL.g:4164:2: rule__SANMove__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SANMove__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANMove__Group__1"


    // $ANTLR start "rule__SANMove__Group__1__Impl"
    // InternalChessDSL.g:4170:1: rule__SANMove__Group__1__Impl : ( ( rule__SANMove__Alternatives_1 ) ) ;
    public final void rule__SANMove__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4174:1: ( ( ( rule__SANMove__Alternatives_1 ) ) )
            // InternalChessDSL.g:4175:1: ( ( rule__SANMove__Alternatives_1 ) )
            {
            // InternalChessDSL.g:4175:1: ( ( rule__SANMove__Alternatives_1 ) )
            // InternalChessDSL.g:4176:2: ( rule__SANMove__Alternatives_1 )
            {
             before(grammarAccess.getSANMoveAccess().getAlternatives_1()); 
            // InternalChessDSL.g:4177:2: ( rule__SANMove__Alternatives_1 )
            // InternalChessDSL.g:4177:3: rule__SANMove__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__SANMove__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getSANMoveAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANMove__Group__1__Impl"


    // $ANTLR start "rule__SANCastle__Group_0__0"
    // InternalChessDSL.g:4186:1: rule__SANCastle__Group_0__0 : rule__SANCastle__Group_0__0__Impl rule__SANCastle__Group_0__1 ;
    public final void rule__SANCastle__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4190:1: ( rule__SANCastle__Group_0__0__Impl rule__SANCastle__Group_0__1 )
            // InternalChessDSL.g:4191:2: rule__SANCastle__Group_0__0__Impl rule__SANCastle__Group_0__1
            {
            pushFollow(FOLLOW_39);
            rule__SANCastle__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SANCastle__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANCastle__Group_0__0"


    // $ANTLR start "rule__SANCastle__Group_0__0__Impl"
    // InternalChessDSL.g:4198:1: rule__SANCastle__Group_0__0__Impl : ( () ) ;
    public final void rule__SANCastle__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4202:1: ( ( () ) )
            // InternalChessDSL.g:4203:1: ( () )
            {
            // InternalChessDSL.g:4203:1: ( () )
            // InternalChessDSL.g:4204:2: ()
            {
             before(grammarAccess.getSANCastleAccess().getSANCastleAction_0_0()); 
            // InternalChessDSL.g:4205:2: ()
            // InternalChessDSL.g:4205:3: 
            {
            }

             after(grammarAccess.getSANCastleAccess().getSANCastleAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANCastle__Group_0__0__Impl"


    // $ANTLR start "rule__SANCastle__Group_0__1"
    // InternalChessDSL.g:4213:1: rule__SANCastle__Group_0__1 : rule__SANCastle__Group_0__1__Impl ;
    public final void rule__SANCastle__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4217:1: ( rule__SANCastle__Group_0__1__Impl )
            // InternalChessDSL.g:4218:2: rule__SANCastle__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SANCastle__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANCastle__Group_0__1"


    // $ANTLR start "rule__SANCastle__Group_0__1__Impl"
    // InternalChessDSL.g:4224:1: rule__SANCastle__Group_0__1__Impl : ( ( rule__SANCastle__Group_0_1__0 ) ) ;
    public final void rule__SANCastle__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4228:1: ( ( ( rule__SANCastle__Group_0_1__0 ) ) )
            // InternalChessDSL.g:4229:1: ( ( rule__SANCastle__Group_0_1__0 ) )
            {
            // InternalChessDSL.g:4229:1: ( ( rule__SANCastle__Group_0_1__0 ) )
            // InternalChessDSL.g:4230:2: ( rule__SANCastle__Group_0_1__0 )
            {
             before(grammarAccess.getSANCastleAccess().getGroup_0_1()); 
            // InternalChessDSL.g:4231:2: ( rule__SANCastle__Group_0_1__0 )
            // InternalChessDSL.g:4231:3: rule__SANCastle__Group_0_1__0
            {
            pushFollow(FOLLOW_2);
            rule__SANCastle__Group_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getSANCastleAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANCastle__Group_0__1__Impl"


    // $ANTLR start "rule__SANCastle__Group_0_1__0"
    // InternalChessDSL.g:4240:1: rule__SANCastle__Group_0_1__0 : rule__SANCastle__Group_0_1__0__Impl rule__SANCastle__Group_0_1__1 ;
    public final void rule__SANCastle__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4244:1: ( rule__SANCastle__Group_0_1__0__Impl rule__SANCastle__Group_0_1__1 )
            // InternalChessDSL.g:4245:2: rule__SANCastle__Group_0_1__0__Impl rule__SANCastle__Group_0_1__1
            {
            pushFollow(FOLLOW_40);
            rule__SANCastle__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SANCastle__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANCastle__Group_0_1__0"


    // $ANTLR start "rule__SANCastle__Group_0_1__0__Impl"
    // InternalChessDSL.g:4252:1: rule__SANCastle__Group_0_1__0__Impl : ( 'O-O-O' ) ;
    public final void rule__SANCastle__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4256:1: ( ( 'O-O-O' ) )
            // InternalChessDSL.g:4257:1: ( 'O-O-O' )
            {
            // InternalChessDSL.g:4257:1: ( 'O-O-O' )
            // InternalChessDSL.g:4258:2: 'O-O-O'
            {
             before(grammarAccess.getSANCastleAccess().getOOOKeyword_0_1_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getSANCastleAccess().getOOOKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANCastle__Group_0_1__0__Impl"


    // $ANTLR start "rule__SANCastle__Group_0_1__1"
    // InternalChessDSL.g:4267:1: rule__SANCastle__Group_0_1__1 : rule__SANCastle__Group_0_1__1__Impl ;
    public final void rule__SANCastle__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4271:1: ( rule__SANCastle__Group_0_1__1__Impl )
            // InternalChessDSL.g:4272:2: rule__SANCastle__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SANCastle__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANCastle__Group_0_1__1"


    // $ANTLR start "rule__SANCastle__Group_0_1__1__Impl"
    // InternalChessDSL.g:4278:1: rule__SANCastle__Group_0_1__1__Impl : ( ( rule__SANCastle__SideAssignment_0_1_1 ) ) ;
    public final void rule__SANCastle__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4282:1: ( ( ( rule__SANCastle__SideAssignment_0_1_1 ) ) )
            // InternalChessDSL.g:4283:1: ( ( rule__SANCastle__SideAssignment_0_1_1 ) )
            {
            // InternalChessDSL.g:4283:1: ( ( rule__SANCastle__SideAssignment_0_1_1 ) )
            // InternalChessDSL.g:4284:2: ( rule__SANCastle__SideAssignment_0_1_1 )
            {
             before(grammarAccess.getSANCastleAccess().getSideAssignment_0_1_1()); 
            // InternalChessDSL.g:4285:2: ( rule__SANCastle__SideAssignment_0_1_1 )
            // InternalChessDSL.g:4285:3: rule__SANCastle__SideAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SANCastle__SideAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSANCastleAccess().getSideAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANCastle__Group_0_1__1__Impl"


    // $ANTLR start "rule__SANCastle__Group_1__0"
    // InternalChessDSL.g:4294:1: rule__SANCastle__Group_1__0 : rule__SANCastle__Group_1__0__Impl rule__SANCastle__Group_1__1 ;
    public final void rule__SANCastle__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4298:1: ( rule__SANCastle__Group_1__0__Impl rule__SANCastle__Group_1__1 )
            // InternalChessDSL.g:4299:2: rule__SANCastle__Group_1__0__Impl rule__SANCastle__Group_1__1
            {
            pushFollow(FOLLOW_41);
            rule__SANCastle__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SANCastle__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANCastle__Group_1__0"


    // $ANTLR start "rule__SANCastle__Group_1__0__Impl"
    // InternalChessDSL.g:4306:1: rule__SANCastle__Group_1__0__Impl : ( 'O-O' ) ;
    public final void rule__SANCastle__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4310:1: ( ( 'O-O' ) )
            // InternalChessDSL.g:4311:1: ( 'O-O' )
            {
            // InternalChessDSL.g:4311:1: ( 'O-O' )
            // InternalChessDSL.g:4312:2: 'O-O'
            {
             before(grammarAccess.getSANCastleAccess().getOOKeyword_1_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getSANCastleAccess().getOOKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANCastle__Group_1__0__Impl"


    // $ANTLR start "rule__SANCastle__Group_1__1"
    // InternalChessDSL.g:4321:1: rule__SANCastle__Group_1__1 : rule__SANCastle__Group_1__1__Impl ;
    public final void rule__SANCastle__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4325:1: ( rule__SANCastle__Group_1__1__Impl )
            // InternalChessDSL.g:4326:2: rule__SANCastle__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SANCastle__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANCastle__Group_1__1"


    // $ANTLR start "rule__SANCastle__Group_1__1__Impl"
    // InternalChessDSL.g:4332:1: rule__SANCastle__Group_1__1__Impl : ( ( rule__SANCastle__SideAssignment_1_1 ) ) ;
    public final void rule__SANCastle__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4336:1: ( ( ( rule__SANCastle__SideAssignment_1_1 ) ) )
            // InternalChessDSL.g:4337:1: ( ( rule__SANCastle__SideAssignment_1_1 ) )
            {
            // InternalChessDSL.g:4337:1: ( ( rule__SANCastle__SideAssignment_1_1 ) )
            // InternalChessDSL.g:4338:2: ( rule__SANCastle__SideAssignment_1_1 )
            {
             before(grammarAccess.getSANCastleAccess().getSideAssignment_1_1()); 
            // InternalChessDSL.g:4339:2: ( rule__SANCastle__SideAssignment_1_1 )
            // InternalChessDSL.g:4339:3: rule__SANCastle__SideAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SANCastle__SideAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSANCastleAccess().getSideAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANCastle__Group_1__1__Impl"


    // $ANTLR start "rule__SANNormal__Group__0"
    // InternalChessDSL.g:4348:1: rule__SANNormal__Group__0 : rule__SANNormal__Group__0__Impl rule__SANNormal__Group__1 ;
    public final void rule__SANNormal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4352:1: ( rule__SANNormal__Group__0__Impl rule__SANNormal__Group__1 )
            // InternalChessDSL.g:4353:2: rule__SANNormal__Group__0__Impl rule__SANNormal__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__SANNormal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SANNormal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANNormal__Group__0"


    // $ANTLR start "rule__SANNormal__Group__0__Impl"
    // InternalChessDSL.g:4360:1: rule__SANNormal__Group__0__Impl : ( () ) ;
    public final void rule__SANNormal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4364:1: ( ( () ) )
            // InternalChessDSL.g:4365:1: ( () )
            {
            // InternalChessDSL.g:4365:1: ( () )
            // InternalChessDSL.g:4366:2: ()
            {
             before(grammarAccess.getSANNormalAccess().getSANNormalAction_0()); 
            // InternalChessDSL.g:4367:2: ()
            // InternalChessDSL.g:4367:3: 
            {
            }

             after(grammarAccess.getSANNormalAccess().getSANNormalAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANNormal__Group__0__Impl"


    // $ANTLR start "rule__SANNormal__Group__1"
    // InternalChessDSL.g:4375:1: rule__SANNormal__Group__1 : rule__SANNormal__Group__1__Impl rule__SANNormal__Group__2 ;
    public final void rule__SANNormal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4379:1: ( rule__SANNormal__Group__1__Impl rule__SANNormal__Group__2 )
            // InternalChessDSL.g:4380:2: rule__SANNormal__Group__1__Impl rule__SANNormal__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__SANNormal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SANNormal__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANNormal__Group__1"


    // $ANTLR start "rule__SANNormal__Group__1__Impl"
    // InternalChessDSL.g:4387:1: rule__SANNormal__Group__1__Impl : ( ( rule__SANNormal__PieceAssignment_1 )? ) ;
    public final void rule__SANNormal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4391:1: ( ( ( rule__SANNormal__PieceAssignment_1 )? ) )
            // InternalChessDSL.g:4392:1: ( ( rule__SANNormal__PieceAssignment_1 )? )
            {
            // InternalChessDSL.g:4392:1: ( ( rule__SANNormal__PieceAssignment_1 )? )
            // InternalChessDSL.g:4393:2: ( rule__SANNormal__PieceAssignment_1 )?
            {
             before(grammarAccess.getSANNormalAccess().getPieceAssignment_1()); 
            // InternalChessDSL.g:4394:2: ( rule__SANNormal__PieceAssignment_1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=21 && LA45_0<=25)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalChessDSL.g:4394:3: rule__SANNormal__PieceAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SANNormal__PieceAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSANNormalAccess().getPieceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANNormal__Group__1__Impl"


    // $ANTLR start "rule__SANNormal__Group__2"
    // InternalChessDSL.g:4402:1: rule__SANNormal__Group__2 : rule__SANNormal__Group__2__Impl rule__SANNormal__Group__3 ;
    public final void rule__SANNormal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4406:1: ( rule__SANNormal__Group__2__Impl rule__SANNormal__Group__3 )
            // InternalChessDSL.g:4407:2: rule__SANNormal__Group__2__Impl rule__SANNormal__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__SANNormal__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SANNormal__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANNormal__Group__2"


    // $ANTLR start "rule__SANNormal__Group__2__Impl"
    // InternalChessDSL.g:4414:1: rule__SANNormal__Group__2__Impl : ( ( rule__SANNormal__DisambAssignment_2 )? ) ;
    public final void rule__SANNormal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4418:1: ( ( ( rule__SANNormal__DisambAssignment_2 )? ) )
            // InternalChessDSL.g:4419:1: ( ( rule__SANNormal__DisambAssignment_2 )? )
            {
            // InternalChessDSL.g:4419:1: ( ( rule__SANNormal__DisambAssignment_2 )? )
            // InternalChessDSL.g:4420:2: ( rule__SANNormal__DisambAssignment_2 )?
            {
             before(grammarAccess.getSANNormalAccess().getDisambAssignment_2()); 
            // InternalChessDSL.g:4421:2: ( rule__SANNormal__DisambAssignment_2 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_LETTER && LA46_0<=RULE_RANKDIGIT)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalChessDSL.g:4421:3: rule__SANNormal__DisambAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SANNormal__DisambAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSANNormalAccess().getDisambAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANNormal__Group__2__Impl"


    // $ANTLR start "rule__SANNormal__Group__3"
    // InternalChessDSL.g:4429:1: rule__SANNormal__Group__3 : rule__SANNormal__Group__3__Impl rule__SANNormal__Group__4 ;
    public final void rule__SANNormal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4433:1: ( rule__SANNormal__Group__3__Impl rule__SANNormal__Group__4 )
            // InternalChessDSL.g:4434:2: rule__SANNormal__Group__3__Impl rule__SANNormal__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__SANNormal__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SANNormal__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANNormal__Group__3"


    // $ANTLR start "rule__SANNormal__Group__3__Impl"
    // InternalChessDSL.g:4441:1: rule__SANNormal__Group__3__Impl : ( ( rule__SANNormal__CaptureAssignment_3 )? ) ;
    public final void rule__SANNormal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4445:1: ( ( ( rule__SANNormal__CaptureAssignment_3 )? ) )
            // InternalChessDSL.g:4446:1: ( ( rule__SANNormal__CaptureAssignment_3 )? )
            {
            // InternalChessDSL.g:4446:1: ( ( rule__SANNormal__CaptureAssignment_3 )? )
            // InternalChessDSL.g:4447:2: ( rule__SANNormal__CaptureAssignment_3 )?
            {
             before(grammarAccess.getSANNormalAccess().getCaptureAssignment_3()); 
            // InternalChessDSL.g:4448:2: ( rule__SANNormal__CaptureAssignment_3 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==72) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalChessDSL.g:4448:3: rule__SANNormal__CaptureAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__SANNormal__CaptureAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSANNormalAccess().getCaptureAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANNormal__Group__3__Impl"


    // $ANTLR start "rule__SANNormal__Group__4"
    // InternalChessDSL.g:4456:1: rule__SANNormal__Group__4 : rule__SANNormal__Group__4__Impl rule__SANNormal__Group__5 ;
    public final void rule__SANNormal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4460:1: ( rule__SANNormal__Group__4__Impl rule__SANNormal__Group__5 )
            // InternalChessDSL.g:4461:2: rule__SANNormal__Group__4__Impl rule__SANNormal__Group__5
            {
            pushFollow(FOLLOW_42);
            rule__SANNormal__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SANNormal__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANNormal__Group__4"


    // $ANTLR start "rule__SANNormal__Group__4__Impl"
    // InternalChessDSL.g:4468:1: rule__SANNormal__Group__4__Impl : ( ( rule__SANNormal__TargetAssignment_4 ) ) ;
    public final void rule__SANNormal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4472:1: ( ( ( rule__SANNormal__TargetAssignment_4 ) ) )
            // InternalChessDSL.g:4473:1: ( ( rule__SANNormal__TargetAssignment_4 ) )
            {
            // InternalChessDSL.g:4473:1: ( ( rule__SANNormal__TargetAssignment_4 ) )
            // InternalChessDSL.g:4474:2: ( rule__SANNormal__TargetAssignment_4 )
            {
             before(grammarAccess.getSANNormalAccess().getTargetAssignment_4()); 
            // InternalChessDSL.g:4475:2: ( rule__SANNormal__TargetAssignment_4 )
            // InternalChessDSL.g:4475:3: rule__SANNormal__TargetAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SANNormal__TargetAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSANNormalAccess().getTargetAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANNormal__Group__4__Impl"


    // $ANTLR start "rule__SANNormal__Group__5"
    // InternalChessDSL.g:4483:1: rule__SANNormal__Group__5 : rule__SANNormal__Group__5__Impl rule__SANNormal__Group__6 ;
    public final void rule__SANNormal__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4487:1: ( rule__SANNormal__Group__5__Impl rule__SANNormal__Group__6 )
            // InternalChessDSL.g:4488:2: rule__SANNormal__Group__5__Impl rule__SANNormal__Group__6
            {
            pushFollow(FOLLOW_42);
            rule__SANNormal__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SANNormal__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANNormal__Group__5"


    // $ANTLR start "rule__SANNormal__Group__5__Impl"
    // InternalChessDSL.g:4495:1: rule__SANNormal__Group__5__Impl : ( ( rule__SANNormal__PromotionAssignment_5 )? ) ;
    public final void rule__SANNormal__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4499:1: ( ( ( rule__SANNormal__PromotionAssignment_5 )? ) )
            // InternalChessDSL.g:4500:1: ( ( rule__SANNormal__PromotionAssignment_5 )? )
            {
            // InternalChessDSL.g:4500:1: ( ( rule__SANNormal__PromotionAssignment_5 )? )
            // InternalChessDSL.g:4501:2: ( rule__SANNormal__PromotionAssignment_5 )?
            {
             before(grammarAccess.getSANNormalAccess().getPromotionAssignment_5()); 
            // InternalChessDSL.g:4502:2: ( rule__SANNormal__PromotionAssignment_5 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==16) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalChessDSL.g:4502:3: rule__SANNormal__PromotionAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__SANNormal__PromotionAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSANNormalAccess().getPromotionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANNormal__Group__5__Impl"


    // $ANTLR start "rule__SANNormal__Group__6"
    // InternalChessDSL.g:4510:1: rule__SANNormal__Group__6 : rule__SANNormal__Group__6__Impl rule__SANNormal__Group__7 ;
    public final void rule__SANNormal__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4514:1: ( rule__SANNormal__Group__6__Impl rule__SANNormal__Group__7 )
            // InternalChessDSL.g:4515:2: rule__SANNormal__Group__6__Impl rule__SANNormal__Group__7
            {
            pushFollow(FOLLOW_42);
            rule__SANNormal__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SANNormal__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANNormal__Group__6"


    // $ANTLR start "rule__SANNormal__Group__6__Impl"
    // InternalChessDSL.g:4522:1: rule__SANNormal__Group__6__Impl : ( ( rule__SANNormal__CheckAssignment_6 )? ) ;
    public final void rule__SANNormal__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4526:1: ( ( ( rule__SANNormal__CheckAssignment_6 )? ) )
            // InternalChessDSL.g:4527:1: ( ( rule__SANNormal__CheckAssignment_6 )? )
            {
            // InternalChessDSL.g:4527:1: ( ( rule__SANNormal__CheckAssignment_6 )? )
            // InternalChessDSL.g:4528:2: ( rule__SANNormal__CheckAssignment_6 )?
            {
             before(grammarAccess.getSANNormalAccess().getCheckAssignment_6()); 
            // InternalChessDSL.g:4529:2: ( rule__SANNormal__CheckAssignment_6 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=26 && LA49_0<=27)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalChessDSL.g:4529:3: rule__SANNormal__CheckAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__SANNormal__CheckAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSANNormalAccess().getCheckAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANNormal__Group__6__Impl"


    // $ANTLR start "rule__SANNormal__Group__7"
    // InternalChessDSL.g:4537:1: rule__SANNormal__Group__7 : rule__SANNormal__Group__7__Impl ;
    public final void rule__SANNormal__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4541:1: ( rule__SANNormal__Group__7__Impl )
            // InternalChessDSL.g:4542:2: rule__SANNormal__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SANNormal__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANNormal__Group__7"


    // $ANTLR start "rule__SANNormal__Group__7__Impl"
    // InternalChessDSL.g:4548:1: rule__SANNormal__Group__7__Impl : ( ( rule__SANNormal__RemarkAssignment_7 )? ) ;
    public final void rule__SANNormal__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4552:1: ( ( ( rule__SANNormal__RemarkAssignment_7 )? ) )
            // InternalChessDSL.g:4553:1: ( ( rule__SANNormal__RemarkAssignment_7 )? )
            {
            // InternalChessDSL.g:4553:1: ( ( rule__SANNormal__RemarkAssignment_7 )? )
            // InternalChessDSL.g:4554:2: ( rule__SANNormal__RemarkAssignment_7 )?
            {
             before(grammarAccess.getSANNormalAccess().getRemarkAssignment_7()); 
            // InternalChessDSL.g:4555:2: ( rule__SANNormal__RemarkAssignment_7 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=28 && LA50_0<=29)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalChessDSL.g:4555:3: rule__SANNormal__RemarkAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__SANNormal__RemarkAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSANNormalAccess().getRemarkAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANNormal__Group__7__Impl"


    // $ANTLR start "rule__SANPiece__Group__0"
    // InternalChessDSL.g:4564:1: rule__SANPiece__Group__0 : rule__SANPiece__Group__0__Impl rule__SANPiece__Group__1 ;
    public final void rule__SANPiece__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4568:1: ( rule__SANPiece__Group__0__Impl rule__SANPiece__Group__1 )
            // InternalChessDSL.g:4569:2: rule__SANPiece__Group__0__Impl rule__SANPiece__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__SANPiece__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SANPiece__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANPiece__Group__0"


    // $ANTLR start "rule__SANPiece__Group__0__Impl"
    // InternalChessDSL.g:4576:1: rule__SANPiece__Group__0__Impl : ( () ) ;
    public final void rule__SANPiece__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4580:1: ( ( () ) )
            // InternalChessDSL.g:4581:1: ( () )
            {
            // InternalChessDSL.g:4581:1: ( () )
            // InternalChessDSL.g:4582:2: ()
            {
             before(grammarAccess.getSANPieceAccess().getSANPieceAction_0()); 
            // InternalChessDSL.g:4583:2: ()
            // InternalChessDSL.g:4583:3: 
            {
            }

             after(grammarAccess.getSANPieceAccess().getSANPieceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANPiece__Group__0__Impl"


    // $ANTLR start "rule__SANPiece__Group__1"
    // InternalChessDSL.g:4591:1: rule__SANPiece__Group__1 : rule__SANPiece__Group__1__Impl ;
    public final void rule__SANPiece__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4595:1: ( rule__SANPiece__Group__1__Impl )
            // InternalChessDSL.g:4596:2: rule__SANPiece__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SANPiece__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANPiece__Group__1"


    // $ANTLR start "rule__SANPiece__Group__1__Impl"
    // InternalChessDSL.g:4602:1: rule__SANPiece__Group__1__Impl : ( ( rule__SANPiece__Alternatives_1 ) ) ;
    public final void rule__SANPiece__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4606:1: ( ( ( rule__SANPiece__Alternatives_1 ) ) )
            // InternalChessDSL.g:4607:1: ( ( rule__SANPiece__Alternatives_1 ) )
            {
            // InternalChessDSL.g:4607:1: ( ( rule__SANPiece__Alternatives_1 ) )
            // InternalChessDSL.g:4608:2: ( rule__SANPiece__Alternatives_1 )
            {
             before(grammarAccess.getSANPieceAccess().getAlternatives_1()); 
            // InternalChessDSL.g:4609:2: ( rule__SANPiece__Alternatives_1 )
            // InternalChessDSL.g:4609:3: rule__SANPiece__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__SANPiece__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getSANPieceAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANPiece__Group__1__Impl"


    // $ANTLR start "rule__SANDisambiguation__Group__0"
    // InternalChessDSL.g:4618:1: rule__SANDisambiguation__Group__0 : rule__SANDisambiguation__Group__0__Impl rule__SANDisambiguation__Group__1 ;
    public final void rule__SANDisambiguation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4622:1: ( rule__SANDisambiguation__Group__0__Impl rule__SANDisambiguation__Group__1 )
            // InternalChessDSL.g:4623:2: rule__SANDisambiguation__Group__0__Impl rule__SANDisambiguation__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__SANDisambiguation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SANDisambiguation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANDisambiguation__Group__0"


    // $ANTLR start "rule__SANDisambiguation__Group__0__Impl"
    // InternalChessDSL.g:4630:1: rule__SANDisambiguation__Group__0__Impl : ( () ) ;
    public final void rule__SANDisambiguation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4634:1: ( ( () ) )
            // InternalChessDSL.g:4635:1: ( () )
            {
            // InternalChessDSL.g:4635:1: ( () )
            // InternalChessDSL.g:4636:2: ()
            {
             before(grammarAccess.getSANDisambiguationAccess().getSANDisambiguationAction_0()); 
            // InternalChessDSL.g:4637:2: ()
            // InternalChessDSL.g:4637:3: 
            {
            }

             after(grammarAccess.getSANDisambiguationAccess().getSANDisambiguationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANDisambiguation__Group__0__Impl"


    // $ANTLR start "rule__SANDisambiguation__Group__1"
    // InternalChessDSL.g:4645:1: rule__SANDisambiguation__Group__1 : rule__SANDisambiguation__Group__1__Impl ;
    public final void rule__SANDisambiguation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4649:1: ( rule__SANDisambiguation__Group__1__Impl )
            // InternalChessDSL.g:4650:2: rule__SANDisambiguation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SANDisambiguation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANDisambiguation__Group__1"


    // $ANTLR start "rule__SANDisambiguation__Group__1__Impl"
    // InternalChessDSL.g:4656:1: rule__SANDisambiguation__Group__1__Impl : ( ( ( rule__SANDisambiguation__Alternatives_1 ) ) ( ( rule__SANDisambiguation__Alternatives_1 )* ) ) ;
    public final void rule__SANDisambiguation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4660:1: ( ( ( ( rule__SANDisambiguation__Alternatives_1 ) ) ( ( rule__SANDisambiguation__Alternatives_1 )* ) ) )
            // InternalChessDSL.g:4661:1: ( ( ( rule__SANDisambiguation__Alternatives_1 ) ) ( ( rule__SANDisambiguation__Alternatives_1 )* ) )
            {
            // InternalChessDSL.g:4661:1: ( ( ( rule__SANDisambiguation__Alternatives_1 ) ) ( ( rule__SANDisambiguation__Alternatives_1 )* ) )
            // InternalChessDSL.g:4662:2: ( ( rule__SANDisambiguation__Alternatives_1 ) ) ( ( rule__SANDisambiguation__Alternatives_1 )* )
            {
            // InternalChessDSL.g:4662:2: ( ( rule__SANDisambiguation__Alternatives_1 ) )
            // InternalChessDSL.g:4663:3: ( rule__SANDisambiguation__Alternatives_1 )
            {
             before(grammarAccess.getSANDisambiguationAccess().getAlternatives_1()); 
            // InternalChessDSL.g:4664:3: ( rule__SANDisambiguation__Alternatives_1 )
            // InternalChessDSL.g:4664:4: rule__SANDisambiguation__Alternatives_1
            {
            pushFollow(FOLLOW_45);
            rule__SANDisambiguation__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getSANDisambiguationAccess().getAlternatives_1()); 

            }

            // InternalChessDSL.g:4667:2: ( ( rule__SANDisambiguation__Alternatives_1 )* )
            // InternalChessDSL.g:4668:3: ( rule__SANDisambiguation__Alternatives_1 )*
            {
             before(grammarAccess.getSANDisambiguationAccess().getAlternatives_1()); 
            // InternalChessDSL.g:4669:3: ( rule__SANDisambiguation__Alternatives_1 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=RULE_LETTER && LA51_0<=RULE_RANKDIGIT)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalChessDSL.g:4669:4: rule__SANDisambiguation__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__SANDisambiguation__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getSANDisambiguationAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__SANDisambiguation__Group__1__Impl"


    // $ANTLR start "rule__SANPromotion__Group__0"
    // InternalChessDSL.g:4679:1: rule__SANPromotion__Group__0 : rule__SANPromotion__Group__0__Impl rule__SANPromotion__Group__1 ;
    public final void rule__SANPromotion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4683:1: ( rule__SANPromotion__Group__0__Impl rule__SANPromotion__Group__1 )
            // InternalChessDSL.g:4684:2: rule__SANPromotion__Group__0__Impl rule__SANPromotion__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__SANPromotion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SANPromotion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANPromotion__Group__0"


    // $ANTLR start "rule__SANPromotion__Group__0__Impl"
    // InternalChessDSL.g:4691:1: rule__SANPromotion__Group__0__Impl : ( () ) ;
    public final void rule__SANPromotion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4695:1: ( ( () ) )
            // InternalChessDSL.g:4696:1: ( () )
            {
            // InternalChessDSL.g:4696:1: ( () )
            // InternalChessDSL.g:4697:2: ()
            {
             before(grammarAccess.getSANPromotionAccess().getSANPromotionAction_0()); 
            // InternalChessDSL.g:4698:2: ()
            // InternalChessDSL.g:4698:3: 
            {
            }

             after(grammarAccess.getSANPromotionAccess().getSANPromotionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANPromotion__Group__0__Impl"


    // $ANTLR start "rule__SANPromotion__Group__1"
    // InternalChessDSL.g:4706:1: rule__SANPromotion__Group__1 : rule__SANPromotion__Group__1__Impl rule__SANPromotion__Group__2 ;
    public final void rule__SANPromotion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4710:1: ( rule__SANPromotion__Group__1__Impl rule__SANPromotion__Group__2 )
            // InternalChessDSL.g:4711:2: rule__SANPromotion__Group__1__Impl rule__SANPromotion__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__SANPromotion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SANPromotion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANPromotion__Group__1"


    // $ANTLR start "rule__SANPromotion__Group__1__Impl"
    // InternalChessDSL.g:4718:1: rule__SANPromotion__Group__1__Impl : ( '=' ) ;
    public final void rule__SANPromotion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4722:1: ( ( '=' ) )
            // InternalChessDSL.g:4723:1: ( '=' )
            {
            // InternalChessDSL.g:4723:1: ( '=' )
            // InternalChessDSL.g:4724:2: '='
            {
             before(grammarAccess.getSANPromotionAccess().getEqualsSignKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSANPromotionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANPromotion__Group__1__Impl"


    // $ANTLR start "rule__SANPromotion__Group__2"
    // InternalChessDSL.g:4733:1: rule__SANPromotion__Group__2 : rule__SANPromotion__Group__2__Impl ;
    public final void rule__SANPromotion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4737:1: ( rule__SANPromotion__Group__2__Impl )
            // InternalChessDSL.g:4738:2: rule__SANPromotion__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SANPromotion__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANPromotion__Group__2"


    // $ANTLR start "rule__SANPromotion__Group__2__Impl"
    // InternalChessDSL.g:4744:1: rule__SANPromotion__Group__2__Impl : ( ( rule__SANPromotion__Alternatives_2 ) ) ;
    public final void rule__SANPromotion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4748:1: ( ( ( rule__SANPromotion__Alternatives_2 ) ) )
            // InternalChessDSL.g:4749:1: ( ( rule__SANPromotion__Alternatives_2 ) )
            {
            // InternalChessDSL.g:4749:1: ( ( rule__SANPromotion__Alternatives_2 ) )
            // InternalChessDSL.g:4750:2: ( rule__SANPromotion__Alternatives_2 )
            {
             before(grammarAccess.getSANPromotionAccess().getAlternatives_2()); 
            // InternalChessDSL.g:4751:2: ( rule__SANPromotion__Alternatives_2 )
            // InternalChessDSL.g:4751:3: rule__SANPromotion__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__SANPromotion__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getSANPromotionAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANPromotion__Group__2__Impl"


    // $ANTLR start "rule__SANCheckMarker__Group__0"
    // InternalChessDSL.g:4760:1: rule__SANCheckMarker__Group__0 : rule__SANCheckMarker__Group__0__Impl rule__SANCheckMarker__Group__1 ;
    public final void rule__SANCheckMarker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4764:1: ( rule__SANCheckMarker__Group__0__Impl rule__SANCheckMarker__Group__1 )
            // InternalChessDSL.g:4765:2: rule__SANCheckMarker__Group__0__Impl rule__SANCheckMarker__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__SANCheckMarker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SANCheckMarker__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANCheckMarker__Group__0"


    // $ANTLR start "rule__SANCheckMarker__Group__0__Impl"
    // InternalChessDSL.g:4772:1: rule__SANCheckMarker__Group__0__Impl : ( () ) ;
    public final void rule__SANCheckMarker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4776:1: ( ( () ) )
            // InternalChessDSL.g:4777:1: ( () )
            {
            // InternalChessDSL.g:4777:1: ( () )
            // InternalChessDSL.g:4778:2: ()
            {
             before(grammarAccess.getSANCheckMarkerAccess().getSANCheckMarkerAction_0()); 
            // InternalChessDSL.g:4779:2: ()
            // InternalChessDSL.g:4779:3: 
            {
            }

             after(grammarAccess.getSANCheckMarkerAccess().getSANCheckMarkerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANCheckMarker__Group__0__Impl"


    // $ANTLR start "rule__SANCheckMarker__Group__1"
    // InternalChessDSL.g:4787:1: rule__SANCheckMarker__Group__1 : rule__SANCheckMarker__Group__1__Impl ;
    public final void rule__SANCheckMarker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4791:1: ( rule__SANCheckMarker__Group__1__Impl )
            // InternalChessDSL.g:4792:2: rule__SANCheckMarker__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SANCheckMarker__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANCheckMarker__Group__1"


    // $ANTLR start "rule__SANCheckMarker__Group__1__Impl"
    // InternalChessDSL.g:4798:1: rule__SANCheckMarker__Group__1__Impl : ( ( ( rule__SANCheckMarker__Alternatives_1 ) ) ( ( rule__SANCheckMarker__Alternatives_1 )* ) ) ;
    public final void rule__SANCheckMarker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4802:1: ( ( ( ( rule__SANCheckMarker__Alternatives_1 ) ) ( ( rule__SANCheckMarker__Alternatives_1 )* ) ) )
            // InternalChessDSL.g:4803:1: ( ( ( rule__SANCheckMarker__Alternatives_1 ) ) ( ( rule__SANCheckMarker__Alternatives_1 )* ) )
            {
            // InternalChessDSL.g:4803:1: ( ( ( rule__SANCheckMarker__Alternatives_1 ) ) ( ( rule__SANCheckMarker__Alternatives_1 )* ) )
            // InternalChessDSL.g:4804:2: ( ( rule__SANCheckMarker__Alternatives_1 ) ) ( ( rule__SANCheckMarker__Alternatives_1 )* )
            {
            // InternalChessDSL.g:4804:2: ( ( rule__SANCheckMarker__Alternatives_1 ) )
            // InternalChessDSL.g:4805:3: ( rule__SANCheckMarker__Alternatives_1 )
            {
             before(grammarAccess.getSANCheckMarkerAccess().getAlternatives_1()); 
            // InternalChessDSL.g:4806:3: ( rule__SANCheckMarker__Alternatives_1 )
            // InternalChessDSL.g:4806:4: rule__SANCheckMarker__Alternatives_1
            {
            pushFollow(FOLLOW_49);
            rule__SANCheckMarker__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getSANCheckMarkerAccess().getAlternatives_1()); 

            }

            // InternalChessDSL.g:4809:2: ( ( rule__SANCheckMarker__Alternatives_1 )* )
            // InternalChessDSL.g:4810:3: ( rule__SANCheckMarker__Alternatives_1 )*
            {
             before(grammarAccess.getSANCheckMarkerAccess().getAlternatives_1()); 
            // InternalChessDSL.g:4811:3: ( rule__SANCheckMarker__Alternatives_1 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=26 && LA52_0<=27)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalChessDSL.g:4811:4: rule__SANCheckMarker__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__SANCheckMarker__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getSANCheckMarkerAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__SANCheckMarker__Group__1__Impl"


    // $ANTLR start "rule__SANCapture__Group__0"
    // InternalChessDSL.g:4821:1: rule__SANCapture__Group__0 : rule__SANCapture__Group__0__Impl rule__SANCapture__Group__1 ;
    public final void rule__SANCapture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4825:1: ( rule__SANCapture__Group__0__Impl rule__SANCapture__Group__1 )
            // InternalChessDSL.g:4826:2: rule__SANCapture__Group__0__Impl rule__SANCapture__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__SANCapture__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SANCapture__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANCapture__Group__0"


    // $ANTLR start "rule__SANCapture__Group__0__Impl"
    // InternalChessDSL.g:4833:1: rule__SANCapture__Group__0__Impl : ( () ) ;
    public final void rule__SANCapture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4837:1: ( ( () ) )
            // InternalChessDSL.g:4838:1: ( () )
            {
            // InternalChessDSL.g:4838:1: ( () )
            // InternalChessDSL.g:4839:2: ()
            {
             before(grammarAccess.getSANCaptureAccess().getSANCaptureAction_0()); 
            // InternalChessDSL.g:4840:2: ()
            // InternalChessDSL.g:4840:3: 
            {
            }

             after(grammarAccess.getSANCaptureAccess().getSANCaptureAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANCapture__Group__0__Impl"


    // $ANTLR start "rule__SANCapture__Group__1"
    // InternalChessDSL.g:4848:1: rule__SANCapture__Group__1 : rule__SANCapture__Group__1__Impl ;
    public final void rule__SANCapture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4852:1: ( rule__SANCapture__Group__1__Impl )
            // InternalChessDSL.g:4853:2: rule__SANCapture__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SANCapture__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANCapture__Group__1"


    // $ANTLR start "rule__SANCapture__Group__1__Impl"
    // InternalChessDSL.g:4859:1: rule__SANCapture__Group__1__Impl : ( 'x' ) ;
    public final void rule__SANCapture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4863:1: ( ( 'x' ) )
            // InternalChessDSL.g:4864:1: ( 'x' )
            {
            // InternalChessDSL.g:4864:1: ( 'x' )
            // InternalChessDSL.g:4865:2: 'x'
            {
             before(grammarAccess.getSANCaptureAccess().getXKeyword_1()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getSANCaptureAccess().getXKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANCapture__Group__1__Impl"


    // $ANTLR start "rule__SANRemark__Group__0"
    // InternalChessDSL.g:4875:1: rule__SANRemark__Group__0 : rule__SANRemark__Group__0__Impl rule__SANRemark__Group__1 ;
    public final void rule__SANRemark__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4879:1: ( rule__SANRemark__Group__0__Impl rule__SANRemark__Group__1 )
            // InternalChessDSL.g:4880:2: rule__SANRemark__Group__0__Impl rule__SANRemark__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__SANRemark__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SANRemark__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANRemark__Group__0"


    // $ANTLR start "rule__SANRemark__Group__0__Impl"
    // InternalChessDSL.g:4887:1: rule__SANRemark__Group__0__Impl : ( () ) ;
    public final void rule__SANRemark__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4891:1: ( ( () ) )
            // InternalChessDSL.g:4892:1: ( () )
            {
            // InternalChessDSL.g:4892:1: ( () )
            // InternalChessDSL.g:4893:2: ()
            {
             before(grammarAccess.getSANRemarkAccess().getSANRemarkAction_0()); 
            // InternalChessDSL.g:4894:2: ()
            // InternalChessDSL.g:4894:3: 
            {
            }

             after(grammarAccess.getSANRemarkAccess().getSANRemarkAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANRemark__Group__0__Impl"


    // $ANTLR start "rule__SANRemark__Group__1"
    // InternalChessDSL.g:4902:1: rule__SANRemark__Group__1 : rule__SANRemark__Group__1__Impl ;
    public final void rule__SANRemark__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4906:1: ( rule__SANRemark__Group__1__Impl )
            // InternalChessDSL.g:4907:2: rule__SANRemark__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SANRemark__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANRemark__Group__1"


    // $ANTLR start "rule__SANRemark__Group__1__Impl"
    // InternalChessDSL.g:4913:1: rule__SANRemark__Group__1__Impl : ( ( ( rule__SANRemark__Alternatives_1 ) ) ( ( rule__SANRemark__Alternatives_1 )* ) ) ;
    public final void rule__SANRemark__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4917:1: ( ( ( ( rule__SANRemark__Alternatives_1 ) ) ( ( rule__SANRemark__Alternatives_1 )* ) ) )
            // InternalChessDSL.g:4918:1: ( ( ( rule__SANRemark__Alternatives_1 ) ) ( ( rule__SANRemark__Alternatives_1 )* ) )
            {
            // InternalChessDSL.g:4918:1: ( ( ( rule__SANRemark__Alternatives_1 ) ) ( ( rule__SANRemark__Alternatives_1 )* ) )
            // InternalChessDSL.g:4919:2: ( ( rule__SANRemark__Alternatives_1 ) ) ( ( rule__SANRemark__Alternatives_1 )* )
            {
            // InternalChessDSL.g:4919:2: ( ( rule__SANRemark__Alternatives_1 ) )
            // InternalChessDSL.g:4920:3: ( rule__SANRemark__Alternatives_1 )
            {
             before(grammarAccess.getSANRemarkAccess().getAlternatives_1()); 
            // InternalChessDSL.g:4921:3: ( rule__SANRemark__Alternatives_1 )
            // InternalChessDSL.g:4921:4: rule__SANRemark__Alternatives_1
            {
            pushFollow(FOLLOW_52);
            rule__SANRemark__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getSANRemarkAccess().getAlternatives_1()); 

            }

            // InternalChessDSL.g:4924:2: ( ( rule__SANRemark__Alternatives_1 )* )
            // InternalChessDSL.g:4925:3: ( rule__SANRemark__Alternatives_1 )*
            {
             before(grammarAccess.getSANRemarkAccess().getAlternatives_1()); 
            // InternalChessDSL.g:4926:3: ( rule__SANRemark__Alternatives_1 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=28 && LA53_0<=29)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalChessDSL.g:4926:4: rule__SANRemark__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_52);
            	    rule__SANRemark__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getSANRemarkAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__SANRemark__Group__1__Impl"


    // $ANTLR start "rule__Conclusion__Group__0"
    // InternalChessDSL.g:4936:1: rule__Conclusion__Group__0 : rule__Conclusion__Group__0__Impl rule__Conclusion__Group__1 ;
    public final void rule__Conclusion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4940:1: ( rule__Conclusion__Group__0__Impl rule__Conclusion__Group__1 )
            // InternalChessDSL.g:4941:2: rule__Conclusion__Group__0__Impl rule__Conclusion__Group__1
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
    // InternalChessDSL.g:4948:1: rule__Conclusion__Group__0__Impl : ( ( rule__Conclusion__MethodAssignment_0 )? ) ;
    public final void rule__Conclusion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4952:1: ( ( ( rule__Conclusion__MethodAssignment_0 )? ) )
            // InternalChessDSL.g:4953:1: ( ( rule__Conclusion__MethodAssignment_0 )? )
            {
            // InternalChessDSL.g:4953:1: ( ( rule__Conclusion__MethodAssignment_0 )? )
            // InternalChessDSL.g:4954:2: ( rule__Conclusion__MethodAssignment_0 )?
            {
             before(grammarAccess.getConclusionAccess().getMethodAssignment_0()); 
            // InternalChessDSL.g:4955:2: ( rule__Conclusion__MethodAssignment_0 )?
            int alt54=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA54_1 = input.LA(2);

                    if ( (LA54_1==64||LA54_1==73||(LA54_1>=77 && LA54_1<=78)) ) {
                        alt54=1;
                    }
                    }
                    break;
                case 38:
                    {
                    int LA54_2 = input.LA(2);

                    if ( (LA54_2==64||LA54_2==73||(LA54_2>=77 && LA54_2<=78)) ) {
                        alt54=1;
                    }
                    }
                    break;
                case 39:
                    {
                    int LA54_3 = input.LA(2);

                    if ( (LA54_3==64||LA54_3==73||(LA54_3>=77 && LA54_3<=78)) ) {
                        alt54=1;
                    }
                    }
                    break;
            }

            switch (alt54) {
                case 1 :
                    // InternalChessDSL.g:4955:3: rule__Conclusion__MethodAssignment_0
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
    // InternalChessDSL.g:4963:1: rule__Conclusion__Group__1 : rule__Conclusion__Group__1__Impl ;
    public final void rule__Conclusion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4967:1: ( rule__Conclusion__Group__1__Impl )
            // InternalChessDSL.g:4968:2: rule__Conclusion__Group__1__Impl
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
    // InternalChessDSL.g:4974:1: rule__Conclusion__Group__1__Impl : ( ( rule__Conclusion__ResultAssignment_1 ) ) ;
    public final void rule__Conclusion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4978:1: ( ( ( rule__Conclusion__ResultAssignment_1 ) ) )
            // InternalChessDSL.g:4979:1: ( ( rule__Conclusion__ResultAssignment_1 ) )
            {
            // InternalChessDSL.g:4979:1: ( ( rule__Conclusion__ResultAssignment_1 ) )
            // InternalChessDSL.g:4980:2: ( rule__Conclusion__ResultAssignment_1 )
            {
             before(grammarAccess.getConclusionAccess().getResultAssignment_1()); 
            // InternalChessDSL.g:4981:2: ( rule__Conclusion__ResultAssignment_1 )
            // InternalChessDSL.g:4981:3: rule__Conclusion__ResultAssignment_1
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
    // InternalChessDSL.g:4990:1: rule__TimeUp__Group__0 : rule__TimeUp__Group__0__Impl rule__TimeUp__Group__1 ;
    public final void rule__TimeUp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:4994:1: ( rule__TimeUp__Group__0__Impl rule__TimeUp__Group__1 )
            // InternalChessDSL.g:4995:2: rule__TimeUp__Group__0__Impl rule__TimeUp__Group__1
            {
            pushFollow(FOLLOW_53);
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
    // InternalChessDSL.g:5002:1: rule__TimeUp__Group__0__Impl : ( ( rule__TimeUp__PlayerAssignment_0 ) ) ;
    public final void rule__TimeUp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5006:1: ( ( ( rule__TimeUp__PlayerAssignment_0 ) ) )
            // InternalChessDSL.g:5007:1: ( ( rule__TimeUp__PlayerAssignment_0 ) )
            {
            // InternalChessDSL.g:5007:1: ( ( rule__TimeUp__PlayerAssignment_0 ) )
            // InternalChessDSL.g:5008:2: ( rule__TimeUp__PlayerAssignment_0 )
            {
             before(grammarAccess.getTimeUpAccess().getPlayerAssignment_0()); 
            // InternalChessDSL.g:5009:2: ( rule__TimeUp__PlayerAssignment_0 )
            // InternalChessDSL.g:5009:3: rule__TimeUp__PlayerAssignment_0
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
    // InternalChessDSL.g:5017:1: rule__TimeUp__Group__1 : rule__TimeUp__Group__1__Impl rule__TimeUp__Group__2 ;
    public final void rule__TimeUp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5021:1: ( rule__TimeUp__Group__1__Impl rule__TimeUp__Group__2 )
            // InternalChessDSL.g:5022:2: rule__TimeUp__Group__1__Impl rule__TimeUp__Group__2
            {
            pushFollow(FOLLOW_54);
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
    // InternalChessDSL.g:5029:1: rule__TimeUp__Group__1__Impl : ( 'ran' ) ;
    public final void rule__TimeUp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5033:1: ( ( 'ran' ) )
            // InternalChessDSL.g:5034:1: ( 'ran' )
            {
            // InternalChessDSL.g:5034:1: ( 'ran' )
            // InternalChessDSL.g:5035:2: 'ran'
            {
             before(grammarAccess.getTimeUpAccess().getRanKeyword_1()); 
            match(input,73,FOLLOW_2); 
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
    // InternalChessDSL.g:5044:1: rule__TimeUp__Group__2 : rule__TimeUp__Group__2__Impl rule__TimeUp__Group__3 ;
    public final void rule__TimeUp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5048:1: ( rule__TimeUp__Group__2__Impl rule__TimeUp__Group__3 )
            // InternalChessDSL.g:5049:2: rule__TimeUp__Group__2__Impl rule__TimeUp__Group__3
            {
            pushFollow(FOLLOW_55);
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
    // InternalChessDSL.g:5056:1: rule__TimeUp__Group__2__Impl : ( 'out' ) ;
    public final void rule__TimeUp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5060:1: ( ( 'out' ) )
            // InternalChessDSL.g:5061:1: ( 'out' )
            {
            // InternalChessDSL.g:5061:1: ( 'out' )
            // InternalChessDSL.g:5062:2: 'out'
            {
             before(grammarAccess.getTimeUpAccess().getOutKeyword_2()); 
            match(input,74,FOLLOW_2); 
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
    // InternalChessDSL.g:5071:1: rule__TimeUp__Group__3 : rule__TimeUp__Group__3__Impl rule__TimeUp__Group__4 ;
    public final void rule__TimeUp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5075:1: ( rule__TimeUp__Group__3__Impl rule__TimeUp__Group__4 )
            // InternalChessDSL.g:5076:2: rule__TimeUp__Group__3__Impl rule__TimeUp__Group__4
            {
            pushFollow(FOLLOW_56);
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
    // InternalChessDSL.g:5083:1: rule__TimeUp__Group__3__Impl : ( 'of' ) ;
    public final void rule__TimeUp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5087:1: ( ( 'of' ) )
            // InternalChessDSL.g:5088:1: ( 'of' )
            {
            // InternalChessDSL.g:5088:1: ( 'of' )
            // InternalChessDSL.g:5089:2: 'of'
            {
             before(grammarAccess.getTimeUpAccess().getOfKeyword_3()); 
            match(input,75,FOLLOW_2); 
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
    // InternalChessDSL.g:5098:1: rule__TimeUp__Group__4 : rule__TimeUp__Group__4__Impl ;
    public final void rule__TimeUp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5102:1: ( rule__TimeUp__Group__4__Impl )
            // InternalChessDSL.g:5103:2: rule__TimeUp__Group__4__Impl
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
    // InternalChessDSL.g:5109:1: rule__TimeUp__Group__4__Impl : ( 'time' ) ;
    public final void rule__TimeUp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5113:1: ( ( 'time' ) )
            // InternalChessDSL.g:5114:1: ( 'time' )
            {
            // InternalChessDSL.g:5114:1: ( 'time' )
            // InternalChessDSL.g:5115:2: 'time'
            {
             before(grammarAccess.getTimeUpAccess().getTimeKeyword_4()); 
            match(input,76,FOLLOW_2); 
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
    // InternalChessDSL.g:5125:1: rule__Resign__Group__0 : rule__Resign__Group__0__Impl rule__Resign__Group__1 ;
    public final void rule__Resign__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5129:1: ( rule__Resign__Group__0__Impl rule__Resign__Group__1 )
            // InternalChessDSL.g:5130:2: rule__Resign__Group__0__Impl rule__Resign__Group__1
            {
            pushFollow(FOLLOW_57);
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
    // InternalChessDSL.g:5137:1: rule__Resign__Group__0__Impl : ( ( rule__Resign__PlayerAssignment_0 ) ) ;
    public final void rule__Resign__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5141:1: ( ( ( rule__Resign__PlayerAssignment_0 ) ) )
            // InternalChessDSL.g:5142:1: ( ( rule__Resign__PlayerAssignment_0 ) )
            {
            // InternalChessDSL.g:5142:1: ( ( rule__Resign__PlayerAssignment_0 ) )
            // InternalChessDSL.g:5143:2: ( rule__Resign__PlayerAssignment_0 )
            {
             before(grammarAccess.getResignAccess().getPlayerAssignment_0()); 
            // InternalChessDSL.g:5144:2: ( rule__Resign__PlayerAssignment_0 )
            // InternalChessDSL.g:5144:3: rule__Resign__PlayerAssignment_0
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
    // InternalChessDSL.g:5152:1: rule__Resign__Group__1 : rule__Resign__Group__1__Impl ;
    public final void rule__Resign__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5156:1: ( rule__Resign__Group__1__Impl )
            // InternalChessDSL.g:5157:2: rule__Resign__Group__1__Impl
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
    // InternalChessDSL.g:5163:1: rule__Resign__Group__1__Impl : ( 'resigned' ) ;
    public final void rule__Resign__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5167:1: ( ( 'resigned' ) )
            // InternalChessDSL.g:5168:1: ( 'resigned' )
            {
            // InternalChessDSL.g:5168:1: ( 'resigned' )
            // InternalChessDSL.g:5169:2: 'resigned'
            {
             before(grammarAccess.getResignAccess().getResignedKeyword_1()); 
            match(input,77,FOLLOW_2); 
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
    // InternalChessDSL.g:5179:1: rule__Checkmate__Group__0 : rule__Checkmate__Group__0__Impl rule__Checkmate__Group__1 ;
    public final void rule__Checkmate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5183:1: ( rule__Checkmate__Group__0__Impl rule__Checkmate__Group__1 )
            // InternalChessDSL.g:5184:2: rule__Checkmate__Group__0__Impl rule__Checkmate__Group__1
            {
            pushFollow(FOLLOW_58);
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
    // InternalChessDSL.g:5191:1: rule__Checkmate__Group__0__Impl : ( ( rule__Checkmate__Player1Assignment_0 ) ) ;
    public final void rule__Checkmate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5195:1: ( ( ( rule__Checkmate__Player1Assignment_0 ) ) )
            // InternalChessDSL.g:5196:1: ( ( rule__Checkmate__Player1Assignment_0 ) )
            {
            // InternalChessDSL.g:5196:1: ( ( rule__Checkmate__Player1Assignment_0 ) )
            // InternalChessDSL.g:5197:2: ( rule__Checkmate__Player1Assignment_0 )
            {
             before(grammarAccess.getCheckmateAccess().getPlayer1Assignment_0()); 
            // InternalChessDSL.g:5198:2: ( rule__Checkmate__Player1Assignment_0 )
            // InternalChessDSL.g:5198:3: rule__Checkmate__Player1Assignment_0
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
    // InternalChessDSL.g:5206:1: rule__Checkmate__Group__1 : rule__Checkmate__Group__1__Impl rule__Checkmate__Group__2 ;
    public final void rule__Checkmate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5210:1: ( rule__Checkmate__Group__1__Impl rule__Checkmate__Group__2 )
            // InternalChessDSL.g:5211:2: rule__Checkmate__Group__1__Impl rule__Checkmate__Group__2
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
    // InternalChessDSL.g:5218:1: rule__Checkmate__Group__1__Impl : ( 'checkmated' ) ;
    public final void rule__Checkmate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5222:1: ( ( 'checkmated' ) )
            // InternalChessDSL.g:5223:1: ( 'checkmated' )
            {
            // InternalChessDSL.g:5223:1: ( 'checkmated' )
            // InternalChessDSL.g:5224:2: 'checkmated'
            {
             before(grammarAccess.getCheckmateAccess().getCheckmatedKeyword_1()); 
            match(input,78,FOLLOW_2); 
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
    // InternalChessDSL.g:5233:1: rule__Checkmate__Group__2 : rule__Checkmate__Group__2__Impl ;
    public final void rule__Checkmate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5237:1: ( rule__Checkmate__Group__2__Impl )
            // InternalChessDSL.g:5238:2: rule__Checkmate__Group__2__Impl
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
    // InternalChessDSL.g:5244:1: rule__Checkmate__Group__2__Impl : ( ( rule__Checkmate__Player2Assignment_2 ) ) ;
    public final void rule__Checkmate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5248:1: ( ( ( rule__Checkmate__Player2Assignment_2 ) ) )
            // InternalChessDSL.g:5249:1: ( ( rule__Checkmate__Player2Assignment_2 ) )
            {
            // InternalChessDSL.g:5249:1: ( ( rule__Checkmate__Player2Assignment_2 ) )
            // InternalChessDSL.g:5250:2: ( rule__Checkmate__Player2Assignment_2 )
            {
             before(grammarAccess.getCheckmateAccess().getPlayer2Assignment_2()); 
            // InternalChessDSL.g:5251:2: ( rule__Checkmate__Player2Assignment_2 )
            // InternalChessDSL.g:5251:3: rule__Checkmate__Player2Assignment_2
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
    // InternalChessDSL.g:5260:1: rule__Draw__Group__0 : rule__Draw__Group__0__Impl rule__Draw__Group__1 ;
    public final void rule__Draw__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5264:1: ( rule__Draw__Group__0__Impl rule__Draw__Group__1 )
            // InternalChessDSL.g:5265:2: rule__Draw__Group__0__Impl rule__Draw__Group__1
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
    // InternalChessDSL.g:5272:1: rule__Draw__Group__0__Impl : ( ( rule__Draw__Player1Assignment_0 ) ) ;
    public final void rule__Draw__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5276:1: ( ( ( rule__Draw__Player1Assignment_0 ) ) )
            // InternalChessDSL.g:5277:1: ( ( rule__Draw__Player1Assignment_0 ) )
            {
            // InternalChessDSL.g:5277:1: ( ( rule__Draw__Player1Assignment_0 ) )
            // InternalChessDSL.g:5278:2: ( rule__Draw__Player1Assignment_0 )
            {
             before(grammarAccess.getDrawAccess().getPlayer1Assignment_0()); 
            // InternalChessDSL.g:5279:2: ( rule__Draw__Player1Assignment_0 )
            // InternalChessDSL.g:5279:3: rule__Draw__Player1Assignment_0
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
    // InternalChessDSL.g:5287:1: rule__Draw__Group__1 : rule__Draw__Group__1__Impl rule__Draw__Group__2 ;
    public final void rule__Draw__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5291:1: ( rule__Draw__Group__1__Impl rule__Draw__Group__2 )
            // InternalChessDSL.g:5292:2: rule__Draw__Group__1__Impl rule__Draw__Group__2
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
    // InternalChessDSL.g:5299:1: rule__Draw__Group__1__Impl : ( 'and' ) ;
    public final void rule__Draw__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5303:1: ( ( 'and' ) )
            // InternalChessDSL.g:5304:1: ( 'and' )
            {
            // InternalChessDSL.g:5304:1: ( 'and' )
            // InternalChessDSL.g:5305:2: 'and'
            {
             before(grammarAccess.getDrawAccess().getAndKeyword_1()); 
            match(input,64,FOLLOW_2); 
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
    // InternalChessDSL.g:5314:1: rule__Draw__Group__2 : rule__Draw__Group__2__Impl rule__Draw__Group__3 ;
    public final void rule__Draw__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5318:1: ( rule__Draw__Group__2__Impl rule__Draw__Group__3 )
            // InternalChessDSL.g:5319:2: rule__Draw__Group__2__Impl rule__Draw__Group__3
            {
            pushFollow(FOLLOW_59);
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
    // InternalChessDSL.g:5326:1: rule__Draw__Group__2__Impl : ( ( rule__Draw__Player2Assignment_2 ) ) ;
    public final void rule__Draw__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5330:1: ( ( ( rule__Draw__Player2Assignment_2 ) ) )
            // InternalChessDSL.g:5331:1: ( ( rule__Draw__Player2Assignment_2 ) )
            {
            // InternalChessDSL.g:5331:1: ( ( rule__Draw__Player2Assignment_2 ) )
            // InternalChessDSL.g:5332:2: ( rule__Draw__Player2Assignment_2 )
            {
             before(grammarAccess.getDrawAccess().getPlayer2Assignment_2()); 
            // InternalChessDSL.g:5333:2: ( rule__Draw__Player2Assignment_2 )
            // InternalChessDSL.g:5333:3: rule__Draw__Player2Assignment_2
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
    // InternalChessDSL.g:5341:1: rule__Draw__Group__3 : rule__Draw__Group__3__Impl ;
    public final void rule__Draw__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5345:1: ( rule__Draw__Group__3__Impl )
            // InternalChessDSL.g:5346:2: rule__Draw__Group__3__Impl
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
    // InternalChessDSL.g:5352:1: rule__Draw__Group__3__Impl : ( ( rule__Draw__ResultAssignment_3 ) ) ;
    public final void rule__Draw__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5356:1: ( ( ( rule__Draw__ResultAssignment_3 ) ) )
            // InternalChessDSL.g:5357:1: ( ( rule__Draw__ResultAssignment_3 ) )
            {
            // InternalChessDSL.g:5357:1: ( ( rule__Draw__ResultAssignment_3 ) )
            // InternalChessDSL.g:5358:2: ( rule__Draw__ResultAssignment_3 )
            {
             before(grammarAccess.getDrawAccess().getResultAssignment_3()); 
            // InternalChessDSL.g:5359:2: ( rule__Draw__ResultAssignment_3 )
            // InternalChessDSL.g:5359:3: rule__Draw__ResultAssignment_3
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
    // InternalChessDSL.g:5368:1: rule__Stalemate__Group__0 : rule__Stalemate__Group__0__Impl rule__Stalemate__Group__1 ;
    public final void rule__Stalemate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5372:1: ( rule__Stalemate__Group__0__Impl rule__Stalemate__Group__1 )
            // InternalChessDSL.g:5373:2: rule__Stalemate__Group__0__Impl rule__Stalemate__Group__1
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
    // InternalChessDSL.g:5380:1: rule__Stalemate__Group__0__Impl : ( 'ended' ) ;
    public final void rule__Stalemate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5384:1: ( ( 'ended' ) )
            // InternalChessDSL.g:5385:1: ( 'ended' )
            {
            // InternalChessDSL.g:5385:1: ( 'ended' )
            // InternalChessDSL.g:5386:2: 'ended'
            {
             before(grammarAccess.getStalemateAccess().getEndedKeyword_0()); 
            match(input,79,FOLLOW_2); 
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
    // InternalChessDSL.g:5395:1: rule__Stalemate__Group__1 : rule__Stalemate__Group__1__Impl rule__Stalemate__Group__2 ;
    public final void rule__Stalemate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5399:1: ( rule__Stalemate__Group__1__Impl rule__Stalemate__Group__2 )
            // InternalChessDSL.g:5400:2: rule__Stalemate__Group__1__Impl rule__Stalemate__Group__2
            {
            pushFollow(FOLLOW_60);
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
    // InternalChessDSL.g:5407:1: rule__Stalemate__Group__1__Impl : ( 'the' ) ;
    public final void rule__Stalemate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5411:1: ( ( 'the' ) )
            // InternalChessDSL.g:5412:1: ( 'the' )
            {
            // InternalChessDSL.g:5412:1: ( 'the' )
            // InternalChessDSL.g:5413:2: 'the'
            {
             before(grammarAccess.getStalemateAccess().getTheKeyword_1()); 
            match(input,68,FOLLOW_2); 
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
    // InternalChessDSL.g:5422:1: rule__Stalemate__Group__2 : rule__Stalemate__Group__2__Impl rule__Stalemate__Group__3 ;
    public final void rule__Stalemate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5426:1: ( rule__Stalemate__Group__2__Impl rule__Stalemate__Group__3 )
            // InternalChessDSL.g:5427:2: rule__Stalemate__Group__2__Impl rule__Stalemate__Group__3
            {
            pushFollow(FOLLOW_61);
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
    // InternalChessDSL.g:5434:1: rule__Stalemate__Group__2__Impl : ( 'game' ) ;
    public final void rule__Stalemate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5438:1: ( ( 'game' ) )
            // InternalChessDSL.g:5439:1: ( 'game' )
            {
            // InternalChessDSL.g:5439:1: ( 'game' )
            // InternalChessDSL.g:5440:2: 'game'
            {
             before(grammarAccess.getStalemateAccess().getGameKeyword_2()); 
            match(input,80,FOLLOW_2); 
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
    // InternalChessDSL.g:5449:1: rule__Stalemate__Group__3 : rule__Stalemate__Group__3__Impl rule__Stalemate__Group__4 ;
    public final void rule__Stalemate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5453:1: ( rule__Stalemate__Group__3__Impl rule__Stalemate__Group__4 )
            // InternalChessDSL.g:5454:2: rule__Stalemate__Group__3__Impl rule__Stalemate__Group__4
            {
            pushFollow(FOLLOW_62);
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
    // InternalChessDSL.g:5461:1: rule__Stalemate__Group__3__Impl : ( 'in' ) ;
    public final void rule__Stalemate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5465:1: ( ( 'in' ) )
            // InternalChessDSL.g:5466:1: ( 'in' )
            {
            // InternalChessDSL.g:5466:1: ( 'in' )
            // InternalChessDSL.g:5467:2: 'in'
            {
             before(grammarAccess.getStalemateAccess().getInKeyword_3()); 
            match(input,81,FOLLOW_2); 
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
    // InternalChessDSL.g:5476:1: rule__Stalemate__Group__4 : rule__Stalemate__Group__4__Impl rule__Stalemate__Group__5 ;
    public final void rule__Stalemate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5480:1: ( rule__Stalemate__Group__4__Impl rule__Stalemate__Group__5 )
            // InternalChessDSL.g:5481:2: rule__Stalemate__Group__4__Impl rule__Stalemate__Group__5
            {
            pushFollow(FOLLOW_63);
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
    // InternalChessDSL.g:5488:1: rule__Stalemate__Group__4__Impl : ( 'a' ) ;
    public final void rule__Stalemate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5492:1: ( ( 'a' ) )
            // InternalChessDSL.g:5493:1: ( 'a' )
            {
            // InternalChessDSL.g:5493:1: ( 'a' )
            // InternalChessDSL.g:5494:2: 'a'
            {
             before(grammarAccess.getStalemateAccess().getAKeyword_4()); 
            match(input,82,FOLLOW_2); 
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
    // InternalChessDSL.g:5503:1: rule__Stalemate__Group__5 : rule__Stalemate__Group__5__Impl ;
    public final void rule__Stalemate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5507:1: ( rule__Stalemate__Group__5__Impl )
            // InternalChessDSL.g:5508:2: rule__Stalemate__Group__5__Impl
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
    // InternalChessDSL.g:5514:1: rule__Stalemate__Group__5__Impl : ( 'stalemate' ) ;
    public final void rule__Stalemate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5518:1: ( ( 'stalemate' ) )
            // InternalChessDSL.g:5519:1: ( 'stalemate' )
            {
            // InternalChessDSL.g:5519:1: ( 'stalemate' )
            // InternalChessDSL.g:5520:2: 'stalemate'
            {
             before(grammarAccess.getStalemateAccess().getStalemateKeyword_5()); 
            match(input,83,FOLLOW_2); 
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
    // InternalChessDSL.g:5530:1: rule__Threefold__Group__0 : rule__Threefold__Group__0__Impl rule__Threefold__Group__1 ;
    public final void rule__Threefold__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5534:1: ( rule__Threefold__Group__0__Impl rule__Threefold__Group__1 )
            // InternalChessDSL.g:5535:2: rule__Threefold__Group__0__Impl rule__Threefold__Group__1
            {
            pushFollow(FOLLOW_62);
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
    // InternalChessDSL.g:5542:1: rule__Threefold__Group__0__Impl : ( 'repeated' ) ;
    public final void rule__Threefold__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5546:1: ( ( 'repeated' ) )
            // InternalChessDSL.g:5547:1: ( 'repeated' )
            {
            // InternalChessDSL.g:5547:1: ( 'repeated' )
            // InternalChessDSL.g:5548:2: 'repeated'
            {
             before(grammarAccess.getThreefoldAccess().getRepeatedKeyword_0()); 
            match(input,84,FOLLOW_2); 
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
    // InternalChessDSL.g:5557:1: rule__Threefold__Group__1 : rule__Threefold__Group__1__Impl rule__Threefold__Group__2 ;
    public final void rule__Threefold__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5561:1: ( rule__Threefold__Group__1__Impl rule__Threefold__Group__2 )
            // InternalChessDSL.g:5562:2: rule__Threefold__Group__1__Impl rule__Threefold__Group__2
            {
            pushFollow(FOLLOW_64);
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
    // InternalChessDSL.g:5569:1: rule__Threefold__Group__1__Impl : ( 'a' ) ;
    public final void rule__Threefold__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5573:1: ( ( 'a' ) )
            // InternalChessDSL.g:5574:1: ( 'a' )
            {
            // InternalChessDSL.g:5574:1: ( 'a' )
            // InternalChessDSL.g:5575:2: 'a'
            {
             before(grammarAccess.getThreefoldAccess().getAKeyword_1()); 
            match(input,82,FOLLOW_2); 
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
    // InternalChessDSL.g:5584:1: rule__Threefold__Group__2 : rule__Threefold__Group__2__Impl rule__Threefold__Group__3 ;
    public final void rule__Threefold__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5588:1: ( rule__Threefold__Group__2__Impl rule__Threefold__Group__3 )
            // InternalChessDSL.g:5589:2: rule__Threefold__Group__2__Impl rule__Threefold__Group__3
            {
            pushFollow(FOLLOW_65);
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
    // InternalChessDSL.g:5596:1: rule__Threefold__Group__2__Impl : ( 'position' ) ;
    public final void rule__Threefold__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5600:1: ( ( 'position' ) )
            // InternalChessDSL.g:5601:1: ( 'position' )
            {
            // InternalChessDSL.g:5601:1: ( 'position' )
            // InternalChessDSL.g:5602:2: 'position'
            {
             before(grammarAccess.getThreefoldAccess().getPositionKeyword_2()); 
            match(input,85,FOLLOW_2); 
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
    // InternalChessDSL.g:5611:1: rule__Threefold__Group__3 : rule__Threefold__Group__3__Impl rule__Threefold__Group__4 ;
    public final void rule__Threefold__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5615:1: ( rule__Threefold__Group__3__Impl rule__Threefold__Group__4 )
            // InternalChessDSL.g:5616:2: rule__Threefold__Group__3__Impl rule__Threefold__Group__4
            {
            pushFollow(FOLLOW_66);
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
    // InternalChessDSL.g:5623:1: rule__Threefold__Group__3__Impl : ( 'three' ) ;
    public final void rule__Threefold__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5627:1: ( ( 'three' ) )
            // InternalChessDSL.g:5628:1: ( 'three' )
            {
            // InternalChessDSL.g:5628:1: ( 'three' )
            // InternalChessDSL.g:5629:2: 'three'
            {
             before(grammarAccess.getThreefoldAccess().getThreeKeyword_3()); 
            match(input,86,FOLLOW_2); 
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
    // InternalChessDSL.g:5638:1: rule__Threefold__Group__4 : rule__Threefold__Group__4__Impl ;
    public final void rule__Threefold__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5642:1: ( rule__Threefold__Group__4__Impl )
            // InternalChessDSL.g:5643:2: rule__Threefold__Group__4__Impl
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
    // InternalChessDSL.g:5649:1: rule__Threefold__Group__4__Impl : ( 'times' ) ;
    public final void rule__Threefold__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5653:1: ( ( 'times' ) )
            // InternalChessDSL.g:5654:1: ( 'times' )
            {
            // InternalChessDSL.g:5654:1: ( 'times' )
            // InternalChessDSL.g:5655:2: 'times'
            {
             before(grammarAccess.getThreefoldAccess().getTimesKeyword_4()); 
            match(input,87,FOLLOW_2); 
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
    // InternalChessDSL.g:5665:1: rule__Fifty__Group__0 : rule__Fifty__Group__0__Impl rule__Fifty__Group__1 ;
    public final void rule__Fifty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5669:1: ( rule__Fifty__Group__0__Impl rule__Fifty__Group__1 )
            // InternalChessDSL.g:5670:2: rule__Fifty__Group__0__Impl rule__Fifty__Group__1
            {
            pushFollow(FOLLOW_67);
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
    // InternalChessDSL.g:5677:1: rule__Fifty__Group__0__Impl : ( 'played' ) ;
    public final void rule__Fifty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5681:1: ( ( 'played' ) )
            // InternalChessDSL.g:5682:1: ( 'played' )
            {
            // InternalChessDSL.g:5682:1: ( 'played' )
            // InternalChessDSL.g:5683:2: 'played'
            {
             before(grammarAccess.getFiftyAccess().getPlayedKeyword_0()); 
            match(input,88,FOLLOW_2); 
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
    // InternalChessDSL.g:5692:1: rule__Fifty__Group__1 : rule__Fifty__Group__1__Impl rule__Fifty__Group__2 ;
    public final void rule__Fifty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5696:1: ( rule__Fifty__Group__1__Impl rule__Fifty__Group__2 )
            // InternalChessDSL.g:5697:2: rule__Fifty__Group__1__Impl rule__Fifty__Group__2
            {
            pushFollow(FOLLOW_68);
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
    // InternalChessDSL.g:5704:1: rule__Fifty__Group__1__Impl : ( 'fifty' ) ;
    public final void rule__Fifty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5708:1: ( ( 'fifty' ) )
            // InternalChessDSL.g:5709:1: ( 'fifty' )
            {
            // InternalChessDSL.g:5709:1: ( 'fifty' )
            // InternalChessDSL.g:5710:2: 'fifty'
            {
             before(grammarAccess.getFiftyAccess().getFiftyKeyword_1()); 
            match(input,89,FOLLOW_2); 
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
    // InternalChessDSL.g:5719:1: rule__Fifty__Group__2 : rule__Fifty__Group__2__Impl rule__Fifty__Group__3 ;
    public final void rule__Fifty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5723:1: ( rule__Fifty__Group__2__Impl rule__Fifty__Group__3 )
            // InternalChessDSL.g:5724:2: rule__Fifty__Group__2__Impl rule__Fifty__Group__3
            {
            pushFollow(FOLLOW_69);
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
    // InternalChessDSL.g:5731:1: rule__Fifty__Group__2__Impl : ( 'moves' ) ;
    public final void rule__Fifty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5735:1: ( ( 'moves' ) )
            // InternalChessDSL.g:5736:1: ( 'moves' )
            {
            // InternalChessDSL.g:5736:1: ( 'moves' )
            // InternalChessDSL.g:5737:2: 'moves'
            {
             before(grammarAccess.getFiftyAccess().getMovesKeyword_2()); 
            match(input,59,FOLLOW_2); 
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
    // InternalChessDSL.g:5746:1: rule__Fifty__Group__3 : rule__Fifty__Group__3__Impl rule__Fifty__Group__4 ;
    public final void rule__Fifty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5750:1: ( rule__Fifty__Group__3__Impl rule__Fifty__Group__4 )
            // InternalChessDSL.g:5751:2: rule__Fifty__Group__3__Impl rule__Fifty__Group__4
            {
            pushFollow(FOLLOW_62);
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
    // InternalChessDSL.g:5758:1: rule__Fifty__Group__3__Impl : ( 'without' ) ;
    public final void rule__Fifty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5762:1: ( ( 'without' ) )
            // InternalChessDSL.g:5763:1: ( 'without' )
            {
            // InternalChessDSL.g:5763:1: ( 'without' )
            // InternalChessDSL.g:5764:2: 'without'
            {
             before(grammarAccess.getFiftyAccess().getWithoutKeyword_3()); 
            match(input,90,FOLLOW_2); 
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
    // InternalChessDSL.g:5773:1: rule__Fifty__Group__4 : rule__Fifty__Group__4__Impl rule__Fifty__Group__5 ;
    public final void rule__Fifty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5777:1: ( rule__Fifty__Group__4__Impl rule__Fifty__Group__5 )
            // InternalChessDSL.g:5778:2: rule__Fifty__Group__4__Impl rule__Fifty__Group__5
            {
            pushFollow(FOLLOW_70);
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
    // InternalChessDSL.g:5785:1: rule__Fifty__Group__4__Impl : ( 'a' ) ;
    public final void rule__Fifty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5789:1: ( ( 'a' ) )
            // InternalChessDSL.g:5790:1: ( 'a' )
            {
            // InternalChessDSL.g:5790:1: ( 'a' )
            // InternalChessDSL.g:5791:2: 'a'
            {
             before(grammarAccess.getFiftyAccess().getAKeyword_4()); 
            match(input,82,FOLLOW_2); 
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
    // InternalChessDSL.g:5800:1: rule__Fifty__Group__5 : rule__Fifty__Group__5__Impl ;
    public final void rule__Fifty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5804:1: ( rule__Fifty__Group__5__Impl )
            // InternalChessDSL.g:5805:2: rule__Fifty__Group__5__Impl
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
    // InternalChessDSL.g:5811:1: rule__Fifty__Group__5__Impl : ( 'capture' ) ;
    public final void rule__Fifty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5815:1: ( ( 'capture' ) )
            // InternalChessDSL.g:5816:1: ( 'capture' )
            {
            // InternalChessDSL.g:5816:1: ( 'capture' )
            // InternalChessDSL.g:5817:2: 'capture'
            {
             before(grammarAccess.getFiftyAccess().getCaptureKeyword_5()); 
            match(input,91,FOLLOW_2); 
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
    // InternalChessDSL.g:5827:1: rule__Agree__Group__0 : rule__Agree__Group__0__Impl rule__Agree__Group__1 ;
    public final void rule__Agree__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5831:1: ( rule__Agree__Group__0__Impl rule__Agree__Group__1 )
            // InternalChessDSL.g:5832:2: rule__Agree__Group__0__Impl rule__Agree__Group__1
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
    // InternalChessDSL.g:5839:1: rule__Agree__Group__0__Impl : ( 'agreed' ) ;
    public final void rule__Agree__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5843:1: ( ( 'agreed' ) )
            // InternalChessDSL.g:5844:1: ( 'agreed' )
            {
            // InternalChessDSL.g:5844:1: ( 'agreed' )
            // InternalChessDSL.g:5845:2: 'agreed'
            {
             before(grammarAccess.getAgreeAccess().getAgreedKeyword_0()); 
            match(input,92,FOLLOW_2); 
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
    // InternalChessDSL.g:5854:1: rule__Agree__Group__1 : rule__Agree__Group__1__Impl rule__Agree__Group__2 ;
    public final void rule__Agree__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5858:1: ( rule__Agree__Group__1__Impl rule__Agree__Group__2 )
            // InternalChessDSL.g:5859:2: rule__Agree__Group__1__Impl rule__Agree__Group__2
            {
            pushFollow(FOLLOW_62);
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
    // InternalChessDSL.g:5866:1: rule__Agree__Group__1__Impl : ( 'to' ) ;
    public final void rule__Agree__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5870:1: ( ( 'to' ) )
            // InternalChessDSL.g:5871:1: ( 'to' )
            {
            // InternalChessDSL.g:5871:1: ( 'to' )
            // InternalChessDSL.g:5872:2: 'to'
            {
             before(grammarAccess.getAgreeAccess().getToKeyword_1()); 
            match(input,62,FOLLOW_2); 
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
    // InternalChessDSL.g:5881:1: rule__Agree__Group__2 : rule__Agree__Group__2__Impl rule__Agree__Group__3 ;
    public final void rule__Agree__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5885:1: ( rule__Agree__Group__2__Impl rule__Agree__Group__3 )
            // InternalChessDSL.g:5886:2: rule__Agree__Group__2__Impl rule__Agree__Group__3
            {
            pushFollow(FOLLOW_71);
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
    // InternalChessDSL.g:5893:1: rule__Agree__Group__2__Impl : ( 'a' ) ;
    public final void rule__Agree__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5897:1: ( ( 'a' ) )
            // InternalChessDSL.g:5898:1: ( 'a' )
            {
            // InternalChessDSL.g:5898:1: ( 'a' )
            // InternalChessDSL.g:5899:2: 'a'
            {
             before(grammarAccess.getAgreeAccess().getAKeyword_2()); 
            match(input,82,FOLLOW_2); 
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
    // InternalChessDSL.g:5908:1: rule__Agree__Group__3 : rule__Agree__Group__3__Impl ;
    public final void rule__Agree__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5912:1: ( rule__Agree__Group__3__Impl )
            // InternalChessDSL.g:5913:2: rule__Agree__Group__3__Impl
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
    // InternalChessDSL.g:5919:1: rule__Agree__Group__3__Impl : ( 'draw' ) ;
    public final void rule__Agree__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5923:1: ( ( 'draw' ) )
            // InternalChessDSL.g:5924:1: ( 'draw' )
            {
            // InternalChessDSL.g:5924:1: ( 'draw' )
            // InternalChessDSL.g:5925:2: 'draw'
            {
             before(grammarAccess.getAgreeAccess().getDrawKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalChessDSL.g:5935:1: rule__Result__Group_0__0 : rule__Result__Group_0__0__Impl rule__Result__Group_0__1 ;
    public final void rule__Result__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5939:1: ( rule__Result__Group_0__0__Impl rule__Result__Group_0__1 )
            // InternalChessDSL.g:5940:2: rule__Result__Group_0__0__Impl rule__Result__Group_0__1
            {
            pushFollow(FOLLOW_72);
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
    // InternalChessDSL.g:5947:1: rule__Result__Group_0__0__Impl : ( ( rule__Result__Alternatives_0_0 ) ) ;
    public final void rule__Result__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5951:1: ( ( ( rule__Result__Alternatives_0_0 ) ) )
            // InternalChessDSL.g:5952:1: ( ( rule__Result__Alternatives_0_0 ) )
            {
            // InternalChessDSL.g:5952:1: ( ( rule__Result__Alternatives_0_0 ) )
            // InternalChessDSL.g:5953:2: ( rule__Result__Alternatives_0_0 )
            {
             before(grammarAccess.getResultAccess().getAlternatives_0_0()); 
            // InternalChessDSL.g:5954:2: ( rule__Result__Alternatives_0_0 )
            // InternalChessDSL.g:5954:3: rule__Result__Alternatives_0_0
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
    // InternalChessDSL.g:5962:1: rule__Result__Group_0__1 : rule__Result__Group_0__1__Impl ;
    public final void rule__Result__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5966:1: ( rule__Result__Group_0__1__Impl )
            // InternalChessDSL.g:5967:2: rule__Result__Group_0__1__Impl
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
    // InternalChessDSL.g:5973:1: rule__Result__Group_0__1__Impl : ( 'wins' ) ;
    public final void rule__Result__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5977:1: ( ( 'wins' ) )
            // InternalChessDSL.g:5978:1: ( 'wins' )
            {
            // InternalChessDSL.g:5978:1: ( 'wins' )
            // InternalChessDSL.g:5979:2: 'wins'
            {
             before(grammarAccess.getResultAccess().getWinsKeyword_0_1()); 
            match(input,93,FOLLOW_2); 
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
    // InternalChessDSL.g:5989:1: rule__Model__GameAssignment : ( ruleGame ) ;
    public final void rule__Model__GameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:5993:1: ( ( ruleGame ) )
            // InternalChessDSL.g:5994:2: ( ruleGame )
            {
            // InternalChessDSL.g:5994:2: ( ruleGame )
            // InternalChessDSL.g:5995:3: ruleGame
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
    // InternalChessDSL.g:6004:1: rule__Game__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Game__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6008:1: ( ( RULE_STRING ) )
            // InternalChessDSL.g:6009:2: ( RULE_STRING )
            {
            // InternalChessDSL.g:6009:2: ( RULE_STRING )
            // InternalChessDSL.g:6010:3: RULE_STRING
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
    // InternalChessDSL.g:6019:1: rule__Game__PlayersAssignment_2_1 : ( rulePlayer ) ;
    public final void rule__Game__PlayersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6023:1: ( ( rulePlayer ) )
            // InternalChessDSL.g:6024:2: ( rulePlayer )
            {
            // InternalChessDSL.g:6024:2: ( rulePlayer )
            // InternalChessDSL.g:6025:3: rulePlayer
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
    // InternalChessDSL.g:6034:1: rule__Game__InitialAssignment_3 : ( ruleInitialState ) ;
    public final void rule__Game__InitialAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6038:1: ( ( ruleInitialState ) )
            // InternalChessDSL.g:6039:2: ( ruleInitialState )
            {
            // InternalChessDSL.g:6039:2: ( ruleInitialState )
            // InternalChessDSL.g:6040:3: ruleInitialState
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
    // InternalChessDSL.g:6049:1: rule__Game__MovesAssignment_5 : ( ruleMovePair ) ;
    public final void rule__Game__MovesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6053:1: ( ( ruleMovePair ) )
            // InternalChessDSL.g:6054:2: ( ruleMovePair )
            {
            // InternalChessDSL.g:6054:2: ( ruleMovePair )
            // InternalChessDSL.g:6055:3: ruleMovePair
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
    // InternalChessDSL.g:6064:1: rule__Game__ConclusionAssignment_7 : ( ruleConclusion ) ;
    public final void rule__Game__ConclusionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6068:1: ( ( ruleConclusion ) )
            // InternalChessDSL.g:6069:2: ( ruleConclusion )
            {
            // InternalChessDSL.g:6069:2: ( ruleConclusion )
            // InternalChessDSL.g:6070:3: ruleConclusion
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
    // InternalChessDSL.g:6079:1: rule__Player__ColorAssignment_0 : ( ruleColor ) ;
    public final void rule__Player__ColorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6083:1: ( ( ruleColor ) )
            // InternalChessDSL.g:6084:2: ( ruleColor )
            {
            // InternalChessDSL.g:6084:2: ( ruleColor )
            // InternalChessDSL.g:6085:3: ruleColor
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
    // InternalChessDSL.g:6094:1: rule__Player__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Player__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6098:1: ( ( RULE_STRING ) )
            // InternalChessDSL.g:6099:2: ( RULE_STRING )
            {
            // InternalChessDSL.g:6099:2: ( RULE_STRING )
            // InternalChessDSL.g:6100:3: RULE_STRING
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
    // InternalChessDSL.g:6109:1: rule__InitialState__PositionsAssignment_2_1_1 : ( ruleCustomPositions ) ;
    public final void rule__InitialState__PositionsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6113:1: ( ( ruleCustomPositions ) )
            // InternalChessDSL.g:6114:2: ( ruleCustomPositions )
            {
            // InternalChessDSL.g:6114:2: ( ruleCustomPositions )
            // InternalChessDSL.g:6115:3: ruleCustomPositions
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
    // InternalChessDSL.g:6124:1: rule__CustomPositions__PlacementAssignment_3 : ( rulePlacement ) ;
    public final void rule__CustomPositions__PlacementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6128:1: ( ( rulePlacement ) )
            // InternalChessDSL.g:6129:2: ( rulePlacement )
            {
            // InternalChessDSL.g:6129:2: ( rulePlacement )
            // InternalChessDSL.g:6130:3: rulePlacement
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
    // InternalChessDSL.g:6139:1: rule__Placement__PieceAssignment_0 : ( ruleCustomPiece ) ;
    public final void rule__Placement__PieceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6143:1: ( ( ruleCustomPiece ) )
            // InternalChessDSL.g:6144:2: ( ruleCustomPiece )
            {
            // InternalChessDSL.g:6144:2: ( ruleCustomPiece )
            // InternalChessDSL.g:6145:3: ruleCustomPiece
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
    // InternalChessDSL.g:6154:1: rule__Placement__SquareAssignment_2 : ( ruleSquare ) ;
    public final void rule__Placement__SquareAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6158:1: ( ( ruleSquare ) )
            // InternalChessDSL.g:6159:2: ( ruleSquare )
            {
            // InternalChessDSL.g:6159:2: ( ruleSquare )
            // InternalChessDSL.g:6160:3: ruleSquare
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
    // InternalChessDSL.g:6169:1: rule__CustomPiece__ColorAssignment_0 : ( ruleColor ) ;
    public final void rule__CustomPiece__ColorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6173:1: ( ( ruleColor ) )
            // InternalChessDSL.g:6174:2: ( ruleColor )
            {
            // InternalChessDSL.g:6174:2: ( ruleColor )
            // InternalChessDSL.g:6175:3: ruleColor
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
    // InternalChessDSL.g:6184:1: rule__CustomPiece__KindAssignment_1 : ( rulePiece ) ;
    public final void rule__CustomPiece__KindAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6188:1: ( ( rulePiece ) )
            // InternalChessDSL.g:6189:2: ( rulePiece )
            {
            // InternalChessDSL.g:6189:2: ( rulePiece )
            // InternalChessDSL.g:6190:3: rulePiece
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
    // InternalChessDSL.g:6199:1: rule__MovePair__MoveNumberAssignment_0 : ( RULE_MOVENUMBER ) ;
    public final void rule__MovePair__MoveNumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6203:1: ( ( RULE_MOVENUMBER ) )
            // InternalChessDSL.g:6204:2: ( RULE_MOVENUMBER )
            {
            // InternalChessDSL.g:6204:2: ( RULE_MOVENUMBER )
            // InternalChessDSL.g:6205:3: RULE_MOVENUMBER
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
    // InternalChessDSL.g:6214:1: rule__MovePair__Color1Assignment_1_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__MovePair__Color1Assignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6218:1: ( ( ( RULE_ID ) ) )
            // InternalChessDSL.g:6219:2: ( ( RULE_ID ) )
            {
            // InternalChessDSL.g:6219:2: ( ( RULE_ID ) )
            // InternalChessDSL.g:6220:3: ( RULE_ID )
            {
             before(grammarAccess.getMovePairAccess().getColor1PlayerOrColorCrossReference_1_0_0_0()); 
            // InternalChessDSL.g:6221:3: ( RULE_ID )
            // InternalChessDSL.g:6222:4: RULE_ID
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
    // InternalChessDSL.g:6233:1: rule__MovePair__WhiteMoveAssignment_1_0_1 : ( ruleAnyMove ) ;
    public final void rule__MovePair__WhiteMoveAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6237:1: ( ( ruleAnyMove ) )
            // InternalChessDSL.g:6238:2: ( ruleAnyMove )
            {
            // InternalChessDSL.g:6238:2: ( ruleAnyMove )
            // InternalChessDSL.g:6239:3: ruleAnyMove
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
    // InternalChessDSL.g:6248:1: rule__MovePair__Color2Assignment_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__MovePair__Color2Assignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6252:1: ( ( ( RULE_ID ) ) )
            // InternalChessDSL.g:6253:2: ( ( RULE_ID ) )
            {
            // InternalChessDSL.g:6253:2: ( ( RULE_ID ) )
            // InternalChessDSL.g:6254:3: ( RULE_ID )
            {
             before(grammarAccess.getMovePairAccess().getColor2PlayerOrColorCrossReference_2_0_0()); 
            // InternalChessDSL.g:6255:3: ( RULE_ID )
            // InternalChessDSL.g:6256:4: RULE_ID
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
    // InternalChessDSL.g:6267:1: rule__MovePair__BlackMoveAssignment_2_1 : ( ruleAnyMove ) ;
    public final void rule__MovePair__BlackMoveAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6271:1: ( ( ruleAnyMove ) )
            // InternalChessDSL.g:6272:2: ( ruleAnyMove )
            {
            // InternalChessDSL.g:6272:2: ( ruleAnyMove )
            // InternalChessDSL.g:6273:3: ruleAnyMove
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


    // $ANTLR start "rule__AnyMove__MoveAssignment_0_0"
    // InternalChessDSL.g:6282:1: rule__AnyMove__MoveAssignment_0_0 : ( ruleDSLMove ) ;
    public final void rule__AnyMove__MoveAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6286:1: ( ( ruleDSLMove ) )
            // InternalChessDSL.g:6287:2: ( ruleDSLMove )
            {
            // InternalChessDSL.g:6287:2: ( ruleDSLMove )
            // InternalChessDSL.g:6288:3: ruleDSLMove
            {
             before(grammarAccess.getAnyMoveAccess().getMoveDSLMoveParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDSLMove();

            state._fsp--;

             after(grammarAccess.getAnyMoveAccess().getMoveDSLMoveParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyMove__MoveAssignment_0_0"


    // $ANTLR start "rule__AnyMove__RemarksAssignment_0_1_1"
    // InternalChessDSL.g:6297:1: rule__AnyMove__RemarksAssignment_0_1_1 : ( ruleRemark ) ;
    public final void rule__AnyMove__RemarksAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6301:1: ( ( ruleRemark ) )
            // InternalChessDSL.g:6302:2: ( ruleRemark )
            {
            // InternalChessDSL.g:6302:2: ( ruleRemark )
            // InternalChessDSL.g:6303:3: ruleRemark
            {
             before(grammarAccess.getAnyMoveAccess().getRemarksRemarkEnumRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRemark();

            state._fsp--;

             after(grammarAccess.getAnyMoveAccess().getRemarksRemarkEnumRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyMove__RemarksAssignment_0_1_1"


    // $ANTLR start "rule__AnyMove__AlgebraicmoveAssignment_1"
    // InternalChessDSL.g:6312:1: rule__AnyMove__AlgebraicmoveAssignment_1 : ( ruleSANMove ) ;
    public final void rule__AnyMove__AlgebraicmoveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6316:1: ( ( ruleSANMove ) )
            // InternalChessDSL.g:6317:2: ( ruleSANMove )
            {
            // InternalChessDSL.g:6317:2: ( ruleSANMove )
            // InternalChessDSL.g:6318:3: ruleSANMove
            {
             before(grammarAccess.getAnyMoveAccess().getAlgebraicmoveSANMoveParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSANMove();

            state._fsp--;

             after(grammarAccess.getAnyMoveAccess().getAlgebraicmoveSANMoveParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyMove__AlgebraicmoveAssignment_1"


    // $ANTLR start "rule__Move__PieceAssignment_1"
    // InternalChessDSL.g:6327:1: rule__Move__PieceAssignment_1 : ( rulePiece ) ;
    public final void rule__Move__PieceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6331:1: ( ( rulePiece ) )
            // InternalChessDSL.g:6332:2: ( rulePiece )
            {
            // InternalChessDSL.g:6332:2: ( rulePiece )
            // InternalChessDSL.g:6333:3: rulePiece
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
    // InternalChessDSL.g:6342:1: rule__Move__FromAssignment_2_0_1 : ( ruleSquare ) ;
    public final void rule__Move__FromAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6346:1: ( ( ruleSquare ) )
            // InternalChessDSL.g:6347:2: ( ruleSquare )
            {
            // InternalChessDSL.g:6347:2: ( ruleSquare )
            // InternalChessDSL.g:6348:3: ruleSquare
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
    // InternalChessDSL.g:6357:1: rule__Move__ToAssignment_2_0_3 : ( ruleSquare ) ;
    public final void rule__Move__ToAssignment_2_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6361:1: ( ( ruleSquare ) )
            // InternalChessDSL.g:6362:2: ( ruleSquare )
            {
            // InternalChessDSL.g:6362:2: ( ruleSquare )
            // InternalChessDSL.g:6363:3: ruleSquare
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
    // InternalChessDSL.g:6372:1: rule__Move__FromAssignment_2_1_1 : ( ruleSquare ) ;
    public final void rule__Move__FromAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6376:1: ( ( ruleSquare ) )
            // InternalChessDSL.g:6377:2: ( ruleSquare )
            {
            // InternalChessDSL.g:6377:2: ( ruleSquare )
            // InternalChessDSL.g:6378:3: ruleSquare
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
    // InternalChessDSL.g:6387:1: rule__Move__ToAssignment_2_1_3 : ( ruleSquare ) ;
    public final void rule__Move__ToAssignment_2_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6391:1: ( ( ruleSquare ) )
            // InternalChessDSL.g:6392:2: ( ruleSquare )
            {
            // InternalChessDSL.g:6392:2: ( ruleSquare )
            // InternalChessDSL.g:6393:3: ruleSquare
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
    // InternalChessDSL.g:6402:1: rule__Capture__MoveAssignment_0 : ( ruleMove ) ;
    public final void rule__Capture__MoveAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6406:1: ( ( ruleMove ) )
            // InternalChessDSL.g:6407:2: ( ruleMove )
            {
            // InternalChessDSL.g:6407:2: ( ruleMove )
            // InternalChessDSL.g:6408:3: ruleMove
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
    // InternalChessDSL.g:6417:1: rule__Capture__CaptureAssignment_1_0_1 : ( rulePiece ) ;
    public final void rule__Capture__CaptureAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6421:1: ( ( rulePiece ) )
            // InternalChessDSL.g:6422:2: ( rulePiece )
            {
            // InternalChessDSL.g:6422:2: ( rulePiece )
            // InternalChessDSL.g:6423:3: rulePiece
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
    // InternalChessDSL.g:6432:1: rule__Capture__CaptureAssignment_1_1_2 : ( rulePiece ) ;
    public final void rule__Capture__CaptureAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6436:1: ( ( rulePiece ) )
            // InternalChessDSL.g:6437:2: ( rulePiece )
            {
            // InternalChessDSL.g:6437:2: ( rulePiece )
            // InternalChessDSL.g:6438:3: rulePiece
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
    // InternalChessDSL.g:6447:1: rule__Castle__SideAssignment_0_1 : ( ( rule__Castle__SideAlternatives_0_1_0 ) ) ;
    public final void rule__Castle__SideAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6451:1: ( ( ( rule__Castle__SideAlternatives_0_1_0 ) ) )
            // InternalChessDSL.g:6452:2: ( ( rule__Castle__SideAlternatives_0_1_0 ) )
            {
            // InternalChessDSL.g:6452:2: ( ( rule__Castle__SideAlternatives_0_1_0 ) )
            // InternalChessDSL.g:6453:3: ( rule__Castle__SideAlternatives_0_1_0 )
            {
             before(grammarAccess.getCastleAccess().getSideAlternatives_0_1_0()); 
            // InternalChessDSL.g:6454:3: ( rule__Castle__SideAlternatives_0_1_0 )
            // InternalChessDSL.g:6454:4: rule__Castle__SideAlternatives_0_1_0
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
    // InternalChessDSL.g:6462:1: rule__Castle__SideAssignment_1_2 : ( ( rule__Castle__SideAlternatives_1_2_0 ) ) ;
    public final void rule__Castle__SideAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6466:1: ( ( ( rule__Castle__SideAlternatives_1_2_0 ) ) )
            // InternalChessDSL.g:6467:2: ( ( rule__Castle__SideAlternatives_1_2_0 ) )
            {
            // InternalChessDSL.g:6467:2: ( ( rule__Castle__SideAlternatives_1_2_0 ) )
            // InternalChessDSL.g:6468:3: ( rule__Castle__SideAlternatives_1_2_0 )
            {
             before(grammarAccess.getCastleAccess().getSideAlternatives_1_2_0()); 
            // InternalChessDSL.g:6469:3: ( rule__Castle__SideAlternatives_1_2_0 )
            // InternalChessDSL.g:6469:4: rule__Castle__SideAlternatives_1_2_0
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
    // InternalChessDSL.g:6477:1: rule__Castle__MoveAssignment_2_0 : ( ruleMove ) ;
    public final void rule__Castle__MoveAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6481:1: ( ( ruleMove ) )
            // InternalChessDSL.g:6482:2: ( ruleMove )
            {
            // InternalChessDSL.g:6482:2: ( ruleMove )
            // InternalChessDSL.g:6483:3: ruleMove
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
    // InternalChessDSL.g:6492:1: rule__Castle__SideAssignment_2_2 : ( ( rule__Castle__SideAlternatives_2_2_0 ) ) ;
    public final void rule__Castle__SideAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6496:1: ( ( ( rule__Castle__SideAlternatives_2_2_0 ) ) )
            // InternalChessDSL.g:6497:2: ( ( rule__Castle__SideAlternatives_2_2_0 ) )
            {
            // InternalChessDSL.g:6497:2: ( ( rule__Castle__SideAlternatives_2_2_0 ) )
            // InternalChessDSL.g:6498:3: ( rule__Castle__SideAlternatives_2_2_0 )
            {
             before(grammarAccess.getCastleAccess().getSideAlternatives_2_2_0()); 
            // InternalChessDSL.g:6499:3: ( rule__Castle__SideAlternatives_2_2_0 )
            // InternalChessDSL.g:6499:4: rule__Castle__SideAlternatives_2_2_0
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
    // InternalChessDSL.g:6507:1: rule__Castle__MoveAssignment_3_0 : ( ruleMove ) ;
    public final void rule__Castle__MoveAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6511:1: ( ( ruleMove ) )
            // InternalChessDSL.g:6512:2: ( ruleMove )
            {
            // InternalChessDSL.g:6512:2: ( ruleMove )
            // InternalChessDSL.g:6513:3: ruleMove
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
    // InternalChessDSL.g:6522:1: rule__Castle__SideAssignment_3_3 : ( ( rule__Castle__SideAlternatives_3_3_0 ) ) ;
    public final void rule__Castle__SideAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6526:1: ( ( ( rule__Castle__SideAlternatives_3_3_0 ) ) )
            // InternalChessDSL.g:6527:2: ( ( rule__Castle__SideAlternatives_3_3_0 ) )
            {
            // InternalChessDSL.g:6527:2: ( ( rule__Castle__SideAlternatives_3_3_0 ) )
            // InternalChessDSL.g:6528:3: ( rule__Castle__SideAlternatives_3_3_0 )
            {
             before(grammarAccess.getCastleAccess().getSideAlternatives_3_3_0()); 
            // InternalChessDSL.g:6529:3: ( rule__Castle__SideAlternatives_3_3_0 )
            // InternalChessDSL.g:6529:4: rule__Castle__SideAlternatives_3_3_0
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
    // InternalChessDSL.g:6537:1: rule__EnPassant__CaptureAssignment_0 : ( ruleCapture ) ;
    public final void rule__EnPassant__CaptureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6541:1: ( ( ruleCapture ) )
            // InternalChessDSL.g:6542:2: ( ruleCapture )
            {
            // InternalChessDSL.g:6542:2: ( ruleCapture )
            // InternalChessDSL.g:6543:3: ruleCapture
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
    // InternalChessDSL.g:6552:1: rule__EnPassant__SquareAssignment_2 : ( ruleSquare ) ;
    public final void rule__EnPassant__SquareAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6556:1: ( ( ruleSquare ) )
            // InternalChessDSL.g:6557:2: ( ruleSquare )
            {
            // InternalChessDSL.g:6557:2: ( ruleSquare )
            // InternalChessDSL.g:6558:3: ruleSquare
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
    // InternalChessDSL.g:6567:1: rule__Promotion__MoveAssignment_0 : ( ( rule__Promotion__MoveAlternatives_0_0 ) ) ;
    public final void rule__Promotion__MoveAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6571:1: ( ( ( rule__Promotion__MoveAlternatives_0_0 ) ) )
            // InternalChessDSL.g:6572:2: ( ( rule__Promotion__MoveAlternatives_0_0 ) )
            {
            // InternalChessDSL.g:6572:2: ( ( rule__Promotion__MoveAlternatives_0_0 ) )
            // InternalChessDSL.g:6573:3: ( rule__Promotion__MoveAlternatives_0_0 )
            {
             before(grammarAccess.getPromotionAccess().getMoveAlternatives_0_0()); 
            // InternalChessDSL.g:6574:3: ( rule__Promotion__MoveAlternatives_0_0 )
            // InternalChessDSL.g:6574:4: rule__Promotion__MoveAlternatives_0_0
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
    // InternalChessDSL.g:6582:1: rule__Promotion__PieceAssignment_2 : ( rulePiece ) ;
    public final void rule__Promotion__PieceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6586:1: ( ( rulePiece ) )
            // InternalChessDSL.g:6587:2: ( rulePiece )
            {
            // InternalChessDSL.g:6587:2: ( rulePiece )
            // InternalChessDSL.g:6588:3: rulePiece
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


    // $ANTLR start "rule__SANMove__CastleAssignment_1_0"
    // InternalChessDSL.g:6597:1: rule__SANMove__CastleAssignment_1_0 : ( ruleSANCastle ) ;
    public final void rule__SANMove__CastleAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6601:1: ( ( ruleSANCastle ) )
            // InternalChessDSL.g:6602:2: ( ruleSANCastle )
            {
            // InternalChessDSL.g:6602:2: ( ruleSANCastle )
            // InternalChessDSL.g:6603:3: ruleSANCastle
            {
             before(grammarAccess.getSANMoveAccess().getCastleSANCastleParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSANCastle();

            state._fsp--;

             after(grammarAccess.getSANMoveAccess().getCastleSANCastleParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANMove__CastleAssignment_1_0"


    // $ANTLR start "rule__SANMove__NormalAssignment_1_1"
    // InternalChessDSL.g:6612:1: rule__SANMove__NormalAssignment_1_1 : ( ruleSANNormal ) ;
    public final void rule__SANMove__NormalAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6616:1: ( ( ruleSANNormal ) )
            // InternalChessDSL.g:6617:2: ( ruleSANNormal )
            {
            // InternalChessDSL.g:6617:2: ( ruleSANNormal )
            // InternalChessDSL.g:6618:3: ruleSANNormal
            {
             before(grammarAccess.getSANMoveAccess().getNormalSANNormalParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSANNormal();

            state._fsp--;

             after(grammarAccess.getSANMoveAccess().getNormalSANNormalParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANMove__NormalAssignment_1_1"


    // $ANTLR start "rule__SANCastle__SideAssignment_0_1_1"
    // InternalChessDSL.g:6627:1: rule__SANCastle__SideAssignment_0_1_1 : ( ( 'Queenside' ) ) ;
    public final void rule__SANCastle__SideAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6631:1: ( ( ( 'Queenside' ) ) )
            // InternalChessDSL.g:6632:2: ( ( 'Queenside' ) )
            {
            // InternalChessDSL.g:6632:2: ( ( 'Queenside' ) )
            // InternalChessDSL.g:6633:3: ( 'Queenside' )
            {
             before(grammarAccess.getSANCastleAccess().getSideQueensideKeyword_0_1_1_0()); 
            // InternalChessDSL.g:6634:3: ( 'Queenside' )
            // InternalChessDSL.g:6635:4: 'Queenside'
            {
             before(grammarAccess.getSANCastleAccess().getSideQueensideKeyword_0_1_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSANCastleAccess().getSideQueensideKeyword_0_1_1_0()); 

            }

             after(grammarAccess.getSANCastleAccess().getSideQueensideKeyword_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANCastle__SideAssignment_0_1_1"


    // $ANTLR start "rule__SANCastle__SideAssignment_1_1"
    // InternalChessDSL.g:6646:1: rule__SANCastle__SideAssignment_1_1 : ( ( 'Kingside' ) ) ;
    public final void rule__SANCastle__SideAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6650:1: ( ( ( 'Kingside' ) ) )
            // InternalChessDSL.g:6651:2: ( ( 'Kingside' ) )
            {
            // InternalChessDSL.g:6651:2: ( ( 'Kingside' ) )
            // InternalChessDSL.g:6652:3: ( 'Kingside' )
            {
             before(grammarAccess.getSANCastleAccess().getSideKingsideKeyword_1_1_0()); 
            // InternalChessDSL.g:6653:3: ( 'Kingside' )
            // InternalChessDSL.g:6654:4: 'Kingside'
            {
             before(grammarAccess.getSANCastleAccess().getSideKingsideKeyword_1_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSANCastleAccess().getSideKingsideKeyword_1_1_0()); 

            }

             after(grammarAccess.getSANCastleAccess().getSideKingsideKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANCastle__SideAssignment_1_1"


    // $ANTLR start "rule__SANNormal__PieceAssignment_1"
    // InternalChessDSL.g:6665:1: rule__SANNormal__PieceAssignment_1 : ( ruleSANPiece ) ;
    public final void rule__SANNormal__PieceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6669:1: ( ( ruleSANPiece ) )
            // InternalChessDSL.g:6670:2: ( ruleSANPiece )
            {
            // InternalChessDSL.g:6670:2: ( ruleSANPiece )
            // InternalChessDSL.g:6671:3: ruleSANPiece
            {
             before(grammarAccess.getSANNormalAccess().getPieceSANPieceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSANPiece();

            state._fsp--;

             after(grammarAccess.getSANNormalAccess().getPieceSANPieceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANNormal__PieceAssignment_1"


    // $ANTLR start "rule__SANNormal__DisambAssignment_2"
    // InternalChessDSL.g:6680:1: rule__SANNormal__DisambAssignment_2 : ( ruleSANDisambiguation ) ;
    public final void rule__SANNormal__DisambAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6684:1: ( ( ruleSANDisambiguation ) )
            // InternalChessDSL.g:6685:2: ( ruleSANDisambiguation )
            {
            // InternalChessDSL.g:6685:2: ( ruleSANDisambiguation )
            // InternalChessDSL.g:6686:3: ruleSANDisambiguation
            {
             before(grammarAccess.getSANNormalAccess().getDisambSANDisambiguationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSANDisambiguation();

            state._fsp--;

             after(grammarAccess.getSANNormalAccess().getDisambSANDisambiguationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANNormal__DisambAssignment_2"


    // $ANTLR start "rule__SANNormal__CaptureAssignment_3"
    // InternalChessDSL.g:6695:1: rule__SANNormal__CaptureAssignment_3 : ( ruleSANCapture ) ;
    public final void rule__SANNormal__CaptureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6699:1: ( ( ruleSANCapture ) )
            // InternalChessDSL.g:6700:2: ( ruleSANCapture )
            {
            // InternalChessDSL.g:6700:2: ( ruleSANCapture )
            // InternalChessDSL.g:6701:3: ruleSANCapture
            {
             before(grammarAccess.getSANNormalAccess().getCaptureSANCaptureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSANCapture();

            state._fsp--;

             after(grammarAccess.getSANNormalAccess().getCaptureSANCaptureParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANNormal__CaptureAssignment_3"


    // $ANTLR start "rule__SANNormal__TargetAssignment_4"
    // InternalChessDSL.g:6710:1: rule__SANNormal__TargetAssignment_4 : ( ruleSquare ) ;
    public final void rule__SANNormal__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6714:1: ( ( ruleSquare ) )
            // InternalChessDSL.g:6715:2: ( ruleSquare )
            {
            // InternalChessDSL.g:6715:2: ( ruleSquare )
            // InternalChessDSL.g:6716:3: ruleSquare
            {
             before(grammarAccess.getSANNormalAccess().getTargetSquareParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSquare();

            state._fsp--;

             after(grammarAccess.getSANNormalAccess().getTargetSquareParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANNormal__TargetAssignment_4"


    // $ANTLR start "rule__SANNormal__PromotionAssignment_5"
    // InternalChessDSL.g:6725:1: rule__SANNormal__PromotionAssignment_5 : ( ruleSANPromotion ) ;
    public final void rule__SANNormal__PromotionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6729:1: ( ( ruleSANPromotion ) )
            // InternalChessDSL.g:6730:2: ( ruleSANPromotion )
            {
            // InternalChessDSL.g:6730:2: ( ruleSANPromotion )
            // InternalChessDSL.g:6731:3: ruleSANPromotion
            {
             before(grammarAccess.getSANNormalAccess().getPromotionSANPromotionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSANPromotion();

            state._fsp--;

             after(grammarAccess.getSANNormalAccess().getPromotionSANPromotionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANNormal__PromotionAssignment_5"


    // $ANTLR start "rule__SANNormal__CheckAssignment_6"
    // InternalChessDSL.g:6740:1: rule__SANNormal__CheckAssignment_6 : ( ruleSANCheckMarker ) ;
    public final void rule__SANNormal__CheckAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6744:1: ( ( ruleSANCheckMarker ) )
            // InternalChessDSL.g:6745:2: ( ruleSANCheckMarker )
            {
            // InternalChessDSL.g:6745:2: ( ruleSANCheckMarker )
            // InternalChessDSL.g:6746:3: ruleSANCheckMarker
            {
             before(grammarAccess.getSANNormalAccess().getCheckSANCheckMarkerParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSANCheckMarker();

            state._fsp--;

             after(grammarAccess.getSANNormalAccess().getCheckSANCheckMarkerParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANNormal__CheckAssignment_6"


    // $ANTLR start "rule__SANNormal__RemarkAssignment_7"
    // InternalChessDSL.g:6755:1: rule__SANNormal__RemarkAssignment_7 : ( ruleSANRemark ) ;
    public final void rule__SANNormal__RemarkAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6759:1: ( ( ruleSANRemark ) )
            // InternalChessDSL.g:6760:2: ( ruleSANRemark )
            {
            // InternalChessDSL.g:6760:2: ( ruleSANRemark )
            // InternalChessDSL.g:6761:3: ruleSANRemark
            {
             before(grammarAccess.getSANNormalAccess().getRemarkSANRemarkParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleSANRemark();

            state._fsp--;

             after(grammarAccess.getSANNormalAccess().getRemarkSANRemarkParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SANNormal__RemarkAssignment_7"


    // $ANTLR start "rule__Conclusion__MethodAssignment_0"
    // InternalChessDSL.g:6770:1: rule__Conclusion__MethodAssignment_0 : ( ruleMethod ) ;
    public final void rule__Conclusion__MethodAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6774:1: ( ( ruleMethod ) )
            // InternalChessDSL.g:6775:2: ( ruleMethod )
            {
            // InternalChessDSL.g:6775:2: ( ruleMethod )
            // InternalChessDSL.g:6776:3: ruleMethod
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
    // InternalChessDSL.g:6785:1: rule__Conclusion__ResultAssignment_1 : ( ruleResult ) ;
    public final void rule__Conclusion__ResultAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6789:1: ( ( ruleResult ) )
            // InternalChessDSL.g:6790:2: ( ruleResult )
            {
            // InternalChessDSL.g:6790:2: ( ruleResult )
            // InternalChessDSL.g:6791:3: ruleResult
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
    // InternalChessDSL.g:6800:1: rule__Method__WinAssignment_0 : ( ruleWin ) ;
    public final void rule__Method__WinAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6804:1: ( ( ruleWin ) )
            // InternalChessDSL.g:6805:2: ( ruleWin )
            {
            // InternalChessDSL.g:6805:2: ( ruleWin )
            // InternalChessDSL.g:6806:3: ruleWin
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
    // InternalChessDSL.g:6815:1: rule__Method__DrawAssignment_1 : ( ruleDraw ) ;
    public final void rule__Method__DrawAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6819:1: ( ( ruleDraw ) )
            // InternalChessDSL.g:6820:2: ( ruleDraw )
            {
            // InternalChessDSL.g:6820:2: ( ruleDraw )
            // InternalChessDSL.g:6821:3: ruleDraw
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
    // InternalChessDSL.g:6830:1: rule__Win__TimeAssignment_0 : ( ruleTimeUp ) ;
    public final void rule__Win__TimeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6834:1: ( ( ruleTimeUp ) )
            // InternalChessDSL.g:6835:2: ( ruleTimeUp )
            {
            // InternalChessDSL.g:6835:2: ( ruleTimeUp )
            // InternalChessDSL.g:6836:3: ruleTimeUp
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
    // InternalChessDSL.g:6845:1: rule__Win__ResignAssignment_1 : ( ruleResign ) ;
    public final void rule__Win__ResignAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6849:1: ( ( ruleResign ) )
            // InternalChessDSL.g:6850:2: ( ruleResign )
            {
            // InternalChessDSL.g:6850:2: ( ruleResign )
            // InternalChessDSL.g:6851:3: ruleResign
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
    // InternalChessDSL.g:6860:1: rule__Win__MateAssignment_2 : ( ruleCheckmate ) ;
    public final void rule__Win__MateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6864:1: ( ( ruleCheckmate ) )
            // InternalChessDSL.g:6865:2: ( ruleCheckmate )
            {
            // InternalChessDSL.g:6865:2: ( ruleCheckmate )
            // InternalChessDSL.g:6866:3: ruleCheckmate
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
    // InternalChessDSL.g:6875:1: rule__TimeUp__PlayerAssignment_0 : ( rulePlayerOrColor ) ;
    public final void rule__TimeUp__PlayerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6879:1: ( ( rulePlayerOrColor ) )
            // InternalChessDSL.g:6880:2: ( rulePlayerOrColor )
            {
            // InternalChessDSL.g:6880:2: ( rulePlayerOrColor )
            // InternalChessDSL.g:6881:3: rulePlayerOrColor
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
    // InternalChessDSL.g:6890:1: rule__Resign__PlayerAssignment_0 : ( rulePlayerOrColor ) ;
    public final void rule__Resign__PlayerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6894:1: ( ( rulePlayerOrColor ) )
            // InternalChessDSL.g:6895:2: ( rulePlayerOrColor )
            {
            // InternalChessDSL.g:6895:2: ( rulePlayerOrColor )
            // InternalChessDSL.g:6896:3: rulePlayerOrColor
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
    // InternalChessDSL.g:6905:1: rule__Checkmate__Player1Assignment_0 : ( rulePlayerOrColor ) ;
    public final void rule__Checkmate__Player1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6909:1: ( ( rulePlayerOrColor ) )
            // InternalChessDSL.g:6910:2: ( rulePlayerOrColor )
            {
            // InternalChessDSL.g:6910:2: ( rulePlayerOrColor )
            // InternalChessDSL.g:6911:3: rulePlayerOrColor
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
    // InternalChessDSL.g:6920:1: rule__Checkmate__Player2Assignment_2 : ( rulePlayerOrColor ) ;
    public final void rule__Checkmate__Player2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6924:1: ( ( rulePlayerOrColor ) )
            // InternalChessDSL.g:6925:2: ( rulePlayerOrColor )
            {
            // InternalChessDSL.g:6925:2: ( rulePlayerOrColor )
            // InternalChessDSL.g:6926:3: rulePlayerOrColor
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
    // InternalChessDSL.g:6935:1: rule__Draw__Player1Assignment_0 : ( rulePlayerOrColor ) ;
    public final void rule__Draw__Player1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6939:1: ( ( rulePlayerOrColor ) )
            // InternalChessDSL.g:6940:2: ( rulePlayerOrColor )
            {
            // InternalChessDSL.g:6940:2: ( rulePlayerOrColor )
            // InternalChessDSL.g:6941:3: rulePlayerOrColor
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
    // InternalChessDSL.g:6950:1: rule__Draw__Player2Assignment_2 : ( rulePlayerOrColor ) ;
    public final void rule__Draw__Player2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6954:1: ( ( rulePlayerOrColor ) )
            // InternalChessDSL.g:6955:2: ( rulePlayerOrColor )
            {
            // InternalChessDSL.g:6955:2: ( rulePlayerOrColor )
            // InternalChessDSL.g:6956:3: rulePlayerOrColor
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
    // InternalChessDSL.g:6965:1: rule__Draw__ResultAssignment_3 : ( ( rule__Draw__ResultAlternatives_3_0 ) ) ;
    public final void rule__Draw__ResultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6969:1: ( ( ( rule__Draw__ResultAlternatives_3_0 ) ) )
            // InternalChessDSL.g:6970:2: ( ( rule__Draw__ResultAlternatives_3_0 ) )
            {
            // InternalChessDSL.g:6970:2: ( ( rule__Draw__ResultAlternatives_3_0 ) )
            // InternalChessDSL.g:6971:3: ( rule__Draw__ResultAlternatives_3_0 )
            {
             before(grammarAccess.getDrawAccess().getResultAlternatives_3_0()); 
            // InternalChessDSL.g:6972:3: ( rule__Draw__ResultAlternatives_3_0 )
            // InternalChessDSL.g:6972:4: rule__Draw__ResultAlternatives_3_0
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
    // InternalChessDSL.g:6980:1: rule__Result__PlayerAssignment_0_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Result__PlayerAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:6984:1: ( ( ( RULE_ID ) ) )
            // InternalChessDSL.g:6985:2: ( ( RULE_ID ) )
            {
            // InternalChessDSL.g:6985:2: ( ( RULE_ID ) )
            // InternalChessDSL.g:6986:3: ( RULE_ID )
            {
             before(grammarAccess.getResultAccess().getPlayerPlayerCrossReference_0_0_0_0()); 
            // InternalChessDSL.g:6987:3: ( RULE_ID )
            // InternalChessDSL.g:6988:4: RULE_ID
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
    // InternalChessDSL.g:6999:1: rule__Result__ColorAssignment_0_0_1 : ( ruleColor ) ;
    public final void rule__Result__ColorAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:7003:1: ( ( ruleColor ) )
            // InternalChessDSL.g:7004:2: ( ruleColor )
            {
            // InternalChessDSL.g:7004:2: ( ruleColor )
            // InternalChessDSL.g:7005:3: ruleColor
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
    // InternalChessDSL.g:7014:1: rule__PlayerOrColor__PlayerAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PlayerOrColor__PlayerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:7018:1: ( ( ( RULE_ID ) ) )
            // InternalChessDSL.g:7019:2: ( ( RULE_ID ) )
            {
            // InternalChessDSL.g:7019:2: ( ( RULE_ID ) )
            // InternalChessDSL.g:7020:3: ( RULE_ID )
            {
             before(grammarAccess.getPlayerOrColorAccess().getPlayerPlayerCrossReference_0_0()); 
            // InternalChessDSL.g:7021:3: ( RULE_ID )
            // InternalChessDSL.g:7022:4: RULE_ID
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
    // InternalChessDSL.g:7033:1: rule__PlayerOrColor__ColorAssignment_1 : ( ruleColor ) ;
    public final void rule__PlayerOrColor__ColorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:7037:1: ( ( ruleColor ) )
            // InternalChessDSL.g:7038:2: ( ruleColor )
            {
            // InternalChessDSL.g:7038:2: ( ruleColor )
            // InternalChessDSL.g:7039:3: ruleColor
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
    // InternalChessDSL.g:7048:1: rule__Square__SquareAssignment : ( RULE_SQUARETERMINAL ) ;
    public final void rule__Square__SquareAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessDSL.g:7052:1: ( ( RULE_SQUARETERMINAL ) )
            // InternalChessDSL.g:7053:2: ( RULE_SQUARETERMINAL )
            {
            // InternalChessDSL.g:7053:2: ( RULE_SQUARETERMINAL )
            // InternalChessDSL.g:7054:3: RULE_SQUARETERMINAL
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
    static final String dfa_2s = "\21\uffff\2\26\14\uffff\6\50\2\uffff\1\50\3\uffff";
    static final String dfa_3s = "\2\50\6\70\2\uffff\2\11\1\74\1\76\2\11\1\71\2\4\1\50\1\101\1\50\1\uffff\1\23\1\uffff\6\71\6\4\2\71\1\4\3\uffff";
    static final String dfa_4s = "\1\103\1\55\6\75\2\uffff\2\11\1\74\1\76\2\11\1\71\2\110\1\55\1\103\1\55\1\uffff\1\24\1\uffff\6\71\6\110\2\71\1\110\3\uffff";
    static final String dfa_5s = "\10\uffff\1\3\1\6\14\uffff\1\1\1\uffff\1\5\17\uffff\1\2\1\4\1\1";
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
            "\2\26\1\uffff\3\26\13\uffff\5\26\16\uffff\6\26\2\uffff\1\26\7\uffff\1\26\1\uffff\2\26\3\uffff\1\23\1\24\1\25\1\27\1\26\1\uffff\1\30\3\26",
            "\2\26\1\uffff\3\26\13\uffff\5\26\16\uffff\6\26\2\uffff\1\26\7\uffff\1\26\1\uffff\2\26\3\uffff\1\23\1\24\1\25\1\27\1\26\1\uffff\1\30\3\26",
            "\1\31\1\32\1\33\1\34\1\35\1\36",
            "\1\25\1\uffff\1\10",
            "\1\37\1\40\1\41\1\42\1\43\1\44",
            "",
            "\1\45\1\46",
            "",
            "\1\47",
            "\1\47",
            "\1\47",
            "\1\47",
            "\1\47",
            "\1\47",
            "\2\50\1\uffff\3\50\7\uffff\1\51\3\uffff\5\50\16\uffff\6\50\2\uffff\1\50\7\uffff\1\50\1\uffff\2\50\6\uffff\2\50\1\uffff\1\30\3\50",
            "\2\50\1\uffff\3\50\7\uffff\1\51\3\uffff\5\50\16\uffff\6\50\2\uffff\1\50\7\uffff\1\50\1\uffff\2\50\6\uffff\2\50\1\uffff\1\30\3\50",
            "\2\50\1\uffff\3\50\7\uffff\1\51\3\uffff\5\50\16\uffff\6\50\2\uffff\1\50\7\uffff\1\50\1\uffff\2\50\6\uffff\2\50\1\uffff\1\30\3\50",
            "\2\50\1\uffff\3\50\7\uffff\1\51\3\uffff\5\50\16\uffff\6\50\2\uffff\1\50\7\uffff\1\50\1\uffff\2\50\6\uffff\2\50\1\uffff\1\30\3\50",
            "\2\50\1\uffff\3\50\7\uffff\1\51\3\uffff\5\50\16\uffff\6\50\2\uffff\1\50\7\uffff\1\50\1\uffff\2\50\6\uffff\2\50\1\uffff\1\30\3\50",
            "\2\50\1\uffff\3\50\7\uffff\1\51\3\uffff\5\50\16\uffff\6\50\2\uffff\1\50\7\uffff\1\50\1\uffff\2\50\6\uffff\2\50\1\uffff\1\30\3\50",
            "\1\52",
            "\1\52",
            "\2\50\1\uffff\3\50\7\uffff\1\51\3\uffff\5\50\16\uffff\6\50\2\uffff\1\50\7\uffff\1\50\1\uffff\2\50\6\uffff\2\50\1\uffff\1\30\3\50",
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
            return "1167:1: rule__DSLMove__Alternatives : ( ( ruleMove ) | ( ruleCapture ) | ( ruleCastle ) | ( ruleEnPassant ) | ( rulePromotion ) | ( ruleDummy ) );";
        }
    }
    static final String dfa_8s = "\25\uffff";
    static final String dfa_9s = "\1\50\2\uffff\1\50\6\70\2\11\1\74\1\76\2\11\1\71\2\100\2\uffff";
    static final String dfa_10s = "\1\103\2\uffff\1\55\6\75\2\11\1\74\1\76\2\11\1\71\2\102\2\uffff";
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
            return "1254:1: rule__Castle__Alternatives : ( ( ( rule__Castle__Group_0__0 ) ) | ( ( rule__Castle__Group_1__0 ) ) | ( ( rule__Castle__Group_2__0 ) ) | ( ( rule__Castle__Group_3__0 ) ) );";
        }
    }
    static final String dfa_14s = "\23\uffff";
    static final String dfa_15s = "\2\50\6\70\2\11\1\74\1\76\2\11\1\71\2\77\2\uffff";
    static final String dfa_16s = "\1\73\1\55\6\75\2\11\1\74\1\76\2\11\1\71\2\105\2\uffff";
    static final String dfa_17s = "\21\uffff\1\2\1\1";
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
            return "1371:1: rule__Promotion__MoveAlternatives_0_0 : ( ( ruleMove ) | ( ruleCapture ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000A800000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0001000000000080L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000C040000100L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000C000000100L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000C000000102L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0010000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x008000C000000100L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00003F0000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0C003F0003E40330L,0x00000000000001CCL});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0C003F0003E00330L,0x00000000000001CCL});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0200003F80000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000003F80000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0C003F0000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x08003F0000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x2100000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000001A0000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000000003C010000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000003E00000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000011108000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});

}