import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().uppercase()
    val alphabetMap = mutableMapOf<Char, Int>()

    for (char in input) {
        alphabetMap[char] = alphabetMap.getOrDefault(char, 0) + 1
    }

    var maxCount = 0
    var result = '?'

    for ((key, value) in alphabetMap) {
        if (value > maxCount) {
            maxCount = value
            result = key
        } else if (value == maxCount) {
            result = '?'
        }
    }
    println(result)
}