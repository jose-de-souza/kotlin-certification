package us.greatapps4you.kotlin.essential.training.oop.companionobjects

import org.junit.jupiter.api.Assertions.assertTrue
import kotlin.test.Test
import kotlin.test.assertEquals

class SearchControllerTest {

    @Test
    fun bootstrapTeste() {
        val controller = SearchController.create("Kotlin Essentials")
        assertTrue (controller is SearchController)
        assertEquals(20, SearchController.MAX_RESULTS)
    }


}