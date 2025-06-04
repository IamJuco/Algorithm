import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    br.readLine()
    val n = br.readLine().split(" ").map{ it.toInt() }
    br.readLine()
    val m = br.readLine().split(" ").map{ it.toInt() }
    val cardMap = mutableMapOf<Int,Int>()
    for(i in n) {
        cardMap[i] = cardMap.getOrDefault(i, 0) + 1
    }
    
    val result = m.map{ cardMap.getOrDefault(it,0)}
    println(result.joinToString(" "))
}