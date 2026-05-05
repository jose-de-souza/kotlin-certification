package us.greatapps4you.us.greatapps4you.kotlin.essential.training.oop.async

import us.greatapps4you.kotlin.essential.training.oop.async.Person

class Student(age: Int, firstName: String, lastName: String): Person(age, firstName, lastName) {

    override fun fullName(): String {
        return "$lastName, $firstName"
    }
}