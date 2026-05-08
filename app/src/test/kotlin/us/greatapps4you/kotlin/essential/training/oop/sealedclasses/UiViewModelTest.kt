package us.greatapps4you.kotlin.essential.training.oop.sealedclasses

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class UiViewModelTest {

    @Test
    fun givenUiViewModel_whenChangeState_thenReturnView() {
        val viewModel = UiViewModel()
        assertTrue(viewModel.renderUi() is LoadingView)

        viewModel.changeState(UiState.Loaded("Title", "Subtitle"))
        assertTrue(viewModel.renderUi() is ContentView)

        viewModel.changeState(UiState.Error(IllegalStateException("Illegal view state")))
        assertTrue(viewModel.renderUi() is ErrorView)

        viewModel.changeState(UiState.Loading)
        assertTrue(viewModel.renderUi() is LoadingView)
    }
}