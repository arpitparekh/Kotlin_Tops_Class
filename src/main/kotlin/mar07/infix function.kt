package mar07

infix fun Int.multiply(n : Int) : Int{

    return n*this

}

fun main() {

    // infix function

    // infix function is extension function with just one parameter

    // infix function is used to improve the representation of the code

    val number1 = 23

    val number2 = 33

    println(number1 multiply number2)

}