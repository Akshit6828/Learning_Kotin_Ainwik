import java.lang.Exception
class C1:Thread()
{
    override fun run()
    {
        println(Thread.currentThread())
        for (i in 1..5)
        {
            println("Thread 1 called and index is $i")
            if(i==3)
            {
                    try {
                        Thread.sleep(3000)
                    }
                    catch (e:Exception){
                        println(e.message)
                    }
            }
        }
    }
}
class C2:Thread()
{
    override fun run()
    {
        println(Thread.currentThread())
        for (i in 1..5)
        {
            println("Thread 2 called and index is $i")
            if(i==3)
            {
                try {
                    Thread.sleep(3000)
                }
                catch (e:Exception){
                    println(e.message)
                }
            }
        }
    }
}


fun main() {
    val obj1=C1()
    val obj2=C2()
    obj1.start()//Achieving Multi-Tasking
    //obj1.join()//Join method is after the start always and doesn't leaves the thread 'run' until and unless the thread is completely executed.
    obj2.start()
   // obj2.join()
  //  println("Thread Status 1 through obj1.isAlive is ${obj1.isAlive}")//Thread Destroyed if Result = 'False'
  //  println("Thread Status 1 through obj1.isDaemon is ${obj1.isDaemon}")//Note here isDaemon wont be showing true as it is in main thread. Try making another function for checking the daemon thread status.
 //   println("Thread Status 2 through obj2.isAlive is ${obj2.isAlive}")
 //   println("Thread Status 1 through obj2.isDaemon is ${obj2.isDaemon}")
   // checkState(obj1)
  //  checkState(obj2)
}
fun checkState(obj:Thread)
{
    if(obj.isAlive)
        println("Object of Thread $obj is Alive ")
    else if (obj.isDaemon)
        println("Object of Thread $obj is Daemon ")
    else if (obj.isInterrupted)
    println("Object of Thread $obj is Interrupted ")
    else
        println("Else of $obj is Happening")
}