package feb10

fun main() {

    // String

    // is a character array

//    val arr = charArrayOf('t','o','p','s')

    val name  = "Tops"

    println(name)

    for(i in name.indices){

        println(name[i])
    }

    for(i in name){

        println(i)
    }

    println(name.length)

    println(name.lastIndex)

    val str = "Tech"
    val str2 = "Tech"

    println(str.compareTo(str2))



}