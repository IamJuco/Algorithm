import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine()
    var happyCount = 0
    var sadCount = 0

    for (chunk in input.windowed(3, 1)) {
        if (chunk == ":-)") {
            happyCount++
        } else if (chunk == ":-(") {
            sadCount++
        }
    }

    when {
        happyCount == 0 && sadCount == 0 -> println("none")
        happyCount == sadCount -> println("unsure")
        happyCount > sadCount -> println("happy")
        sadCount > happyCount -> println("sad")
    }
}