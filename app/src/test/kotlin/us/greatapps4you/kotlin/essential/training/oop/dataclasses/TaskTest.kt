package us.greatapps4you.kotlin.essential.training.oop.dataclasses

import org.junit.jupiter.api.Assertions.*
import java.time.LocalDate
import java.time.Month
import kotlin.test.Test

class TaskTest {

    @Test
    fun bootstrapTest() {
        val task1 = Task(1, "Make Jose's Birthday Cake", LocalDate.of(2026, Month.AUGUST, 13))
        val task2 = Task(2,"Make Liz's Birthday Cake",  LocalDate.of(2026, Month.NOVEMBER, 14))

        assertNotEquals(task1, task2)

        // Destructuring declares and initializes local immutable variables
        val(desId, desName, desScheduleDate) = task1
        assertEquals(desId, task1.id)
        assertEquals(desName, task1.name)
        assertEquals(desScheduleDate, task1.scheduleDate)

        val task2Updated = task2.copy(name = "Make Liz's Birthday Cake gluten free")
        assertNotEquals(task2, task2Updated)
        assertEquals(task2.id, task2Updated.id)
        assertEquals(task2Updated.scheduleDate, task2Updated.scheduleDate)

    }

}