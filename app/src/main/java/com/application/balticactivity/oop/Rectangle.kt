package com.application.balticactivity.oop

class Rectangle(
    x: Int,
    y: Int,
    private val width:Int,
    private val height:Int
):AbstractShape(x, y), Comparable<Rectangle> {
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

}