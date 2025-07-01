import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    br.readLine()
    val input = br.readLine().split(" ")
    val pizzaSet = mutableSetOf<String>()

    for (i in input) {
        pizzaSet.add(i)
    }

    val setFilter = pizzaSet.filter { it.endsWith("Cheese") }
    if (setFilter.size >= 4) {
        println("yummy")
    } else {
        println("sad")
    }
}