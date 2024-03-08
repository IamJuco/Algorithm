class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()

        arr.forEach { i ->
            repeat(i){
                answer += i
            }
        }

        return answer
    }
}