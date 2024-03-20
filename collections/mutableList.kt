package bsic.collections




fun main(){
    val stack = ArrayDeque<Int>()


    // we can change the items
    val mutableArraylist = mutableListOf<Any>("Name","number","hours",3,6)

    mutableArraylist.add(1,"NewElement")
    mutableArraylist.add("element at last index")

    println("The index of the element number is: "+mutableArraylist.indexOf("Raja"))

    // This is for key value // List keeps duplicates
    for((_,v) in mutableArraylist.withIndex()){
        print("${v} ") // Name number hours 3 6
    }

    println()


    // mutableSetOf remove all the duplicates in the array
    val mutableSet = mutableSetOf("Orange","mango","mission mangel ", 2,4,5,4,2,4,"Orange",5,6)

    for ((_,v) in mutableSet.withIndex()){
        print("${v} ") // Orange mango mission mangel  2 4 5 6
    }



    val mutableMap = mutableMapOf( "one" to "valueone", 2 to "changetwo" , "three" to 7)

    println()
    for((i,v) in mutableMap){

        print("${i} ") // one,   2 , three
        print("${v} ") // valueone , vhangetwo, 7
        println()
    }

    println("======================================")

    // we can modify the element
    mutableMap.put(1,"Praveen")
    // add one more element in the list
    mutableMap.put(4,"Abhi")
    mutableMap.put(2,"This value is over ride due to same key")

    for((i,v) in mutableMap){

        print("${i} ") // one,   2 , three
        print("${v} ") // valueone , vhangetwo, 7
        println()
    }


    mutableArraylist.contains(0)
    



}
