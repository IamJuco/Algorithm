import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    while (true) {
        val input = br.readLine().split(" ").map { it.toDouble() }
        val inputList = input.sorted()

        if (input[0] == 0.0 && input[1] == 0.0 && input[2] == 0.0) {
            break
        }

        if (inputList[0].pow(2.0) + inputList[1].pow(2.0) == inputList[2].pow(2.0)) {
            println("right")
        } else {
            println("wrong")
        }
    }
}