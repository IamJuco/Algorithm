class Solution {
    fun solution(numbers: IntArray): Int {
        var answer = 45
        answer -= numbers.sum()
        return answer
    }
}