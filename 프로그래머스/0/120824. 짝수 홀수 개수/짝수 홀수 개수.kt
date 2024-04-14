class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var temp1 = 0
        var temp2 = 0

        for (i in 0 .. num_list.size-1){
            if (num_list[i] % 2 == 0){
                temp1 ++
            } else {
                temp2 ++
            }
        }
        answer += temp1
        answer += temp2

        return answer
    }
}