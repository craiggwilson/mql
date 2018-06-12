package com.craiggwilson.mql.visitors

import com.craiggwilson.mql.ast.Node
import com.craiggwilson.mql.ast.NodeVisitor
import com.craiggwilson.mql.ast.VariableName
import com.craiggwilson.mql.ast.VariableReferenceExpression

fun renameVariables(n: Node, renames: Map<VariableName, VariableName>): Node {
    return VariableRenamer(renames).visit(n) as Node
}

private class VariableRenamer(renames: Map<VariableName, VariableName>) : NodeVisitor() {
    private val renames = renames.toMutableMap()

    override fun visit(n: VariableReferenceExpression): Node = n.update(
        renames[n.name] ?: n.name
    )
}