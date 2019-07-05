package parser

import (
	"math"
	"strconv"
	"strings"
	"time"

	"github.com/craiggwilson/mql/internal/grammar"
	"github.com/craiggwilson/mql/internal/util/astutil"

	"github.com/10gen/mongoast/ast"
	astparser "github.com/10gen/mongoast/parser"
	"github.com/antlr/antlr4/runtime/Go/antlr"
	"github.com/pkg/errors"
	"go.mongodb.org/mongo-driver/bson/bsontype"
	"go.mongodb.org/mongo-driver/x/bsonx/bsoncore"
)

func translateFullStatement(ctx grammar.IFullStatementContext) (Statement, error) {
	t := &statementTranslator{}
	return t.translateFullStatement(ctx)
}

func translateStatement(ctx grammar.IStatementContext) (Statement, error) {
	t := &statementTranslator{}
	return t.translateStatement(ctx)
}

func translateQueryStatement(ctx grammar.IQueryStatementContext) (*QueryStatement, error) {
	t := &statementTranslator{}
	return t.translateQueryStatement(ctx)
}

type statementTranslator struct {
	*grammar.BaseMQLVisitor
	err error
}

func (t *statementTranslator) translateFullStatement(ctx grammar.IFullStatementContext) (Statement, error) {
	stmt := ctx.Accept(t)
	if t.err != nil {
		return nil, t.err
	}

	return stmt.(Statement), nil
}

func (t *statementTranslator) translateStatement(ctx grammar.IStatementContext) (Statement, error) {
	stmt := ctx.Accept(t)
	if t.err != nil {
		return nil, t.err
	}

	return stmt.(Statement), nil
}

func (t *statementTranslator) translateQueryStatement(ctx grammar.IQueryStatementContext) (*QueryStatement, error) {
	stmt := ctx.Accept(t)
	if t.err != nil {
		return nil, t.err
	}

	return stmt.(*QueryStatement), nil
}

func (t *statementTranslator) VisitFullStatement(ctx *grammar.FullStatementContext) interface{} {
	return ctx.Statement().Accept(t)
}

func (t *statementTranslator) VisitStatement(ctx *grammar.StatementContext) interface{} {
	switch {
	case ctx.QueryStatement() != nil:
		return ctx.QueryStatement().Accept(t)
	case ctx.ShowCollectionsStatement() != nil:
		return ctx.ShowCollectionsStatement().Accept(t)
	case ctx.ShowDatabasesStatement() != nil:
		return ctx.ShowDatabasesStatement().Accept(t)
	case ctx.UseDatabaseStatement() != nil:
		return ctx.UseDatabaseStatement().Accept(t)
	}

	return nil
}

func (t *statementTranslator) VisitQueryStatement(ctx *grammar.QueryStatementContext) interface{} {
	pipeline, err := translatePipeline(ctx.Pipeline())
	if err != nil {
		t.err = errors.Wrap(err, "failed translating pipeline")
		return nil
	}

	ns, err := translateCollectionName(ctx.CollectionName())
	if err != nil {
		t.err = err
		return nil
	}

	return NewQueryStatement(ns[0], ns[1], pipeline)
}

func (t *statementTranslator) VisitShowCollectionsStatement(ctx *grammar.ShowCollectionsStatementContext) interface{} {
	databaseName := ""
	var err error
	if ctx.DatabaseName() != nil {
		databaseName, err = translateDatabaseName(ctx.DatabaseName())
		if err != nil {
			t.err = err
			return nil
		}
	}

	var expr ast.Expr
	if ctx.Expression() != nil {
		expr, err = translateExpr(ctx.Expression())
		if err != nil {
			t.err = err
			return nil
		}
	}

	return NewShowCollectionsStatement(databaseName, ctx.FULL() != nil, expr)
}

func (t *statementTranslator) VisitShowDatabasesStatement(ctx *grammar.ShowDatabasesStatementContext) interface{} {
	var expr ast.Expr
	var err error
	if ctx.Expression() != nil {
		expr, err = translateExpr(ctx.Expression())
		if err != nil {
			t.err = err
			return nil
		}
	}

	return NewShowDatabasesStatement(ctx.FULL() != nil, expr)
}

func (t *statementTranslator) VisitUseDatabaseStatement(ctx *grammar.UseDatabaseStatementContext) interface{} {
	databaseName, err := translateDatabaseName(ctx.DatabaseName())
	if err != nil {
		t.err = err
		return nil
	}

	return NewUseDatabaseStatement(databaseName)
}

func translateFullPipeline(ctx grammar.IFullPipelineContext) (*ast.Pipeline, error) {
	t := &pipelineTranslator{}
	return t.translateFullPipeline(ctx)
}

func translatePipeline(ctx grammar.IPipelineContext) (*ast.Pipeline, error) {
	t := &pipelineTranslator{}
	return t.translatePipeline(ctx)
}

type pipelineTranslator struct {
	*grammar.BaseMQLVisitor
	err error
}

func (t *pipelineTranslator) translateFullPipeline(ctx grammar.IFullPipelineContext) (*ast.Pipeline, error) {
	pipeline := ctx.Accept(t)
	if t.err != nil {
		return nil, t.err
	}

	return pipeline.(*ast.Pipeline), nil
}

func (t *pipelineTranslator) translatePipeline(ctx grammar.IPipelineContext) (*ast.Pipeline, error) {
	pipeline := ctx.Accept(t)
	if t.err != nil {
		return nil, t.err
	}

	return pipeline.(*ast.Pipeline), nil
}

func (t *pipelineTranslator) VisitFullPipeline(ctx *grammar.FullPipelineContext) interface{} {
	return ctx.Pipeline().Accept(t)
}

