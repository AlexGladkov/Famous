package tech.mobiledeveloper.features.feed.data

import tech.mobiledeveloper.features.feed.data.models.KtorFeedModel

interface FeedRemoteDataSource {
    suspend fun fetchNextChunk(token: String, postId: String, filters: List<String>): List<KtorFeedModel>
}