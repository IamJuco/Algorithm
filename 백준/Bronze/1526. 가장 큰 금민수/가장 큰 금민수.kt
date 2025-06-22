import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().toInt()
    for (i in input downTo 4) {
        if (i.toString().all { it == '4' || it == '7' }) {
            println(i)
            break
        }
    }
}