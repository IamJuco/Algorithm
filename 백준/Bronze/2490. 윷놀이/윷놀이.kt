import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    repeat(3) {
        val a = br.readLine().trim()
        var count = 0
        for (i in 0..a.length-1) {
            if (a[i] == '0') {
                count++
            }
        }
        when (count) {
            0 -> println("E")
            1 -> println("A")
            2 -> println("B")
            3 -> println("C")
            4 -> println("D")
        }
    }
}