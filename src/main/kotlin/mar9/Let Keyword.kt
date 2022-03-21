package mar9

class Student(name:String){

    val name : String

    init {

        this.name = name

    }

}

fun main() {

    val number : Int? = 23

    val data =  number?.let {

        it.plus(23)
        it.minus(10)

        23
    }

    println(data)



}