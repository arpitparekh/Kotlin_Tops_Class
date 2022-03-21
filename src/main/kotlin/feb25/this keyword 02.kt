package feb25

class Net(number : Int){

    init {

        println("Primary constructor")
    }

    constructor() : this("data",23.45f){

        println("default")
    }

    constructor(name:String,f : Float) : this(false){

        println("parameterized 1")
    }
    constructor(b : Boolean) : this(23){

        println("parameterized 2")

    }

}

fun main() {

    val n = Net()



}