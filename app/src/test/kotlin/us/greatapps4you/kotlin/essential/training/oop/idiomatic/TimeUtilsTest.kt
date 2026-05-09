package us.greatapps4you.kotlin.essential.training.oop.idiomatic

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class TimeUtilsTest {

    @Test
    fun givenHours_whenConvert_thenReturnMillis() {
        assertEquals(18000000, millisForHours(5))
    }

}