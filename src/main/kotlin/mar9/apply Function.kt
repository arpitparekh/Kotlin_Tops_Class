package mar9

class College(var id:Int,var name:String){

    fun display(){

        println("id is $id and name is $name")
    }
}

fun main() {

    // apply

    val c = College(12,"ADIT")

    // re-assigning a value of object

    // apply is used when u want to apply value to the object
    // apply function is used when we want to modify object values

    val c1 : College = c.apply {

        this.id = 34
        name = "GCET"

    }

    c.display()
    c1.display()

    // in apply funcion context object is represented as this

    // apply function returns context object

    // apply function modifies the original object




}