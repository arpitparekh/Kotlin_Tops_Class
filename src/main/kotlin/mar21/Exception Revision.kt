package mar21

fun main() {

    try{
        println(12/0)
    }catch (e : Exception){

        println(e)

    }finally {
        println("This is finally Block")
    }

}