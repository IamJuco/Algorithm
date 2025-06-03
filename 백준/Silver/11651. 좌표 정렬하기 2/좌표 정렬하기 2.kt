import java.io.BufferedReader
import java.io.InputStreamReader

data class Point(val a: Int, val b:Int)

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    val list = mutableListOf<Point>()

    repeat(t) {
        val input = br.readLine().split(" ")
        list.add(Point(input[0].toInt(), input[1].toInt()))
    }

    list.sortWith(compareBy({it.b}, {it.a}))
    list.forEach { println("${it.a} ${it.b}") }
}