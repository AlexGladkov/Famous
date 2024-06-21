package tech.mobiledeveloper.features.feed.models

sealed class FeedEvent {

    class ClickItemFilter(val type: String) : FeedEvent()
}