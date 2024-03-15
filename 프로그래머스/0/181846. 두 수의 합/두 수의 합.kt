class Solution {
    fun solution(a: String, b: String): String {
        var answer: String = ""

        answer = (a.toBigInteger() + b.toBigInteger()).toString()

        return answer
    }
}