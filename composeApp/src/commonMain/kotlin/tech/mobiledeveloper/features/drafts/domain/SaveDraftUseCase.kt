package tech.mobiledeveloper.features.drafts.domain

import kotlinx.uuid.UUID
import tech.mobiledeveloper.core.database.AppDatabase
import tech.mobiledeveloper.core.di.InjectProvider
import tech.mobiledeveloper.features.drafts.data.DraftDao
import tech.mobiledeveloper.features.drafts.data.DraftEntity

class SaveDraftUseCase(
    private val draftDao: DraftDao
) {
    
    suspend fun execute(title: String, text: String) {
        draftDao.insert(
            DraftEntity(
                draftId = UUID().toString(false),
                title = title,
                text = text
            )
        )
    }
}