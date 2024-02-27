class Solution {
    fun solution(n: Int, k: Int): IntArray {
        var count = n / k
        var answer = IntArray(count)
        for (i in 0..count -1){
            answer[i] = k * (i + 1)
        }
        return answer
    }
}