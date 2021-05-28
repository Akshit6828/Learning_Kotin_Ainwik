fun main() {
    //First way of using arrays
    //Stores arraay in type of objects.
   /* var names =arrayOf("Akki","Brad","Chelsi","Drown","Elego")
    var emp_Id= intArrayOf(1,3,6,7,9)
    var emp_Salary= doubleArrayOf(2000.3,5000.3,6000.9,5000.5,9000.7)
println("List of names is :")
    for (i in names)
        println(i)
    println("List of emp_Id is :")
    for (j in emp_Id)
        println(j)
    println("List of emp_Salary is :")
    for (k in emp_Salary)
        println(k)
    println("Id\t Salary\t  Name ")
    for (i in 0..emp_Id.size-1)
    println("${emp_Id[i]}\t ${emp_Salary[i]}\t  ${names[i]}")*/

//Second way of arrays using Array class.
    var classArray=Array<Int>(4){-19}//here default value is -1.
    classArray[0]=22
    for (i in classArray)
        print("$i ")
//Creating 2 D array in Kotlin with help of 1 D array
    var array1= intArrayOf(101,102,103)
    var array2= arrayOf("Akki","Kanu","Sham")
    var array3= arrayOf(array1,array2)

    println("size of array 3 is ${array3.size}")
    for (i in 0..array3.size-1)
        println(i)
}