package feb23

open class A{

    var no : Int = 0
}

open class B : A(){



}
class C : B(){


}

////////////////////////////////////////////////////////////////////////////////////

open class P{

}

class Q : P(){


}

class R : P(){


}

/////////////////////////////////////////////////////////////////

open class J{

}
open class K{

}
//class L : J(),K(){
//
//
//}

fun main() {

    // single inheritance   // multi level inheritance  // hierarchical inheritance

    // multiple inheritance // koltin does not support multiple inheritance

    // diamond problem

    // hybrid inheritance

    // we can only inherit one class into another class

    val c = C()

    c.no = 34

}