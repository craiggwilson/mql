package com.craiggwilson.mql.library.parser

import com.craiggwilson.mql.library.ast.AddExpression
import com.craiggwilson.mql.library.ast.AndExpression
import com.craiggwilson.mql.library.ast.ArrayAccessExpression
import com.craiggwilson.mql.library.ast.BooleanExpression
import com.craiggwilson.mql.library.ast.CollectionName
import com.craiggwilson.mql.library.ast.ConcatExpression
import com.craiggwilson.mql.library.ast.ConditionalExpression
import com.craiggwilson.mql.library.ast.DatabaseName
import com.craiggwilson.mql.library.ast.DateTimeExpression
import com.craiggwilson.mql.library.ast.DecimalExpression
import com.craiggwilson.mql.library.ast.Direction
import com.craiggwilson.mql.library.ast.DivideExpression
import com.craiggwilson.mql.library.ast.DoubleExpression
import com.craiggwilson.mql.library.ast.EqualsExpression
import com.craiggwilson.mql.library.ast.Expression
import com.craiggwilson.mql.library.ast.FieldDeclaration
import com.craiggwilson.mql.library.ast.FieldName
import com.craiggwilson.mql.library.ast.FieldReferenceExpression
import com.craiggwilson.mql.library.ast.FunctionArgumentName
import com.craiggwilson.mql.library.ast.FunctionCallExpression
import com.craiggwilson.mql.library.ast.FunctionName
import com.craiggwilson.mql.library.ast.GreaterThanExpression
import com.craiggwilson.mql.library.ast.GreaterThanOrEqualsExpression
import com.craiggwilson.mql.library.ast.GroupStage
import com.craiggwilson.mql.library.ast.InExpression
import com.craiggwilson.mql.library.ast.Int32Expression
import com.craiggwilson.mql.library.ast.Int64Expression
import com.craiggwilson.mql.library.ast.LambdaExpression
import com.craiggwilson.mql.library.ast.LessThanExpression
import com.craiggwilson.mql.library.ast.LessThanOrEqualsExpression
import com.craiggwilson.mql.library.ast.LetExpression
import com.craiggwilson.mql.library.ast.LikeExpression
import com.craiggwilson.mql.library.ast.LimitStage
import com.craiggwilson.mql.library.ast.LookupStage
import com.craiggwilson.mql.library.ast.MatchStage
import com.craiggwilson.mql.library.ast.ModExpression
import com.craiggwilson.mql.library.ast.MultiplyExpression
import com.craiggwilson.mql.library.ast.NewArrayExpression
import com.craiggwilson.mql.library.ast.NewDocumentExpression
import com.craiggwilson.mql.library.ast.NotEqualsExpression
import com.craiggwilson.mql.library.ast.NotExpression
import com.craiggwilson.mql.library.ast.NullCoalesceExpression
import com.craiggwilson.mql.library.ast.NullExpression
import com.craiggwilson.mql.library.ast.NumberExpression
import com.craiggwilson.mql.library.ast.ObjectIdExpression
import com.craiggwilson.mql.library.ast.OrExpression
import com.craiggwilson.mql.library.ast.PowerExpression
import com.craiggwilson.mql.library.ast.ProjectStage
import com.craiggwilson.mql.library.ast.QueryStatement
import com.craiggwilson.mql.library.ast.RangeExpression
import com.craiggwilson.mql.library.ast.RegexExpression
import com.craiggwilson.mql.library.ast.SkipStage
import com.craiggwilson.mql.library.ast.SortStage
import com.craiggwilson.mql.library.ast.Stage
import com.craiggwilson.mql.library.ast.Statement
import com.craiggwilson.mql.library.ast.StringExpression
import com.craiggwilson.mql.library.ast.SubtractExpression
import com.craiggwilson.mql.library.ast.UnwindStage
import com.craiggwilson.mql.library.ast.VariableName
import com.craiggwilson.mql.library.ast.VariableReferenceExpression
import org.antlr.v4.runtime.BailErrorStrategy
import org.antlr.v4.runtime.BaseErrorListener
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.DefaultErrorStrategy
import org.antlr.v4.runtime.RecognitionException
import org.antlr.v4.runtime.Recognizer
import org.antlr.v4.runtime.atn.PredictionMode
import org.bson.types.ObjectId
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter

