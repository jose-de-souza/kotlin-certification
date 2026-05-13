package us.greatapps4you.kotlin.essential.training.oop.delegates

import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.DefaultAsserter.assertTrue
import kotlin.test.Test

class ApplicationLoggerTest {

    @Test
    fun testBootstrap() {
        // 1. Setup a stream to capture the output
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out

        try {
            // 2. Redirect System.out to our capture stream
            System.setOut(PrintStream(outputStream))

            // 3. Execute the code under test
            val appLogger = ApplicationLogger(SimpleLogger())
            appLogger.log(tag = "app-logger", any = "Hello Delegate!")

            // 4. Convert captured bytes to a string
            val capturedOutput = outputStream.toString()

            // 5. Assertions
            assertTrue("Output should contain the tag", capturedOutput.contains("app-logger"))
            assertTrue("Output should contain the message", capturedOutput.contains("Hello Delegate!"))

        } finally {
            // 6. ALWAYS restore the original System.out to avoid affecting other tests
            System.setOut(originalOut)
        }
    }
}