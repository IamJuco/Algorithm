import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    for(i in t downTo 1){
        for(j in 1..t-i){
            print(" ")
        }
        for(j in 1..i){
            print("*")
        }
        println()
    }
}