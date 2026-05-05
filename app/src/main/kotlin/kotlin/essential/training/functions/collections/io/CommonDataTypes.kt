package us.greatapps4you.app.kotlin.essential.training.functions.collections.io

// 2. Common Data Types

fun dataTypes() {
    // --- Mutable vs Immutable ---
    val immutableName = "John" // 'val' (value) cannot be reassigned (Immutable)
    var mutableAge = 25        // 'var' (variable) can be reassigned (Mutable)
    mutableAge = 26            // This is fine.
    // immutableName = "Doe"   // ERROR: Val cannot be reassigned.

    // --- Numeric Data Types ---
    val myInt: Int = 42
    val myDouble: Double = 3.14
    val myLong: Long = 123456789L // 'L' suffix denotes a Long

    // --- Char and String ---
    val letter: Char = 'A' // Single quotes for Char
    val text: String = "Kotlin is fun" // Double quotes for String

    // String interpolation (templates)
    val greeting = "Hello, $immutableName! You are $mutableAge years old."

    // --- Nullable Types ---
    // By default, Kotlin variables CANNOT be null. This prevents NullPointerExceptions.
    // var nonNullString: String = null // ERROR

    // Add a '?' to allow nulls
    var nullableString: String? = "I might be null later"
    nullableString = null // This is perfectly fine now

    // Safe call operator (?.) - only calls length if nullableString is NOT null
    val length = nullableString?.length
}

fun numericDataTypes() {
    // Numbers
    // Signed Integers
    println("Byte.MIN_VALUE = ${Byte.MIN_VALUE} | Byte.MAX_VALUE = ${Byte.MAX_VALUE} ")
    println("Short.MIN_VALUE = ${Short.MIN_VALUE} | Short.MAX_VALUE = ${Short.MAX_VALUE} ")
    println("Int.MIN_VALUE = ${Int.MIN_VALUE} | Int.MAX_VALUE = ${Int.MAX_VALUE} ")
    println("Long.MIN_VALUE = ${Long.MIN_VALUE} | Long.MAX_VALUE = ${Long.MAX_VALUE} ")

    // Unsigned Integers
    println("UByte.MIN_VALUE = ${UByte.MIN_VALUE} | UByte.MAX_VALUE = ${UByte.MAX_VALUE} ")
    println("UShort.MIN_VALUE = ${UShort.MIN_VALUE} | UShort.MAX_VALUE = ${UShort.MAX_VALUE} ")
    println("UInt.MIN_VALUE = ${UInt.MIN_VALUE} | UInt.MAX_VALUE = ${UInt.MAX_VALUE} ")
    println("ULong.MIN_VALUE = ${ULong.MIN_VALUE} | ULong.MAX_VALUE = ${ULong.MAX_VALUE} ")

    // Floating-Point Numbers
    // Note: For Float and Double, MIN_VALUE is the smallest positive non-zero value, not the most negative value.
    println("Float.MIN_VALUE = ${Float.MIN_VALUE} | Float.MAX_VALUE = ${Float.MAX_VALUE} ")
    println("Double.MIN_VALUE = ${Double.MIN_VALUE} | Double.MAX_VALUE = ${Double.MAX_VALUE} ")

    var aLong: Long = 0 // 64 bits
    var aInt: Int = 0 // 32 bits
    var aShort: Short = 0 // 16 bits
    var aByte: Byte = 0 // 8 bits

    // aByte = aLong // Assignment type mismatch: actual type is 'Long', but 'Byte' was expected.
    // aShort = aLong // Assignment type mismatch: actual type is 'Long', but 'Short' was expected.
    // aInt = aLong // Assignment type mismatch: actual type is 'Long', but 'Int' was expected.
    // aLong = aShort // Assignment type mismatch: actual type is 'Short', but 'Long' was expected.
    // aInt = aShort  // Assignment type mismatch: actual type is 'Short', but 'Int' was expected.
    // aShort = aByte  // Assignment type mismatch: actual type is 'Byte', but 'Short' was expected.
    // aLong = aInt // Assignment type mismatch: actual type is 'Int', but 'Long' was expected.

    // aInt = 10L //Assignment type mismatch: actual type is 'Long', but 'Int' was expected.

    // aLong =  10UL // Assignment type mismatch: actual type is 'ULong', but 'Long' was expected.
    // aShort = 10U // Assignment type mismatch: actual type is 'UInt', but 'Short' was expected.
    var aUlong: ULong = 10u
    aUlong = 10uL
    // aUlong = 10L // Assignment type mismatch: actual type is 'Long', but 'ULong' was expected.
    var aUInt: UInt = 10u
    // aUInt = 10 // Assignment type mismatch: actual type is 'Int', but 'UInt' was expected.
    //aUInt = 10uL // Assignment type mismatch: actual type is 'ULong', but 'UInt' was expected.

    var aDouble: Double = 10.0
    // aDouble = 10 // Assignment type mismatch: actual type is 'Int', but 'Double' was expected.
    // aDouble = 10.0f // Assignment type mismatch: actual type is 'Float', but 'Double' was expected.

    var aFloat: Float = 10f
    // aFloat = 10 // Assignment type mismatch: actual type is 'Int', but 'Float' was expected.
    // aFloat = 10.0 // Assignment type mismatch: actual type is 'Double', but 'Float' was expected.
    aFloat = 10.0f

    println(aShort > aLong)
    // println(aUlong > aInt) // Argument type mismatch: actual type is 'Int', but 'UInt' was expected.
    println(aInt > aFloat)
}

fun charDataType() {
    // Character
    println("Char.MIN_VALUE code = ${Char.MIN_VALUE.code}") // 0
    println("Char.MAX_VALUE code = ${Char.MAX_VALUE.code}") // 65535
    println("Char.MIN_VALUE code = ${Char.MIN_VALUE}") // Null character
    println("Char.MAX_VALUE code = ${Char.MAX_VALUE}") // noncharacter

    var aChar: Char = 'A'
    var letterAcode: UShort = 65u
    println(aChar.code)
    println(Char(letterAcode))
}