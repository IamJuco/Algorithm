import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    repeat(t) {
        val tokens = br.readLine().split(" ")
        var answer = tokens[0].toDouble()
        for (i in 0..tokens.size - 1) {
            when (tokens[i]) {
                "@" -> answer *= 3
                "%" -> answer += 5
                "#" -> answer -= 7
            }
        }
        println("%.2f".format(answer))
    }
}