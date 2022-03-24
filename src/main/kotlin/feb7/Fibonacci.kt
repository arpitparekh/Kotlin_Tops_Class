package feb7

fun main() {

    // fibonacci

    // 0 1 1 2 3 5 8 13

    val n = 5

    //  0  1  1  2  3
    //  a  b  c
    //     a  b  c
    //        a  b  c

    var a = 0
    var b = 1
    var c : Int

    for(i in 1..10){        //   4

        // a / 0 / 1 / 1 / 2 / 3
        // b / 1 / 1 / 2 / 3 / 5
        // c / 1 / 2 / 3 / 5 / 8

        println(a)   // 0 // 1 // 1 // 2 // 3
        c = a+b
        a = b
        b = c

    }
}