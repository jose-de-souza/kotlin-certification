package us.greatapps4you.kotlin.essential.training.oop.async

import org.junit.jupiter.api.Assertions
import us.greatapps4you.us.greatapps4you.kotlin.essential.training.oop.async.Student
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