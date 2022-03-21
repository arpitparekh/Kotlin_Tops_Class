package mar07

data class Emp(val id : Int ,val  name:String)

    // in data constructor parameter must have val or var keyword assigned to it

fun main() {

    val e = Emp(12,"arpit")
    val e2 = Emp(12,"arpit")

    println(e)

    println(e.hashCode())

    // toString // hashcode // copy // equals()

    println(e.equals(e2))

    val e3 = e2.copy()

    println(e3)

}