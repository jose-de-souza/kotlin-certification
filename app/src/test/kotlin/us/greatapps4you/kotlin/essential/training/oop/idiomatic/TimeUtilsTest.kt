package us.greatapps4you.kotlin.essential.training.oop.idiomatic

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class TimeUtilsTest {

    @Test
    fun givenHours_whenConvert_thenReturnMillis() {
        assertEquals(18000000, 5.millisForHours())
        assertEquals(18000000, 5L.millisForHours())

        // When an extension Function matches the same JVM signature as a regular Function
        //assertEquals(18000000, millisForHours(5)) //Platform declaration clash: The following declarations have the same JVM signature (millisForHours(I)J)
        //assertEquals(18000000, millisForHours(5L)) //Platform declaration clash: The following declarations have the same JVM signature (millisForHours(J)J)
    }

}