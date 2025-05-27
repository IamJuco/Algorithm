import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().split(" ").map { it.toInt() }
    if (input.sum() >= 100) {
        println("OK")
    } else {
        if (input.min() == input[0]) {
            println("Soongsil")
        } else if (input.min() == input[1]) {
            println("Korea")
        } else {
            println("Hanyang")
        }
    }
}