class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer= IntArray(arr.size)
        for (i in 0..arr.size-1){
            if (arr[i] >= 50 && arr[i] % 2 == 0 ){
                answer[i] += (arr[i] / 2)
            } else if (arr[i] < 50 && arr[i] % 2 != 0){
                answer[i] += (arr[i] * 2)
            } else {
                answer[i] += arr[i]
            }
        }
        return answer
    }
}