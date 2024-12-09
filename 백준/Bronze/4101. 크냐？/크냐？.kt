import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    while (true) {
        val a = nextLong()
        val b = nextLong()

        if (a == 0L && b == 0L) break

        if (a > b) println("Yes")
        else println("No")
    }
}