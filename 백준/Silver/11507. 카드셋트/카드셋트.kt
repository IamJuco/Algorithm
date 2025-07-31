import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().chunked(3)
    val map = linkedMapOf(
        'P' to 13,
        'K' to 13,
        'H' to 13,
        'T' to 13
    )
    if (input.distinct().size != input.size) {
        println("GRESKA")
    } else {
        input.forEach {
            map[it[0]] = map.getOrDefault(it[0], 0) - 1
        }
        println(map.values.joinToString(" "))
    }
}