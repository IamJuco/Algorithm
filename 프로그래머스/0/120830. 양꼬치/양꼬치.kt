class Solution {
    fun solution(n: Int, k: Int): Int {
        var answer: Int = 0
        var count = 0
        for (i in 1..n) {
            if (i % 10 == 0) {
                count++
            }
        }

        answer = (n * 12000) + ((k - count) * 2000)
        return answer
    }
}