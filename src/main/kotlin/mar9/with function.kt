package mar9

class Demo(var a : Int,var name : String)

fun main() {

    // with function // higher Order function

    // is used to display object content

    val d = Demo(34,"This is name")

    val value = with(d){

        println(a)
        println(name)
        23
    }

    // in with object is represented as this
    // and with function returns lambda result

    println(value)





}