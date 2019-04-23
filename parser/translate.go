package parser

import (
	"math"
	"strconv"
	"strings"
	"time"

	"bitbucket.org/craiggwilson/mql/internal/grammar"

	"github.com/10gen/mongoast/ast"
	astparser "github.com/10gen/mongoast/parser"
	"github.com/antlr/antlr4/runtime/Go/antlr"
	"github.com/pkg/errors"
	"go.mongodb.org/mongo-driver/bson/bsontype"
	"go.mongodb.org/mongo-driver/bson/primitive"
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

	var op ast.BinaryOp
	switch ctx.GetOp().GetTokenType() {
	case grammar.MQLParserMINUS:
		op = ast.BinaryOp("$sub")
	case grammar.MQLParserPLUS:
		op = ast.BinaryOp("$add")
	default:
		t.err = errors.Errorf("unknown addition operator %q", ctx.GetOp().GetText())
		return nil
	}

	return ast.NewBinary(op, left, right)
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
	var v bool
	if ctx.TRUE() != nil {
		v = true
	}

	return ast.NewConstant(bsoncore.Value{
		Type: bsontype.Boolean,
		Data: bsoncore.AppendBoolean(nil, v),
	})
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

func (t *exprTranslator) VisitDateTimeValue(ctx *grammar.DateTimeValueContext) interface{} {
	text := ctx.DATE_TIME().GetText()
	dt, err := time.Parse(time.RFC3339, text[3:len(text)-1])
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing datetime")
		return nil
	}

	return ast.NewConstant(bsoncore.Value{
		Type: bsontype.DateTime,
		Data: bsoncore.AppendTime(nil, dt),
	})
}

func (t *exprTranslator) VisitDecimalValue(ctx *grammar.DecimalValueContext) interface{} {
	text := ctx.DECIMAL().GetText()
	text = text[:len(text)-1]

	v, err := primitive.ParseDecimal128(text)
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing decimal")
		return nil
	}

	return ast.NewConstant(bsoncore.Value{
		Type: bsontype.Decimal128,
		Data: bsoncore.AppendDecimal128(nil, v),
	})
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

	return ast.NewConstant(bsoncore.Value{
		Type: bsontype.Double,
		Data: bsoncore.AppendDouble(nil, v),
	})
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

func (t *exprTranslator) VisitMultiplicationExpression(ctx *grammar.MultiplicationExpressionContext) interface{} {
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
	case grammar.MQLParserDIV:
		op = ast.BinaryOp("$div")
	case grammar.MQLParserMOD:
		op = ast.BinaryOp("$mod")
	case grammar.MQLParserMULT:
		op = ast.BinaryOp("$multiply")
	default:
		t.err = errors.Errorf("unknown addition operator %q", ctx.GetOp().GetText())
		return nil
	}

	return ast.NewBinary(op, left, right)
}

func (t *exprTranslator) VisitNumberValue(ctx *grammar.NumberValueContext) interface{} {
	return ctx.Number().Accept(t)
}

func (t *exprTranslator) VisitNullValue(ctx *grammar.NullValueContext) interface{} {
	return ast.NewConstant(bsoncore.Value{
		Type: bsontype.Null,
	})
}

func (t *exprTranslator) VisitOidValue(ctx *grammar.OidValueContext) interface{} {
	oid, err := primitive.ObjectIDFromHex(ctx.OID().GetText()[4:28])
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing ObjectID")
		return nil
	}

	return ast.NewConstant(bsoncore.Value{
		Type: bsontype.ObjectID,
		Data: bsoncore.AppendObjectID(nil, oid),
	})
}

func (t *exprTranslator) VisitOrExpression(ctx *grammar.OrExpressionContext) interface{} {
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

	op := ast.Or
	if ctx.NOR() != nil {
		op = ast.Nor
	}

	return ast.NewBinary(op, left, right)
}

func (t *exprTranslator) VisitParenthesisExpression(ctx *grammar.ParenthesisExpressionContext) interface{} {
	return ctx.Expression().Accept(t)
}

func (t *exprTranslator) VisitRegexValue(ctx *grammar.RegexValueContext) interface{} {
	s := ctx.REGEX().GetText()
	split := strings.LastIndexByte(s, '/')
	options := s[split+1:]
	s = s[1:split]

	return ast.NewConstant(bsoncore.Value{
		Type: bsontype.String,
		Data: bsoncore.AppendRegex(nil, s, options),
	})
}

func (t *exprTranslator) VisitStringValue(ctx *grammar.StringValueContext) interface{} {
	return ast.NewConstant(bsoncore.Value{
		Type: bsontype.String,
		Data: bsoncore.AppendString(nil, ctx.STRING().GetText()),
	})
}

func (t *exprTranslator) VisitUnaryMinusExpression(ctx *grammar.UnaryMinusExpressionContext) interface{} {
	expr, err := t.translate(ctx.Expression())
	if err != nil {
		t.err = errors.Wrap(err, "failed parsing AND rhs")
		return nil
	}

	return ast.NewFunction(
		"multiply",
		ast.NewArray(
			expr,
			ast.NewConstant(bsoncore.Value{
				Type: bsontype.Int32,
				Data: bsoncore.AppendInt32(nil, -1),
			}),
		),
	)
}

func (t *exprTranslator) VisitValueExpression(ctx *grammar.ValueExpressionContext) interface{} {
	return ctx.Value().Accept(t)
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
		return ast.NewConstant(bsoncore.Value{
			Type: bsontype.Int64,
			Data: bsoncore.AppendInt64(nil, n),
		}), nil
	}

	return ast.NewConstant(bsoncore.Value{
		Type: bsontype.Int32,
		Data: bsoncore.AppendInt32(nil, int32(n)),
	}), nil
}

func stripQuotes(n antlr.TerminalNode) string {
	t := n.GetText()
	switch t[0] {
	case '"', '\'', '`':
		return t[1 : len(t)-2]
	default:
		return t
	}
}
