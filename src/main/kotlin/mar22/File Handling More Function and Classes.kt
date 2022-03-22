package mar22

import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream


lateinit var file : File

fun main() {

    // Stream

    // sequence of data

    // ByteStream

    // CharacterStream



    try{

        file = File("/home/arpit/fileHandling.txt")

        // Byte Stream

        // FileOutPutStream  // write
        // FileInputStream   // read

        val os = FileOutputStream(file)
        val data = "Tops"
        os.write(data.toByteArray())

        os.close()  // clear heap memory of stream object to avoid memory leak

        println("File Write Successfully")

    }catch (e : Exception){

        println(e)
    }

    // file handling
    // database operations
    // long running task
    // network operation
    // network services


    /////////////////////////  read from file  ////////////

    val ins : FileInputStream = FileInputStream(file)

    val array = ByteArray(ins.available())

    ins.read(array)

    val str = String(array)

    println(str)
}