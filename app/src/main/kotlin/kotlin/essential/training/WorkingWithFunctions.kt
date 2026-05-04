package us.greatapps4you.app.kotlin.essential.training

// --- Basic Functions & Parameters ---
fun greetUser(name: String, greeting: String = "Hello"): String {
    // greeting has a default value, making it optional when calling
    return "$greeting, $name!"
}

// Single-expression function (shorthand)
fun multiply(a: Int, b: Int): Int = a * b

// --- Functional Types & Higher-Order Functions ---
// A higher-order function takes a function as a parameter OR returns one.
// Here, 'operation' is a function that takes two Ints and returns an Int.
fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun functionsDemo() {
    println(greetUser("Alice")) // Prints: Hello, Alice!

    // Passing a lambda (an anonymous function) into our higher-order function
    val sum = calculate(5, 10) { x, y -> x + y }
    val product = calculate(5, 10) { x, y -> x * y }
}