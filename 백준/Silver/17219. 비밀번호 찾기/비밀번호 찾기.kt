import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val map = mutableMapOf<String, String>()
    repeat(n) {
        val (site, password) = br.readLine().split(" ")
        map[site] = password
    }

    val sb = StringBuilder()
    repeat(m) {
        val site = br.readLine()
        sb.appendLine(map[site]) // appendLine은  println
    }
    print(sb)
}