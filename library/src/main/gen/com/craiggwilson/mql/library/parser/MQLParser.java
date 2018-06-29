// Generated from C:/projects/craiggwilson/mql/library/src/main/kotlin/com/craiggwilson/mql/library/parser\MQL.g4 by ANTLR 4.7
package com.craiggwilson.mql.library.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND_SYMBOL=1, ARROW=2, CARET=3, COLON=4, COMMA=5, DIV=6, DOT=7, EQ=8, 
		GT=9, GTE=10, LBRACE=11, LBRACK=12, LPAREN=13, LT=14, LTE=15, MINUS=16, 
		MOD=17, MULT=18, NEQ=19, NOT_SYMBOL=20, OR_SYMBOL=21, PIPE=22, PLUS=23, 
		RANGE=24, RBRACE=25, RBRACK=26, RPAREN=27, SEMI=28, UNDERSCORE=29, AND=30, 
		ASC=31, BY=32, CASE=33, DESC=34, ELSE=35, FALSE=36, FROM=37, GROUP=38, 
		IF=39, IN=40, INDEX=41, LET=42, LIMIT=43, LOOKUP=44, MATCH=45, NOT=46, 
		NULL=47, OR=48, PROJECT=49, SKIP_=50, SORT=51, STEP=52, SWITCH=53, THEN=54, 
		TRUE=55, UNWIND=56, WITH=57, PRESERVE_NULL_AND_EMPTY=58, INT=59, DECIMAL=60, 
		LONG=61, BIN=62, HEX=63, DQ_STRING=64, UNQUOTED_ID=65, VARIABLE_ID=66, 
		WS=67;
	public static final int
		RULE_parse = 0, RULE_statement = 1, RULE_pipeline = 2, RULE_stage = 3, 
		RULE_project_item = 4, RULE_sort_field = 5, RULE_unwind_option = 6, RULE_expression = 7, 
		RULE_field_assignment = 8, RULE_function = 9, RULE_function_argument = 10, 
		RULE_lambda_argument = 11, RULE_lambda_expression = 12, RULE_number = 13, 
		RULE_switch_case = 14, RULE_variable_assignment = 15, RULE_collection_name = 16, 
		RULE_database_name = 17, RULE_field_declaration = 18, RULE_multipart_field_declaration = 19, 
		RULE_field_name = 20, RULE_function_name = 21, RULE_function_argument_name = 22, 
		RULE_multipart_field_name = 23, RULE_variable_name = 24;
	public static final String[] ruleNames = {
		"parse", "statement", "pipeline", "stage", "project_item", "sort_field", 
		"unwind_option", "expression", "field_assignment", "function", "function_argument", 
		"lambda_argument", "lambda_expression", "number", "switch_case", "variable_assignment", 
		"collection_name", "database_name", "field_declaration", "multipart_field_declaration", 
		"field_name", "function_name", "function_argument_name", "multipart_field_name", 
		"variable_name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'&&'", "'=>'", "'^'", "':'", "','", "'/'", "'.'", "'='", "'>'", 
		"'>='", "'{'", "'['", "'('", "'<'", "'<='", "'-'", "'%'", "'*'", "'!='", 
		"'!'", "'||'", "'|'", "'+'", "'..'", "'}'", "']'", "')'", "';'", "'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND_SYMBOL", "ARROW", "CARET", "COLON", "COMMA", "DIV", "DOT", 
		"EQ", "GT", "GTE", "LBRACE", "LBRACK", "LPAREN", "LT", "LTE", "MINUS", 
		"MOD", "MULT", "NEQ", "NOT_SYMBOL", "OR_SYMBOL", "PIPE", "PLUS", "RANGE", 
		"RBRACE", "RBRACK", "RPAREN", "SEMI", "UNDERSCORE", "AND", "ASC", "BY", 
		"CASE", "DESC", "ELSE", "FALSE", "FROM", "GROUP", "IF", "IN", "INDEX", 
		"LET", "LIMIT", "LOOKUP", "MATCH", "NOT", "NULL", "OR", "PROJECT", "SKIP_", 
		"SORT", "STEP", "SWITCH", "THEN", "TRUE", "UNWIND", "WITH", "PRESERVE_NULL_AND_EMPTY", 
		"INT", "DECIMAL", "LONG", "BIN", "HEX", "DQ_STRING", "UNQUOTED_ID", "VARIABLE_ID", 
		"WS"
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

	@Override
	public String getGrammarFileName() { return "MQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode EOF() { return getToken(MQLParser.EOF, 0); }
		public List<TerminalNode> SEMI() { return getTokens(MQLParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(MQLParser.SEMI, i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			statement();
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(51);
					match(SEMI);
					setState(52);
					statement();
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(58);
				match(SEMI);
				}
			}

			setState(61);
			match(EOF);
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
		public PipelineContext pipeline() {
			return getRuleContext(PipelineContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			pipeline();
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

	public static class PipelineContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(MQLParser.FROM, 0); }
		public Collection_nameContext collection_name() {
			return getRuleContext(Collection_nameContext.class,0);
		}
		public List<StageContext> stage() {
			return getRuleContexts(StageContext.class);
		}
		public StageContext stage(int i) {
			return getRuleContext(StageContext.class,i);
		}
		public PipelineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipeline; }
	}

	public final PipelineContext pipeline() throws RecognitionException {
		PipelineContext _localctx = new PipelineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pipeline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(FROM);
			setState(66);
			collection_name();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GROUP) | (1L << LIMIT) | (1L << LOOKUP) | (1L << MATCH) | (1L << PROJECT) | (1L << SKIP_) | (1L << SORT) | (1L << UNWIND))) != 0)) {
				{
				{
				setState(67);
				stage();
				}
				}
				setState(72);
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

	public static class StageContext extends ParserRuleContext {
		public StageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stage; }
	 
		public StageContext() { }
		public void copyFrom(StageContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SortStageContext extends StageContext {
		public TerminalNode SORT() { return getToken(MQLParser.SORT, 0); }
		public List<Sort_fieldContext> sort_field() {
			return getRuleContexts(Sort_fieldContext.class);
		}
		public Sort_fieldContext sort_field(int i) {
			return getRuleContext(Sort_fieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MQLParser.COMMA, i);
		}
		public SortStageContext(StageContext ctx) { copyFrom(ctx); }
	}
	public static class ProjectStageContext extends StageContext {
		public TerminalNode PROJECT() { return getToken(MQLParser.PROJECT, 0); }
		public List<Project_itemContext> project_item() {
			return getRuleContexts(Project_itemContext.class);
		}
		public Project_itemContext project_item(int i) {
			return getRuleContext(Project_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MQLParser.COMMA, i);
		}
		public ProjectStageContext(StageContext ctx) { copyFrom(ctx); }
	}
	public static class UnwindStageContext extends StageContext {
		public TerminalNode UNWIND() { return getToken(MQLParser.UNWIND, 0); }
		public Multipart_field_nameContext multipart_field_name() {
			return getRuleContext(Multipart_field_nameContext.class,0);
		}
		public TerminalNode WITH() { return getToken(MQLParser.WITH, 0); }
		public List<Unwind_optionContext> unwind_option() {
			return getRuleContexts(Unwind_optionContext.class);
		}
		public Unwind_optionContext unwind_option(int i) {
			return getRuleContext(Unwind_optionContext.class,i);
		}
		public UnwindStageContext(StageContext ctx) { copyFrom(ctx); }
	}
	public static class LimitStageContext extends StageContext {
		public TerminalNode LIMIT() { return getToken(MQLParser.LIMIT, 0); }
		public TerminalNode INT() { return getToken(MQLParser.INT, 0); }
		public LimitStageContext(StageContext ctx) { copyFrom(ctx); }
	}
	public static class GroupStageContext extends StageContext {
		public TerminalNode GROUP() { return getToken(MQLParser.GROUP, 0); }
		public List<Field_assignmentContext> field_assignment() {
			return getRuleContexts(Field_assignmentContext.class);
		}
		public Field_assignmentContext field_assignment(int i) {
			return getRuleContext(Field_assignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MQLParser.COMMA, i);
		}
		public TerminalNode BY() { return getToken(MQLParser.BY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GroupStageContext(StageContext ctx) { copyFrom(ctx); }
	}
	public static class LookupStageContext extends StageContext {
		public TerminalNode LOOKUP() { return getToken(MQLParser.LOOKUP, 0); }
		public Multipart_field_declarationContext multipart_field_declaration() {
			return getRuleContext(Multipart_field_declarationContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MQLParser.COLON, 0); }
		public TerminalNode LPAREN() { return getToken(MQLParser.LPAREN, 0); }
		public PipelineContext pipeline() {
			return getRuleContext(PipelineContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MQLParser.RPAREN, 0); }
		public TerminalNode LET() { return getToken(MQLParser.LET, 0); }
		public List<Variable_assignmentContext> variable_assignment() {
			return getRuleContexts(Variable_assignmentContext.class);
		}
		public Variable_assignmentContext variable_assignment(int i) {
			return getRuleContext(Variable_assignmentContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(MQLParser.ARROW, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MQLParser.COMMA, i);
		}
		public LookupStageContext(StageContext ctx) { copyFrom(ctx); }
	}
	public static class MatchStageContext extends StageContext {
		public TerminalNode MATCH() { return getToken(MQLParser.MATCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MatchStageContext(StageContext ctx) { copyFrom(ctx); }
	}
	public static class SkipStageContext extends StageContext {
		public TerminalNode SKIP_() { return getToken(MQLParser.SKIP_, 0); }
		public TerminalNode INT() { return getToken(MQLParser.INT, 0); }
		public SkipStageContext(StageContext ctx) { copyFrom(ctx); }
	}

	public final StageContext stage() throws RecognitionException {
		StageContext _localctx = new StageContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stage);
		int _la;
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GROUP:
				_localctx = new GroupStageContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(GROUP);
				setState(74);
				field_assignment();
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(75);
					match(COMMA);
					setState(76);
					field_assignment();
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BY) {
					{
					setState(82);
					match(BY);
					setState(83);
					expression(0);
					}
				}

				}
				break;
			case LIMIT:
				_localctx = new LimitStageContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(LIMIT);
				setState(87);
				match(INT);
				}
				break;
			case LOOKUP:
				_localctx = new LookupStageContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(LOOKUP);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LET) {
					{
					setState(89);
					match(LET);
					setState(90);
					variable_assignment();
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(91);
						match(COMMA);
						setState(92);
						variable_assignment();
						}
						}
						setState(97);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(98);
					match(ARROW);
					}
				}

				setState(102);
				multipart_field_declaration();
				setState(103);
				match(COLON);
				setState(104);
				match(LPAREN);
				setState(105);
				pipeline();
				setState(106);
				match(RPAREN);
				}
				break;
			case MATCH:
				_localctx = new MatchStageContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				match(MATCH);
				setState(109);
				expression(0);
				}
				break;
			case PROJECT:
				_localctx = new ProjectStageContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				match(PROJECT);
				setState(111);
				project_item();
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(112);
					match(COMMA);
					setState(113);
					project_item();
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case SKIP_:
				_localctx = new SkipStageContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(119);
				match(SKIP_);
				setState(120);
				match(INT);
				}
				break;
			case SORT:
				_localctx = new SortStageContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(121);
				match(SORT);
				setState(122);
				sort_field();
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(123);
					match(COMMA);
					setState(124);
					sort_field();
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case UNWIND:
				_localctx = new UnwindStageContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(130);
				match(UNWIND);
				setState(131);
				multipart_field_name();
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(132);
					match(WITH);
					setState(134); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(133);
						unwind_option();
						}
						}
						setState(136); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==INDEX || _la==PRESERVE_NULL_AND_EMPTY );
					}
				}

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

	public static class Project_itemContext extends ParserRuleContext {
		public Multipart_field_declarationContext multipart_field_declaration() {
			return getRuleContext(Multipart_field_declarationContext.class,0);
		}
		public TerminalNode NOT_SYMBOL() { return getToken(MQLParser.NOT_SYMBOL, 0); }
		public TerminalNode COLON() { return getToken(MQLParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Project_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_project_item; }
	}

	public final Project_itemContext project_item() throws RecognitionException {
		Project_itemContext _localctx = new Project_itemContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_project_item);
		int _la;
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT_SYMBOL) {
					{
					setState(142);
					match(NOT_SYMBOL);
					}
				}

				setState(145);
				multipart_field_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				multipart_field_declaration();
				setState(147);
				match(COLON);
				setState(148);
				expression(0);
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

	public static class Sort_fieldContext extends ParserRuleContext {
		public Multipart_field_nameContext multipart_field_name() {
			return getRuleContext(Multipart_field_nameContext.class,0);
		}
		public TerminalNode ASC() { return getToken(MQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(MQLParser.DESC, 0); }
		public Sort_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort_field; }
	}

	public final Sort_fieldContext sort_field() throws RecognitionException {
		Sort_fieldContext _localctx = new Sort_fieldContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sort_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			multipart_field_name();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(153);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class Unwind_optionContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(MQLParser.INDEX, 0); }
		public Multipart_field_declarationContext multipart_field_declaration() {
			return getRuleContext(Multipart_field_declarationContext.class,0);
		}
		public TerminalNode PRESERVE_NULL_AND_EMPTY() { return getToken(MQLParser.PRESERVE_NULL_AND_EMPTY, 0); }
		public Unwind_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unwind_option; }
	}

	public final Unwind_optionContext unwind_option() throws RecognitionException {
		Unwind_optionContext _localctx = new Unwind_optionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unwind_option);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDEX:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(INDEX);
				setState(157);
				multipart_field_declaration();
				}
				break;
			case PRESERVE_NULL_AND_EMPTY:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(PRESERVE_NULL_AND_EMPTY);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AdditionExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(MQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MQLParser.MINUS, 0); }
		public AdditionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NumberExpressionContext extends ExpressionContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumberExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NotExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MQLParser.NOT, 0); }
		public TerminalNode NOT_SYMBOL() { return getToken(MQLParser.NOT_SYMBOL, 0); }
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ComparisonExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(MQLParser.EQ, 0); }
		public TerminalNode GT() { return getToken(MQLParser.GT, 0); }
		public TerminalNode GTE() { return getToken(MQLParser.GTE, 0); }
		public TerminalNode LT() { return getToken(MQLParser.LT, 0); }
		public TerminalNode LTE() { return getToken(MQLParser.LTE, 0); }
		public TerminalNode NEQ() { return getToken(MQLParser.NEQ, 0); }
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NewDocumentExpressionContext extends ExpressionContext {
		public TerminalNode LBRACE() { return getToken(MQLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MQLParser.RBRACE, 0); }
		public List<Field_assignmentContext> field_assignment() {
			return getRuleContexts(Field_assignmentContext.class);
		}
		public Field_assignmentContext field_assignment(int i) {
			return getRuleContext(Field_assignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MQLParser.COMMA, i);
		}
		public NewDocumentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(MQLParser.AND, 0); }
		public TerminalNode AND_SYMBOL() { return getToken(MQLParser.AND_SYMBOL, 0); }
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class StringExpressionContext extends ExpressionContext {
		public TerminalNode DQ_STRING() { return getToken(MQLParser.DQ_STRING, 0); }
		public StringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NullExpressionContext extends ExpressionContext {
		public TerminalNode NULL() { return getToken(MQLParser.NULL, 0); }
		public NullExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LetExpressionContext extends ExpressionContext {
		public TerminalNode LET() { return getToken(MQLParser.LET, 0); }
		public List<Variable_assignmentContext> variable_assignment() {
			return getRuleContexts(Variable_assignmentContext.class);
		}
		public Variable_assignmentContext variable_assignment(int i) {
			return getRuleContext(Variable_assignmentContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(MQLParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(MQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MQLParser.COMMA, i);
		}
		public LetExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class FieldExpressionContext extends ExpressionContext {
		public Field_nameContext field_name() {
			return getRuleContext(Field_nameContext.class,0);
		}
		public FieldExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NewArrayExpressionContext extends ExpressionContext {
		public TerminalNode LBRACK() { return getToken(MQLParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(MQLParser.RBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MQLParser.COMMA, i);
		}
		public NewArrayExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ConditionalExpressionContext extends ExpressionContext {
		public TerminalNode IF() { return getToken(MQLParser.IF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode THEN() { return getToken(MQLParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(MQLParser.ELSE, 0); }
		public ConditionalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SwitchExpressionContext extends ExpressionContext {
		public TerminalNode SWITCH() { return getToken(MQLParser.SWITCH, 0); }
		public List<Switch_caseContext> switch_case() {
			return getRuleContexts(Switch_caseContext.class);
		}
		public Switch_caseContext switch_case(int i) {
			return getRuleContext(Switch_caseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MQLParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SwitchExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesisExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(MQLParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MQLParser.RPAREN, 0); }
		public ParenthesisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MultiplicationExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULT() { return getToken(MQLParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(MQLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MQLParser.MOD, 0); }
		public MultiplicationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BooleanExpressionContext extends ExpressionContext {
		public TerminalNode TRUE() { return getToken(MQLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MQLParser.FALSE, 0); }
		public BooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MemberExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(MQLParser.DOT, 0); }
		public Field_nameContext field_name() {
			return getRuleContext(Field_nameContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public MemberExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class OrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(MQLParser.OR, 0); }
		public TerminalNode OR_SYMBOL() { return getToken(MQLParser.OR_SYMBOL, 0); }
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryMinusExpressionContext extends ExpressionContext {
		public TerminalNode MINUS() { return getToken(MQLParser.MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryMinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PowerExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CARET() { return getToken(MQLParser.CARET, 0); }
		public PowerExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class InExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(MQLParser.IN, 0); }
		public TerminalNode NOT() { return getToken(MQLParser.NOT, 0); }
		public InExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayAccessExpressionContext extends ExpressionContext {
		public ExpressionContext start;
		public ExpressionContext end;
		public ExpressionContext step;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBRACK() { return getToken(MQLParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(MQLParser.RBRACK, 0); }
		public List<TerminalNode> COLON() { return getTokens(MQLParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MQLParser.COLON, i);
		}
		public ArrayAccessExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class VariableReferenceExpressionContext extends ExpressionContext {
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public VariableReferenceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class RangeExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RANGE() { return getToken(MQLParser.RANGE, 0); }
		public TerminalNode STEP() { return getToken(MQLParser.STEP, 0); }
		public RangeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(162);
				match(MINUS);
				setState(163);
				expression(24);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				_la = _input.LA(1);
				if ( !(_la==NOT_SYMBOL || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(165);
				expression(23);
				}
				break;
			case 3:
				{
				_localctx = new SwitchExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(SWITCH);
				setState(168); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(167);
						switch_case();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(170); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(174);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(172);
					match(ELSE);
					setState(173);
					expression(0);
					}
					break;
				}
				}
				break;
			case 4:
				{
				_localctx = new ConditionalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				match(IF);
				setState(177);
				expression(0);
				setState(178);
				match(THEN);
				setState(179);
				expression(0);
				setState(180);
				match(ELSE);
				setState(181);
				expression(12);
				}
				break;
			case 5:
				{
				_localctx = new LetExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				match(LET);
				setState(184);
				variable_assignment();
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(185);
					match(COMMA);
					setState(186);
					variable_assignment();
					}
					}
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(192);
				match(ARROW);
				setState(193);
				expression(11);
				}
				break;
			case 6:
				{
				_localctx = new NewDocumentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				match(LBRACE);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DQ_STRING || _la==UNQUOTED_ID) {
					{
					setState(196);
					field_assignment();
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(197);
						match(COMMA);
						setState(198);
						field_assignment();
						}
						}
						setState(203);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(206);
				match(RBRACE);
				}
				break;
			case 7:
				{
				_localctx = new NewArrayExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				match(LBRACK);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (LBRACE - 11)) | (1L << (LBRACK - 11)) | (1L << (LPAREN - 11)) | (1L << (MINUS - 11)) | (1L << (NOT_SYMBOL - 11)) | (1L << (FALSE - 11)) | (1L << (IF - 11)) | (1L << (LET - 11)) | (1L << (NOT - 11)) | (1L << (NULL - 11)) | (1L << (SWITCH - 11)) | (1L << (TRUE - 11)) | (1L << (INT - 11)) | (1L << (DECIMAL - 11)) | (1L << (LONG - 11)) | (1L << (BIN - 11)) | (1L << (HEX - 11)) | (1L << (DQ_STRING - 11)) | (1L << (UNQUOTED_ID - 11)) | (1L << (VARIABLE_ID - 11)))) != 0)) {
					{
					setState(208);
					expression(0);
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(209);
						match(COMMA);
						setState(210);
						expression(0);
						}
						}
						setState(215);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(218);
				match(RBRACK);
				}
				break;
			case 8:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(LPAREN);
				setState(220);
				expression(0);
				setState(221);
				match(RPAREN);
				}
				break;
			case 9:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				function();
				}
				break;
			case 10:
				{
				_localctx = new VariableReferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				variable_name();
				}
				break;
			case 11:
				{
				_localctx = new FieldExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				field_name();
				}
				break;
			case 12:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				number();
				}
				break;
			case 13:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227);
				match(DQ_STRING);
				}
				break;
			case 14:
				{
				_localctx = new BooleanExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(228);
				_la = _input.LA(1);
				if ( !(_la==FALSE || _la==TRUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 15:
				{
				_localctx = new NullExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				match(NULL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(286);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(232);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(233);
						match(CARET);
						setState(234);
						expression(25);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(235);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(236);
						((MultiplicationExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << MOD) | (1L << MULT))) != 0)) ) {
							((MultiplicationExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(237);
						expression(20);
						}
						break;
					case 3:
						{
						_localctx = new AdditionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(238);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(239);
						((AdditionExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MINUS || _la==PLUS) ) {
							((AdditionExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(240);
						expression(19);
						}
						break;
					case 4:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(241);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(242);
						((ComparisonExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << GT) | (1L << GTE) | (1L << LT) | (1L << LTE) | (1L << NEQ))) != 0)) ) {
							((ComparisonExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(243);
						expression(18);
						}
						break;
					case 5:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(244);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(245);
						_la = _input.LA(1);
						if ( !(_la==AND_SYMBOL || _la==AND) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(246);
						expression(17);
						}
						break;
					case 6:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(247);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(248);
						_la = _input.LA(1);
						if ( !(_la==OR_SYMBOL || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(249);
						expression(16);
						}
						break;
					case 7:
						{
						_localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(250);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(252);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(251);
							match(NOT);
							}
						}

						setState(254);
						match(IN);
						setState(255);
						expression(15);
						}
						break;
					case 8:
						{
						_localctx = new MemberExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(256);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(257);
						match(DOT);
						setState(260);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
						case 1:
							{
							setState(258);
							field_name();
							}
							break;
						case 2:
							{
							setState(259);
							function();
							}
							break;
						}
						}
						break;
					case 9:
						{
						_localctx = new ArrayAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(262);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(263);
						match(LBRACK);
						setState(276);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
						case 1:
							{
							setState(264);
							((ArrayAccessExpressionContext)_localctx).start = expression(0);
							}
							break;
						case 2:
							{
							setState(266);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (LBRACE - 11)) | (1L << (LBRACK - 11)) | (1L << (LPAREN - 11)) | (1L << (MINUS - 11)) | (1L << (NOT_SYMBOL - 11)) | (1L << (FALSE - 11)) | (1L << (IF - 11)) | (1L << (LET - 11)) | (1L << (NOT - 11)) | (1L << (NULL - 11)) | (1L << (SWITCH - 11)) | (1L << (TRUE - 11)) | (1L << (INT - 11)) | (1L << (DECIMAL - 11)) | (1L << (LONG - 11)) | (1L << (BIN - 11)) | (1L << (HEX - 11)) | (1L << (DQ_STRING - 11)) | (1L << (UNQUOTED_ID - 11)) | (1L << (VARIABLE_ID - 11)))) != 0)) {
								{
								setState(265);
								((ArrayAccessExpressionContext)_localctx).start = expression(0);
								}
							}

							setState(268);
							match(COLON);
							setState(270);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (LBRACE - 11)) | (1L << (LBRACK - 11)) | (1L << (LPAREN - 11)) | (1L << (MINUS - 11)) | (1L << (NOT_SYMBOL - 11)) | (1L << (FALSE - 11)) | (1L << (IF - 11)) | (1L << (LET - 11)) | (1L << (NOT - 11)) | (1L << (NULL - 11)) | (1L << (SWITCH - 11)) | (1L << (TRUE - 11)) | (1L << (INT - 11)) | (1L << (DECIMAL - 11)) | (1L << (LONG - 11)) | (1L << (BIN - 11)) | (1L << (HEX - 11)) | (1L << (DQ_STRING - 11)) | (1L << (UNQUOTED_ID - 11)) | (1L << (VARIABLE_ID - 11)))) != 0)) {
								{
								setState(269);
								((ArrayAccessExpressionContext)_localctx).end = expression(0);
								}
							}

							setState(274);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==COLON) {
								{
								setState(272);
								match(COLON);
								setState(273);
								((ArrayAccessExpressionContext)_localctx).step = expression(0);
								}
							}

							}
							break;
						}
						setState(278);
						match(RBRACK);
						}
						break;
					case 10:
						{
						_localctx = new RangeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(279);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(280);
						match(RANGE);
						setState(281);
						expression(0);
						setState(284);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
						case 1:
							{
							setState(282);
							match(STEP);
							setState(283);
							expression(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class Field_assignmentContext extends ParserRuleContext {
		public Field_declarationContext field_declaration() {
			return getRuleContext(Field_declarationContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MQLParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Field_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_assignment; }
	}

	public final Field_assignmentContext field_assignment() throws RecognitionException {
		Field_assignmentContext _localctx = new Field_assignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_field_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			field_declaration();
			setState(292);
			match(COLON);
			setState(293);
			expression(0);
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

	public static class FunctionContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MQLParser.RPAREN, 0); }
		public List<Function_argumentContext> function_argument() {
			return getRuleContexts(Function_argumentContext.class);
		}
		public Function_argumentContext function_argument(int i) {
			return getRuleContext(Function_argumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MQLParser.COMMA, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			function_name();
			setState(296);
			match(LPAREN);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (LBRACE - 11)) | (1L << (LBRACK - 11)) | (1L << (LPAREN - 11)) | (1L << (MINUS - 11)) | (1L << (NOT_SYMBOL - 11)) | (1L << (UNDERSCORE - 11)) | (1L << (FALSE - 11)) | (1L << (IF - 11)) | (1L << (LET - 11)) | (1L << (NOT - 11)) | (1L << (NULL - 11)) | (1L << (SWITCH - 11)) | (1L << (TRUE - 11)) | (1L << (INT - 11)) | (1L << (DECIMAL - 11)) | (1L << (LONG - 11)) | (1L << (BIN - 11)) | (1L << (HEX - 11)) | (1L << (DQ_STRING - 11)) | (1L << (UNQUOTED_ID - 11)) | (1L << (VARIABLE_ID - 11)))) != 0)) {
				{
				setState(297);
				function_argument();
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(298);
					match(COMMA);
					setState(299);
					function_argument();
					}
					}
					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(307);
			match(RPAREN);
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

	public static class Function_argumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Function_argument_nameContext function_argument_name() {
			return getRuleContext(Function_argument_nameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MQLParser.COLON, 0); }
		public Lambda_expressionContext lambda_expression() {
			return getRuleContext(Lambda_expressionContext.class,0);
		}
		public Function_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_argument; }
	}

	public final Function_argumentContext function_argument() throws RecognitionException {
		Function_argumentContext _localctx = new Function_argumentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_argument);
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				function_argument_name();
				setState(311);
				match(COLON);
				setState(312);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				lambda_expression();
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

	public static class Lambda_argumentContext extends ParserRuleContext {
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public TerminalNode UNDERSCORE() { return getToken(MQLParser.UNDERSCORE, 0); }
		public Lambda_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_argument; }
	}

	public final Lambda_argumentContext lambda_argument() throws RecognitionException {
		Lambda_argumentContext _localctx = new Lambda_argumentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lambda_argument);
		try {
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				variable_name();
				}
				break;
			case UNDERSCORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				match(UNDERSCORE);
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

	public static class Lambda_expressionContext extends ParserRuleContext {
		public List<Lambda_argumentContext> lambda_argument() {
			return getRuleContexts(Lambda_argumentContext.class);
		}
		public Lambda_argumentContext lambda_argument(int i) {
			return getRuleContext(Lambda_argumentContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(MQLParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MQLParser.COMMA, i);
		}
		public Lambda_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_expression; }
	}

	public final Lambda_expressionContext lambda_expression() throws RecognitionException {
		Lambda_expressionContext _localctx = new Lambda_expressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_lambda_expression);
		int _la;
		try {
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNDERSCORE:
			case VARIABLE_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				lambda_argument();
				setState(322);
				match(ARROW);
				setState(323);
				expression(0);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(LPAREN);
				setState(326);
				lambda_argument();
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(327);
					match(COMMA);
					setState(328);
					lambda_argument();
					}
					}
					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(334);
				match(RPAREN);
				setState(335);
				match(ARROW);
				setState(336);
				expression(0);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MQLParser.INT, 0); }
		public TerminalNode LONG() { return getToken(MQLParser.LONG, 0); }
		public TerminalNode DECIMAL() { return getToken(MQLParser.DECIMAL, 0); }
		public TerminalNode BIN() { return getToken(MQLParser.BIN, 0); }
		public TerminalNode HEX() { return getToken(MQLParser.HEX, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DECIMAL) | (1L << LONG) | (1L << BIN) | (1L << HEX))) != 0)) ) {
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

	public static class Switch_caseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(MQLParser.CASE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode THEN() { return getToken(MQLParser.THEN, 0); }
		public Switch_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case; }
	}

	public final Switch_caseContext switch_case() throws RecognitionException {
		Switch_caseContext _localctx = new Switch_caseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_switch_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(CASE);
			setState(343);
			expression(0);
			setState(344);
			match(THEN);
			setState(345);
			expression(0);
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

	public static class Variable_assignmentContext extends ParserRuleContext {
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MQLParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_assignment; }
	}

	public final Variable_assignmentContext variable_assignment() throws RecognitionException {
		Variable_assignmentContext _localctx = new Variable_assignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variable_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			variable_name();
			setState(348);
			match(COLON);
			setState(349);
			expression(0);
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

	public static class Collection_nameContext extends ParserRuleContext {
		public TerminalNode UNQUOTED_ID() { return getToken(MQLParser.UNQUOTED_ID, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(MQLParser.DOT, 0); }
		public Collection_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_name; }
	}

	public final Collection_nameContext collection_name() throws RecognitionException {
		Collection_nameContext _localctx = new Collection_nameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_collection_name);
		try {
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				match(UNQUOTED_ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				database_name();
				setState(353);
				match(DOT);
				setState(354);
				match(UNQUOTED_ID);
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

	public static class Database_nameContext extends ParserRuleContext {
		public TerminalNode UNQUOTED_ID() { return getToken(MQLParser.UNQUOTED_ID, 0); }
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(UNQUOTED_ID);
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

	public static class Field_declarationContext extends ParserRuleContext {
		public TerminalNode DQ_STRING() { return getToken(MQLParser.DQ_STRING, 0); }
		public Field_nameContext field_name() {
			return getRuleContext(Field_nameContext.class,0);
		}
		public Field_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_declaration; }
	}

	public final Field_declarationContext field_declaration() throws RecognitionException {
		Field_declarationContext _localctx = new Field_declarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_field_declaration);
		try {
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DQ_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(DQ_STRING);
				}
				break;
			case UNQUOTED_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				field_name();
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

	public static class Multipart_field_declarationContext extends ParserRuleContext {
		public List<Field_declarationContext> field_declaration() {
			return getRuleContexts(Field_declarationContext.class);
		}
		public Field_declarationContext field_declaration(int i) {
			return getRuleContext(Field_declarationContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(MQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MQLParser.DOT, i);
		}
		public Multipart_field_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipart_field_declaration; }
	}

	public final Multipart_field_declarationContext multipart_field_declaration() throws RecognitionException {
		Multipart_field_declarationContext _localctx = new Multipart_field_declarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_multipart_field_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			field_declaration();
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(365);
				match(DOT);
				setState(366);
				field_declaration();
				}
				}
				setState(371);
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

	public static class Field_nameContext extends ParserRuleContext {
		public TerminalNode UNQUOTED_ID() { return getToken(MQLParser.UNQUOTED_ID, 0); }
		public Field_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_name; }
	}

	public final Field_nameContext field_name() throws RecognitionException {
		Field_nameContext _localctx = new Field_nameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_field_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(UNQUOTED_ID);
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

	public static class Function_nameContext extends ParserRuleContext {
		public TerminalNode UNQUOTED_ID() { return getToken(MQLParser.UNQUOTED_ID, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(UNQUOTED_ID);
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

	public static class Function_argument_nameContext extends ParserRuleContext {
		public TerminalNode UNQUOTED_ID() { return getToken(MQLParser.UNQUOTED_ID, 0); }
		public Function_argument_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_argument_name; }
	}

	public final Function_argument_nameContext function_argument_name() throws RecognitionException {
		Function_argument_nameContext _localctx = new Function_argument_nameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_function_argument_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(UNQUOTED_ID);
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

	public static class Multipart_field_nameContext extends ParserRuleContext {
		public List<Field_nameContext> field_name() {
			return getRuleContexts(Field_nameContext.class);
		}
		public Field_nameContext field_name(int i) {
			return getRuleContext(Field_nameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(MQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MQLParser.DOT, i);
		}
		public Multipart_field_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipart_field_name; }
	}

	public final Multipart_field_nameContext multipart_field_name() throws RecognitionException {
		Multipart_field_nameContext _localctx = new Multipart_field_nameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_multipart_field_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			field_name();
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(379);
				match(DOT);
				setState(380);
				field_name();
				}
				}
				setState(385);
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

	public static class Variable_nameContext extends ParserRuleContext {
		public TerminalNode VARIABLE_ID() { return getToken(MQLParser.VARIABLE_ID, 0); }
		public Variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_name; }
	}

	public final Variable_nameContext variable_name() throws RecognitionException {
		Variable_nameContext _localctx = new Variable_nameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(VARIABLE_ID);
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
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 25);
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 22);
		case 8:
			return precpred(_ctx, 21);
		case 9:
			return precpred(_ctx, 20);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3E\u0187\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\5\2>\n\2\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\7\4G\n\4\f\4\16\4J\13\4\3\5\3\5\3\5\3\5\7\5P\n\5\f"+
		"\5\16\5S\13\5\3\5\3\5\5\5W\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5`\n\5\f"+
		"\5\16\5c\13\5\3\5\3\5\5\5g\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\5u\n\5\f\5\16\5x\13\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0080\n\5"+
		"\f\5\16\5\u0083\13\5\3\5\3\5\3\5\3\5\6\5\u0089\n\5\r\5\16\5\u008a\5\5"+
		"\u008d\n\5\5\5\u008f\n\5\3\6\5\6\u0092\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u0099"+
		"\n\6\3\7\3\7\5\7\u009d\n\7\3\b\3\b\3\b\5\b\u00a2\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\6\t\u00ab\n\t\r\t\16\t\u00ac\3\t\3\t\5\t\u00b1\n\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00be\n\t\f\t\16\t\u00c1\13\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00ca\n\t\f\t\16\t\u00cd\13\t\5\t\u00cf"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\7\t\u00d6\n\t\f\t\16\t\u00d9\13\t\5\t\u00db\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00e9\n\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u00ff\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0107\n\t\3\t\3\t\3\t\3"+
		"\t\5\t\u010d\n\t\3\t\3\t\5\t\u0111\n\t\3\t\3\t\5\t\u0115\n\t\5\t\u0117"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u011f\n\t\7\t\u0121\n\t\f\t\16\t\u0124"+
		"\13\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u012f\n\13\f\13\16"+
		"\13\u0132\13\13\5\13\u0134\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u013e\n\f\3\r\3\r\5\r\u0142\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\7\16\u014c\n\16\f\16\16\16\u014f\13\16\3\16\3\16\3\16\3\16\5\16\u0155"+
		"\n\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u0167\n\22\3\23\3\23\3\24\3\24\5\24\u016d\n\24\3"+
		"\25\3\25\3\25\7\25\u0172\n\25\f\25\16\25\u0175\13\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\31\7\31\u0180\n\31\f\31\16\31\u0183\13\31\3"+
		"\32\3\32\3\32\2\3\20\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\2\13\4\2!!$$\4\2\26\26\60\60\4\2&&99\4\2\b\b\23\24\4\2\22\22"+
		"\31\31\5\2\n\f\20\21\25\25\4\2\3\3  \4\2\27\27\62\62\3\2=A\2\u01b4\2\64"+
		"\3\2\2\2\4A\3\2\2\2\6C\3\2\2\2\b\u008e\3\2\2\2\n\u0098\3\2\2\2\f\u009a"+
		"\3\2\2\2\16\u00a1\3\2\2\2\20\u00e8\3\2\2\2\22\u0125\3\2\2\2\24\u0129\3"+
		"\2\2\2\26\u013d\3\2\2\2\30\u0141\3\2\2\2\32\u0154\3\2\2\2\34\u0156\3\2"+
		"\2\2\36\u0158\3\2\2\2 \u015d\3\2\2\2\"\u0166\3\2\2\2$\u0168\3\2\2\2&\u016c"+
		"\3\2\2\2(\u016e\3\2\2\2*\u0176\3\2\2\2,\u0178\3\2\2\2.\u017a\3\2\2\2\60"+
		"\u017c\3\2\2\2\62\u0184\3\2\2\2\649\5\4\3\2\65\66\7\36\2\2\668\5\4\3\2"+
		"\67\65\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:=\3\2\2\2;9\3\2\2\2<>\7"+
		"\36\2\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\7\2\2\3@\3\3\2\2\2AB\5\6\4\2B"+
		"\5\3\2\2\2CD\7\'\2\2DH\5\"\22\2EG\5\b\5\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2"+
		"\2HI\3\2\2\2I\7\3\2\2\2JH\3\2\2\2KL\7(\2\2LQ\5\22\n\2MN\7\7\2\2NP\5\22"+
		"\n\2OM\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RV\3\2\2\2SQ\3\2\2\2TU\7\""+
		"\2\2UW\5\20\t\2VT\3\2\2\2VW\3\2\2\2W\u008f\3\2\2\2XY\7-\2\2Y\u008f\7="+
		"\2\2Zf\7.\2\2[\\\7,\2\2\\a\5 \21\2]^\7\7\2\2^`\5 \21\2_]\3\2\2\2`c\3\2"+
		"\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7\4\2\2eg\3\2\2\2f[\3\2"+
		"\2\2fg\3\2\2\2gh\3\2\2\2hi\5(\25\2ij\7\6\2\2jk\7\17\2\2kl\5\6\4\2lm\7"+
		"\35\2\2m\u008f\3\2\2\2no\7/\2\2o\u008f\5\20\t\2pq\7\63\2\2qv\5\n\6\2r"+
		"s\7\7\2\2su\5\n\6\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\u008f\3\2"+
		"\2\2xv\3\2\2\2yz\7\64\2\2z\u008f\7=\2\2{|\7\65\2\2|\u0081\5\f\7\2}~\7"+
		"\7\2\2~\u0080\5\f\7\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2"+
		"\2\u0081\u0082\3\2\2\2\u0082\u008f\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085"+
		"\7:\2\2\u0085\u008c\5\60\31\2\u0086\u0088\7;\2\2\u0087\u0089\5\16\b\2"+
		"\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u0086\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008f\3\2\2\2\u008eK\3\2\2\2\u008eX\3\2\2\2\u008eZ\3\2\2\2\u008en\3\2"+
		"\2\2\u008ep\3\2\2\2\u008ey\3\2\2\2\u008e{\3\2\2\2\u008e\u0084\3\2\2\2"+
		"\u008f\t\3\2\2\2\u0090\u0092\7\26\2\2\u0091\u0090\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0099\5(\25\2\u0094\u0095\5(\25\2\u0095"+
		"\u0096\7\6\2\2\u0096\u0097\5\20\t\2\u0097\u0099\3\2\2\2\u0098\u0091\3"+
		"\2\2\2\u0098\u0094\3\2\2\2\u0099\13\3\2\2\2\u009a\u009c\5\60\31\2\u009b"+
		"\u009d\t\2\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\r\3\2\2\2"+
		"\u009e\u009f\7+\2\2\u009f\u00a2\5(\25\2\u00a0\u00a2\7<\2\2\u00a1\u009e"+
		"\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\17\3\2\2\2\u00a3\u00a4\b\t\1\2\u00a4"+
		"\u00a5\7\22\2\2\u00a5\u00e9\5\20\t\32\u00a6\u00a7\t\3\2\2\u00a7\u00e9"+
		"\5\20\t\31\u00a8\u00aa\7\67\2\2\u00a9\u00ab\5\36\20\2\u00aa\u00a9\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00b0\3\2\2\2\u00ae\u00af\7%\2\2\u00af\u00b1\5\20\t\2\u00b0\u00ae\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00e9\3\2\2\2\u00b2\u00b3\7)\2\2\u00b3"+
		"\u00b4\5\20\t\2\u00b4\u00b5\78\2\2\u00b5\u00b6\5\20\t\2\u00b6\u00b7\7"+
		"%\2\2\u00b7\u00b8\5\20\t\16\u00b8\u00e9\3\2\2\2\u00b9\u00ba\7,\2\2\u00ba"+
		"\u00bf\5 \21\2\u00bb\u00bc\7\7\2\2\u00bc\u00be\5 \21\2\u00bd\u00bb\3\2"+
		"\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\4\2\2\u00c3\u00c4\5\20"+
		"\t\r\u00c4\u00e9\3\2\2\2\u00c5\u00ce\7\r\2\2\u00c6\u00cb\5\22\n\2\u00c7"+
		"\u00c8\7\7\2\2\u00c8\u00ca\5\22\n\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd\3"+
		"\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00c6\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00e9\7\33\2\2\u00d1\u00da\7\16\2\2\u00d2\u00d7\5\20\t\2\u00d3"+
		"\u00d4\7\7\2\2\u00d4\u00d6\5\20\t\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\3"+
		"\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00da\u00d2\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00e9\7\34\2\2\u00dd\u00de\7\17\2\2\u00de\u00df\5\20\t\2\u00df"+
		"\u00e0\7\35\2\2\u00e0\u00e9\3\2\2\2\u00e1\u00e9\5\24\13\2\u00e2\u00e9"+
		"\5\62\32\2\u00e3\u00e9\5*\26\2\u00e4\u00e9\5\34\17\2\u00e5\u00e9\7B\2"+
		"\2\u00e6\u00e9\t\4\2\2\u00e7\u00e9\7\61\2\2\u00e8\u00a3\3\2\2\2\u00e8"+
		"\u00a6\3\2\2\2\u00e8\u00a8\3\2\2\2\u00e8\u00b2\3\2\2\2\u00e8\u00b9\3\2"+
		"\2\2\u00e8\u00c5\3\2\2\2\u00e8\u00d1\3\2\2\2\u00e8\u00dd\3\2\2\2\u00e8"+
		"\u00e1\3\2\2\2\u00e8\u00e2\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e8\u00e4\3\2"+
		"\2\2\u00e8\u00e5\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9"+
		"\u0122\3\2\2\2\u00ea\u00eb\f\33\2\2\u00eb\u00ec\7\5\2\2\u00ec\u0121\5"+
		"\20\t\33\u00ed\u00ee\f\25\2\2\u00ee\u00ef\t\5\2\2\u00ef\u0121\5\20\t\26"+
		"\u00f0\u00f1\f\24\2\2\u00f1\u00f2\t\6\2\2\u00f2\u0121\5\20\t\25\u00f3"+
		"\u00f4\f\23\2\2\u00f4\u00f5\t\7\2\2\u00f5\u0121\5\20\t\24\u00f6\u00f7"+
		"\f\22\2\2\u00f7\u00f8\t\b\2\2\u00f8\u0121\5\20\t\23\u00f9\u00fa\f\21\2"+
		"\2\u00fa\u00fb\t\t\2\2\u00fb\u0121\5\20\t\22\u00fc\u00fe\f\20\2\2\u00fd"+
		"\u00ff\7\60\2\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3"+
		"\2\2\2\u0100\u0101\7*\2\2\u0101\u0121\5\20\t\21\u0102\u0103\f\30\2\2\u0103"+
		"\u0106\7\t\2\2\u0104\u0107\5*\26\2\u0105\u0107\5\24\13\2\u0106\u0104\3"+
		"\2\2\2\u0106\u0105\3\2\2\2\u0107\u0121\3\2\2\2\u0108\u0109\f\27\2\2\u0109"+
		"\u0116\7\16\2\2\u010a\u0117\5\20\t\2\u010b\u010d\5\20\t\2\u010c\u010b"+
		"\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\7\6\2\2\u010f"+
		"\u0111\5\20\t\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0114\3"+
		"\2\2\2\u0112\u0113\7\6\2\2\u0113\u0115\5\20\t\2\u0114\u0112\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u010a\3\2\2\2\u0116\u010c\3\2"+
		"\2\2\u0117\u0118\3\2\2\2\u0118\u0121\7\34\2\2\u0119\u011a\f\26\2\2\u011a"+
		"\u011b\7\32\2\2\u011b\u011e\5\20\t\2\u011c\u011d\7\66\2\2\u011d\u011f"+
		"\5\20\t\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2"+
		"\u0120\u00ea\3\2\2\2\u0120\u00ed\3\2\2\2\u0120\u00f0\3\2\2\2\u0120\u00f3"+
		"\3\2\2\2\u0120\u00f6\3\2\2\2\u0120\u00f9\3\2\2\2\u0120\u00fc\3\2\2\2\u0120"+
		"\u0102\3\2\2\2\u0120\u0108\3\2\2\2\u0120\u0119\3\2\2\2\u0121\u0124\3\2"+
		"\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\21\3\2\2\2\u0124\u0122"+
		"\3\2\2\2\u0125\u0126\5&\24\2\u0126\u0127\7\6\2\2\u0127\u0128\5\20\t\2"+
		"\u0128\23\3\2\2\2\u0129\u012a\5,\27\2\u012a\u0133\7\17\2\2\u012b\u0130"+
		"\5\26\f\2\u012c\u012d\7\7\2\2\u012d\u012f\5\26\f\2\u012e\u012c\3\2\2\2"+
		"\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0134"+
		"\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u012b\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0136\7\35\2\2\u0136\25\3\2\2\2\u0137\u013e\5\20"+
		"\t\2\u0138\u0139\5.\30\2\u0139\u013a\7\6\2\2\u013a\u013b\5\20\t\2\u013b"+
		"\u013e\3\2\2\2\u013c\u013e\5\32\16\2\u013d\u0137\3\2\2\2\u013d\u0138\3"+
		"\2\2\2\u013d\u013c\3\2\2\2\u013e\27\3\2\2\2\u013f\u0142\5\62\32\2\u0140"+
		"\u0142\7\37\2\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0142\31\3\2\2"+
		"\2\u0143\u0144\5\30\r\2\u0144\u0145\7\4\2\2\u0145\u0146\5\20\t\2\u0146"+
		"\u0155\3\2\2\2\u0147\u0148\7\17\2\2\u0148\u014d\5\30\r\2\u0149\u014a\7"+
		"\7\2\2\u014a\u014c\5\30\r\2\u014b\u0149\3\2\2\2\u014c\u014f\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u014d\3\2"+
		"\2\2\u0150\u0151\7\35\2\2\u0151\u0152\7\4\2\2\u0152\u0153\5\20\t\2\u0153"+
		"\u0155\3\2\2\2\u0154\u0143\3\2\2\2\u0154\u0147\3\2\2\2\u0155\33\3\2\2"+
		"\2\u0156\u0157\t\n\2\2\u0157\35\3\2\2\2\u0158\u0159\7#\2\2\u0159\u015a"+
		"\5\20\t\2\u015a\u015b\78\2\2\u015b\u015c\5\20\t\2\u015c\37\3\2\2\2\u015d"+
		"\u015e\5\62\32\2\u015e\u015f\7\6\2\2\u015f\u0160\5\20\t\2\u0160!\3\2\2"+
		"\2\u0161\u0167\7C\2\2\u0162\u0163\5$\23\2\u0163\u0164\7\t\2\2\u0164\u0165"+
		"\7C\2\2\u0165\u0167\3\2\2\2\u0166\u0161\3\2\2\2\u0166\u0162\3\2\2\2\u0167"+
		"#\3\2\2\2\u0168\u0169\7C\2\2\u0169%\3\2\2\2\u016a\u016d\7B\2\2\u016b\u016d"+
		"\5*\26\2\u016c\u016a\3\2\2\2\u016c\u016b\3\2\2\2\u016d\'\3\2\2\2\u016e"+
		"\u0173\5&\24\2\u016f\u0170\7\t\2\2\u0170\u0172\5&\24\2\u0171\u016f\3\2"+
		"\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		")\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0177\7C\2\2\u0177+\3\2\2\2\u0178"+
		"\u0179\7C\2\2\u0179-\3\2\2\2\u017a\u017b\7C\2\2\u017b/\3\2\2\2\u017c\u0181"+
		"\5*\26\2\u017d\u017e\7\t\2\2\u017e\u0180\5*\26\2\u017f\u017d\3\2\2\2\u0180"+
		"\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\61\3\2\2"+
		"\2\u0183\u0181\3\2\2\2\u0184\u0185\7D\2\2\u0185\63\3\2\2\2-9=HQVafv\u0081"+
		"\u008a\u008c\u008e\u0091\u0098\u009c\u00a1\u00ac\u00b0\u00bf\u00cb\u00ce"+
		"\u00d7\u00da\u00e8\u00fe\u0106\u010c\u0110\u0114\u0116\u011e\u0120\u0122"+
		"\u0130\u0133\u013d\u0141\u014d\u0154\u0166\u016c\u0173\u0181";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}