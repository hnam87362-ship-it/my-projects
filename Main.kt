fun main() {
println("enter the frist number:")
var x =readln().toInt()
println("enter the second number:")
var y=readln().toInt()
x++
y--
println("sum:${x+y}")
println("is operation postive?${(x+y)>0}")
println("division:${x/y}")
println("is operation negative?${(x-y)<0}")
println("subtraction:${x-y}")

}
