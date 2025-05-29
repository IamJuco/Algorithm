import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    val numbers = mutableListOf<Int>()
    repeat(t) {
        val input = br.readLine().toInt()
        numbers.add(input)
    }

    numbers.sorted().forEach {
        println(it)
    }
}