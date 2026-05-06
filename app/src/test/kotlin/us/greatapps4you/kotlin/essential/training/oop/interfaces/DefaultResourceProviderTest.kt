package us.greatapps4you.kotlin.essential.training.oop.interfaces

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class DefaultResourceProviderTest {

    @Test
    fun givenResourceProvider_whenGetPlaceHolder_thenReturnString() {
        val provider: StringProvider = DefaultResourceProvider()
        assertEquals("<placeholder>", provider.placeHolder)
    }

    @Test
    fun givenResourceProvider_whenInstantiated_thenShouldBeOfTypeStringProvider() {
        val provider: StringProvider = DefaultResourceProvider()
        assertTrue(provider is StringProvider )
    }

    @Test
    fun givenStringProvider_whenGet_thenReturnsString() {
        val provider: StringProvider = DefaultResourceProvider()
        assertEquals("id: 5", provider.get(5))
    }
}