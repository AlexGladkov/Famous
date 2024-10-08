package tech.mobiledeveloper

import android.app.Application
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.vk.id.VKID
import tech.mobiledeveloper.core.database.getDatabaseBuilder
import tech.mobiledeveloper.core.database.getRoomDatabase
import tech.mobiledeveloper.core.di.InjectProvider
import tech.mobiledeveloper.core.vk.AndroidVK

class AndroidApp : Application() {
    companion object {
        lateinit var INSTANCE: AndroidApp
    }

    override fun onCreate() {
        super.onCreate()
        VKID.init(this)
        INSTANCE = this
    }
}

class AppActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val appDatabase = getRoomDatabase(
            getDatabaseBuilder(applicationContext)
        )

        val androidVK = AndroidVK(this@AppActivity)

        InjectProvider.addDependency("database", appDatabase)
        InjectProvider.addDependency(InjectProvider.VK_HELPER, androidVK)

        setContent { App() }
    }
}

internal actual fun openUrl(url: String?) {
    val uri = url?.let { Uri.parse(it) } ?: return
    val intent = Intent().apply {
        action = Intent.ACTION_VIEW
        data = uri
        addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
    }
    AndroidApp.INSTANCE.startActivity(intent)
}