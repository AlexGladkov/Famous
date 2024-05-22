package tech.mobiledeveloper.features.login

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import tech.mobiledeveloper.features.login.models.LoginAction
import tech.mobiledeveloper.navigation.AppScreens
import tech.mobiledeveloper.navigation.LocalNavHost

@Composable
fun LoginScreen(
    loginViewModel: LoginViewModel = viewModel { LoginViewModel() }
) {
    val externalNavHost = LocalNavHost.current
    val viewState by loginViewModel.viewStates().collectAsState()
    val viewAction by loginViewModel.viewActions().collectAsState(null)
    
    LoginView(viewState = viewState) { event ->
        loginViewModel.obtainEvent(event)
    }
    
    when (viewAction) {
        LoginAction.OpenMainScreen -> {
            externalNavHost.navigate(AppScreens.Main.title)
            loginViewModel.clearAction()
        }
        null -> { }
    }
}

