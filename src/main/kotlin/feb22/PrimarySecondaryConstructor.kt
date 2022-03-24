package feb22

class Emp(data : String){

    // default

    init {  // to initialize primary constructor value we use init block

        println(data)

    }

//    constructor() {
//
//        println("This is Secondary Constructor")
//
//    }
//
//    constructor(name : String){
//
//        println(name)
    }

fun main() {

    // primary // secondary

    val e = Emp("Hello")
}