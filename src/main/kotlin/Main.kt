fun main() {
    // 1. Информация о типах данных
    println("Типы данных в Kotlin:")
    println("----------------------------------------------------------------------------------------------------------------")
    println("| Тип данных | Описание                         | Пример переменной                                            |")
    println("|------------|----------------------------------|--------------------------------------------------------------|")
    println("| Int        | Целое число                      | val myInt: Int = 10                                          |")
    println("| Double     | Число с плавающей точкой         | val myDouble: Double = 10.34698                              |")
    println("| Float      | Число с плавающей точкой         | val myFloat: Float = 4.145f                                  |")
    println("| String     | Строка                           | val myString: String = \"Привет!\"                             |")
    println("| Boolean    | Логическое значение (true/false) | val myBoolean: Boolean = true                                |")
    println("| Char       | Символ                           | val myChar: Char = 'A'                                       |")
    println("| Array      | Массив                           | val myArray: Array<Int> = arrayOf(1, 2, 3)                   |")
    println("| List       | Список (неизменяемый)            | val myList: List<String> = listOf(\"a\", \"b\", \"c\")             |")
    println("| MutableList| Список (изменяемый)              | val myMutableList: MutableList<Int> = mutableListOf(1, 2, 3) |")


    // 2. Число с точностью до сотых
    val num2 = 52.84698
    println("\nЧисло с точностью до сотых: %.2f".format(num2))

    // 3. Число e с точностью до десятых
    val e = Math.E
    println("\nЧисло e с точностью до десятых: %.1f".format(e))

    // 4. Вывод числа с сообщением перед ним
    print("Введите число: ")
    val num4 = readLine()!!.toDouble()
    println("\nВы ввели число: $num4")

    // 5. Вывод числа с сообщением после него
    print("Введите число: ")
    val num5 = readLine()!!.toDouble()
    println("$num5 — вот какое число Вы ввели")

    // 6. Три числа на одной строке с одним пробелом
    println("\n1 13 49")

    // 7. Три числа на одной строке с двумя пробелами
    println("7  15  100")

    // 8. Три любых числа на одной строке с двумя пробелами
    println("6  10  27")

    // 9. Четыре любых числа на одной строке с одним пробелом
    println("3 11 27 31")

    // 10. Два числа одно под другим
    println("\n50")
    println("10")

    // 11. Три числа одно под другим
    println("\n5")
    println("10")
    println("21")

    // 12. Четыре числа "столбиком"
    println("\n10")
    println("20")
    println("30")
    println("40")
}