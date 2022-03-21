package feb25

open class Technology(name: String,f : Float,number:Int){
    init {

        println("value of name is $name and values of f is $f values of number is $number")
    }
}
class Kotlin(name : String,number : Int) : Technology(name,12.45f,number){

    constructor() : this(12){

        println("child default")
    }
    constructor(number : Int) : this(number,"tops"){
        println("child parameter 1")
    }
    constructor(number :Int,name : String) : this(name,number){
        println("child parameter 2")
    }
}
fun main() {

    val k = Kotlin()


}