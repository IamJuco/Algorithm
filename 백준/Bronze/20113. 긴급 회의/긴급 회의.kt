import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    br.readLine()
    val input = br.readLine().split(" ").map { it.toInt() }
    val votes = MutableList(input.size) { 0 }
    for (num in input) {
        if (num == 0) {
            continue
        }
        votes[num-1]++
    }

    val maxVotes = votes.max()
    var count = 0
    var winnerIndex = 0
    for (i in votes.indices) {
        if (votes[i] == maxVotes) {
            count++
            winnerIndex = i
        }
    }
    if (count >= 2) {
        println("skipped")
    } else {
        println(winnerIndex + 1)
    }
}