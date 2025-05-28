import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val input = br.readLine()
    var aCount = 0
    var bCount = 0

    for (i in 0..input.length-1) {
        if (input[i] == 'A') aCount++ else bCount++
    }
    if (aCount > bCount) {
        println("A")
    } else if (aCount < bCount) {
        println("B")
    } else {
        println("Tie")
    }
}