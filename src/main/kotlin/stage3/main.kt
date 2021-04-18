package stage3

import java.util.*

val scanner = Scanner(System.`in`)

data class Car(val registration: String, val color: String)

fun main() {
    val spots = Array<Car?>(20) { null }

    while (true) {
        val action = scanner.next()
        when (action) {
            "exit" -> return
            "leave" -> {
                val spot = scanner.nextInt()
                if (spots[spot - 1] == null) {
                    println("There is no car in spot $spot.")
                } else {
                    spots[spot - 1] = null
                    println("Spot $spot is free.")
                }
            }
            "park" -> {
                val firstFreeSpot = spots.indexOfFirst { car -> car == null }
                if (firstFreeSpot < 0) {
                    println("Sorry, the parking lot is full.")
                } else {
                    val registration = scanner.next()
                    val color = scanner.next()

                    spots[firstFreeSpot] = Car(registration, color)

                    println("$color car parked in spot ${firstFreeSpot + 1}.")
                }
            }
        }
    }
}