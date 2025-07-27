import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()

    repeat(t) {
        val input = br.readLine().split(" ")
        val knownSounds = mutableSetOf<String>()

        while (true) {
            val input = br.readLine()
            if (input == "what does the fox say?") break
            val parts = input.split(" ")
            knownSounds.add(parts[2])
        }

        println(input.filter { it !in knownSounds }.joinToString(" "))
    }
}