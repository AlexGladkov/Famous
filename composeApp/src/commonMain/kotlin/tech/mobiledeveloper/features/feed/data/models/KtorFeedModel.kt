package tech.mobiledeveloper.features.feed.data.models

class KtorFeedModel(
    val postId: String,
    val title: String,
    val likesCount: Int,
    val repostCount: Int,
    val topics: List<String>
)