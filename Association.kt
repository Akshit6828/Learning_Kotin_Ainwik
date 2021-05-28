class Teacher{
    var sub1="Android"
    var sub2="Kotlin!"
    var price1=2000
    var price2=3000
    fun subjects()
    {
        println("The course are:\n 1.Subject 1 is $sub1.\n Subject 2 is $sub2.")
    }
    fun prices()
    {
        println("The prices are:\n 1.Price of subject 1 is $price1.\n 2.Price of subject 2 is $price2")
    }
}
class Student{
    fun getInfo()
    {
        var obj=Teacher()
        obj.subjects()
        obj.prices()
        obj.price1=5000
        println("Price 1 is changed to ${obj.price1}")
    }
}

fun main() {
    var main_obj=Student()
    main_obj.getInfo()
}