import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val map = mutableMapOf<String, Boolean>()
    var count = 0
    repeat(n) {
        val notHear = br.readLine()
        map[notHear] = true
    }
    repeat(m) {
        val notSee = br.readLine()
        map[notSee] = if (map[notSee] == true) false else true
        if (map[notSee] == false) count++
    }
    println(count)
    map.filterNot { it.value }.keys.sorted().forEach {
        println(it)
    }
}