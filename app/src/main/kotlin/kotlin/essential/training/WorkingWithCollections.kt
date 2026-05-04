package us.greatapps4you.app.kotlin.essential.training

fun collectionsDemo() {
    // --- Arrays ---
    // Fixed size, mostly used for interoperability with Java or low-level optimization
    val numbersArray = arrayOf(1, 2, 3)

    // --- Lists (Ordered) ---
    val readOnlyList = listOf("A", "B", "C")
    val mutableList = mutableListOf("A", "B")
    mutableList.add("C")

    // --- Sets (Unique items only, unordered) ---
    val mySet = setOf(1, 2, 2, 3) // Resulting set is just [1, 2, 3]

    // --- Maps (Key-Value pairs) ---
    val agesMap = mapOf("John" to 25, "Jane" to 30)
    println(agesMap["John"]) // 25

    // --- Sequences ---
    // Good for massive collections. They evaluate lazily (one item through the whole chain at a time).
    val sequence = readOnlyList.asSequence()

    // --- Challenge: Filtering ---
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val evens = numbers.filter { it % 2 == 0 } // 'it' is the implicit name for the current item
    val doubledEvens = evens.map { it * 2 }
}