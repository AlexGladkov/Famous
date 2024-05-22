package tech.mobiledeveloper.features.login.models
 
sealed class LoginAction {
    data object OpenMainScreen : LoginAction()
}