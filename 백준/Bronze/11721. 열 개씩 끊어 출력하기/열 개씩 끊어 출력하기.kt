import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine()
    for (i in 0..input.length-1 step 10) {
        val end = if (i + 10 > input.length) input.length else i + 10
        println(input.substring(i, end))
    }
}