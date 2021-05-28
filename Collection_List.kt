
//*********************** MUTABLE LIST*******************
fun mutablelist()
{
var al=ArrayList<String>(4)//in java default capacity is 8--> then 16 and jaise jaise capacity badti hai vo badhti jate the data ke according.
    println(al.size)//prints 0 as size only prints the size of no of elements inserted in it.
    al.add("RAM")
    al.add("AKSHT")
    al.add("AKKI")
    for (i in al)
        println(i)
    println("Size of arraylist is ${al.size} and usng size of ${al.trimToSize()}")

    println(al.get(1))

}










fun main() {
mutablelist()

}



//************IMMUTABLE LIST************************************
fun imutablelist()
{
    var mylist:List<Any> = listOf("Alpha","Beta","Delta","Gamma",1,2,3) //Any is a predefined class in kotlin.
    var mylist2= listOf<Any>(1,2,25,true,"AAA")
    println(mylist)
    println("\n Printing mylist in form of objects")
    //Retrieving data in form of objects...
    for(i in mylist)
    {
        print("$i ")    //getting data in form of object.
    }
    println()
//WORKING OF DROP-----
    println("List2 before is $mylist2")
    println("List 2 size before drop is ${mylist2.size}")
    mylist2.drop(1)//Drops element at index 1
    println("Size of mylist 2 by after using drop but NOT UPDATING THE INSTANCE IS ${mylist2.size}") //It will be = 5 only as drop works only on instance and the instance is not updated in the original list.

    mylist2=mylist2.drop(1)//Drops element at index 1 as the instance is updated in the list now.
    println("My list2 after dropping element at index 1 is $mylist2")
    println("My list2 size is : ${mylist2.size}")

    //Retreving data in form of data type..
    for(i in 0..mylist.size-1)
    {
        println(mylist.get(i))//We can even use mylist[i] as same as arrays..
    }

    println(println())//Prints unit as return type....


    println("Printing numvers list using iterators.....\n")
    //Using iterables for iterating the iterables Collections..Except Map all other collections are iterables.
    val numbers = listOf("one", "two", "three", "four")
    val numbersIterator = numbers.iterator()
    while (numbersIterator.hasNext()) {
        println(numbersIterator.next())
    }
}