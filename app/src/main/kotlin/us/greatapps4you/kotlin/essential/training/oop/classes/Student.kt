package us.greatapps4you.kotlin.essential.training.oop.classes

class Student(age: Int, firstName: String, lastName: String): Person(age, firstName, lastName) {

    override fun fullName(): String {
        return "$lastName, $firstName"
    }
}