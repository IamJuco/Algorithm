import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    val map = mutableMapOf<String, Int>()

    repeat(t) {
        val input = br.readLine()
        map[input] = map.getOrDefault(input, 0) + 1
    }
    val result = map.toSortedMap().maxBy { it.value }
    println(result.key)
}
