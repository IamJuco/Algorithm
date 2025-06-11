import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    
    while(true) {
        val input = br.readLine().toInt()
        if(input == -1) break
        
        val num = mutableListOf<Int>()
        for(i in 1..input-1) {
            if(input % i == 0) {
                num.add(i)
            }
        }
        if(input != num.sum()) {
            println("${input} is NOT perfect.")
        } else {
            println("${input} = " + num.joinToString(" + "))
        }
    }
}