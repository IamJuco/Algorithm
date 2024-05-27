import kotlin.math.sqrt

class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        val sqrt = sqrt(n.toDouble())
        answer = if (sqrt == sqrt.toInt().toDouble()) {
            1
        } else {
            2
        }
        return answer
    }
}