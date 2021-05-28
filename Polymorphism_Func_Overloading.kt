
fun magic(name:String){
println("Your name is $name")
}
fun magic(x:Int)
{
println("Age is $x")
}

fun main() {
magic("Akki")//It is compile time polymorphism as it is being decided at the compile time.
    magic(3)
}