import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    val map = mutableMapOf<String, Boolean>()
    var count = 0

    repeat(t) {
        val input = br.readLine()
        if (input == "ENTER") {
            count += map.size
            map.clear()
        } else {
            map[input] = true
        }
    }
    count += map.size
    println(count)
}