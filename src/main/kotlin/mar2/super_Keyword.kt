package mar2

open class Area(number : Int){

    var a :Int = 0
    var b :Int = 0

    fun display(){

        println("a = $a and b = $b")

    }

}

class Circle(a :Int,b:Int) : Area(34) {

    constructor() : this(12,13){

    }

    init {

        super.a = a
        super.b = b   // super refers to the parent class object inside a child class

        // super can also be used to access parent class property
    }


    fun show(){

        super.display()

        // super is also used to access parent class method inside child class method

    }


}

fun main() {



}