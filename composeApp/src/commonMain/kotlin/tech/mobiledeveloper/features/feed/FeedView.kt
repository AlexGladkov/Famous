package tech.mobiledeveloper.features.feed

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FeedView() {
    Text(modifier = Modifier.fillMaxWidth().height(64.dp), textAlign = TextAlign.Center, text =  "Home", color = Color.White, fontSize = 36.sp)
}