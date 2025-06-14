import java.io.BufferedReader
import java.io.InputStreamReader

data class User(val age: Int, val name: String)

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    val user = mutableListOf<User>()
    repeat(t) {
        val input = br.readLine().split(" ")
        user.add(User(age = input[0].toInt(), name = input[1]))
    }
    val result = user.sortedWith(compareBy{it.age})
    for(i in result) {
        println("${i.age} ${i.name}")
    }
}