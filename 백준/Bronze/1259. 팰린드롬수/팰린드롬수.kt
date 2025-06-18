import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    while (true) {
        val input = br.readLine()
        if (input == "0") break
        if (input == input.reversed()) {
            println("yes")
        } else {
            println("no")
        }
    }
}