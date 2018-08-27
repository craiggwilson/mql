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
		ARROW=1, COLON=2, COMMA=3, CONCAT=4, DIV=5, DOT=6, DQUESTION=7, EQ=8, 
		GT=9, GTE=10, LBRACE=11, LBRACK=12, LPAREN=13, LT=14, LTE=15, MINUS=16, 
		MOD=17, POWER=18, MULT=19, NEQ=20, EXCLUDE=21, PLUS=22, RANGE=23, RBRACE=24, 
		RBRACK=25, RPAREN=26, SEMI=27, UNDERSCORE=28, AND=29, ASC=30, BY=31, CASE=32, 
		DESC=33, ELSE=34, FALSE=35, FROM=36, GROUP=37, IF=38, IN=39, INDEX=40, 
		LET=41, LIKE=42, LIMIT=43, LOOKUP=44, MATCH=45, NOT=46, NULL=47, OR=48, 
		PROJECT=49, SKIP_=50, SORT=51, STEP=52, SWITCH=53, THEN=54, TRUE=55, UNWIND=56, 
		WITH=57, PRESERVE_NULL_AND_EMPTY=58, REGEX=59, INT=60, DECIMAL=61, LONG=62, 
		BIN=63, HEX=64, OID=65, ID=66, STRING=67, VARIABLE_ID=68, WS=69;
	public static final int
		RULE_parse = 0, RULE_statement = 1, RULE_pipeline = 2, RULE_stage = 3, 
		RULE_project_item = 4, RULE_sort_field = 5, RULE_unwind_option = 6, RULE_expression = 7, 
		RULE_field_assignment = 8, RULE_function = 9, RULE_function_argument = 10, 
		RULE_lambda_argument = 11, RULE_lambda_expression = 12, RULE_number = 13, 
		RULE_regex = 14, RULE_switch_case = 15, RULE_variable_assignment = 16, 
		RULE_collection_name = 17, RULE_database_name = 18, RULE_field_declaration = 19, 
		RULE_multipart_field_declaration = 20, RULE_field_name = 21, RULE_function_name = 22, 
		RULE_function_argument_name = 23, RULE_multipart_field_name = 24, RULE_variable_name = 25;
	public static final String[] ruleNames = {
		"parse", "statement", "pipeline", "stage", "project_item", "sort_field", 
		"unwind_option", "expression", "field_assignment", "function", "function_argument", 
		"lambda_argument", "lambda_expression", "number", "regex", "switch_case", 
		"variable_assignment", "collection_name", "database_name", "field_declaration", 
		"multipart_field_declaration", "field_name", "function_name", "function_argument_name", 
		"multipart_field_name", "variable_name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'=>'", "':'", "','", "'||'", "'/'", "'.'", "'??'", "'='", "'>'", 
		"'>='", "'{'", "'['", "'('", "'<'", "'<='", "'-'", "'%'", "'**'", "'*'", 
		"'!='", "'!'", "'+'", "'..'", "'}'", "']'", "')'", "';'", "'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ARROW", "COLON", "COMMA", "CONCAT", "DIV", "DOT", "DQUESTION", 
		"EQ", "GT", "GTE", "LBRACE", "LBRACK", "LPAREN", "LT", "LTE", "MINUS", 
		"MOD", "POWER", "MULT", "NEQ", "EXCLUDE", "PLUS", "RANGE", "RBRACE", "RBRACK", 
		"RPAREN", "SEMI", "UNDERSCORE", "AND", "ASC", "BY", "CASE", "DESC", "ELSE", 
		"FALSE", "FROM", "GROUP", "IF", "IN", "INDEX", "LET", "LIKE", "LIMIT", 
		"LOOKUP", "MATCH", "NOT", "NULL", "OR", "PROJECT", "SKIP_", "SORT", "STEP", 
		"SWITCH", "THEN", "TRUE", "UNWIND", "WITH", "PRESERVE_NULL_AND_EMPTY", 
		"REGEX", "INT", "DECIMAL", "LONG", "BIN", "HEX", "OID", "ID", "STRING", 
		"VARIABLE_ID", "WS"
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
			setState(52);
			statement();
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(53);
					match(SEMI);
					setState(54);
					statement();
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(60);
				match(SEMI);
				}
			}

			setState(63);
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
			setState(65);
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
			setState(67);
			match(FROM);
			setState(68);
			collection_name();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GROUP) | (1L << LIMIT) | (1L << LOOKUP) | (1L << MATCH) | (1L << PROJECT) | (1L << SKIP_) | (1L << SORT) | (1L << UNWIND))) != 0)) {
				{
				{
				setState(69);
				stage();
				}
				}
				setState(74);
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
		public TerminalNode LBRACE() { return getToken(MQLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MQLParser.RBRACE, 0); }
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GROUP:
				_localctx = new GroupStageContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(GROUP);
				setState(76);
				field_assignment();
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(77);
					match(COMMA);
					setState(78);
					field_assignment();
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BY) {
					{
					setState(84);
					match(BY);
					setState(85);
					expression(0);
					}
				}

				}
				break;
			case LIMIT:
				_localctx = new LimitStageContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(LIMIT);
				setState(89);
				match(INT);
				}
				break;
			case LOOKUP:
				_localctx = new LookupStageContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				match(LOOKUP);
				setState(91);
				multipart_field_declaration();
				setState(92);
				match(COLON);
				setState(93);
				match(LPAREN);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LET) {
					{
					setState(94);
					match(LET);
					setState(95);
					variable_assignment();
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(96);
						match(COMMA);
						setState(97);
						variable_assignment();
						}
						}
						setState(102);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(105);
				statement();
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
				setState(130);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EXCLUDE:
				case ID:
				case STRING:
					{
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
				case LBRACE:
					{
					setState(119);
					match(LBRACE);
					setState(120);
					project_item();
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(121);
						match(COMMA);
						setState(122);
						project_item();
						}
						}
						setState(127);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(128);
					match(RBRACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SKIP_:
				_localctx = new SkipStageContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(132);
				match(SKIP_);
				setState(133);
				match(INT);
				}
				break;
			case SORT:
				_localctx = new SortStageContext(_localctx);
				enterOuterAlt(_localctx, 7);
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
				break;
			case UNWIND:
				_localctx = new UnwindStageContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(143);
				match(UNWIND);
				setState(144);
				multipart_field_name();
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(145);
					match(WITH);
					setState(147); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(146);
						unwind_option();
						}
						}
						setState(149); 
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
		public TerminalNode EXCLUDE() { return getToken(MQLParser.EXCLUDE, 0); }
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
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXCLUDE) {
					{
					setState(155);
					match(EXCLUDE);
					}
				}

				setState(158);
				multipart_field_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				multipart_field_declaration();
				setState(160);
				match(COLON);
				setState(161);
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
			setState(165);
			multipart_field_name();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(166);
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
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDEX:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(INDEX);
				setState(170);
				multipart_field_declaration();
				}
				break;
			case PRESERVE_NULL_AND_EMPTY:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
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
		public TerminalNode NOT() { return getToken(MQLParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
	public static class OidExpressionContext extends ExpressionContext {
		public TerminalNode OID() { return getToken(MQLParser.OID, 0); }
		public OidExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ConcatExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CONCAT() { return getToken(MQLParser.CONCAT, 0); }
		public ConcatExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NullCoalesceExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DQUESTION() { return getToken(MQLParser.DQUESTION, 0); }
		public NullCoalesceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
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
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class StringExpressionContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(MQLParser.STRING, 0); }
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
	public static class LikeExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(MQLParser.LIKE, 0); }
		public RegexContext regex() {
			return getRuleContext(RegexContext.class,0);
		}
		public LikeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
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
		public TerminalNode POWER() { return getToken(MQLParser.POWER, 0); }
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
		public TerminalNode RANGE() { return getToken(MQLParser.RANGE, 0); }
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
		public TerminalNode COLON() { return getToken(MQLParser.COLON, 0); }
		public RangeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class RegexExpressionContext extends ExpressionContext {
		public RegexContext regex() {
			return getRuleContext(RegexContext.class,0);
		}
		public RegexExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
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
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(175);
				match(MINUS);
				setState(176);
				expression(29);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				match(NOT);
				setState(178);
				expression(28);
				}
				break;
			case 3:
				{
				_localctx = new SwitchExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				match(SWITCH);
				setState(181); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(180);
						switch_case();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(183); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(187);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
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
				expression(14);
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
				match(ARROW);
				setState(206);
				expression(13);
				}
				break;
			case 6:
				{
				_localctx = new NewDocumentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208);
				match(LBRACE);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID || _la==STRING) {
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
				_localctx = new NewArrayExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				match(LBRACK);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (LBRACE - 11)) | (1L << (LBRACK - 11)) | (1L << (LPAREN - 11)) | (1L << (MINUS - 11)) | (1L << (FALSE - 11)) | (1L << (IF - 11)) | (1L << (LET - 11)) | (1L << (NOT - 11)) | (1L << (NULL - 11)) | (1L << (SWITCH - 11)) | (1L << (TRUE - 11)) | (1L << (REGEX - 11)) | (1L << (INT - 11)) | (1L << (DECIMAL - 11)) | (1L << (LONG - 11)) | (1L << (BIN - 11)) | (1L << (HEX - 11)) | (1L << (OID - 11)) | (1L << (ID - 11)) | (1L << (STRING - 11)) | (1L << (VARIABLE_ID - 11)))) != 0)) {
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
				field_name();
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
			case 16:
				{
				_localctx = new OidExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243);
				match(OID);
				}
				break;
			case 17:
				{
				_localctx = new RegexExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(244);
				regex();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(310);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(247);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(248);
						match(POWER);
						setState(249);
						expression(30);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(250);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(251);
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
						setState(252);
						expression(24);
						}
						break;
					case 3:
						{
						_localctx = new AdditionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(253);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(254);
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
						setState(255);
						expression(23);
						}
						break;
					case 4:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(256);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(257);
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
						setState(258);
						expression(22);
						}
						break;
					case 5:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(259);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(260);
						match(AND);
						setState(261);
						expression(21);
						}
						break;
					case 6:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(262);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(263);
						match(OR);
						setState(264);
						expression(20);
						}
						break;
					case 7:
						{
						_localctx = new ConcatExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(265);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(266);
						match(CONCAT);
						setState(267);
						expression(19);
						}
						break;
					case 8:
						{
						_localctx = new NullCoalesceExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(268);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(269);
						match(DQUESTION);
						setState(270);
						expression(18);
						}
						break;
					case 9:
						{
						_localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(271);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(273);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(272);
							match(NOT);
							}
						}

						setState(275);
						match(IN);
						setState(276);
						expression(17);
						}
						break;
					case 10:
						{
						_localctx = new MemberExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(277);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(278);
						match(DOT);
						setState(281);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
						case 1:
							{
							setState(279);
							field_name();
							}
							break;
						case 2:
							{
							setState(280);
							function();
							}
							break;
						}
						}
						break;
					case 11:
						{
						_localctx = new ArrayAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(283);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(284);
						match(LBRACK);
						setState(297);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
						case 1:
							{
							setState(285);
							((ArrayAccessExpressionContext)_localctx).start = expression(0);
							}
							break;
						case 2:
							{
							setState(287);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (LBRACE - 11)) | (1L << (LBRACK - 11)) | (1L << (LPAREN - 11)) | (1L << (MINUS - 11)) | (1L << (FALSE - 11)) | (1L << (IF - 11)) | (1L << (LET - 11)) | (1L << (NOT - 11)) | (1L << (NULL - 11)) | (1L << (SWITCH - 11)) | (1L << (TRUE - 11)) | (1L << (REGEX - 11)) | (1L << (INT - 11)) | (1L << (DECIMAL - 11)) | (1L << (LONG - 11)) | (1L << (BIN - 11)) | (1L << (HEX - 11)) | (1L << (OID - 11)) | (1L << (ID - 11)) | (1L << (STRING - 11)) | (1L << (VARIABLE_ID - 11)))) != 0)) {
								{
								setState(286);
								((ArrayAccessExpressionContext)_localctx).start = expression(0);
								}
							}

							setState(289);
							match(RANGE);
							setState(291);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (LBRACE - 11)) | (1L << (LBRACK - 11)) | (1L << (LPAREN - 11)) | (1L << (MINUS - 11)) | (1L << (FALSE - 11)) | (1L << (IF - 11)) | (1L << (LET - 11)) | (1L << (NOT - 11)) | (1L << (NULL - 11)) | (1L << (SWITCH - 11)) | (1L << (TRUE - 11)) | (1L << (REGEX - 11)) | (1L << (INT - 11)) | (1L << (DECIMAL - 11)) | (1L << (LONG - 11)) | (1L << (BIN - 11)) | (1L << (HEX - 11)) | (1L << (OID - 11)) | (1L << (ID - 11)) | (1L << (STRING - 11)) | (1L << (VARIABLE_ID - 11)))) != 0)) {
								{
								setState(290);
								((ArrayAccessExpressionContext)_localctx).end = expression(0);
								}
							}

							setState(295);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==COLON) {
								{
								setState(293);
								match(COLON);
								setState(294);
								((ArrayAccessExpressionContext)_localctx).step = expression(0);
								}
							}

							}
							break;
						}
						setState(299);
						match(RBRACK);
						}
						break;
					case 12:
						{
						_localctx = new RangeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(300);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(301);
						match(RANGE);
						setState(302);
						expression(0);
						setState(305);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
						case 1:
							{
							setState(303);
							match(COLON);
							setState(304);
							expression(0);
							}
							break;
						}
						}
						break;
					case 13:
						{
						_localctx = new LikeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(307);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(308);
						match(LIKE);
						setState(309);
						regex();
						}
						break;
					}
					} 
				}
				setState(314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		enterRule(_localctx, 18, RULE_function);
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
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (LBRACE - 11)) | (1L << (LBRACK - 11)) | (1L << (LPAREN - 11)) | (1L << (MINUS - 11)) | (1L << (UNDERSCORE - 11)) | (1L << (FALSE - 11)) | (1L << (IF - 11)) | (1L << (LET - 11)) | (1L << (NOT - 11)) | (1L << (NULL - 11)) | (1L << (SWITCH - 11)) | (1L << (TRUE - 11)) | (1L << (REGEX - 11)) | (1L << (INT - 11)) | (1L << (DECIMAL - 11)) | (1L << (LONG - 11)) | (1L << (BIN - 11)) | (1L << (HEX - 11)) | (1L << (OID - 11)) | (1L << (ID - 11)) | (1L << (STRING - 11)) | (1L << (VARIABLE_ID - 11)))) != 0)) {
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
		enterRule(_localctx, 20, RULE_function_argument);
		try {
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
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
		enterRule(_localctx, 22, RULE_lambda_argument);
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
		enterRule(_localctx, 24, RULE_lambda_expression);
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
		enterRule(_localctx, 26, RULE_number);
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

	public static class RegexContext extends ParserRuleContext {
		public TerminalNode REGEX() { return getToken(MQLParser.REGEX, 0); }
		public RegexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regex; }
	}

	public final RegexContext regex() throws RecognitionException {
		RegexContext _localctx = new RegexContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_regex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(REGEX);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 30, RULE_switch_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(CASE);
			setState(369);
			expression(0);
			setState(370);
			match(THEN);
			setState(371);
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
		enterRule(_localctx, 32, RULE_variable_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			variable_name();
			setState(374);
			match(COLON);
			setState(375);
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
		public TerminalNode ID() { return getToken(MQLParser.ID, 0); }
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
		enterRule(_localctx, 34, RULE_collection_name);
		try {
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				database_name();
				setState(379);
				match(DOT);
				setState(380);
				match(ID);
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
		public TerminalNode ID() { return getToken(MQLParser.ID, 0); }
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(ID);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode STRING() { return getToken(MQLParser.STRING, 0); }
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
		enterRule(_localctx, 38, RULE_field_declaration);
		try {
			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				match(STRING);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
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
		enterRule(_localctx, 40, RULE_multipart_field_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			field_declaration();
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(391);
				match(DOT);
				setState(392);
				field_declaration();
				}
				}
				setState(397);
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
		public TerminalNode ID() { return getToken(MQLParser.ID, 0); }
		public Field_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_name; }
	}

	public final Field_nameContext field_name() throws RecognitionException {
		Field_nameContext _localctx = new Field_nameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_field_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(ID);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode ID() { return getToken(MQLParser.ID, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(ID);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode ID() { return getToken(MQLParser.ID, 0); }
		public Function_argument_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_argument_name; }
	}

	public final Function_argument_nameContext function_argument_name() throws RecognitionException {
		Function_argument_nameContext _localctx = new Function_argument_nameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_function_argument_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(ID);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 48, RULE_multipart_field_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			field_name();
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(405);
				match(DOT);
				setState(406);
				field_name();
				}
				}
				setState(411);
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
		enterRule(_localctx, 50, RULE_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
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
			return precpred(_ctx, 30);
		case 1:
			return precpred(_ctx, 23);
		case 2:
			return precpred(_ctx, 22);
		case 3:
			return precpred(_ctx, 21);
		case 4:
			return precpred(_ctx, 20);
		case 5:
			return precpred(_ctx, 19);
		case 6:
			return precpred(_ctx, 18);
		case 7:
			return precpred(_ctx, 17);
		case 8:
			return precpred(_ctx, 16);
		case 9:
			return precpred(_ctx, 27);
		case 10:
			return precpred(_ctx, 26);
		case 11:
			return precpred(_ctx, 25);
		case 12:
			return precpred(_ctx, 24);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3G\u01a1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\5\2@\n\2"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\7\4I\n\4\f\4\16\4L\13\4\3\5\3\5\3\5\3\5\7"+
		"\5R\n\5\f\5\16\5U\13\5\3\5\3\5\5\5Y\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\7\5e\n\5\f\5\16\5h\13\5\5\5j\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\7\5u\n\5\f\5\16\5x\13\5\3\5\3\5\3\5\3\5\7\5~\n\5\f\5\16\5\u0081"+
		"\13\5\3\5\3\5\5\5\u0085\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u008d\n\5\f\5"+
		"\16\5\u0090\13\5\3\5\3\5\3\5\3\5\6\5\u0096\n\5\r\5\16\5\u0097\5\5\u009a"+
		"\n\5\5\5\u009c\n\5\3\6\5\6\u009f\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a6\n\6"+
		"\3\7\3\7\5\7\u00aa\n\7\3\b\3\b\3\b\5\b\u00af\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\6\t\u00b8\n\t\r\t\16\t\u00b9\3\t\3\t\5\t\u00be\n\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00cb\n\t\f\t\16\t\u00ce\13\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00d7\n\t\f\t\16\t\u00da\13\t\5\t\u00dc\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\7\t\u00e3\n\t\f\t\16\t\u00e6\13\t\5\t\u00e8\n\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00f8\n\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0114\n\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u011c\n\t\3\t\3\t\3\t\3\t\5\t\u0122\n\t\3\t\3\t\5\t\u0126\n\t\3"+
		"\t\3\t\5\t\u012a\n\t\5\t\u012c\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0134\n"+
		"\t\3\t\3\t\3\t\7\t\u0139\n\t\f\t\16\t\u013c\13\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\7\13\u0147\n\13\f\13\16\13\u014a\13\13\5\13\u014c"+
		"\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0156\n\f\3\r\3\r\5\r\u015a"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0164\n\16\f\16\16\16"+
		"\u0167\13\16\3\16\3\16\3\16\3\16\5\16\u016d\n\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5"+
		"\23\u0181\n\23\3\24\3\24\3\25\3\25\5\25\u0187\n\25\3\26\3\26\3\26\7\26"+
		"\u018c\n\26\f\26\16\26\u018f\13\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\32\7\32\u019a\n\32\f\32\16\32\u019d\13\32\3\33\3\33\3\33\2\3\20"+
		"\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\b\4\2 "+
		" ##\4\2%%99\5\2\7\7\23\23\25\25\4\2\22\22\30\30\5\2\n\f\20\21\26\26\3"+
		"\2>B\2\u01d4\2\66\3\2\2\2\4C\3\2\2\2\6E\3\2\2\2\b\u009b\3\2\2\2\n\u00a5"+
		"\3\2\2\2\f\u00a7\3\2\2\2\16\u00ae\3\2\2\2\20\u00f7\3\2\2\2\22\u013d\3"+
		"\2\2\2\24\u0141\3\2\2\2\26\u0155\3\2\2\2\30\u0159\3\2\2\2\32\u016c\3\2"+
		"\2\2\34\u016e\3\2\2\2\36\u0170\3\2\2\2 \u0172\3\2\2\2\"\u0177\3\2\2\2"+
		"$\u0180\3\2\2\2&\u0182\3\2\2\2(\u0186\3\2\2\2*\u0188\3\2\2\2,\u0190\3"+
		"\2\2\2.\u0192\3\2\2\2\60\u0194\3\2\2\2\62\u0196\3\2\2\2\64\u019e\3\2\2"+
		"\2\66;\5\4\3\2\678\7\35\2\28:\5\4\3\29\67\3\2\2\2:=\3\2\2\2;9\3\2\2\2"+
		";<\3\2\2\2<?\3\2\2\2=;\3\2\2\2>@\7\35\2\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2"+
		"\2AB\7\2\2\3B\3\3\2\2\2CD\5\6\4\2D\5\3\2\2\2EF\7&\2\2FJ\5$\23\2GI\5\b"+
		"\5\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\7\3\2\2\2LJ\3\2\2\2MN\7"+
		"\'\2\2NS\5\22\n\2OP\7\5\2\2PR\5\22\n\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2S"+
		"T\3\2\2\2TX\3\2\2\2US\3\2\2\2VW\7!\2\2WY\5\20\t\2XV\3\2\2\2XY\3\2\2\2"+
		"Y\u009c\3\2\2\2Z[\7-\2\2[\u009c\7>\2\2\\]\7.\2\2]^\5*\26\2^_\7\4\2\2_"+
		"i\7\17\2\2`a\7+\2\2af\5\"\22\2bc\7\5\2\2ce\5\"\22\2db\3\2\2\2eh\3\2\2"+
		"\2fd\3\2\2\2fg\3\2\2\2gj\3\2\2\2hf\3\2\2\2i`\3\2\2\2ij\3\2\2\2jk\3\2\2"+
		"\2kl\5\4\3\2lm\7\34\2\2m\u009c\3\2\2\2no\7/\2\2o\u009c\5\20\t\2p\u0084"+
		"\7\63\2\2qv\5\n\6\2rs\7\5\2\2su\5\n\6\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2"+
		"vw\3\2\2\2w\u0085\3\2\2\2xv\3\2\2\2yz\7\r\2\2z\177\5\n\6\2{|\7\5\2\2|"+
		"~\5\n\6\2}{\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7\32\2\2\u0083\u0085\3\2"+
		"\2\2\u0084q\3\2\2\2\u0084y\3\2\2\2\u0085\u009c\3\2\2\2\u0086\u0087\7\64"+
		"\2\2\u0087\u009c\7>\2\2\u0088\u0089\7\65\2\2\u0089\u008e\5\f\7\2\u008a"+
		"\u008b\7\5\2\2\u008b\u008d\5\f\7\2\u008c\u008a\3\2\2\2\u008d\u0090\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u009c\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0092\7:\2\2\u0092\u0099\5\62\32\2\u0093\u0095\7"+
		";\2\2\u0094\u0096\5\16\b\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0093\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009bM\3\2\2\2\u009bZ\3\2"+
		"\2\2\u009b\\\3\2\2\2\u009bn\3\2\2\2\u009bp\3\2\2\2\u009b\u0086\3\2\2\2"+
		"\u009b\u0088\3\2\2\2\u009b\u0091\3\2\2\2\u009c\t\3\2\2\2\u009d\u009f\7"+
		"\27\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a6\5*\26\2\u00a1\u00a2\5*\26\2\u00a2\u00a3\7\4\2\2\u00a3\u00a4\5\20"+
		"\t\2\u00a4\u00a6\3\2\2\2\u00a5\u009e\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a6"+
		"\13\3\2\2\2\u00a7\u00a9\5\62\32\2\u00a8\u00aa\t\2\2\2\u00a9\u00a8\3\2"+
		"\2\2\u00a9\u00aa\3\2\2\2\u00aa\r\3\2\2\2\u00ab\u00ac\7*\2\2\u00ac\u00af"+
		"\5*\26\2\u00ad\u00af\7<\2\2\u00ae\u00ab\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af"+
		"\17\3\2\2\2\u00b0\u00b1\b\t\1\2\u00b1\u00b2\7\22\2\2\u00b2\u00f8\5\20"+
		"\t\37\u00b3\u00b4\7\60\2\2\u00b4\u00f8\5\20\t\36\u00b5\u00b7\7\67\2\2"+
		"\u00b6\u00b8\5 \21\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00bc\7$\2\2\u00bc"+
		"\u00be\5\20\t\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00f8\3"+
		"\2\2\2\u00bf\u00c0\7(\2\2\u00c0\u00c1\5\20\t\2\u00c1\u00c2\78\2\2\u00c2"+
		"\u00c3\5\20\t\2\u00c3\u00c4\7$\2\2\u00c4\u00c5\5\20\t\20\u00c5\u00f8\3"+
		"\2\2\2\u00c6\u00c7\7+\2\2\u00c7\u00cc\5\"\22\2\u00c8\u00c9\7\5\2\2\u00c9"+
		"\u00cb\5\"\22\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3"+
		"\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d0\7\3\2\2\u00d0\u00d1\5\20\t\17\u00d1\u00f8\3\2\2\2\u00d2\u00db\7"+
		"\r\2\2\u00d3\u00d8\5\22\n\2\u00d4\u00d5\7\5\2\2\u00d5\u00d7\5\22\n\2\u00d6"+
		"\u00d4\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00d3\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00f8\7\32\2\2\u00de\u00e7\7"+
		"\16\2\2\u00df\u00e4\5\20\t\2\u00e0\u00e1\7\5\2\2\u00e1\u00e3\5\20\t\2"+
		"\u00e2\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5"+
		"\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00df\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00f8\7\33\2\2\u00ea\u00eb\7"+
		"\17\2\2\u00eb\u00ec\5\20\t\2\u00ec\u00ed\7\34\2\2\u00ed\u00f8\3\2\2\2"+
		"\u00ee\u00f8\5\24\13\2\u00ef\u00f8\5\64\33\2\u00f0\u00f8\5,\27\2\u00f1"+
		"\u00f8\5\34\17\2\u00f2\u00f8\7E\2\2\u00f3\u00f8\t\3\2\2\u00f4\u00f8\7"+
		"\61\2\2\u00f5\u00f8\7C\2\2\u00f6\u00f8\5\36\20\2\u00f7\u00b0\3\2\2\2\u00f7"+
		"\u00b3\3\2\2\2\u00f7\u00b5\3\2\2\2\u00f7\u00bf\3\2\2\2\u00f7\u00c6\3\2"+
		"\2\2\u00f7\u00d2\3\2\2\2\u00f7\u00de\3\2\2\2\u00f7\u00ea\3\2\2\2\u00f7"+
		"\u00ee\3\2\2\2\u00f7\u00ef\3\2\2\2\u00f7\u00f0\3\2\2\2\u00f7\u00f1\3\2"+
		"\2\2\u00f7\u00f2\3\2\2\2\u00f7\u00f3\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u013a\3\2\2\2\u00f9\u00fa\f "+
		"\2\2\u00fa\u00fb\7\24\2\2\u00fb\u0139\5\20\t \u00fc\u00fd\f\31\2\2\u00fd"+
		"\u00fe\t\4\2\2\u00fe\u0139\5\20\t\32\u00ff\u0100\f\30\2\2\u0100\u0101"+
		"\t\5\2\2\u0101\u0139\5\20\t\31\u0102\u0103\f\27\2\2\u0103\u0104\t\6\2"+
		"\2\u0104\u0139\5\20\t\30\u0105\u0106\f\26\2\2\u0106\u0107\7\37\2\2\u0107"+
		"\u0139\5\20\t\27\u0108\u0109\f\25\2\2\u0109\u010a\7\62\2\2\u010a\u0139"+
		"\5\20\t\26\u010b\u010c\f\24\2\2\u010c\u010d\7\6\2\2\u010d\u0139\5\20\t"+
		"\25\u010e\u010f\f\23\2\2\u010f\u0110\7\t\2\2\u0110\u0139\5\20\t\24\u0111"+
		"\u0113\f\22\2\2\u0112\u0114\7\60\2\2\u0113\u0112\3\2\2\2\u0113\u0114\3"+
		"\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\7)\2\2\u0116\u0139\5\20\t\23\u0117"+
		"\u0118\f\35\2\2\u0118\u011b\7\b\2\2\u0119\u011c\5,\27\2\u011a\u011c\5"+
		"\24\13\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c\u0139\3\2\2\2\u011d"+
		"\u011e\f\34\2\2\u011e\u012b\7\16\2\2\u011f\u012c\5\20\t\2\u0120\u0122"+
		"\5\20\t\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2"+
		"\u0123\u0125\7\31\2\2\u0124\u0126\5\20\t\2\u0125\u0124\3\2\2\2\u0125\u0126"+
		"\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0128\7\4\2\2\u0128\u012a\5\20\t\2"+
		"\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u011f"+
		"\3\2\2\2\u012b\u0121\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0139\7\33\2\2"+
		"\u012e\u012f\f\33\2\2\u012f\u0130\7\31\2\2\u0130\u0133\5\20\t\2\u0131"+
		"\u0132\7\4\2\2\u0132\u0134\5\20\t\2\u0133\u0131\3\2\2\2\u0133\u0134\3"+
		"\2\2\2\u0134\u0139\3\2\2\2\u0135\u0136\f\32\2\2\u0136\u0137\7,\2\2\u0137"+
		"\u0139\5\36\20\2\u0138\u00f9\3\2\2\2\u0138\u00fc\3\2\2\2\u0138\u00ff\3"+
		"\2\2\2\u0138\u0102\3\2\2\2\u0138\u0105\3\2\2\2\u0138\u0108\3\2\2\2\u0138"+
		"\u010b\3\2\2\2\u0138\u010e\3\2\2\2\u0138\u0111\3\2\2\2\u0138\u0117\3\2"+
		"\2\2\u0138\u011d\3\2\2\2\u0138\u012e\3\2\2\2\u0138\u0135\3\2\2\2\u0139"+
		"\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\21\3\2\2"+
		"\2\u013c\u013a\3\2\2\2\u013d\u013e\5(\25\2\u013e\u013f\7\4\2\2\u013f\u0140"+
		"\5\20\t\2\u0140\23\3\2\2\2\u0141\u0142\5.\30\2\u0142\u014b\7\17\2\2\u0143"+
		"\u0148\5\26\f\2\u0144\u0145\7\5\2\2\u0145\u0147\5\26\f\2\u0146\u0144\3"+
		"\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u0143\3\2\2\2\u014b\u014c\3\2"+
		"\2\2\u014c\u014d\3\2\2\2\u014d\u014e\7\34\2\2\u014e\25\3\2\2\2\u014f\u0156"+
		"\5\20\t\2\u0150\u0151\5\60\31\2\u0151\u0152\7\4\2\2\u0152\u0153\5\20\t"+
		"\2\u0153\u0156\3\2\2\2\u0154\u0156\5\32\16\2\u0155\u014f\3\2\2\2\u0155"+
		"\u0150\3\2\2\2\u0155\u0154\3\2\2\2\u0156\27\3\2\2\2\u0157\u015a\5\64\33"+
		"\2\u0158\u015a\7\36\2\2\u0159\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015a"+
		"\31\3\2\2\2\u015b\u015c\5\30\r\2\u015c\u015d\7\3\2\2\u015d\u015e\5\20"+
		"\t\2\u015e\u016d\3\2\2\2\u015f\u0160\7\17\2\2\u0160\u0165\5\30\r\2\u0161"+
		"\u0162\7\5\2\2\u0162\u0164\5\30\r\2\u0163\u0161\3\2\2\2\u0164\u0167\3"+
		"\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0168\u0169\7\34\2\2\u0169\u016a\7\3\2\2\u016a\u016b\5"+
		"\20\t\2\u016b\u016d\3\2\2\2\u016c\u015b\3\2\2\2\u016c\u015f\3\2\2\2\u016d"+
		"\33\3\2\2\2\u016e\u016f\t\7\2\2\u016f\35\3\2\2\2\u0170\u0171\7=\2\2\u0171"+
		"\37\3\2\2\2\u0172\u0173\7\"\2\2\u0173\u0174\5\20\t\2\u0174\u0175\78\2"+
		"\2\u0175\u0176\5\20\t\2\u0176!\3\2\2\2\u0177\u0178\5\64\33\2\u0178\u0179"+
		"\7\4\2\2\u0179\u017a\5\20\t\2\u017a#\3\2\2\2\u017b\u0181\7D\2\2\u017c"+
		"\u017d\5&\24\2\u017d\u017e\7\b\2\2\u017e\u017f\7D\2\2\u017f\u0181\3\2"+
		"\2\2\u0180\u017b\3\2\2\2\u0180\u017c\3\2\2\2\u0181%\3\2\2\2\u0182\u0183"+
		"\7D\2\2\u0183\'\3\2\2\2\u0184\u0187\7E\2\2\u0185\u0187\5,\27\2\u0186\u0184"+
		"\3\2\2\2\u0186\u0185\3\2\2\2\u0187)\3\2\2\2\u0188\u018d\5(\25\2\u0189"+
		"\u018a\7\b\2\2\u018a\u018c\5(\25\2\u018b\u0189\3\2\2\2\u018c\u018f\3\2"+
		"\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e+\3\2\2\2\u018f\u018d"+
		"\3\2\2\2\u0190\u0191\7D\2\2\u0191-\3\2\2\2\u0192\u0193\7D\2\2\u0193/\3"+
		"\2\2\2\u0194\u0195\7D\2\2\u0195\61\3\2\2\2\u0196\u019b\5,\27\2\u0197\u0198"+
		"\7\b\2\2\u0198\u019a\5,\27\2\u0199\u0197\3\2\2\2\u019a\u019d\3\2\2\2\u019b"+
		"\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\63\3\2\2\2\u019d\u019b\3\2\2"+
		"\2\u019e\u019f\7F\2\2\u019f\65\3\2\2\2/;?JSXfiv\177\u0084\u008e\u0097"+
		"\u0099\u009b\u009e\u00a5\u00a9\u00ae\u00b9\u00bd\u00cc\u00d8\u00db\u00e4"+
		"\u00e7\u00f7\u0113\u011b\u0121\u0125\u0129\u012b\u0133\u0138\u013a\u0148"+
		"\u014b\u0155\u0159\u0165\u016c\u0180\u0186\u018d\u019b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}