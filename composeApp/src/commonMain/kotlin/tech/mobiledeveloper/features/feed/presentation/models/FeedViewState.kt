package tech.mobiledeveloper.features.feed.models

import tech.mobiledeveloper.features.feed.presentation.views.FeedCellModel

data class FeedViewState(
    val feed: List<FeedCellModel> = kotlin.collections.emptyList(),
    val filters: List<String> = kotlin.collections.emptyList()
)