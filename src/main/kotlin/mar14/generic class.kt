package mar14

class Student<T,V>(val name : T,val address : V){

    fun display(){

        println("name is $name and address is $address")
    }
}

fun main() {

    val s = Student(23.45f,false)

    s.display()

}