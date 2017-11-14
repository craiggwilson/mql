package com.craiggwilson.mql

import com.craiggwilson.mql.parser.MQLTreeParser
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals
import org.junit.Test

@RunWith(Parameterized::class)
class ShellTranslatorTest(private val mql: String, private val expected: String) {

  @Test fun visit() {
    val parsed = MQLTreeParser().parse(mql)[0]
    val actual = ShellTranslator().visit(parsed)

    assertEquals(expected, actual)
  }

  companion object {

    @JvmStatic
    @Parameterized.Parameters(name = "{0}")
    fun data(): Collection<Array<String>> {
      return listOf(
        arrayOf(
          "FROM bar SKIP 10",
          "[{ \$skip: 10 }]"
        ),
        arrayOf(
          "FROM bar LIMIT 10",
          "[{ \$limit: 10 }]"
        )
      )
    }
  }
}