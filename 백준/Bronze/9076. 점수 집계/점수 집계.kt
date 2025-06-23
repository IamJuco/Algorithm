import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    repeat(t) {
        val input = br.readLine().split(" ").map { it.toInt() }.toMutableList()
        input.sort()

        val result = input.subList(1, 4)
        val max = result.max()
        val min = result.min()

        if (max - min >= 4) {
            println(("KIN"))
        } else {
            println(result.sum())
        }
    }
}