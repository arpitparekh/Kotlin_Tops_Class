package feb23

open class College1{

    var area_code : Int = 0
    var name : String = ""

    constructor(a :Int,n:String){

        area_code = a
        name = n

    }
    fun display(){

        println(area_code)
        println(name)
    }
}

class Student1 : College1(1,"Tops"){

//    constructor() : super(1,"Jatin"){
//
//    }

    // child class default or parameter constructor always called parent class default constructor

    // there are two ways to call parent class's parameterized constructor


}

fun main() {

    val s1 = Student1()

    s1.display()

}