package tech.mobiledeveloper.features.feed.domain

import tech.mobiledeveloper.features.favorite.data.FavoriteLocalDataSource
import tech.mobiledeveloper.features.favorite.data.FavoriteRoomDataSource
import tech.mobiledeveloper.features.feed.data.FeedKtorDataSource
import tech.mobiledeveloper.features.feed.data.FeedRemoteDataSource
import tech.mobiledeveloper.features.feed.domain.models.Feed
import tech.mobiledeveloper.features.feed.domain.models.mapToFeed
import tech.mobiledeveloper.features.login.data.AuthEncryptedDataSource
import tech.mobiledeveloper.features.login.data.AuthLocalDataSource

class GetFeedUseCase(
    private val authLocalDataSource: AuthLocalDataSource = AuthEncryptedDataSource(),
    private val favoriteLocalDataSource: FavoriteLocalDataSource = FavoriteRoomDataSource(),
    private val feedRemoteDataSource: FeedRemoteDataSource = FeedKtorDataSource()
) {
    
    suspend fun execute(): List<Feed> {
        val token = authLocalDataSource.checkToken()
        val favorites = favoriteLocalDataSource.getFavoritePosts()
        val feed = feedRemoteDataSource.fetchNextChunk(token = token, postId = "", filters = emptyList())
            .map { it.mapToFeed(isFavorite = favorites.contains(it.postId)) }
        return feed
    }
}
