package tech.mobiledeveloper.features.feed.data

import tech.mobiledeveloper.core.network.DemoHttpClient
import tech.mobiledeveloper.features.feed.data.models.KtorFeedModel

class FeedKtorDataSource(
    private val httpClient: DemoHttpClient = DemoHttpClient()
): FeedRemoteDataSource {
    
    override suspend fun fetchNextChunk(token: String, postId: String, filters: List<String>): List<KtorFeedModel> {
        return emptyList()
    }

}