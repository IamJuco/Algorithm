import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var (a, b, c, d, e) = br.readLine().split(" ").map { it.toInt() }

    while (!(a == 1 && b == 2 && c == 3 && d == 4 && e == 5)) {
        if (a > b) {
            val temp = a
            a = b
            b = temp
            println("$a $b $c $d $e")
        }
        if (b > c) {
            val temp = b
            b = c
            c = temp
            println("$a $b $c $d $e")
        }
        if (c > d) {
            val temp = c
            c = d
            d = temp
            println("$a $b $c $d $e")
        }
        if (d > e) {
            val temp = d
            d = e
            e = temp
            println("$a $b $c $d $e")
        }
    }
}