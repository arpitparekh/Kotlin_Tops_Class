package mar01

import org.jetbrains.annotations.NotNull
import org.jetbrains.annotations.Nullable

abstract class Value{

    val a = null


    val b = 13

    abstract fun add(n1 :Int,n2 : Int) : Int


}

class Calculation : Value(){

    override fun add(n1: Int, n2: Int) = n1+n2
}

fun main() {

    val c = Calculation()
    println("sum of two number is ${c.add(12,13)}")
}