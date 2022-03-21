package mar10

class Demo(var a : Int,var b:Int){fun display() :String = "$a and $b" }

class Student(var name: String,var address : String){
    fun show(){
        println("name is $name \naddress is $address")
    }
}

fun main() {

    // scope function

    // let  // apply  // with // run  // also

    /*

        let   // null safety

        context object - > it
        return -> lawmbda result

        apply // to reinitialize object with another value

        context object - > this
        return -> context object

        with  // to used to display object

        context object - > this
        return -> lambda result

        run

        // used to display property of nullable type object
        // combination of with and let
        // run handles nullable objects

        context object - > this
        return -> lambda result

        .............also   // pending   // show in collection...............
        .............lazy   // pending   // generics ................

     */

    ////////////////////////////////////////////////////////

    val name : String? = "hello"

    val result =  name?.let {

        name.lowercase()
        name.length
        name.uppercase()
        name.substring(0,3)

        23

    }

    println(result)

    ///////////////////////////////////////////////////////////////////////

    val d = Demo(34,23)

     val d2 = d.apply {

        a = 12
        b = 10

    }

    println(d.display())
    println(d2.display())

    ///////////////////////////////////////////////////////////////

    // with  // higher order



    val result2 =  with(d){

        println(a)
        println(b)

        34

    }

    println(result2)

    //////////////////////////////////////////////////////////////

    val s : Student? = null // null object

    s?.apply {

        s.name="Hello"
    }

    with(s){

        this?.show()
        this?.name
    }

    s?.run {

        show()
        println(name)

    }



}