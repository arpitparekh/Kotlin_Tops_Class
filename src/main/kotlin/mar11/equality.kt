package mar11



open class Student(val student : String, val address : String){

    override fun equals(other: Any?): Boolean { // this // s1
        val s : Student = other as Student

        return this.student==s.student && this.address==s.address
    }

}


fun main() {
    // equality



    // .equals() and ==
    // compares the content of 2 objects

    val s1 = Student("hardik","kochi")
    val s2 = Student("hardik","kochi")

    // === compares location of two object
    // === compares reference values of two object

    println(s1==s2)
    println(s1===s2)
    println(s1.equals(s2))

    ////////////////////////////////////////////////////////////


    // in koltin  == and .equals() both are same
    // but === is comparing their location

}