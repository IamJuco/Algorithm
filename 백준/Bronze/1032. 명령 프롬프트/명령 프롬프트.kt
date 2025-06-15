import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    val strings = mutableListOf<String>()
    val result = StringBuilder()

    repeat(t) {
        val input = br.readLine()
        strings.add(input)
    }

    val length = strings[0].length - 1

    for (i in 0..length) {
        val char = strings[0][i]
        var isSame = true
        for (j in 1..t - 1) {
            if (strings[j][i] != char) {
                isSame = false
                break
            }
        }
        result.append(if (isSame) char else '?')
    }
    println(result)
}