import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    val input = br.readLine().split(" ").map { it.toInt() }
    var max = 0
    var current = 0

    for (i in 1..t - 1) {
        if (input[i] > input[i - 1]) {
            current += input[i] - input[i - 1]
            if (current > max) {
                max = current
            }
        } else {
            current = 0
        }
    }
    println(max)
}