import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine()
    val firstNumbers = mutableListOf<Int>()
    val secondNumbers = mutableListOf<Int>()
    for (i in 0..input.length / 2 - 1) {
        firstNumbers.add(input[i].digitToInt())
    }
    for (i in input.length / 2..input.length - 1) {
        secondNumbers.add(input[i].digitToInt())
    }
    if (firstNumbers.sum() == secondNumbers.sum()) {
        println("LUCKY")
    } else {
        println("READY")
    }
}