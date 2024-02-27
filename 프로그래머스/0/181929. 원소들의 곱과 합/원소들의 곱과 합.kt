

class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int
        var temp = 1
        var tempPow = 0
        for (i in 0 .. num_list.size - 1){
            temp *= num_list[i]
            tempPow += num_list[i]
        }
        if (temp < tempPow * tempPow){
            answer = 1
        } else {
            answer = 0
        }
        return answer
    }
}