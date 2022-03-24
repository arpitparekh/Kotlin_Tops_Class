package feb16


fun checkAge(age : Int) : Boolean = age > 18    // function as an expression


fun max(a : Int,b:Int) : Int = if(a>b) a else b


fun show() : Int = 34

//fun show() : Int{
//
//    return 34
//}

// kotlin functional programming
// kotlin is also an object oriented programming


fun main() {

    println("Age is ${checkAge(12)}")

    println("Max of two number is ${max(12,13)}")

    println("Show function returns ${show()}")

}