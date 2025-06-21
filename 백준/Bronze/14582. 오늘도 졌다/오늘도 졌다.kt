import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val firstTeamScores = br.readLine().split(" ").map { it.toInt() }
    val secondTeamScores = br.readLine().split(" ").map { it.toInt() }

    var firstTeamSum = 0
    var secondTeamSum = 0
    var isCheck = false

    for (i in 0..8) {
        firstTeamSum += firstTeamScores[i]
        if (firstTeamSum > secondTeamSum) {
            isCheck = true
        }
        secondTeamSum += secondTeamScores[i]
    }

    if (isCheck && firstTeamSum < secondTeamSum) {
        println("Yes")
    } else {
        println("No")
    }
}