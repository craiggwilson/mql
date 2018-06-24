package com.craiggwilson.mql.library.visitors

import com.craiggwilson.mql.library.ast.Node

class CompositeNodeRewriter(rewriters: List<NodeRewriter>) : NodeRewriter {
    private val map = rewriters.flatMap { t -> t.appliesTo.map { c -> c to t } }.groupBy({ it.first }, { it.second }).toMap()

    override val appliesTo = map.keys

    override fun visit(n: Node): Node {
        return map[n::class.java]?.fold(n) { acc, op -> op.visit(acc) } ?: n
    }
}
