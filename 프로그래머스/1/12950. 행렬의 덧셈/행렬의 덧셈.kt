class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = arr1
         for(i in 0 until arr1.size){
        for(j in 0 until arr2[i].size){
            answer[i][j]=arr1[i][j]+arr2[i][j]
        }
    }
        return answer
    }
}