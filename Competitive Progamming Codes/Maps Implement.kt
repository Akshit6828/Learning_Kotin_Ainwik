fun main() {
    val list = listOf("B", "A", "A", "C", "B", "A")
    val frequencyMap: MutableMap<String, Int> = HashMap()

    for (s in list) {
        var count = frequencyMap[s]
        if (count == null) count = 0
        frequencyMap[s] = count + 1
    }

    println(frequencyMap)
}
