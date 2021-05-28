open class Papaji{
    open fun Bunglow()
    {
        println("********* BUNGALOW OF DAD CALLED***************")
    }
    open fun car()
    {
        println("******** *CAR OF DAD CALLED*******************")
    }
}
class  Betaji: Papaji()
{
    //So all properties of Papaji are inherited here.
    override fun Bunglow()
    {
        println("******** BUNGALOW HAS BEEN CHANGED BY SON")
    }
    override fun car()
    {
        println("******** CAR HAS CHANGED BY SON**********")
    }

}

fun main(){
    var obj=Betaji()
    obj.Bunglow()// Now methods of Papaji are accessible and overrided by Betaji.
}