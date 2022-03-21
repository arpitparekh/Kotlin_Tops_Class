package feb28

abstract class Compney{

    val isOpen : Boolean = false

    val name:String = ""

    open fun show(){

        println("This is show function")
    }

    abstract fun display()  // abstract method is by default open

    // abstract method // function
    // u can not create object of an abstract class
    // all the abstract class are by default open
    // we must have to override abstract function inside a child class
    // abstract class provides implementation to the another class


}

class Employee : Compney(){

    override fun display() { // this is compulsory

    }

    override fun show(){  // not compulsory

    }

}

fun main() {

    // abstraction

    // OOPC

    // class  // object // constructor  // polymorphism // inheritance

    // encapsulation  // access modifier

    // Abstraction  // abstract (thought)  // no physical existance

}