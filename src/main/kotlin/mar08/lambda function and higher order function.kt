package mar08

// lambda function

val lambda  :  (Int,Int) -> Unit =  { a:Int,b:Int -> println(a+b) }  // return unit

// higher order function

fun higher( myFunction : (Int,Int) -> Unit ){

    myFunction(12,13)

}

fun main() {

    // named  // extension function // infix function

    // higher order function

    // is the function that takes another function as its parameter
    // is the function that can also return another function
    // do both

    // lambda function

    // is the function without any name

     // { parameter 1 ,parameter 2 -> body }

    // we can also store lambda function inside a variable name

    higher(lambda)

}