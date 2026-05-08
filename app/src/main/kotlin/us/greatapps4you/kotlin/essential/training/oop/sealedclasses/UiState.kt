package us.greatapps4you.kotlin.essential.training.oop.sealedclasses

sealed class UiState {
    object Loading : UiState()
    data class Loaded(
        val title: String,
        val subTitle: String) : UiState()
    class Error(val error: Throwable) : UiState()

}