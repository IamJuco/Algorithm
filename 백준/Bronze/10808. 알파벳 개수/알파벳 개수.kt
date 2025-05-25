import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().lowercase()
    val counts = IntArray(26)

    for (i in input) {
        counts[i - 'a']++
    }
    println(counts.joinToString(" "))
}