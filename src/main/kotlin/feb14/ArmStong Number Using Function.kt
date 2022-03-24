package feb14

fun armstrong(x : Int) : Boolean{

    var p = x
    // x = 153   // 15 // 1

    var lastDigit = 0

    var number = 0

    while(p>0){

        lastDigit = p%10  // 3  // 5 //1

        number = number + Math.pow(lastDigit.toDouble(),3.0).toInt()  // 125 + 27 + 1

        p /=10

    }

    return x==number

}


fun main() {

    // 153

    // 1*1*1 + 5*5*5 + 3*3*3 = 153

    println(" Given number is armstrong number : ${armstrong(152)}")


}