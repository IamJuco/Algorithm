import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val nameToId = mutableMapOf<String, Int>()
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val idToName = Array(n + 1) { "" }

    for (i in 1..n) {
        val input = br.readLine()
        nameToId[input] = i
        idToName[i] = input
    }

    repeat(m) {
        val input = br.readLine()
        if (input.toIntOrNull() == null) {
            println(nameToId[input])
        } else {
            println(idToName[input.toInt()])
        }
    }

}
