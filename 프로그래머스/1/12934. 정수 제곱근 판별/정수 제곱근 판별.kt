import kotlin.math.*

class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        var sqrtNum = sqrt(n.toDouble()).toLong()
        return if(sqrtNum * sqrtNum == n){
            (sqrtNum + 1) * (sqrtNum + 1)
        } else -1
    }
}