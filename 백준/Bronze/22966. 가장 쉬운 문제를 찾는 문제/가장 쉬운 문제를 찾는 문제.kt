import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val list = mutableListOf<Pair<String,Int>>()

    repeat(n) {
        val input = br.readLine().split(" ")
        list.add(Pair(input[0], input[1].toInt()))
    }
    val min = list.minBy { it.second }

    println(min.first)
}