func (t *pipelineTranslator) VisitPipeline(ctx *grammar.PipelineContext) interface{} {
	var stages []ast.Stage

	for i, s := range ctx.AllQueryStage() {
		stage, err := translateQueryStage(s)
		if err != nil {
			t.err = errors.Wrapf(err, "failed parsing stage %d", i)
			return nil
		}

		stages = append(stages, stage)
	}

	return ast.NewPipeline(stages...)
}

func translateQueryStage(ctx grammar.IQueryStageContext) (ast.Stage, error) {
	t := &queryStageTranslator{}
	return t.translate(ctx)
}

type queryStageTranslator struct {
	*grammar.BaseMQLVisitor
	err error
}

func (t *queryStageTranslator) translate(ctx grammar.IQueryStageContext) (ast.Stage, error) {
	result := ctx.Accept(t)
	if t.err != nil {
		return nil, t.err
	}

	return result.(ast.Stage), nil
}

func (t *queryStageTranslator) VisitGroupStage(ctx *grammar.GroupStageContext) interface{} {
	fas := ctx.AllFieldAssignment()
	items := make([]*ast.GroupItem, len(fas))
	for i, fa := range fas {
		elem, err := translateFieldAssignment(fa)
		if err != nil {
			t.err = errors.Wrapf(err, "failed translating document element %d", i)
			return nil
		}

		items[i] = ast.NewGroupItem(elem.Name, elem.Expr)
	}

	var by ast.Expr
	if ctx.BY() != nil {
		var err error
		by, err = translateExpr(ctx.Expression())
		if err != nil {
			t.err = errors.Wrapf(err, "failed parsing match expression")
			return nil
		}
	} else {
		by = astutil.Null
	}

	return ast.NewGroupStage(by, items...)
}

func (t *queryStageTranslator) VisitLimitStage(ctx *grammar.LimitStageContext) interface{} {
	n, err := strconv.ParseInt(ctx.INT().GetText(), 10, 64)
	if err != nil {
		t.err = errors.Wrapf(err, "failed parsing limit stage count")
		return nil
	}

	return ast.NewLimitStage(n)
}

func (t *queryStageTranslator) VisitLookupStage(ctx *grammar.LookupStageContext) interface{} {
	as, err := translateMultipartFieldDeclaration(ctx.MultipartFieldDeclaration())
	if err != nil {
		t.err = err
		return nil
	}

	vas := ctx.AllVariableAssignment()
	var lets []*ast.LookupLetItem
	if len(vas) > 0 {
		lets = make([]*ast.LookupLetItem, len(vas))
		for i, va := range vas {
			let, err := translateVariableAssignment(va)
			if err != nil {
				t.err = err
				return nil
			}

			lets[i] = ast.NewLookupLetItem(let.Name, let.Expr)
		}
	}

	stmt, err := translateQueryStatement(ctx.QueryStatement())
	if err != nil {
		t.err = err
		return nil
	}

	return ast.NewLookupStage(
		stmt.DatabaseName+"."+stmt.CollectionName,
		nil,
		"",
		as,
		lets,
		stmt.Pipeline,
	)
}

func (t *queryStageTranslator) VisitMatchStage(ctx *grammar.MatchStageContext) interface{} {
	expr, err := translateExpr(ctx.Expression())
	if err != nil {
		t.err = errors.Wrapf(err, "failed parsing match expression")
		return nil
	}

	return ast.NewMatchStage(expr)
}

func (t *queryStageTranslator) VisitProjectStage(ctx *grammar.ProjectStageContext) interface{} {
	s, err := translateProjectStage(ctx)
	if err != nil {
		t.err = errors.Wrap(err, "failed translating project stage")
		return nil
	}

	return s
}

func (t *queryStageTranslator) VisitSkipStage(ctx *grammar.SkipStageContext) interface{} {
	n, err := strconv.ParseInt(ctx.INT().GetText(), 10, 64)
	if err != nil {
		t.err = errors.Wrapf(err, "failed parsing limit stage count")
		return nil
	}

	return ast.NewSkipStage(n)
}

func (t *queryStageTranslator) VisitSortStage(ctx *grammar.SortStageContext) interface{} {
	sfs := ctx.AllSortField()
	items := make([]*ast.SortItem, len(sfs))
	for i, sf := range sfs {
		item := sf.Accept(t)
		if t.err != nil {
			return nil
		}

		items[i] = item.(*ast.SortItem)
	}

	return ast.NewSortStage(items...)
}

func (t *queryStageTranslator) VisitSortField(ctx *grammar.SortFieldContext) interface{} {
	fr, err := translateMultipartFieldName(ctx.MultipartFieldName())
	if err != nil {
		t.err = err
		return nil
	}

	return ast.NewSortItem(fr, ctx.DESC() != nil)
}

func (t *queryStageTranslator) VisitUnwindStage(ctx *grammar.UnwindStageContext) interface{} {
	fr, err := translateMultipartFieldName(ctx.MultipartFieldName())
	if err != nil {
		t.err = err
		return nil
	}

	var arrayIndexField string
	var preserveNullAndEmpty bool
	options := ctx.AllUnwindOption()
	for _, o := range options {
		temp := o.Accept(t)
		if t.err != nil {
			return nil
		}

		uo := temp.(unwindOption)
		switch {
		case uo.arrayIndexField != "":
			arrayIndexField = uo.arrayIndexField
		case uo.preserveNullAndEmpty:
			preserveNullAndEmpty = true
		}
	}

	return ast.NewUnwindStage(fr, arrayIndexField, preserveNullAndEmpty)
}

type unwindOption struct {
	arrayIndexField      string
	preserveNullAndEmpty bool
}

