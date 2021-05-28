class EmployeeRecord
{
    var id: Int = 0
    var name: String = ""
    var salary: Int = 0

    constructor()
    {}
    constructor(id :Int,name : String,salary : Int) {
        this.id=id
        this.name=name
        this.salary=salary

    }

    fun setDetails()
    {

        println("Id :$id\n Name :$name\n Salary :$salary \n")
    }

}

fun main(args : Array<String>)
{

    var emp=Array<EmployeeRecord>(5){EmployeeRecord()}
    println("Enter employee details")

    for (i in 0..4)
    {

        println("Enter Id:")
        var input1= readLine()!!.toInt()
        println("Enter Name:")
        var input2= readLine()!!.toString()
        println("Enter Salary:")
        var input3= readLine()!!.toInt()

        var obj=EmployeeRecord(input1,input2,input3)
        emp[i]=obj

    }

    for(j in 0..4) {
        print("Detail of Employee $j")
        print(emp[j].setDetails())


    }

}