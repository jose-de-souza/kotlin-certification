package us.greatapps4you.kotlin.essential.training.oop.interfaces

interface ResourceProvider: StringProvider {
    fun getDimension(id: Int): Long = id.toLong()
}