import kotlin.math.sqrt
fun main()
{
    val rect1=Rectangle(
    width=5,
    height=7
    )
    println(rect1.width)
    println(rect1.height)
    println(rect1.diagonal)
}
class Rectangle(val width:Int,val height:Int)
{
    val diagonal=sqrt((width*width+height*height).toDouble())
    
}