import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()

    repeat(t) {
        val n = br.readLine().toInt()
        val map = mutableMapOf<String, List<String>>()

        repeat(n) {
            val input = br.readLine().split(" ")
            map[input[1]] = map.getOrDefault(input[1], emptyList()) + input[0]
        }
        var result = 1
        for (list in map.values) {
            result *= (list.size + 1)
        }
        println(result - 1)
    }
}