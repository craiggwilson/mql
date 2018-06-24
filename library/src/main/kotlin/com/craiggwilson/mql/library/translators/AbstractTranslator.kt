package com.craiggwilson.mql.library.translators

import com.craiggwilson.mql.library.ast.Visitor
import org.bson.BsonValue

abstract class AbstractTranslator : Visitor<BsonValue>()
