package com.craiggwilson.mql

import com.craiggwilson.mql.parser.parseMQL
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class ShellTranslatorTest() {

    @ParameterizedTest(name = "{0}")
    @MethodSource("data")
    fun visit(mql: String, expected: String) {
        val parsed = parseMQL(mql)[0]
        val actual = parsed.toShell()

        assertEquals(expected, actual)
    }

    companion object {

        private fun test(mql: String, expected: String): Array<String> {
            return arrayOf(mql, expected)
        }

        @JvmStatic
        fun data(): Collection<Array<String>> {
            return listOf(
                // LIMIT
                test(
                    "FROM bar LIMIT 10",
                    "db.bar.aggregate([{ \$limit: 10 }])"
                ),

                // SKIP
                test(
                    "FROM bar SKIP 10",
                    "db.bar.aggregate([{ \$skip: 10 }])"
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