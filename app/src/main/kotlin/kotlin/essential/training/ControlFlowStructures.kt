package us.greatapps4you.app.kotlin.essential.training

fun controlFlow(obj: Any) {
    // --- if/else as Expressions ---
    // In Kotlin, 'if' can return a value directly.
    val isAdult = true
    val status = if (isAdult) "Allowed" else "Denied"

    // --- when Statement (Kotlin's switch on steroids) ---
    val day = 3
    val dayName = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3, 4 -> "Midweek" // Multiple conditions
        in 5..7 -> "Weekend" // Ranges
        else -> "Unknown"
    }

    // --- Smart Casting ---
    // If we check the type using 'is', Kotlin automatically casts it inside the block.
    if (obj is String) {
        // 'obj' is automatically cast to String here, so we can use String methods
        println("String length: ${obj.length}")
    }

    // --- Loops ---
    // For loop over a range
    for (i in 1..5) {
        // Loops 1, 2, 3, 4, 5
    }

    // While loop
    var counter = 5
    while (counter > 0) {
        counter--
    }

    // --- try/catch as Control Flow ---
    // Like 'if', 'try' can also return a value!
    val numberStr = "Not a number"
    val parsedNumber = try {
        numberStr.toInt()
    } catch (e: NumberFormatException) {
        0 // Fallback value if it crashes
    }
}