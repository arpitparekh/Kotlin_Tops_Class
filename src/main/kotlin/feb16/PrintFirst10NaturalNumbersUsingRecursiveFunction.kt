package feb16


fun printNumbers(number : Int){

    if(number >=1){

        println(number)

        printNumbers(number-1)
    }
}

// printNumbers(10){ print printNumbers(9){ print printNumbers(8){ print printNumbers(7) } }  }

fun main() {

    // print first 10 natural number

    // 1 2 3 4 5 6 7 8 9 10

    printNumbers(5)

}