import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().toInt()
    for (i in 0..input-1) {
        println("*".repeat(input - i))
    }
}