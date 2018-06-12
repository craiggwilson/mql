package com.craiggwilson.mql.visitors

import com.craiggwilson.mql.ast.Node
import com.craiggwilson.mql.ast.NodeVisitor
import com.craiggwilson.mql.ast.VariableName
import com.craiggwilson.mql.ast.VariableReferenceExpression

fun renameVariables(n: Node, vararg renames: Pair<VariableName, VariableName>): Node {
    return VariableRenamingVisitor(renames.toMap()).visit(n) as Node
}

private class VariableRenamingVisitor(private val replacements: Map<VariableName, VariableName>) : NodeVisitor() {
    constructor(oldName: VariableName, newName: VariableName): this(mapOf(oldName to newName))

    override fun visit(n: VariableReferenceExpression): Node {
        val newName = replacements[n.name] ?: n.name
        return n.update(newName)
    }
}