package feb10

fun main() {

    val arr = arrayOf<Int>(12,4,23,1,2,67,23,2,1,1,0,89)  // 12 size

    // bubble sort

    println("size of array is ${arr.size}")
    // 1,45,23,23,2,67,23,2,1,1,0,89


    for(i in arr.indices){ // 0......11  // arr[i] // 2

        for(j in i+1 until arr.size){ // 1..11

            if(arr[i] > arr[j] ){

                val temp = arr[i]

                arr[i]=arr[j]

                arr[j]=temp

            }

        }

    }

}