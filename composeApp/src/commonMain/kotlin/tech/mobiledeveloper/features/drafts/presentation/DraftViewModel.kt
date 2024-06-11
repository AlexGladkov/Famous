package tech.mobiledeveloper.features.drafts.presentation

import tech.mobiledeveloper.core.di.InjectProvider
import tech.mobiledeveloper.features.drafts.domain.SaveDraftUseCase

class DraftViewModel(
    
) {
    private val saveDraftUseCase = SaveDraftUseCase(draftDao = InjectProvider.getDatabase().getDraftDao())
}