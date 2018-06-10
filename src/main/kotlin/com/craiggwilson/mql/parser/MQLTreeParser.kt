package com.craiggwilson.mql.parser

import com.craiggwilson.mql.ast.CollectionName
import com.craiggwilson.mql.ast.DatabaseName
import com.craiggwilson.mql.ast.FieldDeclaration
import com.craiggwilson.mql.ast.FieldName
import com.craiggwilson.mql.ast.FieldReferenceExpression
import com.craiggwilson.mql.ast.LimitStage
import com.craiggwilson.mql.ast.SkipStage
import com.craiggwilson.mql.ast.Stage
import com.craiggwilson.mql.ast.Statement
import com.craiggwilson.mql.ast.UnwindStage
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.atn.PredictionMode

fun parseMQL(mql: String): List<Statement> {
    return MQLTreeParser().parse(mql)
}

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
        for (stmt in parseCtx.statement()) {
            statements += parseStatement(stmt)
        }

        return statements
    }

    private fun parseStatement(ctx: MQLParser.StatementContext): Statement {
        val collectionName = getCollectionName(ctx.pipeline().collection_name())
        val stages = ctx.pipeline().stage().map { parseStage(it) }

        return Statement(collectionName, stages)
    }

    private fun parseStage(ctx: MQLParser.StageContext): Stage {
        return when {
            ctx.limit_stage() != null -> parseLimitStage(ctx.limit_stage())
            ctx.skip_stage() != null -> parseSkipStage(ctx.skip_stage())
            ctx.unwind_stage() != null -> parseUnwindStage(ctx.unwind_stage())
            else -> throw ParseException("stage is not supported: ${ctx.text}")
        }
    }

    private fun parseLimitStage(ctx: MQLParser.Limit_stageContext): LimitStage {
        return LimitStage(ctx.INT().text.toLong())
    }

    private fun parseSkipStage(ctx: MQLParser.Skip_stageContext): SkipStage {
        return SkipStage(ctx.INT().text.toLong())
    }

    private fun parseUnwindStage(ctx: MQLParser.Unwind_stageContext): UnwindStage {
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

    private fun getFieldDeclarationExpression(ctx: MQLParser.Multipart_field_nameContext): FieldDeclaration {
        val fre = ctx.id()
            .map { getFieldName(it) }
            .fold(null as FieldDeclaration?) { acc, item -> FieldDeclaration(acc, item) }

        return fre as FieldDeclaration
    }

    private fun getFieldReferenceExpression(ctx: MQLParser.Multipart_field_nameContext): FieldReferenceExpression {
        val fre = ctx.id()
            .map { getFieldName(it) }
            .fold(null as FieldReferenceExpression?) { acc, item -> FieldReferenceExpression(acc, item) }

        return fre as FieldReferenceExpression
    }

    private fun getCollectionName(ctx: MQLParser.Collection_nameContext): CollectionName {
        var databaseName: DatabaseName? = null
        if (ctx.database_name() != null) {
            databaseName = getDatabaseName(ctx.database_name())
        }

        if (ctx.QUOTED_ID() != null) {
            return CollectionName(databaseName, unquote(ctx.QUOTED_ID().text))
        }

        return CollectionName(databaseName, ctx.UNQUOTED_ID().text)
    }

    private fun getDatabaseName(ctx: MQLParser.Database_nameContext): DatabaseName {
        if (ctx.QUOTED_ID() != null) {
            return DatabaseName(unquote(ctx.text))
        }

        return DatabaseName(ctx.text)
    }

    private fun getFieldName(ctx: MQLParser.IdContext): FieldName {
        if (ctx.QUOTED_ID() != null) {
            return FieldName(unquote(ctx.text))
        }

        return FieldName(ctx.text)
    }

    private fun unquote(text: String): String {
        return text.substring(1, text.length - 1)
    }
}