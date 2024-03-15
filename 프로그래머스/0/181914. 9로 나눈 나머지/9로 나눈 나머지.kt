class Solution {
    fun solution(number: String): Int {
        var answer : Int = 0

        number.forEach {
            answer += it.toString().toInt()
        }

        answer %= 9

        return answer
    }
}