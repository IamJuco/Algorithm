import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val map = mutableMapOf<String, Int>()
    repeat(n) {
        val input = br.readLine()
        if (input.length >= m) map[input] = map.getOrDefault(input, 0) + 1
    }
    map.toList().sortedWith(compareByDescending<Pair<String, Int>> { it.second }
        .thenByDescending { it.first.length }
        .thenBy { it.first }).forEach {
        bw.write(it.first)
        bw.newLine()
    }
    bw.flush()
}