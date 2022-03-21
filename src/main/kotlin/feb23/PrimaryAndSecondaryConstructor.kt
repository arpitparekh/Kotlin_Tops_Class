package feb23

class Vehicle(i : Int,t : String){

    val id : Int
    val type : String

    init {
        id = i
        type = t
    }

    constructor(data : String) : this(0,"Tops"){

        println(data)
    }
    fun display(){
        println("id is $id and type is $type")
    }
}

fun main() {

    val v = Vehicle("Hello Student")

    v.display()

}