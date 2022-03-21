package feb23

class Tech{

    fun display(){

        println("This is display function")

//        display()   // recursion

    }
    fun print(){   // class member

        display()

    }
}

fun print(){    // independent function

}

fun main() {

    val t = Tech()

    t.print()

}