package tech.mobiledeveloper.features.create.models

sealed class CreatePostEvent {
    data object CreatePostClicked : CreatePostEvent()
    class ValueChanged(val value: String) : CreatePostEvent()
}