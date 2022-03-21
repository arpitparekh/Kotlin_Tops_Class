package mar01

class Diary(pages :Int,title :String){

    val pages : Int
    val title : String

    constructor(a :Int) : this (34,"walden-thoreau")

    // this keyword can also be used to call a constructor


    init {

        // this refers to the current class object // this keyword

        this.pages = pages
        this.title = title   // property
    }

    fun display(){

        println("no pages are $pages and title is $title")
    }

    fun show(){

        this.display()   // method

    }
}

fun main() {

    // keywords

    // this  // super  // final  // static

    // this keyword

}