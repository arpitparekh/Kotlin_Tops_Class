package feb16

fun find(data : String){

    // data = "Tops Technology"

    for(i in data){

        if( (i.code in 97..122) || (i.code in 65..90) )       {

            println("Alphabet is = $i")

        }else if(i.code in 48..57){

            println("Number is = $i")

        }else{

            println("Spacial Character is = $i")
        }

    }


}

fun main() {

    find("Tops Technology 1212 $%&")


//    val i = 5
//
//    val ch = '5'   // ASCII 53

}