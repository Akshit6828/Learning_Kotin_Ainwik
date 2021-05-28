interface i1{
    var pinCode:Int
    fun disp()
    fun show()
    {
        println("Show method of interface called")
    }
}
class Abc:i1
{
    override var pinCode=151001
    override fun disp() {
        println("display method of Abc called")
    }
}

fun main() {
var obj=Abc()
    obj.disp()
    obj.show()
}