fun lexMQL(mql: String): MQLLexer {
    val input = CharStreams.fromString(mql)
    return MQLLexer(input)
}

fun parseMQL(mql: String): List<Statement> {
    return MQLTreeParser.parse(mql)
}

object MQLTreeParser {

    fun parse(mql: String): List<Statement> {
        val lexer = lexMQL(mql)
        val tokens = CommonTokenStream(lexer)
        val p = MQLParser(tokens)
        p.interpreter.predictionMode = PredictionMode.SLL
        p.errorHandler = BailErrorStrategy()
        p.removeErrorListeners()

        val errors = mutableListOf<String>()
        p.addErrorListener(object : BaseErrorListener() {
            override fun syntaxError(recognizer: Recognizer<*, *>?, offendingSymbol: Any?, line: Int, charPositionInLine: Int, msg: String?, e: RecognitionException?) {
                errors.add("$msg on line $line, character $charPositionInLine")
            }
        })

        try {
            val statements = p.parse().statement().map { parseStatement(it) }
            if (errors.size > 0) {
                throw ParseException(errors.first())
            }
            return statements
        } catch (t: Throwable) {
            errors.clear()
            p.reset()
            p.interpreter.predictionMode = PredictionMode.LL
            p.errorHandler = DefaultErrorStrategy()

            val statements = p.parse().statement().map { parseStatement(it) }
            if (errors.size > 0) {
                throw ParseException(errors.first())
            }
            return statements
        }
    }

    private fun parseStatement(ctx: MQLParser.StatementContext): Statement {
        return when(ctx) {
            is MQLParser.QueryStatementContext -> parseQueryStatement(ctx.query_statement())
            else -> throw UnsupportedOperationException()
        }
    }

    private fun parseQueryStatement(ctx: MQLParser.Query_statementContext): QueryStatement {
        val collectionName = getCollectionName(ctx.collection_name())
        val stages = ctx.query_stage().map { parseQueryStage(it) }

        return QueryStatement(collectionName, stages)
    }

