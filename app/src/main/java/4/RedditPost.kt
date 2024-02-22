package `4`

class RedditPost (val author: String, val title: String) {
    var date: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var upvotes: Long = 0
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var downvotes: Long = 0
        get() {
            return field
        }
        set(value) {
            field = value
        }

    override fun toString(): String {
        return "Author is $author, Title of the post is $title"
    }
}