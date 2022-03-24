package feb2

fun main() {

    println("Enter Value")

    // 2 way to take an input from user

    // readLine()

    // Scanner

    val x = readLine()

    println(x)

    //////////////////////////////     type casting   ////////////////////

    val b : Byte = 23

    val i : Int = b.toInt()         // type conversion

    val f = 45.67f

    val l : Long = 34324387878787878 // 8 byte  // 64 bits  // avoid this

    // 4 byte  // 32 bits
    val i2 : Int = l.toInt()

    println(i2)

    val d : Double = 3434343222222224343434.3434343434123

    val f2 : Float  = d.toFloat()

    println(f2)

}