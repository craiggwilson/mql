package com.craiggwilson.mql.library.translators

import com.craiggwilson.mql.library.parser.parseMQL
import org.bson.BsonArray
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class StatementTranslatorTest {

    @ParameterizedTest(name = "{0}")
    @MethodSource("aggExpressions")
    fun testAggExpressions(mql: String, expected: String) {
        val actualExpected = BsonArray.parse("[{ \"\$project\": { \"test\": $expected } }]")

        val parsed = parseMQL("FROM bar PROJECT test: $mql")[0]
        val actual = parsed.translatedPipeline()

        assertEquals(actualExpected, actual)
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("functions")
    fun testFunctions(mql: String, expected: String) {
        val actualExpected = BsonArray.parse("[{ \"\$project\": { \"test\": $expected } }]")

        val parsed = parseMQL("FROM bar PROJECT test: $mql")[0]
        val actual = parsed.translatedPipeline()

        assertEquals(actualExpected, actual)
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("matchExpressions")
    fun testMatchExpressions(mql: String, expected: String) {
        val actualExpected = BsonArray.parse("[{ \"\$match\": $expected }]")

        val parsed = parseMQL("FROM bar MATCH $mql")[0]
        val actual = parsed.translatedPipeline()

        assertEquals(actualExpected, actual)
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("stages")
    fun testStages(mql: String, expected: String) {
        val actualExpected = BsonArray.parse(expected)

        val parsed = parseMQL(mql)[0]
        val actual = parsed.translatedPipeline()

        assertEquals(actualExpected, actual)
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("full")
    fun testFull(mql: String, expected: String) {
        val actualExpected = BsonArray.parse(expected)

        val parsed = parseMQL(mql)[0]
        val actual = parsed.translatedPipeline()

        assertEquals(actualExpected, actual)
    }

    companion object {

        private fun test(mql: String, expected: String): Array<String> {
            return arrayOf(mql, expected)
        }

        @JvmStatic
        private fun aggExpressions(): Collection<Array<String>> {
            return listOf(
                // order of operations
                test("true AND false", "{ \"\$and\": [ { \"\$literal\": true}, {\"\$literal\": false} ] }"),
                test("true AND false OR true", "{ \"\$or\": [ { \"\$and\": [ { \"\$literal\": true }, { \"\$literal\": false}] }, { \"\$literal\": true} ] }"),
                test("true AND (false OR true)", "{ \"\$and\": [ { \"\$literal\": true }, { \"\$or\": [ { \"\$literal\": false }, { \"\$literal\": true } ] } ] }"),

                // literals
                test("false", "{ \"\$literal\": false }"),
                test("true", "{ \"\$literal\": true }"),
                test("1", "{ \"\$literal\": 1}"),
                test("-1", "{ \"\$literal\": -1 }"),
                test("1L", "{ \"\$literal\": NumberLong(\"1\") }"),
                test("-1L", "{ \"\$literal\": NumberLong(\"-1\") }"),
                test("-1M", "{ \"\$literal\": NumberDecimal(\"-1\") }"),
                test("1M", "{ \"\$literal\": NumberDecimal(\"1\") }"),
                test("1.234E12", "{ \"\$literal\": NumberDecimal(\"1.234E+12\") }"),
                test("-1.234E12", "{ \"\$literal\": NumberDecimal(\"-1.234E+12\") }"),
                test("1.234", "{ \"\$literal\": 1.234 }"),
                test("-1.234", "{ \"\$literal\": -1.234 }"),
                test("1.234M", "{ \"\$literal\": NumberDecimal(\"1.234\") }"),
                test("-1.234M", "{ \"\$literal\": NumberDecimal(\"-1.234\") }"),
                test("1000000000000000000", "{ \"\$literal\": NumberLong(\"1000000000000000000\") }"),
                test("-1000000000000000000", "{ \"\$literal\": NumberLong(\"-1000000000000000000\") }"),
                test("null", "null"),
                test("\"one\"", "\"one\""),
                test("'one'", "\"one\""),
                test("\"\$one\"", "{ \"\$literal\": \"\$one\" }"),
                test("/foo/i", "/foo/i"),
                test("/fo\\/o/i", "{ \"\$regex\": \"fo/o\", \"\$options\": \"i\" }"),
                test("oid'507f1f77bcf86cd799439011'", "{ \"\$oid\" : \"507f1f77bcf86cd799439011\" }"),
                test("dt'2000-01-01T12:00:00Z'", "{ \"\$date\" : 946728000000 }"),
                test("dt'2000-01-01T12:00:00+00:00'", "{ \"\$date\" : 946728000000 }"),

                // field references
                test("a", "\"\$a\""),
                test("`a`", "\"\$a\""),
                test("a[0].b", "{ \"\$let\": { \"vars\": { \"parent\": { \"\$arrayElemAt\": [ \"\$a\", { \"\$literal\": NumberInt(\"0\") } ] } }, \"in\": \"\$\$parent.b\" } }"),
                test("{a: false}.a", "{ \"\$let\": { \"vars\": { \"parent\": { \"a\": { \"\$literal\": false } } }, \"in\": \"\$\$parent.a\" } }"),

                // arrays
                test("[true, false, true]", "[ { \"\$literal\": true }, { \"\$literal\": false }, { \"\$literal\": true }]"),

                // documents
                test("{ a: 1.0, b: 2.0 }", "{ \"a\": { \"\$literal\": 1.0 }, \"b\": { \"\$literal\": 2.0 } }"),

                // binary expression
                test("1.0 + 2.0", "{ \"\$add\": [ { \"\$literal\": 1.0 }, { \"\$literal\": 2.0 } ] }"),
                test("1.0 || 2.0", "{ \"\$concat\": [ { \"\$literal\": 1.0 }, { \"\$literal\": 2.0 } ] }"),
                test("1.0 and 2.0", "{ \"\$and\": [ { \"\$literal\": 1.0 }, { \"\$literal\": 2.0 }] }"),
                test("1.0 / 2.0", "{ \"\$divide\": [ { \"\$literal\": 1.0 }, { \"\$literal\": 2.0 }] }"),
                test("1.0 = 2.0", "{ \"\$eq\": [ { \"\$literal\": 1.0 }, { \"\$literal\": 2.0 } ] }"),
                test("1.0 > 2.0", "{ \"\$gt\": [ { \"\$literal\": 1.0 }, { \"\$literal\": 2.0 } ] }"),
                test("1.0 >= 2.0", "{ \"\$gte\": [ { \"\$literal\": 1.0 }, { \"\$literal\": 2.0 } ] }"),
                test("1.0 < 2.0", "{ \"\$lt\": [ { \"\$literal\": 1.0 }, { \"\$literal\": 2.0 }] }"),
                test("1.0 <= 2.0", "{ \"\$lte\": [ { \"\$literal\": 1.0 }, { \"\$literal\": 2.0 }] }"),
                test("1.0 % 2.0", "{ \"\$mod\": [ { \"\$literal\": 1.0 }, { \"\$literal\": 2.0 } ] }"),
                test("1.0 * 2.0", "{ \"\$multiply\": [ { \"\$literal\": 1.0 }, { \"\$literal\": 2.0 } ] }"),
                test("1.0 != 2.0", "{ \"\$ne\": [ { \"\$literal\": 1.0 }, { \"\$literal\": 2.0 } ] }"),
                test("1.0 or 2.0", "{ \"\$or\": [ { \"\$literal\": 1.0 }, { \"\$literal\": 2.0 } ] }"),
                test("1.0**2.0", "{ \"\$pow\": [ { \"\$literal\": 1.0 }, { \"\$literal\": 2.0 }] }"),
                test("1.0 - 2.0", "{ \"\$subtract\": [ { \"\$literal\": 1.0 }, { \"\$literal\": 2.0 }] }"),

                // in expression
                test("a in [10,11]", "{ \"\$in\": [\"\$a\", [ { \"\$literal\": 10 }, { \"\$literal\": 11 }] ] }"),
                test("a not in [10,11]", "{ \"\$not\": { \"\$in\": [\"\$a\", [ { \"\$literal\": 10 }, { \"\$literal\": 11 } ] ] } }"),

                // null coalesce
                test("a ?? b", "{ \"\$ifNull\": [\"\$a\", \"\$b\"] }"),
                test("a ?? b ?? c", "{ \"\$ifNull\": [{ \"\$ifNull\": [\"\$a\", \"\$b\"] }, \"\$c\"] }"),
                test("a ?? b + c", "{ \"\$ifNull\": [ \"\$a\", { \"\$add\": [\"\$b\", \"\$c\"] }] }"),
                test("a + b ?? c", "{ \"\$ifNull\": [{ \"\$add\": [\"\$a\", \"\$b\"] }, \"\$c\"] }"),

                // unary expression
                test("NOT true", "{ \"\$not\": { \"\$literal\": true } }"),

                // array access expression
                test("a[..]", "\"\$a\""),
                test("a[..:2]", "{ \"\$let\" : { \"vars\" : { \"array\" : \"\$a\" }, \"in\" : { \"\$map\" : { \"input\" : { \"\$filter\" : { \"input\" : { \"\$zip\" : { \"inputs\" : [{ \"\$range\" : [{ \"\$literal\" : 0 }, { \"\$size\" : \"\$\$array\" }] }, \"\$\$array\"] } }, \"as\" : \"x\", \"cond\" : { \"\$eq\" : [{ \"\$literal\" : 0 }, { \"\$mod\" : [{ \"\$arrayElemAt\" : [\"\$\$x\", { \"\$literal\" : 0 }] }, { \"\$literal\" : 2 }] }] } } }, \"as\" : \"x\", \"in\" : { \"\$arrayElemAt\" : [\"\$\$x\", { \"\$literal\" : 1 }] } } } } }"),
                test("a[0]", "{ \"\$arrayElemAt\": [ \"\$a\", { \"\$literal\": 0 } ] }"),
                test("a[-4]", "{ \"\$arrayElemAt\": [ \"\$a\", { \"\$literal\": -4 } ] }"),
                test("a[2..4]", "{ \"\$slice\": [ \"\$a\", { \"\$literal\": 2 }, { \"\$subtract\": [ { \"\$literal\": 4 }, { \"\$literal\": 2 }] } ] }"),
                test("a[2..]", "{ \"\$let\": { \"vars\": { \"array\": \"\$a\" }, \"in\": { \"\$slice\": [ \"\$\$array\", { \"\$subtract\": [ { \"\$literal\": 2 }, { \"\$size\": \"\$\$array\" } ] } ] } } }"),
                test("a[..8]", "{ \"\$slice\": [ \"\$a\", { \"\$literal\": 8 } ] }"),
                test("a[1..10:3]", "{ \"\$let\" : { \"vars\" : { \"array\" : { \"\$slice\" : [\"\$a\", { \"\$literal\" : 1 }, { \"\$subtract\" : [{ \"\$literal\" : 10 }, { \"\$literal\" : 1 }] }] } }, \"in\" : { \"\$map\" : { \"input\" : { \"\$filter\" : { \"input\" : { \"\$zip\" : { \"inputs\" : [{ \"\$range\" : [{ \"\$literal\" : 0 }, { \"\$size\" : \"\$\$array\" }] }, \"\$\$array\"] } }, \"as\" : \"x\", \"cond\" : { \"\$eq\" : [{ \"\$literal\" : 0 }, { \"\$mod\" : [{ \"\$arrayElemAt\" : [\"\$\$x\", { \"\$literal\" : 0 }] }, { \"\$literal\" : 3 }] }] } } }, \"as\" : \"x\", \"in\" : { \"\$arrayElemAt\" : [\"\$\$x\", { \"\$literal\" : 1 }] } } } } }"),

                // range expression
                test("1..4", "{ \"\$range\": [ { \"\$literal\": 1 }, { \"\$literal\": 4 } ] }"),
                test("1..4 : 2", "{ \"\$range\": [ { \"\$literal\": 1 }, { \"\$literal\": 4 }, { \"\$literal\": 2 } ] }"),

                // conditionals
                test("if true then false else true", "{ \"\$cond\": [ { \"\$literal\": true }, { \"\$literal\": false }, { \"\$literal\": true }] }"),
                test("switch case true then false case false then true else null", "{ \"\$switch\": { \"branches\": [ { \"case\": { \"\$literal\": true }, \"then\": { \"\$literal\": false }}, { \"case\": { \"\$literal\": false }, \"then\": { \"\$literal\": true }} ], \"default\": null } }"),

                // let
                test("let \$x: true, \$y: false => \$x and \$y", "{ \"\$let\": { \"vars\": { \"x\": { \"\$literal\": true }, \"y\": { \"\$literal\": false }}, \"in\": { \"\$and\": [ \"\$\$x\", \"\$\$y\" ] } } }"),

                // functions
                test("testFunc(a, 1.0)", "{ \"\$testFunc\": [ \"\$a\", { \"\$literal\": 1.0 } ] }"),
                test("testFunc(arg1: a, arg2: 1.0)", "{ \"\$testFunc\": { \"arg1\": \"\$a\", \"arg2\": { \"\$literal\": 1.0 } } }"),
                test("a.testFunc(1.0)", "{ \"\$testFunc\": [ \"\$a\", { \"\$literal\": 1.0 } ] }"),
                test("a.testFunc(arg2: 1.0)", "{ \"\$testFunc\": [ \"\$a\", { \"\$literal\": 1.0 } ] }")
            )
        }

        @JvmStatic
        private fun functions(): Collection<Array<String>> {
            return listOf(
                test("a.filter(\$x => \$x = true)", "{ \"\$filter\" : { \"input\" : \"\$a\", \"as\" : \"x\", \"cond\" : { \"\$eq\" : [\"\$\$x\", { \"\$literal\": true }] } } }"),
                test("map(a,\$x => \$x.b + 1)", "{ \"\$map\": { \"input\": \"\$a\", \"as\": \"x\", \"in\": { \"\$add\": [ \"\$\$x.b\", { \"\$literal\": 1 } ] } } }"),
                test("reduce(a, 10, (\$acc, \$current) => \$acc + \$current.b)", "{ \"\$reduce\": { \"input\": \"\$a\", \"initialValue\": { \"\$literal\": 10 }, \"in\": { \"\$add\": [ \"\$\$value\", \"\$\$this.b\" ] } } }"),
                test("a.map(\$x => \$x.b).reduce(10, (\$acc, \$current) => \$acc + \$current)", "{ \"\$reduce\": { \"input\": { \"\$map\": { \"input\": \"\$a\", \"as\": \"x\", \"in\": \"\$\$x.b\" } }, \"initialValue\": { \"\$literal\": 10 }, \"in\": { \"\$add\": [ \"\$\$value\", \"\$\$this\" ] } } }"),
                test("a.zip([1,2,3], (\$x, \$y) => \$x + \$y)", "{ \"\$map\" : { \"input\" : { \"\$zip\" : { \"inputs\" : [\"\$a\", [{ \"\$literal\" : 1 }, { \"\$literal\" : 2 }, { \"\$literal\" : 3 }]] } }, \"as\" : \"x\", \"in\" : { \"\$add\" : [{ \"\$arrayElemAt\" : [\"\$\$x\", { \"\$literal\" : 0 }] }, { \"\$arrayElemAt\" : [\"\$\$x\", { \"\$literal\" : 1 }] }] } } }"),

                // renaming closed variable
                test("let \$this: 1 => a.reduce(2, (\$acc, \$x) => \$acc + \$x + \$this)", "{ \"\$let\": { \"vars\": { \"this\": { \"\$literal\": 1 } }, \"in\": { \"\$let\": { \"vars\": { \"closed_this0\": \"\$\$this\" }, \"in\": { \"\$reduce\": { \"input\": \"\$a\", \"initialValue\": { \"\$literal\": 2 }, \"in\": { \"\$add\": [ { \"\$add\": [ \"\$\$value\", \"\$\$this\" ] }, \"\$\$closed_this0\" ] } } } } } } }")
            )
        }

        @JvmStatic
        private fun matchExpressions(): Collection<Array<String>> {
            return listOf(
                // array accessor
                test("a[1] = 10", "{ \"a.1\": { \"\$eq\": 10 } }"),

                // comparison query operators
                test("a = 10", "{ \"a\": { \"\$eq\": 10 } }"),
                test("a > 10", "{ \"a\": { \"\$gt\": 10 } }"),
                test("a >= 10", "{ \"a\": { \"\$gte\": 10 } }"),
                test("a < 10", "{ \"a\": { \"\$lt\": 10 } }"),
                test("a <= 10", "{ \"a\": { \"\$lte\": 10 } }"),
                test("a != 10", "{ \"a\": { \"\$ne\": 10 } }"),
                test("a in [10,11]", "{ \"a\": { \"\$in\": [ 10, 11 ] } }"),
                test("a not in [10,11]", "{ \"a\": { \"\$nin\": [ 10, 11 ] } }"),
                test("10 = a", "{ \"a\": { \"\$eq\": 10 } }"),
                test("10 < a", "{ \"a\": { \"\$gt\": 10 } }"),
                test("10 <= a", "{ \"a\": { \"\$gte\": 10 } }"),
                test("10 > a", "{ \"a\": { \"\$lt\": 10 } }"),
                test("10 >= a", "{ \"a\": { \"\$lte\": 10 } }"),
                test("10 != a", "{ \"a\": { \"\$ne\": 10 } }"),
                test("a like /foo.*/i", "{ \"a\": /foo.*/i }"),

                // logical query operators
                test("a = 10 AND b = 11", "{ \"a\": { \"\$eq\": 10 }, \"b\": { \"\$eq\": 11 } }"),
                test("a = 10 AND a = 11", "{ \"\$and\": [{ \"a\": { \"\$eq\": 10 } }, { \"a\": { \"\$eq\": 11 } }] }"),
                test("a = 10 OR a = 11", "{ \"\$or\": [{ \"a\": { \"\$eq\": 10 } }, { \"a\": { \"\$eq\": 11 } }] }"),
                test("NOT (a != 10)", "{ \"a\": { \"\$eq\": 10 } }"),
                test("NOT (a = 10)", "{ \"a\": { \"\$ne\": 10 } }"),
                test("NOT (10 = a)", "{ \"a\": { \"\$ne\": 10 } }"),
                test("NOT NOT (a = 10)", "{ \"a\": { \"\$eq\": 10 } }"),

                // element query operators
                test("{ a: { \"\$exists\": true } }", "{ \"a\": { \"\$exists\": true } }"),
                test("a.exists(true)", "{ \"a\": { \"\$exists\": true } }"),
                test("exists(a, true)", "{ \"a\": { \"\$exists\": true } }"),
                test("{ a: { \"\$type\": 1 } }", "{ \"a\": { \"\$type\": 1 } }"),
                test("a.type(1)", "{ \"a\": { \"\$type\": 1 } }"),
                test("type(a, 1)", "{ \"a\": { \"\$type\": 1 } }"),

                // evaluation query operators
                test("a % 10 = 4", "{ \"a\" : { \"\$mod\" : [10, 4] } }"),
                test("4 = a % 10", "{ \"a\" : { \"\$mod\" : [10, 4] } }")
            )
        }

        @JvmStatic
        private fun stages(): Collection<Array<String>> {
            return listOf(
                // GROUP
                test(
                    "FROM bar GROUP sum_a: sum(a), min_a: min(a) BY c",
                    "[{ \$group: { _id: \"\$c\", sum_a: { \$sum: \"\$a\" }, min_a: { \$min: \"\$a\" } } }]"
                ),

                test(
                    "FROM bar GROUP sum_a: sum(a), min_a: min(a) BY { c: c, d: d }",
                    "[{ \$group: { _id: { c:\"\$c\", d: \"\$d\" }, sum_a: { \$sum: \"\$a\" }, min_a: { \$min: \"\$a\" } } }]"
                ),

                // LIMIT
                test(
                    "FROM bar LIMIT 10",
                    "[{ \$limit: NumberLong(\"10\") }]"
                ),

                // PROJECT
                test(
                    "FROM bar PROJECT a, b.c, c, !d",
                    "[{ \$project: { \"a\": \"\$a\", \"b.c\": \"\$b.c\", \"c\": \"\$c\", \"d\": 0 } }]"
                ),

                test(
                    "FROM bar PROJECT a: a, b_c: b.c, C: c",
                    "[{ \$project: { \"a\": \"\$a\", \"b_c\": \"\$b.c\", \"C\": \"\$c\" } }]"
                ),

                // SKIP
                test(
                    "FROM bar SKIP 10",
                    "[{ \$skip: NumberLong(\"10\") }]"
                ),

                // SORT
                test(
                    "FROM bar SORT a, b.a DESC, c.a ASC",
                    "[{ \$sort: { \"a\": 1, \"b.a\": -1, \"c.a\": 1 } }]"
                ),

                // UNWIND
                test(
                    "FROM bar UNWIND a.b",
                    "[{ \$unwind: { path: \"\$a.b\", preserveNullAndEmptyArrays: false } }]"
                ),
                test(
                    "FROM bar UNWIND a.b WITH PRESERVE_NULL_AND_EMPTY",
                    "[{ \$unwind: { path: \"\$a.b\", preserveNullAndEmptyArrays: true } }]"
                ),
                test(
                    "FROM bar UNWIND a.b WITH INDEX b.a",
                    "[{ \$unwind: { path: \"\$a.b\", preserveNullAndEmptyArrays: false, includeArrayIndex: \"b.a\" } }]"
                ),
                test(
                    "FROM bar UNWIND a.b WITH INDEX b.a PRESERVE_NULL_AND_EMPTY",
                    "[{ \$unwind: { path: \"\$a.b\", preserveNullAndEmptyArrays: true, includeArrayIndex: \"b.a\" } }]"
                )
            )
        }

        @JvmStatic
        private fun full(): Collection<Array<String>> {
            return listOf(
                test("""
                    FROM bar
                    MATCH a > 10 OR a < 20
                    PROJECT a, b: { c: g.d[0..36:12], e: f.map(@x => @x + 5) }
                    """.replace("@", "\$"),
                    "[{ \"\$match\" : { \"\$or\" : [{ \"a\" : { \"\$gt\" : 10 } }, { \"a\" : { \"\$lt\" : 20 } }] } }, { \"\$project\" : { \"a\" : \"\$a\", \"b\" : { \"c\" : { \"\$let\" : { \"vars\" : { \"array\" : { \"\$slice\" : [\"\$g.d\", { \"\$literal\" : 0 }, { \"\$subtract\" : [{ \"\$literal\" : 36 }, { \"\$literal\" : 0 }] }] } }, \"in\" : { \"\$map\" : { \"input\" : { \"\$filter\" : { \"input\" : { \"\$zip\" : { \"inputs\" : [{ \"\$range\" : [{ \"\$literal\" : 0 }, { \"\$size\" : \"\$\$array\" }] }, \"\$\$array\"] } }, \"as\" : \"x\", \"cond\" : { \"\$eq\" : [{ \"\$literal\" : 0 }, { \"\$mod\" : [{ \"\$arrayElemAt\" : [\"\$\$x\", { \"\$literal\" : 0 }] }, { \"\$literal\" : 12 }] }] } } }, \"as\" : \"x\", \"in\" : { \"\$arrayElemAt\" : [\"\$\$x\", { \"\$literal\" : 1 }] } } } } }, \"e\" : { \"\$map\" : { \"input\" : \"\$f\", \"as\" : \"x\", \"in\" : { \"\$add\" : [\"\$\$x\", { \"\$literal\" : 5 }] } } } } } }]")
            )
        }
    }
}
