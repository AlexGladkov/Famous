package tech.mobiledeveloper.features.splash

import tech.mobiledeveloper.base.BaseViewModel
import tech.mobiledeveloper.core.di.InjectProvider
import tech.mobiledeveloper.features.login.domain.IsUserAuthorizedUseCase
import tech.mobiledeveloper.features.splash.models.SplashAction

class SplashViewModel(
    private val isUserAuthorizedUseCase: IsUserAuthorizedUseCase = IsUserAuthorizedUseCase()
): BaseViewModel<Unit, SplashAction, Unit>(
    initialState = Unit
) {
    
    init {
        InjectProvider.getDatabase()
        checkUserAuthorized()
    }
    
    override fun obtainEvent(viewEvent: Unit) {
        
    }
    
    private fun checkUserAuthorized() {
        viewAction = if (isUserAuthorizedUseCase.execute()) {
            SplashAction.ShowMainScreen
        } else {
            SplashAction.ShowLoginScreen
        }
    }
}