package mar14

sealed class Car(val model : String ){

    class Toyota : Car("toyota")
    class Bmw : Car("bmw")

}

class Maruti : Car("maruti")

fun display(car : Car){

    when(car){

        is Car.Bmw -> println("car is bmw")
        is Car.Toyota -> println("car is toyota")
        is Maruti -> println("car is maruti")

    }

}

fun main() {

    val obj1 = Car.Bmw()
    val obj2 = Car.Toyota()
    val obj3 = Maruti()

    display(obj1)
    display(obj2)
    display(obj3)


}