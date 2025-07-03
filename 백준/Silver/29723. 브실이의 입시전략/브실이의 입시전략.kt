import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m, k) = br.readLine().split(" ").map { it.toInt() }
    val map = mutableMapOf<String, Int>()
    var count = 0

    repeat(n) {
        val (a, b) = br.readLine().split(" ")
        map[a] = b.toInt()
    }
    repeat(k) {
        val input = br.readLine()
        if (map.containsKey(input)) {
            count += map.getOrDefault(input, 0)
        }
        map.remove(input)
    }
    val sorted = map.values.sorted()
    val min = sorted.take(m - k).sum()
    val max = sorted.takeLast(m - k).sum()
    bw.write("${min + count} ${max + count}")

    bw.close()
}