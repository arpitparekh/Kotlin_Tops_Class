package feb25

open class College{

    val c_name : String

    constructor(n : String){

        c_name = n

    }

}

class Student : College{

    val s_name : String

    constructor(n : String) : super("ADIT"){

        s_name = n

    }

    fun display(){

        println("college name is $c_name and student name is $s_name")
    }

}

fun main() {

    val s = Student("yug")

    s.display()


}