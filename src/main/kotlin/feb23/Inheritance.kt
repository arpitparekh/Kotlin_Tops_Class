package feb23

open class College{   // parent class  // base class // super class

    val col_name : String = ""
    val dep_name : String =""

    fun data(i:Int){
        println(i)
    }
}
class Student : College(){  // child class  // derived class //child class

    val student_name = ""
    val id :Int = 0


}

fun main() {

    // OOPC

    // class  // object (heap) // constructor // inheritance

    // using one class property and function into another class

    // when a child class object access properties and function of parent class its called inheritance

    val s = Student()

    s.data(12)

}