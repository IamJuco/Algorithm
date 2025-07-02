import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    val map = mutableMapOf<String,Boolean>()
    map["ChongChong"] = true

    repeat(t) {
        val (a, b) = br.readLine().split(" ")
        if (map[a] == true || map[b] == true) {
            map[a] = true
            map[b] = true
        } else {
            map[a] = false
            map[b] = false
        }
    }
    println(map.filter { it.value }.size)
}