func (t *queryStageTranslator) VisitUnwindOption(ctx *grammar.UnwindOptionContext) interface{} {
	switch {
	case ctx.MultipartFieldDeclaration() != nil:
		arrayIndexField, err := translateMultipartFieldDeclaration(ctx.MultipartFieldDeclaration())
		if err != nil {
			t.err = err
			return nil
		}

		return unwindOption{arrayIndexField: arrayIndexField}
	case ctx.PRESERVE_NULL_AND_EMPTY() != nil:
		return unwindOption{preserveNullAndEmpty: true}
	default:
		t.err = errors.New("unsupported unwind option")
		return nil
	}
}

func translateProjectStage(ctx *grammar.ProjectStageContext) (*ast.ProjectStage, error) {
	t := &projectItemTranslator{}
	pis := ctx.AllProjectItem()
	items := make([]ast.ProjectItem, len(pis))
	for i, pi := range pis {
		item := pi.Accept(t)
		if t.err != nil {
			return nil, errors.Wrapf(t.err, "failed translating project item %d", i)
		}

		items[i] = item.(ast.ProjectItem)
	}

	return ast.NewProjectStage(items...), nil
}

type projectItemTranslator struct {
	*grammar.BaseMQLVisitor
	err error
}

func (t *projectItemTranslator) translate(ctx grammar.IProjectItemContext) (ast.ProjectItem, error) {
	result := ctx.Accept(t)
	if t.err != nil {
		return nil, t.err
	}

	return result.(ast.ProjectItem), nil
}

func (t *projectItemTranslator) VisitAssignProjectItem(ctx *grammar.AssignProjectItemContext) interface{} {
	s, err := translateFieldDeclaration(ctx.FieldDeclaration())
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing include project item")
		return nil
	}

	expr, err := translateExpr(ctx.Expression())
	if err != nil {
		t.err = errors.Wrapf(err, "failed parsing assign project item")
		return nil
	}

	return ast.NewAssignProjectItem(s, expr)
}

func (t *projectItemTranslator) VisitExcludeProjectItem(ctx *grammar.ExcludeProjectItemContext) interface{} {
	s, err := translateMultipartFieldDeclaration(ctx.MultipartFieldDeclaration())
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing include project item")
		return nil
	}

	fr, err := astparser.ParseFieldRef(s)
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing field ref")
		return nil
	}

	return ast.NewExcludeProjectItem(fr.(*ast.FieldRef))
}

func (t *projectItemTranslator) VisitIncludeProjectItem(ctx *grammar.IncludeProjectItemContext) interface{} {
	s, err := translateMultipartFieldDeclaration(ctx.MultipartFieldDeclaration())
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing include project item")
		return nil
	}

	fr, err := astparser.ParseFieldRef(s)
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing field ref")
		return nil
	}

	return ast.NewIncludeProjectItem(fr.(*ast.FieldRef))
}

func translateExpr(ctx grammar.IExpressionContext) (ast.Expr, error) {
	t := &exprTranslator{}
	return t.translate(ctx)
}

type exprTranslator struct {
	*grammar.BaseMQLVisitor
	err error
}

func (t *exprTranslator) translate(ctx grammar.IExpressionContext) (ast.Expr, error) {
	result := ctx.Accept(t)
	if t.err != nil {
		return nil, t.err
	}

	return result.(ast.Expr), nil
}

func (t *exprTranslator) VisitAdditionExpression(ctx *grammar.AdditionExpressionContext) interface{} {
	allExpressions := ctx.AllExpression()
	left, err := t.translate(allExpressions[0])
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing comparison lhs")
		return nil
	}
	right, err := t.translate(allExpressions[1])
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing comparison rhs")
		return nil
	}

	var op string
	switch ctx.GetOp().GetTokenType() {
	case grammar.MQLParserMINUS:
		op = "$subtract"
	case grammar.MQLParserPLUS:
		op = "$add"
	default:
		t.err = errors.Errorf("unknown addition operator %q", ctx.GetOp().GetText())
		return nil
	}

	return ast.NewFunction(op, ast.NewArray(left, right))
}

func (t *exprTranslator) VisitAndExpression(ctx *grammar.AndExpressionContext) interface{} {
	allExpressions := ctx.AllExpression()
	left, err := t.translate(allExpressions[0])
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing AND lhs")
		return nil
	}
	right, err := t.translate(allExpressions[1])
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing AND rhs")
		return nil
	}

	return ast.NewBinary(ast.And, left, right)
}

func (t *exprTranslator) VisitArray(ctx *grammar.ArrayContext) interface{} {
	exprs := ctx.AllExpression()
	elems := make([]ast.Expr, len(exprs))
	for i, expr := range exprs {
		elem, err := t.translate(expr)
		if err != nil {
			t.err = errors.Wrapf(err, "failed translated array element %d", i)
			return nil
		}

		elems[i] = elem
	}

	return ast.NewArray(elems...)
}

func (t *exprTranslator) VisitArrayExpression(ctx *grammar.ArrayExpressionContext) interface{} {
	return ctx.Array().Accept(t)
}

