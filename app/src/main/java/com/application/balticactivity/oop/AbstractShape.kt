package com.application.balticactivity.oop

abstract class AbstractShape(
    private var x:Int,
    private var y:Int
):Shape {//наследование от интерфейса Shape
    fun moveToPosition(x:Int, y:Int){
        this.x = x
        this.y = y
        println("Shape with position (x = $x, y = $y)")
    }

    fun printPosition() {
        println("Shape with position (x = $x, y = $y)")
    }

    //то, что написано ниже вынесено в интерфейс
    //abstract val name:String // абстрактное свойство
    //abstract fun calculateArea():Double//абстрактный метод, можно не писать тело метода


}