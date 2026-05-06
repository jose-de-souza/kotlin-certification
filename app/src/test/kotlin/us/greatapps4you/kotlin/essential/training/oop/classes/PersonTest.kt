package us.greatapps4you.kotlin.essential.training.oop.classes

import org.junit.jupiter.api.Assertions
import kotlin.test.Test

class PersonTest {

    @Test
    fun given_FirstAndLastName_whenRun_thenReturnFullName() {

           val person = Person(
               45,
               firstName = "Jose",
               lastName = "Esteves"
           )

        Assertions.assertEquals("Jose Esteves", person.fullName())
    }

    @Test
    fun given_AgeZero_whenRun_thenThrowIllegalStateException() {
        Assertions.assertThrows(IllegalStateException::class.java) {
            Person(
                0,
                firstName = "Jose",
                lastName = "Esteves"
            )
        }
    }

    @Test
    fun given_AgeNegative_whenRun_thenThrowIllegalStateException() {
        Assertions.assertThrows(IllegalStateException::class.java) {
            Person(
                -1,
                firstName = "Jose",
                lastName = "Esteves"
            )
        }
    }

}