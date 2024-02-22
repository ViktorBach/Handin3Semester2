import `1`.Article
import `2`.FastFood
import `2`.Pizza
import `2`.Sandwich
import `3`.Mazda
import `4`.RedditFrontPage
import `4`.RedditPost
import `5`.findRepeatingElement

fun main () {
    // 1. Articles
    val article1: Article = Article("James", "Webdesign in 2024")
    val article2: Article = Article("Lars", "Drumming on stage")
    val article3: Article = Article("Maya", "How to live forever")
    val article4: Article = Article("Henry", "Playing soccer in the 2000's")
    val article5: Article = Article("Garrosh", "Being a hotheaded leader")

    val arrayList: ArrayList<Article> = arrayListOf(article1, article2, article3, article4, article5)
    println(arrayList)

    // 2. Fast Food
    val subway: Sandwich = Sandwich(15,10)
    println(subway.fryFries())
    val mcDonalds: Burger = Burger(30, 23)
    println(mcDonalds.takeAway())
    val lucaPizzeria: Pizza = Pizza(10, 19)
    println(lucaPizzeria.toString())
    val arrayOfFastFood: Array<FastFood> = arrayOf(subway, mcDonalds, lucaPizzeria)
    for (restaurant in arrayOfFastFood) {
        println(restaurant.fryFries())
    }

    // 3. Vehicle
    val mx5: Mazda = Mazda(30, 20, "red", 1)
    println(mx5.changeGear(30))
    println(mx5.applyBrakes(30))
    println(mx5.speedUp(30))

    // 4. Reddit
    val redditPost1: RedditPost = RedditPost("Ben Shapiro", "Hello World")
    val redditPost2: RedditPost = RedditPost("Thomas Larsen", "Hello World")
    val redditPost3: RedditPost = RedditPost("Frank Hvam", "Hello World")
    val redditPost4: RedditPost = RedditPost("Jens Ferdinand", "Hello World")
    val redditPost5: RedditPost = RedditPost("Elon Musk", "Hello World")
    val listOfRedditPosts: List<RedditPost> = listOf(redditPost1, redditPost2, redditPost3, redditPost4, redditPost5)
    redditPost1.downvotes = -200
    redditPost2.upvotes = 20
    redditPost3.downvotes = -100
    redditPost4.upvotes = 50
    redditPost5.upvotes = 100
    println(listOfRedditPosts.sortedByDescending { it.upvotes })
    println(redditPost1.downvotes)

    // 4.5 Reddit Front Page
    val redditFrontPage: RedditFrontPage = RedditFrontPage(mutableListOf(redditPost1, redditPost2, redditPost3, redditPost4, redditPost5))
    println(redditFrontPage.deleteRedditPost())

    // 5 Word Frequency
    findRepeatingElement(listOf("apple", "banana", "apple", "orange", "banana", "apple", "orange", "banana", "apple","banana", "apple", "orange", "banana","banana", "apple", "orange", "apple", "orange", "banana"))
}