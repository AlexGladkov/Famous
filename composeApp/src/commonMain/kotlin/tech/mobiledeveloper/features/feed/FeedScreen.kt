package tech.mobiledeveloper.features.feed

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun FeedScreen(viewModel: FeedViewModel = viewModel {  FeedViewModel() }) {

    val viewState by viewModel.viewStates().collectAsState()

    FeedView(viewState) { event ->
        viewModel.obtainEvent(event)
    }
}

