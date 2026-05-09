package us.greatapps4you.kotlin.essential.training.oop.idiomatic

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class MathUtilsTest {

    @Test
    fun givenInte_whenGet_thenReturnBoolean() {
        assertTrue(8.isEven)
        assertTrue(0.isEven)
        assertFalse(1.isEven)
    }

}