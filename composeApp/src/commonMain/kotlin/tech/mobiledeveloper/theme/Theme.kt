package tech.mobiledeveloper.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

internal val LocalThemeIsDark = compositionLocalOf { mutableStateOf(true) }

@Composable
internal fun AppTheme(
    content: @Composable() () -> Unit
) {
    val systemIsDark = isSystemInDarkTheme()
    val isDarkState = remember { mutableStateOf(systemIsDark) }

    CompositionLocalProvider(
        LocalThemeIsDark provides isDarkState,
        LocalFamousColor provides darkPalette,
        content = {
            Box(
                modifier = Modifier.fillMaxSize().background(FamousTheme.colors.primaryBackground),
            ) {
                content.invoke()
            }
        }
    )
}

@Composable
internal expect fun SystemAppearance(isDark: Boolean)
