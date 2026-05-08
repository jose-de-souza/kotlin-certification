package us.greatapps4you.kotlin.essential.training.oop.objectclasses

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class NetworkConfigTest {

    @Test
    fun bootstrapTest() {
        assertEquals("https://mybaseurl.com", NetworkConfig.baseUrl)
        assertEquals("my-app", NetworkConfig.userAgent)
        assertEquals("https://mybaseurl.com/my-app", NetworkConfig.getNetworkDetails())

        val provider: NetworkInfoProvider = object : NetworkInfoProvider {
            override fun getNetworkDetails(): String {
                return "test-provider"
            }
        }
        assertEquals("test-provider", provider.getNetworkDetails())
    }

}