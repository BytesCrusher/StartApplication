package com.application.balticactivity

fun main() {
    1.toBoolean()//применение расширенного метода
    1.isPositive//вернет расширенного свойства

    val nullabelInt : Int? = null
    nullabelInt.orDefault(0)

}

//Extension - метод (функция)
fun Int.toBoolean():Boolean {
    return this != 0
}

//Extension - свойство
val Int.isPositive: Boolean
    get() = this > 0

//Extension на нуллабельном типе
//будет применяться для нулабельного типа Int
//будет возвращать значение, если переменная является нулом
private fun Int?.orDefault(defaultValue: Int):Int {
    return this ?: defaultValue
}