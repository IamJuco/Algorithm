import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val map = mutableMapOf<String, String>().toSortedMap()
    repeat(n) {
        val teamName = br.readLine()
        val numberOfTeamMembers = br.readLine().toInt()


        repeat(numberOfTeamMembers) {
            val memberName = br.readLine()
            map[memberName] = teamName
        }
    }

    repeat(m) {
        val input = br.readLine()
        val num = br.readLine().toInt()
        
        if (num == 0) {
            map.entries.filter { it.value == input }.forEach {
                println(it.key)
            }
        } else {
            println(map[input])
        }
    }
}