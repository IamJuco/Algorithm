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
    val winners = votes.withIndex().filter { it.value == maxVotes }

    if (winners.size >= 2) {
        println("skipped")
    } else {
        println(winners[0].index + 1)
    }
}