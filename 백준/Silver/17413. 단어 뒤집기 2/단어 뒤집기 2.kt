import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine()

    val result = mutableListOf<Char>()
    val word = mutableListOf<Char>()
    var inTag = false

    for (ch in input) {
        when {
            ch == '<' -> {
                result.addAll(word.reversed())
                word.clear()
                inTag = true
                result.add(ch)
            }
            ch == '>' -> {
                inTag = false
                result.add(ch)
            }
            inTag -> {
                result.add(ch)
            }
            ch == ' ' -> {
                result.addAll(word.reversed())
                word.clear()
                result.add(ch)
            }
            else -> {
                word.add(ch)
            }
        }
    }

    result.addAll(word.reversed())
    println(result.joinToString(""))
}