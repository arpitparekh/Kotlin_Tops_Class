package extra

fun main() {

    val arr1 = arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6))

    val arr2 = arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6))

    val arr3 = arrayOf(IntArray(3),IntArray(3))   // 2 *  3

    for(i in arr1.indices){  // 0 1     // 2 times

        for(j in 0 until arr1[0].size){  // 3 times

            //   0 0  //  10  // 20
            //   0 1  //  11  // 21

            arr3[i][j] = arr1[i][j]+arr2[i][j]
        }

    }

    println(arr3.contentDeepToString())

}