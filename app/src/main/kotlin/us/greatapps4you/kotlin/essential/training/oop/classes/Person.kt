package us.greatapps4you.kotlin.essential.training.oop.classes

open class Person(
    val age: Int,
    protected val firstName: String,
    protected val lastName: String
) {

    init {
        check(age > 0) { "Age must be greater than 0" }
    }

    open fun fullName(): String {
        return "$firstName $lastName"
    }

}