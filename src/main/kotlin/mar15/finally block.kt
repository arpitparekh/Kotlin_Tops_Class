package mar15

fun main() {

    // finally block

    // exception occurs or not finally block always run

    val data = "H"

    try{

        val number = data.toInt()


    }finally {

        println("Finally block")

    }

    println("rest of the code...")





}