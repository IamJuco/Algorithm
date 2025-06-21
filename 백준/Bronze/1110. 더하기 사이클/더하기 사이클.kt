import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine()
    var stringNumber = if (input.length == 1) input + "0" else input
    val original = stringNumber
    var count = 0

    while (true) {
        val sum = stringNumber[0].digitToInt() + stringNumber[1].digitToInt()
        val newNumber = stringNumber[1].toString() + (sum % 10).toString()
        stringNumber = newNumber
        count++

        if (stringNumber == original) {
            break
        }
    }
    println(count)
}