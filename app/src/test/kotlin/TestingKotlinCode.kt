import kotlin.test.Test
import kotlin.test.assertEquals

// Standard JUnit 4/5 setup. You write logic, then assert expected outcomes.
class MyTests {

    // The function we are testing
    fun add(a: Int, b: Int) = a + b

    @Test
    fun testAddition() {
        val result = add(2, 2)
        // Assertions check if reality matches expectations
        assertEquals(4, result, "2 + 2 should equal 4")
    }

    // Mocking usually requires a library like MockK or Mockito
    // e.g., val networkMock = mockk<NetworkService>()
    // every { networkMock.fetchData() } returns "Fake Data"
}