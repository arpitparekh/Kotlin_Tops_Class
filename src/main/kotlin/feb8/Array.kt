package feb8

import java.util.*

// import

fun main() {

    // array  // is a group of similar type of element

    // declare array

    // initialize

    val arr = arrayOf(12,"data",34.35f,1.2,false)    // array is group of element

    // array indices

    // array is fixed size

    val arr2 = IntArray(5)   // declaration

    val arr3 = FloatArray(10)

    val arr4 = arrayOf<Int>(1,2,3,4,5,6)

    ////////////////////////////////////////////////////////////////////////////////

    val arr5 : IntArray = intArrayOf(45,23,567,34,35)

    val arr6 = intArrayOf(34,67,345,324,45)

//    arr5 =arr6

    println(arr5[2])                 // []  index operator

    println(arr5.get(2))

    // different ways to print array

    for(i in arr5){

        println(i)
    }

    for(i in arr5.indices){  // arr5.indices returns range of array index

        println(i)
    }

    //   Arrays .. toString()

    println(Arrays.toString(arr5))

    println(arr5.contentToString())

    ////////////////////////////////////////////


    for(i in arr5.indices){    // 0 1 2 3 4

        println(arr5[i])

    }

    arr5[0]=35

    for(i in arr5.indices){    // 0 1 2 3 4

        println(arr5[i])

    }

    ///////////////////////////////////////////////////////


    val myArr = intArrayOf(1,2,3,8,10)

    var number = 0

    for(i in myArr){

        number += i   // number = number + i

    }

    println("sum is $number")

}