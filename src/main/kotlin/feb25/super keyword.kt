package feb25

open class A(n : Int){

    init {

        println(n)
    }
    constructor(name : String) : this(12){


    }
}
class B : A{

    constructor() : super(45){

    }
}

fun main() {

    val b = B()

}