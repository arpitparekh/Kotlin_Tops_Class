package mar11

import mar10.number


class Data{

    var number = 2
    var number2 = 0

     // kotlin getter setter

}

enum class Car(var number2 : Float){

    HONDA(10.0f),MARUTI(20.0f),BMW(30.0f),MISUBISHI(90.0f);


    @JvmName("demo")    // use java syntext in kotiln  library
    fun getNumber2() : Float{

        return number2
    }
}

fun main() {

    // we can also give value to each every constant

    println(Car.BMW.getNumber2())



}