package com.craiggwilson.mql.ast.builders

import com.craiggwilson.mql.ast.Expression
import com.craiggwilson.mql.ast.FieldDeclaration
import com.craiggwilson.mql.ast.FieldName
import com.craiggwilson.mql.ast.FieldReferenceExpression
import com.craiggwilson.mql.ast.FunctionArgumentName
import com.craiggwilson.mql.ast.FunctionCallExpression
import com.craiggwilson.mql.ast.FunctionName
import com.craiggwilson.mql.ast.LetExpression
import com.craiggwilson.mql.ast.NewArrayExpression
import com.craiggwilson.mql.ast.NewDocumentExpression
import com.craiggwilson.mql.ast.SubtractExpression
import com.craiggwilson.mql.ast.VariableName
import com.craiggwilson.mql.ast.VariableReferenceExpression

fun fieldReference(parent: Expression, name: String) = FieldReferenceExpression(parent, FieldName(name))

fun function(name: String, vararg args: Expression) = FunctionCallExpression(
    FunctionName(name),
    args.map { FunctionCallExpression.Argument.Positional(it) }
)

fun function(name: String, vararg args: Pair<String, Expression>) = FunctionCallExpression(
    FunctionName(name),
    args.map { FunctionCallExpression.Argument.Named(FunctionArgumentName(it.first), it.second) }
)

fun let(variables: List<Pair<String, Expression>>, expression: Expression) = LetExpression(
    variables.map { LetExpression.Variable(VariableName(it.first), it.second) },
    expression
)

fun newArray(vararg items: Expression) = NewArrayExpression(items.toList())

fun newArray(items: List<Expression>) = NewArrayExpression(items)

fun newDocument(vararg elements: Pair<String, Expression>) = NewDocumentExpression(
    elements.map { NewDocumentExpression.Element(FieldDeclaration(FieldName(it.first)), it.second) }
)

fun subtract(left: Expression, right: Expression) = SubtractExpression(left, right)

fun variableReference(name: String) = VariableReferenceExpression(VariableName(name))