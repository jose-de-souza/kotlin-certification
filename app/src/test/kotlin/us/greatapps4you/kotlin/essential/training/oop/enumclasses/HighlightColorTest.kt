package us.greatapps4you.kotlin.essential.training.oop.enumclasses

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class HighlightColorTest {

    @Test
    fun bootstrapTest() {
        assertEquals(0xebba34, HighlightColor.YELLOW.value)
        assertEquals(0x3495eb, HighlightColor.BLUE.value)
        assertEquals(0x8934eb, HighlightColor.PURPLE.value)
    }

}