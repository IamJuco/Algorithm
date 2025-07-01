import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    val map = mutableMapOf<String, Boolean>()

    repeat(t) {
        val input = br.readLine().toCharArray().sorted().joinToString("")
        map[input] = true
    }
    println(map.size)
}