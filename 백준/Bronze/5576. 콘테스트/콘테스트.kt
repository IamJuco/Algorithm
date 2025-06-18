import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val wScores = mutableListOf<Int>()
    val kScores = mutableListOf<Int>()

    repeat(10) {
        wScores.add(br.readLine().toInt())
    }
    repeat(10) {
        kScores.add(br.readLine().toInt())
    }
    wScores.sortDescending()
    kScores.sortDescending()

    val wSum = wScores[0] + wScores[1] + wScores[2]
    val kSum = kScores[0] + kScores[1] + kScores[2]

    println("${wSum} ${kSum}")
}