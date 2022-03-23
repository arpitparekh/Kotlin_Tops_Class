package mar23

fun main() {

    val arr = arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6), intArrayOf(7,8,9))
    val arr2 = arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6), intArrayOf(7,8,9))

    val arr3 = arrayOf(IntArray(3),IntArray(3),IntArray(3))

    // empty array


    for(i in 0..2){

        for(j in 0..2){

            arr3[i][j]=arr[i][j]+arr2[i][j]

        }

    }

    println(arr3.contentDeepToString())

}