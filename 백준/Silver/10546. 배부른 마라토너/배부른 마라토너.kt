import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val map = mutableMapOf<String, Int>()
    repeat(n) {
        val input = br.readLine()
        map[input] = map.getOrDefault(input, 0) + 1
    }
    repeat(n - 1) {
        val input = br.readLine()
        map[input] = map.getOrDefault(input, 0) + 1
    }
    println(map.filterValues { it % 2 == 1 }.keys.joinToString(""))
}