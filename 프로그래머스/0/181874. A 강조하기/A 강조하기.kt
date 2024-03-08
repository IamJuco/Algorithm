class Solution {
    fun solution(myString: String): String {
        var answer: String = myString.lowercase()
        answer = answer.replace("a","A")
        return answer
    }
}