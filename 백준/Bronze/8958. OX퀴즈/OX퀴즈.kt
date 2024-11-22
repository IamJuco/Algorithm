import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val testCaseInput = readln().toInt()
    val br = BufferedReader(InputStreamReader(System.`in`))

    for (i in 1..testCaseInput) {
        val input = br.readLine().toCharArray()
        var count = 0
        var value = 0

        for (i in 0..input.size.dec()) {
            when (input[i]) {
                'O' -> {
                    count++
                    value += count
                }

                'X' -> {
                    count = 0
                }
            }
        }
        println(value)
    }
}