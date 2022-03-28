package mar28

fun main() {

    // HashMap

    // Hashmap stores  data in key value pairs

    // HashCode

    val map = HashMap<String,Int>()

    val map2 = hashMapOf<Int,Boolean>()

    val map3 = HashMap<String,String>()

    map3.put("name","arpit")
    map3.put("address","surat")
    map3.put("email","arpit@gmail.com")
    map3.put("phone","123455454")

    map.put("age",23)
    map.put("salary",230000)
    map.put("weight",45)
    map.put("weight",67)

    println(map)

    println(map.get("age"))

    println(map.contains("age"))

    for(key in map.keys){

        println(key)

    }

    for(value in map.values){

        println(value)

    }

    for(data in map.entries){

        println(data)
    }

}