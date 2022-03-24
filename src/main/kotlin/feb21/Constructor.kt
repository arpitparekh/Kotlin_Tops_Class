package feb21

class Emp{

    constructor() {     // type of method   // there should be no return type in constrcutor

        println("Hello")     // constructor with no parameter is called default constructor
    }
    constructor(number : Int){   // parameterized constructor

        println("number is $number")

    }

    fun data(){

        println("This is data method")
    }

    fun data(number : Int){


    }

}

fun main() {

    // Constructor

    // constructor is a type of method that runs automatically when we create an object

    val e = Emp(12)

    val e2 = Emp()

    e.data()

}