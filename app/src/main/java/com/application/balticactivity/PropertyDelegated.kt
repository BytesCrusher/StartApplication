package com.application.balticactivity

import com.application.balticactivity.oop.Car
import com.application.balticactivity.oop.Rectangle
import com.application.balticactivity.oop.Shape
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun main() {

    /*val rectangle = Rectangle(0,0,10,20)
    rectangle.width = 25
    rectangle.height = 50

    val circle = Circle(25)
    circle.radius = 10*/

//делелигированное свойство lazy позволяет инициализировать
// поле при первом к нему обращении
    val car1 = Car(wheelCount = 4, doorCount = 4, maxSpeed = 200)
    car1.openDoor()
    car1.closeDoor()
    car1.accelerate(90)

}

//делегированные свойства определяются обычными классами
//создаем класс, делегирующий свойства, который позволяет вывести площадь фигуры до изменения
// свойства и площадь после изменения свойства в интерфейсе Shape.kt
class PrintAreaOnChangeDelegate <T> (
//Это внутреннее поле, которое хранит состояние свойства, для которого применяется делегат
    private var value: T

):ReadWriteProperty<Shape, T> {
    override fun getValue(thisRef: Shape, property: KProperty<*>): T = value

    override fun setValue(thisRef: Shape, property: KProperty<*>, value: T) {
        //это объект типа Shape, который указывает на объект, внутри которого
        // будет использовано делегированное свойство
        println("before change property ${property.name} = ${thisRef.calculateArea()}")
        this.value = value //для нашего свойства в делегате установит value из входных параметров
        //value - это значение, которое мы установим свойству
        println("after change property ${property.name} = ${thisRef.calculateArea()}")

    }


}