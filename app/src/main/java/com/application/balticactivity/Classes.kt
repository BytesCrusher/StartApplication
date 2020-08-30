package com.application.balticactivity

import com.application.balticactivity.oop.Car//импорт класса

fun main() {
    val tesla = Car(
        wheelCount = 4, doorCount = 2, bodyLenght = 500, bodyWidth = 200, bodyHeight = 150
    )

    println("tesla wheel count: ${tesla.wheelCount}, tesla door count: ${tesla.doorCount}")

    //println("tesla current speed: ${tesla.currentSpeed}, tesla fuel count: ${tesla.fuelCount}")

    tesla.accelerate(100)

    //println("tesla current speed: ${tesla.currentSpeed}, tesla fuel count: ${tesla.fuelCount}")

    tesla.decelerate(15)

    //println("tesla current speed: ${tesla.currentSpeed}, tesla fuel count: ${tesla.fuelCount}")

    //println("tesla fuel count: ${tesla.fuelCount}")



//создание объекта через второй конструктор
//    val nissan = Car(wheelCount = 4, doorCount = 4, bodySize = Triple(500,200,160))


}