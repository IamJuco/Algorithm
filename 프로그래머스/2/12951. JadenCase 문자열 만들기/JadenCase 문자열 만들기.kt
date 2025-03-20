class Solution {
    fun solution(s: String): String {
        val answer = s.split(" ").map {
            if (it.isNotEmpty()) {
                it[0].uppercase() + it.substring(1).lowercase()
            } else {
                it
            }
        }.joinToString(" ")

        return answer
    }
}