package tech.mobiledeveloper.features.feed.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun FeedScreen(
    feedViewModel: FeedViewModel = viewModel { FeedViewModel() }
) {
    val viewState by feedViewModel.viewStates().collectAsState()
    
    FeedView(viewState) {
        feedViewModel.obtainEvent(it)
    }
}

