package mar21

class AgeISNotValidException(val msg : String) : Exception(msg)

class Vote(var age : Int){

    fun checkAge(){

        if(age<18){

            // i want to throw my own exception

            throw AgeISNotValidException("Age is Below 18")

        }else{

            println("eligible")
        }

    }

}

fun main() {

    // throw  and throws

    // throw keyword is used to throw exception expicitly

//    throw ArithmeticException()

    // Custom exception

    val v = Vote(12)

    try{
        v.checkAge()
    }catch (e : AgeISNotValidException){

        println(e.message)
    }

//    val name : String? = null

//    val data = name ?: throw Exception()  // elvis operator

//    println(data)


}