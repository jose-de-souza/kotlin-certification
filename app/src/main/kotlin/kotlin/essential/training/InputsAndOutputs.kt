package us.greatapps4you.app.kotlin.essential.training

import java.io.File

fun ioDemo(args: Array<String>) {
    // --- Command Line Args ---
    // Passed into the main function (args)
    if (args.isNotEmpty()) {
        println("First arg: ${args[0]}")
    }

    // --- User Input ---
    println("Enter your name:")
    val input = readlnOrNull() // Reads console input safely

    // --- File I/O ---
    val file = File("data.txt")

    // Writing to a file
    file.writeText("Line 1\nLine 2\nLine 3")

    // Reading and parsing from a file
    val fileContent = file.readLines()
    fileContent.forEach { line ->
        println("Read: $line")
    }
}