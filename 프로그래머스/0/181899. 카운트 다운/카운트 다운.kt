class Solution {
    fun solution(start: Int, end_num: Int): IntArray {
        var answer: IntArray = intArrayOf()


        for (i in end_num..start){
            answer += i

        }    
        return answer.sortedArrayDescending()
    }
}