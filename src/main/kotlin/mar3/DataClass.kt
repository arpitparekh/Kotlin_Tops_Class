package mar3

class Student(id :Int,name : String){

    val id : Int
    val name : String

    init {

        this.id = id
        this.name = name

    }

    override fun toString(): String {
        return "id is $id and name is $name"
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

}

fun main() {

    // this  // super // companion object { } // final

    // data class

    // Any class is the super class of all the class

    // hashcode // is the int number given by compiler to each and every object

    val s = Student(12,"chaitanya")

    println(s)

    println(s.hashCode())

    val a = Any()


}