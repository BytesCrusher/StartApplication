package com.application.balticactivity

import com.application.balticactivity.oop.Car
import com.application.balticactivity.oop.Vehicle

fun main() {
    //обращение к объекту синглтона
    Cars.nissan
    Cars.someMethod()
    //если наследуемся от Vehicle, то можем использовать его поля и методы
    Cars.accelerate(25)

    //доступ к объектам компаньонам идет по имени окружающего их класса
    Car.default
    Car.createWithDefaultWheelCount(4, 220)

    //компаньоны и синглтоны можно присваивать переменной
    val a = Car //для a присваевем объект компаньон класса Car
    val b = Cars//для b присваевем объект синглтон от Cars

}

//singleton
//к объекту синглтона доступ дается по имени
//синглтон может реализовывать интерфейс, либо наследоваться от другого класса
//обычно синглтоны используются там, где доступ нужно получать из всего приложения
//1 объект класса-синглтона можно создать во время работы приложения
object Cars: Vehicle(maxSpeed = 400) {//можно указать видимость private и т.д.
    val toyota = Car(wheelCount = 4, doorCount = 2, maxSpeed = 250)
    val nissan = Car(wheelCount = 4, doorCount = 4, maxSpeed = 220)

    fun someMethod() {

    }
}