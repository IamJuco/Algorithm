import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    val stringList = mutableSetOf<String>()
    repeat(t) {
        stringList.add(br.readLine())
    }
    val result = stringList.toList().sortedWith(compareBy({
        it.length
    }, { it }))

    result.forEach {
        println(it)
    }
}