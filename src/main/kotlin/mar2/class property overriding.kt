package mar2

open class K{

    open val a = 0
    open val b = 0

    open fun display(){

    }
}

class L : K(){

    override val a = 1  // we can also override property inside a child class
    override val b = 1

    override fun display(){

    }

}

fun main() {


}