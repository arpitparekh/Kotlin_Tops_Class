package mar14

enum class Parts(val value : Int){

    RAM(10),CPU(20),MOUSE(30),KEYBOARD(40);

    fun display(){
        print("This is Display Method of Enum class")
    }

}

fun main() {

    // enum

    // is class of constant

    // every constant in an enum is an object of that class

    print(Parts.CPU)

    Parts.CPU.display()

    println(Parts.RAM.value)

}