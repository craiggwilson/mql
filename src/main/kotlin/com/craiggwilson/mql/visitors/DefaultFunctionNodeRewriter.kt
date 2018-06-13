package com.craiggwilson.mql.visitors

import com.craiggwilson.mql.ast.Expression
import com.craiggwilson.mql.ast.FunctionArgumentName
import com.craiggwilson.mql.ast.FunctionCallExpression
import com.craiggwilson.mql.ast.FunctionName
import com.craiggwilson.mql.ast.LambdaExpression
import com.craiggwilson.mql.ast.LetExpression
import com.craiggwilson.mql.ast.Node
import com.craiggwilson.mql.ast.NodeVisitor
import com.craiggwilson.mql.ast.StringExpression
import com.craiggwilson.mql.ast.VariableName
import com.craiggwilson.mql.ast.VariableReferenceExpression

object DefaultFunctionNodeRewriter : NodeRewriter {
    private val map = mapOf(
        FunctionName("filter") to FilterFunctionHandler,
        FunctionName("map") to MapFunctionHandler,
        FunctionName("reduce") to ReduceFunctionHandler
    )

    override val appliesTo = setOf(FunctionCallExpression::class.java)

    override fun visit(n: Node): Node {
        val call = n as FunctionCallExpression
        return map[call.name]?.visit(call) ?: n
    }
}

private object FilterFunctionHandler: NodeHandler<FunctionCallExpression> {
    override fun visit(n: FunctionCallExpression): Node {
        val args = shiftArgs(n)

        if (args.size != 2 || args[1].expression !is LambdaExpression) {
            return n
        }

        val lambda = args[1].expression as LambdaExpression
        if (lambda.parameters.size != 1) {
            return n
        }

        val input = args[0].expression
        val az = StringExpression(lambda.parameters[0].name)
        val cond = lambda.expression

        return FunctionCallExpression(null, n.name, listOf(
            FunctionCallExpression.Argument.Named(FunctionArgumentName("input"), input),
            FunctionCallExpression.Argument.Named(FunctionArgumentName("as"), az),
            FunctionCallExpression.Argument.Named(FunctionArgumentName("cond"), cond)
        ))
    }
}

private object MapFunctionHandler : NodeHandler<FunctionCallExpression> {
    override fun visit(n: FunctionCallExpression): Node {
        val args = shiftArgs(n)

        if (args.size != 2 || args[1].expression !is LambdaExpression) {
            return n
        }

        val lambda = args[1].expression as LambdaExpression
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

private object ReduceFunctionHandler : NodeHandler<FunctionCallExpression> {
    override fun visit(n: FunctionCallExpression): Node {
        val args = shiftArgs(n)

        if (args.size != 3 || args[2].expression !is LambdaExpression) {
            return n
        }

        val lambda = args[2].expression as LambdaExpression
        if (lambda.parameters.size != 2) {
            return n
        }

        val input = args[0].expression
        val initialValue = args[1].expression

        val newVariableNames = listOf(VariableName("value"), VariableName("this"))
        val renames = lambda.parameters
            .mapIndexed { index, variableName -> variableName to newVariableNames[index] }
            .toMap()
            .toMutableMap()

        val usedVariables = findUsedVariables(lambda.expression)
        val conflictingVariables = newVariableNames.intersect(usedVariables)
        val letVariables = conflictingVariables.map { c ->
            var i = 0
            var next = VariableName("closed_${c.name}$i")
            while(usedVariables.contains(next)) {
                i++
                next = VariableName("closed_${c.name}$i")
            }

            renames[c] = next
            LetExpression.Variable(next, VariableReferenceExpression(c))
        }

        val inn = renameVariables(lambda.expression, renames) as Expression

        val function = FunctionCallExpression(null, n.name, listOf(
            FunctionCallExpression.Argument.Named(FunctionArgumentName("input"), input),
            FunctionCallExpression.Argument.Named(FunctionArgumentName("initialValue"), initialValue),
            FunctionCallExpression.Argument.Named(FunctionArgumentName("in"), inn)
        ))

        return if (letVariables.isNotEmpty()) {
            LetExpression(letVariables, function)
        } else function
    }
}

private fun findUsedVariables(n: Node): Set<VariableName> {
    val usedVariables = mutableSetOf<VariableName>()
    object: NodeVisitor() {
        override fun visit(n: VariableReferenceExpression): Node {
            usedVariables += n.name
            return n
        }
    }.visit(n)

    return usedVariables
}

private fun shiftArgs(n: FunctionCallExpression): List<FunctionCallExpression.Argument> {
    return if (n.parent != null) {
        listOf(FunctionCallExpression.Argument.Positional(n.parent)) + n.arguments
    } else n.arguments
}
