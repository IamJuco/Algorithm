import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, c) = br.readLine().split(" ").map { it.toInt() }
    val input = br.readLine().split(" ").map { it.toInt() }
    val linkedMap = linkedMapOf<Int, Int>()
    input.forEach {
        linkedMap[it] = linkedMap.getOrDefault(it, 0) + 1
    }
    val tempMap = linkedMap.entries.sortedByDescending { it.value }
    val result = buildList {
        for ((key, value) in tempMap) {
            repeat(value) {
                add(key)
            }
        }
    }

    println(result.joinToString(" "))
}