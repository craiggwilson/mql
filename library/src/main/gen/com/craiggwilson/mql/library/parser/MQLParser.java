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
		NULL=47, OR=48, PROJECT=49, SKIP_=50, SORT=51, STARTING=52, STEP=53, SWITCH=54, 
		THEN=55, TRUE=56, UNWIND=57, WITH=58, PRESERVE_NULL_AND_EMPTY=59, INT=60, 
		DECIMAL=61, LONG=62, BIN=63, HEX=64, DQ_STRING=65, UNQUOTED_ID=66, VARIABLE_ID=67, 
		WS=68;
	public static final int
		RULE_parse = 0, RULE_statement = 1, RULE_pipeline = 2, RULE_stage = 3, 
		RULE_group_stage = 4, RULE_limit_stage = 5, RULE_lookup_stage = 6, RULE_match_stage = 7, 
		RULE_project_stage = 8, RULE_project_item = 9, RULE_skip_stage = 10, RULE_sort_stage = 11, 
		RULE_sort_field = 12, RULE_unwind_stage = 13, RULE_unwind_option = 14, 
		RULE_expression = 15, RULE_field_assignment = 16, RULE_function = 17, 
		RULE_function_argument = 18, RULE_lambda_argument = 19, RULE_lambda_expression = 20, 
		RULE_number = 21, RULE_switch_case = 22, RULE_variable_assignment = 23, 
		RULE_collection_name = 24, RULE_database_name = 25, RULE_field_declaration = 26, 
		RULE_multipart_field_declaration = 27, RULE_field_name = 28, RULE_function_name = 29, 
		RULE_function_argument_name = 30, RULE_multipart_field_name = 31, RULE_variable_name = 32;
	public static final String[] ruleNames = {
		"parse", "statement", "pipeline", "stage", "group_stage", "limit_stage", 
		"lookup_stage", "match_stage", "project_stage", "project_item", "skip_stage", 
		"sort_stage", "sort_field", "unwind_stage", "unwind_option", "expression", 
		"field_assignment", "function", "function_argument", "lambda_argument", 
		"lambda_expression", "number", "switch_case", "variable_assignment", "collection_name", 
		"database_name", "field_declaration", "multipart_field_declaration", "field_name", 
		"function_name", "function_argument_name", "multipart_field_name", "variable_name"
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
		"SORT", "STARTING", "STEP", "SWITCH", "THEN", "TRUE", "UNWIND", "WITH", 
		"PRESERVE_NULL_AND_EMPTY", "INT", "DECIMAL", "LONG", "BIN", "HEX", "DQ_STRING", 
		"UNQUOTED_ID", "VARIABLE_ID", "WS"
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
			setState(66);
			statement();
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(67);
					match(SEMI);
					setState(68);
					statement();
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(74);
				match(SEMI);
				}
			}

			setState(77);
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
			setState(79);
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
			setState(81);
			match(FROM);
			setState(82);
			collection_name();
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83);
				stage();
				}
				}
				setState(86); 
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
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GROUP:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				group_stage();
				}
				break;
			case LIMIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				limit_stage();
				}
				break;
			case LOOKUP:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				lookup_stage();
				}
				break;
			case MATCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				match_stage();
				}
				break;
			case PROJECT:
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				project_stage();
				}
				break;
			case SKIP_:
				enterOuterAlt(_localctx, 6);
				{
				setState(93);
				skip_stage();
				}
				break;
			case SORT:
				enterOuterAlt(_localctx, 7);
				{
				setState(94);
				sort_stage();
				}
				break;
			case UNWIND:
				enterOuterAlt(_localctx, 8);
				{
				setState(95);
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
			setState(98);
			match(GROUP);
			setState(99);
			field_assignment();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(100);
				match(COMMA);
				setState(101);
				field_assignment();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(BY);
			setState(108);
			expression(0);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(109);
				match(COMMA);
				setState(110);
				expression(0);
				}
				}
				setState(115);
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
			setState(116);
			match(LIMIT);
			setState(117);
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
			setState(119);
			match(LOOKUP);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(120);
				match(LET);
				setState(121);
				variable_assignment();
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(122);
					match(COMMA);
					setState(123);
					variable_assignment();
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(131);
			multipart_field_declaration();
			setState(132);
			match(COLON);
			setState(133);
			match(LPAREN);
			setState(134);
			pipeline();
			setState(135);
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
			setState(137);
			match(MATCH);
			setState(138);
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
			setState(140);
			match(PROJECT);
			setState(141);
			project_item();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(142);
				match(COMMA);
				setState(143);
				project_item();
				}
				}
				setState(148);
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
		public Multipart_field_declarationContext multipart_field_declaration() {
			return getRuleContext(Multipart_field_declarationContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_project_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			multipart_field_declaration();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(150);
				match(COLON);
				setState(151);
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
			setState(154);
			match(SKIP_);
			setState(155);
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
			setState(157);
			match(SORT);
			setState(158);
			sort_field();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(159);
				match(COMMA);
				setState(160);
				sort_field();
				}
				}
				setState(165);
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
			setState(166);
			multipart_field_name();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(167);
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
			setState(170);
			match(UNWIND);
			setState(171);
			multipart_field_name();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(172);
				match(WITH);
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(173);
					unwind_option();
					}
					}
					setState(176); 
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
		enterRule(_localctx, 28, RULE_unwind_option);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDEX:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(INDEX);
				setState(181);
				multipart_field_declaration();
				}
				break;
			case PRESERVE_NULL_AND_EMPTY:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(186);
				match(MINUS);
				setState(187);
				expression(24);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
				_la = _input.LA(1);
				if ( !(_la==NOT_SYMBOL || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(189);
				expression(23);
				}
				break;
			case 3:
				{
				_localctx = new SwitchExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				match(SWITCH);
				setState(192); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(191);
						switch_case();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(194); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(198);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(196);
					match(ELSE);
					setState(197);
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
				setState(200);
				match(IF);
				setState(201);
				expression(0);
				setState(202);
				match(THEN);
				setState(203);
				expression(0);
				setState(204);
				match(ELSE);
				setState(205);
				expression(12);
				}
				break;
			case 5:
				{
				_localctx = new LetExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				match(LET);
				setState(208);
				variable_assignment();
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(209);
					match(COMMA);
					setState(210);
					variable_assignment();
					}
					}
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(216);
				match(ARROW);
				setState(217);
				expression(11);
				}
				break;
			case 6:
				{
				_localctx = new NewDocumentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(LBRACE);
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DQ_STRING || _la==UNQUOTED_ID) {
					{
					setState(220);
					field_assignment();
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(221);
						match(COMMA);
						setState(222);
						field_assignment();
						}
						}
						setState(227);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(230);
				match(RBRACE);
				}
				break;
			case 7:
				{
				_localctx = new NewArrayExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(231);
				match(LBRACK);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (LBRACE - 11)) | (1L << (LBRACK - 11)) | (1L << (LPAREN - 11)) | (1L << (MINUS - 11)) | (1L << (NOT_SYMBOL - 11)) | (1L << (FALSE - 11)) | (1L << (IF - 11)) | (1L << (LET - 11)) | (1L << (NOT - 11)) | (1L << (NULL - 11)) | (1L << (SWITCH - 11)) | (1L << (TRUE - 11)) | (1L << (INT - 11)) | (1L << (DECIMAL - 11)) | (1L << (LONG - 11)) | (1L << (BIN - 11)) | (1L << (HEX - 11)) | (1L << (DQ_STRING - 11)) | (1L << (UNQUOTED_ID - 11)) | (1L << (VARIABLE_ID - 11)))) != 0)) {
					{
					setState(232);
					expression(0);
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(233);
						match(COMMA);
						setState(234);
						expression(0);
						}
						}
						setState(239);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(242);
				match(RBRACK);
				}
				break;
			case 8:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243);
				match(LPAREN);
				setState(244);
				expression(0);
				setState(245);
				match(RPAREN);
				}
				break;
			case 9:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(247);
				function();
				}
				break;
			case 10:
				{
				_localctx = new VariableReferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(248);
				variable_name();
				}
				break;
			case 11:
				{
				_localctx = new FieldExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(249);
				field_name();
				}
				break;
			case 12:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(250);
				number();
				}
				break;
			case 13:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251);
				match(DQ_STRING);
				}
				break;
			case 14:
				{
				_localctx = new BooleanExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(252);
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
				setState(253);
				match(NULL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(310);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(256);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(257);
						match(CARET);
						setState(258);
						expression(25);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(259);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(260);
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
						setState(261);
						expression(20);
						}
						break;
					case 3:
						{
						_localctx = new AdditionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(262);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(263);
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
						setState(264);
						expression(19);
						}
						break;
					case 4:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(265);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(266);
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
						setState(267);
						expression(18);
						}
						break;
					case 5:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(268);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(269);
						_la = _input.LA(1);
						if ( !(_la==AND_SYMBOL || _la==AND) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(270);
						expression(17);
						}
						break;
					case 6:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(271);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(272);
						_la = _input.LA(1);
						if ( !(_la==OR_SYMBOL || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(273);
						expression(16);
						}
						break;
					case 7:
						{
						_localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(274);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(276);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(275);
							match(NOT);
							}
						}

						setState(278);
						match(IN);
						setState(279);
						expression(15);
						}
						break;
					case 8:
						{
						_localctx = new MemberExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(280);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(281);
						match(DOT);
						setState(284);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
						case 1:
							{
							setState(282);
							field_name();
							}
							break;
						case 2:
							{
							setState(283);
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
						setState(286);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(287);
						match(LBRACK);
						setState(299);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
						case 1:
							{
							setState(288);
							((ArrayAccessExpressionContext)_localctx).start = expression(0);
							}
							break;
						case 2:
							{
							setState(289);
							((ArrayAccessExpressionContext)_localctx).start = expression(0);
							setState(290);
							match(COLON);
							setState(292);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (LBRACE - 11)) | (1L << (LBRACK - 11)) | (1L << (LPAREN - 11)) | (1L << (MINUS - 11)) | (1L << (NOT_SYMBOL - 11)) | (1L << (FALSE - 11)) | (1L << (IF - 11)) | (1L << (LET - 11)) | (1L << (NOT - 11)) | (1L << (NULL - 11)) | (1L << (SWITCH - 11)) | (1L << (TRUE - 11)) | (1L << (INT - 11)) | (1L << (DECIMAL - 11)) | (1L << (LONG - 11)) | (1L << (BIN - 11)) | (1L << (HEX - 11)) | (1L << (DQ_STRING - 11)) | (1L << (UNQUOTED_ID - 11)) | (1L << (VARIABLE_ID - 11)))) != 0)) {
								{
								setState(291);
								((ArrayAccessExpressionContext)_localctx).end = expression(0);
								}
							}

							}
							break;
						case 3:
							{
							setState(295);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (LBRACE - 11)) | (1L << (LBRACK - 11)) | (1L << (LPAREN - 11)) | (1L << (MINUS - 11)) | (1L << (NOT_SYMBOL - 11)) | (1L << (FALSE - 11)) | (1L << (IF - 11)) | (1L << (LET - 11)) | (1L << (NOT - 11)) | (1L << (NULL - 11)) | (1L << (SWITCH - 11)) | (1L << (TRUE - 11)) | (1L << (INT - 11)) | (1L << (DECIMAL - 11)) | (1L << (LONG - 11)) | (1L << (BIN - 11)) | (1L << (HEX - 11)) | (1L << (DQ_STRING - 11)) | (1L << (UNQUOTED_ID - 11)) | (1L << (VARIABLE_ID - 11)))) != 0)) {
								{
								setState(294);
								((ArrayAccessExpressionContext)_localctx).start = expression(0);
								}
							}

							setState(297);
							match(COLON);
							setState(298);
							((ArrayAccessExpressionContext)_localctx).end = expression(0);
							}
							break;
						}
						setState(301);
						match(RBRACK);
						}
						break;
					case 10:
						{
						_localctx = new RangeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(303);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(304);
						match(RANGE);
						setState(305);
						expression(0);
						setState(308);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
						case 1:
							{
							setState(306);
							match(STEP);
							setState(307);
							expression(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 32, RULE_field_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			field_declaration();
			setState(316);
			match(COLON);
			setState(317);
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
			setState(319);
			function_name();
			setState(320);
			match(LPAREN);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (LBRACE - 11)) | (1L << (LBRACK - 11)) | (1L << (LPAREN - 11)) | (1L << (MINUS - 11)) | (1L << (NOT_SYMBOL - 11)) | (1L << (UNDERSCORE - 11)) | (1L << (FALSE - 11)) | (1L << (IF - 11)) | (1L << (LET - 11)) | (1L << (NOT - 11)) | (1L << (NULL - 11)) | (1L << (SWITCH - 11)) | (1L << (TRUE - 11)) | (1L << (INT - 11)) | (1L << (DECIMAL - 11)) | (1L << (LONG - 11)) | (1L << (BIN - 11)) | (1L << (HEX - 11)) | (1L << (DQ_STRING - 11)) | (1L << (UNQUOTED_ID - 11)) | (1L << (VARIABLE_ID - 11)))) != 0)) {
				{
				setState(321);
				function_argument();
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(322);
					match(COMMA);
					setState(323);
					function_argument();
					}
					}
					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(331);
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
		enterRule(_localctx, 36, RULE_function_argument);
		try {
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				function_argument_name();
				setState(335);
				match(COLON);
				setState(336);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
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
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				variable_name();
				}
				break;
			case UNDERSCORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
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
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNDERSCORE:
			case VARIABLE_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				lambda_argument();
				setState(346);
				match(ARROW);
				setState(347);
				expression(0);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				match(LPAREN);
				setState(350);
				lambda_argument();
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(351);
					match(COMMA);
					setState(352);
					lambda_argument();
					}
					}
					setState(357);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(358);
				match(RPAREN);
				setState(359);
				match(ARROW);
				setState(360);
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
			setState(364);
			_la = _input.LA(1);
			if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (INT - 60)) | (1L << (DECIMAL - 60)) | (1L << (LONG - 60)) | (1L << (BIN - 60)) | (1L << (HEX - 60)))) != 0)) ) {
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
			setState(366);
			match(CASE);
			setState(367);
			expression(0);
			setState(368);
			match(THEN);
			setState(369);
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
		enterRule(_localctx, 46, RULE_variable_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			variable_name();
			setState(372);
			match(COLON);
			setState(373);
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
		enterRule(_localctx, 48, RULE_collection_name);
		try {
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(UNQUOTED_ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				database_name();
				setState(377);
				match(DOT);
				setState(378);
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
		enterRule(_localctx, 50, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
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
		enterRule(_localctx, 52, RULE_field_declaration);
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DQ_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				match(DQ_STRING);
				}
				break;
			case UNQUOTED_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
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
		enterRule(_localctx, 54, RULE_multipart_field_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			field_declaration();
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(389);
				match(DOT);
				setState(390);
				field_declaration();
				}
				}
				setState(395);
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
		enterRule(_localctx, 56, RULE_field_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
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
		enterRule(_localctx, 58, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
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
		enterRule(_localctx, 60, RULE_function_argument_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
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
		enterRule(_localctx, 62, RULE_multipart_field_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			field_name();
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(403);
				match(DOT);
				setState(404);
				field_name();
				}
				}
				setState(409);
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
		enterRule(_localctx, 64, RULE_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
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
		case 15:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3F\u019f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\5\2N\n\2\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\6\4W\n\4\r\4\16\4X\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5c\n\5\3\6\3\6\3\6\3\6\7\6i\n\6\f\6\16\6l\13\6\3\6\3\6\3\6\3\6\7\6"+
		"r\n\6\f\6\16\6u\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b\177\n\b\f\b\16"+
		"\b\u0082\13\b\5\b\u0084\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\7\n\u0093\n\n\f\n\16\n\u0096\13\n\3\13\3\13\3\13\5\13\u009b"+
		"\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u00a4\n\r\f\r\16\r\u00a7\13\r\3"+
		"\16\3\16\5\16\u00ab\n\16\3\17\3\17\3\17\3\17\6\17\u00b1\n\17\r\17\16\17"+
		"\u00b2\5\17\u00b5\n\17\3\20\3\20\3\20\5\20\u00ba\n\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\6\21\u00c3\n\21\r\21\16\21\u00c4\3\21\3\21\5\21\u00c9"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00d6"+
		"\n\21\f\21\16\21\u00d9\13\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00e2"+
		"\n\21\f\21\16\21\u00e5\13\21\5\21\u00e7\n\21\3\21\3\21\3\21\3\21\3\21"+
		"\7\21\u00ee\n\21\f\21\16\21\u00f1\13\21\5\21\u00f3\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0101\n\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u0117\n\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u011f\n\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0127\n\21\3\21\5\21\u012a"+
		"\n\21\3\21\3\21\5\21\u012e\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u0137\n\21\7\21\u0139\n\21\f\21\16\21\u013c\13\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\7\23\u0147\n\23\f\23\16\23\u014a\13\23\5\23"+
		"\u014c\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0156\n\24\3"+
		"\25\3\25\5\25\u015a\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26"+
		"\u0164\n\26\f\26\16\26\u0167\13\26\3\26\3\26\3\26\3\26\5\26\u016d\n\26"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u017f\n\32\3\33\3\33\3\34\3\34\5\34\u0185\n\34\3\35\3"+
		"\35\3\35\7\35\u018a\n\35\f\35\16\35\u018d\13\35\3\36\3\36\3\37\3\37\3"+
		" \3 \3!\3!\3!\7!\u0198\n!\f!\16!\u019b\13!\3\"\3\"\3\"\2\3 #\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\13\4\2!!$$"+
		"\4\2\26\26\60\60\4\2&&::\4\2\b\b\23\24\4\2\22\22\31\31\5\2\n\f\20\21\25"+
		"\25\4\2\3\3  \4\2\27\27\62\62\3\2>B\2\u01c3\2D\3\2\2\2\4Q\3\2\2\2\6S\3"+
		"\2\2\2\bb\3\2\2\2\nd\3\2\2\2\fv\3\2\2\2\16y\3\2\2\2\20\u008b\3\2\2\2\22"+
		"\u008e\3\2\2\2\24\u0097\3\2\2\2\26\u009c\3\2\2\2\30\u009f\3\2\2\2\32\u00a8"+
		"\3\2\2\2\34\u00ac\3\2\2\2\36\u00b9\3\2\2\2 \u0100\3\2\2\2\"\u013d\3\2"+
		"\2\2$\u0141\3\2\2\2&\u0155\3\2\2\2(\u0159\3\2\2\2*\u016c\3\2\2\2,\u016e"+
		"\3\2\2\2.\u0170\3\2\2\2\60\u0175\3\2\2\2\62\u017e\3\2\2\2\64\u0180\3\2"+
		"\2\2\66\u0184\3\2\2\28\u0186\3\2\2\2:\u018e\3\2\2\2<\u0190\3\2\2\2>\u0192"+
		"\3\2\2\2@\u0194\3\2\2\2B\u019c\3\2\2\2DI\5\4\3\2EF\7\36\2\2FH\5\4\3\2"+
		"GE\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JM\3\2\2\2KI\3\2\2\2LN\7\36\2"+
		"\2ML\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\7\2\2\3P\3\3\2\2\2QR\5\6\4\2R\5\3\2"+
		"\2\2ST\7\'\2\2TV\5\62\32\2UW\5\b\5\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3"+
		"\2\2\2Y\7\3\2\2\2Zc\5\n\6\2[c\5\f\7\2\\c\5\16\b\2]c\5\20\t\2^c\5\22\n"+
		"\2_c\5\26\f\2`c\5\30\r\2ac\5\34\17\2bZ\3\2\2\2b[\3\2\2\2b\\\3\2\2\2b]"+
		"\3\2\2\2b^\3\2\2\2b_\3\2\2\2b`\3\2\2\2ba\3\2\2\2c\t\3\2\2\2de\7(\2\2e"+
		"j\5\"\22\2fg\7\7\2\2gi\5\"\22\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2"+
		"\2km\3\2\2\2lj\3\2\2\2mn\7\"\2\2ns\5 \21\2op\7\7\2\2pr\5 \21\2qo\3\2\2"+
		"\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\13\3\2\2\2us\3\2\2\2vw\7-\2\2wx\7>\2"+
		"\2x\r\3\2\2\2y\u0083\7.\2\2z{\7,\2\2{\u0080\5\60\31\2|}\7\7\2\2}\177\5"+
		"\60\31\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2"+
		"\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0083z\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\58\35\2\u0086\u0087\7\6\2\2\u0087"+
		"\u0088\7\17\2\2\u0088\u0089\5\6\4\2\u0089\u008a\7\35\2\2\u008a\17\3\2"+
		"\2\2\u008b\u008c\7/\2\2\u008c\u008d\5 \21\2\u008d\21\3\2\2\2\u008e\u008f"+
		"\7\63\2\2\u008f\u0094\5\24\13\2\u0090\u0091\7\7\2\2\u0091\u0093\5\24\13"+
		"\2\u0092\u0090\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\23\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u009a\58\35\2\u0098"+
		"\u0099\7\6\2\2\u0099\u009b\5 \21\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\25\3\2\2\2\u009c\u009d\7\64\2\2\u009d\u009e\7>\2\2\u009e\27"+
		"\3\2\2\2\u009f\u00a0\7\65\2\2\u00a0\u00a5\5\32\16\2\u00a1\u00a2\7\7\2"+
		"\2\u00a2\u00a4\5\32\16\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\31\3\2\2\2\u00a7\u00a5\3\2\2"+
		"\2\u00a8\u00aa\5@!\2\u00a9\u00ab\t\2\2\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab\33\3\2\2\2\u00ac\u00ad\7;\2\2\u00ad\u00b4\5@!\2\u00ae\u00b0"+
		"\7<\2\2\u00af\u00b1\5\36\20\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2"+
		"\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00ae"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\35\3\2\2\2\u00b6\u00b7\7+\2\2\u00b7"+
		"\u00ba\58\35\2\u00b8\u00ba\7=\2\2\u00b9\u00b6\3\2\2\2\u00b9\u00b8\3\2"+
		"\2\2\u00ba\37\3\2\2\2\u00bb\u00bc\b\21\1\2\u00bc\u00bd\7\22\2\2\u00bd"+
		"\u0101\5 \21\32\u00be\u00bf\t\3\2\2\u00bf\u0101\5 \21\31\u00c0\u00c2\7"+
		"8\2\2\u00c1\u00c3\5.\30\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c7\7%"+
		"\2\2\u00c7\u00c9\5 \21\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u0101\3\2\2\2\u00ca\u00cb\7)\2\2\u00cb\u00cc\5 \21\2\u00cc\u00cd\79\2"+
		"\2\u00cd\u00ce\5 \21\2\u00ce\u00cf\7%\2\2\u00cf\u00d0\5 \21\16\u00d0\u0101"+
		"\3\2\2\2\u00d1\u00d2\7,\2\2\u00d2\u00d7\5\60\31\2\u00d3\u00d4\7\7\2\2"+
		"\u00d4\u00d6\5\60\31\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5"+
		"\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\u00db\7\4\2\2\u00db\u00dc\5 \21\r\u00dc\u0101\3\2\2\2\u00dd\u00e6\7\r"+
		"\2\2\u00de\u00e3\5\"\22\2\u00df\u00e0\7\7\2\2\u00e0\u00e2\5\"\22\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00de\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u0101\7\33\2\2\u00e9\u00f2\7"+
		"\16\2\2\u00ea\u00ef\5 \21\2\u00eb\u00ec\7\7\2\2\u00ec\u00ee\5 \21\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00ea\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u0101\7\34\2\2\u00f5\u00f6\7"+
		"\17\2\2\u00f6\u00f7\5 \21\2\u00f7\u00f8\7\35\2\2\u00f8\u0101\3\2\2\2\u00f9"+
		"\u0101\5$\23\2\u00fa\u0101\5B\"\2\u00fb\u0101\5:\36\2\u00fc\u0101\5,\27"+
		"\2\u00fd\u0101\7C\2\2\u00fe\u0101\t\4\2\2\u00ff\u0101\7\61\2\2\u0100\u00bb"+
		"\3\2\2\2\u0100\u00be\3\2\2\2\u0100\u00c0\3\2\2\2\u0100\u00ca\3\2\2\2\u0100"+
		"\u00d1\3\2\2\2\u0100\u00dd\3\2\2\2\u0100\u00e9\3\2\2\2\u0100\u00f5\3\2"+
		"\2\2\u0100\u00f9\3\2\2\2\u0100\u00fa\3\2\2\2\u0100\u00fb\3\2\2\2\u0100"+
		"\u00fc\3\2\2\2\u0100\u00fd\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2"+
		"\2\2\u0101\u013a\3\2\2\2\u0102\u0103\f\33\2\2\u0103\u0104\7\5\2\2\u0104"+
		"\u0139\5 \21\33\u0105\u0106\f\25\2\2\u0106\u0107\t\5\2\2\u0107\u0139\5"+
		" \21\26\u0108\u0109\f\24\2\2\u0109\u010a\t\6\2\2\u010a\u0139\5 \21\25"+
		"\u010b\u010c\f\23\2\2\u010c\u010d\t\7\2\2\u010d\u0139\5 \21\24\u010e\u010f"+
		"\f\22\2\2\u010f\u0110\t\b\2\2\u0110\u0139\5 \21\23\u0111\u0112\f\21\2"+
		"\2\u0112\u0113\t\t\2\2\u0113\u0139\5 \21\22\u0114\u0116\f\20\2\2\u0115"+
		"\u0117\7\60\2\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3"+
		"\2\2\2\u0118\u0119\7*\2\2\u0119\u0139\5 \21\21\u011a\u011b\f\30\2\2\u011b"+
		"\u011e\7\t\2\2\u011c\u011f\5:\36\2\u011d\u011f\5$\23\2\u011e\u011c\3\2"+
		"\2\2\u011e\u011d\3\2\2\2\u011f\u0139\3\2\2\2\u0120\u0121\f\27\2\2\u0121"+
		"\u012d\7\16\2\2\u0122\u012e\5 \21\2\u0123\u0124\5 \21\2\u0124\u0126\7"+
		"\6\2\2\u0125\u0127\5 \21\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u012e\3\2\2\2\u0128\u012a\5 \21\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b\u012c\7\6\2\2\u012c\u012e\5 \21\2\u012d"+
		"\u0122\3\2\2\2\u012d\u0123\3\2\2\2\u012d\u0129\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\u0130\7\34\2\2\u0130\u0139\3\2\2\2\u0131\u0132\f\26\2\2\u0132"+
		"\u0133\7\32\2\2\u0133\u0136\5 \21\2\u0134\u0135\7\67\2\2\u0135\u0137\5"+
		" \21\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138"+
		"\u0102\3\2\2\2\u0138\u0105\3\2\2\2\u0138\u0108\3\2\2\2\u0138\u010b\3\2"+
		"\2\2\u0138\u010e\3\2\2\2\u0138\u0111\3\2\2\2\u0138\u0114\3\2\2\2\u0138"+
		"\u011a\3\2\2\2\u0138\u0120\3\2\2\2\u0138\u0131\3\2\2\2\u0139\u013c\3\2"+
		"\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b!\3\2\2\2\u013c\u013a"+
		"\3\2\2\2\u013d\u013e\5\66\34\2\u013e\u013f\7\6\2\2\u013f\u0140\5 \21\2"+
		"\u0140#\3\2\2\2\u0141\u0142\5<\37\2\u0142\u014b\7\17\2\2\u0143\u0148\5"+
		"&\24\2\u0144\u0145\7\7\2\2\u0145\u0147\5&\24\2\u0146\u0144\3\2\2\2\u0147"+
		"\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014c\3\2"+
		"\2\2\u014a\u0148\3\2\2\2\u014b\u0143\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014e\7\35\2\2\u014e%\3\2\2\2\u014f\u0156\5 \21\2"+
		"\u0150\u0151\5> \2\u0151\u0152\7\6\2\2\u0152\u0153\5 \21\2\u0153\u0156"+
		"\3\2\2\2\u0154\u0156\5*\26\2\u0155\u014f\3\2\2\2\u0155\u0150\3\2\2\2\u0155"+
		"\u0154\3\2\2\2\u0156\'\3\2\2\2\u0157\u015a\5B\"\2\u0158\u015a\7\37\2\2"+
		"\u0159\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015a)\3\2\2\2\u015b\u015c\5"+
		"(\25\2\u015c\u015d\7\4\2\2\u015d\u015e\5 \21\2\u015e\u016d\3\2\2\2\u015f"+
		"\u0160\7\17\2\2\u0160\u0165\5(\25\2\u0161\u0162\7\7\2\2\u0162\u0164\5"+
		"(\25\2\u0163\u0161\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u0169\7\35"+
		"\2\2\u0169\u016a\7\4\2\2\u016a\u016b\5 \21\2\u016b\u016d\3\2\2\2\u016c"+
		"\u015b\3\2\2\2\u016c\u015f\3\2\2\2\u016d+\3\2\2\2\u016e\u016f\t\n\2\2"+
		"\u016f-\3\2\2\2\u0170\u0171\7#\2\2\u0171\u0172\5 \21\2\u0172\u0173\79"+
		"\2\2\u0173\u0174\5 \21\2\u0174/\3\2\2\2\u0175\u0176\5B\"\2\u0176\u0177"+
		"\7\6\2\2\u0177\u0178\5 \21\2\u0178\61\3\2\2\2\u0179\u017f\7D\2\2\u017a"+
		"\u017b\5\64\33\2\u017b\u017c\7\t\2\2\u017c\u017d\7D\2\2\u017d\u017f\3"+
		"\2\2\2\u017e\u0179\3\2\2\2\u017e\u017a\3\2\2\2\u017f\63\3\2\2\2\u0180"+
		"\u0181\7D\2\2\u0181\65\3\2\2\2\u0182\u0185\7C\2\2\u0183\u0185\5:\36\2"+
		"\u0184\u0182\3\2\2\2\u0184\u0183\3\2\2\2\u0185\67\3\2\2\2\u0186\u018b"+
		"\5\66\34\2\u0187\u0188\7\t\2\2\u0188\u018a\5\66\34\2\u0189\u0187\3\2\2"+
		"\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c9"+
		"\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\7D\2\2\u018f;\3\2\2\2\u0190\u0191"+
		"\7D\2\2\u0191=\3\2\2\2\u0192\u0193\7D\2\2\u0193?\3\2\2\2\u0194\u0199\5"+
		":\36\2\u0195\u0196\7\t\2\2\u0196\u0198\5:\36\2\u0197\u0195\3\2\2\2\u0198"+
		"\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019aA\3\2\2\2"+
		"\u019b\u0199\3\2\2\2\u019c\u019d\7E\2\2\u019dC\3\2\2\2+IMXbjs\u0080\u0083"+
		"\u0094\u009a\u00a5\u00aa\u00b2\u00b4\u00b9\u00c4\u00c8\u00d7\u00e3\u00e6"+
		"\u00ef\u00f2\u0100\u0116\u011e\u0126\u0129\u012d\u0136\u0138\u013a\u0148"+
		"\u014b\u0155\u0159\u0165\u016c\u017e\u0184\u018b\u0199";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}