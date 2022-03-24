package feb9

fun main() {

    val arr = arrayOf<Int>(23,34,45,67,54,32,11,10)

    var number = arr[0]

    for(i in arr){

        if(number < i){

            number = i

        }

    }

    println("Largest Number is $number")

}