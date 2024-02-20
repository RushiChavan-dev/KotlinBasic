package bsic.str


class ArrayList{

    val arrayOne = arrayOf(1,2,34,45,3)
    var arrayTwo = arrayOf("Name","Number","Value","Composition")
    val arrayNameSize = arrayOf<Int>(1,2,3,4,5,4)

    fun function1(){
        for( i in arrayOne){
            println(i)
        }
        println("-----Array with index-----")

        for( (i,v) in arrayOne.withIndex()){
            println("the Index $i and value $v")
        }
    }



    fun arrayTwo(){
        println("----------")

        for(i in arrayTwo){
          println(i)
      }
    }


    fun arrayForLoop(){
        // read only, fix-size
        var collection = listOf(1,2,3,"sd", "dsa", "setasdOf")

        for (element in collection) {
            println(element)
        }

    }

    fun arraySize(){

        for(i in arrayNameSize.indices){
            println(arrayNameSize[i])
            if(i == 3){
                arrayNameSize.set(5,10)
            }
        }
    }


}

fun main(){

    val createArray = ArrayList()

    createArray.function1()
    createArray.arrayTwo()
    createArray.arrayForLoop()
    createArray.arraySize()

}