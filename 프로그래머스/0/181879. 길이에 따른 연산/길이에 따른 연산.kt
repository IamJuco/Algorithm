class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var sum = 0
        var mul = 1

        if (num_list.size >= 11){
            for (i in 0..num_list.size -1){
                sum += num_list[i]
                answer = sum
            }
        }else {
            for (i in 0..num_list.size -1){
                mul *= num_list[i]
                answer = mul
            }
        }

        return answer
    }
}