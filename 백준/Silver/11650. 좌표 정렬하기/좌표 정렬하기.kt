import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    val arr = ArrayList<Pair<Int, Int>>()
    repeat(t) {
        val input = br.readLine().split(" ")
        arr.add(Pair(input[0].toInt(), input[1].toInt()))
    }
    arr.sortWith(compareBy({it.first}, {it.second}))

    repeat(t) {
        println("${arr[it].first} ${arr[it].second}")
    }
}