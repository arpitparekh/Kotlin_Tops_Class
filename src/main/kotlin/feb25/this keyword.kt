package feb25

class Data(name:String){

    init {

        println("This is Primary Constructor")
        println(name)
    }

    constructor(name:String,number:Int) : this(name){

        println("This is secondary constructor")
        println("name is $name and number is $number")

    }
}

fun main() {

    val d = Data("tops",23)


}