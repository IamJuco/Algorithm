import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine()
    val set = mutableSetOf<String>()

    for (i in 0..input.length-1) {
        for (j in i+1..input.length) {
            val substring = input.substring(i, j)
            set.add(substring)
        }
    }
    println(set.size)
}