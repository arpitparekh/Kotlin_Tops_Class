package feb24

open class A(val n : Int)

class B(n : Int) : A(n){

    fun display(){

        println(n)

    }
}

fun main() {

    val b = B(23)

    b.display()

}