package com.craiggwilson.mql.library.visitors

import com.craiggwilson.mql.library.ast.Expression
import com.craiggwilson.mql.library.ast.Node
import com.craiggwilson.mql.library.ast.NodeVisitor

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
