package feb22


class Travel(n : String,e : Long){

    var name : String = ""    // senario 2
    var expense : Long = 0

    init {

        name = n
        expense = e

    }

    fun print(){

        println(name)
        println(expense)
    }

}

fun main() {

    val t = Travel("Africa",100000)

    t.print()

}