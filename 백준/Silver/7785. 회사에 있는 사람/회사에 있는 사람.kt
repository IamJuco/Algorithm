import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val people = mutableSetOf<String>()

    repeat(n) {
        val (name, status) = br.readLine().split(" ")
        if (status == "enter") {
            people.add(name)
        } else {
            people.remove(name)
        }
    }

    val result = people.sortedDescending()
    for (name in result) {
        println(name)
    }
}
