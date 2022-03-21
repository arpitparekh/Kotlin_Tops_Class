package mar14

sealed class College{

    // sealed class provides strict heirarchy of classes
    // we can only inherit sealed class in same file
    // bounded class

    class Student() : College(){



    }

    class Books() : College(){


    }

}

class Demo : College(){


}

fun main() {

    var obj : College.Student =  College.Student()

}