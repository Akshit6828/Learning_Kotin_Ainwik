import java.util.*
import kotlin.collections.ArrayList

fun main() {

    val read = Scanner(System.`in`)
    //var t: Int = read.nextInt()
    //while (t > 0) {
    repeat(read.nextInt())
    {

            val n: Int = readLine()!!.toInt()
            val x = ArrayList<Int>(n)
            var i: Int = 0
            while (i < n) {
                var vlue = read.nextInt()
                x.add(vlue)
                i = i + 1
            }

            val frequencyMap: MutableMap<Int, Int> = HashMap()

            for (s in x) {
                var count = frequencyMap[s]
                if (count == null) count = 0
                frequencyMap[s] = count + 1
            }
            print(frequencyMap)
            var flag = 0

            for (i in frequencyMap.keys) {
                if (frequencyMap[i] == 1) {
                    flag = 1
                    var value = i
                    var ind = x.indexOf(value)
                    println(ind + 1)
                    break
                }
            }
            if (flag == 0)
                println("-1")
        }
    }