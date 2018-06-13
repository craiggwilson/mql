package com.craiggwilson.mql.translators

import com.craiggwilson.mql.ast.Visitor
import org.bson.BsonValue

abstract class AbstractTranslator : Visitor<BsonValue>()