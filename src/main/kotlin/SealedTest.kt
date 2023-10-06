import kotlin.random.Random

fun main(args: Array<String>) {
    val somePlant = getPlant()

    when (somePlant) {
        is Fruit -> println("Sweet fruit")
        is Patato -> println("Taste vegetable")
    }

    val prize = lottery()

    when (prize) {
        is Vacation -> println("I am going on holiday")
        is Car -> println("I won a car")
        is GiftCard -> println("A gift card")
    }
}

fun getPlant(): Plant = Apple()

abstract class Plant

sealed class Fruit : Plant()

sealed class Vegetable : Plant()

class Apple : Fruit()

class Patato : Vegetable()

fun getVehicle(): Vehicle = Pegasus()
abstract class Vehicle

sealed class Car2 : Vehicle()

sealed class Bicycle : Vehicle()

class BMW : Car()

class Pegasus : Bicycle()

fun lottery(): Prize {
    val number = Random.nextInt(3)
    return when (number) {
        0 -> return FranceHoliday()
        1 -> return VW()
        else -> Dollar10()
    }
}

abstract class Prize

sealed class Car : Prize()

sealed class Vacation : Prize()

sealed class GiftCard : Prize()

class VW : Car()

class FranceHoliday : Vacation()

class Dollar10 : GiftCard()
