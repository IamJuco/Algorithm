import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    val cowPosition = MutableList(11) { -1 }
    var count = 0

    repeat(t) {
        val (cowNumber, way) = br.readLine().split(" ").map { it.toInt() }
        if (cowPosition[cowNumber] == -1) {
            cowPosition[cowNumber] = way
        } else {
            if (cowPosition[cowNumber] != way) {
                count++
                cowPosition[cowNumber] = way
            }
        }
    }

    println(count)
}