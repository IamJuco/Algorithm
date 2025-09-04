import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val map = mutableMapOf<Long, Int>()
    val t = br.readLine().toInt()
    repeat(t) {
        val input = br.readLine().toLong()
        map[input] = map.getOrDefault(input, 0) + 1
    }
    println(map.toSortedMap().maxBy { it.value }.key)
}