import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val map = mutableMapOf<String,Int>()
    repeat(n) {
        val input = br.readLine()
        map[input] = 0
    }
    repeat(m) {
        val input = br.readLine()
        if (map.containsKey(input)) {
            map[input] = map.getOrDefault(input, 0) + 1
        }
    }

    println(map.values.sum())
}