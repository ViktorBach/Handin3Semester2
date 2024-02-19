package `3`

class Mazda (private val speed: Int, private val speedLimit: Int, color: String, private var currentGear: Int): Car (speed, speedLimit, color, currentGear) {
    override fun applyBrakes(a: Int) {
        if (a > speedLimit) {
            println("Slow down crazy man")
        }
    }

    override fun changeGear(a: Int) {
        if (a > 20 && currentGear == 1) {
            println("Shift up")
            currentGear = 2
            println("You are now in $currentGear'nd gear")
        } else if (a > 30 && currentGear == 2) {
            println("Shift up")
            currentGear = 3
            println("You are now in $currentGear'rd gear")
        } else if (a > 40 && currentGear == 3) {
            println("Shift up")
            currentGear = 4
            println("You are now in $currentGear'th gear")
        } else if (a > 55 && currentGear == 4) {
            println("Shift up")
            currentGear = 5
            println("You are now in $currentGear'th gear")
        } else if (a > 70 && currentGear == 5) {
            println("Shift up")
            currentGear = 6
            println("You are now in $currentGear'th gear")
        } else {
            println("Invalid gear. The car only has 6 gears")
        }
    }

    override fun speedUp(a: Int) {
        if (a < speedLimit) {
            println("Speed up until speed limit")
        } else {
            println("You are either going at or above the speed limit")
        }
    }
}