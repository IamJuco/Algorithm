import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val a = br.readLine().split(" ").map { it.toInt() }.sorted()
    val b = br.readLine().split(" ").map { it.toInt() }.sortedDescending()
    var result = 0
    
    for (i in 0..n-1) {
        result += (a[i] * b[i])
    }

    println(result)
}