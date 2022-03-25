package mar25

fun main() {

    // collection framework

    // collection is group of objects

//    var arr = intArrayOf(12,12,1234,456)  // group of primitive datatype

    // make a group of object and represent them with a single object

    // fixed size  //

    // ArrayList  //  HashSet  // HashMap

    val list = arrayListOf<Int>()  // arraylist is not a fixed size

    list.add(12)
    list.add(45)
    list.add(56)
    list.add(78)
    list.add(45)

    // list is a dynamic memory storage

    println(list)

//    println("Enter How Ammount of data u want to store")
//
//    val no : Int? = readLine()?.toInt()
//
//    val myList = ArrayList<Int>()
//
//    for(i in 1..no!!){
//
//        print("Enter Number :")
//
//        val number = readLine()!!.toInt()
//
//        myList.add(number)
//
//    }
//
//    println("Your list is $myList")
//
//    myList.add(1,45)
//
//    println("Your list is $myList")

    val lst = ArrayList<String>()

    lst.add("Kotlin")
    lst.add("Java")
    lst.add("Dart")
    lst.add("Flutter")

    println(lst)

    lst.remove("Kotlin")

    println(lst)

    val lst2 = ArrayList<String>()

    lst2.add("C")
    lst2.add("Angular")

    lst.addAll(lst2)

    println(lst)

    println(lst.get(2))

    println(lst.contains("Java"))

    // for each is higher order function

    lst.forEach{

        println(it)
    }

    lst.forEach {

        println(it + " data")
    }


}