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

    val division = Math.round(numbers.average()).toInt()
    val median = numbers.sorted()[t / 2]
    val range = numbers.max() - numbers.min()

    val map = numbers.groupingBy { it }.eachCount()
    val maxValue = map.maxOf { it.value }
    val modeResult = map.filter { it.value == maxValue }.keys.sorted()
    val mode = if (modeResult.size == 1) {
        modeResult[0]
    } else {
        modeResult[1]
    }

    println(division)
    println(median)
    println(mode)
    println(range)
}