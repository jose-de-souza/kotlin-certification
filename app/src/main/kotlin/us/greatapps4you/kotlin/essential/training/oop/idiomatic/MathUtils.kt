package us.greatapps4you.kotlin.essential.training.oop.idiomatic

val Int.isEven: Boolean
    get() = this.mod(2)  == 0