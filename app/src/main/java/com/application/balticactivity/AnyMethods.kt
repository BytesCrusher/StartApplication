package com.application.balticactivity

import com.application.balticactivity.oop.Car
import com.application.balticactivity.oop.Vehicle

fun main() {
    //car1 и car2 ссылаются на разные участки памяти, car1 и car3 наоборот
    val car1 = Car(wheelCount = 4, maxSpeed = 180, doorCount = 2)
    val car2 = Car(wheelCount = 4, maxSpeed = 160, doorCount = 4)
    val car3 = car1

    //сравнение по ссылке
    println("car1 is equals to car 2 by reference = ${car1 === car2}")
    println("car1 is equals to car 3 by reference = ${car1 === car3}")

    println("car1 is equals to car 3 by value = ${car1 == car2}")
    println("car1 is equals to car 3 by value = ${car1 == car3}")

    car1 == Vehicle(120)//false, т.к. класс не совпадает

    //если не переопределяем метод equals, то могут быть проблемы с коллекциями
    val cars = listOf(
        car1,
        Car(wheelCount = 10, doorCount = 6, maxSpeed = 120),
        Car(wheelCount = 6, doorCount = 4, maxSpeed = 140)
    )

    //проверяем есть ли в списке объект, который нужен
    println(cars.contains(Car(wheelCount = 10, doorCount = 6, maxSpeed = 120)))

    //hashCode нужно использовать, когда в класса хранятся данные
    val map = hashMapOf(
        car1 to "1",
        car2 to "2",
        car3 to "3",
        Car(wheelCount = 6, doorCount = 4, maxSpeed = 140) to "4",
        Car(wheelCount = 8, doorCount = 4, maxSpeed = 140) to "5",
        Car(wheelCount = 3, doorCount = 4, maxSpeed = 140) to "6"
    )

    //не удалось найти значение по ключу
    println("map = ${map[Car(wheelCount = 6, doorCount = 4, maxSpeed = 140)]}")

}