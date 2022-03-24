package feb18

class Parts{

    init {

        println("This is init block")
    }

    var name : String = ""

    var expiry : Int = 0

    fun assign(n : String,e : Int){

        name = n

        expiry = e

    }

    fun display() : String{

        return "name is $name and expiry is $expiry"

    }

}

fun main() {

    val  p = Parts()

    p.assign("Ram",1000)

    val p2 = Parts()

    p2.assign("LCD",10000)

    println("First -> ${p.display()}\nSecond -> ${p2.display()} ")




}