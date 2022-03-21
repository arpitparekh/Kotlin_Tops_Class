package feb24

open class Compney(val cName : String){

    var companyName : String = ""

    init {
        println("This is Company init")
        companyName = cName
    }

}

class Emp(val eName : String) : Compney("Tops"){

    var employeeName : String = ""

    init {
        println("This is Employee init")
        employeeName = eName
    }

    fun display(){

        println("eName is $eName and company name is $cName")

    }
}

fun main() {

    val e  = Emp("vinit")

    e.display()
}