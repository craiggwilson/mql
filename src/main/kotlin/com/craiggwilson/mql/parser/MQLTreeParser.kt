package com.craiggwilson.mql.parser

import com.craiggwilson.mql.ast.AddExpression
import com.craiggwilson.mql.ast.AndExpression
import com.craiggwilson.mql.ast.ArrayAccessExpression
import com.craiggwilson.mql.ast.BooleanExpression
import com.craiggwilson.mql.ast.CollectionName
import com.craiggwilson.mql.ast.ConditionalExpression
import com.craiggwilson.mql.ast.DatabaseName
import com.craiggwilson.mql.ast.DecimalExpression
import com.craiggwilson.mql.ast.Direction
import com.craiggwilson.mql.ast.DivideExpression
import com.craiggwilson.mql.ast.DoubleExpression
import com.craiggwilson.mql.ast.EqualsExpression
import com.craiggwilson.mql.ast.Expression
import com.craiggwilson.mql.ast.FieldDeclaration
import com.craiggwilson.mql.ast.FieldName
import com.craiggwilson.mql.ast.FieldReferenceExpression
import com.craiggwilson.mql.ast.FunctionArgumentName
import com.craiggwilson.mql.ast.FunctionCallExpression
import com.craiggwilson.mql.ast.FunctionName
import com.craiggwilson.mql.ast.GreaterThanExpression
import com.craiggwilson.mql.ast.GreaterThanOrEqualsExpression
import com.craiggwilson.mql.ast.Int32Expression
import com.craiggwilson.mql.ast.Int64Expression
import com.craiggwilson.mql.ast.LessThanExpression
import com.craiggwilson.mql.ast.LessThanOrEqualsExpression
import com.craiggwilson.mql.ast.LetExpression
import com.craiggwilson.mql.ast.LimitStage
import com.craiggwilson.mql.ast.ModExpression
import com.craiggwilson.mql.ast.MultiplyExpression
import com.craiggwilson.mql.ast.NewArrayExpression
import com.craiggwilson.mql.ast.NewDocumentExpression
import com.craiggwilson.mql.ast.NotEqualsExpression
import com.craiggwilson.mql.ast.NotExpression
import com.craiggwilson.mql.ast.NullExpression
import com.craiggwilson.mql.ast.NumberExpression
import com.craiggwilson.mql.ast.OrExpression
import com.craiggwilson.mql.ast.PowerExpression
import com.craiggwilson.mql.ast.ProjectStage
import com.craiggwilson.mql.ast.RangeExpression
import com.craiggwilson.mql.ast.SkipStage
import com.craiggwilson.mql.ast.SortStage
import com.craiggwilson.mql.ast.Stage
import com.craiggwilson.mql.ast.Statement
import com.craiggwilson.mql.ast.StringExpression
import com.craiggwilson.mql.ast.SubtractExpression
import com.craiggwilson.mql.ast.UnwindStage
import com.craiggwilson.mql.ast.VariableName
import com.craiggwilson.mql.ast.VariableReferenceExpression
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.atn.PredictionMode

fun parseMQL(mql: String): List<Statement> {
    return MQLTreeParser().parse(mql)
}

class MQLTreeParser {

