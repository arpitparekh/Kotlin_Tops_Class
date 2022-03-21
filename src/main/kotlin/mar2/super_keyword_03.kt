package mar2

open class Fun{

    var a : Int = 0
    var b : Int = 0

    open fun display(){    // if we write final ahead of a function then we can not override that fucntion


    }
}

class Tigar : Fun(){

    override fun display(){


    }

}

class Vacation(a:Int,b:Int) : Fun(){

    init {

        super.a = a
        super.b = b
    }
}


fun main() {



}