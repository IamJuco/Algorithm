import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val small = mutableListOf<Int>()
    var result = 0
    repeat(9) {
        small.add(br.readLine().toInt())
    }
    
    val total = small.sum()
    outer@for(i in 0.. small.size-1) {
        for(j in i+1..small.size-1) {
            if(total - small[i] - small[j] == 100) {
                small.removeAt(j)
                small.removeAt(i)
                break@outer
            }
        }
    }
    small.sort()
    small.forEach { println(it) }
}