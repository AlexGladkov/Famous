package tech.mobiledeveloper.features.create

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
    Box(modifier = Modifier.fillMaxWidth().height(72.dp)) {
        Text("Title", color = FamousTheme.colors.primaryText,
            fontSize = 16.sp)    
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