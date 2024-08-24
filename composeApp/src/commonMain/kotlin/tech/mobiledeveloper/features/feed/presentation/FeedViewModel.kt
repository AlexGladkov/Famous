package tech.mobiledeveloper.features.feed.presentation

import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import tech.mobiledeveloper.base.BaseViewModel
import tech.mobiledeveloper.features.feed.domain.GetFeedUseCase
import tech.mobiledeveloper.features.feed.models.FeedAction
import tech.mobiledeveloper.features.feed.models.FeedEvent
import tech.mobiledeveloper.features.feed.models.FeedViewState
import tech.mobiledeveloper.features.feed.presentation.views.FeedCellModel

class FeedViewModel(): BaseViewModel<FeedViewState, FeedAction, FeedEvent>(initialState = FeedViewState()) {
    
    private val getFeedUseCase = GetFeedUseCase()
    
    init {
        loadScreen()
    }
    
    override fun obtainEvent(viewEvent: FeedEvent) {
        when (viewEvent) {
            is FeedEvent.FiltedClicked -> filterContent(viewEvent.filterId)
            is FeedEvent.PostClicked -> obtainPostClick(viewEvent.postId)
            FeedEvent.UserClicked -> showUserProfile()
            FeedEvent.LoadMore -> loadMoreFeed()
        }
    }

    private fun loadScreen() {
        viewModelScope.launch(Dispatchers.IO) {
            val feed = getFeedUseCase.execute()
                .map {
                    FeedCellModel(
                        postId = it.postId,
                        imageUrl = "",
                        title = it.title,
                        category = it.topics.joinToString(separator = ","),
                        socialInfo = "${it.likesCount} likes / ${it.repostCount} reposts",
                        hasBlur = it.postId == "1"
                    )
                }
            
            withContext(Dispatchers.Main) {
                viewState = viewState.copy(
                    feed = feed
                )
            }
        }
    }
    
    private fun filterContent(filterId: String) {

    }

    private fun obtainPostClick(postId: String) {

    }

    private fun showUserProfile() {

    }

    private fun loadMoreFeed() {
        
    }
}