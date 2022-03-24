package feb11

fun main() {

    // escape sequence

    println("Hello \n hi")  //  \n means new line character

    println("hi\bstudent")

    println("hello\tstudent")

    val ch2 = ' '

    println(ch2.code)

    println(" this is \"  ")

    println("C:\\demo")

    ////////////////////////////////////////


    val a = 12
    val b =13

    println("max value is ${if (a>b) a else b}")

    println("value of a is $a")

    ///////////////////////////////

    println("Hello"+"Hi")

    /////////////////////////////////////////

    // raw string   // string that also include new line character

    val rawString = """
        
        oidshfldsjfdslkgdsf
        xzcxcxcxzcxzcxzcxzcxzczx
        dsfsdfsfdsfdsfdsf           $a   $b
        dfsdfdsfdsfdsfdsf
        dsfdsfdsfdsfds sfds dsf dsf dsf d ds fs dsf dsf ds 
        dsdsdsddsadsadsaddsaas
        
    """.trimIndent()


    println(rawString)

    ////////////////////////////////////////////////////////

    val anotherString = "        hello          "

    println(anotherString.trim())


    /////////////////////////////////////////////////////



}