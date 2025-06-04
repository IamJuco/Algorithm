import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine()
    val numbers = mutableListOf<Int>()
    for(i in 0..input.length-1) {
        numbers.add(input[i].digitToInt())
    }
    print(numbers.sortedDescending().joinToString(""))
}