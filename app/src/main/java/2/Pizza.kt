package `2`

class Pizza (val numberOfDishes: Int, private val currentTime: Int): FastFood {
    private var friesPresent: Boolean = false
    private var takeAwayAbility: Boolean = false
    override fun fryFries() {
        if (currentTime >= 16) {
            friesPresent = false
            println("It's too late for fries")
        } else {
            friesPresent = true
            println("It's time for fries")
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

    override fun toString(): String {
        return "This pizzeria has $numberOfDishes dishes and you are visiting at $currentTime"
    }
}