import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var result = 0
    var count = 0

    repeat(4) {
        val (n, m) = br.readLine().split(" ").map { it.toInt() }
        count += m - n
        if (count > result) {
            result = count
        }
    }
    println(result)
}