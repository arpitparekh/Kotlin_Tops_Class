package mar28

class MyThread : Thread(){

    override fun run() {

        println(Thread.currentThread().name)

    }

}

class AnotherThread : Runnable{
    override fun run() {

        println(Thread.currentThread().name)
    }


}

fun main() {

    // Thread

    val th = MyThread()
    th.start()

    val t = AnotherThread()
    val thread = Thread(t)
    thread.start()


    Thread{
        Thread.sleep(4000)
        println(Thread.currentThread().name)

    }.start()
}