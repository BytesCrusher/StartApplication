package com.application.balticactivity

import com.application.balticactivity.oop.Car

fun main() {
    val car1 = Car(wheelCount = 10, doorCount = 4, maxSpeed = 200)
    car1.openDoor()
    car1.setDriver(User(name = "driver", lastName = "Mayson"))
    car1.closeDoor()

}