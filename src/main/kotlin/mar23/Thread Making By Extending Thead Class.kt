package mar23

class MyThread : Thread(){

    override fun run() {

//        println("Thread Name : ${Thread.currentThread().name}")  // background thread

        for(i in 1..20){

            Thread.sleep(2000)
            println("Thread Name : ${Thread.currentThread().name}")

        }

    }

}


fun main() {


    for(i in 1..20){

        Thread.sleep(2000)
        println("Thread Name : ${Thread.currentThread().name}")

    }

    val th = MyThread()

    th.start()

}