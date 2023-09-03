package part01

fun main() {
    val number1: Int? = 3
    val number2: Long = number1?.toLong() ?: 0L

    println(number1?.plus(number2) ?: 0)

    stringIndentation()
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        val person = obj as Person
        println(person.age)
    }
}

fun throwableMethod(obj: Any): Nothing {
    throw IllegalArgumentException("obj must be Person")
}

fun printPersonInformation(person: Person) {
    val name = person.name
    println("이름 $name, 나이 ${person.age}")
}

fun stringIndentation() {
    val name = "기우"

    val indent = """
        |Hello
        |World
        |Kotlin
        |$name
    """.trimMargin()

    println(indent)
}

fun stringIndexing() {
    val str = "Hello World"

    println(str[0])
    println(str[3])
}