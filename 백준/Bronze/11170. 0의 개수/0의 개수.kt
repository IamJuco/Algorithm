import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()

    repeat(t) {
        val (n, m) = br.readLine().split(" ").map { it.toInt() }
        var result = 0
        for (i in n..m) {
            if (i.toString().contains("0")) {
                for (j in 0..i.toString().length - 1) {
                    if (i.toString()[j] == '0') {
                        result += 1
                    }
                }
            }
        }
        println(result)
    }
}