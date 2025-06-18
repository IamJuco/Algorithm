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
        
        if (input == "") break
        for (i in input.indices) {
            if (input[i].isLowerCase()) {
                lowerCount++
            } else if (input[i].isUpperCase()) {
                upperCount++
            } else if (input[i].isDigit()) {
                numCount++
            } else {
                spaceCount++
            }
        }
        println("${lowerCount} ${upperCount} ${numCount} ${spaceCount}")
    }
}