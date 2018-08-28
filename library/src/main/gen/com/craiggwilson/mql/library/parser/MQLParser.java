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
		DELETE=33, DESC=34, ELSE=35, FALSE=36, FROM=37, GROUP=38, IF=39, IN=40, 
		INDEX=41, INSERT=42, INTO=43, LET=44, LIKE=45, LIMIT=46, LOOKUP=47, MANY=48, 
		MATCH=49, NOT=50, NULL=51, ONE=52, OR=53, PROJECT=54, SET=55, SKIP_=56, 
		SORT=57, STEP=58, SWITCH=59, THEN=60, TRUE=61, UNWIND=62, UPDATE=63, WITH=64, 
		PRESERVE_NULL_AND_EMPTY=65, REGEX=66, INT=67, DECIMAL=68, LONG=69, BIN=70, 
		HEX=71, OID=72, ID=73, STRING=74, VARIABLE_ID=75, WS=76, DATE_TIME=77;
	public static final int
		RULE_parse = 0, RULE_statement = 1, RULE_query_statement = 2, RULE_query_stage = 3, 
		RULE_project_item = 4, RULE_sort_field = 5, RULE_unwind_option = 6, RULE_expression = 7, 
		RULE_document = 8, RULE_field_assignment = 9, RULE_multipart_document = 10, 
		RULE_multipart_field_assignment = 11, RULE_function = 12, RULE_function_argument = 13, 
		RULE_lambda_argument = 14, RULE_lambda_expression = 15, RULE_switch_case = 16, 
		RULE_variable_assignment = 17, RULE_value = 18, RULE_number = 19, RULE_regex = 20, 
		RULE_collection_name = 21, RULE_database_name = 22, RULE_field_declaration = 23, 
		RULE_multipart_field_declaration = 24, RULE_field_name = 25, RULE_function_name = 26, 
		RULE_function_argument_name = 27, RULE_multipart_field_name = 28, RULE_variable_name = 29;
	public static final String[] ruleNames = {
		"parse", "statement", "query_statement", "query_stage", "project_item", 
		"sort_field", "unwind_option", "expression", "document", "field_assignment", 
		"multipart_document", "multipart_field_assignment", "function", "function_argument", 
		"lambda_argument", "lambda_expression", "switch_case", "variable_assignment", 
		"value", "number", "regex", "collection_name", "database_name", "field_declaration", 
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
		"RPAREN", "SEMI", "UNDERSCORE", "AND", "ASC", "BY", "CASE", "DELETE", 
		"DESC", "ELSE", "FALSE", "FROM", "GROUP", "IF", "IN", "INDEX", "INSERT", 
		"INTO", "LET", "LIKE", "LIMIT", "LOOKUP", "MANY", "MATCH", "NOT", "NULL", 
		"ONE", "OR", "PROJECT", "SET", "SKIP_", "SORT", "STEP", "SWITCH", "THEN", 
		"TRUE", "UNWIND", "UPDATE", "WITH", "PRESERVE_NULL_AND_EMPTY", "REGEX", 
		"INT", "DECIMAL", "LONG", "BIN", "HEX", "OID", "ID", "STRING", "VARIABLE_ID", 
		"WS", "DATE_TIME"
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
			setState(60);
			statement();
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(61);
					match(SEMI);
					setState(62);
					statement();
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(68);
				match(SEMI);
				}
			}

			setState(71);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryStatementContext extends StatementContext {
		public Query_statementContext query_statement() {
			return getRuleContext(Query_statementContext.class,0);
		}
		public QueryStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class DeleteStatementContext extends StatementContext {
		public TerminalNode DELETE() { return getToken(MQLParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(MQLParser.FROM, 0); }
		public Collection_nameContext collection_name() {
			return getRuleContext(Collection_nameContext.class,0);
		}
		public TerminalNode MATCH() { return getToken(MQLParser.MATCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ONE() { return getToken(MQLParser.ONE, 0); }
		public TerminalNode MANY() { return getToken(MQLParser.MANY, 0); }
		public DeleteStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class InsertStatementContext extends StatementContext {
		public TerminalNode INSERT() { return getToken(MQLParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(MQLParser.INTO, 0); }
		public Collection_nameContext collection_name() {
			return getRuleContext(Collection_nameContext.class,0);
		}
		public List<DocumentContext> document() {
			return getRuleContexts(DocumentContext.class);
		}
		public DocumentContext document(int i) {
			return getRuleContext(DocumentContext.class,i);
		}
		public TerminalNode LBRACK() { return getToken(MQLParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(MQLParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MQLParser.COMMA, i);
		}
		public InsertStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class UpdateStatementContext extends StatementContext {
		public TerminalNode UPDATE() { return getToken(MQLParser.UPDATE, 0); }
		public TerminalNode FROM() { return getToken(MQLParser.FROM, 0); }
		public Collection_nameContext collection_name() {
			return getRuleContext(Collection_nameContext.class,0);
		}
		public TerminalNode SET() { return getToken(MQLParser.SET, 0); }
		public Multipart_documentContext multipart_document() {
			return getRuleContext(Multipart_documentContext.class,0);
		}
		public TerminalNode MATCH() { return getToken(MQLParser.MATCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ONE() { return getToken(MQLParser.ONE, 0); }
		public TerminalNode MANY() { return getToken(MQLParser.MANY, 0); }
		public UpdateStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FROM:
				_localctx = new QueryStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				query_statement();
				}
				break;
			case INSERT:
				_localctx = new InsertStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(INSERT);
				setState(75);
				match(INTO);
				setState(76);
				collection_name();
				setState(89);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE:
					{
					setState(77);
					document();
					}
					break;
				case LBRACK:
					{
					setState(78);
					match(LBRACK);
					setState(79);
					document();
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(80);
						match(COMMA);
						setState(81);
						document();
						}
						}
						setState(86);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(87);
					match(RBRACK);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case DELETE:
				_localctx = new DeleteStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				match(DELETE);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MANY || _la==ONE) {
					{
					setState(92);
					_la = _input.LA(1);
					if ( !(_la==MANY || _la==ONE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(95);
				match(FROM);
				setState(96);
				collection_name();
				setState(97);
				match(MATCH);
				setState(98);
				expression(0);
				}
				break;
			case UPDATE:
				_localctx = new UpdateStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				match(UPDATE);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MANY || _la==ONE) {
					{
					setState(101);
					_la = _input.LA(1);
					if ( !(_la==MANY || _la==ONE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(104);
				match(FROM);
				setState(105);
				collection_name();
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MATCH) {
					{
					setState(106);
					match(MATCH);
					setState(107);
					expression(0);
					}
				}

				setState(110);
				match(SET);
				setState(111);
				multipart_document();
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

	public static class Query_statementContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(MQLParser.FROM, 0); }
		public Collection_nameContext collection_name() {
			return getRuleContext(Collection_nameContext.class,0);
		}
		public List<Query_stageContext> query_stage() {
			return getRuleContexts(Query_stageContext.class);
		}
		public Query_stageContext query_stage(int i) {
			return getRuleContext(Query_stageContext.class,i);
		}
		public Query_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_statement; }
	}

	public final Query_statementContext query_statement() throws RecognitionException {
		Query_statementContext _localctx = new Query_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_query_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(FROM);
			setState(116);
			collection_name();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GROUP) | (1L << LIMIT) | (1L << LOOKUP) | (1L << MATCH) | (1L << PROJECT) | (1L << SKIP_) | (1L << SORT) | (1L << UNWIND))) != 0)) {
				{
				{
				setState(117);
				query_stage();
				}
				}
				setState(122);
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

	public static class Query_stageContext extends ParserRuleContext {
		public Query_stageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_stage; }
	 
		public Query_stageContext() { }
		public void copyFrom(Query_stageContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SortStageContext extends Query_stageContext {
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
		public SortStageContext(Query_stageContext ctx) { copyFrom(ctx); }
	}
	public static class ProjectStageContext extends Query_stageContext {
		public TerminalNode PROJECT() { return getToken(MQLParser.PROJECT, 0); }
		public TerminalNode LBRACE() { return getToken(MQLParser.LBRACE, 0); }
		public List<Project_itemContext> project_item() {
			return getRuleContexts(Project_itemContext.class);
		}
		public Project_itemContext project_item(int i) {
			return getRuleContext(Project_itemContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(MQLParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MQLParser.COMMA, i);
		}
		public ProjectStageContext(Query_stageContext ctx) { copyFrom(ctx); }
	}
	public static class UnwindStageContext extends Query_stageContext {
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
		public UnwindStageContext(Query_stageContext ctx) { copyFrom(ctx); }
	}
	public static class LimitStageContext extends Query_stageContext {
		public TerminalNode LIMIT() { return getToken(MQLParser.LIMIT, 0); }
		public TerminalNode INT() { return getToken(MQLParser.INT, 0); }
		public LimitStageContext(Query_stageContext ctx) { copyFrom(ctx); }
	}
	public static class GroupStageContext extends Query_stageContext {
		public TerminalNode GROUP() { return getToken(MQLParser.GROUP, 0); }
		public TerminalNode LBRACE() { return getToken(MQLParser.LBRACE, 0); }
		public List<Field_assignmentContext> field_assignment() {
			return getRuleContexts(Field_assignmentContext.class);
		}
		public Field_assignmentContext field_assignment(int i) {
			return getRuleContext(Field_assignmentContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(MQLParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MQLParser.COMMA, i);
		}
		public TerminalNode BY() { return getToken(MQLParser.BY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GroupStageContext(Query_stageContext ctx) { copyFrom(ctx); }
	}
	public static class LookupStageContext extends Query_stageContext {
		public TerminalNode LOOKUP() { return getToken(MQLParser.LOOKUP, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(MQLParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(MQLParser.LBRACE, i);
		}
		public Multipart_field_declarationContext multipart_field_declaration() {
			return getRuleContext(Multipart_field_declarationContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MQLParser.COLON, 0); }
		public Query_statementContext query_statement() {
			return getRuleContext(Query_statementContext.class,0);
		}
		public List<TerminalNode> RBRACE() { return getTokens(MQLParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(MQLParser.RBRACE, i);
		}
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
		public LookupStageContext(Query_stageContext ctx) { copyFrom(ctx); }
	}
	public static class MatchStageContext extends Query_stageContext {
		public TerminalNode MATCH() { return getToken(MQLParser.MATCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MatchStageContext(Query_stageContext ctx) { copyFrom(ctx); }
	}
	public static class SkipStageContext extends Query_stageContext {
		public TerminalNode SKIP_() { return getToken(MQLParser.SKIP_, 0); }
		public TerminalNode INT() { return getToken(MQLParser.INT, 0); }
		public SkipStageContext(Query_stageContext ctx) { copyFrom(ctx); }
	}

	public final Query_stageContext query_stage() throws RecognitionException {
		Query_stageContext _localctx = new Query_stageContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_query_stage);
		int _la;
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GROUP:
				_localctx = new GroupStageContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(GROUP);
				setState(124);
				match(LBRACE);
				setState(125);
				field_assignment();
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(126);
					match(COMMA);
					setState(127);
					field_assignment();
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				match(RBRACE);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BY) {
					{
					setState(134);
					match(BY);
					setState(135);
					expression(0);
					}
				}

				}
				break;
			case LIMIT:
				_localctx = new LimitStageContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(LIMIT);
				setState(139);
				match(INT);
				}
				break;
			case LOOKUP:
				_localctx = new LookupStageContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(LOOKUP);
				setState(141);
				match(LBRACE);
				setState(142);
				multipart_field_declaration();
				setState(143);
				match(COLON);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(144);
					match(LBRACE);
					setState(145);
					variable_assignment();
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(146);
						match(COMMA);
						setState(147);
						variable_assignment();
						}
						}
						setState(152);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(153);
					match(RBRACE);
					setState(154);
					match(ARROW);
					}
				}

				setState(158);
				query_statement();
				setState(159);
				match(RBRACE);
				}
				break;
			case MATCH:
				_localctx = new MatchStageContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				match(MATCH);
				setState(162);
				expression(0);
				}
				break;
			case PROJECT:
				_localctx = new ProjectStageContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				match(PROJECT);
				setState(164);
				match(LBRACE);
				setState(165);
				project_item();
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(166);
					match(COMMA);
					setState(167);
					project_item();
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(173);
				match(RBRACE);
				}
				break;
			case SKIP_:
				_localctx = new SkipStageContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(175);
				match(SKIP_);
				setState(176);
				match(INT);
				}
				break;
			case SORT:
				_localctx = new SortStageContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(177);
				match(SORT);
				setState(178);
				sort_field();
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(179);
					match(COMMA);
					setState(180);
					sort_field();
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case UNWIND:
				_localctx = new UnwindStageContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(186);
				match(UNWIND);
				setState(187);
				multipart_field_name();
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(188);
					match(WITH);
					setState(190); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(189);
						unwind_option();
						}
						}
						setState(192); 
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
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXCLUDE) {
					{
					setState(198);
					match(EXCLUDE);
					}
				}

				setState(201);
				multipart_field_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				multipart_field_declaration();
				setState(203);
				match(COLON);
				setState(204);
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
			setState(208);
			multipart_field_name();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(209);
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
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDEX:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(INDEX);
				setState(213);
				multipart_field_declaration();
				}
				break;
			case PRESERVE_NULL_AND_EMPTY:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
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
	public static class ValueExpressionContext extends ExpressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
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
		public DocumentContext document() {
			return getRuleContext(DocumentContext.class,0);
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
	public static class LetExpressionContext extends ExpressionContext {
		public TerminalNode LBRACE() { return getToken(MQLParser.LBRACE, 0); }
		public List<Variable_assignmentContext> variable_assignment() {
			return getRuleContexts(Variable_assignmentContext.class);
		}
		public Variable_assignmentContext variable_assignment(int i) {
			return getRuleContext(Variable_assignmentContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(MQLParser.RBRACE, 0); }
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
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(218);
				match(MINUS);
				setState(219);
				expression(24);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				match(NOT);
				setState(221);
				expression(23);
				}
				break;
			case 3:
				{
				_localctx = new SwitchExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222);
				match(SWITCH);
				setState(224); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(223);
						switch_case();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(226); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(230);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(228);
					match(ELSE);
					setState(229);
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
				setState(232);
				match(IF);
				setState(233);
				expression(0);
				setState(234);
				match(THEN);
				setState(235);
				expression(0);
				setState(236);
				match(ELSE);
				setState(237);
				expression(9);
				}
				break;
			case 5:
				{
				_localctx = new LetExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239);
				match(LBRACE);
				setState(240);
				variable_assignment();
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(241);
					match(COMMA);
					setState(242);
					variable_assignment();
					}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(248);
				match(RBRACE);
				setState(249);
				match(ARROW);
				setState(250);
				expression(8);
				}
				break;
			case 6:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(252);
				match(LPAREN);
				setState(253);
				expression(0);
				setState(254);
				match(RPAREN);
				}
				break;
			case 7:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(256);
				function();
				}
				break;
			case 8:
				{
				_localctx = new FieldExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(257);
				field_name();
				}
				break;
			case 9:
				{
				_localctx = new VariableReferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258);
				variable_name();
				}
				break;
			case 10:
				{
				_localctx = new NewDocumentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(259);
				document();
				}
				break;
			case 11:
				{
				_localctx = new NewArrayExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(260);
				match(LBRACK);
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << LBRACK) | (1L << LPAREN) | (1L << MINUS) | (1L << FALSE) | (1L << IF) | (1L << NOT) | (1L << NULL) | (1L << SWITCH) | (1L << TRUE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (REGEX - 66)) | (1L << (INT - 66)) | (1L << (DECIMAL - 66)) | (1L << (LONG - 66)) | (1L << (BIN - 66)) | (1L << (HEX - 66)) | (1L << (OID - 66)) | (1L << (ID - 66)) | (1L << (STRING - 66)) | (1L << (VARIABLE_ID - 66)) | (1L << (DATE_TIME - 66)))) != 0)) {
					{
					setState(261);
					expression(0);
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(262);
						match(COMMA);
						setState(263);
						expression(0);
						}
						}
						setState(268);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(271);
				match(RBRACK);
				}
				break;
			case 12:
				{
				_localctx = new ValueExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(272);
				value();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(340);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(338);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(275);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(276);
						match(POWER);
						setState(277);
						expression(25);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(278);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(279);
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
						setState(280);
						expression(19);
						}
						break;
					case 3:
						{
						_localctx = new AdditionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(281);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(282);
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
						setState(283);
						expression(18);
						}
						break;
					case 4:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(284);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(285);
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
						setState(286);
						expression(17);
						}
						break;
					case 5:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(287);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(288);
						match(AND);
						setState(289);
						expression(16);
						}
						break;
					case 6:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(290);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(291);
						match(OR);
						setState(292);
						expression(15);
						}
						break;
					case 7:
						{
						_localctx = new ConcatExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(293);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(294);
						match(CONCAT);
						setState(295);
						expression(14);
						}
						break;
					case 8:
						{
						_localctx = new NullCoalesceExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(296);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(297);
						match(DQUESTION);
						setState(298);
						expression(13);
						}
						break;
					case 9:
						{
						_localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(299);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(301);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(300);
							match(NOT);
							}
						}

						setState(303);
						match(IN);
						setState(304);
						expression(12);
						}
						break;
					case 10:
						{
						_localctx = new MemberExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(305);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(306);
						match(DOT);
						setState(309);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
						case 1:
							{
							setState(307);
							field_name();
							}
							break;
						case 2:
							{
							setState(308);
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
						setState(311);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(312);
						match(LBRACK);
						setState(325);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
						case 1:
							{
							setState(313);
							((ArrayAccessExpressionContext)_localctx).start = expression(0);
							}
							break;
						case 2:
							{
							setState(315);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << LBRACK) | (1L << LPAREN) | (1L << MINUS) | (1L << FALSE) | (1L << IF) | (1L << NOT) | (1L << NULL) | (1L << SWITCH) | (1L << TRUE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (REGEX - 66)) | (1L << (INT - 66)) | (1L << (DECIMAL - 66)) | (1L << (LONG - 66)) | (1L << (BIN - 66)) | (1L << (HEX - 66)) | (1L << (OID - 66)) | (1L << (ID - 66)) | (1L << (STRING - 66)) | (1L << (VARIABLE_ID - 66)) | (1L << (DATE_TIME - 66)))) != 0)) {
								{
								setState(314);
								((ArrayAccessExpressionContext)_localctx).start = expression(0);
								}
							}

							setState(317);
							match(RANGE);
							setState(319);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << LBRACK) | (1L << LPAREN) | (1L << MINUS) | (1L << FALSE) | (1L << IF) | (1L << NOT) | (1L << NULL) | (1L << SWITCH) | (1L << TRUE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (REGEX - 66)) | (1L << (INT - 66)) | (1L << (DECIMAL - 66)) | (1L << (LONG - 66)) | (1L << (BIN - 66)) | (1L << (HEX - 66)) | (1L << (OID - 66)) | (1L << (ID - 66)) | (1L << (STRING - 66)) | (1L << (VARIABLE_ID - 66)) | (1L << (DATE_TIME - 66)))) != 0)) {
								{
								setState(318);
								((ArrayAccessExpressionContext)_localctx).end = expression(0);
								}
							}

							setState(323);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==COLON) {
								{
								setState(321);
								match(COLON);
								setState(322);
								((ArrayAccessExpressionContext)_localctx).step = expression(0);
								}
							}

							}
							break;
						}
						setState(327);
						match(RBRACK);
						}
						break;
					case 12:
						{
						_localctx = new RangeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(328);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(329);
						match(RANGE);
						setState(330);
						expression(0);
						setState(333);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
						case 1:
							{
							setState(331);
							match(COLON);
							setState(332);
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
						setState(335);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(336);
						match(LIKE);
						setState(337);
						regex();
						}
						break;
					}
					} 
				}
				setState(342);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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

	public static class DocumentContext extends ParserRuleContext {
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
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(LBRACE);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID || _la==STRING) {
				{
				setState(344);
				field_assignment();
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(345);
					match(COMMA);
					setState(346);
					field_assignment();
					}
					}
					setState(351);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(354);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
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
		enterRule(_localctx, 18, RULE_field_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			field_declaration();
			setState(357);
			match(COLON);
			setState(358);
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

	public static class Multipart_documentContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(MQLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MQLParser.RBRACE, 0); }
		public List<Multipart_field_assignmentContext> multipart_field_assignment() {
			return getRuleContexts(Multipart_field_assignmentContext.class);
		}
		public Multipart_field_assignmentContext multipart_field_assignment(int i) {
			return getRuleContext(Multipart_field_assignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MQLParser.COMMA, i);
		}
		public Multipart_documentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipart_document; }
	}

	public final Multipart_documentContext multipart_document() throws RecognitionException {
		Multipart_documentContext _localctx = new Multipart_documentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_multipart_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(LBRACE);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID || _la==STRING) {
				{
				setState(361);
				multipart_field_assignment();
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(362);
					match(COMMA);
					setState(363);
					multipart_field_assignment();
					}
					}
					setState(368);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(371);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multipart_field_assignmentContext extends ParserRuleContext {
		public Multipart_field_declarationContext multipart_field_declaration() {
			return getRuleContext(Multipart_field_declarationContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MQLParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Multipart_field_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipart_field_assignment; }
	}

	public final Multipart_field_assignmentContext multipart_field_assignment() throws RecognitionException {
		Multipart_field_assignmentContext _localctx = new Multipart_field_assignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_multipart_field_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			multipart_field_declaration();
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
		enterRule(_localctx, 24, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			function_name();
			setState(378);
			match(LPAREN);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << LBRACK) | (1L << LPAREN) | (1L << MINUS) | (1L << UNDERSCORE) | (1L << FALSE) | (1L << IF) | (1L << NOT) | (1L << NULL) | (1L << SWITCH) | (1L << TRUE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (REGEX - 66)) | (1L << (INT - 66)) | (1L << (DECIMAL - 66)) | (1L << (LONG - 66)) | (1L << (BIN - 66)) | (1L << (HEX - 66)) | (1L << (OID - 66)) | (1L << (ID - 66)) | (1L << (STRING - 66)) | (1L << (VARIABLE_ID - 66)) | (1L << (DATE_TIME - 66)))) != 0)) {
				{
				setState(379);
				function_argument();
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(380);
					match(COMMA);
					setState(381);
					function_argument();
					}
					}
					setState(386);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(389);
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
		enterRule(_localctx, 26, RULE_function_argument);
		try {
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				function_argument_name();
				setState(393);
				match(COLON);
				setState(394);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
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
		enterRule(_localctx, 28, RULE_lambda_argument);
		try {
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				variable_name();
				}
				break;
			case UNDERSCORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
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
		enterRule(_localctx, 30, RULE_lambda_expression);
		int _la;
		try {
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNDERSCORE:
			case VARIABLE_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				lambda_argument();
				setState(404);
				match(ARROW);
				setState(405);
				expression(0);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				match(LPAREN);
				setState(408);
				lambda_argument();
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(409);
					match(COMMA);
					setState(410);
					lambda_argument();
					}
					}
					setState(415);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(416);
				match(RPAREN);
				setState(417);
				match(ARROW);
				setState(418);
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
		enterRule(_localctx, 32, RULE_switch_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(CASE);
			setState(423);
			expression(0);
			setState(424);
			match(THEN);
			setState(425);
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
		enterRule(_localctx, 34, RULE_variable_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			variable_name();
			setState(428);
			match(COLON);
			setState(429);
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

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringValueContext extends ValueContext {
		public TerminalNode STRING() { return getToken(MQLParser.STRING, 0); }
		public StringValueContext(ValueContext ctx) { copyFrom(ctx); }
	}
	public static class DateTimeValueContext extends ValueContext {
		public TerminalNode DATE_TIME() { return getToken(MQLParser.DATE_TIME, 0); }
		public DateTimeValueContext(ValueContext ctx) { copyFrom(ctx); }
	}
	public static class OidValueContext extends ValueContext {
		public TerminalNode OID() { return getToken(MQLParser.OID, 0); }
		public OidValueContext(ValueContext ctx) { copyFrom(ctx); }
	}
	public static class BooleanValueContext extends ValueContext {
		public TerminalNode TRUE() { return getToken(MQLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MQLParser.FALSE, 0); }
		public BooleanValueContext(ValueContext ctx) { copyFrom(ctx); }
	}
	public static class NumberValueContext extends ValueContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumberValueContext(ValueContext ctx) { copyFrom(ctx); }
	}
	public static class RegexValueContext extends ValueContext {
		public RegexContext regex() {
			return getRuleContext(RegexContext.class,0);
		}
		public RegexValueContext(ValueContext ctx) { copyFrom(ctx); }
	}
	public static class NullValueContext extends ValueContext {
		public TerminalNode NULL() { return getToken(MQLParser.NULL, 0); }
		public NullValueContext(ValueContext ctx) { copyFrom(ctx); }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_value);
		int _la;
		try {
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DECIMAL:
			case LONG:
			case BIN:
			case HEX:
				_localctx = new NumberValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				number();
				}
				break;
			case STRING:
				_localctx = new StringValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				match(STRING);
				}
				break;
			case FALSE:
			case TRUE:
				_localctx = new BooleanValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(433);
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
			case NULL:
				_localctx = new NullValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(434);
				match(NULL);
				}
				break;
			case OID:
				_localctx = new OidValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(435);
				match(OID);
				}
				break;
			case DATE_TIME:
				_localctx = new DateTimeValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(436);
				match(DATE_TIME);
				}
				break;
			case REGEX:
				_localctx = new RegexValueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(437);
				regex();
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
		enterRule(_localctx, 38, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (INT - 67)) | (1L << (DECIMAL - 67)) | (1L << (LONG - 67)) | (1L << (BIN - 67)) | (1L << (HEX - 67)))) != 0)) ) {
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
		enterRule(_localctx, 40, RULE_regex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
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
		enterRule(_localctx, 42, RULE_collection_name);
		try {
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				database_name();
				setState(446);
				match(DOT);
				setState(447);
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
		enterRule(_localctx, 44, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
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
		enterRule(_localctx, 46, RULE_field_declaration);
		try {
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				match(STRING);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
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
		enterRule(_localctx, 48, RULE_multipart_field_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			field_declaration();
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(458);
				match(DOT);
				setState(459);
				field_declaration();
				}
				}
				setState(464);
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
		enterRule(_localctx, 50, RULE_field_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
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
		enterRule(_localctx, 52, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
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
		enterRule(_localctx, 54, RULE_function_argument_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
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
		enterRule(_localctx, 56, RULE_multipart_field_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			field_name();
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(472);
				match(DOT);
				setState(473);
				field_name();
				}
				}
				setState(478);
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
		enterRule(_localctx, 58, RULE_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
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
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 22);
		case 10:
			return precpred(_ctx, 21);
		case 11:
			return precpred(_ctx, 20);
		case 12:
			return precpred(_ctx, 19);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3O\u01e4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\7\2B\n\2\f\2\16\2E\13\2\3\2\5\2H\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\7\3U\n\3\f\3\16\3X\13\3\3\3\3\3\5\3\\\n\3\3\3\3\3\5\3`"+
		"\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3i\n\3\3\3\3\3\3\3\3\3\5\3o\n\3\3\3"+
		"\3\3\3\3\5\3t\n\3\3\4\3\4\3\4\7\4y\n\4\f\4\16\4|\13\4\3\5\3\5\3\5\3\5"+
		"\3\5\7\5\u0083\n\5\f\5\16\5\u0086\13\5\3\5\3\5\3\5\5\5\u008b\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0097\n\5\f\5\16\5\u009a\13\5\3"+
		"\5\3\5\3\5\5\5\u009f\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00ab"+
		"\n\5\f\5\16\5\u00ae\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00b8\n\5"+
		"\f\5\16\5\u00bb\13\5\3\5\3\5\3\5\3\5\6\5\u00c1\n\5\r\5\16\5\u00c2\5\5"+
		"\u00c5\n\5\5\5\u00c7\n\5\3\6\5\6\u00ca\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u00d1"+
		"\n\6\3\7\3\7\5\7\u00d5\n\7\3\b\3\b\3\b\5\b\u00da\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\6\t\u00e3\n\t\r\t\16\t\u00e4\3\t\3\t\5\t\u00e9\n\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00f6\n\t\f\t\16\t\u00f9\13\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u010b"+
		"\n\t\f\t\16\t\u010e\13\t\5\t\u0110\n\t\3\t\3\t\5\t\u0114\n\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0130\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0138"+
		"\n\t\3\t\3\t\3\t\3\t\5\t\u013e\n\t\3\t\3\t\5\t\u0142\n\t\3\t\3\t\5\t\u0146"+
		"\n\t\5\t\u0148\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0150\n\t\3\t\3\t\3\t\7"+
		"\t\u0155\n\t\f\t\16\t\u0158\13\t\3\n\3\n\3\n\3\n\7\n\u015e\n\n\f\n\16"+
		"\n\u0161\13\n\5\n\u0163\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\7\f\u016f\n\f\f\f\16\f\u0172\13\f\5\f\u0174\n\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\7\16\u0181\n\16\f\16\16\16\u0184\13\16\5"+
		"\16\u0186\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0190\n\17"+
		"\3\20\3\20\5\20\u0194\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21"+
		"\u019e\n\21\f\21\16\21\u01a1\13\21\3\21\3\21\3\21\3\21\5\21\u01a7\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u01b9\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u01c4\n\27\3\30\3\30\3\31\3\31\5\31\u01ca\n\31\3\32\3\32\3\32\7"+
		"\32\u01cf\n\32\f\32\16\32\u01d2\13\32\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\36\7\36\u01dd\n\36\f\36\16\36\u01e0\13\36\3\37\3\37\3\37\2"+
		"\3\20 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		"\2\t\4\2\62\62\66\66\4\2  $$\5\2\7\7\23\23\25\25\4\2\22\22\30\30\5\2\n"+
		"\f\20\21\26\26\4\2&&??\3\2EI\2\u021c\2>\3\2\2\2\4s\3\2\2\2\6u\3\2\2\2"+
		"\b\u00c6\3\2\2\2\n\u00d0\3\2\2\2\f\u00d2\3\2\2\2\16\u00d9\3\2\2\2\20\u0113"+
		"\3\2\2\2\22\u0159\3\2\2\2\24\u0166\3\2\2\2\26\u016a\3\2\2\2\30\u0177\3"+
		"\2\2\2\32\u017b\3\2\2\2\34\u018f\3\2\2\2\36\u0193\3\2\2\2 \u01a6\3\2\2"+
		"\2\"\u01a8\3\2\2\2$\u01ad\3\2\2\2&\u01b8\3\2\2\2(\u01ba\3\2\2\2*\u01bc"+
		"\3\2\2\2,\u01c3\3\2\2\2.\u01c5\3\2\2\2\60\u01c9\3\2\2\2\62\u01cb\3\2\2"+
		"\2\64\u01d3\3\2\2\2\66\u01d5\3\2\2\28\u01d7\3\2\2\2:\u01d9\3\2\2\2<\u01e1"+
		"\3\2\2\2>C\5\4\3\2?@\7\35\2\2@B\5\4\3\2A?\3\2\2\2BE\3\2\2\2CA\3\2\2\2"+
		"CD\3\2\2\2DG\3\2\2\2EC\3\2\2\2FH\7\35\2\2GF\3\2\2\2GH\3\2\2\2HI\3\2\2"+
		"\2IJ\7\2\2\3J\3\3\2\2\2Kt\5\6\4\2LM\7,\2\2MN\7-\2\2N[\5,\27\2O\\\5\22"+
		"\n\2PQ\7\16\2\2QV\5\22\n\2RS\7\5\2\2SU\5\22\n\2TR\3\2\2\2UX\3\2\2\2VT"+
		"\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7\33\2\2Z\\\3\2\2\2[O\3\2\2\2"+
		"[P\3\2\2\2\\t\3\2\2\2]_\7#\2\2^`\t\2\2\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2"+
		"ab\7\'\2\2bc\5,\27\2cd\7\63\2\2de\5\20\t\2et\3\2\2\2fh\7A\2\2gi\t\2\2"+
		"\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7\'\2\2kn\5,\27\2lm\7\63\2\2mo\5\20"+
		"\t\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\79\2\2qr\5\26\f\2rt\3\2\2\2sK\3\2"+
		"\2\2sL\3\2\2\2s]\3\2\2\2sf\3\2\2\2t\5\3\2\2\2uv\7\'\2\2vz\5,\27\2wy\5"+
		"\b\5\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\7\3\2\2\2|z\3\2\2\2}~"+
		"\7(\2\2~\177\7\r\2\2\177\u0084\5\24\13\2\u0080\u0081\7\5\2\2\u0081\u0083"+
		"\5\24\13\2\u0082\u0080\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2"+
		"\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u008a"+
		"\7\32\2\2\u0088\u0089\7!\2\2\u0089\u008b\5\20\t\2\u008a\u0088\3\2\2\2"+
		"\u008a\u008b\3\2\2\2\u008b\u00c7\3\2\2\2\u008c\u008d\7\60\2\2\u008d\u00c7"+
		"\7E\2\2\u008e\u008f\7\61\2\2\u008f\u0090\7\r\2\2\u0090\u0091\5\62\32\2"+
		"\u0091\u009e\7\4\2\2\u0092\u0093\7\r\2\2\u0093\u0098\5$\23\2\u0094\u0095"+
		"\7\5\2\2\u0095\u0097\5$\23\2\u0096\u0094\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009b\u009c\7\32\2\2\u009c\u009d\7\3\2\2\u009d\u009f\3\2\2\2\u009e"+
		"\u0092\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\5\6"+
		"\4\2\u00a1\u00a2\7\32\2\2\u00a2\u00c7\3\2\2\2\u00a3\u00a4\7\63\2\2\u00a4"+
		"\u00c7\5\20\t\2\u00a5\u00a6\78\2\2\u00a6\u00a7\7\r\2\2\u00a7\u00ac\5\n"+
		"\6\2\u00a8\u00a9\7\5\2\2\u00a9\u00ab\5\n\6\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\32\2\2\u00b0\u00c7\3\2\2\2\u00b1"+
		"\u00b2\7:\2\2\u00b2\u00c7\7E\2\2\u00b3\u00b4\7;\2\2\u00b4\u00b9\5\f\7"+
		"\2\u00b5\u00b6\7\5\2\2\u00b6\u00b8\5\f\7\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb"+
		"\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00c7\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00bd\7@\2\2\u00bd\u00c4\5:\36\2\u00be\u00c0\7B\2"+
		"\2\u00bf\u00c1\5\16\b\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00be\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6}\3\2\2\2\u00c6\u008c"+
		"\3\2\2\2\u00c6\u008e\3\2\2\2\u00c6\u00a3\3\2\2\2\u00c6\u00a5\3\2\2\2\u00c6"+
		"\u00b1\3\2\2\2\u00c6\u00b3\3\2\2\2\u00c6\u00bc\3\2\2\2\u00c7\t\3\2\2\2"+
		"\u00c8\u00ca\7\27\2\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00d1\5\62\32\2\u00cc\u00cd\5\62\32\2\u00cd\u00ce\7\4\2"+
		"\2\u00ce\u00cf\5\20\t\2\u00cf\u00d1\3\2\2\2\u00d0\u00c9\3\2\2\2\u00d0"+
		"\u00cc\3\2\2\2\u00d1\13\3\2\2\2\u00d2\u00d4\5:\36\2\u00d3\u00d5\t\3\2"+
		"\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\r\3\2\2\2\u00d6\u00d7"+
		"\7+\2\2\u00d7\u00da\5\62\32\2\u00d8\u00da\7C\2\2\u00d9\u00d6\3\2\2\2\u00d9"+
		"\u00d8\3\2\2\2\u00da\17\3\2\2\2\u00db\u00dc\b\t\1\2\u00dc\u00dd\7\22\2"+
		"\2\u00dd\u0114\5\20\t\32\u00de\u00df\7\64\2\2\u00df\u0114\5\20\t\31\u00e0"+
		"\u00e2\7=\2\2\u00e1\u00e3\5\"\22\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6"+
		"\u00e7\7%\2\2\u00e7\u00e9\5\20\t\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\u0114\3\2\2\2\u00ea\u00eb\7)\2\2\u00eb\u00ec\5\20\t\2\u00ec"+
		"\u00ed\7>\2\2\u00ed\u00ee\5\20\t\2\u00ee\u00ef\7%\2\2\u00ef\u00f0\5\20"+
		"\t\13\u00f0\u0114\3\2\2\2\u00f1\u00f2\7\r\2\2\u00f2\u00f7\5$\23\2\u00f3"+
		"\u00f4\7\5\2\2\u00f4\u00f6\5$\23\2\u00f5\u00f3\3\2\2\2\u00f6\u00f9\3\2"+
		"\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00fa\u00fb\7\32\2\2\u00fb\u00fc\7\3\2\2\u00fc\u00fd\5"+
		"\20\t\n\u00fd\u0114\3\2\2\2\u00fe\u00ff\7\17\2\2\u00ff\u0100\5\20\t\2"+
		"\u0100\u0101\7\34\2\2\u0101\u0114\3\2\2\2\u0102\u0114\5\32\16\2\u0103"+
		"\u0114\5\64\33\2\u0104\u0114\5<\37\2\u0105\u0114\5\22\n\2\u0106\u010f"+
		"\7\16\2\2\u0107\u010c\5\20\t\2\u0108\u0109\7\5\2\2\u0109\u010b\5\20\t"+
		"\2\u010a\u0108\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d"+
		"\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0107\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0114\7\33\2\2\u0112\u0114\5"+
		"&\24\2\u0113\u00db\3\2\2\2\u0113\u00de\3\2\2\2\u0113\u00e0\3\2\2\2\u0113"+
		"\u00ea\3\2\2\2\u0113\u00f1\3\2\2\2\u0113\u00fe\3\2\2\2\u0113\u0102\3\2"+
		"\2\2\u0113\u0103\3\2\2\2\u0113\u0104\3\2\2\2\u0113\u0105\3\2\2\2\u0113"+
		"\u0106\3\2\2\2\u0113\u0112\3\2\2\2\u0114\u0156\3\2\2\2\u0115\u0116\f\33"+
		"\2\2\u0116\u0117\7\24\2\2\u0117\u0155\5\20\t\33\u0118\u0119\f\24\2\2\u0119"+
		"\u011a\t\4\2\2\u011a\u0155\5\20\t\25\u011b\u011c\f\23\2\2\u011c\u011d"+
		"\t\5\2\2\u011d\u0155\5\20\t\24\u011e\u011f\f\22\2\2\u011f\u0120\t\6\2"+
		"\2\u0120\u0155\5\20\t\23\u0121\u0122\f\21\2\2\u0122\u0123\7\37\2\2\u0123"+
		"\u0155\5\20\t\22\u0124\u0125\f\20\2\2\u0125\u0126\7\67\2\2\u0126\u0155"+
		"\5\20\t\21\u0127\u0128\f\17\2\2\u0128\u0129\7\6\2\2\u0129\u0155\5\20\t"+
		"\20\u012a\u012b\f\16\2\2\u012b\u012c\7\t\2\2\u012c\u0155\5\20\t\17\u012d"+
		"\u012f\f\r\2\2\u012e\u0130\7\64\2\2\u012f\u012e\3\2\2\2\u012f\u0130\3"+
		"\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\7*\2\2\u0132\u0155\5\20\t\16\u0133"+
		"\u0134\f\30\2\2\u0134\u0137\7\b\2\2\u0135\u0138\5\64\33\2\u0136\u0138"+
		"\5\32\16\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138\u0155\3\2\2\2"+
		"\u0139\u013a\f\27\2\2\u013a\u0147\7\16\2\2\u013b\u0148\5\20\t\2\u013c"+
		"\u013e\5\20\t\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3"+
		"\2\2\2\u013f\u0141\7\31\2\2\u0140\u0142\5\20\t\2\u0141\u0140\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0144\7\4\2\2\u0144\u0146\5\20"+
		"\t\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2\2\2\u0147"+
		"\u013b\3\2\2\2\u0147\u013d\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0155\7\33"+
		"\2\2\u014a\u014b\f\26\2\2\u014b\u014c\7\31\2\2\u014c\u014f\5\20\t\2\u014d"+
		"\u014e\7\4\2\2\u014e\u0150\5\20\t\2\u014f\u014d\3\2\2\2\u014f\u0150\3"+
		"\2\2\2\u0150\u0155\3\2\2\2\u0151\u0152\f\25\2\2\u0152\u0153\7/\2\2\u0153"+
		"\u0155\5*\26\2\u0154\u0115\3\2\2\2\u0154\u0118\3\2\2\2\u0154\u011b\3\2"+
		"\2\2\u0154\u011e\3\2\2\2\u0154\u0121\3\2\2\2\u0154\u0124\3\2\2\2\u0154"+
		"\u0127\3\2\2\2\u0154\u012a\3\2\2\2\u0154\u012d\3\2\2\2\u0154\u0133\3\2"+
		"\2\2\u0154\u0139\3\2\2\2\u0154\u014a\3\2\2\2\u0154\u0151\3\2\2\2\u0155"+
		"\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\21\3\2\2"+
		"\2\u0158\u0156\3\2\2\2\u0159\u0162\7\r\2\2\u015a\u015f\5\24\13\2\u015b"+
		"\u015c\7\5\2\2\u015c\u015e\5\24\13\2\u015d\u015b\3\2\2\2\u015e\u0161\3"+
		"\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0163\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0162\u015a\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2"+
		"\2\2\u0164\u0165\7\32\2\2\u0165\23\3\2\2\2\u0166\u0167\5\60\31\2\u0167"+
		"\u0168\7\4\2\2\u0168\u0169\5\20\t\2\u0169\25\3\2\2\2\u016a\u0173\7\r\2"+
		"\2\u016b\u0170\5\30\r\2\u016c\u016d\7\5\2\2\u016d\u016f\5\30\r\2\u016e"+
		"\u016c\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2"+
		"\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u016b\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\7\32\2\2\u0176\27\3\2\2"+
		"\2\u0177\u0178\5\62\32\2\u0178\u0179\7\4\2\2\u0179\u017a\5\20\t\2\u017a"+
		"\31\3\2\2\2\u017b\u017c\5\66\34\2\u017c\u0185\7\17\2\2\u017d\u0182\5\34"+
		"\17\2\u017e\u017f\7\5\2\2\u017f\u0181\5\34\17\2\u0180\u017e\3\2\2\2\u0181"+
		"\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0186\3\2"+
		"\2\2\u0184\u0182\3\2\2\2\u0185\u017d\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\u0187\3\2\2\2\u0187\u0188\7\34\2\2\u0188\33\3\2\2\2\u0189\u0190\5\20"+
		"\t\2\u018a\u018b\58\35\2\u018b\u018c\7\4\2\2\u018c\u018d\5\20\t\2\u018d"+
		"\u0190\3\2\2\2\u018e\u0190\5 \21\2\u018f\u0189\3\2\2\2\u018f\u018a\3\2"+
		"\2\2\u018f\u018e\3\2\2\2\u0190\35\3\2\2\2\u0191\u0194\5<\37\2\u0192\u0194"+
		"\7\36\2\2\u0193\u0191\3\2\2\2\u0193\u0192\3\2\2\2\u0194\37\3\2\2\2\u0195"+
		"\u0196\5\36\20\2\u0196\u0197\7\3\2\2\u0197\u0198\5\20\t\2\u0198\u01a7"+
		"\3\2\2\2\u0199\u019a\7\17\2\2\u019a\u019f\5\36\20\2\u019b\u019c\7\5\2"+
		"\2\u019c\u019e\5\36\20\2\u019d\u019b\3\2\2\2\u019e\u01a1\3\2\2\2\u019f"+
		"\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1\u019f\3\2"+
		"\2\2\u01a2\u01a3\7\34\2\2\u01a3\u01a4\7\3\2\2\u01a4\u01a5\5\20\t\2\u01a5"+
		"\u01a7\3\2\2\2\u01a6\u0195\3\2\2\2\u01a6\u0199\3\2\2\2\u01a7!\3\2\2\2"+
		"\u01a8\u01a9\7\"\2\2\u01a9\u01aa\5\20\t\2\u01aa\u01ab\7>\2\2\u01ab\u01ac"+
		"\5\20\t\2\u01ac#\3\2\2\2\u01ad\u01ae\5<\37\2\u01ae\u01af\7\4\2\2\u01af"+
		"\u01b0\5\20\t\2\u01b0%\3\2\2\2\u01b1\u01b9\5(\25\2\u01b2\u01b9\7L\2\2"+
		"\u01b3\u01b9\t\7\2\2\u01b4\u01b9\7\65\2\2\u01b5\u01b9\7J\2\2\u01b6\u01b9"+
		"\7O\2\2\u01b7\u01b9\5*\26\2\u01b8\u01b1\3\2\2\2\u01b8\u01b2\3\2\2\2\u01b8"+
		"\u01b3\3\2\2\2\u01b8\u01b4\3\2\2\2\u01b8\u01b5\3\2\2\2\u01b8\u01b6\3\2"+
		"\2\2\u01b8\u01b7\3\2\2\2\u01b9\'\3\2\2\2\u01ba\u01bb\t\b\2\2\u01bb)\3"+
		"\2\2\2\u01bc\u01bd\7D\2\2\u01bd+\3\2\2\2\u01be\u01c4\7K\2\2\u01bf\u01c0"+
		"\5.\30\2\u01c0\u01c1\7\b\2\2\u01c1\u01c2\7K\2\2\u01c2\u01c4\3\2\2\2\u01c3"+
		"\u01be\3\2\2\2\u01c3\u01bf\3\2\2\2\u01c4-\3\2\2\2\u01c5\u01c6\7K\2\2\u01c6"+
		"/\3\2\2\2\u01c7\u01ca\7L\2\2\u01c8\u01ca\5\64\33\2\u01c9\u01c7\3\2\2\2"+
		"\u01c9\u01c8\3\2\2\2\u01ca\61\3\2\2\2\u01cb\u01d0\5\60\31\2\u01cc\u01cd"+
		"\7\b\2\2\u01cd\u01cf\5\60\31\2\u01ce\u01cc\3\2\2\2\u01cf\u01d2\3\2\2\2"+
		"\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\63\3\2\2\2\u01d2\u01d0"+
		"\3\2\2\2\u01d3\u01d4\7K\2\2\u01d4\65\3\2\2\2\u01d5\u01d6\7K\2\2\u01d6"+
		"\67\3\2\2\2\u01d7\u01d8\7K\2\2\u01d89\3\2\2\2\u01d9\u01de\5\64\33\2\u01da"+
		"\u01db\7\b\2\2\u01db\u01dd\5\64\33\2\u01dc\u01da\3\2\2\2\u01dd\u01e0\3"+
		"\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df;\3\2\2\2\u01e0\u01de"+
		"\3\2\2\2\u01e1\u01e2\7M\2\2\u01e2=\3\2\2\2\66CGV[_hnsz\u0084\u008a\u0098"+
		"\u009e\u00ac\u00b9\u00c2\u00c4\u00c6\u00c9\u00d0\u00d4\u00d9\u00e4\u00e8"+
		"\u00f7\u010c\u010f\u0113\u012f\u0137\u013d\u0141\u0145\u0147\u014f\u0154"+
		"\u0156\u015f\u0162\u0170\u0173\u0182\u0185\u018f\u0193\u019f\u01a6\u01b8"+
		"\u01c3\u01c9\u01d0\u01de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}