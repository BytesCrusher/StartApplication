package com.application.balticactivity

import com.application.balticactivity.oop.*

fun main() {
//Анонимный класс
    //можно использовать только внутри этого блока кода, где он создан
    val shape = object :Shape {
        var additionalField = 123
        fun additionalFunction() = 234

        override val name: String = "anonimous shape"

        override fun calculateArea(): Double = 0.0
        }
    shape.additionalField = 6564
//\Анонимный класс

//Абстрактный Класс
//    val shape = Rectangle(1, 5, 2, 2)
//    shape.printPosition()
//    shape.moveToPosition(3,6)
//
//    println("Shape with area: ${shape.calculateArea()}")
//    println("Shape with area: ${shape.name}")
//
//    //сравнение прямоугольников
//    val largeRectangle = Rectangle(1,1,20,50)
//    println("shape <= largeRectangle (${shape <= largeRectangle})")
//
//    val set: MutableSet<Rectangle> =  hashSetOf(
//        largeRectangle,
//        shape
//    )
//
//    println(set)
//\Абстрактный Класс

//Полиморфизм
//    val vehicle: Vehicle = Car(wheelCount = 4, doorCount = 2, maxSpeed = 180)
//    println(vehicle.getTitle())
//
//    listOf<Vehicle>(
//        Vehicle(maxSpeed = 120),
//        Car(wheelCount = 4, doorCount = 2, maxSpeed = 175),
//        Airplane(maxSpeed = 900)
//    ).forEach{
//        println(it.getTitle())
//    }
//\Полиморфизм

//    val tesla = Car(wheelCount = 4, doorCount = 2, maxSpeed = 180)
//
//    //scoped функция with, чтобы не писать постоянно tesla
//    with(tesla) {
//        refuel(100)
//        openDoor()
//        //closeDoor()
//        accelerate(100, true)
//        decelerate(64)
//    }

    //let тоже scoped функция, только let возвращает значение
//    tesla.let {
//        it.refuel(100)
//        it.openDoor()
//        it.closeDoor()
//        it.accelerate(100)
//        it.decelerate(64)
//    }

//    val vehicle: Vehicle = tesla
//    println("vehicle is car = ${vehicle is Car}")
//    println("tesla is vehicle = ${tesla is Vehicle}")//машина является транспортом

    //если ты знаешь что vehicle является объектом типа Car, то
    //val newCar:Car = vehicle as Car//приведение типов, это небезопасно, если вдруг выдастся ошибка
    //newCar.closeDoor()
    //val newCar:Car? = vehicle as? Car //это безопасно, в случае ошибки вернет null
    //newCar?.closeDoor()






//    val tesla = Car(
//        wheelCount = 4, doorCount = 2, bodyLenght = 500, bodyWidth = 200, bodyHeight = 150
//    )

    //println("tesla wheel count: ${tesla.wheelCount}, tesla door count: ${tesla.doorCount}")

    //println("tesla current speed: ${tesla.currentSpeed}, tesla fuel count: ${tesla.fuelCount}")

    //tesla.accelerate(100)

    //println("tesla current speed: ${tesla.currentSpeed}, tesla fuel count: ${tesla.fuelCount}")

    //tesla.decelerate(15)

    //println("tesla current speed: ${tesla.currentSpeed}, tesla fuel count: ${tesla.fuelCount}")

    //println("tesla fuel count: ${tesla.fuelCount}")



//создание объекта через второй конструктор
//    val nissan = Car(wheelCount = 4, doorCount = 4, bodySize = Triple(500,200,160))


}