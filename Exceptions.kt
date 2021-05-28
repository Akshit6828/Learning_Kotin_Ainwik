import java.lang.ArithmeticException
import java.lang.NumberFormatException
fun fun1(){
    println("CODE before exception")
    try {
        var x = 10 / 0
    }
    catch (e:Exception){
        println(e)
    }
    println("After Exception")
}

fun fun2() {
    var myArray= arrayOf(100,1001,102,true,"222")
    for(i in myArray){
        println(i)//here we are getting object of type of array and thus it will print the array.
        if(i is Int)
            println("I is of int type")
        else
            println("I is of any other type")
    }


}
fun fun3(){
    var myArray= arrayOf(100,101,102)
    try {
        for (i in 0..myArray.size){
            println(myArray[i]/0)
        }
    }
    catch (e:Exception){
        println(e)
    }
}
fun fun4NumberFormatException(){

    try {
        var x:Int= readLine()!!.toInt()
    }
    catch (e:NumberFormatException){
        println("$e \n ${e.message}")
    }
}
fun multicatch() {
    try {
        var x = readLine()!!.toInt();
        var y = readLine()!!.toInt();
        var res = x / y
    } catch (e: Exception) {
        if (e is NumberFormatException) {
            println("Please enter a valid Int Number")
        }
        if (e is ArithmeticException) {
            println("Check divide by zero error")
        }
    }
}
    fun testtrycatchfinally() {
        try {
            var x= readLine()!!.toInt()
            var y= readLine()!!.toInt()
            println(x/y)
        }
        catch (e:Exception){
            println("$e and Exception occured")
        }
        finally {
            println("Finally executed")
        }
    }


    fun testtryfinally() {
        try {
            var x= readLine()!!.toInt()
            var y= readLine()!!.toInt()
            println(x/y)
        }
        finally {
            println("Finally executed")
        }
    }

    fun main() {
        //testtryfinally()
    testtrycatchfinally()
    }



