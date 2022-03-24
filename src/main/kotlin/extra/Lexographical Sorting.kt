package extra

import java.util.*

fun main() {

    val arr = arrayOf<String>("Goal","Gollie","Cat","c","Apple","App","Data","date")

    for(i in 0 until arr.size){

        for(j in 0 until arr.size){

            // arr[i] = "Gollie"  // arr[j] = "Hello"

            val temp = arr[i]  // gollie

           if(arr[i].lowercase().compareTo(arr[j].lowercase())<0){

               arr[i] = arr[j]
               arr[j] = temp

           }
        }
    }

    println(Arrays.toString(arr))


}