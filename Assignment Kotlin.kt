import java.util.*

fun main() {

   /*println("Enter your Birth Year")
    var year:Int= readLine()!!.toInt()
    var years=Calendar.getInstance().get(Calendar.YEAR)
    print("Your Age is ${years-year}")*/

    println("Enter a story!")
    var story:String=""
    var finalstory:String=""
    while (!story.contains("exit",true))
    {
        story= readLine().toString();
        story+='\n'
        finalstory += story;
    }
    var j=-1;
    for(i in 0..(finalstory.length-6)){
        j++
        if( finalstory[j]=='\n')
            print("\n")
        else
            print(finalstory.get(i))
    }

    }

