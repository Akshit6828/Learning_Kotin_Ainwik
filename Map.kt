fun main() {
    immutable_map()
}

fun immutable_map()
{
    var myMap= mapOf<Int,String>(101 to "Ram",102 to "Sham",103 to "AKshit")//to is a keyword which represents the relation between key and value
    println(" Map is $myMap \n")
    println("Keys are:\n")
    for(i in myMap.keys)//We will iterate through the keys..
    {
        println(myMap[i])
        println("Key corresponding to i is  $i")//Print value
    }


    for (i in myMap.values) {
        println(i)
        if (i.equals("Akshit",true))
            println("Found Akki and key is")
    }

//for(i in myMap)
    println("All keys in the map arw ${myMap.keys}")//To get key in the map

    println("myMap.getValue(101) is ${myMap.getValue(101)}")//note key must be sure else it could give key not found exception
    println(" myMap.containsKey(103) = ${myMap.containsKey(103)} ")
    println(myMap.containsKey(104))//= false
    println("${myMap.containsValue("ABC")} using contains contains value Abc")//false
    println(myMap.get(102))//sham
    println(myMap.getOrDefault(107,"No key found.."))//Akshit
    println("My map.get 107 = after assiging default is ${myMap.get(109)}")
}

fun mutable_Hash_Map()
{
    val my_hash_map= HashMap<Int,String>()
    my_hash_map.put(201,"Rohit")
    my_hash_map.put(202,"Shohit")

    for(key in my_hash_map.keys)
    {
        println("Data key is $key = ${my_hash_map[key]}")
    }
    my_hash_map.replace(201,"Replaced value")
}