package mar01

class Phone(a : Int){

    val a :Int

    init {

        this.a = a
    }

    fun display(){

        println("value of a is $a")
    }

    fun displayObject( obj : Phone){   //  i can also pass object is function

        println("value of given object is ${obj.a}")

    }

    fun returnObject() : Phone { // return in class means function is return that class object
        val p = Phone(66)

        return p

    }

    fun createObject() : Int{

        val  p =Phone(55)

        return p.a

    }

    fun showObject() : Phone{

        return this    // this refers to the current class object
    }

}

fun main() {

    val p = Phone(34)
    p.display()

    val p1  : Phone = Phone(44)

    p1.displayObject(p1)

    val p2 : Phone =  p1.returnObject()

    p2.display()

    println(p2.createObject())


    //////////////////////////////////////////////////////////

    val p3 = Phone(34)

    val p4 : Phone = p3.showObject()  // i can create a copy of an object

    p3.display()
    p4.display()

}