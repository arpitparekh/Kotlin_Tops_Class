package mar2

class Travel(name_places : String){


    val name_places : String

    // i want to share proper

    companion object{

        var no_places : Int = 0
    }



    init {

        this.name_places = name_places
    }

    fun assign(number : Int){

        no_places = number

    }


}

fun main() {

    val t = Travel("ahmedabad")
    val t2 = Travel("surat")
    val t3 = Travel("rajkot")

    t.assign(12)
    t2.assign(13)
    t3.assign(45)



    /*
        static property share its value among
        all the object

        we can access static property by class name only

        if one object change the static property
        its values will be changed in all the other object



     */

    println("common property is ${Travel.no_places}")

    val raw = """
        
        common property is ${Travel.no_places}
        
    """.trimIndent()





}