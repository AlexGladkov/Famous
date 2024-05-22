package tech.mobiledeveloper.features.login

import tech.mobiledeveloper.base.BaseViewModel
import tech.mobiledeveloper.features.login.models.LoginAction
import tech.mobiledeveloper.features.login.models.LoginEvent
import tech.mobiledeveloper.features.login.models.LoginViewState

class LoginViewModel: BaseViewModel<LoginViewState, LoginAction, LoginEvent>(initialState = LoginViewState()) {
    
    override fun obtainEvent(viewEvent: LoginEvent) {
        when (viewEvent) {
            is LoginEvent.EmailChanged -> viewState = viewState.copy(emailValue = viewEvent.newValue)
            is LoginEvent.PasswordChanged -> viewState = viewState.copy(passwordValue = viewEvent.newValue)
            LoginEvent.LoginClicked -> loginClicked()
            LoginEvent.SignUpClicked -> signUpClicked()
        }
    }
    
    private fun loginClicked() {
        viewAction = LoginAction.OpenMainScreen
    }
    
    private fun signUpClicked() {
        
    }
}