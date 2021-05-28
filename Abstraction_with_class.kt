abstract class RBI{

   abstract fun interest(rate:Double)
}
class SBI:RBI(){
    override fun interest(rate: Double) {
        println("The interest rate of SBI is $rate %.")
    }
}
class PNB:RBI(){
    override fun interest(rate: Double) {
        println("Interest Rate of PNB is $rate %.")
    }

}
class BOI:RBI(){
    override fun interest(rate: Double) {
        println("Interest Rate of BOI is $rate %.")
    }

}
class HDFC:RBI(){
    override fun interest(rate: Double) {
        println("Interest Rate of HDFC is $rate %.")
    }

}

fun main() {
/*var obj1=SBI()
    obj1.interest(5.60)
    var obj2=PNB()
    obj2.interest(7.25)
    var obj3=BOI()
    obj3.interest(6.52)
    var obj4=HDFC()
    obj4.interest(7.20)*/
    println("Enter Class name and Object")
    var bank= readLine()?.toUpperCase()
    var interest= readLine()!!.toDouble();
    var clas=ClassLoader.getSystemClassLoader().loadClass(bank)//Load the class manually
    var obj:RBI=clas.newInstance() as RBI//runtime polymorphism |||| Upcasting
    obj.interest(interest)
}