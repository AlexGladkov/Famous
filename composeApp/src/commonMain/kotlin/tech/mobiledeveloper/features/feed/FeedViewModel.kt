package tech.mobiledeveloper.features.feed

import androidx.compose.runtime.Composable
import tech.mobiledeveloper.base.BaseViewModel
import tech.mobiledeveloper.features.feed.models.FeedAction
import tech.mobiledeveloper.features.feed.models.FeedEvent
import tech.mobiledeveloper.features.feed.models.FeedViewState

class FeedViewModel(): BaseViewModel<FeedViewState, FeedAction, FeedEvent>(initialState = FeedViewState()) {
    
    override fun obtainEvent(viewEvent: FeedEvent) {
        
    }
}