func (t *exprTranslator) VisitArrayAccessExpression(ctx *grammar.ArrayAccessExpressionContext) interface{} {
	parent, err := t.translate(ctx.Expression(0))
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing array access expression parent")
		return nil
	}

	var indexExpr ast.Expr
	if index := ctx.GetIndex(); index != nil {
		indexExpr, err = t.translate(index)
		if err != nil {
			t.err = errors.Wrap(err, "failed parsing array access index expression")
			return nil
		}
	}

	var endExpr ast.Expr
	if end := ctx.GetEnd(); end != nil {
		endExpr, err = t.translate(end)
		if err != nil {
			t.err = errors.Wrap(err, "failed parsing array access end expression")
			return nil
		}
	}

	var stepExpr ast.Expr
	if step := ctx.GetStep(); step != nil {
		stepExpr, err = t.translate(step)
		if err != nil {
			t.err = errors.Wrap(err, "failed parsing array access step expression")
		}
	}

	isRange := ctx.RANGE() != nil
	if rangeExpr, ok := indexExpr.(*ast.Function); ok && rangeExpr.Name == "$range" {
		args := rangeExpr.Arg.(*ast.Array).Elements
		indexExpr = args[0]
		endExpr = args[1]
		if len(args) == 3 {
			stepExpr = args[2]
		}
		isRange = true
	}

	if !isRange {
		if indexExpr != nil {
			return ast.NewArrayIndexRef(indexExpr, parent)
		}

		return parent
	}

	var access ast.Expr
	switch {
	case indexExpr == nil && endExpr == nil:
		access = parent
	case indexExpr == nil:
		access = ast.NewFunction(
			"$slice",
			ast.NewArray(
				parent,
				endExpr,
			),
		)
	case endExpr == nil:
		access = ast.NewLet(
			[]*ast.LetVariable{
				ast.NewLetVariable("array", parent),
			},
			ast.NewFunction(
				"$slice",
				ast.NewArray(
					ast.NewVariableRef("array"),
					ast.NewFunction(
						"$subtract",
						ast.NewArray(
							indexExpr,
							ast.NewFunction(
								"$size",
								ast.NewVariableRef("array"),
							),
						),
					),
				),
			),
		)
	default:
		access = ast.NewFunction(
			"$slice",
			ast.NewArray(
				parent,
				indexExpr,
				ast.NewFunction(
					"$subtract",
					ast.NewArray(
						endExpr,
						indexExpr,
					),
				),
			),
		)
	}

	if stepExpr != nil {
		return ast.NewLet(
			[]*ast.LetVariable{
				ast.NewLetVariable("array", access),
			},
			ast.NewMap(
				ast.NewFilter(
					ast.NewFunction(
						"$zip",
						ast.NewDocument(
							ast.NewDocumentElement(
								"inputs",
								ast.NewArray(
									ast.NewFunction(
										"$range",
										ast.NewArray(
											astutil.Int32(0),
											ast.NewFunction(
												"$size",
												ast.NewVariableRef("array"),
											),
										),
									),
									ast.NewVariableRef("array"),
								),
							),
						),
					),
					"x",
					ast.NewBinary(
						ast.Equals,
						astutil.Int32(0),
						ast.NewFunction(
							"$mod",
							ast.NewArray(
								ast.NewArrayIndexRef(
									astutil.Int32(0),
									ast.NewVariableRef("x"),
								),
								stepExpr,
							),
						),
					),
				),
				"x",
				ast.NewArrayIndexRef(
					astutil.Int32(1),
					ast.NewVariableRef("x"),
				),
			),
		)
	}

	return access
}

func (t *exprTranslator) VisitBinValue(ctx *grammar.BinValueContext) interface{} {
	text := ctx.BIN().GetText()[2:]

	c, err := parseIntegralValue(text, 2, false)
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing bin")
		return nil
	}

	return c
}

func (t *exprTranslator) VisitBooleanValue(ctx *grammar.BooleanValueContext) interface{} {
	if ctx.TRUE() != nil {
		return astutil.True
	}

	return astutil.False
}

func (t *exprTranslator) VisitComparisonExpression(ctx *grammar.ComparisonExpressionContext) interface{} {
	allExpressions := ctx.AllExpression()
	left, err := t.translate(allExpressions[0])
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing comparison lhs")
		return nil
	}
	right, err := t.translate(allExpressions[1])
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing comparison rhs")
		return nil
	}

	var op ast.BinaryOp
	switch ctx.GetOp().GetTokenType() {
	case grammar.MQLParserEQ:
		op = ast.Equals
	case grammar.MQLParserGT:
		op = ast.GreaterThan
	case grammar.MQLParserGTE:
		op = ast.GreaterThanOrEquals
	case grammar.MQLParserLT:
		op = ast.LessThan
	case grammar.MQLParserLTE:
		op = ast.LessThanOrEquals
	case grammar.MQLParserNEQ:
		op = ast.NotEquals
	default:
		t.err = errors.Errorf("unknown comparison operator %q", ctx.GetOp().GetText())
		return nil
	}

	return ast.NewBinary(op, left, right)
}

func (t *exprTranslator) VisitConcatExpression(ctx *grammar.ConcatExpressionContext) interface{} {
	allExpressions := ctx.AllExpression()
	left, err := t.translate(allExpressions[0])
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing AND lhs expression")
		return nil
	}
	right, err := t.translate(allExpressions[1])
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing AND rhs expression")
		return nil
	}

	return ast.NewFunction("$concat", ast.NewArray(left, right))
}

func (t *exprTranslator) VisitConditionalExpression(ctx *grammar.ConditionalExpressionContext) interface{} {
	allExpressions := ctx.AllExpression()
	cond, err := t.translate(allExpressions[0])
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing conditional condition expression")
		return nil
	}
	truePart, err := t.translate(allExpressions[1])
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing conditional true expression")
		return nil
	}
	falsePart, err := t.translate(allExpressions[2])
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing conditional false expression")
		return nil
	}

	return ast.NewFunction("$cond", ast.NewArray(cond, truePart, falsePart))
}

func (t *exprTranslator) VisitDateTimeValue(ctx *grammar.DateTimeValueContext) interface{} {
	text := ctx.DATE_TIME().GetText()
	dt, err := time.Parse(time.RFC3339, text[3:len(text)-1])
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing datetime")
		return nil
	}

	return astutil.DateTime(dt)
}

func (t *exprTranslator) VisitDecimalValue(ctx *grammar.DecimalValueContext) interface{} {
	text := ctx.DECIMAL().GetText()
	text = text[:len(text)-1]

	v, err := astutil.ParseDecimal128(text)
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing decimal")
		return nil
	}

	return v
}

