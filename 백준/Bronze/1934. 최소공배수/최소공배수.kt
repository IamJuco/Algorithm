import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    repeat(t) {
        val input = br.readLine().split(" ").map { it.toInt() }
        val result = input[0] * input[1] / gcd(input[0], input[1])
        println(result)
    }
}

fun gcd(a:Int, b:Int): Int = if (b != 0) gcd(b, a % b) else a