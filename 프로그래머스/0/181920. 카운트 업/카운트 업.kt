class Solution {
    fun solution(start_num: Int, end_num: Int): IntArray {
        var answer = IntArray((end_num - start_num) +1 )

        for (i in 0..end_num-start_num){
            answer[i] = i + start_num
        }

        return answer
    }
}