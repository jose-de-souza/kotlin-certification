package us.greatapps4you.kotlin.essential.training.oop.classes

import org.junit.jupiter.api.Assertions
import kotlin.test.Test

class StudentTest {

    @Test
    fun givenStudent_whenAssignToPersonReference_thenShouldHaveProperties() {
        val person: Person = Student(
            age = 45,
            firstName = "Jose",
            lastName = "Esteves"
        )

        Assertions.assertEquals(45, person.age)
        Assertions.assertEquals("Esteves, Jose", person.fullName())
    }

}