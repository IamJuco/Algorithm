import java.io.BufferedReader
import java.io.InputStreamReader

data class UserInfo(val name: String, val day: Int, val month: Int, val year: Int)

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val userInfo = mutableListOf<UserInfo>()

    repeat(n) {
        val (name, day, month, year) = br.readLine().split(" ")
        userInfo.add(UserInfo(name, day.toInt(), month.toInt(), year.toInt()))
    }

    userInfo.sortWith(compareBy({ it.year }, { it.month }, { it.day }))
    println(userInfo.last().name)
    println(userInfo.first().name)
}