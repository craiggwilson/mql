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

func translateQueryStatement(ctx grammar.IQueryStatementContext) ([]ast.Stage, error) {
	t := &queryStatementTranslator{}
	return t.translate(ctx)
}

type queryStatementTranslator struct {
	*grammar.BaseMQLVisitor
	err error
}

func (t *queryStatementTranslator) translate(ctx grammar.IQueryStatementContext) ([]ast.Stage, error) {
	stages := ctx.Accept(t)
	if t.err != nil {
		return nil, t.err
	}

	return stages.([]ast.Stage), nil
}

func (t *queryStatementTranslator) VisitQueryStatement(ctx *grammar.QueryStatementContext) interface{} {
	var result []ast.Stage

	for i, s := range ctx.AllQueryStage() {
		stage, err := translateQueryStage(s)
		if err != nil {
			t.err = errors.Wrapf(err, "failed parsing stage %d", i)
			return nil
		}

		result = append(result, stage)
	}

	return result
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

func (t *queryStageTranslator) VisitLimitStage(ctx *grammar.LimitStageContext) interface{} {
	n, err := strconv.ParseInt(ctx.INT().GetText(), 10, 64)
	if err != nil {
		t.err = errors.Wrapf(err, "failed parsing limit stage count")
		return nil
	}

	return ast.NewLimitStage(n)
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
	start, err := t.translate(ctx.GetIndex())
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing array access expression index")
		return nil
	}

	return ast.NewArrayIndexRef(start, parent)
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
	fieldName := ctx.FieldName().Accept(t).(string)
	return ast.NewFieldRef(fieldName, nil)
}

func (t *exprTranslator) VisitFieldName(ctx *grammar.FieldNameContext) interface{} {
	return stripQuotes(ctx.ID())
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
		name := fn.Accept(t).(string)
		return ast.NewFieldRef(name, parentExpr)
	}

	t.err = errors.New("functions are only supported at the top-level")
	return nil
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

	return ast.NewFunction("$not", expr)
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
		t.err = errors.Wrap(err, "failed parsing AND lhs expression")
		return nil
	}
	right, err := t.translate(allExpressions[1])
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing AND rhs expression")
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
		t.err = errors.Wrap(err, "failed parsing AND lhs expression")
		return nil
	}
	right, err := t.translate(allExpressions[1])
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing AND rhs expression")
		return nil
	}

	return ast.NewFunction("$pow", ast.NewArray(left, right))
}

func (t *exprTranslator) VisitRegexValue(ctx *grammar.RegexValueContext) interface{} {
	s := ctx.REGEX().GetText()
	split := strings.LastIndexByte(s, '/')
	options := s[split+1:]
	s = strings.Replace(s[1:split], "\\/", "/", -1)

	return astutil.Regex(s, options)
}

func (t *exprTranslator) VisitStringValue(ctx *grammar.StringValueContext) interface{} {
	return astutil.String(stripQuotes(ctx.STRING()))
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

func stripQuotes(n antlr.TerminalNode) string {
	t := n.GetText()
	switch t[0] {
	case '"', '\'', '`':
		return t[1 : len(t)-1]
	default:
		return t
	}
}
