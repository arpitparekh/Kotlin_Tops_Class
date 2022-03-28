package mar28

fun main() {

    val list = ArrayList<HashMap<String,String>>()  // HashMap objects inside arrayList

    val list2 = ArrayList<Student>()  // user define class objects inside arraylist

    ///////////////////////////////////////

    val map1 = HashMap<String,String>()

    map1.put("name","arpit")
    map1.put("address","ahmedabad")

    val map2 = HashMap<String,String>()

    map2.put("name","ranjit")
    map2.put("address","manninagar")

    list.add(map1)
    list.add(map2)

    println(list)


    ////////////////////////////////////

    list2.add(Student("fenil","gota"))

    list2.add(Student("patil","daman"))

    list2.add(Student("adsadsa","ADASDSA"))

    println(list2)

}