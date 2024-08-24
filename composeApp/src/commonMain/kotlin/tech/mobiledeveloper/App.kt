package tech.mobiledeveloper

import androidx.compose.runtime.*
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import tech.mobiledeveloper.features.create.CreatePostScreen
import tech.mobiledeveloper.features.login.LoginScreen
import tech.mobiledeveloper.features.paywall.PaywallScreen
import tech.mobiledeveloper.features.splash.SplashScreen
import tech.mobiledeveloper.navigation.AppScreens
import tech.mobiledeveloper.navigation.LocalNavHost
import tech.mobiledeveloper.navigation.main.MainScreen
import tech.mobiledeveloper.theme.AppTheme

@Composable
internal fun App() = AppTheme {
    FamousApp()
}

@Composable
internal fun FamousApp(
    navController: NavHostController = rememberNavController()
) {
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen = backStackEntry?.destination?.route ?: AppScreens.Login.title

    CompositionLocalProvider(
        LocalNavHost provides navController
    ) {
        NavHost(
            navController = navController,
            startDestination = AppScreens.Splash.title
        ) {
            composable(route = AppScreens.Splash.title) {
                SplashScreen(navController = navController)
            }

            composable(route = AppScreens.Login.title) {
                LoginScreen()
            }

            composable(route = AppScreens.Main.title) {
                MainScreen()
            }

            composable(route = AppScreens.CreatePost.title) {
                CreatePostScreen()

            }

            composable(route = AppScreens.Paywall.title) {
                PaywallScreen()
            }
        }
    }
}

internal expect fun openUrl(url: String?)