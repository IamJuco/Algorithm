import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        br.readLine().toInt()
        val note1 = br.readLine().split(" ").map { it.toInt() }.toSet()

        br.readLine().toInt()
        val note2 = br.readLine().split(" ").map { it.toInt() }

        for (number in note2) {
            if (note1.contains(number)) {
                bw.write("1\n")
            } else {
                bw.write("0\n")
            }
        }
    }
    
    bw.close()
}