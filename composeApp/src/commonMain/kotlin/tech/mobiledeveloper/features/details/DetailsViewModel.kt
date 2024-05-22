package tech.mobiledeveloper.features.details

import tech.mobiledeveloper.base.BaseViewModel
import tech.mobiledeveloper.features.details.models.DetailsAction
import tech.mobiledeveloper.features.details.models.DetailsEvent
import tech.mobiledeveloper.features.details.models.DetailsViewState

class DetailsViewModel : BaseViewModel<DetailsViewState, DetailsAction, DetailsEvent>(initialState = DetailsViewState()) {
    override fun obtainEvent(viewEvent: DetailsEvent) {
        
    }
}