import androidx.compose.ui.window.ComposeUIViewController
import tech.mobiledeveloper.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
