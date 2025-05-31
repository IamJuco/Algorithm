import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().toInt()
    var result = 1
    var range = 1
    
    while(input > range) {
        range += 6 * result
        result++
    }
    println(result)
}