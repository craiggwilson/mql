package com.craiggwilson.mql.visitors

import com.craiggwilson.mql.ast.Node

interface NodeHandler<in T : Node> {
    fun visit(n: T): Node
}