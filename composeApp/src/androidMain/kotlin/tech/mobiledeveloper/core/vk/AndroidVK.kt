package tech.mobiledeveloper.core.vk

import android.util.Log
import androidx.lifecycle.LifecycleOwner
import com.vk.id.AccessToken
import com.vk.id.VKID
import com.vk.id.VKIDAuthFail
import com.vk.id.auth.VKIDAuthCallback

class AndroidVK(private val lifecycleOwner: LifecycleOwner): VKHelper {

    private val vkAuthCallback = object : VKIDAuthCallback {
        override fun onAuth(accessToken: AccessToken) {
            val token = accessToken.token
            Log.e("TAG", "SUCCESS: TOKEN = $token")
        }

        override fun onFail(fail: VKIDAuthFail) {
            when (fail) {
                is VKIDAuthFail.Canceled -> {
                    Log.e("TAG", "CANCELED")
                }
                else -> {
                    Log.e("TAG", "FAIL: REASON = ${fail.description}")
                }
            }
        }
    }

    override fun authorize() {
        VKID.instance.authorize(lifecycleOwner, vkAuthCallback)
    }
}