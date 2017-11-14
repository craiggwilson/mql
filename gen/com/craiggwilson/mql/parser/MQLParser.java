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
		AND_SYMBOL=1, ASSIGN=2, CARET=3, COMMA=4, DIV=5, DOLLAR=6, DOT=7, EQ=8, 
		GT=9, GTE=10, LBRACE=11, LBRACK=12, LPAREN=13, LT=14, LTE=15, MINUS=16, 
		MOD=17, MULT=18, NEQ=19, NOT_SYMBOL=20, OR_SYMBOL=21, PIPE=22, PLUS=23, 
		RBRACE=24, RBRACK=25, RPAREN=26, SEMI=27, AND=28, AS=29, ASC=30, BY=31, 
		CASE=32, DESC=33, ELSE=34, FALSE=35, FILTER=36, FROM=37, GROUP=38, IF=39, 
		IN=40, INDEX=41, LET=42, LIMIT=43, LOOKUP=44, MAP=45, MATCH=46, NOT=47, 
		NULL=48, OR=49, PROJECT=50, REDUCE=51, SKIP_=52, SORT=53, STARTING=54, 
		SWITCH=55, THEN=56, TRUE=57, UNWIND=58, WITH=59, PRESERVE_NULL_AND_EMPTY=60, 
		INT=61, DECIMAL=62, BIN=63, HEX=64, STRING=65, QUOTED_ID=66, UNQUOTED_ID=67, 
		WS=68;
	public static final int
		RULE_parse = 0, RULE_statement = 1, RULE_pipeline = 2, RULE_stage = 3, 
		RULE_group_stage = 4, RULE_limit_stage = 5, RULE_lookup_stage = 6, RULE_match_stage = 7, 
		RULE_project_stage = 8, RULE_skip_stage = 9, RULE_sort_stage = 10, RULE_sort_field = 11, 
		RULE_unwind_stage = 12, RULE_unwind_option = 13, RULE_expression = 14, 
		RULE_field_assignment = 15, RULE_variable_assignment = 16, RULE_collection_name = 17, 
		RULE_database_name = 18, RULE_multipart_field_name = 19, RULE_field_name = 20, 
		RULE_function_name = 21, RULE_variable_name = 22, RULE_keyword_as_id = 23;
	public static final String[] ruleNames = {
		"parse", "statement", "pipeline", "stage", "group_stage", "limit_stage", 
		"lookup_stage", "match_stage", "project_stage", "skip_stage", "sort_stage", 
		"sort_field", "unwind_stage", "unwind_option", "expression", "field_assignment", 
		"variable_assignment", "collection_name", "database_name", "multipart_field_name", 
		"field_name", "function_name", "variable_name", "keyword_as_id"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'&&'", "':='", "'^'", "','", "'/'", "'$'", "'.'", "'='", "'>'", 
		"'>='", "'{'", "'['", "'('", "'<'", "'<='", "'-'", "'%'", "'*'", "'!='", 
		"'!'", "'||'", "'|'", "'+'", "'}'", "']'", "')'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND_SYMBOL", "ASSIGN", "CARET", "COMMA", "DIV", "DOLLAR", "DOT", 
		"EQ", "GT", "GTE", "LBRACE", "LBRACK", "LPAREN", "LT", "LTE", "MINUS", 
		"MOD", "MULT", "NEQ", "NOT_SYMBOL", "OR_SYMBOL", "PIPE", "PLUS", "RBRACE", 
		"RBRACK", "RPAREN", "SEMI", "AND", "AS", "ASC", "BY", "CASE", "DESC", 
		"ELSE", "FALSE", "FILTER", "FROM", "GROUP", "IF", "IN", "INDEX", "LET", 
		"LIMIT", "LOOKUP", "MAP", "MATCH", "NOT", "NULL", "OR", "PROJECT", "REDUCE", 
		"SKIP_", "SORT", "STARTING", "SWITCH", "THEN", "TRUE", "UNWIND", "WITH", 
		"PRESERVE_NULL_AND_EMPTY", "INT", "DECIMAL", "BIN", "HEX", "STRING", "QUOTED_ID", 
		"UNQUOTED_ID", "WS"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			statement();
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(49);
					match(SEMI);
					setState(50);
					statement();
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(56);
				match(SEMI);
				}
			}

			setState(59);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitPipeline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PipelineContext pipeline() throws RecognitionException {
		PipelineContext _localctx = new PipelineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pipeline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(FROM);
			setState(64);
			collection_name();
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				stage();
				}
				}
				setState(68); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitStage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StageContext stage() throws RecognitionException {
		StageContext _localctx = new StageContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stage);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GROUP:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				group_stage();
				}
				break;
			case LIMIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				limit_stage();
				}
				break;
			case LOOKUP:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				lookup_stage();
				}
				break;
			case MATCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				match_stage();
				}
				break;
			case PROJECT:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				project_stage();
				}
				break;
			case SKIP_:
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				skip_stage();
				}
				break;
			case SORT:
				enterOuterAlt(_localctx, 7);
				{
				setState(76);
				sort_stage();
				}
				break;
			case UNWIND:
				enterOuterAlt(_localctx, 8);
				{
				setState(77);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitGroup_stage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_stageContext group_stage() throws RecognitionException {
		Group_stageContext _localctx = new Group_stageContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_group_stage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(GROUP);
			setState(81);
			field_assignment();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(82);
				match(COMMA);
				setState(83);
				field_assignment();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(BY);
			setState(90);
			expression(0);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(91);
				match(COMMA);
				setState(92);
				expression(0);
				}
				}
				setState(97);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitLimit_stage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Limit_stageContext limit_stage() throws RecognitionException {
		Limit_stageContext _localctx = new Limit_stageContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_limit_stage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(LIMIT);
			setState(99);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitLookup_stage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lookup_stageContext lookup_stage() throws RecognitionException {
		Lookup_stageContext _localctx = new Lookup_stageContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lookup_stage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(LOOKUP);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(102);
				match(LET);
				setState(103);
				variable_assignment();
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(104);
					match(COMMA);
					setState(105);
					variable_assignment();
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(113);
			multipart_field_name();
			setState(114);
			match(ASSIGN);
			setState(115);
			match(LPAREN);
			setState(116);
			pipeline();
			setState(117);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitMatch_stage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Match_stageContext match_stage() throws RecognitionException {
		Match_stageContext _localctx = new Match_stageContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_match_stage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(MATCH);
			setState(120);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitProject_stage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Project_stageContext project_stage() throws RecognitionException {
		Project_stageContext _localctx = new Project_stageContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_project_stage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(PROJECT);
			setState(123);
			field_assignment();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(124);
				match(COMMA);
				setState(125);
				field_assignment();
				}
				}
				setState(130);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitSkip_stage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Skip_stageContext skip_stage() throws RecognitionException {
		Skip_stageContext _localctx = new Skip_stageContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_skip_stage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(SKIP_);
			setState(132);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitSort_stage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sort_stageContext sort_stage() throws RecognitionException {
		Sort_stageContext _localctx = new Sort_stageContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sort_stage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(SORT);
			setState(135);
			sort_field();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(136);
				match(COMMA);
				setState(137);
				sort_field();
				}
				}
				setState(142);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitSort_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sort_fieldContext sort_field() throws RecognitionException {
		Sort_fieldContext _localctx = new Sort_fieldContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sort_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			multipart_field_name();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(144);
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
		public List<TerminalNode> COMMA() { return getTokens(MQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MQLParser.COMMA, i);
		}
		public Unwind_stageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unwind_stage; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitUnwind_stage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unwind_stageContext unwind_stage() throws RecognitionException {
		Unwind_stageContext _localctx = new Unwind_stageContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unwind_stage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(UNWIND);
			setState(148);
			multipart_field_name();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(149);
				match(WITH);
				setState(150);
				unwind_option();
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(151);
					match(COMMA);
					setState(152);
					unwind_option();
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
		public Multipart_field_nameContext multipart_field_name() {
			return getRuleContext(Multipart_field_nameContext.class,0);
		}
		public TerminalNode PRESERVE_NULL_AND_EMPTY() { return getToken(MQLParser.PRESERVE_NULL_AND_EMPTY, 0); }
		public Unwind_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unwind_option; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitUnwind_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unwind_optionContext unwind_option() throws RecognitionException {
		Unwind_optionContext _localctx = new Unwind_optionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unwind_option);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDEX:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(INDEX);
				setState(161);
				multipart_field_name();
				}
				break;
			case PRESERVE_NULL_AND_EMPTY:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
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
	public static class ReduceFunctionCallExpressionContext extends ExpressionContext {
		public TerminalNode REDUCE() { return getToken(MQLParser.REDUCE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(MQLParser.IN, 0); }
		public TerminalNode STARTING() { return getToken(MQLParser.STARTING, 0); }
		public TerminalNode WITH() { return getToken(MQLParser.WITH, 0); }
		public ReduceFunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitReduceFunctionCallExpression(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitAdditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberExpressionContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(MQLParser.INT, 0); }
		public NumberExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitNumberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterFunctionCallExpressionContext extends ExpressionContext {
		public TerminalNode FILTER() { return getToken(MQLParser.FILTER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AS() { return getToken(MQLParser.AS, 0); }
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public TerminalNode IN() { return getToken(MQLParser.IN, 0); }
		public FilterFunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitFilterFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MQLParser.NOT, 0); }
		public TerminalNode NOT_SYMBOL() { return getToken(MQLParser.NOT_SYMBOL, 0); }
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecimalExpressionContext extends ExpressionContext {
		public TerminalNode DECIMAL() { return getToken(MQLParser.DECIMAL, 0); }
		public DecimalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitDecimalExpression(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringExpressionContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(MQLParser.STRING, 0); }
		public StringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullExpressionContext extends ExpressionContext {
		public TerminalNode NULL() { return getToken(MQLParser.NULL, 0); }
		public NullExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitNullExpression(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitLetExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldExpressionContext extends ExpressionContext {
		public Field_nameContext field_name() {
			return getRuleContext(Field_nameContext.class,0);
		}
		public FieldExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitFieldExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MQLParser.RPAREN, 0); }
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
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitDocumentExpression(this);
			else return visitor.visitChildren(this);
		}
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
		public ArrayExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitArrayExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExpressionContext extends ExpressionContext {
		public TerminalNode TRUE() { return getToken(MQLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MQLParser.FALSE, 0); }
		public BoolExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitBoolExpression(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitSwitchExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(MQLParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MQLParser.RPAREN, 0); }
		public ParenthesisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitParenthesisExpression(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitMultiplicationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOT() { return getToken(MQLParser.DOT, 0); }
		public MemberExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitMemberExpression(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusExpressionContext extends ExpressionContext {
		public TerminalNode MINUS() { return getToken(MQLParser.MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryMinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitUnaryMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapFunctionCallExpressionContext extends ExpressionContext {
		public TerminalNode MAP() { return getToken(MQLParser.MAP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AS() { return getToken(MQLParser.AS, 0); }
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public TerminalNode IN() { return getToken(MQLParser.IN, 0); }
		public MapFunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitMapFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitPowerExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableReferenceExpressionContext extends ExpressionContext {
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public VariableReferenceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitVariableReferenceExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayElementExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBRACK() { return getToken(MQLParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(MQLParser.RBRACK, 0); }
		public ArrayElementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitArrayElementExpression(this);
			else return visitor.visitChildren(this);
		}
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
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(166);
				match(MINUS);
				setState(167);
				expression(26);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				_la = _input.LA(1);
				if ( !(_la==NOT_SYMBOL || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(169);
				expression(25);
				}
				break;
			case 3:
				{
				_localctx = new SwitchExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(SWITCH);
				setState(176); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(171);
						match(CASE);
						setState(172);
						expression(0);
						setState(173);
						match(THEN);
						setState(174);
						expression(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(178); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(180);
					match(ELSE);
					setState(181);
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
				setState(184);
				match(IF);
				setState(185);
				expression(0);
				setState(186);
				match(THEN);
				setState(187);
				expression(0);
				setState(188);
				match(ELSE);
				setState(189);
				expression(16);
				}
				break;
			case 5:
				{
				_localctx = new LetExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				match(LET);
				setState(192);
				variable_assignment();
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(193);
					match(COMMA);
					setState(194);
					variable_assignment();
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(200);
				match(IN);
				setState(201);
				expression(15);
				}
				break;
			case 6:
				{
				_localctx = new DocumentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				match(LBRACE);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (DOLLAR - 6)) | (1L << (LBRACE - 6)) | (1L << (LBRACK - 6)) | (1L << (LPAREN - 6)) | (1L << (MINUS - 6)) | (1L << (NOT_SYMBOL - 6)) | (1L << (FALSE - 6)) | (1L << (FILTER - 6)) | (1L << (IF - 6)) | (1L << (LET - 6)) | (1L << (MAP - 6)) | (1L << (NOT - 6)) | (1L << (NULL - 6)) | (1L << (REDUCE - 6)) | (1L << (SWITCH - 6)) | (1L << (TRUE - 6)) | (1L << (INT - 6)) | (1L << (DECIMAL - 6)) | (1L << (STRING - 6)) | (1L << (QUOTED_ID - 6)) | (1L << (UNQUOTED_ID - 6)))) != 0)) {
					{
					setState(204);
					field_assignment();
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(205);
						match(COMMA);
						setState(206);
						field_assignment();
						}
						}
						setState(211);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(214);
				match(RBRACE);
				}
				break;
			case 7:
				{
				_localctx = new ArrayExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				match(LBRACK);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (DOLLAR - 6)) | (1L << (LBRACE - 6)) | (1L << (LBRACK - 6)) | (1L << (LPAREN - 6)) | (1L << (MINUS - 6)) | (1L << (NOT_SYMBOL - 6)) | (1L << (FALSE - 6)) | (1L << (FILTER - 6)) | (1L << (IF - 6)) | (1L << (LET - 6)) | (1L << (MAP - 6)) | (1L << (NOT - 6)) | (1L << (NULL - 6)) | (1L << (REDUCE - 6)) | (1L << (SWITCH - 6)) | (1L << (TRUE - 6)) | (1L << (INT - 6)) | (1L << (DECIMAL - 6)) | (1L << (STRING - 6)) | (1L << (QUOTED_ID - 6)) | (1L << (UNQUOTED_ID - 6)))) != 0)) {
					{
					setState(216);
					expression(0);
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(217);
						match(COMMA);
						setState(218);
						expression(0);
						}
						}
						setState(223);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(226);
				match(RBRACK);
				}
				break;
			case 8:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227);
				match(LPAREN);
				setState(228);
				expression(0);
				setState(229);
				match(RPAREN);
				}
				break;
			case 9:
				{
				_localctx = new FilterFunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(231);
				match(FILTER);
				setState(232);
				expression(0);
				setState(233);
				match(AS);
				setState(234);
				variable_name();
				setState(235);
				match(IN);
				setState(236);
				expression(11);
				}
				break;
			case 10:
				{
				_localctx = new MapFunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(238);
				match(MAP);
				setState(239);
				expression(0);
				setState(240);
				match(AS);
				setState(241);
				variable_name();
				setState(242);
				match(IN);
				setState(243);
				expression(10);
				}
				break;
			case 11:
				{
				_localctx = new ReduceFunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(245);
				match(REDUCE);
				setState(246);
				expression(0);
				setState(247);
				match(IN);
				setState(248);
				expression(0);
				setState(249);
				match(STARTING);
				setState(250);
				match(WITH);
				setState(251);
				expression(9);
				}
				break;
			case 12:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253);
				function_name();
				setState(254);
				match(LPAREN);
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (DOLLAR - 6)) | (1L << (LBRACE - 6)) | (1L << (LBRACK - 6)) | (1L << (LPAREN - 6)) | (1L << (MINUS - 6)) | (1L << (NOT_SYMBOL - 6)) | (1L << (FALSE - 6)) | (1L << (FILTER - 6)) | (1L << (IF - 6)) | (1L << (LET - 6)) | (1L << (MAP - 6)) | (1L << (NOT - 6)) | (1L << (NULL - 6)) | (1L << (REDUCE - 6)) | (1L << (SWITCH - 6)) | (1L << (TRUE - 6)) | (1L << (INT - 6)) | (1L << (DECIMAL - 6)) | (1L << (STRING - 6)) | (1L << (QUOTED_ID - 6)) | (1L << (UNQUOTED_ID - 6)))) != 0)) {
					{
					setState(255);
					expression(0);
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(256);
						match(COMMA);
						setState(257);
						expression(0);
						}
						}
						setState(262);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(265);
				match(RPAREN);
				}
				break;
			case 13:
				{
				_localctx = new VariableReferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(267);
				variable_name();
				}
				break;
			case 14:
				{
				_localctx = new FieldExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(268);
				field_name();
				}
				break;
			case 15:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269);
				match(INT);
				}
				break;
			case 16:
				{
				_localctx = new DecimalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(270);
				match(DECIMAL);
				}
				break;
			case 17:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(271);
				match(STRING);
				}
				break;
			case 18:
				{
				_localctx = new BoolExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(272);
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
			case 19:
				{
				_localctx = new NullExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(273);
				match(NULL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(302);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(276);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(277);
						match(CARET);
						setState(278);
						expression(27);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(279);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(280);
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
						setState(281);
						expression(25);
						}
						break;
					case 3:
						{
						_localctx = new AdditionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(282);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(283);
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
						setState(284);
						expression(24);
						}
						break;
					case 4:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(285);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(286);
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
						setState(287);
						expression(23);
						}
						break;
					case 5:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(288);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(289);
						_la = _input.LA(1);
						if ( !(_la==AND_SYMBOL || _la==AND) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(290);
						expression(22);
						}
						break;
					case 6:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(291);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(292);
						_la = _input.LA(1);
						if ( !(_la==OR_SYMBOL || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(293);
						expression(21);
						}
						break;
					case 7:
						{
						_localctx = new MemberExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(294);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(295);
						match(DOT);
						setState(296);
						expression(19);
						}
						break;
					case 8:
						{
						_localctx = new ArrayElementExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(297);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(298);
						match(LBRACK);
						setState(299);
						expression(0);
						setState(300);
						match(RBRACK);
						}
						break;
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitField_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_assignmentContext field_assignment() throws RecognitionException {
		Field_assignmentContext _localctx = new Field_assignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_field_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(307);
				multipart_field_name();
				setState(308);
				match(ASSIGN);
				}
				break;
			}
			setState(312);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitVariable_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_assignmentContext variable_assignment() throws RecognitionException {
		Variable_assignmentContext _localctx = new Variable_assignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variable_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(314);
				variable_name();
				setState(315);
				match(ASSIGN);
				}
				break;
			}
			setState(319);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitCollection_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collection_nameContext collection_name() throws RecognitionException {
		Collection_nameContext _localctx = new Collection_nameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_collection_name);
		int _la;
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
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
				setState(322);
				database_name();
				setState(323);
				match(DOT);
				setState(324);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_database_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitMultipart_field_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multipart_field_nameContext multipart_field_name() throws RecognitionException {
		Multipart_field_nameContext _localctx = new Multipart_field_nameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_multipart_field_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			field_name();
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(331);
				match(DOT);
				setState(332);
				field_name();
				}
				}
				setState(337);
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
		public TerminalNode QUOTED_ID() { return getToken(MQLParser.QUOTED_ID, 0); }
		public TerminalNode UNQUOTED_ID() { return getToken(MQLParser.UNQUOTED_ID, 0); }
		public Keyword_as_idContext keyword_as_id() {
			return getRuleContext(Keyword_as_idContext.class,0);
		}
		public Field_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitField_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_nameContext field_name() throws RecognitionException {
		Field_nameContext _localctx = new Field_nameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_field_name);
		try {
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTED_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				match(QUOTED_ID);
				}
				break;
			case UNQUOTED_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				match(UNQUOTED_ID);
				}
				break;
			case FILTER:
			case MAP:
			case REDUCE:
				enterOuterAlt(_localctx, 3);
				{
				setState(340);
				keyword_as_id();
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

	public static class Function_nameContext extends ParserRuleContext {
		public TerminalNode UNQUOTED_ID() { return getToken(MQLParser.UNQUOTED_ID, 0); }
		public Keyword_as_idContext keyword_as_id() {
			return getRuleContext(Keyword_as_idContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_name);
		try {
			setState(345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNQUOTED_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				match(UNQUOTED_ID);
				}
				break;
			case FILTER:
			case MAP:
			case REDUCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				keyword_as_id();
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

	public static class Variable_nameContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(MQLParser.DOLLAR, 0); }
		public TerminalNode QUOTED_ID() { return getToken(MQLParser.QUOTED_ID, 0); }
		public TerminalNode UNQUOTED_ID() { return getToken(MQLParser.UNQUOTED_ID, 0); }
		public Variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitVariable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_nameContext variable_name() throws RecognitionException {
		Variable_nameContext _localctx = new Variable_nameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_variable_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(DOLLAR);
			setState(348);
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

	public static class Keyword_as_idContext extends ParserRuleContext {
		public TerminalNode FILTER() { return getToken(MQLParser.FILTER, 0); }
		public TerminalNode MAP() { return getToken(MQLParser.MAP, 0); }
		public TerminalNode REDUCE() { return getToken(MQLParser.REDUCE, 0); }
		public Keyword_as_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_as_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MQLVisitor ) return ((MQLVisitor<? extends T>)visitor).visitKeyword_as_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Keyword_as_idContext keyword_as_id() throws RecognitionException {
		Keyword_as_idContext _localctx = new Keyword_as_idContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_keyword_as_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FILTER) | (1L << MAP) | (1L << REDUCE))) != 0)) ) {
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
			return precpred(_ctx, 27);
		case 1:
			return precpred(_ctx, 24);
		case 2:
			return precpred(_ctx, 23);
		case 3:
			return precpred(_ctx, 22);
		case 4:
			return precpred(_ctx, 21);
		case 5:
			return precpred(_ctx, 20);
		case 6:
			return precpred(_ctx, 18);
		case 7:
			return precpred(_ctx, 19);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3F\u0163\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\5\2<\n\2\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\4\6\4E\n\4\r\4\16\4F\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Q\n\5"+
		"\3\6\3\6\3\6\3\6\7\6W\n\6\f\6\16\6Z\13\6\3\6\3\6\3\6\3\6\7\6`\n\6\f\6"+
		"\16\6c\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\bm\n\b\f\b\16\bp\13\b\5"+
		"\br\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u0081"+
		"\n\n\f\n\16\n\u0084\13\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u008d\n\f"+
		"\f\f\16\f\u0090\13\f\3\r\3\r\5\r\u0094\n\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\7\16\u009c\n\16\f\16\16\16\u009f\13\16\5\16\u00a1\n\16\3\17\3\17\3"+
		"\17\5\17\u00a6\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\6\20\u00b3\n\20\r\20\16\20\u00b4\3\20\3\20\5\20\u00b9\n\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00c6\n\20\f\20"+
		"\16\20\u00c9\13\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00d2\n\20"+
		"\f\20\16\20\u00d5\13\20\5\20\u00d7\n\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u00de\n\20\f\20\16\20\u00e1\13\20\5\20\u00e3\n\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u0105\n\20\f\20\16\20\u0108\13\20\5\20\u010a\n\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0115\n\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0131\n\20\f\20\16\20\u0134\13"+
		"\20\3\21\3\21\3\21\5\21\u0139\n\21\3\21\3\21\3\22\3\22\3\22\5\22\u0140"+
		"\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u0149\n\23\3\24\3\24\3\25"+
		"\3\25\3\25\7\25\u0150\n\25\f\25\16\25\u0153\13\25\3\26\3\26\3\26\5\26"+
		"\u0158\n\26\3\27\3\27\5\27\u015c\n\27\3\30\3\30\3\30\3\31\3\31\3\31\2"+
		"\3\36\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\f\4\2  "+
		"##\4\2\26\26\61\61\4\2%%;;\4\2\7\7\23\24\4\2\22\22\31\31\5\2\n\f\20\21"+
		"\25\25\4\2\3\3\36\36\4\2\27\27\63\63\3\2DE\5\2&&//\65\65\2\u0188\2\62"+
		"\3\2\2\2\4?\3\2\2\2\6A\3\2\2\2\bP\3\2\2\2\nR\3\2\2\2\fd\3\2\2\2\16g\3"+
		"\2\2\2\20y\3\2\2\2\22|\3\2\2\2\24\u0085\3\2\2\2\26\u0088\3\2\2\2\30\u0091"+
		"\3\2\2\2\32\u0095\3\2\2\2\34\u00a5\3\2\2\2\36\u0114\3\2\2\2 \u0138\3\2"+
		"\2\2\"\u013f\3\2\2\2$\u0148\3\2\2\2&\u014a\3\2\2\2(\u014c\3\2\2\2*\u0157"+
		"\3\2\2\2,\u015b\3\2\2\2.\u015d\3\2\2\2\60\u0160\3\2\2\2\62\67\5\4\3\2"+
		"\63\64\7\35\2\2\64\66\5\4\3\2\65\63\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2"+
		"\678\3\2\2\28;\3\2\2\29\67\3\2\2\2:<\7\35\2\2;:\3\2\2\2;<\3\2\2\2<=\3"+
		"\2\2\2=>\7\2\2\3>\3\3\2\2\2?@\5\6\4\2@\5\3\2\2\2AB\7\'\2\2BD\5$\23\2C"+
		"E\5\b\5\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\7\3\2\2\2HQ\5\n\6\2"+
		"IQ\5\f\7\2JQ\5\16\b\2KQ\5\20\t\2LQ\5\22\n\2MQ\5\24\13\2NQ\5\26\f\2OQ\5"+
		"\32\16\2PH\3\2\2\2PI\3\2\2\2PJ\3\2\2\2PK\3\2\2\2PL\3\2\2\2PM\3\2\2\2P"+
		"N\3\2\2\2PO\3\2\2\2Q\t\3\2\2\2RS\7(\2\2SX\5 \21\2TU\7\6\2\2UW\5 \21\2"+
		"VT\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7!\2\2"+
		"\\a\5\36\20\2]^\7\6\2\2^`\5\36\20\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3"+
		"\2\2\2b\13\3\2\2\2ca\3\2\2\2de\7-\2\2ef\7?\2\2f\r\3\2\2\2gq\7.\2\2hi\7"+
		",\2\2in\5\"\22\2jk\7\6\2\2km\5\"\22\2lj\3\2\2\2mp\3\2\2\2nl\3\2\2\2no"+
		"\3\2\2\2or\3\2\2\2pn\3\2\2\2qh\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\5(\25\2t"+
		"u\7\4\2\2uv\7\17\2\2vw\5\6\4\2wx\7\34\2\2x\17\3\2\2\2yz\7\60\2\2z{\5\36"+
		"\20\2{\21\3\2\2\2|}\7\64\2\2}\u0082\5 \21\2~\177\7\6\2\2\177\u0081\5 "+
		"\21\2\u0080~\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\23\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7\66\2\2\u0086"+
		"\u0087\7?\2\2\u0087\25\3\2\2\2\u0088\u0089\7\67\2\2\u0089\u008e\5\30\r"+
		"\2\u008a\u008b\7\6\2\2\u008b\u008d\5\30\r\2\u008c\u008a\3\2\2\2\u008d"+
		"\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\27\3\2\2"+
		"\2\u0090\u008e\3\2\2\2\u0091\u0093\5(\25\2\u0092\u0094\t\2\2\2\u0093\u0092"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\31\3\2\2\2\u0095\u0096\7<\2\2\u0096"+
		"\u00a0\5(\25\2\u0097\u0098\7=\2\2\u0098\u009d\5\34\17\2\u0099\u009a\7"+
		"\6\2\2\u009a\u009c\5\34\17\2\u009b\u0099\3\2\2\2\u009c\u009f\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u00a0\u0097\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\33\3\2\2\2\u00a2\u00a3"+
		"\7+\2\2\u00a3\u00a6\5(\25\2\u00a4\u00a6\7>\2\2\u00a5\u00a2\3\2\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\35\3\2\2\2\u00a7\u00a8\b\20\1\2\u00a8\u00a9\7\22"+
		"\2\2\u00a9\u0115\5\36\20\34\u00aa\u00ab\t\3\2\2\u00ab\u0115\5\36\20\33"+
		"\u00ac\u00b2\79\2\2\u00ad\u00ae\7\"\2\2\u00ae\u00af\5\36\20\2\u00af\u00b0"+
		"\7:\2\2\u00b0\u00b1\5\36\20\2\u00b1\u00b3\3\2\2\2\u00b2\u00ad\3\2\2\2"+
		"\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b8"+
		"\3\2\2\2\u00b6\u00b7\7$\2\2\u00b7\u00b9\5\36\20\2\u00b8\u00b6\3\2\2\2"+
		"\u00b8\u00b9\3\2\2\2\u00b9\u0115\3\2\2\2\u00ba\u00bb\7)\2\2\u00bb\u00bc"+
		"\5\36\20\2\u00bc\u00bd\7:\2\2\u00bd\u00be\5\36\20\2\u00be\u00bf\7$\2\2"+
		"\u00bf\u00c0\5\36\20\22\u00c0\u0115\3\2\2\2\u00c1\u00c2\7,\2\2\u00c2\u00c7"+
		"\5\"\22\2\u00c3\u00c4\7\6\2\2\u00c4\u00c6\5\"\22\2\u00c5\u00c3\3\2\2\2"+
		"\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca"+
		"\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\7*\2\2\u00cb\u00cc\5\36\20\21"+
		"\u00cc\u0115\3\2\2\2\u00cd\u00d6\7\r\2\2\u00ce\u00d3\5 \21\2\u00cf\u00d0"+
		"\7\6\2\2\u00d0\u00d2\5 \21\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d6\u00ce\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u0115\7\32\2\2\u00d9\u00e2\7\16\2\2\u00da\u00df\5\36\20\2\u00db\u00dc"+
		"\7\6\2\2\u00dc\u00de\5\36\20\2\u00dd\u00db\3\2\2\2\u00de\u00e1\3\2\2\2"+
		"\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df"+
		"\3\2\2\2\u00e2\u00da\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u0115\7\33\2\2\u00e5\u00e6\7\17\2\2\u00e6\u00e7\5\36\20\2\u00e7\u00e8"+
		"\7\34\2\2\u00e8\u0115\3\2\2\2\u00e9\u00ea\7&\2\2\u00ea\u00eb\5\36\20\2"+
		"\u00eb\u00ec\7\37\2\2\u00ec\u00ed\5.\30\2\u00ed\u00ee\7*\2\2\u00ee\u00ef"+
		"\5\36\20\r\u00ef\u0115\3\2\2\2\u00f0\u00f1\7/\2\2\u00f1\u00f2\5\36\20"+
		"\2\u00f2\u00f3\7\37\2\2\u00f3\u00f4\5.\30\2\u00f4\u00f5\7*\2\2\u00f5\u00f6"+
		"\5\36\20\f\u00f6\u0115\3\2\2\2\u00f7\u00f8\7\65\2\2\u00f8\u00f9\5\36\20"+
		"\2\u00f9\u00fa\7*\2\2\u00fa\u00fb\5\36\20\2\u00fb\u00fc\78\2\2\u00fc\u00fd"+
		"\7=\2\2\u00fd\u00fe\5\36\20\13\u00fe\u0115\3\2\2\2\u00ff\u0100\5,\27\2"+
		"\u0100\u0109\7\17\2\2\u0101\u0106\5\36\20\2\u0102\u0103\7\6\2\2\u0103"+
		"\u0105\5\36\20\2\u0104\u0102\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3"+
		"\2\2\2\u0106\u0107\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0109"+
		"\u0101\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\7\34"+
		"\2\2\u010c\u0115\3\2\2\2\u010d\u0115\5.\30\2\u010e\u0115\5*\26\2\u010f"+
		"\u0115\7?\2\2\u0110\u0115\7@\2\2\u0111\u0115\7C\2\2\u0112\u0115\t\4\2"+
		"\2\u0113\u0115\7\62\2\2\u0114\u00a7\3\2\2\2\u0114\u00aa\3\2\2\2\u0114"+
		"\u00ac\3\2\2\2\u0114\u00ba\3\2\2\2\u0114\u00c1\3\2\2\2\u0114\u00cd\3\2"+
		"\2\2\u0114\u00d9\3\2\2\2\u0114\u00e5\3\2\2\2\u0114\u00e9\3\2\2\2\u0114"+
		"\u00f0\3\2\2\2\u0114\u00f7\3\2\2\2\u0114\u00ff\3\2\2\2\u0114\u010d\3\2"+
		"\2\2\u0114\u010e\3\2\2\2\u0114\u010f\3\2\2\2\u0114\u0110\3\2\2\2\u0114"+
		"\u0111\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115\u0132\3\2"+
		"\2\2\u0116\u0117\f\35\2\2\u0117\u0118\7\5\2\2\u0118\u0131\5\36\20\35\u0119"+
		"\u011a\f\32\2\2\u011a\u011b\t\5\2\2\u011b\u0131\5\36\20\33\u011c\u011d"+
		"\f\31\2\2\u011d\u011e\t\6\2\2\u011e\u0131\5\36\20\32\u011f\u0120\f\30"+
		"\2\2\u0120\u0121\t\7\2\2\u0121\u0131\5\36\20\31\u0122\u0123\f\27\2\2\u0123"+
		"\u0124\t\b\2\2\u0124\u0131\5\36\20\30\u0125\u0126\f\26\2\2\u0126\u0127"+
		"\t\t\2\2\u0127\u0131\5\36\20\27\u0128\u0129\f\24\2\2\u0129\u012a\7\t\2"+
		"\2\u012a\u0131\5\36\20\25\u012b\u012c\f\25\2\2\u012c\u012d\7\16\2\2\u012d"+
		"\u012e\5\36\20\2\u012e\u012f\7\33\2\2\u012f\u0131\3\2\2\2\u0130\u0116"+
		"\3\2\2\2\u0130\u0119\3\2\2\2\u0130\u011c\3\2\2\2\u0130\u011f\3\2\2\2\u0130"+
		"\u0122\3\2\2\2\u0130\u0125\3\2\2\2\u0130\u0128\3\2\2\2\u0130\u012b\3\2"+
		"\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\37\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136\5(\25\2\u0136\u0137\7\4\2"+
		"\2\u0137\u0139\3\2\2\2\u0138\u0135\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a"+
		"\3\2\2\2\u013a\u013b\5\36\20\2\u013b!\3\2\2\2\u013c\u013d\5.\30\2\u013d"+
		"\u013e\7\4\2\2\u013e\u0140\3\2\2\2\u013f\u013c\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0141\u0142\5\36\20\2\u0142#\3\2\2\2\u0143\u0149"+
		"\t\n\2\2\u0144\u0145\5&\24\2\u0145\u0146\7\t\2\2\u0146\u0147\t\n\2\2\u0147"+
		"\u0149\3\2\2\2\u0148\u0143\3\2\2\2\u0148\u0144\3\2\2\2\u0149%\3\2\2\2"+
		"\u014a\u014b\t\n\2\2\u014b\'\3\2\2\2\u014c\u0151\5*\26\2\u014d\u014e\7"+
		"\t\2\2\u014e\u0150\5*\26\2\u014f\u014d\3\2\2\2\u0150\u0153\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152)\3\2\2\2\u0153\u0151\3\2\2\2"+
		"\u0154\u0158\7D\2\2\u0155\u0158\7E\2\2\u0156\u0158\5\60\31\2\u0157\u0154"+
		"\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0156\3\2\2\2\u0158+\3\2\2\2\u0159"+
		"\u015c\7E\2\2\u015a\u015c\5\60\31\2\u015b\u0159\3\2\2\2\u015b\u015a\3"+
		"\2\2\2\u015c-\3\2\2\2\u015d\u015e\7\b\2\2\u015e\u015f\t\n\2\2\u015f/\3"+
		"\2\2\2\u0160\u0161\t\13\2\2\u0161\61\3\2\2\2\"\67;FPXanq\u0082\u008e\u0093"+
		"\u009d\u00a0\u00a5\u00b4\u00b8\u00c7\u00d3\u00d6\u00df\u00e2\u0106\u0109"+
		"\u0114\u0130\u0132\u0138\u013f\u0148\u0151\u0157\u015b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}