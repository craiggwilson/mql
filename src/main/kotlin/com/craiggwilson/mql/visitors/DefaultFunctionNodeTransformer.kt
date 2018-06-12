package com.craiggwilson.mql.visitors

import com.craiggwilson.mql.ast.FunctionArgumentName
import com.craiggwilson.mql.ast.FunctionCallExpression
import com.craiggwilson.mql.ast.FunctionName
import com.craiggwilson.mql.ast.Node
import com.craiggwilson.mql.ast.StringExpression

object DefaultFunctionNodeTransformer : NodeTransformer {
    private val map = mapOf(
        FunctionName("map") to MapFunctionHandler()
    )

    override val appliesTo = listOf(FunctionCallExpression::class.java)

    override fun visit(n: Node): Node {
        val call = n as FunctionCallExpression
        return map[call.name]?.visit(call) ?: n
    }
}

private class MapFunctionHandler : NodeHandler<FunctionCallExpression> {

    override fun visit(n: FunctionCallExpression): Node {
        val args = if (n.parent != null) {
            listOf(FunctionCallExpression.Argument.Positional(n.parent)) + n.arguments
        } else n.arguments

        if (args.size != 2 || args[1] !is FunctionCallExpression.Argument.Lambda) {
            return n
        }

        val lambda = args[1] as FunctionCallExpression.Argument.Lambda
        if (lambda.parameters.size != 1) {
            return n
        }

        val first = when(args[0]) {
            is FunctionCallExpression.Argument.Positional -> (args[0] as FunctionCallExpression.Argument.Positional).expression
            is FunctionCallExpression.Argument.Named -> (args[0] as FunctionCallExpression.Argument.Named).expression
            else -> return n
        }

        val second = StringExpression(lambda.parameters[0].name)
        val third = lambda.expression

        return FunctionCallExpression(null, n.name, listOf(
            FunctionCallExpression.Argument.Named(FunctionArgumentName("input"), first),
            FunctionCallExpression.Argument.Named(FunctionArgumentName("as"), second),
            FunctionCallExpression.Argument.Named(FunctionArgumentName("in"), third)
        ))
    }
}