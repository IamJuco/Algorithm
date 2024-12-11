import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.System.`in`

fun main() {
    val br = BufferedReader(InputStreamReader(`in`))
    
    val a = br.readLine().toInt()
    val b = br.readLine().toInt()
    val c = br.readLine().toInt()
    
    println(a + b - c)
    println((a.toString() + b.toString()).toInt() - c)
}