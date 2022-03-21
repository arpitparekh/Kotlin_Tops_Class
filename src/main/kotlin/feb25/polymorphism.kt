package feb25

import feb28.A

class Go2{

    fun display(){

    }
}

class Go{

    // method overloading

    // method overloading happens inside one class
    // i can create multiple methods with same name
    // parameter type must be different
    // no of parameter must be different
    // or order of parameter must be different

    fun display(){


    }

    fun display(n :Int){


    }

    fun display(name:String){


    }

    fun display(number : Int,name:String){


    }
    fun display(name : String,number:Int){


    }
}

fun main() {

    // polymorphism(greek) in kotlin

    // poly many // morphism form

    // method overloading

    // method overriding

    val g = Go()

    val a = A()


}