package tech.mobiledeveloper.features.feed.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tech.mobiledeveloper.features.feed.views.model.FeedCellModel
import tech.mobiledeveloper.theme.FamousTheme

@Composable
fun ItemFeedCell(feedCellModel: FeedCellModel) {

    Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {

        Box(
            modifier = Modifier.fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .aspectRatio(16f / 9f)
                .background(FamousTheme.colors.secondaryBackground)
        )

        Spacer(modifier = Modifier.size(8.dp))

        Text(
            text = feedCellModel.title,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = FamousTheme.colors.primaryText
        )

        Spacer(modifier = Modifier.size(8.dp))

        Text(
            text = feedCellModel.subTitle,
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            color = FamousTheme.colors.tintColor
        )

        Row {

            Text(
                text = feedCellModel.count,
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                color = FamousTheme.colors.tintColor
            )


        }
    }
}