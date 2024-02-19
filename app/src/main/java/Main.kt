import `1`.Article

fun main () {
    val article1: Article = Article("James", "Webdesign in 2024")
    val article2: Article = Article("Lars", "Drumming on stage")
    val article3: Article = Article("Maya", "How to live forever")
    val article4: Article = Article("Henry", "Playing soccer in the 2000's")
    val article5: Article = Article("Garrosh", "Being a hotheaded leader")

    val arrayList: ArrayList<Article> = arrayListOf(article1, article2, article3, article4, article5)
    println(arrayList)
}