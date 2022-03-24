package feb3

fun main() {

    val i =12

    if (i<13) println("True") else println("False")

    // if else as an expression


    val number = if(i<13) 55 else 66



    println(" if as expression is ->  ${if(i<13) if(34>i) 44 else 55 else 77} ")

    println(" max value is ${if(12<13) 13 else 12}")

    /////////////////////////////////////////////////////////

    val j = 45

    if(j<66) println("Hello"+"hi") else println("Else")

    ////////////////////////////////////////////////

        // when

    val b = 56

    when(b){

        12 -> println("value is 12")
        13 -> println("value is 13")
        14 -> println("value is 14")
        56 -> {
            println("value is 56")
            println ("Hello")
        }
        else -> println("Nothing found")

    }

    //    ==     !=

    val p = 40

    when(p){

        12,13,55,66 -> println("Value not Found")

        in 1..20 -> println("Found in range")

        !in 70..80 -> println("Not in range")

        !in 90..100 -> println("Not")

        else -> println("Else block")

    }




}