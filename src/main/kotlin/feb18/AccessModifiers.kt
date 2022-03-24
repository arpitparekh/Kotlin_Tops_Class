package feb18

private class University {   // by default all the class in kotlin is public class

    // access modifier // public // private // protected

    var name = ""

    var noOfStudent : Int = 0

}

fun main() {

    val u : University = University()

    u.name = "Student"

    u.noOfStudent= 30000

    println("name of the university is ${u.name}\nno of student is ${u.noOfStudent}")

}