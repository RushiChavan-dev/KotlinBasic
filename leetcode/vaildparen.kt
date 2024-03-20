package bsic.leetcode

class Solution {
    fun isValid(s: String): Boolean {

        val pile = ArrayDeque<Char>()
        var result = false
        val isLengthOdd = s.length % 2 != 0


        if (isLengthOdd) {

        } else {
            for (char in s) {

                when (char) {
                    '(', '[', '{' -> {pile.addFirst(char)}
                    ')' -> {
                        if ( !pile.isEmpty() && pile.first() == '(' ){
                            pile.removeFirst()
                            result = true
                        }else{
                            result = false
                            break
                        }

                    }
                    ']' -> {   if ( !pile.isEmpty() && pile.first() == '[' ){
                        pile.removeFirst()
                        result = true
                    }else{
                        result = false
                        break
                    }

                    }
                    '}' -> {   if ( !pile.isEmpty() && pile.first() == '{' ){
                        pile.removeFirst()
                        result = true
                    }else{
                        result = false
                        break
                    }

                    }
                }

            }
        }


        if(!pile.isEmpty()){
            result = false
        }


        return result

    }
}



