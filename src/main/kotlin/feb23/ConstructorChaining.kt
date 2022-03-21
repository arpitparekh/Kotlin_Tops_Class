package feb23

open class Parent{

}

class Child : Parent(){


}

fun main() {

    val c = Child()   // child class constructor always calls parent class default constructor
}