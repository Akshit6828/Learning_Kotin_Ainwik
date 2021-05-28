abstract class Remote{
    abstract fun volume(volume:Int):Unit
    abstract fun colour(colour:String):Unit
    abstract fun brightness(brightness:Double):Unit
}
class TV1:Remote(){
    override fun volume(volume: Int) = println("The Volume of TV1 is changed to $volume.")
    override fun colour(colour: String)=println("The colour of the TV1 is changed to $colour")
    override fun brightness(brightness: Double) = println("The brightness of TV1 is changed to  ")
}