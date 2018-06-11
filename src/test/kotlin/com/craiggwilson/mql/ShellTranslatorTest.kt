package com.craiggwilson.mql

import com.craiggwilson.mql.parser.parseMQL
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class ShellTranslatorTest() {

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

                // expressions
                test("NOT true", "{ \"\$not\": [ true ] }"),
                test("NOT a", "{ \"\$not\": [ \"\$a\" ] }")
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