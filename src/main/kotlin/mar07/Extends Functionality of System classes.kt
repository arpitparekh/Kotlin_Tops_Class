package mar07

fun String.addThreeString(str1 : String,str2:String) : String{

    return this+str1+str2
}

fun main() {

    // String

    val name = "tops"

    val name2 = "Tech"

    val name3 = "nology"

    println(name.addThreeString(name2,name3))

}