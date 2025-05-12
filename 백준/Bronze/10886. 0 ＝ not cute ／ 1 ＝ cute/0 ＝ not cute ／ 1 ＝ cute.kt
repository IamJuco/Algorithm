import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    var count = 0

    repeat(t) {
        val input = br.readLine().toInt()
        if (input == 0) count++ else count--
    }
    if (count > 0) println("Junhee is not cute!") else println("Junhee is cute!")
}