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

    //перегрузка оператора
    operator fun component1():Int = wheelCount
    operator fun component2():Int = doorCount


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

    //переопределяем методы equals и hashCode
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Car

        if (wheelCount != other.wheelCount) return false
        if (doorCount != other.doorCount) return false
        if (isDoorOpen != other.isDoorOpen) return false

        return true
    }

    override fun hashCode(): Int {
        var result = wheelCount
        result = 31 * result + doorCount
        result = 31 * result + isDoorOpen.hashCode()
        return result
    }


}