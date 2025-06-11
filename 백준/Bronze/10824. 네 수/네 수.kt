import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().split(" ")
    val start = input[0] + input[1]
    val end = input[2] + input[3]
    println(start.toLong() + end.toLong())
}