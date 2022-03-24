package feb7

fun main() {

    // No of digit

    var n = 343443

    var z = 0

    while(n!=0){

        n /= 10
        z++
    }
    println("No of Digit is $z")

}