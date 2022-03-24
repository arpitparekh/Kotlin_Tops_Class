package feb9

import java.util.*

fun main() {

    val arr = intArrayOf(34,56,34,567,1,2,3,0,99,87,10)

    // bubble sort

    // 1,2,56,567,34,34,3,0,99,87,10

    for(i in arr.indices){ // 0..10

        for(j in i+1 until arr.size){ // 1..10

            if(arr[i] > arr[j]){

                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp

            }

        }
    }

    println(arr.contentToString())


}