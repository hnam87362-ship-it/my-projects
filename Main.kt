fun main() {
    println("please enter a number")
    val input = readln()
    val inputASInteger = input.toIntOrNull()

    if (inputASInteger != null) {
        
        val isEven = inputASInteger % 2 == 0
        
        if (isEven) {
            println("the number is even")
        } else {
            println("the number is odd")
        }

    } else {
        println("Enter Valid Number")
    }
}