func (t *exprTranslator) VisitDocument(ctx *grammar.DocumentContext) interface{} {
	fas := ctx.AllFieldAssignment()
	elems := make([]*ast.DocumentElement, len(fas))
	for i, fa := range fas {
		elem, err := translateFieldAssignment(fa)
		if err != nil {
			t.err = errors.Wrapf(err, "failed translating document element %d", i)
			return nil
		}

		elems[i] = elem
	}

	return ast.NewDocument(elems...)
}

func (t *exprTranslator) VisitDocumentExpression(ctx *grammar.DocumentExpressionContext) interface{} {
	return ctx.Document().Accept(t)
}

func (t *exprTranslator) VisitDoubleValue(ctx *grammar.DoubleValueContext) interface{} {
	text := ctx.DOUBLE().GetText()
	if text[len(text)-1] == 'F' || text[len(text)-1] == 'f' {
		text = text[:len(text)-1]
	}

	v, err := strconv.ParseFloat(text, 64)
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing decimal")
		return nil
	}

	return astutil.Double(v)
}

func (t *exprTranslator) VisitFieldExpression(ctx *grammar.FieldExpressionContext) interface{} {
	ref, err := translateFieldName(ctx.FieldName())
	if err != nil {
		t.err = err
		return nil
	}

	return ref
}

func (t *exprTranslator) VisitFunction(ctx *grammar.FunctionContext) interface{} {
	name, err := translateFunctionName(ctx.FunctionName())
	if err != nil {
		t.err = err
		return nil
	}

	var arg ast.Expr
	if args := ctx.FunctionArguments(); args != nil {
		r := args.Accept(t)
		if t.err != nil {
			return nil
		}

		arg = r.(ast.Expr)
	}

	return ast.NewFunction("$"+name, arg)
}

func (t *exprTranslator) VisitFunctionArrayArguments(ctx *grammar.FunctionArrayArgumentsContext) interface{} {
	args := ctx.AllExpression()
	items := make([]ast.Expr, len(args))
	for i, arg := range args {
		item, err := t.translate(arg)
		if err != nil {
			t.err = err
			return nil
		}

		items[i] = item
	}

	return ast.NewArray(items...)
}

func (t *exprTranslator) VisitFunctionDocumentArguments(ctx *grammar.FunctionDocumentArgumentsContext) interface{} {
	args := ctx.AllFunctionNamedArgument()
	items := make([]*ast.DocumentElement, len(args))
	for i, arg := range args {
		item := arg.Accept(t)
		if t.err != nil {
			return nil
		}

		items[i] = item.(*ast.DocumentElement)
	}

	return ast.NewDocument(items...)
}

func (t *exprTranslator) VisitFunctionExpression(ctx *grammar.FunctionExpressionContext) interface{} {
	return ctx.Function().Accept(t)
}

func (t *exprTranslator) VisitFunctionName(ctx *grammar.FunctionNameContext) interface{} {
	return stripQuotes(ctx.ID())
}

func (t *exprTranslator) VisitFunctionNamedArgument(ctx *grammar.FunctionNamedArgumentContext) interface{} {
	name, err := translateFunctionArgumentName(ctx.FunctionArgumentName())
	if err != nil {
		t.err = nil
		return nil
	}

	expr, err := t.translate(ctx.Expression())
	if err != nil {
		t.err = nil
		return nil
	}

	return ast.NewDocumentElement(name, expr)
}

func (t *exprTranslator) VisitHexValue(ctx *grammar.HexValueContext) interface{} {
	text := ctx.HEX().GetText()[2:]

	c, err := parseIntegralValue(text, 16, false)
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing hex")
		return nil
	}

	return c
}

func (t *exprTranslator) VisitInExpression(ctx *grammar.InExpressionContext) interface{} {
	expr, err := t.translate(ctx.Expression())
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing subject of in expression")
		return nil
	}

	array := ctx.Array().Accept(t)
	if t.err != nil {
		t.err = errors.Wrap(t.err, "failed parsing array of in expression")
		return nil
	}

	result := ast.NewFunction("$in", ast.NewArray(expr, array.(ast.Expr)))
	if ctx.NOT() != nil {
		result = ast.NewFunction("$not", result)
	}

	return result
}

func (t *exprTranslator) VisitIntValue(ctx *grammar.IntValueContext) interface{} {
	text := ctx.INT().GetText()

	c, err := parseIntegralValue(text, 10, false)
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing int")
		return nil
	}

	return c
}

func (t *exprTranslator) VisitLetExpression(ctx *grammar.LetExpressionContext) interface{} {
	vas := ctx.AllVariableAssignment()
	vars := make([]*ast.DocumentElement, len(vas))
	for i, va := range vas {
		v, err := translateVariableAssignment(va)
		if err != nil {
			t.err = errors.Wrapf(err, "failed parsing variable assignment %d, of LET expression", i)
			return nil
		}

		vars[i] = v
	}

	expr, err := t.translate(ctx.Expression())
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing expression of LET expression")
		return nil
	}

	return ast.NewFunction(
		"$let",
		ast.NewDocument(
			ast.NewDocumentElement("vars", ast.NewDocument(vars...)),
			ast.NewDocumentElement("in", expr),
		),
	)
}

func (t *exprTranslator) VisitLikeExpression(ctx *grammar.LikeExpressionContext) interface{} {
	expr, err := t.translate(ctx.Expression())
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing expression of regex expression")
		return nil
	}

	s, options := parseRegex(ctx.REGEX().GetText())

	return ast.NewBinary(
		ast.Equals,
		expr,
		astutil.Regex(s, options),
	)
}

func (t *exprTranslator) VisitLongBinValue(ctx *grammar.LongBinValueContext) interface{} {
	text := ctx.LONG_BIN().GetText()[2:]
	text = text[:len(text)-1]

	c, err := parseIntegralValue(text, 2, true)
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing long bin")
		return nil
	}

	return c
}

