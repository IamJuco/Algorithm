import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().toInt()
    var result = 1
    for (i in 1..input) {
        result *= i
    }
    println(result)
}