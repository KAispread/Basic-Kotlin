package part01

fun main() {
    val money1 = JavaMoney(1_000L)
    val money2 = JavaMoney(2_000L)

    if (money1 > money2) {
        println("money1 이 money2 보다 크다")
    }

    plus()
}

fun equals() {
    val money1 = JavaMoney(1_000L)
    val money2 = money1
    val money3 = JavaMoney(1_000L)

    println(money1 == money3)
    println(money1 === money2)
}

fun plus() {
    val money1 = Money(1_000L)
    val money2 = Money(2_000L)
    println(money1 + money2)
}