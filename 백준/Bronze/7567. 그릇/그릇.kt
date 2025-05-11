import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine()
    var result = 10

    for (i in 1..input.length - 1) {
        if (input[i] == input[i - 1]) result += 5 else result += 10
    }

    println(result)
}