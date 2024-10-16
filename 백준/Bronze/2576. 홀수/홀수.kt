import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var oddArr = intArrayOf()
    var oddSum = 0

    for (i in 0..6) {
        val st = StringTokenizer(br.readLine())
        val input = st.nextToken().toInt()
        if (input % 2 != 0) {
            oddArr += input
            oddSum += input
        }
    }

    if (oddSum == 0) {
        println(-1)
    } else {
        println(oddSum)
        println(oddArr.sorted()[0])
    }
}