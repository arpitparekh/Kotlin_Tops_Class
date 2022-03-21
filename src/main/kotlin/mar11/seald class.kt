package mar11

class Books : College.Student("Chaitanya"){



}

class State : College("ADIT"){



}

sealed class College(val name : String){



    open class Student(val sName : String){  // inner class // nested class



    }

}


fun main() {

    //sealed class

    // gives a perfect heirarchy of restricted classes

    val s : College.Student = College.Student("arpit")

    println(s.sName)

}