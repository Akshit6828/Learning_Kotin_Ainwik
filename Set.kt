fun main() {

    //Immutable set which means myset.add() wont work...
    var myset= setOf<Int>(100,102,102,106,99)
    print(myset)
    for(i in myset)
    {
        println(i)
    }
    println(myset.map { it.toFloat() })



    //Hash Set is mutable Set where add can work...
    var myhashset=HashSet<Int>()
    myhashset.add(101)
    myhashset.add(102)
    myhashset.add(103)
    myhashset.add(104)
    myhashset.add(104)
    for (i in myhashset)
        println(i)
}