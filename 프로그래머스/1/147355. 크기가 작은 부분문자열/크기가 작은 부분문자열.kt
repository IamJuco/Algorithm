class Solution {
    fun solution(t: String, p: String): Int {
        var answer = 0
        val pValue = p.toBigInteger()

        for (i in 0..t.length - p.length) { // 7 - 3
            val sub = t.substring(i, i + p.length).toBigInteger()
            if (sub <= pValue) {
                answer++
            }
        }

        return answer
    }
}