package us.greatapps4you.kotlin.essential.training.oop.enumclasses

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrowsExactly
import kotlin.test.Test

class DirectionTest {

    @Test
    fun bootstrapTest() {
        val entries = Direction.entries

        val north: Direction = Direction.NORTH
        assertEquals(Direction.NORTH, north)
        assertEquals("NORTH", north.name)
        assertEquals(0, north.ordinal)
        assertEquals(Direction.NORTH, Direction.valueOf("NORTH"))
        assertEquals(north, entries[0])
        assertThrowsExactly(IllegalArgumentException::class.java) {
            Direction.valueOf("UP")
        }

        val south: Direction = Direction.SOUTH
        assertEquals(Direction.SOUTH, south)
        assertEquals("SOUTH", south.name)
        assertEquals(1, south.ordinal)
        assertEquals(Direction.SOUTH, Direction.valueOf("SOUTH"))
        assertEquals(south, entries[1])
        assertThrowsExactly(IllegalArgumentException::class.java) {
            Direction.valueOf("DOWN")
        }

        val east: Direction = Direction.EAST
        assertEquals(Direction.EAST, east)
        assertEquals("EAST", east.name)
        assertEquals(2, east.ordinal)
        assertEquals(Direction.EAST, Direction.valueOf("EAST"))
        assertEquals(east, entries[2])
        assertThrowsExactly(IllegalArgumentException::class.java) {
            Direction.valueOf("RIGHT")
        }

        val west: Direction = Direction.WEST
        assertEquals(Direction.WEST, west)
        assertEquals("WEST", west.name)
        assertEquals(3, west.ordinal)
        assertEquals(Direction.WEST, Direction.valueOf("WEST"))
        assertEquals(west, entries[3])
        assertThrowsExactly(IllegalArgumentException::class.java) {
            Direction.valueOf("LEFT")
        }

    }

}