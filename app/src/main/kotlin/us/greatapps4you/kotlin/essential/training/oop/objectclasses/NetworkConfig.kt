package us.greatapps4you.kotlin.essential.training.oop.objectclasses

// Object classes are singletons out of the box
object NetworkConfig: NetworkInfoProvider {
    val baseUrl = "https://mybaseurl.com"
    val userAgent = "my-app"

    override fun getNetworkDetails(): String {
        return "$baseUrl/$userAgent"
    }
}