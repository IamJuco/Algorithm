import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    readln().toInt()
    val input = br.readLine().split(" ").map { it.toDouble() }
    val maxNum = input.sortedDescending()[0]
    var result = 0.0
    for (i in input.indices) {
        result += (input[i] / maxNum) * 100
    }
    println(String.format("%.2f", result / input.size))
}