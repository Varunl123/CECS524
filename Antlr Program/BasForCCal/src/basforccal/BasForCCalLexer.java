// $ANTLR 3.4 C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g 2020-04-23 09:01:50
 
    package basforccal;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class BasForCCalLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int CHAR=4;
    public static final int COMMENT=5;
    public static final int ESC_SEQ=6;
    public static final int EXPONENT=7;
    public static final int FLOAT=8;
    public static final int HEX_DIGIT=9;
    public static final int ID=10;
    public static final int INT=11;
    public static final int Number=12;
    public static final int OCTAL_ESC=13;
    public static final int STRING=14;
    public static final int UNICODE_ESC=15;
    public static final int WS=16;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public BasForCCalLexer() {} 
    public BasForCCalLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public BasForCCalLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:6:7: ( '%' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:6:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:7:7: ( '(' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:7:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:8:7: ( '()' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:8:9: '()'
            {
            match("()"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:9:7: ( ')' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:9:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:10:7: ( '*' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:10:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:11:7: ( '+' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:11:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:12:7: ( ',' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:12:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:13:7: ( '-' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:13:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:14:7: ( '.' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:14:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:15:7: ( '/' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:15:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:16:7: ( '<' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:16:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:17:7: ( '<=' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:17:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:18:7: ( '<>' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:18:9: '<>'
            {
            match("<>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:19:7: ( '=' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:19:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:20:7: ( '>' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:20:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:21:7: ( '>=' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:21:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:22:7: ( 'BEGIN' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:22:9: 'BEGIN'
            {
            match("BEGIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:23:7: ( 'CALL' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:23:9: 'CALL'
            {
            match("CALL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:24:7: ( 'CHAR' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:24:9: 'CHAR'
            {
            match("CHAR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:25:7: ( 'DO' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:25:9: 'DO'
            {
            match("DO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:26:7: ( 'END' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:26:9: 'END'
            {
            match("END"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:27:7: ( 'ENDDO' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:27:9: 'ENDDO'
            {
            match("ENDDO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:28:7: ( 'ENDIF' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:28:9: 'ENDIF'
            {
            match("ENDIF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:29:7: ( 'ENDLOOP' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:29:9: 'ENDLOOP'
            {
            match("ENDLOOP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:30:7: ( 'FLOAT' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:30:9: 'FLOAT'
            {
            match("FLOAT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:31:7: ( 'FOR' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:31:9: 'FOR'
            {
            match("FOR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:32:7: ( 'FUNCTION' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:32:9: 'FUNCTION'
            {
            match("FUNCTION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:33:7: ( 'IF' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:33:9: 'IF'
            {
            match("IF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:34:7: ( 'INT' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:34:9: 'INT'
            {
            match("INT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:35:7: ( 'LOOP' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:35:9: 'LOOP'
            {
            match("LOOP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:36:7: ( 'PROCEDURE' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:36:9: 'PROCEDURE'
            {
            match("PROCEDURE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:37:7: ( 'PROGRAM' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:37:9: 'PROGRAM'
            {
            match("PROGRAM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:38:7: ( 'THEN' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:38:9: 'THEN'
            {
            match("THEN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:39:7: ( 'TO' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:39:9: 'TO'
            {
            match("TO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:40:7: ( 'WHILE' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:40:9: 'WHILE'
            {
            match("WHILE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:107:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:107:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:107:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:110:5: ( ( '0' .. '9' )+ )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:110:7: ( '0' .. '9' )+
            {
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:110:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "Number"
    public final void mNumber() throws RecognitionException {
        try {
            int _type = Number;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:112:8: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:112:10: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:112:10: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:112:22: ( '.' ( '0' .. '9' )+ )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='.') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:112:23: '.' ( '0' .. '9' )+
                    {
                    match('.'); 

                    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:112:27: ( '0' .. '9' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
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


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Number"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:115:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt12=3;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:115:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:115:9: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    match('.'); 

                    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:115:25: ( '0' .. '9' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:115:37: ( EXPONENT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E'||LA8_0=='e') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:115:37: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:116:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 

                    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:116:13: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:116:25: ( EXPONENT )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='E'||LA10_0=='e') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:116:25: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:117:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:117:9: ( '0' .. '9' )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);


                    mEXPONENT(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:121:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='/') ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1=='/') ) {
                    alt16=1;
                }
                else if ( (LA16_1=='*') ) {
                    alt16=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:121:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:121:14: (~ ( '\\n' | '\\r' ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0 >= '\u0000' && LA13_0 <= '\t')||(LA13_0 >= '\u000B' && LA13_0 <= '\f')||(LA13_0 >= '\u000E' && LA13_0 <= '\uFFFF')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:121:28: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:121:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:122:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:122:14: ( options {greedy=false; } : . )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='*') ) {
                            int LA15_1 = input.LA(2);

                            if ( (LA15_1=='/') ) {
                                alt15=2;
                            }
                            else if ( ((LA15_1 >= '\u0000' && LA15_1 <= '.')||(LA15_1 >= '0' && LA15_1 <= '\uFFFF')) ) {
                                alt15=1;
                            }


                        }
                        else if ( ((LA15_0 >= '\u0000' && LA15_0 <= ')')||(LA15_0 >= '+' && LA15_0 <= '\uFFFF')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:122:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:125:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:125:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:133:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:133:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:133:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='\\') ) {
                    alt17=1;
                }
                else if ( ((LA17_0 >= '\u0000' && LA17_0 <= '!')||(LA17_0 >= '#' && LA17_0 <= '[')||(LA17_0 >= ']' && LA17_0 <= '\uFFFF')) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:133:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:133:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:136:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:136:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 

            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:136:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\\') ) {
                alt18=1;
            }
            else if ( ((LA18_0 >= '\u0000' && LA18_0 <= '&')||(LA18_0 >= '(' && LA18_0 <= '[')||(LA18_0 >= ']' && LA18_0 <= '\uFFFF')) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:136:15: ESC_SEQ
                    {
                    mESC_SEQ(); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:136:25: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:141:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:141:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:141:22: ( '+' | '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='+'||LA19_0=='-') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:141:33: ( '0' .. '9' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0 >= '0' && LA20_0 <= '9')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:144:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:148:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt21=1;
                    }
                    break;
                case 'u':
                    {
                    alt21=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt21=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:148:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 

                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:149:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:150:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:155:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='\\') ) {
                int LA22_1 = input.LA(2);

                if ( ((LA22_1 >= '0' && LA22_1 <= '3')) ) {
                    int LA22_2 = input.LA(3);

                    if ( ((LA22_2 >= '0' && LA22_2 <= '7')) ) {
                        int LA22_4 = input.LA(4);

                        if ( ((LA22_4 >= '0' && LA22_4 <= '7')) ) {
                            alt22=1;
                        }
                        else {
                            alt22=2;
                        }
                    }
                    else {
                        alt22=3;
                    }
                }
                else if ( ((LA22_1 >= '4' && LA22_1 <= '7')) ) {
                    int LA22_3 = input.LA(3);

                    if ( ((LA22_3 >= '0' && LA22_3 <= '7')) ) {
                        alt22=2;
                    }
                    else {
                        alt22=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:155:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:156:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:157:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:162:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:162:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 

            match('u'); 

            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | ID | INT | Number | FLOAT | COMMENT | WS | STRING | CHAR )
        int alt23=43;
        alt23 = dfa23.predict(input);
        switch (alt23) {
            case 1 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:10: T__17
                {
                mT__17(); 


                }
                break;
            case 2 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:16: T__18
                {
                mT__18(); 


                }
                break;
            case 3 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:22: T__19
                {
                mT__19(); 


                }
                break;
            case 4 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:28: T__20
                {
                mT__20(); 


                }
                break;
            case 5 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:34: T__21
                {
                mT__21(); 


                }
                break;
            case 6 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:40: T__22
                {
                mT__22(); 


                }
                break;
            case 7 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:46: T__23
                {
                mT__23(); 


                }
                break;
            case 8 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:52: T__24
                {
                mT__24(); 


                }
                break;
            case 9 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:58: T__25
                {
                mT__25(); 


                }
                break;
            case 10 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:64: T__26
                {
                mT__26(); 


                }
                break;
            case 11 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:70: T__27
                {
                mT__27(); 


                }
                break;
            case 12 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:76: T__28
                {
                mT__28(); 


                }
                break;
            case 13 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:82: T__29
                {
                mT__29(); 


                }
                break;
            case 14 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:88: T__30
                {
                mT__30(); 


                }
                break;
            case 15 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:94: T__31
                {
                mT__31(); 


                }
                break;
            case 16 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:100: T__32
                {
                mT__32(); 


                }
                break;
            case 17 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:106: T__33
                {
                mT__33(); 


                }
                break;
            case 18 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:112: T__34
                {
                mT__34(); 


                }
                break;
            case 19 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:118: T__35
                {
                mT__35(); 


                }
                break;
            case 20 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:124: T__36
                {
                mT__36(); 


                }
                break;
            case 21 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:130: T__37
                {
                mT__37(); 


                }
                break;
            case 22 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:136: T__38
                {
                mT__38(); 


                }
                break;
            case 23 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:142: T__39
                {
                mT__39(); 


                }
                break;
            case 24 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:148: T__40
                {
                mT__40(); 


                }
                break;
            case 25 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:154: T__41
                {
                mT__41(); 


                }
                break;
            case 26 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:160: T__42
                {
                mT__42(); 


                }
                break;
            case 27 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:166: T__43
                {
                mT__43(); 


                }
                break;
            case 28 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:172: T__44
                {
                mT__44(); 


                }
                break;
            case 29 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:178: T__45
                {
                mT__45(); 


                }
                break;
            case 30 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:184: T__46
                {
                mT__46(); 


                }
                break;
            case 31 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:190: T__47
                {
                mT__47(); 


                }
                break;
            case 32 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:196: T__48
                {
                mT__48(); 


                }
                break;
            case 33 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:202: T__49
                {
                mT__49(); 


                }
                break;
            case 34 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:208: T__50
                {
                mT__50(); 


                }
                break;
            case 35 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:214: T__51
                {
                mT__51(); 


                }
                break;
            case 36 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:220: ID
                {
                mID(); 


                }
                break;
            case 37 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:223: INT
                {
                mINT(); 


                }
                break;
            case 38 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:227: Number
                {
                mNumber(); 


                }
                break;
            case 39 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:234: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 40 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:240: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 41 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:248: WS
                {
                mWS(); 


                }
                break;
            case 42 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:251: STRING
                {
                mSTRING(); 


                }
                break;
            case 43 :
                // C:\\Users\\lvaro\\OneDrive\\Documents\\BasForCCal.g:1:258: CHAR
                {
                mCHAR(); 


                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA12_eotS =
        "\5\uffff";
    static final String DFA12_eofS =
        "\5\uffff";
    static final String DFA12_minS =
        "\2\56\3\uffff";
    static final String DFA12_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA12_specialS =
        "\5\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "114:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA23_eotS =
        "\2\uffff\1\35\5\uffff\1\36\1\41\1\44\1\uffff\1\46\12\27\1\uffff"+
        "\1\66\16\uffff\3\27\1\73\4\27\1\100\4\27\1\105\1\27\1\uffff\1\37"+
        "\3\27\1\uffff\1\116\1\27\1\120\1\27\1\uffff\1\122\3\27\1\uffff\1"+
        "\27\1\130\1\27\1\132\1\133\3\27\1\uffff\1\27\1\uffff\1\27\1\uffff"+
        "\1\141\2\27\1\144\1\27\1\uffff\1\146\2\uffff\1\147\1\150\1\27\1"+
        "\152\1\27\1\uffff\2\27\1\uffff\1\156\3\uffff\1\27\1\uffff\3\27\1"+
        "\uffff\1\163\2\27\1\166\1\uffff\1\167\1\27\2\uffff\1\171\1\uffff";
    static final String DFA23_eofS =
        "\172\uffff";
    static final String DFA23_minS =
        "\1\11\1\uffff\1\51\5\uffff\1\60\1\52\1\75\1\uffff\1\75\1\105\1\101"+
        "\1\117\1\116\1\114\1\106\1\117\1\122\2\110\1\uffff\1\56\16\uffff"+
        "\1\107\1\114\1\101\1\60\1\104\1\117\1\122\1\116\1\60\1\124\2\117"+
        "\1\105\1\60\1\111\1\uffff\1\60\1\111\1\114\1\122\1\uffff\1\60\1"+
        "\101\1\60\1\103\1\uffff\1\60\1\120\1\103\1\116\1\uffff\1\114\1\60"+
        "\1\116\2\60\1\117\1\106\1\117\1\uffff\1\124\1\uffff\1\124\1\uffff"+
        "\1\60\1\105\1\122\1\60\1\105\1\uffff\1\60\2\uffff\2\60\1\117\1\60"+
        "\1\111\1\uffff\1\104\1\101\1\uffff\1\60\3\uffff\1\120\1\uffff\1"+
        "\117\1\125\1\115\1\uffff\1\60\1\116\1\122\1\60\1\uffff\1\60\1\105"+
        "\2\uffff\1\60\1\uffff";
    static final String DFA23_maxS =
        "\1\172\1\uffff\1\51\5\uffff\1\71\1\57\1\76\1\uffff\1\75\1\105\1"+
        "\110\1\117\1\116\1\125\1\116\1\117\1\122\1\117\1\110\1\uffff\1\145"+
        "\16\uffff\1\107\1\114\1\101\1\172\1\104\1\117\1\122\1\116\1\172"+
        "\1\124\2\117\1\105\1\172\1\111\1\uffff\1\71\1\111\1\114\1\122\1"+
        "\uffff\1\172\1\101\1\172\1\103\1\uffff\1\172\1\120\1\107\1\116\1"+
        "\uffff\1\114\1\145\1\116\2\172\1\117\1\106\1\117\1\uffff\1\124\1"+
        "\uffff\1\124\1\uffff\1\172\1\105\1\122\1\172\1\105\1\uffff\1\172"+
        "\2\uffff\2\172\1\117\1\172\1\111\1\uffff\1\104\1\101\1\uffff\1\172"+
        "\3\uffff\1\120\1\uffff\1\117\1\125\1\115\1\uffff\1\172\1\116\1\122"+
        "\1\172\1\uffff\1\172\1\105\2\uffff\1\172\1\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\10\3\uffff\1\16\13\uffff"+
        "\1\44\1\uffff\1\51\1\52\1\53\1\3\1\2\1\11\1\47\1\50\1\12\1\14\1"+
        "\15\1\13\1\20\1\17\17\uffff\1\45\4\uffff\1\24\4\uffff\1\34\4\uffff"+
        "\1\42\10\uffff\1\25\1\uffff\1\32\1\uffff\1\35\5\uffff\1\46\1\uffff"+
        "\1\22\1\23\5\uffff\1\36\2\uffff\1\41\1\uffff\1\21\1\26\1\27\1\uffff"+
        "\1\31\3\uffff\1\43\4\uffff\1\30\2\uffff\1\40\1\33\1\uffff\1\37";
    static final String DFA23_specialS =
        "\172\uffff}>";
    static final String[] DFA23_transitionS = {
            "\2\31\2\uffff\1\31\22\uffff\1\31\1\uffff\1\32\2\uffff\1\1\1"+
            "\uffff\1\33\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\12\30\2\uffff"+
            "\1\12\1\13\1\14\2\uffff\1\27\1\15\1\16\1\17\1\20\1\21\2\27\1"+
            "\22\2\27\1\23\3\27\1\24\3\27\1\25\2\27\1\26\3\27\4\uffff\1\27"+
            "\1\uffff\32\27",
            "",
            "\1\34",
            "",
            "",
            "",
            "",
            "",
            "\12\37",
            "\1\40\4\uffff\1\40",
            "\1\42\1\43",
            "",
            "\1\45",
            "\1\47",
            "\1\50\6\uffff\1\51",
            "\1\52",
            "\1\53",
            "\1\54\2\uffff\1\55\5\uffff\1\56",
            "\1\57\7\uffff\1\60",
            "\1\61",
            "\1\62",
            "\1\63\6\uffff\1\64",
            "\1\65",
            "",
            "\1\67\1\uffff\12\30\13\uffff\1\37\37\uffff\1\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\70",
            "\1\71",
            "\1\72",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\106",
            "",
            "\12\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "",
            "\12\27\7\uffff\3\27\1\113\4\27\1\114\2\27\1\115\16\27\4\uffff"+
            "\1\27\1\uffff\32\27",
            "\1\117",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\121",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\123",
            "\1\124\3\uffff\1\125",
            "\1\126",
            "",
            "\1\127",
            "\12\107\13\uffff\1\37\37\uffff\1\37",
            "\1\131",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\134",
            "\1\135",
            "\1\136",
            "",
            "\1\137",
            "",
            "\1\140",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\142",
            "\1\143",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\145",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\151",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\153",
            "",
            "\1\154",
            "\1\155",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "",
            "\1\157",
            "",
            "\1\160",
            "\1\161",
            "\1\162",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\164",
            "\1\165",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\170",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | ID | INT | Number | FLOAT | COMMENT | WS | STRING | CHAR );";
        }
    }
 

}