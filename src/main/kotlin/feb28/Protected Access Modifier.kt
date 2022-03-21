package feb28

open class A{

    protected val a : Int = 0
}

open class B : A(){

    open fun display(){

        println(a)

    }
}

class C : B(){

    override fun display(){

        println(a)

    }
}

fun main() {

    val b = B()
    val c = C()

    b.display()
    c.display()

    val a = A()

}