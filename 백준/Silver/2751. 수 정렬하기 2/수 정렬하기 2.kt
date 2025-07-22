import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val t = br.readLine().toInt()
    val sb = StringBuilder()
    val arr = ArrayList<Int>()
    repeat(t) {
        arr.add(br.readLine().toInt())
    }
    arr.sort()

    for (num in arr) {
        sb.append(num).append("\n")
    }
    bw.write(sb.toString())
    bw.flush()
    bw.close()
}