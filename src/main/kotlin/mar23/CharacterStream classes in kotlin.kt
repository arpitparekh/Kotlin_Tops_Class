package mar23

import java.io.FileReader
import java.io.FileWriter

fun main() {

    // Stream

    // Character Stream

    // FileReader  // FileWriter

    try{

        val fw : FileWriter = FileWriter("/home/arpit/demo.txt")

        val data = "Hello Student"

        fw.write(data)

        fw.close()

        println("File Written Successfully")

        ///////////////////////////////////////////////////////

        val fr = FileReader("/home/arpit/demo.txt")

//    fr.read()   // returns ascii value of character  // -1

        do{
            val number : Int = fr.read()  // -1

            if(number!=-1){

                print(number.toChar())

            }else{

                break
            }

        }while (true)

    }catch (e : Exception){

        println(e)
    }
}