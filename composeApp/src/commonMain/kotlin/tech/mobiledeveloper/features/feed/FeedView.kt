package tech.mobiledeveloper.features.feed

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import tech.mobiledeveloper.features.feed.models.FeedEvent
import tech.mobiledeveloper.features.feed.models.FeedViewState
import tech.mobiledeveloper.features.feed.views.ItemFeedCell
import tech.mobiledeveloper.features.feed.views.ItemFilterCell

@Composable
fun FeedView(viewState: FeedViewState, onEvent: (FeedEvent) -> Unit) {

    Column {

        Box(modifier = Modifier.fillMaxWidth().height(72.dp)) {

            Box(modifier = Modifier.size(32.dp).clip(RoundedCornerShape(16.dp))) {}

            Text(modifier = Modifier.align(Alignment.Center), text = viewState.title)
        }

        LazyRow(modifier = Modifier.height(56.dp).padding(6.dp)) {

            items(viewState.filters) {

                ItemFilterCell(it) {

                    onEvent(FeedEvent.ClickItemFilter(it.text))
                }

            }
        }

        LazyColumn() {

            items(viewState.feedCellModel) {

                ItemFeedCell(it)
            }
        }

    }
}

