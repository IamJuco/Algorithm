import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    val stacks = mutableListOf<Int>()
    repeat(t) {
        val input = br.readLine().split(" ")
        when(input[0]) {
            "push" -> stacks.add(0, input[1].toInt())
            "pop" -> {
                if (stacks.isEmpty()) {
                    println(-1)
                } else {
                    println(stacks[0])
                    stacks.removeAt(0)
                }
            }
            "size" -> println(stacks.size)
            "empty" -> {
                if (stacks.isEmpty()) {
                    println(1)
                } else {
                    println(0)
                }
            }
            "top" -> {
                if (stacks.isEmpty()) {
                    println(-1)
                } else {
                    println(stacks[0])
                }
            }
        }
    }
}