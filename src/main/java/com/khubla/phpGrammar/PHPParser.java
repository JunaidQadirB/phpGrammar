// Generated from com/khubla/phpGrammar/PHPParser.g4 by ANTLR 4.1
package com.khubla.phpGrammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PHPParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SingleQuotedString=79, HexNumber=74, Switch=23, Html=3, Pipe=38, Array=69, 
		Static=65, OpenSquareBracket=57, Forwardslash=44, OpenRoundBracket=55, 
		OctalNumber=75, SinglelineComment=67, Extends=21, While=33, HtmlWS=4, 
		Case=24, Percent=43, ComparisionOperator=85, ClassMember=53, CloseSquareBracket=58, 
		Identifier=82, Xor=14, Global=15, Default=25, CloseRoundBracket=56, AssignmentOperator=83, 
		DoubleQuotedString=81, IncrementOperator=87, PHPStart=1, Digits=77, Implements=18, 
		Interface=61, Do=22, EscapeCharacter=80, UnixComment=68, Class=20, Or=13, 
		PHPO=2, Return=17, Clone=36, If=28, Dollar=48, And=10, Tilde=45, SemiColon=8, 
		Asterisk=42, InstanceMember=46, Continue=16, As=7, ShiftOperator=86, LogicalOr=51, 
		AccessModifier=72, LogicalAnd=52, PrimitiveType=71, ElseIf=30, Colon=63, 
		DecimalNumber=73, Const=12, For=31, Foreach=32, List=11, RequireOperator=70, 
		CloseCurlyBracket=60, Ampersand=37, Float=76, Plus=40, Bang=39, Minus=41, 
		WS=88, SuppressWarnings=47, Break=27, Function=26, New=35, Boolean=78, 
		OpenCurlyBracket=59, Instanceof=9, Dot=49, RealE=6, QuestionMark=54, ArrayAssign=50, 
		EqualityOperator=84, MultilineComment=66, Else=29, Comma=62, Equals=34, 
		Var=19, PHPEnd=5, Abstract=64;
	public static final String[] tokenNames = {
		"<INVALID>", "PHPStart", "'<'", "Html", "HtmlWS", "'?>'", "RealE", "'as'", 
		"';'", "'instanceof'", "'and'", "'list'", "'const'", "'or'", "'xor'", 
		"'global'", "'continue'", "'return'", "'implements'", "'var'", "'class'", 
		"'extends'", "'do'", "'switch'", "'case'", "'default'", "'function'", 
		"'break'", "'if'", "'else'", "'elseif'", "'for'", "'foreach'", "'while'", 
		"'='", "'new'", "'clone'", "'&'", "'|'", "'!'", "'+'", "'-'", "'*'", "'%'", 
		"'/'", "'~'", "'->'", "'@'", "'$'", "'.'", "'=>'", "'||'", "'&&'", "'::'", 
		"'?'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'Interface'", "','", 
		"':'", "'abstract'", "'static'", "MultilineComment", "SinglelineComment", 
		"UnixComment", "Array", "RequireOperator", "PrimitiveType", "AccessModifier", 
		"DecimalNumber", "HexNumber", "OctalNumber", "Float", "Digits", "Boolean", 
		"SingleQuotedString", "EscapeCharacter", "DoubleQuotedString", "Identifier", 
		"AssignmentOperator", "EqualityOperator", "ComparisionOperator", "ShiftOperator", 
		"IncrementOperator", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_htmlblock = 1, RULE_html = 2, RULE_phpBlock = 3, RULE_prolog = 4, 
		RULE_epilog = 5, RULE_statement = 6, RULE_complexStatement = 7, RULE_forstatement = 8, 
		RULE_ifstatement = 9, RULE_foreachstatement = 10, RULE_whilestatement = 11, 
		RULE_dostatement = 12, RULE_switchstatement = 13, RULE_simpleStatement = 14, 
		RULE_globalStatement = 15, RULE_staticVariableAssignmentStatement = 16, 
		RULE_breakStatement = 17, RULE_continueStatement = 18, RULE_returnStatement = 19, 
		RULE_requireStatement = 20, RULE_cases = 21, RULE_casestatement = 22, 
		RULE_defaultcase = 23, RULE_singlelinecomment = 24, RULE_variable = 25, 
		RULE_variablename = 26, RULE_name = 27, RULE_staticMemberAccess = 28, 
		RULE_memberAccess = 29, RULE_bracketedBlock = 30, RULE_interfaceDefinition = 31, 
		RULE_interfaceName = 32, RULE_interfaceExtends = 33, RULE_interfaceMember = 34, 
		RULE_className = 35, RULE_classDefinition = 36, RULE_classImplements = 37, 
		RULE_classMember = 38, RULE_classModifier = 39, RULE_constDefinition = 40, 
		RULE_fieldDefinition = 41, RULE_fieldModifier = 42, RULE_fieldName = 43, 
		RULE_functionDefinition = 44, RULE_parametersDefinition = 45, RULE_functionInvocation = 46, 
		RULE_functionName = 47, RULE_functionInvocationParameters = 48, RULE_paramDef = 49, 
		RULE_paramName = 50, RULE_commaList = 51, RULE_expression = 52, RULE_weakLogicalOr = 53, 
		RULE_weakLogicalXor = 54, RULE_weakLogicalAnd = 55, RULE_assignment = 56, 
		RULE_listVariables = 57, RULE_ternary = 58, RULE_logicalOr = 59, RULE_logicalAnd = 60, 
		RULE_bitwiseOr = 61, RULE_bitWiseAnd = 62, RULE_equalityCheck = 63, RULE_comparisionCheck = 64, 
		RULE_bitWiseShift = 65, RULE_addition = 66, RULE_multiplication = 67, 
		RULE_logicalNot = 68, RULE_instanceOf = 69, RULE_negateOrCast = 70, RULE_increment = 71, 
		RULE_newOrClone = 72, RULE_atomOrReference = 73, RULE_arrayDeclaration = 74, 
		RULE_arrayEntry = 75, RULE_keyValuePair = 76, RULE_atom = 77, RULE_reference = 78, 
		RULE_bool = 79, RULE_number = 80, RULE_integer = 81, RULE_real = 82, RULE_string = 83;
	public static final String[] ruleNames = {
		"prog", "htmlblock", "html", "phpBlock", "prolog", "epilog", "statement", 
		"complexStatement", "forstatement", "ifstatement", "foreachstatement", 
		"whilestatement", "dostatement", "switchstatement", "simpleStatement", 
		"globalStatement", "staticVariableAssignmentStatement", "breakStatement", 
		"continueStatement", "returnStatement", "requireStatement", "cases", "casestatement", 
		"defaultcase", "singlelinecomment", "variable", "variablename", "name", 
		"staticMemberAccess", "memberAccess", "bracketedBlock", "interfaceDefinition", 
		"interfaceName", "interfaceExtends", "interfaceMember", "className", "classDefinition", 
		"classImplements", "classMember", "classModifier", "constDefinition", 
		"fieldDefinition", "fieldModifier", "fieldName", "functionDefinition", 
		"parametersDefinition", "functionInvocation", "functionName", "functionInvocationParameters", 
		"paramDef", "paramName", "commaList", "expression", "weakLogicalOr", "weakLogicalXor", 
		"weakLogicalAnd", "assignment", "listVariables", "ternary", "logicalOr", 
		"logicalAnd", "bitwiseOr", "bitWiseAnd", "equalityCheck", "comparisionCheck", 
		"bitWiseShift", "addition", "multiplication", "logicalNot", "instanceOf", 
		"negateOrCast", "increment", "newOrClone", "atomOrReference", "arrayDeclaration", 
		"arrayEntry", "keyValuePair", "atom", "reference", "bool", "number", "integer", 
		"real", "string"
	};

	@Override
	public String getGrammarFileName() { return "PHPParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public PHPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<HtmlblockContext> htmlblock() {
			return getRuleContexts(HtmlblockContext.class);
		}
		public List<PhpBlockContext> phpBlock() {
			return getRuleContexts(PhpBlockContext.class);
		}
		public PhpBlockContext phpBlock(int i) {
			return getRuleContext(PhpBlockContext.class,i);
		}
		public HtmlblockContext htmlblock(int i) {
			return getRuleContext(HtmlblockContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PHPStart) | (1L << PHPO) | (1L << Html))) != 0)) {
				{
				setState(170);
				switch (_input.LA(1)) {
				case PHPStart:
					{
					setState(168); phpBlock();
					}
					break;
				case PHPO:
				case Html:
					{
					setState(169); htmlblock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class HtmlblockContext extends ParserRuleContext {
		public HtmlContext html(int i) {
			return getRuleContext(HtmlContext.class,i);
		}
		public List<HtmlContext> html() {
			return getRuleContexts(HtmlContext.class);
		}
		public TerminalNode PHPO() { return getToken(PHPParser.PHPO, 0); }
		public HtmlblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterHtmlblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitHtmlblock(this);
		}
	}

	public final HtmlblockContext htmlblock() throws RecognitionException {
		HtmlblockContext _localctx = new HtmlblockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_htmlblock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if (_la==PHPO) {
				{
				setState(175); match(PHPO);
				}
			}

			setState(179); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(178); html();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(181); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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

	public static class HtmlContext extends ParserRuleContext {
		public TerminalNode Html() { return getToken(PHPParser.Html, 0); }
		public HtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitHtml(this);
		}
	}

	public final HtmlContext html() throws RecognitionException {
		HtmlContext _localctx = new HtmlContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_html);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); match(Html);
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

	public static class PhpBlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public EpilogContext epilog() {
			return getRuleContext(EpilogContext.class,0);
		}
		public PrologContext prolog() {
			return getRuleContext(PrologContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public PhpBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phpBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterPhpBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitPhpBlock(this);
		}
	}

	public final PhpBlockContext phpBlock() throws RecognitionException {
		PhpBlockContext _localctx = new PhpBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_phpBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); prolog();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << List) | (1L << Global) | (1L << Continue) | (1L << Return) | (1L << Class) | (1L << Do) | (1L << Switch) | (1L << Function) | (1L << Break) | (1L << If) | (1L << For) | (1L << Foreach) | (1L << While) | (1L << New) | (1L << Clone) | (1L << Ampersand) | (1L << Bang) | (1L << Minus) | (1L << Tilde) | (1L << SuppressWarnings) | (1L << Dollar) | (1L << OpenRoundBracket) | (1L << OpenCurlyBracket) | (1L << Interface))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Abstract - 64)) | (1L << (Static - 64)) | (1L << (SinglelineComment - 64)) | (1L << (Array - 64)) | (1L << (RequireOperator - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (OctalNumber - 64)) | (1L << (Float - 64)) | (1L << (Boolean - 64)) | (1L << (SingleQuotedString - 64)) | (1L << (DoubleQuotedString - 64)) | (1L << (Identifier - 64)) | (1L << (IncrementOperator - 64)))) != 0)) {
				{
				{
				setState(186); statement();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192); epilog();
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

	public static class PrologContext extends ParserRuleContext {
		public TerminalNode PHPStart() { return getToken(PHPParser.PHPStart, 0); }
		public PrologContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prolog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterProlog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitProlog(this);
		}
	}

	public final PrologContext prolog() throws RecognitionException {
		PrologContext _localctx = new PrologContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_prolog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194); match(PHPStart);
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

	public static class EpilogContext extends ParserRuleContext {
		public TerminalNode PHPEnd() { return getToken(PHPParser.PHPEnd, 0); }
		public EpilogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_epilog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterEpilog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitEpilog(this);
		}
	}

	public final EpilogContext epilog() throws RecognitionException {
		EpilogContext _localctx = new EpilogContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_epilog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196); match(PHPEnd);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ComplexStatementContext complexStatement() {
			return getRuleContext(ComplexStatementContext.class,0);
		}
		public InterfaceDefinitionContext interfaceDefinition() {
			return getRuleContext(InterfaceDefinitionContext.class,0);
		}
		public BracketedBlockContext bracketedBlock() {
			return getRuleContext(BracketedBlockContext.class,0);
		}
		public SinglelinecommentContext singlelinecomment() {
			return getRuleContext(SinglelinecommentContext.class,0);
		}
		public ClassDefinitionContext classDefinition() {
			return getRuleContext(ClassDefinitionContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(210);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198); match(OpenCurlyBracket);
				setState(199); statement();
				setState(200); match(CloseCurlyBracket);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202); bracketedBlock();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(203); classDefinition();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(204); interfaceDefinition();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(205); complexStatement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(206); simpleStatement();
				setState(207); match(SemiColon);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(209); singlelinecomment();
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

	public static class ComplexStatementContext extends ParserRuleContext {
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public WhilestatementContext whilestatement() {
			return getRuleContext(WhilestatementContext.class,0);
		}
		public DostatementContext dostatement() {
			return getRuleContext(DostatementContext.class,0);
		}
		public ForstatementContext forstatement() {
			return getRuleContext(ForstatementContext.class,0);
		}
		public SwitchstatementContext switchstatement() {
			return getRuleContext(SwitchstatementContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public ForeachstatementContext foreachstatement() {
			return getRuleContext(ForeachstatementContext.class,0);
		}
		public ComplexStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterComplexStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitComplexStatement(this);
		}
	}

	public final ComplexStatementContext complexStatement() throws RecognitionException {
		ComplexStatementContext _localctx = new ComplexStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_complexStatement);
		try {
			setState(219);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(212); ifstatement();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 2);
				{
				setState(213); forstatement();
				}
				break;
			case Foreach:
				enterOuterAlt(_localctx, 3);
				{
				setState(214); foreachstatement();
				}
				break;
			case While:
				enterOuterAlt(_localctx, 4);
				{
				setState(215); whilestatement();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 5);
				{
				setState(216); dostatement();
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 6);
				{
				setState(217); switchstatement();
				}
				break;
			case Function:
				enterOuterAlt(_localctx, 7);
				{
				setState(218); functionDefinition();
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

	public static class ForstatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode For() { return getToken(PHPParser.For, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ForstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterForstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitForstatement(this);
		}
	}

	public final ForstatementContext forstatement() throws RecognitionException {
		ForstatementContext _localctx = new ForstatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221); match(For);
			setState(222); match(OpenRoundBracket);
			setState(223); expression();
			setState(224); match(SemiColon);
			setState(225); expression();
			setState(226); match(SemiColon);
			setState(227); expression();
			setState(228); match(CloseRoundBracket);
			setState(229); statement();
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

	public static class IfstatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ElseIf(int i) {
			return getToken(PHPParser.ElseIf, i);
		}
		public TerminalNode Else() { return getToken(PHPParser.Else, 0); }
		public TerminalNode If() { return getToken(PHPParser.If, 0); }
		public List<TerminalNode> ElseIf() { return getTokens(PHPParser.ElseIf); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterIfstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitIfstatement(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifstatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231); match(If);
			setState(232); match(OpenRoundBracket);
			setState(233); expression();
			setState(234); match(CloseRoundBracket);
			setState(235); statement();
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(236); match(ElseIf);
					setState(237); match(OpenRoundBracket);
					setState(238); expression();
					setState(239); match(CloseRoundBracket);
					}
					} 
				}
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(248);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(246); match(Else);
				setState(247); statement();
				}
				break;
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

	public static class ForeachstatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Foreach() { return getToken(PHPParser.Foreach, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ArrayEntryContext arrayEntry() {
			return getRuleContext(ArrayEntryContext.class,0);
		}
		public ForeachstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterForeachstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitForeachstatement(this);
		}
	}

	public final ForeachstatementContext foreachstatement() throws RecognitionException {
		ForeachstatementContext _localctx = new ForeachstatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_foreachstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); match(Foreach);
			setState(251); match(OpenRoundBracket);
			setState(252); variable();
			setState(253); match(As);
			setState(254); arrayEntry();
			setState(255); match(CloseRoundBracket);
			setState(256); statement();
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

	public static class WhilestatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(PHPParser.While, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhilestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterWhilestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitWhilestatement(this);
		}
	}

	public final WhilestatementContext whilestatement() throws RecognitionException {
		WhilestatementContext _localctx = new WhilestatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whilestatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258); match(While);
			setState(259); match(OpenRoundBracket);
			setState(261);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << List) | (1L << New) | (1L << Clone) | (1L << Ampersand) | (1L << Bang) | (1L << Minus) | (1L << Tilde) | (1L << SuppressWarnings) | (1L << Dollar) | (1L << OpenRoundBracket))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Array - 69)) | (1L << (DecimalNumber - 69)) | (1L << (HexNumber - 69)) | (1L << (OctalNumber - 69)) | (1L << (Float - 69)) | (1L << (Boolean - 69)) | (1L << (SingleQuotedString - 69)) | (1L << (DoubleQuotedString - 69)) | (1L << (Identifier - 69)) | (1L << (IncrementOperator - 69)))) != 0)) {
				{
				setState(260); expression();
				}
			}

			setState(263); match(CloseRoundBracket);
			setState(264); statement();
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

	public static class DostatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(PHPParser.While, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Do() { return getToken(PHPParser.Do, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DostatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dostatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterDostatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitDostatement(this);
		}
	}

	public final DostatementContext dostatement() throws RecognitionException {
		DostatementContext _localctx = new DostatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dostatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266); match(Do);
			setState(267); statement();
			setState(268); match(While);
			setState(269); match(OpenRoundBracket);
			setState(270); expression();
			setState(271); match(CloseRoundBracket);
			setState(272); match(SemiColon);
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

	public static class SwitchstatementContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(PHPParser.Switch, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CasesContext cases() {
			return getRuleContext(CasesContext.class,0);
		}
		public SwitchstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterSwitchstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitSwitchstatement(this);
		}
	}

	public final SwitchstatementContext switchstatement() throws RecognitionException {
		SwitchstatementContext _localctx = new SwitchstatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_switchstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274); match(Switch);
			setState(275); match(OpenRoundBracket);
			setState(276); expression();
			setState(277); match(CloseRoundBracket);
			setState(278); match(OpenCurlyBracket);
			setState(279); cases();
			setState(280); match(CloseCurlyBracket);
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

	public static class SimpleStatementContext extends ParserRuleContext {
		public RequireStatementContext requireStatement() {
			return getRuleContext(RequireStatementContext.class,0);
		}
		public GlobalStatementContext globalStatement() {
			return getRuleContext(GlobalStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public StaticVariableAssignmentStatementContext staticVariableAssignmentStatement() {
			return getRuleContext(StaticVariableAssignmentStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitSimpleStatement(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_simpleStatement);
		try {
			setState(289);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282); globalStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283); staticVariableAssignmentStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284); breakStatement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(285); continueStatement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(286); returnStatement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(287); requireStatement();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(288); expression();
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

	public static class GlobalStatementContext extends ParserRuleContext {
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode Global() { return getToken(PHPParser.Global, 0); }
		public TerminalNode Comma(int i) {
			return getToken(PHPParser.Comma, i);
		}
		public List<TerminalNode> Comma() { return getTokens(PHPParser.Comma); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public GlobalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterGlobalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitGlobalStatement(this);
		}
	}

	public final GlobalStatementContext globalStatement() throws RecognitionException {
		GlobalStatementContext _localctx = new GlobalStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_globalStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291); match(Global);
			setState(292); name();
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(293); match(Comma);
				setState(294); name();
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StaticVariableAssignmentStatementContext extends ParserRuleContext {
		public TerminalNode Static() { return getToken(PHPParser.Static, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Equals() { return getToken(PHPParser.Equals, 0); }
		public StaticVariableAssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticVariableAssignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterStaticVariableAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitStaticVariableAssignmentStatement(this);
		}
	}

	public final StaticVariableAssignmentStatementContext staticVariableAssignmentStatement() throws RecognitionException {
		StaticVariableAssignmentStatementContext _localctx = new StaticVariableAssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_staticVariableAssignmentStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_la = _input.LA(1);
			if (_la==Static) {
				{
				setState(300); match(Static);
				}
			}

			setState(303); variable();
			setState(304); match(Equals);
			setState(305); expression();
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(PHPParser.Break, 0); }
		public TerminalNode DecimalNumber() { return getToken(PHPParser.DecimalNumber, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307); match(Break);
			setState(309);
			_la = _input.LA(1);
			if (_la==DecimalNumber) {
				{
				setState(308); match(DecimalNumber);
				}
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(PHPParser.Continue, 0); }
		public TerminalNode DecimalNumber() { return getToken(PHPParser.DecimalNumber, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311); match(Continue);
			setState(313);
			_la = _input.LA(1);
			if (_la==DecimalNumber) {
				{
				setState(312); match(DecimalNumber);
				}
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Return() { return getToken(PHPParser.Return, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315); match(Return);
			setState(317);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << List) | (1L << New) | (1L << Clone) | (1L << Ampersand) | (1L << Bang) | (1L << Minus) | (1L << Tilde) | (1L << SuppressWarnings) | (1L << Dollar) | (1L << OpenRoundBracket))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Array - 69)) | (1L << (DecimalNumber - 69)) | (1L << (HexNumber - 69)) | (1L << (OctalNumber - 69)) | (1L << (Float - 69)) | (1L << (Boolean - 69)) | (1L << (SingleQuotedString - 69)) | (1L << (DoubleQuotedString - 69)) | (1L << (Identifier - 69)) | (1L << (IncrementOperator - 69)))) != 0)) {
				{
				setState(316); expression();
				}
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

	public static class RequireStatementContext extends ParserRuleContext {
		public TerminalNode RequireOperator() { return getToken(PHPParser.RequireOperator, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RequireStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requireStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterRequireStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitRequireStatement(this);
		}
	}

	public final RequireStatementContext requireStatement() throws RecognitionException {
		RequireStatementContext _localctx = new RequireStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_requireStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319); match(RequireOperator);
			setState(320); expression();
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

	public static class CasesContext extends ParserRuleContext {
		public DefaultcaseContext defaultcase() {
			return getRuleContext(DefaultcaseContext.class,0);
		}
		public CasestatementContext casestatement(int i) {
			return getRuleContext(CasestatementContext.class,i);
		}
		public List<CasestatementContext> casestatement() {
			return getRuleContexts(CasestatementContext.class);
		}
		public CasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterCases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitCases(this);
		}
	}

	public final CasesContext cases() throws RecognitionException {
		CasesContext _localctx = new CasesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Case) {
				{
				{
				setState(322); casestatement();
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(328); defaultcase();
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

	public static class CasestatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode Colon() { return getToken(PHPParser.Colon, 0); }
		public TerminalNode Case() { return getToken(PHPParser.Case, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CasestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterCasestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitCasestatement(this);
		}
	}

	public final CasestatementContext casestatement() throws RecognitionException {
		CasestatementContext _localctx = new CasestatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_casestatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330); match(Case);
			setState(331); expression();
			setState(332); match(Colon);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << List) | (1L << Global) | (1L << Continue) | (1L << Return) | (1L << Class) | (1L << Do) | (1L << Switch) | (1L << Function) | (1L << Break) | (1L << If) | (1L << For) | (1L << Foreach) | (1L << While) | (1L << New) | (1L << Clone) | (1L << Ampersand) | (1L << Bang) | (1L << Minus) | (1L << Tilde) | (1L << SuppressWarnings) | (1L << Dollar) | (1L << OpenRoundBracket) | (1L << OpenCurlyBracket) | (1L << Interface))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Abstract - 64)) | (1L << (Static - 64)) | (1L << (SinglelineComment - 64)) | (1L << (Array - 64)) | (1L << (RequireOperator - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (OctalNumber - 64)) | (1L << (Float - 64)) | (1L << (Boolean - 64)) | (1L << (SingleQuotedString - 64)) | (1L << (DoubleQuotedString - 64)) | (1L << (Identifier - 64)) | (1L << (IncrementOperator - 64)))) != 0)) {
				{
				{
				setState(333); statement();
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class DefaultcaseContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode Colon() { return getToken(PHPParser.Colon, 0); }
		public TerminalNode Default() { return getToken(PHPParser.Default, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DefaultcaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultcase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterDefaultcase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitDefaultcase(this);
		}
	}

	public final DefaultcaseContext defaultcase() throws RecognitionException {
		DefaultcaseContext _localctx = new DefaultcaseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_defaultcase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(339); match(Default);
			setState(340); match(Colon);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << List) | (1L << Global) | (1L << Continue) | (1L << Return) | (1L << Class) | (1L << Do) | (1L << Switch) | (1L << Function) | (1L << Break) | (1L << If) | (1L << For) | (1L << Foreach) | (1L << While) | (1L << New) | (1L << Clone) | (1L << Ampersand) | (1L << Bang) | (1L << Minus) | (1L << Tilde) | (1L << SuppressWarnings) | (1L << Dollar) | (1L << OpenRoundBracket) | (1L << OpenCurlyBracket) | (1L << Interface))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Abstract - 64)) | (1L << (Static - 64)) | (1L << (SinglelineComment - 64)) | (1L << (Array - 64)) | (1L << (RequireOperator - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (OctalNumber - 64)) | (1L << (Float - 64)) | (1L << (Boolean - 64)) | (1L << (SingleQuotedString - 64)) | (1L << (DoubleQuotedString - 64)) | (1L << (Identifier - 64)) | (1L << (IncrementOperator - 64)))) != 0)) {
				{
				{
				setState(341); statement();
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class SinglelinecommentContext extends ParserRuleContext {
		public TerminalNode SinglelineComment() { return getToken(PHPParser.SinglelineComment, 0); }
		public SinglelinecommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singlelinecomment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterSinglelinecomment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitSinglelinecomment(this);
		}
	}

	public final SinglelinecommentContext singlelinecomment() throws RecognitionException {
		SinglelinecommentContext _localctx = new SinglelinecommentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_singlelinecomment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347); match(SinglelineComment);
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

	public static class VariableContext extends ParserRuleContext {
		public VariablenameContext variablename(int i) {
			return getRuleContext(VariablenameContext.class,i);
		}
		public TerminalNode Dollar() { return getToken(PHPParser.Dollar, 0); }
		public TerminalNode InstanceMember() { return getToken(PHPParser.InstanceMember, 0); }
		public List<VariablenameContext> variablename() {
			return getRuleContexts(VariablenameContext.class);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variable);
		try {
			setState(356);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349); match(Dollar);
				setState(350); variablename();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351); match(Dollar);
				setState(352); variablename();
				setState(353); match(InstanceMember);
				setState(354); variablename();
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

	public static class VariablenameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PHPParser.Identifier, 0); }
		public VariablenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterVariablename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitVariablename(this);
		}
	}

	public final VariablenameContext variablename() throws RecognitionException {
		VariablenameContext _localctx = new VariablenameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_variablename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358); match(Identifier);
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

	public static class NameContext extends ParserRuleContext {
		public StaticMemberAccessContext staticMemberAccess() {
			return getRuleContext(StaticMemberAccessContext.class,0);
		}
		public MemberAccessContext memberAccess() {
			return getRuleContext(MemberAccessContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_name);
		try {
			setState(363);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360); staticMemberAccess();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361); memberAccess();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(362); variable();
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

	public static class StaticMemberAccessContext extends ParserRuleContext {
		public TerminalNode ClassMember() { return getToken(PHPParser.ClassMember, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PHPParser.Identifier, 0); }
		public StaticMemberAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticMemberAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterStaticMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitStaticMemberAccess(this);
		}
	}

	public final StaticMemberAccessContext staticMemberAccess() throws RecognitionException {
		StaticMemberAccessContext _localctx = new StaticMemberAccessContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_staticMemberAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365); match(Identifier);
			setState(366); match(ClassMember);
			setState(367); variable();
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

	public static class MemberAccessContext extends ParserRuleContext {
		public List<TerminalNode> OpenSquareBracket() { return getTokens(PHPParser.OpenSquareBracket); }
		public TerminalNode CloseSquareBracket(int i) {
			return getToken(PHPParser.CloseSquareBracket, i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> CloseSquareBracket() { return getTokens(PHPParser.CloseSquareBracket); }
		public TerminalNode OpenSquareBracket(int i) {
			return getToken(PHPParser.OpenSquareBracket, i);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MemberAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitMemberAccess(this);
		}
	}

	public final MemberAccessContext memberAccess() throws RecognitionException {
		MemberAccessContext _localctx = new MemberAccessContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_memberAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369); variable();
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpenSquareBracket) {
				{
				{
				setState(370); match(OpenSquareBracket);
				setState(371); expression();
				setState(372); match(CloseSquareBracket);
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class BracketedBlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BracketedBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketedBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterBracketedBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitBracketedBlock(this);
		}
	}

	public final BracketedBlockContext bracketedBlock() throws RecognitionException {
		BracketedBlockContext _localctx = new BracketedBlockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_bracketedBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379); match(OpenCurlyBracket);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << List) | (1L << Global) | (1L << Continue) | (1L << Return) | (1L << Class) | (1L << Do) | (1L << Switch) | (1L << Function) | (1L << Break) | (1L << If) | (1L << For) | (1L << Foreach) | (1L << While) | (1L << New) | (1L << Clone) | (1L << Ampersand) | (1L << Bang) | (1L << Minus) | (1L << Tilde) | (1L << SuppressWarnings) | (1L << Dollar) | (1L << OpenRoundBracket) | (1L << OpenCurlyBracket) | (1L << Interface))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Abstract - 64)) | (1L << (Static - 64)) | (1L << (SinglelineComment - 64)) | (1L << (Array - 64)) | (1L << (RequireOperator - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (OctalNumber - 64)) | (1L << (Float - 64)) | (1L << (Boolean - 64)) | (1L << (SingleQuotedString - 64)) | (1L << (DoubleQuotedString - 64)) | (1L << (Identifier - 64)) | (1L << (IncrementOperator - 64)))) != 0)) {
				{
				{
				setState(380); statement();
				}
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(386); match(CloseCurlyBracket);
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

	public static class InterfaceDefinitionContext extends ParserRuleContext {
		public TerminalNode OpenCurlyBracket() { return getToken(PHPParser.OpenCurlyBracket, 0); }
		public InterfaceNameContext interfaceName() {
			return getRuleContext(InterfaceNameContext.class,0);
		}
		public InterfaceExtendsContext interfaceExtends() {
			return getRuleContext(InterfaceExtendsContext.class,0);
		}
		public TerminalNode CloseCurlyBracket() { return getToken(PHPParser.CloseCurlyBracket, 0); }
		public List<InterfaceMemberContext> interfaceMember() {
			return getRuleContexts(InterfaceMemberContext.class);
		}
		public TerminalNode Interface() { return getToken(PHPParser.Interface, 0); }
		public InterfaceMemberContext interfaceMember(int i) {
			return getRuleContext(InterfaceMemberContext.class,i);
		}
		public InterfaceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterInterfaceDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitInterfaceDefinition(this);
		}
	}

	public final InterfaceDefinitionContext interfaceDefinition() throws RecognitionException {
		InterfaceDefinitionContext _localctx = new InterfaceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_interfaceDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388); match(Interface);
			setState(389); interfaceName();
			setState(391);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(390); interfaceExtends();
				}
			}

			setState(393); match(OpenCurlyBracket);
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (Const - 12)) | (1L << (Function - 12)) | (1L << (Abstract - 12)) | (1L << (Static - 12)) | (1L << (AccessModifier - 12)))) != 0)) {
				{
				{
				setState(394); interfaceMember();
				}
				}
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(400); match(CloseCurlyBracket);
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

	public static class InterfaceNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PHPParser.Identifier, 0); }
		public InterfaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterInterfaceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitInterfaceName(this);
		}
	}

	public final InterfaceNameContext interfaceName() throws RecognitionException {
		InterfaceNameContext _localctx = new InterfaceNameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_interfaceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402); match(Identifier);
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

	public static class InterfaceExtendsContext extends ParserRuleContext {
		public TerminalNode Extends() { return getToken(PHPParser.Extends, 0); }
		public List<InterfaceNameContext> interfaceName() {
			return getRuleContexts(InterfaceNameContext.class);
		}
		public TerminalNode Comma(int i) {
			return getToken(PHPParser.Comma, i);
		}
		public InterfaceNameContext interfaceName(int i) {
			return getRuleContext(InterfaceNameContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PHPParser.Comma); }
		public InterfaceExtendsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceExtends; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterInterfaceExtends(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitInterfaceExtends(this);
		}
	}

	public final InterfaceExtendsContext interfaceExtends() throws RecognitionException {
		InterfaceExtendsContext _localctx = new InterfaceExtendsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_interfaceExtends);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404); match(Extends);
			setState(405); interfaceName();
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(406); match(Comma);
				setState(407); interfaceName();
				}
				}
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class InterfaceMemberContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(PHPParser.Function, 0); }
		public TerminalNode Identifier() { return getToken(PHPParser.Identifier, 0); }
		public ParametersDefinitionContext parametersDefinition() {
			return getRuleContext(ParametersDefinitionContext.class,0);
		}
		public TerminalNode Const() { return getToken(PHPParser.Const, 0); }
		public TerminalNode Equals() { return getToken(PHPParser.Equals, 0); }
		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class,i);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public InterfaceMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterInterfaceMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitInterfaceMember(this);
		}
	}

	public final InterfaceMemberContext interfaceMember() throws RecognitionException {
		InterfaceMemberContext _localctx = new InterfaceMemberContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_interfaceMember);
		int _la;
		try {
			setState(431);
			switch (_input.LA(1)) {
			case Const:
				enterOuterAlt(_localctx, 1);
				{
				setState(413); match(Const);
				setState(414); match(Identifier);
				setState(417);
				_la = _input.LA(1);
				if (_la==Equals) {
					{
					setState(415); match(Equals);
					setState(416); atom();
					}
				}

				setState(419); match(SemiColon);
				}
				break;
			case Function:
			case Abstract:
			case Static:
			case AccessModifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Abstract - 64)) | (1L << (Static - 64)) | (1L << (AccessModifier - 64)))) != 0)) {
					{
					{
					setState(420); fieldModifier();
					}
					}
					setState(425);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(426); match(Function);
				setState(427); functionName();
				setState(428); parametersDefinition();
				setState(429); match(SemiColon);
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

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PHPParser.Identifier, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitClassName(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433); match(Identifier);
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

	public static class ClassDefinitionContext extends ParserRuleContext {
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassModifierContext classModifier() {
			return getRuleContext(ClassModifierContext.class,0);
		}
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public TerminalNode Extends() { return getToken(PHPParser.Extends, 0); }
		public TerminalNode Class() { return getToken(PHPParser.Class, 0); }
		public TerminalNode OpenCurlyBracket() { return getToken(PHPParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(PHPParser.CloseCurlyBracket, 0); }
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public ClassImplementsContext classImplements() {
			return getRuleContext(ClassImplementsContext.class,0);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public ClassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterClassDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitClassDefinition(this);
		}
	}

	public final ClassDefinitionContext classDefinition() throws RecognitionException {
		ClassDefinitionContext _localctx = new ClassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_classDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			_la = _input.LA(1);
			if (_la==Abstract) {
				{
				setState(435); classModifier();
				}
			}

			setState(438); match(Class);
			setState(439); className();
			setState(442);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(440); match(Extends);
				setState(441); className();
				}
			}

			setState(445);
			_la = _input.LA(1);
			if (_la==Implements) {
				{
				setState(444); classImplements();
				}
			}

			setState(447); match(OpenCurlyBracket);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (Const - 12)) | (1L << (Var - 12)) | (1L << (Function - 12)) | (1L << (Dollar - 12)) | (1L << (Abstract - 12)) | (1L << (Static - 12)) | (1L << (AccessModifier - 12)))) != 0)) {
				{
				{
				setState(448); classMember();
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(454); match(CloseCurlyBracket);
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

	public static class ClassImplementsContext extends ParserRuleContext {
		public List<InterfaceNameContext> interfaceName() {
			return getRuleContexts(InterfaceNameContext.class);
		}
		public TerminalNode Implements() { return getToken(PHPParser.Implements, 0); }
		public TerminalNode Comma(int i) {
			return getToken(PHPParser.Comma, i);
		}
		public InterfaceNameContext interfaceName(int i) {
			return getRuleContext(InterfaceNameContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PHPParser.Comma); }
		public ClassImplementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classImplements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterClassImplements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitClassImplements(this);
		}
	}

	public final ClassImplementsContext classImplements() throws RecognitionException {
		ClassImplementsContext _localctx = new ClassImplementsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_classImplements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456); match(Implements);
			{
			setState(457); interfaceName();
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(458); match(Comma);
				setState(459); interfaceName();
				}
				}
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ClassMemberContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(PHPParser.Function, 0); }
		public BracketedBlockContext bracketedBlock() {
			return getRuleContext(BracketedBlockContext.class,0);
		}
		public TerminalNode Var() { return getToken(PHPParser.Var, 0); }
		public FieldDefinitionContext fieldDefinition() {
			return getRuleContext(FieldDefinitionContext.class,0);
		}
		public ParametersDefinitionContext parametersDefinition() {
			return getRuleContext(ParametersDefinitionContext.class,0);
		}
		public ConstDefinitionContext constDefinition() {
			return getRuleContext(ConstDefinitionContext.class,0);
		}
		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class,i);
		}
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterClassMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitClassMember(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_classMember);
		int _la;
		try {
			setState(493);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Abstract - 64)) | (1L << (Static - 64)) | (1L << (AccessModifier - 64)))) != 0)) {
					{
					{
					setState(465); fieldModifier();
					}
					}
					setState(470);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(471); match(Function);
				setState(472); functionName();
				setState(473); parametersDefinition();
				setState(476);
				switch (_input.LA(1)) {
				case OpenCurlyBracket:
					{
					setState(474); bracketedBlock();
					}
					break;
				case SemiColon:
					{
					setState(475); match(SemiColon);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(478); constDefinition();
				setState(479); match(SemiColon);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(482);
				_la = _input.LA(1);
				if (_la==Var) {
					{
					setState(481); match(Var);
					}
				}

				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Abstract - 64)) | (1L << (Static - 64)) | (1L << (AccessModifier - 64)))) != 0)) {
					{
					{
					setState(484); fieldModifier();
					}
					}
					setState(489);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(490); fieldDefinition();
				setState(491); match(SemiColon);
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

	public static class ClassModifierContext extends ParserRuleContext {
		public TerminalNode Abstract() { return getToken(PHPParser.Abstract, 0); }
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitClassModifier(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_classModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495); match(Abstract);
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

	public static class ConstDefinitionContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(PHPParser.Const, 0); }
		public TerminalNode Equals() { return getToken(PHPParser.Equals, 0); }
		public VariablenameContext variablename() {
			return getRuleContext(VariablenameContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ConstDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterConstDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitConstDefinition(this);
		}
	}

	public final ConstDefinitionContext constDefinition() throws RecognitionException {
		ConstDefinitionContext _localctx = new ConstDefinitionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_constDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497); match(Const);
			setState(498); variablename();
			setState(499); match(Equals);
			setState(500); atom();
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

	public static class FieldDefinitionContext extends ParserRuleContext {
		public TerminalNode Equals() { return getToken(PHPParser.Equals, 0); }
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public FieldDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterFieldDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitFieldDefinition(this);
		}
	}

	public final FieldDefinitionContext fieldDefinition() throws RecognitionException {
		FieldDefinitionContext _localctx = new FieldDefinitionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_fieldDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502); fieldName();
			setState(505);
			_la = _input.LA(1);
			if (_la==Equals) {
				{
				setState(503); match(Equals);
				setState(504); atom();
				}
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

	public static class FieldModifierContext extends ParserRuleContext {
		public TerminalNode AccessModifier() { return getToken(PHPParser.AccessModifier, 0); }
		public TerminalNode Static() { return getToken(PHPParser.Static, 0); }
		public TerminalNode Abstract() { return getToken(PHPParser.Abstract, 0); }
		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterFieldModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitFieldModifier(this);
		}
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_fieldModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			_la = _input.LA(1);
			if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Abstract - 64)) | (1L << (Static - 64)) | (1L << (AccessModifier - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class FieldNameContext extends ParserRuleContext {
		public TerminalNode Dollar() { return getToken(PHPParser.Dollar, 0); }
		public VariablenameContext variablename() {
			return getRuleContext(VariablenameContext.class,0);
		}
		public FieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterFieldName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitFieldName(this);
		}
	}

	public final FieldNameContext fieldName() throws RecognitionException {
		FieldNameContext _localctx = new FieldNameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_fieldName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509); match(Dollar);
			setState(510); variablename();
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(PHPParser.Function, 0); }
		public BracketedBlockContext bracketedBlock() {
			return getRuleContext(BracketedBlockContext.class,0);
		}
		public ParametersDefinitionContext parametersDefinition() {
			return getRuleContext(ParametersDefinitionContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitFunctionDefinition(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512); match(Function);
			setState(513); functionName();
			setState(514); parametersDefinition();
			setState(515); bracketedBlock();
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

	public static class ParametersDefinitionContext extends ParserRuleContext {
		public ParamDefContext paramDef(int i) {
			return getRuleContext(ParamDefContext.class,i);
		}
		public TerminalNode OpenRoundBracket() { return getToken(PHPParser.OpenRoundBracket, 0); }
		public List<ParamDefContext> paramDef() {
			return getRuleContexts(ParamDefContext.class);
		}
		public TerminalNode Comma(int i) {
			return getToken(PHPParser.Comma, i);
		}
		public List<TerminalNode> Comma() { return getTokens(PHPParser.Comma); }
		public TerminalNode CloseRoundBracket() { return getToken(PHPParser.CloseRoundBracket, 0); }
		public ParametersDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterParametersDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitParametersDefinition(this);
		}
	}

	public final ParametersDefinitionContext parametersDefinition() throws RecognitionException {
		ParametersDefinitionContext _localctx = new ParametersDefinitionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_parametersDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517); match(OpenRoundBracket);
			setState(526);
			_la = _input.LA(1);
			if (_la==Ampersand || _la==Dollar) {
				{
				setState(518); paramDef();
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(519); match(Comma);
					setState(520); paramDef();
					}
					}
					setState(525);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(528); match(CloseRoundBracket);
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

	public static class FunctionInvocationContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FunctionInvocationParametersContext functionInvocationParameters() {
			return getRuleContext(FunctionInvocationParametersContext.class,0);
		}
		public FunctionInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterFunctionInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitFunctionInvocation(this);
		}
	}

	public final FunctionInvocationContext functionInvocation() throws RecognitionException {
		FunctionInvocationContext _localctx = new FunctionInvocationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_functionInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530); functionName();
			setState(531); functionInvocationParameters();
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

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PHPParser.Identifier, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitFunctionName(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533); match(Identifier);
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

	public static class FunctionInvocationParametersContext extends ParserRuleContext {
		public CommaListContext commaList() {
			return getRuleContext(CommaListContext.class,0);
		}
		public TerminalNode OpenRoundBracket() { return getToken(PHPParser.OpenRoundBracket, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(PHPParser.CloseRoundBracket, 0); }
		public FunctionInvocationParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionInvocationParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterFunctionInvocationParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitFunctionInvocationParameters(this);
		}
	}

	public final FunctionInvocationParametersContext functionInvocationParameters() throws RecognitionException {
		FunctionInvocationParametersContext _localctx = new FunctionInvocationParametersContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_functionInvocationParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(535); match(OpenRoundBracket);
				}
				break;
			}
			setState(539);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(538); commaList();
				}
				break;
			}
			setState(542);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(541); match(CloseRoundBracket);
				}
				break;
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

	public static class ParamDefContext extends ParserRuleContext {
		public ParamNameContext paramName() {
			return getRuleContext(ParamNameContext.class,0);
		}
		public TerminalNode Equals() { return getToken(PHPParser.Equals, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ParamDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterParamDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitParamDef(this);
		}
	}

	public final ParamDefContext paramDef() throws RecognitionException {
		ParamDefContext _localctx = new ParamDefContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_paramDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544); paramName();
			setState(547);
			_la = _input.LA(1);
			if (_la==Equals) {
				{
				setState(545); match(Equals);
				setState(546); atom();
				}
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

	public static class ParamNameContext extends ParserRuleContext {
		public TerminalNode Ampersand() { return getToken(PHPParser.Ampersand, 0); }
		public TerminalNode Identifier() { return getToken(PHPParser.Identifier, 0); }
		public TerminalNode Dollar() { return getToken(PHPParser.Dollar, 0); }
		public ParamNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterParamName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitParamName(this);
		}
	}

	public final ParamNameContext paramName() throws RecognitionException {
		ParamNameContext _localctx = new ParamNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_paramName);
		try {
			setState(554);
			switch (_input.LA(1)) {
			case Dollar:
				enterOuterAlt(_localctx, 1);
				{
				setState(549); match(Dollar);
				setState(550); match(Identifier);
				}
				break;
			case Ampersand:
				enterOuterAlt(_localctx, 2);
				{
				setState(551); match(Ampersand);
				setState(552); match(Dollar);
				setState(553); match(Identifier);
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

	public static class CommaListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public CommaListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterCommaList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitCommaList(this);
		}
	}

	public final CommaListContext commaList() throws RecognitionException {
		CommaListContext _localctx = new CommaListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_commaList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(556); expression();
			setState(561);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(557); match(Comma);
					setState(558); expression();
					}
					} 
				}
				setState(563);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public WeakLogicalOrContext weakLogicalOr() {
			return getRuleContext(WeakLogicalOrContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564); weakLogicalOr();
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

	public static class WeakLogicalOrContext extends ParserRuleContext {
		public TerminalNode Or(int i) {
			return getToken(PHPParser.Or, i);
		}
		public WeakLogicalXorContext weakLogicalXor(int i) {
			return getRuleContext(WeakLogicalXorContext.class,i);
		}
		public List<WeakLogicalXorContext> weakLogicalXor() {
			return getRuleContexts(WeakLogicalXorContext.class);
		}
		public List<TerminalNode> Or() { return getTokens(PHPParser.Or); }
		public WeakLogicalOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weakLogicalOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterWeakLogicalOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitWeakLogicalOr(this);
		}
	}

	public final WeakLogicalOrContext weakLogicalOr() throws RecognitionException {
		WeakLogicalOrContext _localctx = new WeakLogicalOrContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_weakLogicalOr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(566); weakLogicalXor();
			setState(571);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(567); match(Or);
					setState(568); weakLogicalXor();
					}
					} 
				}
				setState(573);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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

	public static class WeakLogicalXorContext extends ParserRuleContext {
		public TerminalNode Xor(int i) {
			return getToken(PHPParser.Xor, i);
		}
		public List<TerminalNode> Xor() { return getTokens(PHPParser.Xor); }
		public WeakLogicalAndContext weakLogicalAnd(int i) {
			return getRuleContext(WeakLogicalAndContext.class,i);
		}
		public List<WeakLogicalAndContext> weakLogicalAnd() {
			return getRuleContexts(WeakLogicalAndContext.class);
		}
		public WeakLogicalXorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weakLogicalXor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterWeakLogicalXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitWeakLogicalXor(this);
		}
	}

	public final WeakLogicalXorContext weakLogicalXor() throws RecognitionException {
		WeakLogicalXorContext _localctx = new WeakLogicalXorContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_weakLogicalXor);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(574); weakLogicalAnd();
			setState(579);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(575); match(Xor);
					setState(576); weakLogicalAnd();
					}
					} 
				}
				setState(581);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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

	public static class WeakLogicalAndContext extends ParserRuleContext {
		public List<TerminalNode> And() { return getTokens(PHPParser.And); }
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public TerminalNode And(int i) {
			return getToken(PHPParser.And, i);
		}
		public WeakLogicalAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weakLogicalAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterWeakLogicalAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitWeakLogicalAnd(this);
		}
	}

	public final WeakLogicalAndContext weakLogicalAnd() throws RecognitionException {
		WeakLogicalAndContext _localctx = new WeakLogicalAndContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_weakLogicalAnd);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(582); assignment();
			setState(587);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(583); match(And);
					setState(584); assignment();
					}
					} 
				}
				setState(589);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode AssignmentOperator() { return getToken(PHPParser.AssignmentOperator, 0); }
		public ListVariablesContext listVariables() {
			return getRuleContext(ListVariablesContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode Equals() { return getToken(PHPParser.Equals, 0); }
		public TernaryContext ternary() {
			return getRuleContext(TernaryContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_assignment);
		int _la;
		try {
			setState(595);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(590); listVariables();
				{
				setState(591);
				_la = _input.LA(1);
				if ( !(_la==Equals || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(592); assignment();
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(594); ternary();
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

	public static class ListVariablesContext extends ParserRuleContext {
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode List() { return getToken(PHPParser.List, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PHPParser.OpenRoundBracket, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(PHPParser.CloseRoundBracket, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public ListVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterListVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitListVariables(this);
		}
	}

	public final ListVariablesContext listVariables() throws RecognitionException {
		ListVariablesContext _localctx = new ListVariablesContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_listVariables);
		int _la;
		try {
			setState(610);
			switch (_input.LA(1)) {
			case List:
				enterOuterAlt(_localctx, 1);
				{
				setState(597); match(List);
				setState(598); match(OpenRoundBracket);
				setState(599); name();
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(600); match(Comma);
					setState(601); name();
					}
					}
					setState(606);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(607); match(CloseRoundBracket);
				}
				break;
			case Dollar:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(609); name();
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

	public static class TernaryContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(PHPParser.Colon, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode QuestionMark() { return getToken(PHPParser.QuestionMark, 0); }
		public LogicalOrContext logicalOr() {
			return getRuleContext(LogicalOrContext.class,0);
		}
		public TernaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterTernary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitTernary(this);
		}
	}

	public final TernaryContext ternary() throws RecognitionException {
		TernaryContext _localctx = new TernaryContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_ternary);
		try {
			setState(619);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(612); logicalOr();
				setState(613); match(QuestionMark);
				setState(614); expression();
				setState(615); match(Colon);
				setState(616); expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(618); logicalOr();
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

	public static class LogicalOrContext extends ParserRuleContext {
		public List<LogicalAndContext> logicalAnd() {
			return getRuleContexts(LogicalAndContext.class);
		}
		public List<TerminalNode> LogicalOr() { return getTokens(PHPParser.LogicalOr); }
		public LogicalAndContext logicalAnd(int i) {
			return getRuleContext(LogicalAndContext.class,i);
		}
		public TerminalNode LogicalOr(int i) {
			return getToken(PHPParser.LogicalOr, i);
		}
		public LogicalOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterLogicalOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitLogicalOr(this);
		}
	}

	public final LogicalOrContext logicalOr() throws RecognitionException {
		LogicalOrContext _localctx = new LogicalOrContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_logicalOr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(621); logicalAnd();
			setState(626);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(622); match(LogicalOr);
					setState(623); logicalAnd();
					}
					} 
				}
				setState(628);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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

	public static class LogicalAndContext extends ParserRuleContext {
		public List<BitwiseOrContext> bitwiseOr() {
			return getRuleContexts(BitwiseOrContext.class);
		}
		public TerminalNode LogicalAnd(int i) {
			return getToken(PHPParser.LogicalAnd, i);
		}
		public List<TerminalNode> LogicalAnd() { return getTokens(PHPParser.LogicalAnd); }
		public BitwiseOrContext bitwiseOr(int i) {
			return getRuleContext(BitwiseOrContext.class,i);
		}
		public LogicalAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterLogicalAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitLogicalAnd(this);
		}
	}

	public final LogicalAndContext logicalAnd() throws RecognitionException {
		LogicalAndContext _localctx = new LogicalAndContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_logicalAnd);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(629); bitwiseOr();
			setState(634);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(630); match(LogicalAnd);
					setState(631); bitwiseOr();
					}
					} 
				}
				setState(636);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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

	public static class BitwiseOrContext extends ParserRuleContext {
		public TerminalNode Pipe(int i) {
			return getToken(PHPParser.Pipe, i);
		}
		public List<TerminalNode> Pipe() { return getTokens(PHPParser.Pipe); }
		public BitWiseAndContext bitWiseAnd(int i) {
			return getRuleContext(BitWiseAndContext.class,i);
		}
		public List<BitWiseAndContext> bitWiseAnd() {
			return getRuleContexts(BitWiseAndContext.class);
		}
		public BitwiseOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterBitwiseOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitBitwiseOr(this);
		}
	}

	public final BitwiseOrContext bitwiseOr() throws RecognitionException {
		BitwiseOrContext _localctx = new BitwiseOrContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_bitwiseOr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(637); bitWiseAnd();
			setState(642);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(638); match(Pipe);
					setState(639); bitWiseAnd();
					}
					} 
				}
				setState(644);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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

	public static class BitWiseAndContext extends ParserRuleContext {
		public List<EqualityCheckContext> equalityCheck() {
			return getRuleContexts(EqualityCheckContext.class);
		}
		public List<TerminalNode> Ampersand() { return getTokens(PHPParser.Ampersand); }
		public EqualityCheckContext equalityCheck(int i) {
			return getRuleContext(EqualityCheckContext.class,i);
		}
		public TerminalNode Ampersand(int i) {
			return getToken(PHPParser.Ampersand, i);
		}
		public BitWiseAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitWiseAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterBitWiseAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitBitWiseAnd(this);
		}
	}

	public final BitWiseAndContext bitWiseAnd() throws RecognitionException {
		BitWiseAndContext _localctx = new BitWiseAndContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_bitWiseAnd);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(645); equalityCheck();
			setState(650);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(646); match(Ampersand);
					setState(647); equalityCheck();
					}
					} 
				}
				setState(652);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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

	public static class EqualityCheckContext extends ParserRuleContext {
		public ComparisionCheckContext comparisionCheck(int i) {
			return getRuleContext(ComparisionCheckContext.class,i);
		}
		public List<ComparisionCheckContext> comparisionCheck() {
			return getRuleContexts(ComparisionCheckContext.class);
		}
		public TerminalNode EqualityOperator() { return getToken(PHPParser.EqualityOperator, 0); }
		public EqualityCheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityCheck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterEqualityCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitEqualityCheck(this);
		}
	}

	public final EqualityCheckContext equalityCheck() throws RecognitionException {
		EqualityCheckContext _localctx = new EqualityCheckContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_equalityCheck);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653); comparisionCheck();
			setState(656);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(654); match(EqualityOperator);
				setState(655); comparisionCheck();
				}
				break;
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

	public static class ComparisionCheckContext extends ParserRuleContext {
		public TerminalNode ComparisionOperator() { return getToken(PHPParser.ComparisionOperator, 0); }
		public List<BitWiseShiftContext> bitWiseShift() {
			return getRuleContexts(BitWiseShiftContext.class);
		}
		public BitWiseShiftContext bitWiseShift(int i) {
			return getRuleContext(BitWiseShiftContext.class,i);
		}
		public ComparisionCheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisionCheck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterComparisionCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitComparisionCheck(this);
		}
	}

	public final ComparisionCheckContext comparisionCheck() throws RecognitionException {
		ComparisionCheckContext _localctx = new ComparisionCheckContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_comparisionCheck);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658); bitWiseShift();
			setState(661);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(659); match(ComparisionOperator);
				setState(660); bitWiseShift();
				}
				break;
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

	public static class BitWiseShiftContext extends ParserRuleContext {
		public TerminalNode ShiftOperator(int i) {
			return getToken(PHPParser.ShiftOperator, i);
		}
		public List<TerminalNode> ShiftOperator() { return getTokens(PHPParser.ShiftOperator); }
		public AdditionContext addition(int i) {
			return getRuleContext(AdditionContext.class,i);
		}
		public List<AdditionContext> addition() {
			return getRuleContexts(AdditionContext.class);
		}
		public BitWiseShiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitWiseShift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterBitWiseShift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitBitWiseShift(this);
		}
	}

	public final BitWiseShiftContext bitWiseShift() throws RecognitionException {
		BitWiseShiftContext _localctx = new BitWiseShiftContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_bitWiseShift);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(663); addition();
			setState(668);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(664); match(ShiftOperator);
					setState(665); addition();
					}
					} 
				}
				setState(670);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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

	public static class AdditionContext extends ParserRuleContext {
		public TerminalNode Minus(int i) {
			return getToken(PHPParser.Minus, i);
		}
		public TerminalNode Plus(int i) {
			return getToken(PHPParser.Plus, i);
		}
		public List<TerminalNode> Plus() { return getTokens(PHPParser.Plus); }
		public List<TerminalNode> Dot() { return getTokens(PHPParser.Dot); }
		public MultiplicationContext multiplication(int i) {
			return getRuleContext(MultiplicationContext.class,i);
		}
		public List<MultiplicationContext> multiplication() {
			return getRuleContexts(MultiplicationContext.class);
		}
		public TerminalNode Dot(int i) {
			return getToken(PHPParser.Dot, i);
		}
		public List<TerminalNode> Minus() { return getTokens(PHPParser.Minus); }
		public AdditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitAddition(this);
		}
	}

	public final AdditionContext addition() throws RecognitionException {
		AdditionContext _localctx = new AdditionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_addition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(671); multiplication();
			setState(676);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(672);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Minus) | (1L << Dot))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(673); multiplication();
					}
					} 
				}
				setState(678);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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

	public static class MultiplicationContext extends ParserRuleContext {
		public List<TerminalNode> Percent() { return getTokens(PHPParser.Percent); }
		public List<LogicalNotContext> logicalNot() {
			return getRuleContexts(LogicalNotContext.class);
		}
		public TerminalNode Asterisk(int i) {
			return getToken(PHPParser.Asterisk, i);
		}
		public TerminalNode Percent(int i) {
			return getToken(PHPParser.Percent, i);
		}
		public LogicalNotContext logicalNot(int i) {
			return getRuleContext(LogicalNotContext.class,i);
		}
		public TerminalNode Forwardslash(int i) {
			return getToken(PHPParser.Forwardslash, i);
		}
		public List<TerminalNode> Forwardslash() { return getTokens(PHPParser.Forwardslash); }
		public List<TerminalNode> Asterisk() { return getTokens(PHPParser.Asterisk); }
		public MultiplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitMultiplication(this);
		}
	}

	public final MultiplicationContext multiplication() throws RecognitionException {
		MultiplicationContext _localctx = new MultiplicationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_multiplication);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(679); logicalNot();
			setState(684);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(680);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Asterisk) | (1L << Percent) | (1L << Forwardslash))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(681); logicalNot();
					}
					} 
				}
				setState(686);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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

	public static class LogicalNotContext extends ParserRuleContext {
		public LogicalNotContext logicalNot() {
			return getRuleContext(LogicalNotContext.class,0);
		}
		public InstanceOfContext instanceOf() {
			return getRuleContext(InstanceOfContext.class,0);
		}
		public TerminalNode Bang() { return getToken(PHPParser.Bang, 0); }
		public LogicalNotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalNot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitLogicalNot(this);
		}
	}

	public final LogicalNotContext logicalNot() throws RecognitionException {
		LogicalNotContext _localctx = new LogicalNotContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_logicalNot);
		try {
			setState(690);
			switch (_input.LA(1)) {
			case Bang:
				enterOuterAlt(_localctx, 1);
				{
				setState(687); match(Bang);
				setState(688); logicalNot();
				}
				break;
			case New:
			case Clone:
			case Ampersand:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case Array:
			case DecimalNumber:
			case HexNumber:
			case OctalNumber:
			case Float:
			case Boolean:
			case SingleQuotedString:
			case DoubleQuotedString:
			case Identifier:
			case IncrementOperator:
				enterOuterAlt(_localctx, 2);
				{
				setState(689); instanceOf();
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

	public static class InstanceOfContext extends ParserRuleContext {
		public List<NegateOrCastContext> negateOrCast() {
			return getRuleContexts(NegateOrCastContext.class);
		}
		public TerminalNode Instanceof() { return getToken(PHPParser.Instanceof, 0); }
		public NegateOrCastContext negateOrCast(int i) {
			return getRuleContext(NegateOrCastContext.class,i);
		}
		public InstanceOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterInstanceOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitInstanceOf(this);
		}
	}

	public final InstanceOfContext instanceOf() throws RecognitionException {
		InstanceOfContext _localctx = new InstanceOfContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_instanceOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692); negateOrCast();
			setState(695);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(693); match(Instanceof);
				setState(694); negateOrCast();
				}
				break;
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

	public static class NegateOrCastContext extends ParserRuleContext {
		public WeakLogicalAndContext weakLogicalAnd() {
			return getRuleContext(WeakLogicalAndContext.class,0);
		}
		public TerminalNode SuppressWarnings() { return getToken(PHPParser.SuppressWarnings, 0); }
		public TerminalNode Tilde() { return getToken(PHPParser.Tilde, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PHPParser.OpenRoundBracket, 0); }
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public TerminalNode PrimitiveType() { return getToken(PHPParser.PrimitiveType, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(PHPParser.CloseRoundBracket, 0); }
		public TerminalNode Minus() { return getToken(PHPParser.Minus, 0); }
		public NegateOrCastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negateOrCast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterNegateOrCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitNegateOrCast(this);
		}
	}

	public final NegateOrCastContext negateOrCast() throws RecognitionException {
		NegateOrCastContext _localctx = new NegateOrCastContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_negateOrCast);
		int _la;
		try {
			setState(708);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(697);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Minus) | (1L << Tilde) | (1L << SuppressWarnings))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(698); increment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(699); match(OpenRoundBracket);
				setState(700); match(PrimitiveType);
				setState(701); match(CloseRoundBracket);
				setState(702); increment();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(703); match(OpenRoundBracket);
				setState(704); weakLogicalAnd();
				setState(705); match(CloseRoundBracket);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(707); increment();
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

	public static class IncrementContext extends ParserRuleContext {
		public NewOrCloneContext newOrClone() {
			return getRuleContext(NewOrCloneContext.class,0);
		}
		public TerminalNode IncrementOperator() { return getToken(PHPParser.IncrementOperator, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitIncrement(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_increment);
		try {
			setState(716);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(710); match(IncrementOperator);
				setState(711); name();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(712); name();
				setState(713); match(IncrementOperator);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(715); newOrClone();
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

	public static class NewOrCloneContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(PHPParser.New, 0); }
		public AtomOrReferenceContext atomOrReference() {
			return getRuleContext(AtomOrReferenceContext.class,0);
		}
		public TerminalNode Clone() { return getToken(PHPParser.Clone, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NewOrCloneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newOrClone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterNewOrClone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitNewOrClone(this);
		}
	}

	public final NewOrCloneContext newOrClone() throws RecognitionException {
		NewOrCloneContext _localctx = new NewOrCloneContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_newOrClone);
		try {
			setState(723);
			switch (_input.LA(1)) {
			case New:
				enterOuterAlt(_localctx, 1);
				{
				setState(718); match(New);
				setState(719); name();
				}
				break;
			case Clone:
				enterOuterAlt(_localctx, 2);
				{
				setState(720); match(Clone);
				setState(721); name();
				}
				break;
			case Ampersand:
			case Dollar:
			case Array:
			case DecimalNumber:
			case HexNumber:
			case OctalNumber:
			case Float:
			case Boolean:
			case SingleQuotedString:
			case DoubleQuotedString:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(722); atomOrReference();
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

	public static class AtomOrReferenceContext extends ParserRuleContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomOrReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomOrReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterAtomOrReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitAtomOrReference(this);
		}
	}

	public final AtomOrReferenceContext atomOrReference() throws RecognitionException {
		AtomOrReferenceContext _localctx = new AtomOrReferenceContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_atomOrReference);
		try {
			setState(727);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(725); atom();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(726); reference();
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

	public static class ArrayDeclarationContext extends ParserRuleContext {
		public TerminalNode OpenRoundBracket() { return getToken(PHPParser.OpenRoundBracket, 0); }
		public TerminalNode Comma(int i) {
			return getToken(PHPParser.Comma, i);
		}
		public ArrayEntryContext arrayEntry(int i) {
			return getRuleContext(ArrayEntryContext.class,i);
		}
		public List<ArrayEntryContext> arrayEntry() {
			return getRuleContexts(ArrayEntryContext.class);
		}
		public List<TerminalNode> Comma() { return getTokens(PHPParser.Comma); }
		public TerminalNode CloseRoundBracket() { return getToken(PHPParser.CloseRoundBracket, 0); }
		public TerminalNode Array() { return getToken(PHPParser.Array, 0); }
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitArrayDeclaration(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_arrayDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729); match(Array);
			setState(730); match(OpenRoundBracket);
			setState(739);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << List) | (1L << New) | (1L << Clone) | (1L << Ampersand) | (1L << Bang) | (1L << Minus) | (1L << Tilde) | (1L << SuppressWarnings) | (1L << Dollar) | (1L << OpenRoundBracket))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Array - 69)) | (1L << (DecimalNumber - 69)) | (1L << (HexNumber - 69)) | (1L << (OctalNumber - 69)) | (1L << (Float - 69)) | (1L << (Boolean - 69)) | (1L << (SingleQuotedString - 69)) | (1L << (DoubleQuotedString - 69)) | (1L << (Identifier - 69)) | (1L << (IncrementOperator - 69)))) != 0)) {
				{
				setState(731); arrayEntry();
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(732); match(Comma);
					setState(733); arrayEntry();
					}
					}
					setState(738);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(741); match(CloseRoundBracket);
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

	public static class ArrayEntryContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public KeyValuePairContext keyValuePair() {
			return getRuleContext(KeyValuePairContext.class,0);
		}
		public ArrayEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterArrayEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitArrayEntry(this);
		}
	}

	public final ArrayEntryContext arrayEntry() throws RecognitionException {
		ArrayEntryContext _localctx = new ArrayEntryContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_arrayEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(743); keyValuePair();
				}
				break;

			case 2:
				{
				setState(744); expression();
				}
				break;
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

	public static class KeyValuePairContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ArrayAssign() { return getToken(PHPParser.ArrayAssign, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public KeyValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterKeyValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitKeyValuePair(this);
		}
	}

	public final KeyValuePairContext keyValuePair() throws RecognitionException {
		KeyValuePairContext _localctx = new KeyValuePairContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_keyValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(747); expression();
			setState(748); match(ArrayAssign);
			setState(749); expression();
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

	public static class AtomContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public FunctionInvocationContext functionInvocation() {
			return getRuleContext(FunctionInvocationContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_atom);
		try {
			setState(756);
			switch (_input.LA(1)) {
			case DecimalNumber:
			case HexNumber:
			case OctalNumber:
			case Float:
				enterOuterAlt(_localctx, 1);
				{
				setState(751); number();
				}
				break;
			case SingleQuotedString:
			case DoubleQuotedString:
				enterOuterAlt(_localctx, 2);
				{
				setState(752); string();
				}
				break;
			case Boolean:
				enterOuterAlt(_localctx, 3);
				{
				setState(753); bool();
				}
				break;
			case Array:
				enterOuterAlt(_localctx, 4);
				{
				setState(754); arrayDeclaration();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(755); functionInvocation();
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

	public static class ReferenceContext extends ParserRuleContext {
		public TerminalNode Ampersand() { return getToken(PHPParser.Ampersand, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitReference(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_reference);
		try {
			setState(761);
			switch (_input.LA(1)) {
			case Ampersand:
				enterOuterAlt(_localctx, 1);
				{
				setState(758); match(Ampersand);
				setState(759); name();
				}
				break;
			case Dollar:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(760); name();
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode Boolean() { return getToken(PHPParser.Boolean, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763); match(Boolean);
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

	public static class NumberContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_number);
		try {
			setState(767);
			switch (_input.LA(1)) {
			case DecimalNumber:
			case HexNumber:
			case OctalNumber:
				enterOuterAlt(_localctx, 1);
				{
				setState(765); integer();
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 2);
				{
				setState(766); real();
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode OctalNumber() { return getToken(PHPParser.OctalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(PHPParser.HexNumber, 0); }
		public TerminalNode DecimalNumber() { return getToken(PHPParser.DecimalNumber, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			_la = _input.LA(1);
			if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (DecimalNumber - 73)) | (1L << (HexNumber - 73)) | (1L << (OctalNumber - 73)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class RealContext extends ParserRuleContext {
		public TerminalNode DecimalNumber(int i) {
			return getToken(PHPParser.DecimalNumber, i);
		}
		public List<TerminalNode> RealE() { return getTokens(PHPParser.RealE); }
		public List<TerminalNode> Float() { return getTokens(PHPParser.Float); }
		public List<TerminalNode> DecimalNumber() { return getTokens(PHPParser.DecimalNumber); }
		public TerminalNode Float(int i) {
			return getToken(PHPParser.Float, i);
		}
		public TerminalNode RealE(int i) {
			return getToken(PHPParser.RealE, i);
		}
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitReal(this);
		}
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_real);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771); match(Float);
			setState(776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RealE) {
				{
				{
				setState(772); match(RealE);
				setState(773);
				_la = _input.LA(1);
				if ( !(_la==DecimalNumber || _la==Float) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode DoubleQuotedString() { return getToken(PHPParser.DoubleQuotedString, 0); }
		public TerminalNode SingleQuotedString() { return getToken(PHPParser.SingleQuotedString, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHPParserListener ) ((PHPParserListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			_la = _input.LA(1);
			if ( !(_la==SingleQuotedString || _la==DoubleQuotedString) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3Z\u0310\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\3\2\7\2\u00ad\n\2\f\2\16\2\u00b0\13\2\3\3\5\3\u00b3\n\3\3\3"+
		"\6\3\u00b6\n\3\r\3\16\3\u00b7\3\4\3\4\3\5\3\5\7\5\u00be\n\5\f\5\16\5\u00c1"+
		"\13\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u00d5\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00de\n\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13\u00f4\n\13\f\13\16\13\u00f7\13\13\3\13\3\13\5\13"+
		"\u00fb\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u0108\n\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0124"+
		"\n\20\3\21\3\21\3\21\3\21\7\21\u012a\n\21\f\21\16\21\u012d\13\21\3\22"+
		"\5\22\u0130\n\22\3\22\3\22\3\22\3\22\3\23\3\23\5\23\u0138\n\23\3\24\3"+
		"\24\5\24\u013c\n\24\3\25\3\25\5\25\u0140\n\25\3\26\3\26\3\26\3\27\7\27"+
		"\u0146\n\27\f\27\16\27\u0149\13\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30"+
		"\u0151\n\30\f\30\16\30\u0154\13\30\3\31\3\31\3\31\7\31\u0159\n\31\f\31"+
		"\16\31\u015c\13\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0167"+
		"\n\33\3\34\3\34\3\35\3\35\3\35\5\35\u016e\n\35\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\7\37\u0179\n\37\f\37\16\37\u017c\13\37\3 \3 \7 \u0180"+
		"\n \f \16 \u0183\13 \3 \3 \3!\3!\3!\5!\u018a\n!\3!\3!\7!\u018e\n!\f!\16"+
		"!\u0191\13!\3!\3!\3\"\3\"\3#\3#\3#\3#\7#\u019b\n#\f#\16#\u019e\13#\3$"+
		"\3$\3$\3$\5$\u01a4\n$\3$\3$\7$\u01a8\n$\f$\16$\u01ab\13$\3$\3$\3$\3$\3"+
		"$\5$\u01b2\n$\3%\3%\3&\5&\u01b7\n&\3&\3&\3&\3&\5&\u01bd\n&\3&\5&\u01c0"+
		"\n&\3&\3&\7&\u01c4\n&\f&\16&\u01c7\13&\3&\3&\3\'\3\'\3\'\3\'\7\'\u01cf"+
		"\n\'\f\'\16\'\u01d2\13\'\3(\7(\u01d5\n(\f(\16(\u01d8\13(\3(\3(\3(\3(\3"+
		"(\5(\u01df\n(\3(\3(\3(\3(\5(\u01e5\n(\3(\7(\u01e8\n(\f(\16(\u01eb\13("+
		"\3(\3(\3(\5(\u01f0\n(\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\5+\u01fc\n+\3,\3,"+
		"\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\7/\u020c\n/\f/\16/\u020f\13/\5/\u0211"+
		"\n/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\5\62\u021b\n\62\3\62\5\62\u021e"+
		"\n\62\3\62\5\62\u0221\n\62\3\63\3\63\3\63\5\63\u0226\n\63\3\64\3\64\3"+
		"\64\3\64\3\64\5\64\u022d\n\64\3\65\3\65\3\65\7\65\u0232\n\65\f\65\16\65"+
		"\u0235\13\65\3\66\3\66\3\67\3\67\3\67\7\67\u023c\n\67\f\67\16\67\u023f"+
		"\13\67\38\38\38\78\u0244\n8\f8\168\u0247\138\39\39\39\79\u024c\n9\f9\16"+
		"9\u024f\139\3:\3:\3:\3:\3:\5:\u0256\n:\3;\3;\3;\3;\3;\7;\u025d\n;\f;\16"+
		";\u0260\13;\3;\3;\3;\5;\u0265\n;\3<\3<\3<\3<\3<\3<\3<\5<\u026e\n<\3=\3"+
		"=\3=\7=\u0273\n=\f=\16=\u0276\13=\3>\3>\3>\7>\u027b\n>\f>\16>\u027e\13"+
		">\3?\3?\3?\7?\u0283\n?\f?\16?\u0286\13?\3@\3@\3@\7@\u028b\n@\f@\16@\u028e"+
		"\13@\3A\3A\3A\5A\u0293\nA\3B\3B\3B\5B\u0298\nB\3C\3C\3C\7C\u029d\nC\f"+
		"C\16C\u02a0\13C\3D\3D\3D\7D\u02a5\nD\fD\16D\u02a8\13D\3E\3E\3E\7E\u02ad"+
		"\nE\fE\16E\u02b0\13E\3F\3F\3F\5F\u02b5\nF\3G\3G\3G\5G\u02ba\nG\3H\3H\3"+
		"H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u02c7\nH\3I\3I\3I\3I\3I\3I\5I\u02cf\nI\3"+
		"J\3J\3J\3J\3J\5J\u02d6\nJ\3K\3K\5K\u02da\nK\3L\3L\3L\3L\3L\7L\u02e1\n"+
		"L\fL\16L\u02e4\13L\5L\u02e6\nL\3L\3L\3M\3M\5M\u02ec\nM\3N\3N\3N\3N\3O"+
		"\3O\3O\3O\3O\5O\u02f7\nO\3P\3P\3P\5P\u02fc\nP\3Q\3Q\3R\3R\5R\u0302\nR"+
		"\3S\3S\3T\3T\3T\7T\u0309\nT\fT\16T\u030c\13T\3U\3U\3U\2V\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\2\n"+
		"\4\2BCJJ\4\2$$UU\4\2*+\63\63\3\2,.\5\2++//\61\61\3\2KM\4\2KKNN\4\2QQS"+
		"S\u0320\2\u00ae\3\2\2\2\4\u00b2\3\2\2\2\6\u00b9\3\2\2\2\b\u00bb\3\2\2"+
		"\2\n\u00c4\3\2\2\2\f\u00c6\3\2\2\2\16\u00d4\3\2\2\2\20\u00dd\3\2\2\2\22"+
		"\u00df\3\2\2\2\24\u00e9\3\2\2\2\26\u00fc\3\2\2\2\30\u0104\3\2\2\2\32\u010c"+
		"\3\2\2\2\34\u0114\3\2\2\2\36\u0123\3\2\2\2 \u0125\3\2\2\2\"\u012f\3\2"+
		"\2\2$\u0135\3\2\2\2&\u0139\3\2\2\2(\u013d\3\2\2\2*\u0141\3\2\2\2,\u0147"+
		"\3\2\2\2.\u014c\3\2\2\2\60\u0155\3\2\2\2\62\u015d\3\2\2\2\64\u0166\3\2"+
		"\2\2\66\u0168\3\2\2\28\u016d\3\2\2\2:\u016f\3\2\2\2<\u0173\3\2\2\2>\u017d"+
		"\3\2\2\2@\u0186\3\2\2\2B\u0194\3\2\2\2D\u0196\3\2\2\2F\u01b1\3\2\2\2H"+
		"\u01b3\3\2\2\2J\u01b6\3\2\2\2L\u01ca\3\2\2\2N\u01ef\3\2\2\2P\u01f1\3\2"+
		"\2\2R\u01f3\3\2\2\2T\u01f8\3\2\2\2V\u01fd\3\2\2\2X\u01ff\3\2\2\2Z\u0202"+
		"\3\2\2\2\\\u0207\3\2\2\2^\u0214\3\2\2\2`\u0217\3\2\2\2b\u021a\3\2\2\2"+
		"d\u0222\3\2\2\2f\u022c\3\2\2\2h\u022e\3\2\2\2j\u0236\3\2\2\2l\u0238\3"+
		"\2\2\2n\u0240\3\2\2\2p\u0248\3\2\2\2r\u0255\3\2\2\2t\u0264\3\2\2\2v\u026d"+
		"\3\2\2\2x\u026f\3\2\2\2z\u0277\3\2\2\2|\u027f\3\2\2\2~\u0287\3\2\2\2\u0080"+
		"\u028f\3\2\2\2\u0082\u0294\3\2\2\2\u0084\u0299\3\2\2\2\u0086\u02a1\3\2"+
		"\2\2\u0088\u02a9\3\2\2\2\u008a\u02b4\3\2\2\2\u008c\u02b6\3\2\2\2\u008e"+
		"\u02c6\3\2\2\2\u0090\u02ce\3\2\2\2\u0092\u02d5\3\2\2\2\u0094\u02d9\3\2"+
		"\2\2\u0096\u02db\3\2\2\2\u0098\u02eb\3\2\2\2\u009a\u02ed\3\2\2\2\u009c"+
		"\u02f6\3\2\2\2\u009e\u02fb\3\2\2\2\u00a0\u02fd\3\2\2\2\u00a2\u0301\3\2"+
		"\2\2\u00a4\u0303\3\2\2\2\u00a6\u0305\3\2\2\2\u00a8\u030d\3\2\2\2\u00aa"+
		"\u00ad\5\b\5\2\u00ab\u00ad\5\4\3\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2"+
		"\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\3\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b3\7\4\2\2\u00b2\u00b1\3\2\2\2"+
		"\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b6\5\6\4\2\u00b5\u00b4"+
		"\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\5\3\2\2\2\u00b9\u00ba\7\5\2\2\u00ba\7\3\2\2\2\u00bb\u00bf\5\n\6\2\u00bc"+
		"\u00be\5\16\b\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3"+
		"\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2"+
		"\u00c3\5\f\7\2\u00c3\t\3\2\2\2\u00c4\u00c5\7\3\2\2\u00c5\13\3\2\2\2\u00c6"+
		"\u00c7\7\7\2\2\u00c7\r\3\2\2\2\u00c8\u00c9\7=\2\2\u00c9\u00ca\5\16\b\2"+
		"\u00ca\u00cb\7>\2\2\u00cb\u00d5\3\2\2\2\u00cc\u00d5\5> \2\u00cd\u00d5"+
		"\5J&\2\u00ce\u00d5\5@!\2\u00cf\u00d5\5\20\t\2\u00d0\u00d1\5\36\20\2\u00d1"+
		"\u00d2\7\n\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d5\5\62\32\2\u00d4\u00c8\3"+
		"\2\2\2\u00d4\u00cc\3\2\2\2\u00d4\u00cd\3\2\2\2\u00d4\u00ce\3\2\2\2\u00d4"+
		"\u00cf\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\17\3\2\2"+
		"\2\u00d6\u00de\5\24\13\2\u00d7\u00de\5\22\n\2\u00d8\u00de\5\26\f\2\u00d9"+
		"\u00de\5\30\r\2\u00da\u00de\5\32\16\2\u00db\u00de\5\34\17\2\u00dc\u00de"+
		"\5Z.\2\u00dd\u00d6\3\2\2\2\u00dd\u00d7\3\2\2\2\u00dd\u00d8\3\2\2\2\u00dd"+
		"\u00d9\3\2\2\2\u00dd\u00da\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2"+
		"\2\2\u00de\21\3\2\2\2\u00df\u00e0\7!\2\2\u00e0\u00e1\79\2\2\u00e1\u00e2"+
		"\5j\66\2\u00e2\u00e3\7\n\2\2\u00e3\u00e4\5j\66\2\u00e4\u00e5\7\n\2\2\u00e5"+
		"\u00e6\5j\66\2\u00e6\u00e7\7:\2\2\u00e7\u00e8\5\16\b\2\u00e8\23\3\2\2"+
		"\2\u00e9\u00ea\7\36\2\2\u00ea\u00eb\79\2\2\u00eb\u00ec\5j\66\2\u00ec\u00ed"+
		"\7:\2\2\u00ed\u00f5\5\16\b\2\u00ee\u00ef\7 \2\2\u00ef\u00f0\79\2\2\u00f0"+
		"\u00f1\5j\66\2\u00f1\u00f2\7:\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00ee\3\2"+
		"\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00fa\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\7\37\2\2\u00f9\u00fb\5"+
		"\16\b\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\25\3\2\2\2\u00fc"+
		"\u00fd\7\"\2\2\u00fd\u00fe\79\2\2\u00fe\u00ff\5\64\33\2\u00ff\u0100\7"+
		"\t\2\2\u0100\u0101\5\u0098M\2\u0101\u0102\7:\2\2\u0102\u0103\5\16\b\2"+
		"\u0103\27\3\2\2\2\u0104\u0105\7#\2\2\u0105\u0107\79\2\2\u0106\u0108\5"+
		"j\66\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010a\7:\2\2\u010a\u010b\5\16\b\2\u010b\31\3\2\2\2\u010c\u010d\7\30\2"+
		"\2\u010d\u010e\5\16\b\2\u010e\u010f\7#\2\2\u010f\u0110\79\2\2\u0110\u0111"+
		"\5j\66\2\u0111\u0112\7:\2\2\u0112\u0113\7\n\2\2\u0113\33\3\2\2\2\u0114"+
		"\u0115\7\31\2\2\u0115\u0116\79\2\2\u0116\u0117\5j\66\2\u0117\u0118\7:"+
		"\2\2\u0118\u0119\7=\2\2\u0119\u011a\5,\27\2\u011a\u011b\7>\2\2\u011b\35"+
		"\3\2\2\2\u011c\u0124\5 \21\2\u011d\u0124\5\"\22\2\u011e\u0124\5$\23\2"+
		"\u011f\u0124\5&\24\2\u0120\u0124\5(\25\2\u0121\u0124\5*\26\2\u0122\u0124"+
		"\5j\66\2\u0123\u011c\3\2\2\2\u0123\u011d\3\2\2\2\u0123\u011e\3\2\2\2\u0123"+
		"\u011f\3\2\2\2\u0123\u0120\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2"+
		"\2\2\u0124\37\3\2\2\2\u0125\u0126\7\21\2\2\u0126\u012b\58\35\2\u0127\u0128"+
		"\7@\2\2\u0128\u012a\58\35\2\u0129\u0127\3\2\2\2\u012a\u012d\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c!\3\2\2\2\u012d\u012b\3\2\2\2"+
		"\u012e\u0130\7C\2\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u0132\5\64\33\2\u0132\u0133\7$\2\2\u0133\u0134\5j\66\2"+
		"\u0134#\3\2\2\2\u0135\u0137\7\35\2\2\u0136\u0138\7K\2\2\u0137\u0136\3"+
		"\2\2\2\u0137\u0138\3\2\2\2\u0138%\3\2\2\2\u0139\u013b\7\22\2\2\u013a\u013c"+
		"\7K\2\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\'\3\2\2\2\u013d"+
		"\u013f\7\23\2\2\u013e\u0140\5j\66\2\u013f\u013e\3\2\2\2\u013f\u0140\3"+
		"\2\2\2\u0140)\3\2\2\2\u0141\u0142\7H\2\2\u0142\u0143\5j\66\2\u0143+\3"+
		"\2\2\2\u0144\u0146\5.\30\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0147\3\2"+
		"\2\2\u014a\u014b\5\60\31\2\u014b-\3\2\2\2\u014c\u014d\7\32\2\2\u014d\u014e"+
		"\5j\66\2\u014e\u0152\7A\2\2\u014f\u0151\5\16\b\2\u0150\u014f\3\2\2\2\u0151"+
		"\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153/\3\2\2\2"+
		"\u0154\u0152\3\2\2\2\u0155\u0156\7\33\2\2\u0156\u015a\7A\2\2\u0157\u0159"+
		"\5\16\b\2\u0158\u0157\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2"+
		"\u015a\u015b\3\2\2\2\u015b\61\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e"+
		"\7E\2\2\u015e\63\3\2\2\2\u015f\u0160\7\62\2\2\u0160\u0167\5\66\34\2\u0161"+
		"\u0162\7\62\2\2\u0162\u0163\5\66\34\2\u0163\u0164\7\60\2\2\u0164\u0165"+
		"\5\66\34\2\u0165\u0167\3\2\2\2\u0166\u015f\3\2\2\2\u0166\u0161\3\2\2\2"+
		"\u0167\65\3\2\2\2\u0168\u0169\7T\2\2\u0169\67\3\2\2\2\u016a\u016e\5:\36"+
		"\2\u016b\u016e\5<\37\2\u016c\u016e\5\64\33\2\u016d\u016a\3\2\2\2\u016d"+
		"\u016b\3\2\2\2\u016d\u016c\3\2\2\2\u016e9\3\2\2\2\u016f\u0170\7T\2\2\u0170"+
		"\u0171\7\67\2\2\u0171\u0172\5\64\33\2\u0172;\3\2\2\2\u0173\u017a\5\64"+
		"\33\2\u0174\u0175\7;\2\2\u0175\u0176\5j\66\2\u0176\u0177\7<\2\2\u0177"+
		"\u0179\3\2\2\2\u0178\u0174\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2"+
		"\2\2\u017a\u017b\3\2\2\2\u017b=\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u0181"+
		"\7=\2\2\u017e\u0180\5\16\b\2\u017f\u017e\3\2\2\2\u0180\u0183\3\2\2\2\u0181"+
		"\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u0181\3\2"+
		"\2\2\u0184\u0185\7>\2\2\u0185?\3\2\2\2\u0186\u0187\7?\2\2\u0187\u0189"+
		"\5B\"\2\u0188\u018a\5D#\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018b\3\2\2\2\u018b\u018f\7=\2\2\u018c\u018e\5F$\2\u018d\u018c\3\2\2"+
		"\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0192"+
		"\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0193\7>\2\2\u0193A\3\2\2\2\u0194\u0195"+
		"\7T\2\2\u0195C\3\2\2\2\u0196\u0197\7\27\2\2\u0197\u019c\5B\"\2\u0198\u0199"+
		"\7@\2\2\u0199\u019b\5B\"\2\u019a\u0198\3\2\2\2\u019b\u019e\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019dE\3\2\2\2\u019e\u019c\3\2\2\2"+
		"\u019f\u01a0\7\16\2\2\u01a0\u01a3\7T\2\2\u01a1\u01a2\7$\2\2\u01a2\u01a4"+
		"\5\u009cO\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2\2"+
		"\2\u01a5\u01b2\7\n\2\2\u01a6\u01a8\5V,\2\u01a7\u01a6\3\2\2\2\u01a8\u01ab"+
		"\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab"+
		"\u01a9\3\2\2\2\u01ac\u01ad\7\34\2\2\u01ad\u01ae\5`\61\2\u01ae\u01af\5"+
		"\\/\2\u01af\u01b0\7\n\2\2\u01b0\u01b2\3\2\2\2\u01b1\u019f\3\2\2\2\u01b1"+
		"\u01a9\3\2\2\2\u01b2G\3\2\2\2\u01b3\u01b4\7T\2\2\u01b4I\3\2\2\2\u01b5"+
		"\u01b7\5P)\2\u01b6\u01b5\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\3\2\2"+
		"\2\u01b8\u01b9\7\26\2\2\u01b9\u01bc\5H%\2\u01ba\u01bb\7\27\2\2\u01bb\u01bd"+
		"\5H%\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf\3\2\2\2\u01be"+
		"\u01c0\5L\'\2\u01bf\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2"+
		"\2\2\u01c1\u01c5\7=\2\2\u01c2\u01c4\5N(\2\u01c3\u01c2\3\2\2\2\u01c4\u01c7"+
		"\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7"+
		"\u01c5\3\2\2\2\u01c8\u01c9\7>\2\2\u01c9K\3\2\2\2\u01ca\u01cb\7\24\2\2"+
		"\u01cb\u01d0\5B\"\2\u01cc\u01cd\7@\2\2\u01cd\u01cf\5B\"\2\u01ce\u01cc"+
		"\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1"+
		"M\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d5\5V,\2\u01d4\u01d3\3\2\2\2\u01d5"+
		"\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\3\2"+
		"\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01da\7\34\2\2\u01da\u01db\5`\61\2\u01db"+
		"\u01de\5\\/\2\u01dc\u01df\5> \2\u01dd\u01df\7\n\2\2\u01de\u01dc\3\2\2"+
		"\2\u01de\u01dd\3\2\2\2\u01df\u01f0\3\2\2\2\u01e0\u01e1\5R*\2\u01e1\u01e2"+
		"\7\n\2\2\u01e2\u01f0\3\2\2\2\u01e3\u01e5\7\25\2\2\u01e4\u01e3\3\2\2\2"+
		"\u01e4\u01e5\3\2\2\2\u01e5\u01e9\3\2\2\2\u01e6\u01e8\5V,\2\u01e7\u01e6"+
		"\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea"+
		"\u01ec\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ed\5T+\2\u01ed\u01ee\7\n\2"+
		"\2\u01ee\u01f0\3\2\2\2\u01ef\u01d6\3\2\2\2\u01ef\u01e0\3\2\2\2\u01ef\u01e4"+
		"\3\2\2\2\u01f0O\3\2\2\2\u01f1\u01f2\7B\2\2\u01f2Q\3\2\2\2\u01f3\u01f4"+
		"\7\16\2\2\u01f4\u01f5\5\66\34\2\u01f5\u01f6\7$\2\2\u01f6\u01f7\5\u009c"+
		"O\2\u01f7S\3\2\2\2\u01f8\u01fb\5X-\2\u01f9\u01fa\7$\2\2\u01fa\u01fc\5"+
		"\u009cO\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fcU\3\2\2\2\u01fd"+
		"\u01fe\t\2\2\2\u01feW\3\2\2\2\u01ff\u0200\7\62\2\2\u0200\u0201\5\66\34"+
		"\2\u0201Y\3\2\2\2\u0202\u0203\7\34\2\2\u0203\u0204\5`\61\2\u0204\u0205"+
		"\5\\/\2\u0205\u0206\5> \2\u0206[\3\2\2\2\u0207\u0210\79\2\2\u0208\u020d"+
		"\5d\63\2\u0209\u020a\7@\2\2\u020a\u020c\5d\63\2\u020b\u0209\3\2\2\2\u020c"+
		"\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0211\3\2"+
		"\2\2\u020f\u020d\3\2\2\2\u0210\u0208\3\2\2\2\u0210\u0211\3\2\2\2\u0211"+
		"\u0212\3\2\2\2\u0212\u0213\7:\2\2\u0213]\3\2\2\2\u0214\u0215\5`\61\2\u0215"+
		"\u0216\5b\62\2\u0216_\3\2\2\2\u0217\u0218\7T\2\2\u0218a\3\2\2\2\u0219"+
		"\u021b\79\2\2\u021a\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021d\3\2"+
		"\2\2\u021c\u021e\5h\65\2\u021d\u021c\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u0220\3\2\2\2\u021f\u0221\7:\2\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2"+
		"\2\2\u0221c\3\2\2\2\u0222\u0225\5f\64\2\u0223\u0224\7$\2\2\u0224\u0226"+
		"\5\u009cO\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226e\3\2\2\2\u0227"+
		"\u0228\7\62\2\2\u0228\u022d\7T\2\2\u0229\u022a\7\'\2\2\u022a\u022b\7\62"+
		"\2\2\u022b\u022d\7T\2\2\u022c\u0227\3\2\2\2\u022c\u0229\3\2\2\2\u022d"+
		"g\3\2\2\2\u022e\u0233\5j\66\2\u022f\u0230\7@\2\2\u0230\u0232\5j\66\2\u0231"+
		"\u022f\3\2\2\2\u0232\u0235\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2"+
		"\2\2\u0234i\3\2\2\2\u0235\u0233\3\2\2\2\u0236\u0237\5l\67\2\u0237k\3\2"+
		"\2\2\u0238\u023d\5n8\2\u0239\u023a\7\17\2\2\u023a\u023c\5n8\2\u023b\u0239"+
		"\3\2\2\2\u023c\u023f\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e"+
		"m\3\2\2\2\u023f\u023d\3\2\2\2\u0240\u0245\5p9\2\u0241\u0242\7\20\2\2\u0242"+
		"\u0244\5p9\2\u0243\u0241\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2\2"+
		"\2\u0245\u0246\3\2\2\2\u0246o\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u024d"+
		"\5r:\2\u0249\u024a\7\f\2\2\u024a\u024c\5r:\2\u024b\u0249\3\2\2\2\u024c"+
		"\u024f\3\2\2\2\u024d\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024eq\3\2\2\2"+
		"\u024f\u024d\3\2\2\2\u0250\u0251\5t;\2\u0251\u0252\t\3\2\2\u0252\u0253"+
		"\5r:\2\u0253\u0256\3\2\2\2\u0254\u0256\5v<\2\u0255\u0250\3\2\2\2\u0255"+
		"\u0254\3\2\2\2\u0256s\3\2\2\2\u0257\u0258\7\r\2\2\u0258\u0259\79\2\2\u0259"+
		"\u025e\58\35\2\u025a\u025b\7@\2\2\u025b\u025d\58\35\2\u025c\u025a\3\2"+
		"\2\2\u025d\u0260\3\2\2\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025f"+
		"\u0261\3\2\2\2\u0260\u025e\3\2\2\2\u0261\u0262\7:\2\2\u0262\u0265\3\2"+
		"\2\2\u0263\u0265\58\35\2\u0264\u0257\3\2\2\2\u0264\u0263\3\2\2\2\u0265"+
		"u\3\2\2\2\u0266\u0267\5x=\2\u0267\u0268\78\2\2\u0268\u0269\5j\66\2\u0269"+
		"\u026a\7A\2\2\u026a\u026b\5j\66\2\u026b\u026e\3\2\2\2\u026c\u026e\5x="+
		"\2\u026d\u0266\3\2\2\2\u026d\u026c\3\2\2\2\u026ew\3\2\2\2\u026f\u0274"+
		"\5z>\2\u0270\u0271\7\65\2\2\u0271\u0273\5z>\2\u0272\u0270\3\2\2\2\u0273"+
		"\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275y\3\2\2\2"+
		"\u0276\u0274\3\2\2\2\u0277\u027c\5|?\2\u0278\u0279\7\66\2\2\u0279\u027b"+
		"\5|?\2\u027a\u0278\3\2\2\2\u027b\u027e\3\2\2\2\u027c\u027a\3\2\2\2\u027c"+
		"\u027d\3\2\2\2\u027d{\3\2\2\2\u027e\u027c\3\2\2\2\u027f\u0284\5~@\2\u0280"+
		"\u0281\7(\2\2\u0281\u0283\5~@\2\u0282\u0280\3\2\2\2\u0283\u0286\3\2\2"+
		"\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285}\3\2\2\2\u0286\u0284"+
		"\3\2\2\2\u0287\u028c\5\u0080A\2\u0288\u0289\7\'\2\2\u0289\u028b\5\u0080"+
		"A\2\u028a\u0288\3\2\2\2\u028b\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028c"+
		"\u028d\3\2\2\2\u028d\177\3\2\2\2\u028e\u028c\3\2\2\2\u028f\u0292\5\u0082"+
		"B\2\u0290\u0291\7V\2\2\u0291\u0293\5\u0082B\2\u0292\u0290\3\2\2\2\u0292"+
		"\u0293\3\2\2\2\u0293\u0081\3\2\2\2\u0294\u0297\5\u0084C\2\u0295\u0296"+
		"\7W\2\2\u0296\u0298\5\u0084C\2\u0297\u0295\3\2\2\2\u0297\u0298\3\2\2\2"+
		"\u0298\u0083\3\2\2\2\u0299\u029e\5\u0086D\2\u029a\u029b\7X\2\2\u029b\u029d"+
		"\5\u0086D\2\u029c\u029a\3\2\2\2\u029d\u02a0\3\2\2\2\u029e\u029c\3\2\2"+
		"\2\u029e\u029f\3\2\2\2\u029f\u0085\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1\u02a6"+
		"\5\u0088E\2\u02a2\u02a3\t\4\2\2\u02a3\u02a5\5\u0088E\2\u02a4\u02a2\3\2"+
		"\2\2\u02a5\u02a8\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7"+
		"\u0087\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9\u02ae\5\u008aF\2\u02aa\u02ab"+
		"\t\5\2\2\u02ab\u02ad\5\u008aF\2\u02ac\u02aa\3\2\2\2\u02ad\u02b0\3\2\2"+
		"\2\u02ae\u02ac\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u0089\3\2\2\2\u02b0\u02ae"+
		"\3\2\2\2\u02b1\u02b2\7)\2\2\u02b2\u02b5\5\u008aF\2\u02b3\u02b5\5\u008c"+
		"G\2\u02b4\u02b1\3\2\2\2\u02b4\u02b3\3\2\2\2\u02b5\u008b\3\2\2\2\u02b6"+
		"\u02b9\5\u008eH\2\u02b7\u02b8\7\13\2\2\u02b8\u02ba\5\u008eH\2\u02b9\u02b7"+
		"\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u008d\3\2\2\2\u02bb\u02bc\t\6\2\2\u02bc"+
		"\u02c7\5\u0090I\2\u02bd\u02be\79\2\2\u02be\u02bf\7I\2\2\u02bf\u02c0\7"+
		":\2\2\u02c0\u02c7\5\u0090I\2\u02c1\u02c2\79\2\2\u02c2\u02c3\5p9\2\u02c3"+
		"\u02c4\7:\2\2\u02c4\u02c7\3\2\2\2\u02c5\u02c7\5\u0090I\2\u02c6\u02bb\3"+
		"\2\2\2\u02c6\u02bd\3\2\2\2\u02c6\u02c1\3\2\2\2\u02c6\u02c5\3\2\2\2\u02c7"+
		"\u008f\3\2\2\2\u02c8\u02c9\7Y\2\2\u02c9\u02cf\58\35\2\u02ca\u02cb\58\35"+
		"\2\u02cb\u02cc\7Y\2\2\u02cc\u02cf\3\2\2\2\u02cd\u02cf\5\u0092J\2\u02ce"+
		"\u02c8\3\2\2\2\u02ce\u02ca\3\2\2\2\u02ce\u02cd\3\2\2\2\u02cf\u0091\3\2"+
		"\2\2\u02d0\u02d1\7%\2\2\u02d1\u02d6\58\35\2\u02d2\u02d3\7&\2\2\u02d3\u02d6"+
		"\58\35\2\u02d4\u02d6\5\u0094K\2\u02d5\u02d0\3\2\2\2\u02d5\u02d2\3\2\2"+
		"\2\u02d5\u02d4\3\2\2\2\u02d6\u0093\3\2\2\2\u02d7\u02da\5\u009cO\2\u02d8"+
		"\u02da\5\u009eP\2\u02d9\u02d7\3\2\2\2\u02d9\u02d8\3\2\2\2\u02da\u0095"+
		"\3\2\2\2\u02db\u02dc\7G\2\2\u02dc\u02e5\79\2\2\u02dd\u02e2\5\u0098M\2"+
		"\u02de\u02df\7@\2\2\u02df\u02e1\5\u0098M\2\u02e0\u02de\3\2\2\2\u02e1\u02e4"+
		"\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e6\3\2\2\2\u02e4"+
		"\u02e2\3\2\2\2\u02e5\u02dd\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e7\3\2"+
		"\2\2\u02e7\u02e8\7:\2\2\u02e8\u0097\3\2\2\2\u02e9\u02ec\5\u009aN\2\u02ea"+
		"\u02ec\5j\66\2\u02eb\u02e9\3\2\2\2\u02eb\u02ea\3\2\2\2\u02ec\u0099\3\2"+
		"\2\2\u02ed\u02ee\5j\66\2\u02ee\u02ef\7\64\2\2\u02ef\u02f0\5j\66\2\u02f0"+
		"\u009b\3\2\2\2\u02f1\u02f7\5\u00a2R\2\u02f2\u02f7\5\u00a8U\2\u02f3\u02f7"+
		"\5\u00a0Q\2\u02f4\u02f7\5\u0096L\2\u02f5\u02f7\5^\60\2\u02f6\u02f1\3\2"+
		"\2\2\u02f6\u02f2\3\2\2\2\u02f6\u02f3\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6"+
		"\u02f5\3\2\2\2\u02f7\u009d\3\2\2\2\u02f8\u02f9\7\'\2\2\u02f9\u02fc\58"+
		"\35\2\u02fa\u02fc\58\35\2\u02fb\u02f8\3\2\2\2\u02fb\u02fa\3\2\2\2\u02fc"+
		"\u009f\3\2\2\2\u02fd\u02fe\7P\2\2\u02fe\u00a1\3\2\2\2\u02ff\u0302\5\u00a4"+
		"S\2\u0300\u0302\5\u00a6T\2\u0301\u02ff\3\2\2\2\u0301\u0300\3\2\2\2\u0302"+
		"\u00a3\3\2\2\2\u0303\u0304\t\7\2\2\u0304\u00a5\3\2\2\2\u0305\u030a\7N"+
		"\2\2\u0306\u0307\7\b\2\2\u0307\u0309\t\b\2\2\u0308\u0306\3\2\2\2\u0309"+
		"\u030c\3\2\2\2\u030a\u0308\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u00a7\3\2"+
		"\2\2\u030c\u030a\3\2\2\2\u030d\u030e\t\t\2\2\u030e\u00a9\3\2\2\2O\u00ac"+
		"\u00ae\u00b2\u00b7\u00bf\u00d4\u00dd\u00f5\u00fa\u0107\u0123\u012b\u012f"+
		"\u0137\u013b\u013f\u0147\u0152\u015a\u0166\u016d\u017a\u0181\u0189\u018f"+
		"\u019c\u01a3\u01a9\u01b1\u01b6\u01bc\u01bf\u01c5\u01d0\u01d6\u01de\u01e4"+
		"\u01e9\u01ef\u01fb\u020d\u0210\u021a\u021d\u0220\u0225\u022c\u0233\u023d"+
		"\u0245\u024d\u0255\u025e\u0264\u026d\u0274\u027c\u0284\u028c\u0292\u0297"+
		"\u029e\u02a6\u02ae\u02b4\u02b9\u02c6\u02ce\u02d5\u02d9\u02e2\u02e5\u02eb"+
		"\u02f6\u02fb\u0301\u030a";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}