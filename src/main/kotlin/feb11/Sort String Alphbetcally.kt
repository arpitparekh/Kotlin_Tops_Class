package feb11

import java.util.*

fun main() {

    var data = "Hello World"

    data = data.replace(" ","")

    data = data.lowercase()

    println(data)

    val arr= data.toCharArray()

    Arrays.sort(arr)

    println(arr)

    ///////////////////////////////////////////////////////

    // null  // empty

    val name = "Tops Technology"

    val name2 = null

    val name3 = ""  // empty

    val name4 = "          " // blank

    // empty is a unique string whose length is zero

    ////////////////////////////////////////

    println(name3.isEmpty())

    ///////////////////////////////////////////


    println(name.indexOf('s'))

    ////////////////////////////////////////////////

    val str = "Hello"

    val arr2 = str.toByteArray()

    println(arr2.contentToString())

    ///////////////////////////////////////////////

    var number : Number = 34

    number = 34.56f

    //////////////////////////////////////////////

    val arr3 = intArrayOf(23,45,23,24,46)


    println(arr3.size)

    println(arr3.contains(45))

    println(arr3.last())

    val arr4 : IntArray = arr3.copyOfRange(0,arr3.size)

    println(arr4.contentToString())

    println(arr3.indexOf(46))

}