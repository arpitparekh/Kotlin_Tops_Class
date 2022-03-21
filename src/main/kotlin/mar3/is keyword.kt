package mar3

fun main() {

    val data : Any = "demo data"   // as operator

    val name :String = data as String  // explicit casting

    if(data is String){   // implicit casting

        println("$data is string")
    }else{

        println("$data is not string")

    }

}