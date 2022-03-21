package feb24

open class Lab(n_p : Int,
               electri : Boolean){

    val no_pc : Int

    val electicity : Boolean

    init {

        no_pc = n_p
        electicity = electri
    }
}
class Children(no_child : Int,
               name_child : String,
               no_pc : Int,
               electri: Boolean) : Lab(no_pc,electri) {

    val no_children : Int
    val name_children : String

    init {

        no_children = no_child
        name_children = name_child
    }
    fun display(){

        println("$no_children  $name_children $no_pc $electicity")
    }
}
fun main() {

    val c = Children(12,"smit",343,true)

    c.display()

}