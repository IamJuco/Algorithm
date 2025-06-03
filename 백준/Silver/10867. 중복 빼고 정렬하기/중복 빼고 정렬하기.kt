import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    br.readLine().toInt()
    val input = br.readLine().split(" ").map { it.toInt() }.toSet().sorted()
    println(input.joinToString(" "))
}