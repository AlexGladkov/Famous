package tech.mobiledeveloper.features.splash

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import tech.mobiledeveloper.features.splash.models.SplashAction
import tech.mobiledeveloper.navigation.AppScreens

@Composable
fun SplashScreen(
    viewModel: SplashViewModel = viewModel { SplashViewModel() },
    navController: NavController
) {
    val viewAction by viewModel.viewActions().collectAsState(null)
    
    when (viewAction) {
        SplashAction.ShowLoginScreen -> navController.navigate(AppScreens.Login.title)
        SplashAction.ShowMainScreen -> navController.navigate(AppScreens.Main.title)
        null -> { }
    }
}