import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    val map = mutableMapOf<String, Int>()
    val name = br.readLine().split(" ")
    for (str in name) {
        map[str] = 0
    }
    repeat(t) {
        val input = br.readLine().split(" ")
        for (str in input) {
            map[str] = map.getOrDefault(str, 0) + 1
        }
    }

    val sorted = map.entries.sortedWith(compareByDescending<Map.Entry<String, Int>> { it.value }
        .thenBy { it.key })

    for ((key, value) in sorted) {
        println("$key $value")
    }
}