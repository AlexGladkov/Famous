package tech.mobiledeveloper.features.feed

import androidx.compose.runtime.Composable
import tech.mobiledeveloper.base.BaseViewModel
import tech.mobiledeveloper.features.feed.models.FeedAction
import tech.mobiledeveloper.features.feed.models.FeedEvent
import tech.mobiledeveloper.features.feed.models.FeedViewState
import tech.mobiledeveloper.features.feed.views.model.FilterCellModel

class FeedViewModel :
    BaseViewModel<FeedViewState, FeedAction, FeedEvent>(initialState = FeedViewState()) {

    init {
        loadScreen()
    }

    private fun loadScreen() {

        viewState = viewState.copy(
            filters = listOf(
                FilterCellModel("one", "one" == viewState.currentChipSelected),
                FilterCellModel("two", "two" == viewState.currentChipSelected),
                FilterCellModel("three", "three" == viewState.currentChipSelected),
            )
        )
    }

    override fun obtainEvent(viewEvent: FeedEvent) {

        when (viewEvent) {

            is FeedEvent.ClickItemFilter -> handleClickItemFilter(viewEvent.type)
        }
    }

    private fun handleClickItemFilter(type: String) {

        viewState = viewState.copy(currentChipSelected = type)

        loadScreen()
    }
}