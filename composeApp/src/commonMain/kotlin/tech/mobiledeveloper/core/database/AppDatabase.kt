package tech.mobiledeveloper.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import tech.mobiledeveloper.features.drafts.data.DraftDao
import tech.mobiledeveloper.features.drafts.data.DraftEntity

@Database(entities = [DraftEntity::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun getDraftDao(): DraftDao
}

internal const val dbFileName = "appfamous.db"