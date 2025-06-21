import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val numbers = mutableListOf<Int>()
    repeat(5) {
        val input = br.readLine().toInt()
        numbers.add(input)
    }
    println(numbers.sum() / 5)
    println(numbers.sorted()[2])
}