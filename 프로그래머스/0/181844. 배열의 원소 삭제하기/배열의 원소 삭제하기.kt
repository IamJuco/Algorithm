class Solution {
    fun solution(arr: IntArray, delete_list: IntArray): IntArray {
        var answer = arr.toMutableList()

        delete_list.forEach{
            answer.remove(it)
        }

        return answer.toIntArray()
    }
}