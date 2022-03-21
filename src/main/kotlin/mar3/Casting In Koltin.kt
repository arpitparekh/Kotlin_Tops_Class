package mar3

open class A(a :Int){

    val a : Int

    init {

        this.a = a
    }

}

class B(b : Int) : A(12){

    val b : Int

    init {

        this.b = b

    }

    fun display(){

        println("a is $a and b is $b")
    }

}

fun main() {

    val obj : A = B(23)   // there is no error

    // u can also initialize parent class object with child class constructor

    println(obj.a)

//    val obj2 : B = A(34)

    // we can not initialize child class object using parent class constructor

    // so we need casting

//    val a = A(23)
//
//    val b : B = a as B


    val obj3 : Any = "Hello"

    val name : String = obj3 as String


    val obj4 : Any = 34

    val name2 : String = obj4 as String

    // we can cast parent class object into class if their content were same


    // any class is the one and only class whose object i can cast into another object




}