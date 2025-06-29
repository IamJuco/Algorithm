import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    br.readLine().toInt()
    val input = br.readLine().split(" ").map { it.toInt() }

    val seats = IntArray(101)
    var count = 0

    for (i in input) {
        if (seats[i] == 1) {
            count++
        } else {
            seats[i] = 1
        }
    }
    println(count)
}