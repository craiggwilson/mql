package com.craiggwilson.mql.visitors

import com.craiggwilson.mql.ast.Expression
import com.craiggwilson.mql.ast.FunctionArgumentName
import com.craiggwilson.mql.ast.FunctionCallExpression
import com.craiggwilson.mql.ast.FunctionName
import com.craiggwilson.mql.ast.Node
import com.craiggwilson.mql.ast.StringExpression
import com.craiggwilson.mql.ast.VariableName

object DefaultFunctionNodeRewriter : NodeRewriter {
    private val map = mapOf(
        FunctionName("map") to MapFunctionHandler(),
        FunctionName("reduce") to ReduceFunctionHandler()
    )

    override val appliesTo = setOf(FunctionCallExpression::class.java)

    override fun visit(n: Node): Node {
        val call = n as FunctionCallExpression
        return map[call.name]?.visit(call) ?: n
    }
}

private class MapFunctionHandler : NodeHandler<FunctionCallExpression> {
    override fun visit(n: FunctionCallExpression): Node {
        val args = shiftArgs(n)

        if (args.size != 2 || args[1] !is FunctionCallExpression.Argument.Lambda) {
            return n
        }

        val lambda = args[1] as FunctionCallExpression.Argument.Lambda
        if (lambda.parameters.size != 1) {
            return n
        }

        val input = args[0].expression
        val az = StringExpression(lambda.parameters[0].name)
        val inn = lambda.expression

        return FunctionCallExpression(null, n.name, listOf(
            FunctionCallExpression.Argument.Named(FunctionArgumentName("input"), input),
            FunctionCallExpression.Argument.Named(FunctionArgumentName("as"), az),
            FunctionCallExpression.Argument.Named(FunctionArgumentName("in"), inn)
        ))
    }
}

private class ReduceFunctionHandler : NodeHandler<FunctionCallExpression> {
    override fun visit(n: FunctionCallExpression): Node {
        val args = shiftArgs(n)

        if (args.size != 3 || args[2] !is FunctionCallExpression.Argument.Lambda) {
            return n
        }

        val lambda = args[2] as FunctionCallExpression.Argument.Lambda
        if (lambda.parameters.size != 2) {
            return n
        }

        val input = args[0].expression
        val initialValue = args[1].expression
        val inn = renameVariables(
            lambda.expression,
            lambda.parameters[0] to VariableName("value"),
            lambda.parameters[1] to VariableName("this")
        ) as Expression

        return FunctionCallExpression(null, n.name, listOf(
            FunctionCallExpression.Argument.Named(FunctionArgumentName("input"), input),
            FunctionCallExpression.Argument.Named(FunctionArgumentName("initialValue"), initialValue),
            FunctionCallExpression.Argument.Named(FunctionArgumentName("in"), inn)
        ))
    }
}

private fun shiftArgs(n: FunctionCallExpression): List<FunctionCallExpression.Argument> {
    return if (n.parent != null) {
        listOf(FunctionCallExpression.Argument.Positional(n.parent)) + n.arguments
    } else n.arguments
}

private val FunctionCallExpression.Argument.expression
    get() = when(this) {
        is FunctionCallExpression.Argument.Positional -> this.expression
        is FunctionCallExpression.Argument.Named -> this.expression
        is FunctionCallExpression.Argument.Lambda -> this.expression
    }