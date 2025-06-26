import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    val nNumbers = br.readLine().split(" ").map { it.toInt() }

    // HashMap 사용: 숫자를 key로, 존재 여부를 value로 저장
    val map = mutableMapOf<Int, Boolean>()
    for (num in nNumbers) {
        map[num] = true
    }

    val m = br.readLine().toInt()
    val mNumbers = br.readLine().split(" ").map { it.toInt() }

    val sb = StringBuilder()
    for (num in mNumbers) {
        if (map.containsKey(num)) {
            sb.append("1\n")
        } else {
            sb.append("0\n")
        }
    }

    print(sb)
}
