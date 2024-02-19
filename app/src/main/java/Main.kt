import `1`.Article
import `2`.FastFood
import `2`.Pizza
import `2`.Sandwich
import `3`.Mazda

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
}