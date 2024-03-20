package bsic.str


fun main(){

    // Create Empty String
    var emptyString = String()
    println(emptyString)
    emptyString = "Hello World"

    // returns the length of the string
    println(emptyString.length)

    // returns the char at specify index
    println(emptyString[3])


    println("------------")
    // subSequence(start, end):Returns a substring starting from start and ending at end but excluding end.
    println(emptyString.subSequence(3,8))  // Output :-  lo Wo

    println("------Compare to Rushi------")

    println(emptyString.compareTo("R")) // Output :- -10

    println("-----Compare to Hello World-------")

    println(emptyString.compareTo("Hello World")) // Output :- 0



//    \” : for double quote
//    \r : for carriage return
//    \n : for newline
//    \’ : for single quote
//    \\ : for backslash
//    \t : for tab
//    \b : for backspace

    println("This is a \"double quoted\" string.")  // This is a "double quoted" string.

    println("------carriage Return ------")
    println("Hello\r ramsome  Big biss")  // World  -  this \r : for carriage return

    println("Hello\nWorld")  // Hello
                             // World

    println("This is a \'single quoted\' string.")  // This is a 'single quoted' string.
    println("This is a backslash: \\")  // This is a backslash: \
    println("Name:\tJohn\tAge:\t25")  // Name:   John    Age:    25
    println("Hello\bWorld")  // HellWorld // Here we are remove the last word in i.e. "O"





//    Structural Equality
// Structural equality is checked through the == operator and its inverse != operator.
// By default, the expression containing x==y is translated into the call of equals() function for that type.
//
//    Referential Equality
// The referential equality in Kotlin is checked through the === operator and its inverse !== operator.
// This equality returns true only if both the instances of a type point to the same location in memory.
// When used on types that are converted into primitives type at runtime, the === check is converted into == check and !== check is converted into != check.

    var x = "GeeksForGeeks"
    var y = "GeeksForGeeks"
    var z = "Geeks"
    println(x==y) // true
    println(x===y) // true , as both are pointing to the same StringPool
    println(x==z)  //false since values are not equal
    println(x===z) // false



    println()
    println("------String Split ------")

    var str1 = "My name is rushi"

    val splited = str1.split("n")

    println(splited)



    println("------Regex Patern ------")
    val str = "Hello World!123How456AreYou"
    val parts = str.split(Regex("[!\\d]+")) // Split the string by non-digit characters or '!'
    println(parts)
}