class Solution {
    fun solution(s: String): String {
        var answer = ""
        answer = s.toCharArray().sortedArrayDescending().joinToString ("")
        return answer
    }
}