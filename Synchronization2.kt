
class Sync1
{

    @Synchronized fun task(obj: Sync1)
    {
        for (i in 1..3)
        {
            try{
                Thread.sleep(4000)
            }
            catch (e:Exception){}
            println("Counter is $i and obj is $obj")
        }

    }

}