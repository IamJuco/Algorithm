class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()

        if (arr.find { it == 2 } == 2){
            answer = arr.sliceArray(arr.indexOfFirst { it == 2 } .. arr.indexOfLast { it == 2 } )
        } else {
            answer += -1
        }

        return answer

    }
}