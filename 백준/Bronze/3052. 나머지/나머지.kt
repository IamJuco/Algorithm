import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val arr = IntArray(10)
    val differentValue = mutableSetOf<Int>()
    for (i in 0..9) {
        arr[i] = br.readLine().toInt()
        differentValue.add(arr[i] % 42)
    }
    println(differentValue.size)
}