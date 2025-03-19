class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        for (i in 1..n) {
            if (n % i == 1) {
                answer = i
                break
            }
        }
        return answer
    }
}