package feb25

open class Person(n : String){

    val name : String

    init {

        name = n
    }
}

class Teacher(n : String) : Person(n){

    val teacherName :String

    init {

        teacherName = n
    }

    fun display(){

        println("name of the teacher is $teacherName")

    }

}

fun main() {

    val t = Teacher("arpit")

    t.display()

}