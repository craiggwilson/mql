package com.craiggwilson.mql.library.visitors

import com.craiggwilson.mql.library.ast.Node

interface NodeRewriter {
    val appliesTo: Set<Class<*>>

    fun visit(n: Node): Node
}
