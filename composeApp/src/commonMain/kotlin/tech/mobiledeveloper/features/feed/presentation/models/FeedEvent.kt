package tech.mobiledeveloper.features.feed.models

sealed class FeedEvent {
    class PostClicked(val postId: String) : FeedEvent()
    class FiltedClicked(val filterId: String) : FeedEvent()
    data object UserClicked : FeedEvent()
    data object LoadMore : FeedEvent()
}