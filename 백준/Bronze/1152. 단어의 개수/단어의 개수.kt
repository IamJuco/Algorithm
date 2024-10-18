import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine()
    val wordCount = input.trim().split(" ").filter { it.isNotBlank() }
    println(wordCount.size)
}