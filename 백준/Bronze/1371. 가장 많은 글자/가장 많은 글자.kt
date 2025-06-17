import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val charCount = Array(26) { 0 }
    while (true) {
        val input = br.readLine() ?: break
        for (char in input) {
            if (char in 'a'..'z') {
                charCount[char - 'a']++
            }
        }
    }
    val maxCount = charCount.maxOrNull()!!
    for (i in 0..charCount.size - 1) {
        if (charCount[i] == maxCount) {
            print('a' + i)
        }
    }
}