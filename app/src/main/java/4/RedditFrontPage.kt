package `4`

class RedditFrontPage(val redditPosts: MutableList<RedditPost>) {
    fun deleteRedditPost () {
        println("Choose which reddit post you want to delete")
        val chosenPost: Int = readln().toInt()
        redditPosts.removeAt(chosenPost)
        println(redditPosts)
    }

    override fun toString(): String {
        return "List of reddit posts: $redditPosts"
    }
}