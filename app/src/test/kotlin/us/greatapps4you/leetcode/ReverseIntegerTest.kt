package us.greatapps4you.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import us.greatapps4you.us.greatapps4you.leetcode.ReverseInteger

class ReverseIntegerTest {

    @Test
    fun givenInput_whenReverse_thenShouldBeGreaterThanMinIntConstraint() {
        //TODO: find a way to test this
        Assertions.assertEquals(Int.MIN_VALUE, Math.pow(-2.0, 31.0).toInt())
    }

    @Test
    fun givenBigInput_whenReverse_thenShouldReturnZero() {
        // 9646324351
        Assertions.assertEquals(Int.MAX_VALUE, Math.pow(2.0, 31.0).toInt())
        //TODO: find a way to test this since it does not compile
        //Assertions.assertEquals(1534236469, ReverseInteger().reverse(9646324351))
    }

    @Test
    fun givenPositiveInput_whenReverse_thenReturnOutput() {
        Assertions.assertEquals(321, ReverseInteger().reverse(123))
    }

    @Test
    fun givenNegativeInput_whenReverse_thenReturnOutput() {
        Assertions.assertEquals(-321, ReverseInteger().reverse(-123))
    }

    @Test
    fun givenMultipleOf10Input_whenReverse_thenReturnOutput() {
        Assertions.assertEquals(21, ReverseInteger().reverse(120))
    }

}