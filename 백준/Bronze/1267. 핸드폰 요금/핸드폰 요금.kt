import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    val inputs = br.readLine().split(" ").map { it.toInt() }
    var y = 0
    var m = 0
    repeat(t) {
        val input = inputs[it]
        y += (input / 30) * 10 + 10
        m += (input / 60) * 15 + 15
    }

    when {
        y < m -> println("Y $y")
        m < y -> println("M $m")
        else -> println("Y M $y")
    }
}