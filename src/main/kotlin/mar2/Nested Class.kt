package mar2

open class College(col_name:String){

    val col_name : String

    init {

        this.col_name = col_name

    }


    class Student(s_name :String) {  // inner class // nested class

        val s_name: String

        init {

            this.s_name = s_name
        }

        fun display() {

            println("This is display method $s_name")
        }

    }

    }

fun main() {

    val s : College.Student = College.Student("pradip")

    println(s.s_name)

}
