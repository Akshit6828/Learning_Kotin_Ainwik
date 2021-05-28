class MyThread1:Thread
{
    var obj:Sync1
    constructor(obj:Sync1)
    {
        this.obj=obj
    }
    override fun run() {
        obj.task(obj)
    }
}
class MyThread2:Thread
{
    var obj:Sync1
    constructor(obj:Sync1)
    {
        this.obj=obj
    }
    override fun run() {
        obj.task(obj)
    }
}
class MyThread3:Thread
{
    var obj:Sync1
    constructor(obj:Sync1)
    {
        this.obj=obj
    }
    override fun run() {
        obj.task(obj)
    }
}


fun main() {
val obj=Sync1()//object of Class Sync1 of Synchronization
    val t1=MyThread1(obj)
    val t2=MyThread2(obj)
    val t3=MyThread3(obj)
    t1.start()
    t2.start()
    t3.start()

}