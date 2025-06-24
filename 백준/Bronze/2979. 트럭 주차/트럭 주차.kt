import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (a, b, c) = br.readLine().split(" ").map { it.toInt() }

    val times = IntArray(101)

    repeat(3) {
        val (start, end) = br.readLine().split(" ").map { it.toInt() }
        for (i in start..end - 1) {
            times[i]++
        }
    }

    var totalCost = 0
    for (i in times.indices) {
        when (times[i]) {
            1 -> totalCost += a
            2 -> totalCost += b * 2
            3 -> totalCost += c * 3
        }
    }

    println(totalCost)
}