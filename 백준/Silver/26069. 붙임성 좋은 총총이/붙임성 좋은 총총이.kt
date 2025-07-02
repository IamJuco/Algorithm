import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    val set = mutableSetOf<String>()
    set.add("ChongChong")

    repeat(t) {
        val (a, b) = br.readLine().split(" ")
        if (a in set || b in set) {
            set.add(a)
            set.add(b)
        }
    }

    println(set.size)
}