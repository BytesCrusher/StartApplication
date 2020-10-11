package com.application.balticactivity.oop

import com.application.balticactivity.PrintAreaOnChangeDelegate

class Rectangle(
    x: Int,
    y: Int,
    width:Int,
    height:Int
):AbstractShape(x, y), Comparable<Rectangle> {

    //чтобы при изменении ширины и высоты печаталась площадь фигуры
    //указать делегированное свойство через by
    var width:Int by PrintAreaOnChangeDelegate(width)
    var height:Int by PrintAreaOnChangeDelegate(height)
    //\

    override val name: String = "Rectangle"

    override fun calculateArea(): Double = width * height.toDouble()

//переопределяем метод compareTo из интерфейса Comparable,  чтобы написать функцию сравнения двух прямоугольников
    override fun compareTo(other: Rectangle): Int {
        return (width + height) - (other.width + other.height)
    }

    //чтобы объекты имели нормальное имя при выводе в консоль
    //переопределяем стандартную функцию toString
    override fun toString(): String {
        return "Rectangle(width = $width, height = $height)"
    }

//перегрузка оператора, чтобы можно было складывать два прямоугольника
    operator fun plus(other: Rectangle):Rectangle {
        return Rectangle(0,0,width+other.width, height+other.height)
    }

//перегрузка унарного оператора минус, чтобы получать значения прямоугольника со знаком минус
    operator fun unaryMinus():Rectangle {
        return Rectangle(0,0,-width, -height)
}

}