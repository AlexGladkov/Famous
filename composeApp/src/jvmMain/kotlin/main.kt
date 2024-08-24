import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyShortcut
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.MenuBar
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import java.awt.Dimension
import tech.mobiledeveloper.App
import tech.mobiledeveloper.core.database.getDatabaseBuilder
import tech.mobiledeveloper.core.database.getRoomDatabase
import tech.mobiledeveloper.core.di.InjectProvider

fun main() = application {
    Window(
        title = "Famous",
        state = rememberWindowState(width = 800.dp, height = 600.dp),
        onCloseRequest = ::exitApplication,
    ) {
        window.minimumSize = Dimension(350, 600)

        val appDatabase = getRoomDatabase(
            getDatabaseBuilder()
        )

        InjectProvider.addDependency("database", appDatabase)

        App()
    }
}