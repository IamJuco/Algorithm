import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (x, y) = br.readLine().split(" ")
    val temp = rev(x).toInt() + rev(y).toInt()
    println(rev(temp.toString()).toInt())
}

fun rev(a: String): String {
    var revTemp = ""
    for(i in a.length-1 downTo 0) {
        revTemp += a[i]
    }
    return revTemp
}