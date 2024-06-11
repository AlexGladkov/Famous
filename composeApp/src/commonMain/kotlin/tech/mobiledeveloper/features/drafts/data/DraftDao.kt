package tech.mobiledeveloper.features.drafts.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.Companion.REPLACE
import androidx.room.Query

@Dao
interface DraftDao {
    
    @Query("SELECT * FROM DraftEntity")
    suspend fun getAll(): List<DraftEntity>
    
    @Insert(onConflict = REPLACE)
    suspend fun insert(item: DraftEntity)
}