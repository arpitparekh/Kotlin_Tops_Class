package feb10

fun main() {

    val data = "Hello World"

    val arr : CharArray = data.toCharArray()


    for(i in arr.indices){ // 0..9   //

        for(j in i+1 until arr.size){

            if(arr[i] > arr[j]){

                val temp = arr[i]

                arr[i] = arr[j]

                arr[j] = temp


            }

        }

    }

    val newString = String(arr)

    println(newString)

}

