package com.craiggwilson.mql.ast

data class Statement(val collectionName: CollectionName, val pipeline: List<Stage>) : Node() {
  override fun <T> accept(v: Visitor<T>) = v.visit(this)

  fun update(collectionName: CollectionName, pipeline: List<Stage>): Statement {
    if (collectionName !== this.collectionName || pipeline !== this.pipeline) {
      return Statement(collectionName, pipeline)
    }
    return this
  }
}