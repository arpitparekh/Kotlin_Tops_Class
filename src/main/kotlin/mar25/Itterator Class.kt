package mar25

fun main() {

    // Iterator class // to iterator an elements from collection

    // to print the list  // for

    val lst = ArrayList<Int>()

    lst.add(12)
    lst.add(13)
    lst.add(14)
    lst.add(15)

    for(i in lst.indices){
        println(lst[i])
    }

    println("------------------------")

    lst.forEach{
        println(it)
    }

    println("--------------------------")

    val iter : Iterator<Int> = lst.iterator()

    while(iter.hasNext()){

        println(iter.next())

    }

    println("--------------------------")

    println(lst.last())

    lst.removeIf {
        it < 14
    }

    println(lst)

    lst.add(66)
    lst.add(77)
    lst.add(88)

    println("--------------------------")

    var lst2 = lst.subList(1,4)

    println(lst2)

    println("--------------------------")





}