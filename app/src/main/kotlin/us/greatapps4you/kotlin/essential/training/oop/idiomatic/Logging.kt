package us.greatapps4you.kotlin.essential.training.oop.idiomatic

import java.time.LocalDateTime

fun <T> T.log() = "[${this?.javaClass}] ${LocalDateTime.now()}: ${this.toString()}"