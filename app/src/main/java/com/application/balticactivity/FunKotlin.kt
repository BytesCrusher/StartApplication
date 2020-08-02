package com.application.helloworld
import kotlin.random.Random

fun main() {
    println(multiply(123, 4))
    println(hasChildrenAccess(height = 130, weight = 50, age = 20))
    val any = functionReturnAny()
    println(any)
    functionWithAnyParam(param = "Da")
    functionWithAnyParam(param = 4)
}

//три одинаковых варианта функции
fun multiply(a:Int, b:Int) = a * b

//fun multiply(a:Int, b:Int):Int {
//    val rezult = a*b
//    return rezult
//}

//fun multiply(a:Int, b:Int): Int {
//    return a * b
//}
fun hasChildrenAccess(height:Int, weight:Int, age:Int):Boolean{
    return height>150 && weight >30 && age >10
}

fun functionReturnAny():Any {
    return if(Random.nextBoolean()){
            25635
        } else {
        "regrgdrgdrgd"
    }
}

//Unit возвращаемый это как Void
fun functionWithAnyParam(param:Any):Unit {}
//fun functionWithAnyParam(param:Any) {} одно и то же

