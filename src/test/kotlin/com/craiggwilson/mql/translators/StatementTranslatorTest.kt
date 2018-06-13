package com.craiggwilson.mql.translators

import com.craiggwilson.mql.parser.parseMQL
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class StatementTranslatorTest() {

    @ParameterizedTest(name = "{0}")
    @MethodSource("aggExpressions")
    fun testAggExpressions(mql: String, expected: String) {
        val actualExpected = "db.bar.aggregate([{ \$project: { \"test\": $expected } }])"

        val parsed = parseMQL("FROM bar PROJECT test := $mql")[0]
        val actual = parsed.toShell()

        assertEquals(actualExpected, actual)
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("functions")
    fun testFunctions(mql: String, expected: String) {
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
        private fun aggExpressions(): Collection<Array<String>> {
            return listOf(
                // order of operations
                test("true AND false", "{ \"\$and\": [ true, false ] }"),
                test("true AND false OR true", "{ \"\$or\": [ { \"\$and\": [ true, false ] }, true ] }"),
                test("true AND (false OR true)", "{ \"\$and\": [ true, { \"\$or\": [ false, true ] } ] }"),

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
                test("a[0].b", "{ \"\$let\": { \"vars\": { \"parent\": { \"\$arrayElemAt\": [ \"\$a\", NumberInt(\"0\") ] } }, \"in\": \"\$\$parent.b\" } }"),
                test("{a:= false}.a", "{ \"\$let\": { \"vars\": { \"parent\": { \"a\": false } }, \"in\": \"\$\$parent.a\" } }"),

                // arrays
                test("[true, false, true]", "[ true, false, true ]"),

                // documents
                test("{ a:= 1.0, b:= 2.0 }", "{ \"a\": 1.0, \"b\": 2.0 }"),

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
                test("a[2:]", "{ \"\$let\": { \"vars\": { \"array\": \"\$a\" }, \"in\": { \"\$slice\": [ \"\$\$array\", { \"\$subtract\": [ NumberInt(\"2\"), { \"\$size\": [ \"\$\$array\" ] } ] } ] } } }"),
                test("a[:8]", "{ \"\$slice\": [ \"\$a\", NumberInt(\"8\") ] }"),

                // range expression
                test("1..4", "{ \"\$range\": [ NumberInt(\"1\"), NumberInt(\"4\") ] }"),
                test("1..4 step 2", "{ \"\$range\": [ NumberInt(\"1\"), NumberInt(\"4\"), NumberInt(\"2\") ] }"),

                // conditionals
                test("if true then false else true", "{ \"\$cond\": [ true, false, true ] }"),
                test("switch case true then false case false then true else null", "{ \"\$switch\": { \"branches\": [ { \"case\": true, \"then\": false }, { \"case\": false, \"then\": true } ], \"default\": null } }"),

                // let
                test("let \$x := true, \$y := false in \$x and \$y", "{ \"\$let\": { \"vars\": { \"x\": true, \"y\": false }, \"in\": { \"\$and\": [ \"\$\$x\", \"\$\$y\" ] } } }"),

                // functions
                test("testFunc(a, 1.0)", "{ \"\$testFunc\": [ \"\$a\", 1.0 ] }"),
                test("testFunc(arg1 := a, arg2 := 1.0)", "{ \"\$testFunc\": { \"arg1\": \"\$a\", \"arg2\": 1.0 } }"),
                test("a.testFunc(1.0)", "{ \"\$testFunc\": [ \"\$a\", 1.0 ] }"),
                test("a.testFunc(arg2 := 1.0)", "{ \"\$testFunc\": [ \"\$a\", 1.0 ] }")
            )
        }

        @JvmStatic
        private fun functions(): Collection<Array<String>> {
            return listOf(
                test("map(a,\$x => \$x.b + 1)", "{ \"\$map\": { \"input\": \"\$a\", \"as\": \"x\", \"in\": { \"\$add\": [ \"\$\$x.b\", NumberInt(\"1\") ] } } }"),
                test("reduce(a, 10, (\$acc, \$current) => \$acc + \$current.b)", "{ \"\$reduce\": { \"input\": \"\$a\", \"initialValue\": NumberInt(\"10\"), \"in\": { \"\$add\": [ \"\$\$value\", \"\$\$this.b\" ] } } }"),
                test("a.map(\$x => \$x.b).reduce(10, (\$acc, \$current) => \$acc + \$current)", "{ \"\$reduce\": { \"input\": { \"\$map\": { \"input\": \"\$a\", \"as\": \"x\", \"in\": \"\$\$x.b\" } }, \"initialValue\": NumberInt(\"10\"), \"in\": { \"\$add\": [ \"\$\$value\", \"\$\$this\" ] } } }"),

                // renaming closed variable
                test("let \$this := 1 in a.reduce(2, (\$acc, \$x) => \$acc + \$x + \$this)", "{ \"\$let\": { \"vars\": { \"this\": NumberInt(\"1\") }, \"in\": { \"\$let\": { \"vars\": { \"closed_this0\": \"\$\$this\" }, \"in\": { \"\$reduce\": { \"input\": \"\$a\", \"initialValue\": NumberInt(\"2\"), \"in\": { \"\$add\": [ { \"\$add\": [ \"\$\$value\", \"\$\$this\" ] }, \"\$\$closed_this0\" ] } } } } } } }")
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