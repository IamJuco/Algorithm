class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        for (i in 0..numbers.size - 1) {
            for (j in i + 1..numbers.size - 1) {
                answer += (numbers[i] + numbers[j])
            }
        }
        return answer.toSortedSet().toIntArray()
    }
}