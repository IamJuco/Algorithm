import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    repeat(t) {
        val (a, b) = br.readLine().split(" ")

        println(b.removeRange(a.toInt()-1..a.toInt()-1))
    }
}