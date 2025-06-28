import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine()
    var result = 0

    for (i in input) {
        result += when (i) {
            in 'A'..'C' -> 3
            in 'D'..'F' -> 4
            in 'G'..'I' -> 5
            in 'J'..'L' -> 6
            in 'M'..'O' -> 7
            in 'P'..'S' -> 8
            in 'T'..'V' -> 9
            else -> 10  // W~Z
        }
    }

    println(result)
}