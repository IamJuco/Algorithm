import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    while (true) {
        val (n, m) = br.readLine().split(" ").map { it.toInt() }
        if (n == 0 && m == 0) break
        var count = 0

        val set = mutableSetOf<Int>()
        repeat(n) {
            set.add(br.readLine().toInt())
        }
        
        repeat(m) {
            val input = br.readLine().toInt()
            if (set.contains(input)) count++
        }

        println(count)
    }
}