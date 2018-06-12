package com.craiggwilson.mql.visitors

import com.craiggwilson.mql.ast.Node

class CompositeNodeTransformer(transformers: List<NodeTransformer>) : NodeTransformer {
    private val map = transformers.flatMap { t -> t.appliesTo.map { c -> c to t } }.groupBy({ it.first }, { it.second }).toMap()

    override val appliesTo by lazy { map.keys.toList() }

    override fun visit(n: Node): Node {
        return map[n::class.java]?.fold(n) { acc, op -> op.visit(acc) } ?: n
    }
}