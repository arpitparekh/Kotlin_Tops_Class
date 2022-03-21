package mar15

fun main() {

    val name = "Hello"

    try{

        println(name[60])

    }catch(e : ArithmeticException){

        println(e.message)

    }catch (e : ArrayIndexOutOfBoundsException){

        println(e.message)

    }catch (e : StringIndexOutOfBoundsException){

        println(e.message)
    }


}