//k = 최고품질
//m = 한 상자당 담길 사과 수
//한 상자에는 가장 품질이 좋은 사과들을 담아야함

class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        val sorted = score.sortedDescending()
        var total = 0
        for (i in (m - 1)..(sorted.size - 1) step m) {
            total += sorted[i] * m
        }

        return total
    }
}