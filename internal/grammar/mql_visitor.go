// Code generated from ./internal/grammar/MQL.g4 by ANTLR 4.7.1. DO NOT EDIT.

package grammar // MQL
import "github.com/antlr/antlr4/runtime/Go/antlr"

// A complete Visitor for a parse tree produced by MQLParser.
type MQLVisitor interface {
	antlr.ParseTreeVisitor

	// Visit a parse tree produced by MQLParser#queryStatement.
	VisitQueryStatement(ctx *QueryStatementContext) interface{}

	// Visit a parse tree produced by MQLParser#groupStage.
	VisitGroupStage(ctx *GroupStageContext) interface{}

	// Visit a parse tree produced by MQLParser#limitStage.
	VisitLimitStage(ctx *LimitStageContext) interface{}

	// Visit a parse tree produced by MQLParser#lookupStage.
	VisitLookupStage(ctx *LookupStageContext) interface{}

	// Visit a parse tree produced by MQLParser#matchStage.
	VisitMatchStage(ctx *MatchStageContext) interface{}

	// Visit a parse tree produced by MQLParser#projectStage.
	VisitProjectStage(ctx *ProjectStageContext) interface{}

	// Visit a parse tree produced by MQLParser#skipStage.
	VisitSkipStage(ctx *SkipStageContext) interface{}

	// Visit a parse tree produced by MQLParser#sortStage.
	VisitSortStage(ctx *SortStageContext) interface{}

	// Visit a parse tree produced by MQLParser#unwindStage.
	VisitUnwindStage(ctx *UnwindStageContext) interface{}

	// Visit a parse tree produced by MQLParser#projectItem.
	VisitProjectItem(ctx *ProjectItemContext) interface{}

	// Visit a parse tree produced by MQLParser#sortField.
	VisitSortField(ctx *SortFieldContext) interface{}

	// Visit a parse tree produced by MQLParser#unwindOption.
	VisitUnwindOption(ctx *UnwindOptionContext) interface{}

	// Visit a parse tree produced by MQLParser#valueExpression.
	VisitValueExpression(ctx *ValueExpressionContext) interface{}

	// Visit a parse tree produced by MQLParser#additionExpression.
	VisitAdditionExpression(ctx *AdditionExpressionContext) interface{}

	// Visit a parse tree produced by MQLParser#notExpression.
	VisitNotExpression(ctx *NotExpressionContext) interface{}

	// Visit a parse tree produced by MQLParser#comparisonExpression.
	VisitComparisonExpression(ctx *ComparisonExpressionContext) interface{}

	// Visit a parse tree produced by MQLParser#concatExpression.
	VisitConcatExpression(ctx *ConcatExpressionContext) interface{}

	// Visit a parse tree produced by MQLParser#nullCoalesceExpression.
	VisitNullCoalesceExpression(ctx *NullCoalesceExpressionContext) interface{}

	// Visit a parse tree produced by MQLParser#newDocumentExpression.
	VisitNewDocumentExpression(ctx *NewDocumentExpressionContext) interface{}

	// Visit a parse tree produced by MQLParser#andExpression.
	VisitAndExpression(ctx *AndExpressionContext) interface{}

	// Visit a parse tree produced by MQLParser#letExpression.
	VisitLetExpression(ctx *LetExpressionContext) interface{}

	// Visit a parse tree produced by MQLParser#fieldExpression.
	VisitFieldExpression(ctx *FieldExpressionContext) interface{}

	// Visit a parse tree produced by MQLParser#functionCallExpression.
	VisitFunctionCallExpression(ctx *FunctionCallExpressionContext) interface{}

	// Visit a parse tree produced by MQLParser#likeExpression.
	VisitLikeExpression(ctx *LikeExpressionContext) interface{}

	// Visit a parse tree produced by MQLParser#newArrayExpression.
	VisitNewArrayExpression(ctx *NewArrayExpressionContext) interface{}

	// Visit a parse tree produced by MQLParser#conditionalExpression.
	VisitConditionalExpression(ctx *ConditionalExpressionContext) interface{}

	// Visit a parse tree produced by MQLParser#switchExpression.
	VisitSwitchExpression(ctx *SwitchExpressionContext) interface{}

	// Visit a parse tree produced by MQLParser#parenthesisExpression.
	VisitParenthesisExpression(ctx *ParenthesisExpressionContext) interface{}

	// Visit a parse tree produced by MQLParser#multiplicationExpression.
	VisitMultiplicationExpression(ctx *MultiplicationExpressionContext) interface{}

	// Visit a parse tree produced by MQLParser#memberExpression.
	VisitMemberExpression(ctx *MemberExpressionContext) interface{}

	// Visit a parse tree produced by MQLParser#orExpression.
	VisitOrExpression(ctx *OrExpressionContext) interface{}

	// Visit a parse tree produced by MQLParser#unaryMinusExpression.
	VisitUnaryMinusExpression(ctx *UnaryMinusExpressionContext) interface{}

	// Visit a parse tree produced by MQLParser#powerExpression.
	VisitPowerExpression(ctx *PowerExpressionContext) interface{}

	// Visit a parse tree produced by MQLParser#inExpression.
	VisitInExpression(ctx *InExpressionContext) interface{}

	// Visit a parse tree produced by MQLParser#arrayAccessExpression.
	VisitArrayAccessExpression(ctx *ArrayAccessExpressionContext) interface{}

	// Visit a parse tree produced by MQLParser#variableReferenceExpression.
	VisitVariableReferenceExpression(ctx *VariableReferenceExpressionContext) interface{}

	// Visit a parse tree produced by MQLParser#rangeExpression.
	VisitRangeExpression(ctx *RangeExpressionContext) interface{}

	// Visit a parse tree produced by MQLParser#document.
	VisitDocument(ctx *DocumentContext) interface{}

	// Visit a parse tree produced by MQLParser#fieldAssignment.
	VisitFieldAssignment(ctx *FieldAssignmentContext) interface{}

	// Visit a parse tree produced by MQLParser#multipart_document.
	VisitMultipart_document(ctx *Multipart_documentContext) interface{}

	// Visit a parse tree produced by MQLParser#multipartFieldAssignment.
	VisitMultipartFieldAssignment(ctx *MultipartFieldAssignmentContext) interface{}

	// Visit a parse tree produced by MQLParser#function.
	VisitFunction(ctx *FunctionContext) interface{}

	// Visit a parse tree produced by MQLParser#functionArgument.
	VisitFunctionArgument(ctx *FunctionArgumentContext) interface{}

	// Visit a parse tree produced by MQLParser#lambdaArgument.
	VisitLambdaArgument(ctx *LambdaArgumentContext) interface{}

	// Visit a parse tree produced by MQLParser#lambdaExpression.
	VisitLambdaExpression(ctx *LambdaExpressionContext) interface{}

	// Visit a parse tree produced by MQLParser#switchCase.
	VisitSwitchCase(ctx *SwitchCaseContext) interface{}

	// Visit a parse tree produced by MQLParser#variableAssignment.
	VisitVariableAssignment(ctx *VariableAssignmentContext) interface{}

	// Visit a parse tree produced by MQLParser#numberValue.
	VisitNumberValue(ctx *NumberValueContext) interface{}

	// Visit a parse tree produced by MQLParser#stringValue.
	VisitStringValue(ctx *StringValueContext) interface{}

	// Visit a parse tree produced by MQLParser#booleanValue.
	VisitBooleanValue(ctx *BooleanValueContext) interface{}

	// Visit a parse tree produced by MQLParser#nullValue.
	VisitNullValue(ctx *NullValueContext) interface{}

	// Visit a parse tree produced by MQLParser#oidValue.
	VisitOidValue(ctx *OidValueContext) interface{}

	// Visit a parse tree produced by MQLParser#dateTimeValue.
	VisitDateTimeValue(ctx *DateTimeValueContext) interface{}

	// Visit a parse tree produced by MQLParser#regexValue.
	VisitRegexValue(ctx *RegexValueContext) interface{}

	// Visit a parse tree produced by MQLParser#intValue.
	VisitIntValue(ctx *IntValueContext) interface{}

	// Visit a parse tree produced by MQLParser#longValue.
	VisitLongValue(ctx *LongValueContext) interface{}

	// Visit a parse tree produced by MQLParser#doubleValue.
	VisitDoubleValue(ctx *DoubleValueContext) interface{}

	// Visit a parse tree produced by MQLParser#decimalValue.
	VisitDecimalValue(ctx *DecimalValueContext) interface{}

	// Visit a parse tree produced by MQLParser#binValue.
	VisitBinValue(ctx *BinValueContext) interface{}

	// Visit a parse tree produced by MQLParser#longBinValue.
	VisitLongBinValue(ctx *LongBinValueContext) interface{}

	// Visit a parse tree produced by MQLParser#hexValue.
	VisitHexValue(ctx *HexValueContext) interface{}

	// Visit a parse tree produced by MQLParser#longHexValue.
	VisitLongHexValue(ctx *LongHexValueContext) interface{}

	// Visit a parse tree produced by MQLParser#collectionName.
	VisitCollectionName(ctx *CollectionNameContext) interface{}

	// Visit a parse tree produced by MQLParser#databaseName.
	VisitDatabaseName(ctx *DatabaseNameContext) interface{}

	// Visit a parse tree produced by MQLParser#fieldDeclaration.
	VisitFieldDeclaration(ctx *FieldDeclarationContext) interface{}

	// Visit a parse tree produced by MQLParser#multipartFieldDeclaration.
	VisitMultipartFieldDeclaration(ctx *MultipartFieldDeclarationContext) interface{}

	// Visit a parse tree produced by MQLParser#fieldName.
	VisitFieldName(ctx *FieldNameContext) interface{}

	// Visit a parse tree produced by MQLParser#functionName.
	VisitFunctionName(ctx *FunctionNameContext) interface{}

	// Visit a parse tree produced by MQLParser#functionArgumentName.
	VisitFunctionArgumentName(ctx *FunctionArgumentNameContext) interface{}

	// Visit a parse tree produced by MQLParser#multipartFieldName.
	VisitMultipartFieldName(ctx *MultipartFieldNameContext) interface{}

	// Visit a parse tree produced by MQLParser#variableName.
	VisitVariableName(ctx *VariableNameContext) interface{}
}
