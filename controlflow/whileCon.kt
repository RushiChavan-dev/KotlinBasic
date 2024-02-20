package bsic.controlflow

class  CallWhile  {

    fun checkWhileCon(a:Int):Boolean{


        if (a < 25){
            println(a)
            return true
        }else{
            return false
        }


    }



}

fun main(){

    val callWhile = CallWhile()

    var a = 20
    var b = 20

    while (callWhile.checkWhileCon(a)){

        println("While loop going on ${++a}  and ${a} and current value ${a++}  and later val ${a}")
    }

    do {
        println("Print 1 time do while")

    }while (b == 21)

}