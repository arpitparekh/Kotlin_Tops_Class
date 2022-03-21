package mar3

class Travel(no_places : Long){

    val no_places : Long

    init {

        this.no_places = no_places
    }

    override fun equals(other: Any?): Boolean {

        // i want to cast Any class object into another class object
        val obj : Travel = other as Travel
        return this.no_places==obj.no_places
    }
}

fun main() {

    val n : Int = 34  // stack

    val n1 :Int = 34

    println(n==n1)

    val t = Travel(23)
    val t2 = Travel(23)

    println(t==t2)   // in koltin == checks memory location

    // equals() // checks the values of object

    println(t.equals(t2))



}