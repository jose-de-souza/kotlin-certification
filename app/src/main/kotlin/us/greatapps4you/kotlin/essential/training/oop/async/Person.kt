package us.greatapps4you.kotlin.essential.training.oop.async

class Person(age: Int) {

    init {
        check(age > 0) { "Age must be greater than 0" }
    }

    val age: Int = age
}