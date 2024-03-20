package bsic.linkedlist

import kotlin.system.exitProcess

data class Node<T>(var data: T, var refToNext: Node<T>? = null)

class ListNode(var number : Int){
    var refToNext: ListNode? = null
}

fun main(){
    val one = ListNode(1)
    val two = ListNode(2)
    val three = ListNode(3)
    val four = ListNode(4)
    val five = ListNode(5)

    // Connecting nodes to form a linked list
    one.refToNext = two
    two.refToNext = three
    three.refToNext = four
    four.refToNext = five

    var currentNode: ListNode? = one


    while (currentNode != null) {
            print("${currentNode.number} ")
            currentNode = currentNode.refToNext
    }


}