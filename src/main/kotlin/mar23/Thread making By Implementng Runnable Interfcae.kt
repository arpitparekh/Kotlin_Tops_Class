package mar23

class MyNewThread : Runnable{

    override fun run() {

        for(i in 1..20){

            Thread.sleep(2000)
            println("Thread Name : ${Thread.currentThread().name}")

        }

    }
}

fun main() {

    val t = MyNewThread()

    val th = Thread(t)

    th.start()

    for(i in 1..20){

        Thread.sleep(2000)
        println("Thread Name : ${Thread.currentThread().name}")

    }

}