class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var temp = 0

        for (i in 0..num_list.size-1){
            while (true){
                if (num_list[i] != 1) {
                    if (num_list[i] % 2 == 0) {
                        temp = num_list[i] / 2
                        num_list[i] = temp
                        answer++
                    } else {
                        temp = (num_list[i] - 1) / 2
                        num_list[i] = temp
                        answer++
                    }
                } else {
                    break
                }
            }
        }

        return answer
    }
}