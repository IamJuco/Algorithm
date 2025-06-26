import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    val map = mutableMapOf<String, Boolean>()
    repeat(t) {
        val (a, b) = br.readLine().split(" ")
        map[a] = if (b == "enter") true else false
    }
    map.filter { it.value }.keys.sortedDescending().forEach {
        println(it)
    }
}