import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val map = mutableMapOf<String, Int>()
    while (true) {
        val input = br.readLine() ?: break
        if (input == "") break

        map[input] = map.getOrDefault(input, 0) + 1
    }

    val total = map.values.sum()
    val result = map.toSortedMap()

    for ((key, value) in result) {
        val ratio = value.toDouble() / total * 100
        println("$key ${"%.4f".format(ratio)}")
    }
}