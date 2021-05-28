fun main()
{
    /*OLD VERSION ONF IF ELSE*/
    var a=9
    if(a>10)
        println("A GREATER")
    else
        println("A SMALLER")

    /* NEW VERSION ONF IF ELSE------- BUT ONLY APPLICABLE TO SINGLE STATEMENTS*/
    var level= if(a>10) "A BADA HAI" else "B BADA HAI"
    println(level)
    var value=if(a>10) 99 else "Less than 99"
    print(value)
    //var ternarycheck= a>10?"A verified":"B verified"
}
