import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val paper = Array(100) { BooleanArray(100) }
    val n = br.readLine().toInt()
    var count = 0

    repeat(n) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }

        for (i in x .. x + 9) {
            for (j in y .. y + 9) {
                paper[i][j] = true
            }
        }
    }

    for (i in 0 .. 99) {
        for (j in 0 .. 99) {
            if (paper[i][j]) count++
        }
    }

    println(count)
}