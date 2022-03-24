package feb11

fun main() {

    var name : String? = "tops"

    name = null


    // ? mark behind every type is called null type

    // null safety operator   //  "  ?.  "

    println(name ?. length)

    //  !!  (not null asserted operator)

//    println(name !!. length)   // !! operator throws and expicit error

    //   elvis operator   //  ?  :


    val data : String = name ?: "Hello"

    println(data)




}