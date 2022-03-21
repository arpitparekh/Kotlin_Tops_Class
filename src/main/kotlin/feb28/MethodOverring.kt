package feb28

open class Faculty(name : String,no :Int){    // this keyword

    var name : String = ""

    var no : Int = 0

    init {

        // this refers to the current class object

        this.name = name
        this.no = no
    }

    // method overriding
    // concept of inheritance is present
    // function name and parameter both have to be same
    // access modifier must be broad

    open fun show(number : Int){

        println("This is parent class method")

    }


}

class Student(roll_no : Int) : Faculty("arpit",34){

    val roll_no : Int

    init {

        this.roll_no = roll_no
    }

    fun display(){

        println("Student roll is $roll_no faculty name is $name faculty no is $no")
    }

    override fun show(number : Int){   // rewriting a method in child class

        println("This is child class method")

    }
}

fun main() {

    val s = Student(34)

    s.display()

    s.show(34)

    val f = Faculty("pratik",45)

    f.show(45)


}