package com.application.balticactivity

fun main() {
    val genericObject1 = GenericClass<Double>(defaultValue = 2.3)

    val genericObject2  = GenericClass<Double>(5.0)
    val genericObject3  = GenericClass<Double>(0.75)
    val genericObject4  = GenericClass<Double>(8.1)
    println(sumGeneric(genericObject1, genericObject2))
    println(sumGeneric(genericObject3, genericObject4))
    //printGenericObject<String?>("dsg")
    updateContrvariant(contrvariantClass<Any> (defaultValue = 234))
}

class GenericClass<out T: Number/*, in R*/>(defaultValue: T) {
    /*var item: T = defaultValue//это свойство в инвариантной позиции
    private set*/

    private var item: T = defaultValue//это свойство в ковариантной позиции
    private set

    fun getItem(): T {//тип T в исходящей позиции
        return item
    }

    /*fun setItem(newR: R) {

    }*/

    /*fun updateItem(newItem: T) {
        item = newItem
        //item is String доступна проверка на тип
        item?.toFloat()
        item?.toInt()
    }*/
}

//функция принимает два Generic класса и вычисляет сумму их свойст item
fun sumGeneric(a: GenericClass<Number>, b: GenericClass<Number>): Int {
    return a.getItem().toInt() + b.getItem().toInt()
}

//обобщенная функция
fun <T> printGenericObject(item: T) {
    println(item.toString())
}

class contrvariantClass<in T>(defaultValue: T) {//класс контрвариантный по T
    private var item: T = defaultValue

    fun setItem(newItem:T){
        item = newItem
    }

    /*fun getItem():T { ограничение на использование их параметров
        return item
    }*/
}

fun updateContrvariant(input: contrvariantClass<Number>) {
    input.setItem(2.2)
}