package tech.mobiledeveloper.features.login.data

interface AuthLocalDataSource {
    suspend fun checkToken(): String
}

class AuthEncryptedDataSource(): AuthLocalDataSource {
    override suspend fun checkToken(): String {
        return ""
    }

}

