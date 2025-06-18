import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    while (true) {
        var lowerCount = 0
        var upperCount = 0
        var spaceCount = 0
        var numCount = 0
        val input = br.readLine() ?: break
        if (input.isEmpty()) break

        for (ch in input) {
            when {
                ch.isLowerCase() -> lowerCount++
                ch.isUpperCase() -> upperCount++
                ch.isDigit() -> numCount++
                ch == ' ' -> spaceCount++
            }
        }
        
        println("${lowerCount} ${upperCount} ${numCount} ${spaceCount}")
    }
}