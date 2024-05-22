package tech.mobiledeveloper.features.login

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import famous.composeapp.generated.resources.*
import famous.composeapp.generated.resources.Res
import famous.composeapp.generated.resources.login_intro
import famous.composeapp.generated.resources.login_title
import famous.composeapp.generated.resources.login_welcome_back
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import tech.mobiledeveloper.common.textfield.FTextField
import tech.mobiledeveloper.features.login.models.LoginEvent
import tech.mobiledeveloper.features.login.models.LoginViewState
import tech.mobiledeveloper.theme.AppTheme
import tech.mobiledeveloper.theme.FamousTheme

@Composable
internal fun LoginView(
    viewState: LoginViewState,
    eventHandler: (LoginEvent) -> Unit
) {
    Column {
        Box(
            modifier = Modifier
                .padding(top = 16.dp, bottom = 8.dp)
                .fillMaxWidth().height(48.dp)
        ) {
            Text(
                modifier = Modifier.align(Alignment.Center),
                text = stringResource(Res.string.login_title),
                color = FamousTheme.colors.primaryText,
                fontWeight = FontWeight.Bold, fontSize = 18.sp
            )
        }

        Box(
            modifier = Modifier
                .padding(top = 20.dp, bottom = 12.dp)
                .fillMaxWidth().height(28.dp)
        ) {
            Text(
                modifier = Modifier.align(Alignment.Center),
                text = stringResource(Res.string.login_welcome_back),
                color = FamousTheme.colors.primaryText,
                fontWeight = FontWeight.Bold, fontSize = 22.sp
            )
        }

        Box(
            modifier = Modifier
                .padding(top = 4.dp, bottom = 12.dp, start = 16.dp, end = 16.dp)
                .fillMaxWidth()
        ) {
            Text(
                modifier = Modifier.align(Alignment.Center),
                text = stringResource(Res.string.login_intro),
                color = FamousTheme.colors.primaryText,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Normal, fontSize = 16.sp
            )
        }

        FTextField(
            text = viewState.emailValue,
            hint = stringResource(Res.string.login_email),
            enabled = !viewState.isSending
        ) {
            eventHandler.invoke(LoginEvent.EmailChanged(it))
        }

        FTextField(
            text = viewState.passwordValue,
            hint = stringResource(Res.string.login_password),
            enabled = !viewState.isSending
        ) {
            eventHandler.invoke(LoginEvent.PasswordChanged(it))
        }

        Row(
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Box(modifier = Modifier.size(width = 156.dp, height = 40.dp)
                .clickable {
                    
                }
            ) {
                Text(
                    modifier = Modifier.align(Alignment.Center),
                    text = stringResource(Res.string.login_forgot),
                    color = FamousTheme.colors.primaryText
                )
            }

            Spacer(modifier = Modifier.weight(1f))

            Box(
                modifier = Modifier.size(width = 84.dp, height = 40.dp)
                    .clickable {
                        eventHandler.invoke(LoginEvent.LoginClicked)
                    }
            ) {
                Text(
                    modifier = Modifier.align(Alignment.Center),
                    text = stringResource(Res.string.login_login),
                    color = FamousTheme.colors.primaryText
                )
            }
        }

        Row {
            Text(
                modifier = Modifier.padding(top = 4.dp, bottom = 12.dp, start = 16.dp),
                text = stringResource(Res.string.login_register),
                color = FamousTheme.colors.tintColor,
                fontWeight = FontWeight.Light
            )

            Text(
                modifier = Modifier.padding(top = 4.dp, bottom = 12.dp, end = 16.dp)
                    .clickable {
                        eventHandler.invoke(LoginEvent.SignUpClicked)
                    },
                text = stringResource(Res.string.login_signup),
                color = FamousTheme.colors.tintColor,
                fontWeight = FontWeight.Light
            )
        }
    }
}

@Composable
@Preview
internal fun LoginView_Preview() {
    AppTheme {
        LoginView(
            viewState = LoginViewState(
                emailValue = "bob298@yandex.ru",
                passwordValue = "12345"
            ),
            eventHandler = { }
        )
    }
}