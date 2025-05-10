import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val a = br.readLine().toInt()
    val b = br.readLine().toInt()

    println(a * (b % 10))
    println(a * (b % 100 / 10))
    println(a * (b / 100))
    println(a * b)
}
