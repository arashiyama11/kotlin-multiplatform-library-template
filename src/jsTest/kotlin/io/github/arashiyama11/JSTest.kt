package io.github.arashiyama11

import kotlin.test.Test
import kotlin.test.assertEquals

class JSTest {
  @Test
  fun testPlat(){
    assertEquals("js",Temp().platform())
  }
}