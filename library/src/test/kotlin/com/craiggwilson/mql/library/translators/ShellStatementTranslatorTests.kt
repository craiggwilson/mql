package com.craiggwilson.mql.library.translators

import com.craiggwilson.mql.library.parser.parseMQL
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class ShellStatementTranslatorTests {

    @ParameterizedTest(name = "{0}")
    @MethodSource("statements")
    fun testFull(mql: String, expected: String) {
        val actual = parseMQL(mql)[0].toShell(false)

        assertEquals(expected, actual)
    }

    companion object {
        private fun test(mql: String, expected: String): Array<String> {
            return arrayOf(mql, expected)
        }

        @JvmStatic
        private fun statements(): Collection<Array<String>> {
            return listOf(
                // DELETE
                test("delete from bar match a = 1", "db.bar.deleteOne({ \"a\" : { \"\$eq\" : 1 } })"),
                test("delete one from bar match a = 1", "db.bar.deleteOne({ \"a\" : { \"\$eq\" : 1 } })"),
                test("delete many from bar match a = 1", "db.bar.deleteMany({ \"a\" : { \"\$eq\" : 1 } })"),

                // INSERT
                test("insert into bar {a:1}", "db.bar.insert([{ \"a\" : 1 }] )"),
                test("insert into bar [{a:1}]", "db.bar.insert([{ \"a\" : 1 }] )"),
                test("insert into bar [{a: 1},{a: 2}]", "db.bar.insert([{ \"a\" : 1 }, { \"a\" : 2 }] )"),

                // QUERY
                test("from bar project {a}", "db.bar.aggregate([{ \"\$project\" : { \"a\" : \"\$a\" } }] )"),

                // UPDATE
                test("update from bar match a = 1 set {a: a + 1}", "db.bar.updateOne({ \"a\" : { \"\$eq\" : 1 } }, { \"\$inc\" : { \"a\" : 1 } })"),
                test("update from bar match a = 1 set {a: a + 1, b: b + 4}", "db.bar.updateOne({ \"a\" : { \"\$eq\" : 1 } }, { \"\$inc\" : { \"a\" : 1, \"b\" : 4 } })"),
                test("update from bar match a = 1 set {a: a + 1, b: b - 4}", "db.bar.updateOne({ \"a\" : { \"\$eq\" : 1 } }, { \"\$inc\" : { \"a\" : 1, \"b\" : -4 } })"),
                test("update one from bar match a = 1 set {a: 1, b: 4}", "db.bar.updateOne({ \"a\" : { \"\$eq\" : 1 } }, { \"\$set\" : { \"a\" : 1, \"b\" : 4 } })"),
                test("update many from bar match a = 1 set {a: a + 1, b: 4}", "db.bar.updateMany({ \"a\" : { \"\$eq\" : 1 } }, { \"\$inc\" : { \"a\" : 1 }, \"\$set\" : { \"b\" : 4 } })")
            )
        }
    }
}
