package us.greatapps4you.kotlin.essential.training.oop.interfaces

interface StringProvider {
    val placeHolder: String //= "" // Compile time: Property initializers in interfaces are prohibited.
    fun get(id: Int): String = id.toString()
}