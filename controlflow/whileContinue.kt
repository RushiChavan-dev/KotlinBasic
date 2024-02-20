package bsic.controlflow


fun main(){


//    outer@ for(i in 1..5 ){
//
//        println("--------------")
//        println(i)
//        println("-------*******-------")
//
//        inner@ for (j in 1 .. 20){
//            if (i > 3){
//                continue@inner
//            }
//            println(j)
//
//
//        }
//    }


    outer@ for (num1 in 4 downTo 1) {

        println("--------++++-------")
        println(num1)
        println("--------++++-------")
        inner@ for (num2 in 4 downTo 1) {
            if (num1 <= 3){
                continue@outer
            }
            println("num1 = $num1; num2 = $num2")
        }
    }


}