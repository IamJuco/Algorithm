import java.io.BufferedReader
import java.io.InputStreamReader

fun binarySearch(arr: List<Int>, target: Int): Boolean {
    var start = 0
    var end = arr.size - 1

    while (start <= end) {
        val mid = (start + end) / 2
        when {
            arr[mid] == target -> return true
            arr[mid] < target -> start = mid + 1
            else -> end = mid - 1
        }
    }

    return false
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val nNumbers = br.readLine().split(" ").map { it.toInt() }.sorted()
    val m = br.readLine().toInt()
    val mNumbers = br.readLine().split(" ").map { it.toInt() }

    for (i in 0..mNumbers.size-1) {
        if (binarySearch(nNumbers, mNumbers[i])) println(1)
        else println(0)
    }
}