package mar15

fun main() {

    val data : String? = null

      // !!  not null asserted

    try{

        try{

            println(data!!.length)

        }catch (e : Exception){ // null pointer exception

            println(data!!.uppercase())

        }

    }catch (e : Exception){

        println(e)

    }

}