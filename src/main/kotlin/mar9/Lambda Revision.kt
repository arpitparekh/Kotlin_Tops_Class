package mar9


// higher order function

fun higher ( n1 : Int,n2:Int,myFunction : (Int,Int)->Unit){

    myFunction(n1,n2)

}

fun main() {

    higher(11,22){ a:Int,b:Int -> println(a+b)}

}