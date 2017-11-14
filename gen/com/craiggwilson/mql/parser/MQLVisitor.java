// Generated from C:/projects/craiggwilson/mql/src/main/java/com/craiggwilson/mql/parser\MQL.g4 by ANTLR 4.7
package com.craiggwilson.mql.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MQLParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(MQLParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MQLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQLParser#pipeline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipeline(MQLParser.PipelineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQLParser#stage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStage(MQLParser.StageContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQLParser#group_stage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_stage(MQLParser.Group_stageContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQLParser#limit_stage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_stage(MQLParser.Limit_stageContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQLParser#lookup_stage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLookup_stage(MQLParser.Lookup_stageContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQLParser#match_stage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch_stage(MQLParser.Match_stageContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQLParser#project_stage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProject_stage(MQLParser.Project_stageContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQLParser#skip_stage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip_stage(MQLParser.Skip_stageContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQLParser#sort_stage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort_stage(MQLParser.Sort_stageContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQLParser#sort_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort_field(MQLParser.Sort_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQLParser#unwind_stage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnwind_stage(MQLParser.Unwind_stageContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQLParser#unwind_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnwind_option(MQLParser.Unwind_optionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code reduceFunctionCallExpression}
	 * labeled alternative in {@link MQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReduceFunctionCallExpression(MQLParser.ReduceFunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additionExpression}
	 * labeled alternative in {@link MQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionExpression(MQLParser.AdditionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link MQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpression(MQLParser.NumberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filterFunctionCallExpression}
	 * labeled alternative in {@link MQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterFunctionCallExpression(MQLParser.FilterFunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link MQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(MQLParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link MQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(MQLParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalExpression}
	 * labeled alternative in {@link MQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalExpression(MQLParser.DecimalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link MQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(MQLParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link MQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(MQLParser.StringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullExpression}
	 * labeled alternative in {@link MQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullExpression(MQLParser.NullExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letExpression}
	 * labeled alternative in {@link MQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetExpression(MQLParser.LetExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldExpression}
	 * labeled alternative in {@link MQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldExpression(MQLParser.FieldExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link MQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(MQLParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code documentExpression}
	 * labeled alternative in {@link MQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocumentExpression(MQLParser.DocumentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayExpression}
	 * labeled alternative in {@link MQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpression(MQLParser.ArrayExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link MQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(MQLParser.BoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link MQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(MQLParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code switchExpression}
	 * labeled alternative in {@link MQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchExpression(MQLParser.SwitchExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link MQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExpression(MQLParser.ParenthesisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpression}
	 * labeled alternative in {@link MQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpression(MQLParser.MultiplicationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberExpression}
	 * labeled alternative in {@link MQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberExpression(MQLParser.MemberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link MQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(MQLParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link MQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpression(MQLParser.UnaryMinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mapFunctionCallExpression}
	 * labeled alternative in {@link MQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapFunctionCallExpression(MQLParser.MapFunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link MQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpression(MQLParser.PowerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableReferenceExpression}
	 * labeled alternative in {@link MQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReferenceExpression(MQLParser.VariableReferenceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayElementExpression}
	 * labeled alternative in {@link MQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElementExpression(MQLParser.ArrayElementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQLParser#field_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_assignment(MQLParser.Field_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQLParser#variable_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_assignment(MQLParser.Variable_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQLParser#collection_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection_name(MQLParser.Collection_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQLParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(MQLParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQLParser#multipart_field_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipart_field_name(MQLParser.Multipart_field_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQLParser#field_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_name(MQLParser.Field_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQLParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(MQLParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQLParser#variable_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_name(MQLParser.Variable_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MQLParser#keyword_as_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword_as_id(MQLParser.Keyword_as_idContext ctx);
}