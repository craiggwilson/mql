package com.craiggwilson.mql.library.visitors

import com.craiggwilson.mql.library.ast.Node

object EmptyNodeRewriter : NodeRewriter {
    override val appliesTo = emptySet<Class<*>>()

    override fun visit(n: Node): Node = n
}
