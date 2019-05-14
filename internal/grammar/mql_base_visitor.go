// Code generated from ./internal/grammar/MQL.g4 by ANTLR 4.7.1. DO NOT EDIT.

package grammar // MQL
import "github.com/antlr/antlr4/runtime/Go/antlr"

type BaseMQLVisitor struct {
	*antlr.BaseParseTreeVisitor
}

func (v *BaseMQLVisitor) VisitStatement(ctx *StatementContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitQueryStatement(ctx *QueryStatementContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitPipeline(ctx *PipelineContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitShowCollectionsStatement(ctx *ShowCollectionsStatementContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitShowDatabasesStatement(ctx *ShowDatabasesStatementContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitUseDatabaseStatement(ctx *UseDatabaseStatementContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitGroupStage(ctx *GroupStageContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitLimitStage(ctx *LimitStageContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitLookupStage(ctx *LookupStageContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitMatchStage(ctx *MatchStageContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitProjectStage(ctx *ProjectStageContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitSkipStage(ctx *SkipStageContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitSortStage(ctx *SortStageContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitUnwindStage(ctx *UnwindStageContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitExcludeProjectItem(ctx *ExcludeProjectItemContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitIncludeProjectItem(ctx *IncludeProjectItemContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitAssignProjectItem(ctx *AssignProjectItemContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitSortField(ctx *SortFieldContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitUnwindOption(ctx *UnwindOptionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitValueExpression(ctx *ValueExpressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitAdditionExpression(ctx *AdditionExpressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitNotExpression(ctx *NotExpressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitComparisonExpression(ctx *ComparisonExpressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitVariableExpression(ctx *VariableExpressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitConcatExpression(ctx *ConcatExpressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitNullCoalesceExpression(ctx *NullCoalesceExpressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitFunctionExpression(ctx *FunctionExpressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitAndExpression(ctx *AndExpressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitLetExpression(ctx *LetExpressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitFieldExpression(ctx *FieldExpressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitLikeExpression(ctx *LikeExpressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitDocumentExpression(ctx *DocumentExpressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitArrayExpression(ctx *ArrayExpressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitConditionalExpression(ctx *ConditionalExpressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitSwitchExpression(ctx *SwitchExpressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitParenthesisExpression(ctx *ParenthesisExpressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitMultiplicationExpression(ctx *MultiplicationExpressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitMemberExpression(ctx *MemberExpressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitOrExpression(ctx *OrExpressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitUnaryMinusExpression(ctx *UnaryMinusExpressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitPowerExpression(ctx *PowerExpressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitArrayAccessExpression(ctx *ArrayAccessExpressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitInExpression(ctx *InExpressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitRangeExpression(ctx *RangeExpressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitArray(ctx *ArrayContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitDocument(ctx *DocumentContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitFieldAssignment(ctx *FieldAssignmentContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitMultipart_document(ctx *Multipart_documentContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitMultipartFieldAssignment(ctx *MultipartFieldAssignmentContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitFunction(ctx *FunctionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitFunctionArrayArguments(ctx *FunctionArrayArgumentsContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitFunctionDocumentArguments(ctx *FunctionDocumentArgumentsContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitFunctionNamedArgument(ctx *FunctionNamedArgumentContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitLambdaArgument(ctx *LambdaArgumentContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitLambdaExpression(ctx *LambdaExpressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitSwitchCase(ctx *SwitchCaseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitVariableAssignment(ctx *VariableAssignmentContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitNumberValue(ctx *NumberValueContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitStringValue(ctx *StringValueContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitBooleanValue(ctx *BooleanValueContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitNullValue(ctx *NullValueContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitOidValue(ctx *OidValueContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitDateTimeValue(ctx *DateTimeValueContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitRegexValue(ctx *RegexValueContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitIntValue(ctx *IntValueContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitLongValue(ctx *LongValueContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitDoubleValue(ctx *DoubleValueContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitDecimalValue(ctx *DecimalValueContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitBinValue(ctx *BinValueContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitLongBinValue(ctx *LongBinValueContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitHexValue(ctx *HexValueContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitLongHexValue(ctx *LongHexValueContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitOctValue(ctx *OctValueContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitLongOctValue(ctx *LongOctValueContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitCollectionName(ctx *CollectionNameContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitDatabaseName(ctx *DatabaseNameContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitFieldDeclaration(ctx *FieldDeclarationContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitFieldName(ctx *FieldNameContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitFunctionName(ctx *FunctionNameContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitFunctionArgumentName(ctx *FunctionArgumentNameContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitMultipartFieldDeclaration(ctx *MultipartFieldDeclarationContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitMultipartFieldName(ctx *MultipartFieldNameContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseMQLVisitor) VisitVariableName(ctx *VariableNameContext) interface{} {
	return v.VisitChildren(ctx)
}
