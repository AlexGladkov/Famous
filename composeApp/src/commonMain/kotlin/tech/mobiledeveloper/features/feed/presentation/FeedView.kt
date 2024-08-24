package tech.mobiledeveloper.features.feed.presentation

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import tech.mobiledeveloper.features.feed.models.FeedEvent
import tech.mobiledeveloper.features.feed.models.FeedViewState
import tech.mobiledeveloper.features.feed.presentation.views.FeedCell

@Composable
fun FeedView(viewState: FeedViewState, eventHandler: (FeedEvent) -> Unit) {
    LazyColumn {
        items(viewState.feed) { model ->
            FeedCell(model)
        }
    }
}