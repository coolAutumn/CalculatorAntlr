// Generated from /Users/coolautumn/Documents/Compile_File/JAVA_IntelliJ/CalculatorAntlr/Resources/Calculator.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, Type=11, Iden=12, Constant=13, WS=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "Type", "Iden", "Constant", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'write('", 
		"');'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "Type", 
		"Iden", "Constant", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20e\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fB\n\f\3\r\6\rE\n\r\r\r\16"+
		"\rF\3\r\7\rJ\n\r\f\r\16\rM\13\r\3\16\3\16\7\16Q\n\16\f\16\16\16T\13\16"+
		"\3\16\5\16W\n\16\3\16\7\16Z\n\16\f\16\16\16]\13\16\3\17\6\17`\n\17\r\17"+
		"\16\17a\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\3\2\7\6\2*+C\\c|~~\b\2)+\62;C\\aac|~~\3\2\63;"+
		"\3\2\62;\b\2\13\f\17\17\"\"))^^uuk\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\3\37\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2\t%\3\2\2\2\13\'\3\2\2\2\r)\3\2\2"+
		"\2\17+\3\2\2\2\21-\3\2\2\2\23/\3\2\2\2\25\66\3\2\2\2\27A\3\2\2\2\31D\3"+
		"\2\2\2\33N\3\2\2\2\35_\3\2\2\2\37 \7=\2\2 \4\3\2\2\2!\"\7?\2\2\"\6\3\2"+
		"\2\2#$\7*\2\2$\b\3\2\2\2%&\7+\2\2&\n\3\2\2\2\'(\7-\2\2(\f\3\2\2\2)*\7"+
		"/\2\2*\16\3\2\2\2+,\7,\2\2,\20\3\2\2\2-.\7\61\2\2.\22\3\2\2\2/\60\7y\2"+
		"\2\60\61\7t\2\2\61\62\7k\2\2\62\63\7v\2\2\63\64\7g\2\2\64\65\7*\2\2\65"+
		"\24\3\2\2\2\66\67\7+\2\2\678\7=\2\28\26\3\2\2\29:\7k\2\2:;\7p\2\2;B\7"+
		"v\2\2<=\7h\2\2=>\7n\2\2>?\7q\2\2?@\7c\2\2@B\7v\2\2A9\3\2\2\2A<\3\2\2\2"+
		"B\30\3\2\2\2CE\t\2\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GK\3\2\2"+
		"\2HJ\t\3\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\32\3\2\2\2MK\3\2"+
		"\2\2NR\t\4\2\2OQ\t\5\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SV\3\2"+
		"\2\2TR\3\2\2\2UW\7\60\2\2VU\3\2\2\2VW\3\2\2\2W[\3\2\2\2XZ\t\5\2\2YX\3"+
		"\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\34\3\2\2\2][\3\2\2\2^`\t\6\2\2"+
		"_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\b\17\2\2d\36\3\2"+
		"\2\2\n\2AFKRV[a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}