func (t *exprTranslator) VisitLongHexValue(ctx *grammar.LongHexValueContext) interface{} {
	text := ctx.LONG_HEX().GetText()[2:]
	text = text[:len(text)-1]

	c, err := parseIntegralValue(text, 16, true)
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing long hex")
		return nil
	}

	return c
}

func (t *exprTranslator) VisitLongOctValue(ctx *grammar.LongOctValueContext) interface{} {
	text := ctx.LONG_OCT().GetText()[2:]
	text = text[:len(text)-1]

	c, err := parseIntegralValue(text, 8, true)
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing long oct")
		return nil
	}

	return c
}

func (t *exprTranslator) VisitLongValue(ctx *grammar.LongValueContext) interface{} {
	text := ctx.LONG().GetText()
	text = text[:len(text)-1]

	c, err := parseIntegralValue(text, 10, true)
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing long")
		return nil
	}

	return c
}

func (t *exprTranslator) VisitMemberExpression(ctx *grammar.MemberExpressionContext) interface{} {
	parentExpr, err := t.translate(ctx.Expression())
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing not expression")
		return nil
	}

	if fn := ctx.FieldName(); fn != nil {
		ref, err := translateFieldName(ctx.FieldName())
		if err != nil {
			t.err = err
			return nil
		}

		return ast.NewFieldRef(ref.Name, parentExpr)
	}

	f := ctx.Function().Accept(t)
	if t.err != nil {
		return nil
	}

	fn := f.(*ast.Function)
	switch typedArg := fn.Arg.(type) {
	case nil:
		return ast.NewFunction(fn.Name, ast.NewArray(parentExpr))
	case *ast.Array:
		return ast.NewFunction(fn.Name, ast.NewArray(append([]ast.Expr{parentExpr}, typedArg.Elements...)...))
	default:
		t.err = errors.New("member functions can only be used with positional arguments")
		return nil
	}
}

func (t *exprTranslator) VisitMultiplicationExpression(ctx *grammar.MultiplicationExpressionContext) interface{} {
	allExpressions := ctx.AllExpression()
	left, err := t.translate(allExpressions[0])
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing comparison lhs expression")
		return nil
	}
	right, err := t.translate(allExpressions[1])
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing comparison rhs expression")
		return nil
	}

	var op string
	switch ctx.GetOp().GetTokenType() {
	case grammar.MQLParserDIV:
		op = "$divide"
	case grammar.MQLParserMOD:
		op = "$mod"
	case grammar.MQLParserMULT:
		op = "$multiply"
	default:
		t.err = errors.Errorf("unknown addition operator %q", ctx.GetOp().GetText())
		return nil
	}

	return ast.NewFunction(op, ast.NewArray(left, right))
}

func (t *exprTranslator) VisitNotExpression(ctx *grammar.NotExpressionContext) interface{} {
	expr, err := t.translate(ctx.Expression())
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing not expression")
		return nil
	}

	return ast.NewUnary(ast.Not, expr)
	return ast.NewFunction("$not", expr)
}

func (t *exprTranslator) VisitNullCoalesceExpression(ctx *grammar.NullCoalesceExpressionContext) interface{} {
	allExpressions := ctx.AllExpression()
	left, err := t.translate(allExpressions[0])
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing AND lhs expression")
		return nil
	}
	right, err := t.translate(allExpressions[1])
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing AND rhs expression")
		return nil
	}

	return ast.NewFunction("$ifNull", ast.NewArray(left, right))
}

func (t *exprTranslator) VisitNumberValue(ctx *grammar.NumberValueContext) interface{} {
	return ctx.Number().Accept(t)
}

func (t *exprTranslator) VisitNullValue(ctx *grammar.NullValueContext) interface{} {
	return ast.NewConstant(bsoncore.Value{
		Type: bsontype.Null,
	})
}

func (t *exprTranslator) VisitOctValue(ctx *grammar.OctValueContext) interface{} {
	text := ctx.OCT().GetText()[2:]

	c, err := parseIntegralValue(text, 8, false)
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing oct")
		return nil
	}

	return c
}

func (t *exprTranslator) VisitOidValue(ctx *grammar.OidValueContext) interface{} {
	v, err := astutil.ParseObjectID(ctx.OID().GetText()[4:28])
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing ObjectID")
		return nil
	}

	return v
}

func (t *exprTranslator) VisitOrExpression(ctx *grammar.OrExpressionContext) interface{} {
	allExpressions := ctx.AllExpression()
	left, err := t.translate(allExpressions[0])
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing OR lhs expression")
		return nil
	}
	right, err := t.translate(allExpressions[1])
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing OR rhs expression")
		return nil
	}

	op := ast.Or
	if ctx.NOR() != nil {
		op = ast.Nor
	}

	return ast.NewBinary(op, left, right)
}

func (t *exprTranslator) VisitParenthesisExpression(ctx *grammar.ParenthesisExpressionContext) interface{} {
	return ctx.Expression().Accept(t)
}

func (t *exprTranslator) VisitPowerExpression(ctx *grammar.PowerExpressionContext) interface{} {
	allExpressions := ctx.AllExpression()
	left, err := t.translate(allExpressions[0])
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing POWER lhs expression")
		return nil
	}
	right, err := t.translate(allExpressions[1])
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing POWER rhs expression")
		return nil
	}

	return ast.NewFunction("$pow", ast.NewArray(left, right))
}

