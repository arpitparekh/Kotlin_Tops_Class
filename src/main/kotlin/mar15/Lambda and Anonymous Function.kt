package mar15

// lambda function
val lambda : (Int) -> Char =  { x : Int -> println(x)

        12
        "Hello"
        'c'
}

// anonymous function

val number = fun(x : Int) : Int {

    println("x is $x")

    return 23
}

fun give ( f1 : (Int) -> Char , f2 : (Int) -> Int ){

    println(f1(23))
    println(f2(12))

}



val lambda2 = { 12 }

val number2 = fun() : Int { return 12 }

// different between lambda and anonymous function

fun main() {

    lambda(10)
    number(20)

    println(lambda2())
    println(number2())

    give(lambda , number)




}