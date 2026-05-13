package us.greatapps4you.kotlin.essential.training.oop.delegates

import java.time.LocalDateTime

class SimpleLogger: Logger {
    override fun log(tag: String, any: Any) {
        println("$tag: $any")
    }
}