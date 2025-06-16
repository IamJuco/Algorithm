import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val black = "black"
    val brown = "brown"
    val red = "red"
    val orange = "orange"
    val yellow = "yellow"
    val green = "green"
    val blue = "blue"
    val violet = "violet"
    val grey = "grey"
    val white = "white"

    val value = mapOf(
        black to "0",
        brown to "1",
        red to "2",
        orange to "3",
        yellow to "4",
        green to "5",
        blue to "6",
        violet to "7",
        grey to "8",
        white to "9"
    )

    val mul = mapOf(
        black to 1,
        brown to 10,
        red to 100,
        orange to 1000,
        yellow to 10000,
        green to 100000,
        blue to 1000000,
        violet to 10000000,
        grey to 100000000,
        white to 1000000000
    )

    val firstLine = br.readLine()
    val secondLine = br.readLine()
    val thirdLine = br.readLine()

    val result = (((value.getValue(firstLine) + value.getValue(secondLine)).toLong()) * mul.getValue(thirdLine))
    println(result)
}