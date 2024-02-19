class Article (val author: String, val title: String) {
    override fun toString(): String {
        return "Article $title is written by $author"
    }
}