package bsic.collections


fun main(){

    // Lists – Ordered collections of elements that allow duplicates.
    val fruits = listOf(1,2,3,4,5,6,6,3,2,4,2)

    print(fruits[2])
    print(fruits.last())


    val fruitList = listOf("apple", "banana", "orange", "grape")

    val filterList =  println( fruitList.filter { it.startsWith("o") })



}