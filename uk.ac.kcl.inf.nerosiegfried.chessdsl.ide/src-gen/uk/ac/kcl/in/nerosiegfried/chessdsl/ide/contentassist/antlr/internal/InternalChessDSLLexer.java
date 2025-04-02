package uk.ac.kcl.in.nerosiegfried.chessdsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalChessDSLLexer extends Lexer {
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

    public InternalChessDSLLexer() {;} 
    public InternalChessDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalChessDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalChessDSL.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:11:7: ( 'fresh' )
            // InternalChessDSL.g:11:9: 'fresh'
            {
            match("fresh"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:12:7: ( '=' )
            // InternalChessDSL.g:12:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:13:7: ( 'on' )
            // InternalChessDSL.g:13:9: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:14:7: ( '...' )
            // InternalChessDSL.g:14:9: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:15:7: ( 'Kingside' )
            // InternalChessDSL.g:15:9: 'Kingside'
            {
            match("Kingside"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:16:7: ( 'Queenside' )
            // InternalChessDSL.g:16:9: 'Queenside'
            {
            match("Queenside"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:17:7: ( 'K' )
            // InternalChessDSL.g:17:9: 'K'
            {
            match('K'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:18:7: ( 'Q' )
            // InternalChessDSL.g:18:9: 'Q'
            {
            match('Q'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:19:7: ( 'R' )
            // InternalChessDSL.g:19:9: 'R'
            {
            match('R'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:20:7: ( 'B' )
            // InternalChessDSL.g:20:9: 'B'
            {
            match('B'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:21:7: ( 'N' )
            // InternalChessDSL.g:21:9: 'N'
            {
            match('N'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:22:7: ( '+' )
            // InternalChessDSL.g:22:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:23:7: ( '#' )
            // InternalChessDSL.g:23:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:24:7: ( '!' )
            // InternalChessDSL.g:24:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:25:7: ( '?' )
            // InternalChessDSL.g:25:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:26:7: ( 'draw' )
            // InternalChessDSL.g:26:9: 'draw'
            {
            match("draw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:27:7: ( 'Good' )
            // InternalChessDSL.g:27:9: 'Good'
            {
            match("Good"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:28:7: ( 'Bad' )
            // InternalChessDSL.g:28:9: 'Bad'
            {
            match("Bad"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:29:7: ( 'Excellent' )
            // InternalChessDSL.g:29:9: 'Excellent'
            {
            match("Excellent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:30:7: ( 'Risky' )
            // InternalChessDSL.g:30:9: 'Risky'
            {
            match("Risky"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:31:7: ( 'Dubious' )
            // InternalChessDSL.g:31:9: 'Dubious'
            {
            match("Dubious"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:32:7: ( 'Check' )
            // InternalChessDSL.g:32:9: 'Check'
            {
            match("Check"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:33:7: ( 'Checkmate' )
            // InternalChessDSL.g:33:9: 'Checkmate'
            {
            match("Checkmate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:34:7: ( 'White' )
            // InternalChessDSL.g:34:9: 'White'
            {
            match("White"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:35:7: ( 'Black' )
            // InternalChessDSL.g:35:9: 'Black'
            {
            match("Black"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:36:7: ( 'King' )
            // InternalChessDSL.g:36:9: 'King'
            {
            match("King"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:37:7: ( 'Queen' )
            // InternalChessDSL.g:37:9: 'Queen'
            {
            match("Queen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:38:7: ( 'Rook' )
            // InternalChessDSL.g:38:9: 'Rook'
            {
            match("Rook"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:39:7: ( 'Bishop' )
            // InternalChessDSL.g:39:9: 'Bishop'
            {
            match("Bishop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:40:7: ( 'Knight' )
            // InternalChessDSL.g:40:9: 'Knight'
            {
            match("Knight"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:41:7: ( 'Pawn' )
            // InternalChessDSL.g:41:9: 'Pawn'
            {
            match("Pawn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:42:7: ( 'Game' )
            // InternalChessDSL.g:42:9: 'Game'
            {
            match("Game"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:43:7: ( 'Moves:' )
            // InternalChessDSL.g:43:9: 'Moves:'
            {
            match("Moves:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:44:7: ( 'end' )
            // InternalChessDSL.g:44:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:45:7: ( 'Players:' )
            // InternalChessDSL.g:45:9: 'Players:'
            {
            match("Players:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:46:7: ( ':' )
            // InternalChessDSL.g:46:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:47:7: ( 'InitialState' )
            // InternalChessDSL.g:47:9: 'InitialState'
            {
            match("InitialState"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:48:7: ( 'custom' )
            // InternalChessDSL.g:48:9: 'custom'
            {
            match("custom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:49:7: ( 'Positions:' )
            // InternalChessDSL.g:49:9: 'Positions:'
            {
            match("Positions:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:50:7: ( '{' )
            // InternalChessDSL.g:50:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:51:7: ( '}' )
            // InternalChessDSL.g:51:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:52:7: ( '(' )
            // InternalChessDSL.g:52:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:53:7: ( ')' )
            // InternalChessDSL.g:53:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:54:7: ( 'dummy' )
            // InternalChessDSL.g:54:9: 'dummy'
            {
            match("dummy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:55:7: ( 'moves' )
            // InternalChessDSL.g:55:9: 'moves'
            {
            match("moves"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:56:7: ( '->' )
            // InternalChessDSL.g:56:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:57:7: ( 'from' )
            // InternalChessDSL.g:57:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:58:7: ( 'to' )
            // InternalChessDSL.g:58:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:59:7: ( 'Capture(' )
            // InternalChessDSL.g:59:9: 'Capture('
            {
            match("Capture("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:60:7: ( 'and' )
            // InternalChessDSL.g:60:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:61:7: ( 'captures' )
            // InternalChessDSL.g:61:9: 'captures'
            {
            match("captures"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:62:7: ( 'Castle(' )
            // InternalChessDSL.g:62:9: 'Castle('
            {
            match("Castle("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:63:7: ( 'castles' )
            // InternalChessDSL.g:63:9: 'castles'
            {
            match("castles"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:64:7: ( 'the' )
            // InternalChessDSL.g:64:9: 'the'
            {
            match("the"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:65:7: ( 'Promotion(' )
            // InternalChessDSL.g:65:9: 'Promotion('
            {
            match("Promotion("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:66:7: ( 'O-O-O' )
            // InternalChessDSL.g:66:9: 'O-O-O'
            {
            match("O-O-O"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:67:7: ( 'O-O' )
            // InternalChessDSL.g:67:9: 'O-O'
            {
            match("O-O"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:68:7: ( 'x' )
            // InternalChessDSL.g:68:9: 'x'
            {
            match('x'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:69:7: ( 'ran' )
            // InternalChessDSL.g:69:9: 'ran'
            {
            match("ran"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:70:7: ( 'out' )
            // InternalChessDSL.g:70:9: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:71:7: ( 'of' )
            // InternalChessDSL.g:71:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:72:7: ( 'time' )
            // InternalChessDSL.g:72:9: 'time'
            {
            match("time"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:73:7: ( 'resigned' )
            // InternalChessDSL.g:73:9: 'resigned'
            {
            match("resigned"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:74:7: ( 'checkmated' )
            // InternalChessDSL.g:74:9: 'checkmated'
            {
            match("checkmated"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:75:7: ( 'ended' )
            // InternalChessDSL.g:75:9: 'ended'
            {
            match("ended"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:76:7: ( 'game' )
            // InternalChessDSL.g:76:9: 'game'
            {
            match("game"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:77:7: ( 'in' )
            // InternalChessDSL.g:77:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:78:7: ( 'a' )
            // InternalChessDSL.g:78:9: 'a'
            {
            match('a'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:79:7: ( 'stalemate' )
            // InternalChessDSL.g:79:9: 'stalemate'
            {
            match("stalemate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:80:7: ( 'repeated' )
            // InternalChessDSL.g:80:9: 'repeated'
            {
            match("repeated"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:81:7: ( 'position' )
            // InternalChessDSL.g:81:9: 'position'
            {
            match("position"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:82:7: ( 'three' )
            // InternalChessDSL.g:82:9: 'three'
            {
            match("three"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:83:7: ( 'times' )
            // InternalChessDSL.g:83:9: 'times'
            {
            match("times"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:84:7: ( 'played' )
            // InternalChessDSL.g:84:9: 'played'
            {
            match("played"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:85:7: ( 'fifty' )
            // InternalChessDSL.g:85:9: 'fifty'
            {
            match("fifty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:86:7: ( 'without' )
            // InternalChessDSL.g:86:9: 'without'
            {
            match("without"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:87:7: ( 'capture' )
            // InternalChessDSL.g:87:9: 'capture'
            {
            match("capture"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:88:7: ( 'agreed' )
            // InternalChessDSL.g:88:9: 'agreed'
            {
            match("agreed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:89:7: ( 'wins' )
            // InternalChessDSL.g:89:9: 'wins'
            {
            match("wins"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "RULE_MOVENUMBER"
    public final void mRULE_MOVENUMBER() throws RecognitionException {
        try {
            int _type = RULE_MOVENUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:7063:17: ( ( '0' .. '9' )+ '.' )
            // InternalChessDSL.g:7063:19: ( '0' .. '9' )+ '.'
            {
            // InternalChessDSL.g:7063:19: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalChessDSL.g:7063:20: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MOVENUMBER"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            int _type = RULE_LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:7065:13: ( ( 'a' .. 'h' | 'A' .. 'H' ) )
            // InternalChessDSL.g:7065:15: ( 'a' .. 'h' | 'A' .. 'H' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='H')||(input.LA(1)>='a' && input.LA(1)<='h') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_RANKDIGIT"
    public final void mRULE_RANKDIGIT() throws RecognitionException {
        try {
            int _type = RULE_RANKDIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:7067:16: ( '1' .. '8' )
            // InternalChessDSL.g:7067:18: '1' .. '8'
            {
            matchRange('1','8'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RANKDIGIT"

    // $ANTLR start "RULE_SQUARETERMINAL"
    public final void mRULE_SQUARETERMINAL() throws RecognitionException {
        try {
            int _type = RULE_SQUARETERMINAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:7069:21: ( RULE_LETTER RULE_RANKDIGIT )
            // InternalChessDSL.g:7069:23: RULE_LETTER RULE_RANKDIGIT
            {
            mRULE_LETTER(); 
            mRULE_RANKDIGIT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SQUARETERMINAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:7071:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalChessDSL.g:7071:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalChessDSL.g:7071:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalChessDSL.g:7071:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalChessDSL.g:7071:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalChessDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:7073:10: ( ( '0' .. '9' )+ )
            // InternalChessDSL.g:7073:12: ( '0' .. '9' )+
            {
            // InternalChessDSL.g:7073:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalChessDSL.g:7073:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:7075:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalChessDSL.g:7075:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalChessDSL.g:7075:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalChessDSL.g:7075:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalChessDSL.g:7075:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalChessDSL.g:7075:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalChessDSL.g:7075:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:7075:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalChessDSL.g:7075:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalChessDSL.g:7075:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalChessDSL.g:7075:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:7077:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalChessDSL.g:7077:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalChessDSL.g:7077:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalChessDSL.g:7077:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:7079:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalChessDSL.g:7079:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalChessDSL.g:7079:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalChessDSL.g:7079:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalChessDSL.g:7079:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalChessDSL.g:7079:41: ( '\\r' )? '\\n'
                    {
                    // InternalChessDSL.g:7079:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalChessDSL.g:7079:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:7081:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalChessDSL.g:7081:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalChessDSL.g:7081:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalChessDSL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:7083:16: ( . )
            // InternalChessDSL.g:7083:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalChessDSL.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | RULE_MOVENUMBER | RULE_LETTER | RULE_RANKDIGIT | RULE_SQUARETERMINAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=90;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalChessDSL.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalChessDSL.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalChessDSL.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalChessDSL.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalChessDSL.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalChessDSL.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalChessDSL.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalChessDSL.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalChessDSL.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalChessDSL.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // InternalChessDSL.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // InternalChessDSL.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // InternalChessDSL.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // InternalChessDSL.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // InternalChessDSL.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // InternalChessDSL.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // InternalChessDSL.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // InternalChessDSL.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // InternalChessDSL.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // InternalChessDSL.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // InternalChessDSL.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // InternalChessDSL.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // InternalChessDSL.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // InternalChessDSL.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // InternalChessDSL.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // InternalChessDSL.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // InternalChessDSL.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // InternalChessDSL.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // InternalChessDSL.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // InternalChessDSL.g:1:184: T__44
                {
                mT__44(); 

                }
                break;
            case 31 :
                // InternalChessDSL.g:1:190: T__45
                {
                mT__45(); 

                }
                break;
            case 32 :
                // InternalChessDSL.g:1:196: T__46
                {
                mT__46(); 

                }
                break;
            case 33 :
                // InternalChessDSL.g:1:202: T__47
                {
                mT__47(); 

                }
                break;
            case 34 :
                // InternalChessDSL.g:1:208: T__48
                {
                mT__48(); 

                }
                break;
            case 35 :
                // InternalChessDSL.g:1:214: T__49
                {
                mT__49(); 

                }
                break;
            case 36 :
                // InternalChessDSL.g:1:220: T__50
                {
                mT__50(); 

                }
                break;
            case 37 :
                // InternalChessDSL.g:1:226: T__51
                {
                mT__51(); 

                }
                break;
            case 38 :
                // InternalChessDSL.g:1:232: T__52
                {
                mT__52(); 

                }
                break;
            case 39 :
                // InternalChessDSL.g:1:238: T__53
                {
                mT__53(); 

                }
                break;
            case 40 :
                // InternalChessDSL.g:1:244: T__54
                {
                mT__54(); 

                }
                break;
            case 41 :
                // InternalChessDSL.g:1:250: T__55
                {
                mT__55(); 

                }
                break;
            case 42 :
                // InternalChessDSL.g:1:256: T__56
                {
                mT__56(); 

                }
                break;
            case 43 :
                // InternalChessDSL.g:1:262: T__57
                {
                mT__57(); 

                }
                break;
            case 44 :
                // InternalChessDSL.g:1:268: T__58
                {
                mT__58(); 

                }
                break;
            case 45 :
                // InternalChessDSL.g:1:274: T__59
                {
                mT__59(); 

                }
                break;
            case 46 :
                // InternalChessDSL.g:1:280: T__60
                {
                mT__60(); 

                }
                break;
            case 47 :
                // InternalChessDSL.g:1:286: T__61
                {
                mT__61(); 

                }
                break;
            case 48 :
                // InternalChessDSL.g:1:292: T__62
                {
                mT__62(); 

                }
                break;
            case 49 :
                // InternalChessDSL.g:1:298: T__63
                {
                mT__63(); 

                }
                break;
            case 50 :
                // InternalChessDSL.g:1:304: T__64
                {
                mT__64(); 

                }
                break;
            case 51 :
                // InternalChessDSL.g:1:310: T__65
                {
                mT__65(); 

                }
                break;
            case 52 :
                // InternalChessDSL.g:1:316: T__66
                {
                mT__66(); 

                }
                break;
            case 53 :
                // InternalChessDSL.g:1:322: T__67
                {
                mT__67(); 

                }
                break;
            case 54 :
                // InternalChessDSL.g:1:328: T__68
                {
                mT__68(); 

                }
                break;
            case 55 :
                // InternalChessDSL.g:1:334: T__69
                {
                mT__69(); 

                }
                break;
            case 56 :
                // InternalChessDSL.g:1:340: T__70
                {
                mT__70(); 

                }
                break;
            case 57 :
                // InternalChessDSL.g:1:346: T__71
                {
                mT__71(); 

                }
                break;
            case 58 :
                // InternalChessDSL.g:1:352: T__72
                {
                mT__72(); 

                }
                break;
            case 59 :
                // InternalChessDSL.g:1:358: T__73
                {
                mT__73(); 

                }
                break;
            case 60 :
                // InternalChessDSL.g:1:364: T__74
                {
                mT__74(); 

                }
                break;
            case 61 :
                // InternalChessDSL.g:1:370: T__75
                {
                mT__75(); 

                }
                break;
            case 62 :
                // InternalChessDSL.g:1:376: T__76
                {
                mT__76(); 

                }
                break;
            case 63 :
                // InternalChessDSL.g:1:382: T__77
                {
                mT__77(); 

                }
                break;
            case 64 :
                // InternalChessDSL.g:1:388: T__78
                {
                mT__78(); 

                }
                break;
            case 65 :
                // InternalChessDSL.g:1:394: T__79
                {
                mT__79(); 

                }
                break;
            case 66 :
                // InternalChessDSL.g:1:400: T__80
                {
                mT__80(); 

                }
                break;
            case 67 :
                // InternalChessDSL.g:1:406: T__81
                {
                mT__81(); 

                }
                break;
            case 68 :
                // InternalChessDSL.g:1:412: T__82
                {
                mT__82(); 

                }
                break;
            case 69 :
                // InternalChessDSL.g:1:418: T__83
                {
                mT__83(); 

                }
                break;
            case 70 :
                // InternalChessDSL.g:1:424: T__84
                {
                mT__84(); 

                }
                break;
            case 71 :
                // InternalChessDSL.g:1:430: T__85
                {
                mT__85(); 

                }
                break;
            case 72 :
                // InternalChessDSL.g:1:436: T__86
                {
                mT__86(); 

                }
                break;
            case 73 :
                // InternalChessDSL.g:1:442: T__87
                {
                mT__87(); 

                }
                break;
            case 74 :
                // InternalChessDSL.g:1:448: T__88
                {
                mT__88(); 

                }
                break;
            case 75 :
                // InternalChessDSL.g:1:454: T__89
                {
                mT__89(); 

                }
                break;
            case 76 :
                // InternalChessDSL.g:1:460: T__90
                {
                mT__90(); 

                }
                break;
            case 77 :
                // InternalChessDSL.g:1:466: T__91
                {
                mT__91(); 

                }
                break;
            case 78 :
                // InternalChessDSL.g:1:472: T__92
                {
                mT__92(); 

                }
                break;
            case 79 :
                // InternalChessDSL.g:1:478: T__93
                {
                mT__93(); 

                }
                break;
            case 80 :
                // InternalChessDSL.g:1:484: RULE_MOVENUMBER
                {
                mRULE_MOVENUMBER(); 

                }
                break;
            case 81 :
                // InternalChessDSL.g:1:500: RULE_LETTER
                {
                mRULE_LETTER(); 

                }
                break;
            case 82 :
                // InternalChessDSL.g:1:512: RULE_RANKDIGIT
                {
                mRULE_RANKDIGIT(); 

                }
                break;
            case 83 :
                // InternalChessDSL.g:1:527: RULE_SQUARETERMINAL
                {
                mRULE_SQUARETERMINAL(); 

                }
                break;
            case 84 :
                // InternalChessDSL.g:1:547: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 85 :
                // InternalChessDSL.g:1:555: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 86 :
                // InternalChessDSL.g:1:564: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 87 :
                // InternalChessDSL.g:1:576: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 88 :
                // InternalChessDSL.g:1:592: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 89 :
                // InternalChessDSL.g:1:608: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 90 :
                // InternalChessDSL.g:1:616: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\66\1\uffff\1\70\1\63\1\100\1\102\1\105\1\111\1\112\4\uffff\5\66\3\70\1\66\1\uffff\1\70\1\66\4\uffff\1\70\1\63\1\70\1\156\1\70\1\160\1\70\1\66\4\70\1\171\1\66\1\174\1\63\1\uffff\3\63\2\uffff\2\70\1\uffff\1\u0084\2\uffff\1\u0085\1\70\1\u0087\1\uffff\2\70\1\uffff\1\70\1\uffff\2\70\1\uffff\3\70\6\uffff\17\70\1\uffff\4\70\4\uffff\1\70\1\uffff\1\u00a6\4\70\3\uffff\3\70\1\u00b1\4\70\2\uffff\1\174\5\uffff\3\70\2\uffff\1\u00ba\1\uffff\5\70\1\u00c0\21\70\1\u00d3\6\70\1\uffff\1\u00da\2\70\1\u00dd\1\70\1\u00e0\1\u00e1\3\70\1\uffff\6\70\1\u00eb\1\70\1\uffff\1\u00ee\3\70\1\u00f2\1\uffff\2\70\1\u00f5\1\70\1\u00f7\1\u00f8\6\70\1\u00ff\5\70\1\uffff\6\70\1\uffff\1\70\1\u010d\1\uffff\1\70\3\uffff\2\70\1\u0111\4\70\1\u0116\1\u0117\1\uffff\1\u0118\1\70\1\uffff\1\70\1\u011c\1\u011d\1\uffff\1\u011e\1\70\1\uffff\1\u0120\2\uffff\2\70\1\u0124\2\70\1\u0127\1\uffff\4\70\1\u012c\5\70\1\u0132\1\u0133\1\u0134\1\uffff\3\70\1\uffff\4\70\3\uffff\1\70\1\u013d\1\70\3\uffff\1\u013f\1\uffff\3\70\1\uffff\2\70\1\uffff\3\70\2\uffff\1\70\1\u0149\3\70\3\uffff\1\u014d\4\70\1\u0152\2\70\1\uffff\1\70\1\uffff\1\70\1\u0157\2\70\1\uffff\4\70\1\uffff\1\u015f\1\u0160\1\70\1\uffff\4\70\1\uffff\1\u0166\1\u0167\2\70\1\uffff\1\70\2\uffff\3\70\1\u016e\2\uffff\1\70\1\u0170\1\u0171\1\70\1\u0173\2\uffff\1\u0174\1\u0175\1\u0176\3\70\1\uffff\1\70\2\uffff\1\u017b\6\uffff\1\70\1\u017d\1\uffff\1\70\1\uffff\1\u017f\1\uffff";
    static final String DFA13_eofS =
        "\u0180\uffff";
    static final String DFA13_minS =
        "\1\0\1\60\1\uffff\1\146\1\56\5\60\4\uffff\5\60\1\150\1\141\1\157\1\60\1\uffff\1\156\1\60\4\uffff\1\157\1\76\1\150\1\60\1\55\1\60\1\141\1\60\1\156\1\164\1\154\1\151\1\56\1\60\1\56\1\101\1\uffff\2\0\1\52\2\uffff\1\145\1\146\1\uffff\1\60\2\uffff\1\60\1\164\1\60\1\uffff\1\156\1\151\1\uffff\1\145\1\uffff\1\163\1\157\1\uffff\1\144\1\141\1\163\6\uffff\1\141\1\155\1\157\1\155\1\143\1\142\1\145\1\160\1\151\1\167\1\141\1\163\1\157\1\166\1\144\1\uffff\1\151\1\163\1\160\1\145\4\uffff\1\166\1\uffff\1\60\1\145\1\155\1\144\1\162\1\uffff\1\117\1\uffff\1\156\1\160\1\155\1\60\1\141\1\163\1\141\1\156\2\uffff\1\56\5\uffff\1\163\1\155\1\164\2\uffff\1\60\1\uffff\2\147\1\145\2\153\1\60\1\143\1\150\1\167\1\155\1\144\2\145\1\151\1\143\3\164\1\156\1\171\1\151\1\155\1\145\1\60\4\164\1\143\1\145\1\uffff\1\60\2\145\1\60\1\145\1\55\1\60\1\151\2\145\1\uffff\1\154\1\151\1\171\1\150\1\163\1\150\1\60\1\171\1\uffff\1\60\1\150\1\156\1\171\1\60\1\uffff\1\153\1\157\1\60\1\171\2\60\1\154\1\157\1\153\1\165\1\154\1\145\1\60\1\145\1\164\1\157\1\163\1\144\1\uffff\1\151\1\157\1\165\1\154\1\153\1\163\1\uffff\1\145\1\60\1\uffff\1\145\3\uffff\1\147\1\141\1\60\1\145\1\164\1\145\1\157\2\60\1\uffff\1\60\1\151\1\uffff\1\164\2\60\1\uffff\1\60\1\160\1\uffff\1\60\2\uffff\1\154\1\165\1\60\1\162\1\145\1\60\1\uffff\1\162\1\151\1\164\1\72\1\60\1\141\1\155\1\162\1\145\1\155\3\60\1\uffff\1\144\1\156\1\164\1\uffff\1\155\1\151\1\144\1\165\3\uffff\1\144\1\60\1\151\3\uffff\1\60\1\uffff\1\145\1\163\1\141\1\uffff\1\145\1\50\1\uffff\1\163\1\157\1\151\2\uffff\1\154\1\60\1\145\1\163\1\141\3\uffff\1\60\2\145\1\141\1\157\1\60\1\164\1\145\1\uffff\1\144\1\uffff\1\156\1\60\1\164\1\50\1\uffff\1\72\1\156\1\157\1\123\1\uffff\2\60\1\164\1\uffff\2\144\1\164\1\156\1\uffff\2\60\1\145\1\164\1\uffff\1\145\2\uffff\1\163\1\156\1\164\1\60\2\uffff\1\145\2\60\1\145\1\60\2\uffff\3\60\1\72\1\50\1\141\1\uffff\1\144\2\uffff\1\60\6\uffff\1\164\1\60\1\uffff\1\145\1\uffff\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\172\1\uffff\1\165\1\56\5\172\4\uffff\5\172\1\150\1\162\1\157\1\172\1\uffff\1\156\1\172\4\uffff\1\157\1\76\1\157\1\172\1\55\1\172\1\145\1\172\1\156\1\164\1\157\1\151\1\71\1\172\1\71\1\172\1\uffff\2\uffff\1\57\2\uffff\1\157\1\146\1\uffff\1\172\2\uffff\1\172\1\164\1\172\1\uffff\1\156\1\151\1\uffff\1\145\1\uffff\1\163\1\157\1\uffff\1\144\1\141\1\163\6\uffff\1\141\1\155\1\157\1\155\1\143\1\142\1\145\1\163\1\151\1\167\1\141\1\163\1\157\1\166\1\144\1\uffff\1\151\2\163\1\145\4\uffff\1\166\1\uffff\1\172\1\162\1\155\1\144\1\162\1\uffff\1\117\1\uffff\1\156\1\163\1\155\1\172\1\141\1\163\1\141\1\164\2\uffff\1\71\5\uffff\1\163\1\155\1\164\2\uffff\1\172\1\uffff\2\147\1\145\2\153\1\172\1\143\1\150\1\167\1\155\1\144\2\145\1\151\1\143\3\164\1\156\1\171\1\151\1\155\1\145\1\172\4\164\1\143\1\145\1\uffff\1\172\2\145\1\172\1\145\1\55\1\172\1\151\2\145\1\uffff\1\154\1\151\1\171\1\150\1\163\1\150\1\172\1\171\1\uffff\1\172\1\150\1\156\1\171\1\172\1\uffff\1\153\1\157\1\172\1\171\2\172\1\154\1\157\1\153\1\165\1\154\1\145\1\172\1\145\1\164\1\157\1\163\1\144\1\uffff\1\151\1\157\1\165\1\154\1\153\1\163\1\uffff\1\145\1\172\1\uffff\1\145\3\uffff\1\147\1\141\1\172\1\145\1\164\1\145\1\157\2\172\1\uffff\1\172\1\151\1\uffff\1\164\2\172\1\uffff\1\172\1\160\1\uffff\1\172\2\uffff\1\154\1\165\1\172\1\162\1\145\1\172\1\uffff\1\162\1\151\1\164\1\72\1\172\1\141\1\155\1\162\1\145\1\155\3\172\1\uffff\1\144\1\156\1\164\1\uffff\1\155\1\151\1\144\1\165\3\uffff\1\144\1\172\1\151\3\uffff\1\172\1\uffff\1\145\1\163\1\141\1\uffff\1\145\1\50\1\uffff\1\163\1\157\1\151\2\uffff\1\154\1\172\1\145\1\163\1\141\3\uffff\1\172\2\145\1\141\1\157\1\172\1\164\1\145\1\uffff\1\144\1\uffff\1\156\1\172\1\164\1\50\1\uffff\1\72\1\156\1\157\1\123\1\uffff\2\172\1\164\1\uffff\2\144\1\164\1\156\1\uffff\2\172\1\145\1\164\1\uffff\1\145\2\uffff\1\163\1\156\1\164\1\172\2\uffff\1\145\2\172\1\145\1\172\2\uffff\3\172\1\72\1\50\1\141\1\uffff\1\144\2\uffff\1\172\6\uffff\1\164\1\172\1\uffff\1\145\1\uffff\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\7\uffff\1\14\1\15\1\16\1\17\11\uffff\1\44\2\uffff\1\50\1\51\1\52\1\53\20\uffff\1\124\3\uffff\1\131\1\132\2\uffff\1\121\1\uffff\1\124\1\2\3\uffff\1\4\2\uffff\1\7\1\uffff\1\10\2\uffff\1\11\3\uffff\1\12\1\13\1\14\1\15\1\16\1\17\17\uffff\1\44\4\uffff\1\50\1\51\1\52\1\53\1\uffff\1\56\5\uffff\1\104\1\uffff\1\72\10\uffff\1\122\1\120\1\uffff\1\125\1\126\1\127\1\130\1\131\3\uffff\1\123\1\3\1\uffff\1\75\36\uffff\1\60\12\uffff\1\103\10\uffff\1\74\5\uffff\1\22\22\uffff\1\42\6\uffff\1\66\2\uffff\1\62\1\uffff\1\70\1\71\1\73\11\uffff\1\57\2\uffff\1\32\3\uffff\1\34\2\uffff\1\20\1\uffff\1\21\1\40\6\uffff\1\37\15\uffff\1\76\3\uffff\1\102\4\uffff\1\117\1\1\1\113\3\uffff\1\33\1\24\1\31\1\uffff\1\54\3\uffff\1\26\2\uffff\1\30\3\uffff\1\41\1\101\5\uffff\1\55\1\110\1\111\10\uffff\1\36\1\uffff\1\35\4\uffff\1\64\4\uffff\1\46\3\uffff\1\116\4\uffff\1\112\4\uffff\1\25\1\uffff\1\61\1\43\4\uffff\1\115\1\65\5\uffff\1\114\1\5\6\uffff\1\63\1\uffff\1\77\1\106\1\uffff\1\107\1\6\1\23\1\27\1\47\1\67\2\uffff\1\105\1\uffff\1\100\1\uffff\1\45";
    static final String DFA13_specialS =
        "\1\2\56\uffff\1\0\1\1\u014f\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\63\2\62\2\63\1\62\22\63\1\62\1\14\1\57\1\13\3\63\1\60\1\34\1\35\1\63\1\12\1\63\1\37\1\4\1\61\1\54\10\52\1\54\1\27\2\63\1\2\1\63\1\15\1\63\1\53\1\10\1\22\1\21\1\20\1\53\1\17\1\53\1\30\1\56\1\5\1\56\1\25\1\11\1\42\1\24\1\6\1\7\4\56\1\23\3\56\3\63\1\55\1\56\1\63\1\41\1\53\1\31\1\16\1\26\1\1\1\45\1\53\1\46\3\56\1\36\1\56\1\3\1\50\1\56\1\44\1\47\1\40\2\56\1\51\1\43\2\56\1\32\1\63\1\33\uff82\63",
            "\1\70\10\67\1\70\7\uffff\32\70\4\uffff\1\70\1\uffff\10\70\1\65\10\70\1\64\10\70",
            "",
            "\1\74\7\uffff\1\72\6\uffff\1\73",
            "\1\75",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\10\70\1\76\4\70\1\77\14\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\24\70\1\101\5\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\10\70\1\103\5\70\1\104\13\70",
            "\1\70\10\67\1\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\106\7\70\1\110\2\70\1\107\16\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "",
            "",
            "\1\70\10\67\1\70\7\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\117\2\70\1\120\5\70",
            "\1\70\10\67\1\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\122\15\70\1\121\13\70",
            "\1\70\10\67\1\70\7\uffff\32\70\4\uffff\1\70\1\uffff\27\70\1\123\2\70",
            "\1\70\10\67\1\70\7\uffff\32\70\4\uffff\1\70\1\uffff\24\70\1\124\5\70",
            "\1\70\10\67\1\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\126\6\70\1\125\22\70",
            "\1\127",
            "\1\130\12\uffff\1\131\2\uffff\1\132\2\uffff\1\133",
            "\1\134",
            "\1\70\10\67\1\70\7\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\135\14\70",
            "",
            "\1\137",
            "\1\70\10\67\1\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\141\6\70\1\142\14\70\1\140\5\70",
            "",
            "",
            "",
            "",
            "\1\147",
            "\1\150",
            "\1\152\1\153\5\uffff\1\151",
            "\1\70\10\67\1\70\7\uffff\32\70\4\uffff\1\70\1\uffff\6\70\1\155\6\70\1\154\14\70",
            "\1\157",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\161\3\uffff\1\162",
            "\1\70\10\67\1\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\163\31\70",
            "\1\164",
            "\1\165",
            "\1\167\2\uffff\1\166",
            "\1\170",
            "\1\172\1\uffff\12\173",
            "\1\70\10\67\1\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\172\1\uffff\12\173",
            "\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\0\175",
            "\0\175",
            "\1\176\4\uffff\1\177",
            "",
            "",
            "\1\u0081\11\uffff\1\u0082",
            "\1\u0083",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0086",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\1\u0088",
            "\1\u0089",
            "",
            "\1\u008a",
            "",
            "\1\u008b",
            "\1\u008c",
            "",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097\2\uffff\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2\2\uffff\1\u00a3",
            "\1\u00a4",
            "",
            "",
            "",
            "",
            "\1\u00a5",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00a7\14\uffff\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "",
            "\1\u00ac",
            "",
            "\1\u00ad",
            "\1\u00af\2\uffff\1\u00ae",
            "\1\u00b0",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b6\5\uffff\1\u00b5",
            "",
            "",
            "\1\172\1\uffff\12\173",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u00d2\25\70",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00db",
            "\1\u00dc",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00de",
            "\1\u00df",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00ec",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\22\70\1\u00ed\7\70",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\1\u00f3",
            "\1\u00f4",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00f6",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "",
            "\1\u010b",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\22\70\1\u010c\7\70",
            "",
            "\1\u010e",
            "",
            "",
            "",
            "\1\u010f",
            "\1\u0110",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0119",
            "",
            "\1\u011a",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\22\70\1\u011b\7\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u011f",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "\1\u0121",
            "\1\u0122",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\14\70\1\u0123\15\70",
            "\1\u0125",
            "\1\u0126",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "",
            "",
            "",
            "\1\u013c",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u013e",
            "",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "",
            "\1\u0143",
            "\1\u0144",
            "",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "",
            "",
            "\1\u0148",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0153",
            "\1\u0154",
            "",
            "\1\u0155",
            "",
            "\1\u0156",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0158",
            "\1\u0159",
            "",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\22\70\1\u015e\7\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0161",
            "",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0168",
            "\1\u0169",
            "",
            "\1\u016a",
            "",
            "",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "\1\u016f",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0172",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "",
            "\1\u017a",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u017c",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\1\u017e",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | RULE_MOVENUMBER | RULE_LETTER | RULE_RANKDIGIT | RULE_SQUARETERMINAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_47 = input.LA(1);

                        s = -1;
                        if ( ((LA13_47>='\u0000' && LA13_47<='\uFFFF')) ) {s = 125;}

                        else s = 51;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_48 = input.LA(1);

                        s = -1;
                        if ( ((LA13_48>='\u0000' && LA13_48<='\uFFFF')) ) {s = 125;}

                        else s = 51;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='f') ) {s = 1;}

                        else if ( (LA13_0=='=') ) {s = 2;}

                        else if ( (LA13_0=='o') ) {s = 3;}

                        else if ( (LA13_0=='.') ) {s = 4;}

                        else if ( (LA13_0=='K') ) {s = 5;}

                        else if ( (LA13_0=='Q') ) {s = 6;}

                        else if ( (LA13_0=='R') ) {s = 7;}

                        else if ( (LA13_0=='B') ) {s = 8;}

                        else if ( (LA13_0=='N') ) {s = 9;}

                        else if ( (LA13_0=='+') ) {s = 10;}

                        else if ( (LA13_0=='#') ) {s = 11;}

                        else if ( (LA13_0=='!') ) {s = 12;}

                        else if ( (LA13_0=='?') ) {s = 13;}

                        else if ( (LA13_0=='d') ) {s = 14;}

                        else if ( (LA13_0=='G') ) {s = 15;}

                        else if ( (LA13_0=='E') ) {s = 16;}

                        else if ( (LA13_0=='D') ) {s = 17;}

                        else if ( (LA13_0=='C') ) {s = 18;}

                        else if ( (LA13_0=='W') ) {s = 19;}

                        else if ( (LA13_0=='P') ) {s = 20;}

                        else if ( (LA13_0=='M') ) {s = 21;}

                        else if ( (LA13_0=='e') ) {s = 22;}

                        else if ( (LA13_0==':') ) {s = 23;}

                        else if ( (LA13_0=='I') ) {s = 24;}

                        else if ( (LA13_0=='c') ) {s = 25;}

                        else if ( (LA13_0=='{') ) {s = 26;}

                        else if ( (LA13_0=='}') ) {s = 27;}

                        else if ( (LA13_0=='(') ) {s = 28;}

                        else if ( (LA13_0==')') ) {s = 29;}

                        else if ( (LA13_0=='m') ) {s = 30;}

                        else if ( (LA13_0=='-') ) {s = 31;}

                        else if ( (LA13_0=='t') ) {s = 32;}

                        else if ( (LA13_0=='a') ) {s = 33;}

                        else if ( (LA13_0=='O') ) {s = 34;}

                        else if ( (LA13_0=='x') ) {s = 35;}

                        else if ( (LA13_0=='r') ) {s = 36;}

                        else if ( (LA13_0=='g') ) {s = 37;}

                        else if ( (LA13_0=='i') ) {s = 38;}

                        else if ( (LA13_0=='s') ) {s = 39;}

                        else if ( (LA13_0=='p') ) {s = 40;}

                        else if ( (LA13_0=='w') ) {s = 41;}

                        else if ( ((LA13_0>='1' && LA13_0<='8')) ) {s = 42;}

                        else if ( (LA13_0=='A'||LA13_0=='F'||LA13_0=='H'||LA13_0=='b'||LA13_0=='h') ) {s = 43;}

                        else if ( (LA13_0=='0'||LA13_0=='9') ) {s = 44;}

                        else if ( (LA13_0=='^') ) {s = 45;}

                        else if ( (LA13_0=='J'||LA13_0=='L'||(LA13_0>='S' && LA13_0<='V')||(LA13_0>='X' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='j' && LA13_0<='l')||LA13_0=='n'||LA13_0=='q'||(LA13_0>='u' && LA13_0<='v')||(LA13_0>='y' && LA13_0<='z')) ) {s = 46;}

                        else if ( (LA13_0=='\"') ) {s = 47;}

                        else if ( (LA13_0=='\'') ) {s = 48;}

                        else if ( (LA13_0=='/') ) {s = 49;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 50;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='$' && LA13_0<='&')||LA13_0=='*'||LA13_0==','||(LA13_0>=';' && LA13_0<='<')||LA13_0=='>'||LA13_0=='@'||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 51;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}