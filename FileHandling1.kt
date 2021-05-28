import java.io.File
fun main() {
    println("Enter file name")
    var filename= readLine()
    var file= File(filename)
  /*  var isfileCreated=file.createNewFile()
    if (isfileCreated)
        println("File Created Successfully!")
    else
        println("File is not created")*/
    //  file.writeText("Hello Jaddu")
   // file.writeText("Hello Akki")//it will overwrite the previous content ie hello jaddu..

    //Reading from a file...1st way...
   /* file.forEachLine {
        println(it)
    }*/
//2nd way of reading the data.
  /*  var data=file.readText()
    println("Data is $data")*/

}
