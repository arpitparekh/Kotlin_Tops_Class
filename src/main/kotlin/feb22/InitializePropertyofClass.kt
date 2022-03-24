package feb22

class Clinc(e : Int,name : String){

//    init {
//
//        val e1 = e
//        val n = name
//    }

    var equipment : Int = e
    var name2 : String = name

    fun display(){

        println(equipment)
        println(name2)
    }

}

fun main() {

    val c = Clinc(12,"Data")

    c.display()

}