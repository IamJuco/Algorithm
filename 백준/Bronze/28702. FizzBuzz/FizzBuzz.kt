import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = System.`in`.bufferedReader()
    
    var num = 0
    var found = false

    repeat(3) {
        val input = br.readLine()
        val c = input.first()

        if (c != 'F' && c != 'B') {
            num = input.toInt()
            found = true
        }

        if (found) {
            num++
        }
    }

    when {
        num % 15 == 0 -> println("FizzBuzz")
        num % 3 == 0 -> println("Fizz")
        num % 5 == 0 -> println("Buzz")
        else -> println(num)
    }
}