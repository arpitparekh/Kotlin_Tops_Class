package feb14

fun display2(){

    println("This is display function")
}

////////////////////////////////////////////

// function with parameter and no return type

fun sum(a : Int){  // function declaration

    // a = 23

    // function parameter value is always val


    println(a+30)


}

fun sum2(a:Int,b:Float){

    println(a+b)

}

fun main() {

    display2()

    sum(23)
    sum(10)
    sum(20)
    sum(45)

    sum2(10,20.0F)

}