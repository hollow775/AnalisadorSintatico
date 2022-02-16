// Generated from br/com/bcc/analisador_sintatico/Bcc.g4 by ANTLR 4.7.2
package br.com.bcc.analisador_sintatico;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BccLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, TIPO_VARIAVEIS=8, 
		NUMINTEIRO=9, NUMREAL=10, VARIAVEL=11, OP_ARITIMETICO1=12, OP_ARITIMETICO2=13, 
		OP_RELACIONAL1=14, OP_RELACIONAL2=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "TIPO_VARIAVEIS", 
			"NUMINTEIRO", "NUMREAL", "VARIAVEL", "OP_ARITIMETICO1", "OP_ARITIMETICO2", 
			"OP_RELACIONAL1", "OP_RELACIONAL2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'DECLARACOES'", "'ALGORITMO'", "'->'", "'ATRIBUIR'", "'LER'", 
			"'ESCREVA'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "TIPO_VARIAVEIS", "NUMINTEIRO", 
			"NUMREAL", "VARIAVEL", "OP_ARITIMETICO1", "OP_ARITIMETICO2", "OP_RELACIONAL1", 
			"OP_RELACIONAL2"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public BccLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Bcc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u0085\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t]\n\t\3\n\6\n`\n\n\r\n\16\na\3\13\6\13e\n\13\r\13\16\13"+
		"f\3\13\3\13\6\13k\n\13\r\13\16\13l\5\13o\n\13\3\f\3\f\7\fs\n\f\f\f\16"+
		"\fv\13\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u0084\n\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21\3\2\6\4\2C\\c|\5\2\62;C\\c|\4\2--//\4\2,,\61"+
		"\61\2\u008c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2"+
		"\2\5#\3\2\2\2\7/\3\2\2\2\t9\3\2\2\2\13<\3\2\2\2\rE\3\2\2\2\17I\3\2\2\2"+
		"\21\\\3\2\2\2\23_\3\2\2\2\25d\3\2\2\2\27p\3\2\2\2\31w\3\2\2\2\33y\3\2"+
		"\2\2\35{\3\2\2\2\37\u0083\3\2\2\2!\"\7<\2\2\"\4\3\2\2\2#$\7F\2\2$%\7G"+
		"\2\2%&\7E\2\2&\'\7N\2\2\'(\7C\2\2()\7T\2\2)*\7C\2\2*+\7E\2\2+,\7Q\2\2"+
		",-\7G\2\2-.\7U\2\2.\6\3\2\2\2/\60\7C\2\2\60\61\7N\2\2\61\62\7I\2\2\62"+
		"\63\7Q\2\2\63\64\7T\2\2\64\65\7K\2\2\65\66\7V\2\2\66\67\7O\2\2\678\7Q"+
		"\2\28\b\3\2\2\29:\7/\2\2:;\7@\2\2;\n\3\2\2\2<=\7C\2\2=>\7V\2\2>?\7T\2"+
		"\2?@\7K\2\2@A\7D\2\2AB\7W\2\2BC\7K\2\2CD\7T\2\2D\f\3\2\2\2EF\7N\2\2FG"+
		"\7G\2\2GH\7T\2\2H\16\3\2\2\2IJ\7G\2\2JK\7U\2\2KL\7E\2\2LM\7T\2\2MN\7G"+
		"\2\2NO\7X\2\2OP\7C\2\2P\20\3\2\2\2QR\7K\2\2RS\7P\2\2ST\7V\2\2TU\7G\2\2"+
		"UV\7K\2\2VW\7T\2\2W]\7Q\2\2XY\7T\2\2YZ\7G\2\2Z[\7C\2\2[]\7N\2\2\\Q\3\2"+
		"\2\2\\X\3\2\2\2]\22\3\2\2\2^`\4\62;\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab"+
		"\3\2\2\2b\24\3\2\2\2ce\4\62;\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2"+
		"gn\3\2\2\2hj\7\60\2\2ik\4\62;\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2"+
		"\2mo\3\2\2\2nh\3\2\2\2no\3\2\2\2o\26\3\2\2\2pt\t\2\2\2qs\t\3\2\2rq\3\2"+
		"\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\30\3\2\2\2vt\3\2\2\2wx\t\4\2\2x\32"+
		"\3\2\2\2yz\t\5\2\2z\34\3\2\2\2{|\4>@\2|\36\3\2\2\2}~\7>\2\2~\u0084\7?"+
		"\2\2\177\u0080\7@\2\2\u0080\u0084\7?\2\2\u0081\u0082\7?\2\2\u0082\u0084"+
		"\7?\2\2\u0083}\3\2\2\2\u0083\177\3\2\2\2\u0083\u0081\3\2\2\2\u0084 \3"+
		"\2\2\2\n\2\\aflnt\u0083\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}