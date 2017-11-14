package com.craiggwilson.mql.parser

import com.craiggwilson.mql.ast.*
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.atn.PredictionMode

class MQLTreeParser {

  fun parse(mql: String): List<Statement> {
    val input = CharStreams.fromString(mql)
    val lexer = MQLLexer(input)
    val tokens = CommonTokenStream(lexer)
    val p = MQLParser(tokens)
    p.interpreter.predictionMode = PredictionMode.SLL

    var parseCtx: MQLParser.ParseContext
    try {
      parseCtx = p.parse()
    } catch (t: Throwable) {
      tokens.seek(0)
      p.reset()
      p.interpreter.predictionMode = PredictionMode.LL

      try {
        parseCtx = p.parse()
      } catch (t: Throwable) {
        throw ParseException(t)
      }
    }

    val statements = mutableListOf<Statement>()
    for(stmt in parseCtx.statement()) {
      statements.add(StatementParser.parse(stmt))
    }

    return statements
  }

  private class StatementParser : MQLBaseVisitor<Node>() {

    companion object {
      fun parse(stmt: MQLParser.StatementContext): Statement {
        val p = StatementParser()
        return stmt.accept(p) as Statement
      }
    }

    override fun visitPipeline(ctx: MQLParser.PipelineContext): Node {
      val collectionName = getCollectionName(ctx.collection_name())
      val stages = ctx.stage().map { it.accept(this) as Stage }

      return Statement(collectionName, stages)
    }

    override fun visitLimit_stage(ctx: MQLParser.Limit_stageContext): Node {
      return LimitStage(ctx.INT().text.toLong())
    }

    override fun visitSkip_stage(ctx: MQLParser.Skip_stageContext): Node {
      return SkipStage(ctx.INT().text.toLong())
    }

    override fun visitUnwind_stage(ctx: MQLParser.Unwind_stageContext): Node {
      val field = getFieldReferenceExpression(ctx.multipart_field_name())

      var preserveNullAndEmpty: Boolean = false
      var indexField: FieldDeclaration? = null

      if (ctx.unwind_option() != null) {
        ctx.unwind_option().forEach {
          when {
            it.PRESERVE_NULL_AND_EMPTY() != null -> preserveNullAndEmpty = true;
            it.INDEX() != null -> indexField = getFieldDeclarationExpression(it.multipart_field_name())
          }
        }
      }

      return UnwindStage(field, indexField, preserveNullAndEmpty)
    }

    fun getFieldDeclarationExpression(ctx: MQLParser.Multipart_field_nameContext): FieldDeclaration {
      val fre = ctx.field_name()
        .map { getFieldName(it) }
        .fold(null as FieldDeclaration?) { acc, item -> FieldDeclaration(acc, item) }

      return fre as FieldDeclaration
    }

    fun getFieldReferenceExpression(ctx: MQLParser.Multipart_field_nameContext): FieldReferenceExpression {
      val fre = ctx.field_name()
        .map { getFieldName(it) }
        .fold(null as FieldReferenceExpression?) { acc, item -> FieldReferenceExpression(acc, item) }

      return fre as FieldReferenceExpression
    }

    fun getCollectionName(ctx: MQLParser.Collection_nameContext): CollectionName {
      var databaseName: DatabaseName? = null
      if (ctx.database_name() != null) {
        databaseName = getDatabaseName(ctx.database_name())
      }

      if (ctx.QUOTED_ID() != null) {
        return CollectionName(databaseName, unquote(ctx.QUOTED_ID().text))
      }

      return CollectionName(databaseName, ctx.UNQUOTED_ID().text)
    }

    fun getDatabaseName(ctx: MQLParser.Database_nameContext): DatabaseName {
      if (ctx.QUOTED_ID() != null) {
        return DatabaseName(unquote(ctx.text))
      }

      return DatabaseName(ctx.text)
    }

    fun getFieldName(ctx: MQLParser.Field_nameContext): FieldName {
      if (ctx.QUOTED_ID() != null) {
        return FieldName(unquote(ctx.text))
      }

      return FieldName(ctx.text)
    }

    fun unquote(text: String): String {
      return text.substring(1, text.length - 1)
    }
  }
}