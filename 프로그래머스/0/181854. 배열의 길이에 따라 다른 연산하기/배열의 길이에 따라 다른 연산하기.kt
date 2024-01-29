class Solution {
        fun solution(arr: IntArray, n: Int): IntArray {
        var answer = arr
        if (arr.size % 2 == 1){
            for (i in 0 .. answer.size-1 step 2){
                answer[i] += n
            }
        } else {
            for (i in 1.. answer.size-1 step 2){
                answer[i] += n
            }
        }
        return answer
    }
}