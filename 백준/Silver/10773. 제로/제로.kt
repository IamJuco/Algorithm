import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val k = br.readLine().toInt()
    val nums = mutableListOf<Int>()
    repeat(k) {
        val input = br.readLine().toInt()
        if (input == 0) {
            nums.removeAt(nums.lastIndex)
        } else {
            nums.add(input)
        }
    }
    println(nums.sum())
}