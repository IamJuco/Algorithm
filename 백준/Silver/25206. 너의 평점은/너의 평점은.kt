import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var temp = 0.0
    var total = 0.0
    repeat(20) {
        val input = br.readLine().split(" ").map{ (it) }
        if(input[2] == "P") return@repeat
        when (input[2]) {
            "A+" -> temp += input[1].toDouble() * 4.5
            "A0" -> temp += input[1].toDouble() * 4.0
            "B+" -> temp += input[1].toDouble() * 3.5
            "B0" -> temp += input[1].toDouble() * 3.0
            "C+" -> temp += input[1].toDouble() * 2.5
            "C0" -> temp += input[1].toDouble() * 2.0
            "D+" -> temp += input[1].toDouble() * 1.5
            "D0" -> temp += input[1].toDouble() * 1.0
            "F"  -> temp += input[1].toDouble() * 0.0
        }
        total += input[1].toDouble()
    }
    println(temp / total)
}