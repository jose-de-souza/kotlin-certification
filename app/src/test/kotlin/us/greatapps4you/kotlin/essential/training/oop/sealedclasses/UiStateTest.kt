package us.greatapps4you.kotlin.essential.training.oop.sealedclasses

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class UiStateTest {

    @Test
    fun testBootstrap() {
        var state: UiState = UiState.Loading
        assertEquals(UiState.Loading, state)

        state = UiState.Loaded("Kotlin Essentials", "Sealed Classes")
        assertEquals("Kotlin Essentials", state.title)
        assertEquals("Sealed Classes", state.subTitle)

        state = UiState.Error(IllegalStateException("Illegal state"))
        assertTrue(state.error is IllegalStateException)
    }

}