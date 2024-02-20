package bsic.controlflow


class ArrayList{

    val arrayOne = arrayOf(1,2,34,45,3)


    fun function1(){
        for( i in arrayOne){
            println(i)
        }
    }

    fun arrayTwo(){

    }


}

fun main(){

    val createArray = ArrayList()

    createArray.function1()

}