/*class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = -1
        answer = 9 * 5 - numbers.sum()
        return answer
    }
}*/

class Solution {
    fun solution(numbers: IntArray) = (0..9).filterNot { numbers.contains(it) }.sum()
}