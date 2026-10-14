fun main() {
    println("Please enter a number:")
    val input = readln()
    val inputAsInteger = input.toIntOrNull()

    if (inputAsInteger != null) {
        val isEven = inputAsInteger % 2 == 0
        if (isEven) {
            println("The number is even!")
        } else {
            println("The number is odd!")
        }
    } else {
        println("Dude, enter a valid number!")
    }
}