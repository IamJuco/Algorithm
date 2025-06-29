import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    br.readLine()
    val input = br.readLine()
    val map = mutableMapOf<Char,Int>()
    "BRONZESILVER".forEach { map[it] = 0 }

    for (char in input) {
        if (map.containsKey(char)) map[char] = map.getOrDefault(char,0) + 1
    }
    map['E'] = map.getOrDefault('E',0) / 2
    map['R'] = map.getOrDefault('R', 0) / 2
    println(map.values.minOrNull())
}