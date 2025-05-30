import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    br.readLine().toInt()
    val nNumbers = br.readLine().split(" ").map{it.toInt()}.toMutableList().sorted()
    br.readLine().toInt()
    val mNumbers = br.readLine().split(" ").map { it.toInt() }
    val result = mutableListOf<Int>()

    for (i in 0..mNumbers.size - 1) {
        if (nNumbers.binarySearch(mNumbers[i]) >= 0) {
            result.add(1)
        } else {
            result.add(0)
        }
    }
    println(result.joinToString(" "))
}
