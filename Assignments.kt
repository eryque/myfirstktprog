fun main() {
    // Create an array of 50 integers
    val myArray = Array(50) { index -> index + 1 }

    // Use a for loop to print out the names (indexes) of the integers
    for ((value) in myArray.withIndex()) {
        println("$value")

