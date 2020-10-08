package com.application.balticactivity

//нельзя создать объект класса enum
//объекты этого класса могут быть описаны только внутри тела
//перечисления могут реализовывать интерфейсы, либо наследоваться от классов
//здесь мы реализуем интерфейс Drawable перечислением
//Объекты перечисления именуются большими буквами

enum class Color(
    val hex:String
):Drawable {
    WHITE("#fff"),
    BLACK("#000"),
    RED("#f00") {//переопределяем функцию только для объекта RED
        override fun draw() {
            println("draw red color")
        }
    },
    BLUE("#00f");

    fun someMethod(){

    }

    override fun draw() {
        println("(override) draw color: $hex")
    }

    //Перечисление - это обычный класс, поэтому оно может иметь компаньона
    companion object {
        //метод fromName возвращает тип - нулабельный Color
        //он будет получать имя, по которому будем искать в списке цвет, будет проходить
        //по всем values в enum и ищет совпадение, возращает результат, что нашел
        fun fromName(name: String):Color? {
            return values().find{ it.name == name.toUpperCase()}
        }
    }
}