    private fun parseQueryStage(ctx: MQLParser.Query_stageContext): Stage {
        return when (ctx) {
            is MQLParser.GroupStageContext -> {
                val by = parseExpression(ctx.expression())
                val elements = ctx.field_assignment().map { fa ->
                    val fieldDeclaration = getFieldDeclaration(fa.field_declaration())
                    val expression = parseExpression(fa.expression())
                    NewDocumentExpression.Element(fieldDeclaration, expression)
                }

                GroupStage(by, NewDocumentExpression(elements))
            }
            is MQLParser.LimitStageContext -> LimitStage(ctx.INT().text.toLong())
            is MQLParser.LookupStageContext -> {
                val field = getFieldDeclaration(ctx.multipart_field_declaration())
                val variables = ctx.variable_assignment().map { variable ->
                    LookupStage.Variable(
                        getVariableName(variable.variable_name()),
                        parseExpression(variable.expression())
                    )
                }
                val statement = parseQueryStatement(ctx.query_statement())

                LookupStage(field, variables, statement)
            }
            is MQLParser.MatchStageContext -> MatchStage(parseExpression(ctx.expression()))
            is MQLParser.ProjectStageContext -> {
                val items = ctx.project_item().map { item ->
                    val fieldDeclaration = getFieldDeclaration(item.multipart_field_declaration())

                    if (item.EXCLUDE() != null) {
                        ProjectStage.Item.Exclude(fieldDeclaration)
                    } else {
                        val expression = when {
                            item.expression() != null -> parseExpression(item.expression())
                            else -> fieldDeclaration.toFieldReferenceExpression()
                        }

                        ProjectStage.Item.Include(fieldDeclaration, expression)
                    }
                }

                ProjectStage(items)
            }
            is MQLParser.SkipStageContext -> SkipStage(ctx.INT().text.toLong())
            is MQLParser.SortStageContext -> {
                val fields = ctx.sort_field().map { fieldCtx ->
                    val field = getFieldReferenceExpression(fieldCtx.multipart_field_name())
                    val direction = if (fieldCtx.DESC() != null) {
                        Direction.DESCENDING
                    } else {
                        Direction.ASCENDING
                    }

                    SortStage.Field(field, direction)
                }

                SortStage(fields)
            }
            is MQLParser.UnwindStageContext -> {
                val field = getFieldReferenceExpression(ctx.multipart_field_name())

                var preserveNullAndEmpty = false
                var indexField: FieldDeclaration? = null

                if (ctx.unwind_option() != null) {
                    ctx.unwind_option().forEach {
                        when {
                            it.PRESERVE_NULL_AND_EMPTY() != null -> preserveNullAndEmpty = true
                            it.INDEX() != null -> indexField = getFieldDeclaration(it.multipart_field_declaration())
                        }
                    }
                }

                UnwindStage(field, indexField, preserveNullAndEmpty)
            }
            else -> throw ParseException("unsupported stage ${ctx.text}")
        }
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
                if (ctx.RANGE() == null) {
                    // start might be a range expression already, and that's ok...
                    ArrayAccessExpression(array, start)
                } else {
                    val end = ctx.end?.let { parseExpression(it) } ?: NullExpression
                    val step = ctx.step?.let { parseExpression(it) }
                    val range = RangeExpression(start, end, step)
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
            is MQLParser.ConcatExpressionContext -> {
                val left = parseExpression(ctx.expression(0))
                val right = parseExpression(ctx.expression(1))

                ConcatExpression(left, right)
            }
            is MQLParser.ConditionalExpressionContext -> {
                val condition = parseExpression(ctx.expression(0))
                val then = parseExpression(ctx.expression(1))
                val fallback = parseExpression(ctx.expression(2))

                ConditionalExpression(condition, then, fallback)
            }
            is MQLParser.DateTimeExpressionContext -> {
                val txt = ctx.text.substring(3, ctx.text.length - 1)
                val fmt = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
                val dt = OffsetDateTime.parse(txt, fmt)
                DateTimeExpression(dt.toInstant())
            }
            is MQLParser.FieldExpressionContext -> FieldReferenceExpression(null, getFieldName(ctx.field_name()))
            is MQLParser.FunctionCallExpressionContext -> {
                parseFunction(ctx.function())
            }
            is MQLParser.InExpressionContext -> {
                val left = parseExpression(ctx.expression(0))
                val right = parseExpression(ctx.expression(1))

                val expression = InExpression(left, right)
                if (ctx.NOT() != null) {
                    NotExpression(expression)
                } else expression
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
            is MQLParser.LikeExpressionContext -> {
                val left = parseExpression(ctx.expression())
                val right = parseRegex(ctx.regex())

                LikeExpression(left, right)
            }
            is MQLParser.MemberExpressionContext -> {
                val parent = parseExpression(ctx.expression())

                if (ctx.field_name() != null) {
                    val fieldName = getFieldName(ctx.field_name())
                    FieldReferenceExpression(parent, fieldName)
                } else {
                    val function = parseFunction(ctx.function())

                    function.update(
                        function.name,
                        listOf(FunctionCallExpression.Argument.Positional(parent)) + function.arguments
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
            is MQLParser.NewDocumentExpressionContext -> parserDocument(ctx.document())
            is MQLParser.NotExpressionContext -> {
                val expression = parseExpression(ctx.expression())
                return NotExpression(expression)
            }
            is MQLParser.NullCoalesceExpressionContext -> {
                val left = parseExpression(ctx.expression(0))
                val right = parseExpression(ctx.expression(1))

                NullCoalesceExpression(left, right)
            }
            is MQLParser.NullExpressionContext -> NullExpression
            is MQLParser.NumberExpressionContext -> parseNumber(ctx.number())
            is MQLParser.OidExpressionContext -> ObjectIdExpression(ObjectId(ctx.text.substring(4, ctx.text.length - 1)))
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
            is MQLParser.RegexExpressionContext -> parseRegex(ctx.regex())
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

    private fun parserDocument(ctx: MQLParser.DocumentContext): NewDocumentExpression {
        val elements = ctx.field_assignment().map { fa ->
            val field = getFieldDeclaration(fa.field_declaration())
            val expression = parseExpression(fa.expression())

            NewDocumentExpression.Element(field, expression)
        }

        return NewDocumentExpression(elements)
    }

    private fun parseFunction(ctx: MQLParser.FunctionContext): FunctionCallExpression {
        val name = getFunctionName(ctx.function_name())
        val arguments = ctx.function_argument().map { fa ->
            when {
                fa.function_argument_name() != null -> {
                    val argName = getFunctionArgumentName(fa.function_argument_name())
                    val expression = parseExpression(fa.expression())

                    FunctionCallExpression.Argument.Named(argName, expression)
                }
                fa.expression() != null -> {
                    val expression = parseExpression(fa.expression())
                    FunctionCallExpression.Argument.Positional(expression)
                }
                else -> {
                    val parameters = fa.lambda_expression().lambda_argument().map { getVariableName(it.variable_name()) }
                    val expression = parseExpression(fa.lambda_expression().expression())
                    FunctionCallExpression.Argument.Positional(LambdaExpression(parameters, expression))
                }
            }
        }

        return FunctionCallExpression(name, arguments)
    }

    private fun parseNumber(ctx: MQLParser.NumberContext): NumberExpression {
        fun parseIntegralExpression(text: String, radix: Int, forceLong: Boolean = false): NumberExpression {
            var parseText = text
            var parseForceLong = forceLong
            if (text.endsWith("L", true)) {
                parseForceLong = true
                parseText = text.substring(0, text.length - 1)
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

    private fun parseRegex(ctx: MQLParser.RegexContext): RegexExpression {
        val text = ctx.text
        val lastIndex = text.lastIndexOf('/')
        val options = if (lastIndex == text.length - 1) {
            null
        } else text.substring(lastIndex + 1)

        return RegexExpression(ctx.text.substring(1 until lastIndex).replace("\\/", "/"), options)
    }

    private fun getCollectionName(ctx: MQLParser.Collection_nameContext): CollectionName {
        var databaseName: DatabaseName? = null
        if (ctx.database_name() != null) {
            databaseName = getDatabaseName(ctx.database_name())
        }

        return CollectionName(databaseName, maybeUnquote(ctx.text))
    }

    private fun getDatabaseName(ctx: MQLParser.Database_nameContext): DatabaseName {
        return DatabaseName(maybeUnquote(ctx.text))
    }

    private fun getFieldDeclaration(ctx: MQLParser.Multipart_field_declarationContext): FieldDeclaration {
        val fre = ctx.field_declaration()
            .map { getFieldName(it) }
            .fold(null as FieldDeclaration?) { acc, item -> FieldDeclaration(acc, item) }

        return fre as FieldDeclaration
    }

    private fun getFieldDeclaration(ctx: MQLParser.Field_declarationContext): FieldDeclaration {
        return FieldDeclaration(null, getFieldName(ctx))
    }

    private fun getFieldName(ctx: MQLParser.Field_declarationContext): FieldName {
        return FieldName(maybeUnquote(ctx.text))
    }

    private fun getFieldName(ctx: MQLParser.Field_nameContext): FieldName {
        return FieldName(maybeUnquote(ctx.text))
    }

    private fun getFieldReferenceExpression(ctx: MQLParser.Multipart_field_nameContext): FieldReferenceExpression {
        val fre = ctx.field_name()
            .map { getFieldName(it) }
            .fold(null as FieldReferenceExpression?) { acc, item -> FieldReferenceExpression(acc, item) }

        return fre as FieldReferenceExpression
    }

    private fun getFunctionName(ctx: MQLParser.Function_nameContext): FunctionName {
        return FunctionName(maybeUnquote(ctx.text))
    }

    private fun getFunctionArgumentName(ctx: MQLParser.Function_argument_nameContext): FunctionArgumentName {
        return FunctionArgumentName(maybeUnquote(ctx.text))
    }

    private fun getVariableName(ctx: MQLParser.Variable_nameContext): VariableName {
        return VariableName(ctx.text.substring(1))
    }

    private fun maybeUnquote(text: String): String {
        return if (text[0] == '`' || text[0] == '\'' || text[0] == '"') {
            unquote(text)
        } else text
    }

    private fun unquote(text: String): String {
        return text.substring(1, text.length - 1)
    }
}
