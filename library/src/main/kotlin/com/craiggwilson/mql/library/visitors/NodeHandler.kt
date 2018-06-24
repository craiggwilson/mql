package com.craiggwilson.mql.library.visitors

import com.craiggwilson.mql.library.ast.Node

interface NodeHandler<in T : Node> {
    fun visit(n: T): Node
}
