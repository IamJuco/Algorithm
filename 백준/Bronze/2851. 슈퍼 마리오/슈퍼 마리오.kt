import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val mushrooms = mutableListOf<Int>()
    var sum = 0
    repeat(10) {
        val input = br.readLine().toInt()
        mushrooms.add(input)
    }
    for (i in mushrooms.indices) {
        sum += mushrooms[i]
        if (sum >= 100) {
            val prev = sum - mushrooms[i]
            if (sum - 100 <= 100 - prev) {
                println(sum)
            } else {
                println(prev)
            }
            return
        }
    }

    println(sum)
}