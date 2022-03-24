package feb9

fun main() {

    val arr = intArrayOf(23,1,23,2,45,33,34,66,61,90,0,45)
                   //    0  1  2 3  4  5  6  7  8  9 10 11
    // peak element from array


    for(i in arr.indices){  // 0

        if(i+1 < arr.size && i+2 <arr.size){

            if(arr[i] > arr[i+1] && arr[i+1] < arr[i+2]) {

                println(arr[i + 1])

            }
        }



    }




//    for(i in 1 until arr.size){  // 0
//
//
//        if(arr[i-1] > arr[i] && arr[i] < arr[i+1]){
//
//            println(arr[i])
//
//        }
//
//    }

}