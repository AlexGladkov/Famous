package tech.mobiledeveloper.features.create

import tech.mobiledeveloper.base.BaseViewModel
import tech.mobiledeveloper.features.create.models.CreatePostAction
import tech.mobiledeveloper.features.create.models.CreatePostEvent
import tech.mobiledeveloper.features.create.models.CreatePostViewState

class CreatePostViewModel : BaseViewModel<CreatePostViewState, CreatePostAction, CreatePostEvent>(initialState = CreatePostViewState()) {
    
    override fun obtainEvent(viewEvent: CreatePostEvent) {
        
    }

}