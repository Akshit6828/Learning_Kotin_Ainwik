import java.lang.Exception

class MyThread: Thread()
{
    override fun run() {
        try {
            for (i in 1..5)
            {
                println("Count is $i")
            }
                Thread.sleep(3000)

        }
        catch (e:Exception){}
        println("Thread Called")
    }
}
/*class MyThread2:Thread()
{
    override fun run() {
        try {
            Thread.sleep(3000)
        }
        catch (e:Exception){}
        println("Thread 2 Called")
    }
}*/
fun main() {
 //   println(Thread.currentThread().name)  used to get current thread name.
    val obj=MyThread()
    val obj1=MyThread()
   // val obj1=MyThread2()
    obj.start()
    obj1.start()
   // obj1.start()  //  val obj2=MyThread()  //  obj2.start()
}