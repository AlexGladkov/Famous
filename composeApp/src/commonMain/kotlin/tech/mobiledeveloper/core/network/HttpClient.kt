package tech.mobiledeveloper.core.network

interface HttpClient {
    fun makeRequest(isError: Boolean): String
}

class DemoHttpClient : HttpClient {
    override fun makeRequest(isError: Boolean): String {
        println("Make Request")
        return if (isError) "Error" else "Success"
    }

}