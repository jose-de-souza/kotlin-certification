package us.greatapps4you.kotlin.essential.training.oop.idiomatic

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class LoggingTest {
    @Test
    fun givenType_whenLogging_thenReturnString() {
        assertNotNull(5.log())
        assertTrue(5.log().contains("5"))
        println(5.log())
        println(("5.isEven? ${5.isEven}" ).log())
        println(listOf(1,2,3).log())
        println("Hello World!".log())
    }

}