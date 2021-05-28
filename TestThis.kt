/*class Employe{
    var id:Int=0
    var name:String =""
    var salary:Int=0

    constructor()
    {

    }
    constructor(id:Int,name:String,salary:Int)
    {
        this.id=id
        this.salary=salary
        this.name=name
    }
    fun input()
  {
    println("Enter Id, Name and Salary")
      id= readLine()!!.toInt()
      name= readLine().toString()
      salary= readLine()!!.toInt()
      Employe(id,name,salary)
  }
    fun show()
    {
        println("Id :$id\n Name :$name\n Salary :$salary \n")
    }

}
fun main() {

    var arr= Array<Employe>(5){ Employe()}

    for (i in 0..4) {
    arr[i].input()
    }
    for(i in 0..4)
        arr[i].show()
}*/
class Test2This
{
    fun first():Test2This
    {
        println("First")
        return this
    }
    fun second():Test2This
    {
        println("Second")
        return this
    }
    fun third():Test2This
    {
        println("Third")
        return  this
    }
}

fun main() {
    Test2This().first().second().third()
}