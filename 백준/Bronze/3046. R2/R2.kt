import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().split(" ").map { it.toInt() }
    val answer = (n[1] * 2 - n[0])
    println(answer)
}