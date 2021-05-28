import java.sql.Struct

open class Testoveriding{
   open fun display(name:String){
       println("Display of parent")
    }
}
class Anushka:Testoveriding()
{
    override fun display(name: String) {
        println("Display of Child..")
    }
}

fun main() {
    var obj:Testoveriding=Anushka()//Run-time polymorphism as Upcasting is being there ke child ka object ko parent ka bana diaa..
    //As here call parent ka hoga but execute child ka hoga..
    var obj1=Anushka()
    obj.display("xyz")
    obj1.display("AAAA")
}