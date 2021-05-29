import kotlin.math.max
import java.util.*
fun main() {
    val read=Scanner(System.`in`)
    var t:Int= read.nextInt()
    while (t>0) {
        val n:Int= read.nextInt()
        val x = LongArray(n)
        var i:Int=0
        while (i<n)
        {
            x[i] = read.nextLong()
            i=i+1
        }
        x.sort();
        var maxx:Long=0
        i=0
        while (i<n)
        {
            var cur_index: Int =n-i;
            maxx= max(x[i]*cur_index, maxx)
            i++
        }
        println("$maxx")

        t -= 1
    }
}