func (t *exprTranslator) VisitRangeExpression(ctx *grammar.RangeExpressionContext) interface{} {
	allExpressions := ctx.AllExpression()
	start, err := t.translate(allExpressions[0])
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing RANGE start expression")
		return nil
	}
	end, err := t.translate(allExpressions[1])
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing RANGE end expression")
		return nil
	}

	if len(allExpressions) == 3 {
		step, err := t.translate(allExpressions[2])
		if err != nil {
			t.err = errors.Wrap(err, "failed parsing RANGE step expression")
			return nil
		}
		return ast.NewFunction("$range", ast.NewArray(start, end, step))
	}

	return ast.NewFunction("$range", ast.NewArray(start, end))
}

func (t *exprTranslator) VisitRegexValue(ctx *grammar.RegexValueContext) interface{} {
	s, options := parseRegex(ctx.REGEX().GetText())

	return astutil.Regex(s, options)
}

func (t *exprTranslator) VisitStringValue(ctx *grammar.StringValueContext) interface{} {
	return astutil.String(stripQuotes(ctx.STRING()))
}

func (t *exprTranslator) VisitSwitchExpression(ctx *grammar.SwitchExpressionContext) interface{} {
	cases := ctx.AllSwitchCase()
	branches := make([]ast.Expr, len(cases))
	for i, c := range cases {
		b := c.Accept(t)
		if t.err != nil {
			return nil
		}

		branches[i] = b.(ast.Expr)
	}

	elems := []*ast.DocumentElement{
		ast.NewDocumentElement("branches", ast.NewArray(branches...)),
	}

	expr := ctx.Expression()
	if expr != nil {
		def, err := t.translate(expr)
		if err != nil {
			t.err = errors.Wrap(err, "failed parsing SWITCH else expression")
			return nil
		}
		elems = append(elems, ast.NewDocumentElement("default", def))
	}

	return ast.NewFunction("$switch", ast.NewDocument(elems...))
}

func (t *exprTranslator) VisitSwitchCase(ctx *grammar.SwitchCaseContext) interface{} {
	allExpressions := ctx.AllExpression()
	cond, err := t.translate(allExpressions[0])
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing SWITCH CASE conditional expression")
		return nil
	}
	then, err := t.translate(allExpressions[1])
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing SWITCH CASE then expression")
		return nil
	}

	return ast.NewDocument(
		ast.NewDocumentElement("case", cond),
		ast.NewDocumentElement("then", then),
	)
}

func (t *exprTranslator) VisitUnaryMinusExpression(ctx *grammar.UnaryMinusExpressionContext) interface{} {
	expr, err := t.translate(ctx.Expression())
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing unary minus expression")
		return nil
	}

	return ast.NewFunction(
		"$multiply",
		ast.NewArray(
			expr,
			astutil.Int32(-1),
		),
	)
}

func (t *exprTranslator) VisitValueExpression(ctx *grammar.ValueExpressionContext) interface{} {
	return ctx.Value().Accept(t)
}

func (t *exprTranslator) VisitVariableExpression(ctx *grammar.VariableExpressionContext) interface{} {
	variableName := ctx.VariableName().Accept(t).(string)
	return ast.NewVariableRef(variableName)
}

func (t *exprTranslator) VisitVariableName(ctx *grammar.VariableNameContext) interface{} {
	return ctx.VARIABLE_ID().GetText()[1:]
}

func translateFieldAssignment(ctx grammar.IFieldAssignmentContext) (*ast.DocumentElement, error) {
	t := &fieldAssignmentTranslator{}
	return t.translate(ctx)
}

type fieldAssignmentTranslator struct {
	*grammar.BaseMQLVisitor
	err error
}

func (t *fieldAssignmentTranslator) translate(ctx grammar.IFieldAssignmentContext) (*ast.DocumentElement, error) {
	result := ctx.Accept(t)
	if t.err != nil {
		return nil, t.err
	}

	return result.(*ast.DocumentElement), nil
}

func (t *fieldAssignmentTranslator) VisitFieldAssignment(ctx *grammar.FieldAssignmentContext) interface{} {
	fd, err := translateFieldDeclaration(ctx.FieldDeclaration())
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing field declaration")
		return nil
	}

	expr, err := translateExpr(ctx.Expression())
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing expression")
		return nil
	}

	return ast.NewDocumentElement(fd, expr)
}

func translateMultipartFieldDeclaration(ctx grammar.IMultipartFieldDeclarationContext) (string, error) {
	t := &fieldDeclarationTranslator{}
	return t.translateMultipartFieldDeclaration(ctx)
}

func translateFieldDeclaration(ctx grammar.IFieldDeclarationContext) (string, error) {
	t := &fieldDeclarationTranslator{}
	return t.translateFieldDeclaration(ctx)
}

type fieldDeclarationTranslator struct {
	*grammar.BaseMQLVisitor
	err error
}

func (t *fieldDeclarationTranslator) translateMultipartFieldDeclaration(ctx grammar.IMultipartFieldDeclarationContext) (string, error) {
	result := ctx.Accept(t)
	if t.err != nil {
		return "", t.err
	}

	return result.(string), nil
}

func (t *fieldDeclarationTranslator) translateFieldDeclaration(ctx grammar.IFieldDeclarationContext) (string, error) {
	result := ctx.Accept(t)
	if t.err != nil {
		return "", t.err
	}

	return result.(string), nil
}

func (t *fieldDeclarationTranslator) VisitMultipartFieldDeclaration(ctx *grammar.MultipartFieldDeclarationContext) interface{} {
	fds := ctx.AllFieldDeclaration()
	result := make([]string, len(fds))
	for i, fd := range fds {
		r := fd.Accept(t)
		if t.err != nil {
			return nil
		}
		result[i] = r.(string)
	}

	return strings.Join(result, ".")
}

func (t *fieldDeclarationTranslator) VisitFieldDeclaration(ctx *grammar.FieldDeclarationContext) interface{} {
	return stripQuotes(ctx.ID())
}

