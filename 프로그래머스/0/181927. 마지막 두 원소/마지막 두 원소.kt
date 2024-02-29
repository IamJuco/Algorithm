class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer = IntArray(num_list.size+1){0}

        if(num_list[num_list.size-1] > num_list[num_list.size-2]){
            answer[num_list.size] = num_list[num_list.size-1] - num_list[num_list.size-2]

        } else {
            answer[num_list.size] = num_list[num_list.size-1]*2
        }

        for(i in 0 .. num_list.size-1){
            answer[i] = num_list[i]
        }
        return answer
    }
}