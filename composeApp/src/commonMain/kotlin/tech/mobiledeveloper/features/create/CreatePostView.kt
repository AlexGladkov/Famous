package tech.mobiledeveloper.features.create

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview
import tech.mobiledeveloper.features.create.models.CreatePostEvent
import tech.mobiledeveloper.features.create.models.CreatePostViewState
import tech.mobiledeveloper.theme.AppTheme
import tech.mobiledeveloper.theme.FamousTheme

@Composable
fun CreatePostView(
    viewState: CreatePostViewState,
    eventHandler: (CreatePostEvent) -> Unit
) {

    Column {
        Text(
            text = "New Post",
            color = FamousTheme.colors.primaryText,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        TextField(value = "", onValueChange = {
            eventHandler(CreatePostEvent.ValueChanged(it))
        })

        Button(onClick = { eventHandler(CreatePostEvent.CreatePostClicked) }) {
            Text(text = "Create Post", color = FamousTheme.colors.primaryText)
        }
    }
}

@Composable
@Preview
fun CreatePostView_Preview() {
    AppTheme {
        CreatePostView(
            viewState = CreatePostViewState()
        ) {

        }
    }
}