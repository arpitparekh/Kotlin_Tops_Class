package feb7

fun main() {           // palindrome (number == reverse)

    var n = 1234321

    val n2 = n

    var last_digit : Int = 0

    var reverse : Int = 0

    while(n!=0){     //

        last_digit = n%10   // 3  // 4 // 5  // 4  // 3
       reverse =  reverse * 10+ last_digit  // 3 // 34 // 345 // 3454  // 34543

        n /= 10

    }

    println(reverse)

    if(n2 == reverse){

        println("Palindrome")
    }else{

        println("not Palindrome")

    }

}