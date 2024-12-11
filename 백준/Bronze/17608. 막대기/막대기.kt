import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = br.readLine().toInt()
    val array = IntArray(N) { br.readLine().toInt() }
    var lastValue = 0
    var answer = 0

    for (i in array.size - 1 downTo 0) {
        if (array[i] > lastValue) {
            answer += 1
            lastValue = array[i]
        }
    }
    println(answer)
}