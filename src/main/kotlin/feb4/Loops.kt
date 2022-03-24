package feb4

fun main() {

    // while  // do while  // for // for each

    // increment // decrement operator

    // ++   --

    var x =12

    while(x<20){

        println("Hello")
        x++
    }
        // x = 20
    //////////////////////  do while  ///////////////////////////

    do{

        println("Hi")
        x++
    }while(x>30)

    ///////////////////////////////  for  ////////////////////////

    for(i in 1..10 step 2){

        println(i)

    }

    println()   // for new line

    for(i in 10 downTo 1 step 2){

        println(i)
    }
    println()
    ///////////////////////////////////



    for(j in 1 until 10){

        println(j)

    }
    println()

//    for(i in 10 downTo 1)   // downTo and until can't come together

    ////////////////////////////////

    for(i in 1..10 step 2){

        println(i)

    }

    for(i in 1..20 step 3){

        println(i)
    }

    println()

    var  i =1
    var k = 10


    for(j in k downTo i step 2){

        println("value of k is $k")
        println("value of i is $i")
        println("value of j is $j")
        --i
        k++
    }

    println()
}