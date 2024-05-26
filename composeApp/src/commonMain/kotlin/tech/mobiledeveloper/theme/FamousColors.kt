package tech.mobiledeveloper.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

data class FamousColors(
    val primaryText: Color,
    val primaryBackground: Color,
    val secondaryText: Color,
    val secondaryBackground: Color,
    val tintColor: Color,
    val dividerColor: Color
)

object FamousTheme {
    val colors: FamousColors
        @Composable
        get() = LocalFamousColor.current
}

val LocalFamousColor = staticCompositionLocalOf<FamousColors> { error("No default implementation for colors") }