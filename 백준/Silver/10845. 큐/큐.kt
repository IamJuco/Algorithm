import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    val queue = mutableListOf<Int>()
    repeat(t) {
        val input = br.readLine().split(" ")
        when(input[0]) {
            "push" -> queue.add(input[1].toInt())
            "pop" -> {
                if (queue.isEmpty()) {
                    println(-1)
                } else {
                    println(queue[0])
                    queue.removeAt(0)
                }
            }
            "size" -> println(queue.size)
            "empty" -> if (queue.isEmpty()) println(1) else println(0)
            "front" -> if (queue.isEmpty()) println(-1) else println(queue[0])
            "back" -> if (queue.isEmpty()) println(-1) else println(queue.last())
        }
    }
}