package part01

fun main() {
    // Safe call
    val str: String? = "ABC"
    val strNull: String? = null
    println(str?.length)
    println(strNull?.length)

    // Elvis
    val elvis1: String? = null
    val elvis2: String? = "abc"
    println(elvis1?.length ?: 0) // elvis1 is null, return 0
    println(elvis2?.length ?: 0) // elvis2 is abc, return 3

    // Platform Type
    val person = Person("John", 20)
    startsWithA(person.name) // person.name is not nullable
}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}

fun startsWithA1(str: String?): Boolean {
    // safe call
    str?.startsWith("A") ?: throw IllegalArgumentException("str must not be null")

    // java style
    if (str == null) {
        throw IllegalArgumentException("str must not be null")
    }
    return str.startsWith("A");
}

fun startsWithA2(str: String?): Boolean? {
    // safe call
    str?.startsWith("A")

    // java style
    if (str == null) {
        return null;
    }
    return str.startsWith("A");
}

fun startsWithA3(str: String?): Boolean {
    // safe call
    str?.startsWith("A") ?: false

    if (str == null) {
        return false;
    }
    // null 이 가능한 변수를 사용할 때 앞단에서 null 체크를 해주면
    // 컴파일러가 해당 변수를 사용할 수 있는지 체크해줌
    return str.startsWith("A");
}

fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
}