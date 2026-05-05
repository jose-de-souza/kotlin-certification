package us.greatapps4you.kotlin.essential.training.oop.async

class Person(
    val age: Int,
    private val firstName: String,
    private val lastName: String
) {

    init {
        check(age > 0) { "Age must be greater than 0" }
    }

    fun fullName(): String {
        return "$firstName $lastName"
    }

}