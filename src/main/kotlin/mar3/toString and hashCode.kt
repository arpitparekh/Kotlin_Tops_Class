package mar3

class Demo(a :Int,name:String){

    val a :Int

    val name : String

    init {

        this.a =a
        this.name=name
    }

    override fun toString(): String {
        return "id is $a and name is $name"
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }
}

fun main() {

    val d = Demo(12,"data")

    val data : String = d.toString()

    println(data)

    println(data.hashCode())


}