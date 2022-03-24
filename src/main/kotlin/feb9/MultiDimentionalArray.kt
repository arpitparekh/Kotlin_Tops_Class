package feb9

fun main() {


    // 2d array   // 2 * 3
                              //    0              1
    val arr = arrayOf(  intArrayOf(1,2,3)  , intArrayOf(1,2,3,4,5)   )

    for(i in arr.indices){   // 0 // 1

        for(j in arr[i].indices){  // 0 until arr[0].size // 0..2

            print(arr[i][j])
        }

        print("   ")

    }

}