package tech.mobiledeveloper.features.favorite.data

import tech.mobiledeveloper.core.database.AppDatabase
import tech.mobiledeveloper.core.di.InjectProvider

interface FavoriteLocalDataSource {
    suspend fun getFavoritePosts(): List<String>
}

class FavoriteRoomDataSource(
    private val database: AppDatabase = InjectProvider.getDatabase()
): FavoriteLocalDataSource {
    
    override suspend fun getFavoritePosts(): List<String> {
        return emptyList()    
    }

}
