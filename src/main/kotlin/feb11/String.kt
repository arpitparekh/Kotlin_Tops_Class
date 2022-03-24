package feb11

fun main() {

    var name = "tops"

    println(name[0])

    // in kotlin string is immutable

    name = "hello"   // re initialization

    val name2 = "tops"





    // stack

    // continuous

    // LIFO

    // number datatype

    // int // float // byte // long // short

    // double // boolean // char

    // heap

    // dynamic memory location

    // object(collection of data)

    // arr

    // string  // garbage collection

    val data = "Hello World"


    val arr = data.toCharArray()

    for(i in arr.indices){

        for(j in (i+1) until arr.size){

            if(arr[i] > arr[j]){

                val temp = arr[i]
                arr[i] = arr[j]

                arr[j] = temp

            }

        }

    }

    val newString = String(arr)

    println(newString)

    // length

    // compareTo()  // same 0 // different (ASCII value difference)

    val myString = "This is My String"

    println(myString.subSequence(5,10))




}