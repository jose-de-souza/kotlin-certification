package us.greatapps4you.kotlin.essential.training.oop.async

import org.junit.jupiter.api.Assertions
import kotlin.test.Test

class PersonTest {

    @Test
    fun given_AgeZero_whenRun_thenThrowIllegalStateException() {
        Assertions.assertThrows(IllegalStateException::class.java) {
            val person = Person(0)
        }
    }

    @Test
    fun given_AgeNegative_whenRun_thenThrowIllegalStateException() {
        Assertions.assertThrows(IllegalStateException::class.java) {
            val person = Person(-1)
        }
    }

}