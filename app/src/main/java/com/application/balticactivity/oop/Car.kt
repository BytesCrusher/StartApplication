package com.application.balticactivity.oop

class Car(
    val wheelCount:Int,
    val doorCount:Int,
    maxSpeed:Int
    ) : Vehicle(maxSpeed = 100) {

    var isDoorOpen:Boolean = false
        private set

    fun openDoor(){
        if(!isDoorOpen){
            println("door is open")
        }
        isDoorOpen = true
    }

    fun closeDoor(){
        if(isDoorOpen){
            println("door is closed")
        }
        isDoorOpen = false
    }

    //переопределяем метод accelerate из родительского класса
    override fun accelerate(speed: Int) {
        if (isDoorOpen){
            println("you cant accelerate while door is open")
        } else {
            super.accelerate(speed)//вызываем реализацию этого метода у родительского класса
        }
    }

    override fun getTitle(): String = "Car"

    //перегрузка операторов
    fun accelerate(speed: Int, force:Boolean) {
        if (force){
            if (isDoorOpen) println("Warning! Door is open!")
            super.accelerate(speed)//а это вызовет реализацию из класса Vehicle
        } else {
            accelerate(speed)//это вызов реализации из класса Car
        }
    }
}