class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        val englishes = ('a'..'z').filter { it !in skip.toSet() }
        val answer = s.map {
            val currentIndex = englishes.indexOf(it)
            val newIndex = (currentIndex + index) % englishes.size
            englishes[newIndex]
        }
        return answer.joinToString("")
    }
}