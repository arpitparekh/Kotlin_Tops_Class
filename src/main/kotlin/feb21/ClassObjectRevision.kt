package feb21

class Student{

    var no : Int = 0
    var name : String = ""

    fun assign(n : Int,na : String){

        no = n
        name = na
    }

    fun display(){

        println("no is $no and name is $name")

    }

}

fun main() {

    val s = Student()

    s.assign(12,"Pratik")

    s.display()

}