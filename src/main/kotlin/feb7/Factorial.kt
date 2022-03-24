package feb7

fun main() {

    // 5! = 5*4*3*2*1
    // 6! = 6 * 5!

    val n = 5

    var number = 1

    for(i in 1..n){    // i   // 1 / 2 / 3 / 4 / 5

        number *= i     // number  // 1 // 2 // 6 // 24 // 120

        // number = number * i

    }

    println(number)

}