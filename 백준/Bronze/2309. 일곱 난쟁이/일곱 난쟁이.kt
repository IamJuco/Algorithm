import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val heightList = mutableListOf<Int>()
    repeat(9) {
        heightList.add(br.readLine().toInt())
    }
    val sum: Int = heightList.sum()
    for (i in 0..8) {
        for (j in i + 1..8) {
            if (sum - (heightList[i] + heightList[j]) == 100) {
                val result = heightList.filterIndexed { index, _ -> index != i && index != j }.sorted()

                result.forEach { println(it) }
                return
            }
        }
    }
}