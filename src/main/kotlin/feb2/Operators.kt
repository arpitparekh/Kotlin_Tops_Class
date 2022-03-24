package feb2

fun main() {

    // Operators  // are symbols to perform specific task

    // Arithmetic Operator

    // + - / *  %

    val i  = 12
    val i2 = 13

    val i3 = i % i2

    println(i3)

    println(13233 % 10)


    val number : Int = 343434

    println(number / 10)

    //////////////////////////////////

    // conditional operators

    // < >  <=  >=  == !=

    val bool  = i<i2

    println(bool)

    println(13 != 13)

    ///////////////////////////////////


    // assignment operators

    //  =   *= /= += -=

    var j = 23

    j += 10   // j = j+10   // 33

    j %= 2
    println(j)

    ///////////////////////////////////////////

    // shift operators

    //  shl shr

    // 66  100001000
    val k = 66 shl 2

    val l = 66 shr 3

    println(l)

}