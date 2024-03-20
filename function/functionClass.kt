package bsic.function



 interface FunctionS {

    fun doSum(arraySum: Array<Int>):Int{
        return 1
    }
}

class FunEx : FunctionS {

    override fun doSum(arraySum: Array<Int>):Int {

        return arraySum.sum()

    }

    fun remainderD(numOne : Int, numTwo:Int) : Int{

        val result = numOne.rem(numTwo)

        return result

    }

    /**
     * This function compares two integer values and returns the result.
     *
     * @param valueOne The first integer value to compare.
     * @param valueTwo The second integer value to compare.
     * @return An integer value indicating the result of the comparison:
     *         - Negative if valueOne is less than valueTwo.
     *         - Zero if valueOne is equal to valueTwo.
     *         - Positive if valueOne is greater than valueTwo.
     */
    fun findBiggerNum (valueOne: Int, valueTwo: Int) : Int{
        val result = valueOne.compareTo(valueTwo)

        return result
    }



    fun mul(a: Int, b: Int): Int {
        var number = a.times(b)
        return number
    }

}

fun main() {

    val arraySum = arrayOf<Int>(1,2,3,4,)
    val numberOne = 30
    val numberTwo = 4

    val funObj = FunEx()

    // Get sum of array List
    println(funObj.doSum(arraySum))  //  10

    // Get remainder
    println(funObj.remainderD(numberOne,numberTwo)) // Answer 2 - remainder = 2

    // Get Find Big Number
    println(funObj.findBiggerNum(numberOne,numberTwo)) // Answer 1



    // Get Multiplication using a.times(b) function
    println(funObj.mul(3,5))



//    The list of different standard library functions and their use –
//
//    sqrt() – Used to calculate the square root of a number.
//    print() – Used to print a message to standard output.
//    rem() – To find the remainder of one number when divided by another.
//    toInt() – To convert a number to integer value.
//    readline() – Used for standard input.
//    compareTo() – To compare two numbers and return boolean value.



}