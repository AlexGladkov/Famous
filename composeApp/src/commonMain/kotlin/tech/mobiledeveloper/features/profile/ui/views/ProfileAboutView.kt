package tech.mobiledeveloper.features.profile.ui.views

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import tech.mobiledeveloper.theme.FamousTheme

@Composable
fun ProfileAboutView() {
    Text(text = "Hello, About", color = FamousTheme.colors.primaryText)
}