package feb28

import java.util.Scanner

abstract class Area(var n : Int){  // abstract class is incomplete class

    abstract fun findArea(a: Int,b:Int)

    fun display() {

        println(n)
    }
}

class Circle : Area(12){

    override fun findArea(a: Int, b: Int) {

        println(3.14*a*b)
    }
}

fun main() {

    val c = Circle()

    println("enter the radius of circle")

    val sc = Scanner(System.`in`)

    val radius = sc.nextInt()

    c.findArea(radius,radius)

    // we can create constructor of an obstract class but not an object

//    c.findArea()

}