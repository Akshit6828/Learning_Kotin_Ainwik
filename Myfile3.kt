import myPackage1.C1
class C3:C1(){
    override fun Amy(){
        println("Inherited Amy Called through Inheritance.....")
    }

}

fun main() {
    val obj=C3()
    obj.Amy()
}