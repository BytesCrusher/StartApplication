package com.application.balticactivity.oop

//open говорит что это не окончательный класс
open class Car(//это будет инициализироваться при создании класса, основной конструктор
    val wheelCount: Int,
    val doorCount: Int,
    val bodyLenght: Int,
    val bodyWidth: Int,
    val bodyHeight: Int
) {
//    init {//блок, который выполняет действия в момент, когда в класс поступают данные, чтобы произвести с ними операции. можно много init
//        println("Car init")
//    }

    var currentSpeed:Int = 0
        get() {
            println("current speed get")
            return field//свойство хранит значение, доступное field. Backing field
        }
        private set(value) {
            println("current speed set $value")
            field = value
        }

    //можно обратиться к полю для чтения, но нельзя для установки значения
    var fuelCount:Int = 70
        private set //просто делаем приватным set

//определим геттером свойтво так, чтобы можно было получить нужное значение, но нельзя было его поменять
    val isStoped:Boolean
        get() = currentSpeed == 0

//дополнительный конструктор
// здесь мы вызываем основной конструктор с помощью this и передаем туда параметры, которые он ожидает
    //доп конструктор уже может иметь тело, где можно выполнять действия
    //сначала будет вызван основной конструктор, затем блоки init, а затем код, который здесь написан будет

//    constructor(wheelCount: Int, doorCount: Int, bodySize: Triple<Int, Int, Int>):this(wheelCount, doorCount, bodySize.first, bodySize.second, bodySize.third) {
//        println("Car secondary constructor")
//    }

    //методы
    //this - это как self в питончике
    fun accelerate(speed:Int) {

        val needFuel = speed/2
        if (fuelCount>=needFuel){
            currentSpeed += speed
            useFuel(needFuel)
        } else {
            println("Невозможно ускориться! Нет топлива!")
        }
    }

    fun decelerate(speed: Int) {
        currentSpeed = maxOf(0, currentSpeed - speed)
    }

    private fun useFuel(fuelCount:Int) {
        this.fuelCount -= fuelCount
    }

    fun refuel(fuelCount:Int) {
        if (currentSpeed==0){
            this.fuelCount += fuelCount
        } else {
            println("Заправка невозможна во время движения!")
        }
    }

    fun testmethod(){

    }

}