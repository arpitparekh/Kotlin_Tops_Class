package mar10

fun main() {

    repeat(5){            // higher order function

        println("Hi")

    }
    // in repeat context object => it
    repeat(10){

        println(it)

    }
}