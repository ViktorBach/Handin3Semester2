package `5`

val mapOfWords: MutableMap<String, Int> = mutableMapOf()
fun findRepeatingElement (stringArray: List<String>) {
    for (word in stringArray) {
        val wordCount = mapOfWords.getOrDefault(word, 0)
        mapOfWords[word] = wordCount + 1
    }
    for ((word, count) in mapOfWords) {
        println("Word: $word, Count: $count")
    }
}