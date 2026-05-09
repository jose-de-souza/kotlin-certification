package us.greatapps4you.kotlin.essential.training.oop.idiomatic

private const val HOUR_IN_MILLIS = 60 * 60 * 1000
//fun millisForHours(hours: Int): Long = (hours * HOUR_IN_MILLIS).toLong()
//fun millisForHours(hours: Long): Long = hours * HOUR_IN_MILLIS

fun Int.millisForHours() = (this * HOUR_IN_MILLIS).toLong()
fun Long.millisForHours() = this * HOUR_IN_MILLIS