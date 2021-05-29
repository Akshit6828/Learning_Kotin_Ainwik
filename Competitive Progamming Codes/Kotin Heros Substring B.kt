import java.util.*

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    var t: Int = read.nextInt()

    while (t > 0) {
        var str=read.next()
        var len= str.length
        var vv:String="vv"
        var w:String="w"
        var i: Int =0
        var found : Int =0

        if(len==1 && str.get(i) =='w' )found++
        else {
            while (i < len - 1) {
                if(str[i].equals(w)){
                    found++
                    i=i+1
                }
                else if(str.substring(i,i+1).equals(vv))
                {
                    found++
                    i=i+2
                }
                else
                    i++

            }
        }
        println(found)

        t-=1
    }


}