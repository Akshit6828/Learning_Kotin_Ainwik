import java.lang.Exception

class MyExp:Exception{

    constructor(msg:String):super(msg)

}

fun main() {

   println("Please input your age...")
    var age= readLine()!!.toInt()
    try {
        if (age < 18)
            throw MyExp("Invalid Age!! You are not valid for voting")
        else
            println("You are valid for vote.")
    }
    catch (e:MyExp)//here exception ka object return kr rha hai. My Exp ka object return hoga
    {
        println(e)
    }
}