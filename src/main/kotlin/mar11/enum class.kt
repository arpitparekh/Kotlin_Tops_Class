package mar11

enum class Days{

    // enum contains only constants
    // every constant in enum is an object
    // enum is a group of constant object

    MONDAY,TUESDAY,THURSDAY,FRIDAY

}

fun main() {

    // enum

    // enum is a group of constant

    val days1 = "MONDAY"  // constant
    val days2 = "TUESDAY"

    println(Days.MONDAY)
    println(Days.TUESDAY)
    println(Days.FRIDAY)
    println(Days.THURSDAY)

    val co = Days.MONDAY

    when(co){

        Days.MONDAY -> println("today is monday")
        Days.TUESDAY -> println("today is tuesday")

    }


}