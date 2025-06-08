import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    repeat(t) {
        val input = br.readLine()
        var count = 0
        var isVps = true

        for (char in input) {
            if (char == '(') count++
            else count--

            if (count < 0) {
                isVps = false
                break
            }
        }

        if (isVps && count == 0) println("YES") else println("NO")
    }
}