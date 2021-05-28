import javax.print.attribute.IntegerSyntax

fun calc()//Default function
{   println("Hello function!")
}
fun calc1(a:Int):String//function with return type and parameter
{
    println("Parameterized value is "+a)
    return "${a.toString()} Hello"
}
fun main()//Main function
{
    calc()
    var l= readLine() //Reads  input  in String
    var a:Int= readLine()!!.toInt()//reads input in INT without having null
    var y:Int=Integer.valueOf(readLine())//Reads input in INT ,Can have Null Value, Also uses Integer Class.
    println("${calc1(y)} is first func and ${calc1(a)} is second Function called ")
    println(maxx(8,6))//Single line functions call
    printAkki()//Single line function call


}

//Single Line Function:
fun maxx(a:Int ,b:Int):Int= if(a>b)a else b // Single line statement
fun printAkki(): Unit= println("Akki")