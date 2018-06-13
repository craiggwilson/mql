package com.craiggwilson.mql.visitors

import com.craiggwilson.mql.ast.Expression
import com.craiggwilson.mql.ast.Node
import com.craiggwilson.mql.ast.NodeVisitor

fun replaceExpressions(n: Node, replacements: Map<Expression, Expression>): Node {
    return ExpressionReplacer(replacements).visit(n) as Node
}

private class ExpressionReplacer(val replacements: Map<Expression, Expression>) : NodeVisitor() {
    override fun visit(n: Node?): Node? {
        if (n == null) {
            return null
        }

        return replacements[n] ?: super.visit(n)
    }
}