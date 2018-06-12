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
		RULE_project_stage = 8, RULE_project_item = 9, RULE_skip_stage = 10, RULE_sort_stage = 11, 
		RULE_sort_field = 12, RULE_unwind_stage = 13, RULE_unwind_option = 14, 
		RULE_expression = 15, RULE_field_assignment = 16, RULE_function = 17, 
		RULE_function_argument = 18, RULE_lambda_argument = 19, RULE_lambda_expression = 20, 
		RULE_number = 21, RULE_switch_case = 22, RULE_variable_assignment = 23, 
		RULE_collection_name = 24, RULE_database_name = 25, RULE_field_name = 26, 
		RULE_function_name = 27, RULE_function_argument_name = 28, RULE_multipart_field_name = 29, 
		RULE_id = 30, RULE_variable_name = 31;
	public static final String[] ruleNames = {
		"parse", "statement", "pipeline", "stage", "group_stage", "limit_stage", 
		"lookup_stage", "match_stage", "project_stage", "project_item", "skip_stage", 
		"sort_stage", "sort_field", "unwind_stage", "unwind_option", "expression", 
		"field_assignment", "function", "function_argument", "lambda_argument", 
		"lambda_expression", "number", "switch_case", "variable_assignment", "collection_name", 
		"database_name", "field_name", "function_name", "function_argument_name", 
		"multipart_field_name", "id", "variable_name"
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
			setState(64);
			statement();
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(65);
					match(SEMI);
					setState(66);
					statement();
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(72);
				match(SEMI);
				}
			}

			setState(75);
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
			setState(77);
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
			setState(79);
			match(FROM);
			setState(80);
			collection_name();
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81);
				stage();
				}
				}
				setState(84); 
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
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GROUP:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				group_stage();
				}
				break;
			case LIMIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				limit_stage();
				}
				break;
			case LOOKUP:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				lookup_stage();
				}
				break;
			case MATCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				match_stage();
				}
				break;
			case PROJECT:
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				project_stage();
				}
				break;
			case SKIP_:
				enterOuterAlt(_localctx, 6);
				{
				setState(91);
				skip_stage();
				}
				break;
			case SORT:
				enterOuterAlt(_localctx, 7);
				{
				setState(92);
				sort_stage();
				}
				break;
			case UNWIND:
				enterOuterAlt(_localctx, 8);
				{
				setState(93);
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
			setState(96);
			match(GROUP);
			setState(97);
			field_assignment();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(98);
				match(COMMA);
				setState(99);
				field_assignment();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(BY);
			setState(106);
			expression(0);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(107);
				match(COMMA);
				setState(108);
				expression(0);
				}
				}
				setState(113);
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
			setState(114);
			match(LIMIT);
			setState(115);
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
			setState(117);
			match(LOOKUP);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(118);
				match(LET);
				setState(119);
				variable_assignment();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(120);
					match(COMMA);
					setState(121);
					variable_assignment();
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(129);
			multipart_field_name();
			setState(130);
			match(ASSIGN);
			setState(131);
			match(LPAREN);
			setState(132);
			pipeline();
			setState(133);
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
			setState(135);
			match(MATCH);
			setState(136);
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
			setState(138);
			match(PROJECT);
			setState(139);
			project_item();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(140);
				match(COMMA);
				setState(141);
				project_item();
				}
				}
				setState(146);
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

	public static class Project_itemContext extends ParserRuleContext {
		public Multipart_field_nameContext multipart_field_name() {
			return getRuleContext(Multipart_field_nameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MQLParser.ASSIGN, 0); }
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
		enterRule(_localctx, 18, RULE_project_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			multipart_field_name();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(148);
				match(ASSIGN);
				setState(149);
				expression(0);
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
		enterRule(_localctx, 20, RULE_skip_stage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(SKIP_);
			setState(153);
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
		enterRule(_localctx, 22, RULE_sort_stage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(SORT);
			setState(156);
			sort_field();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(157);
				match(COMMA);
				setState(158);
				sort_field();
				}
				}
				setState(163);
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
		enterRule(_localctx, 24, RULE_sort_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			multipart_field_name();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(165);
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
		enterRule(_localctx, 26, RULE_unwind_stage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(UNWIND);
			setState(169);
			multipart_field_name();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(170);
				match(WITH);
				setState(172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(171);
					unwind_option();
					}
					}
					setState(174); 
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
		enterRule(_localctx, 28, RULE_unwind_option);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDEX:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(INDEX);
				setState(179);
				multipart_field_name();
				}
				break;
			case PRESERVE_NULL_AND_EMPTY:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(184);
				match(MINUS);
				setState(185);
				expression(23);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				_la = _input.LA(1);
				if ( !(_la==NOT_SYMBOL || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(187);
				expression(22);
				}
				break;
			case 3:
				{
				_localctx = new SwitchExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
				match(SWITCH);
				setState(190); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(189);
						switch_case();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(192); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(194);
					match(ELSE);
					setState(195);
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
				setState(198);
				match(IF);
				setState(199);
				expression(0);
				setState(200);
				match(THEN);
				setState(201);
				expression(0);
				setState(202);
				match(ELSE);
				setState(203);
				expression(12);
				}
				break;
			case 5:
				{
				_localctx = new LetExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205);
				match(LET);
				setState(206);
				variable_assignment();
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(207);
					match(COMMA);
					setState(208);
					variable_assignment();
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(214);
				match(IN);
				setState(215);
				expression(11);
				}
				break;
			case 6:
				{
				_localctx = new NewDocumentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				match(LBRACE);
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUOTED_ID || _la==UNQUOTED_ID) {
					{
					setState(218);
					field_assignment();
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(219);
						match(COMMA);
						setState(220);
						field_assignment();
						}
						}
						setState(225);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(228);
				match(RBRACE);
				}
				break;
			case 7:
				{
				_localctx = new NewArrayExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				match(LBRACK);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (DOLLAR - 8)) | (1L << (LBRACE - 8)) | (1L << (LBRACK - 8)) | (1L << (LPAREN - 8)) | (1L << (MINUS - 8)) | (1L << (NOT_SYMBOL - 8)) | (1L << (FALSE - 8)) | (1L << (IF - 8)) | (1L << (LET - 8)) | (1L << (NOT - 8)) | (1L << (NULL - 8)) | (1L << (SWITCH - 8)) | (1L << (TRUE - 8)) | (1L << (INT - 8)) | (1L << (DECIMAL - 8)) | (1L << (LONG - 8)) | (1L << (BIN - 8)) | (1L << (HEX - 8)) | (1L << (STRING - 8)) | (1L << (QUOTED_ID - 8)) | (1L << (UNQUOTED_ID - 8)))) != 0)) {
					{
					setState(230);
					expression(0);
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(231);
						match(COMMA);
						setState(232);
						expression(0);
						}
						}
						setState(237);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(240);
				match(RBRACK);
				}
				break;
			case 8:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(241);
				match(LPAREN);
				setState(242);
				expression(0);
				setState(243);
				match(RPAREN);
				}
				break;
			case 9:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(245);
				function();
				}
				break;
			case 10:
				{
				_localctx = new VariableReferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(246);
				variable_name();
				}
				break;
			case 11:
				{
				_localctx = new FieldExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(247);
				field_name();
				}
				break;
			case 12:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(248);
				number();
				}
				break;
			case 13:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(249);
				match(STRING);
				}
				break;
			case 14:
				{
				_localctx = new BooleanExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(250);
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
				setState(251);
				match(NULL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(302);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(254);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(255);
						match(CARET);
						setState(256);
						expression(24);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(257);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(258);
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
						setState(259);
						expression(20);
						}
						break;
					case 3:
						{
						_localctx = new AdditionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(260);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(261);
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
						setState(262);
						expression(19);
						}
						break;
					case 4:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(263);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(264);
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
						setState(265);
						expression(18);
						}
						break;
					case 5:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(266);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(267);
						_la = _input.LA(1);
						if ( !(_la==AND_SYMBOL || _la==AND) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(268);
						expression(17);
						}
						break;
					case 6:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(269);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(270);
						_la = _input.LA(1);
						if ( !(_la==OR_SYMBOL || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(271);
						expression(16);
						}
						break;
					case 7:
						{
						_localctx = new MemberExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(272);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(273);
						match(DOT);
						setState(276);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
						case 1:
							{
							setState(274);
							field_name();
							}
							break;
						case 2:
							{
							setState(275);
							function();
							}
							break;
						}
						}
						break;
					case 8:
						{
						_localctx = new ArrayAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(278);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(279);
						match(LBRACK);
						setState(291);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
						case 1:
							{
							setState(280);
							((ArrayAccessExpressionContext)_localctx).start = expression(0);
							}
							break;
						case 2:
							{
							setState(281);
							((ArrayAccessExpressionContext)_localctx).start = expression(0);
							setState(282);
							match(COLON);
							setState(284);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (DOLLAR - 8)) | (1L << (LBRACE - 8)) | (1L << (LBRACK - 8)) | (1L << (LPAREN - 8)) | (1L << (MINUS - 8)) | (1L << (NOT_SYMBOL - 8)) | (1L << (FALSE - 8)) | (1L << (IF - 8)) | (1L << (LET - 8)) | (1L << (NOT - 8)) | (1L << (NULL - 8)) | (1L << (SWITCH - 8)) | (1L << (TRUE - 8)) | (1L << (INT - 8)) | (1L << (DECIMAL - 8)) | (1L << (LONG - 8)) | (1L << (BIN - 8)) | (1L << (HEX - 8)) | (1L << (STRING - 8)) | (1L << (QUOTED_ID - 8)) | (1L << (UNQUOTED_ID - 8)))) != 0)) {
								{
								setState(283);
								((ArrayAccessExpressionContext)_localctx).end = expression(0);
								}
							}

							}
							break;
						case 3:
							{
							setState(287);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (DOLLAR - 8)) | (1L << (LBRACE - 8)) | (1L << (LBRACK - 8)) | (1L << (LPAREN - 8)) | (1L << (MINUS - 8)) | (1L << (NOT_SYMBOL - 8)) | (1L << (FALSE - 8)) | (1L << (IF - 8)) | (1L << (LET - 8)) | (1L << (NOT - 8)) | (1L << (NULL - 8)) | (1L << (SWITCH - 8)) | (1L << (TRUE - 8)) | (1L << (INT - 8)) | (1L << (DECIMAL - 8)) | (1L << (LONG - 8)) | (1L << (BIN - 8)) | (1L << (HEX - 8)) | (1L << (STRING - 8)) | (1L << (QUOTED_ID - 8)) | (1L << (UNQUOTED_ID - 8)))) != 0)) {
								{
								setState(286);
								((ArrayAccessExpressionContext)_localctx).start = expression(0);
								}
							}

							setState(289);
							match(COLON);
							setState(290);
							((ArrayAccessExpressionContext)_localctx).end = expression(0);
							}
							break;
						}
						setState(293);
						match(RBRACK);
						}
						break;
					case 9:
						{
						_localctx = new RangeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(295);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(296);
						match(RANGE);
						setState(297);
						expression(0);
						setState(300);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
						case 1:
							{
							setState(298);
							match(STEP);
							setState(299);
							expression(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		public Field_nameContext field_name() {
			return getRuleContext(Field_nameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MQLParser.ASSIGN, 0); }
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
		enterRule(_localctx, 32, RULE_field_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			field_name();
			setState(308);
			match(ASSIGN);
			setState(309);
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
		enterRule(_localctx, 34, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			function_name();
			setState(312);
			match(LPAREN);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (DOLLAR - 8)) | (1L << (LBRACE - 8)) | (1L << (LBRACK - 8)) | (1L << (LPAREN - 8)) | (1L << (MINUS - 8)) | (1L << (NOT_SYMBOL - 8)) | (1L << (UNDERSCORE - 8)) | (1L << (FALSE - 8)) | (1L << (IF - 8)) | (1L << (LET - 8)) | (1L << (NOT - 8)) | (1L << (NULL - 8)) | (1L << (SWITCH - 8)) | (1L << (TRUE - 8)) | (1L << (INT - 8)) | (1L << (DECIMAL - 8)) | (1L << (LONG - 8)) | (1L << (BIN - 8)) | (1L << (HEX - 8)) | (1L << (STRING - 8)) | (1L << (QUOTED_ID - 8)) | (1L << (UNQUOTED_ID - 8)))) != 0)) {
				{
				setState(313);
				function_argument();
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(314);
					match(COMMA);
					setState(315);
					function_argument();
					}
					}
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(323);
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
		public TerminalNode ASSIGN() { return getToken(MQLParser.ASSIGN, 0); }
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
		enterRule(_localctx, 36, RULE_function_argument);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				function_argument_name();
				setState(327);
				match(ASSIGN);
				setState(328);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
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
		enterRule(_localctx, 38, RULE_lambda_argument);
		try {
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				variable_name();
				}
				break;
			case UNDERSCORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
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
		enterRule(_localctx, 40, RULE_lambda_expression);
		int _la;
		try {
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR:
			case UNDERSCORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				lambda_argument();
				setState(338);
				match(ARROW);
				setState(339);
				expression(0);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				match(LPAREN);
				setState(342);
				lambda_argument();
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(343);
					match(COMMA);
					setState(344);
					lambda_argument();
					}
					}
					setState(349);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(350);
				match(RPAREN);
				setState(351);
				match(ARROW);
				setState(352);
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
		enterRule(_localctx, 42, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
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
		enterRule(_localctx, 44, RULE_switch_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(CASE);
			setState(359);
			expression(0);
			setState(360);
			match(THEN);
			setState(361);
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
		enterRule(_localctx, 46, RULE_variable_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			variable_name();
			setState(364);
			match(ASSIGN);
			setState(365);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
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
		enterRule(_localctx, 48, RULE_collection_name);
		try {
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				database_name();
				setState(369);
				match(DOT);
				setState(370);
				id();
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
		enterRule(_localctx, 50, RULE_database_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
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

	public static class Field_nameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Field_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_name; }
	}

	public final Field_nameContext field_name() throws RecognitionException {
		Field_nameContext _localctx = new Field_nameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_field_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			id();
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
			setState(378);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Function_argument_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_argument_name; }
	}

	public final Function_argument_nameContext function_argument_name() throws RecognitionException {
		Function_argument_nameContext _localctx = new Function_argument_nameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_function_argument_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			id();
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
		enterRule(_localctx, 58, RULE_multipart_field_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			field_name();
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(383);
				match(DOT);
				setState(384);
				field_name();
				}
				}
				setState(389);
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
		enterRule(_localctx, 60, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
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

	public static class Variable_nameContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(MQLParser.DOLLAR, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_name; }
	}

	public final Variable_nameContext variable_name() throws RecognitionException {
		Variable_nameContext _localctx = new Variable_nameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(DOLLAR);
			setState(393);
			id();
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
		case 15:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 24);
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
			return precpred(_ctx, 21);
		case 7:
			return precpred(_ctx, 20);
		case 8:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u018e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\5\2L\n\2\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\4\6\4U\n\4\r\4\16\4V\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5a\n\5"+
		"\3\6\3\6\3\6\3\6\7\6g\n\6\f\6\16\6j\13\6\3\6\3\6\3\6\3\6\7\6p\n\6\f\6"+
		"\16\6s\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b}\n\b\f\b\16\b\u0080\13"+
		"\b\5\b\u0082\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7"+
		"\n\u0091\n\n\f\n\16\n\u0094\13\n\3\13\3\13\3\13\5\13\u0099\n\13\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\7\r\u00a2\n\r\f\r\16\r\u00a5\13\r\3\16\3\16\5\16"+
		"\u00a9\n\16\3\17\3\17\3\17\3\17\6\17\u00af\n\17\r\17\16\17\u00b0\5\17"+
		"\u00b3\n\17\3\20\3\20\3\20\5\20\u00b8\n\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\6\21\u00c1\n\21\r\21\16\21\u00c2\3\21\3\21\5\21\u00c7\n\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00d4\n\21"+
		"\f\21\16\21\u00d7\13\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00e0"+
		"\n\21\f\21\16\21\u00e3\13\21\5\21\u00e5\n\21\3\21\3\21\3\21\3\21\3\21"+
		"\7\21\u00ec\n\21\f\21\16\21\u00ef\13\21\5\21\u00f1\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ff\n\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0117\n\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u011f\n\21\3\21\5\21\u0122\n\21\3\21\3\21\5\21\u0126\n\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u012f\n\21\7\21\u0131\n\21\f\21"+
		"\16\21\u0134\13\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23\u013f"+
		"\n\23\f\23\16\23\u0142\13\23\5\23\u0144\n\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u014e\n\24\3\25\3\25\5\25\u0152\n\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\7\26\u015c\n\26\f\26\16\26\u015f\13\26\3"+
		"\26\3\26\3\26\3\26\5\26\u0165\n\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\5\32\u0177\n\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\7\37\u0184\n\37\f\37\16"+
		"\37\u0187\13\37\3 \3 \3!\3!\3!\3!\2\3 \"\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\f\4\2##&&\4\2\30\30\62\62\4\2(("+
		"<<\4\2\t\t\25\26\4\2\24\24\33\33\5\2\f\16\22\23\27\27\4\2\3\3\"\"\4\2"+
		"\31\31\64\64\3\2@D\3\2FG\2\u01af\2B\3\2\2\2\4O\3\2\2\2\6Q\3\2\2\2\b`\3"+
		"\2\2\2\nb\3\2\2\2\ft\3\2\2\2\16w\3\2\2\2\20\u0089\3\2\2\2\22\u008c\3\2"+
		"\2\2\24\u0095\3\2\2\2\26\u009a\3\2\2\2\30\u009d\3\2\2\2\32\u00a6\3\2\2"+
		"\2\34\u00aa\3\2\2\2\36\u00b7\3\2\2\2 \u00fe\3\2\2\2\"\u0135\3\2\2\2$\u0139"+
		"\3\2\2\2&\u014d\3\2\2\2(\u0151\3\2\2\2*\u0164\3\2\2\2,\u0166\3\2\2\2."+
		"\u0168\3\2\2\2\60\u016d\3\2\2\2\62\u0176\3\2\2\2\64\u0178\3\2\2\2\66\u017a"+
		"\3\2\2\28\u017c\3\2\2\2:\u017e\3\2\2\2<\u0180\3\2\2\2>\u0188\3\2\2\2@"+
		"\u018a\3\2\2\2BG\5\4\3\2CD\7 \2\2DF\5\4\3\2EC\3\2\2\2FI\3\2\2\2GE\3\2"+
		"\2\2GH\3\2\2\2HK\3\2\2\2IG\3\2\2\2JL\7 \2\2KJ\3\2\2\2KL\3\2\2\2LM\3\2"+
		"\2\2MN\7\2\2\3N\3\3\2\2\2OP\5\6\4\2P\5\3\2\2\2QR\7)\2\2RT\5\62\32\2SU"+
		"\5\b\5\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\7\3\2\2\2Xa\5\n\6\2"+
		"Ya\5\f\7\2Za\5\16\b\2[a\5\20\t\2\\a\5\22\n\2]a\5\26\f\2^a\5\30\r\2_a\5"+
		"\34\17\2`X\3\2\2\2`Y\3\2\2\2`Z\3\2\2\2`[\3\2\2\2`\\\3\2\2\2`]\3\2\2\2"+
		"`^\3\2\2\2`_\3\2\2\2a\t\3\2\2\2bc\7*\2\2ch\5\"\22\2de\7\b\2\2eg\5\"\22"+
		"\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7$\2"+
		"\2lq\5 \21\2mn\7\b\2\2np\5 \21\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2"+
		"\2r\13\3\2\2\2sq\3\2\2\2tu\7/\2\2uv\7@\2\2v\r\3\2\2\2w\u0081\7\60\2\2"+
		"xy\7.\2\2y~\5\60\31\2z{\7\b\2\2{}\5\60\31\2|z\3\2\2\2}\u0080\3\2\2\2~"+
		"|\3\2\2\2~\177\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0081x\3\2\2\2"+
		"\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\5<\37\2\u0084\u0085"+
		"\7\5\2\2\u0085\u0086\7\21\2\2\u0086\u0087\5\6\4\2\u0087\u0088\7\37\2\2"+
		"\u0088\17\3\2\2\2\u0089\u008a\7\61\2\2\u008a\u008b\5 \21\2\u008b\21\3"+
		"\2\2\2\u008c\u008d\7\65\2\2\u008d\u0092\5\24\13\2\u008e\u008f\7\b\2\2"+
		"\u008f\u0091\5\24\13\2\u0090\u008e\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\23\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
		"\u0098\5<\37\2\u0096\u0097\7\5\2\2\u0097\u0099\5 \21\2\u0098\u0096\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\25\3\2\2\2\u009a\u009b\7\66\2\2\u009b\u009c"+
		"\7@\2\2\u009c\27\3\2\2\2\u009d\u009e\7\67\2\2\u009e\u00a3\5\32\16\2\u009f"+
		"\u00a0\7\b\2\2\u00a0\u00a2\5\32\16\2\u00a1\u009f\3\2\2\2\u00a2\u00a5\3"+
		"\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\31\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00a8\5<\37\2\u00a7\u00a9\t\2\2\2\u00a8\u00a7\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\33\3\2\2\2\u00aa\u00ab\7=\2\2\u00ab\u00b2"+
		"\5<\37\2\u00ac\u00ae\7>\2\2\u00ad\u00af\5\36\20\2\u00ae\u00ad\3\2\2\2"+
		"\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3"+
		"\3\2\2\2\u00b2\u00ac\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\35\3\2\2\2\u00b4"+
		"\u00b5\7-\2\2\u00b5\u00b8\5<\37\2\u00b6\u00b8\7?\2\2\u00b7\u00b4\3\2\2"+
		"\2\u00b7\u00b6\3\2\2\2\u00b8\37\3\2\2\2\u00b9\u00ba\b\21\1\2\u00ba\u00bb"+
		"\7\24\2\2\u00bb\u00ff\5 \21\31\u00bc\u00bd\t\3\2\2\u00bd\u00ff\5 \21\30"+
		"\u00be\u00c0\7:\2\2\u00bf\u00c1\5.\30\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2"+
		"\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c5\7\'\2\2\u00c5\u00c7\5 \21\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00ff\3\2\2\2\u00c8\u00c9\7+\2\2\u00c9\u00ca\5 \21\2\u00ca"+
		"\u00cb\7;\2\2\u00cb\u00cc\5 \21\2\u00cc\u00cd\7\'\2\2\u00cd\u00ce\5 \21"+
		"\16\u00ce\u00ff\3\2\2\2\u00cf\u00d0\7.\2\2\u00d0\u00d5\5\60\31\2\u00d1"+
		"\u00d2\7\b\2\2\u00d2\u00d4\5\60\31\2\u00d3\u00d1\3\2\2\2\u00d4\u00d7\3"+
		"\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00d9\7,\2\2\u00d9\u00da\5 \21\r\u00da\u00ff\3\2"+
		"\2\2\u00db\u00e4\7\17\2\2\u00dc\u00e1\5\"\22\2\u00dd\u00de\7\b\2\2\u00de"+
		"\u00e0\5\"\22\2\u00df\u00dd\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3"+
		"\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4"+
		"\u00dc\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00ff\7\35"+
		"\2\2\u00e7\u00f0\7\20\2\2\u00e8\u00ed\5 \21\2\u00e9\u00ea\7\b\2\2\u00ea"+
		"\u00ec\5 \21\2\u00eb\u00e9\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2"+
		"\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"\u00e8\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00ff\7\36"+
		"\2\2\u00f3\u00f4\7\21\2\2\u00f4\u00f5\5 \21\2\u00f5\u00f6\7\37\2\2\u00f6"+
		"\u00ff\3\2\2\2\u00f7\u00ff\5$\23\2\u00f8\u00ff\5@!\2\u00f9\u00ff\5\66"+
		"\34\2\u00fa\u00ff\5,\27\2\u00fb\u00ff\7E\2\2\u00fc\u00ff\t\4\2\2\u00fd"+
		"\u00ff\7\63\2\2\u00fe\u00b9\3\2\2\2\u00fe\u00bc\3\2\2\2\u00fe\u00be\3"+
		"\2\2\2\u00fe\u00c8\3\2\2\2\u00fe\u00cf\3\2\2\2\u00fe\u00db\3\2\2\2\u00fe"+
		"\u00e7\3\2\2\2\u00fe\u00f3\3\2\2\2\u00fe\u00f7\3\2\2\2\u00fe\u00f8\3\2"+
		"\2\2\u00fe\u00f9\3\2\2\2\u00fe\u00fa\3\2\2\2\u00fe\u00fb\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0132\3\2\2\2\u0100\u0101\f\32"+
		"\2\2\u0101\u0102\7\6\2\2\u0102\u0131\5 \21\32\u0103\u0104\f\25\2\2\u0104"+
		"\u0105\t\5\2\2\u0105\u0131\5 \21\26\u0106\u0107\f\24\2\2\u0107\u0108\t"+
		"\6\2\2\u0108\u0131\5 \21\25\u0109\u010a\f\23\2\2\u010a\u010b\t\7\2\2\u010b"+
		"\u0131\5 \21\24\u010c\u010d\f\22\2\2\u010d\u010e\t\b\2\2\u010e\u0131\5"+
		" \21\23\u010f\u0110\f\21\2\2\u0110\u0111\t\t\2\2\u0111\u0131\5 \21\22"+
		"\u0112\u0113\f\27\2\2\u0113\u0116\7\13\2\2\u0114\u0117\5\66\34\2\u0115"+
		"\u0117\5$\23\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117\u0131\3\2"+
		"\2\2\u0118\u0119\f\26\2\2\u0119\u0125\7\20\2\2\u011a\u0126\5 \21\2\u011b"+
		"\u011c\5 \21\2\u011c\u011e\7\7\2\2\u011d\u011f\5 \21\2\u011e\u011d\3\2"+
		"\2\2\u011e\u011f\3\2\2\2\u011f\u0126\3\2\2\2\u0120\u0122\5 \21\2\u0121"+
		"\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\7\7"+
		"\2\2\u0124\u0126\5 \21\2\u0125\u011a\3\2\2\2\u0125\u011b\3\2\2\2\u0125"+
		"\u0121\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\7\36\2\2\u0128\u0131\3"+
		"\2\2\2\u0129\u012a\f\20\2\2\u012a\u012b\7\34\2\2\u012b\u012e\5 \21\2\u012c"+
		"\u012d\79\2\2\u012d\u012f\5 \21\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\u0131\3\2\2\2\u0130\u0100\3\2\2\2\u0130\u0103\3\2\2\2\u0130"+
		"\u0106\3\2\2\2\u0130\u0109\3\2\2\2\u0130\u010c\3\2\2\2\u0130\u010f\3\2"+
		"\2\2\u0130\u0112\3\2\2\2\u0130\u0118\3\2\2\2\u0130\u0129\3\2\2\2\u0131"+
		"\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133!\3\2\2\2"+
		"\u0134\u0132\3\2\2\2\u0135\u0136\5\66\34\2\u0136\u0137\7\5\2\2\u0137\u0138"+
		"\5 \21\2\u0138#\3\2\2\2\u0139\u013a\58\35\2\u013a\u0143\7\21\2\2\u013b"+
		"\u0140\5&\24\2\u013c\u013d\7\b\2\2\u013d\u013f\5&\24\2\u013e\u013c\3\2"+
		"\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u013b\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144\u0145\3\2\2\2\u0145\u0146\7\37\2\2\u0146%\3\2\2\2\u0147\u014e"+
		"\5 \21\2\u0148\u0149\5:\36\2\u0149\u014a\7\5\2\2\u014a\u014b\5 \21\2\u014b"+
		"\u014e\3\2\2\2\u014c\u014e\5*\26\2\u014d\u0147\3\2\2\2\u014d\u0148\3\2"+
		"\2\2\u014d\u014c\3\2\2\2\u014e\'\3\2\2\2\u014f\u0152\5@!\2\u0150\u0152"+
		"\7!\2\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152)\3\2\2\2\u0153\u0154"+
		"\5(\25\2\u0154\u0155\7\4\2\2\u0155\u0156\5 \21\2\u0156\u0165\3\2\2\2\u0157"+
		"\u0158\7\21\2\2\u0158\u015d\5(\25\2\u0159\u015a\7\b\2\2\u015a\u015c\5"+
		"(\25\2\u015b\u0159\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\7\37"+
		"\2\2\u0161\u0162\7\4\2\2\u0162\u0163\5 \21\2\u0163\u0165\3\2\2\2\u0164"+
		"\u0153\3\2\2\2\u0164\u0157\3\2\2\2\u0165+\3\2\2\2\u0166\u0167\t\n\2\2"+
		"\u0167-\3\2\2\2\u0168\u0169\7%\2\2\u0169\u016a\5 \21\2\u016a\u016b\7;"+
		"\2\2\u016b\u016c\5 \21\2\u016c/\3\2\2\2\u016d\u016e\5@!\2\u016e\u016f"+
		"\7\5\2\2\u016f\u0170\5 \21\2\u0170\61\3\2\2\2\u0171\u0177\5> \2\u0172"+
		"\u0173\5\64\33\2\u0173\u0174\7\13\2\2\u0174\u0175\5> \2\u0175\u0177\3"+
		"\2\2\2\u0176\u0171\3\2\2\2\u0176\u0172\3\2\2\2\u0177\63\3\2\2\2\u0178"+
		"\u0179\t\13\2\2\u0179\65\3\2\2\2\u017a\u017b\5> \2\u017b\67\3\2\2\2\u017c"+
		"\u017d\7G\2\2\u017d9\3\2\2\2\u017e\u017f\5> \2\u017f;\3\2\2\2\u0180\u0185"+
		"\5\66\34\2\u0181\u0182\7\13\2\2\u0182\u0184\5\66\34\2\u0183\u0181\3\2"+
		"\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"=\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u0189\t\13\2\2\u0189?\3\2\2\2\u018a"+
		"\u018b\7\n\2\2\u018b\u018c\5> \2\u018cA\3\2\2\2(GKV`hq~\u0081\u0092\u0098"+
		"\u00a3\u00a8\u00b0\u00b2\u00b7\u00c2\u00c6\u00d5\u00e1\u00e4\u00ed\u00f0"+
		"\u00fe\u0116\u011e\u0121\u0125\u012e\u0130\u0132\u0140\u0143\u014d\u0151"+
		"\u015d\u0164\u0176\u0185";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}