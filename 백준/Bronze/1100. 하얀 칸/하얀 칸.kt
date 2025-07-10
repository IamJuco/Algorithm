import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var count = 0

    for (i in 0 until 8) {
        val input = br.readLine()
        for (j in input.indices) {
            if ((i + j) % 2 == 0 && input[j] == 'F') {
                count++
            }
        }
    }

    println(count)
}