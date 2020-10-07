package com.application.balticactivity.oop

import com.application.balticactivity.Engine
import com.application.balticactivity.User
import java.sql.Driver

class Car(
    val wheelCount:Int,
    val doorCount:Int,
    maxSpeed:Int
    ) : Vehicle(maxSpeed = 100) {

    var isDoorOpen:Boolean = false
        private set

//latainit
    //если не инициализировать водителя до того, как будет использована переменная водителя, то
    private lateinit var driver: User
//\latainit

    //ленивая инициализация через делегированные свойства
    private val engine by lazy {
        Engine()
    }
    //\ленивая инициализация через делегированные свойства

    fun openDoor(){
        if(!isDoorOpen){
            println("door is open")
        }
        isDoorOpen = true
    }

//делаем проверку на то, инициализированно ли поле, перед тем, как его использовать, т.к. отложенная инициализация
    fun closeDoor(){
        if(isDoorOpen){
            println("door is closed")

            if(::driver.isInitialized){//проверка перед использование lateinit, ::driver - обращение к свойству
                println("driver = ${driver}")
            }
        }
        isDoorOpen = false
    }

    //переопределяем метод accelerate из родительского класса
    override fun accelerate(speed: Int) {
        engine.use()
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

    fun setDriver(driver: User) {
        this.driver = driver
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