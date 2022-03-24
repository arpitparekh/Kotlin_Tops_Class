package feb4

fun main() {

    for(i in 1..10){

        if(i==5){

            continue   // skips the itteration
        }
        println(i)

    }

    println()

    var f = 1

    while(f<5){                  // 1

        if(f==3){
            f++        // 4
            continue

        }
        f++    // 2  // 3
        println(f)  // 2  // 3 // 5

    }

}