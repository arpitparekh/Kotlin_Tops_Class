package mar10

fun main() {

    val a = 23

//    if(a<10){
//
//        println("value is less then 10")
//
//    }else{
//
//        println("value is not less less then 10")
//    }

    // require
    // require explicitly throws an error if
    // condition is wrong
    // if true then do not run the block


    require(a<10){

        println("less then 10")

    }

    println("body............")

}