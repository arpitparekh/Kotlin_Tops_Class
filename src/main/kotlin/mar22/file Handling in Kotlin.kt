package mar22

import java.io.File

fun main() {

// exception handling

// file handling

    // File  // create // update // delete

    val file = File("/home/arpit/hello.txt")  // \n  \t  \b

    file.createNewFile()

//    file.writeText("This is My file")  // kotlin 1.4.0

    file.appendText("This is Append Message")

    println(file.readText())

    println(file.length())

    println(file.isFile)

    println(file.absolutePath)

    println(file.canRead())

    println(file.canWrite())
//
//    val file2 = File("/home/arpit/MyFolder")
//
//    file2.mkdir()
//
//    val file3 = File(file2,"demofile.txt")
//
//    file3.createNewFile()


}