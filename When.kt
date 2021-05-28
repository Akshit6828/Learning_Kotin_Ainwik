fun main()
{
  /*var j= readLine()//here var j is of object class
    var i= readLine()!!.toString()// here var i is of String class
    print(i.equals("Hello"))
    var x:Int =i.toInt()*/


    //First Method of When Jumping Statement
   /* println("Please enter your Id")
    var id= readLine()!!.toInt()
    when(id)
    {
        101-> {
            print("Your are 101")
        }
        102-> {
            print("Your are 102")
        }
        else-> {
            print("Your are else")
        }

    }*/


    //  Second Method of When Jumping Statement
  /*  println("Please enter your Id")
    var id= readLine()!!.toInt()
    when(id)
    {
        101-> {
            print("Your are 101")
        }
        102-> {
            print("Your are 102")
        }
        103,104,105->
        {
            print("You are latter employes")
        }
        else-> {
            print("Your are else")
        }

    }*/


    //  Third Method of When Jumping Statement using String as case
      println("Please enter your Id")
      var id= readLine()!!.toString()
      when(id)
      {
          "A"-> {
              print("Your are 101")
          }
          "B"-> {
              print("Your are 102")
          }
         in "C".."F"->//in is a reserve word which is used for initalization
          {
              println("You are latter employes")
          }
          else-> {
              print("Your are else")
          }

      }
}