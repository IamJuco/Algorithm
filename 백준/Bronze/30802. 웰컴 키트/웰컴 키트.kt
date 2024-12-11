import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = br.readLine().toInt()
    val sizes = br.readLine().split(" ").map { it.toInt() }
    val (T, P) = br.readLine().split(" ").map { it.toInt() }
    var answer = 0
    
    repeat(sizes.size) { i ->
        answer += if (sizes[i] % T > 0) {
            sizes[i] / T + 1
        } else {
            sizes[i] / T
        }
    }
    println(answer)
    println("${N / P} ${N % P}")
}