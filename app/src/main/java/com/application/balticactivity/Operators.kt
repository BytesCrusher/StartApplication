package com.application.balticactivity

import com.application.balticactivity.oop.Rectangle

fun main() {
    //для каждого оператора есть собственное определение функции
    listOf(1,2,3) + listOf(3,4,5)

    //складываем два объекта класса Rectangle
    val rectangle1 = Rectangle(x=0, y=0, width = 10, height = 20)
    val rectangle2 = Rectangle(x=0, y=0, width = 30, height = 100)

    val sumOfRectangle = rectangle1 + rectangle2
    println("sumOfRectangle: $sumOfRectangle")

    val minusRect = -sumOfRectangle
    println("minusRect on sumOfRectangle: $minusRect")
}