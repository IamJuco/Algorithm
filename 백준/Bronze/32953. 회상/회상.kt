import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val map = mutableMapOf<String, Int>()

    repeat(n) {
        br.readLine().toInt()
        val studentIds = br.readLine().split(" ")
        for (id in studentIds) {
            map[id] = map.getOrDefault(id, 0) + 1
        }
    }

    val result = map.values.count { it >= m }
    println(result)
}
