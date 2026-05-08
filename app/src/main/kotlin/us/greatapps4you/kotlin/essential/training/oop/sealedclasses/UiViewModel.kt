package us.greatapps4you.kotlin.essential.training.oop.sealedclasses

class UiViewModel {
    private var uiState: UiState = UiState.Loading

    fun changeState(uiState: UiState) {
        this.uiState = uiState
    }

    fun renderUi(): View = when (uiState) {
        is UiState.Error -> ErrorView().render()
        is UiState.Loaded -> ContentView().render()
        UiState.Loading -> LoadingView().render()
    }

}

interface View {
    fun render(): View
}

class LoadingView: View {
    override fun render(): View {
        return LoadingView()
    }
}

class ContentView: View {
    override fun render(): View {
        return ContentView()
    }
}

class ErrorView: View {
    override fun render(): View {
        return ErrorView()
    }
}

