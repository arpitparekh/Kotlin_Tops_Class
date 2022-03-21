package mar08

val lambda2  = {

    a : Int , b:Int ->

    val result =  if(a<b) a else b

    result
}

val lambda3 = { println("This is Hello") }

fun dataFetch( a : (Int,Int) -> Int , number1 : Int , number2 : Int ) : Int {

    return a(number1,number2)

}

fun main() {

    println(lambda2(12,13))   // we can also call a lambda function like this

    println(dataFetch(lambda2 , 23,10))

    lambda3()

}