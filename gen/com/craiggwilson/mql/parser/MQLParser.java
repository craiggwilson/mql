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
		NULL=49, OR=50, PROJECT=51, SKIP_=52, SORT=53, STARTING=54, SWITCH=55, 
		THEN=56, TRUE=57, UNWIND=58, WITH=59, PRESERVE_NULL_AND_EMPTY=60, INT=61, 
		DECIMAL=62, LONG=63, BIN=64, HEX=65, STRING=66, QUOTED_ID=67, UNQUOTED_ID=68, 
		WS=69;
	public static final int
		RULE_parse = 0, RULE_statement = 1, RULE_pipeline = 2, RULE_stage = 3, 
		RULE_group_stage = 4, RULE_limit_stage = 5, RULE_lookup_stage = 6, RULE_match_stage = 7, 
		RULE_project_stage = 8, RULE_skip_stage = 9, RULE_sort_stage = 10, RULE_sort_field = 11, 
		RULE_unwind_stage = 12, RULE_unwind_option = 13, RULE_expression = 14, 
		RULE_field_assignment = 15, RULE_function = 16, RULE_function_argument = 17, 
		RULE_lambda_argument = 18, RULE_lambda_expression = 19, RULE_number = 20, 
		RULE_variable_assignment = 21, RULE_collection_name = 22, RULE_database_name = 23, 
		RULE_multipart_field_name = 24, RULE_id = 25, RULE_function_name = 26, 
		RULE_variable_name = 27;
	public static final String[] ruleNames = {
		"parse", "statement", "pipeline", "stage", "group_stage", "limit_stage", 
		"lookup_stage", "match_stage", "project_stage", "skip_stage", "sort_stage", 
		"sort_field", "unwind_stage", "unwind_option", "expression", "field_assignment", 
		"function", "function_argument", "lambda_argument", "lambda_expression", 
		"number", "variable_assignment", "collection_name", "database_name", "multipart_field_name", 
		"id", "function_name", "variable_name"
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
		"SKIP_", "SORT", "STARTING", "SWITCH", "THEN", "TRUE", "UNWIND", "WITH", 
		"PRESERVE_NULL_AND_EMPTY", "INT", "DECIMAL", "LONG", "BIN", "HEX", "STRING", 
		"QUOTED_ID", "UNQUOTED_ID", "WS"
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
			setState(56);
			statement();
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(57);
					match(SEMI);
					setState(58);
					statement();
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(64);
				match(SEMI);
				}
			}

			setState(67);
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
			setState(69);
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
			setState(71);
			match(FROM);
			setState(72);
			collection_name();
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				stage();
				}
				}
				setState(76); 
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
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GROUP:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				group_stage();
				}
				break;
			case LIMIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				limit_stage();
				}
				break;
			case LOOKUP:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				lookup_stage();
				}
				break;
			case MATCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				match_stage();
				}
				break;
			case PROJECT:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				project_stage();
				}
				break;
			case SKIP_:
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				skip_stage();
				}
				break;
			case SORT:
				enterOuterAlt(_localctx, 7);
				{
				setState(84);
				sort_stage();
				}
				break;
			case UNWIND:
				enterOuterAlt(_localctx, 8);
				{
				setState(85);
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
			setState(88);
			match(GROUP);
			setState(89);
			field_assignment();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(90);
				match(COMMA);
				setState(91);
				field_assignment();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			match(BY);
			setState(98);
			expression(0);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(99);
				match(COMMA);
				setState(100);
				expression(0);
				}
				}
				setState(105);
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
			setState(106);
			match(LIMIT);
			setState(107);
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
			setState(109);
			match(LOOKUP);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(110);
				match(LET);
				setState(111);
				variable_assignment();
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(112);
					match(COMMA);
					setState(113);
					variable_assignment();
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(121);
			multipart_field_name();
			setState(122);
			match(ASSIGN);
			setState(123);
			match(LPAREN);
			setState(124);
			pipeline();
			setState(125);
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
			setState(127);
			match(MATCH);
			setState(128);
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
			setState(130);
			match(PROJECT);
			setState(131);
			field_assignment();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(132);
				match(COMMA);
				setState(133);
				field_assignment();
				}
				}
				setState(138);
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
			setState(139);
			match(SKIP_);
			setState(140);
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
			setState(142);
			match(SORT);
			setState(143);
			sort_field();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(144);
				match(COMMA);
				setState(145);
				sort_field();
				}
				}
				setState(150);
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
			setState(151);
			multipart_field_name();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(152);
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
			setState(155);
			match(UNWIND);
			setState(156);
			multipart_field_name();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(157);
				match(WITH);
				setState(159); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(158);
					unwind_option();
					}
					}
					setState(161); 
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
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDEX:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(INDEX);
				setState(166);
				multipart_field_name();
				}
				break;
			case PRESERVE_NULL_AND_EMPTY:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
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
	public static class DocumentExpressionContext extends ExpressionContext {
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
		public DocumentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayExpressionContext extends ExpressionContext {
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
		public TerminalNode COLON() { return getToken(MQLParser.COLON, 0); }
		public ArrayExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
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
		public List<TerminalNode> CASE() { return getTokens(MQLParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(MQLParser.CASE, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(MQLParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(MQLParser.THEN, i);
		}
		public TerminalNode ELSE() { return getToken(MQLParser.ELSE, 0); }
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(171);
				match(MINUS);
				setState(172);
				expression(23);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				_la = _input.LA(1);
				if ( !(_la==NOT_SYMBOL || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(174);
				expression(22);
				}
				break;
			case 3:
				{
				_localctx = new SwitchExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				match(SWITCH);
				setState(181); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(176);
						match(CASE);
						setState(177);
						expression(0);
						setState(178);
						match(THEN);
						setState(179);
						expression(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(183); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(187);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(185);
					match(ELSE);
					setState(186);
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
				setState(189);
				match(IF);
				setState(190);
				expression(0);
				setState(191);
				match(THEN);
				setState(192);
				expression(0);
				setState(193);
				match(ELSE);
				setState(194);
				expression(12);
				}
				break;
			case 5:
				{
				_localctx = new LetExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				match(LET);
				setState(197);
				variable_assignment();
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(198);
					match(COMMA);
					setState(199);
					variable_assignment();
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(205);
				match(IN);
				setState(206);
				expression(11);
				}
				break;
			case 6:
				{
				_localctx = new DocumentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208);
				match(LBRACE);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (DOLLAR - 8)) | (1L << (LBRACE - 8)) | (1L << (LBRACK - 8)) | (1L << (LPAREN - 8)) | (1L << (MINUS - 8)) | (1L << (NOT_SYMBOL - 8)) | (1L << (FALSE - 8)) | (1L << (IF - 8)) | (1L << (LET - 8)) | (1L << (NOT - 8)) | (1L << (NULL - 8)) | (1L << (SWITCH - 8)) | (1L << (TRUE - 8)) | (1L << (INT - 8)) | (1L << (DECIMAL - 8)) | (1L << (LONG - 8)) | (1L << (BIN - 8)) | (1L << (HEX - 8)) | (1L << (STRING - 8)) | (1L << (QUOTED_ID - 8)) | (1L << (UNQUOTED_ID - 8)))) != 0)) {
					{
					setState(209);
					field_assignment();
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(210);
						match(COMMA);
						setState(211);
						field_assignment();
						}
						}
						setState(216);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(219);
				match(RBRACE);
				}
				break;
			case 7:
				{
				_localctx = new ArrayExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				match(LBRACK);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (DOLLAR - 8)) | (1L << (LBRACE - 8)) | (1L << (LBRACK - 8)) | (1L << (LPAREN - 8)) | (1L << (MINUS - 8)) | (1L << (NOT_SYMBOL - 8)) | (1L << (FALSE - 8)) | (1L << (IF - 8)) | (1L << (LET - 8)) | (1L << (NOT - 8)) | (1L << (NULL - 8)) | (1L << (SWITCH - 8)) | (1L << (TRUE - 8)) | (1L << (INT - 8)) | (1L << (DECIMAL - 8)) | (1L << (LONG - 8)) | (1L << (BIN - 8)) | (1L << (HEX - 8)) | (1L << (STRING - 8)) | (1L << (QUOTED_ID - 8)) | (1L << (UNQUOTED_ID - 8)))) != 0)) {
					{
					setState(221);
					expression(0);
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(222);
						match(COMMA);
						setState(223);
						expression(0);
						}
						}
						setState(228);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(231);
				match(RBRACK);
				}
				break;
			case 8:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232);
				match(LPAREN);
				setState(233);
				expression(0);
				setState(234);
				match(RPAREN);
				}
				break;
			case 9:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236);
				function();
				}
				break;
			case 10:
				{
				_localctx = new VariableReferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				variable_name();
				}
				break;
			case 11:
				{
				_localctx = new FieldExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(238);
				id();
				}
				break;
			case 12:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239);
				number();
				}
				break;
			case 13:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(240);
				match(STRING);
				}
				break;
			case 14:
				{
				_localctx = new BooleanExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(241);
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
				setState(242);
				match(NULL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(289);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(245);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(246);
						match(CARET);
						setState(247);
						expression(24);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(248);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(249);
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
						setState(250);
						expression(22);
						}
						break;
					case 3:
						{
						_localctx = new AdditionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(251);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(252);
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
						setState(253);
						expression(21);
						}
						break;
					case 4:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(254);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(255);
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
						setState(256);
						expression(20);
						}
						break;
					case 5:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(257);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(258);
						_la = _input.LA(1);
						if ( !(_la==AND_SYMBOL || _la==AND) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(259);
						expression(19);
						}
						break;
					case 6:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(260);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(261);
						_la = _input.LA(1);
						if ( !(_la==OR_SYMBOL || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(262);
						expression(18);
						}
						break;
					case 7:
						{
						_localctx = new RangeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(263);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(264);
						match(RANGE);
						setState(265);
						expression(16);
						}
						break;
					case 8:
						{
						_localctx = new ArrayExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(266);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(267);
						match(LBRACK);
						setState(279);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
						case 1:
							{
							setState(268);
							expression(0);
							}
							break;
						case 2:
							{
							setState(269);
							expression(0);
							setState(270);
							match(COLON);
							setState(272);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (DOLLAR - 8)) | (1L << (LBRACE - 8)) | (1L << (LBRACK - 8)) | (1L << (LPAREN - 8)) | (1L << (MINUS - 8)) | (1L << (NOT_SYMBOL - 8)) | (1L << (FALSE - 8)) | (1L << (IF - 8)) | (1L << (LET - 8)) | (1L << (NOT - 8)) | (1L << (NULL - 8)) | (1L << (SWITCH - 8)) | (1L << (TRUE - 8)) | (1L << (INT - 8)) | (1L << (DECIMAL - 8)) | (1L << (LONG - 8)) | (1L << (BIN - 8)) | (1L << (HEX - 8)) | (1L << (STRING - 8)) | (1L << (QUOTED_ID - 8)) | (1L << (UNQUOTED_ID - 8)))) != 0)) {
								{
								setState(271);
								expression(0);
								}
							}

							}
							break;
						case 3:
							{
							setState(275);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (DOLLAR - 8)) | (1L << (LBRACE - 8)) | (1L << (LBRACK - 8)) | (1L << (LPAREN - 8)) | (1L << (MINUS - 8)) | (1L << (NOT_SYMBOL - 8)) | (1L << (FALSE - 8)) | (1L << (IF - 8)) | (1L << (LET - 8)) | (1L << (NOT - 8)) | (1L << (NULL - 8)) | (1L << (SWITCH - 8)) | (1L << (TRUE - 8)) | (1L << (INT - 8)) | (1L << (DECIMAL - 8)) | (1L << (LONG - 8)) | (1L << (BIN - 8)) | (1L << (HEX - 8)) | (1L << (STRING - 8)) | (1L << (QUOTED_ID - 8)) | (1L << (UNQUOTED_ID - 8)))) != 0)) {
								{
								setState(274);
								expression(0);
								}
							}

							setState(277);
							match(COLON);
							setState(278);
							expression(0);
							}
							break;
						}
						setState(281);
						match(RBRACK);
						}
						break;
					case 9:
						{
						_localctx = new MemberExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(283);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(284);
						match(DOT);
						setState(287);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
						case 1:
							{
							setState(285);
							id();
							}
							break;
						case 2:
							{
							setState(286);
							function();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(294);
				multipart_field_name();
				setState(295);
				match(ASSIGN);
				}
				break;
			}
			setState(299);
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
			setState(301);
			function_name();
			setState(302);
			match(LPAREN);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (DOLLAR - 8)) | (1L << (LBRACE - 8)) | (1L << (LBRACK - 8)) | (1L << (LPAREN - 8)) | (1L << (MINUS - 8)) | (1L << (NOT_SYMBOL - 8)) | (1L << (UNDERSCORE - 8)) | (1L << (FALSE - 8)) | (1L << (IF - 8)) | (1L << (LET - 8)) | (1L << (NOT - 8)) | (1L << (NULL - 8)) | (1L << (SWITCH - 8)) | (1L << (TRUE - 8)) | (1L << (INT - 8)) | (1L << (DECIMAL - 8)) | (1L << (LONG - 8)) | (1L << (BIN - 8)) | (1L << (HEX - 8)) | (1L << (STRING - 8)) | (1L << (QUOTED_ID - 8)) | (1L << (UNQUOTED_ID - 8)))) != 0)) {
				{
				setState(303);
				function_argument();
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(304);
					match(COMMA);
					setState(305);
					function_argument();
					}
					}
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(313);
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
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				lambda_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				id();
				setState(318);
				match(ASSIGN);
				setState(319);
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
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				variable_name();
				}
				break;
			case UNDERSCORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
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
			setState(327);
			lambda_argument();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(328);
				match(COMMA);
				setState(329);
				lambda_argument();
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(335);
			match(ARROW);
			setState(336);
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
			setState(338);
			_la = _input.LA(1);
			if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (INT - 61)) | (1L << (DECIMAL - 61)) | (1L << (LONG - 61)) | (1L << (BIN - 61)) | (1L << (HEX - 61)))) != 0)) ) {
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

	public static class Variable_assignmentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MQLParser.ASSIGN, 0); }
		public Variable_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_assignment; }
	}

	public final Variable_assignmentContext variable_assignment() throws RecognitionException {
		Variable_assignmentContext _localctx = new Variable_assignmentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variable_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(340);
				variable_name();
				setState(341);
				match(ASSIGN);
				}
				break;
			}
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
		enterRule(_localctx, 44, RULE_collection_name);
		int _la;
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
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
				setState(348);
				database_name();
				setState(349);
				match(DOT);
				setState(350);
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
		enterRule(_localctx, 46, RULE_database_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		enterRule(_localctx, 48, RULE_multipart_field_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			id();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(357);
				match(DOT);
				setState(358);
				id();
				}
				}
				setState(363);
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
		enterRule(_localctx, 50, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
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
		enterRule(_localctx, 52, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
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
		enterRule(_localctx, 54, RULE_variable_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(DOLLAR);
			setState(369);
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
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 16);
		case 8:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3G\u0176\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\7\2>\n\2\f\2\16\2"+
		"A\13\2\3\2\5\2D\n\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\6\4M\n\4\r\4\16\4N\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Y\n\5\3\6\3\6\3\6\3\6\7\6_\n\6\f\6\16"+
		"\6b\13\6\3\6\3\6\3\6\3\6\7\6h\n\6\f\6\16\6k\13\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\7\bu\n\b\f\b\16\bx\13\b\5\bz\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u0089\n\n\f\n\16\n\u008c\13\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\7\f\u0095\n\f\f\f\16\f\u0098\13\f\3\r\3\r\5\r\u009c"+
		"\n\r\3\16\3\16\3\16\3\16\6\16\u00a2\n\16\r\16\16\16\u00a3\5\16\u00a6\n"+
		"\16\3\17\3\17\3\17\5\17\u00ab\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\6\20\u00b8\n\20\r\20\16\20\u00b9\3\20\3\20\5\20\u00be"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00cb"+
		"\n\20\f\20\16\20\u00ce\13\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00d7"+
		"\n\20\f\20\16\20\u00da\13\20\5\20\u00dc\n\20\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u00e3\n\20\f\20\16\20\u00e6\13\20\5\20\u00e8\n\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00f6\n\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0113\n\20"+
		"\3\20\5\20\u0116\n\20\3\20\3\20\5\20\u011a\n\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\5\20\u0122\n\20\7\20\u0124\n\20\f\20\16\20\u0127\13\20\3\21\3"+
		"\21\3\21\5\21\u012c\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u0135"+
		"\n\22\f\22\16\22\u0138\13\22\5\22\u013a\n\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u0144\n\23\3\24\3\24\5\24\u0148\n\24\3\25\3\25\3"+
		"\25\7\25\u014d\n\25\f\25\16\25\u0150\13\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\27\5\27\u015a\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u0163\n\30\3\31\3\31\3\32\3\32\3\32\7\32\u016a\n\32\f\32\16\32\u016d"+
		"\13\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\2\3\36\36\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\f\4\2##&&\4\2\30\30\62"+
		"\62\4\2((;;\4\2\t\t\25\26\4\2\24\24\33\33\5\2\f\16\22\23\27\27\4\2\3\3"+
		"\"\"\4\2\31\31\64\64\3\2?C\3\2EF\2\u019a\2:\3\2\2\2\4G\3\2\2\2\6I\3\2"+
		"\2\2\bX\3\2\2\2\nZ\3\2\2\2\fl\3\2\2\2\16o\3\2\2\2\20\u0081\3\2\2\2\22"+
		"\u0084\3\2\2\2\24\u008d\3\2\2\2\26\u0090\3\2\2\2\30\u0099\3\2\2\2\32\u009d"+
		"\3\2\2\2\34\u00aa\3\2\2\2\36\u00f5\3\2\2\2 \u012b\3\2\2\2\"\u012f\3\2"+
		"\2\2$\u0143\3\2\2\2&\u0147\3\2\2\2(\u0149\3\2\2\2*\u0154\3\2\2\2,\u0159"+
		"\3\2\2\2.\u0162\3\2\2\2\60\u0164\3\2\2\2\62\u0166\3\2\2\2\64\u016e\3\2"+
		"\2\2\66\u0170\3\2\2\28\u0172\3\2\2\2:?\5\4\3\2;<\7 \2\2<>\5\4\3\2=;\3"+
		"\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@C\3\2\2\2A?\3\2\2\2BD\7 \2\2CB\3"+
		"\2\2\2CD\3\2\2\2DE\3\2\2\2EF\7\2\2\3F\3\3\2\2\2GH\5\6\4\2H\5\3\2\2\2I"+
		"J\7)\2\2JL\5.\30\2KM\5\b\5\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2O"+
		"\7\3\2\2\2PY\5\n\6\2QY\5\f\7\2RY\5\16\b\2SY\5\20\t\2TY\5\22\n\2UY\5\24"+
		"\13\2VY\5\26\f\2WY\5\32\16\2XP\3\2\2\2XQ\3\2\2\2XR\3\2\2\2XS\3\2\2\2X"+
		"T\3\2\2\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y\t\3\2\2\2Z[\7*\2\2[`\5 \21\2"+
		"\\]\7\b\2\2]_\5 \21\2^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2"+
		"\2b`\3\2\2\2cd\7$\2\2di\5\36\20\2ef\7\b\2\2fh\5\36\20\2ge\3\2\2\2hk\3"+
		"\2\2\2ig\3\2\2\2ij\3\2\2\2j\13\3\2\2\2ki\3\2\2\2lm\7/\2\2mn\7?\2\2n\r"+
		"\3\2\2\2oy\7\60\2\2pq\7.\2\2qv\5,\27\2rs\7\b\2\2su\5,\27\2tr\3\2\2\2u"+
		"x\3\2\2\2vt\3\2\2\2vw\3\2\2\2wz\3\2\2\2xv\3\2\2\2yp\3\2\2\2yz\3\2\2\2"+
		"z{\3\2\2\2{|\5\62\32\2|}\7\5\2\2}~\7\21\2\2~\177\5\6\4\2\177\u0080\7\37"+
		"\2\2\u0080\17\3\2\2\2\u0081\u0082\7\61\2\2\u0082\u0083\5\36\20\2\u0083"+
		"\21\3\2\2\2\u0084\u0085\7\65\2\2\u0085\u008a\5 \21\2\u0086\u0087\7\b\2"+
		"\2\u0087\u0089\5 \21\2\u0088\u0086\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008a\u008b\3\2\2\2\u008b\23\3\2\2\2\u008c\u008a\3\2\2\2\u008d"+
		"\u008e\7\66\2\2\u008e\u008f\7?\2\2\u008f\25\3\2\2\2\u0090\u0091\7\67\2"+
		"\2\u0091\u0096\5\30\r\2\u0092\u0093\7\b\2\2\u0093\u0095\5\30\r\2\u0094"+
		"\u0092\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\27\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009b\5\62\32\2\u009a"+
		"\u009c\t\2\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\31\3\2\2"+
		"\2\u009d\u009e\7<\2\2\u009e\u00a5\5\62\32\2\u009f\u00a1\7=\2\2\u00a0\u00a2"+
		"\5\34\17\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2"+
		"\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u009f\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\33\3\2\2\2\u00a7\u00a8\7-\2\2\u00a8\u00ab\5\62\32\2\u00a9"+
		"\u00ab\7>\2\2\u00aa\u00a7\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\35\3\2\2\2"+
		"\u00ac\u00ad\b\20\1\2\u00ad\u00ae\7\24\2\2\u00ae\u00f6\5\36\20\31\u00af"+
		"\u00b0\t\3\2\2\u00b0\u00f6\5\36\20\30\u00b1\u00b7\79\2\2\u00b2\u00b3\7"+
		"%\2\2\u00b3\u00b4\5\36\20\2\u00b4\u00b5\7:\2\2\u00b5\u00b6\5\36\20\2\u00b6"+
		"\u00b8\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00bc\7\'\2\2\u00bc"+
		"\u00be\5\36\20\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00f6\3"+
		"\2\2\2\u00bf\u00c0\7+\2\2\u00c0\u00c1\5\36\20\2\u00c1\u00c2\7:\2\2\u00c2"+
		"\u00c3\5\36\20\2\u00c3\u00c4\7\'\2\2\u00c4\u00c5\5\36\20\16\u00c5\u00f6"+
		"\3\2\2\2\u00c6\u00c7\7.\2\2\u00c7\u00cc\5,\27\2\u00c8\u00c9\7\b\2\2\u00c9"+
		"\u00cb\5,\27\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d0\7,\2\2\u00d0\u00d1\5\36\20\r\u00d1\u00f6\3\2\2\2\u00d2\u00db\7"+
		"\17\2\2\u00d3\u00d8\5 \21\2\u00d4\u00d5\7\b\2\2\u00d5\u00d7\5 \21\2\u00d6"+
		"\u00d4\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00d3\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00f6\7\35\2\2\u00de\u00e7\7"+
		"\20\2\2\u00df\u00e4\5\36\20\2\u00e0\u00e1\7\b\2\2\u00e1\u00e3\5\36\20"+
		"\2\u00e2\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5"+
		"\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00df\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00f6\7\36\2\2\u00ea\u00eb\7"+
		"\21\2\2\u00eb\u00ec\5\36\20\2\u00ec\u00ed\7\37\2\2\u00ed\u00f6\3\2\2\2"+
		"\u00ee\u00f6\5\"\22\2\u00ef\u00f6\58\35\2\u00f0\u00f6\5\64\33\2\u00f1"+
		"\u00f6\5*\26\2\u00f2\u00f6\7D\2\2\u00f3\u00f6\t\4\2\2\u00f4\u00f6\7\63"+
		"\2\2\u00f5\u00ac\3\2\2\2\u00f5\u00af\3\2\2\2\u00f5\u00b1\3\2\2\2\u00f5"+
		"\u00bf\3\2\2\2\u00f5\u00c6\3\2\2\2\u00f5\u00d2\3\2\2\2\u00f5\u00de\3\2"+
		"\2\2\u00f5\u00ea\3\2\2\2\u00f5\u00ee\3\2\2\2\u00f5\u00ef\3\2\2\2\u00f5"+
		"\u00f0\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f5\u00f3\3\2"+
		"\2\2\u00f5\u00f4\3\2\2\2\u00f6\u0125\3\2\2\2\u00f7\u00f8\f\32\2\2\u00f8"+
		"\u00f9\7\6\2\2\u00f9\u0124\5\36\20\32\u00fa\u00fb\f\27\2\2\u00fb\u00fc"+
		"\t\5\2\2\u00fc\u0124\5\36\20\30\u00fd\u00fe\f\26\2\2\u00fe\u00ff\t\6\2"+
		"\2\u00ff\u0124\5\36\20\27\u0100\u0101\f\25\2\2\u0101\u0102\t\7\2\2\u0102"+
		"\u0124\5\36\20\26\u0103\u0104\f\24\2\2\u0104\u0105\t\b\2\2\u0105\u0124"+
		"\5\36\20\25\u0106\u0107\f\23\2\2\u0107\u0108\t\t\2\2\u0108\u0124\5\36"+
		"\20\24\u0109\u010a\f\21\2\2\u010a\u010b\7\34\2\2\u010b\u0124\5\36\20\22"+
		"\u010c\u010d\f\22\2\2\u010d\u0119\7\20\2\2\u010e\u011a\5\36\20\2\u010f"+
		"\u0110\5\36\20\2\u0110\u0112\7\7\2\2\u0111\u0113\5\36\20\2\u0112\u0111"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u011a\3\2\2\2\u0114\u0116\5\36\20\2"+
		"\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118"+
		"\7\7\2\2\u0118\u011a\5\36\20\2\u0119\u010e\3\2\2\2\u0119\u010f\3\2\2\2"+
		"\u0119\u0115\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\7\36\2\2\u011c\u0124"+
		"\3\2\2\2\u011d\u011e\f\20\2\2\u011e\u0121\7\13\2\2\u011f\u0122\5\64\33"+
		"\2\u0120\u0122\5\"\22\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122"+
		"\u0124\3\2\2\2\u0123\u00f7\3\2\2\2\u0123\u00fa\3\2\2\2\u0123\u00fd\3\2"+
		"\2\2\u0123\u0100\3\2\2\2\u0123\u0103\3\2\2\2\u0123\u0106\3\2\2\2\u0123"+
		"\u0109\3\2\2\2\u0123\u010c\3\2\2\2\u0123\u011d\3\2\2\2\u0124\u0127\3\2"+
		"\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\37\3\2\2\2\u0127\u0125"+
		"\3\2\2\2\u0128\u0129\5\62\32\2\u0129\u012a\7\5\2\2\u012a\u012c\3\2\2\2"+
		"\u012b\u0128\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e"+
		"\5\36\20\2\u012e!\3\2\2\2\u012f\u0130\5\66\34\2\u0130\u0139\7\21\2\2\u0131"+
		"\u0136\5$\23\2\u0132\u0133\7\b\2\2\u0133\u0135\5$\23\2\u0134\u0132\3\2"+
		"\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u0131\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\u013b\3\2\2\2\u013b\u013c\7\37\2\2\u013c#\3\2\2\2\u013d\u0144"+
		"\5\36\20\2\u013e\u0144\5(\25\2\u013f\u0140\5\64\33\2\u0140\u0141\7\5\2"+
		"\2\u0141\u0142\5$\23\2\u0142\u0144\3\2\2\2\u0143\u013d\3\2\2\2\u0143\u013e"+
		"\3\2\2\2\u0143\u013f\3\2\2\2\u0144%\3\2\2\2\u0145\u0148\58\35\2\u0146"+
		"\u0148\7!\2\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148\'\3\2\2\2"+
		"\u0149\u014e\5&\24\2\u014a\u014b\7\b\2\2\u014b\u014d\5&\24\2\u014c\u014a"+
		"\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\7\4\2\2\u0152\u0153\5\36"+
		"\20\2\u0153)\3\2\2\2\u0154\u0155\t\n\2\2\u0155+\3\2\2\2\u0156\u0157\5"+
		"8\35\2\u0157\u0158\7\5\2\2\u0158\u015a\3\2\2\2\u0159\u0156\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\5\36\20\2\u015c-\3\2\2"+
		"\2\u015d\u0163\t\13\2\2\u015e\u015f\5\60\31\2\u015f\u0160\7\13\2\2\u0160"+
		"\u0161\t\13\2\2\u0161\u0163\3\2\2\2\u0162\u015d\3\2\2\2\u0162\u015e\3"+
		"\2\2\2\u0163/\3\2\2\2\u0164\u0165\t\13\2\2\u0165\61\3\2\2\2\u0166\u016b"+
		"\5\64\33\2\u0167\u0168\7\13\2\2\u0168\u016a\5\64\33\2\u0169\u0167\3\2"+
		"\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\63\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u016f\t\13\2\2\u016f\65\3\2\2\2"+
		"\u0170\u0171\7F\2\2\u0171\67\3\2\2\2\u0172\u0173\7\n\2\2\u0173\u0174\t"+
		"\13\2\2\u01749\3\2\2\2\'?CNX`ivy\u008a\u0096\u009b\u00a3\u00a5\u00aa\u00b9"+
		"\u00bd\u00cc\u00d8\u00db\u00e4\u00e7\u00f5\u0112\u0115\u0119\u0121\u0123"+
		"\u0125\u012b\u0136\u0139\u0143\u0147\u014e\u0159\u0162\u016b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}