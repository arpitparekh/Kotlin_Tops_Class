package feb24

open class Faculty(f : String){

    var fac_name : String = ""

    init {

        fac_name = f

    }

    fun display(){

        println(fac_name)
    }

}
class Student : Faculty{

    constructor() : super("arpit")
}

fun main() {

    val s = Student()

    s.display()

    val data = "data"

}