package mar07

class College(name:String,isOpen : Boolean){

    val name : String
    val isOpen : Boolean

    init {

        this.name = name
        this.isOpen = isOpen
    }
}

fun College.display(){ // this is an extension function

    println(name)
    println(isOpen)
}

fun main() {

    // named function

    // extension function
    // using in user defined class

    val c = College("ADIT",false)
    c.display()

}