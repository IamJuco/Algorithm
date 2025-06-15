import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val strings = mutableListOf<String>()
    val result = StringBuilder()

    repeat(5) {
        strings.add(br.readLine())
    }
    
    for (i in 0..14) {
        for (j in 0..4) {
            if (i < strings[j].length) {
                result.append(strings[j][i])
            }
        }
    }
    println(result)
}