class Solution {
    fun solution(arr1: IntArray, arr2: IntArray): Int {
        var answer: Int = 0
        var arr1Sum = 0
        var arr2Sum = 0

        if (arr1.size > arr2.size){
            answer = 1
        } else if (arr1.size < arr2.size){
            answer = -1
        } else {
            for (i in 0..arr1.size-1){
                arr1Sum += arr1[i]
            }
            for (i in 0..arr2.size-1){
                arr2Sum += arr2[i]
            }
            if (arr1Sum > arr2Sum){
                answer = 1
            } else if (arr1Sum < arr2Sum){
                answer = -1
            } else {
                answer = 0
            }
        }

        return answer
    }
}