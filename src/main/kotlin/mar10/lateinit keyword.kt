package mar10

class Data{

    lateinit var name : String
    lateinit var list : ArrayList<String>

}

lateinit var name : String  // object

val number : Int = 0  // need default value

fun main() {

    // lateinit keyword is used to make a global declaration of an object
    // lateinit only supports var


    // primitive // 8 primitive
    // byte // short // int // long // float // double

    // boolean  // char

    name = "Tops"

    display()

}


fun display(){

    println(name)

}