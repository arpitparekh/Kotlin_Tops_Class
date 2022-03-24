package feb18

class College{

    var id : Int = 0   // default

    var name : String = ""

    // initialize property through function

    fun assign(a : Int,data : String){

        id = a
        name = data
    }



}

fun main() {

    val c = College()

    c.id = 12            // i can initialize property through object
    c.name="ADIT"

    println("id ${c.id} name ${c.name}")

    /////////////////////////////////////////////////////////////////

    val c2 = College()

    c2.assign(34,"GMA")   // i can initialize property through function

    println("id ${c2.id} name ${c2.name}")

    ///////////////////////////////////////////////////////////////

    val c3 = College()

    c3.assign(66,"TOps")

    println("id ${c3.id} name ${c3.name}")


}