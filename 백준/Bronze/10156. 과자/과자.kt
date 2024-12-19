import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().split(" ").map { it.toInt() }
    if (n[0] * n[1] > n[2]) {
        println(n[0] * n[1] - n[2])
    } else {
        println(0)
    }
}