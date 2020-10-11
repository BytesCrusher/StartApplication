package com.application.balticactivity

//В sealed классе на момент компиляции известны наследники класса
//он похож на перечисления
//наследниками могут быть объекты синглтоны и классы
//нельзя создать объект sealed класса

sealed class SealedColor(
    val hex: String
):Drawable {//наследуем sealed класс от интерфейса
    //чтобы создать объект этого sealed класса можно создать синглтон объект, как для enum-а
    //указываем объекты синглтона
    object White:SealedColor("#fff")
    object Black:SealedColor("#fff") {
        override fun draw() {
            println("draw sealed black color")
        }
    }

    //отличие от enum-ов
    //в enum могут быть определены объекты во время компиляции
    //в sealed может определять наследников класса

    class CustomColor(hex: String):SealedColor(hex)


    override fun draw() {
        println("draw sealed")
    }
}