func translateCollectionName(ctx grammar.ICollectionNameContext) ([]string, error) {
	t := &nameTranslator{}
	return t.translateCollectionName(ctx)
}

func translateDatabaseName(ctx grammar.IDatabaseNameContext) (string, error) {
	t := &nameTranslator{}
	return t.translateDatabaseName(ctx)
}

func translateFieldName(ctx grammar.IFieldNameContext) (*ast.FieldRef, error) {
	t := &nameTranslator{}
	return t.translateFieldName(ctx)
}

func translateFunctionName(ctx grammar.IFunctionNameContext) (string, error) {
	t := &nameTranslator{}
	return t.translateFunctionName(ctx)
}

func translateFunctionArgumentName(ctx grammar.IFunctionArgumentNameContext) (string, error) {
	t := &nameTranslator{}
	return t.translateFunctionArgumentName(ctx)
}

func translateMultipartFieldName(ctx grammar.IMultipartFieldNameContext) (*ast.FieldRef, error) {
	t := &nameTranslator{}
	return t.translateMultipartFieldName(ctx)
}

type nameTranslator struct {
	*grammar.BaseMQLVisitor
	err error
}

func (t *nameTranslator) translateCollectionName(ctx grammar.ICollectionNameContext) ([]string, error) {
	result := ctx.Accept(t)
	if t.err != nil {
		return nil, t.err
	}

	return result.([]string), nil
}

func (t *nameTranslator) translateDatabaseName(ctx grammar.IDatabaseNameContext) (string, error) {
	result := ctx.Accept(t)
	if t.err != nil {
		return "", t.err
	}

	return result.(string), nil
}

func (t *nameTranslator) translateFieldName(ctx grammar.IFieldNameContext) (*ast.FieldRef, error) {
	result := ctx.Accept(t)
	if t.err != nil {
		return nil, t.err
	}

	return ast.NewFieldRef(result.(string), nil), nil
}

func (t *nameTranslator) translateFunctionName(ctx grammar.IFunctionNameContext) (string, error) {
	result := ctx.Accept(t)
	if t.err != nil {
		return "", t.err
	}

	return result.(string), nil
}

func (t *nameTranslator) translateFunctionArgumentName(ctx grammar.IFunctionArgumentNameContext) (string, error) {
	result := ctx.Accept(t)
	if t.err != nil {
		return "", t.err
	}

	return result.(string), nil
}

func (t *nameTranslator) translateMultipartFieldName(ctx grammar.IMultipartFieldNameContext) (*ast.FieldRef, error) {
	result := ctx.Accept(t)
	if t.err != nil {
		return nil, t.err
	}

	return result.(*ast.FieldRef), nil
}

func (t *nameTranslator) VisitCollectionName(ctx *grammar.CollectionNameContext) interface{} {
	c := stripQuotes(ctx.ID())
	var d string
	if ctx.DatabaseName() != nil {
		d = ctx.DatabaseName().Accept(t).(string)
	}

	return []string{d, c}
}

func (t *nameTranslator) VisitDatabaseName(ctx *grammar.DatabaseNameContext) interface{} {
	return stripQuotes(ctx.ID())
}

func (t *nameTranslator) VisitFieldName(ctx *grammar.FieldNameContext) interface{} {
	return stripQuotes(ctx.ID())
}

func (t *nameTranslator) VisitFunctionName(ctx *grammar.FunctionNameContext) interface{} {
	return stripQuotes(ctx.ID())
}

func (t *nameTranslator) VisitFunctionArgumentName(ctx *grammar.FunctionArgumentNameContext) interface{} {
	return stripQuotes(ctx.ID())
}

func (t *nameTranslator) VisitMultipartFieldName(ctx *grammar.MultipartFieldNameContext) interface{} {
	fns := ctx.AllFieldName()
	var ref *ast.FieldRef
	for _, fn := range fns {
		r := fn.Accept(t)
		if t.err != nil {
			return nil
		}

		// NOTE: handling difference between typed nil and bare nil.
		if ref == nil {
			ref = ast.NewFieldRef(r.(string), nil)
		} else {
			ref = ast.NewFieldRef(r.(string), ref)
		}
	}

	return ref
}

func translateVariableAssignment(ctx grammar.IVariableAssignmentContext) (*ast.DocumentElement, error) {
	t := &variableAssignmentTranslator{}
	return t.translate(ctx)
}

type variableAssignmentTranslator struct {
	*grammar.BaseMQLVisitor
	err error
}

func (t *variableAssignmentTranslator) translate(ctx grammar.IVariableAssignmentContext) (*ast.DocumentElement, error) {
	result := ctx.Accept(t)
	if t.err != nil {
		return nil, t.err
	}

	return result.(*ast.DocumentElement), nil
}

func (t *variableAssignmentTranslator) VisitVariableAssignment(ctx *grammar.VariableAssignmentContext) interface{} {
	name := ctx.VariableName().GetText()[1:]

	expr, err := translateExpr(ctx.Expression())
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing expression")
		return nil
	}

	return ast.NewDocumentElement(name, expr)
}

func parseIntegralValue(s string, radix int, forceLong bool) (*ast.Constant, error) {
	n, err := strconv.ParseInt(s, radix, 64)
	if err != nil {
		return nil, err
	}

	if forceLong || n >= math.MaxInt32 || n <= math.MinInt32 {
		return astutil.Int64(n), nil
	}

	return astutil.Int32(int32(n)), nil
}

func parseRegex(s string) (string, string) {
	split := strings.LastIndexByte(s, '/')
	options := s[split+1:]
	return strings.Replace(s[1:split], "\\/", "/", -1), options
}

func stripQuotes(n antlr.TerminalNode) string {
	t := n.GetText()
	switch t[0] {
	case '"', '\'', '`':
		return t[1 : len(t)-1]
	default:
		return t
	}
}
