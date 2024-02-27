class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer = IntArray(5)
        num_list.sort()
        for (i in 0..4){
            answer[i] = num_list[i]
        }
        return answer
    }
}