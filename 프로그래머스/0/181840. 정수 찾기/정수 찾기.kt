class Solution {
    fun solution(num_list: IntArray, n: Int): Int {
        var answer: Int = 0
        for (i in 0.. num_list.size -1){
            if (num_list[i] == n){
                answer = 1
                break
            } else {
                answer = 0
            }
        }
        return answer
    }
}