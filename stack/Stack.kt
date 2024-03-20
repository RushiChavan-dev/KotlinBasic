package bsic.stack

interface Stack<T:Any> {

    val count:Int
    val isEmpty:Boolean
        get() = count == 0

    fun push():T

    fun pop(element:T)

    fun peek():T
}