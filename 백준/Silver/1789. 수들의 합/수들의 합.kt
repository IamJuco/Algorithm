import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().toLong()
    var sum = 0L
    var num = 1L
    var count = 0L
    while (true) {
        sum += num
        if (sum > input) {
            break
        }
        count++
        num ++
    }
    println(count)
}