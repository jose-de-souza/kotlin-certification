package us.greatapps4you.kotlin.essential.training.oop.interfaces

class DefaultResourceProvider : ResourceProvider {

    override val placeHolder: String = "<placeholder>"

//    override fun getDimension(id: Int): Long {
//        return id.toLong()
//    }
//

    // Overriding a default method is not mandatory
    override fun get(id: Int): String {
        return "id: $id"
    }
}