package mar07

class Student(id :Int,name:String){  // (Any) parent class of all class

    val id : Int
    val name : String

    init {

        this.id = id
        this.name = name

    }

    override fun toString(): String {
        return "id is $id and name is $name"
    }

    // hashcode // is an integer number given by compiler to each every object

    // equals()

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        // we need cast any class object into student   // this
        val s1 : Student = other as Student
        return (s1.id==this.id) && (s1.name==this.name)
    }

}

fun main() {

    val s : Student = Student(12,"jaimin")
    val s1 : Student = Student(13,"jaimin")

    println(s)

    println(s.hashCode())

    println(s.equals(s1))


    // toString is to convert object into string

    val number = 34

    println(number.toString())

}