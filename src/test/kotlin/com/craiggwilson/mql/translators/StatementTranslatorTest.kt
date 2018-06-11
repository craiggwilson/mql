package com.craiggwilson.mql.translators

import com.craiggwilson.mql.parser.parseMQL
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class StatementTranslatorTest() {

    @ParameterizedTest(name = "{0}")
    @MethodSource("expressions")
    fun testExpressions(mql: String, expected: String) {
        val actualExpected = "db.bar.aggregate([{ \$project: { \"test\": $expected } }])"

        val parsed = parseMQL("FROM bar PROJECT test := $mql")[0]
        val actual = parsed.toShell()

        assertEquals(actualExpected, actual)
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("stages")
    fun testStages(mql: String, expected: String) {
        val parsed = parseMQL(mql)[0]
        val actual = parsed.toShell()

        assertEquals(expected, actual)
    }

    companion object {

        private fun test(mql: String, expected: String): Array<String> {
            return arrayOf(mql, expected)
        }

        @JvmStatic
        private fun expressions(): Collection<Array<String>> {
            return listOf(
                // constants
                test("false", "false"),
                test("true", "true"),
                test("1", "NumberInt(\"1\")"),
                test("-1", "NumberInt(\"-1\")"),
                test("1L", "NumberLong(\"1\")"),
                test("-1L", "NumberLong(\"-1\")"),
                test("-1M", "NumberDecimal(\"-1\")"),
                test("1M", "NumberDecimal(\"1\")"),
                test("1.234E12", "NumberDecimal(\"1.234E+12\")"),
                test("-1.234E12", "NumberDecimal(\"-1.234E+12\")"),
                test("1.234", "1.234"),
                test("-1.234", "-1.234"),
                test("1.234M", "NumberDecimal(\"1.234\")"),
                test("-1.234M", "NumberDecimal(\"-1.234\")"),
                test("1000000000000000000", "NumberLong(\"1000000000000000000\")"),
                test("-1000000000000000000", "NumberLong(\"-1000000000000000000\")"),
                test("null", "null"),
                test("'one'", "\"one\""),

                // field references
                test("a", "\"\$a\""),

                // binary expression
                test("1.0 + 2.0", "{ \"\$add\": [ 1.0, 2.0 ] }"),
                test("1.0 and 2.0", "{ \"\$and\": [ 1.0, 2.0 ] }"),
                test("1.0 && 2.0", "{ \"\$and\": [ 1.0, 2.0 ] }"),
                test("1.0 / 2.0", "{ \"\$divide\": [ 1.0, 2.0 ] }"),
                test("1.0 = 2.0", "{ \"\$eq\": [ 1.0, 2.0 ] }"),
                test("1.0 > 2.0", "{ \"\$gt\": [ 1.0, 2.0 ] }"),
                test("1.0 >= 2.0", "{ \"\$gte\": [ 1.0, 2.0 ] }"),
                test("1.0 < 2.0", "{ \"\$lt\": [ 1.0, 2.0 ] }"),
                test("1.0 <= 2.0", "{ \"\$lte\": [ 1.0, 2.0 ] }"),
                test("1.0 % 2.0", "{ \"\$mod\": [ 1.0, 2.0 ] }"),
                test("1.0 * 2.0", "{ \"\$multiply\": [ 1.0, 2.0 ] }"),
                test("1.0 != 2.0", "{ \"\$ne\": [ 1.0, 2.0 ] }"),
                test("1.0 or 2.0", "{ \"\$or\": [ 1.0, 2.0 ] }"),
                test("1.0 || 2.0", "{ \"\$or\": [ 1.0, 2.0 ] }"),
                test("1.0^2.0", "{ \"\$pow\": [ 1.0, 2.0 ] }"),
                test("1.0 - 2.0", "{ \"\$subtract\": [ 1.0, 2.0 ] }"),

                // unary expression
                test("NOT true", "{ \"\$not\": [ true ] }"),

                // array access expression
                test("a[0]", "{ \"\$arrayElemAt\": [ \"\$a\", NumberInt(\"0\") ] }"),
                test("a[-4]", "{ \"\$arrayElemAt\": [ \"\$a\", NumberInt(\"-4\") ] }"),
                test("a[2..4]", "{ \"\$slice\": [ \"\$a\", NumberInt(\"2\"), { \"\$subtract\": [ NumberInt(\"4\"), NumberInt(\"2\") ] } ] }"),
                test("a[2:4]", "{ \"\$slice\": [ \"\$a\", NumberInt(\"2\"), { \"\$subtract\": [ NumberInt(\"4\"), NumberInt(\"2\") ] } ] }"),
                test("a[2:]", "{ \"\$let\": { \"vars\": { \"array\": \"\$a\" }, \"in\": { \"\$slice\": [ \"\$\$array\", { \"\$subtract\": [ NumberInt(\"2\"), { \"\$size\": \"\$\$array\" } ] } ] } } }"),
                test("a[:8]", "{ \"\$slice\": [ \"\$a\", NumberInt(\"8\") ] }"),

                // range expression
                test("1..4", "{ \"\$range\": [ NumberInt(\"1\"), NumberInt(\"4\") ] }"),
                test("1..4 step 2", "{ \"\$range\": [ NumberInt(\"1\"), NumberInt(\"4\"), NumberInt(\"2\") ] }")
            )
        }

        @JvmStatic
        private fun stages(): Collection<Array<String>> {
            return listOf(
                // LIMIT
                test(
                    "FROM bar LIMIT 10",
                    "db.bar.aggregate([{ \$limit: 10 }])"
                ),

                // PROJECT
                test(
                    "FROM bar PROJECT a, b.c, `c`",
                    "db.bar.aggregate([{ \$project: { \"a\": \"\$a\", \"b.c\": \"\$b.c\", \"c\": \"\$c\" } }])"
                ),

                test(
                    "FROM bar PROJECT a := a, b_c := b.c, C := `c`",
                    "db.bar.aggregate([{ \$project: { \"a\": \"\$a\", \"b_c\": \"\$b.c\", \"C\": \"\$c\" } }])"
                ),

                // SKIP
                test(
                    "FROM bar SKIP 10",
                    "db.bar.aggregate([{ \$skip: 10 }])"
                ),

                // SORT
                test(
                    "FROM bar SORT a, b.a DESC, c.a ASC",
                    "db.bar.aggregate([{ \$sort: { \"a\": 1, \"b.a\": -1, \"c.a\": 1 } }])"
                ),

                // UNWIND
                test(
                    "FROM bar UNWIND a.b",
                    "db.bar.aggregate([{ \$unwind: { path: \"\$a.b\", preserveNullAndEmptyArrays: false } }])"
                ),
                test(
                    "FROM bar UNWIND a.b WITH PRESERVE_NULL_AND_EMPTY",
                    "db.bar.aggregate([{ \$unwind: { path: \"\$a.b\", preserveNullAndEmptyArrays: true } }])"
                ),
                test(
                    "FROM bar UNWIND a.b WITH INDEX b.a",
                    "db.bar.aggregate([{ \$unwind: { path: \"\$a.b\", preserveNullAndEmptyArrays: false, includeArrayIndex: \"b.a\" } }])"
                ),
                test(
                    "FROM bar UNWIND a.b WITH INDEX b.a PRESERVE_NULL_AND_EMPTY",
                    "db.bar.aggregate([{ \$unwind: { path: \"\$a.b\", preserveNullAndEmptyArrays: true, includeArrayIndex: \"b.a\" } }])"
                )
            )
        }
    }
}