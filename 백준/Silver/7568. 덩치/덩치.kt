import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    val userInfo = mutableListOf<Pair<Int, Int>>()

    repeat(t) {
        val (weight, height) = br.readLine().split(" ").map { it.toInt() }
        userInfo.add(Pair(weight, height))
    }
    
    for(i in 0..t - 1) {
        var ranks = 0
        for(j in 0..t - 1) {
            if(i == j) continue
            if(userInfo[j].first > userInfo[i].first && userInfo[j].second > userInfo[i].second) {
                ranks++
            }
        }
        println(ranks + 1)
    }

    
}