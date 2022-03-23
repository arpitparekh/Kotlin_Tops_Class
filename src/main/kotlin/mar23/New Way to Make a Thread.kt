package mar23

fun main() {

    println("Hello Student")

    println(Thread.currentThread().name)

   Thread {

    println(Thread.currentThread().name)

   }.start()

}