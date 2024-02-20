package bsic



class MySortedMap<K : Comparable<K>, V> {

    private val keys: MutableList<K> = mutableListOf()
    private val values: MutableList<V> = mutableListOf()

    fun put(key: K, value: V) {
        val index = keys.binarySearch(key)
        if (index >= 0) {
            keys[index] = key
            values[index] = value
        } else {
            val insertIndex = -index - 1
            keys.add(insertIndex, key)
            values.add(insertIndex, value)
        }
    }

    fun get(key: K): V? {
        val index = keys.binarySearch(key)
        return if (index >= 0) values[index] else null
    }

    fun entries(): Set<Map.Entry<K, V>> {
        val entrySet = mutableSetOf<Map.Entry<K, V>>()
        for (i in keys.indices) {
            val key = keys[i]
            val value = values[i]
            entrySet.add(object : Map.Entry<K, V> {
                override val key: K
                    get() = key
                override val value: V
                    get() = value
            })
        }
        return entrySet
    }
}


class SortRushi(){

}

fun main(){
    println("This is my simple code")

    println("259 to byte: " + (259.toByte()))




    // Creating a TreeMap, which implements SortedMap
    val unsortedMap = mapOf(
        3 to "C",
        1 to "A",
        2 to "B"
    )

    val mymap = mapOf<Int,String>(
        2 to "4",
        4 to "goruhi",
        6 to "Ramesh"
    )




    println(mymap)
    println(unsortedMap)

    val sortedMapM = MySortedMap<Int, String>()

    sortedMapM.put(3, "C")
    sortedMapM.put(1, "A")
    sortedMapM.put(2, "B")

    println("Elements of the SortedMap:")
    for ((key, value) in sortedMapM.entries()) {
        println("Key: $key, Value: $value")
    }
}