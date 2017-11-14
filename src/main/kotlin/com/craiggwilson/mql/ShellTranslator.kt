package com.craiggwilson.mql

import com.craiggwilson.mql.ast.*
import jdk.nashorn.internal.parser.JSONParser
import org.json.JSONObject

class ShellTranslator : Visitor<String>() {


  // Expressions
  override fun visit(n: FieldReferenceExpression): String {
    return visit(n.parent) + "." + n.name.name
  }

  // Nodes
  override fun visit(n: Statement): String {
    val pipelineString = n.pipeline.joinToString(prefix="[", postfix="]") { visit(it) as String };

    val formatted = JSONParser(pipelineString).parse()

    return "db.${n.collectionName.name}.aggregate($pipeline)"
  }

  // Stages
  override fun visit(n: LimitStage): String {
    return "{ \$limit: ${n.limit} }"
  }

  override fun visit(n: SkipStage): String {
    return "{ \$skip: ${n.skip} }"
  }

  override fun visit(n: UnwindStage): String {
    var s = "{ \$unwind: { ${visit(n.field)}, preserveNullAndEmpty: ${n.preserveNullAndEmpty}"
    if (n.indexField != null) {
      s += ", ${n.indexField}"
    }
    s += " }"
    return s
  }
}