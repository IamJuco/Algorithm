import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    br.readLine()
    val input = br.readLine().split(" ").map { it.toInt() }
    val student = mutableListOf<Int>()

    for (i in 0..input.size-1) {
        val studentNum = i + 1
        val index = student.size - input[i]
        student.add(index, studentNum)
    }

    println(student.joinToString(" "))
}