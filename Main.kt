fun main()
{
    println("please enter anumber")
    val input=readln()
    val inputAsInteger=input.toIntOrNull()
    if(inputAsInteger != null)
    {
        val output=when{
            inputAsInteger%2==0->
            "the number is even"
            inputAsInteger<10 ->
            "the number is odd and less than 10"
            else->"the number is odd and at least 11"
        }
        println(output)
    } 
}