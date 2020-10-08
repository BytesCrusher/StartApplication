package com.application.balticactivity

fun main() {
    //чтобы получить объект Enum мы можем обращаться к имени класса
    val color = Color.BLACK.hex
    Color.RED.draw()

    //у класса перечисления есть статичный метод values, он возвращает список всех
    // объектов этого перечисления
    Color.values().forEach {
        it.draw()

        //Каждый объект перечисления имеет имя - name
        println("${it.name}")

        //кроме имени есть еще и свойство ordinal, которое означает индекс элемента в массиве,
        //который возвращается из values
        println("${it.ordinal}")

    }

    //можно получить объект перечисления не через имя, а через метод valueOf
    //здесь нужно обязательное совпадение value в скобках с именем объекта внутри перечисления
    Color.valueOf("WHITE")

    //выражение ниже вернет Color.RED
    //Color.RED.ordinal - доступ к индексу красного цвета
    //и по этому цвету получаем элемент
    Color.values()[Color.RED.ordinal]


    //используем компаньон объект
    //здесь результат будет null, т.к. такого элемента нет в перечислении
    val searchingName = "3253"
    println("Используем fromName для $searchingName: ${Color.fromName(searchingName)}")

}

//Работа с enum внутри when
fun invertColor(color:Color):Color{
    //проверим через when какого цвета наш объект типа Color и предоставить инвертированный цвет
    //здесь не нужна ветка else, т.к. у нас строго задано множество объектов, которые могут быть
    //При работе с перечислениями нужно указывать все варианты без else, т.к. это может привести
    // к ошибкам при добавлении еще элементов в enum
    return when(color) {
        Color.WHITE -> Color.BLACK
        Color.BLACK -> Color.WHITE
        Color.RED -> Color.BLUE
        Color.BLUE -> Color.RED

    }
}