// Generated from c:\projects\craiggwilson\mql\internal\grammar\MQL.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

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
		MATCH=49, NOR=50, NOT=51, NULL=52, ONE=53, OR=54, PROJECT=55, SET=56, 
		SKIP_=57, SORT=58, STEP=59, SWITCH=60, THEN=61, TRUE=62, UNWIND=63, UPDATE=64, 
		WITH=65, PRESERVE_NULL_AND_EMPTY=66, REGEX=67, INT=68, DOUBLE=69, DECIMAL=70, 
		LONG=71, BIN=72, LONG_BIN=73, HEX=74, LONG_HEX=75, OID=76, ID=77, STRING=78, 
		VARIABLE_ID=79, WS=80, DATE_TIME=81;
	public static final int
		RULE_queryStatement = 0, RULE_queryStage = 1, RULE_projectItem = 2, RULE_sortField = 3, 
		RULE_unwindOption = 4, RULE_expression = 5, RULE_document = 6, RULE_fieldAssignment = 7, 
		RULE_multipart_document = 8, RULE_multipartFieldAssignment = 9, RULE_function = 10, 
		RULE_functionArgument = 11, RULE_lambdaArgument = 12, RULE_lambdaExpression = 13, 
		RULE_switchCase = 14, RULE_variableAssignment = 15, RULE_value = 16, RULE_number = 17, 
		RULE_collectionName = 18, RULE_databaseName = 19, RULE_fieldDeclaration = 20, 
		RULE_fieldName = 21, RULE_functionName = 22, RULE_functionArgumentName = 23, 
		RULE_multipartFieldDeclaration = 24, RULE_multipartFieldName = 25, RULE_variableName = 26;
	public static final String[] ruleNames = {
		"queryStatement", "queryStage", "projectItem", "sortField", "unwindOption", 
		"expression", "document", "fieldAssignment", "multipart_document", "multipartFieldAssignment", 
		"function", "functionArgument", "lambdaArgument", "lambdaExpression", 
		"switchCase", "variableAssignment", "value", "number", "collectionName", 
		"databaseName", "fieldDeclaration", "fieldName", "functionName", "functionArgumentName", 
		"multipartFieldDeclaration", "multipartFieldName", "variableName"
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
		"INTO", "LET", "LIKE", "LIMIT", "LOOKUP", "MANY", "MATCH", "NOR", "NOT", 
		"NULL", "ONE", "OR", "PROJECT", "SET", "SKIP_", "SORT", "STEP", "SWITCH", 
		"THEN", "TRUE", "UNWIND", "UPDATE", "WITH", "PRESERVE_NULL_AND_EMPTY", 
		"REGEX", "INT", "DOUBLE", "DECIMAL", "LONG", "BIN", "LONG_BIN", "HEX", 
		"LONG_HEX", "OID", "ID", "STRING", "VARIABLE_ID", "WS", "DATE_TIME"
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
	public static class QueryStatementContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(MQLParser.FROM, 0); }
		public CollectionNameContext collectionName() {
			return getRuleContext(CollectionNameContext.class,0);
		}
		public List<QueryStageContext> queryStage() {
			return getRuleContexts(QueryStageContext.class);
		}
		public QueryStageContext queryStage(int i) {
			return getRuleContext(QueryStageContext.class,i);
		}
		public QueryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryStatement; }
	}

	public final QueryStatementContext queryStatement() throws RecognitionException {
		QueryStatementContext _localctx = new QueryStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_queryStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(FROM);
			setState(55);
			collectionName();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GROUP) | (1L << LIMIT) | (1L << LOOKUP) | (1L << MATCH) | (1L << PROJECT) | (1L << SKIP_) | (1L << SORT) | (1L << UNWIND))) != 0)) {
				{
				{
				setState(56);
				queryStage();
				}
				}
				setState(61);
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

	public static class QueryStageContext extends ParserRuleContext {
		public QueryStageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryStage; }
	 
		public QueryStageContext() { }
		public void copyFrom(QueryStageContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SortStageContext extends QueryStageContext {
		public TerminalNode SORT() { return getToken(MQLParser.SORT, 0); }
		public List<SortFieldContext> sortField() {
			return getRuleContexts(SortFieldContext.class);
		}
		public SortFieldContext sortField(int i) {
			return getRuleContext(SortFieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MQLParser.COMMA, i);
		}
		public SortStageContext(QueryStageContext ctx) { copyFrom(ctx); }
	}
	public static class ProjectStageContext extends QueryStageContext {
		public TerminalNode PROJECT() { return getToken(MQLParser.PROJECT, 0); }
		public TerminalNode LBRACE() { return getToken(MQLParser.LBRACE, 0); }
		public List<ProjectItemContext> projectItem() {
			return getRuleContexts(ProjectItemContext.class);
		}
		public ProjectItemContext projectItem(int i) {
			return getRuleContext(ProjectItemContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(MQLParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MQLParser.COMMA, i);
		}
		public ProjectStageContext(QueryStageContext ctx) { copyFrom(ctx); }
	}
	public static class UnwindStageContext extends QueryStageContext {
		public TerminalNode UNWIND() { return getToken(MQLParser.UNWIND, 0); }
		public MultipartFieldNameContext multipartFieldName() {
			return getRuleContext(MultipartFieldNameContext.class,0);
		}
		public TerminalNode WITH() { return getToken(MQLParser.WITH, 0); }
		public List<UnwindOptionContext> unwindOption() {
			return getRuleContexts(UnwindOptionContext.class);
		}
		public UnwindOptionContext unwindOption(int i) {
			return getRuleContext(UnwindOptionContext.class,i);
		}
		public UnwindStageContext(QueryStageContext ctx) { copyFrom(ctx); }
	}
	public static class LimitStageContext extends QueryStageContext {
		public TerminalNode LIMIT() { return getToken(MQLParser.LIMIT, 0); }
		public TerminalNode INT() { return getToken(MQLParser.INT, 0); }
		public LimitStageContext(QueryStageContext ctx) { copyFrom(ctx); }
	}
	public static class GroupStageContext extends QueryStageContext {
		public TerminalNode GROUP() { return getToken(MQLParser.GROUP, 0); }
		public TerminalNode LBRACE() { return getToken(MQLParser.LBRACE, 0); }
		public List<FieldAssignmentContext> fieldAssignment() {
			return getRuleContexts(FieldAssignmentContext.class);
		}
		public FieldAssignmentContext fieldAssignment(int i) {
			return getRuleContext(FieldAssignmentContext.class,i);
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
		public GroupStageContext(QueryStageContext ctx) { copyFrom(ctx); }
	}
	public static class LookupStageContext extends QueryStageContext {
		public TerminalNode LOOKUP() { return getToken(MQLParser.LOOKUP, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(MQLParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(MQLParser.LBRACE, i);
		}
		public MultipartFieldDeclarationContext multipartFieldDeclaration() {
			return getRuleContext(MultipartFieldDeclarationContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MQLParser.COLON, 0); }
		public QueryStatementContext queryStatement() {
			return getRuleContext(QueryStatementContext.class,0);
		}
		public List<TerminalNode> RBRACE() { return getTokens(MQLParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(MQLParser.RBRACE, i);
		}
		public List<VariableAssignmentContext> variableAssignment() {
			return getRuleContexts(VariableAssignmentContext.class);
		}
		public VariableAssignmentContext variableAssignment(int i) {
			return getRuleContext(VariableAssignmentContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(MQLParser.ARROW, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MQLParser.COMMA, i);
		}
		public LookupStageContext(QueryStageContext ctx) { copyFrom(ctx); }
	}
	public static class MatchStageContext extends QueryStageContext {
		public TerminalNode MATCH() { return getToken(MQLParser.MATCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MatchStageContext(QueryStageContext ctx) { copyFrom(ctx); }
	}
	public static class SkipStageContext extends QueryStageContext {
		public TerminalNode SKIP_() { return getToken(MQLParser.SKIP_, 0); }
		public TerminalNode INT() { return getToken(MQLParser.INT, 0); }
		public SkipStageContext(QueryStageContext ctx) { copyFrom(ctx); }
	}

	public final QueryStageContext queryStage() throws RecognitionException {
		QueryStageContext _localctx = new QueryStageContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_queryStage);
		int _la;
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GROUP:
				_localctx = new GroupStageContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(GROUP);
				setState(63);
				match(LBRACE);
				setState(64);
				fieldAssignment();
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(65);
					match(COMMA);
					setState(66);
					fieldAssignment();
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(72);
				match(RBRACE);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BY) {
					{
					setState(73);
					match(BY);
					setState(74);
					expression(0);
					}
				}

				}
				break;
			case LIMIT:
				_localctx = new LimitStageContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(LIMIT);
				setState(78);
				match(INT);
				}
				break;
			case LOOKUP:
				_localctx = new LookupStageContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				match(LOOKUP);
				setState(80);
				match(LBRACE);
				setState(81);
				multipartFieldDeclaration();
				setState(82);
				match(COLON);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(83);
					match(LBRACE);
					setState(84);
					variableAssignment();
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(85);
						match(COMMA);
						setState(86);
						variableAssignment();
						}
						}
						setState(91);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(92);
					match(RBRACE);
					setState(93);
					match(ARROW);
					}
				}

				setState(97);
				queryStatement();
				setState(98);
				match(RBRACE);
				}
				break;
			case MATCH:
				_localctx = new MatchStageContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				match(MATCH);
				setState(101);
				expression(0);
				}
				break;
			case PROJECT:
				_localctx = new ProjectStageContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(102);
				match(PROJECT);
				setState(103);
				match(LBRACE);
				setState(104);
				projectItem();
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(105);
					match(COMMA);
					setState(106);
					projectItem();
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(112);
				match(RBRACE);
				}
				break;
			case SKIP_:
				_localctx = new SkipStageContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(114);
				match(SKIP_);
				setState(115);
				match(INT);
				}
				break;
			case SORT:
				_localctx = new SortStageContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(116);
				match(SORT);
				setState(117);
				sortField();
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(118);
					match(COMMA);
					setState(119);
					sortField();
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case UNWIND:
				_localctx = new UnwindStageContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(125);
				match(UNWIND);
				setState(126);
				multipartFieldName();
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(127);
					match(WITH);
					setState(129); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(128);
						unwindOption();
						}
						}
						setState(131); 
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

	public static class ProjectItemContext extends ParserRuleContext {
		public ProjectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projectItem; }
	 
		public ProjectItemContext() { }
		public void copyFrom(ProjectItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignProjectItemContext extends ProjectItemContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MQLParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignProjectItemContext(ProjectItemContext ctx) { copyFrom(ctx); }
	}
	public static class IncludeProjectItemContext extends ProjectItemContext {
		public MultipartFieldDeclarationContext multipartFieldDeclaration() {
			return getRuleContext(MultipartFieldDeclarationContext.class,0);
		}
		public IncludeProjectItemContext(ProjectItemContext ctx) { copyFrom(ctx); }
	}
	public static class ExcludeProjectItemContext extends ProjectItemContext {
		public TerminalNode EXCLUDE() { return getToken(MQLParser.EXCLUDE, 0); }
		public MultipartFieldDeclarationContext multipartFieldDeclaration() {
			return getRuleContext(MultipartFieldDeclarationContext.class,0);
		}
		public ExcludeProjectItemContext(ProjectItemContext ctx) { copyFrom(ctx); }
	}

	public final ProjectItemContext projectItem() throws RecognitionException {
		ProjectItemContext _localctx = new ProjectItemContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_projectItem);
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new ExcludeProjectItemContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(EXCLUDE);
				setState(138);
				multipartFieldDeclaration();
				}
				break;
			case 2:
				_localctx = new IncludeProjectItemContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				multipartFieldDeclaration();
				}
				break;
			case 3:
				_localctx = new AssignProjectItemContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				fieldDeclaration();
				setState(141);
				match(COLON);
				setState(142);
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

	public static class SortFieldContext extends ParserRuleContext {
		public MultipartFieldNameContext multipartFieldName() {
			return getRuleContext(MultipartFieldNameContext.class,0);
		}
		public TerminalNode ASC() { return getToken(MQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(MQLParser.DESC, 0); }
		public SortFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortField; }
	}

	public final SortFieldContext sortField() throws RecognitionException {
		SortFieldContext _localctx = new SortFieldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sortField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			multipartFieldName();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(147);
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

	public static class UnwindOptionContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(MQLParser.INDEX, 0); }
		public MultipartFieldDeclarationContext multipartFieldDeclaration() {
			return getRuleContext(MultipartFieldDeclarationContext.class,0);
		}
		public TerminalNode PRESERVE_NULL_AND_EMPTY() { return getToken(MQLParser.PRESERVE_NULL_AND_EMPTY, 0); }
		public UnwindOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unwindOption; }
	}

	public final UnwindOptionContext unwindOption() throws RecognitionException {
		UnwindOptionContext _localctx = new UnwindOptionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unwindOption);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDEX:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(INDEX);
				setState(151);
				multipartFieldDeclaration();
				}
				break;
			case PRESERVE_NULL_AND_EMPTY:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
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
		public List<VariableAssignmentContext> variableAssignment() {
			return getRuleContexts(VariableAssignmentContext.class);
		}
		public VariableAssignmentContext variableAssignment(int i) {
			return getRuleContext(VariableAssignmentContext.class,i);
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
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
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
		public TerminalNode REGEX() { return getToken(MQLParser.REGEX, 0); }
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
		public List<SwitchCaseContext> switchCase() {
			return getRuleContexts(SwitchCaseContext.class);
		}
		public SwitchCaseContext switchCase(int i) {
			return getRuleContext(SwitchCaseContext.class,i);
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
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
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
		public TerminalNode NOR() { return getToken(MQLParser.NOR, 0); }
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
		public ExpressionContext st;
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
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(156);
				match(MINUS);
				setState(157);
				expression(24);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				match(NOT);
				setState(159);
				expression(23);
				}
				break;
			case 3:
				{
				_localctx = new SwitchExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				match(SWITCH);
				setState(162); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(161);
						switchCase();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(164); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(168);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(166);
					match(ELSE);
					setState(167);
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
				setState(170);
				match(IF);
				setState(171);
				expression(0);
				setState(172);
				match(THEN);
				setState(173);
				expression(0);
				setState(174);
				match(ELSE);
				setState(175);
				expression(9);
				}
				break;
			case 5:
				{
				_localctx = new LetExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				match(LBRACE);
				setState(178);
				variableAssignment();
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(179);
					match(COMMA);
					setState(180);
					variableAssignment();
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(186);
				match(RBRACE);
				setState(187);
				match(ARROW);
				setState(188);
				expression(8);
				}
				break;
			case 6:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				match(LPAREN);
				setState(191);
				expression(0);
				setState(192);
				match(RPAREN);
				}
				break;
			case 7:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				function();
				}
				break;
			case 8:
				{
				_localctx = new FieldExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				fieldName();
				}
				break;
			case 9:
				{
				_localctx = new VariableReferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				variableName();
				}
				break;
			case 10:
				{
				_localctx = new NewDocumentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				document();
				}
				break;
			case 11:
				{
				_localctx = new NewArrayExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				match(LBRACK);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << LBRACK) | (1L << LPAREN) | (1L << MINUS) | (1L << FALSE) | (1L << IF) | (1L << NOT) | (1L << NULL) | (1L << SWITCH) | (1L << TRUE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (REGEX - 67)) | (1L << (INT - 67)) | (1L << (DOUBLE - 67)) | (1L << (DECIMAL - 67)) | (1L << (LONG - 67)) | (1L << (BIN - 67)) | (1L << (LONG_BIN - 67)) | (1L << (HEX - 67)) | (1L << (LONG_HEX - 67)) | (1L << (OID - 67)) | (1L << (ID - 67)) | (1L << (STRING - 67)) | (1L << (VARIABLE_ID - 67)) | (1L << (DATE_TIME - 67)))) != 0)) {
					{
					setState(199);
					expression(0);
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(200);
						match(COMMA);
						setState(201);
						expression(0);
						}
						}
						setState(206);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(209);
				match(RBRACK);
				}
				break;
			case 12:
				{
				_localctx = new ValueExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				value();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(276);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(213);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(214);
						match(POWER);
						setState(215);
						expression(25);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(216);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(217);
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
						setState(218);
						expression(19);
						}
						break;
					case 3:
						{
						_localctx = new AdditionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(219);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(220);
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
						setState(221);
						expression(18);
						}
						break;
					case 4:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(222);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(223);
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
						setState(224);
						expression(17);
						}
						break;
					case 5:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(225);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(226);
						match(AND);
						setState(227);
						expression(16);
						}
						break;
					case 6:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(228);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(229);
						_la = _input.LA(1);
						if ( !(_la==NOR || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(230);
						expression(15);
						}
						break;
					case 7:
						{
						_localctx = new ConcatExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(231);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(232);
						match(CONCAT);
						setState(233);
						expression(14);
						}
						break;
					case 8:
						{
						_localctx = new NullCoalesceExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(234);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(235);
						match(DQUESTION);
						setState(236);
						expression(13);
						}
						break;
					case 9:
						{
						_localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(237);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(239);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(238);
							match(NOT);
							}
						}

						setState(241);
						match(IN);
						setState(242);
						expression(12);
						}
						break;
					case 10:
						{
						_localctx = new MemberExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(243);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(244);
						match(DOT);
						setState(247);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
						case 1:
							{
							setState(245);
							fieldName();
							}
							break;
						case 2:
							{
							setState(246);
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
						setState(249);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(250);
						match(LBRACK);
						setState(263);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
						case 1:
							{
							setState(251);
							((ArrayAccessExpressionContext)_localctx).st = expression(0);
							}
							break;
						case 2:
							{
							setState(253);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << LBRACK) | (1L << LPAREN) | (1L << MINUS) | (1L << FALSE) | (1L << IF) | (1L << NOT) | (1L << NULL) | (1L << SWITCH) | (1L << TRUE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (REGEX - 67)) | (1L << (INT - 67)) | (1L << (DOUBLE - 67)) | (1L << (DECIMAL - 67)) | (1L << (LONG - 67)) | (1L << (BIN - 67)) | (1L << (LONG_BIN - 67)) | (1L << (HEX - 67)) | (1L << (LONG_HEX - 67)) | (1L << (OID - 67)) | (1L << (ID - 67)) | (1L << (STRING - 67)) | (1L << (VARIABLE_ID - 67)) | (1L << (DATE_TIME - 67)))) != 0)) {
								{
								setState(252);
								((ArrayAccessExpressionContext)_localctx).st = expression(0);
								}
							}

							setState(255);
							match(RANGE);
							setState(257);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << LBRACK) | (1L << LPAREN) | (1L << MINUS) | (1L << FALSE) | (1L << IF) | (1L << NOT) | (1L << NULL) | (1L << SWITCH) | (1L << TRUE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (REGEX - 67)) | (1L << (INT - 67)) | (1L << (DOUBLE - 67)) | (1L << (DECIMAL - 67)) | (1L << (LONG - 67)) | (1L << (BIN - 67)) | (1L << (LONG_BIN - 67)) | (1L << (HEX - 67)) | (1L << (LONG_HEX - 67)) | (1L << (OID - 67)) | (1L << (ID - 67)) | (1L << (STRING - 67)) | (1L << (VARIABLE_ID - 67)) | (1L << (DATE_TIME - 67)))) != 0)) {
								{
								setState(256);
								((ArrayAccessExpressionContext)_localctx).end = expression(0);
								}
							}

							setState(261);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==COLON) {
								{
								setState(259);
								match(COLON);
								setState(260);
								((ArrayAccessExpressionContext)_localctx).step = expression(0);
								}
							}

							}
							break;
						}
						setState(265);
						match(RBRACK);
						}
						break;
					case 12:
						{
						_localctx = new RangeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(266);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(267);
						match(RANGE);
						setState(268);
						expression(0);
						setState(271);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
						case 1:
							{
							setState(269);
							match(COLON);
							setState(270);
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
						setState(273);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(274);
						match(LIKE);
						setState(275);
						match(REGEX);
						}
						break;
					}
					} 
				}
				setState(280);
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

	public static class DocumentContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(MQLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MQLParser.RBRACE, 0); }
		public List<FieldAssignmentContext> fieldAssignment() {
			return getRuleContexts(FieldAssignmentContext.class);
		}
		public FieldAssignmentContext fieldAssignment(int i) {
			return getRuleContext(FieldAssignmentContext.class,i);
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
		enterRule(_localctx, 12, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(LBRACE);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(282);
				fieldAssignment();
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(283);
					match(COMMA);
					setState(284);
					fieldAssignment();
					}
					}
					setState(289);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(292);
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

	public static class FieldAssignmentContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MQLParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FieldAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAssignment; }
	}

	public final FieldAssignmentContext fieldAssignment() throws RecognitionException {
		FieldAssignmentContext _localctx = new FieldAssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fieldAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			fieldDeclaration();
			setState(295);
			match(COLON);
			setState(296);
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
		public List<MultipartFieldAssignmentContext> multipartFieldAssignment() {
			return getRuleContexts(MultipartFieldAssignmentContext.class);
		}
		public MultipartFieldAssignmentContext multipartFieldAssignment(int i) {
			return getRuleContext(MultipartFieldAssignmentContext.class,i);
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
		enterRule(_localctx, 16, RULE_multipart_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(LBRACE);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(299);
				multipartFieldAssignment();
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(300);
					match(COMMA);
					setState(301);
					multipartFieldAssignment();
					}
					}
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(309);
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

	public static class MultipartFieldAssignmentContext extends ParserRuleContext {
		public MultipartFieldDeclarationContext multipartFieldDeclaration() {
			return getRuleContext(MultipartFieldDeclarationContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MQLParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MultipartFieldAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartFieldAssignment; }
	}

	public final MultipartFieldAssignmentContext multipartFieldAssignment() throws RecognitionException {
		MultipartFieldAssignmentContext _localctx = new MultipartFieldAssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_multipartFieldAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			multipartFieldDeclaration();
			setState(312);
			match(COLON);
			setState(313);
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
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MQLParser.RPAREN, 0); }
		public List<FunctionArgumentContext> functionArgument() {
			return getRuleContexts(FunctionArgumentContext.class);
		}
		public FunctionArgumentContext functionArgument(int i) {
			return getRuleContext(FunctionArgumentContext.class,i);
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
		enterRule(_localctx, 20, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			functionName();
			setState(316);
			match(LPAREN);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << LBRACK) | (1L << LPAREN) | (1L << MINUS) | (1L << UNDERSCORE) | (1L << FALSE) | (1L << IF) | (1L << NOT) | (1L << NULL) | (1L << SWITCH) | (1L << TRUE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (REGEX - 67)) | (1L << (INT - 67)) | (1L << (DOUBLE - 67)) | (1L << (DECIMAL - 67)) | (1L << (LONG - 67)) | (1L << (BIN - 67)) | (1L << (LONG_BIN - 67)) | (1L << (HEX - 67)) | (1L << (LONG_HEX - 67)) | (1L << (OID - 67)) | (1L << (ID - 67)) | (1L << (STRING - 67)) | (1L << (VARIABLE_ID - 67)) | (1L << (DATE_TIME - 67)))) != 0)) {
				{
				setState(317);
				functionArgument();
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(318);
					match(COMMA);
					setState(319);
					functionArgument();
					}
					}
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(327);
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

	public static class FunctionArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionArgumentNameContext functionArgumentName() {
			return getRuleContext(FunctionArgumentNameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MQLParser.COLON, 0); }
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public FunctionArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgument; }
	}

	public final FunctionArgumentContext functionArgument() throws RecognitionException {
		FunctionArgumentContext _localctx = new FunctionArgumentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionArgument);
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				functionArgumentName();
				setState(331);
				match(COLON);
				setState(332);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				lambdaExpression();
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

	public static class LambdaArgumentContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode UNDERSCORE() { return getToken(MQLParser.UNDERSCORE, 0); }
		public LambdaArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaArgument; }
	}

	public final LambdaArgumentContext lambdaArgument() throws RecognitionException {
		LambdaArgumentContext _localctx = new LambdaArgumentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_lambdaArgument);
		try {
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				variableName();
				}
				break;
			case UNDERSCORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
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

	public static class LambdaExpressionContext extends ParserRuleContext {
		public List<LambdaArgumentContext> lambdaArgument() {
			return getRuleContexts(LambdaArgumentContext.class);
		}
		public LambdaArgumentContext lambdaArgument(int i) {
			return getRuleContext(LambdaArgumentContext.class,i);
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
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_lambdaExpression);
		int _la;
		try {
			setState(358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNDERSCORE:
			case VARIABLE_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				lambdaArgument();
				setState(342);
				match(ARROW);
				setState(343);
				expression(0);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				match(LPAREN);
				setState(346);
				lambdaArgument();
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(347);
					match(COMMA);
					setState(348);
					lambdaArgument();
					}
					}
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(354);
				match(RPAREN);
				setState(355);
				match(ARROW);
				setState(356);
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

	public static class SwitchCaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(MQLParser.CASE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode THEN() { return getToken(MQLParser.THEN, 0); }
		public SwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCase; }
	}

	public final SwitchCaseContext switchCase() throws RecognitionException {
		SwitchCaseContext _localctx = new SwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_switchCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(CASE);
			setState(361);
			expression(0);
			setState(362);
			match(THEN);
			setState(363);
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

	public static class VariableAssignmentContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MQLParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			variableName();
			setState(366);
			match(COLON);
			setState(367);
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
		public TerminalNode REGEX() { return getToken(MQLParser.REGEX, 0); }
		public RegexValueContext(ValueContext ctx) { copyFrom(ctx); }
	}
	public static class NullValueContext extends ValueContext {
		public TerminalNode NULL() { return getToken(MQLParser.NULL, 0); }
		public NullValueContext(ValueContext ctx) { copyFrom(ctx); }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_value);
		int _la;
		try {
			setState(376);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case DECIMAL:
			case LONG:
			case BIN:
			case LONG_BIN:
			case HEX:
			case LONG_HEX:
				_localctx = new NumberValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				number();
				}
				break;
			case STRING:
				_localctx = new StringValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				match(STRING);
				}
				break;
			case FALSE:
			case TRUE:
				_localctx = new BooleanValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
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
				setState(372);
				match(NULL);
				}
				break;
			case OID:
				_localctx = new OidValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(373);
				match(OID);
				}
				break;
			case DATE_TIME:
				_localctx = new DateTimeValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(374);
				match(DATE_TIME);
				}
				break;
			case REGEX:
				_localctx = new RegexValueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(375);
				match(REGEX);
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
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntValueContext extends NumberContext {
		public TerminalNode INT() { return getToken(MQLParser.INT, 0); }
		public IntValueContext(NumberContext ctx) { copyFrom(ctx); }
	}
	public static class DecimalValueContext extends NumberContext {
		public TerminalNode DECIMAL() { return getToken(MQLParser.DECIMAL, 0); }
		public DecimalValueContext(NumberContext ctx) { copyFrom(ctx); }
	}
	public static class HexValueContext extends NumberContext {
		public TerminalNode HEX() { return getToken(MQLParser.HEX, 0); }
		public HexValueContext(NumberContext ctx) { copyFrom(ctx); }
	}
	public static class LongHexValueContext extends NumberContext {
		public TerminalNode LONG_HEX() { return getToken(MQLParser.LONG_HEX, 0); }
		public LongHexValueContext(NumberContext ctx) { copyFrom(ctx); }
	}
	public static class BinValueContext extends NumberContext {
		public TerminalNode BIN() { return getToken(MQLParser.BIN, 0); }
		public BinValueContext(NumberContext ctx) { copyFrom(ctx); }
	}
	public static class DoubleValueContext extends NumberContext {
		public TerminalNode DOUBLE() { return getToken(MQLParser.DOUBLE, 0); }
		public DoubleValueContext(NumberContext ctx) { copyFrom(ctx); }
	}
	public static class LongBinValueContext extends NumberContext {
		public TerminalNode LONG_BIN() { return getToken(MQLParser.LONG_BIN, 0); }
		public LongBinValueContext(NumberContext ctx) { copyFrom(ctx); }
	}
	public static class LongValueContext extends NumberContext {
		public TerminalNode LONG() { return getToken(MQLParser.LONG, 0); }
		public LongValueContext(NumberContext ctx) { copyFrom(ctx); }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_number);
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				match(INT);
				}
				break;
			case LONG:
				_localctx = new LongValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				match(LONG);
				}
				break;
			case DOUBLE:
				_localctx = new DoubleValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				match(DOUBLE);
				}
				break;
			case DECIMAL:
				_localctx = new DecimalValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(381);
				match(DECIMAL);
				}
				break;
			case BIN:
				_localctx = new BinValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(382);
				match(BIN);
				}
				break;
			case LONG_BIN:
				_localctx = new LongBinValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(383);
				match(LONG_BIN);
				}
				break;
			case HEX:
				_localctx = new HexValueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(384);
				match(HEX);
				}
				break;
			case LONG_HEX:
				_localctx = new LongHexValueContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(385);
				match(LONG_HEX);
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

	public static class CollectionNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MQLParser.ID, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(MQLParser.DOT, 0); }
		public CollectionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionName; }
	}

	public final CollectionNameContext collectionName() throws RecognitionException {
		CollectionNameContext _localctx = new CollectionNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_collectionName);
		try {
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				databaseName();
				setState(390);
				match(DOT);
				setState(391);
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

	public static class DatabaseNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MQLParser.ID, 0); }
		public DatabaseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseName; }
	}

	public final DatabaseNameContext databaseName() throws RecognitionException {
		DatabaseNameContext _localctx = new DatabaseNameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_databaseName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MQLParser.ID, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
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

	public static class FieldNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MQLParser.ID, 0); }
		public FieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldName; }
	}

	public final FieldNameContext fieldName() throws RecognitionException {
		FieldNameContext _localctx = new FieldNameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fieldName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
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

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MQLParser.ID, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
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

	public static class FunctionArgumentNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MQLParser.ID, 0); }
		public FunctionArgumentNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgumentName; }
	}

	public final FunctionArgumentNameContext functionArgumentName() throws RecognitionException {
		FunctionArgumentNameContext _localctx = new FunctionArgumentNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functionArgumentName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
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

	public static class MultipartFieldDeclarationContext extends ParserRuleContext {
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(MQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MQLParser.DOT, i);
		}
		public MultipartFieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartFieldDeclaration; }
	}

	public final MultipartFieldDeclarationContext multipartFieldDeclaration() throws RecognitionException {
		MultipartFieldDeclarationContext _localctx = new MultipartFieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_multipartFieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			fieldDeclaration();
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(406);
				match(DOT);
				setState(407);
				fieldDeclaration();
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

	public static class MultipartFieldNameContext extends ParserRuleContext {
		public List<FieldNameContext> fieldName() {
			return getRuleContexts(FieldNameContext.class);
		}
		public FieldNameContext fieldName(int i) {
			return getRuleContext(FieldNameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(MQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MQLParser.DOT, i);
		}
		public MultipartFieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartFieldName; }
	}

	public final MultipartFieldNameContext multipartFieldName() throws RecognitionException {
		MultipartFieldNameContext _localctx = new MultipartFieldNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_multipartFieldName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			fieldName();
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(414);
				match(DOT);
				setState(415);
				fieldName();
				}
				}
				setState(420);
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

	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode VARIABLE_ID() { return getToken(MQLParser.VARIABLE_ID, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
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
		case 5:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3S\u01aa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3\3"+
		"\3\3\3\3\3\3\3\3\7\3F\n\3\f\3\16\3I\13\3\3\3\3\3\3\3\5\3N\n\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3Z\n\3\f\3\16\3]\13\3\3\3\3\3\3\3\5"+
		"\3b\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3n\n\3\f\3\16\3q\13"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3{\n\3\f\3\16\3~\13\3\3\3\3\3\3\3"+
		"\3\3\6\3\u0084\n\3\r\3\16\3\u0085\5\3\u0088\n\3\5\3\u008a\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4\u0093\n\4\3\5\3\5\5\5\u0097\n\5\3\6\3\6\3\6\5"+
		"\6\u009c\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u00a5\n\7\r\7\16\7\u00a6"+
		"\3\7\3\7\5\7\u00ab\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7"+
		"\u00b8\n\7\f\7\16\7\u00bb\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00cd\n\7\f\7\16\7\u00d0\13\7\5\7\u00d2\n"+
		"\7\3\7\3\7\5\7\u00d6\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00f2\n"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00fa\n\7\3\7\3\7\3\7\3\7\5\7\u0100\n\7"+
		"\3\7\3\7\5\7\u0104\n\7\3\7\3\7\5\7\u0108\n\7\5\7\u010a\n\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7\u0112\n\7\3\7\3\7\3\7\7\7\u0117\n\7\f\7\16\7\u011a\13"+
		"\7\3\b\3\b\3\b\3\b\7\b\u0120\n\b\f\b\16\b\u0123\13\b\5\b\u0125\n\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u0131\n\n\f\n\16\n\u0134\13\n"+
		"\5\n\u0136\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\f\u0143"+
		"\n\f\f\f\16\f\u0146\13\f\5\f\u0148\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u0152\n\r\3\16\3\16\5\16\u0156\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u0160\n\17\f\17\16\17\u0163\13\17\3\17\3\17\3\17\3\17"+
		"\5\17\u0169\n\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u017b\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u0185\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u018c\n\24\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\7\32\u019b"+
		"\n\32\f\32\16\32\u019e\13\32\3\33\3\33\3\33\7\33\u01a3\n\33\f\33\16\33"+
		"\u01a6\13\33\3\34\3\34\3\34\2\3\f\35\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\66\2\b\4\2  $$\5\2\7\7\23\23\25\25\4\2\22\22"+
		"\30\30\5\2\n\f\20\21\26\26\4\2\64\6488\4\2&&@@\2\u01e1\28\3\2\2\2\4\u0089"+
		"\3\2\2\2\6\u0092\3\2\2\2\b\u0094\3\2\2\2\n\u009b\3\2\2\2\f\u00d5\3\2\2"+
		"\2\16\u011b\3\2\2\2\20\u0128\3\2\2\2\22\u012c\3\2\2\2\24\u0139\3\2\2\2"+
		"\26\u013d\3\2\2\2\30\u0151\3\2\2\2\32\u0155\3\2\2\2\34\u0168\3\2\2\2\36"+
		"\u016a\3\2\2\2 \u016f\3\2\2\2\"\u017a\3\2\2\2$\u0184\3\2\2\2&\u018b\3"+
		"\2\2\2(\u018d\3\2\2\2*\u018f\3\2\2\2,\u0191\3\2\2\2.\u0193\3\2\2\2\60"+
		"\u0195\3\2\2\2\62\u0197\3\2\2\2\64\u019f\3\2\2\2\66\u01a7\3\2\2\289\7"+
		"\'\2\29=\5&\24\2:<\5\4\3\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\3"+
		"\3\2\2\2?=\3\2\2\2@A\7(\2\2AB\7\r\2\2BG\5\20\t\2CD\7\5\2\2DF\5\20\t\2"+
		"EC\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JM\7\32\2"+
		"\2KL\7!\2\2LN\5\f\7\2MK\3\2\2\2MN\3\2\2\2N\u008a\3\2\2\2OP\7\60\2\2P\u008a"+
		"\7F\2\2QR\7\61\2\2RS\7\r\2\2ST\5\62\32\2Ta\7\4\2\2UV\7\r\2\2V[\5 \21\2"+
		"WX\7\5\2\2XZ\5 \21\2YW\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2"+
		"\2][\3\2\2\2^_\7\32\2\2_`\7\3\2\2`b\3\2\2\2aU\3\2\2\2ab\3\2\2\2bc\3\2"+
		"\2\2cd\5\2\2\2de\7\32\2\2e\u008a\3\2\2\2fg\7\63\2\2g\u008a\5\f\7\2hi\7"+
		"9\2\2ij\7\r\2\2jo\5\6\4\2kl\7\5\2\2ln\5\6\4\2mk\3\2\2\2nq\3\2\2\2om\3"+
		"\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7\32\2\2s\u008a\3\2\2\2tu\7;\2"+
		"\2u\u008a\7F\2\2vw\7<\2\2w|\5\b\5\2xy\7\5\2\2y{\5\b\5\2zx\3\2\2\2{~\3"+
		"\2\2\2|z\3\2\2\2|}\3\2\2\2}\u008a\3\2\2\2~|\3\2\2\2\177\u0080\7A\2\2\u0080"+
		"\u0087\5\64\33\2\u0081\u0083\7C\2\2\u0082\u0084\5\n\6\2\u0083\u0082\3"+
		"\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0088\3\2\2\2\u0087\u0081\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2"+
		"\2\2\u0089@\3\2\2\2\u0089O\3\2\2\2\u0089Q\3\2\2\2\u0089f\3\2\2\2\u0089"+
		"h\3\2\2\2\u0089t\3\2\2\2\u0089v\3\2\2\2\u0089\177\3\2\2\2\u008a\5\3\2"+
		"\2\2\u008b\u008c\7\27\2\2\u008c\u0093\5\62\32\2\u008d\u0093\5\62\32\2"+
		"\u008e\u008f\5*\26\2\u008f\u0090\7\4\2\2\u0090\u0091\5\f\7\2\u0091\u0093"+
		"\3\2\2\2\u0092\u008b\3\2\2\2\u0092\u008d\3\2\2\2\u0092\u008e\3\2\2\2\u0093"+
		"\7\3\2\2\2\u0094\u0096\5\64\33\2\u0095\u0097\t\2\2\2\u0096\u0095\3\2\2"+
		"\2\u0096\u0097\3\2\2\2\u0097\t\3\2\2\2\u0098\u0099\7+\2\2\u0099\u009c"+
		"\5\62\32\2\u009a\u009c\7D\2\2\u009b\u0098\3\2\2\2\u009b\u009a\3\2\2\2"+
		"\u009c\13\3\2\2\2\u009d\u009e\b\7\1\2\u009e\u009f\7\22\2\2\u009f\u00d6"+
		"\5\f\7\32\u00a0\u00a1\7\65\2\2\u00a1\u00d6\5\f\7\31\u00a2\u00a4\7>\2\2"+
		"\u00a3\u00a5\5\36\20\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a9\7%\2\2\u00a9"+
		"\u00ab\5\f\7\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00d6\3\2"+
		"\2\2\u00ac\u00ad\7)\2\2\u00ad\u00ae\5\f\7\2\u00ae\u00af\7?\2\2\u00af\u00b0"+
		"\5\f\7\2\u00b0\u00b1\7%\2\2\u00b1\u00b2\5\f\7\13\u00b2\u00d6\3\2\2\2\u00b3"+
		"\u00b4\7\r\2\2\u00b4\u00b9\5 \21\2\u00b5\u00b6\7\5\2\2\u00b6\u00b8\5 "+
		"\21\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7\32"+
		"\2\2\u00bd\u00be\7\3\2\2\u00be\u00bf\5\f\7\n\u00bf\u00d6\3\2\2\2\u00c0"+
		"\u00c1\7\17\2\2\u00c1\u00c2\5\f\7\2\u00c2\u00c3\7\34\2\2\u00c3\u00d6\3"+
		"\2\2\2\u00c4\u00d6\5\26\f\2\u00c5\u00d6\5,\27\2\u00c6\u00d6\5\66\34\2"+
		"\u00c7\u00d6\5\16\b\2\u00c8\u00d1\7\16\2\2\u00c9\u00ce\5\f\7\2\u00ca\u00cb"+
		"\7\5\2\2\u00cb\u00cd\5\f\7\2\u00cc\u00ca\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2"+
		"\2\2\u00d1\u00c9\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d6\7\33\2\2\u00d4\u00d6\5\"\22\2\u00d5\u009d\3\2\2\2\u00d5\u00a0\3"+
		"\2\2\2\u00d5\u00a2\3\2\2\2\u00d5\u00ac\3\2\2\2\u00d5\u00b3\3\2\2\2\u00d5"+
		"\u00c0\3\2\2\2\u00d5\u00c4\3\2\2\2\u00d5\u00c5\3\2\2\2\u00d5\u00c6\3\2"+
		"\2\2\u00d5\u00c7\3\2\2\2\u00d5\u00c8\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6"+
		"\u0118\3\2\2\2\u00d7\u00d8\f\33\2\2\u00d8\u00d9\7\24\2\2\u00d9\u0117\5"+
		"\f\7\33\u00da\u00db\f\24\2\2\u00db\u00dc\t\3\2\2\u00dc\u0117\5\f\7\25"+
		"\u00dd\u00de\f\23\2\2\u00de\u00df\t\4\2\2\u00df\u0117\5\f\7\24\u00e0\u00e1"+
		"\f\22\2\2\u00e1\u00e2\t\5\2\2\u00e2\u0117\5\f\7\23\u00e3\u00e4\f\21\2"+
		"\2\u00e4\u00e5\7\37\2\2\u00e5\u0117\5\f\7\22\u00e6\u00e7\f\20\2\2\u00e7"+
		"\u00e8\t\6\2\2\u00e8\u0117\5\f\7\21\u00e9\u00ea\f\17\2\2\u00ea\u00eb\7"+
		"\6\2\2\u00eb\u0117\5\f\7\20\u00ec\u00ed\f\16\2\2\u00ed\u00ee\7\t\2\2\u00ee"+
		"\u0117\5\f\7\17\u00ef\u00f1\f\r\2\2\u00f0\u00f2\7\65\2\2\u00f1\u00f0\3"+
		"\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\7*\2\2\u00f4"+
		"\u0117\5\f\7\16\u00f5\u00f6\f\30\2\2\u00f6\u00f9\7\b\2\2\u00f7\u00fa\5"+
		",\27\2\u00f8\u00fa\5\26\f\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa"+
		"\u0117\3\2\2\2\u00fb\u00fc\f\27\2\2\u00fc\u0109\7\16\2\2\u00fd\u010a\5"+
		"\f\7\2\u00fe\u0100\5\f\7\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0103\7\31\2\2\u0102\u0104\5\f\7\2\u0103\u0102\3"+
		"\2\2\2\u0103\u0104\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0106\7\4\2\2\u0106"+
		"\u0108\5\f\7\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2"+
		"\2\2\u0109\u00fd\3\2\2\2\u0109\u00ff\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u0117\7\33\2\2\u010c\u010d\f\26\2\2\u010d\u010e\7\31\2\2\u010e\u0111"+
		"\5\f\7\2\u010f\u0110\7\4\2\2\u0110\u0112\5\f\7\2\u0111\u010f\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0117\3\2\2\2\u0113\u0114\f\25\2\2\u0114\u0115\7"+
		"/\2\2\u0115\u0117\7E\2\2\u0116\u00d7\3\2\2\2\u0116\u00da\3\2\2\2\u0116"+
		"\u00dd\3\2\2\2\u0116\u00e0\3\2\2\2\u0116\u00e3\3\2\2\2\u0116\u00e6\3\2"+
		"\2\2\u0116\u00e9\3\2\2\2\u0116\u00ec\3\2\2\2\u0116\u00ef\3\2\2\2\u0116"+
		"\u00f5\3\2\2\2\u0116\u00fb\3\2\2\2\u0116\u010c\3\2\2\2\u0116\u0113\3\2"+
		"\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\r\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u0124\7\r\2\2\u011c\u0121\5\20\t"+
		"\2\u011d\u011e\7\5\2\2\u011e\u0120\5\20\t\2\u011f\u011d\3\2\2\2\u0120"+
		"\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0125\3\2"+
		"\2\2\u0123\u0121\3\2\2\2\u0124\u011c\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0127\7\32\2\2\u0127\17\3\2\2\2\u0128\u0129\5*\26"+
		"\2\u0129\u012a\7\4\2\2\u012a\u012b\5\f\7\2\u012b\21\3\2\2\2\u012c\u0135"+
		"\7\r\2\2\u012d\u0132\5\24\13\2\u012e\u012f\7\5\2\2\u012f\u0131\5\24\13"+
		"\2\u0130\u012e\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133"+
		"\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u012d\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\7\32\2\2\u0138\23\3\2\2"+
		"\2\u0139\u013a\5\62\32\2\u013a\u013b\7\4\2\2\u013b\u013c\5\f\7\2\u013c"+
		"\25\3\2\2\2\u013d\u013e\5.\30\2\u013e\u0147\7\17\2\2\u013f\u0144\5\30"+
		"\r\2\u0140\u0141\7\5\2\2\u0141\u0143\5\30\r\2\u0142\u0140\3\2\2\2\u0143"+
		"\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0148\3\2"+
		"\2\2\u0146\u0144\3\2\2\2\u0147\u013f\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u014a\7\34\2\2\u014a\27\3\2\2\2\u014b\u0152\5\f\7"+
		"\2\u014c\u014d\5\60\31\2\u014d\u014e\7\4\2\2\u014e\u014f\5\f\7\2\u014f"+
		"\u0152\3\2\2\2\u0150\u0152\5\34\17\2\u0151\u014b\3\2\2\2\u0151\u014c\3"+
		"\2\2\2\u0151\u0150\3\2\2\2\u0152\31\3\2\2\2\u0153\u0156\5\66\34\2\u0154"+
		"\u0156\7\36\2\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156\33\3\2\2"+
		"\2\u0157\u0158\5\32\16\2\u0158\u0159\7\3\2\2\u0159\u015a\5\f\7\2\u015a"+
		"\u0169\3\2\2\2\u015b\u015c\7\17\2\2\u015c\u0161\5\32\16\2\u015d\u015e"+
		"\7\5\2\2\u015e\u0160\5\32\16\2\u015f\u015d\3\2\2\2\u0160\u0163\3\2\2\2"+
		"\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0161"+
		"\3\2\2\2\u0164\u0165\7\34\2\2\u0165\u0166\7\3\2\2\u0166\u0167\5\f\7\2"+
		"\u0167\u0169\3\2\2\2\u0168\u0157\3\2\2\2\u0168\u015b\3\2\2\2\u0169\35"+
		"\3\2\2\2\u016a\u016b\7\"\2\2\u016b\u016c\5\f\7\2\u016c\u016d\7?\2\2\u016d"+
		"\u016e\5\f\7\2\u016e\37\3\2\2\2\u016f\u0170\5\66\34\2\u0170\u0171\7\4"+
		"\2\2\u0171\u0172\5\f\7\2\u0172!\3\2\2\2\u0173\u017b\5$\23\2\u0174\u017b"+
		"\7P\2\2\u0175\u017b\t\7\2\2\u0176\u017b\7\66\2\2\u0177\u017b\7N\2\2\u0178"+
		"\u017b\7S\2\2\u0179\u017b\7E\2\2\u017a\u0173\3\2\2\2\u017a\u0174\3\2\2"+
		"\2\u017a\u0175\3\2\2\2\u017a\u0176\3\2\2\2\u017a\u0177\3\2\2\2\u017a\u0178"+
		"\3\2\2\2\u017a\u0179\3\2\2\2\u017b#\3\2\2\2\u017c\u0185\7F\2\2\u017d\u0185"+
		"\7I\2\2\u017e\u0185\7G\2\2\u017f\u0185\7H\2\2\u0180\u0185\7J\2\2\u0181"+
		"\u0185\7K\2\2\u0182\u0185\7L\2\2\u0183\u0185\7M\2\2\u0184\u017c\3\2\2"+
		"\2\u0184\u017d\3\2\2\2\u0184\u017e\3\2\2\2\u0184\u017f\3\2\2\2\u0184\u0180"+
		"\3\2\2\2\u0184\u0181\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0183\3\2\2\2\u0185"+
		"%\3\2\2\2\u0186\u018c\7O\2\2\u0187\u0188\5(\25\2\u0188\u0189\7\b\2\2\u0189"+
		"\u018a\7O\2\2\u018a\u018c\3\2\2\2\u018b\u0186\3\2\2\2\u018b\u0187\3\2"+
		"\2\2\u018c\'\3\2\2\2\u018d\u018e\7O\2\2\u018e)\3\2\2\2\u018f\u0190\7O"+
		"\2\2\u0190+\3\2\2\2\u0191\u0192\7O\2\2\u0192-\3\2\2\2\u0193\u0194\7O\2"+
		"\2\u0194/\3\2\2\2\u0195\u0196\7O\2\2\u0196\61\3\2\2\2\u0197\u019c\5*\26"+
		"\2\u0198\u0199\7\b\2\2\u0199\u019b\5*\26\2\u019a\u0198\3\2\2\2\u019b\u019e"+
		"\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\63\3\2\2\2\u019e"+
		"\u019c\3\2\2\2\u019f\u01a4\5,\27\2\u01a0\u01a1\7\b\2\2\u01a1\u01a3\5,"+
		"\27\2\u01a2\u01a0\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4"+
		"\u01a5\3\2\2\2\u01a5\65\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01a8\7Q\2\2"+
		"\u01a8\67\3\2\2\2-=GM[ao|\u0085\u0087\u0089\u0092\u0096\u009b\u00a6\u00aa"+
		"\u00b9\u00ce\u00d1\u00d5\u00f1\u00f9\u00ff\u0103\u0107\u0109\u0111\u0116"+
		"\u0118\u0121\u0124\u0132\u0135\u0144\u0147\u0151\u0155\u0161\u0168\u017a"+
		"\u0184\u018b\u019c\u01a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}