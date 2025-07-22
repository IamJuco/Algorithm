import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    val map = mutableMapOf<String, Int>().toSortedMap()
    repeat(t) {
        val input = br.readLine().split(".")
        map[input[1]] = map.getOrDefault(input[1], 0) + 1
    }
    map.forEach {
        println("${it.key} ${it.value}")
    }
}