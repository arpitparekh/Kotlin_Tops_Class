package mar22

import java.io.FileReader
import java.io.FileWriter


fun main() {

    // Character Stream  // String

    // FileWriter  // FileReader

    try{
        val fw : FileWriter = FileWriter("/home/arpit/ReadWrite.txt")

        val name : String = "Hello Students"

        fw.write(name)

        println("File Write SuccessFully")

        fw.close()  // do not forget


        ////////////////// read from file  ////////////////////

        val fr = FileReader("/home/arpit/ReadWrite.txt")

        do{

            val  i :Int = fr.read()

            if(i == -1){

                break

            }else{

                print(i.toChar())
            }

        }while (true)

        fr.close()

    }catch (e : Exception){

        println(e.message)
    }



}