    private var generatedIdNum = 0

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
            ctx.project_stage() != null -> parseProjectStage(ctx.project_stage())
            ctx.skip_stage() != null -> parseSkipStage(ctx.skip_stage())
            ctx.sort_stage() != null -> parseSortStage(ctx.sort_stage())
            ctx.unwind_stage() != null -> parseUnwindStage(ctx.unwind_stage())
            else -> throw ParseException("stage is not supported: ${ctx.text}")
        }
    }

    private fun parseLimitStage(ctx: MQLParser.Limit_stageContext): LimitStage {
        return LimitStage(ctx.INT().text.toLong())
    }

    private fun parseProjectStage(ctx: MQLParser.Project_stageContext): ProjectStage {
        val items = ctx.project_item().map { item ->
            val expression = when {
                item.expression() != null -> parseExpression(item.expression())
                else -> getFieldReferenceExpression(item.multipart_field_name())
            }

            val fieldDeclaration = getFieldDeclaration(item.multipart_field_name())
            ProjectStage.Item(fieldDeclaration, expression)
        }

        return ProjectStage(items)
    }

    private fun parseSkipStage(ctx: MQLParser.Skip_stageContext): SkipStage {
        return SkipStage(ctx.INT().text.toLong())
    }

    private fun parseSortStage(ctx: MQLParser.Sort_stageContext): SortStage {
        val fields = ctx.sort_field().map { fieldCtx ->
            val field = getFieldReferenceExpression(fieldCtx.multipart_field_name())
            val direction = if (fieldCtx.DESC() != null) {
                Direction.DESCENDING
            } else {
                Direction.ASCENDING
            }

            SortStage.Field(field, direction)
        }

        return SortStage(fields)
    }

    private fun parseUnwindStage(ctx: MQLParser.Unwind_stageContext): UnwindStage {
        val field = getFieldReferenceExpression(ctx.multipart_field_name())

        var preserveNullAndEmpty = false
        var indexField: FieldDeclaration? = null

        if (ctx.unwind_option() != null) {
            ctx.unwind_option().forEach {
                when {
                    it.PRESERVE_NULL_AND_EMPTY() != null -> preserveNullAndEmpty = true
                    it.INDEX() != null -> indexField = getFieldDeclaration(it.multipart_field_name())
                }
            }
        }

        return UnwindStage(field, indexField, preserveNullAndEmpty)
    }

    private fun parseExpression(ctx: MQLParser.ExpressionContext): Expression {
        return when (ctx) {
            is MQLParser.AdditionExpressionContext -> {
                val left = parseExpression(ctx.expression(0))
                val right = parseExpression(ctx.expression(1))

                when (ctx.op.text) {
                    "+" -> AddExpression(left, right)
                    "-" -> SubtractExpression(left, right)
                    else -> throw ParseException("unknown multiplication operator: ${ctx.op.text}")
                }
            }
            is MQLParser.AndExpressionContext -> {
                val left = parseExpression(ctx.expression(0))
                val right = parseExpression(ctx.expression(1))

                AndExpression(left, right)
            }
            is MQLParser.ArrayAccessExpressionContext -> {
                val array = parseExpression(ctx.expression(0))
                val start = ctx.start?.let { parseExpression(it) } ?: NullExpression
                if (ctx.COLON() == null) {
                    ArrayAccessExpression(array, start)
                } else {
                    val end = ctx.end?.let { parseExpression(it) } ?: NullExpression
                    val range = RangeExpression(start, end)
                    ArrayAccessExpression(array, range)
                }
            }
            is MQLParser.BooleanExpressionContext -> BooleanExpression(ctx.TRUE() != null)
            is MQLParser.ComparisonExpressionContext -> {
                val left = parseExpression(ctx.expression(0))
                val right = parseExpression(ctx.expression(1))

                when (ctx.op.text) {
                    "=" -> EqualsExpression(left, right)
                    "!=" -> NotEqualsExpression(left, right)
                    "<" -> LessThanExpression(left, right)
                    "<=" -> LessThanOrEqualsExpression(left, right)
                    ">" -> GreaterThanExpression(left, right)
                    ">=" -> GreaterThanOrEqualsExpression(left, right)
                    else -> throw ParseException("unknown multiplication operator: ${ctx.op.text}")
                }
            }
            is MQLParser.ConditionalExpressionContext -> {
                val condition = parseExpression(ctx.expression(0))
                val then = parseExpression(ctx.expression(1))
                val fallback = parseExpression(ctx.expression(2))

                ConditionalExpression(condition, then, fallback)
            }
            is MQLParser.FieldExpressionContext -> FieldReferenceExpression(null, getFieldName(ctx.field_name()))
            is MQLParser.FunctionCallExpressionContext -> {
                parseFunction(ctx.function())
            }
            is MQLParser.LetExpressionContext -> {
                val variables = ctx.variable_assignment().map { va ->
                    val name = getVariableName(va.variable_name())
                    val expression = parseExpression(va.expression())

                    LetExpression.Variable(name, expression)
                }

                val expression = parseExpression(ctx.expression())

                LetExpression(variables, expression)
            }
            is MQLParser.MemberExpressionContext -> {
                val parent = parseExpression(ctx.expression())

                if (ctx.field_name() != null) {
                    val fieldName = getFieldName(ctx.field_name())
                    FieldReferenceExpression(parent, fieldName)
                } else {
                    val function = parseFunction(ctx.function())

                    function.update(
                        parent,
                        function.name,
                        function.arguments
                    )
                }
            }
            is MQLParser.MultiplicationExpressionContext -> {
                val left = parseExpression(ctx.expression(0))
                val right = parseExpression(ctx.expression(1))

                when (ctx.op.text) {
                    "*" -> MultiplyExpression(left, right)
                    "/" -> DivideExpression(left, right)
                    "%" -> ModExpression(left, right)
                    else -> throw ParseException("unknown multiplication operator: ${ctx.op.text}")
                }
            }
            is MQLParser.NewArrayExpressionContext -> {
                val items = ctx.expression().map { parseExpression(it) }

                NewArrayExpression(items)
            }
            is MQLParser.NewDocumentExpressionContext -> {
                val elements = ctx.field_assignment().map { fa ->
                    val field = getFieldDeclaration(fa.field_name())
                    val expression = parseExpression(fa.expression())

                    NewDocumentExpression.Element(field, expression)
                }

                NewDocumentExpression(elements)
            }
            is MQLParser.NotExpressionContext -> {
                val expression = parseExpression(ctx.expression())
                return NotExpression(expression)
            }
            is MQLParser.NullExpressionContext -> NullExpression
            is MQLParser.NumberExpressionContext -> parseNumber(ctx.number())
            is MQLParser.OrExpressionContext -> {
                val left = parseExpression(ctx.expression(0))
                val right = parseExpression(ctx.expression(1))

                OrExpression(left, right)
            }
            is MQLParser.ParenthesisExpressionContext -> parseExpression(ctx.expression())
            is MQLParser.PowerExpressionContext -> {
                val left = parseExpression(ctx.expression(0))
                val right = parseExpression(ctx.expression(1))

                PowerExpression(left, right)
            }
            is MQLParser.RangeExpressionContext -> {
                val start = parseExpression(ctx.expression(0))
                val end = parseExpression(ctx.expression(1))
                val step = if (ctx.expression().size == 3) {
                    parseExpression(ctx.expression(2))
                } else null

                RangeExpression(start, end, step)
            }
            is MQLParser.StringExpressionContext -> StringExpression(unquote(ctx.text))
            is MQLParser.SwitchExpressionContext -> {
                val cases = ctx.switch_case().map { case ->
                    val condition = parseExpression(case.expression(0))
                    val then = parseExpression(case.expression(1))

                    ConditionalExpression.Case(condition, then)
                }

                val fallback = if (ctx.expression() != null) {
                    parseExpression(ctx.expression())
                } else null

                ConditionalExpression(cases, fallback)
            }
            is MQLParser.UnaryMinusExpressionContext -> {
                val expression = parseExpression(ctx.expression())
                if (expression is NumberExpression) {
                    expression.negate()
                } else {
                    throw ParseException("minus operator not supported: ${ctx.text}")
                }
            }
            is MQLParser.VariableReferenceExpressionContext -> {
                VariableReferenceExpression(getVariableName(ctx.variable_name()))
            }
            else -> throw ParseException("expression not supported: ${ctx.text}")
        }
    }

    private fun parseFunction(ctx: MQLParser.FunctionContext): FunctionCallExpression {
        val name = getFunctionName(ctx.function_name())
        val arguments = ctx.function_argument().map { fa ->
            if (fa.function_argument_name() != null) {
                val argName = getFunctionArgumentName(fa.function_argument_name())
                val expression = parseExpression(fa.expression())

                FunctionCallExpression.Argument.Named(argName, expression)
            } else {
                val expression = parseExpression(fa.expression())
                FunctionCallExpression.Argument.Positional(expression)
            }
        }

        return FunctionCallExpression(null, name, arguments)
    }

    private fun parseNumber(ctx: MQLParser.NumberContext): NumberExpression {
        fun parseIntegralExpression(text: String, radix: Int, forceLong: Boolean = false): NumberExpression {
            var parseText = text
            var parseForceLong = forceLong
            if (text.endsWith("L", true)) {
                parseForceLong = true
                parseText = text.substring(0, text.length-1)
            }
            val num = parseText.toLong(radix)
            return if (parseForceLong || num > Int.MAX_VALUE) {
                Int64Expression(num)
            } else {
                Int32Expression(num.toInt())
            }
        }

        return when {
            ctx.BIN() != null -> {
                parseIntegralExpression(ctx.text.substring(2), 2)
            }
            ctx.HEX() != null -> {
                parseIntegralExpression(ctx.text.substring(2), 16)
            }
            ctx.INT() != null -> {
                parseIntegralExpression(ctx.text, 10)
            }
            ctx.LONG() != null -> {
                parseIntegralExpression(ctx.text, 10, true)
            }
            ctx.DECIMAL() != null -> {
                val forceDecimal = ctx.text.endsWith("M", true) || ctx.text.contains("E", true)
                val text = ctx.text.let { if (it.endsWith("M", true)) it.substring(0, it.length - 1) else it }
                if (forceDecimal) {
                    val value = text.toBigDecimal()
                    DecimalExpression(value)
                } else {
                    val value = text.toDouble()
                    DoubleExpression(value)
                }
            }
            else -> throw ParseException("unsupported number: ${ctx.text}")
        }
    }

    private fun generateFieldDeclaration(expression: Expression): FieldDeclaration {
        return when (expression) {
            is FieldReferenceExpression -> {
                val parent = if (expression.parent != null) {
                    generateFieldDeclaration(expression.parent)
                } else null

                FieldDeclaration(parent, expression.name)
            }
            else -> {
                generatedIdNum++
                FieldDeclaration(FieldName("__fld$generatedIdNum"))
            }
        }
    }

    private fun getCollectionName(ctx: MQLParser.Collection_nameContext): CollectionName {
        var databaseName: DatabaseName? = null
        if (ctx.database_name() != null) {
            databaseName = getDatabaseName(ctx.database_name())
        }

        if (ctx.id().QUOTED_ID() != null) {
            return CollectionName(databaseName, unquote(ctx.id().text))
        }

        return CollectionName(databaseName, ctx.id().text)
    }

    private fun getDatabaseName(ctx: MQLParser.Database_nameContext): DatabaseName {
        if (ctx.QUOTED_ID() != null) {
            return DatabaseName(unquote(ctx.text))
        }

        return DatabaseName(ctx.text)
    }

    private fun getFieldDeclaration(ctx: MQLParser.Multipart_field_nameContext): FieldDeclaration {
        val fre = ctx.field_name()
            .map { getFieldName(it) }
            .fold(null as FieldDeclaration?) { acc, item -> FieldDeclaration(acc, item) }

        return fre as FieldDeclaration
    }

    private fun getFieldDeclaration(ctx: MQLParser.Field_nameContext): FieldDeclaration {
        return FieldDeclaration(null, getFieldName(ctx))
    }

    private fun getFieldName(ctx: MQLParser.Field_nameContext): FieldName {
        if (ctx.id().QUOTED_ID() != null) {
            return FieldName(unquote(ctx.text))
        }

        return FieldName(ctx.text)
    }

    private fun getFieldReferenceExpression(ctx: MQLParser.Multipart_field_nameContext): FieldReferenceExpression {
        val fre = ctx.field_name()
            .map { getFieldName(it) }
            .fold(null as FieldReferenceExpression?) { acc, item -> FieldReferenceExpression(acc, item) }

        return fre as FieldReferenceExpression
    }

    private fun getFunctionName(ctx: MQLParser.Function_nameContext): FunctionName {
        return FunctionName(ctx.text)
    }

    private fun getFunctionArgumentName(ctx: MQLParser.Function_argument_nameContext): FunctionArgumentName {
        return FunctionArgumentName(ctx.text)
    }

    private fun getVariableName(ctx: MQLParser.Variable_nameContext): VariableName {
        return VariableName(ctx.text.substring(1))
    }

    private fun unquote(text: String): String {
        return text.substring(1, text.length - 1)
    }
}