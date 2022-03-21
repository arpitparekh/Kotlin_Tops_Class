package mar15

fun main() {

    val number = 12

    try{

        println(number/0)

        println("From try block")

    }catch ( e : ArithmeticException){

        println(e)

    }
    println("body.....")

}