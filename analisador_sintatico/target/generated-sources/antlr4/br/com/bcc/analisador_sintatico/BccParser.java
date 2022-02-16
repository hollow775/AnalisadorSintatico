// Generated from br/com/bcc/analisador_sintatico/Bcc.g4 by ANTLR 4.7.2
package br.com.bcc.analisador_sintatico;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BccParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, TIPO_VARIAVEIS=8, 
		NUMINTEIRO=9, NUMREAL=10, VARIAVEL=11, OP_ARITIMETICO1=12, OP_ARITIMETICO2=13, 
		OP_RELACIONAL1=14, OP_RELACIONAL2=15;
	public static final int
		RULE_programa = 0, RULE_listaDeclaracoes = 1, RULE_declaracao = 2, RULE_listaComandos = 3, 
		RULE_comando = 4, RULE_comandoAtribuir = 5, RULE_expressaoAritmetica = 6, 
		RULE_termo = 7, RULE_fator = 8, RULE_comandoEntrada = 9, RULE_comandoSaida = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "listaDeclaracoes", "declaracao", "listaComandos", "comando", 
			"comandoAtribuir", "expressaoAritmetica", "termo", "fator", "comandoEntrada", 
			"comandoSaida"
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

	@Override
	public String getGrammarFileName() { return "Bcc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BccParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public ListaDeclaracoesContext listaDeclaracoes() {
			return getRuleContext(ListaDeclaracoesContext.class,0);
		}
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BccListener ) ((BccListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BccListener ) ((BccListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BccVisitor ) return ((BccVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__0);
			setState(23);
			match(T__1);
			setState(24);
			listaDeclaracoes();
			setState(25);
			match(T__0);
			setState(26);
			match(T__2);
			setState(27);
			listaComandos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaDeclaracoesContext extends ParserRuleContext {
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public ListaDeclaracoesContext listaDeclaracoes() {
			return getRuleContext(ListaDeclaracoesContext.class,0);
		}
		public ListaDeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaDeclaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BccListener ) ((BccListener)listener).enterListaDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BccListener ) ((BccListener)listener).exitListaDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BccVisitor ) return ((BccVisitor<? extends T>)visitor).visitListaDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaDeclaracoesContext listaDeclaracoes() throws RecognitionException {
		ListaDeclaracoesContext _localctx = new ListaDeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_listaDeclaracoes);
		try {
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				declaracao();
				setState(30);
				listaDeclaracoes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				declaracao();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoContext extends ParserRuleContext {
		public TerminalNode VARIAVEL() { return getToken(BccParser.VARIAVEL, 0); }
		public TerminalNode TIPO_VARIAVEIS() { return getToken(BccParser.TIPO_VARIAVEIS, 0); }
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BccListener ) ((BccListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BccListener ) ((BccListener)listener).exitDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BccVisitor ) return ((BccVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(VARIAVEL);
			setState(36);
			match(T__3);
			setState(37);
			match(TIPO_VARIAVEIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaComandosContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public ListaComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaComandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BccListener ) ((BccListener)listener).enterListaComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BccListener ) ((BccListener)listener).exitListaComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BccVisitor ) return ((BccVisitor<? extends T>)visitor).visitListaComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaComandosContext listaComandos() throws RecognitionException {
		ListaComandosContext _localctx = new ListaComandosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_listaComandos);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				comando();
				setState(40);
				listaComandos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				comando();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoContext extends ParserRuleContext {
		public ComandoAtribuirContext comandoAtribuir() {
			return getRuleContext(ComandoAtribuirContext.class,0);
		}
		public ComandoEntradaContext comandoEntrada() {
			return getRuleContext(ComandoEntradaContext.class,0);
		}
		public ComandoSaidaContext comandoSaida() {
			return getRuleContext(ComandoSaidaContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BccListener ) ((BccListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BccListener ) ((BccListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BccVisitor ) return ((BccVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comando);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				comandoAtribuir();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				comandoEntrada();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				comandoSaida();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoAtribuirContext extends ParserRuleContext {
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public TerminalNode VARIAVEL() { return getToken(BccParser.VARIAVEL, 0); }
		public ComandoAtribuirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoAtribuir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BccListener ) ((BccListener)listener).enterComandoAtribuir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BccListener ) ((BccListener)listener).exitComandoAtribuir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BccVisitor ) return ((BccVisitor<? extends T>)visitor).visitComandoAtribuir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoAtribuirContext comandoAtribuir() throws RecognitionException {
		ComandoAtribuirContext _localctx = new ComandoAtribuirContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comandoAtribuir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__4);
			setState(51);
			expressaoAritmetica();
			setState(52);
			match(T__3);
			setState(53);
			match(VARIAVEL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoAritmeticaContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public TerminalNode OP_ARITIMETICO1() { return getToken(BccParser.OP_ARITIMETICO1, 0); }
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public ExpressaoAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BccListener ) ((BccListener)listener).enterExpressaoAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BccListener ) ((BccListener)listener).exitExpressaoAritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BccVisitor ) return ((BccVisitor<? extends T>)visitor).visitExpressaoAritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoAritmeticaContext expressaoAritmetica() throws RecognitionException {
		ExpressaoAritmeticaContext _localctx = new ExpressaoAritmeticaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expressaoAritmetica);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				fator();
				setState(56);
				match(OP_ARITIMETICO1);
				setState(57);
				termo(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				termo(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public TerminalNode OP_ARITIMETICO2() { return getToken(BccParser.OP_ARITIMETICO2, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BccListener ) ((BccListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BccListener ) ((BccListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BccVisitor ) return ((BccVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		return termo(0);
	}

	private TermoContext termo(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermoContext _localctx = new TermoContext(_ctx, _parentState);
		TermoContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_termo, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(63);
			fator();
			}
			_ctx.stop = _input.LT(-1);
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_termo);
					setState(65);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(66);
					match(OP_ARITIMETICO2);
					setState(67);
					fator();
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FatorContext extends ParserRuleContext {
		public TerminalNode NUMINTEIRO() { return getToken(BccParser.NUMINTEIRO, 0); }
		public TerminalNode NUMREAL() { return getToken(BccParser.NUMREAL, 0); }
		public TerminalNode VARIAVEL() { return getToken(BccParser.VARIAVEL, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BccListener ) ((BccListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BccListener ) ((BccListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BccVisitor ) return ((BccVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMINTEIRO) | (1L << NUMREAL) | (1L << VARIAVEL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoEntradaContext extends ParserRuleContext {
		public TerminalNode VARIAVEL() { return getToken(BccParser.VARIAVEL, 0); }
		public ComandoEntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoEntrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BccListener ) ((BccListener)listener).enterComandoEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BccListener ) ((BccListener)listener).exitComandoEntrada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BccVisitor ) return ((BccVisitor<? extends T>)visitor).visitComandoEntrada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoEntradaContext comandoEntrada() throws RecognitionException {
		ComandoEntradaContext _localctx = new ComandoEntradaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comandoEntrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__5);
			setState(76);
			match(VARIAVEL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoSaidaContext extends ParserRuleContext {
		public TerminalNode VARIAVEL() { return getToken(BccParser.VARIAVEL, 0); }
		public ComandoSaidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoSaida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BccListener ) ((BccListener)listener).enterComandoSaida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BccListener ) ((BccListener)listener).exitComandoSaida(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BccVisitor ) return ((BccVisitor<? extends T>)visitor).visitComandoSaida(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoSaidaContext comandoSaida() throws RecognitionException {
		ComandoSaidaContext _localctx = new ComandoSaidaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comandoSaida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__6);
			setState(79);
			match(VARIAVEL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return termo_sempred((TermoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean termo_sempred(TermoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21T\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3$\n\3\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\5\5.\n\5\3\6\3\6\3\6\5\6\63\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\5\b?\n\b\3\t\3\t\3\t\3\t\3\t\3\t\7\tG\n\t\f\t"+
		"\16\tJ\13\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\2\3\20\r\2\4\6\b\n"+
		"\f\16\20\22\24\26\2\3\3\2\13\r\2N\2\30\3\2\2\2\4#\3\2\2\2\6%\3\2\2\2\b"+
		"-\3\2\2\2\n\62\3\2\2\2\f\64\3\2\2\2\16>\3\2\2\2\20@\3\2\2\2\22K\3\2\2"+
		"\2\24M\3\2\2\2\26P\3\2\2\2\30\31\7\3\2\2\31\32\7\4\2\2\32\33\5\4\3\2\33"+
		"\34\7\3\2\2\34\35\7\5\2\2\35\36\5\b\5\2\36\3\3\2\2\2\37 \5\6\4\2 !\5\4"+
		"\3\2!$\3\2\2\2\"$\5\6\4\2#\37\3\2\2\2#\"\3\2\2\2$\5\3\2\2\2%&\7\r\2\2"+
		"&\'\7\6\2\2\'(\7\n\2\2(\7\3\2\2\2)*\5\n\6\2*+\5\b\5\2+.\3\2\2\2,.\5\n"+
		"\6\2-)\3\2\2\2-,\3\2\2\2.\t\3\2\2\2/\63\5\f\7\2\60\63\5\24\13\2\61\63"+
		"\5\26\f\2\62/\3\2\2\2\62\60\3\2\2\2\62\61\3\2\2\2\63\13\3\2\2\2\64\65"+
		"\7\7\2\2\65\66\5\16\b\2\66\67\7\6\2\2\678\7\r\2\28\r\3\2\2\29:\5\22\n"+
		"\2:;\7\16\2\2;<\5\20\t\2<?\3\2\2\2=?\5\20\t\2>9\3\2\2\2>=\3\2\2\2?\17"+
		"\3\2\2\2@A\b\t\1\2AB\5\22\n\2BH\3\2\2\2CD\f\4\2\2DE\7\17\2\2EG\5\22\n"+
		"\2FC\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\21\3\2\2\2JH\3\2\2\2KL\t\2"+
		"\2\2L\23\3\2\2\2MN\7\b\2\2NO\7\r\2\2O\25\3\2\2\2PQ\7\t\2\2QR\7\r\2\2R"+
		"\27\3\2\2\2\7#-\62>H";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}