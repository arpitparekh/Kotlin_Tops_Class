package feb16

fun findFacto(number : Int) : Int{

    if(number>0){
        return number * findFacto(number-1)
    }else{
        return 1
    }

}

// 5 * facto(4){ 4 * facto(3){ 3 * facto(2){ 2 * facto(1){ 1 * facto(0){ 1 } } } } }

fun main() {

    // Find Factorial Of Number using recursive

    println("Factorial is ${findFacto(5)}")

}