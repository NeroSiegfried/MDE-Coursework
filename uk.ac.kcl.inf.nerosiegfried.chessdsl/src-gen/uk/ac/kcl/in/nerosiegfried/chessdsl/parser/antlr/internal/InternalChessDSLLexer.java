package uk.ac.kcl.in.nerosiegfried.chessdsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalChessDSLLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_SAN_TOKEN=6;
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
    public static final int RULE_ID=7;
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

    public InternalChessDSLLexer() {;} 
    public InternalChessDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalChessDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalChessDSL.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:11:7: ( 'Game' )
            // InternalChessDSL.g:11:9: 'Game'
            {
            match("Game"); 


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
            // InternalChessDSL.g:12:7: ( 'Players:' )
            // InternalChessDSL.g:12:9: 'Players:'
            {
            match("Players:"); 


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
            // InternalChessDSL.g:13:7: ( 'Moves:' )
            // InternalChessDSL.g:13:9: 'Moves:'
            {
            match("Moves:"); 


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
            // InternalChessDSL.g:14:7: ( 'end' )
            // InternalChessDSL.g:14:9: 'end'
            {
            match("end"); 


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
            // InternalChessDSL.g:15:7: ( ':' )
            // InternalChessDSL.g:15:9: ':'
            {
            match(':'); 

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
            // InternalChessDSL.g:16:7: ( 'InitialState' )
            // InternalChessDSL.g:16:9: 'InitialState'
            {
            match("InitialState"); 


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
            // InternalChessDSL.g:17:7: ( 'fresh' )
            // InternalChessDSL.g:17:9: 'fresh'
            {
            match("fresh"); 


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
            // InternalChessDSL.g:18:7: ( 'custom' )
            // InternalChessDSL.g:18:9: 'custom'
            {
            match("custom"); 


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
            // InternalChessDSL.g:19:7: ( 'Positions:' )
            // InternalChessDSL.g:19:9: 'Positions:'
            {
            match("Positions:"); 


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
            // InternalChessDSL.g:20:7: ( '{' )
            // InternalChessDSL.g:20:9: '{'
            {
            match('{'); 

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
            // InternalChessDSL.g:21:7: ( '}' )
            // InternalChessDSL.g:21:9: '}'
            {
            match('}'); 

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
            // InternalChessDSL.g:22:7: ( '=' )
            // InternalChessDSL.g:22:9: '='
            {
            match('='); 

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
            // InternalChessDSL.g:23:7: ( 'on' )
            // InternalChessDSL.g:23:9: 'on'
            {
            match("on"); 


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
            // InternalChessDSL.g:24:7: ( '...' )
            // InternalChessDSL.g:24:9: '...'
            {
            match("..."); 


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
            // InternalChessDSL.g:25:7: ( '(' )
            // InternalChessDSL.g:25:9: '('
            {
            match('('); 

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
            // InternalChessDSL.g:26:7: ( ')' )
            // InternalChessDSL.g:26:9: ')'
            {
            match(')'); 

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
            // InternalChessDSL.g:27:7: ( 'dummy' )
            // InternalChessDSL.g:27:9: 'dummy'
            {
            match("dummy"); 


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
            // InternalChessDSL.g:28:7: ( 'moves' )
            // InternalChessDSL.g:28:9: 'moves'
            {
            match("moves"); 


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
            // InternalChessDSL.g:29:7: ( '->' )
            // InternalChessDSL.g:29:9: '->'
            {
            match("->"); 


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
            // InternalChessDSL.g:30:7: ( 'from' )
            // InternalChessDSL.g:30:9: 'from'
            {
            match("from"); 


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
            // InternalChessDSL.g:31:7: ( 'to' )
            // InternalChessDSL.g:31:9: 'to'
            {
            match("to"); 


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
            // InternalChessDSL.g:32:7: ( 'Capture(' )
            // InternalChessDSL.g:32:9: 'Capture('
            {
            match("Capture("); 


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
            // InternalChessDSL.g:33:7: ( 'and' )
            // InternalChessDSL.g:33:9: 'and'
            {
            match("and"); 


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
            // InternalChessDSL.g:34:7: ( 'captures' )
            // InternalChessDSL.g:34:9: 'captures'
            {
            match("captures"); 


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
            // InternalChessDSL.g:35:7: ( 'Castle(' )
            // InternalChessDSL.g:35:9: 'Castle('
            {
            match("Castle("); 


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
            // InternalChessDSL.g:36:7: ( 'Kingside' )
            // InternalChessDSL.g:36:9: 'Kingside'
            {
            match("Kingside"); 


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
            // InternalChessDSL.g:37:7: ( 'Queenside' )
            // InternalChessDSL.g:37:9: 'Queenside'
            {
            match("Queenside"); 


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
            // InternalChessDSL.g:38:7: ( 'castles' )
            // InternalChessDSL.g:38:9: 'castles'
            {
            match("castles"); 


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
            // InternalChessDSL.g:39:7: ( 'the' )
            // InternalChessDSL.g:39:9: 'the'
            {
            match("the"); 


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
            // InternalChessDSL.g:40:7: ( 'Promotion(' )
            // InternalChessDSL.g:40:9: 'Promotion('
            {
            match("Promotion("); 


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
            // InternalChessDSL.g:41:7: ( 'ran' )
            // InternalChessDSL.g:41:9: 'ran'
            {
            match("ran"); 


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
            // InternalChessDSL.g:42:7: ( 'out' )
            // InternalChessDSL.g:42:9: 'out'
            {
            match("out"); 


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
            // InternalChessDSL.g:43:7: ( 'of' )
            // InternalChessDSL.g:43:9: 'of'
            {
            match("of"); 


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
            // InternalChessDSL.g:44:7: ( 'time' )
            // InternalChessDSL.g:44:9: 'time'
            {
            match("time"); 


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
            // InternalChessDSL.g:45:7: ( 'resigned' )
            // InternalChessDSL.g:45:9: 'resigned'
            {
            match("resigned"); 


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
            // InternalChessDSL.g:46:7: ( 'checkmated' )
            // InternalChessDSL.g:46:9: 'checkmated'
            {
            match("checkmated"); 


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
            // InternalChessDSL.g:47:7: ( 'ended' )
            // InternalChessDSL.g:47:9: 'ended'
            {
            match("ended"); 


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
            // InternalChessDSL.g:48:7: ( 'game' )
            // InternalChessDSL.g:48:9: 'game'
            {
            match("game"); 


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
            // InternalChessDSL.g:49:7: ( 'in' )
            // InternalChessDSL.g:49:9: 'in'
            {
            match("in"); 


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
            // InternalChessDSL.g:50:7: ( 'a' )
            // InternalChessDSL.g:50:9: 'a'
            {
            match('a'); 

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
            // InternalChessDSL.g:51:7: ( 'stalemate' )
            // InternalChessDSL.g:51:9: 'stalemate'
            {
            match("stalemate"); 


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
            // InternalChessDSL.g:52:7: ( 'repeated' )
            // InternalChessDSL.g:52:9: 'repeated'
            {
            match("repeated"); 


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
            // InternalChessDSL.g:53:7: ( 'position' )
            // InternalChessDSL.g:53:9: 'position'
            {
            match("position"); 


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
            // InternalChessDSL.g:54:7: ( 'three' )
            // InternalChessDSL.g:54:9: 'three'
            {
            match("three"); 


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
            // InternalChessDSL.g:55:7: ( 'times' )
            // InternalChessDSL.g:55:9: 'times'
            {
            match("times"); 


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
            // InternalChessDSL.g:56:7: ( 'played' )
            // InternalChessDSL.g:56:9: 'played'
            {
            match("played"); 


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
            // InternalChessDSL.g:57:7: ( 'fifty' )
            // InternalChessDSL.g:57:9: 'fifty'
            {
            match("fifty"); 


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
            // InternalChessDSL.g:58:7: ( 'without' )
            // InternalChessDSL.g:58:9: 'without'
            {
            match("without"); 


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
            // InternalChessDSL.g:59:7: ( 'capture' )
            // InternalChessDSL.g:59:9: 'capture'
            {
            match("capture"); 


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
            // InternalChessDSL.g:60:7: ( 'agreed' )
            // InternalChessDSL.g:60:9: 'agreed'
            {
            match("agreed"); 


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
            // InternalChessDSL.g:61:7: ( 'draw' )
            // InternalChessDSL.g:61:9: 'draw'
            {
            match("draw"); 


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
            // InternalChessDSL.g:62:7: ( 'wins' )
            // InternalChessDSL.g:62:9: 'wins'
            {
            match("wins"); 


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
            // InternalChessDSL.g:63:7: ( 'Good' )
            // InternalChessDSL.g:63:9: 'Good'
            {
            match("Good"); 


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
            // InternalChessDSL.g:64:7: ( 'Bad' )
            // InternalChessDSL.g:64:9: 'Bad'
            {
            match("Bad"); 


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
            // InternalChessDSL.g:65:7: ( 'Excellent' )
            // InternalChessDSL.g:65:9: 'Excellent'
            {
            match("Excellent"); 


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
            // InternalChessDSL.g:66:7: ( 'Risky' )
            // InternalChessDSL.g:66:9: 'Risky'
            {
            match("Risky"); 


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
            // InternalChessDSL.g:67:7: ( 'Dubious' )
            // InternalChessDSL.g:67:9: 'Dubious'
            {
            match("Dubious"); 


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
            // InternalChessDSL.g:68:7: ( 'Check' )
            // InternalChessDSL.g:68:9: 'Check'
            {
            match("Check"); 


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
            // InternalChessDSL.g:69:7: ( 'Checkmate' )
            // InternalChessDSL.g:69:9: 'Checkmate'
            {
            match("Checkmate"); 


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
            // InternalChessDSL.g:70:7: ( 'White' )
            // InternalChessDSL.g:70:9: 'White'
            {
            match("White"); 


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
            // InternalChessDSL.g:71:7: ( 'Black' )
            // InternalChessDSL.g:71:9: 'Black'
            {
            match("Black"); 


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
            // InternalChessDSL.g:72:7: ( 'King' )
            // InternalChessDSL.g:72:9: 'King'
            {
            match("King"); 


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
            // InternalChessDSL.g:73:7: ( 'Queen' )
            // InternalChessDSL.g:73:9: 'Queen'
            {
            match("Queen"); 


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
            // InternalChessDSL.g:74:7: ( 'Rook' )
            // InternalChessDSL.g:74:9: 'Rook'
            {
            match("Rook"); 


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
            // InternalChessDSL.g:75:7: ( 'Bishop' )
            // InternalChessDSL.g:75:9: 'Bishop'
            {
            match("Bishop"); 


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
            // InternalChessDSL.g:76:7: ( 'Knight' )
            // InternalChessDSL.g:76:9: 'Knight'
            {
            match("Knight"); 


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
            // InternalChessDSL.g:77:7: ( 'Pawn' )
            // InternalChessDSL.g:77:9: 'Pawn'
            {
            match("Pawn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "RULE_MOVENUMBER"
    public final void mRULE_MOVENUMBER() throws RecognitionException {
        try {
            int _type = RULE_MOVENUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:2445:17: ( ( '0' .. '9' )+ '.' )
            // InternalChessDSL.g:2445:19: ( '0' .. '9' )+ '.'
            {
            // InternalChessDSL.g:2445:19: ( '0' .. '9' )+
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
            	    // InternalChessDSL.g:2445:20: '0' .. '9'
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

    // $ANTLR start "RULE_SAN_TOKEN"
    public final void mRULE_SAN_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_SAN_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:2447:16: ( RULE_ESCAPE ( 'O-O' ( '-O' )? | ( 'K' | 'Q' | 'R' | 'B' | 'N' )? ( RULE_LETTER | RULE_RANKDIGIT )* ( 'x' )? RULE_SQUARETERMINAL ( '=' ( 'Q' | 'R' | 'B' | 'N' ) )? ( '+' | '#' )* ( '!' | '?' )* ) )
            // InternalChessDSL.g:2447:18: RULE_ESCAPE ( 'O-O' ( '-O' )? | ( 'K' | 'Q' | 'R' | 'B' | 'N' )? ( RULE_LETTER | RULE_RANKDIGIT )* ( 'x' )? RULE_SQUARETERMINAL ( '=' ( 'Q' | 'R' | 'B' | 'N' ) )? ( '+' | '#' )* ( '!' | '?' )* )
            {
            mRULE_ESCAPE(); 
            // InternalChessDSL.g:2447:30: ( 'O-O' ( '-O' )? | ( 'K' | 'Q' | 'R' | 'B' | 'N' )? ( RULE_LETTER | RULE_RANKDIGIT )* ( 'x' )? RULE_SQUARETERMINAL ( '=' ( 'Q' | 'R' | 'B' | 'N' ) )? ( '+' | '#' )* ( '!' | '?' )* )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='O') ) {
                alt9=1;
            }
            else if ( ((LA9_0>='1' && LA9_0<='8')||LA9_0=='B'||LA9_0=='K'||LA9_0=='N'||(LA9_0>='Q' && LA9_0<='R')||(LA9_0>='a' && LA9_0<='h')||LA9_0=='x') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalChessDSL.g:2447:31: 'O-O' ( '-O' )?
                    {
                    match("O-O"); 

                    // InternalChessDSL.g:2447:37: ( '-O' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='-') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalChessDSL.g:2447:37: '-O'
                            {
                            match("-O"); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:2447:43: ( 'K' | 'Q' | 'R' | 'B' | 'N' )? ( RULE_LETTER | RULE_RANKDIGIT )* ( 'x' )? RULE_SQUARETERMINAL ( '=' ( 'Q' | 'R' | 'B' | 'N' ) )? ( '+' | '#' )* ( '!' | '?' )*
                    {
                    // InternalChessDSL.g:2447:43: ( 'K' | 'Q' | 'R' | 'B' | 'N' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='B'||LA3_0=='K'||LA3_0=='N'||(LA3_0>='Q' && LA3_0<='R')) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalChessDSL.g:
                            {
                            if ( input.LA(1)=='B'||input.LA(1)=='K'||input.LA(1)=='N'||(input.LA(1)>='Q' && input.LA(1)<='R') ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    // InternalChessDSL.g:2447:66: ( RULE_LETTER | RULE_RANKDIGIT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='a' && LA4_0<='h')) ) {
                            int LA4_2 = input.LA(2);

                            if ( ((LA4_2>='1' && LA4_2<='8')) ) {
                                int LA4_4 = input.LA(3);

                                if ( ((LA4_4>='1' && LA4_4<='8')||(LA4_4>='a' && LA4_4<='h')||LA4_4=='x') ) {
                                    alt4=1;
                                }


                            }
                            else if ( ((LA4_2>='a' && LA4_2<='h')||LA4_2=='x') ) {
                                alt4=1;
                            }


                        }
                        else if ( ((LA4_0>='1' && LA4_0<='8')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalChessDSL.g:
                    	    {
                    	    if ( (input.LA(1)>='1' && input.LA(1)<='8')||(input.LA(1)>='a' && input.LA(1)<='h') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // InternalChessDSL.g:2447:96: ( 'x' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='x') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalChessDSL.g:2447:96: 'x'
                            {
                            match('x'); 

                            }
                            break;

                    }

                    mRULE_SQUARETERMINAL(); 
                    // InternalChessDSL.g:2447:121: ( '=' ( 'Q' | 'R' | 'B' | 'N' ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='=') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalChessDSL.g:2447:122: '=' ( 'Q' | 'R' | 'B' | 'N' )
                            {
                            match('='); 
                            if ( input.LA(1)=='B'||input.LA(1)=='N'||(input.LA(1)>='Q' && input.LA(1)<='R') ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    // InternalChessDSL.g:2447:146: ( '+' | '#' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='#'||LA7_0=='+') ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalChessDSL.g:
                    	    {
                    	    if ( input.LA(1)=='#'||input.LA(1)=='+' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    // InternalChessDSL.g:2447:157: ( '!' | '?' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='!'||LA8_0=='?') ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalChessDSL.g:
                    	    {
                    	    if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


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
    // $ANTLR end "RULE_SAN_TOKEN"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            // InternalChessDSL.g:2449:22: ( 'a' .. 'h' )
            // InternalChessDSL.g:2449:24: 'a' .. 'h'
            {
            matchRange('a','h'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_RANKDIGIT"
    public final void mRULE_RANKDIGIT() throws RecognitionException {
        try {
            // InternalChessDSL.g:2451:25: ( '1' .. '8' )
            // InternalChessDSL.g:2451:27: '1' .. '8'
            {
            matchRange('1','8'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_RANKDIGIT"

    // $ANTLR start "RULE_ESCAPE"
    public final void mRULE_ESCAPE() throws RecognitionException {
        try {
            // InternalChessDSL.g:2453:22: ( '@' )
            // InternalChessDSL.g:2453:24: '@'
            {
            match('@'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ESCAPE"

    // $ANTLR start "RULE_SQUARETERMINAL"
    public final void mRULE_SQUARETERMINAL() throws RecognitionException {
        try {
            int _type = RULE_SQUARETERMINAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:2455:21: ( RULE_LETTER RULE_RANKDIGIT )
            // InternalChessDSL.g:2455:23: RULE_LETTER RULE_RANKDIGIT
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
            // InternalChessDSL.g:2457:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalChessDSL.g:2457:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalChessDSL.g:2457:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalChessDSL.g:2457:11: '^'
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

            // InternalChessDSL.g:2457:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
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
            	    break loop11;
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
            // InternalChessDSL.g:2459:10: ( ( '0' .. '9' )+ )
            // InternalChessDSL.g:2459:12: ( '0' .. '9' )+
            {
            // InternalChessDSL.g:2459:12: ( '0' .. '9' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalChessDSL.g:2459:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalChessDSL.g:2461:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalChessDSL.g:2461:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalChessDSL.g:2461:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\"') ) {
                alt15=1;
            }
            else if ( (LA15_0=='\'') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalChessDSL.g:2461:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalChessDSL.g:2461:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='!')||(LA13_0>='#' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalChessDSL.g:2461:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalChessDSL.g:2461:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop13;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalChessDSL.g:2461:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalChessDSL.g:2461:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalChessDSL.g:2461:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalChessDSL.g:2461:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop14;
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
            // InternalChessDSL.g:2463:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalChessDSL.g:2463:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalChessDSL.g:2463:24: ( options {greedy=false; } : . )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='*') ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1=='/') ) {
                        alt16=2;
                    }
                    else if ( ((LA16_1>='\u0000' && LA16_1<='.')||(LA16_1>='0' && LA16_1<='\uFFFF')) ) {
                        alt16=1;
                    }


                }
                else if ( ((LA16_0>='\u0000' && LA16_0<=')')||(LA16_0>='+' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalChessDSL.g:2463:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop16;
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
            // InternalChessDSL.g:2465:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalChessDSL.g:2465:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalChessDSL.g:2465:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalChessDSL.g:2465:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop17;
                }
            } while (true);

            // InternalChessDSL.g:2465:40: ( ( '\\r' )? '\\n' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\n'||LA19_0=='\r') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalChessDSL.g:2465:41: ( '\\r' )? '\\n'
                    {
                    // InternalChessDSL.g:2465:41: ( '\\r' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\r') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalChessDSL.g:2465:41: '\\r'
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
            // InternalChessDSL.g:2467:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalChessDSL.g:2467:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalChessDSL.g:2467:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {
                    alt20=1;
                }


                switch (alt20) {
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
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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
            // InternalChessDSL.g:2469:16: ( . )
            // InternalChessDSL.g:2469:18: .
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
        // InternalChessDSL.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | RULE_MOVENUMBER | RULE_SAN_TOKEN | RULE_SQUARETERMINAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt21=77;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // InternalChessDSL.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalChessDSL.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalChessDSL.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalChessDSL.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalChessDSL.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalChessDSL.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalChessDSL.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalChessDSL.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalChessDSL.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalChessDSL.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalChessDSL.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalChessDSL.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // InternalChessDSL.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // InternalChessDSL.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // InternalChessDSL.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // InternalChessDSL.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // InternalChessDSL.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // InternalChessDSL.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // InternalChessDSL.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // InternalChessDSL.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // InternalChessDSL.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // InternalChessDSL.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // InternalChessDSL.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // InternalChessDSL.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // InternalChessDSL.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // InternalChessDSL.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // InternalChessDSL.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // InternalChessDSL.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // InternalChessDSL.g:1:178: T__45
                {
                mT__45(); 

                }
                break;
            case 30 :
                // InternalChessDSL.g:1:184: T__46
                {
                mT__46(); 

                }
                break;
            case 31 :
                // InternalChessDSL.g:1:190: T__47
                {
                mT__47(); 

                }
                break;
            case 32 :
                // InternalChessDSL.g:1:196: T__48
                {
                mT__48(); 

                }
                break;
            case 33 :
                // InternalChessDSL.g:1:202: T__49
                {
                mT__49(); 

                }
                break;
            case 34 :
                // InternalChessDSL.g:1:208: T__50
                {
                mT__50(); 

                }
                break;
            case 35 :
                // InternalChessDSL.g:1:214: T__51
                {
                mT__51(); 

                }
                break;
            case 36 :
                // InternalChessDSL.g:1:220: T__52
                {
                mT__52(); 

                }
                break;
            case 37 :
                // InternalChessDSL.g:1:226: T__53
                {
                mT__53(); 

                }
                break;
            case 38 :
                // InternalChessDSL.g:1:232: T__54
                {
                mT__54(); 

                }
                break;
            case 39 :
                // InternalChessDSL.g:1:238: T__55
                {
                mT__55(); 

                }
                break;
            case 40 :
                // InternalChessDSL.g:1:244: T__56
                {
                mT__56(); 

                }
                break;
            case 41 :
                // InternalChessDSL.g:1:250: T__57
                {
                mT__57(); 

                }
                break;
            case 42 :
                // InternalChessDSL.g:1:256: T__58
                {
                mT__58(); 

                }
                break;
            case 43 :
                // InternalChessDSL.g:1:262: T__59
                {
                mT__59(); 

                }
                break;
            case 44 :
                // InternalChessDSL.g:1:268: T__60
                {
                mT__60(); 

                }
                break;
            case 45 :
                // InternalChessDSL.g:1:274: T__61
                {
                mT__61(); 

                }
                break;
            case 46 :
                // InternalChessDSL.g:1:280: T__62
                {
                mT__62(); 

                }
                break;
            case 47 :
                // InternalChessDSL.g:1:286: T__63
                {
                mT__63(); 

                }
                break;
            case 48 :
                // InternalChessDSL.g:1:292: T__64
                {
                mT__64(); 

                }
                break;
            case 49 :
                // InternalChessDSL.g:1:298: T__65
                {
                mT__65(); 

                }
                break;
            case 50 :
                // InternalChessDSL.g:1:304: T__66
                {
                mT__66(); 

                }
                break;
            case 51 :
                // InternalChessDSL.g:1:310: T__67
                {
                mT__67(); 

                }
                break;
            case 52 :
                // InternalChessDSL.g:1:316: T__68
                {
                mT__68(); 

                }
                break;
            case 53 :
                // InternalChessDSL.g:1:322: T__69
                {
                mT__69(); 

                }
                break;
            case 54 :
                // InternalChessDSL.g:1:328: T__70
                {
                mT__70(); 

                }
                break;
            case 55 :
                // InternalChessDSL.g:1:334: T__71
                {
                mT__71(); 

                }
                break;
            case 56 :
                // InternalChessDSL.g:1:340: T__72
                {
                mT__72(); 

                }
                break;
            case 57 :
                // InternalChessDSL.g:1:346: T__73
                {
                mT__73(); 

                }
                break;
            case 58 :
                // InternalChessDSL.g:1:352: T__74
                {
                mT__74(); 

                }
                break;
            case 59 :
                // InternalChessDSL.g:1:358: T__75
                {
                mT__75(); 

                }
                break;
            case 60 :
                // InternalChessDSL.g:1:364: T__76
                {
                mT__76(); 

                }
                break;
            case 61 :
                // InternalChessDSL.g:1:370: T__77
                {
                mT__77(); 

                }
                break;
            case 62 :
                // InternalChessDSL.g:1:376: T__78
                {
                mT__78(); 

                }
                break;
            case 63 :
                // InternalChessDSL.g:1:382: T__79
                {
                mT__79(); 

                }
                break;
            case 64 :
                // InternalChessDSL.g:1:388: T__80
                {
                mT__80(); 

                }
                break;
            case 65 :
                // InternalChessDSL.g:1:394: T__81
                {
                mT__81(); 

                }
                break;
            case 66 :
                // InternalChessDSL.g:1:400: T__82
                {
                mT__82(); 

                }
                break;
            case 67 :
                // InternalChessDSL.g:1:406: T__83
                {
                mT__83(); 

                }
                break;
            case 68 :
                // InternalChessDSL.g:1:412: RULE_MOVENUMBER
                {
                mRULE_MOVENUMBER(); 

                }
                break;
            case 69 :
                // InternalChessDSL.g:1:428: RULE_SAN_TOKEN
                {
                mRULE_SAN_TOKEN(); 

                }
                break;
            case 70 :
                // InternalChessDSL.g:1:443: RULE_SQUARETERMINAL
                {
                mRULE_SQUARETERMINAL(); 

                }
                break;
            case 71 :
                // InternalChessDSL.g:1:463: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 72 :
                // InternalChessDSL.g:1:471: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 73 :
                // InternalChessDSL.g:1:480: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 74 :
                // InternalChessDSL.g:1:492: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 75 :
                // InternalChessDSL.g:1:508: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 76 :
                // InternalChessDSL.g:1:524: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 77 :
                // InternalChessDSL.g:1:532: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA21_eotS =
        "\1\uffff\4\57\1\uffff\3\57\3\uffff\1\57\1\54\2\uffff\2\57\1\54\2\57\1\122\15\57\1\150\1\54\1\57\1\54\1\uffff\3\54\2\uffff\2\57\1\uffff\6\57\1\166\1\uffff\6\57\3\uffff\1\177\1\57\1\u0081\3\uffff\3\57\1\uffff\1\u0085\6\57\1\uffff\6\57\1\u0095\14\57\1\uffff\1\150\6\uffff\7\57\1\u00ab\1\uffff\10\57\1\uffff\1\u00b4\1\uffff\3\57\1\uffff\1\u00b8\5\57\1\u00be\4\57\1\u00c3\3\57\1\uffff\5\57\1\u00cc\7\57\1\u00d4\1\u00d5\3\57\1\u00d9\2\57\1\uffff\2\57\1\u00de\5\57\1\uffff\1\57\1\u00e5\1\57\1\uffff\1\57\1\u00e9\3\57\1\uffff\1\57\1\u00ef\2\57\1\uffff\2\57\1\u00f4\4\57\1\u00f9\1\uffff\4\57\1\u00fe\2\57\2\uffff\3\57\1\uffff\1\57\1\u0105\1\57\1\u0107\1\uffff\1\u0108\4\57\1\u010d\1\uffff\1\u010e\1\u010f\1\u0110\1\uffff\2\57\1\u0114\2\57\1\uffff\1\57\1\u0119\2\57\1\uffff\4\57\1\uffff\1\u0120\2\57\1\u0123\1\uffff\1\57\1\u0125\3\57\2\uffff\1\57\2\uffff\1\u012a\3\57\4\uffff\3\57\1\uffff\1\u0131\1\57\1\u0133\1\57\1\uffff\4\57\1\u0139\1\57\1\uffff\1\u013b\1\57\1\uffff\1\57\1\uffff\4\57\1\uffff\1\u0143\1\u0144\2\57\1\uffff\1\57\1\uffff\1\57\1\uffff\5\57\1\uffff\1\u014e\1\uffff\1\57\1\u0150\1\uffff\3\57\1\u0154\2\uffff\1\57\1\uffff\1\57\1\u0157\1\57\1\u0159\1\u015a\1\57\1\u015c\1\uffff\1\57\1\uffff\3\57\1\uffff\1\57\1\u0162\1\uffff\1\u0163\2\uffff\1\u0164\1\uffff\1\u0165\2\uffff\1\57\1\u0167\4\uffff\1\57\1\uffff\1\u0169\1\uffff";
    static final String DFA21_eofS =
        "\u016a\uffff";
    static final String DFA21_minS =
        "\1\0\2\141\1\157\1\61\1\uffff\1\156\2\61\3\uffff\1\146\1\56\2\uffff\1\61\1\157\1\76\1\150\1\141\1\60\1\151\1\165\1\141\1\61\1\156\1\164\1\154\1\151\1\141\1\170\1\151\1\165\1\150\1\56\2\61\1\101\1\uffff\2\0\1\52\2\uffff\1\155\1\157\1\uffff\1\141\1\163\1\157\1\167\1\166\1\144\1\60\1\uffff\1\151\1\145\1\146\1\163\1\160\1\145\3\uffff\1\60\1\164\1\60\3\uffff\1\155\1\141\1\166\1\uffff\1\60\1\145\1\155\1\160\1\145\1\144\1\162\1\uffff\1\156\1\151\1\145\1\156\1\160\1\155\1\60\1\141\1\163\1\141\1\156\1\144\1\141\1\163\1\143\1\163\1\157\1\142\1\151\1\uffff\1\56\6\uffff\1\145\1\144\1\171\1\151\1\155\1\156\1\145\1\60\1\uffff\1\164\1\163\1\155\4\164\1\143\1\uffff\1\60\1\uffff\1\155\1\167\1\145\1\uffff\1\60\2\145\2\164\1\143\1\60\1\145\2\147\1\145\1\60\1\151\2\145\1\uffff\1\154\1\151\1\171\1\150\1\163\1\60\1\143\1\150\1\145\2\153\1\151\1\164\2\60\1\145\1\164\1\157\1\60\1\163\1\144\1\uffff\1\151\1\150\1\60\1\171\1\157\1\165\1\154\1\153\1\uffff\1\171\1\60\1\163\1\uffff\1\145\1\60\1\165\1\154\1\153\1\uffff\1\145\1\60\1\150\1\156\1\uffff\1\147\1\141\1\60\1\145\1\164\1\145\1\157\1\60\1\uffff\1\153\1\157\1\154\1\171\1\60\1\157\1\145\2\uffff\1\162\1\151\1\164\1\uffff\1\72\1\60\1\141\1\60\1\uffff\1\60\1\155\1\162\1\145\1\155\1\60\1\uffff\3\60\1\uffff\1\162\1\145\1\60\1\144\1\151\1\uffff\1\164\1\60\1\156\1\164\1\uffff\1\155\1\151\1\144\1\165\1\uffff\1\60\1\160\1\154\1\60\1\uffff\1\165\1\60\1\163\1\157\1\151\2\uffff\1\154\2\uffff\1\60\1\145\1\163\1\141\4\uffff\1\145\1\50\1\141\1\uffff\1\60\1\144\1\60\1\151\1\uffff\2\145\1\141\1\157\1\60\1\164\1\uffff\1\60\1\145\1\uffff\1\163\1\uffff\1\72\1\156\1\157\1\123\1\uffff\2\60\1\164\1\50\1\uffff\1\164\1\uffff\1\145\1\uffff\3\144\1\164\1\156\1\uffff\1\60\1\uffff\1\156\1\60\1\uffff\1\163\1\156\1\164\1\60\2\uffff\1\145\1\uffff\1\145\1\60\1\145\2\60\1\145\1\60\1\uffff\1\164\1\uffff\1\72\1\50\1\141\1\uffff\1\144\1\60\1\uffff\1\60\2\uffff\1\60\1\uffff\1\60\2\uffff\1\164\1\60\4\uffff\1\145\1\uffff\1\60\1\uffff";
    static final String DFA21_maxS =
        "\1\uffff\1\157\1\162\1\157\1\156\1\uffff\1\156\1\162\1\165\3\uffff\1\165\1\56\2\uffff\1\165\1\157\1\76\1\157\1\150\1\172\1\156\1\165\1\145\1\141\1\156\1\164\1\157\1\151\1\154\1\170\1\157\1\165\1\150\1\71\1\170\1\70\1\172\1\uffff\2\uffff\1\57\2\uffff\1\155\1\157\1\uffff\1\141\1\163\1\157\1\167\1\166\1\144\1\172\1\uffff\1\151\1\157\1\146\2\163\1\145\3\uffff\1\172\1\164\1\172\3\uffff\1\155\1\141\1\166\1\uffff\1\172\1\162\1\155\1\163\1\145\1\144\1\162\1\uffff\1\156\1\151\1\145\1\156\1\163\1\155\1\172\1\141\1\163\1\141\1\164\1\144\1\141\1\163\1\143\1\163\1\157\1\142\1\151\1\uffff\1\71\6\uffff\1\145\1\144\1\171\1\151\1\155\1\156\1\145\1\172\1\uffff\1\164\1\163\1\155\4\164\1\143\1\uffff\1\172\1\uffff\1\155\1\167\1\145\1\uffff\1\172\2\145\2\164\1\143\1\172\1\145\2\147\1\145\1\172\1\151\2\145\1\uffff\1\154\1\151\1\171\1\150\1\163\1\172\1\143\1\150\1\145\2\153\1\151\1\164\2\172\1\145\1\164\1\157\1\172\1\163\1\144\1\uffff\1\151\1\150\1\172\1\171\1\157\1\165\1\154\1\153\1\uffff\1\171\1\172\1\163\1\uffff\1\145\1\172\1\165\1\154\1\153\1\uffff\1\145\1\172\1\150\1\156\1\uffff\1\147\1\141\1\172\1\145\1\164\1\145\1\157\1\172\1\uffff\1\153\1\157\1\154\1\171\1\172\1\157\1\145\2\uffff\1\162\1\151\1\164\1\uffff\1\72\1\172\1\141\1\172\1\uffff\1\172\1\155\1\162\1\145\1\155\1\172\1\uffff\3\172\1\uffff\1\162\1\145\1\172\1\144\1\151\1\uffff\1\164\1\172\1\156\1\164\1\uffff\1\155\1\151\1\144\1\165\1\uffff\1\172\1\160\1\154\1\172\1\uffff\1\165\1\172\1\163\1\157\1\151\2\uffff\1\154\2\uffff\1\172\1\145\1\163\1\141\4\uffff\1\145\1\50\1\141\1\uffff\1\172\1\144\1\172\1\151\1\uffff\2\145\1\141\1\157\1\172\1\164\1\uffff\1\172\1\145\1\uffff\1\163\1\uffff\1\72\1\156\1\157\1\123\1\uffff\2\172\1\164\1\50\1\uffff\1\164\1\uffff\1\145\1\uffff\3\144\1\164\1\156\1\uffff\1\172\1\uffff\1\156\1\172\1\uffff\1\163\1\156\1\164\1\172\2\uffff\1\145\1\uffff\1\145\1\172\1\145\2\172\1\145\1\172\1\uffff\1\164\1\uffff\1\72\1\50\1\141\1\uffff\1\144\1\172\1\uffff\1\172\2\uffff\1\172\1\uffff\1\172\2\uffff\1\164\1\172\4\uffff\1\145\1\uffff\1\172\1\uffff";
    static final String DFA21_acceptS =
        "\5\uffff\1\5\3\uffff\1\12\1\13\1\14\2\uffff\1\17\1\20\27\uffff\1\107\3\uffff\1\114\1\115\2\uffff\1\107\7\uffff\1\5\6\uffff\1\12\1\13\1\14\3\uffff\1\16\1\17\1\20\3\uffff\1\23\7\uffff\1\50\23\uffff\1\104\1\uffff\1\110\1\105\1\111\1\112\1\113\1\114\10\uffff\1\106\10\uffff\1\15\1\uffff\1\41\3\uffff\1\25\17\uffff\1\47\25\uffff\1\4\10\uffff\1\40\3\uffff\1\35\5\uffff\1\27\4\uffff\1\37\10\uffff\1\66\7\uffff\1\1\1\65\3\uffff\1\103\4\uffff\1\24\6\uffff\1\63\3\uffff\1\42\5\uffff\1\76\4\uffff\1\46\4\uffff\1\64\4\uffff\1\100\5\uffff\1\3\1\45\1\uffff\1\7\1\57\4\uffff\1\21\1\22\1\54\1\55\3\uffff\1\72\4\uffff\1\77\6\uffff\1\75\2\uffff\1\70\1\uffff\1\74\4\uffff\1\10\4\uffff\1\31\1\uffff\1\62\1\uffff\1\102\5\uffff\1\56\1\uffff\1\101\2\uffff\1\2\4\uffff\1\61\1\34\1\uffff\1\26\7\uffff\1\60\1\uffff\1\71\3\uffff\1\30\2\uffff\1\32\1\uffff\1\43\1\52\1\uffff\1\53\1\uffff\1\11\1\36\2\uffff\1\73\1\33\1\51\1\67\1\uffff\1\44\1\uffff\1\6";
    static final String DFA21_specialS =
        "\1\0\47\uffff\1\1\1\2\u0140\uffff}>";
    static final String[] DFA21_transitionS = {
            "\11\54\2\53\2\54\1\53\22\54\1\53\1\54\1\50\4\54\1\51\1\16\1\17\3\54\1\22\1\15\1\52\12\43\1\5\2\54\1\13\2\54\1\44\1\47\1\36\1\24\1\41\1\37\1\47\1\1\1\47\1\6\1\47\1\26\1\47\1\3\2\47\1\2\1\27\1\40\4\47\1\42\3\47\3\54\1\46\1\47\1\54\1\25\1\45\1\10\1\20\1\4\1\7\1\31\1\45\1\32\3\47\1\21\1\47\1\14\1\34\1\47\1\30\1\33\1\23\2\47\1\35\3\47\1\11\1\54\1\12\uff82\54",
            "\1\55\15\uffff\1\56",
            "\1\63\12\uffff\1\60\2\uffff\1\61\2\uffff\1\62",
            "\1\64",
            "\10\66\65\uffff\1\65",
            "",
            "\1\70",
            "\10\66\60\uffff\1\72\10\uffff\1\71",
            "\10\66\50\uffff\1\74\6\uffff\1\75\14\uffff\1\73",
            "",
            "",
            "",
            "\1\103\7\uffff\1\101\6\uffff\1\102",
            "\1\104",
            "",
            "",
            "\10\66\71\uffff\1\110\2\uffff\1\107",
            "\1\111",
            "\1\112",
            "\1\114\1\115\5\uffff\1\113",
            "\1\116\6\uffff\1\117",
            "\1\57\10\66\1\57\7\uffff\32\57\4\uffff\1\57\1\uffff\6\57\1\121\6\57\1\120\14\57",
            "\1\123\4\uffff\1\124",
            "\1\125",
            "\1\126\3\uffff\1\127",
            "\10\66\50\uffff\1\130",
            "\1\131",
            "\1\132",
            "\1\134\2\uffff\1\133",
            "\1\135",
            "\1\136\7\uffff\1\140\2\uffff\1\137",
            "\1\141",
            "\1\142\5\uffff\1\143",
            "\1\144",
            "\1\145",
            "\1\146\1\uffff\12\147",
            "\10\151\11\uffff\1\151\10\uffff\1\151\2\uffff\2\151\1\uffff\2\151\16\uffff\10\151\17\uffff\1\151",
            "\10\66",
            "\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\0\152",
            "\0\152",
            "\1\153\4\uffff\1\154",
            "",
            "",
            "\1\156",
            "\1\157",
            "",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\167",
            "\1\170\11\uffff\1\171",
            "\1\172",
            "\1\173",
            "\1\174\2\uffff\1\175",
            "\1\176",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0080",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0086\14\uffff\1\u0087",
            "\1\u0088",
            "\1\u0089\2\uffff\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0093\2\uffff\1\u0092",
            "\1\u0094",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u009a\5\uffff\1\u0099",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "\1\146\1\uffff\12\147",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00aa\25\57",
            "",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00da",
            "\1\u00db",
            "",
            "\1\u00dc",
            "\1\u00dd",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "",
            "\1\u00e4",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00e6",
            "",
            "\1\u00e7",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u00e8\7\57",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "",
            "\1\u00ed",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u00ee\7\57",
            "\1\u00f0",
            "\1\u00f1",
            "",
            "\1\u00f2",
            "\1\u00f3",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00ff",
            "\1\u0100",
            "",
            "",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "",
            "\1\u0104",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0106",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u0111",
            "\1\u0112",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u0113\15\57",
            "\1\u0115",
            "\1\u0116",
            "",
            "\1\u0117",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u0118\7\57",
            "\1\u011a",
            "\1\u011b",
            "",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0121",
            "\1\u0122",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u0124",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "",
            "",
            "\1\u0129",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "",
            "",
            "",
            "",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0132",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0134",
            "",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u013a",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u013c",
            "",
            "\1\u013d",
            "",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u0142\7\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0145",
            "\1\u0146",
            "",
            "\1\u0147",
            "",
            "\1\u0148",
            "",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u014f",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\u0155",
            "",
            "\1\u0156",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0158",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u015b",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u015d",
            "",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "",
            "\1\u0161",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\u0166",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "\1\u0168",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | RULE_MOVENUMBER | RULE_SAN_TOKEN | RULE_SQUARETERMINAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_0 = input.LA(1);

                        s = -1;
                        if ( (LA21_0=='G') ) {s = 1;}

                        else if ( (LA21_0=='P') ) {s = 2;}

                        else if ( (LA21_0=='M') ) {s = 3;}

                        else if ( (LA21_0=='e') ) {s = 4;}

                        else if ( (LA21_0==':') ) {s = 5;}

                        else if ( (LA21_0=='I') ) {s = 6;}

                        else if ( (LA21_0=='f') ) {s = 7;}

                        else if ( (LA21_0=='c') ) {s = 8;}

                        else if ( (LA21_0=='{') ) {s = 9;}

                        else if ( (LA21_0=='}') ) {s = 10;}

                        else if ( (LA21_0=='=') ) {s = 11;}

                        else if ( (LA21_0=='o') ) {s = 12;}

                        else if ( (LA21_0=='.') ) {s = 13;}

                        else if ( (LA21_0=='(') ) {s = 14;}

                        else if ( (LA21_0==')') ) {s = 15;}

                        else if ( (LA21_0=='d') ) {s = 16;}

                        else if ( (LA21_0=='m') ) {s = 17;}

                        else if ( (LA21_0=='-') ) {s = 18;}

                        else if ( (LA21_0=='t') ) {s = 19;}

                        else if ( (LA21_0=='C') ) {s = 20;}

                        else if ( (LA21_0=='a') ) {s = 21;}

                        else if ( (LA21_0=='K') ) {s = 22;}

                        else if ( (LA21_0=='Q') ) {s = 23;}

                        else if ( (LA21_0=='r') ) {s = 24;}

                        else if ( (LA21_0=='g') ) {s = 25;}

                        else if ( (LA21_0=='i') ) {s = 26;}

                        else if ( (LA21_0=='s') ) {s = 27;}

                        else if ( (LA21_0=='p') ) {s = 28;}

                        else if ( (LA21_0=='w') ) {s = 29;}

                        else if ( (LA21_0=='B') ) {s = 30;}

                        else if ( (LA21_0=='E') ) {s = 31;}

                        else if ( (LA21_0=='R') ) {s = 32;}

                        else if ( (LA21_0=='D') ) {s = 33;}

                        else if ( (LA21_0=='W') ) {s = 34;}

                        else if ( ((LA21_0>='0' && LA21_0<='9')) ) {s = 35;}

                        else if ( (LA21_0=='@') ) {s = 36;}

                        else if ( (LA21_0=='b'||LA21_0=='h') ) {s = 37;}

                        else if ( (LA21_0=='^') ) {s = 38;}

                        else if ( (LA21_0=='A'||LA21_0=='F'||LA21_0=='H'||LA21_0=='J'||LA21_0=='L'||(LA21_0>='N' && LA21_0<='O')||(LA21_0>='S' && LA21_0<='V')||(LA21_0>='X' && LA21_0<='Z')||LA21_0=='_'||(LA21_0>='j' && LA21_0<='l')||LA21_0=='n'||LA21_0=='q'||(LA21_0>='u' && LA21_0<='v')||(LA21_0>='x' && LA21_0<='z')) ) {s = 39;}

                        else if ( (LA21_0=='\"') ) {s = 40;}

                        else if ( (LA21_0=='\'') ) {s = 41;}

                        else if ( (LA21_0=='/') ) {s = 42;}

                        else if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {s = 43;}

                        else if ( ((LA21_0>='\u0000' && LA21_0<='\b')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\u001F')||LA21_0=='!'||(LA21_0>='#' && LA21_0<='&')||(LA21_0>='*' && LA21_0<=',')||(LA21_0>=';' && LA21_0<='<')||(LA21_0>='>' && LA21_0<='?')||(LA21_0>='[' && LA21_0<=']')||LA21_0=='`'||LA21_0=='|'||(LA21_0>='~' && LA21_0<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_40 = input.LA(1);

                        s = -1;
                        if ( ((LA21_40>='\u0000' && LA21_40<='\uFFFF')) ) {s = 106;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_41 = input.LA(1);

                        s = -1;
                        if ( ((LA21_41>='\u0000' && LA21_41<='\uFFFF')) ) {s = 106;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}