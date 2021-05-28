import java.io.FileReader
import java.io.FileWriter

fun main() {
    println("Press\n1 for Write and 2 for Read:\n")
    var opt= readLine()!!.toInt()
    when(opt)
    {
        1->
        {
            write()
        }
        2->
        {
          readFromFile()
        }
        else->
        {
            println("Invalid Input")
        }
    }
}

fun write()
{
    println("Write the content into the file")
    var str= readLine()
    try {
        val fout=FileWriter("AINWIK",true)
        fout.write(str+"\n")
        fout.close()
        println("Data Written Succesfully")
    }
    catch (e:Exception){

    }

}

fun readFromFile()
{
    try{
        var fin=FileReader("jadu.txt")
        println("Data is ${fin.read().toChar()}")//reads char from file.But only First Character
         var x:Int?
        do {
            x=fin.read()
            print(x.toChar())

        }
            while (x!=-1)
    }
    catch (e:Exception){
        print(e)
    }
}