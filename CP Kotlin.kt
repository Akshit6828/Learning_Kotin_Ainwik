fun main() {
    repeat(readLine()!!.toInt())
    {
        var i:Int=0
        var vv:String="vv"
        var w:String="w"
        var indexv:Int=0
        var indexw:Int=0
        var ans:Int =0

        var j:Int=0

        var s: String = readLine().toString()
        indexv = s.indexOf(vv)
        indexw=s.indexOf(w)
     //   println("Indexv is $indexv and indexw is $indexw")
        if (indexv == -1&&indexw==-1)
            ans = 0
        else {
            if(indexw ==-1&&indexv!=-1)
            {
                indexv=s.indexOf(vv)
                ans++
                while (indexv!=-1) {
                    var tempind = indexv
                    indexv = s.indexOf(vv, indexv + 2)
                //    println("New index for indexv is  $indexv")
                    if (tempind < indexv) {
                       //  println("Index incremented and new indexv is $indexv")
                        ans++;
                    }
                }
            }
            else if (indexv==-1&&indexw!=-1)
            {

                indexw=s.indexOf(w)
                ans++
                while (indexw!=-1) {
                    var tempind = indexw
                    indexw = s.indexOf(w, indexw + 1)
                      //println("New index for indexw is  $indexv")
                    if (tempind < indexw) {
                       // println("Index incremented and new index of indexw  is $indexv")
                        ans++;
                    }
                }
            }
            else
            {

                indexw=s.indexOf(w)
                ans++
                while (indexw!=-1) {
                    var tempind = indexw
                    indexw = s.indexOf(w, indexw + 1)
                     //println("New index for indexw  in else block is  $indexw")
                    if (tempind < indexw) {
                       // println("Index incremented and new index of indexw  is $indexw")
                        ans++;
                    }
                }


                indexv=s.indexOf(vv)
                ans++
                while (indexv!=-1) {
                    var tempind = indexv
                    indexv = s.indexOf(vv, indexv + 2)
                    // println("New index for indexv  in else block is  $indexv")
                    if (tempind < indexv) {
                      //     println("Index incremented and new indexv is $indexv")
                        ans++;
                    }
                }

            }

        }
        println(ans)
    }
}