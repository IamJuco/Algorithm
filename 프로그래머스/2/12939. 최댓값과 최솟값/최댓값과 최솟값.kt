class Solution {
    fun solution(s: String): String {
        val intList = s.split(" ").map { it.toInt() }
        val minInt = intList.minOrNull() ?: 0
        val maxInt = intList.maxOrNull() ?: 0
        return "$minInt $maxInt"
    }
}