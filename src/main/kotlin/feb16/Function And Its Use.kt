package feb16


val j = 45   // global variable

fun print(){

    println(j)

}

fun plus( a : Int, b : Int){

    // a = 45 // b = 30
    println(a+b)
    // function parameter variables are local variables

}

fun main() {

    val i = 20  // local variable

    print()

    val a = 45

    val b = 30

    plus(a,b)

}