package feb7

fun main() {

    // prime

    // number that divide by itself only or by 1

    // 2 / 3 /5 / 7 / 11 // 13 // 17 / 19 / 23

    val n = 43

    var bool = true

    for(i in 2..42){

        if(n % i == 0){  // not prime

            bool = false
            break
        }
    }

    if(bool){

        println("Prime")
    }else{
        println("Not prime")
    }

}