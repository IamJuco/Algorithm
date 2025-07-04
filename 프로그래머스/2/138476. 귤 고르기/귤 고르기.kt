class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer: Int = 0
        val map = mutableMapOf<Int, Int>()
        var total = 0
        
        for (number in tangerine) {
            map[number] = map.getOrDefault(number, 0) + 1
        }
        
        val sorted = map.values.sortedDescending()
        for (count in sorted) {
            total += count
            answer++
            if (total >= k) break
        }
        
        
        return answer
    }
}