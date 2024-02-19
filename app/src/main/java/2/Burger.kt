import `2`.FastFood

class Burger (numberOfDishes: Int, private val currentTime: Int): FastFood {
    private var friesPresent: Boolean = false
    private var takeAwayAbility: Boolean = false
    override fun fryFries() {
        if (currentTime < 24) {
            friesPresent = true
            println("It's time for fries")
        } else {
            friesPresent = false
            println("invalid time")
        }
    }

    override fun takeAway() {
        if (currentTime <= 10) {
            takeAwayAbility = false
            println("It's too early for take away")
        } else {
            takeAwayAbility = true
            println("It's time to take away")
        }
    }
}