import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val a = br.readLine().toBigInteger()
    val b = br.readLine()
    val c = br.readLine().toBigInteger()
    
    val answer = if (b == "*") {
        a * c
    } else {
        a + c
    }

    println(answer)
}