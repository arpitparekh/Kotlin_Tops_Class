package feb18

class Student{   // blueprint  // template

    // properties // variables

    // functions

    var name = ""   // default values

    var roll : Int = 0

}

fun main() {

    val s  = Student()

    s.roll=12
    s.name="Yug"

    println("roll no is ${s.roll} and name is ${s.name}")

    val s2 = Student()

    s2.name = "Chaitanya"
    s2.roll = 34

    println("roll no is ${s2.roll} and name is ${s2.name}")


}