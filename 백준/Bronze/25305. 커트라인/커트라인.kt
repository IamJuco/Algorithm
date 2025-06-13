import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, k) = br.readLine().split(" ").map{ it.toInt() }
    val prices = mutableListOf<Int>()
    val input = br.readLine().split(" ").map{ it.toInt() }
    
    for(i in 0..n-1) {
        prices.add(input[i])
    }
    
    println(prices.sortedDescending()[k-1])
}