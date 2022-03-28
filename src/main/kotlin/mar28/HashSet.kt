package mar28

fun main() {

    // HashSet

    // is similar to arraylist

//    val set = HashSet<Int>()

    // Hashset  // Hashing algorithm

    // Add is entered on the basis of hashcode

    // hashset does not include duplicate values



    val set = hashSetOf<Int>()

    set.add(23)
    set.add(55)
    set.add(67)
    set.add(89)
    set.add(23)
    set.add(0)

    println(set)
}