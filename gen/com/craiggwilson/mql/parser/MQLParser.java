// Generated from C:/projects/craiggwilson/mql/src/main/java/com/craiggwilson/mql/parser\MQL.g4 by ANTLR 4.7
package com.craiggwilson.mql.parser;
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
		AND_SYMBOL=1, ARROW=2, ASSIGN=3, CARET=4, COLON=5, COMMA=6, DIV=7, DOLLAR=8, 
		DOT=9, EQ=10, GT=11, GTE=12, LBRACE=13, LBRACK=14, LPAREN=15, LT=16, LTE=17, 
		MINUS=18, MOD=19, MULT=20, NEQ=21, NOT_SYMBOL=22, OR_SYMBOL=23, PIPE=24, 
		PLUS=25, RANGE=26, RBRACE=27, RBRACK=28, RPAREN=29, SEMI=30, UNDERSCORE=31, 
		AND=32, ASC=33, BY=34, CASE=35, DESC=36, ELSE=37, FALSE=38, FROM=39, GROUP=40, 
		IF=41, IN=42, INDEX=43, LET=44, LIMIT=45, LOOKUP=46, MATCH=47, NOT=48, 
		NULL=49, OR=50, PROJECT=51, SKIP_=52, SORT=53, STARTING=54, STEP=55, SWITCH=56, 
		THEN=57, TRUE=58, UNWIND=59, WITH=60, PRESERVE_NULL_AND_EMPTY=61, INT=62, 
		DECIMAL=63, LONG=64, BIN=65, HEX=66, STRING=67, QUOTED_ID=68, UNQUOTED_ID=69, 
		WS=70;
	public static final int
		RULE_parse = 0, RULE_statement = 1, RULE_pipeline = 2, RULE_stage = 3, 
		RULE_group_stage = 4, RULE_limit_stage = 5, RULE_lookup_stage = 6, RULE_match_stage = 7, 
		RULE_project_stage = 8, RULE_skip_stage = 9, RULE_sort_stage = 10, RULE_sort_field = 11, 
		RULE_unwind_stage = 12, RULE_unwind_option = 13, RULE_expression = 14, 
		RULE_field_assignment = 15, RULE_function = 16, RULE_function_argument = 17, 
		RULE_lambda_argument = 18, RULE_lambda_expression = 19, RULE_number = 20, 
		RULE_switch_case = 21, RULE_variable_assignment = 22, RULE_collection_name = 23, 
		RULE_database_name = 24, RULE_multipart_field_name = 25, RULE_id = 26, 
		RULE_function_name = 27, RULE_variable_name = 28;
	public static final String[] ruleNames = {
		"parse", "statement", "pipeline", "stage", "group_stage", "limit_stage", 
		"lookup_stage", "match_stage", "project_stage", "skip_stage", "sort_stage", 
		"sort_field", "unwind_stage", "unwind_option", "expression", "field_assignment", 
		"function", "function_argument", "lambda_argument", "lambda_expression", 
		"number", "switch_case", "variable_assignment", "collection_name", "database_name", 
		"multipart_field_name", "id", "function_name", "variable_name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'&&'", "'=>'", "':='", "'^'", "':'", "','", "'/'", "'$'", "'.'", 
		"'='", "'>'", "'>='", "'{'", "'['", "'('", "'<'", "'<='", "'-'", "'%'", 
		"'*'", "'!='", "'!'", "'||'", "'|'", "'+'", "'..'", "'}'", "']'", "')'", 
		"';'", "'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND_SYMBOL", "ARROW", "ASSIGN", "CARET", "COLON", "COMMA", "DIV", 
		"DOLLAR", "DOT", "EQ", "GT", "GTE", "LBRACE", "LBRACK", "LPAREN", "LT", 
		"LTE", "MINUS", "MOD", "MULT", "NEQ", "NOT_SYMBOL", "OR_SYMBOL", "PIPE", 
		"PLUS", "RANGE", "RBRACE", "RBRACK", "RPAREN", "SEMI", "UNDERSCORE", "AND", 
		"ASC", "BY", "CASE", "DESC", "ELSE", "FALSE", "FROM", "GROUP", "IF", "IN", 
		"INDEX", "LET", "LIMIT", "LOOKUP", "MATCH", "NOT", "NULL", "OR", "PROJECT", 
		"SKIP_", "SORT", "STARTING", "STEP", "SWITCH", "THEN", "TRUE", "UNWIND", 
		"WITH", "PRESERVE_NULL_AND_EMPTY", "INT", "DECIMAL", "LONG", "BIN", "HEX", 
		"STRING", "QUOTED_ID", "UNQUOTED_ID", "WS"
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
			setState(58);
			statement();
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(59);
					match(SEMI);
					setState(60);
					statement();
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(66);
				match(SEMI);
				}
			}

			setState(69);
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
			setState(71);
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
			setState(73);
			match(FROM);
			setState(74);
			collection_name();
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(75);
				stage();
				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GROUP) | (1L << LIMIT) | (1L << LOOKUP) | (1L << MATCH) | (1L << PROJECT) | (1L << SKIP_) | (1L << SORT) | (1L << UNWIND))) != 0) );
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
		public Group_stageContext group_stage() {
			return getRuleContext(Group_stageContext.class,0);
		}
		public Limit_stageContext limit_stage() {
			return getRuleContext(Limit_stageContext.class,0);
		}
		public Lookup_stageContext lookup_stage() {
			return getRuleContext(Lookup_stageContext.class,0);
		}
		public Match_stageContext match_stage() {
			return getRuleContext(Match_stageContext.class,0);
		}
		public Project_stageContext project_stage() {
			return getRuleContext(Project_stageContext.class,0);
		}
		public Skip_stageContext skip_stage() {
			return getRuleContext(Skip_stageContext.class,0);
		}
		public Sort_stageContext sort_stage() {
			return getRuleContext(Sort_stageContext.class,0);
		}
		public Unwind_stageContext unwind_stage() {
			return getRuleContext(Unwind_stageContext.class,0);
		}
		public StageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stage; }
	}

	public final StageContext stage() throws RecognitionException {
		StageContext _localctx = new StageContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stage);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GROUP:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				group_stage();
				}
				break;
			case LIMIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				limit_stage();
				}
				break;
			case LOOKUP:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				lookup_stage();
				}
				break;
			case MATCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				match_stage();
				}
				break;
			case PROJECT:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				project_stage();
				}
				break;
			case SKIP_:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				skip_stage();
				}
				break;
			case SORT:
				enterOuterAlt(_localctx, 7);
				{
				setState(86);
				sort_stage();
				}
				break;
			case UNWIND:
				enterOuterAlt(_localctx, 8);
				{
				setState(87);
				unwind_stage();
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

	public static class Group_stageContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(MQLParser.GROUP, 0); }
		public List<Field_assignmentContext> field_assignment() {
			return getRuleContexts(Field_assignmentContext.class);
		}
		public Field_assignmentContext field_assignment(int i) {
			return getRuleContext(Field_assignmentContext.class,i);
		}
		public TerminalNode BY() { return getToken(MQLParser.BY, 0); }
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
		public Group_stageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_stage; }
	}

	public final Group_stageContext group_stage() throws RecognitionException {
		Group_stageContext _localctx = new Group_stageContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_group_stage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(GROUP);
			setState(91);
			field_assignment();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(92);
				match(COMMA);
				setState(93);
				field_assignment();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(BY);
			setState(100);
			expression(0);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(101);
				match(COMMA);
				setState(102);
				expression(0);
				}
				}
				setState(107);
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

	public static class Limit_stageContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(MQLParser.LIMIT, 0); }
		public TerminalNode INT() { return getToken(MQLParser.INT, 0); }
		public Limit_stageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit_stage; }
	}

	public final Limit_stageContext limit_stage() throws RecognitionException {
		Limit_stageContext _localctx = new Limit_stageContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_limit_stage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(LIMIT);
			setState(109);
			match(INT);
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

	public static class Lookup_stageContext extends ParserRuleContext {
		public TerminalNode LOOKUP() { return getToken(MQLParser.LOOKUP, 0); }
		public Multipart_field_nameContext multipart_field_name() {
			return getRuleContext(Multipart_field_nameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MQLParser.ASSIGN, 0); }
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
		public List<TerminalNode> COMMA() { return getTokens(MQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MQLParser.COMMA, i);
		}
		public Lookup_stageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lookup_stage; }
	}

	public final Lookup_stageContext lookup_stage() throws RecognitionException {
		Lookup_stageContext _localctx = new Lookup_stageContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lookup_stage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(LOOKUP);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(112);
				match(LET);
				setState(113);
				variable_assignment();
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(114);
					match(COMMA);
					setState(115);
					variable_assignment();
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(123);
			multipart_field_name();
			setState(124);
			match(ASSIGN);
			setState(125);
			match(LPAREN);
			setState(126);
			pipeline();
			setState(127);
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

	public static class Match_stageContext extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(MQLParser.MATCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Match_stageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_stage; }
	}

	public final Match_stageContext match_stage() throws RecognitionException {
		Match_stageContext _localctx = new Match_stageContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_match_stage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(MATCH);
			setState(130);
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

	public static class Project_stageContext extends ParserRuleContext {
		public TerminalNode PROJECT() { return getToken(MQLParser.PROJECT, 0); }
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
		public Project_stageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_project_stage; }
	}

	public final Project_stageContext project_stage() throws RecognitionException {
		Project_stageContext _localctx = new Project_stageContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_project_stage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(PROJECT);
			setState(133);
			field_assignment();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(134);
				match(COMMA);
				setState(135);
				field_assignment();
				}
				}
				setState(140);
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

	public static class Skip_stageContext extends ParserRuleContext {
		public TerminalNode SKIP_() { return getToken(MQLParser.SKIP_, 0); }
		public TerminalNode INT() { return getToken(MQLParser.INT, 0); }
		public Skip_stageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skip_stage; }
	}

	public final Skip_stageContext skip_stage() throws RecognitionException {
		Skip_stageContext _localctx = new Skip_stageContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_skip_stage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(SKIP_);
			setState(142);
			match(INT);
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

	public static class Sort_stageContext extends ParserRuleContext {
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
		public Sort_stageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort_stage; }
	}

	public final Sort_stageContext sort_stage() throws RecognitionException {
		Sort_stageContext _localctx = new Sort_stageContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sort_stage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(SORT);
			setState(145);
			sort_field();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(146);
				match(COMMA);
				setState(147);
				sort_field();
				}
				}
				setState(152);
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
		enterRule(_localctx, 22, RULE_sort_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			multipart_field_name();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(154);
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

	public static class Unwind_stageContext extends ParserRuleContext {
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
		public Unwind_stageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unwind_stage; }
	}

	public final Unwind_stageContext unwind_stage() throws RecognitionException {
		Unwind_stageContext _localctx = new Unwind_stageContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unwind_stage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(UNWIND);
			setState(158);
			multipart_field_name();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(159);
				match(WITH);
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(160);
					unwind_option();
					}
					}
					setState(163); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INDEX || _la==PRESERVE_NULL_AND_EMPTY );
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
		public Multipart_field_nameContext multipart_field_name() {
			return getRuleContext(Multipart_field_nameContext.class,0);
		}
		public TerminalNode PRESERVE_NULL_AND_EMPTY() { return getToken(MQLParser.PRESERVE_NULL_AND_EMPTY, 0); }
		public Unwind_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unwind_option; }
	}

	public final Unwind_optionContext unwind_option() throws RecognitionException {
		Unwind_optionContext _localctx = new Unwind_optionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unwind_option);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDEX:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(INDEX);
				setState(168);
				multipart_field_name();
				}
				break;
			case PRESERVE_NULL_AND_EMPTY:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
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
	public static class NumberExpressionContext extends ExpressionContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumberExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	public static class NotExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MQLParser.NOT, 0); }
		public TerminalNode NOT_SYMBOL() { return getToken(MQLParser.NOT_SYMBOL, 0); }
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
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
	public static class ArrayAccessExpressionContext extends ExpressionContext {
		public ExpressionContext start;
		public ExpressionContext end;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBRACK() { return getToken(MQLParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(MQLParser.RBRACK, 0); }
		public TerminalNode COLON() { return getToken(MQLParser.COLON, 0); }
		public ArrayAccessExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class StringExpressionContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(MQLParser.STRING, 0); }
		public StringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class VariableReferenceExpressionContext extends ExpressionContext {
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public VariableReferenceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
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
		public TerminalNode IN() { return getToken(MQLParser.IN, 0); }
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public FieldExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
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

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(173);
				match(MINUS);
				setState(174);
				expression(23);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				_la = _input.LA(1);
				if ( !(_la==NOT_SYMBOL || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(176);
				expression(22);
				}
				break;
			case 3:
				{
				_localctx = new SwitchExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				match(SWITCH);
				setState(179); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(178);
						switch_case();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(181); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(185);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(183);
					match(ELSE);
					setState(184);
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
				setState(187);
				match(IF);
				setState(188);
				expression(0);
				setState(189);
				match(THEN);
				setState(190);
				expression(0);
				setState(191);
				match(ELSE);
				setState(192);
				expression(12);
				}
				break;
			case 5:
				{
				_localctx = new LetExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				match(LET);
				setState(195);
				variable_assignment();
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(196);
					match(COMMA);
					setState(197);
					variable_assignment();
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(203);
				match(IN);
				setState(204);
				expression(11);
				}
				break;
			case 6:
				{
				_localctx = new NewDocumentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206);
				match(LBRACE);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (DOLLAR - 8)) | (1L << (LBRACE - 8)) | (1L << (LBRACK - 8)) | (1L << (LPAREN - 8)) | (1L << (MINUS - 8)) | (1L << (NOT_SYMBOL - 8)) | (1L << (FALSE - 8)) | (1L << (IF - 8)) | (1L << (LET - 8)) | (1L << (NOT - 8)) | (1L << (NULL - 8)) | (1L << (SWITCH - 8)) | (1L << (TRUE - 8)) | (1L << (INT - 8)) | (1L << (DECIMAL - 8)) | (1L << (LONG - 8)) | (1L << (BIN - 8)) | (1L << (HEX - 8)) | (1L << (STRING - 8)) | (1L << (QUOTED_ID - 8)) | (1L << (UNQUOTED_ID - 8)))) != 0)) {
					{
					setState(207);
					field_assignment();
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(208);
						match(COMMA);
						setState(209);
						field_assignment();
						}
						}
						setState(214);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(217);
				match(RBRACE);
				}
				break;
			case 7:
				{
				_localctx = new NewArrayExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(LBRACK);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (DOLLAR - 8)) | (1L << (LBRACE - 8)) | (1L << (LBRACK - 8)) | (1L << (LPAREN - 8)) | (1L << (MINUS - 8)) | (1L << (NOT_SYMBOL - 8)) | (1L << (FALSE - 8)) | (1L << (IF - 8)) | (1L << (LET - 8)) | (1L << (NOT - 8)) | (1L << (NULL - 8)) | (1L << (SWITCH - 8)) | (1L << (TRUE - 8)) | (1L << (INT - 8)) | (1L << (DECIMAL - 8)) | (1L << (LONG - 8)) | (1L << (BIN - 8)) | (1L << (HEX - 8)) | (1L << (STRING - 8)) | (1L << (QUOTED_ID - 8)) | (1L << (UNQUOTED_ID - 8)))) != 0)) {
					{
					setState(219);
					expression(0);
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(220);
						match(COMMA);
						setState(221);
						expression(0);
						}
						}
						setState(226);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(229);
				match(RBRACK);
				}
				break;
			case 8:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(230);
				match(LPAREN);
				setState(231);
				expression(0);
				setState(232);
				match(RPAREN);
				}
				break;
			case 9:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(234);
				function();
				}
				break;
			case 10:
				{
				_localctx = new VariableReferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(235);
				variable_name();
				}
				break;
			case 11:
				{
				_localctx = new FieldExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236);
				id();
				}
				break;
			case 12:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				number();
				}
				break;
			case 13:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(238);
				match(STRING);
				}
				break;
			case 14:
				{
				_localctx = new BooleanExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239);
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
				setState(240);
				match(NULL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(291);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(243);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(244);
						match(CARET);
						setState(245);
						expression(24);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(246);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(247);
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
						setState(248);
						expression(22);
						}
						break;
					case 3:
						{
						_localctx = new AdditionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(249);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(250);
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
						setState(251);
						expression(21);
						}
						break;
					case 4:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(252);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(253);
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
						setState(254);
						expression(20);
						}
						break;
					case 5:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(255);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(256);
						_la = _input.LA(1);
						if ( !(_la==AND_SYMBOL || _la==AND) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(257);
						expression(19);
						}
						break;
					case 6:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(258);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(259);
						_la = _input.LA(1);
						if ( !(_la==OR_SYMBOL || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(260);
						expression(18);
						}
						break;
					case 7:
						{
						_localctx = new ArrayAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(261);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(262);
						match(LBRACK);
						setState(274);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
						case 1:
							{
							setState(263);
							((ArrayAccessExpressionContext)_localctx).start = expression(0);
							}
							break;
						case 2:
							{
							setState(264);
							((ArrayAccessExpressionContext)_localctx).start = expression(0);
							setState(265);
							match(COLON);
							setState(267);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (DOLLAR - 8)) | (1L << (LBRACE - 8)) | (1L << (LBRACK - 8)) | (1L << (LPAREN - 8)) | (1L << (MINUS - 8)) | (1L << (NOT_SYMBOL - 8)) | (1L << (FALSE - 8)) | (1L << (IF - 8)) | (1L << (LET - 8)) | (1L << (NOT - 8)) | (1L << (NULL - 8)) | (1L << (SWITCH - 8)) | (1L << (TRUE - 8)) | (1L << (INT - 8)) | (1L << (DECIMAL - 8)) | (1L << (LONG - 8)) | (1L << (BIN - 8)) | (1L << (HEX - 8)) | (1L << (STRING - 8)) | (1L << (QUOTED_ID - 8)) | (1L << (UNQUOTED_ID - 8)))) != 0)) {
								{
								setState(266);
								((ArrayAccessExpressionContext)_localctx).end = expression(0);
								}
							}

							}
							break;
						case 3:
							{
							setState(270);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (DOLLAR - 8)) | (1L << (LBRACE - 8)) | (1L << (LBRACK - 8)) | (1L << (LPAREN - 8)) | (1L << (MINUS - 8)) | (1L << (NOT_SYMBOL - 8)) | (1L << (FALSE - 8)) | (1L << (IF - 8)) | (1L << (LET - 8)) | (1L << (NOT - 8)) | (1L << (NULL - 8)) | (1L << (SWITCH - 8)) | (1L << (TRUE - 8)) | (1L << (INT - 8)) | (1L << (DECIMAL - 8)) | (1L << (LONG - 8)) | (1L << (BIN - 8)) | (1L << (HEX - 8)) | (1L << (STRING - 8)) | (1L << (QUOTED_ID - 8)) | (1L << (UNQUOTED_ID - 8)))) != 0)) {
								{
								setState(269);
								((ArrayAccessExpressionContext)_localctx).start = expression(0);
								}
							}

							setState(272);
							match(COLON);
							setState(273);
							((ArrayAccessExpressionContext)_localctx).end = expression(0);
							}
							break;
						}
						setState(276);
						match(RBRACK);
						}
						break;
					case 8:
						{
						_localctx = new RangeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(278);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(279);
						match(RANGE);
						setState(280);
						expression(0);
						setState(283);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
						case 1:
							{
							setState(281);
							match(STEP);
							setState(282);
							expression(0);
							}
							break;
						}
						}
						break;
					case 9:
						{
						_localctx = new MemberExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(285);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(286);
						match(DOT);
						setState(289);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
						case 1:
							{
							setState(287);
							id();
							}
							break;
						case 2:
							{
							setState(288);
							function();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Multipart_field_nameContext multipart_field_name() {
			return getRuleContext(Multipart_field_nameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MQLParser.ASSIGN, 0); }
		public Field_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_assignment; }
	}

	public final Field_assignmentContext field_assignment() throws RecognitionException {
		Field_assignmentContext _localctx = new Field_assignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_field_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(296);
				multipart_field_name();
				setState(297);
				match(ASSIGN);
				}
				break;
			}
			setState(301);
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
		enterRule(_localctx, 32, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			function_name();
			setState(304);
			match(LPAREN);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (DOLLAR - 8)) | (1L << (LBRACE - 8)) | (1L << (LBRACK - 8)) | (1L << (LPAREN - 8)) | (1L << (MINUS - 8)) | (1L << (NOT_SYMBOL - 8)) | (1L << (UNDERSCORE - 8)) | (1L << (FALSE - 8)) | (1L << (IF - 8)) | (1L << (LET - 8)) | (1L << (NOT - 8)) | (1L << (NULL - 8)) | (1L << (SWITCH - 8)) | (1L << (TRUE - 8)) | (1L << (INT - 8)) | (1L << (DECIMAL - 8)) | (1L << (LONG - 8)) | (1L << (BIN - 8)) | (1L << (HEX - 8)) | (1L << (STRING - 8)) | (1L << (QUOTED_ID - 8)) | (1L << (UNQUOTED_ID - 8)))) != 0)) {
				{
				setState(305);
				function_argument();
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(306);
					match(COMMA);
					setState(307);
					function_argument();
					}
					}
					setState(312);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(315);
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
		public Lambda_expressionContext lambda_expression() {
			return getRuleContext(Lambda_expressionContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MQLParser.ASSIGN, 0); }
		public Function_argumentContext function_argument() {
			return getRuleContext(Function_argumentContext.class,0);
		}
		public Function_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_argument; }
	}

	public final Function_argumentContext function_argument() throws RecognitionException {
		Function_argumentContext _localctx = new Function_argumentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function_argument);
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				lambda_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				id();
				setState(320);
				match(ASSIGN);
				setState(321);
				function_argument();
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
		enterRule(_localctx, 36, RULE_lambda_argument);
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				variable_name();
				}
				break;
			case UNDERSCORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
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
		enterRule(_localctx, 38, RULE_lambda_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			lambda_argument();
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(330);
				match(COMMA);
				setState(331);
				lambda_argument();
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(337);
			match(ARROW);
			setState(338);
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
		enterRule(_localctx, 40, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (INT - 62)) | (1L << (DECIMAL - 62)) | (1L << (LONG - 62)) | (1L << (BIN - 62)) | (1L << (HEX - 62)))) != 0)) ) {
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
		enterRule(_localctx, 42, RULE_switch_case);
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
		public TerminalNode ASSIGN() { return getToken(MQLParser.ASSIGN, 0); }
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
		enterRule(_localctx, 44, RULE_variable_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			variable_name();
			setState(348);
			match(ASSIGN);
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
		public TerminalNode QUOTED_ID() { return getToken(MQLParser.QUOTED_ID, 0); }
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
		enterRule(_localctx, 46, RULE_collection_name);
		int _la;
		try {
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				_la = _input.LA(1);
				if ( !(_la==QUOTED_ID || _la==UNQUOTED_ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
				_la = _input.LA(1);
				if ( !(_la==QUOTED_ID || _la==UNQUOTED_ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
		public TerminalNode QUOTED_ID() { return getToken(MQLParser.QUOTED_ID, 0); }
		public TerminalNode UNQUOTED_ID() { return getToken(MQLParser.UNQUOTED_ID, 0); }
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_database_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_la = _input.LA(1);
			if ( !(_la==QUOTED_ID || _la==UNQUOTED_ID) ) {
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

	public static class Multipart_field_nameContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
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
		enterRule(_localctx, 50, RULE_multipart_field_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			id();
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(361);
				match(DOT);
				setState(362);
				id();
				}
				}
				setState(367);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode QUOTED_ID() { return getToken(MQLParser.QUOTED_ID, 0); }
		public TerminalNode UNQUOTED_ID() { return getToken(MQLParser.UNQUOTED_ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_la = _input.LA(1);
			if ( !(_la==QUOTED_ID || _la==UNQUOTED_ID) ) {
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

	public static class Function_nameContext extends ParserRuleContext {
		public TerminalNode UNQUOTED_ID() { return getToken(MQLParser.UNQUOTED_ID, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
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

	public static class Variable_nameContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(MQLParser.DOLLAR, 0); }
		public TerminalNode QUOTED_ID() { return getToken(MQLParser.QUOTED_ID, 0); }
		public TerminalNode UNQUOTED_ID() { return getToken(MQLParser.UNQUOTED_ID, 0); }
		public Variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_name; }
	}

	public final Variable_nameContext variable_name() throws RecognitionException {
		Variable_nameContext _localctx = new Variable_nameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_variable_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(DOLLAR);
			setState(373);
			_la = _input.LA(1);
			if ( !(_la==QUOTED_ID || _la==UNQUOTED_ID) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 24);
		case 1:
			return precpred(_ctx, 21);
		case 2:
			return precpred(_ctx, 20);
		case 3:
			return precpred(_ctx, 19);
		case 4:
			return precpred(_ctx, 18);
		case 5:
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 16);
		case 7:
			return precpred(_ctx, 15);
		case 8:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u017a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\7\2@\n"+
		"\2\f\2\16\2C\13\2\3\2\5\2F\n\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\6\4O\n\4\r"+
		"\4\16\4P\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5[\n\5\3\6\3\6\3\6\3\6\7\6"+
		"a\n\6\f\6\16\6d\13\6\3\6\3\6\3\6\3\6\7\6j\n\6\f\6\16\6m\13\6\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\7\bw\n\b\f\b\16\bz\13\b\5\b|\n\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u008b\n\n\f\n\16\n\u008e\13"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u0097\n\f\f\f\16\f\u009a\13\f\3"+
		"\r\3\r\5\r\u009e\n\r\3\16\3\16\3\16\3\16\6\16\u00a4\n\16\r\16\16\16\u00a5"+
		"\5\16\u00a8\n\16\3\17\3\17\3\17\5\17\u00ad\n\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\6\20\u00b6\n\20\r\20\16\20\u00b7\3\20\3\20\5\20\u00bc\n"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00c9"+
		"\n\20\f\20\16\20\u00cc\13\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00d5"+
		"\n\20\f\20\16\20\u00d8\13\20\5\20\u00da\n\20\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u00e1\n\20\f\20\16\20\u00e4\13\20\5\20\u00e6\n\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00f4\n\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u010e\n\20\3\20\5\20\u0111"+
		"\n\20\3\20\3\20\5\20\u0115\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u011e\n\20\3\20\3\20\3\20\3\20\5\20\u0124\n\20\7\20\u0126\n\20\f\20\16"+
		"\20\u0129\13\20\3\21\3\21\3\21\5\21\u012e\n\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u0137\n\22\f\22\16\22\u013a\13\22\5\22\u013c\n\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0146\n\23\3\24\3\24\5\24\u014a"+
		"\n\24\3\25\3\25\3\25\7\25\u014f\n\25\f\25\16\25\u0152\13\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u0167\n\31\3\32\3\32\3\33\3\33\3\33\7\33\u016e\n"+
		"\33\f\33\16\33\u0171\13\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\2\3"+
		"\36\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2"+
		"\f\4\2##&&\4\2\30\30\62\62\4\2((<<\4\2\t\t\25\26\4\2\24\24\33\33\5\2\f"+
		"\16\22\23\27\27\4\2\3\3\"\"\4\2\31\31\64\64\3\2@D\3\2FG\2\u019d\2<\3\2"+
		"\2\2\4I\3\2\2\2\6K\3\2\2\2\bZ\3\2\2\2\n\\\3\2\2\2\fn\3\2\2\2\16q\3\2\2"+
		"\2\20\u0083\3\2\2\2\22\u0086\3\2\2\2\24\u008f\3\2\2\2\26\u0092\3\2\2\2"+
		"\30\u009b\3\2\2\2\32\u009f\3\2\2\2\34\u00ac\3\2\2\2\36\u00f3\3\2\2\2 "+
		"\u012d\3\2\2\2\"\u0131\3\2\2\2$\u0145\3\2\2\2&\u0149\3\2\2\2(\u014b\3"+
		"\2\2\2*\u0156\3\2\2\2,\u0158\3\2\2\2.\u015d\3\2\2\2\60\u0166\3\2\2\2\62"+
		"\u0168\3\2\2\2\64\u016a\3\2\2\2\66\u0172\3\2\2\28\u0174\3\2\2\2:\u0176"+
		"\3\2\2\2<A\5\4\3\2=>\7 \2\2>@\5\4\3\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB"+
		"\3\2\2\2BE\3\2\2\2CA\3\2\2\2DF\7 \2\2ED\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH"+
		"\7\2\2\3H\3\3\2\2\2IJ\5\6\4\2J\5\3\2\2\2KL\7)\2\2LN\5\60\31\2MO\5\b\5"+
		"\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\7\3\2\2\2R[\5\n\6\2S[\5\f"+
		"\7\2T[\5\16\b\2U[\5\20\t\2V[\5\22\n\2W[\5\24\13\2X[\5\26\f\2Y[\5\32\16"+
		"\2ZR\3\2\2\2ZS\3\2\2\2ZT\3\2\2\2ZU\3\2\2\2ZV\3\2\2\2ZW\3\2\2\2ZX\3\2\2"+
		"\2ZY\3\2\2\2[\t\3\2\2\2\\]\7*\2\2]b\5 \21\2^_\7\b\2\2_a\5 \21\2`^\3\2"+
		"\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7$\2\2fk\5\36"+
		"\20\2gh\7\b\2\2hj\5\36\20\2ig\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\13"+
		"\3\2\2\2mk\3\2\2\2no\7/\2\2op\7@\2\2p\r\3\2\2\2q{\7\60\2\2rs\7.\2\2sx"+
		"\5.\30\2tu\7\b\2\2uw\5.\30\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y"+
		"|\3\2\2\2zx\3\2\2\2{r\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\5\64\33\2~\177\7\5"+
		"\2\2\177\u0080\7\21\2\2\u0080\u0081\5\6\4\2\u0081\u0082\7\37\2\2\u0082"+
		"\17\3\2\2\2\u0083\u0084\7\61\2\2\u0084\u0085\5\36\20\2\u0085\21\3\2\2"+
		"\2\u0086\u0087\7\65\2\2\u0087\u008c\5 \21\2\u0088\u0089\7\b\2\2\u0089"+
		"\u008b\5 \21\2\u008a\u0088\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\23\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090"+
		"\7\66\2\2\u0090\u0091\7@\2\2\u0091\25\3\2\2\2\u0092\u0093\7\67\2\2\u0093"+
		"\u0098\5\30\r\2\u0094\u0095\7\b\2\2\u0095\u0097\5\30\r\2\u0096\u0094\3"+
		"\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\27\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009d\5\64\33\2\u009c\u009e\t\2"+
		"\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\31\3\2\2\2\u009f\u00a0"+
		"\7=\2\2\u00a0\u00a7\5\64\33\2\u00a1\u00a3\7>\2\2\u00a2\u00a4\5\34\17\2"+
		"\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\33\3\2\2\2\u00a9\u00aa\7-\2\2\u00aa\u00ad\5\64\33\2\u00ab\u00ad\7?\2"+
		"\2\u00ac\u00a9\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\35\3\2\2\2\u00ae\u00af"+
		"\b\20\1\2\u00af\u00b0\7\24\2\2\u00b0\u00f4\5\36\20\31\u00b1\u00b2\t\3"+
		"\2\2\u00b2\u00f4\5\36\20\30\u00b3\u00b5\7:\2\2\u00b4\u00b6\5,\27\2\u00b5"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00ba\7\'\2\2\u00ba\u00bc\5\36\20\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00f4\3\2\2\2\u00bd\u00be\7+"+
		"\2\2\u00be\u00bf\5\36\20\2\u00bf\u00c0\7;\2\2\u00c0\u00c1\5\36\20\2\u00c1"+
		"\u00c2\7\'\2\2\u00c2\u00c3\5\36\20\16\u00c3\u00f4\3\2\2\2\u00c4\u00c5"+
		"\7.\2\2\u00c5\u00ca\5.\30\2\u00c6\u00c7\7\b\2\2\u00c7\u00c9\5.\30\2\u00c8"+
		"\u00c6\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7,\2\2\u00ce"+
		"\u00cf\5\36\20\r\u00cf\u00f4\3\2\2\2\u00d0\u00d9\7\17\2\2\u00d1\u00d6"+
		"\5 \21\2\u00d2\u00d3\7\b\2\2\u00d3\u00d5\5 \21\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00da\3\2"+
		"\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00d1\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00f4\7\35\2\2\u00dc\u00e5\7\20\2\2\u00dd\u00e2\5"+
		"\36\20\2\u00de\u00df\7\b\2\2\u00df\u00e1\5\36\20\2\u00e0\u00de\3\2\2\2"+
		"\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e6"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00dd\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00f4\7\36\2\2\u00e8\u00e9\7\21\2\2\u00e9\u00ea\5"+
		"\36\20\2\u00ea\u00eb\7\37\2\2\u00eb\u00f4\3\2\2\2\u00ec\u00f4\5\"\22\2"+
		"\u00ed\u00f4\5:\36\2\u00ee\u00f4\5\66\34\2\u00ef\u00f4\5*\26\2\u00f0\u00f4"+
		"\7E\2\2\u00f1\u00f4\t\4\2\2\u00f2\u00f4\7\63\2\2\u00f3\u00ae\3\2\2\2\u00f3"+
		"\u00b1\3\2\2\2\u00f3\u00b3\3\2\2\2\u00f3\u00bd\3\2\2\2\u00f3\u00c4\3\2"+
		"\2\2\u00f3\u00d0\3\2\2\2\u00f3\u00dc\3\2\2\2\u00f3\u00e8\3\2\2\2\u00f3"+
		"\u00ec\3\2\2\2\u00f3\u00ed\3\2\2\2\u00f3\u00ee\3\2\2\2\u00f3\u00ef\3\2"+
		"\2\2\u00f3\u00f0\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4"+
		"\u0127\3\2\2\2\u00f5\u00f6\f\32\2\2\u00f6\u00f7\7\6\2\2\u00f7\u0126\5"+
		"\36\20\32\u00f8\u00f9\f\27\2\2\u00f9\u00fa\t\5\2\2\u00fa\u0126\5\36\20"+
		"\30\u00fb\u00fc\f\26\2\2\u00fc\u00fd\t\6\2\2\u00fd\u0126\5\36\20\27\u00fe"+
		"\u00ff\f\25\2\2\u00ff\u0100\t\7\2\2\u0100\u0126\5\36\20\26\u0101\u0102"+
		"\f\24\2\2\u0102\u0103\t\b\2\2\u0103\u0126\5\36\20\25\u0104\u0105\f\23"+
		"\2\2\u0105\u0106\t\t\2\2\u0106\u0126\5\36\20\24\u0107\u0108\f\22\2\2\u0108"+
		"\u0114\7\20\2\2\u0109\u0115\5\36\20\2\u010a\u010b\5\36\20\2\u010b\u010d"+
		"\7\7\2\2\u010c\u010e\5\36\20\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2"+
		"\u010e\u0115\3\2\2\2\u010f\u0111\5\36\20\2\u0110\u010f\3\2\2\2\u0110\u0111"+
		"\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\7\7\2\2\u0113\u0115\5\36\20\2"+
		"\u0114\u0109\3\2\2\2\u0114\u010a\3\2\2\2\u0114\u0110\3\2\2\2\u0115\u0116"+
		"\3\2\2\2\u0116\u0117\7\36\2\2\u0117\u0126\3\2\2\2\u0118\u0119\f\21\2\2"+
		"\u0119\u011a\7\34\2\2\u011a\u011d\5\36\20\2\u011b\u011c\79\2\2\u011c\u011e"+
		"\5\36\20\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0126\3\2\2\2"+
		"\u011f\u0120\f\20\2\2\u0120\u0123\7\13\2\2\u0121\u0124\5\66\34\2\u0122"+
		"\u0124\5\"\22\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124\u0126\3"+
		"\2\2\2\u0125\u00f5\3\2\2\2\u0125\u00f8\3\2\2\2\u0125\u00fb\3\2\2\2\u0125"+
		"\u00fe\3\2\2\2\u0125\u0101\3\2\2\2\u0125\u0104\3\2\2\2\u0125\u0107\3\2"+
		"\2\2\u0125\u0118\3\2\2\2\u0125\u011f\3\2\2\2\u0126\u0129\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\37\3\2\2\2\u0129\u0127\3\2\2"+
		"\2\u012a\u012b\5\64\33\2\u012b\u012c\7\5\2\2\u012c\u012e\3\2\2\2\u012d"+
		"\u012a\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\5\36"+
		"\20\2\u0130!\3\2\2\2\u0131\u0132\58\35\2\u0132\u013b\7\21\2\2\u0133\u0138"+
		"\5$\23\2\u0134\u0135\7\b\2\2\u0135\u0137\5$\23\2\u0136\u0134\3\2\2\2\u0137"+
		"\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013c\3\2"+
		"\2\2\u013a\u0138\3\2\2\2\u013b\u0133\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013e\7\37\2\2\u013e#\3\2\2\2\u013f\u0146\5\36\20"+
		"\2\u0140\u0146\5(\25\2\u0141\u0142\5\66\34\2\u0142\u0143\7\5\2\2\u0143"+
		"\u0144\5$\23\2\u0144\u0146\3\2\2\2\u0145\u013f\3\2\2\2\u0145\u0140\3\2"+
		"\2\2\u0145\u0141\3\2\2\2\u0146%\3\2\2\2\u0147\u014a\5:\36\2\u0148\u014a"+
		"\7!\2\2\u0149\u0147\3\2\2\2\u0149\u0148\3\2\2\2\u014a\'\3\2\2\2\u014b"+
		"\u0150\5&\24\2\u014c\u014d\7\b\2\2\u014d\u014f\5&\24\2\u014e\u014c\3\2"+
		"\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0154\7\4\2\2\u0154\u0155\5\36"+
		"\20\2\u0155)\3\2\2\2\u0156\u0157\t\n\2\2\u0157+\3\2\2\2\u0158\u0159\7"+
		"%\2\2\u0159\u015a\5\36\20\2\u015a\u015b\7;\2\2\u015b\u015c\5\36\20\2\u015c"+
		"-\3\2\2\2\u015d\u015e\5:\36\2\u015e\u015f\7\5\2\2\u015f\u0160\5\36\20"+
		"\2\u0160/\3\2\2\2\u0161\u0167\t\13\2\2\u0162\u0163\5\62\32\2\u0163\u0164"+
		"\7\13\2\2\u0164\u0165\t\13\2\2\u0165\u0167\3\2\2\2\u0166\u0161\3\2\2\2"+
		"\u0166\u0162\3\2\2\2\u0167\61\3\2\2\2\u0168\u0169\t\13\2\2\u0169\63\3"+
		"\2\2\2\u016a\u016f\5\66\34\2\u016b\u016c\7\13\2\2\u016c\u016e\5\66\34"+
		"\2\u016d\u016b\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170"+
		"\3\2\2\2\u0170\65\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0173\t\13\2\2\u0173"+
		"\67\3\2\2\2\u0174\u0175\7G\2\2\u01759\3\2\2\2\u0176\u0177\7\n\2\2\u0177"+
		"\u0178\t\13\2\2\u0178;\3\2\2\2\'AEPZbkx{\u008c\u0098\u009d\u00a5\u00a7"+
		"\u00ac\u00b7\u00bb\u00ca\u00d6\u00d9\u00e2\u00e5\u00f3\u010d\u0110\u0114"+
		"\u011d\u0123\u0125\u0127\u012d\u0138\u013b\u0145\u0149\u0150\u0166\u016f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}