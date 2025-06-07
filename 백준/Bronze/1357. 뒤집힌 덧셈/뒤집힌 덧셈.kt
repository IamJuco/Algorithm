import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (x, y) = br.readLine().split(" ")
    val result = x.reversed().toInt() + y.reversed().toInt()
    println(result.toString().reversed().toInt())
}