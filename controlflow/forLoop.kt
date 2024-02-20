package bsic.controlflow

//In Kotlin, for loop is used to iterate through the following because all of them provides iterator.
//Range
//Array
//String
//Collection



fun main(){



    for (i in 1..10){
        println(i)
    }

    println("----Even Number----")

    // Even Number
    for(i in 1..20 step 1){
        println(i)
    }

    println("----Odd Number----")

    // Odd number
    for(i in 1..20 step 2){
        println(i)
    }

    println("----Reverse Order----")

    for( i in 6 downTo -3){
        print(i)
    }

    println("----Invalid Reverse Order----")

    // Invalid Reverse Order
    // Not allowed it will print nothing
    for(i in 5..1){
        println(i)
    }


    println("-------")




}