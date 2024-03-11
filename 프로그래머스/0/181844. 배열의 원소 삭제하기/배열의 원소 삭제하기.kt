class Solution {
    fun solution(arr: IntArray, delete_list: IntArray): IntArray {
        var answer = arr.toMutableList()

        for (i in delete_list.indices){
            answer.remove(delete_list[i])
        }

        return answer.toIntArray()
    }
}