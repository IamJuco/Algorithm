class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var even: Int = 0
        var odd: Int = 0


        for (i in 0..num_list.size-1){
            if ((i + 1) % 2 == 0){
                even += num_list[i]
            } else{
                odd += num_list[i]
            }
        }

        if (even > odd){
            answer = even
        } else if (even < odd){
            answer = odd
        } else {
            answer = even
        }

        return answer
    }
}