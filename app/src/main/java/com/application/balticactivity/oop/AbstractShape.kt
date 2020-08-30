package com.application.balticactivity.oop

abstract class AbstractShape(
    private var x:Int,
    private var y:Int
) {
    fun moveToPosition(x:Int, y:int){
        this.x = x
        this.y = y
    }

    fun printPosition() {
        println("Shape with position (x = $x, y = $y)")
    }


}