package mar01

interface MyInterface{

    // interface is a collection of abstract method
    //interface is a pure abstraction
    // we can not create object or any constructor of interface

    fun display()
}

class Demo : MyInterface{

    override fun display() {

        println("This is display method given by interface called myInterface")

    }
}

fun main() {

    val d = Demo()

    d.display()


}