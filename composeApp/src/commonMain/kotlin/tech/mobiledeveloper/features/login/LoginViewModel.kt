package tech.mobiledeveloper.features.login

import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import tech.mobiledeveloper.base.BaseViewModel
import tech.mobiledeveloper.core.di.InjectProvider
import tech.mobiledeveloper.features.login.models.LoginAction
import tech.mobiledeveloper.features.login.models.LoginEvent
import tech.mobiledeveloper.features.login.models.LoginViewState

class LoginViewModel: BaseViewModel<LoginViewState, LoginAction, LoginEvent>(initialState = LoginViewState()) {

    private val vkHelper = InjectProvider.getVKAccess()

    override fun obtainEvent(viewEvent: LoginEvent) {
        when (viewEvent) {
            is LoginEvent.EmailChanged -> viewState = viewState.copy(emailValue = viewEvent.newValue)
            is LoginEvent.PasswordChanged -> viewState = viewState.copy(passwordValue = viewEvent.newValue)
            LoginEvent.LoginClicked -> loginClicked()
            LoginEvent.SignUpClicked -> signUpClicked()
        }
    }
    
    private fun loginClicked() {
        viewModelScope.launch {
            vkHelper.authorize()
        }
    }
    
    private fun signUpClicked() {
        
    }
}