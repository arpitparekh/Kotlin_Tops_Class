package mar07

fun main() {

    // we cast any class object into another class object if their content are same

    // is  // as

    // is keyword is used to cast object implicitly
    // is keyword is used in condition
    // as explicitly

    val name : Any = "data"

//    if(name is Int){  // automatically cast object into string  // implicit casting
//
//        println("object is int")
//    }else{
//
//        println("object is not int")
//    }

    /////////////////////////   as  /////////////////////////

    val number : String = name as String

    println(number)

    //////////////////////////////////

    val str = "3434"  // this can be converted to int

    val n = str.toInt()

    println(n)

    /////////////////////////////////////////////////


    // class // object // constructor // inheritance // polymorphism
    // abstraction  // encapsulation


}