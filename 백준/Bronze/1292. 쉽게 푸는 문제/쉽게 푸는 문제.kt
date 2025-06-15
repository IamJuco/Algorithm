import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (a, b) = br.readLine().split(" ").map { it.toInt() }
    val numbers = mutableListOf<Int>()
    var result = 0

    for (i in 1..100) {
        for (j in 1..i) {
            numbers.add(i)
        }
    }

    for (i in a-1..b-1) {
        result += numbers[i]
    }
    println(result)
}